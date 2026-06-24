import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class hw extends AnimatorListenerAdapter {
  public final int a;
  
  public final he1 b;
  
  public final View c;
  
  public final ViewPropertyAnimator d;
  
  public final mw e;
  
  public hw(mw parammw, he1 paramhe1, View paramView, ViewPropertyAnimator paramViewPropertyAnimator) {}
  
  public hw(mw parammw, he1 paramhe1, ViewPropertyAnimator paramViewPropertyAnimator, View paramView) {}
  
  public void onAnimationCancel(Animator paramAnimator) {
    switch (this.a) {
      default:
        super.onAnimationCancel(paramAnimator);
        return;
      case 1:
        break;
    } 
    this.c.setAlpha(1.0F);
  }
  
  public final void onAnimationEnd(Animator paramAnimator) {
    int i = this.a;
    he1 he11 = this.b;
    mw mw1 = this.e;
    ViewPropertyAnimator viewPropertyAnimator = this.d;
    switch (i) {
      default:
        viewPropertyAnimator.setListener(null);
        mw1.c(he11);
        mw1.o.remove(he11);
        mw1.i();
        return;
      case 0:
        break;
    } 
    viewPropertyAnimator.setListener(null);
    this.c.setAlpha(1.0F);
    mw1.c(he11);
    mw1.q.remove(he11);
    mw1.i();
  }
  
  public final void onAnimationStart(Animator paramAnimator) {
    switch (this.a) {
      default:
        this.e.getClass();
        return;
      case 0:
        break;
    } 
    this.e.getClass();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */