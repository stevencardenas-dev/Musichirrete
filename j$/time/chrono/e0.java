package j$.time.chrono;

public enum e0 implements n {
  BEFORE_ROC, ROC;
  
  public static final e0[] a;
  
  static {
    Enum<Enum> enum_1 = new Enum<Enum>("BEFORE_ROC", 0);
    BEFORE_ROC = (e0)enum_1;
    Enum<Enum> enum_2 = new Enum<Enum>("ROC", 1);
    ROC = (e0)enum_2;
    a = new e0[] { (e0)enum_1, (e0)enum_2 };
  }
  
  public final int getValue() {
    return ordinal();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\chrono\e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */