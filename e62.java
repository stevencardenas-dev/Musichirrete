import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public final class e62 extends l62 {
  public static Field g;
  
  public static boolean h;
  
  public static Constructor i;
  
  public static boolean j;
  
  public WindowInsets e = j();
  
  public fi0 f;
  
  public e62() {}
  
  public e62(x62 paramx62) {
    super(paramx62);
  }
  
  public static WindowInsets j() {
    if (!h) {
      try {
        g = WindowInsets.class.getDeclaredField("CONSUMED");
      } catch (ReflectiveOperationException reflectiveOperationException) {
        Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", reflectiveOperationException);
      } 
      h = true;
    } 
    Field field = g;
    if (field != null)
      try {
        WindowInsets windowInsets = (WindowInsets)field.get(null);
        if (windowInsets != null)
          return new WindowInsets(windowInsets); 
      } catch (ReflectiveOperationException reflectiveOperationException) {
        Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", reflectiveOperationException);
      }  
    if (!j) {
      try {
        i = WindowInsets.class.getConstructor(new Class[] { Rect.class });
      } catch (ReflectiveOperationException reflectiveOperationException) {
        Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", reflectiveOperationException);
      } 
      j = true;
    } 
    Constructor<WindowInsets> constructor = i;
    if (constructor != null)
      try {
        Rect rect = new Rect();
        this();
        return constructor.newInstance(new Object[] { rect });
      } catch (ReflectiveOperationException reflectiveOperationException) {
        Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", reflectiveOperationException);
      }  
    return null;
  }
  
  public x62 b() {
    a();
    x62 x62 = x62.h(null, this.e);
    fi0[] arrayOfFi0 = this.b;
    u62 u62 = x62.a;
    u62.v(arrayOfFi0);
    u62.x(this.f);
    u62.u(null);
    u62.z(this.c);
    u62.A(this.d);
    return x62;
  }
  
  public void f(fi0 paramfi0) {
    this.f = paramfi0;
  }
  
  public void h(fi0 paramfi0) {
    WindowInsets windowInsets = this.e;
    if (windowInsets != null)
      this.e = windowInsets.replaceSystemWindowInsets(paramfi0.a, paramfi0.b, paramfi0.c, paramfi0.d); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\e62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */