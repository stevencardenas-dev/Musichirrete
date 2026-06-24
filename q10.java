import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;

public abstract class q10 {
  public final jn0 a;
  
  public final Path b;
  
  public final Path c;
  
  public final PathMeasure d;
  
  public final Matrix e;
  
  public q10(jn0 paramjn0) {
    Path path = new Path();
    this.b = path;
    this.c = new Path();
    this.d = new PathMeasure(path, false);
    this.a = paramjn0;
    this.e = new Matrix();
  }
  
  public static float d(float[] paramArrayOffloat) {
    return (float)Math.toDegrees(Math.atan2(paramArrayOffloat[1], paramArrayOffloat[0]));
  }
  
  public abstract int a();
  
  public abstract void b();
  
  public final void c(Canvas paramCanvas, Rect paramRect, float paramFloat, boolean paramBoolean1, boolean paramBoolean2) {
    this.a.d();
    zm0 zm0 = (zm0)this;
    if (zm0.f != paramRect.width()) {
      zm0.f = paramRect.width();
      zm0.b();
    } 
    float f1 = zm0.a();
    float f4 = paramRect.left;
    float f5 = paramRect.width() / 2.0F;
    float f2 = paramRect.top;
    float f3 = paramRect.height() / 2.0F;
    paramCanvas.translate(f5 + f4, Math.max(0.0F, (paramRect.height() - f1) / 2.0F) + f3 + f2);
    jn0 jn01 = zm0.a;
    if (jn01.q)
      paramCanvas.scale(-1.0F, 1.0F); 
    f2 = zm0.f / 2.0F;
    f1 /= 2.0F;
    paramCanvas.clipRect(-f2, -f1, f2, f1);
    int i = jn01.a;
    zm0.g = i * paramFloat;
    zm0.h = Math.min(i / 2, jn01.a()) * paramFloat;
    zm0.j = jn01.l * paramFloat;
    zm0.i = Math.min(jn01.a / 2.0F, jn01.b()) * paramFloat;
    if (paramBoolean1 || paramBoolean2) {
      if ((paramBoolean1 && jn01.g == 2) || (paramBoolean2 && jn01.h == 1))
        paramCanvas.scale(1.0F, -1.0F); 
      if (paramBoolean1 || (paramBoolean2 && jn01.h != 3))
        paramCanvas.translate(0.0F, (1.0F - paramFloat) * jn01.a / 2.0F); 
    } 
    if (paramBoolean2 && jn01.h == 3) {
      zm0.n = paramFloat;
      return;
    } 
    zm0.n = 1.0F;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */