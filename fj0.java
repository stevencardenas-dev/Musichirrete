import android.view.animation.Interpolator;

public final class fj0 implements Interpolator {
  public final int a;
  
  public final float getInterpolation(float paramFloat) {
    switch (this.a) {
      default:
        paramFloat--;
        return paramFloat * paramFloat * paramFloat * paramFloat * paramFloat + 1.0F;
      case 0:
        break;
    } 
    return paramFloat * paramFloat * paramFloat * paramFloat * paramFloat;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fj0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */