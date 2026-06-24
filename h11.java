import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

public final class h11 extends k0 {
  public final int d;
  
  public void c(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    boolean bool;
    switch (this.d) {
      default:
        super.c(paramView, paramAccessibilityEvent);
        return;
      case 0:
        break;
    } 
    super.c(paramView, paramAccessibilityEvent);
    NestedScrollView nestedScrollView = (NestedScrollView)paramView;
    paramAccessibilityEvent.setClassName(ScrollView.class.getName());
    if (nestedScrollView.getScrollRange() > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    paramAccessibilityEvent.setScrollable(bool);
    paramAccessibilityEvent.setScrollX(nestedScrollView.getScrollX());
    paramAccessibilityEvent.setScrollY(nestedScrollView.getScrollY());
    paramAccessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
    paramAccessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
  }
  
  public final void d(View paramView, t0 paramt0) {
    AccessibilityNodeInfo accessibilityNodeInfo;
    int i = this.d;
    View.AccessibilityDelegate accessibilityDelegate = this.a;
    switch (i) {
      default:
        accessibilityNodeInfo = paramt0.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(paramView, accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(false);
        return;
      case 0:
        break;
    } 
    accessibilityDelegate.onInitializeAccessibilityNodeInfo(paramView, ((t0)accessibilityNodeInfo).a);
    NestedScrollView nestedScrollView = (NestedScrollView)paramView;
    accessibilityNodeInfo.i("android.widget.ScrollView");
    if (nestedScrollView.isEnabled()) {
      i = nestedScrollView.getScrollRange();
      if (i > 0) {
        accessibilityNodeInfo.o(true);
        if (nestedScrollView.getScrollY() > 0) {
          accessibilityNodeInfo.b(m0.g);
          accessibilityNodeInfo.b(m0.l);
        } 
        if (nestedScrollView.getScrollY() < i) {
          accessibilityNodeInfo.b(m0.f);
          accessibilityNodeInfo.b(m0.m);
        } 
      } 
    } 
  }
  
  public boolean g(View paramView, int paramInt, Bundle paramBundle) {
    switch (this.d) {
      default:
        return super.g(paramView, paramInt, paramBundle);
      case 0:
        break;
    } 
    boolean bool1 = super.g(paramView, paramInt, paramBundle);
    boolean bool = true;
    if (bool1)
      return bool; 
    NestedScrollView nestedScrollView = (NestedScrollView)paramView;
    if (nestedScrollView.isEnabled()) {
      int j = nestedScrollView.getHeight();
      Rect rect = new Rect();
      int i = j;
      if (nestedScrollView.getMatrix().isIdentity()) {
        i = j;
        if (nestedScrollView.getGlobalVisibleRect(rect))
          i = rect.height(); 
      } 
      if (paramInt != 4096)
        if (paramInt != 8192 && paramInt != 16908344) {
          if (paramInt != 16908346)
            bool = false; 
        } else {
          paramInt = nestedScrollView.getPaddingBottom();
          j = nestedScrollView.getPaddingTop();
          paramInt = Math.max(nestedScrollView.getScrollY() - i - paramInt - j, 0);
          if (paramInt != nestedScrollView.getScrollY()) {
            nestedScrollView.u(0 - nestedScrollView.getScrollX(), paramInt - nestedScrollView.getScrollY(), true);
            return bool;
          } 
          bool = false;
        }  
      paramInt = nestedScrollView.getPaddingBottom();
      j = nestedScrollView.getPaddingTop();
      paramInt = Math.min(nestedScrollView.getScrollY() + i - paramInt - j, nestedScrollView.getScrollRange());
      if (paramInt != nestedScrollView.getScrollY()) {
        nestedScrollView.u(0 - nestedScrollView.getScrollX(), paramInt - nestedScrollView.getScrollY(), true);
        return bool;
      } 
    } 
    bool = false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\h11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */