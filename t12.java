import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

public final class t12 {
  public static final Matrix p = new Matrix();
  
  public final Path a;
  
  public final Path b;
  
  public final Matrix c = new Matrix();
  
  public Paint d;
  
  public Paint e;
  
  public PathMeasure f;
  
  public final q12 g;
  
  public float h = 0.0F;
  
  public float i = 0.0F;
  
  public float j = 0.0F;
  
  public float k = 0.0F;
  
  public int l = 255;
  
  public String m = null;
  
  public Boolean n = null;
  
  public final b9 o;
  
  public t12() {
    this.o = (b9)new zm1(0);
    this.g = new q12();
    this.a = new Path();
    this.b = new Path();
  }
  
  public t12(t12 paramt12) {
    zm1 zm1 = new zm1(0);
    this.o = (b9)zm1;
    this.g = new q12(paramt12.g, (b9)zm1);
    this.a = new Path(paramt12.a);
    this.b = new Path(paramt12.b);
    this.h = paramt12.h;
    this.i = paramt12.i;
    this.j = paramt12.j;
    this.k = paramt12.k;
    this.l = paramt12.l;
    this.m = paramt12.m;
    String str = paramt12.m;
    if (str != null)
      zm1.put(str, this); 
    this.n = paramt12.n;
  }
  
  public final void a(q12 paramq12, Matrix paramMatrix, Canvas paramCanvas, int paramInt1, int paramInt2) {
    Matrix matrix = paramq12.a;
    ArrayList<r12> arrayList = paramq12.b;
    matrix.set(paramMatrix);
    paramMatrix = paramq12.a;
    paramMatrix.preConcat(paramq12.j);
    paramCanvas.save();
    for (byte b = 0; b < arrayList.size(); b++) {
      r12 r12 = arrayList.get(b);
      if (r12 instanceof q12) {
        a((q12)r12, paramMatrix, paramCanvas, paramInt1, paramInt2);
      } else if (r12 instanceof s12) {
        r12 = r12;
        float f1 = paramInt1 / this.j;
        float f3 = paramInt2 / this.k;
        float f2 = Math.min(f1, f3);
        matrix = this.c;
        matrix.set(paramMatrix);
        matrix.postScale(f1, f3);
        float[] arrayOfFloat = new float[4];
        arrayOfFloat[0] = 0.0F;
        arrayOfFloat[1] = 1.0F;
        arrayOfFloat[2] = 1.0F;
        arrayOfFloat[3] = 0.0F;
        paramMatrix.mapVectors(arrayOfFloat);
        float f7 = (float)Math.hypot(arrayOfFloat[0], arrayOfFloat[1]);
        float f6 = (float)Math.hypot(arrayOfFloat[2], arrayOfFloat[3]);
        f1 = arrayOfFloat[0];
        float f4 = arrayOfFloat[1];
        float f5 = arrayOfFloat[2];
        f3 = arrayOfFloat[3];
        f6 = Math.max(f7, f6);
        if (f6 > 0.0F) {
          f1 = Math.abs(f1 * f3 - f4 * f5) / f6;
        } else {
          f1 = 0.0F;
        } 
        if (f1 != 0.0F) {
          Path.FillType fillType;
          Path path2 = this.a;
          path2.reset();
          e61[] arrayOfE61 = ((s12)r12).a;
          if (arrayOfE61 != null)
            e61.b(arrayOfE61, path2); 
          Path path1 = this.b;
          path1.reset();
          if (r12 instanceof o12) {
            if (((s12)r12).c == 0) {
              fillType = Path.FillType.WINDING;
            } else {
              fillType = Path.FillType.EVEN_ODD;
            } 
            path1.setFillType(fillType);
            path1.addPath(path2, matrix);
            paramCanvas.clipPath(path1);
          } else {
            p12 p12 = (p12)fillType;
            f5 = p12.i;
            if (f5 != 0.0F || p12.j != 1.0F) {
              f4 = p12.k;
              f6 = p12.j;
              if (this.f == null)
                this.f = new PathMeasure(); 
              this.f.setPath(path2, false);
              f3 = this.f.getLength();
              f5 = (f5 + f4) % 1.0F * f3;
              f4 = (f6 + f4) % 1.0F * f3;
              path2.reset();
              PathMeasure pathMeasure = this.f;
              if (f5 > f4) {
                pathMeasure.getSegment(f5, f3, path2, true);
                this.f.getSegment(0.0F, f4, path2, true);
              } else {
                pathMeasure.getSegment(f5, f4, path2, true);
              } 
              path2.rLineTo(0.0F, 0.0F);
            } 
            path1.addPath(path2, matrix);
            d7 d7 = p12.f;
            if ((Shader)d7.c != null || d7.b != 0) {
              Path.FillType fillType1;
              if (this.e == null) {
                Paint paint1 = new Paint(1);
                this.e = paint1;
                paint1.setStyle(Paint.Style.FILL);
              } 
              Paint paint = this.e;
              Shader shader = (Shader)d7.c;
              if (shader != null) {
                shader.setLocalMatrix(matrix);
                paint.setShader(shader);
                paint.setAlpha(Math.round(p12.h * 255.0F));
              } else {
                paint.setShader(null);
                paint.setAlpha(255);
                int i = d7.b;
                f3 = p12.h;
                PorterDuff.Mode mode = w12.l;
                paint.setColor(i & 0xFFFFFF | (int)(Color.alpha(i) * f3) << 24);
              } 
              paint.setColorFilter(null);
              if (p12.c == 0) {
                fillType1 = Path.FillType.WINDING;
              } else {
                fillType1 = Path.FillType.EVEN_ODD;
              } 
              path1.setFillType(fillType1);
              paramCanvas.drawPath(path1, paint);
            } 
            d7 = p12.d;
            if ((Shader)d7.c != null || d7.b != 0) {
              if (this.d == null) {
                Paint paint1 = new Paint(1);
                this.d = paint1;
                paint1.setStyle(Paint.Style.STROKE);
              } 
              Paint paint = this.d;
              Paint.Join join = p12.m;
              if (join != null)
                paint.setStrokeJoin(join); 
              Paint.Cap cap = p12.l;
              if (cap != null)
                paint.setStrokeCap(cap); 
              paint.setStrokeMiter(p12.n);
              Shader shader = (Shader)d7.c;
              if (shader != null) {
                shader.setLocalMatrix(matrix);
                paint.setShader(shader);
                paint.setAlpha(Math.round(p12.g * 255.0F));
              } else {
                paint.setShader(null);
                paint.setAlpha(255);
                int i = d7.b;
                f3 = p12.g;
                PorterDuff.Mode mode = w12.l;
                paint.setColor(i & 0xFFFFFF | (int)(Color.alpha(i) * f3) << 24);
              } 
              paint.setColorFilter(null);
              paint.setStrokeWidth(p12.e * f2 * f1);
              paramCanvas.drawPath(path1, paint);
            } 
          } 
        } 
      } 
    } 
    paramCanvas.restore();
  }
  
  public float getAlpha() {
    return getRootAlpha() / 255.0F;
  }
  
  public int getRootAlpha() {
    return this.l;
  }
  
  public void setAlpha(float paramFloat) {
    setRootAlpha((int)(paramFloat * 255.0F));
  }
  
  public void setRootAlpha(int paramInt) {
    this.l = paramInt;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */