public final class f02 extends gj1 {
  public final ThreadLocal i = new ThreadLocal();
  
  public volatile boolean threadLocalIsSet;
  
  public f02(cs paramcs, os paramos) {
    super(paramcs, os1);
    if (!(paramcs.e().l(vs2.c) instanceof rs)) {
      Object object = wf2.m0(paramos, null);
      wf2.X(paramos, object);
      l0(paramos, object);
    } 
  }
  
  public final boolean k0() {
    boolean bool;
    if (this.threadLocalIsSet && this.i.get() == null) {
      bool = true;
    } else {
      bool = false;
    } 
    this.i.remove();
    return bool ^ true;
  }
  
  public final void l0(os paramos, Object paramObject) {
    this.threadLocalIsSet = true;
    this.i.set(new t51(paramos, paramObject));
  }
  
  public final void s(Object paramObject) {
    if (this.threadLocalIsSet) {
      t51 t51 = this.i.get();
      if (t51 != null)
        wf2.X((os)t51.b, t51.c); 
      this.i.remove();
    } 
    null = qv.W(paramObject);
    cs cs = this.h;
    os os = cs.e();
    paramObject = null;
    Object object = wf2.m0(os, null);
    if (object != wf2.o)
      paramObject = qz1.S(cs, os, object); 
    try {
      this.h.f(null);
      return;
    } finally {
      if (paramObject == null || paramObject.k0())
        wf2.X(os, object); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\f02.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */