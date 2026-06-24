import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Size;
import in.krosbits.nativex.Wv;

public final class xx1 extends pr1 implements ad0 {
  public Object g;
  
  public final Size h;
  
  public final Wv i;
  
  public final by1 j;
  
  public final float k;
  
  public xx1(Size paramSize, Wv paramWv, by1 paramby1, float paramFloat, cs paramcs) {
    super(2, paramcs);
  }
  
  public final Object g(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    paramObject1 = l((cs)paramObject2, paramObject1);
    paramObject2 = l02.a;
    paramObject1.n(paramObject2);
    return paramObject2;
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    by1 by11 = this.j;
    float f = this.k;
    paramcs = new xx1(this.h, this.i, by11, f, paramcs);
    ((xx1)paramcs).g = paramObject;
    return paramcs;
  }
  
  public final Object n(Object paramObject) {
    xs xs = (xs)this.g;
    dd1.r0(paramObject);
    Size size = this.h;
    int i = size.getWidth();
    double[] arrayOfDouble = new double[i];
    by1 by11 = this.j;
    long l = by11.b.c.g;
    double d1 = this.i.b(arrayOfDouble, l);
    wf2.q(xs);
    paramObject = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ALPHA_8);
    paramObject.getClass();
    Canvas canvas = new Canvas((Bitmap)paramObject);
    Paint paint = new Paint();
    paint.setColor(-1);
    double d2 = paramObject.getHeight() / 2.0D;
    float f2 = size.getHeight();
    float f1 = this.k;
    for (byte b = 0; b < i; b++) {
      double d4 = arrayOfDouble[b] / d1;
      double d3 = (f2 - f1 * 16.0F);
      float f = b;
      d3 = d4 * d3 / 2.0D;
      canvas.drawLine(f, (float)(d2 - d3), f, (float)(d2 + d3), paint);
    } 
    ip1 ip1 = by11.c;
    while (true) {
      Object object = ip1.f();
      if (ip1.e(object, cy1.a((cy1)object, null, 0.0F, 0.0F, 0.0F, null, 0.0F, null, null, null, null, null, null, null, null, null, null, null, (Bitmap)paramObject, 1048575)))
        return l02.a; 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xx1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */