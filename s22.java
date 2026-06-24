import android.view.View;
import android.view.WindowInsets;

public abstract class s22 {
  public static WindowInsets a(View paramView, WindowInsets paramWindowInsets) {
    return paramView.dispatchApplyWindowInsets(paramWindowInsets);
  }
  
  public static CharSequence b(View paramView) {
    return paramView.getStateDescription();
  }
  
  public static void c(View paramView, CharSequence paramCharSequence) {
    paramView.setStateDescription(paramCharSequence);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */