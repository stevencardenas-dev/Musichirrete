package in.krosbits.musicolet;

import ag0;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.os.Build;
import d51;
import s21;
import z21;

public class LockScreenReceiver extends BroadcastReceiver {
  public static final KeyguardManager a = (KeyguardManager)MyApplication.i.getApplicationContext().getSystemService("keyguard");
  
  public static Notification b;
  
  public static boolean a() {
    if (MyApplication.o().getBoolean("k_dslipfmtm", true)) {
      MusicService musicService = MusicService.P0;
      if (musicService != null && musicService.j && System.currentTimeMillis() - MusicService.P0.e > 60000L)
        return false; 
    } 
    return true;
  }
  
  public static void b(Context paramContext) {
    Notification notification;
    Intent intent = new Intent(paramContext, LockScreenActivity.class);
    LockScreenActivity lockScreenActivity = LockScreenActivity.a1;
    if (lockScreenActivity == null) {
      intent.addFlags(403177472);
      if (Build.VERSION.SDK_INT < 29) {
        paramContext.startActivity(intent);
        return;
      } 
      try {
        paramContext = MyApplication.i.getApplicationContext();
        z21 z21 = new z21();
        this(paramContext);
        if (z21.a()) {
          PendingIntent pendingIntent = PendingIntent.getActivity(MyApplication.i.getApplicationContext(), 0, intent, 167772160, ag0.r());
          d51 d51 = new d51();
          this(MyApplication.i.getApplicationContext(), "in.krosbits.musicolet.nid.6");
          Notification.Builder builder = d51.a;
          s21 s21 = d51.b;
          d51.o(2131231578);
          d51.i(MyApplication.i.getApplicationContext().getString(2131886964));
          d51.h(MyApplication.i.getApplicationContext().getString(2131886964));
          if (builder == null)
            s21.j = 1; 
          if (builder != null) {
            builder.setCategory("transport");
          } else {
            s21.r = "transport";
          } 
          d51.d(false);
          if (builder != null) {
            builder.setSound(null);
          } else {
            notification = s21.z;
            notification.sound = null;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builder1 = new AudioAttributes.Builder();
            this();
            notification.audioAttributes = builder1.setContentType(4).setUsage(5).build();
          } 
          if (builder != null) {
            builder.setFullScreenIntent(pendingIntent, true);
          } else {
            s21.h = pendingIntent;
            s21.d(128, true);
          } 
          b = d51.c();
          ag0.n0(MyApplication.i.getApplicationContext(), lc.b);
        } 
      } finally {
        paramContext = null;
      } 
    } 
    notification.l0();
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent) {
    try {
      boolean bool = paramContext.getSharedPreferences("PP", 0).getBoolean("B_MLCKSN", false);
      if (MusicService.P0 != null && bool) {
        SharedPreferences sharedPreferences = MyApplication.o();
        bool = true;
        if (sharedPreferences.getBoolean("k_b_slsiulc", true))
          bool = a.inKeyguardRestrictedInputMode(); 
        if (bool && !MusicService.P0.x && MyApplication.e().getMode() == 0 && MusicService.V0 != null && a()) {
          String str = paramIntent.getAction();
          return;
        } 
      } 
      return;
    } finally {
      paramContext = null;
      paramContext.printStackTrace();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\LockScreenReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */