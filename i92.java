import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

public final class i92 extends ia2 {
  public final IBinder c;
  
  public final bl e;
  
  public i92(bl parambl, IBinder paramIBinder) {}
  
  public final void b() {
    IInterface iInterface;
    k92 k92 = (k92)this.e.c;
    fb0 fb0 = k92.i;
    ArrayList<IInterface> arrayList = k92.d;
    ha2 ha2 = k92.b;
    fb0.getClass();
    int i = fa2.f;
    IBinder iBinder = this.c;
    if (iBinder == null) {
      fb0 = null;
    } else {
      iInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
      if (iInterface instanceof ga2) {
        iInterface = iInterface;
      } else {
        iInterface = new ea2(iBinder);
      } 
    } 
    k92.n = (ga2)iInterface;
    i = 0;
    ha2.a("linkToDeath", new Object[0]);
    try {
      k92.n.asBinder().linkToDeath(k92.k, 0);
    } catch (RemoteException remoteException) {
      if (Log.isLoggable("PlayCore", 6))
        Log.e("PlayCore", ha2.c(ha2.a, "linkToDeath failed", new Object[0]), (Throwable)remoteException); 
    } 
    k92.g = false;
    int j = arrayList.size();
    while (i < j) {
      iInterface = arrayList.get(i);
      i++;
      ((Runnable)iInterface).run();
    } 
    arrayList.clear();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\i92.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */