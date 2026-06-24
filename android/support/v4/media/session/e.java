package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

public final class e implements Parcelable.Creator {
  public final Object createFromParcel(Parcel paramParcel) {
    Object object = new Object();
    ((MediaSessionCompat$ResultReceiverWrapper)object).b = (ResultReceiver)ResultReceiver.CREATOR.createFromParcel(paramParcel);
    return object;
  }
  
  public final Object[] newArray(int paramInt) {
    return (Object[])new MediaSessionCompat$ResultReceiverWrapper[paramInt];
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\android\support\v4\media\session\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */