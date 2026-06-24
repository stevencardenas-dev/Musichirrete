public final class lu1 implements ms {
  public final Object b;
  
  public final ThreadLocal c;
  
  public final nu1 e;
  
  public lu1(w81 paramw81, ThreadLocal paramThreadLocal) {
    this.b = paramw81;
    this.c = paramThreadLocal;
    this.e = new nu1(paramThreadLocal);
  }
  
  public final ns getKey() {
    return this.e;
  }
  
  public final Object h(Object paramObject, ad0 paramad0) {
    return paramad0.g(paramObject, this);
  }
  
  public final os k(os paramos) {
    return dd1.f0(this, paramos);
  }
  
  public final ms l(ns paramns) {
    return this.e.equals(paramns) ? this : null;
  }
  
  public final os o(ns paramns) {
    b40 b40;
    lu1 lu11 = this;
    if (this.e.equals(paramns))
      b40 = b40.b; 
    return b40;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("ThreadLocal(value=");
    stringBuilder.append(this.b);
    stringBuilder.append(", threadLocal = ");
    stringBuilder.append(this.c);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lu1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */