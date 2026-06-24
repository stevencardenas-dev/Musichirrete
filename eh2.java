import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import androidx.mediarouter.media.MediaTransferReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.jaudiotagger.audio.dsf.qdA.GMDx;

public final class eh2 extends y92 {
  public static final rp0 n = new rp0("MediaRouterProxy", null);
  
  public final iv0 f;
  
  public final mj g;
  
  public final HashMap h = new HashMap<Object, Object>();
  
  public final vh2 i;
  
  public final boolean j;
  
  public boolean k;
  
  public boolean l;
  
  public boolean m;
  
  public eh2(Context paramContext, iv0 paramiv0, mj parammj, pb2 parampb2) {
    super("com.google.android.gms.cast.framework.internal.IMediaRouter", 3);
    this.f = paramiv0;
    this.g = parammj;
    if (Build.VERSION.SDK_INT >= 33) {
      n.b("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
      this.i = new vh2(parammj);
      Intent intent = new Intent(paramContext, MediaTransferReceiver.class);
      intent.setPackage(paramContext.getPackageName());
      this.j = paramContext.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty() ^ true;
      this.k = true;
      this.l = true;
      parampb2.d(new String[] { GMDx.ghyDjtwW, "com.google.android.gms.cast.FLAG_SHOW_SYSTEM_OUTPUT_SWITCHER_ON_CAST_ICON_CLICK" }).a(new a42(14, this));
    } 
  }
  
  public final boolean o0(int paramInt, Parcel paramParcel1, Parcel paramParcel2) {
    boolean bool;
    int i;
    ArrayList<Object> arrayList1;
    hv0 hv02;
    String str1;
    Bundle bundle1;
    hv0 hv01;
    ArrayList<String> arrayList;
    Iterator<Set> iterator;
    String str2;
    Bundle bundle2;
    hv0 hv03;
    na2 na2;
    String str4;
    hv0 hv04;
    ArrayList<Iterator<Set>> arrayList2;
    fv0 fv0 = null;
    String str3 = null;
    HashMap hashMap = this.h;
    rp0 rp01 = n;
    int j = 0;
    int k = 0;
    iv0 iv01 = this.f;
    switch (paramInt) {
      default:
        return false;
      case 14:
        str3 = paramParcel1.readString();
        mh2.d(paramParcel1);
        iv01.getClass();
        iv0.b();
        arrayList1 = iv0.c().e();
        k = arrayList1.size();
        paramInt = 0;
        while (paramInt < k) {
          fv0 = (fv0)arrayList1.get(paramInt);
          j = paramInt + 1;
          fv0 = fv0;
          paramInt = j;
          if (fv0.c.equals(str3)) {
            rp01.b("clean up the connectedGroupRoute = %s", new Object[] { fv0 });
            iv0.b();
            if ((iv0.c()).k.get(fv0.c) == null) {
              paramInt = j;
              continue;
            } 
            tp.b();
            return false;
          } 
        } 
        hv02 = iv0.g();
        if (hv02 != null && !hv02.h && hv02.c.equals(str3)) {
          rp01.b("clean up the selected route = %s", new Object[] { hv02 });
          iv0.m(0);
        } 
        paramParcel2.writeNoException();
        return true;
      case 13:
        paramInt = hv02.readInt();
        mh2.d((Parcel)hv02);
        iv01.getClass();
        iv0.m(paramInt);
        paramParcel2.writeNoException();
        return true;
      case 12:
        iv01.getClass();
        iv0.b();
        hv02 = (iv0.c()).y;
        paramInt = k;
        if (hv02 != null) {
          paramInt = k;
          if ((iv0.g()).c.equals(hv02.c))
            paramInt = 1; 
        } 
        paramParcel2.writeNoException();
        j = mh2.a;
        paramParcel2.writeInt(paramInt);
        return true;
      case 11:
        iterator = hashMap.values().iterator();
        while (iterator.hasNext()) {
          Iterator<dv0> iterator1 = ((Set)iterator.next()).iterator();
          while (iterator1.hasNext())
            iv01.j(iterator1.next()); 
        } 
        hashMap.clear();
        paramParcel2.writeNoException();
        return true;
      case 10:
        paramParcel2.writeNoException();
        paramParcel2.writeInt(12451000);
        return true;
      case 9:
        iv01.getClass();
        str1 = (iv0.g()).c;
        paramParcel2.writeNoException();
        paramParcel2.writeString(str1);
        return true;
      case 8:
        str4 = str1.readString();
        mh2.d((Parcel)str1);
        iv01.getClass();
        arrayList2 = iv0.f();
        j = arrayList2.size();
        paramInt = 0;
        while (true) {
          Iterator<Set> iterator1 = iterator;
          if (paramInt < j) {
            iterator1 = arrayList2.get(paramInt);
            paramInt++;
            hv0 hv0 = (hv0)iterator1;
            if (hv0.c.equals(str4)) {
              bundle1 = hv0.t;
              break;
            } 
            continue;
          } 
          break;
        } 
        paramParcel2.writeNoException();
        if (bundle1 == null) {
          paramParcel2.writeInt(0);
          return true;
        } 
        paramParcel2.writeInt(1);
        bundle1.writeToParcel(paramParcel2, 1);
        return true;
      case 7:
        iv01.getClass();
        iv0.b();
        hv01 = (iv0.c()).x;
        if (hv01 != null) {
          boolean bool1 = (iv0.g()).c.equals(hv01.c);
          paramParcel2.writeNoException();
          paramInt = mh2.a;
          paramParcel2.writeInt(bool1);
          return true;
        } 
        tp.f("There is no default route.  The media router has not yet been fully initialized.");
        return false;
      case 6:
        iv01.getClass();
        iv0.b();
        hv01 = (iv0.c()).x;
        if (hv01 != null) {
          hv01.l(true);
          paramParcel2.writeNoException();
          return true;
        } 
        tp.f("There is no default route.  The media router has not yet been fully initialized.");
        return false;
      case 5:
        str2 = hv01.readString();
        mh2.d((Parcel)hv01);
        rp01.b("select route with routeId = %s", new Object[] { str2 });
        iv01.getClass();
        arrayList = iv0.f();
        j = arrayList.size();
        paramInt = 0;
        while (paramInt < j) {
          str4 = arrayList.get(paramInt);
          paramInt++;
          hv04 = (hv0)str4;
          if (hv04.c.equals(str2)) {
            rp01.b("media route is found and selected", new Object[0]);
            hv04.l(true);
            break;
          } 
        } 
        paramParcel2.writeNoException();
        return true;
      case 4:
        bundle2 = (Bundle)mh2.a((Parcel)arrayList, Bundle.CREATOR);
        paramInt = arrayList.readInt();
        mh2.d((Parcel)arrayList);
        cv0 = cv0.b(bundle2);
        if (cv0 == null) {
          paramInt = j;
        } else {
          iv01.getClass();
          bool = iv0.i(cv0, paramInt);
        } 
        paramParcel2.writeNoException();
        paramParcel2.writeInt(bool);
        return true;
      case 3:
        bundle2 = (Bundle)mh2.a((Parcel)cv0, Bundle.CREATOR);
        mh2.d((Parcel)cv0);
        cv0 = cv0.b(bundle2);
        if (cv0 != null)
          if (Looper.myLooper() == Looper.getMainLooper()) {
            p0(cv0);
          } else {
            (new cl(Looper.getMainLooper(), 6)).post(new vi2(27, this, cv0));
          }  
        paramParcel2.writeNoException();
        return true;
      case 2:
        bundle2 = (Bundle)mh2.a((Parcel)cv0, Bundle.CREATOR);
        i = cv0.readInt();
        mh2.d((Parcel)cv0);
        cv0 = cv0.b(bundle2);
        if (cv0 != null)
          if (Looper.myLooper() == Looper.getMainLooper()) {
            r0(cv0, i);
          } else {
            (new cl(Looper.getMainLooper(), 6)).post(new x7(i, 2, this, cv0));
          }  
        paramParcel2.writeNoException();
        return true;
      case 1:
        break;
    } 
    Bundle bundle3 = (Bundle)mh2.a((Parcel)cv0, Bundle.CREATOR);
    IBinder iBinder = cv0.readStrongBinder();
    if (iBinder == null) {
      hv03 = hv04;
    } else {
      IInterface iInterface = hv03.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
      if (iInterface instanceof ig2) {
        na2 = (ig2)iInterface;
      } else {
        na2 = new na2((IBinder)na2, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback", 1);
      } 
    } 
    mh2.d((Parcel)cv0);
    cv0 cv0 = cv0.b(bundle3);
    if (cv0 != null) {
      if (!arrayList2.containsKey(cv0))
        arrayList2.put(cv0, new HashSet()); 
      ((Set<ng2>)arrayList2.get(cv0)).add(new ng2((ig2)na2, this, this.i));
    } 
    paramParcel2.writeNoException();
    return true;
  }
  
  public final void p0(cv0 paramcv0) {
    Set set = (Set)this.h.get(paramcv0);
    if (set != null)
      for (dv0 dv0 : set)
        this.f.j(dv0);  
  }
  
  public final boolean q0() {
    if (this.j && this.k) {
      mj mj1 = this.g;
      if (mj1 != null && mj1.o)
        return true; 
    } 
    return false;
  }
  
  public final void r0(cv0 paramcv0, int paramInt) {
    Set set = (Set)this.h.get(paramcv0);
    if (set != null)
      for (dv0 dv0 : set)
        this.f.a(paramcv0, dv0, paramInt);  
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\eh2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */