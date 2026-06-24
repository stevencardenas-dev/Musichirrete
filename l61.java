import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import in.krosbits.musicolet.ScreenSaverActivity;

public final class l61 extends GestureDetector.SimpleOnGestureListener {
  public final int a;
  
  public final Object b;
  
  public boolean onDoubleTap(MotionEvent paramMotionEvent) {
    switch (this.a) {
      default:
        return super.onDoubleTap(paramMotionEvent);
      case 1:
        break;
    } 
    paramMotionEvent.getClass();
    ((ScreenSaverActivity)this.b).finish();
    return true;
  }
  
  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2) {
    ScreenSaverActivity screenSaverActivity;
    switch (this.a) {
      default:
        paramMotionEvent2.getClass();
        screenSaverActivity = (ScreenSaverActivity)this.b;
        screenSaverActivity.m0(screenSaverActivity.U);
        return true;
      case 0:
        break;
    } 
    return false;
  }
  
  public void onLongPress(MotionEvent paramMotionEvent) {
    switch (this.a) {
      default:
        super.onLongPress(paramMotionEvent);
        return;
      case 0:
        break;
    } 
    u61 u61 = (u61)this.b;
    View.OnLongClickListener onLongClickListener = u61.s;
    if (onLongClickListener != null)
      onLongClickListener.onLongClick((View)u61.h()); 
  }
  
  public boolean onSingleTapConfirmed(MotionEvent paramMotionEvent) {
    switch (this.a) {
      default:
        return super.onSingleTapConfirmed(paramMotionEvent);
      case 1:
        break;
    } 
    paramMotionEvent.getClass();
    ScreenSaverActivity screenSaverActivity = (ScreenSaverActivity)this.b;
    screenSaverActivity.m0(screenSaverActivity.U);
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\l61.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */