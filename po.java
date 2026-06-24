import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

public abstract class po extends Activity implements um0, hl0 {
  public final wm0 c = new wm0(this);
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    paramKeyEvent.getClass();
    View view = getWindow().getDecorView();
    view.getClass();
    return ws2.z(view, paramKeyEvent) ? true : ws2.A(this, view, (Window.Callback)this, paramKeyEvent);
  }
  
  public final boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent) {
    paramKeyEvent.getClass();
    View view = getWindow().getDecorView();
    view.getClass();
    return ws2.z(view, paramKeyEvent) ? true : super.dispatchKeyShortcutEvent(paramKeyEvent);
  }
  
  public final boolean l(KeyEvent paramKeyEvent) {
    paramKeyEvent.getClass();
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    int i = xf1.b;
    vf1.b(this);
  }
  
  public void onDismiss(DialogInterface paramDialogInterface) {
    finish();
  }
  
  public void onSaveInstanceState(Bundle paramBundle) {
    paramBundle.getClass();
    wm0 wm01 = this.c;
    wm01.c("setCurrentState");
    wm01.f(pm0.e);
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\po.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */