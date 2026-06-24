public final class pf1 {
  public static final pf1 b = new pf1(0);
  
  public final int a;
  
  public pf1(int paramInt) {
    this.a = paramInt;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && pf1.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.a == ((pf1)paramObject).a)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return this.a;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pf1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */