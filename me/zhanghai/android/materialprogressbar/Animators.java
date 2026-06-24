package me.zhanghai.android.materialprogressbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import me.zhanghai.android.materialprogressbar.internal.ObjectAnimatorCompat;

class Animators {
  private static final Path PATH_INDETERMINATE_HORIZONTAL_RECT1_SCALE_X;
  
  private static final Path PATH_INDETERMINATE_HORIZONTAL_RECT1_TRANSLATE_X;
  
  private static final Path PATH_INDETERMINATE_HORIZONTAL_RECT2_SCALE_X;
  
  private static final Path PATH_INDETERMINATE_HORIZONTAL_RECT2_TRANSLATE_X;
  
  static {
    Path path = new Path();
    PATH_INDETERMINATE_HORIZONTAL_RECT1_TRANSLATE_X = path;
    path.moveTo(-522.6F, 0.0F);
    path.rCubicTo(48.89972F, 0.0F, 166.02657F, 0.0F, 301.2173F, 0.0F);
    path.rCubicTo(197.58128F, 0.0F, 420.9827F, 0.0F, 420.9827F, 0.0F);
    path = new Path();
    PATH_INDETERMINATE_HORIZONTAL_RECT1_SCALE_X = path;
    path.moveTo(0.0F, 0.1F);
    path.lineTo(1.0F, 0.8268492F);
    path.lineTo(2.0F, 0.1F);
    path = new Path();
    PATH_INDETERMINATE_HORIZONTAL_RECT2_TRANSLATE_X = path;
    path.moveTo(-197.6F, 0.0F);
    path.rCubicTo(14.28182F, 0.0F, 85.07782F, 0.0F, 135.54689F, 0.0F);
    path.rCubicTo(54.26191F, 0.0F, 90.42461F, 0.0F, 168.24332F, 0.0F);
    path.rCubicTo(144.72154F, 0.0F, 316.40982F, 0.0F, 316.40982F, 0.0F);
    path = new Path();
    PATH_INDETERMINATE_HORIZONTAL_RECT2_SCALE_X = path;
    path.moveTo(0.0F, 0.1F);
    path.lineTo(1.0F, 0.5713795F);
    path.lineTo(2.0F, 0.90995026F);
    path.lineTo(3.0F, 0.1F);
  }
  
  public static Animator createIndeterminate(Object paramObject) {
    ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(paramObject, "trimPathStart", new float[] { 0.0F, 0.75F });
    objectAnimator2.setDuration(1333L);
    objectAnimator2.setInterpolator((TimeInterpolator)Interpolators.TRIM_PATH_START.INSTANCE);
    objectAnimator2.setRepeatCount(-1);
    ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(paramObject, "trimPathEnd", new float[] { 0.0F, 0.75F });
    objectAnimator1.setDuration(1333L);
    objectAnimator1.setInterpolator((TimeInterpolator)Interpolators.TRIM_PATH_END.INSTANCE);
    objectAnimator1.setRepeatCount(-1);
    paramObject = ObjectAnimator.ofFloat(paramObject, "trimPathOffset", new float[] { 0.0F, 0.25F });
    paramObject.setDuration(1333L);
    paramObject.setInterpolator((TimeInterpolator)Interpolators.LINEAR.INSTANCE);
    paramObject.setRepeatCount(-1);
    AnimatorSet animatorSet = new AnimatorSet();
    animatorSet.playTogether(new Animator[] { (Animator)objectAnimator2, (Animator)objectAnimator1, (Animator)paramObject });
    return (Animator)animatorSet;
  }
  
  public static Animator createIndeterminateHorizontalRect1(Object paramObject) {
    ObjectAnimator objectAnimator = ObjectAnimatorCompat.ofFloat(paramObject, "translateX", null, PATH_INDETERMINATE_HORIZONTAL_RECT1_TRANSLATE_X);
    objectAnimator.setDuration(2000L);
    objectAnimator.setInterpolator((TimeInterpolator)Interpolators.INDETERMINATE_HORIZONTAL_RECT1_TRANSLATE_X.INSTANCE);
    objectAnimator.setRepeatCount(-1);
    paramObject = ObjectAnimatorCompat.ofFloat(paramObject, null, "scaleX", PATH_INDETERMINATE_HORIZONTAL_RECT1_SCALE_X);
    paramObject.setDuration(2000L);
    paramObject.setInterpolator((TimeInterpolator)Interpolators.INDETERMINATE_HORIZONTAL_RECT1_SCALE_X.INSTANCE);
    paramObject.setRepeatCount(-1);
    AnimatorSet animatorSet = new AnimatorSet();
    animatorSet.playTogether(new Animator[] { (Animator)objectAnimator, (Animator)paramObject });
    return (Animator)animatorSet;
  }
  
  public static Animator createIndeterminateHorizontalRect2(Object paramObject) {
    ObjectAnimator objectAnimator1 = ObjectAnimatorCompat.ofFloat(paramObject, "translateX", null, PATH_INDETERMINATE_HORIZONTAL_RECT2_TRANSLATE_X);
    objectAnimator1.setDuration(2000L);
    objectAnimator1.setInterpolator((TimeInterpolator)Interpolators.INDETERMINATE_HORIZONTAL_RECT2_TRANSLATE_X.INSTANCE);
    objectAnimator1.setRepeatCount(-1);
    ObjectAnimator objectAnimator2 = ObjectAnimatorCompat.ofFloat(paramObject, null, "scaleX", PATH_INDETERMINATE_HORIZONTAL_RECT2_SCALE_X);
    objectAnimator2.setDuration(2000L);
    objectAnimator2.setInterpolator((TimeInterpolator)Interpolators.INDETERMINATE_HORIZONTAL_RECT2_SCALE_X.INSTANCE);
    objectAnimator2.setRepeatCount(-1);
    paramObject = new AnimatorSet();
    paramObject.playTogether(new Animator[] { (Animator)objectAnimator1, (Animator)objectAnimator2 });
    return (Animator)paramObject;
  }
  
  public static Animator createIndeterminateRotation(Object paramObject) {
    paramObject = ObjectAnimator.ofFloat(paramObject, "rotation", new float[] { 0.0F, 720.0F });
    paramObject.setDuration(6665L);
    paramObject.setInterpolator((TimeInterpolator)Interpolators.LINEAR.INSTANCE);
    paramObject.setRepeatCount(-1);
    return (Animator)paramObject;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\me\zhanghai\android\materialprogressbar\Animators.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */