package j$.time.temporal;

import j$.time.Duration;

public enum b implements s {
  CENTURIES, DAYS, DECADES, ERAS, FOREVER, HALF_DAYS, HOURS, MICROS, MILLENNIA, MILLIS, MINUTES, MONTHS, NANOS, SECONDS, WEEKS, YEARS;
  
  public static final b[] b;
  
  public final String a;
  
  static {
    Duration.t(1L);
    b b14 = new b("NANOS", 0, "Nanos");
    NANOS = b14;
    Duration.t(1000L);
    b b6 = new b("MICROS", 1, "Micros");
    MICROS = b6;
    Duration.t(1000000L);
    b b2 = new b("MILLIS", 2, "Millis");
    MILLIS = b2;
    Duration.r(1L, 0);
    b b8 = new b("SECONDS", 3, "Seconds");
    SECONDS = b8;
    Duration.r(60L, 0);
    b b15 = new b("MINUTES", 4, "Minutes");
    MINUTES = b15;
    Duration.r(3600L, 0);
    b b1 = new b("HOURS", 5, "Hours");
    HOURS = b1;
    Duration.r(43200L, 0);
    b b7 = new b("HALF_DAYS", 6, "HalfDays");
    HALF_DAYS = b7;
    Duration.r(86400L, 0);
    b b4 = new b("DAYS", 7, "Days");
    DAYS = b4;
    Duration.r(604800L, 0);
    b b16 = new b("WEEKS", 8, "Weeks");
    WEEKS = b16;
    Duration.r(2629746L, 0);
    b b12 = new b("MONTHS", 9, "Months");
    MONTHS = b12;
    Duration.r(31556952L, 0);
    b b3 = new b("YEARS", 10, "Years");
    YEARS = b3;
    Duration.r(315569520L, 0);
    b b13 = new b("DECADES", 11, "Decades");
    DECADES = b13;
    Duration.r(3155695200L, 0);
    b b9 = new b("CENTURIES", 12, "Centuries");
    CENTURIES = b9;
    Duration.r(31556952000L, 0);
    b b11 = new b("MILLENNIA", 13, "Millennia");
    MILLENNIA = b11;
    Duration.r(31556952000000000L, 0);
    b b5 = new b("ERAS", 14, "Eras");
    ERAS = b5;
    Duration.ofSeconds(Long.MAX_VALUE, 999999999L);
    b b10 = new b("FOREVER", 15, "Forever");
    FOREVER = b10;
    b = new b[] { 
        b14, b6, b2, b8, b15, b1, b7, b4, b16, b12, 
        b3, b13, b9, b11, b5, b10 };
  }
  
  b(String paramString1) {
    this.a = paramString1;
  }
  
  public final m r(m paramm, long paramLong) {
    return paramm.k(paramLong, this);
  }
  
  public final String toString() {
    return this.a;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\temporal\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */