import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class hs implements ViewGroup.OnHierarchyChangeListener {
  public final CoordinatorLayout b;
  
  public hs(CoordinatorLayout paramCoordinatorLayout) {
    this.b = paramCoordinatorLayout;
  }
  
  public final void onChildViewAdded(View paramView1, View paramView2) {
    ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.b.s;
    if (onHierarchyChangeListener != null)
      onHierarchyChangeListener.onChildViewAdded(paramView1, paramView2); 
  }
  
  public final void onChildViewRemoved(View paramView1, View paramView2) {
    CoordinatorLayout coordinatorLayout = this.b;
    coordinatorLayout.q(2);
    ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.s;
    if (onHierarchyChangeListener != null)
      onHierarchyChangeListener.onChildViewRemoved(paramView1, paramView2); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */