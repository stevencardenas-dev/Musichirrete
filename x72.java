public final class x72 {
  public String a;
  
  public o72 b;
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof x72))
      return false; 
    paramObject = paramObject;
    return !ui0.c(this.a, ((x72)paramObject).a) ? false : (!(this.b != ((x72)paramObject).b));
  }
  
  public final int hashCode() {
    int i = this.a.hashCode();
    return this.b.hashCode() + i * 31;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("IdAndState(id=");
    stringBuilder.append(this.a);
    stringBuilder.append(", state=");
    stringBuilder.append(this.b);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\x72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */