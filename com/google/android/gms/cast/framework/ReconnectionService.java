package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import bl1;
import ff2;
import j31;
import kj;
import le2;
import lf2;
import mh2;
import n21;
import re2;
import rp0;
import sg0;
import vc2;
import ve2;
import wx0;
import zf2;

public class ReconnectionService extends Service {
  public static final rp0 c = new rp0("ReconnectionService", null);
  
  public ve2 b;
  
  public final IBinder onBind(Intent paramIntent) {
    ve2 ve21 = this.b;
    if (ve21 != null)
      try {
        re2 re2 = (re2)ve21;
        Parcel parcel2 = re2.o();
        mh2.b(parcel2, (Parcelable)paramIntent);
        Parcel parcel1 = re2.u(parcel2, 3);
        IBinder iBinder = parcel1.readStrongBinder();
        parcel1.recycle();
        return iBinder;
      } catch (RemoteException remoteException) {
        String str = ve2.class.getSimpleName();
        c.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "onBind", str });
      }  
    return null;
  }
  
  public final void onCreate() {
    kj kj = kj.b((Context)this);
    kj.getClass();
    n21.j();
    bl1 bl1 = kj.c;
    bl1.getClass();
    rp0 rp02 = null;
    try {
      ff2 ff2 = bl1.a;
      Parcel parcel = ff2.u(ff2.o(), 7);
      sg0 sg0 = j31.p0(parcel.readStrongBinder());
      parcel.recycle();
    } catch (RemoteException remoteException1) {
      bl1.c.a((Exception)remoteException1, "Unable to call %s on %s.", new Object[] { "getWrappedThis", ff2.class.getSimpleName() });
      remoteException1 = null;
    } 
    n21.j();
    vc2 vc2 = kj.d;
    vc2.getClass();
    try {
      le2 le2 = vc2.a;
      Parcel parcel = le2.u(le2.o(), 5);
      sg0 sg0 = j31.p0(parcel.readStrongBinder());
      parcel.recycle();
    } catch (RemoteException remoteException2) {
      vc2.b.a((Exception)remoteException2, "Unable to call %s on %s.", new Object[] { "getWrappedThis", le2.class.getSimpleName() });
      remoteException2 = null;
    } 
    rp0 rp01 = lf2.a;
    rp01 = rp02;
    if (remoteException1 != null)
      if (remoteException2 == null) {
        rp01 = rp02;
      } else {
        try {
          zf2 zf2 = lf2.b(getApplicationContext());
          j31 j31 = new j31();
          this(this);
          ve2 ve21 = zf2.u0(j31, (sg0)remoteException1, (sg0)remoteException2);
        } catch (RemoteException remoteException) {
          lf2.a.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "newReconnectionServiceImpl", zf2.class.getSimpleName() });
          rp01 = rp02;
        } catch (wx0 wx0) {}
      }  
    this.b = (ve2)rp01;
    if (rp01 != null) {
      try {
        re2 re2 = (re2)rp01;
        re2.o0(re2.o(), 1);
      } catch (RemoteException remoteException) {
        String str = ve2.class.getSimpleName();
        c.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "onCreate", str });
      } 
      super.onCreate();
    } 
  }
  
  public final void onDestroy() {
    ve2 ve21 = this.b;
    if (ve21 != null) {
      try {
        re2 re2 = (re2)ve21;
        re2.o0(re2.o(), 4);
      } catch (RemoteException remoteException) {
        String str = ve2.class.getSimpleName();
        c.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "onDestroy", str });
      } 
      super.onDestroy();
    } 
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2) {
    ve2 ve21 = this.b;
    if (ve21 != null)
      try {
        re2 re2 = (re2)ve21;
        Parcel parcel2 = re2.o();
        mh2.b(parcel2, (Parcelable)paramIntent);
        parcel2.writeInt(paramInt1);
        parcel2.writeInt(paramInt2);
        Parcel parcel1 = re2.u(parcel2, 2);
        paramInt1 = parcel1.readInt();
        parcel1.recycle();
        return paramInt1;
      } catch (RemoteException remoteException) {
        String str = ve2.class.getSimpleName();
        c.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "onStartCommand", str });
      }  
    return 2;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\gms\cast\framework\ReconnectionService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */