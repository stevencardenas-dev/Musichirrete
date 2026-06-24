package me.zhanghai.android.materialprogressbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ProgressBar;
import m60;
import me.zhanghai.android.materialprogressbar.internal.DrawableCompat;
import tp;
import zv0;

public class MaterialProgressBar extends ProgressBar {
  public static final int PROGRESS_STYLE_CIRCULAR = 0;
  
  public static final int PROGRESS_STYLE_HORIZONTAL = 1;
  
  private static final String TAG = "MaterialProgressBar";
  
  private int mProgressStyle;
  
  private TintInfo mProgressTintInfo = new TintInfo(0);
  
  public MaterialProgressBar(Context paramContext) {
    super(paramContext);
    init(null, 0, 0);
  }
  
  public MaterialProgressBar(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    init(paramAttributeSet, 0, 0);
  }
  
  public MaterialProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramAttributeSet, paramInt, 0);
  }
  
  public MaterialProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    init(paramAttributeSet, paramInt1, paramInt2);
  }
  
  private void applyIndeterminateTint() {
    Drawable drawable = getIndeterminateDrawable();
    if (drawable != null) {
      TintInfo tintInfo = this.mProgressTintInfo;
      if (tintInfo.mHasIndeterminateTint || tintInfo.mHasIndeterminateTintMode) {
        drawable.mutate();
        tintInfo = this.mProgressTintInfo;
        applyTintForDrawable(drawable, tintInfo.mIndeterminateTint, tintInfo.mHasIndeterminateTint, tintInfo.mIndeterminateTintMode, tintInfo.mHasIndeterminateTintMode);
        return;
      } 
    } 
  }
  
  private void applyPrimaryProgressTint() {
    if (getProgressDrawable() != null) {
      TintInfo tintInfo = this.mProgressTintInfo;
      if (tintInfo.mHasProgressTint || tintInfo.mHasProgressTintMode) {
        Drawable drawable = getTintTargetFromProgressDrawable(16908301, true);
        if (drawable != null) {
          tintInfo = this.mProgressTintInfo;
          applyTintForDrawable(drawable, tintInfo.mProgressTint, tintInfo.mHasProgressTint, tintInfo.mProgressTintMode, tintInfo.mHasProgressTintMode);
        } 
      } 
    } 
  }
  
  private void applyProgressBackgroundTint() {
    if (getProgressDrawable() != null) {
      TintInfo tintInfo = this.mProgressTintInfo;
      if (tintInfo.mHasProgressBackgroundTint || tintInfo.mHasProgressBackgroundTintMode) {
        Drawable drawable = getTintTargetFromProgressDrawable(16908288, false);
        if (drawable != null) {
          TintInfo tintInfo1 = this.mProgressTintInfo;
          applyTintForDrawable(drawable, tintInfo1.mProgressBackgroundTint, tintInfo1.mHasProgressBackgroundTint, tintInfo1.mProgressBackgroundTintMode, tintInfo1.mHasProgressBackgroundTintMode);
        } 
      } 
    } 
  }
  
  private void applyProgressTints() {
    if (getProgressDrawable() == null)
      return; 
    applyPrimaryProgressTint();
    applyProgressBackgroundTint();
    applySecondaryProgressTint();
  }
  
  private void applySecondaryProgressTint() {
    if (getProgressDrawable() != null) {
      TintInfo tintInfo = this.mProgressTintInfo;
      if (tintInfo.mHasSecondaryProgressTint || tintInfo.mHasSecondaryProgressTintMode) {
        Drawable drawable = getTintTargetFromProgressDrawable(16908303, false);
        if (drawable != null) {
          TintInfo tintInfo1 = this.mProgressTintInfo;
          applyTintForDrawable(drawable, tintInfo1.mSecondaryProgressTint, tintInfo1.mHasSecondaryProgressTint, tintInfo1.mSecondaryProgressTintMode, tintInfo1.mHasSecondaryProgressTintMode);
        } 
      } 
    } 
  }
  
  private void applyTintForDrawable(Drawable paramDrawable, ColorStateList paramColorStateList, boolean paramBoolean1, PorterDuff.Mode paramMode, boolean paramBoolean2) {
    if (paramBoolean1 || paramBoolean2) {
      if (paramBoolean1)
        if (paramDrawable instanceof TintableDrawable) {
          ((TintableDrawable)paramDrawable).setTintList(paramColorStateList);
        } else {
          Log.w(TAG, "Drawable did not implement TintableDrawable, it won't be tinted below Lollipop");
          paramDrawable.setTintList(paramColorStateList);
        }  
      if (paramBoolean2)
        if (paramDrawable instanceof TintableDrawable) {
          ((TintableDrawable)paramDrawable).setTintMode(paramMode);
        } else {
          Log.w(TAG, "Drawable did not implement TintableDrawable, it won't be tinted below Lollipop");
          paramDrawable.setTintMode(paramMode);
        }  
      if (paramDrawable.isStateful())
        paramDrawable.setState(getDrawableState()); 
    } 
  }
  
  private void fixCanvasScalingWhenHardwareAccelerated() {}
  
  private Drawable getTintTargetFromProgressDrawable(int paramInt, boolean paramBoolean) {
    Drawable drawable2 = getProgressDrawable();
    Drawable drawable1 = null;
    if (drawable2 == null)
      return null; 
    drawable2.mutate();
    if (drawable2 instanceof LayerDrawable)
      drawable1 = ((LayerDrawable)drawable2).findDrawableByLayerId(paramInt); 
    return (drawable1 == null && paramBoolean) ? drawable2 : drawable1;
  }
  
  private void init(AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    Context context = getContext();
    zv0 zv0 = zv0.y(paramInt1, paramInt2, context, paramAttributeSet, R.styleable.MaterialProgressBar);
    paramInt1 = R.styleable.MaterialProgressBar_mpb_progressStyle;
    TypedArray typedArray = (TypedArray)zv0.e;
    boolean bool1 = false;
    this.mProgressStyle = typedArray.getInt(paramInt1, 0);
    boolean bool3 = typedArray.getBoolean(R.styleable.MaterialProgressBar_mpb_setBothDrawables, false);
    boolean bool2 = typedArray.getBoolean(R.styleable.MaterialProgressBar_mpb_useIntrinsicPadding, true);
    paramInt1 = R.styleable.MaterialProgressBar_mpb_showProgressBackground;
    if (this.mProgressStyle == 1)
      bool1 = true; 
    bool1 = typedArray.getBoolean(paramInt1, bool1);
    if (typedArray.hasValue(R.styleable.MaterialProgressBar_mpb_progressTint)) {
      this.mProgressTintInfo.mProgressTint = zv0.n(R.styleable.MaterialProgressBar_mpb_progressTint);
      this.mProgressTintInfo.mHasProgressTint = true;
    } 
    if (typedArray.hasValue(R.styleable.MaterialProgressBar_mpb_progressTintMode)) {
      this.mProgressTintInfo.mProgressTintMode = DrawableCompat.parseTintMode(typedArray.getInt(R.styleable.MaterialProgressBar_mpb_progressTintMode, -1), null);
      this.mProgressTintInfo.mHasProgressTintMode = true;
    } 
    if (typedArray.hasValue(R.styleable.MaterialProgressBar_mpb_secondaryProgressTint)) {
      this.mProgressTintInfo.mSecondaryProgressTint = zv0.n(R.styleable.MaterialProgressBar_mpb_secondaryProgressTint);
      this.mProgressTintInfo.mHasSecondaryProgressTint = true;
    } 
    if (typedArray.hasValue(R.styleable.MaterialProgressBar_mpb_secondaryProgressTintMode)) {
      this.mProgressTintInfo.mSecondaryProgressTintMode = DrawableCompat.parseTintMode(typedArray.getInt(R.styleable.MaterialProgressBar_mpb_secondaryProgressTintMode, -1), null);
      this.mProgressTintInfo.mHasSecondaryProgressTintMode = true;
    } 
    if (typedArray.hasValue(R.styleable.MaterialProgressBar_mpb_progressBackgroundTint)) {
      this.mProgressTintInfo.mProgressBackgroundTint = zv0.n(R.styleable.MaterialProgressBar_mpb_progressBackgroundTint);
      this.mProgressTintInfo.mHasProgressBackgroundTint = true;
    } 
    if (typedArray.hasValue(R.styleable.MaterialProgressBar_mpb_progressBackgroundTintMode)) {
      this.mProgressTintInfo.mProgressBackgroundTintMode = DrawableCompat.parseTintMode(typedArray.getInt(R.styleable.MaterialProgressBar_mpb_progressBackgroundTintMode, -1), null);
      this.mProgressTintInfo.mHasProgressBackgroundTintMode = true;
    } 
    if (typedArray.hasValue(R.styleable.MaterialProgressBar_mpb_indeterminateTint)) {
      this.mProgressTintInfo.mIndeterminateTint = zv0.n(R.styleable.MaterialProgressBar_mpb_indeterminateTint);
      this.mProgressTintInfo.mHasIndeterminateTint = true;
    } 
    if (typedArray.hasValue(R.styleable.MaterialProgressBar_mpb_indeterminateTintMode)) {
      this.mProgressTintInfo.mIndeterminateTintMode = DrawableCompat.parseTintMode(typedArray.getInt(R.styleable.MaterialProgressBar_mpb_indeterminateTintMode, -1), null);
      this.mProgressTintInfo.mHasIndeterminateTintMode = true;
    } 
    zv0.z();
    paramInt1 = this.mProgressStyle;
    if (paramInt1 != 0) {
      if (paramInt1 == 1) {
        if ((isIndeterminate() || bool3) && !isInEditMode())
          setIndeterminateDrawable(new IndeterminateHorizontalProgressDrawable(context)); 
        if (!isIndeterminate() || bool3)
          setProgressDrawable((Drawable)new HorizontalProgressDrawable(context)); 
      } else {
        m60.n("Unknown progress style: ", this.mProgressStyle);
        return;
      } 
    } else if (isIndeterminate() && !bool3) {
      if (!isInEditMode())
        setIndeterminateDrawable(new IndeterminateProgressDrawable(context)); 
    } else {
      tp.j("Determinate circular drawable is not yet supported");
      return;
    } 
    setUseIntrinsicPadding(bool2);
    setShowProgressBackground(bool1);
  }
  
  public Drawable getCurrentDrawable() {
    return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
  }
  
  public ColorStateList getIndeterminateTintList() {
    return this.mProgressTintInfo.mIndeterminateTint;
  }
  
  public PorterDuff.Mode getIndeterminateTintMode() {
    return this.mProgressTintInfo.mIndeterminateTintMode;
  }
  
  public ColorStateList getProgressBackgroundTintList() {
    return this.mProgressTintInfo.mProgressBackgroundTint;
  }
  
  public PorterDuff.Mode getProgressBackgroundTintMode() {
    return this.mProgressTintInfo.mProgressBackgroundTintMode;
  }
  
  public int getProgressStyle() {
    return this.mProgressStyle;
  }
  
  public ColorStateList getProgressTintList() {
    return this.mProgressTintInfo.mProgressTint;
  }
  
  public PorterDuff.Mode getProgressTintMode() {
    return this.mProgressTintInfo.mProgressTintMode;
  }
  
  public ColorStateList getSecondaryProgressTintList() {
    return this.mProgressTintInfo.mSecondaryProgressTint;
  }
  
  public PorterDuff.Mode getSecondaryProgressTintMode() {
    return this.mProgressTintInfo.mSecondaryProgressTintMode;
  }
  
  public boolean getShowProgressBackground() {
    Drawable drawable = getCurrentDrawable();
    return (drawable instanceof ShowBackgroundDrawable) ? ((ShowBackgroundDrawable)drawable).getShowBackground() : false;
  }
  
  public boolean getUseIntrinsicPadding() {
    Drawable drawable = getCurrentDrawable();
    if (drawable instanceof IntrinsicPaddingDrawable)
      return ((IntrinsicPaddingDrawable)drawable).getUseIntrinsicPadding(); 
    tp.f("Drawable does not implement IntrinsicPaddingDrawable");
    return false;
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    fixCanvasScalingWhenHardwareAccelerated();
  }
  
  public void setIndeterminateDrawable(Drawable paramDrawable) {
    super.setIndeterminateDrawable(paramDrawable);
    if (this.mProgressTintInfo != null)
      applyIndeterminateTint(); 
  }
  
  public void setIndeterminateTintList(ColorStateList paramColorStateList) {
    TintInfo tintInfo = this.mProgressTintInfo;
    tintInfo.mIndeterminateTint = paramColorStateList;
    tintInfo.mHasIndeterminateTint = true;
    applyIndeterminateTint();
  }
  
  public void setIndeterminateTintMode(PorterDuff.Mode paramMode) {
    TintInfo tintInfo = this.mProgressTintInfo;
    tintInfo.mIndeterminateTintMode = paramMode;
    tintInfo.mHasIndeterminateTintMode = true;
    applyIndeterminateTint();
  }
  
  public void setProgressBackgroundTintList(ColorStateList paramColorStateList) {
    TintInfo tintInfo = this.mProgressTintInfo;
    tintInfo.mProgressBackgroundTint = paramColorStateList;
    tintInfo.mHasProgressBackgroundTint = true;
    applyProgressBackgroundTint();
  }
  
  public void setProgressBackgroundTintMode(PorterDuff.Mode paramMode) {
    TintInfo tintInfo = this.mProgressTintInfo;
    tintInfo.mProgressBackgroundTintMode = paramMode;
    tintInfo.mHasProgressBackgroundTintMode = true;
    applyProgressBackgroundTint();
  }
  
  public void setProgressDrawable(Drawable paramDrawable) {
    super.setProgressDrawable(paramDrawable);
    if (this.mProgressTintInfo != null)
      applyProgressTints(); 
  }
  
  public void setProgressTintList(ColorStateList paramColorStateList) {
    TintInfo tintInfo = this.mProgressTintInfo;
    tintInfo.mProgressTint = paramColorStateList;
    tintInfo.mHasProgressTint = true;
    applyPrimaryProgressTint();
  }
  
  public void setProgressTintMode(PorterDuff.Mode paramMode) {
    TintInfo tintInfo = this.mProgressTintInfo;
    tintInfo.mProgressTintMode = paramMode;
    tintInfo.mHasProgressTintMode = true;
    applyPrimaryProgressTint();
  }
  
  public void setSecondaryProgressTintList(ColorStateList paramColorStateList) {
    TintInfo tintInfo = this.mProgressTintInfo;
    tintInfo.mSecondaryProgressTint = paramColorStateList;
    tintInfo.mHasSecondaryProgressTint = true;
    applySecondaryProgressTint();
  }
  
  public void setSecondaryProgressTintMode(PorterDuff.Mode paramMode) {
    TintInfo tintInfo = this.mProgressTintInfo;
    tintInfo.mSecondaryProgressTintMode = paramMode;
    tintInfo.mHasSecondaryProgressTintMode = true;
    applySecondaryProgressTint();
  }
  
  public void setShowProgressBackground(boolean paramBoolean) {
    Drawable drawable = getCurrentDrawable();
    if (drawable instanceof ShowBackgroundDrawable)
      ((ShowBackgroundDrawable)drawable).setShowBackground(paramBoolean); 
    drawable = getIndeterminateDrawable();
    if (drawable instanceof ShowBackgroundDrawable)
      ((ShowBackgroundDrawable)drawable).setShowBackground(paramBoolean); 
  }
  
  public void setUseIntrinsicPadding(boolean paramBoolean) {
    Drawable drawable = getCurrentDrawable();
    if (drawable instanceof IntrinsicPaddingDrawable)
      ((IntrinsicPaddingDrawable)drawable).setUseIntrinsicPadding(paramBoolean); 
    drawable = getIndeterminateDrawable();
    if (drawable instanceof IntrinsicPaddingDrawable)
      ((IntrinsicPaddingDrawable)drawable).setUseIntrinsicPadding(paramBoolean); 
  }
  
  public static class TintInfo {
    public boolean mHasIndeterminateTint;
    
    public boolean mHasIndeterminateTintMode;
    
    public boolean mHasProgressBackgroundTint;
    
    public boolean mHasProgressBackgroundTintMode;
    
    public boolean mHasProgressTint;
    
    public boolean mHasProgressTintMode;
    
    public boolean mHasSecondaryProgressTint;
    
    public boolean mHasSecondaryProgressTintMode;
    
    public ColorStateList mIndeterminateTint;
    
    public PorterDuff.Mode mIndeterminateTintMode;
    
    public ColorStateList mProgressBackgroundTint;
    
    public PorterDuff.Mode mProgressBackgroundTintMode;
    
    public ColorStateList mProgressTint;
    
    public PorterDuff.Mode mProgressTintMode;
    
    public ColorStateList mSecondaryProgressTint;
    
    public PorterDuff.Mode mSecondaryProgressTintMode;
    
    private TintInfo() {}
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\me\zhanghai\android\materialprogressbar\MaterialProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */