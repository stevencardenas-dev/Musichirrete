import java.io.IOException;
import java.util.Locale;

public final class jv2 extends fv2 {
  public static final boolean e = pc2.e;
  
  public a42 a;
  
  public final byte[] b;
  
  public final int c;
  
  public int d;
  
  public jv2(int paramInt, byte[] paramArrayOfbyte) {
    int i = paramArrayOfbyte.length;
    if ((i - paramInt | paramInt) >= 0) {
      this.b = paramArrayOfbyte;
      this.d = 0;
      this.c = paramInt;
      return;
    } 
    Locale locale = Locale.US;
    l0.l(ga1.j("Array range is invalid. Buffer.length=", i, paramInt, ", offset=0, length="));
    throw null;
  }
  
  public static int p(int paramInt) {
    return 352 - Integer.numberOfLeadingZeros(paramInt) * 9 >>> 6;
  }
  
  public static int q(long paramLong) {
    return 640 - Long.numberOfLeadingZeros(paramLong) * 9 >>> 6;
  }
  
  public final void c(int paramInt1, int paramInt2) {
    k(paramInt1 << 3 | paramInt2);
  }
  
  public final void d(int paramInt1, int paramInt2) {
    k(paramInt1 << 3);
    j(paramInt2);
  }
  
  public final void e(int paramInt1, int paramInt2) {
    k(paramInt1 << 3);
    k(paramInt2);
  }
  
  public final void f(int paramInt1, int paramInt2) {
    k(paramInt1 << 3 | 0x5);
    l(paramInt2);
  }
  
  public final void g(int paramInt, long paramLong) {
    k(paramInt << 3);
    m(paramLong);
  }
  
  public final void h(int paramInt, long paramLong) {
    k(paramInt << 3 | 0x1);
    n(paramLong);
  }
  
  public final void i(String paramString, int paramInt) {
    k(paramInt << 3 | 0x2);
    int i = this.d;
    try {
      int k = p(paramString.length() * 3);
      int j = p(paramString.length());
      paramInt = this.c;
      byte[] arrayOfByte = this.b;
      if (j == k) {
        k = i + j;
        this.d = k;
        paramInt = rc2.b(arrayOfByte, k, paramInt - k, paramString);
        this.d = i;
        k(paramInt - i - j);
        this.d = paramInt;
        return;
      } 
      k(rc2.a(paramString));
      i = this.d;
      this.d = rc2.b(arrayOfByte, i, paramInt - i, paramString);
      return;
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw new IOException("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    } 
  }
  
  public final void j(int paramInt) {
    if (paramInt >= 0) {
      k(paramInt);
      return;
    } 
    m(paramInt);
  }
  
  public final void k(int paramInt) {
    for (int i = this.d;; i++) {
      byte[] arrayOfByte = this.b;
      if ((paramInt & 0xFFFFFF80) == 0) {
        byte b1 = (byte)paramInt;
        arrayOfByte[i] = b1;
        this.d = i + 1;
        return;
      } 
      byte b = (byte)(paramInt | 0x80);
      arrayOfByte[i] = b;
      paramInt >>>= 7;
    } 
  }
  
  public final void l(int paramInt) {
    int i = this.d;
    try {
      byte[] arrayOfByte = this.b;
      arrayOfByte[i] = (byte)paramInt;
      arrayOfByte[i + 1] = (byte)(paramInt >> 8);
      arrayOfByte[i + 2] = (byte)(paramInt >> 16);
      arrayOfByte[i + 3] = (byte)(paramInt >> 24);
      this.d = i + 4;
      return;
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw new mk2(i, this.c, 4, indexOutOfBoundsException, 1);
    } 
  }
  
  public final void m(long paramLong) {
    int i = this.d;
    byte[] arrayOfByte = this.b;
    int j = this.c;
    if (e && j - i >= 10) {
      while (true) {
        if ((paramLong & 0xFFFFFFFFFFFFFF80L) == 0L) {
          j = i + 1;
          long l1 = i;
          byte b1 = (byte)(int)paramLong;
          pc2.c.b(arrayOfByte, pc2.f + l1, b1);
          i = j;
          break;
        } 
        long l = i;
        byte b = (byte)((int)paramLong | 0x80);
        pc2.c.b(arrayOfByte, pc2.f + l, b);
        paramLong >>>= 7L;
        i++;
      } 
    } else {
      while (true) {
        if ((paramLong & 0xFFFFFFFFFFFFFF80L) == 0L) {
          j = i + 1;
          byte b = (byte)(int)paramLong;
          arrayOfByte[i] = b;
          i = j;
        } else {
          byte b = (byte)((int)paramLong | 0x80);
          arrayOfByte[i] = b;
          paramLong >>>= 7L;
          i++;
          continue;
        } 
        this.d = i;
        return;
      } 
    } 
    this.d = i;
  }
  
  public final void n(long paramLong) {
    int i = this.d;
    try {
      byte[] arrayOfByte = this.b;
      arrayOfByte[i] = (byte)(int)paramLong;
      arrayOfByte[i + 1] = (byte)(int)(paramLong >> 8L);
      arrayOfByte[i + 2] = (byte)(int)(paramLong >> 16L);
      arrayOfByte[i + 3] = (byte)(int)(paramLong >> 24L);
      arrayOfByte[i + 4] = (byte)(int)(paramLong >> 32L);
      arrayOfByte[i + 5] = (byte)(int)(paramLong >> 40L);
      arrayOfByte[i + 6] = (byte)(int)(paramLong >> 48L);
      arrayOfByte[i + 7] = (byte)(int)(paramLong >> 56L);
      this.d = i + 8;
      return;
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw new mk2(i, this.c, 8, indexOutOfBoundsException, 1);
    } 
  }
  
  public final void o(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    try {
      System.arraycopy(paramArrayOfbyte, paramInt1, this.b, this.d, paramInt2);
      this.d += paramInt2;
      return;
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw new mk2(this.d, this.c, paramInt2, indexOutOfBoundsException, 1);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jv2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */