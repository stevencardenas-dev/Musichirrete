public abstract class p implements Comparable {
  public abstract dd1 a();
  
  public abstract long b();
  
  public final int compareTo(Object paramObject) {
    paramObject = paramObject;
    if (this != paramObject) {
      long l = paramObject.b();
      int i = b() cmp l;
      if (i != 0)
        return (i < 0) ? -1 : 1; 
    } 
    return 0;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof p) {
      p p1 = (p)paramObject;
      if (b() == p1.b()) {
        boolean bool;
        paramObject = a();
        dd1 dd1 = p1.a();
        if (paramObject == dd1) {
          bool = true;
        } else if (paramObject == null || dd1 == null) {
          bool = false;
        } else {
          bool = paramObject.equals(dd1);
        } 
        if (bool)
          return true; 
      } 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i = (int)(b() ^ b() >>> 32L);
    return a().hashCode() + i;
  }
  
  public String toString() {
    return yg0.E.a(this);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */