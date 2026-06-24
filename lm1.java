import android.animation.Animator;
import android.os.Handler;
import android.view.View;
import in.krosbits.android.widgets.MSTextView;

public final class lm1 implements Animator.AnimatorListener {
  public final View a;
  
  public final Handler b;
  
  public final sk c;
  
  public lm1(sk paramsk, View paramView, Handler paramHandler) {
    this.c = paramsk;
    this.a = paramView;
    this.b = paramHandler;
  }
  
  public final void onAnimationCancel(Animator paramAnimator) {
    this.b.removeCallbacksAndMessages(null);
  }
  
  public final void onAnimationEnd(Animator paramAnimator) {
    View view = this.a;
    ((MSTextView)view).setShimmering(false);
    view.postInvalidateOnAnimation();
    this.b.removeCallbacksAndMessages(null);
    this.c.e = null;
  }
  
  public final void onAnimationEnd(Animator paramAnimator, boolean paramBoolean) {
    onAnimationEnd(paramAnimator);
  }
  
  public final void onAnimationRepeat(Animator paramAnimator) {
    paramAnimator.pause();
    xt0 xt0 = new xt0(17, paramAnimator);
    this.b.postDelayed(xt0, 5000L);
  }
  
  public final void onAnimationStart(Animator paramAnimator) {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lm1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */