public abstract class tv extends vc {
  public final hu c;
  
  public tv(hu paramhu, iu paramiu) {
    super(paramiu);
    if (paramhu != null) {
      if (paramhu.t()) {
        this.c = paramhu;
        return;
      } 
      l0.l("The field must be supported");
      throw null;
    } 
    l0.l("The field must not be null");
    throw null;
  }
  
  public g20 i() {
    return this.c.i();
  }
  
  public g20 p() {
    return this.c.p();
  }
  
  public final boolean s() {
    return this.c.s();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */