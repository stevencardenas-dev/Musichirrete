import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

public final class la2 extends m92 {
  public final int p;
  
  public he0 e(Context paramContext, Looper paramLooper, m2 paramm2, Object paramObject, me0 paramme0, ne0 paramne0) {
    switch (this.p) {
      default:
        return super.e(paramContext, paramLooper, paramm2, paramObject, paramme0, paramne0);
      case 6:
        paramObject = paramObject;
        return new rl2(paramContext, paramLooper, paramm2, (qa2)paramme0, (qa2)paramne0);
      case 5:
        paramObject = paramObject;
        n21.n("Setting the API options is required.", paramObject);
        return new cv2(paramContext, paramLooper, paramm2, ((aj)paramObject).b, ((aj)paramObject).c, ((aj)paramObject).d, (qa2)paramme0, (qa2)paramne0);
      case 4:
        paramObject = paramObject;
        return new he0(paramContext, paramLooper, 161, paramm2, paramme0, paramne0, 0);
      case 3:
        paramObject = paramObject;
        n21.n("Setting the API options is required.", paramObject);
        return new nv2(paramContext, paramLooper, paramm2, ((aj)paramObject).b, ((aj)paramObject).d, ((aj)paramObject).e, (qa2)paramme0, (qa2)paramne0);
      case 1:
        throw x41.f(paramObject);
      case 0:
        break;
    } 
    paramObject = paramObject;
    paramm2.getClass();
    paramObject = paramm2.f;
    Bundle bundle = new Bundle();
    bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
    if (paramObject != null)
      bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", paramObject.intValue()); 
    bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
    bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
    bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
    bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
    bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
    bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
    bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
    bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
    return new vm1(paramContext, paramLooper, paramm2, bundle, paramme0, paramne0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\la2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */