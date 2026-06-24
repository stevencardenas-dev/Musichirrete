package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import hp2;
import is1;
import java.util.UUID;
import java.util.concurrent.Executor;
import lc0;
import n2;
import om0;
import p01;
import q72;
import qc;
import qp0;
import qz1;
import tk1;
import um0;
import vi2;
import wm0;

public class SystemForegroundService extends Service implements um0 {
  public static final String g = qp0.j("SystemFgService");
  
  public final p01 b = new p01(this);
  
  public boolean c;
  
  public is1 e;
  
  public NotificationManager f;
  
  public final wm0 N() {
    return (wm0)this.b.c;
  }
  
  public final void a() {
    this.f = (NotificationManager)getApplicationContext().getSystemService("notification");
    is1 is11 = new is1(getApplicationContext());
    this.e = is11;
    if (is11.k != null) {
      qp0.h().f(is1.l, "A callback already exists.");
      return;
    } 
    is11.k = this;
  }
  
  public final void b() {
    p01 p011 = this.b;
    p011.getClass();
    p011.k(om0.ON_CREATE);
    super.onCreate();
  }
  
  public final void c() {
    p01 p011 = this.b;
    p011.getClass();
    p011.k(om0.ON_STOP);
    p011.k(om0.ON_DESTROY);
    super.onDestroy();
  }
  
  public final IBinder onBind(Intent paramIntent) {
    paramIntent.getClass();
    p01 p011 = this.b;
    p011.getClass();
    p011.k(om0.ON_START);
    return null;
  }
  
  public final void onCreate() {
    b();
    a();
  }
  
  public final void onDestroy() {
    c();
    this.e.e();
  }
  
  public final void onStart(Intent paramIntent, int paramInt) {
    p01 p011 = this.b;
    p011.getClass();
    p011.k(om0.ON_START);
    super.onStart(paramIntent, paramInt);
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2) {
    super.onStartCommand(paramIntent, paramInt1, paramInt2);
    boolean bool = this.c;
    String str = g;
    if (bool) {
      qp0.h().i(str, "Re-initializing SystemForegroundService after a request to shut-down.");
      this.e.e();
      a();
      this.c = false;
    } 
    if (paramIntent != null) {
      n2 n2;
      StringBuilder stringBuilder;
      is1 is11 = this.e;
      is11.getClass();
      String str1 = is1.l;
      String str2 = paramIntent.getAction();
      if ("ACTION_START_FOREGROUND".equals(str2)) {
        qp0 qp0 = qp0.h();
        stringBuilder = new StringBuilder("Started foreground service ");
        stringBuilder.append(paramIntent);
        qp0.i(str1, stringBuilder.toString());
        String str3 = paramIntent.getStringExtra("KEY_WORKSPEC_ID");
        n2 = is11.c;
        vi2 vi2 = new vi2(is11, str3, 17, false);
        ((tk1)n2.c).execute((Runnable)vi2);
        is11.c(paramIntent);
      } else if ("ACTION_NOTIFY".equals(stringBuilder)) {
        is11.c(paramIntent);
      } else {
        tk1 tk1;
        hp2 hp2;
        UUID uUID;
        if ("ACTION_CANCEL_WORK".equals(stringBuilder)) {
          qp0 qp0 = qp0.h();
          stringBuilder = new StringBuilder("Stopping foreground work for ");
          stringBuilder.append(paramIntent);
          qp0.i((String)n2, stringBuilder.toString());
          String str3 = paramIntent.getStringExtra("KEY_WORKSPEC_ID");
          if (str3 != null && !TextUtils.isEmpty(str3)) {
            q72 q72 = is11.b;
            uUID = UUID.fromString(str3);
            q72.getClass();
            uUID.getClass();
            hp2 = q72.b.m;
            tk1 = (tk1)q72.d.c;
            tk1.getClass();
            qz1.J(hp2, "CancelWorkById", (Executor)tk1, (lc0)new qc(1, q72, uUID));
          } 
        } else if ("ACTION_STOP_FOREGROUND".equals(stringBuilder)) {
          qp0.h().i((String)hp2, "Stopping foreground service");
          SystemForegroundService systemForegroundService = ((is1)tk1).k;
          if (systemForegroundService != null) {
            systemForegroundService.c = true;
            qp0.h().b((String)uUID, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26)
              systemForegroundService.stopForeground(true); 
            systemForegroundService.stopSelf(paramInt2);
          } 
        } 
      } 
    } 
    return 3;
  }
  
  public final void onTimeout(int paramInt) {
    if (Build.VERSION.SDK_INT >= 35)
      return; 
    this.e.f(paramInt, 2048);
  }
  
  public final void onTimeout(int paramInt1, int paramInt2) {
    this.e.f(paramInt1, paramInt2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\work\impl\foreground\SystemForegroundService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */