import android.animation.ValueAnimator;
import android.view.MenuItem;
import android.view.View;

public final class wi implements Runnable {
  public final int b;
  
  public final Object c;
  
  public final Object e;
  
  public final Object f;
  
  public final Object g;
  
  public wi(View paramView, d62 paramd62, j01 paramj01, ValueAnimator paramValueAnimator) {
    this.c = paramView;
    this.e = paramd62;
    this.f = paramj01;
    this.g = paramValueAnimator;
  }
  
  public wi(gh1 paramgh1, xi paramxi, uw0 paramuw0, rw0 paramrw0) {
    this.g = paramgh1;
    this.c = paramxi;
    this.e = paramuw0;
    this.f = paramrw0;
  }
  
  public final void run() {
    int i = this.b;
    Object object2 = this.g;
    Object object1 = this.f;
    Object object4 = this.e;
    Object object3 = this.c;
    switch (i) {
      default:
        y52.i((View)object3, (d62)object4, (j01)object1);
        ((ValueAnimator)object2).start();
        return;
      case 0:
        break;
    } 
    object2 = ((gh1)object2).c;
    object4 = object4;
    object3 = object3;
    if (object3 != null) {
      ((yi)object2).B = true;
      ((xi)object3).b.c(false);
      ((yi)object2).B = false;
    } 
    if (object4.isEnabled() && object4.hasSubMenu())
      ((rw0)object1).q((MenuItem)object4, null, 4); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */