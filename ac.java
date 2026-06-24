public abstract class ac {
  public static final char[] a = new char[64];
  
  public static final byte[] b = new byte[128];
  
  static {
    b1 = 0;
    while (true) {
      byte[] arrayOfByte = b;
      b2 = b3;
      if (b1 < arrayOfByte.length) {
        arrayOfByte[b1] = -1;
        b1++;
        continue;
      } 
      break;
    } 
    while (b2 < 64) {
      b[a[b2]] = (byte)b2;
      b2++;
    } 
  }
  
  public static String a(String paramString) {
    char[] arrayOfChar = paramString.toCharArray();
    int m = arrayOfChar.length;
    int k = m * 3 / 4;
    byte[] arrayOfByte = new byte[k];
    int j = 0;
    for (int i = 0; j < m; i = n) {
      char c2 = arrayOfChar[j];
      int n = j + 2;
      char c1 = arrayOfChar[j + 1];
      if (c2 == '\r' && c1 == '\n') {
        j = n;
        continue;
      } 
      int i2 = 65;
      if (n < m) {
        j += 3;
        i1 = arrayOfChar[n];
        n = j;
      } else {
        i1 = 65;
      } 
      j = n;
      if (n < m) {
        i2 = arrayOfChar[n];
        j = n + 1;
      } 
      if (c2 > '' || c1 > '' || i1 > 127 || i2 > 127)
        break; 
      byte[] arrayOfByte1 = b;
      n = arrayOfByte1[c2];
      byte b2 = arrayOfByte1[c1];
      byte b1 = arrayOfByte1[i1];
      i2 = arrayOfByte1[i2];
      if (n < 0 || b2 < 0 || b1 < 0 || i2 < 0)
        break; 
      int i1 = i + 1;
      arrayOfByte[i] = (byte)(n << 2 | b2 >>> 4);
      n = i1;
      if (i1 < k) {
        arrayOfByte[i1] = (byte)((b2 & 0xF) << 4 | b1 >>> 2);
        n = i + 2;
      } 
      if (n < k) {
        i = n + 1;
        arrayOfByte[n] = (byte)((b1 & 0x3) << 6 | i2);
        continue;
      } 
    } 
    return new String(arrayOfByte, mk.c);
  }
  
  static {
    byte b2;
  }
  
  static {
    byte b3 = 0;
    char c = 'A';
    byte b1;
    for (b1 = 0; c <= 'Z'; b1++) {
      a[b1] = c;
      c = (char)(c + 1);
    } 
    c = 'a';
    while (c <= 'z') {
      a[b1] = c;
      c = (char)(c + 1);
      b1++;
    } 
    c = '0';
    while (c <= '9') {
      a[b1] = c;
      c = (char)(c + 1);
      b1++;
    } 
    char[] arrayOfChar = a;
    arrayOfChar[b1] = '+';
    arrayOfChar[b1 + 1] = '/';
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */