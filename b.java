import java.util.Locale;

public final class b extends a {
  public final int b;
  
  public final String a() {
    switch (this.b) {
      default:
        return yj1.u;
      case 1:
        return "F_RF";
      case 0:
        break;
    } 
    return yj1.a;
  }
  
  public final String b() {
    switch (this.b) {
      default:
        return yj1.v;
      case 1:
        return "F_RF";
      case 0:
        break;
    } 
    return yj1.b;
  }
  
  public final String c() {
    switch (this.b) {
      default:
        return String.format(Locale.ENGLISH, yj1.w, new Object[] { Integer.valueOf(this.a ^ true) });
      case 1:
        return "F_RF";
      case 0:
        break;
    } 
    return yj1.c;
  }
  
  public boolean d() {
    switch (this.b) {
      default:
        return super.d();
      case 0:
        break;
    } 
    return this.a;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */