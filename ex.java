import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

public final class ex extends AnimatorListenerAdapter {
  public final ViewGroup a;
  
  public final View b;
  
  public final boolean c;
  
  public final go1 d;
  
  public final fx e;
  
  public ex(ViewGroup paramViewGroup, View paramView, boolean paramBoolean, go1 paramgo1, fx paramfx) {}
  
  public final void onAnimationEnd(Animator paramAnimator) {
    paramAnimator.getClass();
    ViewGroup viewGroup = this.a;
    View view = this.b;
    viewGroup.endViewTransition(view);
    boolean bool = this.c;
    go1 go11 = this.d;
    if (bool || go11.a == 3) {
      int i = go11.a;
      view.getClass();
      ga1.a(i, view, viewGroup);
    } 
    fx fx1 = this.e;
    ((go1)fx1.c.a).c(fx1);
    if (lb0.M(2)) {
      StringBuilder stringBuilder = new StringBuilder("Animator from operation ");
      stringBuilder.append(go11);
      stringBuilder.append(" has ended.");
      Log.v("FragmentManager", stringBuilder.toString());
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ex.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */