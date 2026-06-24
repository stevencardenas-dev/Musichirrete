import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

public abstract class u10 {
  public static final Method a;
  
  public static final Method b;
  
  public static final Method c;
  
  public static final boolean d;
  
  static {
    try {
      Class<int> clazz = int.class;
      Class<boolean> clazz2 = boolean.class;
      Class<float> clazz1 = float.class;
      Method method2 = AbsListView.class.getDeclaredMethod("positionSelector", new Class[] { clazz, View.class, clazz2, clazz1, clazz1 });
      a = method2;
      method2.setAccessible(true);
      method2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", new Class[] { clazz });
      b = method2;
      method2.setAccessible(true);
      Method method1 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", new Class[] { clazz });
      c = method1;
      method1.setAccessible(true);
      d = true;
      return;
    } catch (NoSuchMethodException noSuchMethodException) {
      noSuchMethodException.printStackTrace();
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */