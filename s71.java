import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

public abstract class s71 {
  public static void a(PlaybackState.Builder paramBuilder, PlaybackState.CustomAction paramCustomAction) {
    paramBuilder.addCustomAction(paramCustomAction);
  }
  
  public static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder paramBuilder) {
    return paramBuilder.build();
  }
  
  public static PlaybackState c(PlaybackState.Builder paramBuilder) {
    return paramBuilder.build();
  }
  
  public static PlaybackState.Builder d() {
    return new PlaybackState.Builder();
  }
  
  public static PlaybackState.CustomAction.Builder e(String paramString, CharSequence paramCharSequence, int paramInt) {
    return new PlaybackState.CustomAction.Builder(paramString, paramCharSequence, paramInt);
  }
  
  public static String f(PlaybackState.CustomAction paramCustomAction) {
    return paramCustomAction.getAction();
  }
  
  public static long g(PlaybackState paramPlaybackState) {
    return paramPlaybackState.getActions();
  }
  
  public static long h(PlaybackState paramPlaybackState) {
    return paramPlaybackState.getActiveQueueItemId();
  }
  
  public static long i(PlaybackState paramPlaybackState) {
    return paramPlaybackState.getBufferedPosition();
  }
  
  public static List<PlaybackState.CustomAction> j(PlaybackState paramPlaybackState) {
    return paramPlaybackState.getCustomActions();
  }
  
  public static CharSequence k(PlaybackState paramPlaybackState) {
    return paramPlaybackState.getErrorMessage();
  }
  
  public static Bundle l(PlaybackState.CustomAction paramCustomAction) {
    return paramCustomAction.getExtras();
  }
  
  public static int m(PlaybackState.CustomAction paramCustomAction) {
    return paramCustomAction.getIcon();
  }
  
  public static long n(PlaybackState paramPlaybackState) {
    return paramPlaybackState.getLastPositionUpdateTime();
  }
  
  public static CharSequence o(PlaybackState.CustomAction paramCustomAction) {
    return paramCustomAction.getName();
  }
  
  public static float p(PlaybackState paramPlaybackState) {
    return paramPlaybackState.getPlaybackSpeed();
  }
  
  public static long q(PlaybackState paramPlaybackState) {
    return paramPlaybackState.getPosition();
  }
  
  public static int r(PlaybackState paramPlaybackState) {
    return paramPlaybackState.getState();
  }
  
  public static void s(PlaybackState.Builder paramBuilder, long paramLong) {
    paramBuilder.setActions(paramLong);
  }
  
  public static void t(PlaybackState.Builder paramBuilder, long paramLong) {
    paramBuilder.setActiveQueueItemId(paramLong);
  }
  
  public static void u(PlaybackState.Builder paramBuilder, long paramLong) {
    paramBuilder.setBufferedPosition(paramLong);
  }
  
  public static void v(PlaybackState.Builder paramBuilder, CharSequence paramCharSequence) {
    paramBuilder.setErrorMessage(paramCharSequence);
  }
  
  public static void w(PlaybackState.CustomAction.Builder paramBuilder, Bundle paramBundle) {
    paramBuilder.setExtras(paramBundle);
  }
  
  public static void x(PlaybackState.Builder paramBuilder, int paramInt, long paramLong1, float paramFloat, long paramLong2) {
    paramBuilder.setState(paramInt, paramLong1, paramFloat, paramLong2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s71.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */