import android.graphics.Insets;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;

public abstract class b42 {
  public static void a(View paramView, Rect paramRect1, Rect paramRect2) {
    Insets insets = paramView.computeSystemWindowInsets((new WindowInsets.Builder()).setSystemWindowInsets(Insets.of(paramRect1)).build(), paramRect2).getSystemWindowInsets();
    paramRect1.set(insets.left, insets.top, insets.right, insets.bottom);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */