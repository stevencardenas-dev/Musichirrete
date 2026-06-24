package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pairip.VMRunner;
import f72;
import java.util.List;
import qp0;
import t41;
import w41;
import zv0;

public class DiagnosticsReceiver extends BroadcastReceiver {
  public static final String a = qp0.j("DiagnosticsRcvr");
  
  public final void onReceive(Context paramContext, Intent paramIntent) {
    VMRunner.invoke("Zb14RDSsYKahZjQ9", new Object[] { this, paramContext, paramIntent });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\work\impl\diagnostics\DiagnosticsReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */