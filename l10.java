import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

public abstract class l10 {
  public static final int[] a = new int[] { 16842912 };
  
  public static final int[] b = new int[0];
  
  public static final Rect c = new Rect();
  
  public static void a(Drawable paramDrawable) {
    String str = paramDrawable.getClass().getName();
    int i = Build.VERSION.SDK_INT;
    if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(str)) {
      int[] arrayOfInt = paramDrawable.getState();
      if (arrayOfInt == null || arrayOfInt.length == 0) {
        paramDrawable.setState(a);
      } else {
        paramDrawable.setState(b);
      } 
      paramDrawable.setState(arrayOfInt);
    } 
  }
  
  public static Rect b(Drawable paramDrawable) {
    Insets insets;
    int i = Build.VERSION.SDK_INT;
    if (i >= 29) {
      insets = i10.a(paramDrawable);
      return new Rect(tp.a(insets), tp.i(insets), tp.l(insets), tp.n(insets));
    } 
    if (i < 29) {
      if (h10.a)
        try {
          Object object = h10.b.invoke(insets, null);
          if (object != null)
            return new Rect(h10.c.getInt(object), h10.d.getInt(object), h10.e.getInt(object), h10.f.getInt(object)); 
        } catch (IllegalAccessException|java.lang.reflect.InvocationTargetException illegalAccessException) {} 
    } else {
      boolean bool = h10.a;
    } 
    return c;
  }
  
  public static PorterDuff.Mode c(int paramInt, PorterDuff.Mode paramMode) {
    if (paramInt != 3) {
      if (paramInt != 5) {
        if (paramInt != 9) {
          switch (paramInt) {
            default:
              return paramMode;
            case 16:
              return PorterDuff.Mode.ADD;
            case 15:
              return PorterDuff.Mode.SCREEN;
            case 14:
              break;
          } 
          return PorterDuff.Mode.MULTIPLY;
        } 
        return PorterDuff.Mode.SRC_ATOP;
      } 
      return PorterDuff.Mode.SRC_IN;
    } 
    return PorterDuff.Mode.SRC_OVER;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\l10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */