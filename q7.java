import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

public final class q7 implements PopupWindow.OnDismissListener {
  public final l7 b;
  
  public final r7 c;
  
  public q7(r7 paramr7, l7 paraml7) {
    this.c = paramr7;
    this.b = paraml7;
  }
  
  public final void onDismiss() {
    ViewTreeObserver viewTreeObserver = this.c.I.getViewTreeObserver();
    if (viewTreeObserver != null)
      viewTreeObserver.removeGlobalOnLayoutListener(this.b); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */