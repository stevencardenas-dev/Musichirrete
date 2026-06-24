public final class cc extends ki {
  public final int c;
  
  public final int e;
  
  public final Runnable f;
  
  public final hc g;
  
  public cc(hc paramhc, int paramInt1, int paramInt2, Runnable paramRunnable) {}
  
  public final void run() {
    int i;
    int j = this.c / 100;
    hc hc1 = this.g;
    int m = hc1.F();
    int k = this.e;
    if (k == 2) {
      i = 1;
    } else {
      i = 0;
    } 
    while (i < j) {
      try {
        if (!hc1.j || this.b)
          break; 
        int i2 = hc1.F();
        float f = i * m / j;
        if (k == 1 || k == 2) {
          i1 = (int)Math.pow((f / 10.0F), 2.0D);
        } else {
          i1 = (int)f;
        } 
        int i1 = m - i1;
        if (i1 < i2)
          hc1.c0(i1); 
      } finally {
        Exception exception;
      } 
      if (!hc1.j || this.b)
        break; 
      Thread.sleep(100L);
      int n = i;
      if (k == 2) {
        n = i;
        if (i == 0)
          n = (int)(j / 3.0D); 
      } 
      i = n + 1;
    } 
    if (hc1.j && !this.b)
      try {
        hc1.c0(0);
        hc1.M();
        Runnable runnable = this.f;
        if (runnable != null)
          runnable.run(); 
      } finally {
        Exception exception;
      }  
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */