import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;

public final class bl1 {
  public static final rp0 c = new rp0("SessionManager", null);
  
  public final ff2 a;
  
  public final Context b;
  
  public bl1(ff2 paramff2, Context paramContext) {
    this.a = paramff2;
    this.b = paramContext;
  }
  
  public final void a(cl1 paramcl1, Class paramClass) {
    n21.j();
    try {
      ff2 ff21 = this.a;
      jg2 jg2 = new jg2();
      this(paramcl1, paramClass);
      Parcel parcel = ff21.o();
      mh2.c(parcel, jg2);
      ff21.o0(parcel, 2);
      return;
    } catch (RemoteException remoteException) {
      String str = ff2.class.getSimpleName();
      c.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "addSessionManagerListener", str });
      return;
    } 
  }
  
  public final void b(boolean paramBoolean) {
    rp0 rp01 = c;
    n21.j();
    try {
      String str = this.b.getPackageName();
      Log.i(rp01.a, rp01.c("End session for %s", new Object[] { str }));
      ff2 ff21 = this.a;
      Parcel parcel = ff21.o();
      int i = mh2.a;
      parcel.writeInt(1);
      parcel.writeInt(paramBoolean);
      ff21.o0(parcel, 6);
      return;
    } catch (RemoteException remoteException) {
      rp01.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "endCurrentSession", ff2.class.getSimpleName() });
      return;
    } 
  }
  
  public final oj c() {
    n21.j();
    al1 al1 = d();
    return (al1 != null && al1 instanceof oj) ? (oj)al1 : null;
  }
  
  public final al1 d() {
    n21.j();
    try {
      ff2 ff21 = this.a;
      Parcel parcel = ff21.u(ff21.o(), 1);
      sg0 sg0 = j31.p0(parcel.readStrongBinder());
      parcel.recycle();
      return (al1)j31.q0(sg0);
    } catch (RemoteException remoteException) {
      String str = ff2.class.getSimpleName();
      c.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "getWrappedCurrentSession", str });
      return null;
    } 
  }
  
  public final void e(cl1 paramcl1, Class paramClass) {
    n21.j();
    if (paramcl1 == null)
      return; 
    try {
      ff2 ff21 = this.a;
      jg2 jg2 = new jg2();
      this(paramcl1, paramClass);
      Parcel parcel = ff21.o();
      mh2.c(parcel, jg2);
      ff21.o0(parcel, 3);
      return;
    } catch (RemoteException remoteException) {
      String str = ff2.class.getSimpleName();
      c.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "removeSessionManagerListener", str });
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bl1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */