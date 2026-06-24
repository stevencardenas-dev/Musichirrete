import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

public final class l22 implements View.OnApplyWindowInsetsListener {
  public x62 a = null;
  
  public final View b;
  
  public final s31 c;
  
  public l22(View paramView, s31 params31) {}
  
  public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets) {
    x62 x622 = x62.h(paramView, paramWindowInsets);
    int i = Build.VERSION.SDK_INT;
    s31 s311 = this.c;
    if (i < 30) {
      m22.a(paramWindowInsets, this.b);
      if (x622.equals(this.a))
        return s311.e(paramView, x622).g(); 
    } 
    this.a = x622;
    x62 x621 = s311.e(paramView, x622);
    if (i >= 30)
      return x621.g(); 
    WeakHashMap weakHashMap = v22.a;
    paramView.requestApplyInsets();
    return x621.g();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\l22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */