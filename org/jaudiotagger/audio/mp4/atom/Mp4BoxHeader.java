package org.jaudiotagger.audio.mp4.atom;

import com.google.android.gms.common.util.DyJ.oXrNDUqUkE;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.text.MessageFormat;
import java.util.logging.Logger;
import k91;
import l0;
import mk;
import org.jaudiotagger.audio.exceptions.NullBoxIdException;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;
import x41;

public class Mp4BoxHeader {
  public static final String CHARSET_UTF_8 = "UTF-8";
  
  public static final int DATA_64BITLENGTH = 8;
  
  public static final int HEADER_LENGTH = 8;
  
  public static final int IDENTIFIER_LENGTH = 4;
  
  public static final int IDENTIFIER_POS = 4;
  
  public static final int OFFSET_LENGTH = 4;
  
  public static final int OFFSET_POS = 0;
  
  public static final int REALDATA_64BITLENGTH = 16;
  
  public static Logger logger = Logger.getLogger("org.jaudiotagger.audio.mp4.atom");
  
  protected ByteBuffer dataBuffer;
  
  private long filePos;
  
  private String id;
  
  protected int length;
  
  public Mp4BoxHeader() {}
  
  public Mp4BoxHeader(String paramString) {
    if (paramString.length() == 4) {
      ByteBuffer byteBuffer = ByteBuffer.allocate(8);
      this.dataBuffer = byteBuffer;
      try {
        this.id = paramString;
        byteBuffer.put(4, paramString.getBytes("ISO-8859-1")[0]);
        this.dataBuffer.put(5, paramString.getBytes("ISO-8859-1")[1]);
        this.dataBuffer.put(6, paramString.getBytes("ISO-8859-1")[2]);
        this.dataBuffer.put(7, paramString.getBytes("ISO-8859-1")[3]);
        return;
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        k91.n(unsupportedEncodingException);
        throw null;
      } 
    } 
    l0.f(fXMDNeMWaILNVh.nokTirL);
    throw null;
  }
  
  public Mp4BoxHeader(ByteBuffer paramByteBuffer) {
    update(paramByteBuffer);
  }
  
  public static Mp4BoxHeader seekWithinLevel(ByteBuffer paramByteBuffer, String paramString) {
    Logger logger = logger;
    StringBuilder stringBuilder = x41.q("Started searching for:", paramString, " in bytebuffer at");
    stringBuilder.append(paramByteBuffer.position());
    logger.finer(stringBuilder.toString());
    Mp4BoxHeader mp4BoxHeader = new Mp4BoxHeader();
    if (paramByteBuffer.remaining() >= 8) {
      mp4BoxHeader.update(paramByteBuffer);
      while (!mp4BoxHeader.getId().equals(paramString)) {
        Logger logger1 = logger;
        StringBuilder stringBuilder2 = new StringBuilder("Found:");
        stringBuilder2.append(mp4BoxHeader.getId());
        stringBuilder2.append(" Still searching for:");
        stringBuilder2.append(paramString);
        stringBuilder2.append(" in bytebuffer at");
        stringBuilder2.append(paramByteBuffer.position());
        logger1.finer(stringBuilder2.toString());
        if (mp4BoxHeader.getLength() < 8)
          return null; 
        if (paramByteBuffer.remaining() < mp4BoxHeader.getLength() - 8)
          return null; 
        int i = paramByteBuffer.position();
        paramByteBuffer.position(mp4BoxHeader.getLength() - 8 + i);
        if (paramByteBuffer.remaining() >= 8) {
          mp4BoxHeader.update(paramByteBuffer);
          continue;
        } 
        return null;
      } 
      logger = logger;
      StringBuilder stringBuilder1 = x41.q("Found:", paramString, " in bytebuffer at");
      stringBuilder1.append(paramByteBuffer.position());
      logger.finer(stringBuilder1.toString());
      return mp4BoxHeader;
    } 
    return null;
  }
  
  public static Mp4BoxHeader seekWithinLevel(FileChannel paramFileChannel, String paramString) {
    Logger logger = logger;
    StringBuilder stringBuilder = x41.q("Started searching for:", paramString, " in file at:");
    stringBuilder.append(paramFileChannel.position());
    logger.finer(stringBuilder.toString());
    Mp4BoxHeader mp4BoxHeader = new Mp4BoxHeader();
    ByteBuffer byteBuffer = ByteBuffer.allocate(8);
    if (paramFileChannel.read(byteBuffer) != 8)
      return null; 
    byteBuffer.rewind();
    mp4BoxHeader.update(byteBuffer);
    while (!mp4BoxHeader.getId().equals(paramString)) {
      Logger logger2 = logger;
      StringBuilder stringBuilder1 = new StringBuilder("Found:");
      stringBuilder1.append(mp4BoxHeader.getId());
      stringBuilder1.append(" Still searching for:");
      stringBuilder1.append(paramString);
      stringBuilder1.append(" in file at:");
      stringBuilder1.append(paramFileChannel.position());
      logger2.finer(stringBuilder1.toString());
      if (mp4BoxHeader.getLength() == 1) {
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(8);
        byteBuffer1.order(ByteOrder.BIG_ENDIAN);
        if (paramFileChannel.read(byteBuffer1) != 8)
          return null; 
        byteBuffer1.rewind();
        long l = byteBuffer1.getLong();
        if (l < 8L)
          return null; 
        paramFileChannel.position(paramFileChannel.position() + l - 16L);
        logger2 = logger;
        StringBuilder stringBuilder3 = new StringBuilder("Skipped 64bit data length, now at:");
        stringBuilder3.append(paramFileChannel.position());
        logger2.severe(stringBuilder3.toString());
      } else {
        if (mp4BoxHeader.getLength() < 8)
          return null; 
        paramFileChannel.position(paramFileChannel.position() + mp4BoxHeader.getDataLength());
      } 
      if (paramFileChannel.position() > paramFileChannel.size())
        return null; 
      byteBuffer.rewind();
      int i = paramFileChannel.read(byteBuffer);
      Logger logger1 = logger;
      StringBuilder stringBuilder2 = new StringBuilder("Header Bytes Read:");
      stringBuilder2.append(i);
      logger1.finer(stringBuilder2.toString());
      byteBuffer.rewind();
      if (i == 8) {
        mp4BoxHeader.update(byteBuffer);
        continue;
      } 
      return null;
    } 
    return mp4BoxHeader;
  }
  
  public int getDataLength() {
    return this.length - 8;
  }
  
  public Charset getEncoding() {
    return mk.c;
  }
  
  public long getFileEndPos() {
    return this.filePos + this.length;
  }
  
  public long getFilePos() {
    return this.filePos;
  }
  
  public ByteBuffer getHeaderData() {
    this.dataBuffer.rewind();
    return this.dataBuffer;
  }
  
  public String getId() {
    return this.id;
  }
  
  public int getLength() {
    return this.length;
  }
  
  public void setFilePos(long paramLong) {
    this.filePos = paramLong;
  }
  
  public void setId(int paramInt) {
    byte[] arrayOfByte = Utils.getSizeBEInt32(paramInt);
    this.dataBuffer.put(5, arrayOfByte[0]);
    this.dataBuffer.put(6, arrayOfByte[1]);
    this.dataBuffer.put(7, arrayOfByte[2]);
    this.dataBuffer.put(8, arrayOfByte[3]);
    this.length = paramInt;
  }
  
  public void setLength(int paramInt) {
    byte[] arrayOfByte = Utils.getSizeBEInt32(paramInt);
    this.dataBuffer.put(0, arrayOfByte[0]);
    this.dataBuffer.put(1, arrayOfByte[1]);
    this.dataBuffer.put(2, arrayOfByte[2]);
    this.dataBuffer.put(3, arrayOfByte[3]);
    this.length = paramInt;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("Box ");
    stringBuilder.append(this.id);
    stringBuilder.append(oXrNDUqUkE.bIeS);
    stringBuilder.append(this.length);
    stringBuilder.append(":filepos:");
    stringBuilder.append(this.filePos);
    return stringBuilder.toString();
  }
  
  public void update(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte = new byte[8];
    paramByteBuffer.get(arrayOfByte);
    paramByteBuffer = ByteBuffer.wrap(arrayOfByte);
    this.dataBuffer = paramByteBuffer;
    paramByteBuffer.order(ByteOrder.BIG_ENDIAN);
    this.length = this.dataBuffer.getInt();
    this.id = Utils.readFourBytesAsChars(this.dataBuffer);
    Logger logger = logger;
    StringBuilder stringBuilder = new StringBuilder("Mp4BoxHeader id:");
    stringBuilder.append(this.id);
    stringBuilder.append(":length:");
    stringBuilder.append(this.length);
    logger.finest(stringBuilder.toString());
    if (!this.id.equals("\000\000\000\000")) {
      int i = this.length;
      if (i >= 8 || i == 1)
        return; 
      throw new NullBoxIdException(MessageFormat.format("Unable to find next atom because identifier is invalid {0}", new Object[] { this.id, Integer.valueOf(i) }));
    } 
    throw new NullBoxIdException(MessageFormat.format("Unable to find next atom because identifier is invalid {0}", new Object[] { this.id }));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp4\atom\Mp4BoxHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */