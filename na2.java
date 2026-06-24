import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class na2 implements IInterface {
  public final int e;
  
  public final IBinder f;
  
  public final String g;
  
  public final IBinder asBinder() {
    int i = this.e;
    return this.f;
  }
  
  public Parcel m(Parcel paramParcel, int paramInt) {
    Parcel parcel = Parcel.obtain();
    try {
      this.f.transact(paramInt, paramParcel, parcel, 0);
      parcel.readException();
      paramParcel.recycle();
      return parcel;
    } catch (RuntimeException runtimeException) {
      parcel.recycle();
      throw runtimeException;
    } finally {}
    paramParcel.recycle();
    throw parcel;
  }
  
  public Parcel o() {
    int i = this.e;
    String str = this.g;
    switch (i) {
      default:
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken(str);
        return parcel;
      case 1:
        break;
    } 
    Parcel parcel = Parcel.obtain();
    parcel.writeInterfaceToken(str);
    return parcel;
  }
  
  public void o0(Parcel paramParcel, int paramInt) {
    Parcel parcel = Parcel.obtain();
    try {
      this.f.transact(paramInt, paramParcel, parcel, 0);
      parcel.readException();
      return;
    } finally {
      paramParcel.recycle();
      parcel.recycle();
    } 
  }
  
  public void p0(Parcel paramParcel, int paramInt) {
    try {
      this.f.transact(paramInt, paramParcel, null, 1);
      return;
    } finally {
      paramParcel.recycle();
    } 
  }
  
  public Parcel q0() {
    Parcel parcel = Parcel.obtain();
    parcel.writeInterfaceToken(this.g);
    return parcel;
  }
  
  public Parcel r0(Parcel paramParcel, int paramInt) {
    Parcel parcel = Parcel.obtain();
    try {
      this.f.transact(paramInt, paramParcel, parcel, 0);
      parcel.readException();
      paramParcel.recycle();
      return parcel;
    } catch (RuntimeException runtimeException) {
      parcel.recycle();
      throw runtimeException;
    } finally {}
    paramParcel.recycle();
    throw parcel;
  }
  
  public Parcel u(Parcel paramParcel, int paramInt) {
    Exception exception;
    Parcel parcel = Parcel.obtain();
    try {
      this.f.transact(paramInt, paramParcel, parcel, 0);
      parcel.readException();
      paramParcel.recycle();
      return parcel;
    } catch (RuntimeException null) {
      parcel.recycle();
      throw exception;
    } finally {}
    paramParcel.recycle();
    throw exception;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\na2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */