import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

public class yr0 {
  public OnBackInvokedCallback a;
  
  public OnBackInvokedCallback a(xr0 paramxr0) {
    Objects.requireNonNull(paramxr0);
    return new m6(1, paramxr0);
  }
  
  public void b(xr0 paramxr0, View paramView, boolean paramBoolean) {
    if (this.a == null) {
      OnBackInvokedDispatcher onBackInvokedDispatcher = paramView.findOnBackInvokedDispatcher();
      if (onBackInvokedDispatcher != null) {
        boolean bool;
        OnBackInvokedCallback onBackInvokedCallback = a(paramxr0);
        this.a = onBackInvokedCallback;
        if (paramBoolean) {
          bool = true;
        } else {
          bool = false;
        } 
        onBackInvokedDispatcher.registerOnBackInvokedCallback(bool, onBackInvokedCallback);
        return;
      } 
    } 
  }
  
  public void c(View paramView) {
    if (this.a != null) {
      OnBackInvokedDispatcher onBackInvokedDispatcher = paramView.findOnBackInvokedDispatcher();
      if (onBackInvokedDispatcher != null) {
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.a);
        this.a = null;
        return;
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yr0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */