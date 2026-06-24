package org.jaudiotagger.audio.aiff;

import c61;
import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;
import ga1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import k91;
import org.jaudiotagger.audio.aiff.chunk.AiffChunkSummary;
import org.jaudiotagger.audio.aiff.chunk.AiffChunkType;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.CannotWriteException;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.iff.ChunkHeader;
import org.jaudiotagger.audio.iff.IffHeaderChunk;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.aiff.AiffTag;
import wf2;

public class AiffTagWriter {
  public static Logger logger;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.aiff");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  private void deleteRemainderOfFile(FileChannel paramFileChannel, AiffTag paramAiffTag, String paramString) {
    if (!Utils.isOddLength(AiffChunkSummary.getChunkBeforeStartingMetadataTag(paramAiffTag).getEndLocation())) {
      Logger logger1 = logger;
      stringBuilder = ga1.l(paramString, ":Truncating corrupted ID3 tags from:");
      stringBuilder.append(paramAiffTag.getStartLocationInFileOfId3Chunk() - 1L);
      logger1.config(stringBuilder.toString());
      paramFileChannel.truncate(paramAiffTag.getStartLocationInFileOfId3Chunk() - 1L);
      return;
    } 
    Logger logger = logger;
    StringBuilder stringBuilder = ga1.l((String)stringBuilder, ":Truncating corrupted ID3 tags from:");
    stringBuilder.append(paramAiffTag.getStartLocationInFileOfId3Chunk());
    logger.config(stringBuilder.toString());
    paramFileChannel.truncate(paramAiffTag.getStartLocationInFileOfId3Chunk());
  }
  
  private void deleteTagChunk(FileChannel paramFileChannel, AiffTag paramAiffTag, ChunkHeader paramChunkHeader, String paramString) {
    int k = (int)paramChunkHeader.getSize();
    int j = k + 8;
    long l1 = j;
    int i = j;
    if (Utils.isOddLength(l1)) {
      i = j;
      if (paramAiffTag.getStartLocationInFileOfId3Chunk() + l1 < paramFileChannel.size())
        i = k + 9; 
    } 
    long l2 = paramFileChannel.size();
    l1 = i;
    l2 -= l1;
    Logger logger2 = logger;
    StringBuilder stringBuilder = ga1.l(paramString, ":Size of id3 chunk to delete is:");
    stringBuilder.append(wf2.c(l1));
    stringBuilder.append(":Location:");
    stringBuilder.append(wf2.c(paramAiffTag.getStartLocationInFileOfId3Chunk()));
    logger2.config(stringBuilder.toString());
    paramFileChannel.position(paramAiffTag.getStartLocationInFileOfId3Chunk() + l1);
    logger2 = logger;
    stringBuilder = ga1.l(paramString, ":Moved location to:");
    stringBuilder.append(wf2.c(l2));
    logger2.severe(stringBuilder.toString());
    deleteTagChunkUsingSmallByteBufferSegments(paramAiffTag, paramFileChannel, l2, l1);
    Logger logger1 = logger;
    stringBuilder = ga1.l(paramString, ":Setting new length to:");
    stringBuilder.append(wf2.c(l2));
    logger1.config(stringBuilder.toString());
    paramFileChannel.truncate(l2);
  }
  
  private void deleteTagChunkUsingSmallByteBufferSegments(AiffTag paramAiffTag, FileChannel paramFileChannel, long paramLong1, long paramLong2) {
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect((int)TagOptionSingleton.getInstance().getWriteChunkSize());
    while (true) {
      if (paramFileChannel.read(byteBuffer) >= 0 || byteBuffer.position() != 0) {
        byteBuffer.flip();
        paramLong1 = paramFileChannel.position();
        paramFileChannel.position(paramLong1 - paramLong2 - byteBuffer.limit());
        paramFileChannel.write(byteBuffer);
        paramFileChannel.position(paramLong1);
        byteBuffer.compact();
        continue;
      } 
      return;
    } 
  }
  
  private AiffTag getExistingMetadata(c61 paramc61) {
    try {
      AiffTagReader aiffTagReader = new AiffTagReader();
      this(paramc61.toString());
      return aiffTagReader.read(paramc61);
    } catch (CannotReadException cannotReadException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramc61);
      stringBuilder.append(" Failed to read file");
      throw new CannotWriteException(stringBuilder.toString());
    } 
  }
  
  private boolean isAtEndOfFileAllowingForPaddingByte(AiffTag paramAiffTag, FileChannel paramFileChannel) {
    return (paramAiffTag.getID3Tag().getEndLocationInFile().longValue() >= paramFileChannel.size() || (Utils.isOddLength(paramAiffTag.getID3Tag().getEndLocationInFile().longValue()) && paramAiffTag.getID3Tag().getEndLocationInFile().longValue() + 1L == paramFileChannel.size()));
  }
  
  private void rewriteRiffHeaderSize(FileChannel paramFileChannel) {
    paramFileChannel.position(IffHeaderChunk.SIGNATURE_LENGTH);
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(IffHeaderChunk.SIZE_LENGTH);
    byteBuffer.order(ByteOrder.BIG_ENDIAN);
    byteBuffer.putInt((int)paramFileChannel.size() - 8);
    byteBuffer.flip();
    paramFileChannel.write(byteBuffer);
  }
  
  private ChunkHeader seekToStartOfMetadata(FileChannel paramFileChannel, AiffTag paramAiffTag, String paramString) {
    paramFileChannel.position(paramAiffTag.getStartLocationInFileOfId3Chunk());
    ChunkHeader chunkHeader = new ChunkHeader(ByteOrder.BIG_ENDIAN);
    chunkHeader.readHeader(paramFileChannel);
    paramFileChannel.position(paramFileChannel.position() - 8L);
    if (AiffChunkType.TAG.getCode().equals(chunkHeader.getID()))
      return chunkHeader; 
    StringBuilder stringBuilder = ga1.l(paramString, ":Unable to find ID3 chunk at expected location:");
    stringBuilder.append(paramAiffTag.getStartLocationInFileOfId3Chunk());
    throw new CannotWriteException(stringBuilder.toString());
  }
  
  private void writeDataToFile(FileChannel paramFileChannel, ByteBuffer paramByteBuffer) {
    ChunkHeader chunkHeader = new ChunkHeader(ByteOrder.BIG_ENDIAN);
    chunkHeader.setID(AiffChunkType.TAG.getCode());
    chunkHeader.setSize(paramByteBuffer.limit());
    paramFileChannel.write(chunkHeader.writeHeader());
    paramFileChannel.write(paramByteBuffer);
    writeExtraByteIfChunkOddSize(paramFileChannel, paramByteBuffer.limit());
  }
  
  private void writeExtraByteIfChunkOddSize(FileChannel paramFileChannel, long paramLong) {
    if (Utils.isOddLength(paramLong))
      paramFileChannel.write(ByteBuffer.allocateDirect(1)); 
  }
  
  public ByteBuffer convert(AiffTag paramAiffTag1, AiffTag paramAiffTag2) {
    try {
      ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
      this();
      long l2 = paramAiffTag2.getSizeOfID3TagOnly();
      long l1 = l2;
      if (l2 > 0L) {
        l1 = l2;
        if (Utils.isOddLength(l2))
          l1 = l2 + 1L; 
      } 
      paramAiffTag1.getID3Tag().write(byteArrayOutputStream2, (int)l1);
      ByteArrayOutputStream byteArrayOutputStream1 = byteArrayOutputStream2;
      if (Utils.isOddLength((byteArrayOutputStream2.toByteArray()).length)) {
        int i = (byteArrayOutputStream2.toByteArray()).length;
        byteArrayOutputStream1 = new ByteArrayOutputStream();
        this();
        paramAiffTag1.getID3Tag().write(byteArrayOutputStream1, i + 1);
      } 
      ByteBuffer byteBuffer = ByteBuffer.wrap(byteArrayOutputStream1.toByteArray());
      byteBuffer.rewind();
      return byteBuffer;
    } catch (IOException iOException) {
      k91.n(iOException);
      return null;
    } 
  }
  
  public void delete(Tag paramTag, c61 paramc61) {
    try {
      FileChannel fileChannel = paramc61.b("wr");
      try {
        Logger logger1 = logger;
        StringBuilder stringBuilder1 = new StringBuilder();
        this();
        stringBuilder1.append(paramc61);
        stringBuilder1.append(":Deleting tag from file");
        logger1.severe(stringBuilder1.toString());
        AiffTag aiffTag = getExistingMetadata(paramc61);
        if (aiffTag.isExistingId3Tag() && aiffTag.getID3Tag().getStartLocationInFile() != null) {
          ChunkHeader chunkHeader = seekToStartOfMetadata(fileChannel, aiffTag, paramc61.toString());
          if (isAtEndOfFileAllowingForPaddingByte(aiffTag, fileChannel)) {
            logger1 = logger;
            StringBuilder stringBuilder2 = new StringBuilder();
            this();
            stringBuilder2.append(paramc61);
            stringBuilder2.append(":Setting new length to:");
            stringBuilder2.append(aiffTag.getStartLocationInFileOfId3Chunk());
            logger1.config(stringBuilder2.toString());
            fileChannel.truncate(aiffTag.getStartLocationInFileOfId3Chunk());
          } else {
            logger1 = logger;
            StringBuilder stringBuilder2 = new StringBuilder();
            this();
            stringBuilder2.append(paramc61);
            stringBuilder2.append(":Deleting tag chunk");
            logger1.config(stringBuilder2.toString());
            deleteTagChunk(fileChannel, aiffTag, chunkHeader, paramc61.toString());
          } 
          rewriteRiffHeaderSize(fileChannel);
        } 
      } finally {
        Exception exception;
      } 
      Logger logger = logger;
      StringBuilder stringBuilder = new StringBuilder();
      this();
      stringBuilder.append(paramc61);
      stringBuilder.append(":Deleted tag from file");
      logger.config(stringBuilder.toString());
      if (fileChannel != null) {
        fileChannel.close();
        return;
      } 
    } catch (IOException iOException) {}
  }
  
  public void write(Tag paramTag, c61 paramc61) {
    String str;
    Logger logger = logger;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramc61);
    stringBuilder.append(":Writing Aiff tag to file");
    logger.severe(stringBuilder.toString());
    try {
      AiffTag aiffTag = getExistingMetadata(paramc61);
      try {
        FileChannel fileChannel = paramc61.b("wr");
        try {
          long l2 = aiffTag.getFormSize() + 8L;
          long l1 = fileChannel.position();
          if (l2 < fileChannel.size() && !aiffTag.isLastChunkSizeExtendsPastFormSize()) {
            Logger logger1 = logger;
            StringBuilder stringBuilder1 = new StringBuilder();
            this();
            stringBuilder1.append(paramc61);
            stringBuilder1.append(":Extra Non Chunk Data after end of FORM data length:");
            stringBuilder1.append(fileChannel.size() - l2);
            logger1.warning(stringBuilder1.toString());
            fileChannel.position(l2);
            fileChannel.truncate(l2);
            fileChannel.position(l1);
          } 
        } finally {}
        ByteBuffer byteBuffer = convert((AiffTag)paramTag, aiffTag);
        if (aiffTag.isExistingId3Tag() && aiffTag.getID3Tag().getStartLocationInFile() != null) {
          if (!aiffTag.isIncorrectlyAlignedTag()) {
            ChunkHeader chunkHeader = seekToStartOfMetadata(fileChannel, aiffTag, paramc61.toString());
            Logger logger1 = logger;
            StringBuilder stringBuilder1 = new StringBuilder();
            this();
            stringBuilder1.append(paramc61);
            stringBuilder1.append(":Current Space allocated:");
            stringBuilder1.append(aiffTag.getSizeOfID3TagOnly());
            stringBuilder1.append(":NewTagRequires:");
            stringBuilder1.append(byteBuffer.limit());
            logger1.config(stringBuilder1.toString());
            if (isAtEndOfFileAllowingForPaddingByte(aiffTag, fileChannel)) {
              writeDataToFile(fileChannel, byteBuffer);
            } else {
              deleteTagChunk(fileChannel, aiffTag, chunkHeader, paramc61.toString());
              fileChannel.position(fileChannel.size());
              writeExtraByteIfChunkOddSize(fileChannel, fileChannel.size());
              writeDataToFile(fileChannel, byteBuffer);
            } 
          } else if (AiffChunkSummary.isOnlyMetadataTagsAfterStartingMetadataTag(aiffTag)) {
            deleteRemainderOfFile(fileChannel, aiffTag, paramc61.toString());
            fileChannel.position(fileChannel.size());
            writeExtraByteIfChunkOddSize(fileChannel, fileChannel.size());
            writeDataToFile(fileChannel, byteBuffer);
          } else {
            CannotWriteException cannotWriteException = new CannotWriteException();
            StringBuilder stringBuilder1 = new StringBuilder();
            this();
            stringBuilder1.append(paramc61);
            stringBuilder1.append(KjdXPYm.ewxGzgiOt);
            this(stringBuilder1.toString());
            throw cannotWriteException;
          } 
        } else {
          fileChannel.position(fileChannel.size());
          if (Utils.isOddLength(fileChannel.size()))
            fileChannel.write(ByteBuffer.allocateDirect(1)); 
          writeDataToFile(fileChannel, byteBuffer);
        } 
        rewriteRiffHeaderSize(fileChannel);
        fileChannel.close();
        return;
      } catch (IOException iOException) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(paramc61);
        str = iOException.getMessage();
        stringBuilder1.append(":");
        stringBuilder1.append(str);
        throw new CannotWriteException(stringBuilder1.toString());
      } 
    } catch (IOException iOException) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append(str);
      str = iOException.getMessage();
      stringBuilder1.append(":");
      stringBuilder1.append(str);
      throw new CannotWriteException(stringBuilder1.toString());
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\aiff\AiffTagWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */