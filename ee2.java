import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Collection;

public final class ee2 extends ot2 {
  public final Collection c;
  
  public final ArrayList e;
  
  public final bv0 f;
  
  public final nt1 g;
  
  public final dg2 h;
  
  public ee2(dg2 paramdg2, nt1 paramnt11, ArrayList paramArrayList1, ArrayList paramArrayList2, bv0 parambv0, nt1 paramnt12) {
    super(paramnt11);
  }
  
  public final void a() {
    nt1 nt11 = this.g;
    dg2 dg21 = this.h;
    bv0 bv01 = this.f;
    Collection collection = this.c;
    ArrayList arrayList2 = dg2.c(collection);
    ArrayList arrayList1 = this.e;
    arrayList2.addAll(dg2.b(arrayList1));
    try {
      ArrayList<jp2> arrayList = bv01.a;
      long l = System.currentTimeMillis();
      jp2 jp2 = new jp2();
      this(2, l);
      arrayList.add(jp2);
      ug2 ug2 = dg21.b.m;
      String str = dg21.a;
      Bundle bundle = dg2.a(bv01);
      ze2 ze2 = new ze2();
      this(dg21, nt11, 4);
      ug2.J(str, arrayList2, bundle, ze2);
      return;
    } catch (RemoteException remoteException) {
      dg2.c.c(remoteException, "startInstall(%s,%s)", new Object[] { collection, arrayList1 });
      nt11.c(new RuntimeException((Throwable)remoteException));
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ee2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */