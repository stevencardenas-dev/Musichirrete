import android.app.Notification;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;

public final class c51 extends u21 {
  public final Notification.MediaStyle d;
  
  public c51() {
    if (Build.VERSION.SDK_INT >= 26)
      this.d = new Notification.MediaStyle(); 
  }
  
  public final u21 l(MediaSessionCompat.Token paramToken) {
    Notification.MediaStyle mediaStyle = this.d;
    if (mediaStyle != null) {
      mediaStyle.setMediaSession((MediaSession.Token)paramToken.c);
      return this;
    } 
    this.c = paramToken;
    return this;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\c51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */