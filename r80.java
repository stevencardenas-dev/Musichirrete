import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public final class r80 extends AnimatorListenerAdapter {
  public boolean a;
  
  public final boolean b;
  
  public final v80 c;
  
  public r80(v80 paramv80, boolean paramBoolean) {}
  
  public final void onAnimationCancel(Animator paramAnimator) {
    this.a = true;
  }
  
  public final void onAnimationEnd(Animator paramAnimator) {
    v80 v801 = this.c;
    v801.r = 0;
    v801.m = null;
    if (!this.a) {
      byte b;
      FloatingActionButton floatingActionButton = v801.s;
      boolean bool = this.b;
      if (bool) {
        b = 8;
      } else {
        b = 4;
      } 
      floatingActionButton.a(b, bool);
    } 
  }
  
  public final void onAnimationStart(Animator paramAnimator) {
    v80 v801 = this.c;
    v801.s.a(0, this.b);
    v801.r = 1;
    v801.m = paramAnimator;
    this.a = false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\r80.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */