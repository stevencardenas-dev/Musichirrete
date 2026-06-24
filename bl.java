import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

public final class bl implements ServiceConnection {
  public final int b;
  
  public final Object c;
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder) {
    IInterface iInterface;
    wc2 wc2;
    md2 md2;
    k92 k92;
    int i = this.b;
    wi2 wi2 = null;
    ComponentName componentName = null;
    switch (i) {
      default:
        ph2.g("BillingClientTesting", "Billing Override Service connected.");
        wi2 = (wi2)this.c;
        i = if2.f;
        if (paramIBinder == null) {
          paramComponentName = componentName;
        } else {
          iInterface = paramIBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
          if (iInterface instanceof mf2) {
            iInterface = iInterface;
          } else {
            iInterface = new na2(paramIBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 3);
          } 
        } 
        wi2.E = (mf2)iInterface;
        wi2.D = 2;
        wi2.J(26);
        return;
      case 2:
        md2 = (md2)this.c;
        md2.b.e("ServiceConnectionImpl.onServiceConnected(%s)", new Object[] { iInterface });
        wc2 = new wc2(this, paramIBinder);
        md2.a().post(wc2);
        return;
      case 1:
        k92 = (k92)this.c;
        k92.b.a("ServiceConnectionImpl.onServiceConnected(%s)", new Object[] { wc2 });
        object = new i92(this, paramIBinder);
        k92.a().post((Runnable)object);
        return;
      case 0:
        break;
    } 
    fl fl = (fl)this.c;
    i = pc1.e;
    if (paramIBinder == null) {
      k92 k921 = k92;
    } else {
      IInterface iInterface1 = paramIBinder.queryLocalInterface("aidl.krosbits.RCC_i_v1");
      if (iInterface1 != null && iInterface1 instanceof qc1) {
        iInterface1 = iInterface1;
      } else {
        object = new Object();
        ((oc1)object).e = paramIBinder;
      } 
    } 
    fl.z = (qc1)object;
    try {
    
    } finally {
      object = null;
    } 
    Object object = this.c;
    if (((fl)object).J)
      object.W(((hc)object).b, true); 
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName) {
    wi2 wi2;
    bd2 bd2;
    j92 j92;
    md2 md2;
    k92 k92;
    switch (this.b) {
      default:
        ph2.h("BillingClientTesting", "Billing Override Service disconnected.");
        wi2 = (wi2)this.c;
        wi2.E = null;
        wi2.D = 0;
        return;
      case 2:
        md2 = (md2)this.c;
        md2.b.e("ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[] { wi2 });
        bd2 = new bd2(0, this);
        md2.a().post(bd2);
        return;
      case 1:
        k92 = (k92)this.c;
        k92.b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[] { bd2 });
        j92 = new j92(this);
        k92.a().post(j92);
        return;
      case 0:
        break;
    } 
    fl fl = (fl)this.c;
    fl.z = null;
    if (!fl.T)
      fl.i0(); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */