package org.jaudiotagger.audio.flac.metadatablock;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import m60;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import x41;

public class MetadataBlockHeader {
  public static final int BLOCK_LENGTH = 3;
  
  public static final int BLOCK_TYPE_LENGTH = 1;
  
  public static final int HEADER_LENGTH = 4;
  
  public static Logger logger;
  
  private BlockType blockType;
  
  private byte[] bytes;
  
  private int dataLength;
  
  private boolean isLastBlock;
  
  private long startByte;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.flac");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public MetadataBlockHeader(long paramLong, ByteBuffer paramByteBuffer) {
    boolean bool;
    this.startByte = paramLong;
    byte b = 0;
    if ((paramByteBuffer.get(0) & 0x80) >>> 7 == 1) {
      bool = true;
    } else {
      bool = false;
    } 
    this.isLastBlock = bool;
    int i = paramByteBuffer.get(0) & Byte.MAX_VALUE;
    if (i < (BlockType.values()).length) {
      this.blockType = BlockType.values()[i];
      this.dataLength = (u(paramByteBuffer.get(1)) << 16) + (u(paramByteBuffer.get(2)) << 8) + u(paramByteBuffer.get(3));
      this.bytes = new byte[4];
      while (b < 4) {
        this.bytes[b] = paramByteBuffer.get(b);
        b++;
      } 
      return;
    } 
    throw new CannotReadException(MessageFormat.format("Flac file has invalid block type {0}", new Object[] { Integer.valueOf(i) }));
  }
  
  public MetadataBlockHeader(boolean paramBoolean, BlockType paramBlockType, int paramInt) {
    int i;
    ByteBuffer byteBuffer = ByteBuffer.allocate(4);
    this.blockType = paramBlockType;
    this.isLastBlock = paramBoolean;
    this.dataLength = paramInt;
    if (paramBoolean) {
      i = paramBlockType.getId() | 0x80;
    } else {
      i = paramBlockType.getId();
    } 
    byte b = (byte)i;
    byteBuffer.put(b);
    byteBuffer.put((byte)((0xFF0000 & paramInt) >>> 16));
    byteBuffer.put((byte)((0xFF00 & paramInt) >>> 8));
    byteBuffer.put((byte)(paramInt & 0xFF));
    this.bytes = new byte[4];
    for (paramInt = 0; paramInt < 4; paramInt++)
      this.bytes[paramInt] = byteBuffer.get(paramInt); 
  }
  
  public static MetadataBlockHeader readHeader(FileChannel paramFileChannel) {
    ByteBuffer byteBuffer = ByteBuffer.allocate(4);
    long l = paramFileChannel.position();
    int i = paramFileChannel.read(byteBuffer);
    if (i >= 4) {
      byteBuffer.rewind();
      return new MetadataBlockHeader(l, byteBuffer);
    } 
    m60.i(x41.i(i, "Unable to read required number of databytes read:", ":required:4"));
    return null;
  }
  
  private int u(int paramInt) {
    return paramInt & 0xFF;
  }
  
  public BlockType getBlockType() {
    return this.blockType;
  }
  
  public byte[] getBytes() {
    return this.bytes;
  }
  
  public byte[] getBytesWithLastBlockFlag() {
    byte[] arrayOfByte = this.bytes;
    arrayOfByte[0] = (byte)(arrayOfByte[0] | 0x80);
    return arrayOfByte;
  }
  
  public byte[] getBytesWithoutIsLastBlockFlag() {
    byte[] arrayOfByte = this.bytes;
    arrayOfByte[0] = (byte)(arrayOfByte[0] & Byte.MAX_VALUE);
    return arrayOfByte;
  }
  
  public int getDataLength() {
    return this.dataLength;
  }
  
  public boolean isLastBlock() {
    return this.isLastBlock;
  }
  
  public String toString() {
    return String.format("StartByte:%d BlockType:%s DataLength:%d isLastBlock:%s", new Object[] { Long.valueOf(this.startByte), this.blockType, Integer.valueOf(this.dataLength), Boolean.valueOf(this.isLastBlock) });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\flac\metadatablock\MetadataBlockHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */