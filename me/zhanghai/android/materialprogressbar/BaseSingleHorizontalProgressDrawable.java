package me.zhanghai.android.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

class BaseSingleHorizontalProgressDrawable extends BaseProgressDrawable {
  private static final int PADDED_INTRINSIC_HEIGHT_DP = 16;
  
  private static final int PROGRESS_INTRINSIC_HEIGHT_DP = 4;
  
  protected static final RectF RECT_BOUND = new RectF(-180.0F, -1.0F, 180.0F, 1.0F);
  
  private static final RectF RECT_PADDED_BOUND = new RectF(-180.0F, -4.0F, 180.0F, 4.0F);
  
  private int mPaddedIntrinsicHeight;
  
  private int mProgressIntrinsicHeight;
  
  public BaseSingleHorizontalProgressDrawable(Context paramContext) {
    float f = (paramContext.getResources().getDisplayMetrics()).density;
    this.mProgressIntrinsicHeight = Math.round(4.0F * f);
    this.mPaddedIntrinsicHeight = Math.round(f * 16.0F);
  }
  
  public int getIntrinsicHeight() {
    return this.mUseIntrinsicPadding ? this.mPaddedIntrinsicHeight : this.mProgressIntrinsicHeight;
  }
  
  public void onDraw(Canvas paramCanvas, int paramInt1, int paramInt2, Paint paramPaint) {
    if (this.mUseIntrinsicPadding) {
      float f = paramInt1;
      RectF rectF = RECT_PADDED_BOUND;
      paramCanvas.scale(f / rectF.width(), paramInt2 / rectF.height());
      paramCanvas.translate(rectF.width() / 2.0F, rectF.height() / 2.0F);
    } else {
      float f = paramInt1;
      RectF rectF = RECT_BOUND;
      paramCanvas.scale(f / rectF.width(), paramInt2 / rectF.height());
      paramCanvas.translate(rectF.width() / 2.0F, rectF.height() / 2.0F);
    } 
    onDrawRect(paramCanvas, paramPaint);
  }
  
  public void onDrawRect(Canvas paramCanvas, Paint paramPaint) {
    paramCanvas.drawRect(RECT_BOUND, paramPaint);
  }
  
  public void onPreparePaint(Paint paramPaint) {
    paramPaint.setStyle(Paint.Style.FILL);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\me\zhanghai\android\materialprogressbar\BaseSingleHorizontalProgressDrawable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */