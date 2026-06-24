import java.util.Locale;

public final class f91 extends a {
  public final int b;
  
  public float c;
  
  public f91(float paramFloat) {
    this.c = paramFloat;
  }
  
  private final void f(boolean paramBoolean) {}
  
  public final String a() {
    switch (this.b) {
      default:
        return yj1.o;
      case 1:
        return yj1.h;
      case 0:
        break;
    } 
    return yj1.h;
  }
  
  public final String b() {
    switch (this.b) {
      default:
        return yj1.n;
      case 1:
        return yj1.j;
      case 0:
        break;
    } 
    return yj1.i;
  }
  
  public final String c() {
    int i = this.b;
    String str1 = "";
    switch (i) {
      default:
        return String.format(Locale.ENGLISH, yj1.m, new Object[] { Float.valueOf(this.c) });
      case 1:
        locale = Locale.ENGLISH;
        str2 = yj1.k;
        f = this.c;
        if (f >= 0.0F)
          str1 = "+"; 
        return String.format(locale, str2, new Object[] { str1, Float.valueOf(f) });
      case 0:
        break;
    } 
    Locale locale = Locale.ENGLISH;
    String str2 = yj1.k;
    float f = this.c;
    if (f >= 0.0F)
      str1 = "+"; 
    return String.format(locale, str2, new Object[] { str1, Float.valueOf(f) });
  }
  
  public boolean d() {
    boolean bool;
    switch (this.b) {
      default:
        return super.d();
      case 2:
        break;
    } 
    if (this.c != 0.0F) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public void e(boolean paramBoolean) {
    switch (this.b) {
      default:
        super.e(paramBoolean);
        break;
      case 2:
        break;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\f91.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */