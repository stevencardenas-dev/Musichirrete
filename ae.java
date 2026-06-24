import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

public final class ae extends AnimatorListenerAdapter {
  public final int a;
  
  public final je b;
  
  public final void onAnimationEnd(Animator paramAnimator) {
    int i = this.a;
    je je1 = this.b;
    switch (i) {
      default:
        je1.d();
        return;
      case 2:
        je1.c();
        return;
      case 1:
        je1.d();
        return;
      case 0:
        break;
    } 
    je1.c();
  }
  
  public void onAnimationStart(Animator paramAnimator) {
    ViewPropertyAnimator viewPropertyAnimator2;
    TimeInterpolator timeInterpolator2;
    int i = this.a;
    je je1 = this.b;
    switch (i) {
      default:
        super.onAnimationStart(paramAnimator);
        return;
      case 2:
        snackbarContentLayout = je1.j;
        i = je1.b;
        snackbarContentLayout.b.setAlpha(1.0F);
        viewPropertyAnimator2 = snackbarContentLayout.b.animate().alpha(0.0F);
        l1 = i;
        viewPropertyAnimator3 = viewPropertyAnimator2.setDuration(l1);
        timeInterpolator2 = snackbarContentLayout.e;
        viewPropertyAnimator3.setInterpolator(timeInterpolator2).setStartDelay(0L).start();
        if (snackbarContentLayout.c.getVisibility() == 0) {
          snackbarContentLayout.c.setAlpha(1.0F);
          snackbarContentLayout.c.animate().alpha(0.0F).setDuration(l1).setInterpolator(timeInterpolator2).setStartDelay(0L).start();
        } 
        return;
      case 1:
        break;
    } 
    SnackbarContentLayout snackbarContentLayout = ((je)timeInterpolator2).j;
    i = ((je)timeInterpolator2).c;
    int j = ((je)timeInterpolator2).a;
    snackbarContentLayout.b.setAlpha(0.0F);
    ViewPropertyAnimator viewPropertyAnimator1 = snackbarContentLayout.b.animate().alpha(1.0F);
    long l1 = j;
    ViewPropertyAnimator viewPropertyAnimator3 = viewPropertyAnimator1.setDuration(l1);
    TimeInterpolator timeInterpolator1 = snackbarContentLayout.e;
    viewPropertyAnimator3 = viewPropertyAnimator3.setInterpolator(timeInterpolator1);
    long l2 = (i - j);
    viewPropertyAnimator3.setStartDelay(l2).start();
    if (snackbarContentLayout.c.getVisibility() == 0) {
      snackbarContentLayout.c.setAlpha(0.0F);
      snackbarContentLayout.c.animate().alpha(1.0F).setDuration(l1).setInterpolator(timeInterpolator1).setStartDelay(l2).start();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */