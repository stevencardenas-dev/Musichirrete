import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

public final class kt extends DataSetObserver {
  public final int a;
  
  public final Object b;
  
  public final void onChanged() {
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        ((t32)object).f();
        return;
      case 2:
        ((TabLayout)object).j();
        return;
      case 1:
        object = object;
        if (((co0)object).B.isShowing())
          object.d(); 
        return;
      case 0:
        break;
    } 
    object = object;
    ((lt)object).b = true;
    object.notifyDataSetChanged();
  }
  
  public final void onInvalidated() {
    int i = this.a;
    Object object = this.b;
    switch (i) {
      default:
        ((t32)object).f();
        return;
      case 2:
        ((TabLayout)object).j();
        return;
      case 1:
        ((co0)object).dismiss();
        return;
      case 0:
        break;
    } 
    object = object;
    ((lt)object).b = false;
    object.notifyDataSetInvalidated();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */