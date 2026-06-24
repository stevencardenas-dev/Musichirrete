import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

public final class bs0 extends wr0 {
  public final float g;
  
  public final float h;
  
  public bs0(View paramView) {
    super(paramView);
    Resources resources = paramView.getResources();
    this.g = resources.getDimension(2131165425);
    this.h = resources.getDimension(2131165426);
  }
  
  public final AnimatorSet a() {
    AnimatorSet animatorSet = new AnimatorSet();
    Property property = View.SCALE_X;
    View view = this.b;
    animatorSet.playTogether(new Animator[] { (Animator)ObjectAnimator.ofFloat(view, property, new float[] { 1.0F }), (Animator)ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[] { 1.0F }) });
    if (view instanceof ViewGroup) {
      ViewGroup viewGroup = (ViewGroup)view;
      for (byte b = 0; b < viewGroup.getChildCount(); b++) {
        animatorSet.playTogether(new Animator[] { (Animator)ObjectAnimator.ofFloat(viewGroup.getChildAt(b), View.SCALE_Y, new float[] { 1.0F }) });
      } 
    } 
    animatorSet.setInterpolator((TimeInterpolator)new o70(1));
    return animatorSet;
  }
  
  public final void b(float paramFloat) {
    float f1 = this.a.getInterpolation(paramFloat);
    View view = this.b;
    float f2 = view.getWidth();
    paramFloat = view.getHeight();
    if (f2 > 0.0F && paramFloat > 0.0F) {
      f2 = this.g / f2;
      float f = this.h / paramFloat;
      f2 = g5.a(0.0F, f2, f1);
      f = g5.a(0.0F, f, f1);
      f1 = 1.0F - f2;
      f2 = 1.0F - f;
      if (!Float.isNaN(f1) && !Float.isNaN(f2)) {
        view.setScaleX(f1);
        view.setPivotY(paramFloat);
        view.setScaleY(f2);
        if (view instanceof ViewGroup) {
          ViewGroup viewGroup = (ViewGroup)view;
          for (byte b = 0; b < viewGroup.getChildCount(); b++) {
            View view1 = viewGroup.getChildAt(b);
            view1.setPivotY(-view1.getTop());
            if (f2 != 0.0F) {
              paramFloat = f1 / f2;
            } else {
              paramFloat = 1.0F;
            } 
            view1.setScaleY(paramFloat);
          } 
        } 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bs0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */