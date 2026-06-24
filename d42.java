import android.os.Build;
import java.lang.reflect.Method;

public abstract class d42 {
  public static boolean a;
  
  public static Method b;
  
  public static final boolean c;
  
  static {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 27) {
      bool = true;
    } else {
      bool = false;
    } 
    c = bool;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d42.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */