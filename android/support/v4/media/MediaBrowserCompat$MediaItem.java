package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import zb2;

public class MediaBrowserCompat$MediaItem implements Parcelable {
  public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = (Parcelable.Creator<MediaBrowserCompat$MediaItem>)new zb2(25);
  
  public final int b;
  
  public final MediaDescriptionCompat c;
  
  public MediaBrowserCompat$MediaItem(Parcel paramParcel) {
    this.b = paramParcel.readInt();
    this.c = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel);
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("MediaItem{mFlags=");
    stringBuilder.append(this.b);
    stringBuilder.append(", mDescription=");
    stringBuilder.append(this.c);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.b);
    this.c.writeToParcel(paramParcel, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\android\support\v4\media\MediaBrowserCompat$MediaItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */