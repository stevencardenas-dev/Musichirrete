import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

public abstract class yg1 {
  public static final int[] a = new int[] { 16842919 };
  
  public static final int[] b = new int[] { 16842908 };
  
  public static final int[] c = new int[] { 16842913, 16842919 };
  
  public static final int[] d = new int[] { 16842913 };
  
  public static final int[] e = new int[] { 16842910, 16842919 };
  
  public static final String f = yg1.class.getSimpleName();
  
  public static ColorStateList a(ColorStateList paramColorStateList) {
    int[] arrayOfInt1 = d;
    int j = b(paramColorStateList, c);
    int[] arrayOfInt3 = b;
    int k = b(paramColorStateList, arrayOfInt3);
    int[] arrayOfInt2 = StateSet.NOTHING;
    int i = b(paramColorStateList, a);
    return new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt3, arrayOfInt2 }, new int[] { j, k, i });
  }
  
  public static int b(ColorStateList paramColorStateList, int[] paramArrayOfint) {
    boolean bool;
    if (paramColorStateList != null) {
      bool = paramColorStateList.getColorForState(paramArrayOfint, paramColorStateList.getDefaultColor());
    } else {
      bool = false;
    } 
    return jn.i(bool, Math.min(Color.alpha(bool) * 2, 255));
  }
  
  public static ColorStateList c(ColorStateList paramColorStateList) {
    if (paramColorStateList != null) {
      if (Build.VERSION.SDK_INT <= 27 && Color.alpha(paramColorStateList.getDefaultColor()) == 0 && Color.alpha(paramColorStateList.getColorForState(e, 0)) != 0)
        Log.w(f, "Use a non-transparent color for the default color as it will be used to finish ripple animations."); 
      return paramColorStateList;
    } 
    return ColorStateList.valueOf(0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yg1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */