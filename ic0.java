import android.view.ScaleGestureDetector;

public final class ic0 implements ScaleGestureDetector.OnScaleGestureListener {
  public final jc0 a;
  
  public ic0(jc0 paramjc0) {
    this.a = paramjc0;
  }
  
  public final boolean onScale(ScaleGestureDetector paramScaleGestureDetector) {
    float f = paramScaleGestureDetector.getScaleFactor();
    if (Float.isNaN(f) || Float.isInfinite(f))
      return false; 
    this.a.a.l(f, paramScaleGestureDetector.getFocusX(), paramScaleGestureDetector.getFocusY());
    return true;
  }
  
  public final boolean onScaleBegin(ScaleGestureDetector paramScaleGestureDetector) {
    return true;
  }
  
  public final void onScaleEnd(ScaleGestureDetector paramScaleGestureDetector) {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ic0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */