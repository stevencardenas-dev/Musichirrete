import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

public final class m42 extends AnimatorListenerAdapter implements jw1 {
  public final View a;
  
  public final int b;
  
  public final ViewGroup c;
  
  public final boolean d;
  
  public boolean e;
  
  public boolean f = false;
  
  public m42(View paramView, int paramInt) {
    this.a = paramView;
    this.b = paramInt;
    this.c = (ViewGroup)paramView.getParent();
    this.d = true;
    g(true);
  }
  
  public final void a(kw1 paramkw1) {}
  
  public final void b() {
    g(false);
    if (!this.f)
      c42.b(this.a, this.b); 
  }
  
  public final void c() {
    g(true);
    if (!this.f)
      c42.b(this.a, 0); 
  }
  
  public final void d(kw1 paramkw1) {
    paramkw1.A(this);
  }
  
  public final void f(kw1 paramkw1) {}
  
  public final void g(boolean paramBoolean) {
    if (this.d && this.e != paramBoolean) {
      ViewGroup viewGroup = this.c;
      if (viewGroup != null) {
        this.e = paramBoolean;
        ui0.m0(viewGroup, paramBoolean);
      } 
    } 
  }
  
  public final void onAnimationCancel(Animator paramAnimator) {
    this.f = true;
  }
  
  public final void onAnimationEnd(Animator paramAnimator) {
    if (!this.f) {
      c42.b(this.a, this.b);
      ViewGroup viewGroup = this.c;
      if (viewGroup != null)
        viewGroup.invalidate(); 
    } 
    g(false);
  }
  
  public final void onAnimationEnd(Animator paramAnimator, boolean paramBoolean) {
    if (!paramBoolean) {
      if (!this.f) {
        c42.b(this.a, this.b);
        ViewGroup viewGroup = this.c;
        if (viewGroup != null)
          viewGroup.invalidate(); 
      } 
      g(false);
    } 
  }
  
  public final void onAnimationRepeat(Animator paramAnimator) {}
  
  public final void onAnimationStart(Animator paramAnimator) {}
  
  public final void onAnimationStart(Animator paramAnimator, boolean paramBoolean) {
    if (paramBoolean) {
      c42.b(this.a, 0);
      ViewGroup viewGroup = this.c;
      if (viewGroup != null)
        viewGroup.invalidate(); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */