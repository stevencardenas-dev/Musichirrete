import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.material.tabs.xm.VDgS;
import in.krosbits.utils.SgV.zpEN;
import java.util.ArrayList;

public final class rg2 implements ug2, IInterface {
  public final IBinder e;
  
  public rg2(IBinder paramIBinder) {
    this.e = paramIBinder;
  }
  
  public final void J(String paramString, ArrayList paramArrayList, Bundle paramBundle, ze2 paramze2) {
    Parcel parcel = Parcel.obtain();
    parcel.writeInterfaceToken(VDgS.HiUWWuaN);
    parcel.writeString(paramString);
    parcel.writeTypedList(paramArrayList);
    int i = to2.a;
    parcel.writeInt(1);
    paramBundle.writeToParcel(parcel, 0);
    parcel.writeStrongBinder((IBinder)paramze2);
    m(parcel, 2);
  }
  
  public final void O(String paramString, ArrayList paramArrayList, Bundle paramBundle, ze2 paramze2) {
    Parcel parcel = Parcel.obtain();
    parcel.writeInterfaceToken("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    parcel.writeString(paramString);
    parcel.writeTypedList(paramArrayList);
    int i = to2.a;
    parcel.writeInt(1);
    paramBundle.writeToParcel(parcel, 0);
    parcel.writeStrongBinder((IBinder)paramze2);
    m(parcel, 14);
  }
  
  public final IBinder asBinder() {
    return this.e;
  }
  
  public final void f(String paramString, ArrayList paramArrayList, Bundle paramBundle, ze2 paramze2) {
    Parcel parcel = Parcel.obtain();
    parcel.writeInterfaceToken("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    parcel.writeString(paramString);
    parcel.writeTypedList(paramArrayList);
    int i = to2.a;
    parcel.writeInt(1);
    paramBundle.writeToParcel(parcel, 0);
    parcel.writeStrongBinder((IBinder)paramze2);
    m(parcel, 8);
  }
  
  public final void l0(String paramString, int paramInt, Bundle paramBundle, ze2 paramze2) {
    Parcel parcel = Parcel.obtain();
    parcel.writeInterfaceToken(zpEN.rLFvvXFJr);
    parcel.writeString(paramString);
    parcel.writeInt(paramInt);
    paramInt = to2.a;
    parcel.writeInt(1);
    paramBundle.writeToParcel(parcel, 0);
    parcel.writeStrongBinder((IBinder)paramze2);
    m(parcel, 4);
  }
  
  public final void m(Parcel paramParcel, int paramInt) {
    try {
      this.e.transact(paramInt, paramParcel, null, 1);
      return;
    } finally {
      paramParcel.recycle();
    } 
  }
  
  public final void w(String paramString, ArrayList paramArrayList, Bundle paramBundle, ze2 paramze2) {
    Parcel parcel = Parcel.obtain();
    parcel.writeInterfaceToken("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    parcel.writeString(paramString);
    parcel.writeTypedList(paramArrayList);
    int i = to2.a;
    parcel.writeInt(1);
    paramBundle.writeToParcel(parcel, 0);
    parcel.writeStrongBinder((IBinder)paramze2);
    m(parcel, 13);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rg2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */