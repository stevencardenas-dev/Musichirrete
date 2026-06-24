package org.jaudiotagger.audio.ogg.util;

import com.google.android.material.tabs.xm.VDgS;
import java.nio.charset.Charset;

public interface VorbisHeader {
  public static final String CAPTURE_PATTERN = "vorbis";
  
  public static final byte[] CAPTURE_PATTERN_AS_BYTES;
  
  public static final int FIELD_CAPTURE_PATTERN_LENGTH;
  
  public static final int FIELD_CAPTURE_PATTERN_POS = 1;
  
  public static final int FIELD_PACKET_TYPE_LENGTH = 1;
  
  public static final int FIELD_PACKET_TYPE_POS = 0;
  
  static {
    Charset charset = Charset.forName("ISO-8859-1");
    byte[] arrayOfByte = VDgS.tnlfXPMo.getBytes(charset);
    CAPTURE_PATTERN_AS_BYTES = arrayOfByte;
    FIELD_CAPTURE_PATTERN_LENGTH = arrayOfByte.length;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\og\\util\VorbisHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */