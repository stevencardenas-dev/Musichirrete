import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class bn0 extends AnimatorListenerAdapter {
  public final int a;
  
  public final cn0 b;
  
  public void onAnimationEnd(Animator paramAnimator) {
    switch (this.a) {
      default:
        super.onAnimationEnd(paramAnimator);
        return;
      case 1:
        break;
    } 
    super.onAnimationEnd(paramAnimator);
    cn0 cn01 = this.b;
    cn01.c();
    md md = cn01.j;
    if (md != null)
      md.a((sh0)cn01.a); 
  }
  
  public void onAnimationRepeat(Animator paramAnimator) {
    switch (this.a) {
      default:
        super.onAnimationRepeat(paramAnimator);
        return;
      case 0:
        break;
    } 
    super.onAnimationRepeat(paramAnimator);
    cn0 cn01 = this.b;
    cn01.g = (cn01.g + 1) % cn01.f.e.length;
    cn01.h = true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bn0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */