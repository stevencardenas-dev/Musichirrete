public final class jv {
  public final char a;
  
  public final int b;
  
  public final int c;
  
  public final int d;
  
  public final boolean e;
  
  public final int f;
  
  public jv(char paramChar, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4) {
    if (paramChar == 'u' || paramChar == 'w' || paramChar == 's') {
      this.a = paramChar;
      this.b = paramInt1;
      this.c = paramInt2;
      this.d = paramInt3;
      this.e = paramBoolean;
      this.f = paramInt4;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder("Unknown mode: ");
    stringBuilder.append(paramChar);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public final long a(dd1 paramdd1, long paramLong) {
    int i = this.c;
    if (i >= 0)
      return paramdd1.m().w(i, paramLong); 
    paramLong = paramdd1.m().w(1, paramLong);
    paramLong = paramdd1.Z().a(1, paramLong);
    return paramdd1.m().a(i, paramLong);
  }
  
  public final long b(dd1 paramdd1, long paramLong) {
    try {
      return a(paramdd1, paramLong);
    } catch (IllegalArgumentException illegalArgumentException) {
      if (this.b == 2 && this.c == 29) {
        while (!paramdd1.B0().r(paramLong))
          paramLong = paramdd1.B0().a(1, paramLong); 
        return a(paramdd1, paramLong);
      } 
      throw illegalArgumentException;
    } 
  }
  
  public final long c(dd1 paramdd1, long paramLong) {
    try {
      return a(paramdd1, paramLong);
    } catch (IllegalArgumentException illegalArgumentException) {
      if (this.b == 2 && this.c == 29) {
        while (!paramdd1.B0().r(paramLong))
          paramLong = paramdd1.B0().a(-1, paramLong); 
        return a(paramdd1, paramLong);
      } 
      throw illegalArgumentException;
    } 
  }
  
  public final long d(dd1 paramdd1, long paramLong) {
    int i = paramdd1.n().b(paramLong);
    int j = this.d - i;
    if (j != 0) {
      if (this.e) {
        i = j;
        if (j < 0)
          i = j + 7; 
      } else {
        i = j;
        if (j > 0)
          i = j - 7; 
      } 
      return paramdd1.n().a(i, paramLong);
    } 
    return paramLong;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof jv) {
      paramObject = paramObject;
      if (this.a == ((jv)paramObject).a && this.b == ((jv)paramObject).b && this.c == ((jv)paramObject).c && this.d == ((jv)paramObject).d && this.e == ((jv)paramObject).e && this.f == ((jv)paramObject).f)
        return true; 
    } 
    return false;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("[OfYear]\nMode: ");
    stringBuilder.append(this.a);
    stringBuilder.append("\nMonthOfYear: ");
    stringBuilder.append(this.b);
    stringBuilder.append("\nDayOfMonth: ");
    stringBuilder.append(this.c);
    stringBuilder.append("\nDayOfWeek: ");
    stringBuilder.append(this.d);
    stringBuilder.append("\nAdvanceDayOfWeek: ");
    stringBuilder.append(this.e);
    stringBuilder.append("\nMillisOfDay: ");
    stringBuilder.append(this.f);
    stringBuilder.append('\n');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */