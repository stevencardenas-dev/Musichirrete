import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class wz1 extends vz1 {
  public final Typeface c0(Object paramObject) {
    Integer integer = Integer.valueOf(-1);
    try {
      Object object = Array.newInstance(this.p, 1);
      Array.set(object, 0, paramObject);
      return (Typeface)this.v.invoke(null, new Object[] { object, "sans-serif", integer, integer });
    } catch (IllegalAccessException illegalAccessException) {
    
    } catch (InvocationTargetException invocationTargetException) {}
    k91.n(invocationTargetException);
    return null;
  }
  
  public final Method f0(Class<?> paramClass) {
    Class<?> clazz = Array.newInstance(paramClass, 1).getClass();
    paramClass = int.class;
    Method method = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[] { clazz, String.class, paramClass, paramClass });
    method.setAccessible(true);
    return method;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */