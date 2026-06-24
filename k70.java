import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class k70 extends AnimatorListenerAdapter implements jw1 {
  public final View a;
  
  public boolean b = false;
  
  public k70(View paramView) {
    this.a = paramView;
  }
  
  public final void a(kw1 paramkw1) {}
  
  public final void b() {
    float f;
    View view = this.a;
    if (view.getVisibility() == 0) {
      f = c42.a.q(view);
    } else {
      f = 0.0F;
    } 
    view.setTag(2131297670, Float.valueOf(f));
  }
  
  public final void c() {
    this.a.setTag(2131297670, null);
  }
  
  public final void d(kw1 paramkw1) {}
  
  public final void e(kw1 paramkw1) {}
  
  public final void f(kw1 paramkw1) {}
  
  public final void onAnimationCancel(Animator paramAnimator) {
    c42.a.M(this.a, 1.0F);
  }
  
  public final void onAnimationEnd(Animator paramAnimator) {
    onAnimationEnd(paramAnimator, false);
  }
  
  public final void onAnimationEnd(Animator paramAnimator, boolean paramBoolean) {
    boolean bool = this.b;
    View view = this.a;
    if (bool)
      view.setLayerType(0, null); 
    if (!paramBoolean) {
      i42 i42 = c42.a;
      i42.M(view, 1.0F);
      i42.getClass();
    } 
  }
  
  public final void onAnimationStart(Animator paramAnimator) {
    View view = this.a;
    if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
      this.b = true;
      view.setLayerType(2, null);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\k70.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */