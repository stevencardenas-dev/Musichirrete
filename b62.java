import android.view.View;
import android.view.WindowInsetsAnimation;

public final class b62 extends c62 {
  public final WindowInsetsAnimation e;
  
  public b62(WindowInsetsAnimation paramWindowInsetsAnimation) {
    super(0, null, 0L);
    this.e = paramWindowInsetsAnimation;
  }
  
  public static fi0 f(WindowInsetsAnimation.Bounds paramBounds) {
    return fi0.d(paramBounds.getUpperBound());
  }
  
  public static fi0 g(WindowInsetsAnimation.Bounds paramBounds) {
    return fi0.d(paramBounds.getLowerBound());
  }
  
  public static void h(View paramView, hd paramhd) {
    paramView.setWindowInsetsAnimationCallback(new a62(paramhd));
  }
  
  public final float a() {
    return this.e.getAlpha();
  }
  
  public final long b() {
    return this.e.getDurationMillis();
  }
  
  public final float c() {
    return this.e.getInterpolatedFraction();
  }
  
  public final int d() {
    return this.e.getTypeMask();
  }
  
  public final void e(float paramFloat) {
    this.e.setFraction(paramFloat);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */