import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import androidx.work.impl.diagnostics.UWhQ.OETETTfAjV;

public abstract class rd2 {
  public static final Uri a = (new Uri.Builder()).scheme("content").authority("com.google.android.gms.chimera").build();
  
  public static Intent a(Context paramContext, dp2 paramdp2) {
    StringBuilder stringBuilder;
    IllegalArgumentException illegalArgumentException1;
    String str = paramdp2.a;
    ContentProviderClient contentProviderClient = null;
    IllegalArgumentException illegalArgumentException2 = null;
    if (str == null)
      return (new Intent()).setComponent(null); 
    if (paramdp2.c) {
      IllegalArgumentException illegalArgumentException;
      Bundle bundle = new Bundle();
      bundle.putString("serviceActionBundleKey", str);
      try {
        contentProviderClient = paramContext.getContentResolver().acquireUnstableContentProviderClient(a);
        if (contentProviderClient != null) {
          try {
            Bundle bundle1 = contentProviderClient.call("serviceIntentCall", null, bundle);
          } finally {
            contentProviderClient.release();
          } 
        } else {
          RemoteException remoteException = new RemoteException();
          this("Failed to acquire ContentProviderClient");
          throw remoteException;
        } 
      } catch (RemoteException remoteException) {
        Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(remoteException.toString()));
        remoteException = null;
      } catch (IllegalArgumentException null) {}
      if (illegalArgumentException == null) {
        illegalArgumentException = illegalArgumentException2;
      } else {
        Intent intent1;
        Intent intent2 = (Intent)illegalArgumentException.getParcelable("serviceResponseIntentKey");
        if (intent2 != null) {
          intent1 = intent2;
        } else {
          PendingIntent pendingIntent = (PendingIntent)intent1.getParcelable("serviceMissingResolutionIntentKey");
          if (pendingIntent == null) {
            illegalArgumentException = illegalArgumentException2;
          } else {
            stringBuilder = new StringBuilder(str.length() + 72);
            stringBuilder.append("Dynamic lookup for intent failed for action ");
            stringBuilder.append(str);
            stringBuilder.append(OETETTfAjV.BowVdbE);
            Log.w("ServiceBindIntentUtils", stringBuilder.toString());
            throw new jd2(new sp(25, illegalArgumentException, null));
          } 
        } 
      } 
      illegalArgumentException1 = illegalArgumentException;
      if (illegalArgumentException == null) {
        Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(str));
        illegalArgumentException1 = illegalArgumentException;
      } 
    } 
    return (Intent)((illegalArgumentException1 == null) ? (new Intent(str)).setPackage(((dp2)stringBuilder).b) : illegalArgumentException1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rd2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */