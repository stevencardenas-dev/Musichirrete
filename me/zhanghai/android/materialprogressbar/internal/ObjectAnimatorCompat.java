package me.zhanghai.android.materialprogressbar.internal;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;

public class ObjectAnimatorCompat {
  public static <T> ObjectAnimator ofArgb(T paramT, Property<T, Integer> paramProperty, int... paramVarArgs) {
    return ObjectAnimatorCompatLollipop.ofArgb(paramT, paramProperty, paramVarArgs);
  }
  
  public static ObjectAnimator ofArgb(Object paramObject, String paramString, int... paramVarArgs) {
    return ObjectAnimatorCompatLollipop.ofArgb(paramObject, paramString, paramVarArgs);
  }
  
  public static <T> ObjectAnimator ofFloat(T paramT, Property<T, Float> paramProperty1, Property<T, Float> paramProperty2, Path paramPath) {
    return ObjectAnimatorCompatLollipop.ofFloat(paramT, paramProperty1, paramProperty2, paramPath);
  }
  
  public static ObjectAnimator ofFloat(Object paramObject, String paramString1, String paramString2, Path paramPath) {
    return ObjectAnimatorCompatLollipop.ofFloat(paramObject, paramString1, paramString2, paramPath);
  }
  
  public static <T> ObjectAnimator ofInt(T paramT, Property<T, Integer> paramProperty1, Property<T, Integer> paramProperty2, Path paramPath) {
    return ObjectAnimatorCompatLollipop.ofInt(paramT, paramProperty1, paramProperty2, paramPath);
  }
  
  public static ObjectAnimator ofInt(Object paramObject, String paramString1, String paramString2, Path paramPath) {
    return ObjectAnimatorCompatLollipop.ofInt(paramObject, paramString1, paramString2, paramPath);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\me\zhanghai\android\materialprogressbar\internal\ObjectAnimatorCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */