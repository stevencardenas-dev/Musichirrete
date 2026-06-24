package in.krosbits.android.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import t32;

public class ViewPager2 extends t32 {
  public ViewPager2(Context paramContext) {
    super(paramContext);
  }
  
  public ViewPager2(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    try {
      return super.onInterceptTouchEvent(paramMotionEvent);
    } finally {
      paramMotionEvent = null;
      paramMotionEvent.printStackTrace();
    } 
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    try {
      return super.onTouchEvent(paramMotionEvent);
    } finally {
      paramMotionEvent = null;
      paramMotionEvent.printStackTrace();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\android\widgets\ViewPager2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */