import java.util.Locale;

public final class ue extends a {
  public final int b;
  
  public int c;
  
  public final String a() {
    switch (this.b) {
      default:
        return yj1.t;
      case 0:
        break;
    } 
    return yj1.x;
  }
  
  public final String b() {
    switch (this.b) {
      default:
        return yj1.s;
      case 0:
        break;
    } 
    return yj1.y;
  }
  
  public final String c() {
    String str;
    switch (this.b) {
      default:
        return String.format(Locale.ENGLISH, yj1.r, new Object[] { Float.valueOf(this.c / 1000.0F * 0.89F), Float.valueOf(this.c / 1000.0F * 0.79F) });
      case 0:
        break;
    } 
    if (!this.a) {
      str = null;
    } else {
      str = String.format(Locale.ENGLISH, "g=%f", new Object[] { Float.valueOf(this.c * 15.0F / 1000.0F) });
    } 
    return str;
  }
  
  public qn[] f(int paramInt) {
    if (this.c != paramInt) {
      this.c = paramInt;
      if (this.a) {
        StringBuilder stringBuilder = new StringBuilder();
        String str = yj1.s;
        qn qn = new qn(x41.n(stringBuilder, str, "_f"), str, yj1.p, String.valueOf(this.c / 1000.0F * 0.89F));
        stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("_c");
        return new qn[] { qn, new qn(stringBuilder.toString(), str, yj1.q, String.valueOf(this.c / 1000.0F * 0.79F)) };
      } 
    } 
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\ue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */