package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

final class MediaSessionCompat$ResultReceiverWrapper implements Parcelable {
  public static final Parcelable.Creator<MediaSessionCompat$ResultReceiverWrapper> CREATOR = (Parcelable.Creator<MediaSessionCompat$ResultReceiverWrapper>)new Object();
  
  public ResultReceiver b;
  
  public final int describeContents() {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    this.b.writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\android\support\v4\media\session\MediaSessionCompat$ResultReceiverWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */