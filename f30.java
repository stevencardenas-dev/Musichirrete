import android.os.Build;
import android.view.View;
import android.view.Window;

public class f30 extends e30 {
  public void b(hs1 paramhs11, hs1 paramhs12, Window paramWindow, View paramView, boolean paramBoolean1, boolean paramBoolean2) {
    y62 y62;
    paramhs11.getClass();
    paramhs12.getClass();
    paramWindow.getClass();
    paramView.getClass();
    boolean bool = false;
    qz1.P(paramWindow, false);
    paramWindow.setStatusBarColor(paramhs11.a(paramBoolean1));
    paramWindow.setNavigationBarColor(paramhs12.a(paramBoolean2));
    paramWindow.setStatusBarContrastEnforced(false);
    if (paramhs12.b == 0)
      bool = true; 
    paramWindow.setNavigationBarContrastEnforced(bool);
    int i = Build.VERSION.SDK_INT;
    if (i >= 35) {
      a72 a72 = new a72(paramWindow);
    } else if (i >= 30) {
      a72 a72 = new a72(paramWindow);
    } else if (i >= 26) {
      y62 = new y62(paramWindow);
    } else {
      y62 = new y62(paramWindow);
    } 
    y62.b0(paramBoolean1 ^ true);
    y62.a0(paramBoolean2 ^ true);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\f30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */