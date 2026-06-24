public final class cf0 extends m52 {
  public final void a(cy paramcy) {
    iy iy = this.h;
    if (!iy.c || iy.j)
      return; 
    paramcy = iy.l.get(0);
    bf0 bf0 = (bf0)this.b;
    iy.d((int)(((iy)paramcy).g * bf0.q0 + 0.5F));
  }
  
  public final void d() {
    er er = this.b;
    bf0 bf0 = (bf0)er;
    int i = bf0.r0;
    int j = bf0.s0;
    int k = bf0.u0;
    iy iy = this.h;
    if (k == 1) {
      if (i != -1) {
        iy.l.add(er.T.d.h);
        this.b.T.d.h.k.add(iy);
        iy.f = i;
      } else if (j != -1) {
        iy.l.add(er.T.d.i);
        this.b.T.d.i.k.add(iy);
        iy.f = -j;
      } else {
        iy.b = true;
        iy.l.add(er.T.d.i);
        this.b.T.d.i.k.add(iy);
      } 
      m(this.b.d.h);
      m(this.b.d.i);
      return;
    } 
    if (i != -1) {
      iy.l.add(er.T.e.h);
      this.b.T.e.h.k.add(iy);
      iy.f = i;
    } else if (j != -1) {
      iy.l.add(er.T.e.i);
      this.b.T.e.i.k.add(iy);
      iy.f = -j;
    } else {
      iy.b = true;
      iy.l.add(er.T.e.i);
      this.b.T.e.i.k.add(iy);
    } 
    m(this.b.e.h);
    m(this.b.e.i);
  }
  
  public final void e() {
    er er = this.b;
    int i = ((bf0)er).u0;
    iy iy = this.h;
    if (i == 1) {
      er.Y = iy.g;
      return;
    } 
    er.Z = iy.g;
  }
  
  public final void f() {
    this.h.c();
  }
  
  public final boolean k() {
    return false;
  }
  
  public final void m(iy paramiy) {
    iy iy1 = this.h;
    iy1.k.add(paramiy);
    paramiy.l.add(iy1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cf0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */