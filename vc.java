import java.util.Locale;

public abstract class vc extends hu {
  public final iu b;
  
  public vc(iu paramiu) {
    if (paramiu != null) {
      this.b = paramiu;
      return;
    } 
    l0.l("The type must not be null");
    throw null;
  }
  
  public long a(int paramInt, long paramLong) {
    return i().a(paramInt, paramLong);
  }
  
  public String c(int paramInt, Locale paramLocale) {
    return f(paramInt, paramLocale);
  }
  
  public String d(long paramLong, Locale paramLocale) {
    return c(b(paramLong), paramLocale);
  }
  
  public final String e(uo0 paramuo0, Locale paramLocale) {
    return c(paramuo0.c(this.b), paramLocale);
  }
  
  public String f(int paramInt, Locale paramLocale) {
    return Integer.toString(paramInt);
  }
  
  public String g(long paramLong, Locale paramLocale) {
    return f(b(paramLong), paramLocale);
  }
  
  public final String h(uo0 paramuo0, Locale paramLocale) {
    return f(paramuo0.c(this.b), paramLocale);
  }
  
  public g20 j() {
    return null;
  }
  
  public int k(Locale paramLocale) {
    int i = l();
    if (i >= 0) {
      if (i < 10)
        return 1; 
      if (i < 100)
        return 2; 
      if (i < 1000)
        return 3; 
    } 
    return Integer.toString(i).length();
  }
  
  public final iu q() {
    return this.b;
  }
  
  public boolean r(long paramLong) {
    return false;
  }
  
  public final boolean t() {
    return true;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("DateTimeField[");
    stringBuilder.append(this.b.b);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
  
  public long u(long paramLong) {
    return paramLong - v(paramLong);
  }
  
  public long x(long paramLong, String paramString, Locale paramLocale) {
    return w(z(paramString, paramLocale), paramLong);
  }
  
  public int z(String paramString, Locale paramLocale) {
    try {
      return Integer.parseInt(paramString);
    } catch (NumberFormatException numberFormatException) {
      throw new eh0(this.b, paramString);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */