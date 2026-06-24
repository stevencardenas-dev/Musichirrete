import android.view.animation.Animation;
import in.krosbits.musicolet.LockScreenActivity;

public final class ep0 implements Animation.AnimationListener {
  public final int a;
  
  public final Object b;
  
  private final void a(Animation paramAnimation) {}
  
  private final void b(Animation paramAnimation) {}
  
  private final void c(Animation paramAnimation) {}
  
  private final void d(Animation paramAnimation) {}
  
  public final void onAnimationEnd(Animation paramAnimation) {
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        ((fp0)object).a.h0.setAlpha(0.0F);
        return;
      case 0:
        break;
    } 
    ((LockScreenActivity)object).h0.setAlpha(0.0F);
  }
  
  public final void onAnimationRepeat(Animation paramAnimation) {
    int i = this.a;
  }
  
  public final void onAnimationStart(Animation paramAnimation) {
    int i = this.a;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ep0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */