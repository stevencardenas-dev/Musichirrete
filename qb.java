public enum qb {
  b, c;
  
  public static final qb[] e;
  
  static {
    Enum<Enum> enum_1 = new Enum<Enum>("EXPONENTIAL", 0);
    b = (qb)enum_1;
    Enum<Enum> enum_2 = new Enum<Enum>("LINEAR", 1);
    c = (qb)enum_2;
    e = new qb[] { (qb)enum_1, (qb)enum_2 };
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */