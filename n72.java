public final class n72 {
  public final String a;
  
  public final int b;
  
  public n72(String paramString, int paramInt) {
    this.a = paramString;
    this.b = paramInt;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof n72))
      return false; 
    paramObject = paramObject;
    return !ui0.c(this.a, ((n72)paramObject).a) ? false : (!(this.b != ((n72)paramObject).b));
  }
  
  public final int hashCode() {
    int i = this.a.hashCode();
    return Integer.hashCode(this.b) + i * 31;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("WorkGenerationalId(workSpecId=");
    stringBuilder.append(this.a);
    stringBuilder.append(", generation=");
    stringBuilder.append(this.b);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */