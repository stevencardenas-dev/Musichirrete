public final class wa extends wl {
  public final ta a;
  
  public wa(ta paramta) {
    this.a = paramta;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof wl) {
      wl wl1 = (wl)paramObject;
      paramObject = vl.b;
      if (paramObject.equals(paramObject)) {
        paramObject = ((wa)wl1).a;
        if (this.a.equals(paramObject))
          return true; 
      } 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i = vl.b.hashCode();
    return this.a.hashCode() ^ (i ^ 0xF4243) * 1000003;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("ClientInfo{clientType=");
    stringBuilder.append(vl.b);
    stringBuilder.append(", androidClientInfo=");
    stringBuilder.append(this.a);
    stringBuilder.append("}");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */