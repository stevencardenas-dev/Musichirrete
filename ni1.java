public final class ni1 implements sm0, AutoCloseable {
  public final String b;
  
  public final mi1 c;
  
  public boolean e;
  
  public ni1(String paramString, mi1 parammi1) {
    this.b = paramString;
    this.c = parammi1;
  }
  
  public final void a(um0 paramum0, om0 paramom0) {
    if (paramom0 == om0.ON_DESTROY) {
      this.e = false;
      paramum0.N().g(this);
    } 
  }
  
  public final void c(wm0 paramwm0, j01 paramj01) {
    paramj01.getClass();
    paramwm0.getClass();
    if (!this.e) {
      this.e = true;
      paramwm0.a(this);
      jo jo = (jo)this.c.a.g;
      paramj01.x(this.b, jo);
      return;
    } 
    tp.f("Already attached to lifecycleOwner");
  }
  
  public final void close() {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ni1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */