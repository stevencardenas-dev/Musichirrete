package j$.time.temporal;

import j$.time.chrono.m;
import j$.time.chrono.t;

public enum d {
  public final long E(n paramn) {
    if (r(paramn)) {
      int j = paramn.e(a.DAY_OF_YEAR);
      int i = paramn.e(a.MONTH_OF_YEAR);
      long l = paramn.g(a.YEAR);
      int k = (i - 1) / 3;
      t.c.getClass();
      if (t.t(l)) {
        i = 4;
      } else {
        i = 0;
      } 
      return (j - h.a[k + i]);
    } 
    throw new RuntimeException("Unsupported field: DayOfQuarter");
  }
  
  public final m G(m paramm, long paramLong) {
    long l = E(paramm);
    z().b(paramLong, this);
    a a = a.DAY_OF_YEAR;
    return paramm.h(paramLong - l + paramm.g(a), a);
  }
  
  public final boolean r(n paramn) {
    if (paramn.f(a.DAY_OF_YEAR) && paramn.f(a.MONTH_OF_YEAR) && paramn.f(a.YEAR)) {
      h h1 = j.a;
      if (m.m(paramn).equals(t.c))
        return true; 
    } 
    return false;
  }
  
  public final u t(n paramn) {
    if (r(paramn)) {
      long l = paramn.g(h.QUARTER_OF_YEAR);
      if (l == 1L) {
        l = paramn.g(a.YEAR);
        t.c.getClass();
        return t.t(l) ? u.e(1L, 91L) : u.e(1L, 90L);
      } 
      return (l == 2L) ? u.e(1L, 91L) : ((l == 3L || l == 4L) ? u.e(1L, 92L) : z());
    } 
    throw new RuntimeException("Unsupported field: DayOfQuarter");
  }
  
  public final String toString() {
    return "DayOfQuarter";
  }
  
  public final u z() {
    return u.f(90L, 92L);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\temporal\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */