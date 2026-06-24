public enum pm0 {
  b, c, e, f, g;
  
  public static final pm0[] h;
  
  static {
    Enum<Enum> enum_2 = new Enum<Enum>("DESTROYED", 0);
    b = (pm0)enum_2;
    Enum<Enum> enum_3 = new Enum<Enum>("INITIALIZED", 1);
    c = (pm0)enum_3;
    Enum<Enum> enum_4 = new Enum<Enum>("CREATED", 2);
    e = (pm0)enum_4;
    Enum<Enum> enum_1 = new Enum<Enum>("STARTED", 3);
    f = (pm0)enum_1;
    Enum<Enum> enum_5 = new Enum<Enum>("RESUMED", 4);
    g = (pm0)enum_5;
    h = new pm0[] { (pm0)enum_2, (pm0)enum_3, (pm0)enum_4, (pm0)enum_1, (pm0)enum_5 };
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pm0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */