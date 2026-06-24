import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class r02 {
  public static final r02 a;
  
  static {
    Object object;
    try {
      Class<?> clazz = Class.forName(OETETTfAjV.XCWZwiwYj);
      Field field = clazz.getDeclaredField("theUnsafe");
      field.setAccessible(true);
      Object object1 = field.get(null);
      Method method = clazz.getMethod("allocateInstance", new Class[] { Class.class });
      object = new n02();
      this(method, object1);
    } catch (Exception null) {
      try {
        Method method1 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[] { Class.class });
        method1.setAccessible(true);
        int i = ((Integer)method1.invoke(null, new Object[] { Object.class })).intValue();
        Method method2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[] { Class.class, int.class });
        method2.setAccessible(true);
        o02 o02 = new o02();
        this(i, method2);
      } catch (Exception exception) {
        try {
          Method method = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[] { Class.class, Class.class });
          method.setAccessible(true);
          p02 p02 = new p02();
          this(method);
        } catch (Exception exception1) {
          object = new Object();
        } 
      } 
    } 
    a = (r02)object;
  }
  
  public abstract Object a(Class paramClass);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\r02.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */