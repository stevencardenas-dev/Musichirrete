import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

public final class ie1 extends k0 {
  public final je1 d;
  
  public final WeakHashMap e = new WeakHashMap<Object, Object>();
  
  public ie1(je1 paramje1) {
    this.d = paramje1;
  }
  
  public final boolean a(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    k0 k01 = (k0)this.e.get(paramView);
    return (k01 != null) ? k01.a(paramView, paramAccessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public final gh1 b(View paramView) {
    k0 k01 = (k0)this.e.get(paramView);
    return (k01 != null) ? k01.b(paramView) : super.b(paramView);
  }
  
  public final void c(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    k0 k01 = (k0)this.e.get(paramView);
    if (k01 != null) {
      k01.c(paramView, paramAccessibilityEvent);
      return;
    } 
    super.c(paramView, paramAccessibilityEvent);
  }
  
  public final void d(View paramView, t0 paramt0) {
    AccessibilityNodeInfo accessibilityNodeInfo = paramt0.a;
    je1 je11 = this.d;
    RecyclerView recyclerView1 = je11.d;
    RecyclerView recyclerView2 = je11.d;
    boolean bool = recyclerView1.Q();
    View.AccessibilityDelegate accessibilityDelegate = this.a;
    if (!bool && recyclerView2.getLayoutManager() != null) {
      recyclerView2.getLayoutManager().j0(paramView, paramt0);
      k0 k01 = (k0)this.e.get(paramView);
      if (k01 != null) {
        k01.d(paramView, paramt0);
        return;
      } 
      accessibilityDelegate.onInitializeAccessibilityNodeInfo(paramView, accessibilityNodeInfo);
      return;
    } 
    accessibilityDelegate.onInitializeAccessibilityNodeInfo(paramView, accessibilityNodeInfo);
  }
  
  public final void e(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    k0 k01 = (k0)this.e.get(paramView);
    if (k01 != null) {
      k01.e(paramView, paramAccessibilityEvent);
      return;
    } 
    super.e(paramView, paramAccessibilityEvent);
  }
  
  public final boolean f(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent) {
    k0 k01 = (k0)this.e.get(paramViewGroup);
    return (k01 != null) ? k01.f(paramViewGroup, paramView, paramAccessibilityEvent) : this.a.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public final boolean g(View paramView, int paramInt, Bundle paramBundle) {
    yd1 yd1;
    je1 je11 = this.d;
    RecyclerView recyclerView1 = je11.d;
    RecyclerView recyclerView2 = je11.d;
    if (!recyclerView1.Q() && recyclerView2.getLayoutManager() != null) {
      k0 k01 = (k0)this.e.get(paramView);
      if ((k01 != null) ? k01.g(paramView, paramInt, paramBundle) : super.g(paramView, paramInt, paramBundle))
        return true; 
      yd1 = (recyclerView2.getLayoutManager()).c.e;
      return false;
    } 
    return super.g((View)yd1, paramInt, paramBundle);
  }
  
  public final void h(View paramView, int paramInt) {
    k0 k01 = (k0)this.e.get(paramView);
    if (k01 != null) {
      k01.h(paramView, paramInt);
      return;
    } 
    super.h(paramView, paramInt);
  }
  
  public final void i(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    k0 k01 = (k0)this.e.get(paramView);
    if (k01 != null) {
      k01.i(paramView, paramAccessibilityEvent);
      return;
    } 
    super.i(paramView, paramAccessibilityEvent);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ie1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */