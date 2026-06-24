import android.media.MediaDescription;
import android.net.Uri;

public abstract class ht0 {
  public static Uri a(MediaDescription paramMediaDescription) {
    return paramMediaDescription.getMediaUri();
  }
  
  public static void b(MediaDescription.Builder paramBuilder, Uri paramUri) {
    paramBuilder.setMediaUri(paramUri);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ht0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */