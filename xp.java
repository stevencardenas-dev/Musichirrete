import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.Executor;

public final class xp {
  public static final Object a = new Object();
  
  public static volatile xp b;
  
  public final void a(Context paramContext, np2 paramnp2) {
    try {
      paramContext.unbindService(paramnp2);
    } catch (IllegalArgumentException|IllegalStateException|java.util.NoSuchElementException illegalArgumentException) {}
  }
  
  public final boolean b(Context paramContext, String paramString, Intent paramIntent, np2 paramnp2, Executor paramExecutor) {
    boolean bool;
    ComponentName componentName = paramIntent.getComponent();
    if (componentName != null) {
      String str = componentName.getPackageName();
      "com.google.android.gms".equals(str);
      try {
        int i = ((t82.a(paramContext)).b.getPackageManager().getApplicationInfo(str, 0)).flags;
        if ((i & 0x200000) != 0) {
          Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
          return false;
        } 
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {}
    } 
    Executor executor = paramExecutor;
    if (paramExecutor == null)
      executor = null; 
    if (Build.VERSION.SDK_INT >= 29 && executor != null) {
      bool = paramContext.bindService(paramIntent, 4225, executor, paramnp2);
    } else {
      bool = paramContext.bindService(paramIntent, paramnp2, 4225);
    } 
    return bool;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */