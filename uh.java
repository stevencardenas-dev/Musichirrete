public final class uh {
  public final long a;
  
  public final hv b;
  
  public uh c;
  
  public String d;
  
  public int e = Integer.MIN_VALUE;
  
  public int f = Integer.MIN_VALUE;
  
  public uh(kv paramkv, long paramLong) {
    this.a = paramLong;
    this.b = paramkv;
  }
  
  public final String a(long paramLong) {
    uh uh1 = this.c;
    if (uh1 == null || paramLong < uh1.a) {
      if (this.d == null)
        this.d = this.b.f(this.a); 
      return this.d;
    } 
    return uh1.a(paramLong);
  }
  
  public final int b(long paramLong) {
    uh uh1 = this.c;
    if (uh1 == null || paramLong < uh1.a) {
      if (this.e == Integer.MIN_VALUE)
        this.e = this.b.h(this.a); 
      return this.e;
    } 
    return uh1.b(paramLong);
  }
  
  public final int c(long paramLong) {
    uh uh1 = this.c;
    if (uh1 == null || paramLong < uh1.a) {
      if (this.f == Integer.MIN_VALUE)
        this.f = this.b.k(this.a); 
      return this.f;
    } 
    return uh1.c(paramLong);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */