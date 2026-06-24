import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class i70 extends AnimatorListenerAdapter {
  public final int a;
  
  public boolean b;
  
  public final Object c;
  
  public i70(View paramView, boolean paramBoolean) {}
  
  public i70(r70 paramr70) {
    this.b = false;
  }
  
  public i70(v80 paramv80, boolean paramBoolean) {}
  
  public void onAnimationCancel(Animator paramAnimator) {
    switch (this.a) {
      default:
        super.onAnimationCancel(paramAnimator);
        return;
      case 1:
        break;
    } 
    this.b = true;
  }
  
  public final void onAnimationEnd(Animator paramAnimator) {
    int i = this.a;
    Object object = this.c;
    switch (i) {
      default:
        object = object;
        ((v80)object).r = 0;
        ((v80)object).m = null;
        return;
      case 1:
        object = object;
        if (this.b) {
          this.b = false;
        } else if (((Float)((r70)object).z.getAnimatedValue()).floatValue() == 0.0F) {
          ((r70)object).A = 0;
          object.j(0);
        } else {
          ((r70)object).A = 2;
          ((r70)object).s.invalidate();
        } 
        return;
      case 0:
        break;
    } 
    if (!this.b)
      ((View)object).setVisibility(4); 
  }
  
  public void onAnimationStart(Animator paramAnimator) {
    int i = this.a;
    Object object = this.c;
    switch (i) {
      default:
        super.onAnimationStart(paramAnimator);
        return;
      case 2:
        object = object;
        ((v80)object).s.a(0, this.b);
        ((v80)object).r = 2;
        ((v80)object).m = paramAnimator;
        return;
      case 0:
        break;
    } 
    if (this.b)
      ((View)object).setVisibility(0); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\i70.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */