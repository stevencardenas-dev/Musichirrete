public final class p00 extends tv {
  public final int e;
  
  public final xi1 f;
  
  public final g20 g;
  
  public final int h;
  
  public final int i;
  
  public p00(hu paramhu) {
    super(paramhu, iu);
    g20 g202 = paramhu.i();
    if (g202 == null) {
      this.f = null;
    } else {
      this.f = new xi1(g202, h20.f);
    } 
    this.g = g201;
    this.e = 100;
    int i = paramhu.o();
    if (i >= 0) {
      i /= 100;
    } else {
      i = (i + 1) / 100 - 1;
    } 
    int j = paramhu.l();
    if (j >= 0) {
      j /= 100;
    } else {
      j = (j + 1) / 100 - 1;
    } 
    this.h = i;
    this.i = j;
  }
  
  public final long a(int paramInt, long paramLong) {
    int i = this.e;
    return this.c.a(paramInt * i, paramLong);
  }
  
  public final int b(long paramLong) {
    int j = this.c.b(paramLong);
    int i = this.e;
    return (j >= 0) ? (j / i) : ((j + 1) / i - 1);
  }
  
  public final g20 i() {
    return this.f;
  }
  
  public final int l() {
    return this.i;
  }
  
  public final int o() {
    return this.h;
  }
  
  public final g20 p() {
    g20 g201 = this.g;
    return (g201 != null) ? g201 : super.p();
  }
  
  public final long u(long paramLong) {
    return w(b(this.c.u(paramLong)), paramLong);
  }
  
  public final long v(long paramLong) {
    int j = b(paramLong);
    int i = this.e;
    hu hu = this.c;
    return hu.v(hu.w(j * i, paramLong));
  }
  
  public final long w(int paramInt, long paramLong) {
    wf2.n0(this, paramInt, this.h, this.i);
    hu hu = this.c;
    int i = hu.b(paramLong);
    int j = this.e;
    if (i >= 0) {
      i %= j;
    } else {
      i = (i + 1) % j + j - 1;
    } 
    return hu.w(paramInt * j + i, paramLong);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\p00.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */