public final class pt0 {
  public final fw0 a;
  
  public final long b;
  
  public final long c;
  
  public final long d;
  
  public final boolean e;
  
  public final boolean f;
  
  public pt0(fw0 paramfw0, long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean1, boolean paramBoolean2) {
    this.a = paramfw0;
    this.b = paramLong1;
    this.c = paramLong2;
    this.d = paramLong3;
    this.e = paramBoolean1;
    this.f = paramBoolean2;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && pt0.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.b == ((pt0)paramObject).b && this.c == ((pt0)paramObject).c && this.d == ((pt0)paramObject).d && this.e == ((pt0)paramObject).e && this.f == ((pt0)paramObject).f) {
        paramObject = ((pt0)paramObject).a;
        int i = d12.a;
        if (this.a.equals(paramObject))
          return true; 
      } 
    } 
    return false;
  }
  
  public final int hashCode() {
    return ((((((this.a.hashCode() + 527) * 31 + (int)this.b) * 31 + 1) * 31 + (int)this.c) * 31 + (int)this.d) * 31 + this.e) * 31 + this.f;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pt0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */