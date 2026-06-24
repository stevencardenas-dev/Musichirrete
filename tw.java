import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import in.krosbits.musicolet.IVActivity;

public final class tw implements GestureDetector.OnDoubleTapListener {
  public final u61 a;
  
  public tw(u61 paramu61) {
    this.a = paramu61;
  }
  
  public final boolean onDoubleTap(MotionEvent paramMotionEvent) {
    u61 u611 = this.a;
    if (u611 == null)
      return false; 
    try {
      float f2 = u611.k();
      float f1 = paramMotionEvent.getX();
      float f3 = paramMotionEvent.getY();
      float f4 = u611.f;
      if (f2 < f4) {
        u611.n(f4, f1, f3, true);
      } else {
        if (f2 >= f4) {
          f4 = u611.g;
          if (f2 < f4) {
            u611.n(f4, f1, f3, true);
            return true;
          } 
        } 
        u611.n(u611.e, f1, f3, true);
      } 
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {}
    return true;
  }
  
  public final boolean onDoubleTapEvent(MotionEvent paramMotionEvent) {
    return false;
  }
  
  public final boolean onSingleTapConfirmed(MotionEvent paramMotionEvent) {
    u61 u611 = this.a;
    if (u611 == null)
      return false; 
    u611.h();
    if (u611.r != null) {
      u611.c();
      RectF rectF = u611.f(u611.g());
      if (rectF != null) {
        if (rectF.contains(paramMotionEvent.getX(), paramMotionEvent.getY())) {
          rectF.width();
          rectF.height();
          IVActivity iVActivity1 = (IVActivity)u611.r;
          int j = iVActivity1.e.getVisibility();
          View view1 = iVActivity1.e;
          if (j == 0) {
            view1.setVisibility(4);
          } else {
            view1.setVisibility(0);
          } 
          return true;
        } 
        IVActivity iVActivity = (IVActivity)u611.r;
        int i = iVActivity.e.getVisibility();
        View view = iVActivity.e;
        if (i == 0) {
          view.setVisibility(4);
        } else {
          view.setVisibility(0);
        } 
      } 
    } 
    u611.getClass();
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */