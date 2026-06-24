import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class tl extends AnimatorListenerAdapter {
  public final int a;
  
  public final ul b;
  
  public void onAnimationEnd(Animator paramAnimator) {
    switch (this.a) {
      default:
        super.onAnimationEnd(paramAnimator);
        return;
      case 1:
        break;
    } 
    this.b.b.g(false);
  }
  
  public void onAnimationStart(Animator paramAnimator) {
    switch (this.a) {
      default:
        super.onAnimationStart(paramAnimator);
        return;
      case 0:
        break;
    } 
    this.b.b.g(true);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */