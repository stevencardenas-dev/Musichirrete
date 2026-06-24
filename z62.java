import android.view.View;
import android.view.Window;

public final class z62 extends y62 {
  public final void a0(boolean paramBoolean) {
    Window window = this.s;
    if (paramBoolean) {
      window.clearFlags(134217728);
      window.addFlags(-2147483648);
      view = window.getDecorView();
      view.setSystemUiVisibility(view.getSystemUiVisibility() | 0x10);
      return;
    } 
    View view = view.getDecorView();
    view.setSystemUiVisibility(view.getSystemUiVisibility() & 0xFFFFFFEF);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\z62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */