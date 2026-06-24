package j$.time.format;

public enum l implements g {
  INSENSITIVE, LENIENT, SENSITIVE, STRICT;
  
  public static final l[] a;
  
  static {
    Enum<Enum> enum_2 = new Enum<Enum>("SENSITIVE", 0);
    SENSITIVE = (l)enum_2;
    Enum<Enum> enum_1 = new Enum<Enum>("INSENSITIVE", 1);
    INSENSITIVE = (l)enum_1;
    Enum<Enum> enum_3 = new Enum<Enum>("STRICT", 2);
    STRICT = (l)enum_3;
    Enum<Enum> enum_4 = new Enum<Enum>("LENIENT", 3);
    LENIENT = (l)enum_4;
    a = new l[] { (l)enum_2, (l)enum_1, (l)enum_3, (l)enum_4 };
  }
  
  public final boolean r(q paramq, StringBuilder paramStringBuilder) {
    return true;
  }
  
  public final String toString() {
    int i = ordinal();
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i == 3)
            return "ParseStrict(false)"; 
          throw new IllegalStateException("Unreachable");
        } 
        return "ParseStrict(true)";
      } 
      return "ParseCaseSensitive(false)";
    } 
    return "ParseCaseSensitive(true)";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\j$\time\format\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */