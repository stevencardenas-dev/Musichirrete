import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

public final class am1 extends em1 {
  public final cm1 c;
  
  public final float d;
  
  public final float e;
  
  public am1(cm1 paramcm1, float paramFloat1, float paramFloat2) {
    this.c = paramcm1;
    this.d = paramFloat1;
    this.e = paramFloat2;
  }
  
  public final void a(Matrix paramMatrix, tl1 paramtl1, int paramInt, Canvas paramCanvas) {
    cm1 cm11 = this.c;
    float f2 = cm11.c;
    float f3 = this.e;
    float f1 = cm11.b;
    float f4 = this.d;
    RectF rectF = new RectF(0.0F, 0.0F, (float)Math.hypot((f2 - f3), (f1 - f4)), 0.0F);
    Matrix matrix = this.a;
    matrix.set(paramMatrix);
    matrix.preTranslate(f4, f3);
    matrix.preRotate(b());
    paramtl1.getClass();
    rectF.bottom += paramInt;
    rectF.offset(0.0F, -paramInt);
    paramInt = paramtl1.f;
    int[] arrayOfInt = tl1.i;
    arrayOfInt[0] = paramInt;
    arrayOfInt[1] = paramtl1.e;
    arrayOfInt[2] = paramtl1.d;
    Paint paint = paramtl1.c;
    f1 = rectF.left;
    paint.setShader((Shader)new LinearGradient(f1, rectF.top, f1, rectF.bottom, arrayOfInt, tl1.j, Shader.TileMode.CLAMP));
    paramCanvas.save();
    paramCanvas.concat(matrix);
    paramCanvas.drawRect(rectF, paint);
    paramCanvas.restore();
  }
  
  public final float b() {
    cm1 cm11 = this.c;
    return (float)Math.toDegrees(Math.atan(((cm11.c - this.e) / (cm11.b - this.d))));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\am1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */