import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

public final class st extends tt {
  public final void e(Canvas paramCanvas) {
    if (this.J.s.isEmpty()) {
      super.e(paramCanvas);
      return;
    } 
    paramCanvas.save();
    int i = Build.VERSION.SDK_INT;
    rt rt = this.J;
    if (i >= 26) {
      paramCanvas.clipOutRect(rt.s);
    } else {
      paramCanvas.clipRect(rt.s, Region.Op.DIFFERENCE);
    } 
    super.e(paramCanvas);
    paramCanvas.restore();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\st.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */