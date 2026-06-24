public final class jd implements Runnable {
  public final int b;
  
  public final kd c;
  
  public final void run() {
    jd jd1;
    int i = this.b;
    kd kd1 = this.c;
    switch (i) {
      default:
        try {
          ((w60)kd1.m).l0();
        } finally {
          kd1 = null;
        } 
      case 1:
        jd1 = kd1.A;
        if (kd1.u > 0 && kd1.s && kd1.m.J()) {
          hc hc = kd1.m;
          if (!hc.j) {
            int j = hc.A();
            i = kd1.m.C() - kd1.u;
            if (i > j) {
              if (Math.abs(j - i) < 1000) {
                kd.H.post(jd1);
              } else {
                kd1.k0();
              } 
            } else {
              kd.H.post(jd1);
            } 
          } 
        } 
        return;
      case 0:
        break;
    } 
    try {
      kd1.F.s(kd1.m);
    } finally {
      kd1 = null;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */