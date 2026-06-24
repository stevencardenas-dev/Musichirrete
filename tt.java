import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public abstract class tt extends ws0 {
  public static final int K = 0;
  
  public rt J;
  
  public final Drawable mutate() {
    this.J = new rt(this.J);
    return this;
  }
  
  public final void z(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    RectF rectF = this.J.s;
    if (paramFloat1 != rectF.left || paramFloat2 != rectF.top || paramFloat3 != rectF.right || paramFloat4 != rectF.bottom) {
      rectF.set(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
      invalidateSelf();
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */