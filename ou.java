import java.util.Locale;

public final class ou implements ti0, ri0 {
  public final iu b;
  
  public final int c;
  
  public final int e;
  
  public ou(iu paramiu, int paramInt1, int paramInt2) {
    this.b = paramiu;
    int i = paramInt2;
    if (paramInt2 > 18)
      i = 18; 
    this.c = paramInt1;
    this.e = i;
  }
  
  public final int a(cv paramcv, CharSequence paramCharSequence, int paramInt) {
    hu hu = this.b.a(paramcv.a);
    int i = paramCharSequence.length();
    int j = Math.min(this.e, i - paramInt);
    long l2 = hu.i().d() * 10L;
    long l1 = 0L;
    i = 0;
    while (i < j) {
      char c = paramCharSequence.charAt(paramInt + i);
      if (c < '0' || c > '9')
        break; 
      i++;
      l2 /= 10L;
      l1 += (c - 48) * l2;
    } 
    l1 /= 10L;
    if (i == 0)
      return paramInt ^ 0xFFFFFFFF; 
    if (l1 > 2147483647L)
      return paramInt ^ 0xFFFFFFFF; 
    g91 g91 = new g91(iu.B, sx0.b, hu.i());
    j = (int)l1;
    av av = paramcv.c();
    av.b = g91;
    av.c = j;
    av.e = null;
    av.f = null;
    return paramInt + i;
  }
  
  public final int b() {
    return this.e;
  }
  
  public final void c(StringBuilder paramStringBuilder, uo0 paramuo0, Locale paramLocale) {
    dd1 dd1 = paramuo0.c;
    ic ic = (ic)dd1;
    ic.getClass();
    long l = 0L;
    for (byte b = 0; b < 4; b++)
      l = paramuo0.a(b).a(ic).w(paramuo0.d(b), l); 
    f(paramStringBuilder, l, dd1);
  }
  
  public final int d() {
    return this.e;
  }
  
  public final void e(StringBuilder paramStringBuilder, long paramLong, dd1 paramdd1, int paramInt, hv paramhv, Locale paramLocale) {
    f(paramStringBuilder, paramLong, paramdd1);
  }
  
  public final void f(StringBuilder paramStringBuilder, long paramLong, dd1 paramdd1) {
    hu hu = this.b.a(paramdd1);
    int i = this.c;
    try {
      long l = hu.u(paramLong);
      if (l == 0L) {
        while (--i >= 0)
          paramStringBuilder.append('0'); 
      } else {
        long l1 = hu.i().d();
        for (int j = this.e;; j--) {
          switch (j) {
            default:
              paramLong = 1L;
              break;
            case 18:
              paramLong = 1000000000000000000L;
              break;
            case 17:
              paramLong = 100000000000000000L;
              break;
            case 16:
              paramLong = 10000000000000000L;
              break;
            case 15:
              paramLong = 1000000000000000L;
              break;
            case 14:
              paramLong = 100000000000000L;
              break;
            case 13:
              paramLong = 10000000000000L;
              break;
            case 12:
              paramLong = 1000000000000L;
              break;
            case 11:
              paramLong = 100000000000L;
              break;
            case 10:
              paramLong = 10000000000L;
              break;
            case 9:
              paramLong = 1000000000L;
              break;
            case 8:
              paramLong = 100000000L;
              break;
            case 7:
              paramLong = 10000000L;
              break;
            case 6:
              paramLong = 1000000L;
              break;
            case 5:
              paramLong = 100000L;
              break;
            case 4:
              paramLong = 10000L;
              break;
            case 3:
              paramLong = 1000L;
              break;
            case 2:
              paramLong = 100L;
              break;
            case 1:
              paramLong = 10L;
              break;
          } 
          if (l1 * paramLong / paramLong == l1) {
            String str;
            paramLong = l * paramLong / l1;
            l1 = j;
            long[] arrayOfLong = new long[2];
            boolean bool = false;
            arrayOfLong[0] = paramLong;
            arrayOfLong[1] = l1;
            paramLong = arrayOfLong[0];
            j = (int)arrayOfLong[1];
            if ((0x7FFFFFFFL & paramLong) == paramLong) {
              str = Integer.toString((int)paramLong);
            } else {
              str = Long.toString(paramLong);
            } 
            int k = str.length();
            while (k < j) {
              paramStringBuilder.append('0');
              i--;
              j--;
            } 
            if (i < j) {
              int m = j;
              for (j = k; i < m && j > 1 && str.charAt(j - 1) == '0'; j--)
                m--; 
              if (j < str.length()) {
                for (i = bool; i < j; i++)
                  paramStringBuilder.append(str.charAt(i)); 
                return;
              } 
            } 
            paramStringBuilder.append(str);
            return;
          } 
        } 
      } 
      return;
    } catch (RuntimeException runtimeException) {
      zu.n(i, paramStringBuilder);
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ou.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */