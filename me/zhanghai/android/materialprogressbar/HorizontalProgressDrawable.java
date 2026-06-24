package me.zhanghai.android.materialprogressbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import jn;
import me.zhanghai.android.materialprogressbar.internal.ThemeUtils;
import x41;

public class HorizontalProgressDrawable extends LayerDrawable implements IntrinsicPaddingDrawable, ShowBackgroundDrawable, TintableDrawable {
  private static final String TAG = "HorizontalProgressDrawable";
  
  private float mBackgroundAlpha;
  
  private HorizontalProgressBackgroundDrawable mBackgroundDrawable;
  
  private boolean mHasSecondaryProgressTint;
  
  private boolean mHasSecondaryProgressTintColor;
  
  private SingleHorizontalProgressDrawable mProgressDrawable;
  
  private SingleHorizontalProgressDrawable mSecondaryProgressDrawable;
  
  private ColorStateList mSecondaryProgressTint;
  
  private int mSecondaryProgressTintColor;
  
  public HorizontalProgressDrawable(Context paramContext) {
    super(new Drawable[] { new HorizontalProgressBackgroundDrawable(paramContext), new SingleHorizontalProgressDrawable(paramContext), new SingleHorizontalProgressDrawable(paramContext) });
    this.mBackgroundAlpha = ThemeUtils.getFloatFromAttrRes(16842803, paramContext);
    setId(0, 16908288);
    this.mBackgroundDrawable = (HorizontalProgressBackgroundDrawable)getDrawable(0);
    setId(1, 16908303);
    this.mSecondaryProgressDrawable = (SingleHorizontalProgressDrawable)getDrawable(1);
    setId(2, 16908301);
    this.mProgressDrawable = (SingleHorizontalProgressDrawable)getDrawable(2);
    setTint(ThemeUtils.getColorFromAttrRes(2130968899, paramContext));
  }
  
  private float compositeAlpha(float paramFloat1, float paramFloat2) {
    return x41.e(1.0F, paramFloat1, paramFloat2, paramFloat1);
  }
  
  private void setSecondaryProgressTint(int paramInt) {
    this.mHasSecondaryProgressTintColor = true;
    this.mSecondaryProgressTintColor = paramInt;
    this.mHasSecondaryProgressTint = false;
    updateSecondaryProgressTint();
  }
  
  private void setSecondaryProgressTintList(ColorStateList paramColorStateList) {
    this.mHasSecondaryProgressTintColor = false;
    this.mHasSecondaryProgressTint = true;
    this.mSecondaryProgressTint = paramColorStateList;
    updateSecondaryProgressTint();
  }
  
  private void updateSecondaryProgressTint() {
    if (this.mHasSecondaryProgressTintColor) {
      int j = this.mSecondaryProgressTintColor;
      int i = j;
      if (!getShowBackground()) {
        float f = Color.alpha(j) / 255.0F;
        i = jn.i(j, Math.round(compositeAlpha(f, f) * 255.0F));
      } 
      this.mSecondaryProgressDrawable.setTint(i);
      return;
    } 
    if (this.mHasSecondaryProgressTint) {
      ColorStateList colorStateList2 = this.mSecondaryProgressTint;
      ColorStateList colorStateList1 = colorStateList2;
      if (!getShowBackground()) {
        float f = this.mBackgroundAlpha;
        colorStateList1 = colorStateList2.withAlpha(Math.round(compositeAlpha(f, f) * 255.0F));
      } 
      this.mSecondaryProgressDrawable.setTintList(colorStateList1);
    } 
  }
  
  public boolean getShowBackground() {
    return this.mBackgroundDrawable.getShowBackground();
  }
  
  public boolean getUseIntrinsicPadding() {
    return this.mBackgroundDrawable.getUseIntrinsicPadding();
  }
  
  public void setShowBackground(boolean paramBoolean) {
    if (this.mBackgroundDrawable.getShowBackground() != paramBoolean) {
      this.mBackgroundDrawable.setShowBackground(paramBoolean);
      updateSecondaryProgressTint();
    } 
  }
  
  public void setTint(int paramInt) {
    int i = jn.i(paramInt, Math.round(Color.alpha(paramInt) * this.mBackgroundAlpha));
    this.mBackgroundDrawable.setTint(i);
    setSecondaryProgressTint(i);
    this.mProgressDrawable.setTint(paramInt);
  }
  
  public void setTintList(ColorStateList paramColorStateList) {
    ColorStateList colorStateList;
    if (paramColorStateList != null) {
      if (!paramColorStateList.isOpaque())
        Log.w(TAG, "setTintList() called with a non-opaque ColorStateList, its original alpha will be discarded"); 
      colorStateList = paramColorStateList.withAlpha(Math.round(this.mBackgroundAlpha * 255.0F));
    } else {
      colorStateList = null;
    } 
    this.mBackgroundDrawable.setTintList(colorStateList);
    setSecondaryProgressTintList(colorStateList);
    this.mProgressDrawable.setTintList(paramColorStateList);
  }
  
  public void setTintMode(PorterDuff.Mode paramMode) {
    this.mBackgroundDrawable.setTintMode(paramMode);
    this.mSecondaryProgressDrawable.setTintMode(paramMode);
    this.mProgressDrawable.setTintMode(paramMode);
  }
  
  public void setUseIntrinsicPadding(boolean paramBoolean) {
    this.mBackgroundDrawable.setUseIntrinsicPadding(paramBoolean);
    this.mSecondaryProgressDrawable.setUseIntrinsicPadding(paramBoolean);
    this.mProgressDrawable.setUseIntrinsicPadding(paramBoolean);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\me\zhanghai\android\materialprogressbar\HorizontalProgressDrawable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */