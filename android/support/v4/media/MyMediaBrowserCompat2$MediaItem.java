package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import lx0;

public class MyMediaBrowserCompat2$MediaItem implements Parcelable {
  public static final Parcelable.Creator<MyMediaBrowserCompat2$MediaItem> CREATOR = (Parcelable.Creator<MyMediaBrowserCompat2$MediaItem>)new lx0(2);
  
  public final int b;
  
  public final MediaDescriptionCompat c;
  
  public MyMediaBrowserCompat2$MediaItem(Parcel paramParcel) {
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


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\android\support\v4\media\MyMediaBrowserCompat2$MediaItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */