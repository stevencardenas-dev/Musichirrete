import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

public final class vm1 extends he0 {
  public final boolean A = true;
  
  public final m2 B;
  
  public final Bundle C;
  
  public final Integer D;
  
  public vm1(Context paramContext, Looper paramLooper, m2 paramm2, Bundle paramBundle, me0 paramme0, ne0 paramne0) {
    super(paramContext, paramLooper, 44, paramm2, paramme0, paramne0, 0);
    this.B = paramm2;
    this.C = paramBundle;
    this.D = (Integer)paramm2.f;
  }
  
  public final IInterface a(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
    return (iInterface instanceof hb2) ? (hb2)iInterface : new na2(paramIBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
  }
  
  public final Bundle f() {
    m2 m21 = this.B;
    String str = (String)m21.c;
    boolean bool = this.c.getPackageName().equals(str);
    Bundle bundle = this.C;
    if (!bool)
      bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String)m21.c); 
    return bundle;
  }
  
  public final int g() {
    return 12451000;
  }
  
  public final String j() {
    return "com.google.android.gms.signin.internal.ISignInService";
  }
  
  public final String k() {
    return "com.google.android.gms.signin.service.START";
  }
  
  public final boolean q() {
    return this.A;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vm1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */