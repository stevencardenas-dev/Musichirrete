package org.jaudiotagger.audio.dff;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import mk;
import org.jaudiotagger.audio.generic.Utils;

public class CmprChunk extends BaseChunk {
  private String compression;
  
  private String description;
  
  public CmprChunk(ByteBuffer paramByteBuffer) {
    super(paramByteBuffer);
  }
  
  public String getCompression() {
    return this.compression;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void readDataChunch(FileChannel paramFileChannel) {
    super.readDataChunch(paramFileChannel);
    this.compression = Utils.readFourBytesAsChars(Utils.readFileDataIntoBufferLE(paramFileChannel, 4));
    int i = Utils.readFileDataIntoBufferLE(paramFileChannel, 1).get() & 0xFF;
    ByteBuffer byteBuffer = Utils.readFileDataIntoBufferLE(paramFileChannel, i);
    byte[] arrayOfByte = new byte[i];
    byteBuffer.get(arrayOfByte);
    this.description = new String(arrayOfByte, mk.b);
    skipToChunkEnd(paramFileChannel);
  }
  
  public String toString() {
    return DffChunkType.CMPR.getCode();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\dff\CmprChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */