package me.zhanghai.android.materialprogressbar;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

abstract class BaseDrawable extends Drawable implements TintableDrawable {
  protected int mAlpha = 255;
  
  protected ColorFilter mColorFilter;
  
  private DummyConstantState mConstantState = new DummyConstantState(0);
  
  protected PorterDuffColorFilter mTintFilter;
  
  protected ColorStateList mTintList;
  
  protected PorterDuff.Mode mTintMode = PorterDuff.Mode.SRC_IN;
  
  private boolean updateTintFilter() {
    ColorStateList colorStateList = this.mTintList;
    boolean bool = true;
    if (colorStateList == null || this.mTintMode == null) {
      if (this.mTintFilter == null)
        bool = false; 
      this.mTintFilter = null;
      return bool;
    } 
    this.mTintFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), this.mTintMode);
    return true;
  }
  
  public void draw(Canvas paramCanvas) {
    Rect rect = getBounds();
    if (rect.width() != 0 && rect.height() != 0) {
      int i = paramCanvas.save();
      paramCanvas.translate(rect.left, rect.top);
      onDraw(paramCanvas, rect.width(), rect.height());
      paramCanvas.restoreToCount(i);
    } 
  }
  
  public int getAlpha() {
    return this.mAlpha;
  }
  
  public ColorFilter getColorFilter() {
    return this.mColorFilter;
  }
  
  public ColorFilter getColorFilterForDrawing() {
    ColorFilter colorFilter = this.mColorFilter;
    return (ColorFilter)((colorFilter != null) ? colorFilter : this.mTintFilter);
  }
  
  public Drawable.ConstantState getConstantState() {
    return this.mConstantState;
  }
  
  public int getOpacity() {
    return -3;
  }
  
  public boolean isStateful() {
    ColorStateList colorStateList = this.mTintList;
    return (colorStateList != null && colorStateList.isStateful());
  }
  
  public abstract void onDraw(Canvas paramCanvas, int paramInt1, int paramInt2);
  
  public boolean onStateChange(int[] paramArrayOfint) {
    return updateTintFilter();
  }
  
  public void setAlpha(int paramInt) {
    if (this.mAlpha != paramInt) {
      this.mAlpha = paramInt;
      invalidateSelf();
    } 
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    this.mColorFilter = paramColorFilter;
    invalidateSelf();
  }
  
  public void setTint(int paramInt) {
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    this.mTintList = paramColorStateList;
    if (updateTintFilter())
      invalidateSelf(); 
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    this.mTintMode = paramMode;
    if (updateTintFilter())
      invalidateSelf(); 
  }
  
  public class DummyConstantState extends Drawable.ConstantState {
    final BaseDrawable this$0;
    
    private DummyConstantState() {}
    
    public int getChangingConfigurations() {
      return 0;
    }
    
    public Drawable newDrawable() {
      return BaseDrawable.this;
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\me\zhanghai\android\materialprogressbar\BaseDrawable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */