public final class bk1 {
  public static final bk1 c;
  
  public final long a;
  
  public final long b;
  
  static {
    bk1 bk11 = new bk1(0L, 0L);
    new bk1(Long.MAX_VALUE, Long.MAX_VALUE);
    new bk1(Long.MAX_VALUE, 0L);
    new bk1(0L, Long.MAX_VALUE);
    c = bk11;
  }
  
  public bk1(long paramLong1, long paramLong2) {
    boolean bool2 = false;
    if (paramLong1 >= 0L) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    n21.h(bool1);
    boolean bool1 = bool2;
    if (paramLong2 >= 0L)
      bool1 = true; 
    n21.h(bool1);
    this.a = paramLong1;
    this.b = paramLong2;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && bk1.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.a == ((bk1)paramObject).a && this.b == ((bk1)paramObject).b)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return (int)this.a * 31 + (int)this.b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bk1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */