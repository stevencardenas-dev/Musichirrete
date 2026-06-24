import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

public final class w9 {
  public final Handler a;
  
  public w9() {
    Looper looper = Looper.getMainLooper();
    if (Build.VERSION.SDK_INT >= 28) {
      Handler handler = k5.b(looper);
    } else {
      try {
        Handler handler = Handler.class.getDeclaredConstructor(new Class[] { Looper.class, Handler.Callback.class, boolean.class }).newInstance(new Object[] { looper, null, Boolean.TRUE });
      } catch (IllegalAccessException illegalAccessException) {
        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", illegalAccessException);
        Handler handler = new Handler(looper);
      } catch (InstantiationException instantiationException) {
      
      } catch (NoSuchMethodException noSuchMethodException) {
      
      } catch (InvocationTargetException invocationTargetException) {}
    } 
    this.a = (Handler)invocationTargetException;
  }
  
  public w9(Handler paramHandler, int paramInt) {
    this.a = paramHandler;
  }
  
  public void a(int paramInt) {
    this.a.sendEmptyMessage(paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\w9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */