import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public final class lj extends f0 {
  public static final Parcelable.Creator<lj> CREATOR;
  
  public static final rp0 i = new rp0("CastMediaOptions", null);
  
  public final String b;
  
  public final String c;
  
  public final sf2 e;
  
  public final a31 f;
  
  public final boolean g;
  
  public final boolean h;
  
  static {
    CREATOR = new lx0(29);
  }
  
  public lj(String paramString1, String paramString2, IBinder paramIBinder, a31 parama31, boolean paramBoolean1, boolean paramBoolean2) {
    IInterface iInterface;
    this.b = paramString1;
    this.c = paramString2;
    if (paramIBinder == null) {
      paramString1 = null;
    } else {
      iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
      if (iInterface instanceof sf2) {
        iInterface = iInterface;
      } else {
        iInterface = new na2(paramIBinder, "com.google.android.gms.cast.framework.media.IImagePicker", 1);
      } 
    } 
    this.e = (sf2)iInterface;
    this.f = parama31;
    this.g = paramBoolean1;
    this.h = paramBoolean2;
  }
  
  public final void e() {
    sf2 sf21 = this.e;
    if (sf21 != null)
      try {
        Parcel parcel = sf21.u(sf21.o(), 2);
        sg0 sg0 = j31.p0(parcel.readStrongBinder());
        parcel.recycle();
        if (j31.q0(sg0) != null) {
          ClassCastException classCastException = new ClassCastException();
          this();
          throw classCastException;
        } 
      } catch (RemoteException remoteException) {
        String str = sf2.class.getSimpleName();
        i.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "getWrappedClientObject", str });
      }  
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    IBinder iBinder;
    int i = qv.D0(paramParcel, 20293);
    qv.v0(paramParcel, 2, this.b);
    qv.v0(paramParcel, 3, this.c);
    sf2 sf21 = this.e;
    if (sf21 == null) {
      sf21 = null;
    } else {
      iBinder = sf21.f;
    } 
    qv.q0(paramParcel, 4, iBinder);
    qv.u0(paramParcel, 5, this.f, paramInt);
    qv.C0(paramParcel, 6, 4);
    paramParcel.writeInt(this.g);
    qv.C0(paramParcel, 7, 4);
    paramParcel.writeInt(this.h);
    qv.G0(paramParcel, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */