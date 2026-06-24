import android.view.View;
import android.view.WindowInsets;

public abstract class k22 {
  public static WindowInsets a(View paramView, WindowInsets paramWindowInsets) {
    return b32.b ? b32.a(paramView, paramWindowInsets) : paramView.dispatchApplyWindowInsets(paramWindowInsets);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\k22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */