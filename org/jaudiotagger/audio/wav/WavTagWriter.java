package org.jaudiotagger.audio.wav;

import c61;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Logger;
import k91;
import m92;
import mk;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.CannotWriteException;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.iff.ChunkHeader;
import org.jaudiotagger.audio.iff.ChunkSummary;
import org.jaudiotagger.audio.iff.IffHeaderChunk;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;
import org.jaudiotagger.audio.wav.chunk.WavChunkSummary;
import org.jaudiotagger.audio.wav.chunk.WavInfoIdentifier;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagField;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.TagTextField;
import org.jaudiotagger.tag.wav.WavInfoTag;
import org.jaudiotagger.tag.wav.WavTag;
import r3.IKWi.AyxAR;
import x41;

public class WavTagWriter {
  public static Logger logger = Logger.getLogger("org.jaudiotagger.audio.wav");
  
  private String loggingName;
  
  public WavTagWriter(String paramString) {
    this.loggingName = paramString;
  }
  
  private BothTagsFileStructure checkExistingLocations(WavTag paramWavTag, FileChannel paramFileChannel) {
    BothTagsFileStructure bothTagsFileStructure = new BothTagsFileStructure();
    if (paramWavTag.getInfoTag().getStartLocationInFile().longValue() < paramWavTag.getID3Tag().getStartLocationInFile().longValue()) {
      bothTagsFileStructure.isInfoTagFirst = true;
      if (Math.abs(paramWavTag.getInfoTag().getEndLocationInFile().longValue() - paramWavTag.getStartLocationInFileOfId3Chunk()) <= 1L) {
        bothTagsFileStructure.isContiguous = true;
        if (isID3TagAtEndOfFileAllowingForPaddingByte(paramWavTag, paramFileChannel)) {
          bothTagsFileStructure.isAtEnd = true;
          return bothTagsFileStructure;
        } 
      } 
    } else if (Math.abs(paramWavTag.getID3Tag().getEndLocationInFile().longValue() - paramWavTag.getInfoTag().getStartLocationInFile().longValue()) <= 1L) {
      bothTagsFileStructure.isContiguous = true;
      if (isInfoTagAtEndOfFileAllowingForPaddingByte(paramWavTag, paramFileChannel))
        bothTagsFileStructure.isAtEnd = true; 
    } 
    return bothTagsFileStructure;
  }
  
  private void deleteExistingMetadataTagsToEndOfFile(FileChannel paramFileChannel, WavTag paramWavTag) {
    ChunkSummary chunkSummary = WavChunkSummary.getChunkBeforeFirstMetadataTag(paramWavTag);
    if (!Utils.isOddLength(chunkSummary.getEndLocation())) {
      paramFileChannel.truncate(chunkSummary.getEndLocation());
      return;
    } 
    paramFileChannel.truncate(chunkSummary.getEndLocation() + 1L);
  }
  
  private void deleteId3ChunkAndCreateNewOneAtFileEnd(FileChannel paramFileChannel, WavTag paramWavTag, ChunkHeader paramChunkHeader, ByteBuffer paramByteBuffer) {
    deleteId3TagChunk(paramFileChannel, paramWavTag, paramChunkHeader);
    paramFileChannel.position(paramFileChannel.size());
    writeId3DataToFile(paramFileChannel, paramByteBuffer);
  }
  
  private void deleteId3TagChunk(FileChannel paramFileChannel, WavTag paramWavTag, ChunkHeader paramChunkHeader) {
    int i = (int)paramChunkHeader.getSize();
    if (Utils.isOddLength(paramWavTag.getEndLocationInFileOfId3Chunk())) {
      deleteTagChunk(paramFileChannel, (int)paramWavTag.getEndLocationInFileOfId3Chunk() + 1, i + 9);
      return;
    } 
    deleteTagChunk(paramFileChannel, (int)paramWavTag.getEndLocationInFileOfId3Chunk(), i + 8);
  }
  
  private void deleteInfoTagChunk(FileChannel paramFileChannel, WavTag paramWavTag, ChunkHeader paramChunkHeader) {
    WavInfoTag wavInfoTag = paramWavTag.getInfoTag();
    int i = (int)paramChunkHeader.getSize();
    deleteTagChunk(paramFileChannel, wavInfoTag.getEndLocationInFile().intValue(), i + 8);
  }
  
  private void deletePaddingChunk(FileChannel paramFileChannel, int paramInt1, int paramInt2) {
    paramFileChannel.position(paramInt1);
    ByteBuffer byteBuffer = ByteBuffer.allocate((int)TagOptionSingleton.getInstance().getWriteChunkSize());
    while (true) {
      if (paramFileChannel.read(byteBuffer) >= 0 || byteBuffer.position() != 0) {
        byteBuffer.flip();
        long l1 = paramFileChannel.position();
        paramFileChannel.position(l1 - paramInt2 - byteBuffer.limit());
        paramFileChannel.write(byteBuffer);
        paramFileChannel.position(l1);
        byteBuffer.compact();
        continue;
      } 
      long l = paramFileChannel.size() - paramInt2;
      Logger logger = logger;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.loggingName);
      stringBuilder.append("-------------Setting new length to:");
      stringBuilder.append(l);
      logger.config(stringBuilder.toString());
      paramFileChannel.truncate(l);
      return;
    } 
  }
  
  private void deleteTagChunk(FileChannel paramFileChannel, int paramInt1, int paramInt2) {
    paramFileChannel.position(paramInt1);
    ByteBuffer byteBuffer = ByteBuffer.allocate((int)TagOptionSingleton.getInstance().getWriteChunkSize());
    while (true) {
      if (paramFileChannel.read(byteBuffer) >= 0 || byteBuffer.position() != 0) {
        byteBuffer.flip();
        long l1 = paramFileChannel.position();
        paramFileChannel.position(l1 - paramInt2 - byteBuffer.limit());
        paramFileChannel.write(byteBuffer);
        paramFileChannel.position(l1);
        byteBuffer.compact();
        continue;
      } 
      long l = paramFileChannel.size() - paramInt2;
      Logger logger = logger;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.loggingName);
      stringBuilder.append("Shortening by:");
      stringBuilder.append(paramInt2);
      stringBuilder.append(" Setting new length to:");
      stringBuilder.append(l);
      logger.severe(stringBuilder.toString());
      paramFileChannel.truncate(l);
      return;
    } 
  }
  
  private boolean isID3TagAtEndOfFileAllowingForPaddingByte(WavTag paramWavTag, FileChannel paramFileChannel) {
    return (paramWavTag.getID3Tag().getEndLocationInFile().longValue() == paramFileChannel.size() || ((paramWavTag.getID3Tag().getEndLocationInFile().longValue() & 0x1L) != 0L && paramWavTag.getID3Tag().getEndLocationInFile().longValue() + 1L == paramFileChannel.size()));
  }
  
  private boolean isInfoTagAtEndOfFileAllowingForPaddingByte(WavTag paramWavTag, FileChannel paramFileChannel) {
    return (paramWavTag.getInfoTag().getEndLocationInFile().longValue() == paramFileChannel.size() || ((paramWavTag.getInfoTag().getEndLocationInFile().longValue() & 0x1L) != 0L && paramWavTag.getInfoTag().getEndLocationInFile().longValue() + 1L == paramFileChannel.size()));
  }
  
  private void rewriteRiffHeaderSize(FileChannel paramFileChannel) {
    paramFileChannel.position(IffHeaderChunk.SIGNATURE_LENGTH);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(IffHeaderChunk.SIZE_LENGTH);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    byteBuffer.putInt((int)paramFileChannel.size() - IffHeaderChunk.SIGNATURE_LENGTH - IffHeaderChunk.SIZE_LENGTH);
    byteBuffer.flip();
    paramFileChannel.write(byteBuffer);
  }
  
  private void saveActive(WavTag paramWavTag1, FileChannel paramFileChannel, WavTag paramWavTag2) {
    if (paramWavTag1.getActiveTag() instanceof WavInfoTag) {
      saveInfo(paramWavTag1, paramFileChannel, paramWavTag2);
      return;
    } 
    saveId3(paramWavTag1, paramFileChannel, paramWavTag2);
  }
  
  private void saveActiveExisting(WavTag paramWavTag1, FileChannel paramFileChannel, WavTag paramWavTag2) {
    if (paramWavTag1.getActiveTag() instanceof WavInfoTag) {
      if (paramWavTag2.isExistingId3Tag()) {
        saveBoth(paramWavTag1, paramFileChannel, paramWavTag2);
        return;
      } 
      saveActive(paramWavTag1, paramFileChannel, paramWavTag2);
      return;
    } 
    if (paramWavTag2.isExistingInfoTag()) {
      saveBoth(paramWavTag1, paramFileChannel, paramWavTag2);
      return;
    } 
    saveActive(paramWavTag1, paramFileChannel, paramWavTag2);
  }
  
  private void saveBoth(WavTag paramWavTag1, FileChannel paramFileChannel, WavTag paramWavTag2) {
    ByteBuffer byteBuffer2 = convertInfoChunk(paramWavTag1);
    long l = byteBuffer2.limit();
    ByteBuffer byteBuffer1 = convertID3Chunk(paramWavTag1, paramWavTag2);
    if (WavChunkSummary.isOnlyMetadataTagsAfterStartingMetadataTag(paramWavTag2)) {
      deleteExistingMetadataTagsToEndOfFile(paramFileChannel, paramWavTag2);
      if (TagOptionSingleton.getInstance().getWavSaveOrder() == WavSaveOrder.INFO_THEN_ID3) {
        writeInfoChunkAtFileEnd(paramFileChannel, byteBuffer2, l);
        writeId3ChunkAtFileEnd(paramFileChannel, byteBuffer1);
        return;
      } 
      writeId3ChunkAtFileEnd(paramFileChannel, byteBuffer1);
      writeInfoChunkAtFileEnd(paramFileChannel, byteBuffer2, l);
      return;
    } 
    if (!paramWavTag2.isIncorrectlyAlignedTag()) {
      if (paramWavTag2.getMetadataChunkSummaryList().size() > 0) {
        ListIterator<ChunkSummary> listIterator = paramWavTag2.getMetadataChunkSummaryList().listIterator(paramWavTag2.getMetadataChunkSummaryList().size());
        while (listIterator.hasPrevious()) {
          ChunkSummary chunkSummary = listIterator.previous();
          Logger logger = logger;
          StringBuilder stringBuilder = new StringBuilder(">>>>Deleting--");
          stringBuilder.append(chunkSummary.getChunkId());
          stringBuilder.append("---");
          stringBuilder.append(chunkSummary.getFileStartLocation());
          stringBuilder.append("--");
          stringBuilder.append(chunkSummary.getEndLocation());
          logger.config(stringBuilder.toString());
          if (Utils.isOddLength(chunkSummary.getEndLocation())) {
            deleteTagChunk(paramFileChannel, (int)chunkSummary.getEndLocation(), (int)(chunkSummary.getEndLocation() + 1L - chunkSummary.getFileStartLocation()));
            continue;
          } 
          deleteTagChunk(paramFileChannel, (int)chunkSummary.getEndLocation(), (int)(chunkSummary.getEndLocation() - chunkSummary.getFileStartLocation()));
        } 
      } 
      if (TagOptionSingleton.getInstance().getWavSaveOrder() == WavSaveOrder.INFO_THEN_ID3) {
        writeInfoChunkAtFileEnd(paramFileChannel, byteBuffer2, l);
        writeId3ChunkAtFileEnd(paramFileChannel, byteBuffer1);
        return;
      } 
      writeId3ChunkAtFileEnd(paramFileChannel, byteBuffer1);
      writeInfoChunkAtFileEnd(paramFileChannel, byteBuffer2, l);
      return;
    } 
    throw new CannotWriteException(x41.n(new StringBuilder(), this.loggingName, " Metadata tags are corrupted and not at end of file so cannot be fixed"));
  }
  
  private void saveId3(WavTag paramWavTag1, FileChannel paramFileChannel, WavTag paramWavTag2) {
    ByteBuffer byteBuffer = convertID3Chunk(paramWavTag1, paramWavTag2);
    if (WavChunkSummary.isOnlyMetadataTagsAfterStartingMetadataTag(paramWavTag2)) {
      deleteExistingMetadataTagsToEndOfFile(paramFileChannel, paramWavTag2);
      writeId3ChunkAtFileEnd(paramFileChannel, byteBuffer);
      return;
    } 
    if (!paramWavTag2.isIncorrectlyAlignedTag()) {
      if (paramWavTag2.getMetadataChunkSummaryList().size() > 0) {
        ListIterator<ChunkSummary> listIterator = paramWavTag2.getMetadataChunkSummaryList().listIterator(paramWavTag2.getMetadataChunkSummaryList().size());
        while (listIterator.hasPrevious()) {
          ChunkSummary chunkSummary = listIterator.previous();
          Logger logger = logger;
          StringBuilder stringBuilder = new StringBuilder(">>>>Deleting--");
          stringBuilder.append(chunkSummary.getChunkId());
          stringBuilder.append("---");
          stringBuilder.append(chunkSummary.getFileStartLocation());
          stringBuilder.append("--");
          stringBuilder.append(chunkSummary.getEndLocation());
          logger.config(stringBuilder.toString());
          if (Utils.isOddLength(chunkSummary.getEndLocation())) {
            deleteTagChunk(paramFileChannel, (int)chunkSummary.getEndLocation(), (int)(chunkSummary.getEndLocation() + 1L - chunkSummary.getFileStartLocation()));
            continue;
          } 
          deleteTagChunk(paramFileChannel, (int)chunkSummary.getEndLocation(), (int)(chunkSummary.getEndLocation() - chunkSummary.getFileStartLocation()));
        } 
      } 
      writeId3ChunkAtFileEnd(paramFileChannel, byteBuffer);
      return;
    } 
    throw new CannotWriteException(x41.n(new StringBuilder(), this.loggingName, " Metadata tags are corrupted and not at end of file so cannot be fixed"));
  }
  
  private void writeExtraByteIfChunkOddSize(FileChannel paramFileChannel, long paramLong) {
    if (Utils.isOddLength(paramLong))
      writePaddingToFile(paramFileChannel, 1); 
  }
  
  private void writeId3ChunkAtFileEnd(FileChannel paramFileChannel, ByteBuffer paramByteBuffer) {
    paramFileChannel.position(paramFileChannel.size());
    writeId3DataToFile(paramFileChannel, paramByteBuffer);
  }
  
  private void writeId3DataToFile(FileChannel paramFileChannel, ByteBuffer paramByteBuffer) {
    if (Utils.isOddLength(paramFileChannel.position()))
      writePaddingToFile(paramFileChannel, 1); 
    ByteBuffer byteBuffer = ByteBuffer.allocate(8);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    byteBuffer.put(WavChunkType.ID3.getCode().getBytes(mk.a));
    byteBuffer.putInt(paramByteBuffer.limit());
    byteBuffer.flip();
    paramFileChannel.write(byteBuffer);
    paramFileChannel.write(paramByteBuffer);
  }
  
  private void writeInfoChunk(FileChannel paramFileChannel, WavInfoTag paramWavInfoTag, ByteBuffer paramByteBuffer) {
    long l = paramByteBuffer.limit();
    if (paramWavInfoTag.getSizeOfTag() >= l) {
      writeInfoDataToFile(paramFileChannel, paramByteBuffer, paramWavInfoTag.getSizeOfTag());
      if (paramWavInfoTag.getSizeOfTag() > l)
        writePaddingToFile(paramFileChannel, (int)(paramWavInfoTag.getSizeOfTag() - l)); 
      return;
    } 
    writeInfoDataToFile(paramFileChannel, paramByteBuffer, l);
  }
  
  private void writeInfoChunkAtFileEnd(FileChannel paramFileChannel, ByteBuffer paramByteBuffer, long paramLong) {
    paramFileChannel.position(paramFileChannel.size());
    writeInfoDataToFile(paramFileChannel, paramByteBuffer, paramLong);
  }
  
  private void writeInfoDataToFile(FileChannel paramFileChannel, ByteBuffer paramByteBuffer) {
    writeInfoDataToFile(paramFileChannel, paramByteBuffer, paramByteBuffer.limit());
  }
  
  private void writeInfoDataToFile(FileChannel paramFileChannel, ByteBuffer paramByteBuffer, long paramLong) {
    if (Utils.isOddLength(paramFileChannel.position()))
      writePaddingToFile(paramFileChannel, 1); 
    ByteBuffer byteBuffer = ByteBuffer.allocate(8);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    byteBuffer.put(WavChunkType.LIST.getCode().getBytes(mk.a));
    byteBuffer.putInt((int)paramLong);
    byteBuffer.flip();
    paramFileChannel.write(byteBuffer);
    paramFileChannel.write(paramByteBuffer);
    writeExtraByteIfChunkOddSize(paramFileChannel, paramLong);
  }
  
  private void writePaddingToFile(FileChannel paramFileChannel, int paramInt) {
    paramFileChannel.write(ByteBuffer.allocateDirect(paramInt));
  }
  
  public ByteBuffer convertID3Chunk(WavTag paramWavTag1, WavTag paramWavTag2) {
    try {
      ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
      this();
      long l2 = paramWavTag2.getSizeOfID3TagOnly();
      long l1 = l2;
      if (l2 > 0L) {
        l1 = l2;
        if ((l2 & 0x1L) != 0L)
          l1 = l2 + 1L; 
      } 
      if (paramWavTag1.getID3Tag() == null)
        paramWavTag1.setID3Tag(WavTag.createDefaultID3Tag()); 
      paramWavTag1.getID3Tag().write(byteArrayOutputStream2, (int)l1);
      ByteArrayOutputStream byteArrayOutputStream1 = byteArrayOutputStream2;
      if (((byteArrayOutputStream2.toByteArray()).length & 0x1) != 0) {
        int i = (byteArrayOutputStream2.toByteArray()).length;
        byteArrayOutputStream1 = new ByteArrayOutputStream();
        this();
        paramWavTag1.getID3Tag().write(byteArrayOutputStream1, i + 1);
      } 
      ByteBuffer byteBuffer = ByteBuffer.wrap(byteArrayOutputStream1.toByteArray());
      byteBuffer.rewind();
      return byteBuffer;
    } catch (IOException iOException) {
      k91.n(iOException);
      return null;
    } 
  }
  
  public ByteBuffer convertInfoChunk(WavTag paramWavTag) {
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      this();
      WavInfoTag wavInfoTag = paramWavTag.getInfoTag();
      List<?> list = wavInfoTag.getAll();
      InfoFieldWriterOrderComparator infoFieldWriterOrderComparator = new InfoFieldWriterOrderComparator();
      this(this);
      Collections.sort(list, infoFieldWriterOrderComparator);
      Iterator<?> iterator = list.iterator();
      boolean bool = false;
      while (true) {
        boolean bool1 = iterator.hasNext();
        if (bool1) {
          TagTextField tagTextField = (TagTextField)iterator.next();
          WavInfoIdentifier wavInfoIdentifier = WavInfoIdentifier.getByFieldKey(FieldKey.valueOf(tagTextField.getId()));
          if (wavInfoIdentifier == null)
            continue; 
          String str = wavInfoIdentifier.getCode();
          Charset charset = mk.a;
          byteArrayOutputStream.write(str.getBytes(charset));
          Logger logger = logger;
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append(this.loggingName);
          stringBuilder.append(" Writing:");
          stringBuilder.append(wavInfoIdentifier.getCode());
          stringBuilder.append(":");
          stringBuilder.append(tagTextField.getContent());
          logger.config(stringBuilder.toString());
          byte[] arrayOfByte = tagTextField.getContent().getBytes(mk.c);
          byteArrayOutputStream.write(Utils.getSizeLEInt32(arrayOfByte.length));
          byteArrayOutputStream.write(arrayOfByte);
          if (Utils.isOddLength(arrayOfByte.length))
            byteArrayOutputStream.write(0); 
          if (wavInfoIdentifier == WavInfoIdentifier.TRACKNO) {
            if (TagOptionSingleton.getInstance().isWriteWavForTwonky()) {
              wavInfoIdentifier = WavInfoIdentifier.TWONKY_TRACKNO;
              byteArrayOutputStream.write(wavInfoIdentifier.getCode().getBytes(charset));
              Logger logger1 = logger;
              StringBuilder stringBuilder1 = new StringBuilder();
              this();
              stringBuilder1.append(this.loggingName);
              stringBuilder1.append(" Writing:");
              stringBuilder1.append(wavInfoIdentifier.getCode());
              stringBuilder1.append(":");
              stringBuilder1.append(tagTextField.getContent());
              logger1.config(stringBuilder1.toString());
              byteArrayOutputStream.write(Utils.getSizeLEInt32(arrayOfByte.length));
              byteArrayOutputStream.write(arrayOfByte);
              if (Utils.isOddLength(arrayOfByte.length))
                byteArrayOutputStream.write(0); 
            } 
            bool = true;
          } 
          continue;
        } 
        for (TagTextField tagTextField : wavInfoTag.getUnrecognisedFields()) {
          if (!tagTextField.getId().equals(WavInfoIdentifier.TWONKY_TRACKNO.getCode()) || (!bool && TagOptionSingleton.getInstance().isWriteWavForTwonky())) {
            byteArrayOutputStream.write(tagTextField.getId().getBytes(mk.a));
            Logger logger = logger;
            StringBuilder stringBuilder = new StringBuilder();
            this();
            stringBuilder.append(this.loggingName);
            stringBuilder.append(" Writing:");
            stringBuilder.append(tagTextField.getId());
            stringBuilder.append(":");
            stringBuilder.append(tagTextField.getContent());
            logger.config(stringBuilder.toString());
            byte[] arrayOfByte = tagTextField.getContent().getBytes(mk.c);
            byteArrayOutputStream.write(Utils.getSizeLEInt32(arrayOfByte.length));
            byteArrayOutputStream.write(arrayOfByte);
            if (Utils.isOddLength(arrayOfByte.length))
              byteArrayOutputStream.write(0); 
          } 
        } 
        ByteBuffer byteBuffer1 = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
        byteBuffer1.rewind();
        ByteBuffer byteBuffer2 = ByteBuffer.allocate(IffHeaderChunk.SIGNATURE_LENGTH);
        byteBuffer2.put(WavChunkType.INFO.getCode().getBytes(mk.a));
        byteBuffer2.flip();
        ByteBuffer byteBuffer3 = ByteBuffer.allocateDirect(byteBuffer2.limit() + byteBuffer1.limit());
        byteBuffer3.put(byteBuffer2);
        byteBuffer3.put(byteBuffer1);
        byteBuffer3.flip();
        return byteBuffer3;
      } 
    } catch (IOException iOException) {
      k91.n(iOException);
      return null;
    } 
  }
  
  public void delete(Tag paramTag, c61 paramc61) {
    // Byte code:
    //   0: getstatic org/jaudiotagger/audio/wav/WavTagWriter.logger : Ljava/util/logging/Logger;
    //   3: astore #6
    //   5: new java/lang/StringBuilder
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: astore_1
    //   13: aload_1
    //   14: aload_0
    //   15: getfield loggingName : Ljava/lang/String;
    //   18: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: pop
    //   22: aload_1
    //   23: ldc_w ':Deleting metadata from file'
    //   26: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: pop
    //   30: aload #6
    //   32: aload_1
    //   33: invokevirtual toString : ()Ljava/lang/String;
    //   36: invokevirtual info : (Ljava/lang/String;)V
    //   39: aconst_null
    //   40: astore #8
    //   42: aconst_null
    //   43: astore_1
    //   44: aconst_null
    //   45: astore #6
    //   47: aconst_null
    //   48: astore #9
    //   50: aload_2
    //   51: ldc_w 'rw'
    //   54: invokevirtual b : (Ljava/lang/String;)Ljava/nio/channels/FileChannel;
    //   57: astore #7
    //   59: aload #9
    //   61: astore_1
    //   62: aload #8
    //   64: astore #6
    //   66: aload #7
    //   68: aload_2
    //   69: invokevirtual toString : ()Ljava/lang/String;
    //   72: invokestatic B : (Ljava/nio/channels/FileChannel;Ljava/lang/String;)Ljava/nio/channels/FileLock;
    //   75: astore #8
    //   77: aload #8
    //   79: astore_1
    //   80: aload #8
    //   82: astore #6
    //   84: aload_0
    //   85: aload_2
    //   86: invokevirtual getExistingMetadata : (Lc61;)Lorg/jaudiotagger/tag/wav/WavTag;
    //   89: astore #9
    //   91: aload #8
    //   93: astore_1
    //   94: aload #8
    //   96: astore #6
    //   98: aload #9
    //   100: invokevirtual isExistingId3Tag : ()Z
    //   103: ifeq -> 629
    //   106: aload #8
    //   108: astore_1
    //   109: aload #8
    //   111: astore #6
    //   113: aload #9
    //   115: invokevirtual isExistingInfoTag : ()Z
    //   118: ifeq -> 629
    //   121: aload #8
    //   123: astore_1
    //   124: aload #8
    //   126: astore #6
    //   128: aload_0
    //   129: aload #9
    //   131: aload #7
    //   133: invokespecial checkExistingLocations : (Lorg/jaudiotagger/tag/wav/WavTag;Ljava/nio/channels/FileChannel;)Lorg/jaudiotagger/audio/wav/WavTagWriter$BothTagsFileStructure;
    //   136: astore #10
    //   138: aload #8
    //   140: astore_1
    //   141: aload #8
    //   143: astore #6
    //   145: aload #10
    //   147: getfield isContiguous : Z
    //   150: ifeq -> 365
    //   153: aload #8
    //   155: astore_1
    //   156: aload #8
    //   158: astore #6
    //   160: aload #10
    //   162: getfield isAtEnd : Z
    //   165: istore #4
    //   167: aload #10
    //   169: getfield isInfoTagFirst : Z
    //   172: istore #5
    //   174: iload #4
    //   176: ifeq -> 256
    //   179: iload #5
    //   181: ifeq -> 235
    //   184: aload #8
    //   186: astore_1
    //   187: aload #8
    //   189: astore #6
    //   191: aload #7
    //   193: aload #9
    //   195: invokevirtual getInfoTag : ()Lorg/jaudiotagger/tag/wav/WavInfoTag;
    //   198: invokevirtual getStartLocationInFile : ()Ljava/lang/Long;
    //   201: invokevirtual longValue : ()J
    //   204: invokevirtual truncate : (J)Ljava/nio/channels/FileChannel;
    //   207: pop
    //   208: goto -> 831
    //   211: astore_2
    //   212: aload #7
    //   214: astore #6
    //   216: goto -> 954
    //   219: astore #8
    //   221: aload #6
    //   223: astore_1
    //   224: aload #7
    //   226: astore #6
    //   228: aload #8
    //   230: astore #7
    //   232: goto -> 898
    //   235: aload #8
    //   237: astore_1
    //   238: aload #8
    //   240: astore #6
    //   242: aload #7
    //   244: aload #9
    //   246: invokevirtual getStartLocationInFileOfId3Chunk : ()J
    //   249: invokevirtual truncate : (J)Ljava/nio/channels/FileChannel;
    //   252: pop
    //   253: goto -> 831
    //   256: iload #5
    //   258: ifeq -> 310
    //   261: aload #8
    //   263: astore_1
    //   264: aload #8
    //   266: astore #6
    //   268: aload #9
    //   270: invokevirtual getEndLocationInFileOfId3Chunk : ()J
    //   273: aload #9
    //   275: invokevirtual getInfoTag : ()Lorg/jaudiotagger/tag/wav/WavInfoTag;
    //   278: invokevirtual getStartLocationInFile : ()Ljava/lang/Long;
    //   281: invokevirtual longValue : ()J
    //   284: lsub
    //   285: l2i
    //   286: istore_3
    //   287: aload #8
    //   289: astore_1
    //   290: aload #8
    //   292: astore #6
    //   294: aload_0
    //   295: aload #7
    //   297: aload #9
    //   299: invokevirtual getEndLocationInFileOfId3Chunk : ()J
    //   302: l2i
    //   303: iload_3
    //   304: invokespecial deleteTagChunk : (Ljava/nio/channels/FileChannel;II)V
    //   307: goto -> 831
    //   310: aload #8
    //   312: astore_1
    //   313: aload #8
    //   315: astore #6
    //   317: aload #9
    //   319: invokevirtual getInfoTag : ()Lorg/jaudiotagger/tag/wav/WavInfoTag;
    //   322: invokevirtual getEndLocationInFile : ()Ljava/lang/Long;
    //   325: invokevirtual intValue : ()I
    //   328: i2l
    //   329: aload #9
    //   331: invokevirtual getStartLocationInFileOfId3Chunk : ()J
    //   334: lsub
    //   335: l2i
    //   336: istore_3
    //   337: aload #8
    //   339: astore_1
    //   340: aload #8
    //   342: astore #6
    //   344: aload_0
    //   345: aload #7
    //   347: aload #9
    //   349: invokevirtual getInfoTag : ()Lorg/jaudiotagger/tag/wav/WavInfoTag;
    //   352: invokevirtual getEndLocationInFile : ()Ljava/lang/Long;
    //   355: invokevirtual intValue : ()I
    //   358: iload_3
    //   359: invokespecial deleteTagChunk : (Ljava/nio/channels/FileChannel;II)V
    //   362: goto -> 831
    //   365: aload #8
    //   367: astore_1
    //   368: aload #8
    //   370: astore #6
    //   372: aload #9
    //   374: invokevirtual getInfoTag : ()Lorg/jaudiotagger/tag/wav/WavInfoTag;
    //   377: astore #11
    //   379: aload #8
    //   381: astore_1
    //   382: aload #8
    //   384: astore #6
    //   386: aload_0
    //   387: aload #7
    //   389: aload #9
    //   391: invokevirtual seekToStartOfListInfoMetadata : (Ljava/nio/channels/FileChannel;Lorg/jaudiotagger/tag/wav/WavTag;)Lorg/jaudiotagger/audio/iff/ChunkHeader;
    //   394: astore #12
    //   396: aload #8
    //   398: astore_1
    //   399: aload #8
    //   401: astore #6
    //   403: aload_0
    //   404: aload #7
    //   406: aload #9
    //   408: invokevirtual seekToStartOfId3MetadataForChunkSummaryHeader : (Ljava/nio/channels/FileChannel;Lorg/jaudiotagger/tag/wav/WavTag;)Lorg/jaudiotagger/audio/iff/ChunkHeader;
    //   411: astore #10
    //   413: aload #8
    //   415: astore_1
    //   416: aload #8
    //   418: astore #6
    //   420: aload_0
    //   421: aload #9
    //   423: aload #7
    //   425: invokespecial isInfoTagAtEndOfFileAllowingForPaddingByte : (Lorg/jaudiotagger/tag/wav/WavTag;Ljava/nio/channels/FileChannel;)Z
    //   428: ifeq -> 472
    //   431: aload #8
    //   433: astore_1
    //   434: aload #8
    //   436: astore #6
    //   438: aload #7
    //   440: aload #11
    //   442: invokevirtual getStartLocationInFile : ()Ljava/lang/Long;
    //   445: invokevirtual longValue : ()J
    //   448: invokevirtual truncate : (J)Ljava/nio/channels/FileChannel;
    //   451: pop
    //   452: aload #8
    //   454: astore_1
    //   455: aload #8
    //   457: astore #6
    //   459: aload_0
    //   460: aload #7
    //   462: aload #9
    //   464: aload #10
    //   466: invokespecial deleteId3TagChunk : (Ljava/nio/channels/FileChannel;Lorg/jaudiotagger/tag/wav/WavTag;Lorg/jaudiotagger/audio/iff/ChunkHeader;)V
    //   469: goto -> 831
    //   472: aload #8
    //   474: astore_1
    //   475: aload #8
    //   477: astore #6
    //   479: aload_0
    //   480: aload #9
    //   482: aload #7
    //   484: invokespecial isID3TagAtEndOfFileAllowingForPaddingByte : (Lorg/jaudiotagger/tag/wav/WavTag;Ljava/nio/channels/FileChannel;)Z
    //   487: ifeq -> 528
    //   490: aload #8
    //   492: astore_1
    //   493: aload #8
    //   495: astore #6
    //   497: aload #7
    //   499: aload #9
    //   501: invokevirtual getStartLocationInFileOfId3Chunk : ()J
    //   504: invokevirtual truncate : (J)Ljava/nio/channels/FileChannel;
    //   507: pop
    //   508: aload #8
    //   510: astore_1
    //   511: aload #8
    //   513: astore #6
    //   515: aload_0
    //   516: aload #7
    //   518: aload #9
    //   520: aload #12
    //   522: invokespecial deleteInfoTagChunk : (Ljava/nio/channels/FileChannel;Lorg/jaudiotagger/tag/wav/WavTag;Lorg/jaudiotagger/audio/iff/ChunkHeader;)V
    //   525: goto -> 831
    //   528: aload #8
    //   530: astore_1
    //   531: aload #8
    //   533: astore #6
    //   535: aload #9
    //   537: invokevirtual getInfoTag : ()Lorg/jaudiotagger/tag/wav/WavInfoTag;
    //   540: invokevirtual getStartLocationInFile : ()Ljava/lang/Long;
    //   543: invokevirtual longValue : ()J
    //   546: aload #9
    //   548: invokevirtual getStartLocationInFileOfId3Chunk : ()J
    //   551: lcmp
    //   552: ifle -> 592
    //   555: aload #8
    //   557: astore_1
    //   558: aload #8
    //   560: astore #6
    //   562: aload_0
    //   563: aload #7
    //   565: aload #9
    //   567: aload #12
    //   569: invokespecial deleteInfoTagChunk : (Ljava/nio/channels/FileChannel;Lorg/jaudiotagger/tag/wav/WavTag;Lorg/jaudiotagger/audio/iff/ChunkHeader;)V
    //   572: aload #8
    //   574: astore_1
    //   575: aload #8
    //   577: astore #6
    //   579: aload_0
    //   580: aload #7
    //   582: aload #9
    //   584: aload #10
    //   586: invokespecial deleteId3TagChunk : (Ljava/nio/channels/FileChannel;Lorg/jaudiotagger/tag/wav/WavTag;Lorg/jaudiotagger/audio/iff/ChunkHeader;)V
    //   589: goto -> 831
    //   592: aload #8
    //   594: astore_1
    //   595: aload #8
    //   597: astore #6
    //   599: aload_0
    //   600: aload #7
    //   602: aload #9
    //   604: aload #10
    //   606: invokespecial deleteId3TagChunk : (Ljava/nio/channels/FileChannel;Lorg/jaudiotagger/tag/wav/WavTag;Lorg/jaudiotagger/audio/iff/ChunkHeader;)V
    //   609: aload #8
    //   611: astore_1
    //   612: aload #8
    //   614: astore #6
    //   616: aload_0
    //   617: aload #7
    //   619: aload #9
    //   621: aload #12
    //   623: invokespecial deleteInfoTagChunk : (Ljava/nio/channels/FileChannel;Lorg/jaudiotagger/tag/wav/WavTag;Lorg/jaudiotagger/audio/iff/ChunkHeader;)V
    //   626: goto -> 831
    //   629: aload #8
    //   631: astore_1
    //   632: aload #8
    //   634: astore #6
    //   636: aload #9
    //   638: invokevirtual isExistingInfoTag : ()Z
    //   641: ifeq -> 743
    //   644: aload #8
    //   646: astore_1
    //   647: aload #8
    //   649: astore #6
    //   651: aload #9
    //   653: invokevirtual getInfoTag : ()Lorg/jaudiotagger/tag/wav/WavInfoTag;
    //   656: astore #11
    //   658: aload #8
    //   660: astore_1
    //   661: aload #8
    //   663: astore #6
    //   665: aload_0
    //   666: aload #7
    //   668: aload #9
    //   670: invokevirtual seekToStartOfListInfoMetadata : (Ljava/nio/channels/FileChannel;Lorg/jaudiotagger/tag/wav/WavTag;)Lorg/jaudiotagger/audio/iff/ChunkHeader;
    //   673: astore #10
    //   675: aload #8
    //   677: astore_1
    //   678: aload #8
    //   680: astore #6
    //   682: aload #11
    //   684: invokevirtual getEndLocationInFile : ()Ljava/lang/Long;
    //   687: invokevirtual longValue : ()J
    //   690: aload #7
    //   692: invokevirtual size : ()J
    //   695: lcmp
    //   696: ifne -> 723
    //   699: aload #8
    //   701: astore_1
    //   702: aload #8
    //   704: astore #6
    //   706: aload #7
    //   708: aload #11
    //   710: invokevirtual getStartLocationInFile : ()Ljava/lang/Long;
    //   713: invokevirtual longValue : ()J
    //   716: invokevirtual truncate : (J)Ljava/nio/channels/FileChannel;
    //   719: pop
    //   720: goto -> 831
    //   723: aload #8
    //   725: astore_1
    //   726: aload #8
    //   728: astore #6
    //   730: aload_0
    //   731: aload #7
    //   733: aload #9
    //   735: aload #10
    //   737: invokespecial deleteInfoTagChunk : (Ljava/nio/channels/FileChannel;Lorg/jaudiotagger/tag/wav/WavTag;Lorg/jaudiotagger/audio/iff/ChunkHeader;)V
    //   740: goto -> 831
    //   743: aload #8
    //   745: astore_1
    //   746: aload #8
    //   748: astore #6
    //   750: aload #9
    //   752: invokevirtual isExistingId3Tag : ()Z
    //   755: ifeq -> 831
    //   758: aload #8
    //   760: astore_1
    //   761: aload #8
    //   763: astore #6
    //   765: aload_0
    //   766: aload #7
    //   768: aload #9
    //   770: invokevirtual seekToStartOfId3MetadataForChunkSummaryHeader : (Ljava/nio/channels/FileChannel;Lorg/jaudiotagger/tag/wav/WavTag;)Lorg/jaudiotagger/audio/iff/ChunkHeader;
    //   773: astore #10
    //   775: aload #8
    //   777: astore_1
    //   778: aload #8
    //   780: astore #6
    //   782: aload_0
    //   783: aload #9
    //   785: aload #7
    //   787: invokespecial isID3TagAtEndOfFileAllowingForPaddingByte : (Lorg/jaudiotagger/tag/wav/WavTag;Ljava/nio/channels/FileChannel;)Z
    //   790: ifeq -> 814
    //   793: aload #8
    //   795: astore_1
    //   796: aload #8
    //   798: astore #6
    //   800: aload #7
    //   802: aload #9
    //   804: invokevirtual getStartLocationInFileOfId3Chunk : ()J
    //   807: invokevirtual truncate : (J)Ljava/nio/channels/FileChannel;
    //   810: pop
    //   811: goto -> 831
    //   814: aload #8
    //   816: astore_1
    //   817: aload #8
    //   819: astore #6
    //   821: aload_0
    //   822: aload #7
    //   824: aload #9
    //   826: aload #10
    //   828: invokespecial deleteId3TagChunk : (Ljava/nio/channels/FileChannel;Lorg/jaudiotagger/tag/wav/WavTag;Lorg/jaudiotagger/audio/iff/ChunkHeader;)V
    //   831: aload #8
    //   833: astore_1
    //   834: aload #8
    //   836: astore #6
    //   838: aload_0
    //   839: aload #7
    //   841: invokespecial rewriteRiffHeaderSize : (Ljava/nio/channels/FileChannel;)V
    //   844: aload #7
    //   846: ifnull -> 880
    //   849: aload #8
    //   851: ifnull -> 867
    //   854: aload #8
    //   856: invokevirtual release : ()V
    //   859: goto -> 867
    //   862: astore_1
    //   863: aload_1
    //   864: invokevirtual printStackTrace : ()V
    //   867: aload #7
    //   869: invokevirtual close : ()V
    //   872: goto -> 880
    //   875: astore_1
    //   876: aload_1
    //   877: invokevirtual printStackTrace : ()V
    //   880: return
    //   881: astore_2
    //   882: aconst_null
    //   883: astore_1
    //   884: goto -> 954
    //   887: astore #7
    //   889: aconst_null
    //   890: astore #8
    //   892: aload_1
    //   893: astore #6
    //   895: aload #8
    //   897: astore_1
    //   898: new org/jaudiotagger/audio/exceptions/CannotWriteException
    //   901: astore #8
    //   903: new java/lang/StringBuilder
    //   906: astore #9
    //   908: aload #9
    //   910: invokespecial <init> : ()V
    //   913: aload #9
    //   915: aload_2
    //   916: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   919: pop
    //   920: aload #9
    //   922: ldc_w ':'
    //   925: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   928: pop
    //   929: aload #9
    //   931: aload #7
    //   933: invokevirtual getMessage : ()Ljava/lang/String;
    //   936: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   939: pop
    //   940: aload #8
    //   942: aload #9
    //   944: invokevirtual toString : ()Ljava/lang/String;
    //   947: invokespecial <init> : (Ljava/lang/String;)V
    //   950: aload #8
    //   952: athrow
    //   953: astore_2
    //   954: aload #6
    //   956: ifnull -> 988
    //   959: aload_1
    //   960: ifnull -> 975
    //   963: aload_1
    //   964: invokevirtual release : ()V
    //   967: goto -> 975
    //   970: astore_1
    //   971: aload_1
    //   972: invokevirtual printStackTrace : ()V
    //   975: aload #6
    //   977: invokevirtual close : ()V
    //   980: goto -> 988
    //   983: astore_1
    //   984: aload_1
    //   985: invokevirtual printStackTrace : ()V
    //   988: aload_2
    //   989: athrow
    // Exception table:
    //   from	to	target	type
    //   50	59	887	java/io/IOException
    //   50	59	881	finally
    //   66	77	219	java/io/IOException
    //   66	77	211	finally
    //   84	91	219	java/io/IOException
    //   84	91	211	finally
    //   98	106	219	java/io/IOException
    //   98	106	211	finally
    //   113	121	219	java/io/IOException
    //   113	121	211	finally
    //   128	138	219	java/io/IOException
    //   128	138	211	finally
    //   145	153	219	java/io/IOException
    //   145	153	211	finally
    //   160	167	219	java/io/IOException
    //   160	167	211	finally
    //   191	208	219	java/io/IOException
    //   191	208	211	finally
    //   242	253	219	java/io/IOException
    //   242	253	211	finally
    //   268	287	219	java/io/IOException
    //   268	287	211	finally
    //   294	307	219	java/io/IOException
    //   294	307	211	finally
    //   317	337	219	java/io/IOException
    //   317	337	211	finally
    //   344	362	219	java/io/IOException
    //   344	362	211	finally
    //   372	379	219	java/io/IOException
    //   372	379	211	finally
    //   386	396	219	java/io/IOException
    //   386	396	211	finally
    //   403	413	219	java/io/IOException
    //   403	413	211	finally
    //   420	431	219	java/io/IOException
    //   420	431	211	finally
    //   438	452	219	java/io/IOException
    //   438	452	211	finally
    //   459	469	219	java/io/IOException
    //   459	469	211	finally
    //   479	490	219	java/io/IOException
    //   479	490	211	finally
    //   497	508	219	java/io/IOException
    //   497	508	211	finally
    //   515	525	219	java/io/IOException
    //   515	525	211	finally
    //   535	555	219	java/io/IOException
    //   535	555	211	finally
    //   562	572	219	java/io/IOException
    //   562	572	211	finally
    //   579	589	219	java/io/IOException
    //   579	589	211	finally
    //   599	609	219	java/io/IOException
    //   599	609	211	finally
    //   616	626	219	java/io/IOException
    //   616	626	211	finally
    //   636	644	219	java/io/IOException
    //   636	644	211	finally
    //   651	658	219	java/io/IOException
    //   651	658	211	finally
    //   665	675	219	java/io/IOException
    //   665	675	211	finally
    //   682	699	219	java/io/IOException
    //   682	699	211	finally
    //   706	720	219	java/io/IOException
    //   706	720	211	finally
    //   730	740	219	java/io/IOException
    //   730	740	211	finally
    //   750	758	219	java/io/IOException
    //   750	758	211	finally
    //   765	775	219	java/io/IOException
    //   765	775	211	finally
    //   782	793	219	java/io/IOException
    //   782	793	211	finally
    //   800	811	219	java/io/IOException
    //   800	811	211	finally
    //   821	831	219	java/io/IOException
    //   821	831	211	finally
    //   838	844	219	java/io/IOException
    //   838	844	211	finally
    //   854	859	862	java/io/IOException
    //   867	872	875	java/io/IOException
    //   898	953	953	finally
    //   963	967	970	java/io/IOException
    //   975	980	983	java/io/IOException
  }
  
  public void deleteInfoChunkAndCreateNewOneAtFileEnd(FileChannel paramFileChannel, WavTag paramWavTag, ChunkHeader paramChunkHeader, ByteBuffer paramByteBuffer) {
    deleteInfoTagChunk(paramFileChannel, paramWavTag, paramChunkHeader);
    paramFileChannel.position(paramFileChannel.size());
    writeInfoDataToFile(paramFileChannel, paramByteBuffer);
  }
  
  public void deleteOrTruncateId3Tag(FileChannel paramFileChannel, WavTag paramWavTag) {
    if (isID3TagAtEndOfFileAllowingForPaddingByte(paramWavTag, paramFileChannel)) {
      paramFileChannel.truncate(paramWavTag.getStartLocationInFileOfId3Chunk());
      return;
    } 
    deleteId3TagChunk(paramFileChannel, paramWavTag, seekToStartOfId3MetadataForChunkSummaryHeader(paramFileChannel, paramWavTag));
  }
  
  public void deleteOrTruncateInfoTag(FileChannel paramFileChannel, WavTag paramWavTag) {
    ChunkHeader chunkHeader = seekToStartOfListInfoMetadata(paramFileChannel, paramWavTag);
    if (isInfoTagAtEndOfFileAllowingForPaddingByte(paramWavTag, paramFileChannel)) {
      paramFileChannel.truncate(paramWavTag.getInfoTag().getStartLocationInFile().longValue());
      return;
    } 
    deleteInfoTagChunk(paramFileChannel, paramWavTag, chunkHeader);
  }
  
  public WavTag getExistingMetadata(c61 paramc61) {
    try {
      WavTagReader wavTagReader = new WavTagReader();
      this(this.loggingName);
      return wavTagReader.read(paramc61);
    } catch (CannotReadException cannotReadException) {
      StringBuilder stringBuilder = new StringBuilder("Failed to read file ");
      stringBuilder.append(paramc61);
      throw new CannotWriteException(stringBuilder.toString());
    } 
  }
  
  public void removeAllMetadata(FileChannel paramFileChannel, WavTag paramWavTag) {
    if (paramWavTag.getStartLocationInFileOfId3Chunk() > paramWavTag.getInfoTag().getStartLocationInFile().longValue()) {
      deleteId3TagChunk(paramFileChannel, paramWavTag, seekToStartOfId3MetadataForChunkSummaryHeader(paramFileChannel, paramWavTag));
      deleteInfoTagChunk(paramFileChannel, paramWavTag, seekToStartOfListInfoMetadata(paramFileChannel, paramWavTag));
      return;
    } 
    if (paramWavTag.getInfoTag().getStartLocationInFile().longValue() > paramWavTag.getStartLocationInFileOfId3Chunk()) {
      deleteInfoTagChunk(paramFileChannel, paramWavTag, seekToStartOfListInfoMetadata(paramFileChannel, paramWavTag));
      deleteId3TagChunk(paramFileChannel, paramWavTag, seekToStartOfId3MetadataForChunkSummaryHeader(paramFileChannel, paramWavTag));
    } 
  }
  
  public void replaceId3ChunkAtFileEnd(FileChannel paramFileChannel, WavTag paramWavTag, ByteBuffer paramByteBuffer) {
    ChunkHeader chunkHeader = seekToStartOfId3MetadataForChunkSummaryHeader(paramFileChannel, paramWavTag);
    if (isID3TagAtEndOfFileAllowingForPaddingByte(paramWavTag, paramFileChannel)) {
      writeId3DataToFile(paramFileChannel, paramByteBuffer);
      return;
    } 
    deleteId3ChunkAndCreateNewOneAtFileEnd(paramFileChannel, paramWavTag, chunkHeader, paramByteBuffer);
  }
  
  public void replaceInfoChunkAtFileEnd(FileChannel paramFileChannel, WavTag paramWavTag, ByteBuffer paramByteBuffer) {
    ChunkHeader chunkHeader = seekToStartOfListInfoMetadata(paramFileChannel, paramWavTag);
    if (isInfoTagAtEndOfFileAllowingForPaddingByte(paramWavTag, paramFileChannel)) {
      logger.severe("writinginfo");
      writeInfoChunk(paramFileChannel, paramWavTag.getInfoTag(), paramByteBuffer);
      return;
    } 
    deleteInfoChunkAndCreateNewOneAtFileEnd(paramFileChannel, paramWavTag, chunkHeader, paramByteBuffer);
  }
  
  public void saveInfo(WavTag paramWavTag1, FileChannel paramFileChannel, WavTag paramWavTag2) {
    ByteBuffer byteBuffer = convertInfoChunk(paramWavTag1);
    long l = byteBuffer.limit();
    if (WavChunkSummary.isOnlyMetadataTagsAfterStartingMetadataTag(paramWavTag2)) {
      deleteExistingMetadataTagsToEndOfFile(paramFileChannel, paramWavTag2);
      writeInfoChunkAtFileEnd(paramFileChannel, byteBuffer, l);
      return;
    } 
    if (!paramWavTag2.isIncorrectlyAlignedTag()) {
      if (paramWavTag2.getMetadataChunkSummaryList().size() > 0) {
        ListIterator<ChunkSummary> listIterator = paramWavTag2.getMetadataChunkSummaryList().listIterator(paramWavTag2.getMetadataChunkSummaryList().size());
        while (listIterator.hasPrevious()) {
          ChunkSummary chunkSummary = listIterator.previous();
          Logger logger = logger;
          StringBuilder stringBuilder = new StringBuilder(">>>>Deleting--");
          stringBuilder.append(chunkSummary.getChunkId());
          stringBuilder.append("---");
          stringBuilder.append(chunkSummary.getFileStartLocation());
          stringBuilder.append("--");
          stringBuilder.append(chunkSummary.getEndLocation());
          logger.config(stringBuilder.toString());
          if (Utils.isOddLength(chunkSummary.getEndLocation())) {
            deleteTagChunk(paramFileChannel, (int)chunkSummary.getEndLocation(), (int)(chunkSummary.getEndLocation() + 1L - chunkSummary.getFileStartLocation()));
            continue;
          } 
          deleteTagChunk(paramFileChannel, (int)chunkSummary.getEndLocation(), (int)(chunkSummary.getEndLocation() - chunkSummary.getFileStartLocation()));
        } 
      } 
      writeInfoChunkAtFileEnd(paramFileChannel, byteBuffer, l);
      return;
    } 
    throw new CannotWriteException(x41.n(new StringBuilder(), this.loggingName, " Metadata tags are corrupted and not at end of file so cannot be fixed"));
  }
  
  public ChunkHeader seekToStartOfId3MetadataForChunkSummaryHeader(FileChannel paramFileChannel, ChunkSummary paramChunkSummary) {
    Logger logger = logger;
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(this.loggingName);
    stringBuilder2.append(":seekToStartOfIdMetadata:");
    stringBuilder2.append(paramChunkSummary.getFileStartLocation());
    logger.severe(stringBuilder2.toString());
    paramFileChannel.position(paramChunkSummary.getFileStartLocation());
    ChunkHeader chunkHeader = new ChunkHeader(ByteOrder.LITTLE_ENDIAN);
    chunkHeader.readHeader(paramFileChannel);
    paramFileChannel.position(paramFileChannel.position() - 8L);
    if (WavChunkType.ID3.getCode().equals(chunkHeader.getID()) || WavChunkType.ID3_UPPERCASE.getCode().equals(chunkHeader.getID())) {
      if (WavChunkType.ID3_UPPERCASE.getCode().equals(chunkHeader.getID())) {
        Logger logger1 = logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.loggingName);
        stringBuilder.append(":on save ID3 chunk will be correctly set with id3 id");
        logger1.severe(stringBuilder.toString());
      } 
      return chunkHeader;
    } 
    String str1 = this.loggingName;
    String str2 = chunkHeader.getID();
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append(str1);
    stringBuilder1.append(" Unable to find ID3 chunk at original location has file been modified externally:");
    stringBuilder1.append(str2);
    throw new CannotWriteException(stringBuilder1.toString());
  }
  
  public ChunkHeader seekToStartOfId3MetadataForChunkSummaryHeader(FileChannel paramFileChannel, WavTag paramWavTag) {
    Logger logger = logger;
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(this.loggingName);
    stringBuilder2.append(":seekToStartOfIdMetadata:");
    stringBuilder2.append(paramWavTag.getStartLocationInFileOfId3Chunk());
    logger.info(stringBuilder2.toString());
    paramFileChannel.position(paramWavTag.getStartLocationInFileOfId3Chunk());
    ChunkHeader chunkHeader = new ChunkHeader(ByteOrder.LITTLE_ENDIAN);
    chunkHeader.readHeader(paramFileChannel);
    paramFileChannel.position(paramFileChannel.position() - 8L);
    if (WavChunkType.ID3.getCode().equals(chunkHeader.getID()) || WavChunkType.ID3_UPPERCASE.getCode().equals(chunkHeader.getID())) {
      if (WavChunkType.ID3_UPPERCASE.getCode().equals(chunkHeader.getID())) {
        Logger logger1 = logger;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.loggingName);
        stringBuilder.append(":on save ID3 chunk will be correctly set with id3 id");
        logger1.severe(stringBuilder.toString());
      } 
      return chunkHeader;
    } 
    String str1 = this.loggingName;
    String str2 = chunkHeader.getID();
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append(str1);
    stringBuilder1.append(uvJYmft.MzD);
    stringBuilder1.append(str2);
    throw new CannotWriteException(stringBuilder1.toString());
  }
  
  public ChunkHeader seekToStartOfListInfoMetadata(FileChannel paramFileChannel, WavTag paramWavTag) {
    paramFileChannel.position(paramWavTag.getInfoTag().getStartLocationInFile().longValue());
    ChunkHeader chunkHeader = new ChunkHeader(ByteOrder.LITTLE_ENDIAN);
    chunkHeader.readHeader(paramFileChannel);
    paramFileChannel.position(paramFileChannel.position() - 8L);
    if (WavChunkType.LIST.getCode().equals(chunkHeader.getID()))
      return chunkHeader; 
    throw new CannotWriteException(x41.n(new StringBuilder(), this.loggingName, " Unable to find List chunk at original location has file been modified externally"));
  }
  
  public ChunkHeader seekToStartOfListInfoMetadataForChunkSummaryHeader(FileChannel paramFileChannel, ChunkSummary paramChunkSummary) {
    paramFileChannel.position(paramChunkSummary.getFileStartLocation());
    ChunkHeader chunkHeader = new ChunkHeader(ByteOrder.LITTLE_ENDIAN);
    chunkHeader.readHeader(paramFileChannel);
    paramFileChannel.position(paramFileChannel.position() - 8L);
    if (WavChunkType.LIST.getCode().equals(chunkHeader.getID()))
      return chunkHeader; 
    throw new CannotWriteException(x41.n(new StringBuilder(), this.loggingName, AyxAR.rquZTWyA));
  }
  
  public void write(Tag paramTag, c61 paramc61) {
    Logger logger1;
    Logger logger2 = logger;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.loggingName);
    stringBuilder.append(" Writing tag to file:start");
    logger2.config(stringBuilder.toString());
    WavSaveOptions wavSaveOptions = TagOptionSingleton.getInstance().getWavSaveOptions();
    try {
      WavTag wavTag = getExistingMetadata(paramc61);
      if (!wavTag.isBadChunkData()) {
        StringBuilder stringBuilder1;
        Logger logger;
        logger2 = null;
        FileLock fileLock = null;
        stringBuilder = null;
        StringBuilder stringBuilder2 = null;
        try {
          FileLock fileLock1;
          FileChannel fileChannel = paramc61.b("rw");
          stringBuilder = stringBuilder2;
          try {
            fileLock = m92.B(fileChannel, paramc61.toString());
            FileLock fileLock2 = fileLock;
            fileLock1 = fileLock;
            WavTag wavTag1 = (WavTag)paramTag;
            fileLock2 = fileLock;
            fileLock1 = fileLock;
          } catch (IOException iOException) {
            FileLock fileLock2 = fileLock1;
            FileChannel fileChannel1 = fileChannel;
          } finally {
            FileChannel fileChannel1;
            paramc61 = null;
          } 
          IOException iOException1 = iOException;
          IOException iOException2 = iOException;
          if (wavTag.isNonStandardPadding()) {
            iOException1 = iOException;
            iOException2 = iOException;
            Iterator<ChunkSummary> iterator = wavTag.getChunkSummaryList().iterator();
            while (true) {
              iOException1 = iOException;
              iOException2 = iOException;
              if (iterator.hasNext()) {
                iOException1 = iOException;
                iOException2 = iOException;
                ChunkSummary chunkSummary = iterator.next();
                iOException1 = iOException;
                iOException2 = iOException;
                if (chunkSummary instanceof org.jaudiotagger.audio.iff.PaddingChunkSummary) {
                  iOException1 = iOException;
                  iOException2 = iOException;
                  fileChannel.position(chunkSummary.getFileStartLocation());
                  iOException1 = iOException;
                  iOException2 = iOException;
                  ByteBuffer byteBuffer = ByteBuffer.allocate((int)chunkSummary.getChunkSize());
                  iOException1 = iOException;
                  iOException2 = iOException;
                  fileChannel.read(byteBuffer);
                  iOException1 = iOException;
                  iOException2 = iOException;
                  byteBuffer.flip();
                  boolean bool = true;
                  while (true) {
                    iOException1 = iOException;
                    iOException2 = iOException;
                    if (byteBuffer.position() < byteBuffer.limit()) {
                      iOException1 = iOException;
                      iOException2 = iOException;
                      if (byteBuffer.get() != 0)
                        bool = false; 
                      continue;
                    } 
                    if (bool) {
                      iOException1 = iOException;
                      iOException2 = iOException;
                      fileChannel.position(chunkSummary.getFileStartLocation());
                      iOException1 = iOException;
                      iOException2 = iOException;
                      deletePaddingChunk(fileChannel, (int)chunkSummary.getEndLocation(), (int)chunkSummary.getChunkSize() + 8);
                    } 
                    break;
                  } 
                  break;
                } 
                continue;
              } 
              break;
            } 
          } 
          iOException1 = iOException;
          iOException2 = iOException;
          rewriteRiffHeaderSize(fileChannel);
          if (fileChannel != null) {
            if (iOException != null)
              try {
                iOException.release();
              } catch (IOException iOException3) {
                iOException3.printStackTrace();
              }  
            try {
              fileChannel.close();
            } catch (IOException iOException3) {
              iOException3.printStackTrace();
            } 
          } 
          logger1 = logger;
          stringBuilder1 = new StringBuilder();
          return;
        } catch (IOException iOException2) {
        
        } finally {
          logger1 = null;
          logger2 = null;
          stringBuilder1 = stringBuilder;
        } 
        if (stringBuilder1 != null) {
          if (logger != null)
            try {
              logger.release();
            } catch (IOException iOException1) {
              iOException1.printStackTrace();
            }  
          try {
            stringBuilder1.close();
          } catch (IOException iOException1) {
            iOException1.printStackTrace();
          } 
        } 
        throw logger1;
      } 
      throw new CannotWriteException("Unable to make changes to this file because contains bad chunk data");
    } catch (IOException iOException) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(logger1);
      String str = iOException.getMessage();
      stringBuilder1.append(":");
      stringBuilder1.append(str);
      throw new CannotWriteException(stringBuilder1.toString());
    } 
  }
  
  public void writeBothTags(FileChannel paramFileChannel, ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2) {
    if (TagOptionSingleton.getInstance().getWavSaveOrder() == WavSaveOrder.INFO_THEN_ID3) {
      writeInfoDataToFile(paramFileChannel, paramByteBuffer1);
      writeId3DataToFile(paramFileChannel, paramByteBuffer2);
      return;
    } 
    writeId3DataToFile(paramFileChannel, paramByteBuffer2);
    writeInfoDataToFile(paramFileChannel, paramByteBuffer1);
  }
  
  public class BothTagsFileStructure {
    boolean isAtEnd = false;
    
    boolean isContiguous = false;
    
    boolean isInfoTagFirst = false;
    
    final WavTagWriter this$0;
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder("IsInfoTagFirst:");
      stringBuilder.append(this.isInfoTagFirst);
      stringBuilder.append(":isContiguous:");
      stringBuilder.append(this.isContiguous);
      stringBuilder.append(":isAtEnd:");
      stringBuilder.append(this.isAtEnd);
      return stringBuilder.toString();
    }
  }
  
  public class InfoFieldWriterOrderComparator implements Comparator<TagField> {
    final WavTagWriter this$0;
    
    public int compare(TagField param1TagField1, TagField param1TagField2) {
      int i;
      WavInfoIdentifier wavInfoIdentifier1 = WavInfoIdentifier.getByFieldKey(FieldKey.valueOf(param1TagField1.getId()));
      WavInfoIdentifier wavInfoIdentifier2 = WavInfoIdentifier.getByFieldKey(FieldKey.valueOf(param1TagField2.getId()));
      int j = Integer.MAX_VALUE;
      if (wavInfoIdentifier1 != null) {
        i = wavInfoIdentifier1.getPreferredWriteOrder();
      } else {
        i = Integer.MAX_VALUE;
      } 
      if (wavInfoIdentifier2 != null)
        j = wavInfoIdentifier2.getPreferredWriteOrder(); 
      return i - j;
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\wav\WavTagWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */