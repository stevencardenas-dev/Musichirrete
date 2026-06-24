import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public final class rt extends us0 {
  public final RectF s;
  
  public rt(rt paramrt) {
    super(paramrt);
    this.s = paramrt.s;
  }
  
  public rt(vl1 paramvl1, RectF paramRectF) {
    super(paramvl1);
    this.s = paramRectF;
  }
  
  public final Drawable newDrawable() {
    ws0 ws0 = new ws0(this);
    ((tt)ws0).J = this;
    ws0.invalidateSelf();
    return ws0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */