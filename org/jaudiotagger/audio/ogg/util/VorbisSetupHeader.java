package org.jaudiotagger.audio.ogg.util;

import java.util.logging.Level;
import java.util.logging.Logger;
import mk;

public class VorbisSetupHeader implements VorbisHeader {
  public static Logger logger;
  
  private boolean isValid = false;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.ogg.atom");
    logger = logger;
    logger.setLevel(Level.SEVERE);
  }
  
  public VorbisSetupHeader(byte[] paramArrayOfbyte) {
    decodeHeader(paramArrayOfbyte);
  }
  
  public void decodeHeader(byte[] paramArrayOfbyte) {
    byte b = paramArrayOfbyte[0];
    Logger logger = logger;
    StringBuilder stringBuilder = new StringBuilder("packetType");
    stringBuilder.append(b);
    logger.fine(stringBuilder.toString());
    String str = new String(paramArrayOfbyte, 1, VorbisHeader.FIELD_CAPTURE_PATTERN_LENGTH, mk.b);
    if (b == VorbisPacketType.SETUP_HEADER.getType() && str.equals("vorbis"))
      this.isValid = true; 
  }
  
  public boolean isValid() {
    return this.isValid;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\og\\util\VorbisSetupHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */