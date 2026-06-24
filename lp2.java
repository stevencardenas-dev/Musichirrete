import android.os.IBinder;
import android.os.IInterface;

public final class lp2 extends he0 {
  public final IInterface a(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
    return (iInterface instanceof yd2) ? (yd2)iInterface : new na2(paramIBinder, "com.google.android.gms.cast.internal.ICastService", 1);
  }
  
  public final u70[] d() {
    return g92.m;
  }
  
  public final int g() {
    return 12451000;
  }
  
  public final String j() {
    return "com.google.android.gms.cast.internal.ICastService";
  }
  
  public final String k() {
    return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lp2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */