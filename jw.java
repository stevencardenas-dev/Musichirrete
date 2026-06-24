import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class jw extends AnimatorListenerAdapter {
  public final int a;
  
  public final kw b;
  
  public final ViewPropertyAnimator c;
  
  public final View d;
  
  public final mw e;
  
  public final void onAnimationEnd(Animator paramAnimator) {
    int i = this.a;
    kw kw1 = this.b;
    mw mw1 = this.e;
    View view = this.d;
    ViewPropertyAnimator viewPropertyAnimator = this.c;
    switch (i) {
      default:
        viewPropertyAnimator.setListener(null);
        view.setAlpha(1.0F);
        view.setTranslationX(0.0F);
        view.setTranslationY(0.0F);
        mw1.c(kw1.b);
        mw1.r.remove(kw1.b);
        mw1.i();
        return;
      case 0:
        break;
    } 
    viewPropertyAnimator.setListener(null);
    view.setAlpha(1.0F);
    view.setTranslationX(0.0F);
    view.setTranslationY(0.0F);
    mw1.c(kw1.a);
    mw1.r.remove(kw1.a);
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


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */