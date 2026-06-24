public final class r82 implements wc0 {
  public final oo0 b;
  
  public final ho0 c;
  
  public r82(oo0 paramoo0, ho0 paramho0) {
    this.b = paramoo0;
    this.c = paramho0;
  }
  
  public final Object h(Object paramObject) {
    paramObject = paramObject;
    if (paramObject instanceof g82) {
      int i = ((g82)paramObject).b;
      this.b.c.compareAndSet(-256, i);
    } 
    this.c.cancel(false);
    return l02.a;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\r82.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */