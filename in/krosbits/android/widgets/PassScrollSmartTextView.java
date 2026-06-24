package in.krosbits.android.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import in.krosbits.musicolet.MyApplication;

public class PassScrollSmartTextView extends SmartTextView {
  public boolean g;
  
  public float h;
  
  public float i;
  
  public final float j = MyApplication.p * 6.0F;
  
  public PassScrollSmartTextView(Context paramContext) {
    super(paramContext);
  }
  
  public PassScrollSmartTextView(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public PassScrollSmartTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void h(MotionEvent paramMotionEvent) {
    try {
      float f2 = paramMotionEvent.getX();
      float f1 = paramMotionEvent.getY();
      return;
    } finally {
      paramMotionEvent = null;
      paramMotionEvent.printStackTrace();
    } 
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (this.h == -1.0F && this.i == -1.0F)
      paramMotionEvent.setAction(0); 
    int i = paramMotionEvent.getAction();
    if (i != 0) {
      if (i != 1)
        if (i != 2) {
          if (i != 3)
            return false; 
        } else {
          if (this.g) {
            h(paramMotionEvent);
            return true;
          } 
          float f4 = paramMotionEvent.getX();
          float f2 = this.h;
          float f1 = paramMotionEvent.getY();
          float f3 = this.i;
          f2 = Math.abs(f4 - f2);
          f3 = Math.abs(f1 - f3);
          f1 = this.j;
          if (f2 > f1 || f3 > f1) {
            this.g = true;
            cancelLongPress();
            h(paramMotionEvent);
            return false;
          } 
          return false;
        }  
      if (!this.g) {
        super.onTouchEvent(paramMotionEvent);
      } else {
        h(paramMotionEvent);
      } 
      this.i = -1.0F;
      this.h = -1.0F;
      this.g = false;
      return false;
    } 
    this.h = paramMotionEvent.getX();
    this.i = paramMotionEvent.getY();
    this.g = false;
    super.onTouchEvent(paramMotionEvent);
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\android\widgets\PassScrollSmartTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */