import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

public final class r52 extends x32 {
  public final int a;
  
  public final t52 b;
  
  public final void a() {
    int i = this.a;
    t52 t521 = this.b;
    switch (i) {
      default:
        t521.G = null;
        t521.r.requestLayout();
        return;
      case 0:
        break;
    } 
    if (t521.C) {
      View view = t521.u;
      if (view != null) {
        view.setTranslationY(0.0F);
        t521.r.setTranslationY(0.0F);
      } 
    } 
    t521.r.setVisibility(8);
    t521.r.setTransitioning(false);
    t521.G = null;
    g7 g7 = t521.y;
    if (g7 != null) {
      g7.D(t521.x);
      t521.x = null;
      t521.y = null;
    } 
    ActionBarOverlayLayout actionBarOverlayLayout = t521.q;
    if (actionBarOverlayLayout != null) {
      WeakHashMap weakHashMap = v22.a;
      actionBarOverlayLayout.requestApplyInsets();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\r52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */