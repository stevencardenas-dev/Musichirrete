import android.view.animation.Interpolator;

public abstract class c62 {
  public final int a;
  
  public float b;
  
  public final Interpolator c;
  
  public final long d;
  
  public c62(int paramInt, Interpolator paramInterpolator, long paramLong) {
    this.a = paramInt;
    this.c = paramInterpolator;
    this.d = paramLong;
  }
  
  public float a() {
    return 1.0F;
  }
  
  public long b() {
    return this.d;
  }
  
  public float c() {
    float f = this.b;
    Interpolator interpolator = this.c;
    return (interpolator != null) ? interpolator.getInterpolation(f) : f;
  }
  
  public int d() {
    return this.a;
  }
  
  public void e(float paramFloat) {
    this.b = paramFloat;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */