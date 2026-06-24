import java.util.Locale;

public final class pe extends nh0 {
  public final int g;
  
  public final ue0 h;
  
  public pe(ue0 paramue0, g20 paramg20, int paramInt) {
    super(iu.k, paramg20);
    this.h = paramue0;
  }
  
  public final int b(long paramLong) {
    int i = this.g;
    ue0 ue01 = this.h;
    switch (i) {
      default:
        ue01.getClass();
        return oe.V0(paramLong);
      case 2:
        return ue01.a1(ue01.d1(paramLong), paramLong);
      case 1:
        return (int)((paramLong - ue01.e1(ue01.d1(paramLong))) / 86400000L) + 1;
      case 0:
        break;
    } 
    i = ue01.d1(paramLong);
    return ue01.U0(paramLong, i, ue01.h1(i, paramLong));
  }
  
  public String c(int paramInt, Locale paramLocale) {
    switch (this.g) {
      default:
        return super.c(paramInt, paramLocale);
      case 3:
        break;
    } 
    return (md0.b(paramLocale)).c[paramInt];
  }
  
  public String f(int paramInt, Locale paramLocale) {
    switch (this.g) {
      default:
        return super.f(paramInt, paramLocale);
      case 3:
        break;
    } 
    return (md0.b(paramLocale)).b[paramInt];
  }
  
  public int k(Locale paramLocale) {
    switch (this.g) {
      default:
        return super.k(paramLocale);
      case 3:
        break;
    } 
    return (md0.b(paramLocale)).k;
  }
  
  public final int l() {
    switch (this.g) {
      default:
        return 7;
      case 2:
        return 53;
      case 1:
        this.h.getClass();
        return 366;
      case 0:
        break;
    } 
    this.h.getClass();
    return 31;
  }
  
  public int m(long paramLong) {
    int i = this.g;
    ue0 ue01 = this.h;
    switch (i) {
      default:
        return super.m(paramLong);
      case 2:
        return ue01.b1(ue01.c1(paramLong));
      case 1:
        if (ue01.g1(ue01.d1(paramLong))) {
          i = 366;
        } else {
          i = 365;
        } 
        return i;
      case 0:
        break;
    } 
    i = ue01.d1(paramLong);
    return ue01.W0(i, ue01.h1(i, paramLong));
  }
  
  public int n(long paramLong, int paramInt) {
    int i = this.g;
    ue0 ue01 = this.h;
    switch (i) {
      default:
        return super.n(paramLong, paramInt);
      case 2:
        i = 52;
        if (paramInt > 52)
          i = m(paramLong); 
        return i;
      case 1:
        ue01.getClass();
        i = 365;
        if (paramInt > 365 || paramInt < 1)
          i = m(paramLong); 
        return i;
      case 0:
        break;
    } 
    ue01.getClass();
    i = 28;
    if (paramInt > 28 || paramInt < 1) {
      paramInt = ue01.d1(paramLong);
      i = ue01.W0(paramInt, ue01.h1(paramInt, paramLong));
    } 
    return i;
  }
  
  public final int o() {
    switch (this.g) {
      default:
        return 1;
      case 2:
        return 1;
      case 1:
        return 1;
      case 0:
        break;
    } 
    return 1;
  }
  
  public final g20 p() {
    switch (this.g) {
      default:
        return this.h.x;
      case 2:
        return this.h.y;
      case 1:
        return this.h.A;
      case 0:
        break;
    } 
    return this.h.z;
  }
  
  public boolean r(long paramLong) {
    switch (this.g) {
      default:
        return super.r(paramLong);
      case 1:
        return this.h.i1(paramLong);
      case 0:
        break;
    } 
    return this.h.i1(paramLong);
  }
  
  public long u(long paramLong) {
    switch (this.g) {
      default:
        return super.u(paramLong);
      case 2:
        break;
    } 
    return super.u(paramLong + 259200000L);
  }
  
  public long v(long paramLong) {
    switch (this.g) {
      default:
        return super.v(paramLong);
      case 2:
        break;
    } 
    return super.v(paramLong + 259200000L) - 259200000L;
  }
  
  public int z(String paramString, Locale paramLocale) {
    switch (this.g) {
      default:
        return super.z(paramString, paramLocale);
      case 3:
        break;
    } 
    Integer integer = (Integer)(md0.b(paramLocale)).h.get(paramString);
    if (integer != null)
      return integer.intValue(); 
    throw new eh0(iu.q, paramString);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */