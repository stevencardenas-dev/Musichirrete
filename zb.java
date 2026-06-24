public final class zb {
  public static final byte[] f = new byte[] { 
      65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
      75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
      85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
      101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
      111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
      121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
      56, 57, 43, 47 };
  
  public static final byte[] g = new byte[] { 
      65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
      75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
      85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
      101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
      111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
      121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
      56, 57, 45, 95 };
  
  public static final byte[] h = new byte[] { 
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
      -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 
      54, 55, 56, 57, 58, 59, 60, 61, -1, -1, 
      -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 
      5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
      15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
      25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 
      29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
      39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
      49, 50, 51 };
  
  public final int a = 0;
  
  public final byte[] b = g;
  
  public final byte[] c = null;
  
  public final int d = 4 - 1;
  
  public final int e = 4;
  
  public zb(int paramInt) {}
  
  public static byte[] e(int paramInt, bd parambd) {
    byte[] arrayOfByte = (byte[])parambd.g;
    if (arrayOfByte == null || arrayOfByte.length < parambd.b + paramInt) {
      if (arrayOfByte == null) {
        parambd.g = new byte[8192];
        parambd.b = 0;
        parambd.c = 0;
      } else {
        byte[] arrayOfByte1 = new byte[arrayOfByte.length * 2];
        System.arraycopy(arrayOfByte, 0, arrayOfByte1, 0, arrayOfByte.length);
        parambd.g = arrayOfByte1;
      } 
      return (byte[])parambd.g;
    } 
    return arrayOfByte;
  }
  
  public static void f(byte[] paramArrayOfbyte, int paramInt, bd parambd) {
    if ((byte[])parambd.g != null) {
      paramInt = Math.min(parambd.b - parambd.c, paramInt);
      System.arraycopy(parambd.g, parambd.c, paramArrayOfbyte, 0, paramInt);
      paramInt = parambd.c + paramInt;
      parambd.c = paramInt;
      if (paramInt >= parambd.b)
        parambd.g = null; 
    } 
  }
  
  public final void a(byte[] paramArrayOfbyte, int paramInt, bd parambd) {
    if (!parambd.e) {
      int k;
      if (paramInt < 0)
        parambd.e = true; 
      int j = 0;
      int i = 0;
      while (true) {
        k = this.d;
        if (j < paramInt) {
          byte[] arrayOfByte = e(k, parambd);
          byte b = paramArrayOfbyte[i];
          if (b == 61) {
            parambd.e = true;
            break;
          } 
          if (b >= 0 && b < 123) {
            b = h[b];
            if (b >= 0) {
              k = (parambd.f + 1) % 4;
              parambd.f = k;
              int m = (parambd.a << 6) + b;
              parambd.a = m;
              if (k == 0) {
                k = parambd.b;
                int i1 = k + 1;
                parambd.b = i1;
                arrayOfByte[k] = (byte)(m >> 16 & 0xFF);
                int n = k + 2;
                parambd.b = n;
                arrayOfByte[i1] = (byte)(m >> 8 & 0xFF);
                parambd.b = k + 3;
                arrayOfByte[n] = (byte)(m & 0xFF);
              } 
            } 
          } 
          j++;
          i++;
          continue;
        } 
        break;
      } 
      if (parambd.e && parambd.f != 0) {
        paramArrayOfbyte = e(k, parambd);
        paramInt = parambd.f;
        if (paramInt != 1) {
          if (paramInt != 2) {
            if (paramInt == 3) {
              i = parambd.a;
              int m = i >> 2;
              parambd.a = m;
              j = parambd.b;
              paramInt = j + 1;
              parambd.b = paramInt;
              paramArrayOfbyte[j] = (byte)(i >> 10 & 0xFF);
              parambd.b = j + 2;
              paramArrayOfbyte[paramInt] = (byte)(m & 0xFF);
              return;
            } 
            tp.f("");
            return;
          } 
          paramInt = parambd.a >> 4;
          parambd.a = paramInt;
          i = parambd.b;
          parambd.b = i + 1;
          paramArrayOfbyte[i] = (byte)(paramInt & 0xFF);
        } 
      } 
    } 
  }
  
  public final byte[] b(String paramString) {
    byte[] arrayOfByte2 = zo2.p(paramString, "UTF-8");
    byte[] arrayOfByte1 = arrayOfByte2;
    if (arrayOfByte2 != null)
      if (arrayOfByte2.length == 0) {
        arrayOfByte1 = arrayOfByte2;
      } else {
        Object object = new Object();
        a(arrayOfByte2, arrayOfByte2.length, (bd)object);
        a(arrayOfByte2, -1, (bd)object);
        int i = ((bd)object).b;
        arrayOfByte1 = new byte[i];
        f(arrayOfByte1, i, (bd)object);
      }  
    return arrayOfByte1;
  }
  
  public final void c(byte[] paramArrayOfbyte, int paramInt, bd parambd) {
    if (!parambd.e) {
      int j = this.e;
      byte[] arrayOfByte1 = this.b;
      int i = this.a;
      byte[] arrayOfByte2 = this.c;
      if (paramInt < 0) {
        parambd.e = true;
        if (parambd.f != 0 || i != 0) {
          paramArrayOfbyte = e(j, parambd);
          paramInt = parambd.b;
          int k = parambd.f;
          if (k != 0) {
            byte[] arrayOfByte = f;
            if (k != 1) {
              if (k == 2) {
                int i1 = paramInt + 1;
                parambd.b = i1;
                int n = parambd.a;
                paramArrayOfbyte[paramInt] = arrayOfByte1[n >> 10 & 0x3F];
                k = paramInt + 2;
                parambd.b = k;
                paramArrayOfbyte[i1] = arrayOfByte1[n >> 4 & 0x3F];
                i1 = paramInt + 3;
                parambd.b = i1;
                paramArrayOfbyte[k] = arrayOfByte1[n << 2 & 0x3F];
                if (arrayOfByte1 == arrayOfByte) {
                  parambd.b = paramInt + 4;
                  paramArrayOfbyte[i1] = 61;
                } 
              } else {
                tp.f("");
                return;
              } 
            } else {
              int i1 = paramInt + 1;
              parambd.b = i1;
              int n = parambd.a;
              paramArrayOfbyte[paramInt] = arrayOfByte1[n >> 2 & 0x3F];
              k = paramInt + 2;
              parambd.b = k;
              paramArrayOfbyte[i1] = arrayOfByte1[n << 4 & 0x3F];
              if (arrayOfByte1 == arrayOfByte) {
                n = paramInt + 3;
                parambd.b = n;
                paramArrayOfbyte[k] = 61;
                parambd.b = paramInt + 4;
                paramArrayOfbyte[n] = 61;
              } 
            } 
          } 
          int m = parambd.d;
          k = parambd.b;
          paramInt = k - paramInt + m;
          parambd.d = paramInt;
          if (i > 0 && paramInt > 0) {
            System.arraycopy(arrayOfByte2, 0, paramArrayOfbyte, k, arrayOfByte2.length);
            parambd.b += arrayOfByte2.length;
            return;
          } 
        } 
      } else {
        byte b2 = 0;
        for (byte b1 = 0; b2 < paramInt; b1++) {
          byte[] arrayOfByte = e(j, parambd);
          int m = (parambd.f + 1) % 3;
          parambd.f = m;
          byte b = paramArrayOfbyte[b1];
          int k = b;
          if (b < 0)
            k = b + 256; 
          k = (parambd.a << 8) + k;
          parambd.a = k;
          if (m == 0) {
            int i1 = parambd.b;
            int n = i1 + 1;
            parambd.b = n;
            arrayOfByte[i1] = arrayOfByte1[k >> 18 & 0x3F];
            m = i1 + 2;
            parambd.b = m;
            arrayOfByte[n] = arrayOfByte1[k >> 12 & 0x3F];
            n = i1 + 3;
            parambd.b = n;
            arrayOfByte[m] = arrayOfByte1[k >> 6 & 0x3F];
            m = i1 + 4;
            parambd.b = m;
            arrayOfByte[n] = arrayOfByte1[k & 0x3F];
            k = parambd.d + 4;
            parambd.d = k;
            if (i > 0 && i <= k) {
              System.arraycopy(arrayOfByte2, 0, arrayOfByte, m, arrayOfByte2.length);
              parambd.b += arrayOfByte2.length;
              parambd.d = 0;
            } 
          } 
          b2++;
        } 
      } 
    } 
  }
  
  public final String d(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = paramArrayOfbyte;
    if (paramArrayOfbyte != null)
      if (paramArrayOfbyte.length == 0) {
        arrayOfByte = paramArrayOfbyte;
      } else {
        Object object = new Object();
        c(paramArrayOfbyte, paramArrayOfbyte.length, (bd)object);
        c(paramArrayOfbyte, -1, (bd)object);
        int i = ((bd)object).b - ((bd)object).c;
        arrayOfByte = new byte[i];
        f(arrayOfByte, i, (bd)object);
      }  
    return zo2.G("UTF-8", arrayOfByte);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */