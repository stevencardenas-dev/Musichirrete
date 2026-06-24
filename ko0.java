public final class ko0 extends no0 {
  public final du a;
  
  public ko0() {
    this.a = du1;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || ko0.class != paramObject.getClass())
      return false; 
    paramObject = paramObject;
    return this.a.equals(((ko0)paramObject).a);
  }
  
  public final int hashCode() {
    int i = ko0.class.getName().hashCode();
    return this.a.hashCode() + i * 31;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("Failure {mOutputData=");
    stringBuilder.append(this.a);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ko0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */