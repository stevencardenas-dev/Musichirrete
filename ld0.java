import java.util.Locale;

public final class ld0 extends vc {
  public final ue0 c;
  
  public ld0(ue0 paramue0) {
    super(iu.f);
    this.c = paramue0;
  }
  
  public final int b(long paramLong) {
    return (this.c.d1(paramLong) <= 0) ? 0 : 1;
  }
  
  public final String f(int paramInt, Locale paramLocale) {
    return (md0.b(paramLocale)).a[paramInt];
  }
  
  public final g20 i() {
    return w02.g(h20.e);
  }
  
  public final int k(Locale paramLocale) {
    return (md0.b(paramLocale)).j;
  }
  
  public final int l() {
    return 1;
  }
  
  public final int o() {
    return 0;
  }
  
  public final g20 p() {
    return null;
  }
  
  public final boolean s() {
    return false;
  }
  
  public final long v(long paramLong) {
    return (b(paramLong) == 1) ? this.c.j1(1, 0L) : Long.MIN_VALUE;
  }
  
  public final long w(int paramInt, long paramLong) {
    wf2.n0(this, paramInt, 0, 1);
    if (b(paramLong) != paramInt) {
      ue0 ue01 = this.c;
      return ue01.j1(-ue01.d1(paramLong), paramLong);
    } 
    return paramLong;
  }
  
  public final long x(long paramLong, String paramString, Locale paramLocale) {
    Integer integer = (Integer)(md0.b(paramLocale)).g.get(paramString);
    if (integer != null)
      return w(integer.intValue(), paramLong); 
    throw new eh0(iu.f, paramString);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ld0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */