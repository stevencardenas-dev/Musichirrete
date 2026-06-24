public final class e92 extends wc {
  public final g20 c;
  
  public final boolean e;
  
  public final hv f;
  
  public e92(g20 paramg20, hv paramhv) {
    super(paramg20.c());
    if (paramg20.f()) {
      boolean bool;
      this.c = paramg20;
      if (paramg20.d() < 43200000L) {
        bool = true;
      } else {
        bool = false;
      } 
      this.e = bool;
      this.f = paramhv;
      return;
    } 
    l0.k();
    throw null;
  }
  
  public final long a(int paramInt, long paramLong) {
    int i = h(paramLong);
    long l = i;
    paramLong = this.c.a(paramInt, paramLong + l);
    if (this.e) {
      paramInt = i;
    } else {
      paramInt = g(paramLong);
    } 
    return paramLong - paramInt;
  }
  
  public final long b(long paramLong1, long paramLong2) {
    int i = h(paramLong1);
    long l = i;
    paramLong1 = this.c.b(paramLong1 + l, paramLong2);
    if (!this.e)
      i = g(paramLong1); 
    return paramLong1 - i;
  }
  
  public final long d() {
    return this.c.d();
  }
  
  public final boolean e() {
    boolean bool = this.e;
    g20 g201 = this.c;
    return bool ? g201.e() : ((g201.e() && this.f.l()));
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof e92) {
      paramObject = paramObject;
      if (this.c.equals(((e92)paramObject).c) && this.f.equals(((e92)paramObject).f))
        return true; 
    } 
    return false;
  }
  
  public final int g(long paramLong) {
    int i = this.f.i(paramLong);
    long l = i;
    if ((paramLong - l ^ paramLong) >= 0L || (paramLong ^ l) >= 0L)
      return i; 
    throw new ArithmeticException("Subtracting time zone offset caused overflow");
  }
  
  public final int h(long paramLong) {
    int i = this.f.h(paramLong);
    long l = i;
    if ((paramLong + l ^ paramLong) >= 0L || (paramLong ^ l) < 0L)
      return i; 
    throw new ArithmeticException("Adding time zone offset caused overflow");
  }
  
  public final int hashCode() {
    int i = this.c.hashCode();
    return this.f.hashCode() ^ i;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\e92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */