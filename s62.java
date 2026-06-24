import android.view.View;
import android.view.WindowInsets;

public class s62 extends r62 {
  public static final x62 w = x62.h(null, k91.b());
  
  public s62(x62 paramx62, WindowInsets paramWindowInsets) {
    super(paramx62, paramWindowInsets);
  }
  
  public fi0 h(int paramInt) {
    return fi0.d(this.c.getInsets(w62.a(paramInt)));
  }
  
  public fi0 i(int paramInt) {
    return fi0.d(this.c.getInsetsIgnoringVisibility(w62.a(paramInt)));
  }
  
  public void o(View paramView) {}
  
  public boolean t(int paramInt) {
    return this.c.isVisible(w62.a(paramInt));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */