package org.jaudiotagger.audio.dsf;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import mk;
import org.jaudiotagger.audio.generic.Utils;
import org.jaudiotagger.audio.iff.IffHeaderChunk;

public class DsdChunk {
  public static final int CHUNKSIZE_LENGTH = 8;
  
  public static final int DSD_HEADER_LENGTH = IffHeaderChunk.SIGNATURE_LENGTH + 24;
  
  public static final int FILESIZE_LENGTH = 8;
  
  public static final int FMT_CHUNK_MIN_DATA_SIZE_ = 40;
  
  public static final int METADATA_OFFSET_LENGTH = 8;
  
  private long chunkSizeLength;
  
  private long fileLength;
  
  private long metadataOffset;
  
  private DsdChunk(ByteBuffer paramByteBuffer) {
    this.chunkSizeLength = paramByteBuffer.getLong();
    this.fileLength = paramByteBuffer.getLong();
    this.metadataOffset = paramByteBuffer.getLong();
  }
  
  public static DsdChunk readChunk(ByteBuffer paramByteBuffer) {
    String str = Utils.readFourBytesAsChars(paramByteBuffer);
    return DsfChunkType.DSD.getCode().equals(str) ? new DsdChunk(paramByteBuffer) : null;
  }
  
  public long getChunkSizeLength() {
    return this.chunkSizeLength;
  }
  
  public long getFileLength() {
    return this.fileLength;
  }
  
  public long getMetadataOffset() {
    return this.metadataOffset;
  }
  
  public void setChunkSizeLength(long paramLong) {
    this.chunkSizeLength = paramLong;
  }
  
  public void setFileLength(long paramLong) {
    this.fileLength = paramLong;
  }
  
  public void setMetadataOffset(long paramLong) {
    this.metadataOffset = paramLong;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("ChunkSize:");
    stringBuilder.append(this.chunkSizeLength);
    stringBuilder.append(":fileLength:");
    stringBuilder.append(this.fileLength);
    stringBuilder.append(":metadata:");
    stringBuilder.append(this.metadataOffset);
    return stringBuilder.toString();
  }
  
  public ByteBuffer write() {
    ByteBuffer byteBuffer = ByteBuffer.allocateDirect(DSD_HEADER_LENGTH);
    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    byteBuffer.put(DsfChunkType.DSD.getCode().getBytes(mk.a));
    byteBuffer.putLong(this.chunkSizeLength);
    byteBuffer.putLong(this.fileLength);
    byteBuffer.putLong(this.metadataOffset);
    byteBuffer.flip();
    return byteBuffer;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\dsf\DsdChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */