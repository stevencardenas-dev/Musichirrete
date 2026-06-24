public enum dc0 {
  b, c, e, f, g;
  
  public static final dc0[] h;
  
  static {
    Enum<Enum> enum_2 = new Enum<Enum>("ON_CONFIGURE", 0);
    b = (dc0)enum_2;
    Enum<Enum> enum_3 = new Enum<Enum>("ON_CREATE", 1);
    c = (dc0)enum_3;
    Enum<Enum> enum_4 = new Enum<Enum>("ON_UPGRADE", 2);
    e = (dc0)enum_4;
    Enum<Enum> enum_1 = new Enum<Enum>("ON_DOWNGRADE", 3);
    f = (dc0)enum_1;
    Enum<Enum> enum_5 = new Enum<Enum>("ON_OPEN", 4);
    g = (dc0)enum_5;
    h = new dc0[] { (dc0)enum_2, (dc0)enum_3, (dc0)enum_4, (dc0)enum_1, (dc0)enum_5 };
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dc0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */