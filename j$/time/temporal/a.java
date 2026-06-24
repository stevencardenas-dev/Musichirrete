package j$.time.temporal;

public enum a implements q {
  ALIGNED_DAY_OF_WEEK_IN_MONTH, ALIGNED_DAY_OF_WEEK_IN_YEAR, ALIGNED_WEEK_OF_MONTH, ALIGNED_WEEK_OF_YEAR, AMPM_OF_DAY, CLOCK_HOUR_OF_AMPM, CLOCK_HOUR_OF_DAY, DAY_OF_MONTH, DAY_OF_WEEK, DAY_OF_YEAR, EPOCH_DAY, ERA, HOUR_OF_AMPM, HOUR_OF_DAY, INSTANT_SECONDS, MICRO_OF_DAY, MICRO_OF_SECOND, MILLI_OF_DAY, MILLI_OF_SECOND, MINUTE_OF_DAY, MINUTE_OF_HOUR, MONTH_OF_YEAR, NANO_OF_DAY, NANO_OF_SECOND, OFFSET_SECONDS, PROLEPTIC_MONTH, SECOND_OF_DAY, SECOND_OF_MINUTE, YEAR, YEAR_OF_ERA;
  
  public static final a[] c;
  
  public final String a;
  
  public final u b;
  
  static {
    b b = b.NANOS;
    a a4 = new a("NANO_OF_SECOND", 0, "NanoOfSecond", u.e(0L, 999999999L));
    NANO_OF_SECOND = a4;
    a a11 = new a("NANO_OF_DAY", 1, "NanoOfDay", u.e(0L, 86399999999999L));
    NANO_OF_DAY = a11;
    a a14 = new a("MICRO_OF_SECOND", 2, "MicroOfSecond", u.e(0L, 999999L));
    MICRO_OF_SECOND = a14;
    a a29 = new a("MICRO_OF_DAY", 3, "MicroOfDay", u.e(0L, 86399999999L));
    MICRO_OF_DAY = a29;
    a a30 = new a("MILLI_OF_SECOND", 4, "MilliOfSecond", u.e(0L, 999L));
    MILLI_OF_SECOND = a30;
    a a26 = new a("MILLI_OF_DAY", 5, "MilliOfDay", u.e(0L, 86399999L));
    MILLI_OF_DAY = a26;
    a a17 = new a("SECOND_OF_MINUTE", 6, "SecondOfMinute", u.e(0L, 59L), 0);
    SECOND_OF_MINUTE = a17;
    a a22 = new a("SECOND_OF_DAY", 7, "SecondOfDay", u.e(0L, 86399L));
    SECOND_OF_DAY = a22;
    a a6 = new a("MINUTE_OF_HOUR", 8, "MinuteOfHour", u.e(0L, 59L), 0);
    MINUTE_OF_HOUR = a6;
    a a19 = new a("MINUTE_OF_DAY", 9, "MinuteOfDay", u.e(0L, 1439L));
    MINUTE_OF_DAY = a19;
    a a13 = new a("HOUR_OF_AMPM", 10, "HourOfAmPm", u.e(0L, 11L));
    HOUR_OF_AMPM = a13;
    a a9 = new a("CLOCK_HOUR_OF_AMPM", 11, "ClockHourOfAmPm", u.e(1L, 12L));
    CLOCK_HOUR_OF_AMPM = a9;
    a a18 = new a("HOUR_OF_DAY", 12, "HourOfDay", u.e(0L, 23L), 0);
    HOUR_OF_DAY = a18;
    a a2 = new a("CLOCK_HOUR_OF_DAY", 13, "ClockHourOfDay", u.e(1L, 24L));
    CLOCK_HOUR_OF_DAY = a2;
    a a24 = new a("AMPM_OF_DAY", 14, "AmPmOfDay", u.e(0L, 1L), 0);
    AMPM_OF_DAY = a24;
    a a20 = new a("DAY_OF_WEEK", 15, "DayOfWeek", u.e(1L, 7L), 0);
    DAY_OF_WEEK = a20;
    a a1 = new a("ALIGNED_DAY_OF_WEEK_IN_MONTH", 16, "AlignedDayOfWeekInMonth", u.e(1L, 7L));
    ALIGNED_DAY_OF_WEEK_IN_MONTH = a1;
    a a7 = new a("ALIGNED_DAY_OF_WEEK_IN_YEAR", 17, "AlignedDayOfWeekInYear", u.e(1L, 7L));
    ALIGNED_DAY_OF_WEEK_IN_YEAR = a7;
    a a8 = new a("DAY_OF_MONTH", 18, "DayOfMonth", u.f(28L, 31L), 0);
    DAY_OF_MONTH = a8;
    a a25 = new a("DAY_OF_YEAR", 19, "DayOfYear", u.f(365L, 366L));
    DAY_OF_YEAR = a25;
    a a5 = new a("EPOCH_DAY", 20, "EpochDay", u.e(-365243219162L, 365241780471L));
    EPOCH_DAY = a5;
    a a27 = new a("ALIGNED_WEEK_OF_MONTH", 21, "AlignedWeekOfMonth", u.f(4L, 5L));
    ALIGNED_WEEK_OF_MONTH = a27;
    a a28 = new a("ALIGNED_WEEK_OF_YEAR", 22, "AlignedWeekOfYear", u.e(1L, 53L));
    ALIGNED_WEEK_OF_YEAR = a28;
    a a16 = new a("MONTH_OF_YEAR", 23, "MonthOfYear", u.e(1L, 12L), 0);
    MONTH_OF_YEAR = a16;
    a a23 = new a("PROLEPTIC_MONTH", 24, "ProlepticMonth", u.e(-11999999988L, 11999999999L));
    PROLEPTIC_MONTH = a23;
    a a3 = new a("YEAR_OF_ERA", 25, "YearOfEra", u.f(999999999L, 1000000000L));
    YEAR_OF_ERA = a3;
    a a12 = new a("YEAR", 26, "Year", u.e(-999999999L, 999999999L), 0);
    YEAR = a12;
    a a15 = new a("ERA", 27, "Era", u.e(0L, 1L), 0);
    ERA = a15;
    a a21 = new a("INSTANT_SECONDS", 28, "InstantSeconds", u.e(Long.MIN_VALUE, Long.MAX_VALUE));
    INSTANT_SECONDS = a21;
    a a10 = new a("OFFSET_SECONDS", 29, "OffsetSeconds", u.e(-64800L, 64800L));
    OFFSET_SECONDS = a10;
    c = new a[] { 
        a4, a11, a14, a29, a30, a26, a17, a22, a6, a19, 
        a13, a9, a18, a2, a24, a20, a1, a7, a8, a25, 
        a5, a27, a28, a16, a23, a3, a12, a15, a21, a10 };
  }
  
  a(String paramString1, u paramu) {
    this.a = paramString1;
    this.b = paramu;
  }
  
  a(String paramString1, u paramu, int paramInt1) {
    this.a = paramString1;
    this.b = paramu;
  }
  
  public final long E(n paramn) {
    return paramn.g(this);
  }
  
  public final m G(m paramm, long paramLong) {
    return paramm.h(paramLong, this);
  }
  
  public final void I(long paramLong) {
    this.b.b(paramLong, this);
  }
  
  public final boolean J() {
    return (ordinal() < DAY_OF_WEEK.ordinal());
  }
  
  public final boolean isDateBased() {
    return (ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal());
  }
  
  public final boolean r(n paramn) {
    return paramn.f(this);
  }
  
  public final u t(n paramn) {
    return paramn.j(this);
  }
  
  public final String toString() {
    return this.a;
  }
  
  public final u z() {
    return this.b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\temporal\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */