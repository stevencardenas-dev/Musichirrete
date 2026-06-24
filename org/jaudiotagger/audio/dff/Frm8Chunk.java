package org.jaudiotagger.audio.dff;

import java.nio.ByteBuffer;
import org.jaudiotagger.audio.generic.Utils;

public class Frm8Chunk {
  public static final int CHUNKSIZE_LENGTH = 8;
  
  public static final int FRM8_HEADER_LENGTH = 12;
  
  public static final int SIGNATURE_LENGTH = 4;
  
  private Frm8Chunk(ByteBuffer paramByteBuffer) {}
  
  public static Frm8Chunk readChunk(ByteBuffer paramByteBuffer) {
    String str = Utils.readFourBytesAsChars(paramByteBuffer);
    return !DffChunkType.FRM8.getCode().equals(str) ? null : new Frm8Chunk(paramByteBuffer);
  }
  
  public String toString() {
    return DffChunkType.FRM8.getCode();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\dff\Frm8Chunk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */