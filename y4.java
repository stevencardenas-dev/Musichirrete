import android.graphics.drawable.Drawable;

public final class y4 implements Drawable.Callback {
  public final b5 b;
  
  public y4(b5 paramb5) {
    this.b = paramb5;
  }
  
  public final void invalidateDrawable(Drawable paramDrawable) {
    this.b.invalidateSelf();
  }
  
  public final void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong) {
    this.b.scheduleSelf(paramRunnable, paramLong);
  }
  
  public final void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable) {
    this.b.unscheduleSelf(paramRunnable);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\y4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */