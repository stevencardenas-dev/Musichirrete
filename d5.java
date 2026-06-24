import android.animation.ValueAnimator;

public final class d5 {
  public c5 a;
  
  public final f5 b;
  
  public d5(f5 paramf5) {
    this.b = paramf5;
  }
  
  public final boolean a() {
    boolean bool = ValueAnimator.unregisterDurationScaleChangeListener(this.a);
    this.a = null;
    return bool;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */