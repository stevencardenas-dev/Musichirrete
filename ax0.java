import android.widget.PopupWindow;
import in.krosbits.audio_cutter.TrimActivity;

public final class ax0 implements PopupWindow.OnDismissListener {
  public final int b;
  
  public final Object c;
  
  public final void onDismiss() {
    int i = this.b;
    Object object = this.c;
    switch (i) {
      default:
        if ((k91)((n2)object).g != null)
          object = TrimActivity.m0; 
        return;
      case 0:
        break;
    } 
    ((bx0)object).c();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ax0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */