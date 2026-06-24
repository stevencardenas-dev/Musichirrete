public enum om0 {
  ON_ANY, ON_CREATE, ON_DESTROY, ON_PAUSE, ON_RESUME, ON_START, ON_STOP;
  
  public static final q40 $ENTRIES;
  
  public static final om0[] $VALUES;
  
  public static final mm0 Companion;
  
  static {
    Enum<Enum> enum_7 = new Enum<Enum>("ON_CREATE", 0);
    ON_CREATE = (om0)enum_7;
    Enum<Enum> enum_1 = new Enum<Enum>("ON_START", 1);
    ON_START = (om0)enum_1;
    Enum<Enum> enum_2 = new Enum<Enum>("ON_RESUME", 2);
    ON_RESUME = (om0)enum_2;
    Enum<Enum> enum_4 = new Enum<Enum>("ON_PAUSE", 3);
    ON_PAUSE = (om0)enum_4;
    Enum<Enum> enum_5 = new Enum<Enum>("ON_STOP", 4);
    ON_STOP = (om0)enum_5;
    Enum<Enum> enum_3 = new Enum<Enum>("ON_DESTROY", 5);
    ON_DESTROY = (om0)enum_3;
    Enum<Enum> enum_6 = new Enum<Enum>("ON_ANY", 6);
    ON_ANY = (om0)enum_6;
    om0[] arrayOfOm0 = new om0[7];
    arrayOfOm0[0] = (om0)enum_7;
    arrayOfOm0[1] = (om0)enum_1;
    arrayOfOm0[2] = (om0)enum_2;
    arrayOfOm0[3] = (om0)enum_4;
    arrayOfOm0[4] = (om0)enum_5;
    arrayOfOm0[5] = (om0)enum_3;
    arrayOfOm0[6] = (om0)enum_6;
    $VALUES = arrayOfOm0;
    $ENTRIES = new r40((Enum[])arrayOfOm0);
    Companion = (mm0)new Object();
  }
  
  public final pm0 a() {
    StringBuilder stringBuilder;
    switch (nm0.a[ordinal()]) {
      default:
        throw new RuntimeException();
      case 7:
        stringBuilder = new StringBuilder();
        stringBuilder.append(this);
        stringBuilder.append(" has no target state");
        throw new IllegalArgumentException(stringBuilder.toString());
      case 6:
        return pm0.b;
      case 5:
        return pm0.g;
      case 3:
      case 4:
        return pm0.f;
      case 1:
      case 2:
        break;
    } 
    return pm0.e;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\om0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */