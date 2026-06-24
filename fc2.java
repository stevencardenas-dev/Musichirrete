import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class fc2 implements IInterface {
  public final IBinder e;
  
  public fc2(IBinder paramIBinder) {
    this.e = paramIBinder;
  }
  
  public final IBinder asBinder() {
    return this.e;
  }
  
  public final void m(cj2 paramcj2, ud0 paramud0) {
    Parcel parcel1 = Parcel.obtain();
    Parcel parcel2 = Parcel.obtain();
    try {
      parcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      parcel1.writeStrongBinder((IBinder)paramcj2);
      parcel1.writeInt(1);
      pk2.a(paramud0, parcel1, 0);
      this.e.transact(46, parcel1, parcel2, 0);
      parcel2.readException();
      return;
    } finally {
      parcel2.recycle();
      parcel1.recycle();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fc2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */