import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

public final class zl1 extends em1 {
  public final bm1 c;
  
  public zl1(bm1 parambm1) {
    this.c = parambm1;
  }
  
  public final void a(Matrix paramMatrix, tl1 paramtl1, int paramInt, Canvas paramCanvas) {
    boolean bool;
    bm1 bm11 = this.c;
    float f2 = bm11.f;
    float f1 = bm11.g;
    RectF rectF = new RectF(bm11.b, bm11.c, bm11.d, bm11.e);
    Paint paint = paramtl1.b;
    if (f1 < 0.0F) {
      bool = true;
    } else {
      bool = false;
    } 
    Path path = paramtl1.g;
    int[] arrayOfInt = tl1.k;
    if (bool) {
      arrayOfInt[0] = 0;
      arrayOfInt[1] = paramtl1.f;
      arrayOfInt[2] = paramtl1.e;
      arrayOfInt[3] = paramtl1.d;
    } else {
      path.rewind();
      path.moveTo(rectF.centerX(), rectF.centerY());
      path.arcTo(rectF, f2, f1);
      path.close();
      float f = -paramInt;
      rectF.inset(f, f);
      arrayOfInt[0] = 0;
      arrayOfInt[1] = paramtl1.d;
      arrayOfInt[2] = paramtl1.e;
      arrayOfInt[3] = paramtl1.f;
    } 
    float f4 = rectF.width() / 2.0F;
    if (f4 <= 0.0F)
      return; 
    float f5 = 1.0F - paramInt / f4;
    float f3 = (1.0F - f5) / 2.0F;
    float[] arrayOfFloat = tl1.l;
    arrayOfFloat[1] = f5;
    arrayOfFloat[2] = f3 + f5;
    paint.setShader((Shader)new RadialGradient(rectF.centerX(), rectF.centerY(), f4, arrayOfInt, arrayOfFloat, Shader.TileMode.CLAMP));
    paramCanvas.save();
    paramCanvas.concat(paramMatrix);
    paramCanvas.scale(1.0F, rectF.height() / rectF.width());
    if (!bool) {
      paramCanvas.clipPath(path, Region.Op.DIFFERENCE);
      paramCanvas.drawPath(path, paramtl1.h);
    } 
    paramCanvas.drawArc(rectF, f2, f1, true, paint);
    paramCanvas.restore();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zl1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */