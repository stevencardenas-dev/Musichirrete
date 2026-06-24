package me.zhanghai.android.materialprogressbar;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

public abstract class BasePaintDrawable extends BaseDrawable {
  private Paint mPaint;
  
  public final void onDraw(Canvas paramCanvas, int paramInt1, int paramInt2) {
    if (this.mPaint == null) {
      Paint paint = new Paint();
      this.mPaint = paint;
      paint.setAntiAlias(true);
      this.mPaint.setColor(-16777216);
      onPreparePaint(this.mPaint);
    } 
    this.mPaint.setAlpha(this.mAlpha);
    this.mPaint.setColorFilter(getColorFilterForDrawing());
    onDraw(paramCanvas, paramInt1, paramInt2, this.mPaint);
  }
  
  public abstract void onDraw(Canvas paramCanvas, int paramInt1, int paramInt2, Paint paramPaint);
  
  public abstract void onPreparePaint(Paint paramPaint);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\me\zhanghai\android\materialprogressbar\BasePaintDrawable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */