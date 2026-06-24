public enum pr {
  e, f;
  
  public static final pr[] g;
  
  public final String b;
  
  public final int c;
  
  static {
    pr pr1 = new pr("CHUNKED_SHA256", 0, ws2.y(new int[] { 7378, 7367, 7360, 7340, 7345, 7348, 7349 }, ), 32);
    e = pr1;
    pr pr2 = new pr("CHUNKED_SHA512", 1, ws2.y(new int[] { 7378, 7367, 7360, 7340, 7348, 7344, 7345 }, ), 64);
    f = pr2;
    g = new pr[] { pr1, pr2 };
  }
  
  pr(String paramString1, int paramInt1) {
    this.b = paramString1;
    this.c = paramInt1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */