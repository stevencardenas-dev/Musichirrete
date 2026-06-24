import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

public final class bx implements Animation.AnimationListener {
  public final go1 a;
  
  public final ViewGroup b;
  
  public final View c;
  
  public final cx d;
  
  public bx(go1 paramgo1, ViewGroup paramViewGroup, View paramView, cx paramcx) {
    this.a = paramgo1;
    this.b = paramViewGroup;
    this.c = paramView;
    this.d = paramcx;
  }
  
  public final void onAnimationEnd(Animation paramAnimation) {
    paramAnimation.getClass();
    ViewGroup viewGroup = this.b;
    viewGroup.post(new ww(viewGroup, this.c, this.d, 1));
    if (lb0.M(2)) {
      StringBuilder stringBuilder = new StringBuilder("Animation from operation ");
      stringBuilder.append(this.a);
      stringBuilder.append(" has ended.");
      Log.v("FragmentManager", stringBuilder.toString());
    } 
  }
  
  public final void onAnimationRepeat(Animation paramAnimation) {
    paramAnimation.getClass();
  }
  
  public final void onAnimationStart(Animation paramAnimation) {
    paramAnimation.getClass();
    if (lb0.M(2)) {
      StringBuilder stringBuilder = new StringBuilder("Animation from operation ");
      stringBuilder.append(this.a);
      stringBuilder.append(" has reached onAnimationStart.");
      Log.v("FragmentManager", stringBuilder.toString());
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */