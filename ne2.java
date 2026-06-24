import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;

public final class ne2 extends ot2 {
  public final int c;
  
  public final ArrayList e;
  
  public final nt1 f;
  
  public final dg2 g;
  
  public final void a() {
    int i = this.c;
    dg2 dg21 = this.g;
    ArrayList arrayList = this.e;
    nt1 nt11 = this.f;
    switch (i) {
      default:
        try {
          ug2 ug2 = dg21.b.m;
          String str = dg21.a;
          ArrayList arrayList1 = dg2.b(arrayList);
          Bundle bundle = dg2.d();
          ze2 ze2 = new ze2();
          this(dg21, nt11, 3);
          ug2.O(str, arrayList1, bundle, ze2);
        } catch (RemoteException remoteException) {
          dg2.c.c(remoteException, "deferredLanguageUninstall(%s)", new Object[] { arrayList });
          nt11.c(new RuntimeException((Throwable)remoteException));
        } 
        return;
      case 0:
        break;
    } 
    try {
      ug2 ug2 = ((dg2)remoteException).b.m;
      String str = ((dg2)remoteException).a;
      ArrayList arrayList1 = dg2.b(arrayList);
      Bundle bundle = dg2.d();
      ze2 ze2 = new ze2();
      this((dg2)remoteException, nt11, 2);
      ug2.w(str, arrayList1, bundle, ze2);
    } catch (RemoteException remoteException1) {
      dg2.c.c(remoteException1, "deferredLanguageInstall(%s)", new Object[] { arrayList });
      nt11.c(new RuntimeException((Throwable)remoteException1));
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ne2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */