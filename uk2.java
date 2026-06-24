public abstract class uk2 implements Cloneable {
  public final wk2 b;
  
  public wk2 c;
  
  public uk2(wk2 paramwk2) {
    this.b = paramwk2;
    if (!paramwk2.h()) {
      this.c = paramwk2.n();
      return;
    } 
    l0.l("Default instance must be immutable.");
    throw null;
  }
  
  public final wk2 a() {
    boolean bool = this.c.h();
    wk2 wk21 = this.c;
    if (bool) {
      wk21.getClass();
      bm2.c.a(wk21.getClass()).a(wk21);
      wk21.e();
      wk21 = this.c;
    } 
    wk21.getClass();
    if (wk2.i(wk21, true))
      return wk21; 
    throw new lm2();
  }
  
  public final void b() {
    if (!this.c.h()) {
      wk2 wk21 = this.b.n();
      wk2 wk22 = this.c;
      bm2.c.a(wk21.getClass()).c(wk21, wk22);
      this.c = wk21;
    } 
  }
  
  public final Object clone() {
    uk2 uk21 = (uk2)this.b.j(5);
    boolean bool = this.c.h();
    wk2 wk21 = this.c;
    if (bool) {
      wk21.getClass();
      bm2.c.a(wk21.getClass()).a(wk21);
      wk21.e();
      wk21 = this.c;
    } 
    uk21.c = wk21;
    return uk21;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uk2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */