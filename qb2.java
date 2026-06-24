import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

public final class qb2 extends he0 {
  public final st1 A;
  
  public qb2(Context paramContext, Looper paramLooper, m2 paramm2, st1 paramst1, qa2 paramqa21, qa2 paramqa22) {
    super(paramContext, paramLooper, 270, paramm2, paramqa21, paramqa22, 0);
    this.A = paramst1;
  }
  
  public final IInterface a(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
    return (iInterface instanceof mb2) ? (mb2)iInterface : new na2(paramIBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
  }
  
  public final u70[] d() {
    return dd1.j;
  }
  
  public final Bundle f() {
    this.A.getClass();
    return new Bundle();
  }
  
  public final int g() {
    return 203400000;
  }
  
  public final String j() {
    return "com.google.android.gms.common.internal.service.IClientTelemetryService";
  }
  
  public final String k() {
    return "com.google.android.gms.common.telemetry.service.START";
  }
  
  public final boolean l() {
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */