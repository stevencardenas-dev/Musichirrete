import android.animation.ValueAnimator;
import android.view.View;

public final class us1 implements ValueAnimator.AnimatorUpdateListener {
  public final View a;
  
  public final View b;
  
  public final vs1 c;
  
  public us1(vs1 paramvs1, View paramView1, View paramView2) {
    this.c = paramvs1;
    this.a = paramView1;
    this.b = paramView2;
  }
  
  public final void onAnimationUpdate(ValueAnimator paramValueAnimator) {
    View view = this.b;
    float f = paramValueAnimator.getAnimatedFraction();
    this.c.c(this.a, view, f);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\us1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */