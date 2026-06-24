package in.krosbits.musicolet;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import im0;
import z21;
import zo2;

public class LibDBUpdaterService extends Service {
  public static LibDBUpdaterService c;
  
  public boolean b = false;
  
  public final IBinder onBind(Intent paramIntent) {
    return null;
  }
  
  public final void onDestroy() {
    if (c == this)
      c = null; 
    super.onDestroy();
    (new z21((Context)this)).b(140);
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2) {
    im0 im0 = im0.g0;
    if (im0 != null) {
      Notification notification = im0.e();
    } else {
      im0 = null;
    } 
    if (im0 != null) {
      try {
        zo2.U(this, 140, (Notification)im0);
      } finally {
        im0 = null;
        im0.printStackTrace();
      } 
    } else {
      stopForeground(true);
      stopSelf();
    } 
    c = this;
    return 2;
  }
  
  public final void onTaskRemoved(Intent paramIntent) {
    if (Build.VERSION.SDK_INT < 28 && !TaskSaviour.b && MusicService.P0 != null)
      startActivity((new Intent((Context)this, KitkatHackActivity.class)).addFlags(268435460)); 
  }
  
  public final void onTimeout(int paramInt) {
    super.onTimeout(paramInt);
    this.b = true;
    stopForeground(2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\LibDBUpdaterService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */