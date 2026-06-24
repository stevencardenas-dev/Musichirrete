import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

public final class ug extends Drawable {
  public final xl1 a = wl1.a;
  
  public final Paint b;
  
  public final Path c = new Path();
  
  public final Rect d = new Rect();
  
  public final RectF e = new RectF();
  
  public final RectF f = new RectF();
  
  public final a5 g = new a5(this);
  
  public float h;
  
  public int i;
  
  public int j;
  
  public int k;
  
  public int l;
  
  public int m;
  
  public boolean n = true;
  
  public vl1 o;
  
  public ColorStateList p;
  
  public ug(vl1 paramvl1) {
    this.o = paramvl1;
    Paint paint = new Paint(1);
    this.b = paint;
    paint.setStyle(Paint.Style.STROKE);
  }
  
  public final void draw(Canvas paramCanvas) {
    boolean bool = this.n;
    Rect rect1 = this.d;
    Paint paint = this.b;
    if (bool) {
      copyBounds(rect1);
      float f4 = this.h / rect1.height();
      int j = jn.g(this.i, this.m);
      int n = jn.g(this.j, this.m);
      int i1 = jn.g(jn.i(this.j, 0), this.m);
      int k = jn.g(jn.i(this.l, 0), this.m);
      int m = jn.g(this.l, this.m);
      int i = jn.g(this.k, this.m);
      float f5 = rect1.top;
      float f3 = rect1.bottom;
      Shader.TileMode tileMode = Shader.TileMode.CLAMP;
      paint.setShader((Shader)new LinearGradient(0.0F, f5, 0.0F, f3, new int[] { j, n, i1, k, m, i }, new float[] { 0.0F, f4, 0.5F, 0.5F, 1.0F - f4, 1.0F }, tileMode));
      this.n = false;
    } 
    float f1 = paint.getStrokeWidth() / 2.0F;
    copyBounds(rect1);
    RectF rectF1 = this.e;
    rectF1.set(rect1);
    ls ls = this.o.e;
    Rect rect2 = getBounds();
    RectF rectF2 = this.f;
    rectF2.set(rect2);
    float f2 = Math.min(ls.a(rectF2), rectF1.width() / 2.0F);
    vl1 vl11 = this.o;
    rectF2.set(getBounds());
    if (vl11.e(rectF2)) {
      rectF1.inset(f1, f1);
      paramCanvas.drawRoundRect(rectF1, f2, f2, paint);
    } 
  }
  
  public final Drawable.ConstantState getConstantState() {
    return this.g;
  }
  
  public final int getOpacity() {
    return (this.h > 0.0F) ? -3 : -2;
  }
  
  public final void getOutline(Outline paramOutline) {
    vl1 vl12 = this.o;
    Rect rect2 = getBounds();
    RectF rectF = this.f;
    rectF.set(rect2);
    if (vl12.e(rectF)) {
      ls ls = this.o.e;
      rectF.set(getBounds());
      float f = ls.a(rectF);
      paramOutline.setRoundRect(getBounds(), f);
      return;
    } 
    Rect rect1 = this.d;
    copyBounds(rect1);
    rectF = this.e;
    rectF.set(rect1);
    vl1 vl11 = this.o;
    xl1 xl11 = this.a;
    Path path = this.c;
    xl11.a(vl11, null, 1.0F, rectF, null, path);
    p8.i(paramOutline, path);
  }
  
  public final boolean getPadding(Rect paramRect) {
    vl1 vl11 = this.o;
    Rect rect = getBounds();
    RectF rectF = this.f;
    rectF.set(rect);
    if (vl11.e(rectF)) {
      int i = Math.round(this.h);
      paramRect.set(i, i, i, i);
    } 
    return true;
  }
  
  public final boolean isStateful() {
    ColorStateList colorStateList = this.p;
    return ((colorStateList != null && colorStateList.isStateful()) || super.isStateful());
  }
  
  public final void onBoundsChange(Rect paramRect) {
    this.n = true;
  }
  
  public final boolean onStateChange(int[] paramArrayOfint) {
    ColorStateList colorStateList = this.p;
    if (colorStateList != null) {
      int i = colorStateList.getColorForState(paramArrayOfint, this.m);
      if (i != this.m) {
        this.n = true;
        this.m = i;
      } 
    } 
    if (this.n)
      invalidateSelf(); 
    return this.n;
  }
  
  public final void setAlpha(int paramInt) {
    this.b.setAlpha(paramInt);
    invalidateSelf();
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter) {
    this.b.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\ug.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */