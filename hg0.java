import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.PlaybackStateCompat;

public final class hg0 implements jg0 {
  public IBinder e;
  
  public final void C(int paramInt) {
    Parcel parcel = Parcel.obtain();
    try {
      parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      parcel.writeInt(paramInt);
      this.e.transact(12, parcel, null, 1);
      return;
    } finally {
      parcel.recycle();
    } 
  }
  
  public final IBinder asBinder() {
    return this.e;
  }
  
  public final void i(int paramInt) {
    Parcel parcel = Parcel.obtain();
    try {
      parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      parcel.writeInt(paramInt);
      this.e.transact(9, parcel, null, 1);
      return;
    } finally {
      parcel.recycle();
    } 
  }
  
  public final void i0(PlaybackStateCompat paramPlaybackStateCompat) {
    Parcel parcel = Parcel.obtain();
    try {
      parcel.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
      if (paramPlaybackStateCompat != null) {
        parcel.writeInt(1);
        paramPlaybackStateCompat.writeToParcel(parcel, 0);
      } else {
        parcel.writeInt(0);
      } 
      this.e.transact(3, parcel, null, 1);
      return;
    } finally {
      parcel.recycle();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hg0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */