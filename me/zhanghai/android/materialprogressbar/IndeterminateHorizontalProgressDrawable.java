package me.zhanghai.android.materialprogressbar;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import me.zhanghai.android.materialprogressbar.internal.ThemeUtils;

public class IndeterminateHorizontalProgressDrawable extends BaseIndeterminateProgressDrawable implements ShowBackgroundDrawable {
  private static final int PADDED_INTRINSIC_HEIGHT_DP = 16;
  
  private static final int PROGRESS_INTRINSIC_HEIGHT_DP = 4;
  
  private static final RectTransformX RECT_1_TRANSFORM_X;
  
  private static final RectTransformX RECT_2_TRANSFORM_X;
  
  private static final RectF RECT_BOUND = new RectF(-180.0F, -1.0F, 180.0F, 1.0F);
  
  private static final RectF RECT_PADDED_BOUND = new RectF(-180.0F, -4.0F, 180.0F, 4.0F);
  
  private static final RectF RECT_PROGRESS = new RectF(-144.0F, -1.0F, 144.0F, 1.0F);
  
  private float mBackgroundAlpha;
  
  private int mPaddedIntrinsicHeight;
  
  private int mProgressIntrinsicHeight;
  
  private RectTransformX mRect1TransformX = new RectTransformX(RECT_1_TRANSFORM_X);
  
  private RectTransformX mRect2TransformX = new RectTransformX(RECT_2_TRANSFORM_X);
  
  private boolean mShowBackground = true;
  
  static {
    RECT_1_TRANSFORM_X = new RectTransformX(-522.6F, 0.1F);
    RECT_2_TRANSFORM_X = new RectTransformX(-197.6F, 0.1F);
  }
  
  public IndeterminateHorizontalProgressDrawable(Context paramContext) {
    super(paramContext);
    float f = (paramContext.getResources().getDisplayMetrics()).density;
    this.mProgressIntrinsicHeight = Math.round(4.0F * f);
    this.mPaddedIntrinsicHeight = Math.round(f * 16.0F);
    this.mBackgroundAlpha = ThemeUtils.getFloatFromAttrRes(16842803, paramContext);
    this.mAnimators = new Animator[] { Animators.createIndeterminateHorizontalRect1(this.mRect1TransformX), Animators.createIndeterminateHorizontalRect2(this.mRect2TransformX) };
  }
  
  private static void drawBackgroundRect(Canvas paramCanvas, Paint paramPaint) {
    paramCanvas.drawRect(RECT_BOUND, paramPaint);
  }
  
  private static void drawProgressRect(Canvas paramCanvas, RectTransformX paramRectTransformX, Paint paramPaint) {
    int i = paramCanvas.save();
    paramCanvas.translate(paramRectTransformX.mTranslateX, 0.0F);
    paramCanvas.scale(paramRectTransformX.mScaleX, 1.0F);
    paramCanvas.drawRect(RECT_PROGRESS, paramPaint);
    paramCanvas.restoreToCount(i);
  }
  
  public int getIntrinsicHeight() {
    return this.mUseIntrinsicPadding ? this.mPaddedIntrinsicHeight : this.mProgressIntrinsicHeight;
  }
  
  public boolean getShowBackground() {
    return this.mShowBackground;
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
    if (this.mShowBackground) {
      paramPaint.setAlpha(Math.round(this.mAlpha * this.mBackgroundAlpha));
      drawBackgroundRect(paramCanvas, paramPaint);
      paramPaint.setAlpha(this.mAlpha);
    } 
    drawProgressRect(paramCanvas, this.mRect2TransformX, paramPaint);
    drawProgressRect(paramCanvas, this.mRect1TransformX, paramPaint);
  }
  
  public void onPreparePaint(Paint paramPaint) {
    paramPaint.setStyle(Paint.Style.FILL);
  }
  
  public void setShowBackground(boolean paramBoolean) {
    if (this.mShowBackground != paramBoolean) {
      this.mShowBackground = paramBoolean;
      invalidateSelf();
    } 
  }
  
  public static class RectTransformX {
    public float mScaleX;
    
    public float mTranslateX;
    
    public RectTransformX(float param1Float1, float param1Float2) {
      this.mTranslateX = param1Float1;
      this.mScaleX = param1Float2;
    }
    
    public RectTransformX(RectTransformX param1RectTransformX) {
      this.mTranslateX = param1RectTransformX.mTranslateX;
      this.mScaleX = param1RectTransformX.mScaleX;
    }
    
    public void setScaleX(float param1Float) {
      this.mScaleX = param1Float;
    }
    
    public void setTranslateX(float param1Float) {
      this.mTranslateX = param1Float;
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\me\zhanghai\android\materialprogressbar\IndeterminateHorizontalProgressDrawable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */