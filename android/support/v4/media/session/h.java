package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public final class h implements Parcelable.Creator {
  public final Object createFromParcel(Parcel paramParcel) {
    return new PlaybackStateCompat.CustomAction(paramParcel);
  }
  
  public final Object[] newArray(int paramInt) {
    return (Object[])new PlaybackStateCompat.CustomAction[paramInt];
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\android\support\v4\media\session\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */