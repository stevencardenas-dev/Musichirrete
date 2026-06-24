import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

public final class sk0 extends nk0 {
  public final Serializable b;
  
  public sk0(Boolean paramBoolean) {
    Objects.requireNonNull(paramBoolean);
    this.b = paramBoolean;
  }
  
  public sk0(Number paramNumber) {
    Objects.requireNonNull(paramNumber);
    this.b = paramNumber;
  }
  
  public sk0(String paramString) {
    Objects.requireNonNull(paramString);
    this.b = paramString;
  }
  
  public static boolean l(sk0 paramsk0) {
    Serializable serializable = paramsk0.b;
    if (serializable instanceof Number) {
      serializable = serializable;
      if (serializable instanceof BigInteger || serializable instanceof Long || serializable instanceof Integer || serializable instanceof Short || serializable instanceof Byte)
        return true; 
    } 
    return false;
  }
  
  public final boolean c() {
    Serializable serializable = this.b;
    return (serializable instanceof Boolean) ? ((Boolean)serializable).booleanValue() : Boolean.parseBoolean(i());
  }
  
  public final float d() {
    return (this.b instanceof Number) ? k().floatValue() : Float.parseFloat(i());
  }
  
  public final int e() {
    return (this.b instanceof Number) ? k().intValue() : Integer.parseInt(i());
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && sk0.class == paramObject.getClass()) {
      sk0 sk01 = (sk0)paramObject;
      Serializable serializable = sk01.b;
      paramObject = this.b;
      if (paramObject == null) {
        if (serializable == null)
          return true; 
      } else if (l(this) && l(sk01)) {
        if (paramObject instanceof BigInteger || serializable instanceof BigInteger)
          return j().equals(sk01.j()); 
        if (k().longValue() == sk01.k().longValue())
          return true; 
      } else if (paramObject instanceof Number && serializable instanceof Number) {
        if (paramObject instanceof BigDecimal && serializable instanceof BigDecimal) {
          if (paramObject instanceof BigDecimal) {
            paramObject = paramObject;
          } else {
            paramObject = n21.M(i());
          } 
          if (serializable instanceof BigDecimal) {
            serializable = serializable;
          } else {
            serializable = n21.M(sk01.i());
          } 
          if (paramObject.compareTo((BigDecimal)serializable) == 0)
            return true; 
        } else {
          double d1;
          double d2;
          if (paramObject instanceof Number) {
            d1 = k().doubleValue();
          } else {
            d1 = Double.parseDouble(i());
          } 
          if (serializable instanceof Number) {
            d2 = sk01.k().doubleValue();
          } else {
            d2 = Double.parseDouble(sk01.i());
          } 
          if (d1 == d2 || (Double.isNaN(d1) && Double.isNaN(d2)))
            return true; 
        } 
      } else {
        return paramObject.equals(serializable);
      } 
    } 
    return false;
  }
  
  public final long h() {
    return (this.b instanceof Number) ? k().longValue() : Long.parseLong(i());
  }
  
  public final int hashCode() {
    Serializable serializable = this.b;
    if (serializable == null)
      return 31; 
    if (l(this)) {
      long l = k().longValue();
      return (int)(l ^ l >>> 32L);
    } 
    if (serializable instanceof Number) {
      long l = Double.doubleToLongBits(k().doubleValue());
      return (int)(l ^ l >>> 32L);
    } 
    return serializable.hashCode();
  }
  
  public final String i() {
    Serializable serializable = this.b;
    if (serializable instanceof String)
      return (String)serializable; 
    if (serializable instanceof Number)
      return k().toString(); 
    if (serializable instanceof Boolean)
      return ((Boolean)serializable).toString(); 
    Class<?> clazz = serializable.getClass();
    serializable = new StringBuilder("Unexpected value type: ");
    serializable.append(clazz);
    throw new AssertionError(serializable.toString());
  }
  
  public final BigInteger j() {
    Serializable serializable = this.b;
    if (serializable instanceof BigInteger)
      return (BigInteger)serializable; 
    if (l(this))
      return BigInteger.valueOf(k().longValue()); 
    serializable = i();
    n21.o((String)serializable);
    return new BigInteger((String)serializable);
  }
  
  public final Number k() {
    Serializable serializable = this.b;
    if (serializable instanceof Number)
      return (Number)serializable; 
    if (serializable instanceof String)
      return new ul0((String)serializable); 
    tp.j("Primitive is neither a number nor a string");
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sk0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */