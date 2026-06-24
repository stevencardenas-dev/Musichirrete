import android.os.Bundle;
import android.os.RemoteException;

public final class we2 extends ot2 {
  public final int c;
  
  public final nt1 e;
  
  public final dg2 f;
  
  public we2(dg2 paramdg2, nt1 paramnt11, int paramInt, nt1 paramnt12) {
    super(paramnt11);
  }
  
  public final void a() {
    nt1 nt11 = this.e;
    int i = this.c;
    dg2 dg21 = this.f;
    try {
      ug2 ug2 = dg21.b.m;
      String str = dg21.a;
      Bundle bundle = dg2.d();
      ze2 ze2 = new ze2();
      this(dg21, nt11, 0);
      ug2.l0(str, i, bundle, ze2);
      return;
    } catch (RemoteException remoteException) {
      dg2.c.c(remoteException, "cancelInstall(%d)", new Object[] { Integer.valueOf(i) });
      nt11.c(new RuntimeException((Throwable)remoteException));
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\we2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */