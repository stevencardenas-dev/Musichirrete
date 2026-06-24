package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import java.util.ArrayList;
import p01;
import ug1;

class MyMediaBrowserCompat2$SearchResultReceiver extends ug1 {
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
    if (paramInt == 0 && bundle != null && bundle.containsKey("search_results")) {
      Parcelable[] arrayOfParcelable = bundle.getParcelableArray("search_results");
      arrayOfParcelable.getClass();
      ArrayList<MyMediaBrowserCompat2$MediaItem> arrayList = new ArrayList();
      int i = arrayOfParcelable.length;
      for (paramInt = 0; paramInt < i; paramInt++)
        arrayList.add((MyMediaBrowserCompat2$MediaItem)arrayOfParcelable[paramInt]); 
      throw null;
    } 
    throw null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\android\support\v4\media\MyMediaBrowserCompat2$SearchResultReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */