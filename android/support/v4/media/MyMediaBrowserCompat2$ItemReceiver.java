package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import p01;
import ug1;

class MyMediaBrowserCompat2$ItemReceiver extends ug1 {
  public final void b(int paramInt, Bundle paramBundle) {
    Bundle bundle = paramBundle;
    if (paramBundle != null) {
      p01.d(paramBundle);
      try {
        paramBundle.isEmpty();
        bundle = paramBundle;
      } catch (BadParcelableException badParcelableException) {
        Log.e("MediaSessionCompat", "Could not unparcel the data.");
        bundle = null;
      } 
    } 
    if (paramInt == 0 && bundle != null && bundle.containsKey("media_item")) {
      Parcelable parcelable = bundle.getParcelable("media_item");
      if (parcelable == null || parcelable instanceof MyMediaBrowserCompat2$MediaItem) {
        parcelable = parcelable;
        throw null;
      } 
      throw null;
    } 
    throw null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\android\support\v4\media\MyMediaBrowserCompat2$ItemReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */