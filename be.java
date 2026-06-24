import android.animation.ValueAnimator;

public final class be implements ValueAnimator.AnimatorUpdateListener {
  public final int a;
  
  public final je b;
  
  public final void onAnimationUpdate(ValueAnimator paramValueAnimator) {
    ie ie;
    float f;
    int i = this.a;
    je je1 = this.b;
    switch (i) {
      default:
        i = ((Integer)paramValueAnimator.getAnimatedValue()).intValue();
        je1.i.setTranslationY(i);
        return;
      case 2:
        i = ((Integer)paramValueAnimator.getAnimatedValue()).intValue();
        je1.i.setTranslationY(i);
        return;
      case 1:
        f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
        ie = je1.i;
        ie.setScaleX(f);
        ie.setScaleY(f);
        return;
      case 0:
        break;
    } 
    je1.i.setAlpha(((Float)ie.getAnimatedValue()).floatValue());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */