public enum o72 {
  b, c, e, f, g, h;
  
  public static final o72[] i;
  
  static {
    Enum<Enum> enum_5 = new Enum<Enum>("ENQUEUED", 0);
    b = (o72)enum_5;
    Enum<Enum> enum_1 = new Enum<Enum>("RUNNING", 1);
    c = (o72)enum_1;
    Enum<Enum> enum_2 = new Enum<Enum>("SUCCEEDED", 2);
    e = (o72)enum_2;
    Enum<Enum> enum_3 = new Enum<Enum>("FAILED", 3);
    f = (o72)enum_3;
    Enum<Enum> enum_6 = new Enum<Enum>("BLOCKED", 4);
    g = (o72)enum_6;
    Enum<Enum> enum_4 = new Enum<Enum>("CANCELLED", 5);
    h = (o72)enum_4;
    i = new o72[] { (o72)enum_5, (o72)enum_1, (o72)enum_2, (o72)enum_3, (o72)enum_6, (o72)enum_4 };
  }
  
  public final boolean a() {
    return (this == e || this == f || this == h);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\o72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */