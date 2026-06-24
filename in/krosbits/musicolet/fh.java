package in.krosbits.musicolet;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pairip.VMRunner;

public class fh extends BroadcastReceiver {
  public static void a(Context paramContext, Intent paramIntent) {
    try {
      return;
    } catch (IllegalStateException illegalStateException) {
      paramIntent = new Intent(paramIntent);
    } finally {
      paramContext = null;
    } 
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent) {
    VMRunner.invoke("dLIltnEtUd65wAz2", new Object[] { this, paramContext, paramIntent });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\fh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */