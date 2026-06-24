import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import java.util.Locale;

public final class ik2 {
  public static final boolean e = wm2.e;
  
  public a42 a;
  
  public final byte[] b;
  
  public final int c;
  
  public int d;
  
  public ik2(int paramInt, byte[] paramArrayOfbyte) {
    int i = paramArrayOfbyte.length;
    if ((i - paramInt | paramInt) >= 0) {
      this.b = paramArrayOfbyte;
      this.d = 0;
      this.c = paramInt;
      return;
    } 
    Locale locale = Locale.US;
    l0.l(ga1.j(IGBYXeDFmKYajx.XsILo, i, paramInt, ", offset=0, length="));
    throw null;
  }
  
  public static int n(int paramInt) {
    return 352 - Integer.numberOfLeadingZeros(paramInt) * 9 >>> 6;
  }
  
  public static int o(long paramLong) {
    return 640 - Long.numberOfLeadingZeros(paramLong) * 9 >>> 6;
  }
  
  public final void a(byte paramByte) {
    int i = this.d;
    try {
      byte[] arrayOfByte = this.b;
      arrayOfByte[i] = paramByte;
      this.d = i + 1;
      return;
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw new mk2(i, this.c, 1, indexOutOfBoundsException, 0);
    } 
  }
  
  public final void b(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    try {
      System.arraycopy(paramArrayOfbyte, paramInt1, this.b, this.d, paramInt2);
      this.d += paramInt2;
      return;
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw new mk2(this.d, this.c, paramInt2, indexOutOfBoundsException, 0);
    } 
  }
  
  public final void c(int paramInt1, int paramInt2) {
    k(paramInt1 << 3 | 0x5);
    d(paramInt2);
  }
  
  public final void d(int paramInt) {
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
      throw new mk2(i, this.c, 4, indexOutOfBoundsException, 0);
    } 
  }
  
  public final void e(int paramInt, long paramLong) {
    k(paramInt << 3 | 0x1);
    f(paramLong);
  }
  
  public final void f(long paramLong) {
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
      throw new mk2(i, this.c, 8, indexOutOfBoundsException, 0);
    } 
  }
  
  public final void g(int paramInt1, int paramInt2) {
    k(paramInt1 << 3);
    h(paramInt2);
  }
  
  public final void h(int paramInt) {
    if (paramInt >= 0) {
      k(paramInt);
      return;
    } 
    m(paramInt);
  }
  
  public final void i(int paramInt1, int paramInt2) {
    k(paramInt1 << 3 | paramInt2);
  }
  
  public final void j(int paramInt1, int paramInt2) {
    k(paramInt1 << 3);
    k(paramInt2);
  }
  
  public final void k(int paramInt) {
    int j = this.d;
    int i = paramInt;
    for (paramInt = j;; paramInt++) {
      byte[] arrayOfByte = this.b;
      if ((i & 0xFFFFFF80) == 0) {
        byte b1 = (byte)i;
        arrayOfByte[paramInt] = b1;
        this.d = paramInt + 1;
        return;
      } 
      byte b = (byte)(i | 0x80);
      arrayOfByte[paramInt] = b;
      i >>>= 7;
    } 
  }
  
  public final void l(int paramInt, long paramLong) {
    k(paramInt << 3);
    m(paramLong);
  }
  
  public final void m(long paramLong) {
    int i = this.d;
    boolean bool = e;
    byte[] arrayOfByte = this.b;
    int j = this.c;
    if (bool && j - i >= 10) {
      while (true) {
        if ((paramLong & 0xFFFFFFFFFFFFFF80L) == 0L) {
          j = i + 1;
          long l1 = i;
          byte b1 = (byte)(int)paramLong;
          wm2.c.g(arrayOfByte, wm2.f + l1, b1);
          i = j;
          break;
        } 
        long l = i;
        byte b = (byte)((int)paramLong | 0x80);
        wm2.c.g(arrayOfByte, wm2.f + l, b);
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
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ik2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */