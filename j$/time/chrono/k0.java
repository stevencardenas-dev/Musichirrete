package j$.time.chrono;

public enum k0 implements n {
  BE, BEFORE_BE;
  
  public static final k0[] a;
  
  static {
    Enum<Enum> enum_2 = new Enum<Enum>("BEFORE_BE", 0);
    BEFORE_BE = (k0)enum_2;
    Enum<Enum> enum_1 = new Enum<Enum>("BE", 1);
    BE = (k0)enum_1;
    a = new k0[] { (k0)enum_2, (k0)enum_1 };
  }
  
  public final int getValue() {
    return ordinal();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\chrono\k0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */