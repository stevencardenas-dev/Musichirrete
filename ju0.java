import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public final class ju0 extends Animation {
  public final int b;
  
  public final int c;
  
  public final View e;
  
  public ju0(View paramView, int paramInt1, int paramInt2) {}
  
  public final void applyTransformation(float paramFloat, Transformation paramTransformation) {
    int j = this.c;
    int i = this.b;
    j = (int)((i - j) * paramFloat);
    qu0.o(this.e, i - j);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ju0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */