public final class g11 extends qv {
  public final b11 i;
  
  public g11(b11 paramb11) {
    this.i = paramb11;
  }
  
  public final boolean equals(Object paramObject) {
    if (this != paramObject) {
      if (paramObject == null || g11.class != paramObject.getClass())
        return false; 
      paramObject = paramObject;
      if (!ui0.c(this.i, ((g11)paramObject).i))
        return false; 
    } 
    return true;
  }
  
  public final int hashCode() {
    return this.i.hashCode() - 31;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("InProgress(latestEvent=");
    stringBuilder.append(this.i);
    stringBuilder.append(", direction=-1)");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\g11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */