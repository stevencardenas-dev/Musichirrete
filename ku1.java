import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

public abstract class ku1 {
  public static final ThreadLocal a = new ThreadLocal();
  
  public static final int[] b = new int[] { -16842910 };
  
  public static final int[] c = new int[] { 16842908 };
  
  public static final int[] d = new int[] { 16842919 };
  
  public static final int[] e = new int[] { 16842912 };
  
  public static final int[] f = new int[0];
  
  public static final int[] g = new int[1];
  
  public static void a(Context paramContext, View paramView) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(nc1.j);
    try {
      if (!typedArray.hasValue(117)) {
        StringBuilder stringBuilder = new StringBuilder();
        this("View ");
        stringBuilder.append(paramView.getClass());
        stringBuilder.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
        Log.e("ThemeUtils", stringBuilder.toString());
      } 
    } finally {}
    typedArray.recycle();
  }
  
  public static int b(Context paramContext, int paramInt) {
    ColorStateList colorStateList = d(paramContext, paramInt);
    if (colorStateList != null && colorStateList.isStateful())
      return colorStateList.getColorForState(b, colorStateList.getDefaultColor()); 
    ThreadLocal<TypedValue> threadLocal = a;
    TypedValue typedValue2 = threadLocal.get();
    TypedValue typedValue1 = typedValue2;
    if (typedValue2 == null) {
      typedValue1 = new TypedValue();
      threadLocal.set(typedValue1);
    } 
    paramContext.getTheme().resolveAttribute(16842803, typedValue1, true);
    float f = typedValue1.getFloat();
    paramInt = c(paramContext, paramInt);
    return jn.i(paramInt, Math.round(Color.alpha(paramInt) * f));
  }
  
  public static int c(Context paramContext, int paramInt) {
    int[] arrayOfInt = g;
    arrayOfInt[0] = paramInt;
    TypedArray typedArray = paramContext.obtainStyledAttributes(null, arrayOfInt);
    try {
      paramInt = typedArray.getColor(0, 0);
      return paramInt;
    } finally {
      typedArray.recycle();
    } 
  }
  
  public static ColorStateList d(Context paramContext, int paramInt) {
    int[] arrayOfInt = g;
    arrayOfInt[0] = paramInt;
    TypedArray typedArray = paramContext.obtainStyledAttributes(null, arrayOfInt);
    try {
      if (typedArray.hasValue(0)) {
        paramInt = typedArray.getResourceId(0, 0);
        if (paramInt != 0) {
          ColorStateList colorStateList = n21.y(paramContext, paramInt);
          if (colorStateList != null)
            return colorStateList; 
        } 
      } 
      return typedArray.getColorStateList(0);
    } finally {
      typedArray.recycle();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ku1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */