import android.view.View;
import android.view.WindowInsets;

public class q62 extends p62 {
  public static final x62 v = x62.h(null, k91.b());
  
  public q62(x62 paramx62, WindowInsets paramWindowInsets) {
    super(paramx62, paramWindowInsets);
  }
  
  public final void d(View paramView) {}
  
  public fi0 h(int paramInt) {
    return fi0.d(this.c.getInsets(v62.a(paramInt)));
  }
  
  public fi0 i(int paramInt) {
    return fi0.d(this.c.getInsetsIgnoringVisibility(v62.a(paramInt)));
  }
  
  public boolean t(int paramInt) {
    return this.c.isVisible(v62.a(paramInt));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */