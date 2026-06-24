package me.zhanghai.android.materialprogressbar;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import me.zhanghai.android.materialprogressbar.internal.ThemeUtils;

abstract class BaseIndeterminateProgressDrawable extends BaseProgressDrawable implements Animatable {
  protected Animator[] mAnimators;
  
  public BaseIndeterminateProgressDrawable(Context paramContext) {
    setTint(ThemeUtils.getColorFromAttrRes(2130968899, paramContext));
  }
  
  private boolean isStarted() {
    Animator[] arrayOfAnimator = this.mAnimators;
    int i = arrayOfAnimator.length;
    for (byte b = 0; b < i; b++) {
      if (arrayOfAnimator[b].isStarted())
        return true; 
    } 
    return false;
  }
  
  public void draw(Canvas paramCanvas) {
    super.draw(paramCanvas);
    if (isStarted())
      invalidateSelf(); 
  }
  
  public boolean isRunning() {
    Animator[] arrayOfAnimator = this.mAnimators;
    int i = arrayOfAnimator.length;
    for (byte b = 0; b < i; b++) {
      if (arrayOfAnimator[b].isRunning())
        return true; 
    } 
    return false;
  }
  
  public void start() {
    if (isStarted())
      return; 
    Animator[] arrayOfAnimator = this.mAnimators;
    int i = arrayOfAnimator.length;
    for (byte b = 0; b < i; b++)
      arrayOfAnimator[b].start(); 
    invalidateSelf();
  }
  
  public void stop() {
    Animator[] arrayOfAnimator = this.mAnimators;
    int i = arrayOfAnimator.length;
    for (byte b = 0; b < i; b++)
      arrayOfAnimator[b].end(); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\me\zhanghai\android\materialprogressbar\BaseIndeterminateProgressDrawable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */