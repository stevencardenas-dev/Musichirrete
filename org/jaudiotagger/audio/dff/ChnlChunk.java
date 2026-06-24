package org.jaudiotagger.audio.dff;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.jaudiotagger.audio.generic.Utils;

public class ChnlChunk extends BaseChunk {
  String[] IDs;
  
  private short numChannels;
  
  public ChnlChunk(ByteBuffer paramByteBuffer) {
    super(paramByteBuffer);
  }
  
  public Short getNumChannels() {
    return Short.valueOf(this.numChannels);
  }
  
  public void readDataChunch(FileChannel paramFileChannel) {
    super.readDataChunch(paramFileChannel);
    short s = Short.reverseBytes(Utils.readFileDataIntoBufferLE(paramFileChannel, 2).getShort());
    this.numChannels = s;
    this.IDs = new String[s];
    for (byte b = 0; b < this.numChannels; b++) {
      ByteBuffer byteBuffer = Utils.readFileDataIntoBufferLE(paramFileChannel, 4);
      this.IDs[b] = Utils.readFourBytesAsChars(byteBuffer);
    } 
    skipToChunkEnd(paramFileChannel);
  }
  
  public String toString() {
    return DffChunkType.CHNL.getCode();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\dff\ChnlChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */