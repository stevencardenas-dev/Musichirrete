package me.zhanghai.android.materialprogressbar.internal;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.Property;

class ObjectAnimatorCompatBase {
  private static final int NUM_POINTS = 201;
  
  private static void calculateXYValues(Path paramPath, float[] paramArrayOffloat1, float[] paramArrayOffloat2) {
    PathMeasure pathMeasure = new PathMeasure(paramPath, false);
    float f = pathMeasure.getLength();
    float[] arrayOfFloat = new float[2];
    for (byte b = 0; b < 'É'; b++) {
      pathMeasure.getPosTan(b * f / 200.0F, arrayOfFloat, null);
      paramArrayOffloat1[b] = arrayOfFloat[0];
      paramArrayOffloat2[b] = arrayOfFloat[1];
    } 
  }
  
  private static void calculateXYValues(Path paramPath, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    PathMeasure pathMeasure = new PathMeasure(paramPath, false);
    float f = pathMeasure.getLength();
    float[] arrayOfFloat = new float[2];
    for (byte b = 0; b < 'É'; b++) {
      pathMeasure.getPosTan(b * f / 200.0F, arrayOfFloat, null);
      paramArrayOfint1[b] = Math.round(arrayOfFloat[0]);
      paramArrayOfint2[b] = Math.round(arrayOfFloat[1]);
    } 
  }
  
  public static <T> ObjectAnimator ofArgb(T paramT, Property<T, Integer> paramProperty, int... paramVarArgs) {
    ObjectAnimator objectAnimator = ObjectAnimator.ofInt(paramT, paramProperty, paramVarArgs);
    objectAnimator.setEvaluator((TypeEvaluator)new ArgbEvaluator());
    return objectAnimator;
  }
  
  public static ObjectAnimator ofArgb(Object paramObject, String paramString, int... paramVarArgs) {
    paramObject = ObjectAnimator.ofInt(paramObject, paramString, paramVarArgs);
    paramObject.setEvaluator((TypeEvaluator)new ArgbEvaluator());
    return (ObjectAnimator)paramObject;
  }
  
  public static <T> ObjectAnimator ofFloat(T paramT, Property<T, Float> paramProperty1, Property<T, Float> paramProperty2, Path paramPath) {
    float[] arrayOfFloat2 = new float[201];
    float[] arrayOfFloat1 = new float[201];
    calculateXYValues(paramPath, arrayOfFloat2, arrayOfFloat1);
    return ObjectAnimator.ofPropertyValuesHolder(paramT, new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat(paramProperty1, arrayOfFloat2), PropertyValuesHolder.ofFloat(paramProperty2, arrayOfFloat1) });
  }
  
  public static ObjectAnimator ofFloat(Object paramObject, String paramString1, String paramString2, Path paramPath) {
    float[] arrayOfFloat1 = new float[201];
    float[] arrayOfFloat2 = new float[201];
    calculateXYValues(paramPath, arrayOfFloat1, arrayOfFloat2);
    return ObjectAnimator.ofPropertyValuesHolder(paramObject, new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat(paramString1, arrayOfFloat1), PropertyValuesHolder.ofFloat(paramString2, arrayOfFloat2) });
  }
  
  public static <T> ObjectAnimator ofInt(T paramT, Property<T, Integer> paramProperty1, Property<T, Integer> paramProperty2, Path paramPath) {
    int[] arrayOfInt1 = new int[201];
    int[] arrayOfInt2 = new int[201];
    calculateXYValues(paramPath, arrayOfInt1, arrayOfInt2);
    return ObjectAnimator.ofPropertyValuesHolder(paramT, new PropertyValuesHolder[] { PropertyValuesHolder.ofInt(paramProperty1, arrayOfInt1), PropertyValuesHolder.ofInt(paramProperty2, arrayOfInt2) });
  }
  
  public static ObjectAnimator ofInt(Object paramObject, String paramString1, String paramString2, Path paramPath) {
    int[] arrayOfInt1 = new int[201];
    int[] arrayOfInt2 = new int[201];
    calculateXYValues(paramPath, arrayOfInt1, arrayOfInt2);
    return ObjectAnimator.ofPropertyValuesHolder(paramObject, new PropertyValuesHolder[] { PropertyValuesHolder.ofInt(paramString1, arrayOfInt1), PropertyValuesHolder.ofInt(paramString2, arrayOfInt2) });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\me\zhanghai\android\materialprogressbar\internal\ObjectAnimatorCompatBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */