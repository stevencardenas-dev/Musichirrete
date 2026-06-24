import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

public abstract class n6 {
  public static OnBackInvokedDispatcher a(Activity paramActivity) {
    return paramActivity.getOnBackInvokedDispatcher();
  }
  
  public static OnBackInvokedCallback b(Object paramObject, u6 paramu6) {
    Objects.requireNonNull(paramu6);
    m6 m6 = new m6(0, paramu6);
    l0.c(paramObject).registerOnBackInvokedCallback(1000000, m6);
    return m6;
  }
  
  public static void c(Object paramObject1, Object paramObject2) {
    paramObject2 = paramObject2;
    l0.c(paramObject1).unregisterOnBackInvokedCallback((OnBackInvokedCallback)paramObject2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */