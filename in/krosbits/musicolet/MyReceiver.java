package in.krosbits.musicolet;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import m92;
import ws2;

public class MyReceiver extends BroadcastReceiver {
  public final void onReceive(Context paramContext, Intent paramIntent) {
    String str = paramIntent.getAction();
    if (str != null) {
      if (str.equals("a_thchal")) {
        m92.i();
        MyApplication.s();
        return;
      } 
      if (MusicService.P0 != null && (str.equals("android.media.AUDIO_BECOMING_NOISY") || str.equals("a_atcl") || str.equals("a_sltmcl")))
        try {
          ws2.d();
          Intent intent = new Intent();
          return;
        } finally {
          paramContext = null;
          paramContext.printStackTrace();
        }  
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\MyReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */