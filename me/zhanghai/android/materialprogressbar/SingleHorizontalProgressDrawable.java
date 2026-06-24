package me.zhanghai.android.materialprogressbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

class SingleHorizontalProgressDrawable extends BaseSingleHorizontalProgressDrawable {
  private static final int LEVEL_MAX = 10000;
  
  public SingleHorizontalProgressDrawable(Context paramContext) {
    super(paramContext);
  }
  
  public void onDrawRect(Canvas paramCanvas, Paint paramPaint) {
    int j = getLevel();
    if (j == 0)
      return; 
    int i = paramCanvas.save();
    paramCanvas.scale(j / 10000.0F, 1.0F, BaseSingleHorizontalProgressDrawable.RECT_BOUND.left, 0.0F);
    super.onDrawRect(paramCanvas, paramPaint);
    paramCanvas.restoreToCount(i);
  }
  
  public boolean onLevelChange(int paramInt) {
    invalidateSelf();
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\me\zhanghai\android\materialprogressbar\SingleHorizontalProgressDrawable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */