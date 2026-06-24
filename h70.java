import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class h70 extends AnimatorListenerAdapter {
  public final boolean a;
  
  public final View b;
  
  public final View c;
  
  public h70(boolean paramBoolean, View paramView1, View paramView2) {}
  
  public final void onAnimationEnd(Animator paramAnimator) {
    if (!this.a) {
      this.b.setVisibility(4);
      View view = this.c;
      view.setAlpha(1.0F);
      view.setVisibility(0);
    } 
  }
  
  public final void onAnimationStart(Animator paramAnimator) {
    if (this.a) {
      this.b.setVisibility(0);
      View view = this.c;
      view.setAlpha(0.0F);
      view.setVisibility(4);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\h70.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */