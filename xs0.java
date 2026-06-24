import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class xs0 extends AnimatorListenerAdapter {
  public final boolean a;
  
  public final int b;
  
  public final ys0 c;
  
  public xs0(ys0 paramys0, boolean paramBoolean, int paramInt) {}
  
  public final void onAnimationEnd(Animator paramAnimator) {
    ys0 ys01 = this.c;
    ys01.b.setTranslationX(0.0F);
    ys01.a(0.0F, this.a, this.b);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xs0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */