import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public final class fx0 extends co0 implements tw0 {
  public static final Method F;
  
  public gh1 E;
  
  static {
    try {
      if (Build.VERSION.SDK_INT <= 28)
        F = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[] { boolean.class }); 
      return;
    } catch (NoSuchMethodException noSuchMethodException) {
      Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
      return;
    } 
  }
  
  public final y10 a(Context paramContext, boolean paramBoolean) {
    ex0 ex0 = new ex0(paramContext, paramBoolean);
    ex0.setHoverListener(this);
    return ex0;
  }
  
  public final void f(rw0 paramrw0, MenuItem paramMenuItem) {
    gh1 gh11 = this.E;
    if (gh11 != null)
      gh11.f(paramrw0, paramMenuItem); 
  }
  
  public final void j(rw0 paramrw0, uw0 paramuw0) {
    gh1 gh11 = this.E;
    if (gh11 != null)
      gh11.j(paramrw0, paramuw0); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fx0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */