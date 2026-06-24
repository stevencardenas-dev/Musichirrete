public final class ul0 extends Number {
  public final String b;
  
  public ul0(String paramString) {
    this.b = paramString;
  }
  
  public final double doubleValue() {
    return Double.parseDouble(this.b);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof ul0) {
      paramObject = paramObject;
      return this.b.equals(((ul0)paramObject).b);
    } 
    return false;
  }
  
  public final float floatValue() {
    return Float.parseFloat(this.b);
  }
  
  public final int hashCode() {
    return this.b.hashCode();
  }
  
  public final int intValue() {
    String str = this.b;
    try {
      return Integer.parseInt(str);
    } catch (NumberFormatException numberFormatException) {
      try {
        long l = Long.parseLong(str);
        return (int)l;
      } catch (NumberFormatException numberFormatException1) {
        return n21.M(str).intValue();
      } 
    } 
  }
  
  public final long longValue() {
    String str = this.b;
    try {
      return Long.parseLong(str);
    } catch (NumberFormatException numberFormatException) {
      return n21.M(str).longValue();
    } 
  }
  
  public final String toString() {
    return this.b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\ul0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */