import android.media.session.MediaSessionManager;
import android.text.TextUtils;

public class n01 extends m01 {
  public final void a() {
    MediaSessionManager.RemoteUserInfo remoteUserInfo = this.a.getCurrentControllerInfo();
    String str = cw0.a(remoteUserInfo);
    if (str != null) {
      if (!TextUtils.isEmpty(str)) {
        new cw0(remoteUserInfo);
        return;
      } 
      l0.l("packageName should be nonempty");
      return;
    } 
    k91.h("package shouldn't be null");
  }
  
  public final void c(aw0 paramaw0) {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n01.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */