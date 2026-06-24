public final class jk {
  public static final ik b = (ik)new Object();
  
  public final Object a;
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof jk) {
      paramObject = ((jk)paramObject).a;
      if (ui0.c(this.a, paramObject))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    Object object = this.a;
    return (object == null) ? 0 : object.hashCode();
  }
  
  public final String toString() {
    Object object = this.a;
    if (object instanceof hk)
      return ((hk)object).toString(); 
    StringBuilder stringBuilder = new StringBuilder("Value(");
    stringBuilder.append(object);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */