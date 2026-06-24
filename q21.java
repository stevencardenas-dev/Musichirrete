import android.app.Notification;
import android.app.PendingIntent;

public abstract class q21 {
  public static Notification.MediaStyle a(Notification.MediaStyle paramMediaStyle, CharSequence paramCharSequence, int paramInt, PendingIntent paramPendingIntent, Boolean paramBoolean) {
    if (paramBoolean.booleanValue())
      paramMediaStyle.setRemotePlaybackInfo(paramCharSequence, paramInt, paramPendingIntent); 
    return paramMediaStyle;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */