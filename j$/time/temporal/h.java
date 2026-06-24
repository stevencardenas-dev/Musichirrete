package j$.time.temporal;

import j$.time.LocalDate;
import j$.time.c;

public enum h implements q {
  DAY_OF_QUARTER, QUARTER_OF_YEAR, WEEK_BASED_YEAR, WEEK_OF_WEEK_BASED_YEAR;
  
  public static final int[] a;
  
  public static final h[] b;
  
  static {
    d d = new d();
    DAY_OF_QUARTER = d;
    e e = new e();
    QUARTER_OF_YEAR = e;
    f f = new f();
    WEEK_OF_WEEK_BASED_YEAR = f;
    g g = new g();
    WEEK_BASED_YEAR = g;
    b = new h[] { d, e, f, g };
    a = new int[] { 0, 90, 181, 273, 0, 91, 182, 274 };
  }
  
  public static int I(LocalDate paramLocalDate) {
    int i = paramLocalDate.G().ordinal();
    int k = paramLocalDate.I() - 1;
    i = 3 - i + k;
    int m = i - i / 7 * 7;
    int j = m - 3;
    i = j;
    if (j < -3)
      i = m + 4; 
    if (k < i)
      return (int)(u.e(1L, K(J(paramLocalDate.T(180).P(-1L))))).d; 
    j = (k - i) / 7 + 1;
    return (j != 53 || i == -3 || (i == -2 && paramLocalDate.J())) ? j : 1;
  }
  
  public static int J(LocalDate paramLocalDate) {
    int i;
    int j = paramLocalDate.getYear();
    int k = paramLocalDate.I();
    if (k <= 3) {
      i = j;
      if (k - paramLocalDate.G().ordinal() < -2)
        return j - 1; 
    } else {
      i = j;
      if (k >= 363) {
        int m = paramLocalDate.G().ordinal();
        i = j;
        if (k - 363 - paramLocalDate.J() - m >= 0)
          i = j + 1; 
      } 
    } 
    return i;
  }
  
  public static int K(int paramInt) {
    LocalDate localDate = LocalDate.of(paramInt, 1, 1);
    return (localDate.G() == c.THURSDAY || (localDate.G() == c.WEDNESDAY && localDate.J())) ? 53 : 52;
  }
  
  public final boolean isDateBased() {
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\temporal\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */