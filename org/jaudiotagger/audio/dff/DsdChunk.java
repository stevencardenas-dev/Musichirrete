package org.jaudiotagger.audio.dff;

import java.nio.ByteBuffer;
import org.jaudiotagger.audio.dsf.DsfChunkType;
import org.jaudiotagger.audio.generic.Utils;

public class DsdChunk {
  public static final int CHUNKSIZE_LENGTH = 8;
  
  public static final int DSD_HEADER_LENGTH = 8;
  
  public static final int SIGNATURE_LENGTH = 4;
  
  private DsdChunk(ByteBuffer paramByteBuffer) {}
  
  public static DsdChunk readChunk(ByteBuffer paramByteBuffer) {
    String str = Utils.readFourBytesAsChars(paramByteBuffer);
    return DsfChunkType.DSD.getCode().equals(str) ? new DsdChunk(paramByteBuffer) : null;
  }
  
  public String toString() {
    return DffChunkType.DSD.getCode();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\dff\DsdChunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */