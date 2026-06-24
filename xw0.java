import android.view.MenuItem;

public final class xw0 implements MenuItem.OnActionExpandListener {
  public final MenuItem.OnActionExpandListener a;
  
  public final yw0 b;
  
  public xw0(yw0 paramyw0, MenuItem.OnActionExpandListener paramOnActionExpandListener) {
    this.b = paramyw0;
    this.a = paramOnActionExpandListener;
  }
  
  public final boolean onMenuItemActionCollapse(MenuItem paramMenuItem) {
    paramMenuItem = this.b.g(paramMenuItem);
    return this.a.onMenuItemActionCollapse(paramMenuItem);
  }
  
  public final boolean onMenuItemActionExpand(MenuItem paramMenuItem) {
    paramMenuItem = this.b.g(paramMenuItem);
    return this.a.onMenuItemActionExpand(paramMenuItem);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xw0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */