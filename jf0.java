import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.Constructor;

public abstract class jf0 {
  public static volatile Choreographer choreographer;
  
  static {
    qg1 qg11;
    qg1 qg12;
    try {
      if0 if01 = new if0();
      this(a(Looper.getMainLooper()), false);
    } finally {
      Exception exception = null;
    } 
    if (qg11 instanceof qg1)
      qg12 = null; 
    if0 if0 = (if0)qg12;
  }
  
  public static final Handler a(Looper paramLooper) {
    Object object;
    if (Build.VERSION.SDK_INT >= 28) {
      object = Handler.class.getDeclaredMethod("createAsync", new Class[] { Looper.class }).invoke(null, new Object[] { paramLooper });
      object.getClass();
      return (Handler)object;
    } 
    try {
      Constructor<Handler> constructor = Handler.class.getDeclaredConstructor(new Class[] { Looper.class, Handler.Callback.class, boolean.class });
      return constructor.newInstance(new Object[] { object, null, Boolean.TRUE });
    } catch (NoSuchMethodException noSuchMethodException) {
      return new Handler((Looper)object);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jf0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */