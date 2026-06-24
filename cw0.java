import android.media.session.MediaSessionManager;

public final class cw0 extends dw0 {
  public cw0(MediaSessionManager.RemoteUserInfo paramRemoteUserInfo) {
    super(paramRemoteUserInfo.getPackageName(), paramRemoteUserInfo.getPid(), paramRemoteUserInfo.getUid());
  }
  
  public static String a(MediaSessionManager.RemoteUserInfo paramRemoteUserInfo) {
    return paramRemoteUserInfo.getPackageName();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cw0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */