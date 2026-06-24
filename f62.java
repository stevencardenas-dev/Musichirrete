import android.view.WindowInsets;

public class f62 extends l62 {
  public final WindowInsets.Builder e;
  
  public f62() {
    this.e = wv0.b();
  }
  
  public f62(x62 paramx62) {
    super(paramx62);
    WindowInsets.Builder builder;
    WindowInsets windowInsets = paramx62.g();
    if (windowInsets != null) {
      builder = wv0.c(windowInsets);
    } else {
      builder = wv0.b();
    } 
    this.e = builder;
  }
  
  public x62 b() {
    a();
    x62 x62 = x62.h(null, this.e.build());
    fi0[] arrayOfFi0 = this.b;
    u62 u62 = x62.a;
    u62.v(arrayOfFi0);
    u62.u(null);
    u62.z(this.c);
    u62.A(this.d);
    return x62;
  }
  
  public void e(fi0 paramfi0) {
    this.e.setMandatorySystemGestureInsets(paramfi0.e());
  }
  
  public void f(fi0 paramfi0) {
    this.e.setStableInsets(paramfi0.e());
  }
  
  public void g(fi0 paramfi0) {
    this.e.setSystemGestureInsets(paramfi0.e());
  }
  
  public void h(fi0 paramfi0) {
    this.e.setSystemWindowInsets(paramfi0.e());
  }
  
  public void i(fi0 paramfi0) {
    this.e.setTappableElementInsets(paramfi0.e());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\f62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */