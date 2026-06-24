public abstract class ov2 implements Cloneable {
  public final pv2 b;
  
  public pv2 c;
  
  public ov2(pv2 parampv2) {
    this.b = parampv2;
    if (!parampv2.j()) {
      this.c = (pv2)parampv2.i(4, null);
      return;
    } 
    l0.l("Default instance must be immutable.");
    throw null;
  }
  
  public final void a() {
    if (!this.c.j()) {
      pv2 pv22 = (pv2)this.b.i(4, null);
      pv2 pv21 = this.c;
      gw2.c.a(pv22.getClass()).c(pv22, pv21);
      this.c = pv22;
    } 
  }
  
  public final pv2 b() {
    boolean bool = this.c.j();
    pv2 pv21 = this.c;
    if (bool) {
      pv21.getClass();
      gw2.c.a(pv21.getClass()).h(pv21);
      pv21.k();
      pv21 = this.c;
    } 
    pv21.getClass();
    bool = true;
    pv2 pv22 = null;
    byte b = ((Byte)pv21.i(1, null)).byteValue();
    if (b != 1)
      if (b == 0) {
        bool = false;
      } else {
        bool = gw2.c.a(pv21.getClass()).e(pv21);
        if (true == bool)
          pv22 = pv21; 
        pv21.i(2, pv22);
      }  
    if (bool)
      return pv21; 
    throw new RuntimeException("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
  }
  
  public final Object clone() {
    ov2 ov21 = (ov2)this.b.i(5, null);
    boolean bool = this.c.j();
    pv2 pv21 = this.c;
    if (bool) {
      pv21.getClass();
      gw2.c.a(pv21.getClass()).h(pv21);
      pv21.k();
      pv21 = this.c;
    } 
    ov21.c = pv21;
    return ov21;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ov2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */