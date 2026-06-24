import android.os.Build;
import android.view.animation.Interpolator;

public final class d62 {
  public c62 a;
  
  public d62(int paramInt, Interpolator paramInterpolator, long paramLong) {
    if (Build.VERSION.SDK_INT >= 30) {
      this.a = new b62(z52.b(paramInt, paramInterpolator, paramLong));
      return;
    } 
    this.a = new c62(paramInt, paramInterpolator, paramLong);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */