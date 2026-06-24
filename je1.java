import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

public class je1 extends k0 {
  public final RecyclerView d;
  
  public final ie1 e;
  
  public je1(RecyclerView paramRecyclerView) {
    this.d = paramRecyclerView;
    k0 k01 = j();
    if (k01 != null && k01 instanceof ie1) {
      this.e = (ie1)k01;
      return;
    } 
    this.e = new ie1(this);
  }
  
  public final void c(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    super.c(paramView, paramAccessibilityEvent);
    if (paramView instanceof RecyclerView && !this.d.Q()) {
      RecyclerView recyclerView = (RecyclerView)paramView;
      if (recyclerView.getLayoutManager() != null)
        recyclerView.getLayoutManager().g0(paramAccessibilityEvent); 
    } 
  }
  
  public final void d(View paramView, t0 paramt0) {
    this.a.onInitializeAccessibilityNodeInfo(paramView, paramt0.a);
    RecyclerView recyclerView = this.d;
    if (!recyclerView.Q() && recyclerView.getLayoutManager() != null) {
      a a = recyclerView.getLayoutManager();
      RecyclerView recyclerView1 = a.c;
      a.h0(recyclerView1.e, recyclerView1.j0, paramt0);
    } 
  }
  
  public final boolean g(View paramView, int paramInt, Bundle paramBundle) {
    if (super.g(paramView, paramInt, paramBundle))
      return true; 
    RecyclerView recyclerView = this.d;
    return (!recyclerView.Q() && recyclerView.getLayoutManager() != null) ? recyclerView.getLayoutManager().v0(paramInt, paramBundle) : false;
  }
  
  public k0 j() {
    return this.e;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\je1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */