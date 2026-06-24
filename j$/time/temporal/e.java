package j$.time.temporal;

import j$.time.chrono.m;
import j$.time.chrono.t;

public enum e {
  public final long E(n paramn) {
    if (r(paramn))
      return (paramn.g(a.MONTH_OF_YEAR) + 2L) / 3L; 
    throw new RuntimeException("Unsupported field: QuarterOfYear");
  }
  
  public final m G(m paramm, long paramLong) {
    long l = E(paramm);
    z().b(paramLong, this);
    a a = a.MONTH_OF_YEAR;
    return paramm.h((paramLong - l) * 3L + paramm.g(a), a);
  }
  
  public final boolean r(n paramn) {
    if (paramn.f(a.MONTH_OF_YEAR)) {
      h h1 = j.a;
      if (m.m(paramn).equals(t.c))
        return true; 
    } 
    return false;
  }
  
  public final u t(n paramn) {
    if (r(paramn))
      return z(); 
    throw new RuntimeException("Unsupported field: QuarterOfYear");
  }
  
  public final String toString() {
    return "QuarterOfYear";
  }
  
  public final u z() {
    return u.e(1L, 4L);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\temporal\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */