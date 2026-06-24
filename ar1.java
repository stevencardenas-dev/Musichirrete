import android.view.MenuItem;
import java.lang.reflect.Method;

public final class ar1 implements MenuItem.OnMenuItemClickListener {
  public static final Class[] f = new Class[] { MenuItem.class };
  
  public final int b;
  
  public Object c;
  
  public Object e;
  
  public ar1(yw0 paramyw0, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener) {
    this.e = paramyw0;
    this.c = paramOnMenuItemClickListener;
  }
  
  public final boolean onMenuItemClick(MenuItem paramMenuItem) {
    boolean bool;
    switch (this.b) {
      default:
        return ((MenuItem.OnMenuItemClickListener)this.c).onMenuItemClick(((yw0)this.e).g(paramMenuItem));
      case 0:
        break;
    } 
    Object object = this.c;
    Method method = (Method)this.e;
    try {
      if (method.getReturnType() == boolean.class) {
        bool = ((Boolean)method.invoke(object, new Object[] { paramMenuItem })).booleanValue();
      } else {
        method.invoke(object, new Object[] { paramMenuItem });
        bool = true;
      } 
    } catch (Exception exception) {
      k91.n(exception);
      bool = false;
    } 
    return bool;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ar1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */