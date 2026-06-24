import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.profileinstaller.Vuyf.nBRIsU;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import java.util.Collections;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;

public final class ng2 extends dv0 {
  public static final rp0 d = new rp0("MediaRouterCallback", null);
  
  public final ig2 a;
  
  public final eh2 b;
  
  public final vh2 c;
  
  public ng2(ig2 paramig2, eh2 parameh2, vh2 paramvh2) {
    n21.m(paramig2);
    this.a = paramig2;
    this.b = parameh2;
    this.c = paramvh2;
  }
  
  public final void d(iv0 paramiv0, hv0 paramhv0) {
    try {
      ig2 ig21 = this.a;
      String str = paramhv0.c;
      Bundle bundle = paramhv0.t;
      Parcel parcel = ig21.o();
      parcel.writeString(str);
      mh2.b(parcel, (Parcelable)bundle);
      ig21.o0(parcel, 1);
    } catch (RemoteException remoteException) {
      String str = ig2.class.getSimpleName();
      d.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "onRouteAdded", str });
    } 
    p(paramiv0);
  }
  
  public final void e(iv0 paramiv0, hv0 paramhv0) {
    if (!paramhv0.g())
      return; 
    try {
      ig2 ig21 = this.a;
      String str = paramhv0.c;
      Bundle bundle = paramhv0.t;
      Parcel parcel = ig21.o();
      parcel.writeString(str);
      mh2.b(parcel, (Parcelable)bundle);
      ig21.o0(parcel, 2);
    } catch (RemoteException remoteException) {
      String str = ig2.class.getSimpleName();
      d.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "onRouteChanged", str });
    } 
    p(paramiv0);
  }
  
  public final void f(hv0 paramhv01, hv0 paramhv02) {
    String str1;
    ig2 ig21;
    int i = paramhv01.l;
    String str2 = paramhv01.c;
    rp0 rp01 = d;
    if (i != 1) {
      Log.i(rp01.a, rp01.c("ignore onRouteConnected for non-remote connected routeId: %s", new Object[] { str2 }));
      return;
    } 
    Log.i(rp01.a, rp01.c("onRouteConnected with connectedRouteId = %s", new Object[] { str2 }));
    this.b.m = true;
    try {
      ig21 = this.a;
      Parcel parcel1 = ig21.u(ig21.o(), 7);
      i = parcel1.readInt();
      parcel1.recycle();
      str1 = paramhv02.c;
      if (i >= 251600000) {
        Bundle bundle1 = paramhv01.t;
        parcel1 = ig21.o();
        parcel1.writeString(str1);
        parcel1.writeString(str2);
        mh2.b(parcel1, (Parcelable)bundle1);
        ig21.o0(parcel1, 9);
        return;
      } 
    } catch (RemoteException remoteException) {}
    Bundle bundle = ((hv0)remoteException).t;
    Parcel parcel = ig21.o();
    parcel.writeString(str1);
    parcel.writeString(str2);
    mh2.b(parcel, (Parcelable)bundle);
    ig21.o0(parcel, 8);
  }
  
  public final void g(hv0 paramhv01, hv0 paramhv02, int paramInt) {
    String str = paramhv02.c;
    rp0 rp01 = d;
    if (paramhv01 != null) {
      String str1 = paramhv01.c;
      if (paramhv01.l == 1) {
        ig2 ig21;
        Log.i(rp01.a, rp01.c(JkpGFvCVQHzgc.YIqshcOWEmsSJe, new Object[] { str1, str, Integer.valueOf(paramInt) }));
        this.b.m = false;
        try {
          ig21 = this.a;
          Parcel parcel1 = ig21.u(ig21.o(), 7);
          int i = parcel1.readInt();
          parcel1.recycle();
          if (i >= 251600000) {
            Bundle bundle1 = paramhv01.t;
            parcel1 = ig21.o();
            parcel1.writeString(str);
            parcel1.writeString(str1);
            mh2.b(parcel1, (Parcelable)bundle1);
            parcel1.writeInt(paramInt);
            ig21.o0(parcel1, 10);
            return;
          } 
        } catch (RemoteException remoteException) {}
        Bundle bundle = ((hv0)remoteException).t;
        Parcel parcel = ig21.o();
        parcel.writeString(str1);
        mh2.b(parcel, (Parcelable)bundle);
        parcel.writeInt(paramInt);
        ig21.o0(parcel, 6);
        return;
      } 
    } 
    Log.i(rp01.a, rp01.c(nBRIsU.mQwgPjwWu, new Object[0]));
  }
  
  public final void i(iv0 paramiv0, hv0 paramhv0) {
    try {
      ig2 ig21 = this.a;
      String str = paramhv0.c;
      Bundle bundle = paramhv0.t;
      Parcel parcel = ig21.o();
      parcel.writeString(str);
      mh2.b(parcel, (Parcelable)bundle);
      ig21.o0(parcel, 3);
    } catch (RemoteException remoteException) {
      String str = ig2.class.getSimpleName();
      d.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "onRouteRemoved", str });
    } 
    p(paramiv0);
  }
  
  public final void l(iv0 paramiv0, hv0 paramhv01, int paramInt, hv0 paramhv02) {
    int i = paramhv01.l;
    String str = paramhv01.c;
    rp0 rp01 = d;
    if (i != 1) {
      Log.i(rp01.a, rp01.c("ignore onRouteSelected for non-remote selected routeId: %s", new Object[] { str }));
      return;
    } 
    Log.i(rp01.a, rp01.c("onRouteSelected with reason = %d, routeId = %s", new Object[] { Integer.valueOf(paramInt), str }));
    try {
      Bundle bundle;
      String str1;
      ig2 ig21 = this.a;
      Parcel parcel = ig21.u(ig21.o(), 7);
      paramInt = parcel.readInt();
      parcel.recycle();
      if (paramInt >= 220400000) {
        str1 = paramhv02.c;
        bundle = paramhv01.t;
        parcel = ig21.o();
        parcel.writeString(str1);
        parcel.writeString(str);
        mh2.b(parcel, (Parcelable)bundle);
        ig21.o0(parcel, 8);
      } else {
        str1 = ((hv0)str1).c;
        bundle = ((hv0)bundle).t;
        Parcel parcel1 = ig21.o();
        parcel1.writeString(str1);
        mh2.b(parcel1, (Parcelable)bundle);
        ig21.o0(parcel1, 4);
      } 
    } catch (RemoteException remoteException) {
      rp01.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "onRouteSelected", ig2.class.getSimpleName() });
    } 
    p(paramiv0);
  }
  
  public final void n(iv0 paramiv0, hv0 paramhv0, int paramInt) {
    int i = paramhv0.l;
    String str = paramhv0.c;
    rp0 rp01 = d;
    if (i != 1) {
      Log.i(rp01.a, rp01.c("ignore onRouteUnselected for non-remote routeId: %s", new Object[] { str }));
      return;
    } 
    Log.i(rp01.a, rp01.c("onRouteUnselected with reason = %d, routeId = %s", new Object[] { Integer.valueOf(paramInt), str }));
    try {
      ig2 ig21 = this.a;
      Bundle bundle = paramhv0.t;
      Parcel parcel = ig21.o();
      parcel.writeString(str);
      mh2.b(parcel, (Parcelable)bundle);
      parcel.writeInt(paramInt);
      ig21.o0(parcel, 6);
    } catch (RemoteException remoteException) {
      rp01.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "onRouteUnselected", ig2.class.getSimpleName() });
    } 
    p(paramiv0);
  }
  
  public final void p(iv0 paramiv0) {
    vh2 vh21 = this.c;
    if (vh21 != null && vh21.e && vh21.a.s) {
      bl1 bl1 = vh21.f;
      if (bl1 != null) {
        oj oj = bl1.c();
      } else {
        bl1 = null;
      } 
      if (bl1 == null) {
        iv0.l(null);
        return;
      } 
      ArrayList<mh1> arrayList = new ArrayList();
      ArrayList<Object> arrayList1 = iv0.f();
      int j = arrayList1.size();
      int i = 0;
      while (i < j) {
        hv0 hv0 = (hv0)arrayList1.get(i);
        int k = i + 1;
        hv0 = hv0;
        i = k;
        if (CastDevice.e(hv0.t) != null) {
          arrayList.add(new mh1(new mi2(hv0.c)));
          i = k;
        } 
      } 
      vh2.g.b("updateRouteListingPreference with %d available routes", new Object[] { Integer.valueOf(arrayList.size()) });
      av0 av0 = new av0();
      av0.b = Collections.EMPTY_LIST;
      av0.c = true;
      av0.b = Collections.unmodifiableList(new ArrayList(arrayList));
      iv0.l(new nh1(av0));
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ng2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */