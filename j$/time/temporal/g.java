package j$.time.temporal;

import j$.time.LocalDate;
import j$.time.chrono.m;
import j$.time.chrono.t;

public enum g {
  public final long E(n paramn) {
    if (r(paramn))
      return h.J(LocalDate.z(paramn)); 
    throw new RuntimeException("Unsupported field: WeekBasedYear");
  }
  
  public final m G(m paramm, long paramLong) {
    if (r(paramm)) {
      int n = a.YEAR.b.a(paramLong, h.WEEK_BASED_YEAR);
      LocalDate localDate = LocalDate.z(paramm);
      a a = a.DAY_OF_WEEK;
      int k = localDate.e(a);
      int j = h.I(localDate);
      int i = j;
      if (j == 53) {
        i = j;
        if (h.K(n) == 52)
          i = 52; 
      } 
      localDate = LocalDate.of(n, 1, 4);
      return paramm.i(localDate.N(((i - 1) * 7 + k - localDate.e(a))));
    } 
    throw new RuntimeException("Unsupported field: WeekBasedYear");
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
      return a.YEAR.b; 
    throw new RuntimeException("Unsupported field: WeekBasedYear");
  }
  
  public final String toString() {
    return "WeekBasedYear";
  }
  
  public final u z() {
    return a.YEAR.b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\temporal\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */