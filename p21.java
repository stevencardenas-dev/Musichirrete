import android.app.Notification;
import android.media.session.MediaSession;
import android.support.v4.media.session.MediaSessionCompat;

public abstract class p21 {
  public static Notification.MediaStyle a() {
    return new Notification.MediaStyle();
  }
  
  public static Notification.MediaStyle b(Notification.MediaStyle paramMediaStyle, int[] paramArrayOfint, MediaSessionCompat.Token paramToken) {
    if (paramArrayOfint != null)
      e(paramMediaStyle, paramArrayOfint); 
    if (paramToken != null)
      c(paramMediaStyle, (MediaSession.Token)paramToken.c); 
    return paramMediaStyle;
  }
  
  public static void c(Notification.MediaStyle paramMediaStyle, MediaSession.Token paramToken) {
    paramMediaStyle.setMediaSession(paramToken);
  }
  
  public static void d(Notification.Builder paramBuilder, Notification.MediaStyle paramMediaStyle) {
    paramBuilder.setStyle((Notification.Style)paramMediaStyle);
  }
  
  public static void e(Notification.MediaStyle paramMediaStyle, int... paramVarArgs) {
    paramMediaStyle.setShowActionsInCompactView(paramVarArgs);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\p21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */