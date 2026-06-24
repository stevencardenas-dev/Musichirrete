import android.animation.Animator;
import android.view.View;
import java.lang.ref.WeakReference;

public final class u32 {
  public final WeakReference a;
  
  public u32(View paramView) {
    this.a = new WeakReference<View>(paramView);
  }
  
  public final void a(float paramFloat) {
    View view = this.a.get();
    if (view != null)
      view.animate().alpha(paramFloat); 
  }
  
  public final void b() {
    View view = this.a.get();
    if (view != null)
      view.animate().cancel(); 
  }
  
  public final void c(long paramLong) {
    View view = this.a.get();
    if (view != null)
      view.animate().setDuration(paramLong); 
  }
  
  public final void d(w32 paramw32) {
    View view = this.a.get();
    if (view != null) {
      if (paramw32 != null) {
        view.animate().setListener((Animator.AnimatorListener)new j1(paramw32, view));
        return;
      } 
      view.animate().setListener(null);
    } 
  }
  
  public final void e(float paramFloat) {
    View view = this.a.get();
    if (view != null)
      view.animate().translationY(paramFloat); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */