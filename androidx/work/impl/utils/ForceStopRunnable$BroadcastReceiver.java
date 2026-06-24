package androidx.work.impl.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pairip.VMRunner;
import qp0;

public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
  public static final String a = qp0.j("ForceStopRunnable$Rcvr");
  
  public final void onReceive(Context paramContext, Intent paramIntent) {
    VMRunner.invoke("gAwLXp3HVPDDy9dO", new Object[] { this, paramContext, paramIntent });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\work\imp\\utils\ForceStopRunnable$BroadcastReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */