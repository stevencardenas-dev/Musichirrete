import android.view.View;
import android.view.WindowInsets;

public abstract class n22 {
  public static x62 a(View paramView) {
    WindowInsets windowInsets = paramView.getRootWindowInsets();
    if (windowInsets == null)
      return null; 
    x62 x62 = x62.h(null, windowInsets);
    u62 u62 = x62.a;
    u62.w(x62);
    paramView = paramView.getRootView();
    u62.d(paramView);
    u62.o(paramView);
    u62.p();
    return x62;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */