import in.krosbits.android.widgets.swipetoloadlayout.vZ.LHyji;

public enum re0 {
  b, c, e;
  
  public static final re0[] f;
  
  static {
    Enum<Enum> enum_1 = new Enum<Enum>("START", 0);
    b = (re0)enum_1;
    Enum<Enum> enum_3 = new Enum<Enum>("CENTER", 1);
    c = (re0)enum_3;
    Enum<Enum> enum_2 = new Enum<Enum>("END", 2);
    e = (re0)enum_2;
    f = new re0[] { (re0)enum_1, (re0)enum_3, (re0)enum_2 };
  }
  
  public final int a() {
    int i = ordinal();
    if (i != 0) {
      if (i != 1) {
        if (i == 2)
          return 8388613; 
        tp.f(LHyji.QYROacEJJ);
        return 0;
      } 
      return 1;
    } 
    return 8388611;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\re0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */