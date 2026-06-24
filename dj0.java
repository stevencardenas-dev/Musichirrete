import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import java.util.ArrayList;

public final class dj0 implements ud1 {
  public final ij0 a;
  
  public dj0(ij0 paramij0) {
    this.a = paramij0;
  }
  
  public final void a(MotionEvent paramMotionEvent) {
    ij0 ij01 = this.a;
    e3 e3 = ij01.s;
    ij01.x.onTouchEvent(paramMotionEvent);
    VelocityTracker velocityTracker = ij01.t;
    if (velocityTracker != null)
      velocityTracker.addMovement(paramMotionEvent); 
    if (ij01.l == -1)
      return; 
    int j = paramMotionEvent.getActionMasked();
    int i = paramMotionEvent.findPointerIndex(ij01.l);
    if (i >= 0)
      ij01.i(j, i, paramMotionEvent); 
    he1 he1 = ij01.c;
    if (he1 == null)
      return; 
    boolean bool = false;
    if (j != 1) {
      VelocityTracker velocityTracker1;
      if (j != 2) {
        if (j != 3) {
          if (j == 6) {
            i = paramMotionEvent.getActionIndex();
            if (paramMotionEvent.getPointerId(i) == ij01.l) {
              if (i == 0)
                bool = true; 
              ij01.l = paramMotionEvent.getPointerId(bool);
              ij01.s(ij01.o, i, paramMotionEvent);
              return;
            } 
          } 
        } else {
          velocityTracker1 = ij01.t;
          if (velocityTracker1 != null)
            velocityTracker1.clear(); 
          ij01.p(null, 0);
          ij01.l = -1;
        } 
      } else if (i >= 0) {
        ij01.s(ij01.o, i, (MotionEvent)velocityTracker1);
        ij01.o(he1);
        ij01.r.removeCallbacks(e3);
        e3.run();
        ij01.r.invalidate();
      } 
      return;
    } 
    ij01.p(null, 0);
    ij01.l = -1;
  }
  
  public final boolean b(MotionEvent paramMotionEvent) {
    ij0 ij01 = this.a;
    ij01.x.onTouchEvent(paramMotionEvent);
    int i = paramMotionEvent.getActionMasked();
    VelocityTracker velocityTracker2 = null;
    if (i == 0) {
      ij01.l = paramMotionEvent.getPointerId(0);
      ij01.d = paramMotionEvent.getX();
      ij01.e = paramMotionEvent.getY();
      VelocityTracker velocityTracker = ij01.t;
      if (velocityTracker != null)
        velocityTracker.recycle(); 
      ij01.t = VelocityTracker.obtain();
      if (ij01.c == null) {
        ej0 ej0;
        ArrayList<ej0> arrayList = ij01.p;
        if (arrayList.isEmpty()) {
          velocityTracker = velocityTracker2;
        } else {
          View view = ij01.l(paramMotionEvent);
          i = arrayList.size() - 1;
          while (true) {
            velocityTracker = velocityTracker2;
            if (i >= 0) {
              ej0 = arrayList.get(i);
              if (ej0.e.b == view)
                break; 
              i--;
              continue;
            } 
            break;
          } 
        } 
        if (ej0 != null) {
          he1 he1 = ej0.e;
          ij01.d -= ej0.i;
          ij01.e -= ej0.j;
          ij01.k(he1, true);
          if (ij01.a.remove(he1.b))
            ij01.m.a(ij01.r, he1); 
          ij01.p(he1, ej0.f);
          ij01.s(ij01.o, 0, paramMotionEvent);
        } 
      } 
    } else if (i == 3 || i == 1) {
      ij01.l = -1;
      ij01.p(null, 0);
    } else {
      int j = ij01.l;
      if (j != -1) {
        j = paramMotionEvent.findPointerIndex(j);
        if (j >= 0)
          ij01.i(i, j, paramMotionEvent); 
      } 
    } 
    VelocityTracker velocityTracker1 = ij01.t;
    if (velocityTracker1 != null)
      velocityTracker1.addMovement(paramMotionEvent); 
    return (ij01.c != null);
  }
  
  public final void c(boolean paramBoolean) {
    if (!paramBoolean)
      return; 
    this.a.p(null, 0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dj0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */