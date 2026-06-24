public final class bc extends ki {
  public final int c;
  
  public final int e;
  
  public final hc f;
  
  public bc(hc paramhc, int paramInt1, int paramInt2) {}
  
  public final void run() {
    hc hc1;
    int i = this.c;
    int j = i / 100;
    byte b = 0;
    while (true) {
      hc1 = this.f;
      if (b < j) {
        long l;
        try {
          if (!hc1.k || this.b)
            break; 
          if (b == 0 && i % 2 == 1) {
            l = 300L;
          } else {
            l = 100L;
          } 
        } finally {
          Exception exception;
        } 
        Thread.sleep(l);
        if (!hc1.k || this.b)
          break; 
        int m = hc1.F();
        float f = b * 100.0F / j;
        int k = this.e;
        if (k == 1 || k == 2) {
          k = (int)Math.pow((f / 10.0F), 2.0D);
        } else {
          k = (int)f;
        } 
        if (k > m)
          hc1.c0(k); 
        b++;
        continue;
      } 
      break;
    } 
    if (hc1.k && !this.b)
      hc1.c0(100); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */