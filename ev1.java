import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

public abstract class ev1 {
  public static OnBackInvokedDispatcher a(View paramView) {
    return paramView.findOnBackInvokedDispatcher();
  }
  
  public static OnBackInvokedCallback b(Runnable paramRunnable) {
    Objects.requireNonNull(paramRunnable);
    return new m6(3, paramRunnable);
  }
  
  public static void c(Object paramObject1, Object paramObject2) {
    ((OnBackInvokedDispatcher)paramObject1).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback)paramObject2);
  }
  
  public static void d(Object paramObject1, Object paramObject2) {
    ((OnBackInvokedDispatcher)paramObject1).unregisterOnBackInvokedCallback((OnBackInvokedCallback)paramObject2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ev1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */