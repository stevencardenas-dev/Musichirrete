import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

public abstract class d20 extends BroadcastReceiver {
  public static ComponentName a(Context paramContext) {
    ActivityInfo activityInfo;
    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
    intent.setPackage(paramContext.getPackageName());
    List list = paramContext.getPackageManager().queryBroadcastReceivers(intent, 0);
    if (list.size() == 1) {
      activityInfo = ((ResolveInfo)list.get(0)).activityInfo;
      return new ComponentName(activityInfo.packageName, activityInfo.name);
    } 
    if (activityInfo.size() > 1)
      Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null."); 
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d20.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */