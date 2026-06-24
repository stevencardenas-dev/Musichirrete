import java.util.Locale;

public final class d92 extends vc {
  public final hu c;
  
  public final hv e;
  
  public final g20 f;
  
  public final boolean g;
  
  public final g20 h;
  
  public final g20 i;
  
  public d92(hu paramhu, hv paramhv, g20 paramg201, g20 paramg202, g20 paramg203) {
    super(paramhu.q());
    if (paramhu.t()) {
      boolean bool;
      this.c = paramhu;
      this.e = paramhv;
      this.f = paramg201;
      if (paramg201 != null && paramg201.d() < 43200000L) {
        bool = true;
      } else {
        bool = false;
      } 
      this.g = bool;
      this.h = paramg202;
      this.i = paramg203;
      return;
    } 
    l0.k();
    throw null;
  }
  
  public final int A(long paramLong) {
    int i = this.e.h(paramLong);
    long l = i;
    if ((paramLong + l ^ paramLong) >= 0L || (paramLong ^ l) < 0L)
      return i; 
    throw new ArithmeticException("Adding time zone offset caused overflow");
  }
  
  public final long a(int paramInt, long paramLong) {
    boolean bool = this.g;
    hu hu1 = this.c;
    if (bool) {
      long l = A(paramLong);
      return hu1.a(paramInt, paramLong + l) - l;
    } 
    hv hv1 = this.e;
    return hv1.a(hu1.a(paramInt, hv1.b(paramLong)), paramLong);
  }
  
  public final int b(long paramLong) {
    paramLong = this.e.b(paramLong);
    return this.c.b(paramLong);
  }
  
  public final String c(int paramInt, Locale paramLocale) {
    return this.c.c(paramInt, paramLocale);
  }
  
  public final String d(long paramLong, Locale paramLocale) {
    paramLong = this.e.b(paramLong);
    return this.c.d(paramLong, paramLocale);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof d92) {
      paramObject = paramObject;
      if (this.c.equals(((d92)paramObject).c) && this.e.equals(((d92)paramObject).e) && this.f.equals(((d92)paramObject).f) && this.h.equals(((d92)paramObject).h))
        return true; 
    } 
    return false;
  }
  
  public final String f(int paramInt, Locale paramLocale) {
    return this.c.f(paramInt, paramLocale);
  }
  
  public final String g(long paramLong, Locale paramLocale) {
    paramLong = this.e.b(paramLong);
    return this.c.g(paramLong, paramLocale);
  }
  
  public final int hashCode() {
    int i = this.c.hashCode();
    return this.e.hashCode() ^ i;
  }
  
  public final g20 i() {
    return this.f;
  }
  
  public final g20 j() {
    return this.i;
  }
  
  public final int k(Locale paramLocale) {
    return this.c.k(paramLocale);
  }
  
  public final int l() {
    return this.c.l();
  }
  
  public final int o() {
    return this.c.o();
  }
  
  public final g20 p() {
    return this.h;
  }
  
  public final boolean r(long paramLong) {
    paramLong = this.e.b(paramLong);
    return this.c.r(paramLong);
  }
  
  public final boolean s() {
    return this.c.s();
  }
  
  public final long u(long paramLong) {
    paramLong = this.e.b(paramLong);
    return this.c.u(paramLong);
  }
  
  public final long v(long paramLong) {
    boolean bool = this.g;
    hu hu1 = this.c;
    if (bool) {
      long l = A(paramLong);
      return hu1.v(paramLong + l) - l;
    } 
    hv hv1 = this.e;
    return hv1.a(hu1.v(hv1.b(paramLong)), paramLong);
  }
  
  public final long w(int paramInt, long paramLong) {
    hv hv1 = this.e;
    long l = hv1.b(paramLong);
    hu hu1 = this.c;
    l = hu1.w(paramInt, l);
    paramLong = hv1.a(l, paramLong);
    if (b(paramLong) == paramInt)
      return paramLong; 
    fh0 fh0 = new fh0(l, hv1.b);
    eh0 eh0 = new eh0(hu1.q(), Integer.valueOf(paramInt), fh0.getMessage());
    eh0.initCause(fh0);
    throw eh0;
  }
  
  public final long x(long paramLong, String paramString, Locale paramLocale) {
    hv hv1 = this.e;
    long l = hv1.b(paramLong);
    return hv1.a(this.c.x(l, paramString, paramLocale), paramLong);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */