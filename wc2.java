import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.material.tabs.xm.VDgS;
import java.util.ArrayList;

public final class wc2 extends ot2 {
  public final IBinder c;
  
  public final bl e;
  
  public wc2(bl parambl, IBinder paramIBinder) {}
  
  public final void a() {
    IInterface iInterface;
    md2 md2 = (md2)this.e.c;
    int i = sg2.f;
    IBinder iBinder = this.c;
    if (iBinder == null) {
      iInterface = null;
    } else {
      iInterface = iBinder.queryLocalInterface(VDgS.pUXNVXidF);
      if (iInterface instanceof ug2) {
        iInterface = iInterface;
      } else {
        iInterface = new rg2(iBinder);
      } 
    } 
    md2.m = (ug2)iInterface;
    f1 f1 = md2.b;
    i = 0;
    f1.e("linkToDeath", new Object[0]);
    try {
      md2.m.asBinder().linkToDeath(md2.j, 0);
    } catch (RemoteException remoteException) {
      f1.c(remoteException, "linkToDeath failed", new Object[0]);
    } 
    md2.g = false;
    ArrayList<f1> arrayList = md2.d;
    int j = arrayList.size();
    while (i < j) {
      f1 = arrayList.get(i);
      i++;
      ((Runnable)f1).run();
    } 
    md2.d.clear();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wc2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */