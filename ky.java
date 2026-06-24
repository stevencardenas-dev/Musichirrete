import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import com.google.android.material.button.MaterialButton;

public final class ky extends qv {
  public final int i;
  
  public final float A(Object paramObject) {
    switch (this.i) {
      default:
        return MaterialButton.b((MaterialButton)paramObject);
      case 0:
        break;
    } 
    return ((ly)paramObject).s.b * 10000.0F;
  }
  
  public final void Z(Object paramObject, float paramFloat) {
    switch (this.i) {
      default:
        MaterialButton.c((MaterialButton)paramObject, paramFloat);
        return;
      case 0:
        break;
    } 
    paramObject = paramObject;
    float f = paramFloat / 10000.0F;
    ((ly)paramObject).s.b = f;
    paramObject.invalidateSelf();
    int i = (int)paramFloat;
    if (((n10)paramObject).c.c(true)) {
      Context context = ((n10)paramObject).b;
      if (((ly)paramObject).w == null) {
        LinearInterpolator linearInterpolator = g5.a;
        ((ly)paramObject).y = zo2.Q(context, 2130969705, (TimeInterpolator)linearInterpolator);
        ((ly)paramObject).z = zo2.Q(context, 2130969697, (TimeInterpolator)linearInterpolator);
        ValueAnimator valueAnimator1 = new ValueAnimator();
        ((ly)paramObject).w = valueAnimator1;
        valueAnimator1.setDuration(500L);
        ((ly)paramObject).w.setFloatValues(new float[] { 0.0F, 1.0F });
        ((ly)paramObject).w.setInterpolator(null);
        ((ly)paramObject).w.addUpdateListener(new pd(1, paramObject));
      } 
      paramFloat = i;
      if (paramFloat >= 1000.0F && paramFloat <= 9000.0F) {
        paramFloat = 1.0F;
      } else {
        paramFloat = 0.0F;
      } 
      f = ((ly)paramObject).t;
      ValueAnimator valueAnimator = ((ly)paramObject).w;
      if (paramFloat != f) {
        if (valueAnimator.isRunning())
          ((ly)paramObject).w.cancel(); 
        ((ly)paramObject).t = paramFloat;
        if (paramFloat == 1.0F) {
          ((ly)paramObject).x = ((ly)paramObject).y;
          ((ly)paramObject).w.start();
        } else {
          ((ly)paramObject).x = ((ly)paramObject).z;
          ((ly)paramObject).w.reverse();
        } 
      } else if (!valueAnimator.isRunning()) {
        ((ly)paramObject).s.e = paramFloat;
        paramObject.invalidateSelf();
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */