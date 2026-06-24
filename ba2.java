public final class ba2 {
  public final String a;
  
  public ba2(String paramString) {
    this.a = paramString;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof ba2) {
      paramObject = paramObject;
      if (this.a.equals(((ba2)paramObject).a))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return (this.a.hashCode() ^ 0xF4243) * 1000003;
  }
  
  public final String toString() {
    return x41.n(new StringBuilder("IntegrityTokenRequest{nonce="), this.a, ", cloudProjectNumber=null}");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ba2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */