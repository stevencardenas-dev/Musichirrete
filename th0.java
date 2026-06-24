public final class th0 {
  public final int a;
  
  public final Object b;
  
  public th0(int paramInt, Object paramObject) {
    this.a = paramInt;
    this.b = paramObject;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof th0))
      return false; 
    paramObject = paramObject;
    return (this.a != ((th0)paramObject).a) ? false : (!!ui0.c(this.b, ((th0)paramObject).b));
  }
  
  public final int hashCode() {
    int i;
    int j = Integer.hashCode(this.a);
    Object object = this.b;
    if (object == null) {
      i = 0;
    } else {
      i = object.hashCode();
    } 
    return j * 31 + i;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("IndexedValue(index=");
    stringBuilder.append(this.a);
    stringBuilder.append(", value=");
    stringBuilder.append(this.b);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\th0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */