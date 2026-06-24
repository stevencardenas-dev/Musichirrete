public enum lp0 {
  c, e, f, g, h, i, j;
  
  public static final lp0[] k;
  
  public final int b;
  
  static {
    lp0 lp04 = new lp0("REASON_UNKNOWN", 0, 0);
    c = lp04;
    lp0 lp02 = new lp0("MESSAGE_TOO_OLD", 1, 1);
    e = lp02;
    lp0 lp01 = new lp0("CACHE_FULL", 2, 2);
    f = lp01;
    lp0 lp06 = new lp0("PAYLOAD_TOO_BIG", 3, 3);
    g = lp06;
    lp0 lp05 = new lp0("MAX_RETRIES_REACHED", 4, 4);
    h = lp05;
    lp0 lp07 = new lp0("INVALID_PAYLOD", 5, 5);
    i = lp07;
    lp0 lp03 = new lp0("SERVER_ERROR", 6, 6);
    j = lp03;
    k = new lp0[] { lp04, lp02, lp01, lp06, lp05, lp07, lp03 };
  }
  
  lp0(int paramInt1) {
    this.b = paramInt1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lp0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */