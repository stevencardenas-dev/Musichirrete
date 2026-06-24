import android.os.Build;
import java.lang.reflect.Method;

public final class uj1 {
  public Method a;
  
  public Method b;
  
  public Method c;
  
  public static void a() {
    if (Build.VERSION.SDK_INT < 29)
      return; 
    throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uj1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */