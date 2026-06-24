package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import ug1;
import zv0;

class MediaBrowserCompat$SearchResultReceiver extends ug1 {
  public final void b(int paramInt, Bundle paramBundle) {
    Bundle bundle = paramBundle;
    if (paramBundle != null)
      bundle = zv0.D(paramBundle); 
    if (paramInt == 0 && bundle != null && bundle.containsKey("search_results")) {
      Parcelable[] arrayOfParcelable = bundle.getParcelableArray("search_results");
      arrayOfParcelable.getClass();
      ArrayList<MediaBrowserCompat$MediaItem> arrayList = new ArrayList(arrayOfParcelable.length);
      int i = arrayOfParcelable.length;
      for (paramInt = 0; paramInt < i; paramInt++)
        arrayList.add((MediaBrowserCompat$MediaItem)arrayOfParcelable[paramInt]); 
      throw null;
    } 
    throw null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\android\support\v4\media\MediaBrowserCompat$SearchResultReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */