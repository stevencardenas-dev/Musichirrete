public final class yw extends b60 {
  public static final yw f;
  
  public ws e;
  
  static {
    int j = qt1.c;
    int i = qt1.d;
    long l = qt1.e;
    String str = qt1.a;
    rs rs = new rs();
    ((yw)rs).e = new ws(j, i, l, str);
    f = (yw)rs;
  }
  
  public final void close() {
    throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
  }
  
  public final void m(os paramos, Runnable paramRunnable) {
    ws.d(this.e, paramRunnable, 6);
  }
  
  public final void p(os paramos, Runnable paramRunnable) {
    ws.d(this.e, paramRunnable, 2);
  }
  
  public final String toString() {
    return "Dispatchers.Default";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */