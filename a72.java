import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

public class a72 extends wf2 {
  public final WindowInsetsController s;
  
  public final Window t;
  
  public a72(Window paramWindow) {
    this.s = windowInsetsController;
    this.t = paramWindow;
  }
  
  public boolean H() {
    Window window = this.t;
    if (window != null) {
      if ((window.getDecorView().getSystemUiVisibility() & 0x2000) != 0)
        return true; 
    } else {
      this.s.setSystemBarsAppearance(0, 0);
      if ((this.s.getSystemBarsAppearance() & 0x8) != 0)
        return true; 
    } 
    return false;
  }
  
  public final void L0(int paramInt1, int paramInt2, boolean paramBoolean) {
    Window window = this.t;
    if (window != null) {
      if (paramBoolean) {
        view = window.getDecorView();
        view.setSystemUiVisibility(paramInt1 | view.getSystemUiVisibility());
        return;
      } 
      View view = view.getDecorView();
      view.setSystemUiVisibility((paramInt1 ^ 0xFFFFFFFF) & view.getSystemUiVisibility());
      return;
    } 
    WindowInsetsController windowInsetsController = this.s;
    if (paramBoolean) {
      windowInsetsController.setSystemBarsAppearance(paramInt2, paramInt2);
      return;
    } 
    windowInsetsController.setSystemBarsAppearance(0, paramInt2);
  }
  
  public void a0(boolean paramBoolean) {
    L0(16, 16, paramBoolean);
  }
  
  public void b0(boolean paramBoolean) {
    L0(8192, 8, paramBoolean);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\a72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */