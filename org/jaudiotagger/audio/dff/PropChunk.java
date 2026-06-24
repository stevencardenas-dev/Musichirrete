package org.jaudiotagger.audio.dff;

import java.nio.ByteBuffer;
import org.jaudiotagger.audio.generic.Utils;

public class PropChunk {
  public static final int CHUNKSIZE_LENGTH = 8;
  
  public static final int PROP_HEADER_LENGTH = 12;
  
  public static final int SIGNATURE_LENGTH = 4;
  
  private PropChunk(ByteBuffer paramByteBuffer) {}
  
  public static PropChunk readChunk(ByteBuffer paramByteBuffer) {
    String str = Utils.readFourBytesAsChars(paramByteBuffer);
    return DffChunkType.PROP.getCode().equals(str) ? new PropChunk(paramByteBuffer) : null;
  }
  
  public String toString() {
    return DffChunkType.PROP.getCode();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\dff\PropChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */