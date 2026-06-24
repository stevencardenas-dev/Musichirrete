import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

public final class zr0 implements OnBackAnimationCallback {
  public final xr0 a;
  
  public final as0 b;
  
  public zr0(as0 paramas0, xr0 paramxr0) {
    this.b = paramas0;
    this.a = paramxr0;
  }
  
  public final void onBackCancelled() {
    if (this.b.a != null)
      this.a.d(); 
  }
  
  public final void onBackInvoked() {
    this.a.a();
  }
  
  public final void onBackProgressed(BackEvent paramBackEvent) {
    if (this.b.a != null) {
      kb kb = new kb(paramBackEvent);
      this.a.b(kb);
    } 
  }
  
  public final void onBackStarted(BackEvent paramBackEvent) {
    if (this.b.a != null) {
      kb kb = new kb(paramBackEvent);
      this.a.c(kb);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zr0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */