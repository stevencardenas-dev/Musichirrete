import android.view.View;
import android.view.ViewTreeObserver;
import org.jaudiotagger.audio.opus.bsQ.uvJYmft;

public final class s41 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
  public final View b;
  
  public ViewTreeObserver c;
  
  public final Runnable e;
  
  public s41(View paramView, Runnable paramRunnable) {
    this.b = paramView;
    this.c = paramView.getViewTreeObserver();
    this.e = paramRunnable;
  }
  
  public static void a(View paramView, Runnable paramRunnable) {
    if (paramView != null) {
      s41 s411 = new s41(paramView, paramRunnable);
      paramView.getViewTreeObserver().addOnPreDrawListener(s411);
      paramView.addOnAttachStateChangeListener(s411);
      return;
    } 
    k91.h(uvJYmft.IkTNOUmzQj);
  }
  
  public final boolean onPreDraw() {
    boolean bool = this.c.isAlive();
    View view = this.b;
    if (bool) {
      this.c.removeOnPreDrawListener(this);
    } else {
      view.getViewTreeObserver().removeOnPreDrawListener(this);
    } 
    view.removeOnAttachStateChangeListener(this);
    this.e.run();
    return true;
  }
  
  public final void onViewAttachedToWindow(View paramView) {
    this.c = paramView.getViewTreeObserver();
  }
  
  public final void onViewDetachedFromWindow(View paramView) {
    boolean bool = this.c.isAlive();
    paramView = this.b;
    if (bool) {
      this.c.removeOnPreDrawListener(this);
    } else {
      paramView.getViewTreeObserver().removeOnPreDrawListener(this);
    } 
    paramView.removeOnAttachStateChangeListener(this);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s41.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */