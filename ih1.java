import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

public final class ih1 extends Drawable {
  public float a;
  
  public final Paint b;
  
  public final RectF c;
  
  public final Rect d;
  
  public float e;
  
  public boolean f = false;
  
  public boolean g = true;
  
  public ColorStateList h;
  
  public PorterDuffColorFilter i;
  
  public ColorStateList j;
  
  public PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
  
  public ih1(ColorStateList paramColorStateList, float paramFloat) {
    this.a = paramFloat;
    Paint paint = new Paint(5);
    this.b = paint;
    ColorStateList colorStateList = paramColorStateList;
    if (paramColorStateList == null)
      colorStateList = ColorStateList.valueOf(0); 
    this.h = colorStateList;
    paint.setColor(colorStateList.getColorForState(getState(), this.h.getDefaultColor()));
    this.c = new RectF();
    this.d = new Rect();
  }
  
  public final PorterDuffColorFilter a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode) {
    return (paramColorStateList == null || paramMode == null) ? null : new PorterDuffColorFilter(paramColorStateList.getColorForState(getState(), 0), paramMode);
  }
  
  public final void b(Rect paramRect) {
    Rect rect1 = paramRect;
    if (paramRect == null)
      rect1 = getBounds(); 
    float f1 = rect1.left;
    float f3 = rect1.top;
    float f4 = rect1.right;
    float f2 = rect1.bottom;
    RectF rectF = this.c;
    rectF.set(f1, f3, f4, f2);
    Rect rect2 = this.d;
    rect2.set(rect1);
    if (this.f) {
      f1 = jh1.b(this.e, this.a, this.g);
      rect2.inset((int)Math.ceil(jh1.a(this.e, this.a, this.g)), (int)Math.ceil(f1));
      rectF.set(rect2);
    } 
  }
  
  public final void draw(Canvas paramCanvas) {
    boolean bool;
    PorterDuffColorFilter porterDuffColorFilter = this.i;
    Paint paint = this.b;
    if (porterDuffColorFilter != null && paint.getColorFilter() == null) {
      paint.setColorFilter((ColorFilter)this.i);
      bool = true;
    } else {
      bool = false;
    } 
    RectF rectF = this.c;
    float f = this.a;
    paramCanvas.drawRoundRect(rectF, f, f, paint);
    if (bool)
      paint.setColorFilter(null); 
  }
  
  public final int getOpacity() {
    return -3;
  }
  
  public final void getOutline(Outline paramOutline) {
    paramOutline.setRoundRect(this.d, this.a);
  }
  
  public final boolean isStateful() {
    ColorStateList colorStateList = this.j;
    if (colorStateList == null || !colorStateList.isStateful()) {
      colorStateList = this.h;
      if ((colorStateList == null || !colorStateList.isStateful()) && !super.isStateful())
        return false; 
    } 
    return true;
  }
  
  public final void onBoundsChange(Rect paramRect) {
    super.onBoundsChange(paramRect);
    b(paramRect);
  }
  
  public final boolean onStateChange(int[] paramArrayOfint) {
    boolean bool;
    ColorStateList colorStateList2 = this.h;
    int i = colorStateList2.getColorForState(paramArrayOfint, colorStateList2.getDefaultColor());
    Paint paint = this.b;
    if (i != paint.getColor()) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool)
      paint.setColor(i); 
    ColorStateList colorStateList1 = this.j;
    if (colorStateList1 != null) {
      PorterDuff.Mode mode = this.k;
      if (mode != null) {
        this.i = a(colorStateList1, mode);
        return true;
      } 
    } 
    return bool;
  }
  
  public final void setAlpha(int paramInt) {
    this.b.setAlpha(paramInt);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter) {
    this.b.setColorFilter(paramColorFilter);
  }
  
  public final void setTintList(ColorStateList paramColorStateList) {
    this.j = paramColorStateList;
    this.i = a(paramColorStateList, this.k);
    invalidateSelf();
  }
  
  public final void setTintMode(PorterDuff.Mode paramMode) {
    this.k = paramMode;
    this.i = a(this.j, paramMode);
    invalidateSelf();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ih1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */