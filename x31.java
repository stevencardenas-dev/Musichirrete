public final class x31 {
  public final l90 a;
  
  public final um0 b;
  
  public x31(l90 paraml90, um0 paramum0) {
    this.a = paraml90;
    this.b = paramum0;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof x31))
      return false; 
    paramObject = paramObject;
    return !ui0.c(this.a, ((x31)paramObject).a) ? false : (!!ui0.c(this.b, ((x31)paramObject).b));
  }
  
  public final int hashCode() {
    int i;
    int j = this.a.hashCode();
    um0 um01 = this.b;
    if (um01 == null) {
      i = 0;
    } else {
      i = um01.hashCode();
    } 
    return j * 31 + i;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("OnBackPressedCallbackInfo(callback=");
    stringBuilder.append(this.a);
    stringBuilder.append(", owner=");
    stringBuilder.append(this.b);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\x31.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */