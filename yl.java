public final class yl implements li1 {
  public final li1 a;
  
  public boolean b;
  
  public final zl c;
  
  public yl(zl paramzl, li1 paramli1) {
    this.c = paramzl;
    this.a = paramli1;
  }
  
  public final int a(gh1 paramgh1, rv paramrv, boolean paramBoolean) {
    la0 la0;
    zl zl1 = this.c;
    long l = zl1.g;
    if (zl1.f != -9223372036854775807L)
      return -3; 
    if (this.b) {
      paramrv.setFlags(4);
      return -4;
    } 
    int i = this.a.a(paramgh1, paramrv, paramBoolean);
    if (i == -5) {
      la0 = (la0)paramgh1.c;
      la0.getClass();
      i = la0.B;
      int j = la0.A;
      if (j != 0 || i != 0) {
        if (l != Long.MIN_VALUE)
          i = 0; 
        paramgh1.c = new la0(la0.b, la0.c, la0.e, la0.f, la0.g, la0.h, la0.i, la0.j, la0.k, la0.l, la0.m, la0.n, la0.o, la0.p, la0.q, la0.r, la0.s, la0.t, la0.v, la0.u, la0.w, la0.x, la0.y, la0.z, j, i, la0.C, la0.D);
        return -5;
      } 
      return -5;
    } 
    if (l != Long.MIN_VALUE)
      if (i != -4 || ((rv)la0).b < l) {
        if (i == -3 && zl1.j() == Long.MIN_VALUE) {
          la0.getClass();
          la0.clear();
          la0.setFlags(4);
          this.b = true;
          return -4;
        } 
      } else {
        la0.clear();
        la0.setFlags(4);
        this.b = true;
        return -4;
      }  
    return i;
  }
  
  public final boolean b() {
    return (this.c.f == -9223372036854775807L && this.a.b());
  }
  
  public final void c() {
    this.a.c();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */