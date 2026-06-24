package org.jaudiotagger.audio.mp3;

import java.nio.ByteBuffer;
import mk;
import org.jaudiotagger.audio.generic.Utils;

public class LameFrame {
  public static final int ENCODER_SIZE = 9;
  
  public static final int LAME_HEADER_BUFFER_SIZE = 36;
  
  public static final String LAME_ID = "LAME";
  
  public static final int LAME_ID_SIZE = 4;
  
  private String encoder;
  
  private LameFrame(ByteBuffer paramByteBuffer) {
    this.encoder = Utils.getString(paramByteBuffer, 0, 9, mk.b);
  }
  
  public static LameFrame parseLameFrame(ByteBuffer paramByteBuffer) {
    ByteBuffer byteBuffer = paramByteBuffer.slice();
    String str = Utils.getString(byteBuffer, 0, 4, mk.b);
    byteBuffer.rewind();
    return str.equals("LAME") ? new LameFrame(byteBuffer) : null;
  }
  
  public String getEncoder() {
    return this.encoder;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\mp3\LameFrame.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */