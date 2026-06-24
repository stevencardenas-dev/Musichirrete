import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.PlaybackStateCompat;

public final class kg0 implements lg0 {
  public IBinder e;
  
  public final void L(jg0 paramjg0) {
    Parcel parcel1 = Parcel.obtain();
    Parcel parcel2 = Parcel.obtain();
    try {
      parcel1.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      parcel1.writeStrongInterface(paramjg0);
      this.e.transact(3, parcel1, parcel2, 0);
      parcel2.readException();
      return;
    } finally {
      parcel2.recycle();
      parcel1.recycle();
    } 
  }
  
  public final IBinder asBinder() {
    return this.e;
  }
  
  public final PlaybackStateCompat j() {
    Parcel parcel2 = Parcel.obtain();
    Parcel parcel1 = Parcel.obtain();
    try {
      parcel2.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      this.e.transact(28, parcel2, parcel1, 0);
      parcel1.readException();
      return (PlaybackStateCompat)ui0.a(parcel1, PlaybackStateCompat.CREATOR);
    } finally {
      parcel1.recycle();
      parcel2.recycle();
    } 
  }
  
  public final void y(jg0 paramjg0) {
    Parcel parcel2 = Parcel.obtain();
    Parcel parcel1 = Parcel.obtain();
    try {
      parcel2.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
      parcel2.writeStrongInterface(paramjg0);
      this.e.transact(4, parcel2, parcel1, 0);
      parcel1.readException();
      return;
    } finally {
      parcel1.recycle();
      parcel2.recycle();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kg0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */