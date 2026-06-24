package j$.time.temporal;

import j$.time.Duration;

public enum i implements s {
  QUARTER_YEARS, WEEK_BASED_YEARS;
  
  public static final i[] b;
  
  public final String a;
  
  static {
    Duration.r(31556952L, 0);
    i i1 = new i("WEEK_BASED_YEARS", 0, "WeekBasedYears");
    WEEK_BASED_YEARS = i1;
    Duration.r(7889238L, 0);
    i i2 = new i("QUARTER_YEARS", 1, "QuarterYears");
    QUARTER_YEARS = i2;
    b = new i[] { i1, i2 };
  }
  
  i(String paramString1) {
    this.a = paramString1;
  }
  
  public final m r(m paramm, long paramLong) {
    int j = c.a[ordinal()];
    if (j != 1) {
      if (j == 2)
        return paramm.k(paramLong / 4L, b.YEARS).k(paramLong % 4L * 3L, b.MONTHS); 
      throw new IllegalStateException("Unreachable");
    } 
    h h = j.c;
    return paramm.h(Math.addExact(paramm.e(h), paramLong), h);
  }
  
  public final String toString() {
    return this.a;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\temporal\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */