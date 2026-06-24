public final class o31 extends tv {
  public final int e;
  
  public final int f;
  
  public final int g;
  
  public o31(tv paramtv, iu paramiu, int paramInt) {
    super(paramtv, paramiu);
    if (paramInt != 0) {
      this.e = paramInt;
      if (Integer.MIN_VALUE < paramtv.o() + paramInt) {
        this.f = paramtv.o() + paramInt;
      } else {
        this.f = Integer.MIN_VALUE;
      } 
      if (Integer.MAX_VALUE > paramtv.l() + paramInt) {
        this.g = paramtv.l() + paramInt;
        return;
      } 
      this.g = Integer.MAX_VALUE;
      return;
    } 
    l0.l("The offset cannot be zero");
    throw null;
  }
  
  public final long a(int paramInt, long paramLong) {
    paramLong = super.a(paramInt, paramLong);
    wf2.n0(this, b(paramLong), this.f, this.g);
    return paramLong;
  }
  
  public final int b(long paramLong) {
    return this.c.b(paramLong) + this.e;
  }
  
  public final g20 j() {
    return this.c.j();
  }
  
  public final int l() {
    return this.g;
  }
  
  public final int o() {
    return this.f;
  }
  
  public final boolean r(long paramLong) {
    return this.c.r(paramLong);
  }
  
  public final long u(long paramLong) {
    return this.c.u(paramLong);
  }
  
  public final long v(long paramLong) {
    return this.c.v(paramLong);
  }
  
  public final long w(int paramInt, long paramLong) {
    wf2.n0(this, paramInt, this.f, this.g);
    int i = this.e;
    return this.c.w(paramInt - i, paramLong);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\o31.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */