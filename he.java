import android.view.MotionEvent;
import android.view.View;

public final class he implements View.OnTouchListener {
  public final int b;
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    int i = this.b;
    boolean bool2 = true;
    boolean bool1 = bool2;
    switch (i) {
      default:
        try {
          if (paramView.hasFocus()) {
            paramView.getParent().requestDisallowInterceptTouchEvent(true);
            if ((paramMotionEvent.getAction() & 0xFF) == 8) {
              paramView.getParent().requestDisallowInterceptTouchEvent(false);
              bool1 = bool2;
              break;
            } 
          } 
        } finally {
          paramView = null;
        } 
        break;
      case 0:
      case 1:
        break;
    } 
    return bool1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\he.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */