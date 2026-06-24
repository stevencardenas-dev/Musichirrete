import android.view.KeyEvent;
import in.krosbits.musicolet.MusicActivity;
import in.krosbits.musicolet.WidgetPrefActivity;

public final class az0 implements ts1 {
  public final int a;
  
  public final KeyEvent.Callback b;
  
  private final void c(ws1 paramws1) {}
  
  private final void d(ws1 paramws1) {}
  
  private final void e(ws1 paramws1) {}
  
  public final void a(ws1 paramws1) {
    switch (this.a) {
      default:
        return;
      case 0:
        break;
    } 
    try {
      ua0 ua0 = ((MusicActivity)this.b).h0.h(paramws1.e);
    } finally {
      paramws1 = null;
    } 
  }
  
  public final void b(ws1 paramws1) {
    WidgetPrefActivity widgetPrefActivity;
    l3 l3;
    int i = this.a;
    KeyEvent.Callback callback = this.b;
    switch (i) {
      default:
        widgetPrefActivity = (WidgetPrefActivity)callback;
        l3 = WidgetPrefActivity.O0;
        widgetPrefActivity.l0();
        widgetPrefActivity.q0.postDelayed(new xt0(29, this), 150L);
        return;
      case 1:
        ((t32)l3).setCurrentItem(((ws1)widgetPrefActivity).e);
        break;
      case 0:
        break;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\az0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */