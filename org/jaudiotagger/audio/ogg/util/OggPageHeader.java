package org.jaudiotagger.audio.ogg.util;

import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.tag.id3.AbstractID3v2Tag;
import uc1;
import x41;

public class OggPageHeader {
  public static final byte[] CAPTURE_PATTERN;
  
  public static final int FIELD_ABSOLUTE_GRANULE_LENGTH = 8;
  
  public static final int FIELD_ABSOLUTE_GRANULE_POS = 6;
  
  public static final int FIELD_CAPTURE_PATTERN_LENGTH = 4;
  
  public static final int FIELD_CAPTURE_PATTERN_POS = 0;
  
  public static final int FIELD_HEADER_TYPE_FLAG_LENGTH = 1;
  
  public static final int FIELD_HEADER_TYPE_FLAG_POS = 5;
  
  public static final int FIELD_PAGE_CHECKSUM_LENGTH = 4;
  
  public static final int FIELD_PAGE_CHECKSUM_POS = 22;
  
  public static final int FIELD_PAGE_SEGMENTS_LENGTH = 1;
  
  public static final int FIELD_PAGE_SEGMENTS_POS = 26;
  
  public static final int FIELD_PAGE_SEQUENCE_NO_LENGTH = 4;
  
  public static final int FIELD_PAGE_SEQUENCE_NO_POS = 18;
  
  public static final int FIELD_SEGMENT_TABLE_POS = 27;
  
  public static final int FIELD_STREAM_SERIAL_NO_LENGTH = 4;
  
  public static final int FIELD_STREAM_SERIAL_NO_POS = 14;
  
  public static final int FIELD_STREAM_STRUCTURE_VERSION_LENGTH = 1;
  
  public static final int FIELD_STREAM_STRUCTURE_VERSION_POS = 4;
  
  public static final int MAXIMUM_NO_OF_SEGMENT_SIZE = 255;
  
  public static final int MAXIMUM_PAGE_DATA_SIZE = 65025;
  
  public static final int MAXIMUM_PAGE_HEADER_SIZE = 282;
  
  public static final int MAXIMUM_PAGE_SIZE = 65307;
  
  public static final int MAXIMUM_SEGMENT_SIZE = 255;
  
  public static final int OGG_PAGE_HEADER_FIXED_LENGTH = 27;
  
  public static Logger logger;
  
  private long absoluteGranulePosition;
  
  private int checksum;
  
  private transient boolean continuedPage;
  
  private transient boolean firstPage;
  
  private byte headerTypeFlag;
  
  private transient boolean isValid;
  
  private transient boolean lastPacketIncomplete;
  
  private transient boolean lastPage;
  
  private transient List<PacketStartAndLength> packetList;
  
  private transient int pageLength;
  
  private byte pageSegments;
  
  private int pageSequenceNumber;
  
  private byte[] rawHeaderData;
  
  private byte[] segmentTable;
  
  private transient long startByte;
  
  private int streamSerialNumber;
  
  private byte streamStructureRevision;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.ogg.atom");
    logger = logger;
    logger.setLevel(Level.SEVERE);
    CAPTURE_PATTERN = new byte[] { 79, 103, 103, 83 };
  }
  
  public OggPageHeader(byte[] paramArrayOfbyte) {
    boolean bool;
    this.pageLength = 0;
    this.startByte = 0L;
    this.packetList = new ArrayList<PacketStartAndLength>();
    this.rawHeaderData = paramArrayOfbyte;
    byte b2 = paramArrayOfbyte[4];
    this.streamStructureRevision = b2;
    byte b1 = paramArrayOfbyte[5];
    this.headerTypeFlag = b1;
    if ((b1 & 0x1) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.continuedPage = bool;
    if ((b1 & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.firstPage = bool;
    if ((0x4 & b1) != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.lastPage = bool;
    if (b2 == 0) {
      this.absoluteGranulePosition = Utils.getLongLE(paramArrayOfbyte, 6, 13);
      this.streamSerialNumber = Utils.getIntLE(paramArrayOfbyte, 14, 17);
      this.pageSequenceNumber = Utils.getIntLE(paramArrayOfbyte, 18, 21);
      this.checksum = Utils.getIntLE(paramArrayOfbyte, 22, 25);
      this.pageSegments = paramArrayOfbyte[26];
      this.segmentTable = new byte[paramArrayOfbyte.length - 27];
      Integer integer = null;
      byte b = 0;
      int i = 0;
      while (true) {
        byte[] arrayOfByte = this.segmentTable;
        if (b < arrayOfByte.length) {
          b1 = paramArrayOfbyte[b + 27];
          arrayOfByte[b] = b1;
          int k = u(b1);
          int m = this.pageLength + k;
          this.pageLength = m;
          int j = i + k;
          i = j;
          if (k < 255) {
            this.packetList.add(new PacketStartAndLength(m - j, j));
            i = 0;
          } 
          b++;
          integer = Integer.valueOf(k);
          continue;
        } 
        if (integer != null && integer.intValue() == 255) {
          this.packetList.add(new PacketStartAndLength(this.pageLength - i, i));
          this.lastPacketIncomplete = true;
        } 
        this.isValid = true;
        break;
      } 
    } 
    if (logger.isLoggable(Level.CONFIG)) {
      Logger logger = logger;
      StringBuilder stringBuilder = new StringBuilder("Constructed OggPage: ");
      stringBuilder.append(toString());
      logger.config(stringBuilder.toString());
    } 
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
  
  public static OggPageHeader createCommentHeader(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3) {
    int i = paramInt1 / 255;
    int j = paramInt1 % 255;
    if (j > 0) {
      paramInt1 = i + 1;
    } else {
      paramInt1 = i;
    } 
    byte[] arrayOfByte = new byte[paramInt1 + 27];
    ByteBuffer byteBuffer = ByteBuffer.wrap(arrayOfByte).order(ByteOrder.LITTLE_ENDIAN);
    byteBuffer.put(CAPTURE_PATTERN);
    boolean bool = false;
    byteBuffer.put((byte)0);
    byteBuffer.put((byte)paramBoolean);
    byteBuffer.putLong(0L);
    byteBuffer.putInt(paramInt2);
    byteBuffer.putInt(paramInt3);
    byteBuffer.putInt(0);
    byteBuffer.put((byte)paramInt1);
    for (paramInt1 = bool; paramInt1 < (i & 0xFF); paramInt1++)
      byteBuffer.put((byte)-1); 
    if (j > 0)
      byteBuffer.put((byte)j); 
    return new OggPageHeader(arrayOfByte);
  }
  
  public static OggPageHeader read(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.position();
    Logger logger = logger;
    StringBuilder stringBuilder = new StringBuilder("Trying to read OggPage at: ");
    stringBuilder.append(i);
    logger.fine(stringBuilder.toString());
    byte[] arrayOfByte2 = CAPTURE_PATTERN;
    byte[] arrayOfByte1 = new byte[arrayOfByte2.length];
    paramByteBuffer.get(arrayOfByte1);
    if (Arrays.equals(arrayOfByte1, arrayOfByte2)) {
      paramByteBuffer.position(i + 26);
      byte b = paramByteBuffer.get();
      paramByteBuffer.position(i);
      arrayOfByte1 = new byte[(b & 0xFF) + 27];
      paramByteBuffer.get(arrayOfByte1);
      return new OggPageHeader(arrayOfByte1);
    } 
    throw new CannotReadException(MessageFormat.format("OggS Header could not be found, not an ogg stream {0}", new Object[] { new String(arrayOfByte1) }));
  }
  
  public static OggPageHeader read(uc1 paramuc1) {
    long l2 = paramuc1.c();
    Logger logger = logger;
    StringBuilder stringBuilder = new StringBuilder(ybWnIKHovcRr.pGV);
    stringBuilder.append(l2);
    logger.fine(stringBuilder.toString());
    byte[] arrayOfByte1 = CAPTURE_PATTERN;
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
    paramuc1.g(arrayOfByte2);
    long l1 = l2;
    if (!Arrays.equals(arrayOfByte2, arrayOfByte1)) {
      paramuc1.h(l2);
      if (AbstractID3v2Tag.isId3Tag(paramuc1)) {
        logger.warning(MessageFormat.format("Ogg File contains invalid ID3 Tag, skipping ID3 Tag of length:{0}", new Object[] { Long.valueOf(paramuc1.c() - l2) }));
        paramuc1.g(arrayOfByte2);
        l1 = l2;
        if (Arrays.equals(arrayOfByte2, arrayOfByte1))
          l1 = paramuc1.c() - arrayOfByte1.length; 
      } else {
        throw new CannotReadException(MessageFormat.format("OggS Header could not be found, not an ogg stream {0}", new Object[] { new String(arrayOfByte2) }));
      } 
    } 
    paramuc1.h(26L + l1);
    byte b = paramuc1.readByte();
    paramuc1.h(l1);
    arrayOfByte1 = new byte[(b & 0xFF) + 27];
    paramuc1.g(arrayOfByte1);
    OggPageHeader oggPageHeader = new OggPageHeader(arrayOfByte1);
    oggPageHeader.setStartByte(l1);
    return oggPageHeader;
  }
  
  private int u(int paramInt) {
    return paramInt & 0xFF;
  }
  
  public long getAbsoluteGranulePosition() {
    Logger logger = logger;
    StringBuilder stringBuilder = new StringBuilder("Number Of Samples: ");
    stringBuilder.append(this.absoluteGranulePosition);
    logger.fine(stringBuilder.toString());
    return this.absoluteGranulePosition;
  }
  
  public int getCheckSum() {
    return this.checksum;
  }
  
  public byte getHeaderType() {
    return this.headerTypeFlag;
  }
  
  public List<PacketStartAndLength> getPacketList() {
    return this.packetList;
  }
  
  public int getPageLength() {
    Logger logger = logger;
    StringBuilder stringBuilder = new StringBuilder("This page length: ");
    stringBuilder.append(this.pageLength);
    logger.finer(stringBuilder.toString());
    return this.pageLength;
  }
  
  public int getPageSequence() {
    return this.pageSequenceNumber;
  }
  
  public byte[] getRawHeaderData() {
    return this.rawHeaderData;
  }
  
  public byte[] getSegmentTable() {
    return this.segmentTable;
  }
  
  public int getSerialNumber() {
    return this.streamSerialNumber;
  }
  
  public long getStartByte() {
    return this.startByte;
  }
  
  public boolean isContinuedPage() {
    return this.continuedPage;
  }
  
  public boolean isFirstPage() {
    return this.firstPage;
  }
  
  public boolean isLastPacketIncomplete() {
    return this.lastPacketIncomplete;
  }
  
  public boolean isLastPage() {
    return this.lastPage;
  }
  
  public boolean isValid() {
    return this.isValid;
  }
  
  public void setChecksum(int paramInt) {
    ByteBuffer.wrap(this.rawHeaderData).order(ByteOrder.LITTLE_ENDIAN).putInt(22, paramInt);
    this.checksum = paramInt;
  }
  
  public void setPageSequence(int paramInt) {
    ByteBuffer.wrap(this.rawHeaderData).order(ByteOrder.LITTLE_ENDIAN).putInt(18, paramInt);
    this.pageSequenceNumber = paramInt;
  }
  
  public void setStartByte(long paramLong) {
    this.startByte = paramLong;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("Ogg Page Header { isValid: ");
    stringBuilder.append(this.isValid);
    stringBuilder.append(", type: ");
    stringBuilder.append(this.headerTypeFlag);
    stringBuilder.append(", oggPageHeaderLength: ");
    stringBuilder.append(this.rawHeaderData.length);
    stringBuilder.append(", length: ");
    stringBuilder.append(this.pageLength);
    stringBuilder.append(", seqNo: ");
    stringBuilder.append(getPageSequence());
    stringBuilder.append(", packetIncomplete: ");
    stringBuilder.append(isLastPacketIncomplete());
    stringBuilder.append(", serNum: ");
    stringBuilder.append(getSerialNumber());
    stringBuilder.append(" } ");
    String str = stringBuilder.toString();
    for (PacketStartAndLength packetStartAndLength : getPacketList()) {
      StringBuilder stringBuilder1 = x41.p(str);
      stringBuilder1.append(packetStartAndLength.toString());
      str = stringBuilder1.toString();
    } 
    return str;
  }
  
  public void write(ByteBuffer paramByteBuffer) {
    paramByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    paramByteBuffer.put(CAPTURE_PATTERN);
    paramByteBuffer.put(this.streamStructureRevision);
    paramByteBuffer.put(this.headerTypeFlag);
    if (this.streamStructureRevision == 0) {
      paramByteBuffer.putLong(this.absoluteGranulePosition);
      paramByteBuffer.putInt(this.streamSerialNumber);
      paramByteBuffer.putInt(this.pageSequenceNumber);
      paramByteBuffer.putInt(this.checksum);
      paramByteBuffer.put(this.pageSegments);
      paramByteBuffer.put(this.segmentTable);
    } 
  }
  
  public enum HeaderTypeFlag {
    CONTINUED_PACKET,
    END_OF_BITSTREAM,
    FRESH_PACKET((byte)0),
    START_OF_BITSTREAM((byte)0);
    
    private static final HeaderTypeFlag[] $VALUES;
    
    byte fileValue;
    
    static {
      END_OF_BITSTREAM = new HeaderTypeFlag("END_OF_BITSTREAM", 3, (byte)4);
      $VALUES = $values();
    }
    
    HeaderTypeFlag(byte param1Byte) {
      this.fileValue = param1Byte;
    }
    
    public byte getFileValue() {
      return this.fileValue;
    }
  }
  
  public static class PacketStartAndLength {
    private Integer length;
    
    private Integer startPosition;
    
    public PacketStartAndLength(int param1Int1, int param1Int2) {
      Integer integer = Integer.valueOf(0);
      this.startPosition = integer;
      this.length = integer;
      this.startPosition = Integer.valueOf(param1Int1);
      this.length = Integer.valueOf(param1Int2);
    }
    
    public int getLength() {
      return this.length.intValue();
    }
    
    public int getStartPosition() {
      return this.startPosition.intValue();
    }
    
    public void setLength(int param1Int) {
      this.length = Integer.valueOf(param1Int);
    }
    
    public void setStartPosition(int param1Int) {
      this.startPosition = Integer.valueOf(param1Int);
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder("NextPkt(start: ");
      stringBuilder.append(this.startPosition);
      stringBuilder.append(", length: ");
      stringBuilder.append(this.length);
      stringBuilder.append("),");
      return stringBuilder.toString();
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\og\\util\OggPageHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */