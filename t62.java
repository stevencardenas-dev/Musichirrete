import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

public final class t62 extends s62 {
  public t62(x62 paramx62, WindowInsets paramWindowInsets) {
    super(paramx62, paramWindowInsets);
  }
  
  public List<Rect> e(int paramInt) {
    return this.c.getBoundingRects(w62.a(paramInt));
  }
  
  public List<Rect> f(int paramInt) {
    return this.c.getBoundingRectsIgnoringVisibility(w62.a(paramInt));
  }
  
  public void p() {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */