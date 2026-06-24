public final class rr0 implements nt0, mt0 {
  public final ad b;
  
  public final fw0 c;
  
  public final uv e;
  
  public nt0 f;
  
  public mt0 g;
  
  public final long h;
  
  public long i;
  
  public rr0(ad paramad, fw0 paramfw0, uv paramuv, long paramLong) {
    this.c = paramfw0;
    this.e = paramuv;
    this.b = paramad;
    this.h = paramLong;
    this.i = -9223372036854775807L;
  }
  
  public final boolean a() {
    nt0 nt01 = this.f;
    return (nt01 != null && nt01.a());
  }
  
  public final void b(nt0 paramnt0) {
    mt0 mt01 = this.g;
    int i = d12.a;
    mt01.b(this);
  }
  
  public final long c() {
    nt0 nt01 = this.f;
    int i = d12.a;
    return nt01.c();
  }
  
  public final long d() {
    nt0 nt01 = this.f;
    int i = d12.a;
    return nt01.d();
  }
  
  public final long e(long paramLong, bk1 parambk1) {
    nt0 nt01 = this.f;
    int i = d12.a;
    return nt01.e(paramLong, parambk1);
  }
  
  public final void f(fw0 paramfw0) {
    long l = this.i;
    if (l == -9223372036854775807L)
      l = this.h; 
    nt0 nt01 = this.b.a(paramfw0, this.e, l);
    this.f = nt01;
    if (this.g != null)
      nt01.g(this, l); 
  }
  
  public final void g(mt0 parammt0, long paramLong) {
    this.g = parammt0;
    nt0 nt01 = this.f;
    if (nt01 != null) {
      paramLong = this.i;
      if (paramLong == -9223372036854775807L)
        paramLong = this.h; 
      nt01.g(this, paramLong);
    } 
  }
  
  public final long h(zd[] paramArrayOfzd, boolean[] paramArrayOfboolean1, li1[] paramArrayOfli1, boolean[] paramArrayOfboolean2, long paramLong) {
    long l2 = this.i;
    long l1 = paramLong;
    if (l2 != -9223372036854775807L) {
      l1 = paramLong;
      if (paramLong == this.h) {
        this.i = -9223372036854775807L;
        l1 = l2;
      } 
    } 
    nt0 nt01 = this.f;
    int i = d12.a;
    return nt01.h(paramArrayOfzd, paramArrayOfboolean1, paramArrayOfli1, paramArrayOfboolean2, l1);
  }
  
  public final vv1 i() {
    nt0 nt01 = this.f;
    int i = d12.a;
    return nt01.i();
  }
  
  public final long j() {
    nt0 nt01 = this.f;
    int i = d12.a;
    return nt01.j();
  }
  
  public final void k() {
    nt0 nt01 = this.f;
    if (nt01 != null) {
      nt01.k();
      return;
    } 
    this.b.g();
  }
  
  public final long l(long paramLong) {
    nt0 nt01 = this.f;
    int i = d12.a;
    return nt01.l(paramLong);
  }
  
  public final void m(long paramLong) {
    nt0 nt01 = this.f;
    int i = d12.a;
    nt01.m(paramLong);
  }
  
  public final boolean n(long paramLong) {
    nt0 nt01 = this.f;
    return (nt01 != null && nt01.n(paramLong));
  }
  
  public final void o(long paramLong) {
    nt0 nt01 = this.f;
    int i = d12.a;
    nt01.o(paramLong);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rr0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */