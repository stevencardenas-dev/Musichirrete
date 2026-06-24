package org.jaudiotagger.audio.ogg.util;

import java.util.logging.Level;
import java.util.logging.Logger;

public class OggCRCFactory {
  private static long[] crc_lookup;
  
  private static boolean init;
  
  public static Logger logger;
  
  static {
    Logger logger = Logger.getLogger("org.jaudiotagger.audio.ogg");
    logger = logger;
    logger.setLevel(Level.SEVERE);
    crc_lookup = new long[256];
    init = false;
  }
  
  public static byte[] computeCRC(byte[] paramArrayOfbyte) {
    if (!init)
      init(); 
    int i = paramArrayOfbyte.length;
    long l = 0L;
    for (byte b = 0; b < i; b++) {
      int j = (int)(l >>> 24L & 0xFFL ^ u(paramArrayOfbyte[b]));
      l = l << 8L ^ crc_lookup[j];
    } 
    return new byte[] { (byte)(int)(l & 0xFFL), (byte)(int)(l >>> 8L & 0xFFL), (byte)(int)(l >>> 16L & 0xFFL), (byte)(int)(l >>> 24L & 0xFFL) };
  }
  
  public static void init() {
    for (byte b = 0; b < 'Ā'; b++) {
      long l = (b << 24);
      for (byte b1 = 0; b1 < 8; b1++) {
        if ((0x80000000L & l) != 0L) {
          l = l << 1L ^ 0x4C11DB7L;
        } else {
          l <<= 1L;
        } 
      } 
      crc_lookup[b] = l;
    } 
    init = true;
  }
  
  private static int u(int paramInt) {
    return paramInt & 0xFF;
  }
  
  public boolean checkCRC(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2) {
    return (new String(paramArrayOfbyte2)).equals(new String(computeCRC(paramArrayOfbyte1)));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\og\\util\OggCRCFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */