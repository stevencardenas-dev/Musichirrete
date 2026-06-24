package org.jaudiotagger.audio.dff;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class EndChunk extends BaseChunk {
  private Long dataEnd;
  
  public EndChunk(ByteBuffer paramByteBuffer) {
    super(paramByteBuffer);
  }
  
  public Long getDataEnd() {
    return this.dataEnd;
  }
  
  public Long getDataStart() {
    return getChunkStart();
  }
  
  public void readDataChunch(FileChannel paramFileChannel) {
    super.readDataChunch(paramFileChannel);
    this.dataEnd = getChunkEnd();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(DffChunkType.END.getCode());
    stringBuilder.append(" (END)");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\dff\EndChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */