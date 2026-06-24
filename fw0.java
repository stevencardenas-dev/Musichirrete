public final class fw0 {
  public final Object a;
  
  public final int b;
  
  public final int c;
  
  public final long d;
  
  public final int e;
  
  public fw0(long paramLong, Object paramObject) {
    this(paramObject, -1, -1, paramLong, -1);
  }
  
  public fw0(Object paramObject, int paramInt1, int paramInt2, long paramLong, int paramInt3) {
    this.a = paramObject;
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramLong;
    this.e = paramInt3;
  }
  
  public fw0(Object paramObject, long paramLong, int paramInt) {
    this(paramObject, -1, -1, paramLong, paramInt);
  }
  
  public final fw0 a(Object paramObject) {
    if (this.a.equals(paramObject))
      return this; 
    long l = this.d;
    int i = this.e;
    return new fw0(paramObject, this.b, this.c, l, i);
  }
  
  public final boolean b() {
    return (this.b != -1);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && fw0.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.a.equals(((fw0)paramObject).a) && this.b == ((fw0)paramObject).b && this.c == ((fw0)paramObject).c && this.d == ((fw0)paramObject).d && this.e == ((fw0)paramObject).e)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return ((((this.a.hashCode() + 527) * 31 + this.b) * 31 + this.c) * 31 + (int)this.d) * 31 + this.e;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fw0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */