import android.media.session.PlaybackState;
import android.os.Bundle;

public abstract class t71 {
  public static Bundle a(PlaybackState paramPlaybackState) {
    return paramPlaybackState.getExtras();
  }
  
  public static void b(PlaybackState.Builder paramBuilder, Bundle paramBundle) {
    paramBuilder.setExtras(paramBundle);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t71.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */