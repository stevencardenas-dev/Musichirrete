package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import ug1;
import zv0;

class MediaBrowserCompat$ItemReceiver extends ug1 {
  public final void b(int paramInt, Bundle paramBundle) {
    Bundle bundle = paramBundle;
    if (paramBundle != null)
      bundle = zv0.D(paramBundle); 
    if (paramInt == 0 && bundle != null && bundle.containsKey("media_item")) {
      Parcelable parcelable = bundle.getParcelable("media_item");
      if (parcelable == null || parcelable instanceof MediaBrowserCompat$MediaItem) {
        parcelable = parcelable;
        throw null;
      } 
      throw null;
    } 
    throw null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\android\support\v4\media\MediaBrowserCompat$ItemReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */