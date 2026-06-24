package org.jaudiotagger.audio.aiff;

public class ExtDouble {
  byte[] _rawData;
  
  public ExtDouble(byte[] paramArrayOfbyte) {
    this._rawData = paramArrayOfbyte;
  }
  
  public double toDouble() {
    byte[] arrayOfByte = this._rawData;
    byte b3 = arrayOfByte[0];
    byte b4 = arrayOfByte[1];
    long l = 0L;
    byte b2 = 55;
    byte b1 = 2;
    while (true) {
      arrayOfByte = this._rawData;
      if (b1 < 9) {
        l |= (arrayOfByte[b1] & 0xFFL) << b2;
        b2 -= 8;
        b1++;
        continue;
      } 
      long l1 = (arrayOfByte[9] >>> 1);
      double d2 = Math.pow(2.0D, (((b4 | b3 << 8) & 0x7FFF) - 16445)) * (l | l1);
      double d1 = d2;
      if (b3 >> 7 != 0)
        d1 = -d2; 
      return d1;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\audio\aiff\ExtDouble.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */