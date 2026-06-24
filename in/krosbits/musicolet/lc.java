package in.krosbits.musicolet;

import ag0;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import yf0;
import z21;
import zo2;

public class lc extends Service {
  public static final Intent b = (new Intent(MyApplication.i.getApplicationContext(), lc.class)).setAction("lc");
  
  public static final Intent c = (new Intent(MyApplication.i.getApplicationContext(), lc.class)).setAction("lcs");
  
  public static final yf0 e = new yf0(1);
  
  public final IBinder onBind(Intent paramIntent) {
    return null;
  }
  
  public final void onDestroy() {
    try {
      Context context = MyApplication.i.getApplicationContext();
      z21 z21 = new z21();
      this(context);
      z21.b(150);
    } catch (Exception exception) {}
    super.onDestroy();
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2) {
    yf0 yf01;
    if (paramIntent == null)
      return super.onStartCommand(paramIntent, paramInt1, paramInt2); 
    if ("lc".equals(paramIntent.getAction())) {
      Notification notification = LockScreenReceiver.b;
      LockScreenReceiver.b = null;
      if (notification != null) {
        (new z21((Context)this)).c(150, notification);
        try {
          zo2.U(this, 150, notification);
        } finally {
          notification = null;
          notification.printStackTrace();
          stopSelf();
        } 
      } 
      Handler handler = ag0.m;
      yf01 = e;
      handler.removeCallbacks((Runnable)yf01);
      handler.postDelayed((Runnable)yf01, 5000L);
      return 2;
    } 
    if ("lcs".equals(yf01.getAction()))
      try {
        if (Build.VERSION.SDK_INT >= 26) {
          stopForeground(2);
        } else {
          stopForeground(false);
        } 
      } finally {
        yf01 = null;
      }  
    return 2;
  }
  
  public final void onTimeout(int paramInt) {
    super.onTimeout(paramInt);
    try {
      if (Build.VERSION.SDK_INT >= 26) {
        stopForeground(2);
      } else {
        stopForeground(false);
      } 
    } finally {
      Exception exception = null;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\lc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */