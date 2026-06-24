import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

public final class oa0 implements Runnable {
  public final int b;
  
  public final pa0 c;
  
  public final void run() {
    View view;
    int i = this.b;
    pa0 pa01 = this.c;
    switch (i) {
      default:
        pa01.a();
        view = pa01.f;
        if (view.isEnabled() && !view.isLongClickable() && pa01.c()) {
          view.getParent().requestDisallowInterceptTouchEvent(true);
          long l = SystemClock.uptimeMillis();
          MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
          view.onTouchEvent(motionEvent);
          motionEvent.recycle();
          pa01.i = true;
        } 
        return;
      case 0:
        break;
    } 
    ViewParent viewParent = pa01.f.getParent();
    if (viewParent != null)
      viewParent.requestDisallowInterceptTouchEvent(true); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\oa0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */