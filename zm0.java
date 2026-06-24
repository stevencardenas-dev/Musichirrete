import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.Pair;

public final class zm0 extends q10 {
  public float f;
  
  public float g;
  
  public float h;
  
  public float i;
  
  public float j;
  
  public float k;
  
  public int l;
  
  public boolean m;
  
  public float n;
  
  public Pair o;
  
  public final int a() {
    jn0 jn0 = this.a;
    int i = jn0.a;
    return jn0.l * 2 + i;
  }
  
  public final void b() {
    Path path = this.b;
    path.rewind();
    jn0 jn0 = this.a;
    if (jn0.c(this.m)) {
      if (this.m) {
        i = jn0.j;
      } else {
        i = jn0.k;
      } 
      float f = this.f;
      int j = (int)(f / i);
      this.k = f / j;
      for (int i = 0; i <= j; i++) {
        int k = i * 2;
        float f1 = k;
        f = (k + 1);
        path.cubicTo(f1 + 0.48F, 0.0F, f - 0.48F, 1.0F, f, 1.0F);
        f1 = (k + 2);
        path.cubicTo(f + 0.48F, 1.0F, f1 - 0.48F, 0.0F, f1, 0.0F);
      } 
      Matrix matrix = this.e;
      matrix.reset();
      matrix.setScale(this.k / 2.0F, -2.0F);
      matrix.postTranslate(0.0F, 1.0F);
      path.transform(matrix);
    } else {
      path.lineTo(this.f, 0.0F);
    } 
    this.d.setPath(path, false);
  }
  
  public final void e(Canvas paramCanvas, Paint paramPaint, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, int paramInt3, float paramFloat3, float paramFloat4, boolean paramBoolean) {
    Pair pair = this.o;
    paramFloat1 = ui0.h(paramFloat1, 0.0F, 1.0F);
    paramFloat2 = ui0.h(paramFloat2, 0.0F, 1.0F);
    paramFloat1 = qv.M(1.0F - this.n, 1.0F, paramFloat1);
    paramFloat2 = qv.M(1.0F - this.n, 1.0F, paramFloat2);
    float f = paramInt2;
    paramInt2 = (int)(ui0.h(paramFloat1, 0.0F, 0.01F) * f / 0.01F);
    f = paramInt3;
    int i = (int)((1.0F - ui0.h(paramFloat2, 0.99F, 1.0F)) * f / 0.01F);
    f = this.f;
    paramInt3 = (int)(paramFloat1 * f + paramInt2);
    i = (int)(paramFloat2 * f - i);
    paramFloat1 = this.h;
    paramFloat2 = this.i;
    if (paramFloat1 != paramFloat2) {
      paramFloat2 = Math.max(paramFloat1, paramFloat2);
      paramFloat1 = this.f;
      paramFloat2 /= paramFloat1;
      paramFloat1 = qv.M(this.h, this.i, ui0.h(paramInt3 / paramFloat1, 0.0F, paramFloat2) / paramFloat2);
      float f1 = this.h;
      float f2 = this.i;
      f = this.f;
      paramFloat2 = qv.M(f1, f2, ui0.h((f - i) / f, 0.0F, paramFloat2) / paramFloat2);
    } else {
      paramFloat2 = paramFloat1;
    } 
    f = -this.f / 2.0F;
    jn0 jn0 = this.a;
    if (jn0.c(this.m) && paramBoolean && paramFloat3 > 0.0F) {
      paramInt2 = 1;
    } else {
      paramInt2 = 0;
    } 
    if (paramInt3 <= i) {
      Paint.Cap cap;
      float f3 = paramInt3 + paramFloat1;
      float f4 = i - paramFloat2;
      float f1 = paramFloat1 * 2.0F;
      float f2 = paramFloat2 * 2.0F;
      paramPaint.setColor(paramInt1);
      paramPaint.setAntiAlias(true);
      paramPaint.setStrokeWidth(this.g);
      ((p10)pair.first).a();
      ((p10)pair.second).a();
      ((p10)pair.first).c(f3 + f);
      ((p10)pair.second).c(f4 + f);
      if (paramInt3 == 0 && f4 + paramFloat2 < f3 + paramFloat1) {
        p10 p10 = (p10)pair.first;
        paramFloat3 = this.g;
        f(paramCanvas, paramPaint, p10, f1, paramFloat3, paramFloat1, (p10)pair.second, f2, paramFloat3, paramFloat2, true);
        return;
      } 
      if (f3 - paramFloat1 > f4 - paramFloat2) {
        p10 p10 = (p10)pair.second;
        paramFloat3 = this.g;
        f(paramCanvas, paramPaint, p10, f2, paramFloat3, paramFloat2, (p10)pair.first, f1, paramFloat3, paramFloat1, false);
        return;
      } 
      paramPaint.setStyle(Paint.Style.STROKE);
      if (jn0.d && jn0.c == 0.5F && jn0.b() == jn0.a()) {
        cap = Paint.Cap.ROUND;
      } else {
        cap = Paint.Cap.BUTT;
      } 
      paramPaint.setStrokeCap(cap);
      if (paramInt2 == 0) {
        float[] arrayOfFloat = ((p10)pair.first).a;
        paramFloat4 = arrayOfFloat[0];
        paramFloat3 = arrayOfFloat[1];
        arrayOfFloat = ((p10)pair.second).a;
        paramCanvas.drawLine(paramFloat4, paramFloat3, arrayOfFloat[0], arrayOfFloat[1], paramPaint);
      } else {
        f = this.f;
        float f6 = f3 / f;
        f = f4 / f;
        if (this.m) {
          paramInt1 = jn0.j;
        } else {
          paramInt1 = jn0.k;
        } 
        if (paramInt1 != this.l) {
          this.l = paramInt1;
          b();
        } 
        Path path = this.c;
        path.rewind();
        float f5 = -this.f / 2.0F;
        paramBoolean = jn0.c(this.m);
        if (paramBoolean) {
          float f8 = this.f;
          float f7 = this.k;
          float f9 = f8 / f7;
          f8 = paramFloat4 / f9;
          f9 /= f9 + 1.0F;
          f6 = (f6 + f8) * f9;
          f = (f + f8) * f9;
          paramFloat4 = f5 - f7 * paramFloat4;
          f5 = f6;
        } else {
          paramFloat4 = f5;
          f5 = f6;
        } 
        PathMeasure pathMeasure = this.d;
        f5 = pathMeasure.getLength() * f5;
        f = pathMeasure.getLength() * f;
        pathMeasure.getSegment(f5, f, path, true);
        p10 p101 = (p10)pair.first;
        p101.a();
        pathMeasure.getPosTan(f5, p101.a, p101.b);
        p10 p102 = (p10)pair.second;
        p102.a();
        pathMeasure.getPosTan(f, p102.a, p102.b);
        Matrix matrix = this.e;
        matrix.reset();
        matrix.setTranslate(paramFloat4, 0.0F);
        p101.c(paramFloat4);
        p102.c(paramFloat4);
        if (paramBoolean) {
          paramFloat3 = this.j * paramFloat3;
          matrix.postScale(1.0F, paramFloat3);
          p101.b(paramFloat3);
          p102.b(paramFloat3);
        } 
        path.transform(matrix);
        paramCanvas.drawPath(path, paramPaint);
      } 
      if (jn0.d && jn0.c == 0.5F && jn0.b() == jn0.a())
        return; 
      if (f3 > 0.0F && paramFloat1 > 0.0F)
        f(paramCanvas, paramPaint, (p10)pair.first, f1, this.g, paramFloat1, null, 0.0F, 0.0F, 0.0F, false); 
      if (f4 < this.f && paramFloat2 > 0.0F)
        f(paramCanvas, paramPaint, (p10)pair.second, f2, this.g, paramFloat2, null, 0.0F, 0.0F, 0.0F, false); 
    } 
  }
  
  public final void f(Canvas paramCanvas, Paint paramPaint, p10 paramp101, float paramFloat1, float paramFloat2, float paramFloat3, p10 paramp102, float paramFloat4, float paramFloat5, float paramFloat6, boolean paramBoolean) {
    float f1 = Math.min(paramFloat2, this.g);
    float f2 = -paramFloat1 / 2.0F;
    paramFloat2 = -f1 / 2.0F;
    float f3 = paramFloat1 / 2.0F;
    f1 /= 2.0F;
    RectF rectF = new RectF(f2, paramFloat2, f3, f1);
    paramPaint.setStyle(Paint.Style.FILL);
    paramCanvas.save();
    if (paramp102 != null) {
      float[] arrayOfFloat3 = paramp102.b;
      float[] arrayOfFloat2 = paramp102.a;
      paramFloat5 = Math.min(paramFloat5, this.g);
      paramFloat6 = Math.min(paramFloat4 / 2.0F, paramFloat6 * paramFloat5 / this.g);
      RectF rectF2 = new RectF();
      if (paramBoolean) {
        paramFloat1 = arrayOfFloat2[0] - paramFloat6 - paramp101.a[0] - paramFloat3;
        if (paramFloat1 > 0.0F) {
          paramp102.c(-paramFloat1 / 2.0F);
          paramFloat1 = paramFloat4 + paramFloat1;
        } else {
          paramFloat1 = paramFloat4;
        } 
        rectF2.set(0.0F, paramFloat2, f3, f1);
      } else {
        paramFloat1 = arrayOfFloat2[0] + paramFloat6 - paramp101.a[0] + paramFloat3;
        if (paramFloat1 < 0.0F) {
          paramp102.c(-paramFloat1 / 2.0F);
          paramFloat1 = paramFloat4 - paramFloat1;
        } else {
          paramFloat1 = paramFloat4;
        } 
        rectF2.set(f2, paramFloat2, 0.0F, f1);
      } 
      RectF rectF1 = new RectF(-paramFloat1 / 2.0F, -paramFloat5 / 2.0F, paramFloat1 / 2.0F, paramFloat5 / 2.0F);
      paramCanvas.translate(arrayOfFloat2[0], arrayOfFloat2[1]);
      paramCanvas.rotate(q10.d(arrayOfFloat3));
      Path path = new Path();
      path.addRoundRect(rectF1, paramFloat6, paramFloat6, Path.Direction.CCW);
      paramCanvas.clipPath(path);
      paramCanvas.rotate(-q10.d(arrayOfFloat3));
      paramCanvas.translate(-arrayOfFloat2[0], -arrayOfFloat2[1]);
      float[] arrayOfFloat1 = paramp101.a;
      paramCanvas.translate(arrayOfFloat1[0], arrayOfFloat1[1]);
      paramCanvas.rotate(q10.d(paramp101.b));
      paramCanvas.drawRect(rectF2, paramPaint);
      paramCanvas.drawRoundRect(rectF, paramFloat3, paramFloat3, paramPaint);
    } else {
      float[] arrayOfFloat = paramp101.a;
      paramCanvas.translate(arrayOfFloat[0], arrayOfFloat[1]);
      paramCanvas.rotate(q10.d(paramp101.b));
      paramCanvas.drawRoundRect(rectF, paramFloat3, paramFloat3, paramPaint);
    } 
    paramCanvas.restore();
  }
  
  public final void g(Canvas paramCanvas, Paint paramPaint, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, int paramInt3) {
    paramInt1 = m92.l(paramInt1, paramInt2);
    this.m = false;
    e(paramCanvas, paramPaint, paramFloat1, paramFloat2, paramInt1, paramInt3, paramInt3, 0.0F, 0.0F, false);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zm0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */