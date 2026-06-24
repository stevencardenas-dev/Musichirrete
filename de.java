import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;

public final class de implements Runnable {
  public final int b;
  
  public final je c;
  
  public final void run() {
    int i = this.b;
    je je1 = this.c;
    switch (i) {
      default:
        ie = je1.i;
        if (ie != null) {
          ValueAnimator valueAnimator;
          if (ie.getParent() != null)
            ie.setVisibility(0); 
          if (ie.getAnimationMode() == 1) {
            ValueAnimator valueAnimator1 = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
            valueAnimator1.setInterpolator(je1.d);
            valueAnimator1.addUpdateListener(new be(je1, 0));
            valueAnimator = ValueAnimator.ofFloat(new float[] { 0.8F, 1.0F });
            valueAnimator.setInterpolator(je1.f);
            valueAnimator.addUpdateListener(new be(je1, 1));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[] { (Animator)valueAnimator1, (Animator)valueAnimator });
            animatorSet.setDuration(je1.a);
            animatorSet.addListener((Animator.AnimatorListener)new ae(je1, 3));
            animatorSet.start();
          } else {
            int j = valueAnimator.getHeight();
            ViewGroup.LayoutParams layoutParams = valueAnimator.getLayoutParams();
            i = j;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams)
              i = j + ((ViewGroup.MarginLayoutParams)layoutParams).bottomMargin; 
            valueAnimator.setTranslationY(i);
            ValueAnimator valueAnimator1 = new ValueAnimator();
            valueAnimator1.setIntValues(new int[] { i, 0 });
            valueAnimator1.setInterpolator(je1.e);
            valueAnimator1.setDuration(je1.c);
            valueAnimator1.addListener((Animator.AnimatorListener)new ae(je1, 1));
            valueAnimator1.addUpdateListener(new be(je1, 2));
            valueAnimator1.start();
          } 
        } 
        return;
      case 1:
        je1.c();
        return;
      case 0:
        break;
    } 
    ie ie = je1.i;
    if (ie != null) {
      Rect rect;
      WindowManager windowManager = (WindowManager)je1.h.getSystemService("window");
      if (Build.VERSION.SDK_INT >= 30) {
        rect = n0.h(windowManager);
      } else {
        Display display = rect.getDefaultDisplay();
        Point point = new Point();
        display.getRealSize(point);
        rect = new Rect();
        rect.right = point.x;
        rect.bottom = point.y;
      } 
      int j = rect.height();
      int[] arrayOfInt = new int[2];
      ie.getLocationInWindow(arrayOfInt);
      i = arrayOfInt[1];
      i = j - ie.getHeight() + i + (int)ie.getTranslationY();
      j = je1.p;
      if (i >= j) {
        je1.q = j;
      } else {
        ViewGroup.LayoutParams layoutParams = ie.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
          Log.w(je.A, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
        } else {
          j = je1.p;
          je1.q = j;
          ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
          marginLayoutParams.bottomMargin = j - i + marginLayoutParams.bottomMargin;
          ie.requestLayout();
        } 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\de.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */