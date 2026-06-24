import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

public final class xl1 {
  public final fm1[] a = new fm1[4];
  
  public final Matrix[] b = new Matrix[4];
  
  public final Matrix[] c = new Matrix[4];
  
  public final PointF d = new PointF();
  
  public final Path e = new Path();
  
  public final Path f = new Path();
  
  public final fm1 g = new fm1();
  
  public final float[] h = new float[2];
  
  public final float[] i = new float[2];
  
  public final Path j = new Path();
  
  public final Path k = new Path();
  
  public final boolean l = true;
  
  public xl1() {
    for (byte b = 0; b < 4; b++) {
      this.a[b] = new fm1();
      this.b[b] = new Matrix();
      this.c[b] = new Matrix();
    } 
  }
  
  public final void a(vl1 paramvl1, float[] paramArrayOffloat, float paramFloat, RectF paramRectF, ts0 paramts0, Path paramPath) {
    paramPath.rewind();
    Path path2 = this.e;
    path2.rewind();
    Path path1 = this.f;
    path1.rewind();
    path1.addRect(paramRectF, Path.Direction.CW);
    int i = 0;
    while (true) {
      Matrix[] arrayOfMatrix2 = this.c;
      float[] arrayOfFloat = this.h;
      fm1[] arrayOfFm12 = this.a;
      Matrix[] arrayOfMatrix1 = this.b;
      if (i < 4) {
        ls ls;
        z51 z51;
        if (paramArrayOffloat == null) {
          if (i != 1) {
            if (i != 2) {
              if (i != 3) {
                ls = paramvl1.f;
              } else {
                ls = paramvl1.e;
              } 
            } else {
              ls = paramvl1.h;
            } 
          } else {
            ls = paramvl1.g;
          } 
        } else {
          ls = new jl(paramArrayOffloat[i]);
        } 
        if (i != 1) {
          if (i != 2) {
            if (i != 3) {
              z51 = paramvl1.b;
            } else {
              z51 = paramvl1.a;
            } 
          } else {
            z51 = paramvl1.d;
          } 
        } else {
          z51 = paramvl1.c;
        } 
        fm1 fm12 = arrayOfFm12[i];
        z51.getClass();
        z51.l(fm12, paramFloat, ls.a(paramRectF));
        int j = i + 1;
        float f = (j % 4 * 90);
        arrayOfMatrix1[i].reset();
        PointF pointF = this.d;
        if (i != 1) {
          if (i != 2) {
            if (i != 3) {
              pointF.set(paramRectF.right, paramRectF.top);
            } else {
              pointF.set(paramRectF.left, paramRectF.top);
            } 
          } else {
            pointF.set(paramRectF.left, paramRectF.bottom);
          } 
        } else {
          pointF.set(paramRectF.right, paramRectF.bottom);
        } 
        arrayOfMatrix1[i].setTranslate(pointF.x, pointF.y);
        arrayOfMatrix1[i].preRotate(f);
        fm1 fm11 = arrayOfFm12[i];
        arrayOfFloat[0] = fm11.c;
        arrayOfFloat[1] = fm11.d;
        arrayOfMatrix1[i].mapPoints(arrayOfFloat);
        arrayOfMatrix2[i].reset();
        arrayOfMatrix2[i].setTranslate(arrayOfFloat[0], arrayOfFloat[1]);
        arrayOfMatrix2[i].preRotate(f);
        i = j;
        continue;
      } 
      i = 0;
      fm1[] arrayOfFm11 = arrayOfFm12;
      while (i < 4) {
        j30 j30;
        fm1 fm12 = arrayOfFm11[i];
        arrayOfFloat[0] = fm12.a;
        arrayOfFloat[1] = fm12.b;
        arrayOfMatrix1[i].mapPoints(arrayOfFloat);
        if (i == 0) {
          paramPath.moveTo(arrayOfFloat[0], arrayOfFloat[1]);
        } else {
          paramPath.lineTo(arrayOfFloat[0], arrayOfFloat[1]);
        } 
        arrayOfFm11[i].b(arrayOfMatrix1[i], paramPath);
        if (paramts0 != null) {
          fm12 = arrayOfFm11[i];
          Matrix matrix = arrayOfMatrix1[i];
          ws0 ws0 = paramts0.a;
          BitSet bitSet = ws0.g;
          fm12.getClass();
          bitSet.set(i, false);
          em1[] arrayOfEm1 = ws0.e;
          fm12.a(fm12.f);
          matrix = new Matrix(matrix);
          arrayOfEm1[i] = new yl1(new ArrayList(fm12.h), matrix);
        } 
        int j = i + 1;
        int k = j % 4;
        fm12 = arrayOfFm11[i];
        arrayOfFloat[0] = fm12.c;
        arrayOfFloat[1] = fm12.d;
        arrayOfMatrix1[i].mapPoints(arrayOfFloat);
        fm1 fm13 = arrayOfFm11[k];
        float f1 = fm13.a;
        float[] arrayOfFloat1 = this.i;
        arrayOfFloat1[0] = f1;
        arrayOfFloat1[1] = fm13.b;
        arrayOfMatrix1[k].mapPoints(arrayOfFloat1);
        float f2 = Math.max((float)Math.hypot((arrayOfFloat[0] - arrayOfFloat1[0]), (arrayOfFloat[1] - arrayOfFloat1[1])) - 0.001F, 0.0F);
        fm1 fm11 = arrayOfFm11[i];
        arrayOfFloat[0] = fm11.c;
        arrayOfFloat[1] = fm11.d;
        arrayOfMatrix1[i].mapPoints(arrayOfFloat);
        if (i != 1 && i != 3) {
          f1 = Math.abs(paramRectF.centerY() - arrayOfFloat[1]);
        } else {
          f1 = Math.abs(paramRectF.centerX() - arrayOfFloat[0]);
        } 
        fm13 = this.g;
        fm13.d(0.0F, 0.0F, 270.0F, 0.0F);
        if (i != 1) {
          if (i != 2) {
            if (i != 3) {
              j30 = paramvl1.j;
            } else {
              j30 = paramvl1.i;
            } 
          } else {
            j30 = paramvl1.l;
          } 
        } else {
          j30 = paramvl1.k;
        } 
        j30.c(f2, f1, paramFloat, fm13);
        Path path = this.j;
        path.reset();
        fm13.b(arrayOfMatrix2[i], path);
        if (this.l && (j30.b() || b(path, i) || b(path, k))) {
          path.op(path, path1, Path.Op.DIFFERENCE);
          arrayOfFloat[0] = fm13.a;
          arrayOfFloat[1] = fm13.b;
          arrayOfMatrix2[i].mapPoints(arrayOfFloat);
          path2.moveTo(arrayOfFloat[0], arrayOfFloat[1]);
          fm13.b(arrayOfMatrix2[i], path2);
        } else {
          fm13.b(arrayOfMatrix2[i], paramPath);
        } 
        if (paramts0 != null) {
          Matrix matrix = arrayOfMatrix2[i];
          ws0 ws0 = paramts0.a;
          ws0.g.set(i + 4, false);
          em1[] arrayOfEm1 = ws0.f;
          fm13.a(fm13.f);
          matrix = new Matrix(matrix);
          arrayOfEm1[i] = new yl1(new ArrayList(fm13.h), matrix);
        } 
        i = j;
      } 
      paramPath.close();
      path2.close();
      if (!path2.isEmpty())
        paramPath.op(path2, Path.Op.UNION); 
      return;
    } 
  }
  
  public final boolean b(Path paramPath, int paramInt) {
    Path path = this.k;
    path.reset();
    this.a[paramInt].b(this.b[paramInt], path);
    RectF rectF = new RectF();
    paramPath.computeBounds(rectF, true);
    path.computeBounds(rectF, true);
    paramPath.op(path, Path.Op.INTERSECT);
    paramPath.computeBounds(rectF, true);
    return (!rectF.isEmpty() || (rectF.width() > 1.0F && rectF.height() > 1.0F));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xl1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */