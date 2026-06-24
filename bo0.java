import android.view.MotionEvent;
import android.view.View;
import ss.com.bannerslider.Slider;

public final class bo0 implements View.OnTouchListener {
  public final int b;
  
  public final Object c;
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    fb0 fb0;
    int i = this.b;
    Object object = this.c;
    switch (i) {
      default:
        object = object;
        if (paramMotionEvent.getAction() == 0) {
          fb0 = Slider.s;
          object.d();
        } else if (fb0.getAction() == 3 || fb0.getAction() == 1) {
          fb0 = Slider.s;
          object.c();
        } 
        return false;
      case 0:
        break;
    } 
    co0 co0 = (co0)object;
    zn0 zn0 = co0.t;
    object = co0.x;
    f7 f7 = co0.B;
    int k = fb0.getAction();
    int j = (int)fb0.getX();
    i = (int)fb0.getY();
    if (k == 0 && f7 != null && f7.isShowing() && j >= 0 && j < f7.getWidth() && i >= 0 && i < f7.getHeight()) {
      object.postDelayed(zn0, 250L);
    } else if (k == 1) {
      object.removeCallbacks(zn0);
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bo0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */