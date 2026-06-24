package org.jaudiotagger.audio.ogg;

import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import l0;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.ogg.util.OggCRCFactory;
import org.jaudiotagger.audio.ogg.util.OggPageHeader;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.vorbiscomment.VorbisCommentTag;
import uc1;

public class OggVorbisTagWriter {
  public static Logger logger;
  
  private OggVorbisTagReader reader = new OggVorbisTagReader();
  
  private OggVorbisCommentTagCreator tc = new OggVorbisCommentTagCreator();
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.ogg");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  private void calculateChecksumOverPage(ByteBuffer paramByteBuffer) {
    byte b = 0;
    paramByteBuffer.putInt(22, 0);
    byte[] arrayOfByte = OggCRCFactory.computeCRC(paramByteBuffer.array());
    while (b < arrayOfByte.length) {
      paramByteBuffer.put(b + 22, arrayOfByte[b]);
      b++;
    } 
    paramByteBuffer.rewind();
  }
  
  private byte[] createSegmentTable(int paramInt1, int paramInt2, List<OggPageHeader.PacketStartAndLength> paramList) {
    byte[] arrayOfByte1;
    Logger logger1 = logger;
    StringBuilder stringBuilder1 = new StringBuilder("Create SegmentTable CommentLength:");
    stringBuilder1.append(paramInt1);
    stringBuilder1.append(":SetupHeaderLength:");
    stringBuilder1.append(paramInt2);
    logger1.finest(stringBuilder1.toString());
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    if (paramInt2 == 0)
      return createSegments(paramInt1, false); 
    byte[] arrayOfByte2 = createSegments(paramInt1, true);
    if (paramList.size() > 0) {
      arrayOfByte1 = createSegments(paramInt2, true);
    } else {
      arrayOfByte1 = createSegments(paramInt2, false);
    } 
    Logger logger2 = logger;
    StringBuilder stringBuilder2 = new StringBuilder("Created ");
    stringBuilder2.append(arrayOfByte2.length);
    stringBuilder2.append(" segments for header");
    logger2.finest(stringBuilder2.toString());
    logger2 = logger;
    stringBuilder2 = new StringBuilder("Created ");
    stringBuilder2.append(arrayOfByte1.length);
    stringBuilder2.append(" segments for setup");
    logger2.finest(stringBuilder2.toString());
    try {
      byteArrayOutputStream.write(arrayOfByte2);
      byteArrayOutputStream.write(arrayOfByte1);
      if (paramList.size() > 0) {
        Logger logger = logger;
        StringBuilder stringBuilder = new StringBuilder();
        this("Creating segments for ");
        stringBuilder.append(paramList.size());
        stringBuilder.append(" packets");
        logger.finer(stringBuilder.toString());
        Iterator<OggPageHeader.PacketStartAndLength> iterator = paramList.iterator();
        while (iterator.hasNext())
          byteArrayOutputStream.write(createSegments(((OggPageHeader.PacketStartAndLength)iterator.next()).getLength(), false)); 
      } 
      return byteArrayOutputStream.toByteArray();
    } catch (IOException iOException) {
      l0.h("Unable to create segment table:", iOException.getMessage());
      return null;
    } 
  }
  
  private byte[] createSegmentTable(int paramInt, List<OggPageHeader.PacketStartAndLength> paramList) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = createSegments(paramInt, true);
    try {
      byteArrayOutputStream.write(arrayOfByte);
      if (paramList.size() > 0) {
        Iterator<OggPageHeader.PacketStartAndLength> iterator = paramList.iterator();
        while (iterator.hasNext())
          byteArrayOutputStream.write(createSegments(((OggPageHeader.PacketStartAndLength)iterator.next()).getLength(), false)); 
      } 
      return byteArrayOutputStream.toByteArray();
    } catch (IOException iOException) {
      l0.h("Unable to create segment table:", iOException.getMessage());
      return null;
    } 
  }
  
  private byte[] createSegments(int paramInt, boolean paramBoolean) {
    Logger logger = logger;
    StringBuilder stringBuilder = new StringBuilder("Create Segments for length:");
    stringBuilder.append(paramInt);
    stringBuilder.append(":QuitStream:");
    stringBuilder.append(paramBoolean);
    logger.finest(stringBuilder.toString());
    int j = 0;
    if (paramInt == 0)
      return new byte[] { 0 }; 
    int k = paramInt / 255;
    if (paramInt % 255 == 0 && !paramBoolean) {
      i = 0;
    } else {
      i = 1;
    } 
    k += i;
    byte[] arrayOfByte = new byte[k];
    int i = j;
    while (true) {
      j = k - 1;
      if (i < j) {
        arrayOfByte[i] = -1;
        i++;
        continue;
      } 
      arrayOfByte[j] = (byte)(paramInt - i * 255);
      return arrayOfByte;
    } 
  }
  
  private boolean isCommentAndSetupHeaderFitsOnASinglePage(int paramInt1, int paramInt2, List<OggPageHeader.PacketStartAndLength> paramList) {
    int i;
    if (paramInt1 == 0) {
      i = 1;
    } else {
      int j = paramInt1 / 255;
      i = j + 1;
      if (paramInt1 % 255 == 0)
        i = j + 2; 
    } 
    Logger logger2 = logger;
    StringBuilder stringBuilder3 = new StringBuilder("Require:");
    stringBuilder3.append(i);
    stringBuilder3.append(" segments for comment");
    logger2.finest(stringBuilder3.toString());
    if (paramInt2 == 0) {
      paramInt1 = i + 1;
    } else {
      i += paramInt2 / 255 + 1;
      paramInt1 = i;
      if (paramInt2 % 255 == 0)
        paramInt1 = i + 1; 
    } 
    Logger logger3 = logger;
    StringBuilder stringBuilder2 = new StringBuilder("Require:");
    stringBuilder2.append(paramInt1);
    stringBuilder2.append(" segments for comment plus setup");
    logger3.finest(stringBuilder2.toString());
    for (OggPageHeader.PacketStartAndLength packetStartAndLength : paramList) {
      if (packetStartAndLength.getLength() == 0) {
        paramInt1++;
        continue;
      } 
      paramInt2 = packetStartAndLength.getLength() / 255 + 1 + paramInt1;
      paramInt1 = paramInt2;
      if (packetStartAndLength.getLength() % 255 == 0)
        paramInt1 = paramInt2 + 1; 
    } 
    Logger logger1 = logger;
    StringBuilder stringBuilder1 = new StringBuilder("Total No Of Segment If New Comment And Header Put On One Page:");
    stringBuilder1.append(paramInt1);
    logger1.finest(stringBuilder1.toString());
    return (paramInt1 <= 255);
  }
  
  private void replacePagesAndRenumberPageSeqs(OggVorbisTagReader.OggVorbisHeaderSizes paramOggVorbisHeaderSizes, int paramInt, OggPageHeader paramOggPageHeader, ByteBuffer paramByteBuffer, uc1 paramuc11, uc1 paramuc12) {
    ByteBuffer byteBuffer;
    StringBuilder stringBuilder1;
    Logger logger1;
    int j;
    boolean bool1;
    int i = paramOggPageHeader.getPageSequence();
    int k = paramInt / 65025;
    Logger logger2 = logger;
    StringBuilder stringBuilder3 = new StringBuilder("Comment requires:");
    stringBuilder3.append(k);
    stringBuilder3.append(" complete pages");
    logger2.config(stringBuilder3.toString());
    boolean bool2 = false;
    if (k > 0) {
      byte b = 0;
      int m = 0;
      while (true) {
        j = i;
        bool1 = m;
        if (b < k) {
          byte[] arrayOfByte = createSegments(65025, false);
          ByteBuffer byteBuffer1 = ByteBuffer.allocate(arrayOfByte.length + 65052);
          byteBuffer1.order(ByteOrder.LITTLE_ENDIAN);
          byteBuffer1.put(paramOggPageHeader.getRawHeaderData(), 0, 26);
          byteBuffer1.put((byte)arrayOfByte.length);
          bool1 = arrayOfByte.length;
          for (j = 0; j < bool1; j++)
            byteBuffer1.put(arrayOfByte[j]); 
          ByteBuffer byteBuffer2 = paramByteBuffer.slice();
          byteBuffer2.limit(65025);
          byteBuffer1.put(byteBuffer2);
          byteBuffer1.putInt(18, i);
          i++;
          if (b != 0)
            byteBuffer1.put(5, OggPageHeader.HeaderTypeFlag.CONTINUED_PACKET.getFileValue()); 
          calculateChecksumOverPage(byteBuffer1);
          paramuc12.a().write(byteBuffer1);
          m += 65025;
          paramByteBuffer.position(m);
          b++;
          continue;
        } 
        break;
      } 
    } else {
      bool1 = false;
      j = i;
    } 
    paramInt %= 65025;
    Logger logger3 = logger;
    StringBuilder stringBuilder2 = new StringBuilder("Last comment packet size:");
    stringBuilder2.append(paramInt);
    logger3.fine(stringBuilder2.toString());
    if (!isCommentAndSetupHeaderFitsOnASinglePage(paramInt, paramOggVorbisHeaderSizes.getSetupHeaderSize(), paramOggVorbisHeaderSizes.getExtraPacketList())) {
      logger.fine("WriteOgg Type 3");
      byte[] arrayOfByte3 = createSegments(paramInt, true);
      ByteBuffer byteBuffer1 = ByteBuffer.allocate(arrayOfByte3.length + 27 + paramInt);
      byteBuffer1.order(ByteOrder.LITTLE_ENDIAN);
      byteBuffer1.put(paramOggPageHeader.getRawHeaderData(), 0, 26);
      byteBuffer1.put((byte)arrayOfByte3.length);
      int m = arrayOfByte3.length;
      for (paramInt = 0; paramInt < m; paramInt++)
        byteBuffer1.put(arrayOfByte3[paramInt]); 
      paramByteBuffer.position(bool1);
      byteBuffer1.put(paramByteBuffer.slice());
      byteBuffer1.putInt(18, j);
      if (k > 0)
        byteBuffer1.put(5, OggPageHeader.HeaderTypeFlag.CONTINUED_PACKET.getFileValue()); 
      Logger logger = logger;
      StringBuilder stringBuilder = new StringBuilder("Writing Last Comment Page ");
      stringBuilder.append(j);
      stringBuilder.append(" to file");
      logger.fine(stringBuilder.toString());
      j++;
      calculateChecksumOverPage(byteBuffer1);
      paramuc12.a().write(byteBuffer1);
      byte[] arrayOfByte1 = createSegmentTable(paramOggVorbisHeaderSizes.getSetupHeaderSize(), paramOggVorbisHeaderSizes.getExtraPacketList());
      paramInt = arrayOfByte1.length;
      byte[] arrayOfByte2 = this.reader.convertToVorbisSetupHeaderPacketAndAdditionalPackets(paramOggVorbisHeaderSizes.getSetupHeaderStartPosition(), paramuc11);
      byteBuffer = ByteBuffer.allocate(arrayOfByte2.length + paramInt + 27);
      byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
      byteBuffer.put(paramOggPageHeader.getRawHeaderData(), 0, 26);
      byteBuffer.put((byte)arrayOfByte1.length);
      m = arrayOfByte1.length;
      for (paramInt = bool2; paramInt < m; paramInt++)
        byteBuffer.put(arrayOfByte1[paramInt]); 
      byteBuffer.put(arrayOfByte2);
      byteBuffer.putInt(18, j);
      logger1 = logger;
      stringBuilder1 = new StringBuilder("Writing Setup Header and packets Page ");
      stringBuilder1.append(j);
      stringBuilder1.append(" to file");
      logger1.fine(stringBuilder1.toString());
      calculateChecksumOverPage(byteBuffer);
      paramuc12.a().write(byteBuffer);
    } else {
      logger.fine("WriteOgg Type 4");
      i = byteBuffer.getSetupHeaderSize();
      int m = byteBuffer.getExtraPacketDataSize();
      logger1.position(bool1);
      ByteBuffer byteBuffer1 = startCreateBasicSecondPage((OggVorbisTagReader.OggVorbisHeaderSizes)byteBuffer, paramInt, i + paramInt + m, (OggPageHeader)stringBuilder1, logger1.slice());
      paramuc11.h(byteBuffer.getSetupHeaderStartPosition());
      byteBuffer1.put(this.reader.convertToVorbisSetupHeaderPacketAndAdditionalPackets(byteBuffer.getSetupHeaderStartPosition(), paramuc11));
      byteBuffer1.putInt(18, j);
      byteBuffer1.put(5, OggPageHeader.HeaderTypeFlag.CONTINUED_PACKET.getFileValue());
      calculateChecksumOverPage(byteBuffer1);
      paramuc12.a().write(byteBuffer1);
    } 
    writeRemainingPages(j, paramuc11, paramuc12);
  }
  
  private void replaceSecondPageAndRenumberPageSeqs(OggVorbisTagReader.OggVorbisHeaderSizes paramOggVorbisHeaderSizes, int paramInt1, int paramInt2, OggPageHeader paramOggPageHeader, ByteBuffer paramByteBuffer, uc1 paramuc11, uc1 paramuc12) {
    logger.fine("WriteOgg Type 2");
    paramByteBuffer = startCreateBasicSecondPage(paramOggVorbisHeaderSizes, paramInt1, paramInt2, paramOggPageHeader, paramByteBuffer);
    paramInt1 = paramOggPageHeader.getPageSequence();
    byte[] arrayOfByte = this.reader.convertToVorbisSetupHeaderPacketAndAdditionalPackets(paramOggVorbisHeaderSizes.getSetupHeaderStartPosition(), paramuc11);
    Logger logger = logger;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(arrayOfByte.length);
    stringBuilder.append(":");
    stringBuilder.append(paramByteBuffer.position());
    stringBuilder.append(":");
    stringBuilder.append(paramByteBuffer.capacity());
    logger.finest(stringBuilder.toString());
    paramByteBuffer.put(arrayOfByte);
    calculateChecksumOverPage(paramByteBuffer);
    paramuc12.a().write(paramByteBuffer);
    writeRemainingPages(paramInt1, paramuc11, paramuc12);
  }
  
  private void replaceSecondPageOnly(OggVorbisTagReader.OggVorbisHeaderSizes paramOggVorbisHeaderSizes, int paramInt1, int paramInt2, OggPageHeader paramOggPageHeader, ByteBuffer paramByteBuffer, long paramLong, uc1 paramuc11, uc1 paramuc12) {
    logger.fine("WriteOgg Type 1");
    ByteBuffer byteBuffer = startCreateBasicSecondPage(paramOggVorbisHeaderSizes, paramInt1, paramInt2, paramOggPageHeader, paramByteBuffer);
    paramuc11.h(paramLong);
    paramuc11.skipBytes(paramOggVorbisHeaderSizes.getCommentHeaderSize());
    paramuc11.a().read(byteBuffer);
    calculateChecksumOverPage(byteBuffer);
    paramuc12.a().write(byteBuffer);
    paramuc12.a().transferFrom(paramuc11.a(), paramuc12.c(), paramuc11.d() - paramuc11.c());
  }
  
  private ByteBuffer startCreateBasicSecondPage(OggVorbisTagReader.OggVorbisHeaderSizes paramOggVorbisHeaderSizes, int paramInt1, int paramInt2, OggPageHeader paramOggPageHeader, ByteBuffer paramByteBuffer) {
    logger.fine("WriteOgg Type 1");
    byte[] arrayOfByte1 = createSegmentTable(paramInt1, paramOggVorbisHeaderSizes.getSetupHeaderSize(), paramOggVorbisHeaderSizes.getExtraPacketList());
    paramInt1 = arrayOfByte1.length + 27;
    Logger logger2 = logger;
    StringBuilder stringBuilder1 = new StringBuilder("New second page header length:");
    stringBuilder1.append(paramInt1);
    logger2.fine(stringBuilder1.toString());
    Logger logger1 = logger;
    StringBuilder stringBuilder2 = new StringBuilder("No of segments:");
    stringBuilder2.append(arrayOfByte1.length);
    logger1.fine(stringBuilder2.toString());
    ByteBuffer byteBuffer = ByteBuffer.allocate(paramInt2 + paramInt1);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    byte[] arrayOfByte2 = paramOggPageHeader.getRawHeaderData();
    paramInt1 = 0;
    byteBuffer.put(arrayOfByte2, 0, 26);
    byteBuffer.put((byte)arrayOfByte1.length);
    paramInt2 = arrayOfByte1.length;
    while (paramInt1 < paramInt2) {
      byteBuffer.put(arrayOfByte1[paramInt1]);
      paramInt1++;
    } 
    byteBuffer.put(paramByteBuffer);
    return byteBuffer;
  }
  
  public void delete(uc1 paramuc11, uc1 paramuc12) {
    try {
      this.reader.read(paramuc11);
      VorbisCommentTag vorbisCommentTag = VorbisCommentTag.createNewTag();
      paramuc11.h(0L);
      write((Tag)vorbisCommentTag, paramuc11, paramuc12);
      return;
    } catch (CannotReadException cannotReadException) {
      write((Tag)VorbisCommentTag.createNewTag(), paramuc11, paramuc12);
      return;
    } 
  }
  
  public void write(Tag paramTag, uc1 paramuc11, uc1 paramuc12) {
    logger.config("Starting to write file:");
    logger.fine("Read 1st Page:identificationHeader:");
    OggPageHeader oggPageHeader = OggPageHeader.read(paramuc11);
    paramuc11.h(oggPageHeader.getStartByte());
    paramuc12.a().transferFrom(paramuc11.a(), 0L, (oggPageHeader.getPageLength() + 27 + (oggPageHeader.getSegmentTable()).length));
    paramuc12.skipBytes(oggPageHeader.getPageLength() + 27 + (oggPageHeader.getSegmentTable()).length);
    logger.fine(IGBYXeDFmKYajx.BNqZoovUONSiwjY);
    oggPageHeader = OggPageHeader.read(paramuc11);
    long l = paramuc11.c();
    Logger logger1 = logger;
    StringBuilder stringBuilder4 = new StringBuilder("Read 2nd Page:comment and setup and possibly audio:Header finishes at file position:");
    stringBuilder4.append(l);
    logger1.fine(stringBuilder4.toString());
    paramuc11.h(0L);
    OggVorbisTagReader.OggVorbisHeaderSizes oggVorbisHeaderSizes = this.reader.readOggVorbisHeaderSizes(paramuc11);
    ByteBuffer byteBuffer = this.tc.convert(paramTag);
    int i = byteBuffer.capacity();
    int j = oggVorbisHeaderSizes.getSetupHeaderSize();
    j = oggVorbisHeaderSizes.getExtraPacketDataSize() + j + i;
    Logger logger4 = logger;
    StringBuilder stringBuilder7 = new StringBuilder("Old 2nd Page no of packets: ");
    stringBuilder7.append(oggPageHeader.getPacketList().size());
    logger4.fine(stringBuilder7.toString());
    logger4 = logger;
    stringBuilder7 = new StringBuilder("Old 2nd Page size: ");
    stringBuilder7.append(oggPageHeader.getPageLength());
    logger4.fine(stringBuilder7.toString());
    Logger logger7 = logger;
    StringBuilder stringBuilder3 = new StringBuilder("Old last page status: ");
    stringBuilder3.append(oggPageHeader.isLastPage());
    logger7.fine(stringBuilder3.toString());
    Logger logger3 = logger;
    StringBuilder stringBuilder6 = new StringBuilder("Setup Header Size: ");
    stringBuilder6.append(oggVorbisHeaderSizes.getSetupHeaderSize());
    logger3.fine(stringBuilder6.toString());
    Logger logger6 = logger;
    StringBuilder stringBuilder2 = new StringBuilder("Extra Packets: ");
    stringBuilder2.append(oggVorbisHeaderSizes.getExtraPacketList().size());
    logger6.fine(stringBuilder2.toString());
    Logger logger2 = logger;
    StringBuilder stringBuilder5 = new StringBuilder("Extra Packet Data Size: ");
    stringBuilder5.append(oggVorbisHeaderSizes.getExtraPacketDataSize());
    logger2.fine(stringBuilder5.toString());
    logger2 = logger;
    stringBuilder5 = new StringBuilder("Old comment: ");
    stringBuilder5.append(oggVorbisHeaderSizes.getCommentHeaderSize());
    logger2.fine(stringBuilder5.toString());
    Logger logger5 = logger;
    StringBuilder stringBuilder1 = new StringBuilder("New comment: ");
    stringBuilder1.append(i);
    logger5.fine(stringBuilder1.toString());
    logger5 = logger;
    stringBuilder1 = new StringBuilder("New Page Data Size: ");
    stringBuilder1.append(j);
    logger5.fine(stringBuilder1.toString());
    if (isCommentAndSetupHeaderFitsOnASinglePage(i, oggVorbisHeaderSizes.getSetupHeaderSize(), oggVorbisHeaderSizes.getExtraPacketList())) {
      if (oggPageHeader.getPageLength() < 65025 && ((oggPageHeader.getPacketList().size() == 2 && oggPageHeader.isLastPage()) || oggPageHeader.getPacketList().size() > 2)) {
        logger.fine("Header and Setup remain on single page:");
        replaceSecondPageOnly(oggVorbisHeaderSizes, i, j, oggPageHeader, byteBuffer, l, paramuc11, paramuc12);
        return;
      } 
      logger.fine("Header and Setup now on single page:");
      replaceSecondPageAndRenumberPageSeqs(oggVorbisHeaderSizes, i, j, oggPageHeader, byteBuffer, paramuc11, paramuc12);
      return;
    } 
    logger.fine("Header and Setup with shift audio:");
    replacePagesAndRenumberPageSeqs(oggVorbisHeaderSizes, i, oggPageHeader, byteBuffer, paramuc11, paramuc12);
  }
  
  public void writeRemainingPages(int paramInt, uc1 paramuc11, uc1 paramuc12) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual c : ()J
    //   4: lstore #9
    //   6: aload_3
    //   7: invokevirtual c : ()J
    //   10: lstore #7
    //   12: aload_2
    //   13: invokevirtual d : ()J
    //   16: aload_2
    //   17: invokevirtual c : ()J
    //   20: lsub
    //   21: l2i
    //   22: invokestatic allocate : (I)Ljava/nio/ByteBuffer;
    //   25: astore #15
    //   27: aload_2
    //   28: invokevirtual d : ()J
    //   31: aload_2
    //   32: invokevirtual c : ()J
    //   35: lsub
    //   36: l2i
    //   37: invokestatic allocate : (I)Ljava/nio/ByteBuffer;
    //   40: astore #16
    //   42: aload_2
    //   43: invokevirtual a : ()Ljava/nio/channels/FileChannel;
    //   46: aload #15
    //   48: invokevirtual read : (Ljava/nio/ByteBuffer;)I
    //   51: pop
    //   52: aload #15
    //   54: invokevirtual rewind : ()Ljava/nio/Buffer;
    //   57: pop
    //   58: aload #15
    //   60: invokevirtual hasRemaining : ()Z
    //   63: ifeq -> 244
    //   66: aload #15
    //   68: invokestatic read : (Ljava/nio/ByteBuffer;)Lorg/jaudiotagger/audio/ogg/util/OggPageHeader;
    //   71: astore #18
    //   73: aload #18
    //   75: invokevirtual getRawHeaderData : ()[B
    //   78: arraylength
    //   79: istore #4
    //   81: aload #18
    //   83: invokevirtual getPageLength : ()I
    //   86: iload #4
    //   88: iadd
    //   89: invokestatic allocate : (I)Ljava/nio/ByteBuffer;
    //   92: astore #19
    //   94: aload #19
    //   96: getstatic java/nio/ByteOrder.LITTLE_ENDIAN : Ljava/nio/ByteOrder;
    //   99: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   102: pop
    //   103: aload #19
    //   105: aload #18
    //   107: invokevirtual getRawHeaderData : ()[B
    //   110: invokevirtual put : ([B)Ljava/nio/ByteBuffer;
    //   113: pop
    //   114: aload #15
    //   116: invokevirtual slice : ()Ljava/nio/ByteBuffer;
    //   119: astore #17
    //   121: aload #17
    //   123: aload #18
    //   125: invokevirtual getPageLength : ()I
    //   128: invokevirtual limit : (I)Ljava/nio/Buffer;
    //   131: pop
    //   132: aload #19
    //   134: aload #17
    //   136: invokevirtual put : (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   139: pop
    //   140: iinc #1, 1
    //   143: aload #19
    //   145: bipush #18
    //   147: iload_1
    //   148: invokevirtual putInt : (II)Ljava/nio/ByteBuffer;
    //   151: pop
    //   152: aload_0
    //   153: aload #19
    //   155: invokespecial calculateChecksumOverPage : (Ljava/nio/ByteBuffer;)V
    //   158: aload #15
    //   160: invokevirtual position : ()I
    //   163: istore #4
    //   165: aload #15
    //   167: aload #18
    //   169: invokevirtual getPageLength : ()I
    //   172: iload #4
    //   174: iadd
    //   175: invokevirtual position : (I)Ljava/nio/Buffer;
    //   178: pop
    //   179: aload #19
    //   181: invokevirtual rewind : ()Ljava/nio/Buffer;
    //   184: pop
    //   185: aload #16
    //   187: aload #19
    //   189: invokevirtual put : (Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    //   192: pop
    //   193: goto -> 58
    //   196: astore #17
    //   198: aload #15
    //   200: aload #15
    //   202: invokevirtual position : ()I
    //   205: getstatic org/jaudiotagger/audio/ogg/util/OggPageHeader.CAPTURE_PATTERN : [B
    //   208: arraylength
    //   209: isub
    //   210: invokevirtual position : (I)Ljava/nio/Buffer;
    //   213: pop
    //   214: aload #15
    //   216: invokestatic readThreeBytesAsChars : (Ljava/nio/ByteBuffer;)Ljava/lang/String;
    //   219: ldc_w 'TAG'
    //   222: invokevirtual equals : (Ljava/lang/Object;)Z
    //   225: ifeq -> 241
    //   228: aload #15
    //   230: invokevirtual remaining : ()I
    //   233: iconst_3
    //   234: iadd
    //   235: i2l
    //   236: lstore #5
    //   238: goto -> 247
    //   241: aload #17
    //   243: athrow
    //   244: lconst_0
    //   245: lstore #5
    //   247: aload #16
    //   249: invokevirtual flip : ()Ljava/nio/Buffer;
    //   252: pop
    //   253: aload_3
    //   254: invokevirtual a : ()Ljava/nio/channels/FileChannel;
    //   257: aload #16
    //   259: invokevirtual write : (Ljava/nio/ByteBuffer;)I
    //   262: pop
    //   263: aload_2
    //   264: invokevirtual d : ()J
    //   267: lload #9
    //   269: lsub
    //   270: aload_3
    //   271: invokevirtual d : ()J
    //   274: lload #5
    //   276: ladd
    //   277: lload #7
    //   279: lsub
    //   280: lcmp
    //   281: ifne -> 285
    //   284: return
    //   285: aload_2
    //   286: invokevirtual d : ()J
    //   289: lstore #13
    //   291: aload_3
    //   292: invokevirtual d : ()J
    //   295: lstore #11
    //   297: new java/lang/StringBuilder
    //   300: dup
    //   301: ldc_w 'File written counts don't match, file not written:origAudioLength:'
    //   304: invokespecial <init> : (Ljava/lang/String;)V
    //   307: astore_2
    //   308: aload_2
    //   309: lload #13
    //   311: lload #9
    //   313: lsub
    //   314: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   317: pop
    //   318: aload_2
    //   319: ldc_w ':newAudioLength:'
    //   322: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   325: pop
    //   326: aload_2
    //   327: lload #11
    //   329: lload #5
    //   331: ladd
    //   332: lload #7
    //   334: lsub
    //   335: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   338: pop
    //   339: aload_2
    //   340: ldc_w ':bytesDiscarded:'
    //   343: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   346: pop
    //   347: aload_2
    //   348: lload #5
    //   350: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   353: pop
    //   354: new org/jaudiotagger/audio/exceptions/CannotWriteException
    //   357: dup
    //   358: aload_2
    //   359: invokevirtual toString : ()Ljava/lang/String;
    //   362: invokespecial <init> : (Ljava/lang/String;)V
    //   365: athrow
    // Exception table:
    //   from	to	target	type
    //   66	73	196	org/jaudiotagger/audio/exceptions/CannotReadException
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\ogg\OggVorbisTagWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */