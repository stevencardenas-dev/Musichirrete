package org.jaudiotagger.tag.vorbiscomment.util;

import l0;
import mk;

public class Base64Coder {
  private static final char[] map1 = new char[64];
  
  private static final byte[] map2 = new byte[128];
  
  static {
    byte b2 = 0;
    while (true) {
      byte[] arrayOfByte = map2;
      b1 = bool;
      if (b2 < arrayOfByte.length) {
        arrayOfByte[b2] = -1;
        b2++;
        continue;
      } 
      break;
    } 
    while (b1 < 64) {
      map2[map1[b1]] = (byte)b1;
      b1++;
    } 
  }
  
  public static byte[] decode(String paramString) {
    return decode(paramString.toCharArray());
  }
  
  public static byte[] decode(char[] paramArrayOfchar) {
    int i = paramArrayOfchar.length;
    if (i % 4 == 0) {
      while (i > 0 && paramArrayOfchar[i - 1] == '=')
        i--; 
      int m = i * 3 / 4;
      byte[] arrayOfByte = new byte[m];
      int k = 0;
      int j = 0;
      while (k < i) {
        int i1;
        char c2 = paramArrayOfchar[k];
        int n = k + 2;
        char c1 = paramArrayOfchar[k + 1];
        if (c2 == '\r' && c1 == '\n') {
          k = n;
          continue;
        } 
        int i2 = 65;
        if (n < i) {
          k += 3;
          i1 = paramArrayOfchar[n];
          n = k;
        } else {
          i1 = 65;
        } 
        k = n;
        if (n < i) {
          i2 = paramArrayOfchar[n];
          k = n + 1;
        } 
        if (c2 <= '' && c1 <= '' && i1 <= 127 && i2 <= 127) {
          byte[] arrayOfByte1 = map2;
          n = arrayOfByte1[c2];
          byte b2 = arrayOfByte1[c1];
          byte b1 = arrayOfByte1[i1];
          i2 = arrayOfByte1[i2];
          if (n >= 0 && b2 >= 0 && b1 >= 0 && i2 >= 0) {
            i1 = j + 1;
            arrayOfByte[j] = (byte)(n << 2 | b2 >>> 4);
            n = i1;
            if (i1 < m) {
              arrayOfByte[i1] = (byte)((b2 & 0xF) << 4 | b1 >>> 2);
              n = j + 2;
            } 
            if (n < m) {
              j = n + 1;
              arrayOfByte[n] = (byte)((b1 & 0x3) << 6 | i2);
              continue;
            } 
            j = n;
            continue;
          } 
          l0.l("Illegal character in Base64 encoded data.");
          return null;
        } 
        l0.l("Illegal character in Base64 encoded data.");
        return null;
      } 
      return arrayOfByte;
    } 
    l0.l("Length of Base64 encoded input string is not a multiple of 4.");
    return null;
  }
  
  public static String encode(String paramString) {
    return new String(encode(paramString.getBytes(mk.b)));
  }
  
  public static char[] encode(byte[] paramArrayOfbyte) {
    int j = paramArrayOfbyte.length;
    int k = (j * 4 + 2) / 3;
    char[] arrayOfChar = new char[(j + 2) / 3 * 4];
    int i = 0;
    for (byte b = 0; i < j; b += 4) {
      byte b1;
      int m = i + 1;
      byte b2 = paramArrayOfbyte[i];
      if (m < j) {
        i += 2;
        m = paramArrayOfbyte[m] & 0xFF;
      } else {
        i = m;
        m = 0;
      } 
      if (i < j) {
        int i1 = i + 1;
        b1 = paramArrayOfbyte[i] & 0xFF;
        i = i1;
      } else {
        b1 = 0;
      } 
      char[] arrayOfChar1 = map1;
      arrayOfChar[b] = arrayOfChar1[(b2 & 0xFF) >>> 2];
      int n = b + 2;
      arrayOfChar[b + 1] = arrayOfChar1[(b2 & 0x3) << 4 | m >>> 4];
      char c2 = '=';
      if (n < k) {
        c1 = arrayOfChar1[(m & 0xF) << 2 | b1 >>> 6];
      } else {
        c1 = '=';
      } 
      arrayOfChar[n] = c1;
      m = b + 3;
      char c1 = c2;
      if (m < k)
        c1 = arrayOfChar1[b1 & 0x3F]; 
      arrayOfChar[m] = c1;
    } 
    return arrayOfChar;
  }
  
  static {
    boolean bool = false;
    char c = 'A';
    byte b1;
    for (b1 = 0; c <= 'Z'; b1++) {
      map1[b1] = c;
      c = (char)(c + 1);
    } 
    c = 'a';
    while (c <= 'z') {
      map1[b1] = c;
      c = (char)(c + 1);
      b1++;
    } 
    c = '0';
    while (c <= '9') {
      map1[b1] = c;
      c = (char)(c + 1);
      b1++;
    } 
    char[] arrayOfChar = map1;
    arrayOfChar[b1] = '+';
    arrayOfChar[b1 + 1] = '/';
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\org\jaudiotagger\tag\vorbiscommen\\util\Base64Coder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */