public final class kr extends lr {
  public final int a;
  
  public kr(int paramInt) {
    this.a = paramInt;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof kr))
      return false; 
    paramObject = paramObject;
    return !(this.a != ((kr)paramObject).a);
  }
  
  public final int hashCode() {
    return Integer.hashCode(this.a);
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("ConstraintsNotMet(reason=");
    stringBuilder.append(this.a);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */