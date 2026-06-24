import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

public abstract class zw0 implements rm1, hx0, AdapterView.OnItemClickListener {
  public Rect b;
  
  public static int m(ListAdapter paramListAdapter, Context paramContext, int paramInt) {
    byte b = 0;
    int n = View.MeasureSpec.makeMeasureSpec(0, 0);
    int m = View.MeasureSpec.makeMeasureSpec(0, 0);
    int k = paramListAdapter.getCount();
    int i = 0;
    int j = 0;
    FrameLayout frameLayout = null;
    View view = null;
    while (b < k) {
      int i2 = paramListAdapter.getItemViewType(b);
      int i1 = j;
      if (i2 != j) {
        view = null;
        i1 = i2;
      } 
      FrameLayout frameLayout1 = frameLayout;
      if (frameLayout == null)
        frameLayout1 = new FrameLayout(paramContext); 
      view = paramListAdapter.getView(b, view, (ViewGroup)frameLayout1);
      view.measure(n, m);
      i2 = view.getMeasuredWidth();
      if (i2 >= paramInt)
        return paramInt; 
      j = i;
      if (i2 > i)
        j = i2; 
      b++;
      i = j;
      j = i1;
      frameLayout = frameLayout1;
    } 
    return i;
  }
  
  public final boolean c(uw0 paramuw0) {
    return false;
  }
  
  public final boolean f(uw0 paramuw0) {
    return false;
  }
  
  public final void i(Context paramContext, rw0 paramrw0) {}
  
  public abstract void l(rw0 paramrw0);
  
  public abstract void n(View paramView);
  
  public abstract void o(boolean paramBoolean);
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong) {
    ow0 ow0;
    ListAdapter listAdapter = (ListAdapter)paramAdapterView.getAdapter();
    if (listAdapter instanceof HeaderViewListAdapter) {
      ow0 = (ow0)((HeaderViewListAdapter)listAdapter).getWrappedAdapter();
    } else {
      ow0 = (ow0)listAdapter;
    } 
    rw0 rw0 = ow0.b;
    MenuItem menuItem = (MenuItem)listAdapter.getItem(paramInt);
    if (!(this instanceof yi)) {
      paramInt = 0;
    } else {
      paramInt = 4;
    } 
    rw0.q(menuItem, this, paramInt);
  }
  
  public abstract void p(int paramInt);
  
  public abstract void q(int paramInt);
  
  public abstract void r(PopupWindow.OnDismissListener paramOnDismissListener);
  
  public abstract void s(boolean paramBoolean);
  
  public abstract void t(int paramInt);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zw0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */