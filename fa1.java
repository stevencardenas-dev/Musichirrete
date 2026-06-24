public enum fa1 {
  b, c, e;
  
  public static final fa1[] f;
  
  static {
    Enum<Enum> enum_3 = new Enum<Enum>("DEFAULT", 0);
    b = (fa1)enum_3;
    Enum<Enum> enum_1 = new Enum<Enum>("VERY_LOW", 1);
    c = (fa1)enum_1;
    Enum<Enum> enum_2 = new Enum<Enum>("HIGHEST", 2);
    e = (fa1)enum_2;
    f = new fa1[] { (fa1)enum_3, (fa1)enum_1, (fa1)enum_2 };
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fa1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */