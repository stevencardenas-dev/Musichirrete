package org.jaudiotagger.audio.opus;

import java.nio.charset.Charset;

public interface OpusHeader {
  public static final String HEAD_CAPTURE_PATTERN = "OpusHead";
  
  public static final byte[] HEAD_CAPTURE_PATTERN_AS_BYTES;
  
  public static final int HEAD_CAPTURE_PATTERN_LENGTH;
  
  public static final int HEAD_CAPTURE_PATTERN_POS = 0;
  
  public static final String TAGS_CAPTURE_PATTERN = "OpusTags";
  
  public static final byte[] TAGS_CAPTURE_PATTERN_AS_BYTES;
  
  public static final int TAGS_CAPTURE_PATTERN_LENGTH;
  
  public static final int TAGS_CAPTURE_PATTERN_POS = 0;
  
  static {
    byte[] arrayOfByte = "OpusHead".getBytes(Charset.forName("ISO-8859-1"));
    HEAD_CAPTURE_PATTERN_AS_BYTES = arrayOfByte;
    HEAD_CAPTURE_PATTERN_LENGTH = arrayOfByte.length;
    arrayOfByte = "OpusTags".getBytes(Charset.forName("ISO-8859-1"));
    TAGS_CAPTURE_PATTERN_AS_BYTES = arrayOfByte;
    TAGS_CAPTURE_PATTERN_LENGTH = arrayOfByte.length;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\opus\OpusHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */