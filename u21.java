import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;

public class u21 extends hd {
  public int[] b = null;
  
  public MediaSessionCompat.Token c;
  
  public final void a(p01 paramp01) {
    int i = Build.VERSION.SDK_INT;
    Notification.Builder builder = (Notification.Builder)paramp01.c;
    if (i >= 34) {
      p21.d(builder, p21.b(q21.a(p21.a(), null, 0, null, Boolean.FALSE), this.b, this.c));
      return;
    } 
    p21.d(builder, p21.b(p21.a(), this.b, this.c));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */