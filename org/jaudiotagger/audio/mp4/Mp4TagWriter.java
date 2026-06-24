package org.jaudiotagger.audio.mp4;

import c61;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.text.MessageFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Logger;
import l0;
import org.jaudiotagger.audio.exceptions.CannotWriteException;
import org.jaudiotagger.audio.mp4.atom.Mp4BoxHeader;
import org.jaudiotagger.audio.mp4.atom.Mp4FreeBox;
import org.jaudiotagger.audio.mp4.atom.Mp4HdlrBox;
import org.jaudiotagger.audio.mp4.atom.Mp4MetaBox;
import org.jaudiotagger.audio.mp4.atom.Mp4StcoBox;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagOptionSingleton;
import org.jaudiotagger.tag.mp4.Mp4Tag;
import org.jaudiotagger.tag.mp4.Mp4TagCreator;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;
import rw;
import ui0;

public class Mp4TagWriter {
  public static Logger logger = Logger.getLogger("org.jaudiotagger.tag.mp4");
  
  private String loggingName;
  
  private Mp4TagCreator tc = new Mp4TagCreator();
  
  public Mp4TagWriter(String paramString) {
    this.loggingName = paramString;
  }
  
  private void adjustSizeOfMoovHeader(Mp4BoxHeader paramMp4BoxHeader1, ByteBuffer paramByteBuffer, int paramInt, Mp4BoxHeader paramMp4BoxHeader2, Mp4BoxHeader paramMp4BoxHeader3) {
    paramMp4BoxHeader1.setLength(paramMp4BoxHeader1.getLength() + paramInt);
    if (paramMp4BoxHeader2 != null) {
      paramMp4BoxHeader2.setLength(paramMp4BoxHeader2.getLength() + paramInt);
      paramByteBuffer.position((int)(paramMp4BoxHeader2.getFilePos() - paramMp4BoxHeader1.getFilePos() - 8L));
      paramByteBuffer.put(paramMp4BoxHeader2.getHeaderData());
    } 
    if (paramMp4BoxHeader3 != null) {
      paramMp4BoxHeader3.setLength(paramMp4BoxHeader3.getLength() + paramInt);
      paramByteBuffer.position((int)(paramMp4BoxHeader3.getFilePos() - paramMp4BoxHeader1.getFilePos() - 8L));
      paramByteBuffer.put(paramMp4BoxHeader3.getHeaderData());
    } 
  }
  
  private boolean adjustStcosIfNoSuitableTopLevelAtom(int paramInt1, boolean paramBoolean, int paramInt2, List<Mp4StcoBox> paramList, Mp4BoxHeader paramMp4BoxHeader1, Mp4BoxHeader paramMp4BoxHeader2) {
    if (paramMp4BoxHeader2.getFilePos() > paramMp4BoxHeader1.getFilePos() && (!paramBoolean || (paramInt1 - 8 < paramInt2 && paramInt1 != paramInt2))) {
      Iterator<Mp4StcoBox> iterator = paramList.iterator();
      while (iterator.hasNext())
        ((Mp4StcoBox)iterator.next()).adjustOffsets(paramInt2); 
      return true;
    } 
    return false;
  }
  
  private void adjustTopLevelFreeAtom(FileChannel paramFileChannel, int paramInt1, int paramInt2) {
    int i = paramInt1 - 8;
    if (i >= paramInt2) {
      logger.config("Writing:Option 6;Larger Size can use top free atom");
      Mp4FreeBox mp4FreeBox = new Mp4FreeBox(i - paramInt2);
      paramFileChannel.write(mp4FreeBox.getHeader().getHeaderData());
      paramFileChannel.write(mp4FreeBox.getData());
      return;
    } 
    if (paramInt1 == paramInt2)
      logger.config("Writing:Option 7;Larger Size uses top free atom including header"); 
  }
  
  private void checkFileWrittenCorrectly(Mp4BoxHeader paramMp4BoxHeader, FileChannel paramFileChannel, List<Mp4StcoBox> paramList) {
    logger.config("Checking file has been written correctly");
    try {
      Mp4AtomTree mp4AtomTree = new Mp4AtomTree();
      byte b = 0;
      this(paramFileChannel, false);
      Mp4BoxHeader mp4BoxHeader = mp4AtomTree.getBoxHeader(mp4AtomTree.getMdatNode());
      if (mp4BoxHeader != null) {
        if (mp4BoxHeader.getLength() == paramMp4BoxHeader.getLength()) {
          Mp4BoxHeader mp4BoxHeader1 = mp4AtomTree.getBoxHeader(mp4AtomTree.getUdtaNode());
          if (mp4BoxHeader1 != null) {
            if (mp4AtomTree.getBoxHeader(mp4AtomTree.getMetaNode()) != null) {
              List<Mp4StcoBox> list = mp4AtomTree.getStcos();
              if (list.size() == paramList.size()) {
                int i = 0;
                while (b < list.size()) {
                  Mp4StcoBox mp4StcoBox1 = list.get(b);
                  Mp4StcoBox mp4StcoBox2 = paramList.get(b);
                  Logger logger2 = logger;
                  StringBuilder stringBuilder3 = new StringBuilder();
                  this();
                  stringBuilder3.append("stco:Original First Offset");
                  stringBuilder3.append(mp4StcoBox2.getFirstOffSet());
                  logger2.finer(stringBuilder3.toString());
                  Logger logger3 = logger;
                  StringBuilder stringBuilder1 = new StringBuilder();
                  this();
                  stringBuilder1.append("stco:Original Diff");
                  stringBuilder1.append((int)(mp4StcoBox2.getFirstOffSet() - paramMp4BoxHeader.getFilePos()));
                  logger3.finer(stringBuilder1.toString());
                  logger3 = logger;
                  stringBuilder1 = new StringBuilder();
                  this();
                  stringBuilder1.append("stco:Original Mdat Pos");
                  stringBuilder1.append(paramMp4BoxHeader.getFilePos());
                  logger3.finer(stringBuilder1.toString());
                  Logger logger1 = logger;
                  StringBuilder stringBuilder2 = new StringBuilder();
                  this();
                  stringBuilder2.append("stco:New First Offset");
                  stringBuilder2.append(mp4StcoBox1.getFirstOffSet());
                  logger1.finer(stringBuilder2.toString());
                  logger1 = logger;
                  stringBuilder2 = new StringBuilder();
                  this();
                  stringBuilder2.append("stco:New Diff");
                  stringBuilder2.append((int)(mp4StcoBox1.getFirstOffSet() - mp4BoxHeader.getFilePos()));
                  logger1.finer(stringBuilder2.toString());
                  logger1 = logger;
                  stringBuilder2 = new StringBuilder();
                  this();
                  stringBuilder2.append("stco:New Mdat Pos");
                  stringBuilder2.append(mp4BoxHeader.getFilePos());
                  logger1.finer(stringBuilder2.toString());
                  if (b == 0) {
                    mp4StcoBox2.getFirstOffSet();
                    paramMp4BoxHeader.getFilePos();
                    i = mp4StcoBox2.getFirstOffSet() - mp4StcoBox1.getFirstOffSet();
                  } else if (i != mp4StcoBox2.getFirstOffSet() - mp4StcoBox1.getFirstOffSet()) {
                    CannotWriteException cannotWriteException5 = new CannotWriteException();
                    this(MessageFormat.format("Unable to make changes to Mp4 file, incorrect offsets written difference was {0}", new Object[] { Integer.valueOf(i) }));
                    throw cannotWriteException5;
                  } 
                  b++;
                } 
                paramFileChannel.close();
                logger.config("File has been written correctly");
                return;
              } 
              CannotWriteException cannotWriteException4 = new CannotWriteException();
              this(MessageFormat.format("Unable to make changes to Mp4 file, incorrect number of tracks: {0} vs {1}", new Object[] { Integer.valueOf(paramList.size()), Integer.valueOf(list.size()) }));
              throw cannotWriteException4;
            } 
            CannotWriteException cannotWriteException3 = new CannotWriteException();
            this("Unable to make changes to Mp4 file, no tag data has been written");
            throw cannotWriteException3;
          } 
          CannotWriteException cannotWriteException2 = new CannotWriteException();
          this("Unable to make changes to Mp4 file, no tag data has been written");
          throw cannotWriteException2;
        } 
        CannotWriteException cannotWriteException1 = new CannotWriteException();
        this("Unable to make changes to Mp4 file, invalid data length has been written");
        throw cannotWriteException1;
      } 
    } catch (Exception exception) {
    
    } finally {}
    CannotWriteException cannotWriteException = new CannotWriteException();
    this("Unable to make changes to Mp4 file, no data was written");
    throw cannotWriteException;
  }
  
  private void convertandWriteTagsAtomToFreeAtom(FileChannel paramFileChannel, Mp4BoxHeader paramMp4BoxHeader) {
    Mp4FreeBox mp4FreeBox = new Mp4FreeBox(paramMp4BoxHeader.getDataLength());
    paramFileChannel.write(mp4FreeBox.getHeader().getHeaderData());
    paramFileChannel.write(mp4FreeBox.getData());
  }
  
  private int getMetaLevelFreeAtomSize(Mp4AtomTree paramMp4AtomTree) {
    Iterator<rw> iterator = paramMp4AtomTree.getFreeNodes().iterator();
    while (true) {
      boolean bool1 = iterator.hasNext();
      boolean bool = false;
      if (bool1) {
        rw rw1;
        rw rw2 = iterator.next();
        rw rw3 = rw2.b;
        paramMp4AtomTree = null;
        if (rw3 != null) {
          int i;
          if (!rw3.c(rw2)) {
            i = -1;
          } else {
            i = rw3.c.indexOf(rw2);
          } 
          if (i != -1) {
            if (i > 0) {
              Vector<rw> vector = rw3.c;
              if (vector != null) {
                rw1 = vector.elementAt(i - 1);
              } else {
                throw new ArrayIndexOutOfBoundsException("node has no children");
              } 
            } 
          } else {
            l0.l("argument is not a child");
            break;
          } 
        } 
        if (rw1 != null) {
          boolean bool2 = true;
          if (rw1 != rw2) {
            rw rw = rw2.b;
            bool2 = bool;
            if (rw != null) {
              bool2 = bool;
              if (rw == rw1.b)
                bool2 = true; 
            } 
            if (bool2 && !rw.c(rw1))
              throw new Error("sibling has different parent"); 
          } 
          if (!bool2)
            throw new Error("child of parent is not a sibling"); 
        } 
        if (rw3.b == null)
          continue; 
        Mp4BoxHeader mp4BoxHeader2 = (Mp4BoxHeader)rw3.e;
        Mp4BoxHeader mp4BoxHeader1 = (Mp4BoxHeader)rw2.e;
        if (rw1 != null) {
          Mp4BoxHeader mp4BoxHeader = (Mp4BoxHeader)rw1.e;
          if (mp4BoxHeader2.getId().equals(Mp4AtomIdentifier.META.getFieldName()) && mp4BoxHeader.getId().equals(Mp4AtomIdentifier.ILST.getFieldName()))
            return mp4BoxHeader1.getLength(); 
        } 
        continue;
      } 
      break;
    } 
    return 0;
  }
  
  private void shiftData(FileChannel paramFileChannel, long paramLong, int paramInt) {
    paramFileChannel.position(paramLong);
    ByteBuffer byteBuffer = ByteBuffer.allocate((int)TagOptionSingleton.getInstance().getWriteChunkSize());
    while (true) {
      if (paramFileChannel.read(byteBuffer) >= 0 || byteBuffer.position() != 0) {
        byteBuffer.flip();
        paramLong = paramFileChannel.position();
        paramFileChannel.position(paramLong - paramInt - byteBuffer.limit());
        paramFileChannel.write(byteBuffer);
        paramFileChannel.position(paramLong);
        byteBuffer.compact();
        continue;
      } 
      paramLong = paramFileChannel.size() - paramInt;
      Logger logger = logger;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.loggingName);
      stringBuilder.append("-------------Setting new length to:");
      stringBuilder.append(paramLong);
      logger.config(stringBuilder.toString());
      paramFileChannel.truncate(paramLong);
      return;
    } 
  }
  
  private void writeFromEndOfIlstToNeroTagsAndMakeNeroFree(Mp4BoxHeader paramMp4BoxHeader1, ByteBuffer paramByteBuffer, FileChannel paramFileChannel, Mp4BoxHeader paramMp4BoxHeader2) {
    paramByteBuffer.limit((int)(paramMp4BoxHeader2.getFilePos() - paramMp4BoxHeader1.getFilePos() + 8L));
    paramFileChannel.write(paramByteBuffer);
    convertandWriteTagsAtomToFreeAtom(paramFileChannel, paramMp4BoxHeader2);
  }
  
  private void writeHaveExistingMetadata(Mp4BoxHeader paramMp4BoxHeader1, Mp4BoxHeader paramMp4BoxHeader2, FileChannel paramFileChannel, int paramInt1, Mp4BoxHeader paramMp4BoxHeader3, ByteBuffer paramByteBuffer1, Mp4BoxHeader paramMp4BoxHeader4, List<Mp4StcoBox> paramList, int paramInt2, boolean paramBoolean, ByteBuffer paramByteBuffer2, Mp4BoxHeader paramMp4BoxHeader5, int paramInt3) {
    long l = paramMp4BoxHeader3.getFileEndPos();
    int i = paramByteBuffer2.limit() - paramInt3;
    paramBoolean = adjustStcosIfNoSuitableTopLevelAtom(paramInt2, paramBoolean, i, paramList, paramMp4BoxHeader3, paramMp4BoxHeader4);
    adjustSizeOfMoovHeader(paramMp4BoxHeader3, paramByteBuffer1, i, paramMp4BoxHeader1, paramMp4BoxHeader2);
    paramFileChannel.position(paramMp4BoxHeader3.getFilePos());
    paramFileChannel.write(paramMp4BoxHeader3.getHeaderData());
    paramByteBuffer1.rewind();
    paramByteBuffer1.limit(paramInt1);
    paramFileChannel.write(paramByteBuffer1);
    if (!paramBoolean) {
      logger.severe("Writing:Option 7.1, Increased Data");
      paramFileChannel.write(paramByteBuffer2);
      writeRestOfMoovHeaderAfterNewIlistAndAmendedTopLevelFreeAtom(paramFileChannel, paramInt1, paramMp4BoxHeader3, paramByteBuffer1, i, paramInt2, paramMp4BoxHeader5, paramInt3);
      return;
    } 
    logger.severe("Writing:Option 7.2 Increased Data, not enough free space");
    paramFileChannel.position(l);
    ui0.i0(paramFileChannel, i);
    paramFileChannel.position(paramMp4BoxHeader3.getFilePos() + 8L + paramInt1);
    paramFileChannel.write(paramByteBuffer2);
    paramByteBuffer1.limit(paramByteBuffer1.capacity());
    paramByteBuffer1.position(paramInt1 + paramInt3);
    if (paramByteBuffer1.position() < paramByteBuffer1.capacity())
      paramFileChannel.write(paramByteBuffer1); 
  }
  
  private void writeMetadataSameSize(FileChannel paramFileChannel, Mp4BoxHeader paramMp4BoxHeader, ByteBuffer paramByteBuffer) {
    logger.config("Writing:Option 1:Same Size");
    paramFileChannel.position(paramMp4BoxHeader.getFilePos());
    paramFileChannel.write(paramByteBuffer);
  }
  
  private void writeNewMetadataLargerButCanUseFreeAtom(FileChannel paramFileChannel, Mp4BoxHeader paramMp4BoxHeader, int paramInt1, ByteBuffer paramByteBuffer, int paramInt2) {
    paramInt1 -= paramInt2;
    Logger logger = logger;
    StringBuilder stringBuilder = new StringBuilder("Writing:Option 5;Larger Size can use meta free atom need extra:");
    stringBuilder.append(paramInt1);
    stringBuilder.append("bytes");
    logger.config(stringBuilder.toString());
    paramFileChannel.position(paramMp4BoxHeader.getFilePos());
    paramFileChannel.write(paramByteBuffer);
    Mp4FreeBox mp4FreeBox = new Mp4FreeBox(paramInt1 - 8);
    paramFileChannel.write(mp4FreeBox.getHeader().getHeaderData());
    paramFileChannel.write(mp4FreeBox.getData());
  }
  
  private void writeNoExistingMetaAtom(Mp4BoxHeader paramMp4BoxHeader1, FileChannel paramFileChannel, ByteBuffer paramByteBuffer1, Mp4BoxHeader paramMp4BoxHeader2, ByteBuffer paramByteBuffer2, Mp4BoxHeader paramMp4BoxHeader3, List<Mp4StcoBox> paramList, int paramInt1, boolean paramBoolean, Mp4BoxHeader paramMp4BoxHeader4, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    int m = paramByteBuffer1.limit();
    int i = paramMp4BoxHeader2.getDataLength();
    long l = paramMp4BoxHeader2.getFileEndPos();
    int j = paramMp4BoxHeader1.getLength();
    int k = paramMp4BoxHeader1.getDataLength();
    Mp4HdlrBox mp4HdlrBox = Mp4HdlrBox.createiTunesStyleHdlrBox();
    Mp4MetaBox mp4MetaBox = Mp4MetaBox.createiTunesStyleMetaBox(mp4HdlrBox.getHeader().getLength() + m);
    paramMp4BoxHeader1 = new Mp4BoxHeader(Mp4AtomIdentifier.UDTA.getFieldName());
    paramMp4BoxHeader1.setLength(mp4MetaBox.getHeader().getLength() + 8 + k);
    k = paramMp4BoxHeader1.getDataLength() - k;
    paramBoolean = adjustStcosIfNoSuitableTopLevelAtom(paramInt1, paramBoolean, k, paramList, paramMp4BoxHeader2, paramMp4BoxHeader3);
    paramMp4BoxHeader2.setLength(paramMp4BoxHeader2.getLength() + k);
    paramFileChannel.position(paramMp4BoxHeader2.getFilePos());
    paramFileChannel.write(paramMp4BoxHeader2.getHeaderData());
    paramByteBuffer2.rewind();
    paramByteBuffer2.limit(i - j);
    paramFileChannel.write(paramByteBuffer2);
    paramFileChannel.write(paramMp4BoxHeader1.getHeaderData());
    if (paramByteBuffer2.position() + 8 < paramByteBuffer2.capacity()) {
      paramByteBuffer2.limit(paramByteBuffer2.capacity());
      paramByteBuffer2.position(paramByteBuffer2.position() + 8);
      paramFileChannel.write(paramByteBuffer2);
    } 
    if (!paramBoolean) {
      logger.severe("Writing:Option 6.1;No meta atom");
      paramFileChannel.write(mp4MetaBox.getHeader().getHeaderData());
      paramFileChannel.write(mp4MetaBox.getData());
      paramFileChannel.write(mp4HdlrBox.getHeader().getHeaderData());
      paramFileChannel.write(mp4HdlrBox.getData());
      paramFileChannel.write(paramByteBuffer1);
      writeRestOfMoovHeaderAfterNewIlistAndAmendedTopLevelFreeAtom(paramFileChannel, paramInt2, paramMp4BoxHeader2, paramByteBuffer2, paramInt5, paramInt4, paramMp4BoxHeader4, paramInt3);
      return;
    } 
    logger.severe("Writing:Option 6.2;No meta atom, not enough free space");
    paramFileChannel.position(l);
    ui0.i0(paramFileChannel, mp4MetaBox.getHeader().getLength());
    paramFileChannel.position(l);
    paramFileChannel.write(mp4MetaBox.getHeader().getHeaderData());
    paramFileChannel.write(mp4MetaBox.getData());
    paramFileChannel.write(mp4HdlrBox.getHeader().getHeaderData());
    paramFileChannel.write(mp4HdlrBox.getData());
    paramFileChannel.write(paramByteBuffer1);
  }
  
  private void writeNoExistingUdtaAtom(FileChannel paramFileChannel, ByteBuffer paramByteBuffer1, Mp4BoxHeader paramMp4BoxHeader1, ByteBuffer paramByteBuffer2, Mp4BoxHeader paramMp4BoxHeader2, List<Mp4StcoBox> paramList, int paramInt, boolean paramBoolean, Mp4BoxHeader paramMp4BoxHeader3) {
    long l = paramMp4BoxHeader1.getFileEndPos();
    Mp4HdlrBox mp4HdlrBox = Mp4HdlrBox.createiTunesStyleHdlrBox();
    int i = mp4HdlrBox.getHeader().getLength();
    Mp4MetaBox mp4MetaBox = Mp4MetaBox.createiTunesStyleMetaBox(paramByteBuffer1.limit() + i);
    paramMp4BoxHeader3 = new Mp4BoxHeader(Mp4AtomIdentifier.UDTA.getFieldName());
    paramMp4BoxHeader3.setLength(mp4MetaBox.getHeader().getLength() + 8);
    paramBoolean = adjustStcosIfNoSuitableTopLevelAtom(paramInt, paramBoolean, paramMp4BoxHeader3.getLength(), paramList, paramMp4BoxHeader1, paramMp4BoxHeader2);
    i = paramMp4BoxHeader1.getLength();
    paramMp4BoxHeader1.setLength(paramMp4BoxHeader3.getLength() + i);
    paramFileChannel.position(paramMp4BoxHeader1.getFilePos());
    paramFileChannel.write(paramMp4BoxHeader1.getHeaderData());
    paramByteBuffer2.rewind();
    paramFileChannel.write(paramByteBuffer2);
    if (!paramBoolean) {
      logger.severe("Writing:Option 5.1;No udta atom");
      paramFileChannel.write(paramMp4BoxHeader3.getHeaderData());
      paramFileChannel.write(mp4MetaBox.getHeader().getHeaderData());
      paramFileChannel.write(mp4MetaBox.getData());
      paramFileChannel.write(mp4HdlrBox.getHeader().getHeaderData());
      paramFileChannel.write(mp4HdlrBox.getData());
      paramFileChannel.write(paramByteBuffer1);
      adjustTopLevelFreeAtom(paramFileChannel, paramInt, paramMp4BoxHeader3.getLength());
      return;
    } 
    logger.severe("Writing:Option 5.2;No udta atom, not enough free space");
    paramFileChannel.position(l);
    ui0.i0(paramFileChannel, paramMp4BoxHeader3.getLength());
    paramFileChannel.position(l);
    paramFileChannel.write(paramMp4BoxHeader3.getHeaderData());
    paramFileChannel.write(mp4MetaBox.getHeader().getHeaderData());
    paramFileChannel.write(mp4MetaBox.getData());
    paramFileChannel.write(mp4HdlrBox.getHeader().getHeaderData());
    paramFileChannel.write(mp4HdlrBox.getData());
    paramFileChannel.write(paramByteBuffer1);
  }
  
  private void writeOldMetadataLargerThanNewMetadata(FileChannel paramFileChannel, Mp4BoxHeader paramMp4BoxHeader1, Mp4BoxHeader paramMp4BoxHeader2, Mp4BoxHeader paramMp4BoxHeader3, Mp4BoxHeader paramMp4BoxHeader4, Mp4BoxHeader paramMp4BoxHeader5, Mp4BoxHeader paramMp4BoxHeader6, ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2, List<Mp4StcoBox> paramList, int paramInt) {
    Mp4FreeBox mp4FreeBox;
    Logger logger;
    logger.config("Writing:Option 1:Smaller Size");
    int i = (int)(paramMp4BoxHeader4.getFilePos() - paramMp4BoxHeader1.getFilePos() + 8L);
    int j = paramByteBuffer2.limit();
    if (paramInt > 0) {
      logger = logger;
      StringBuilder stringBuilder = new StringBuilder("Writing:Option 2:Smaller Size have free atom:");
      stringBuilder.append(paramMp4BoxHeader4.getLength());
      stringBuilder.append(":");
      stringBuilder.append(j);
      logger.config(stringBuilder.toString());
      paramFileChannel.position(paramMp4BoxHeader4.getFilePos());
      paramFileChannel.write(paramByteBuffer2);
      mp4FreeBox = new Mp4FreeBox(paramMp4BoxHeader4.getLength() - j + paramInt - 8);
      paramFileChannel.write(mp4FreeBox.getHeader().getHeaderData());
      paramFileChannel.write(mp4FreeBox.getData());
      return;
    } 
    paramInt = paramMp4BoxHeader4.getLength() - j - 8;
    if (paramInt > 0) {
      logger.config(fXMDNeMWaILNVh.rAczuzIbXYhcY);
      paramFileChannel.position(paramMp4BoxHeader4.getFilePos());
      paramFileChannel.write(paramByteBuffer2);
      mp4FreeBox = new Mp4FreeBox(paramInt);
      paramFileChannel.write(mp4FreeBox.getHeader().getHeaderData());
      paramFileChannel.write(mp4FreeBox.getData());
      return;
    } 
    logger.config("Writing:Option 4:Smaller Size <=8 cannot create free atoms");
    long l = mp4FreeBox.getFileEndPos();
    paramInt = paramMp4BoxHeader4.getLength() - j;
    if (paramMp4BoxHeader5.getFilePos() > mp4FreeBox.getFilePos()) {
      Iterator<Mp4StcoBox> iterator = paramList.iterator();
      while (iterator.hasNext())
        ((Mp4StcoBox)iterator.next()).adjustOffsets(-paramInt); 
    } 
    adjustSizeOfMoovHeader((Mp4BoxHeader)mp4FreeBox, paramByteBuffer1, -paramInt, (Mp4BoxHeader)logger, paramMp4BoxHeader3);
    paramFileChannel.position(mp4FreeBox.getFilePos());
    paramFileChannel.write(mp4FreeBox.getHeaderData());
    paramByteBuffer1.rewind();
    paramByteBuffer1.limit(i);
    paramFileChannel.write(paramByteBuffer1);
    paramFileChannel.write(paramByteBuffer2);
    paramByteBuffer1.limit(paramByteBuffer1.capacity());
    paramByteBuffer1.position(paramMp4BoxHeader4.getLength() + i);
    paramFileChannel.write(paramByteBuffer1);
    shiftData(paramFileChannel, l, Math.abs(paramInt));
  }
  
  private void writeRestOfMoovHeaderAfterNewIlistAndAmendedTopLevelFreeAtom(FileChannel paramFileChannel, int paramInt1, Mp4BoxHeader paramMp4BoxHeader1, ByteBuffer paramByteBuffer, int paramInt2, int paramInt3, Mp4BoxHeader paramMp4BoxHeader2, int paramInt4) {
    if (paramMp4BoxHeader2 != null) {
      paramByteBuffer.limit(paramByteBuffer.capacity());
      paramByteBuffer.position(paramInt1 + paramInt4);
      writeFromEndOfIlstToNeroTagsAndMakeNeroFree(paramMp4BoxHeader1, paramByteBuffer, paramFileChannel, paramMp4BoxHeader2);
      adjustTopLevelFreeAtom(paramFileChannel, paramInt3, paramInt2);
      return;
    } 
    paramByteBuffer.limit(paramByteBuffer.capacity());
    paramByteBuffer.position(paramInt1 + paramInt4);
    if (paramByteBuffer.position() < paramByteBuffer.capacity())
      paramFileChannel.write(paramByteBuffer); 
    adjustTopLevelFreeAtom(paramFileChannel, paramInt3, paramInt2);
  }
  
  public void delete(Tag paramTag, c61 paramc61) {
    write((Tag)new Mp4Tag(), paramc61);
  }
  
  public void write(Tag paramTag, c61 paramc61) {
    // Byte code:
    //   0: getstatic org/jaudiotagger/audio/mp4/Mp4TagWriter.logger : Ljava/util/logging/Logger;
    //   3: ldc_w 'Started writing tag data'
    //   6: invokevirtual config : (Ljava/lang/String;)V
    //   9: aconst_null
    //   10: astore #18
    //   12: aload_2
    //   13: getstatic com/sdsmdg/harjot/crollerTest/TG/ckOPp.mpKmVSnmzUF : Ljava/lang/String;
    //   16: invokevirtual b : (Ljava/lang/String;)Ljava/nio/channels/FileChannel;
    //   19: astore #16
    //   21: aload #16
    //   23: astore #18
    //   25: aload #18
    //   27: aload_2
    //   28: invokevirtual toString : ()Ljava/lang/String;
    //   31: invokestatic B : (Ljava/nio/channels/FileChannel;Ljava/lang/String;)Ljava/nio/channels/FileLock;
    //   34: astore #17
    //   36: new org/jaudiotagger/audio/mp4/Mp4AtomTree
    //   39: astore #19
    //   41: aload #19
    //   43: aload #18
    //   45: iconst_0
    //   46: invokespecial <init> : (Ljava/nio/channels/FileChannel;Z)V
    //   49: aload #19
    //   51: aload #19
    //   53: invokevirtual getMdatNode : ()Lrw;
    //   56: invokevirtual getBoxHeader : (Lrw;)Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;
    //   59: astore #20
    //   61: aload #20
    //   63: ifnull -> 924
    //   66: aload_0
    //   67: getfield tc : Lorg/jaudiotagger/tag/mp4/Mp4TagCreator;
    //   70: aload_1
    //   71: invokevirtual convertMetadata : (Lorg/jaudiotagger/tag/Tag;)Ljava/nio/ByteBuffer;
    //   74: astore #23
    //   76: aload #23
    //   78: invokevirtual rewind : ()Ljava/nio/Buffer;
    //   81: pop
    //   82: aload #23
    //   84: invokevirtual limit : ()I
    //   87: istore #9
    //   89: aload #19
    //   91: aload #19
    //   93: invokevirtual getMoovNode : ()Lrw;
    //   96: invokevirtual getBoxHeader : (Lrw;)Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;
    //   99: astore #26
    //   101: aload #19
    //   103: invokevirtual getStcos : ()Ljava/util/List;
    //   106: astore #21
    //   108: aload #19
    //   110: aload #19
    //   112: invokevirtual getIlstNode : ()Lrw;
    //   115: invokevirtual getBoxHeader : (Lrw;)Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;
    //   118: astore #27
    //   120: aload #19
    //   122: aload #19
    //   124: invokevirtual getUdtaNode : ()Lrw;
    //   127: invokevirtual getBoxHeader : (Lrw;)Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;
    //   130: astore #22
    //   132: aload #19
    //   134: aload #19
    //   136: invokevirtual getMetaNode : ()Lrw;
    //   139: invokevirtual getBoxHeader : (Lrw;)Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;
    //   142: astore #28
    //   144: aload #19
    //   146: aload #19
    //   148: invokevirtual getHdlrWithinMetaNode : ()Lrw;
    //   151: invokevirtual getBoxHeader : (Lrw;)Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;
    //   154: astore_1
    //   155: aload #19
    //   157: aload #19
    //   159: invokevirtual getTagsNode : ()Lrw;
    //   162: invokevirtual getBoxHeader : (Lrw;)Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;
    //   165: astore #24
    //   167: aload #19
    //   169: aload #19
    //   171: invokevirtual getTrakNodes : ()Ljava/util/List;
    //   174: aload #19
    //   176: invokevirtual getTrakNodes : ()Ljava/util/List;
    //   179: invokeinterface size : ()I
    //   184: iconst_1
    //   185: isub
    //   186: invokeinterface get : (I)Ljava/lang/Object;
    //   191: checkcast rw
    //   194: invokevirtual getBoxHeader : (Lrw;)Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;
    //   197: astore #29
    //   199: aload #19
    //   201: invokevirtual getMoovBuffer : ()Ljava/nio/ByteBuffer;
    //   204: astore #25
    //   206: aload #22
    //   208: ifnull -> 379
    //   211: aload #28
    //   213: ifnull -> 359
    //   216: aload #27
    //   218: ifnull -> 279
    //   221: aload #27
    //   223: invokevirtual getLength : ()I
    //   226: istore #5
    //   228: aload #27
    //   230: invokevirtual getFilePos : ()J
    //   233: l2i
    //   234: istore #6
    //   236: iload #6
    //   238: i2l
    //   239: aload #26
    //   241: invokevirtual getFilePos : ()J
    //   244: ldc2_w 8
    //   247: ladd
    //   248: lsub
    //   249: l2i
    //   250: istore #7
    //   252: goto -> 425
    //   255: aload #16
    //   257: astore_2
    //   258: astore_1
    //   259: goto -> 1100
    //   262: aload #16
    //   264: astore_1
    //   265: astore_1
    //   266: aload #16
    //   268: astore #18
    //   270: aload_1
    //   271: astore #16
    //   273: aload #18
    //   275: astore_1
    //   276: goto -> 989
    //   279: aload_1
    //   280: ifnull -> 335
    //   283: aload_1
    //   284: invokevirtual getFileEndPos : ()J
    //   287: l2i
    //   288: istore_3
    //   289: iload_3
    //   290: i2l
    //   291: lstore #12
    //   293: aload #26
    //   295: invokevirtual getFilePos : ()J
    //   298: lstore #14
    //   300: lload #12
    //   302: lload #14
    //   304: ldc2_w 8
    //   307: ladd
    //   308: lsub
    //   309: l2i
    //   310: istore #4
    //   312: iload_3
    //   313: istore #5
    //   315: iload #4
    //   317: istore_3
    //   318: iload #5
    //   320: istore #4
    //   322: iconst_0
    //   323: istore #5
    //   325: iload #4
    //   327: istore #6
    //   329: iload_3
    //   330: istore #7
    //   332: goto -> 425
    //   335: aload #28
    //   337: invokevirtual getFilePos : ()J
    //   340: l2i
    //   341: bipush #12
    //   343: iadd
    //   344: istore_3
    //   345: iload_3
    //   346: i2l
    //   347: lstore #12
    //   349: aload #26
    //   351: invokevirtual getFilePos : ()J
    //   354: lstore #14
    //   356: goto -> 300
    //   359: aload #26
    //   361: invokevirtual getLength : ()I
    //   364: istore_3
    //   365: aload #26
    //   367: invokevirtual getFileEndPos : ()J
    //   370: l2i
    //   371: istore #4
    //   373: iinc #3, -8
    //   376: goto -> 322
    //   379: aload #28
    //   381: ifnull -> 405
    //   384: aload #29
    //   386: invokevirtual getFileEndPos : ()J
    //   389: l2i
    //   390: istore_3
    //   391: iload_3
    //   392: i2l
    //   393: lstore #12
    //   395: aload #26
    //   397: invokevirtual getFilePos : ()J
    //   400: lstore #14
    //   402: goto -> 300
    //   405: aload #26
    //   407: invokevirtual getFileEndPos : ()J
    //   410: l2i
    //   411: istore_3
    //   412: aload #26
    //   414: invokevirtual getLength : ()I
    //   417: bipush #8
    //   419: isub
    //   420: istore #4
    //   422: goto -> 312
    //   425: aload_0
    //   426: aload #19
    //   428: invokespecial getMetaLevelFreeAtomSize : (Lorg/jaudiotagger/audio/mp4/Mp4AtomTree;)I
    //   431: istore #10
    //   433: aload #19
    //   435: invokevirtual getFreeNodes : ()Ljava/util/List;
    //   438: invokeinterface iterator : ()Ljava/util/Iterator;
    //   443: astore_1
    //   444: aload_1
    //   445: invokeinterface hasNext : ()Z
    //   450: ifeq -> 510
    //   453: aload_1
    //   454: invokeinterface next : ()Ljava/lang/Object;
    //   459: checkcast rw
    //   462: astore #19
    //   464: aload #19
    //   466: getfield b : Lrw;
    //   469: getfield b : Lrw;
    //   472: ifnonnull -> 480
    //   475: iconst_1
    //   476: istore_3
    //   477: goto -> 482
    //   480: iconst_0
    //   481: istore_3
    //   482: iload_3
    //   483: ifeq -> 444
    //   486: aload #19
    //   488: getfield e : Ljava/lang/Object;
    //   491: checkcast org/jaudiotagger/audio/mp4/atom/Mp4BoxHeader
    //   494: astore_1
    //   495: aload_1
    //   496: invokevirtual getLength : ()I
    //   499: istore #8
    //   501: aload_1
    //   502: invokevirtual getFilePos : ()J
    //   505: l2i
    //   506: istore_3
    //   507: goto -> 515
    //   510: iconst_0
    //   511: istore_3
    //   512: iconst_0
    //   513: istore #8
    //   515: iload #8
    //   517: ifle -> 567
    //   520: iload_3
    //   521: i2l
    //   522: lstore #12
    //   524: lload #12
    //   526: aload #20
    //   528: invokevirtual getFilePos : ()J
    //   531: lcmp
    //   532: ifle -> 541
    //   535: iconst_0
    //   536: istore #11
    //   538: goto -> 578
    //   541: iload_3
    //   542: istore #4
    //   544: lload #12
    //   546: aload #26
    //   548: invokevirtual getFilePos : ()J
    //   551: lcmp
    //   552: ifge -> 558
    //   555: goto -> 535
    //   558: iconst_1
    //   559: istore #11
    //   561: iload #4
    //   563: istore_3
    //   564: goto -> 578
    //   567: aload #20
    //   569: invokevirtual getFilePos : ()J
    //   572: l2i
    //   573: istore #4
    //   575: goto -> 558
    //   578: getstatic org/jaudiotagger/audio/mp4/Mp4TagWriter.logger : Ljava/util/logging/Logger;
    //   581: ldc_w 'Read header successfully ready for writing'
    //   584: invokevirtual config : (Ljava/lang/String;)V
    //   587: iload #5
    //   589: iload #9
    //   591: if_icmpne -> 610
    //   594: aload_0
    //   595: aload #18
    //   597: aload #27
    //   599: aload #23
    //   601: invokespecial writeMetadataSameSize : (Ljava/nio/channels/FileChannel;Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;Ljava/nio/ByteBuffer;)V
    //   604: aload #16
    //   606: astore_1
    //   607: goto -> 854
    //   610: iload #5
    //   612: iload #9
    //   614: if_icmple -> 677
    //   617: aload #18
    //   619: astore_1
    //   620: aload_1
    //   621: astore #18
    //   623: aload #17
    //   625: astore #19
    //   627: aload_0
    //   628: aload_1
    //   629: aload #26
    //   631: aload #22
    //   633: aload #28
    //   635: aload #27
    //   637: aload #20
    //   639: aload #24
    //   641: aload #25
    //   643: aload #23
    //   645: aload #21
    //   647: iload #10
    //   649: invokespecial writeOldMetadataLargerThanNewMetadata : (Ljava/nio/channels/FileChannel;Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/util/List;I)V
    //   652: aload #16
    //   654: astore_1
    //   655: goto -> 604
    //   658: astore_1
    //   659: aload #18
    //   661: astore_2
    //   662: aload #19
    //   664: astore #17
    //   666: goto -> 259
    //   669: aload #16
    //   671: astore_1
    //   672: astore #16
    //   674: goto -> 989
    //   677: aload #18
    //   679: astore_1
    //   680: iload #9
    //   682: iload #5
    //   684: isub
    //   685: istore #4
    //   687: iload #4
    //   689: iload #10
    //   691: bipush #8
    //   693: isub
    //   694: if_icmpgt -> 720
    //   697: aload_1
    //   698: astore #18
    //   700: aload #17
    //   702: astore #19
    //   704: aload_0
    //   705: aload_1
    //   706: aload #27
    //   708: iload #10
    //   710: aload #23
    //   712: iload #4
    //   714: invokespecial writeNewMetadataLargerButCanUseFreeAtom : (Ljava/nio/channels/FileChannel;Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;ILjava/nio/ByteBuffer;I)V
    //   717: goto -> 652
    //   720: aload_1
    //   721: astore #18
    //   723: aload #17
    //   725: astore #19
    //   727: aload_1
    //   728: aload #26
    //   730: invokevirtual getFilePos : ()J
    //   733: invokevirtual position : (J)Ljava/nio/channels/FileChannel;
    //   736: pop
    //   737: aload #22
    //   739: ifnonnull -> 773
    //   742: aload_1
    //   743: astore #18
    //   745: aload #17
    //   747: astore #19
    //   749: aload_0
    //   750: aload_1
    //   751: aload #23
    //   753: aload #26
    //   755: aload #25
    //   757: aload #20
    //   759: aload #21
    //   761: iload #8
    //   763: iload #11
    //   765: aload #24
    //   767: invokespecial writeNoExistingUdtaAtom : (Ljava/nio/channels/FileChannel;Ljava/nio/ByteBuffer;Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;Ljava/nio/ByteBuffer;Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;Ljava/util/List;IZLorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;)V
    //   770: goto -> 652
    //   773: aload #28
    //   775: ifnonnull -> 825
    //   778: aload_1
    //   779: astore #18
    //   781: aload_0
    //   782: aload #22
    //   784: aload #18
    //   786: aload #23
    //   788: aload #26
    //   790: aload #25
    //   792: aload #20
    //   794: aload #21
    //   796: iload #8
    //   798: iload #11
    //   800: aload #24
    //   802: iload #6
    //   804: iload #5
    //   806: iload_3
    //   807: iload #4
    //   809: iload #10
    //   811: isub
    //   812: invokespecial writeNoExistingMetaAtom : (Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;Ljava/nio/channels/FileChannel;Ljava/nio/ByteBuffer;Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;Ljava/nio/ByteBuffer;Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;Ljava/util/List;IZLorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;IIII)V
    //   815: goto -> 652
    //   818: astore_1
    //   819: aload #18
    //   821: astore_2
    //   822: goto -> 259
    //   825: aload_0
    //   826: aload #22
    //   828: aload #28
    //   830: aload_1
    //   831: iload #7
    //   833: aload #26
    //   835: aload #25
    //   837: aload #20
    //   839: aload #21
    //   841: iload #8
    //   843: iload #11
    //   845: aload #23
    //   847: aload #24
    //   849: iload #5
    //   851: invokespecial writeHaveExistingMetadata : (Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;Ljava/nio/channels/FileChannel;ILorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;Ljava/nio/ByteBuffer;Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;Ljava/util/List;IZLjava/nio/ByteBuffer;Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;I)V
    //   854: aload #16
    //   856: astore_1
    //   857: aload_0
    //   858: aload #20
    //   860: aload_1
    //   861: aload #21
    //   863: invokespecial checkFileWrittenCorrectly : (Lorg/jaudiotagger/audio/mp4/atom/Mp4BoxHeader;Ljava/nio/channels/FileChannel;Ljava/util/List;)V
    //   866: aload_1
    //   867: ifnull -> 900
    //   870: aload #17
    //   872: ifnull -> 888
    //   875: aload #17
    //   877: invokevirtual release : ()V
    //   880: goto -> 888
    //   883: astore_2
    //   884: aload_2
    //   885: invokevirtual printStackTrace : ()V
    //   888: aload_1
    //   889: invokevirtual close : ()V
    //   892: goto -> 900
    //   895: astore_1
    //   896: aload_1
    //   897: invokevirtual printStackTrace : ()V
    //   900: return
    //   901: astore #16
    //   903: aload_1
    //   904: astore_2
    //   905: aload #16
    //   907: astore_1
    //   908: goto -> 259
    //   911: astore #18
    //   913: aload #18
    //   915: astore_1
    //   916: goto -> 266
    //   919: astore #16
    //   921: goto -> 989
    //   924: new org/jaudiotagger/audio/exceptions/CannotWriteException
    //   927: astore_1
    //   928: aload_1
    //   929: ldc_w 'Unable to make changes to Mp4 file, unable to determine start of audio'
    //   932: invokespecial <init> : (Ljava/lang/String;)V
    //   935: aload_1
    //   936: athrow
    //   937: astore_1
    //   938: new org/jaudiotagger/audio/exceptions/CannotWriteException
    //   941: astore #18
    //   943: aload #18
    //   945: aload_1
    //   946: invokevirtual getMessage : ()Ljava/lang/String;
    //   949: invokespecial <init> : (Ljava/lang/String;)V
    //   952: aload #18
    //   954: athrow
    //   955: astore_1
    //   956: aconst_null
    //   957: astore #17
    //   959: aload #18
    //   961: astore_2
    //   962: goto -> 259
    //   965: astore_1
    //   966: aconst_null
    //   967: astore #17
    //   969: goto -> 266
    //   972: astore_1
    //   973: aconst_null
    //   974: astore_2
    //   975: aconst_null
    //   976: astore #17
    //   978: goto -> 259
    //   981: astore #16
    //   983: aconst_null
    //   984: astore #17
    //   986: aload #18
    //   988: astore_1
    //   989: aload_1
    //   990: astore #18
    //   992: aload #17
    //   994: astore #19
    //   996: new org/jaudiotagger/audio/exceptions/CannotWriteException
    //   999: astore #20
    //   1001: aload_1
    //   1002: astore #18
    //   1004: aload #17
    //   1006: astore #19
    //   1008: new java/lang/StringBuilder
    //   1011: astore #21
    //   1013: aload_1
    //   1014: astore #18
    //   1016: aload #17
    //   1018: astore #19
    //   1020: aload #21
    //   1022: invokespecial <init> : ()V
    //   1025: aload_1
    //   1026: astore #18
    //   1028: aload #17
    //   1030: astore #19
    //   1032: aload #21
    //   1034: aload_2
    //   1035: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1038: pop
    //   1039: aload_1
    //   1040: astore #18
    //   1042: aload #17
    //   1044: astore #19
    //   1046: aload #21
    //   1048: getstatic org/jaudiotagger/audio/opus/bsQ/uvJYmft.GGpfKweEsLumlL : Ljava/lang/String;
    //   1051: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1054: pop
    //   1055: aload_1
    //   1056: astore #18
    //   1058: aload #17
    //   1060: astore #19
    //   1062: aload #21
    //   1064: aload #16
    //   1066: invokevirtual getMessage : ()Ljava/lang/String;
    //   1069: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1072: pop
    //   1073: aload_1
    //   1074: astore #18
    //   1076: aload #17
    //   1078: astore #19
    //   1080: aload #20
    //   1082: aload #21
    //   1084: invokevirtual toString : ()Ljava/lang/String;
    //   1087: invokespecial <init> : (Ljava/lang/String;)V
    //   1090: aload_1
    //   1091: astore #18
    //   1093: aload #17
    //   1095: astore #19
    //   1097: aload #20
    //   1099: athrow
    //   1100: aload_2
    //   1101: ifnull -> 1136
    //   1104: aload #17
    //   1106: ifnull -> 1124
    //   1109: aload #17
    //   1111: invokevirtual release : ()V
    //   1114: goto -> 1124
    //   1117: astore #16
    //   1119: aload #16
    //   1121: invokevirtual printStackTrace : ()V
    //   1124: aload_2
    //   1125: invokevirtual close : ()V
    //   1128: goto -> 1136
    //   1131: astore_2
    //   1132: aload_2
    //   1133: invokevirtual printStackTrace : ()V
    //   1136: aload_1
    //   1137: athrow
    // Exception table:
    //   from	to	target	type
    //   12	21	981	java/io/IOException
    //   12	21	972	finally
    //   25	36	965	java/io/IOException
    //   25	36	955	finally
    //   36	49	937	org/jaudiotagger/audio/exceptions/CannotReadException
    //   36	49	262	java/io/IOException
    //   36	49	255	finally
    //   49	61	262	java/io/IOException
    //   49	61	255	finally
    //   66	206	262	java/io/IOException
    //   66	206	255	finally
    //   221	252	262	java/io/IOException
    //   221	252	255	finally
    //   283	289	262	java/io/IOException
    //   283	289	255	finally
    //   293	300	262	java/io/IOException
    //   293	300	255	finally
    //   335	345	262	java/io/IOException
    //   335	345	255	finally
    //   349	356	262	java/io/IOException
    //   349	356	255	finally
    //   359	373	262	java/io/IOException
    //   359	373	255	finally
    //   384	391	262	java/io/IOException
    //   384	391	255	finally
    //   395	402	262	java/io/IOException
    //   395	402	255	finally
    //   405	422	262	java/io/IOException
    //   405	422	255	finally
    //   425	444	262	java/io/IOException
    //   425	444	255	finally
    //   444	475	262	java/io/IOException
    //   444	475	255	finally
    //   486	507	262	java/io/IOException
    //   486	507	255	finally
    //   524	535	262	java/io/IOException
    //   524	535	255	finally
    //   544	555	262	java/io/IOException
    //   544	555	255	finally
    //   567	575	262	java/io/IOException
    //   567	575	255	finally
    //   578	587	262	java/io/IOException
    //   578	587	255	finally
    //   594	604	262	java/io/IOException
    //   594	604	255	finally
    //   627	652	669	java/io/IOException
    //   627	652	658	finally
    //   704	717	669	java/io/IOException
    //   704	717	658	finally
    //   727	737	919	java/io/IOException
    //   727	737	658	finally
    //   749	770	669	java/io/IOException
    //   749	770	658	finally
    //   781	815	262	java/io/IOException
    //   781	815	818	finally
    //   825	854	911	java/io/IOException
    //   825	854	901	finally
    //   857	866	262	java/io/IOException
    //   857	866	255	finally
    //   875	880	883	java/io/IOException
    //   888	892	895	java/io/IOException
    //   924	937	262	java/io/IOException
    //   924	937	255	finally
    //   938	955	262	java/io/IOException
    //   938	955	255	finally
    //   996	1001	658	finally
    //   1008	1013	658	finally
    //   1020	1025	658	finally
    //   1032	1039	658	finally
    //   1046	1055	658	finally
    //   1062	1073	658	finally
    //   1080	1090	658	finally
    //   1097	1100	658	finally
    //   1109	1114	1117	java/io/IOException
    //   1124	1128	1131	java/io/IOException
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp4\Mp4TagWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */