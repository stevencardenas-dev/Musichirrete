import android.graphics.Matrix;
import android.graphics.Path;

public final class cm1 extends dm1 {
  public float b;
  
  public float c;
  
  public final void a(Matrix paramMatrix, Path paramPath) {
    Matrix matrix = this.a;
    paramMatrix.invert(matrix);
    paramPath.transform(matrix);
    paramPath.lineTo(this.b, this.c);
    paramPath.transform(paramMatrix);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cm1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */