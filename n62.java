import android.view.WindowInsets;

public class n62 extends m62 {
  public fi0 r = null;
  
  public n62(x62 paramx62, WindowInsets paramWindowInsets) {
    super(paramx62, paramWindowInsets);
  }
  
  public x62 b() {
    return x62.h(null, this.c.consumeStableInsets());
  }
  
  public x62 c() {
    return x62.h(null, this.c.consumeSystemWindowInsets());
  }
  
  public final fi0 k() {
    if (this.r == null) {
      WindowInsets windowInsets = this.c;
      this.r = fi0.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
    } 
    return this.r;
  }
  
  public boolean r() {
    return this.c.isConsumed();
  }
  
  public void x(fi0 paramfi0) {
    this.r = paramfi0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */