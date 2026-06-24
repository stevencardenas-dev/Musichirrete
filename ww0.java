import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

public final class ww0 extends FrameLayout implements fm {
  public final CollapsibleActionView b;
  
  public ww0(View paramView) {
    super(paramView.getContext());
    this.b = (CollapsibleActionView)paramView;
    addView(paramView);
  }
  
  public final void onActionViewCollapsed() {
    this.b.onActionViewCollapsed();
  }
  
  public final void onActionViewExpanded() {
    this.b.onActionViewExpanded();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ww0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */