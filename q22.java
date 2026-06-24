import android.view.View;

public abstract class q22 {
  public static CharSequence a(View paramView) {
    return paramView.getAccessibilityPaneTitle();
  }
  
  public static boolean b(View paramView) {
    return paramView.isAccessibilityHeading();
  }
  
  public static boolean c(View paramView) {
    return paramView.isScreenReaderFocusable();
  }
  
  public static void d(View paramView, boolean paramBoolean) {
    paramView.setAccessibilityHeading(paramBoolean);
  }
  
  public static void e(View paramView, CharSequence paramCharSequence) {
    paramView.setAccessibilityPaneTitle(paramCharSequence);
  }
  
  public static void f(View paramView, boolean paramBoolean) {
    paramView.setScreenReaderFocusable(paramBoolean);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q22.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */