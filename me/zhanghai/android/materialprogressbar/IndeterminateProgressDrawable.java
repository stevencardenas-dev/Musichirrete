package me.zhanghai.android.materialprogressbar;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

public class IndeterminateProgressDrawable extends BaseIndeterminateProgressDrawable {
  private static final int PADDED_INTRINSIC_SIZE_DP = 48;
  
  private static final int PROGRESS_INTRINSIC_SIZE_DP = 42;
  
  private static final RectF RECT_BOUND = new RectF(-21.0F, -21.0F, 21.0F, 21.0F);
  
  private static final RectF RECT_PADDED_BOUND = new RectF(-24.0F, -24.0F, 24.0F, 24.0F);
  
  private static final RectF RECT_PROGRESS = new RectF(-19.0F, -19.0F, 19.0F, 19.0F);
  
  private int mPaddedIntrinsicSize;
  
  private int mProgressIntrinsicSize;
  
  private RingPathTransform mRingPathTransform = new RingPathTransform(0);
  
  private RingRotation mRingRotation = new RingRotation(0);
  
  public IndeterminateProgressDrawable(Context paramContext) {
    super(paramContext);
    float f = (paramContext.getResources().getDisplayMetrics()).density;
    this.mProgressIntrinsicSize = Math.round(42.0F * f);
    this.mPaddedIntrinsicSize = Math.round(f * 48.0F);
    this.mAnimators = new Animator[] { Animators.createIndeterminate(this.mRingPathTransform), Animators.createIndeterminateRotation(this.mRingRotation) };
  }
  
  private void drawRing(Canvas paramCanvas, Paint paramPaint) {
    int i = paramCanvas.save();
    paramCanvas.rotate(RingRotation.a(this.mRingRotation));
    RingPathTransform ringPathTransform = this.mRingPathTransform;
    float f2 = ringPathTransform.mTrimPathOffset;
    float f1 = ringPathTransform.mTrimPathStart;
    float f3 = ringPathTransform.mTrimPathEnd;
    paramCanvas.drawArc(RECT_PROGRESS, (f2 + f1) * 360.0F - 90.0F, (f3 - f1) * 360.0F, false, paramPaint);
    paramCanvas.restoreToCount(i);
  }
  
  private int getIntrinsicSize() {
    return this.mUseIntrinsicPadding ? this.mPaddedIntrinsicSize : this.mProgressIntrinsicSize;
  }
  
  public int getIntrinsicHeight() {
    return getIntrinsicSize();
  }
  
  public int getIntrinsicWidth() {
    return getIntrinsicSize();
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
    drawRing(paramCanvas, paramPaint);
  }
  
  public void onPreparePaint(Paint paramPaint) {
    paramPaint.setStyle(Paint.Style.STROKE);
    paramPaint.setStrokeWidth(4.0F);
    paramPaint.setStrokeCap(Paint.Cap.SQUARE);
    paramPaint.setStrokeJoin(Paint.Join.MITER);
  }
  
  public static class RingPathTransform {
    public float mTrimPathEnd;
    
    public float mTrimPathOffset;
    
    public float mTrimPathStart;
    
    private RingPathTransform() {}
    
    public void setTrimPathEnd(float param1Float) {
      this.mTrimPathEnd = param1Float;
    }
    
    public void setTrimPathOffset(float param1Float) {
      this.mTrimPathOffset = param1Float;
    }
    
    public void setTrimPathStart(float param1Float) {
      this.mTrimPathStart = param1Float;
    }
  }
  
  public static class RingRotation {
    private float mRotation;
    
    private RingRotation() {}
    
    public void setRotation(float param1Float) {
      this.mRotation = param1Float;
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\me\zhanghai\android\materialprogressbar\IndeterminateProgressDrawable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */