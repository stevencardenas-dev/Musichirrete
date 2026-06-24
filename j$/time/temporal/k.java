package j$.time.temporal;

public enum k implements q {
  JULIAN_DAY, MODIFIED_JULIAN_DAY, RATA_DIE;
  
  public static final k[] d;
  
  private static final long serialVersionUID = -7501623920830201812L;
  
  public final transient String a;
  
  public final transient u b;
  
  public final transient long c;
  
  static {
    b b = b.NANOS;
    k k2 = new k("JULIAN_DAY", 0, "JulianDay", 2440588L);
    JULIAN_DAY = k2;
    k k3 = new k("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", 40587L);
    MODIFIED_JULIAN_DAY = k3;
    k k1 = new k("RATA_DIE", 2, "RataDie", 719163L);
    RATA_DIE = k1;
    d = new k[] { k2, k3, k1 };
  }
  
  k(String paramString1, long paramLong) {
    this.a = paramString1;
    this.b = u.e(-365243219162L + paramLong, 365241780471L + paramLong);
    this.c = paramLong;
  }
  
  public final long E(n paramn) {
    return paramn.g(a.EPOCH_DAY) + this.c;
  }
  
  public final m G(m paramm, long paramLong) {
    if (this.b.d(paramLong)) {
      a a = a.EPOCH_DAY;
      return paramm.h(Math.subtractExact(paramLong, this.c), a);
    } 
    StringBuilder stringBuilder = new StringBuilder("Invalid value: ");
    stringBuilder.append(this.a);
    stringBuilder.append(" ");
    stringBuilder.append(paramLong);
    throw new RuntimeException(stringBuilder.toString());
  }
  
  public final boolean isDateBased() {
    return true;
  }
  
  public final boolean r(n paramn) {
    return paramn.f(a.EPOCH_DAY);
  }
  
  public final u t(n paramn) {
    if (paramn.f(a.EPOCH_DAY))
      return this.b; 
    StringBuilder stringBuilder = new StringBuilder("Unsupported field: ");
    stringBuilder.append(this);
    throw new RuntimeException(stringBuilder.toString());
  }
  
  public final String toString() {
    return this.a;
  }
  
  public final u z() {
    return this.b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\temporal\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */