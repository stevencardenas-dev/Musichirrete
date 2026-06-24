import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;

public abstract class ig0 extends Binder implements jg0 {
  public ig0() {
    attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
  }
  
  public final IBinder asBinder() {
    return (IBinder)this;
  }
  
  public final boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    ParcelableVolumeInfo parcelableVolumeInfo;
    Bundle bundle;
    CharSequence charSequence;
    MediaMetadataCompat mediaMetadataCompat;
    boolean bool;
    if (paramInt1 >= 1 && paramInt1 <= 16777215)
      paramParcel1.enforceInterface("android.support.v4.media.session.IMediaControllerCallback"); 
    if (paramInt1 == 1598968902) {
      paramParcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
      return true;
    } 
    switch (paramInt1) {
      default:
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 13:
        D();
        return true;
      case 12:
        C(paramParcel1.readInt());
        return true;
      case 11:
        if (paramParcel1.readInt() != 0) {
          bool = true;
        } else {
          bool = false;
        } 
        c0(bool);
        return true;
      case 10:
        paramParcel1.readInt();
        return true;
      case 9:
        i(paramParcel1.readInt());
        return true;
      case 8:
        parcelableVolumeInfo = (ParcelableVolumeInfo)qv.d(paramParcel1, ParcelableVolumeInfo.CREATOR);
        S();
        throw null;
      case 7:
        bundle = (Bundle)qv.d((Parcel)parcelableVolumeInfo, Bundle.CREATOR);
        b0();
        throw null;
      case 6:
        charSequence = (CharSequence)qv.d((Parcel)bundle, TextUtils.CHAR_SEQUENCE_CREATOR);
        r();
        throw null;
      case 5:
        charSequence.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR);
        I();
        throw null;
      case 4:
        mediaMetadataCompat = (MediaMetadataCompat)qv.d((Parcel)charSequence, MediaMetadataCompat.CREATOR);
        W();
        throw null;
      case 3:
        i0((PlaybackStateCompat)qv.d((Parcel)mediaMetadataCompat, PlaybackStateCompat.CREATOR));
        return true;
      case 2:
        d();
        throw null;
      case 1:
        break;
    } 
    j0(mediaMetadataCompat.readString(), (Bundle)qv.d((Parcel)mediaMetadataCompat, Bundle.CREATOR));
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ig0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */