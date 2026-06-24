import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

public final class zk1 implements Runnable {
  public final int b;
  
  public boolean c;
  
  public final Object e;
  
  public final Object f;
  
  public zk1(SwipeDismissBehavior paramSwipeDismissBehavior, View paramView, boolean paramBoolean) {
    this.f = paramSwipeDismissBehavior;
    this.e = paramView;
    this.c = paramBoolean;
  }
  
  public zk1(wm0 paramwm0, om0 paramom0) {
    this.e = paramwm0;
    this.f = paramom0;
  }
  
  public final void run() {
    SwipeDismissBehavior swipeDismissBehavior;
    int i = this.b;
    Object object2 = this.f;
    Object object1 = this.e;
    switch (i) {
      default:
        object1 = object1;
        swipeDismissBehavior = (SwipeDismissBehavior)object2;
        object2 = swipeDismissBehavior.a;
        if (object2 != null && object2.f()) {
          object1.postOnAnimation(this);
        } else if (this.c) {
          object2 = swipeDismissBehavior.b;
          if (object2 != null)
            object2.a((View)object1); 
        } 
        return;
      case 0:
        break;
    } 
    if (!this.c) {
      ((wm0)object1).e((om0)object2);
      this.c = true;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zk1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */