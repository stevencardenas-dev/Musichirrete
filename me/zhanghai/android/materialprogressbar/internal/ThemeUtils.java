package me.zhanghai.android.materialprogressbar.internal;

import android.content.Context;
import android.content.res.TypedArray;

public class ThemeUtils {
  public static int getColorFromAttrRes(int paramInt, Context paramContext) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(new int[] { paramInt });
    try {
      paramInt = typedArray.getColor(0, 0);
      return paramInt;
    } finally {
      typedArray.recycle();
    } 
  }
  
  public static float getFloatFromAttrRes(int paramInt, Context paramContext) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(new int[] { paramInt });
    try {
      return typedArray.getFloat(0, 0.0F);
    } finally {
      typedArray.recycle();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\me\zhanghai\android\materialprogressbar\internal\ThemeUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */