import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;

public final class v02 extends hu implements Serializable {
  public static HashMap e;
  
  public final iu b;
  
  public final g20 c;
  
  public v02(iu paramiu, g20 paramg20) {
    if (paramiu != null && paramg20 != null) {
      this.b = paramiu;
      this.c = paramg20;
      return;
    } 
    l0.k();
    throw null;
  }
  
  public static v02 z(iu paramiu, g20 paramg20) {
    v02 v021;
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{v02}} */
    try {
      HashMap<Object, Object> hashMap = e;
      v021 = null;
      if (hashMap == null) {
        hashMap = new HashMap<Object, Object>();
        this(7);
        e = hashMap;
      } else {
        v02 v023 = (v02)hashMap.get(paramiu);
        if (v023 == null || v023.c == paramg20)
          v021 = v023; 
      } 
    } finally {}
    v02 v022 = v021;
    if (v021 == null) {
      v022 = new v02();
      this(paramiu, paramg20);
      e.put(paramiu, v022);
    } 
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{v02}} */
    return v022;
  }
  
  public final UnsupportedOperationException A() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.b);
    stringBuilder.append(" field is unsupported");
    return new UnsupportedOperationException(stringBuilder.toString());
  }
  
  public final long a(int paramInt, long paramLong) {
    return this.c.a(paramInt, paramLong);
  }
  
  public final int b(long paramLong) {
    throw A();
  }
  
  public final String c(int paramInt, Locale paramLocale) {
    throw A();
  }
  
  public final String d(long paramLong, Locale paramLocale) {
    throw A();
  }
  
  public final String e(uo0 paramuo0, Locale paramLocale) {
    throw A();
  }
  
  public final String f(int paramInt, Locale paramLocale) {
    throw A();
  }
  
  public final String g(long paramLong, Locale paramLocale) {
    throw A();
  }
  
  public final String h(uo0 paramuo0, Locale paramLocale) {
    throw A();
  }
  
  public final g20 i() {
    return this.c;
  }
  
  public final g20 j() {
    return null;
  }
  
  public final int k(Locale paramLocale) {
    throw A();
  }
  
  public final int l() {
    throw A();
  }
  
  public final int o() {
    throw A();
  }
  
  public final g20 p() {
    return null;
  }
  
  public final iu q() {
    return this.b;
  }
  
  public final boolean r(long paramLong) {
    throw A();
  }
  
  public final boolean s() {
    return false;
  }
  
  public final boolean t() {
    return false;
  }
  
  public final String toString() {
    return "UnsupportedDateTimeField";
  }
  
  public final long u(long paramLong) {
    throw A();
  }
  
  public final long v(long paramLong) {
    throw A();
  }
  
  public final long w(int paramInt, long paramLong) {
    throw A();
  }
  
  public final long x(long paramLong, String paramString, Locale paramLocale) {
    throw A();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\v02.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */