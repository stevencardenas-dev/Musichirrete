package org.jaudiotagger.audio.iff;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import mk;
import org.jaudiotagger.audio.generic.Utils;
import uc1;

public class ChunkHeader {
  public static final int CHUNK_HEADER_SIZE = 8;
  
  private ByteOrder byteOrder;
  
  private String chunkId;
  
  private long size;
  
  private long startLocationInFile;
  
  public ChunkHeader(ByteOrder paramByteOrder) {
    this.byteOrder = paramByteOrder;
  }
  
  private static long toUnsignedLong2(int paramInt) {
    return paramInt & 0xFFFFFFFFL;
  }
  
  public String getID() {
    return this.chunkId;
  }
  
  public long getSize() {
    return this.size;
  }
  
  public long getStartLocationInFile() {
    return this.startLocationInFile;
  }
  
  public boolean readHeader(FileChannel paramFileChannel) {
    ByteBuffer byteBuffer = ByteBuffer.allocate(8);
    this.startLocationInFile = paramFileChannel.position();
    paramFileChannel.read(byteBuffer);
    byteBuffer.order(this.byteOrder);
    byteBuffer.position(0);
    this.chunkId = Utils.readFourBytesAsChars(byteBuffer);
    this.size = toUnsignedLong2(byteBuffer.getInt());
    return true;
  }
  
  public boolean readHeader(uc1 paramuc1) {
    ByteBuffer byteBuffer = ByteBuffer.allocate(8);
    this.startLocationInFile = paramuc1.c();
    paramuc1.a().read(byteBuffer);
    byteBuffer.order(this.byteOrder);
    byteBuffer.position(0);
    this.chunkId = Utils.readFourBytesAsChars(byteBuffer);
    this.size = byteBuffer.getInt() & 0xFFFFFFFFL;
    return true;
  }
  
  public void setID(String paramString) {
    this.chunkId = paramString;
  }
  
  public void setSize(long paramLong) {
    this.size = paramLong;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(getID());
    stringBuilder.append(":Size:");
    stringBuilder.append(getSize());
    stringBuilder.append("startLocation:");
    stringBuilder.append(getStartLocationInFile());
    return stringBuilder.toString();
  }
  
  public ByteBuffer writeHeader() {
    ByteBuffer byteBuffer = ByteBuffer.allocate(8);
    byteBuffer.order(this.byteOrder);
    byteBuffer.put(this.chunkId.getBytes(mk.a));
    byteBuffer.putInt((int)this.size);
    byteBuffer.flip();
    return byteBuffer;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\iff\ChunkHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */