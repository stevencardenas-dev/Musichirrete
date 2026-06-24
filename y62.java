import android.view.View;
import android.view.Window;

public class y62 extends wf2 {
  public final Window s;
  
  public y62(Window paramWindow) {
    this.s = paramWindow;
  }
  
  public final boolean H() {
    return ((this.s.getDecorView().getSystemUiVisibility() & 0x2000) != 0);
  }
  
  public final void b0(boolean paramBoolean) {
    Window window = this.s;
    if (paramBoolean) {
      window.clearFlags(67108864);
      window.addFlags(-2147483648);
      view = window.getDecorView();
      view.setSystemUiVisibility(view.getSystemUiVisibility() | 0x2000);
      return;
    } 
    View view = view.getDecorView();
    view.setSystemUiVisibility(view.getSystemUiVisibility() & 0xFFFFDFFF);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\y62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */