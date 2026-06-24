import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

public final class s6 extends ContentFrameLayout {
  public final u6 k;
  
  public s6(u6 paramu6, bs parambs) {
    super((Context)parambs);
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    return (this.k.u(paramKeyEvent) || super.dispatchKeyEvent(paramKeyEvent));
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    u6 u61;
    if (paramMotionEvent.getAction() == 0) {
      int j = (int)paramMotionEvent.getX();
      int i = (int)paramMotionEvent.getY();
      if (j < -5 || i < -5 || j > getWidth() + 5 || i > getHeight() + 5) {
        u61 = this.k;
        u61.s(u61.z(0), true);
        return true;
      } 
    } 
    return super.onInterceptTouchEvent((MotionEvent)u61);
  }
  
  public final void setBackgroundResource(int paramInt) {
    setBackgroundDrawable(ws2.I(getContext(), paramInt));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */