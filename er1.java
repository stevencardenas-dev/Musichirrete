import java.util.Locale;

public final class er1 implements th1 {
  public final ac0 b;
  
  public er1(ac0 paramac0) {
    this.b = paramac0;
  }
  
  public final or1 a(String paramString) {
    or1 or1;
    paramString.getClass();
    ac0 ac01 = this.b;
    ac01.getClass();
    String str = gq1.Q0(paramString).toString();
    if (str.length() >= 3) {
      str = str.substring(0, 3).toUpperCase(Locale.ROOT);
      str.getClass();
      int i = str.hashCode();
      if ((i != 79487) ? ((i != 81978) ? (i != 85954 || !str.equals("WIT")) : !str.equals("SEL")) : !str.equals("PRA")) {
        or1 = new or1(ac01, paramString);
        ((mr1)or1).f = new int[0];
        ((mr1)or1).g = new long[0];
        ((mr1)or1).h = new double[0];
        ((mr1)or1).i = new String[0];
        ((mr1)or1).j = new byte[0][];
        return or1;
      } 
    } 
    return new nr1(ac01, (String)or1);
  }
  
  public final void close() {
    this.b.close();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\er1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */