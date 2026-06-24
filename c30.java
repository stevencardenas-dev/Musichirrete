import android.os.Build;
import android.view.View;
import android.view.Window;

public final class c30 extends i30 {
  public void b(hs1 paramhs11, hs1 paramhs12, Window paramWindow, View paramView, boolean paramBoolean1, boolean paramBoolean2) {
    y62 y62;
    paramhs11.getClass();
    paramhs12.getClass();
    paramWindow.getClass();
    paramView.getClass();
    int i = 0;
    qz1.P(paramWindow, false);
    if (paramBoolean1)
      i = paramhs11.a; 
    paramWindow.setStatusBarColor(i);
    paramWindow.setNavigationBarColor(paramhs12.a);
    i = Build.VERSION.SDK_INT;
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
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */