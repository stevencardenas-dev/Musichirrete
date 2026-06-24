import android.graphics.Rect;
import android.os.Build;
import android.view.View;

public abstract class c42 {
  public static final i42 a;
  
  public static final xj b = new xj(Float.class, "translationAlpha", 9);
  
  static {
    new xj(Rect.class, "clipBounds", 10);
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a.Z(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void b(View paramView, int paramInt) {
    a.a0(paramView, paramInt);
  }
  
  static {
    if (Build.VERSION.SDK_INT >= 29) {
      a = (i42)new Object();
    } else {
      a = (i42)new Object();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */