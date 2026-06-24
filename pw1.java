public final class pw1 extends lw1 {
  public final int a;
  
  public kw1 b;
  
  public void a(kw1 paramkw1) {
    switch (this.a) {
      default:
        return;
      case 1:
        break;
    } 
    paramkw1 = this.b;
    if (!((qw1)paramkw1).I) {
      paramkw1.K();
      ((qw1)paramkw1).I = true;
    } 
  }
  
  public void d(kw1 paramkw1) {
    switch (this.a) {
      default:
        return;
      case 2:
        this.b.C();
        paramkw1.A(this);
        return;
      case 1:
        break;
    } 
    qw1 qw1 = (qw1)this.b;
    int i = qw1.H - 1;
    qw1.H = i;
    if (i == 0) {
      qw1.I = false;
      qw1.m();
    } 
    paramkw1.A(this);
  }
  
  public void f(kw1 paramkw1) {
    switch (this.a) {
      default:
        return;
      case 0:
        break;
    } 
    qw1 qw1 = (qw1)this.b;
    qw1.F.remove(paramkw1);
    if (!qw1.t()) {
      qw1.x(qw1, k91.f, false);
      qw1.u = true;
      qw1.x(qw1, k91.e, false);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pw1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */