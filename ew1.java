import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class ew1 extends AnimatorListenerAdapter {
  public final int a;
  
  public final Object b;
  
  public final Object c;
  
  public ew1(d62 paramd62, View paramView) {}
  
  public ew1(kw1 paramkw1, b9 paramb9) {}
  
  public final void onAnimationEnd(Animator paramAnimator) {
    d62 d62;
    int i = this.a;
    Object object1 = this.c;
    Object object2 = this.b;
    switch (i) {
      default:
        d62 = (d62)object2;
        d62.a.e(1.0F);
        y52.f(d62, (View)object1);
        return;
      case 0:
        break;
    } 
    ((b9)object2).remove(d62);
    ((kw1)object1).q.remove(d62);
  }
  
  public void onAnimationStart(Animator paramAnimator) {
    switch (this.a) {
      default:
        super.onAnimationStart(paramAnimator);
        return;
      case 0:
        break;
    } 
    ((kw1)this.c).q.add(paramAnimator);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ew1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */