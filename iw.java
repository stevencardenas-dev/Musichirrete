import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class iw extends AnimatorListenerAdapter {
  public final he1 a;
  
  public final int b;
  
  public final View c;
  
  public final int d;
  
  public final ViewPropertyAnimator e;
  
  public final mw f;
  
  public iw(mw parammw, he1 paramhe1, int paramInt1, View paramView, int paramInt2, ViewPropertyAnimator paramViewPropertyAnimator) {}
  
  public final void onAnimationCancel(Animator paramAnimator) {
    int i = this.b;
    View view = this.c;
    if (i != 0)
      view.setTranslationX(0.0F); 
    if (this.d != 0)
      view.setTranslationY(0.0F); 
  }
  
  public final void onAnimationEnd(Animator paramAnimator) {
    this.e.setListener(null);
    mw mw1 = this.f;
    he1 he11 = this.a;
    mw1.c(he11);
    mw1.p.remove(he11);
    mw1.i();
  }
  
  public final void onAnimationStart(Animator paramAnimator) {
    this.f.getClass();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\iw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */