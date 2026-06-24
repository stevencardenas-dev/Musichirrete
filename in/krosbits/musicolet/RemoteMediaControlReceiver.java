package in.krosbits.musicolet;

import ag0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import com.pairip.VMRunner;
import n21;
import org.jaudiotagger.tag.mp4.bKj.fXMDNeMWaILNVh;
import ws2;

public class RemoteMediaControlReceiver extends BroadcastReceiver {
  public static void a(Context paramContext, Intent paramIntent) {
    KeyEvent keyEvent = (KeyEvent)paramIntent.getParcelableExtra("android.intent.extra.KEY_EVENT");
    if (keyEvent == null || MyApplication.o().getBoolean("k_b_igbdmbev", false));
    int j = keyEvent.getKeyCode();
    int i = keyEvent.getAction();
    StringBuilder stringBuilder = new StringBuilder("mbi k=");
    stringBuilder.append(j);
    stringBuilder.append(", act=");
    stringBuilder.append(i);
    n21.F(stringBuilder.toString());
    ws2.d();
    if (j == 79 || j == 85)
      if (!BluetoothUsbReceiver.a()) {
        ag0.n0(paramContext, (new Intent(paramContext, MusicService.class)).setAction("ACTION_HSH").putExtra("EXTRA_KA", i));
        return;
      }  
    if (i == 0) {
      if (j != 126) {
        if (j != 127)
          if (j != 272) {
            if (j != 273) {
              switch (j) {
                default:
                  return;
                case 88:
                  ag0.n0(paramContext, (new Intent(paramContext, MusicService.class)).setAction(fXMDNeMWaILNVh.vgdVjbilbQ));
                  return;
                case 87:
                  ag0.n0(paramContext, (new Intent(paramContext, MusicService.class)).setAction("ACTION_NEXT"));
                  return;
                case 85:
                  if (!BluetoothUsbReceiver.a()) {
                    ag0.n0(paramContext, (new Intent(paramContext, MusicService.class)).setAction("ACTION_PLAY_PAUSE"));
                    return;
                  } 
                case 89:
                  ag0.n0(paramContext, (new Intent(paramContext, MusicService.class)).setAction("AR10"));
                  return;
                case 90:
                  ag0.n0(paramContext, (new Intent(paramContext, MusicService.class)).setAction("AF10"));
                  return;
                case 86:
                  break;
              } 
            } else {
            
            } 
          } else {
          
          }  
        if (MusicService.P0 == null || !MusicService.F0 || BluetoothUsbReceiver.a());
        ag0.n0(paramContext, (new Intent(paramContext, MusicService.class)).setAction("ACTION_PAUSE"));
        return;
      } 
      if (BluetoothUsbReceiver.a());
      ag0.n0(paramContext, (new Intent(paramContext, MusicService.class)).setAction("ACTION_PLAY"));
      return;
    } 
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent) {
    VMRunner.invoke("urMoWLKzLI4FNLoy", new Object[] { this, paramContext, paramIntent });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\RemoteMediaControlReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */