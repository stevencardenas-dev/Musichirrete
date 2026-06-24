import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

public final class sw0 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, gx0 {
  public tq1 b;
  
  public z3 c;
  
  public wn0 e;
  
  public final void a(rw0 paramrw0, boolean paramBoolean) {
    if (paramBoolean || paramrw0 == this.b) {
      z3 z31 = this.c;
      if (z31 != null)
        z31.dismiss(); 
    } 
  }
  
  public final boolean k(rw0 paramrw0) {
    return false;
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt) {
    tq1 tq11 = this.b;
    wn0 wn01 = this.e;
    if (wn01.h == null)
      wn01.h = new vn0(wn01); 
    tq11.q(wn01.h.b(paramInt), null, 0);
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface) {
    this.e.a(this.b, true);
  }
  
  public final boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent) {
    tq1 tq11 = this.b;
    if (paramInt == 82 || paramInt == 4) {
      KeyEvent.DispatcherState dispatcherState;
      if (paramKeyEvent.getAction() == 0 && paramKeyEvent.getRepeatCount() == 0) {
        Window window = this.c.getWindow();
        if (window != null) {
          View view = window.getDecorView();
          if (view != null) {
            dispatcherState = view.getKeyDispatcherState();
            if (dispatcherState != null) {
              dispatcherState.startTracking(paramKeyEvent, this);
              return true;
            } 
          } 
        } 
      } else if (paramKeyEvent.getAction() == 1 && !paramKeyEvent.isCanceled()) {
        Window window = this.c.getWindow();
        if (window != null) {
          View view = window.getDecorView();
          if (view != null) {
            KeyEvent.DispatcherState dispatcherState1 = view.getKeyDispatcherState();
            if (dispatcherState1 != null && dispatcherState1.isTracking(paramKeyEvent)) {
              tq11.c(true);
              dispatcherState.dismiss();
              return true;
            } 
          } 
        } 
      } 
    } 
    return tq11.performShortcut(paramInt, paramKeyEvent, 0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sw0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */