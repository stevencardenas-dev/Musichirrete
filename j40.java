public final class j40 {
  public final String a;
  
  public j40(String paramString) {
    if (paramString != null) {
      this.a = paramString;
      return;
    } 
    k91.h("name is null");
    throw null;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof j40))
      return false; 
    paramObject = ((j40)paramObject).a;
    return this.a.equals(paramObject);
  }
  
  public final int hashCode() {
    return this.a.hashCode() ^ 0xF4243;
  }
  
  public final String toString() {
    return x41.n(new StringBuilder("Encoding{name=\""), this.a, "\"}");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j40.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */