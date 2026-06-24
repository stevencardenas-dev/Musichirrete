package j$.time.temporal;

import j$.time.LocalDate;
import j$.time.chrono.m;
import j$.time.chrono.t;

public enum f {
  public final long E(n paramn) {
    if (r(paramn))
      return h.I(LocalDate.z(paramn)); 
    throw new RuntimeException("Unsupported field: WeekOfWeekBasedYear");
  }
  
  public final m G(m paramm, long paramLong) {
    z().b(paramLong, this);
    return paramm.k(Math.subtractExact(paramLong, E(paramm)), b.WEEKS);
  }
  
  public final boolean r(n paramn) {
    if (paramn.f(a.EPOCH_DAY)) {
      h h1 = j.a;
      if (m.m(paramn).equals(t.c))
        return true; 
    } 
    return false;
  }
  
  public final u t(n paramn) {
    if (r(paramn))
      return u.e(1L, h.K(h.J(LocalDate.z(paramn)))); 
    throw new RuntimeException("Unsupported field: WeekOfWeekBasedYear");
  }
  
  public final String toString() {
    return "WeekOfWeekBasedYear";
  }
  
  public final u z() {
    return u.f(52L, 53L);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\temporal\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */