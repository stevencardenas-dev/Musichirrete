package j$.time.chrono;

public enum u implements n {
  BCE, CE;
  
  public static final u[] a;
  
  static {
    Enum<Enum> enum_2 = new Enum<Enum>("BCE", 0);
    BCE = (u)enum_2;
    Enum<Enum> enum_1 = new Enum<Enum>("CE", 1);
    CE = (u)enum_1;
    a = new u[] { (u)enum_2, (u)enum_1 };
  }
  
  public final int getValue() {
    return ordinal();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\chron\\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */