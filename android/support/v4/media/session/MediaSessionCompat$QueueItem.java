package android.support.v4.media.session;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.List;
import l0;
import yv0;
import zb2;

public final class MediaSessionCompat$QueueItem implements Parcelable {
  public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = (Parcelable.Creator<MediaSessionCompat$QueueItem>)new zb2(28);
  
  public final MediaDescriptionCompat b;
  
  public final long c;
  
  public MediaSession.QueueItem e;
  
  public MediaSessionCompat$QueueItem(MediaSession.QueueItem paramQueueItem, MediaDescriptionCompat paramMediaDescriptionCompat, long paramLong) {
    if (paramMediaDescriptionCompat != null) {
      if (paramLong != -1L) {
        this.b = paramMediaDescriptionCompat;
        this.c = paramLong;
        this.e = paramQueueItem;
        return;
      } 
      l0.l("Id cannot be QueueItem.UNKNOWN_ID");
      throw null;
    } 
    l0.l("Description cannot be null");
    throw null;
  }
  
  public MediaSessionCompat$QueueItem(Parcel paramParcel) {
    this.b = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel);
    this.c = paramParcel.readLong();
  }
  
  public static void b(List paramList) {
    if (paramList != null) {
      ArrayList<List> arrayList = new ArrayList(paramList.size());
      for (List paramList : paramList) {
        if (paramList != null) {
          MediaSession.QueueItem queueItem = (MediaSession.QueueItem)paramList;
          MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = new MediaSessionCompat$QueueItem(queueItem, MediaDescriptionCompat.b(yv0.b(queueItem)), yv0.c(queueItem));
        } else {
          paramList = null;
        } 
        arrayList.add(paramList);
      } 
    } 
  }
  
  public final int describeContents() {
    return 0;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("MediaSession.QueueItem {Description=");
    stringBuilder.append(this.b);
    stringBuilder.append(", Id=");
    stringBuilder.append(this.c);
    stringBuilder.append(" }");
    return stringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    this.b.writeToParcel(paramParcel, paramInt);
    paramParcel.writeLong(this.c);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\android\support\v4\media\session\MediaSessionCompat$QueueItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */