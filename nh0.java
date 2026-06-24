public abstract class nh0 extends vc {
  public final int c;
  
  public final long e;
  
  public final g20 f;
  
  public nh0(iu paramiu, long paramLong) {
    super(paramiu);
    this.e = paramLong;
    this.f = new mh0(this, paramiu.e);
  }
  
  public nh0(iu paramiu, g20 paramg20) {
    super(paramiu);
    if (paramg20.e()) {
      long l = paramg20.d();
      this.e = l;
      if (l >= 1L) {
        this.f = paramg20;
        return;
      } 
      l0.l("The unit milliseconds must be at least 1");
      throw null;
    } 
    l0.l("Unit duration field must be precise");
    throw null;
  }
  
  public abstract long A(long paramLong1, long paramLong2);
  
  public final g20 i() {
    switch (this.c) {
      default:
        return this.f;
      case 0:
        break;
    } 
    return this.f;
  }
  
  public int o() {
    return 0;
  }
  
  public boolean s() {
    return false;
  }
  
  public long u(long paramLong) {
    switch (this.c) {
      default:
        return super.u(paramLong);
      case 1:
        break;
    } 
    long l = this.e;
    if (paramLong >= 0L) {
      paramLong %= l;
    } else {
      paramLong = (paramLong + 1L) % l + l - 1L;
    } 
    return paramLong;
  }
  
  public long v(long paramLong) {
    long l = this.e;
    if (paramLong >= 0L)
      return paramLong - paramLong % l; 
    paramLong++;
    return paramLong - paramLong % l - l;
  }
  
  public long w(int paramInt, long paramLong) {
    wf2.n0(this, paramInt, o(), n(paramLong, paramInt));
    return (paramInt - b(paramLong)) * this.e + paramLong;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nh0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */