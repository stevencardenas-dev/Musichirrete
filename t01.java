import android.animation.ValueAnimator;

public final class t01 implements ValueAnimator.AnimatorUpdateListener {
  public final float a;
  
  public final w01 b;
  
  public t01(w01 paramw01, float paramFloat) {
    this.b = paramw01;
    this.a = paramFloat;
  }
  
  public final void onAnimationUpdate(ValueAnimator paramValueAnimator) {
    float f = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    w01.access$200(this.b, f, this.a);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */