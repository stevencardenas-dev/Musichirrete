import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

public final class bm1 extends dm1 {
  public static final RectF h = new RectF();
  
  public final float b;
  
  public final float c;
  
  public final float d;
  
  public final float e;
  
  public float f;
  
  public float g;
  
  public bm1(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.b = paramFloat1;
    this.c = paramFloat2;
    this.d = paramFloat3;
    this.e = paramFloat4;
  }
  
  public final void a(Matrix paramMatrix, Path paramPath) {
    Matrix matrix = this.a;
    paramMatrix.invert(matrix);
    paramPath.transform(matrix);
    float f1 = this.d;
    float f2 = this.e;
    RectF rectF = h;
    rectF.set(this.b, this.c, f1, f2);
    paramPath.arcTo(rectF, this.f, this.g, false);
    paramPath.transform(paramMatrix);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bm1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */