public final class if1 extends tv {
  public final int e;
  
  public final g20 f;
  
  public final g20 g;
  
  public if1(hu paramhu, g20 paramg20) {
    super(paramhu, iu.n);
    this.g = paramg20;
    this.f = paramhu.i();
    this.e = 100;
  }
  
  public if1(p00 paramp00, g20 paramg20, iu paramiu) {
    super(paramp00.c, paramiu);
    this.e = paramp00.e;
    this.f = paramg20;
    this.g = paramp00.f;
  }
  
  public final int b(long paramLong) {
    int i = this.c.b(paramLong);
    int j = this.e;
    return (i >= 0) ? (i % j) : ((i + 1) % j + j - 1);
  }
  
  public final g20 i() {
    return this.f;
  }
  
  public final int l() {
    return this.e - 1;
  }
  
  public final int o() {
    return 0;
  }
  
  public final g20 p() {
    return this.g;
  }
  
  public final long u(long paramLong) {
    return this.c.u(paramLong);
  }
  
  public final long v(long paramLong) {
    return this.c.v(paramLong);
  }
  
  public final long w(int paramInt, long paramLong) {
    int j = this.e;
    wf2.n0(this, paramInt, 0, j - 1);
    hu hu = this.c;
    int i = hu.b(paramLong);
    if (i >= 0) {
      i /= j;
    } else {
      i = (i + 1) / j - 1;
    } 
    return hu.w(i * j + paramInt, paramLong);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\if1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */