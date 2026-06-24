package in.krosbits.musicolet;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;

public class TaskSaviour extends Service {
  public static boolean b = false;
  
  public final IBinder onBind(Intent paramIntent) {
    return null;
  }
  
  public final void onDestroy() {
    b = false;
    super.onDestroy();
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2) {
    b = true;
    return 2;
  }
  
  public final void onTaskRemoved(Intent paramIntent) {
    if (Build.VERSION.SDK_INT < 28)
      startActivity((new Intent((Context)this, KitkatHackActivity.class)).addFlags(268435460)); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\TaskSaviour.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */