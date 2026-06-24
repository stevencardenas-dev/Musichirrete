import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

public final class cx extends fo1 {
  public final dx c;
  
  public cx(dx paramdx) {
    this.c = paramdx;
  }
  
  public final void a(ViewGroup paramViewGroup) {
    paramViewGroup.getClass();
    go1 go1 = (go1)this.c.a;
    View view = go1.c.K;
    view.clearAnimation();
    paramViewGroup.endViewTransition(view);
    go1.c(this);
    if (lb0.M(2)) {
      StringBuilder stringBuilder = new StringBuilder("Animation from operation ");
      stringBuilder.append(go1);
      stringBuilder.append(" has been cancelled.");
      Log.v("FragmentManager", stringBuilder.toString());
    } 
  }
  
  public final void b(ViewGroup paramViewGroup) {
    paramViewGroup.getClass();
    dx dx1 = this.c;
    go1 go1 = (go1)dx1.a;
    if (dx1.g()) {
      go1.c(this);
      return;
    } 
    Context context = paramViewGroup.getContext();
    View view = go1.c.K;
    context.getClass();
    g7 g7 = dx1.l(context);
    if (g7 != null) {
      Animation animation = (Animation)g7.c;
      if (animation != null) {
        if (go1.a != 1) {
          view.startAnimation(animation);
          go1.c(this);
          return;
        } 
        paramViewGroup.startViewTransition(view);
        xa0 xa0 = new xa0(animation, paramViewGroup, view);
        xa0.setAnimationListener(new bx(go1, paramViewGroup, view, this));
        view.startAnimation((Animation)xa0);
        if (lb0.M(2)) {
          StringBuilder stringBuilder = new StringBuilder("Animation from operation ");
          stringBuilder.append(go1);
          stringBuilder.append(" has started.");
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        return;
      } 
      tp.f("Required value was null.");
      return;
    } 
    tp.f("Required value was null.");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */