public final class s51 {
  public final Object a;
  
  public final Object b;
  
  public s51(Object paramObject1, Object paramObject2) {
    this.a = paramObject1;
    this.b = paramObject2;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (s51.class != paramObject.getClass())
      return false; 
    s51 s511 = (s51)paramObject;
    paramObject = s511.a;
    Object object = this.a;
    if (object == null) {
      if (paramObject != null)
        return false; 
    } else if (!object.equals(paramObject)) {
      return false;
    } 
    paramObject = s511.b;
    object = this.b;
    if (object == null) {
      if (paramObject != null)
        return false; 
    } else if (!object.equals(paramObject)) {
      return false;
    } 
    return true;
  }
  
  public final int hashCode() {
    int i;
    int j = 0;
    Object object = this.a;
    if (object == null) {
      i = 0;
    } else {
      i = object.hashCode();
    } 
    object = this.b;
    if (object != null)
      j = object.hashCode(); 
    return (i + 31) * 31 + j;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */