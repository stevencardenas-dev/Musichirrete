import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;

public final class ly extends n10 {
  public static final ky A = new ky(0);
  
  public final zm0 p;
  
  public final mo1 q;
  
  public final lo1 r;
  
  public final o10 s;
  
  public float t;
  
  public boolean u = false;
  
  public final ValueAnimator v;
  
  public ValueAnimator w;
  
  public TimeInterpolator x;
  
  public TimeInterpolator y;
  
  public TimeInterpolator z;
  
  public ly(Context paramContext, jn0 paramjn0, zm0 paramzm0) {
    super(paramContext, paramjn0);
    this.p = paramzm0;
    o10 o101 = new o10();
    this.s = o101;
    o101.g = true;
    mo1 mo11 = new mo1();
    this.q = mo11;
    mo11.a(1.0F);
    mo11.b(50.0F);
    lo1 lo11 = new lo1(this, A);
    this.r = lo11;
    lo11.m = mo11;
    ValueAnimator valueAnimator = new ValueAnimator();
    this.v = valueAnimator;
    valueAnimator.setDuration(1000L);
    valueAnimator.setFloatValues(new float[] { 0.0F, 1.0F });
    valueAnimator.setRepeatCount(-1);
    valueAnimator.addUpdateListener(new s5(1, this, paramjn0));
    if (paramjn0.c(true) && paramjn0.m != 0)
      valueAnimator.start(); 
    if (this.k != 1.0F) {
      this.k = 1.0F;
      invalidateSelf();
    } 
  }
  
  public final void draw(Canvas paramCanvas) {
    if (!getBounds().isEmpty() && isVisible() && paramCanvas.getClipBounds(this.n)) {
      boolean bool1;
      boolean bool2;
      paramCanvas.save();
      Rect rect = getBounds();
      float f1 = b();
      ObjectAnimator objectAnimator = this.f;
      if (objectAnimator == null || !objectAnimator.isRunning()) {
        bool1 = false;
      } else {
        bool1 = true;
      } 
      objectAnimator = this.g;
      if (objectAnimator == null || !objectAnimator.isRunning()) {
        bool2 = false;
      } else {
        bool2 = true;
      } 
      this.p.c(paramCanvas, rect, f1, bool1, bool2);
      f1 = c();
      o10 o101 = this.s;
      o101.f = f1;
      Paint.Style style = Paint.Style.FILL;
      Paint paint = this.l;
      paint.setStyle(style);
      paint.setAntiAlias(true);
      jn0 jn0 = this.c;
      o101.c = jn0.e[0];
      int i = jn0.i;
      zm0 zm02 = this.p;
      if (i > 0) {
        if (zm02 == null) {
          f1 = i;
          i = (int)(ui0.h(o101.b, 0.0F, 0.01F) * f1 / 0.01F);
        } 
        f1 = o101.b;
        int m = jn0.f;
        int k = this.m;
        this.p.g(paramCanvas, paint, f1, 1.0F, m, k, i);
      } else {
        zm02.g(paramCanvas, paint, 0.0F, 1.0F, jn0.f, this.m, 0);
      } 
      i = this.m;
      zm02 = this.p;
      zm02.getClass();
      i = m92.l(o101.c, i);
      zm02.m = o101.g;
      float f2 = o101.a;
      f1 = o101.b;
      int j = o101.d;
      zm02.e(paramCanvas, paint, f2, f1, i, j, j, o101.e, o101.f, true);
      i = jn0.e[0];
      j = this.m;
      zm0 zm01 = this.p;
      zm01.getClass();
      i = m92.l(i, j);
      zm01.m = false;
      jn0 = zm01.a;
      if (jn0.r > 0 && i != 0) {
        paint.setStyle(style);
        paint.setColor(i);
        Integer integer = jn0.s;
        if (integer != null) {
          f1 = integer.floatValue();
          f1 = jn0.r / 2.0F + f1;
        } else {
          f1 = zm01.g / 2.0F;
        } 
        p10 p10 = new p10(new float[] { zm01.f / 2.0F - f1, 0.0F }, new float[] { 1.0F, 0.0F });
        f1 = jn0.r;
        zm01.f(paramCanvas, paint, p10, f1, f1, zm01.h * f1 / zm01.g, null, 0.0F, 0.0F, 0.0F, false);
      } 
      paramCanvas.restore();
    } 
  }
  
  public final boolean e(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    paramBoolean1 = super.e(paramBoolean1, paramBoolean2, paramBoolean3);
    h5 h5 = this.e;
    ContentResolver contentResolver = this.b.getContentResolver();
    h5.getClass();
    float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0F);
    if (f == 0.0F) {
      this.u = true;
      return paramBoolean1;
    } 
    this.u = false;
    f = 50.0F / f;
    this.q.b(f);
    return paramBoolean1;
  }
  
  public final int getIntrinsicHeight() {
    return this.p.a();
  }
  
  public final int getIntrinsicWidth() {
    this.p.getClass();
    return -1;
  }
  
  public final void jumpToCurrentState() {
    this.r.d();
    float f = getLevel() / 10000.0F;
    this.s.b = f;
    invalidateSelf();
  }
  
  public final boolean onLevelChange(int paramInt) {
    float f1;
    float f2 = paramInt;
    if (f2 >= 1000.0F && f2 <= 9000.0F) {
      f1 = 1.0F;
    } else {
      f1 = 0.0F;
    } 
    boolean bool = this.u;
    o10 o101 = this.s;
    lo1 lo11 = this.r;
    if (bool) {
      lo11.d();
      o101.b = f2 / 10000.0F;
      invalidateSelf();
      o101.e = f1;
      invalidateSelf();
    } else {
      lo11.b = o101.b * 10000.0F;
      lo11.c = true;
      lo11.a(f2);
    } 
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ly.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */