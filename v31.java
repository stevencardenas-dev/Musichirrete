import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

public abstract class v31 extends d11 {
  public final OnBackInvokedDispatcher c;
  
  public final int d;
  
  public final OnBackInvokedCallback e;
  
  public boolean f;
  
  public v31(OnBackInvokedDispatcher paramOnBackInvokedDispatcher, int paramInt) {
    u31 u31;
    this.c = paramOnBackInvokedDispatcher;
    this.d = paramInt;
    if (Build.VERSION.SDK_INT == 33) {
      m6 m6 = new m6(2, this);
    } else {
      u31 = new u31(this);
    } 
    this.e = (OnBackInvokedCallback)u31;
  }
  
  public final void b(boolean paramBoolean) {
    OnBackInvokedCallback onBackInvokedCallback = this.e;
    if (paramBoolean && !this.f) {
      this.c.registerOnBackInvokedCallback(this.d, onBackInvokedCallback);
      this.f = true;
      return;
    } 
    if (!paramBoolean && this.f) {
      this.c.unregisterOnBackInvokedCallback(onBackInvokedCallback);
      this.f = false;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\v31.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */