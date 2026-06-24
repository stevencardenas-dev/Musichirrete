public final class ts extends n {
  public static final hp2 e = (hp2)new Object();
  
  public final String c = "Room Invalidation Tracker Refresh";
  
  public ts() {
    super(e);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof ts))
      return false; 
    paramObject = paramObject;
    return !!ui0.c(this.c, ((ts)paramObject).c);
  }
  
  public final int hashCode() {
    return this.c.hashCode();
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("CoroutineName(");
    stringBuilder.append(this.c);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ts.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */