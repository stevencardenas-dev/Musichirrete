import android.view.WindowInsetsController;

public final class c72 extends b72 {
  public final boolean H() {
    return ((this.s.getSystemBarsAppearance() & 0x8) != 0);
  }
  
  public final void a0(boolean paramBoolean) {
    boolean bool;
    WindowInsetsController windowInsetsController = this.s;
    if (paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    windowInsetsController.setSystemBarsAppearance(bool, 16);
  }
  
  public final void b0(boolean paramBoolean) {
    boolean bool;
    WindowInsetsController windowInsetsController = this.s;
    if (paramBoolean) {
      bool = true;
    } else {
      bool = false;
    } 
    windowInsetsController.setSystemBarsAppearance(bool, 8);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c72.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */