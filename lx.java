import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class lx extends qz1 {
  public final Object k = new Object();
  
  public final ExecutorService l = Executors.newFixedThreadPool(4, new kx());
  
  public volatile Handler m;
  
  public static Handler Z(Looper paramLooper) {
    if (Build.VERSION.SDK_INT >= 28)
      return k5.a(paramLooper); 
    try {
      return Handler.class.getDeclaredConstructor(new Class[] { Looper.class, Handler.Callback.class, boolean.class }).newInstance(new Object[] { paramLooper, null, Boolean.TRUE });
    } catch (IllegalAccessException|InstantiationException|NoSuchMethodException illegalAccessException) {
      return new Handler(paramLooper);
    } catch (InvocationTargetException invocationTargetException) {
      return new Handler(paramLooper);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */