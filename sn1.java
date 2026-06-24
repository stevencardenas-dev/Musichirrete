public final class sn1 {
  public final String a;
  
  public final long b;
  
  public final String c;
  
  public final String d;
  
  public km0 e;
  
  public sn1(String paramString1, long paramLong, String paramString2, String paramString3) {
    this.a = paramString1;
    if (paramLong <= 0L)
      paramLong = -999L; 
    this.b = paramLong;
    this.c = paramString2;
    this.d = paramString3;
  }
  
  public final km0 a() {
    return this.e;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof sn1))
      return false; 
    paramObject = paramObject;
    return (this.a.equals(((sn1)paramObject).a) && this.b == ((sn1)paramObject).b);
  }
  
  public final int hashCode() {
    return this.a.hashCode();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sn1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */