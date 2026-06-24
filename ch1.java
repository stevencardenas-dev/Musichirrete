public enum ch1 {
  b, c, e;
  
  public static final ch1[] f;
  
  static {
    Enum<Enum> enum_3 = new Enum<Enum>("AUTOMATIC", 0);
    b = (ch1)enum_3;
    Enum<Enum> enum_2 = new Enum<Enum>("TRUNCATE", 1);
    c = (ch1)enum_2;
    Enum<Enum> enum_1 = new Enum<Enum>("WRITE_AHEAD_LOGGING", 2);
    e = (ch1)enum_1;
    f = new ch1[] { (ch1)enum_3, (ch1)enum_2, (ch1)enum_1 };
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ch1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */