import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

public final class fx extends fo1 {
  public final dx c;
  
  public AnimatorSet d;
  
  public fx(dx paramdx) {
    this.c = paramdx;
  }
  
  public final void a(ViewGroup paramViewGroup) {
    paramViewGroup.getClass();
    AnimatorSet animatorSet = this.d;
    go1 go1 = (go1)this.c.a;
    if (animatorSet == null) {
      go1.c(this);
      return;
    } 
    if (go1.g) {
      if (Build.VERSION.SDK_INT >= 26)
        hx.a.a(animatorSet); 
    } else {
      animatorSet.end();
    } 
    if (lb0.M(2)) {
      String str;
      StringBuilder stringBuilder = new StringBuilder("Animator from operation ");
      stringBuilder.append(go1);
      stringBuilder.append(" has been canceled");
      if (go1.g) {
        str = " with seeking.";
      } else {
        str = ".";
      } 
      stringBuilder.append(str);
      stringBuilder.append(' ');
      Log.v("FragmentManager", stringBuilder.toString());
    } 
  }
  
  public final void b(ViewGroup paramViewGroup) {
    paramViewGroup.getClass();
    go1 go1 = (go1)this.c.a;
    AnimatorSet animatorSet = this.d;
    if (animatorSet == null) {
      go1.c(this);
      return;
    } 
    animatorSet.start();
    if (lb0.M(2)) {
      StringBuilder stringBuilder = new StringBuilder("Animator from operation ");
      stringBuilder.append(go1);
      stringBuilder.append(" has started.");
      Log.v("FragmentManager", stringBuilder.toString());
    } 
  }
  
  public final void c(kb paramkb, ViewGroup paramViewGroup) {
    paramViewGroup.getClass();
    go1 go1 = (go1)this.c.a;
    AnimatorSet animatorSet = this.d;
    if (animatorSet == null) {
      go1.c(this);
      return;
    } 
    if (Build.VERSION.SDK_INT >= 34 && go1.c.p) {
      if (lb0.M(2)) {
        StringBuilder stringBuilder = new StringBuilder("Adding BackProgressCallbacks for Animators to operation ");
        stringBuilder.append(go1);
        Log.v("FragmentManager", stringBuilder.toString());
      } 
      long l3 = gx.a.a(animatorSet);
      long l2 = (long)(paramkb.c * (float)l3);
      long l1 = l2;
      if (l2 == 0L)
        l1 = 1L; 
      l2 = l1;
      if (l1 == l3)
        l2 = l3 - 1L; 
      if (lb0.M(2)) {
        StringBuilder stringBuilder = new StringBuilder("Setting currentPlayTime to ");
        stringBuilder.append(l2);
        stringBuilder.append(" for Animator ");
        stringBuilder.append(animatorSet);
        stringBuilder.append(" on operation ");
        stringBuilder.append(go1);
        Log.v("FragmentManager", stringBuilder.toString());
      } 
      hx.a.b(animatorSet, l2);
    } 
  }
  
  public final void d(ViewGroup paramViewGroup) {
    paramViewGroup.getClass();
    dx dx1 = this.c;
    if (!dx1.g()) {
      boolean bool;
      Context context = paramViewGroup.getContext();
      context.getClass();
      g7 g7 = dx1.l(context);
      if (g7 != null) {
        AnimatorSet animatorSet = (AnimatorSet)g7.e;
      } else {
        g7 = null;
      } 
      this.d = (AnimatorSet)g7;
      go1 go1 = (go1)dx1.a;
      ua0 ua0 = go1.c;
      if (go1.a == 3) {
        bool = true;
      } else {
        bool = false;
      } 
      View view = ua0.K;
      paramViewGroup.startViewTransition(view);
      AnimatorSet animatorSet2 = this.d;
      if (animatorSet2 != null)
        animatorSet2.addListener((Animator.AnimatorListener)new ex(paramViewGroup, view, bool, go1, this)); 
      AnimatorSet animatorSet1 = this.d;
      if (animatorSet1 != null)
        animatorSet1.setTarget(view); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */