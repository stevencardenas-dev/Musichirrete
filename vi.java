import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;

public final class vi implements View.OnAttachStateChangeListener {
  public final int b;
  
  public final Object c;
  
  private final void a(View paramView) {}
  
  private final void b(View paramView) {}
  
  private final void c(View paramView) {}
  
  private final void d(View paramView) {}
  
  private final void e(View paramView) {}
  
  public final void onViewAttachedToWindow(View paramView) {
    WeakHashMap weakHashMap;
    n40 n40;
    int i = this.b;
    Object object = this.c;
    switch (i) {
      default:
        return;
      case 2:
        object = object;
        object.removeOnAttachStateChangeListener(this);
        weakHashMap = v22.a;
        object.requestApplyInsets();
        return;
      case 1:
        n40 = (n40)object;
        object = n40.v;
        if (n40.w != null && object != null && n40.isAttachedToWindow())
          object.addTouchExplorationStateChangeListener(n40.w); 
        break;
      case 0:
        break;
    } 
  }
  
  public final void onViewDetachedFromWindow(View paramView) {
    HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior;
    AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener;
    ViewTreeObserver viewTreeObserver2;
    cg0 cg0;
    int i = this.b;
    Object object = this.c;
    switch (i) {
      default:
        object = object;
        viewTreeObserver2 = ((dp1)object).q;
        if (viewTreeObserver2 != null) {
          if (!viewTreeObserver2.isAlive())
            ((dp1)object).q = paramView.getViewTreeObserver(); 
          ((dp1)object).q.removeGlobalOnLayoutListener(((dp1)object).k);
        } 
        paramView.removeOnAttachStateChangeListener(this);
        return;
      case 4:
        object = object;
        cg0 = ((HideViewOnScrollBehavior)object).c;
        if (cg0 != null) {
          AccessibilityManager accessibilityManager = ((HideViewOnScrollBehavior)object).b;
          if (accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(cg0);
            ((HideViewOnScrollBehavior)object).c = null;
          } 
        } 
        return;
      case 3:
        hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior)object;
        object = hideBottomViewOnScrollBehavior.h;
        if (object != null) {
          AccessibilityManager accessibilityManager = hideBottomViewOnScrollBehavior.g;
          if (accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener((AccessibilityManager.TouchExplorationStateChangeListener)object);
            hideBottomViewOnScrollBehavior.h = null;
          } 
        } 
      case 2:
        return;
      case 1:
        object = object;
        touchExplorationStateChangeListener = ((n40)object).w;
        if (touchExplorationStateChangeListener != null) {
          object = ((n40)object).v;
          if (object != null)
            object.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener); 
        } 
        return;
      case 0:
        break;
    } 
    object = object;
    ViewTreeObserver viewTreeObserver1 = ((yi)object).z;
    if (viewTreeObserver1 != null) {
      if (!viewTreeObserver1.isAlive())
        ((yi)object).z = touchExplorationStateChangeListener.getViewTreeObserver(); 
      ((yi)object).z.removeGlobalOnLayoutListener(((yi)object).k);
    } 
    touchExplorationStateChangeListener.removeOnAttachStateChangeListener(this);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */