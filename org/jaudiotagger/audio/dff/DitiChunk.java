package org.jaudiotagger.audio.dff;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class DitiChunk extends BaseChunk {
  public DitiChunk(ByteBuffer paramByteBuffer) {
    super(paramByteBuffer);
  }
  
  public void readDataChunch(FileChannel paramFileChannel) {
    super.readDataChunch(paramFileChannel);
  }
  
  public String toString() {
    return DffChunkType.DITI.getCode();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\dff\DitiChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */