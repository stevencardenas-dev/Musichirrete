package in.krosbits.musicolet;

import ag0;
import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.widget.RemoteViews;
import b51;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import d51;
import hd;
import hi;
import z21;
import zo2;

public class fg extends Service {
  public final hi b = new hi(129);
  
  public final IBinder onBind(Intent paramIntent) {
    return null;
  }
  
  public final void onDestroy() {
    super.onDestroy();
    Handler handler = ag0.m;
    hi hi1 = this.b;
    handler.removeCallbacks((Runnable)hi1);
    (new z21(MyApplication.i.getApplicationContext())).b(129);
    handler.postDelayed((Runnable)hi1, 5200L);
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2) {
    d51 d51 = new d51(MyApplication.i.getApplicationContext(), hbrAVtEa.OMnzPsXQsd);
    d51.o(2131231494);
    d51.i(getString(2131886189));
    d51.h(getString(2131886189));
    d51.l(true);
    d51.d(false);
    Object object = new Object();
    if (Build.VERSION.SDK_INT >= 26)
      ((b51)object).b = new Notification.DecoratedCustomViewStyle(); 
    d51.p((hd)object);
    object = new RemoteViews(getPackageName(), 2131493162);
    Notification.Builder builder = d51.a;
    if (builder != null) {
      builder.setCustomContentView((RemoteViews)object);
    } else {
      d51.b.v = (RemoteViews)object;
    } 
    d51.g(ag0.w());
    Notification notification = d51.c();
    try {
      zo2.U(this, 129, notification);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    stopForeground(true);
    stopSelf();
    return 2;
  }
  
  public final void onTimeout(int paramInt) {
    super.onTimeout(paramInt);
    try {
      stopForeground(true);
    } finally {
      Exception exception = null;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\fg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */