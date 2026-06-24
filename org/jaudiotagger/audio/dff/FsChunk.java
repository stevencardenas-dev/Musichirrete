package org.jaudiotagger.audio.dff;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.jaudiotagger.audio.generic.Utils;

public class FsChunk extends BaseChunk {
  private int sampleRate;
  
  public FsChunk(ByteBuffer paramByteBuffer) {
    super(paramByteBuffer);
  }
  
  public int getSampleRate() {
    return this.sampleRate;
  }
  
  public void readDataChunch(FileChannel paramFileChannel) {
    super.readDataChunch(paramFileChannel);
    this.sampleRate = Integer.reverseBytes(Utils.readFileDataIntoBufferLE(paramFileChannel, 4).getInt());
    skipToChunkEnd(paramFileChannel);
  }
  
  public String toString() {
    return DffChunkType.FS.getCode();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\dff\FsChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */