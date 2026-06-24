public final class sf1 implements sm0 {
  public final om0 b;
  
  public final me1 c;
  
  public final xs e;
  
  public final om0 f;
  
  public final ni g;
  
  public final yz0 h;
  
  public final u20 i;
  
  public sf1(om0 paramom01, me1 paramme1, xs paramxs, om0 paramom02, ni paramni, yz0 paramyz0, u20 paramu20) {
    this.b = paramom01;
    this.c = paramme1;
    this.e = paramxs;
    this.f = paramom02;
    this.g = paramni;
    this.h = paramyz0;
    this.i = paramu20;
  }
  
  public final void a(um0 paramum0, om0 paramom0) {
    vq vq;
    om0 om01 = this.b;
    me1 me11 = this.c;
    if (paramom0 == om01) {
      vq = new vq(this.h, this.i, null, 3);
      me11.b = qv.L(this.e, null, null, vq, 3);
      return;
    } 
    if (vq == this.f) {
      vj0 vj0 = (vj0)me11.b;
      if (vj0 != null)
        vj0.c(null); 
      me11.b = null;
    } 
    if (vq == om0.ON_DESTROY)
      this.g.f(l02.a); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sf1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */