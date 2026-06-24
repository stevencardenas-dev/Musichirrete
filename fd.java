public final class fd {
  public final u71 a;
  
  public boolean b;
  
  public fd(u71 paramu71) {
    this.a = paramu71;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || fd.class != paramObject.getClass())
      return false; 
    paramObject = ((fd)paramObject).a;
    return this.a.equals(paramObject);
  }
  
  public final int hashCode() {
    return this.a.hashCode();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */