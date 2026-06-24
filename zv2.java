import android.os.Parcel;
import android.os.RemoteException;

public final class zv2 {
  public final oj a;
  
  public zv2(oj paramoj) {
    this.a = paramoj;
  }
  
  public final void a() {
    oj oj1 = this.a;
    if (oj1.e == null)
      return; 
    try {
      nf1 nf1 = oj1.j;
      if (nf1 != null)
        nf1.s(); 
    } catch (RemoteException remoteException) {}
    vd2 vd2 = (vd2)oj1.e;
    Parcel parcel = vd2.o();
    int i = mh2.a;
    parcel.writeInt(0);
    vd2.o0(parcel, 1);
    mt2 mt2 = oj1.l;
    if (mt2 != null) {
      si2 si2 = new si2(new d7(3));
      mt2.b.E(si2);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zv2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */