import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

public final class n42 extends AnimatorListenerAdapter implements jw1 {
  public final ViewGroup a;
  
  public final View b;
  
  public final View c;
  
  public boolean d = true;
  
  public final l70 e;
  
  public n42(l70 paraml70, ViewGroup paramViewGroup, View paramView1, View paramView2) {
    this.a = paramViewGroup;
    this.b = paramView1;
    this.c = paramView2;
  }
  
  public final void a(kw1 paramkw1) {}
  
  public final void b() {}
  
  public final void c() {}
  
  public final void d(kw1 paramkw1) {
    paramkw1.A(this);
  }
  
  public final void f(kw1 paramkw1) {
    if (this.d)
      g(); 
  }
  
  public final void g() {
    this.c.setTag(2131297432, null);
    this.a.getOverlay().remove(this.b);
    this.d = false;
  }
  
  public final void onAnimationEnd(Animator paramAnimator) {
    g();
  }
  
  public final void onAnimationEnd(Animator paramAnimator, boolean paramBoolean) {
    if (!paramBoolean)
      g(); 
  }
  
  public final void onAnimationPause(Animator paramAnimator) {
    this.a.getOverlay().remove(this.b);
  }
  
  public final void onAnimationResume(Animator paramAnimator) {
    View view = this.b;
    if (view.getParent() == null) {
      this.a.getOverlay().add(view);
      return;
    } 
    this.e.c();
  }
  
  public final void onAnimationStart(Animator paramAnimator, boolean paramBoolean) {
    if (paramBoolean) {
      View view1 = this.c;
      View view2 = this.b;
      view1.setTag(2131297432, view2);
      this.a.getOverlay().add(view2);
      this.d = true;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */