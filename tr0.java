public final class tr0 extends uu1 {
  public static final Object e = new Object();
  
  public final uu1 b;
  
  public final Object c;
  
  public final Object d;
  
  public tr0(uu1 paramuu1, Object paramObject1, Object paramObject2) {
    this.b = paramuu1;
    this.c = paramObject1;
    this.d = paramObject2;
  }
  
  public final int a(boolean paramBoolean) {
    return this.b.a(paramBoolean);
  }
  
  public final int b(Object paramObject) {
    if (e == paramObject)
      paramObject = this.d; 
    return this.b.b(paramObject);
  }
  
  public final int c(boolean paramBoolean) {
    return this.b.c(paramBoolean);
  }
  
  public final int e(int paramInt1, int paramInt2, boolean paramBoolean) {
    return this.b.e(paramInt1, paramInt2, paramBoolean);
  }
  
  public final su1 f(int paramInt, su1 paramsu1, boolean paramBoolean) {
    this.b.f(paramInt, paramsu1, paramBoolean);
    if (d12.a(paramsu1.b, this.d))
      paramsu1.b = e; 
    return paramsu1;
  }
  
  public final int h() {
    return this.b.h();
  }
  
  public final Object k(int paramInt) {
    Object object = this.b.k(paramInt);
    return d12.a(object, this.d) ? e : object;
  }
  
  public final tu1 l(int paramInt, tu1 paramtu1, long paramLong) {
    this.b.l(paramInt, paramtu1, paramLong);
    if (d12.a(paramtu1.a, this.c))
      paramtu1.a = tu1.k; 
    return paramtu1;
  }
  
  public final int m() {
    return this.b.m();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tr0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */