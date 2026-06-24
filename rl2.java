import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

public final class rl2 extends he0 {
  public final AtomicReference A = new AtomicReference();
  
  public rl2(Context paramContext, Looper paramLooper, m2 paramm2, qa2 paramqa21, qa2 paramqa22) {
    super(paramContext, paramLooper, 41, paramm2, paramqa21, paramqa22, 0);
  }
  
  public final IInterface a(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
    return (iInterface instanceof ol2) ? (ol2)iInterface : new na2(paramIBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService", 1);
  }
  
  public final void b() {
    try {
      if (this.A.getAndSet(null) != null) {
        ClassCastException classCastException = new ClassCastException();
        this();
        throw classCastException;
      } 
    } catch (RemoteException remoteException) {
      Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", (Throwable)remoteException);
    } 
    super.b();
  }
  
  public final u70[] d() {
    return m92.o;
  }
  
  public final int g() {
    return 12600000;
  }
  
  public final String j() {
    return "com.google.android.gms.usagereporting.internal.IUsageReportingService";
  }
  
  public final String k() {
    return "com.google.android.gms.usagereporting.service.START";
  }
  
  public final boolean r() {
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rl2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */