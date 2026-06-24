import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public abstract class g5 {
  public static final LinearInterpolator a = new LinearInterpolator();
  
  public static final o70 b = new o70(1);
  
  public static final o70 c = new o70(0);
  
  public static final o70 d = new o70(o70.e);
  
  public static final DecelerateInterpolator e = new DecelerateInterpolator();
  
  public static float a(float paramFloat1, float paramFloat2, float paramFloat3) {
    return x41.e(paramFloat2, paramFloat1, paramFloat3, paramFloat1);
  }
  
  public static float b(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5) {
    return (paramFloat5 <= paramFloat3) ? paramFloat1 : ((paramFloat5 >= paramFloat4) ? paramFloat2 : a(paramFloat1, paramFloat2, (paramFloat5 - paramFloat3) / (paramFloat4 - paramFloat3)));
  }
  
  public static int c(float paramFloat, int paramInt1, int paramInt2) {
    return Math.round(paramFloat * (paramInt2 - paramInt1)) + paramInt1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\g5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */