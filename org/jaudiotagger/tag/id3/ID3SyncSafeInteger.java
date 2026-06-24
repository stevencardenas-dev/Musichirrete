package org.jaudiotagger.tag.id3;

import java.nio.ByteBuffer;

public class ID3SyncSafeInteger {
  public static final int INTEGRAL_SIZE = 4;
  
  public static final int MAX_SAFE_SIZE = 127;
  
  public static int bufferToValue(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte = new byte[4];
    paramByteBuffer.get(arrayOfByte, 0, 4);
    return bufferToValue(arrayOfByte);
  }
  
  public static int bufferToValue(byte[] paramArrayOfbyte) {
    return ((paramArrayOfbyte[0] & 0xFF) << 21) + ((paramArrayOfbyte[1] & 0xFF) << 14) + ((paramArrayOfbyte[2] & 0xFF) << 7) + (paramArrayOfbyte[3] & 0xFF);
  }
  
  public static boolean isBufferEmpty(byte[] paramArrayOfbyte) {
    int i = paramArrayOfbyte.length;
    for (byte b = 0; b < i; b++) {
      if (paramArrayOfbyte[b] != 0)
        return false; 
    } 
    return true;
  }
  
  public static boolean isBufferNotSyncSafe(ByteBuffer paramByteBuffer) {
    int i = paramByteBuffer.position();
    for (byte b = 0; b < 4; b++) {
      if ((paramByteBuffer.get(i + b) & 0x80) > 0)
        return true; 
    } 
    return false;
  }
  
  public static byte[] valueToBuffer(int paramInt) {
    return new byte[] { (byte)((0xFE00000 & paramInt) >> 21), (byte)((0x1FC000 & paramInt) >> 14), (byte)((paramInt & 0x3F80) >> 7), (byte)(paramInt & 0x7F) };
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\id3\ID3SyncSafeInteger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */