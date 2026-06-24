public final class o51 implements kl {
  public final Class a;
  
  public o51(Class paramClass) {
    this.a = paramClass;
  }
  
  public final Class a() {
    throw null;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof o51) {
      paramObject = ((o51)paramObject).a;
      if (this.a.equals(paramObject))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return this.a.hashCode();
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.a.toString());
    stringBuilder.append(" (Kotlin reflection is not available)");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\o51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */