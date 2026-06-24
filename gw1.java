import android.animation.Animator;
import android.animation.AnimatorSet;

public abstract class gw1 {
  public static long a(Animator paramAnimator) {
    return paramAnimator.getTotalDuration();
  }
  
  public static void b(Animator paramAnimator, long paramLong) {
    ((AnimatorSet)paramAnimator).setCurrentPlayTime(paramLong);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gw1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */