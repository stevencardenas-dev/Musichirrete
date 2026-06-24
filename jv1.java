import android.view.MenuItem;
import android.view.Window;

public final class jv1 implements hv1, pw0 {
  public final kv1 b;
  
  public boolean c(rw0 paramrw0, MenuItem paramMenuItem) {
    return false;
  }
  
  public void g(rw0 paramrw0) {
    kv1 kv11 = this.b;
    boolean bool = kv11.o.a.o();
    Window.Callback callback = kv11.p;
    if (bool) {
      callback.onPanelClosed(108, paramrw0);
      return;
    } 
    if (callback.onPreparePanel(0, null, paramrw0))
      callback.onMenuOpened(108, paramrw0); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jv1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */