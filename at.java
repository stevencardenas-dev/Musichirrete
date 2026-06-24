public enum at {
  b, c, e, f;
  
  public static final at[] g;
  
  static {
    Enum<Enum> enum_4 = new Enum<Enum>("DEFAULT", 0);
    b = (at)enum_4;
    Enum<Enum> enum_2 = new Enum<Enum>("LAZY", 1);
    c = (at)enum_2;
    Enum<Enum> enum_1 = new Enum<Enum>("ATOMIC", 2);
    e = (at)enum_1;
    Enum<Enum> enum_3 = new Enum<Enum>("UNDISPATCHED", 3);
    f = (at)enum_3;
    g = new at[] { (at)enum_4, (at)enum_2, (at)enum_1, (at)enum_3 };
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */