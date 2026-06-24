import android.content.Context;
import android.os.PowerManager;

public abstract class g52 {
  static {
    qp0.j("WakeLocks");
  }
  
  public static final PowerManager.WakeLock a(Context paramContext) {
    paramContext.getClass();
    null = paramContext.getApplicationContext().getSystemService("power");
    null.getClass();
    null = null;
    String str = "WorkManager: ".concat("ProcessorForegroundLck");
    null = null.newWakeLock(1, str);
    synchronized (h52.a) {
      str = h52.b.put(null, str);
      null.getClass();
      return null;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\g52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */