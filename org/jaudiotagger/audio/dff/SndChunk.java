package org.jaudiotagger.audio.dff;

import java.nio.ByteBuffer;
import org.jaudiotagger.audio.generic.Utils;

public class SndChunk {
  public static final int CHUNKSIZE_LENGTH = 0;
  
  public static final int SIGNATURE_LENGTH = 4;
  
  public static final int SND_HEADER_LENGTH = 4;
  
  private SndChunk(ByteBuffer paramByteBuffer) {}
  
  public static SndChunk readChunk(ByteBuffer paramByteBuffer) {
    String str = Utils.readFourBytesAsChars(paramByteBuffer);
    return DffChunkType.SND.getCode().equals(str) ? new SndChunk(paramByteBuffer) : null;
  }
  
  public String toString() {
    return DffChunkType.SND.getCode();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\dff\SndChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */