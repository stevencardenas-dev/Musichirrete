package in.krosbits.android.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import in.krosbits.musicolet.MyApplication;

public class NestedHorizontalScrollView extends HorizontalScrollView {
  public boolean b;
  
  public float c;
  
  public float e;
  
  public final float f = MyApplication.p * 6.0F;
  
  public NestedHorizontalScrollView(Context paramContext) {
    super(paramContext);
  }
  
  public NestedHorizontalScrollView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public NestedHorizontalScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void a(MotionEvent paramMotionEvent) {
    this.b = true;
    try {
      ViewGroup viewGroup = (ViewGroup)getParent();
      return;
    } finally {
      paramMotionEvent = null;
      paramMotionEvent.printStackTrace();
    } 
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (!this.b)
      super.onTouchEvent(paramMotionEvent); 
    if (this.c == -1.0F && this.e == -1.0F)
      paramMotionEvent.setAction(0); 
    int i = paramMotionEvent.getAction();
    if (i != 0) {
      if (i != 1)
        if (i != 2) {
          if (i != 3)
            return false; 
        } else {
          if (!this.b) {
            float f2 = paramMotionEvent.getX() - this.c;
            float f3 = paramMotionEvent.getY();
            float f4 = this.e;
            float f1 = Math.abs(f2);
            f3 = Math.abs(f3 - f4);
            f4 = this.f;
            if (f1 > f4 || f3 > f4) {
              if (f1 > f3) {
                if (f2 > 0.0F) {
                  if (canScrollHorizontally((int)-f2)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                  } 
                  a(paramMotionEvent);
                  return false;
                } 
                if (canScrollHorizontally((int)-f2)) {
                  getParent().requestDisallowInterceptTouchEvent(true);
                  return true;
                } 
                a(paramMotionEvent);
                return false;
              } 
              a(paramMotionEvent);
              return false;
            } 
          } 
          return false;
        }  
      this.e = -1.0F;
      this.c = -1.0F;
      this.b = false;
      getParent().requestDisallowInterceptTouchEvent(false);
      return false;
    } 
    this.c = paramMotionEvent.getX();
    this.e = paramMotionEvent.getY();
    this.b = false;
    getParent().requestDisallowInterceptTouchEvent(true);
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\android\widgets\NestedHorizontalScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */