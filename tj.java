import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

public final class tj extends ImageSpan {
  public WeakReference b;
  
  public int c;
  
  public int e;
  
  public tj(Drawable paramDrawable) {
    super(paramDrawable, bool);
    boolean bool;
    this.c = 0;
    this.e = 0;
  }
  
  public final void draw(Canvas paramCanvas, CharSequence paramCharSequence, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, Paint paramPaint) {
    Drawable drawable;
    if (Build.VERSION.SDK_INT >= 30) {
      super.draw(paramCanvas, paramCharSequence, paramInt1, paramInt2, paramFloat, paramInt3, paramInt4, paramInt5, paramPaint);
      return;
    } 
    WeakReference<Drawable> weakReference1 = this.b;
    if (weakReference1 != null) {
      Drawable drawable1 = weakReference1.get();
    } else {
      weakReference1 = null;
    } 
    WeakReference<Drawable> weakReference2 = weakReference1;
    if (weakReference1 == null) {
      drawable = getDrawable();
      this.b = new WeakReference<Drawable>(drawable);
    } 
    paramCanvas.save();
    paramCanvas.translate(paramFloat, ((paramInt5 - paramInt3) / 2 + paramInt3 - drawable.getBounds().height() / 2));
    drawable.draw(paramCanvas);
    paramCanvas.restore();
  }
  
  public final int getSize(Paint paramPaint, CharSequence paramCharSequence, int paramInt1, int paramInt2, Paint.FontMetricsInt paramFontMetricsInt) {
    Drawable drawable;
    if (Build.VERSION.SDK_INT >= 30)
      return super.getSize(paramPaint, paramCharSequence, paramInt1, paramInt2, paramFontMetricsInt); 
    WeakReference<Drawable> weakReference1 = this.b;
    if (weakReference1 != null) {
      Drawable drawable1 = weakReference1.get();
    } else {
      weakReference1 = null;
    } 
    WeakReference<Drawable> weakReference2 = weakReference1;
    if (weakReference1 == null) {
      drawable = getDrawable();
      this.b = new WeakReference<Drawable>(drawable);
    } 
    Rect rect = drawable.getBounds();
    if (paramFontMetricsInt != null) {
      paramInt1 = rect.bottom;
      int i = paramFontMetricsInt.descent;
      paramInt2 = paramInt1 - i - paramFontMetricsInt.ascent;
      if (paramInt2 >= 0) {
        this.c = i;
        this.e = paramInt2;
      } 
      paramInt2 = this.e / 2 + this.c;
      paramFontMetricsInt.descent = paramInt2;
      paramFontMetricsInt.bottom = paramInt2;
      paramInt1 = -paramInt1 + paramInt2;
      paramFontMetricsInt.ascent = paramInt1;
      paramFontMetricsInt.top = paramInt1;
    } 
    return rect.right;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */