package j$.time.format;

public enum v {
  ALWAYS, EXCEEDS_PAD, NEVER, NORMAL, NOT_NEGATIVE;
  
  public static final v[] a;
  
  static {
    Enum<Enum> enum_5 = new Enum<Enum>("NORMAL", 0);
    NORMAL = (v)enum_5;
    Enum<Enum> enum_3 = new Enum<Enum>("ALWAYS", 1);
    ALWAYS = (v)enum_3;
    Enum<Enum> enum_4 = new Enum<Enum>("NEVER", 2);
    NEVER = (v)enum_4;
    Enum<Enum> enum_2 = new Enum<Enum>("NOT_NEGATIVE", 3);
    NOT_NEGATIVE = (v)enum_2;
    Enum<Enum> enum_1 = new Enum<Enum>("EXCEEDS_PAD", 4);
    EXCEEDS_PAD = (v)enum_1;
    a = new v[] { (v)enum_5, (v)enum_3, (v)enum_4, (v)enum_2, (v)enum_1 };
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\format\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */