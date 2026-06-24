package org.jaudiotagger.audio.dff;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.jaudiotagger.audio.generic.Utils;

public class FrteChunk extends BaseChunk {
  private int numFrames;
  
  private Short rate;
  
  public FrteChunk(ByteBuffer paramByteBuffer) {
    super(paramByteBuffer);
  }
  
  public int getNumFrames() {
    return this.numFrames;
  }
  
  public Short getRate() {
    return this.rate;
  }
  
  public void readDataChunch(FileChannel paramFileChannel) {
    super.readDataChunch(paramFileChannel);
    this.numFrames = Integer.reverseBytes(Utils.readFileDataIntoBufferLE(paramFileChannel, 4).getInt());
    this.rate = Short.valueOf(Short.reverseBytes(Utils.readFileDataIntoBufferLE(paramFileChannel, 2).getShort()));
    skipToChunkEnd(paramFileChannel);
  }
  
  public String toString() {
    return DffChunkType.FRTE.getCode();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\dff\FrteChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */