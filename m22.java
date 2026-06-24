import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

public abstract class m22 {
  public static void a(WindowInsets paramWindowInsets, View paramView) {
    View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener)paramView.getTag(2131297588);
    if (onApplyWindowInsetsListener != null)
      onApplyWindowInsetsListener.onApplyWindowInsets(paramView, paramWindowInsets); 
  }
  
  public static x62 b(View paramView, x62 paramx62, Rect paramRect) {
    WindowInsets windowInsets = paramx62.g();
    if (windowInsets != null)
      return x62.h(paramView, paramView.computeSystemWindowInsets(windowInsets, paramRect)); 
    paramRect.setEmpty();
    return paramx62;
  }
  
  public static void c(View paramView, s31 params31) {
    if (params31 != null) {
      l22 l22 = new l22(paramView, params31);
    } else {
      params31 = null;
    } 
    if (Build.VERSION.SDK_INT < 30)
      paramView.setTag(2131297578, params31); 
    if (paramView.getTag(2131297573) != null)
      return; 
    if (params31 != null) {
      paramView.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)params31);
      return;
    } 
    paramView.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)paramView.getTag(2131297588));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */