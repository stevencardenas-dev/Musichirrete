import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class hj0 extends GestureDetector.SimpleOnGestureListener {
  public boolean a = true;
  
  public final ij0 b;
  
  public hj0(ij0 paramij0) {}
  
  public final boolean onDown(MotionEvent paramMotionEvent) {
    return true;
  }
  
  public final void onLongPress(MotionEvent paramMotionEvent) {
    ij0 ij01 = this.b;
    gj0 gj0 = ij01.m;
    if (this.a) {
      View view = ij01.l(paramMotionEvent);
      if (view != null) {
        he1 he1 = ij01.r.N(view);
        if (he1 != null) {
          RecyclerView recyclerView = ij01.r;
          if ((gj0.b(gj0.d(), recyclerView.getLayoutDirection()) & 0xFF0000) != 0) {
            int j = paramMotionEvent.getPointerId(0);
            int i = ij01.l;
            if (j == i) {
              i = paramMotionEvent.findPointerIndex(i);
              float f1 = paramMotionEvent.getX(i);
              float f2 = paramMotionEvent.getY(i);
              ij01.d = f1;
              ij01.e = f2;
              ij01.i = 0.0F;
              ij01.h = 0.0F;
              if (gj0.l())
                ij01.p(he1, 2); 
            } 
          } 
        } 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hj0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */