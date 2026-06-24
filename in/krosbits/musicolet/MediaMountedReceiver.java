package in.krosbits.musicolet;

import ag0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pairip.VMRunner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lt0;
import n21;

public class MediaMountedReceiver extends BroadcastReceiver {
  public static boolean a;
  
  public static lt0 b;
  
  public static final ExecutorService c = Executors.newSingleThreadExecutor();
  
  public static void a() {
    StringBuilder stringBuilder = new StringBuilder("MMR AA : ");
    stringBuilder.append(b);
    n21.F(stringBuilder.toString());
    if (!MyApplication.o().getBoolean("k_b_atsc", true))
      return; 
    if (!MyApplication.k()) {
      a = true;
      return;
    } 
    a = false;
    lt0 lt01 = b;
    if (lt01 != null && !lt01.isCancelled())
      try {
        n21.F("MMR AAC");
        b.cancel(true);
      } finally {
        lt01 = null;
      }  
    lt01 = new lt0(0);
    String str = ag0.a;
    lt01.executeOnExecutor(c, new Object[0]);
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent) {
    VMRunner.invoke("43PwKbwWMQjKbbJt", new Object[] { this, paramContext, paramIntent });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\MediaMountedReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */