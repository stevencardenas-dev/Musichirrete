import android.content.Context;
import android.graphics.RectF;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.OverScroller;

public final class jc0 {
  public u61 a;
  
  public float b;
  
  public float c;
  
  public final float d;
  
  public final float e;
  
  public VelocityTracker f;
  
  public boolean g;
  
  public int h;
  
  public int i;
  
  public final ScaleGestureDetector j;
  
  public jc0(Context paramContext) {
    ViewConfiguration viewConfiguration = ViewConfiguration.get(paramContext);
    this.e = viewConfiguration.getScaledMinimumFlingVelocity();
    this.d = viewConfiguration.getScaledTouchSlop();
    this.h = -1;
    this.i = 0;
    this.j = new ScaleGestureDetector(paramContext, new ic0(this));
  }
  
  public final boolean b(MotionEvent paramMotionEvent) {
    VelocityTracker velocityTracker;
    int i = paramMotionEvent.getAction();
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i == 3) {
            velocityTracker = this.f;
            if (velocityTracker != null) {
              velocityTracker.recycle();
              this.f = null;
              return true;
            } 
          } 
        } else {
          float f1;
          float f2;
          try {
            f1 = velocityTracker.getX(this.i);
          } catch (Exception exception) {
            f1 = velocityTracker.getX();
          } 
          try {
            f2 = velocityTracker.getY(this.i);
          } catch (Exception exception) {
            f2 = velocityTracker.getY();
          } 
          float f3 = f1 - this.b;
          float f4 = f2 - this.c;
          if (!this.g) {
            boolean bool;
            if (Math.sqrt((f4 * f4 + f3 * f3)) >= this.d) {
              bool = true;
            } else {
              bool = false;
            } 
            this.g = bool;
          } 
          if (this.g) {
            u61 u611 = this.a;
            jc0 jc01 = u611.l;
            if (!jc01.j.isInProgress()) {
              if (u61.B)
                Log.d("PhotoViewAttacher", String.format("onDrag: dx: %.2f. dy: %.2f", new Object[] { Float.valueOf(f3), Float.valueOf(f4) })); 
              ImageView imageView = u611.h();
              u611.o.postTranslate(f3, f4);
              u611.b();
              ViewParent viewParent = imageView.getParent();
              if (u611.h && !jc01.j.isInProgress() && !u611.i) {
                i = u611.y;
                if ((i == 2 || (i == 0 && f3 >= 1.0F) || (i == 1 && f3 <= -1.0F)) && viewParent != null)
                  viewParent.requestDisallowInterceptTouchEvent(false); 
              } else if (viewParent != null) {
                viewParent.requestDisallowInterceptTouchEvent(true);
              } 
            } 
            this.b = f1;
            this.c = f2;
            VelocityTracker velocityTracker1 = this.f;
            if (velocityTracker1 != null)
              velocityTracker1.addMovement((MotionEvent)velocityTracker); 
          } 
        } 
      } else {
        if (this.g && this.f != null) {
          float f1;
          try {
            f1 = velocityTracker.getX(this.i);
          } catch (Exception exception) {
            f1 = velocityTracker.getX();
          } 
          this.b = f1;
          try {
            f1 = velocityTracker.getY(this.i);
          } catch (Exception exception) {
            f1 = velocityTracker.getY();
          } 
          this.c = f1;
          this.f.addMovement((MotionEvent)velocityTracker);
          this.f.computeCurrentVelocity(1000);
          float f2 = this.f.getXVelocity();
          float f3 = this.f.getYVelocity();
          if (Math.max(Math.abs(f2), Math.abs(f3)) >= this.e) {
            u61 u611 = this.a;
            f1 = this.b;
            float f = this.c;
            f2 = -f2;
            f3 = -f3;
            boolean bool = u61.B;
            if (bool) {
              u611.getClass();
              StringBuilder stringBuilder = new StringBuilder("onFling. sX: ");
              stringBuilder.append(f1);
              stringBuilder.append(" sY: ");
              stringBuilder.append(f);
              stringBuilder.append(" Vx: ");
              stringBuilder.append(f2);
              stringBuilder.append(" Vy: ");
              stringBuilder.append(f3);
              Log.d("PhotoViewAttacher", stringBuilder.toString());
            } 
            ImageView imageView = u611.h();
            o61 o61 = new o61(u611, imageView.getContext());
            u611.x = o61;
            i = u61.j(imageView);
            int j = u61.i(imageView);
            int k = (int)f2;
            int m = (int)f3;
            u611.c();
            RectF rectF = u611.f(u611.g());
            if (rectF != null) {
              int n;
              int i1;
              int i2 = Math.round(-rectF.left);
              f1 = i;
              if (f1 < rectF.width()) {
                i1 = Math.round(rectF.width() - f1);
                n = 0;
              } else {
                i = i2;
                n = i;
                i1 = i;
              } 
              int i3 = Math.round(-rectF.top);
              f1 = j;
              if (f1 < rectF.height()) {
                i = Math.round(rectF.height() - f1);
                j = 0;
              } else {
                i = i3;
                j = i;
              } 
              o61.c = i2;
              o61.e = i3;
              if (bool) {
                StringBuilder stringBuilder = new StringBuilder("fling. StartX:");
                stringBuilder.append(i2);
                stringBuilder.append(" StartY:");
                stringBuilder.append(i3);
                stringBuilder.append(" MaxX:");
                stringBuilder.append(i1);
                stringBuilder.append(" MaxY:");
                stringBuilder.append(i);
                Log.d("PhotoViewAttacher", stringBuilder.toString());
              } 
              if (i2 != i1 || i3 != i)
                ((OverScroller)((bh0)o61.f).c).fling(i2, i3, k, m, n, i1, j, i, 0, 0); 
            } 
            imageView.post(u611.x);
          } 
        } 
        velocityTracker = this.f;
        if (velocityTracker != null) {
          velocityTracker.recycle();
          this.f = null;
        } 
      } 
    } else {
      float f;
      VelocityTracker velocityTracker1 = VelocityTracker.obtain();
      this.f = velocityTracker1;
      if (velocityTracker1 != null) {
        velocityTracker1.addMovement((MotionEvent)velocityTracker);
      } else {
        Log.i("CupcakeGestureDetector", "Velocity tracker is null");
      } 
      try {
        f = velocityTracker.getX(this.i);
      } catch (Exception exception) {
        f = velocityTracker.getX();
      } 
      this.b = f;
      try {
        f = velocityTracker.getY(this.i);
      } catch (Exception exception) {
        f = velocityTracker.getY();
      } 
      this.c = f;
      this.g = false;
    } 
    return true;
  }
  
  public final void c(MotionEvent paramMotionEvent) {
    int j = paramMotionEvent.getAction() & 0xFF;
    byte b = 0;
    if (j != 0) {
      boolean bool = true;
      if (j != 1 && j != 3) {
        if (j == 6) {
          j = (paramMotionEvent.getAction() & 0xFF00) >> 8;
          if (paramMotionEvent.getPointerId(j) == this.h) {
            if (j != 0)
              bool = false; 
            this.h = paramMotionEvent.getPointerId(bool);
            this.b = paramMotionEvent.getX(bool);
            this.c = paramMotionEvent.getY(bool);
          } 
        } 
      } else {
        this.h = -1;
      } 
    } else {
      this.h = paramMotionEvent.getPointerId(0);
    } 
    j = this.h;
    int i = b;
    if (j != -1)
      i = j; 
    this.i = paramMotionEvent.findPointerIndex(i);
    try {
      b(paramMotionEvent);
    } catch (IllegalArgumentException illegalArgumentException) {}
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jc0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */