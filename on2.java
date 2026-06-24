public enum on2 {
  c, e, f, g;
  
  public static final on2[] h;
  
  public final int b;
  
  static {
    on2 on22 = new on2("BROADCAST_ACTION_UNSPECIFIED", 0, 0);
    c = on22;
    on2 on24 = new on2("PURCHASES_UPDATED_ACTION", 1, 1);
    e = on24;
    on2 on23 = new on2("LOCAL_PURCHASES_UPDATED_ACTION", 2, 2);
    f = on23;
    on2 on21 = new on2("ALTERNATIVE_BILLING_ACTION", 3, 3);
    g = on21;
    h = new on2[] { on22, on24, on23, on21 };
  }
  
  on2(int paramInt1) {
    this.b = paramInt1;
  }
  
  public final String toString() {
    return Integer.toString(this.b);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\on2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */