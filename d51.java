import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import in.krosbits.musicolet.MyApplication;

public final class d51 {
  public final Notification.Builder a;
  
  public final s21 b;
  
  public d51(Context paramContext, String paramString) {
    this.b = new s21(paramContext, paramString);
    if (Build.VERSION.SDK_INT >= 26) {
      String str;
      NotificationChannel notificationChannel;
      this.a = new Notification.Builder(paramContext, paramString);
      if ("in.krosbits.musicolet.nid.0".equals(paramString)) {
        if (MyApplication.n().getNotificationChannel("in.krosbits.musicolet.nid.0") == null) {
          str = paramContext.getString(2131887023);
          notificationChannel = new NotificationChannel("in.krosbits.musicolet.nid.0", str, 2);
          notificationChannel.setSound(null, null);
          notificationChannel.setShowBadge(false);
          notificationChannel.enableLights(false);
          notificationChannel.enableVibration(false);
          notificationChannel.setDescription(str);
          notificationChannel.setLockscreenVisibility(1);
          MyApplication.n().createNotificationChannel(notificationChannel);
          return;
        } 
      } else if ("in.krosbits.musicolet.nid.1".equals(notificationChannel)) {
        if (MyApplication.n().getNotificationChannel("in.krosbits.musicolet.nid.1") == null) {
          str = str.getString(2131886654);
          notificationChannel = new NotificationChannel("in.krosbits.musicolet.nid.1", str, 4);
          notificationChannel.setSound(null, null);
          notificationChannel.setShowBadge(false);
          notificationChannel.enableLights(false);
          notificationChannel.enableVibration(false);
          notificationChannel.setDescription(str);
          MyApplication.n().createNotificationChannel(notificationChannel);
          return;
        } 
      } else {
        NotificationChannel notificationChannel1;
        String str1;
        if ("in.krosbits.musicolet.nid.2".equals(notificationChannel)) {
          if (MyApplication.n().getNotificationChannel("in.krosbits.musicolet.nid.2") == null) {
            str1 = str.getString(2131887033);
            notificationChannel1 = new NotificationChannel("in.krosbits.musicolet.nid.2", str1, 2);
            notificationChannel1.setSound(null, null);
            notificationChannel1.setShowBadge(false);
            notificationChannel1.enableLights(false);
            notificationChannel1.enableVibration(false);
            notificationChannel1.setDescription(str1);
            MyApplication.n().createNotificationChannel(notificationChannel1);
            return;
          } 
        } else {
          String str2;
          if ("in.krosbits.musicolet.nid.3".equals(str1)) {
            if (MyApplication.n().getNotificationChannel("in.krosbits.musicolet.nid.3") == null) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append(notificationChannel1.getString(2131887033));
              stringBuilder.append(" [temporary]");
              str2 = stringBuilder.toString();
              notificationChannel1 = new NotificationChannel("in.krosbits.musicolet.nid.3", str2, 2);
              notificationChannel1.setSound(null, null);
              notificationChannel1.setShowBadge(false);
              notificationChannel1.enableLights(false);
              notificationChannel1.enableVibration(false);
              notificationChannel1.setDescription(str2);
              MyApplication.n().createNotificationChannel(notificationChannel1);
              return;
            } 
          } else if ("in.krosbits.musicolet.nid.5".equals(str2)) {
            if (MyApplication.n().getNotificationChannel("in.krosbits.musicolet.nid.5") == null) {
              str2 = notificationChannel1.getString(2131887537);
              notificationChannel1 = new NotificationChannel("in.krosbits.musicolet.nid.5", str2, 2);
              notificationChannel1.setSound(null, null);
              notificationChannel1.setShowBadge(false);
              notificationChannel1.enableLights(false);
              notificationChannel1.enableVibration(false);
              notificationChannel1.setDescription(str2);
              MyApplication.n().createNotificationChannel(notificationChannel1);
              return;
            } 
          } else {
            String str3;
            NotificationChannel notificationChannel2;
            if ("in.krosbits.musicolet.nid.6".equalsIgnoreCase(str2)) {
              if (MyApplication.n().getNotificationChannel("in.krosbits.musicolet.nid.6") == null) {
                str3 = notificationChannel1.getString(2131886964);
                notificationChannel2 = new NotificationChannel("in.krosbits.musicolet.nid.6", str3, 4);
                notificationChannel2.setSound(null, null);
                notificationChannel2.setShowBadge(false);
                notificationChannel2.enableLights(false);
                notificationChannel2.enableVibration(false);
                notificationChannel2.setDescription(str3);
                MyApplication.n().createNotificationChannel(notificationChannel2);
                return;
              } 
            } else if ("in.krosbits.musicolet.nid.7".equals(notificationChannel2) && MyApplication.n().getNotificationChannel("in.krosbits.musicolet.nid.7") == null) {
              str3 = str3.getString(2131887142);
              notificationChannel2 = new NotificationChannel("in.krosbits.musicolet.nid.7", str3, 2);
              notificationChannel2.setSound(null, null);
              notificationChannel2.setShowBadge(false);
              notificationChannel2.enableLights(false);
              notificationChannel2.enableVibration(false);
              notificationChannel2.setDescription(str3);
              MyApplication.n().createNotificationChannel(notificationChannel2);
            } 
          } 
        } 
      } 
    } 
  }
  
  public final void a(int paramInt, PendingIntent paramPendingIntent, String paramString) {
    Notification.Builder builder = this.a;
    if (builder != null) {
      builder.addAction(paramInt, paramString, paramPendingIntent);
      return;
    } 
    this.b.a(paramInt, paramString, paramPendingIntent);
  }
  
  public final void b(Bundle paramBundle) {
    Notification.Builder builder = this.a;
    if (builder != null) {
      builder.addExtras(paramBundle);
      return;
    } 
    s21 s211 = this.b;
    Bundle bundle = s211.s;
    if (bundle == null) {
      s211.s = new Bundle(paramBundle);
      return;
    } 
    bundle.putAll(paramBundle);
  }
  
  public final Notification c() {
    Notification.Builder builder = this.a;
    if (builder != null) {
      Notification notification = builder.build();
      notification.headsUpContentView = notification.contentView;
      return notification;
    } 
    return this.b.b();
  }
  
  public final void d(boolean paramBoolean) {
    Notification.Builder builder = this.a;
    if (builder != null) {
      builder.setAutoCancel(paramBoolean);
      return;
    } 
    this.b.d(16, paramBoolean);
  }
  
  public final void e(boolean paramBoolean) {
    Notification.Builder builder = this.a;
    if (builder != null)
      builder.setColorized(paramBoolean); 
  }
  
  public final void f(RemoteViews paramRemoteViews) {
    Notification.Builder builder = this.a;
    if (builder != null) {
      builder.setContent(paramRemoteViews);
      return;
    } 
    this.b.z.contentView = paramRemoteViews;
  }
  
  public final void g(PendingIntent paramPendingIntent) {
    Notification.Builder builder = this.a;
    if (builder != null) {
      builder.setContentIntent(paramPendingIntent);
      return;
    } 
    this.b.g = paramPendingIntent;
  }
  
  public final void h(CharSequence paramCharSequence) {
    Notification.Builder builder = this.a;
    if (builder != null) {
      builder.setContentText(paramCharSequence);
      return;
    } 
    s21 s211 = this.b;
    s211.getClass();
    s211.f = s21.c(paramCharSequence);
  }
  
  public final void i(CharSequence paramCharSequence) {
    Notification.Builder builder = this.a;
    if (builder != null) {
      builder.setContentTitle(paramCharSequence);
      return;
    } 
    s21 s211 = this.b;
    s211.getClass();
    s211.e = s21.c(paramCharSequence);
  }
  
  public final void j(RemoteViews paramRemoteViews) {
    Notification.Builder builder = this.a;
    if (builder != null) {
      builder.setCustomBigContentView(paramRemoteViews);
      return;
    } 
    this.b.w = paramRemoteViews;
  }
  
  public final void k(PendingIntent paramPendingIntent) {
    Notification.Builder builder = this.a;
    if (builder != null) {
      builder.setDeleteIntent(paramPendingIntent);
      return;
    } 
    this.b.z.deleteIntent = paramPendingIntent;
  }
  
  public final void l(boolean paramBoolean) {
    Notification.Builder builder = this.a;
    if (builder != null) {
      builder.setOngoing(paramBoolean);
      return;
    } 
    this.b.d(2, paramBoolean);
  }
  
  public final void m() {
    Notification.Builder builder = this.a;
    if (builder != null) {
      builder.setOnlyAlertOnce(true);
      return;
    } 
    this.b.d(8, true);
  }
  
  public final void n(int paramInt1, int paramInt2, boolean paramBoolean) {
    Notification.Builder builder = this.a;
    if (builder != null) {
      builder.setProgress(paramInt1, paramInt2, paramBoolean);
      return;
    } 
    s21 s211 = this.b;
    s211.n = paramInt1;
    s211.o = paramInt2;
    s211.p = paramBoolean;
  }
  
  public final void o(int paramInt) {
    Notification.Builder builder = this.a;
    if (builder != null) {
      builder.setSmallIcon(paramInt);
      return;
    } 
    this.b.z.icon = paramInt;
  }
  
  public final void p(hd paramhd) {
    Notification.MediaStyle mediaStyle;
    Notification.Builder builder = this.a;
    if (builder != null) {
      if (paramhd instanceof c51) {
        mediaStyle = ((c51)paramhd).d;
      } else if (mediaStyle instanceof b51) {
        Notification.DecoratedCustomViewStyle decoratedCustomViewStyle = ((b51)mediaStyle).b;
      } else {
        mediaStyle = null;
      } 
      if (mediaStyle != null)
        builder.setStyle((Notification.Style)mediaStyle); 
      return;
    } 
    this.b.f((hd)mediaStyle);
  }
  
  public final void q(Notification.DecoratedCustomViewStyle paramDecoratedCustomViewStyle) {
    Notification.Builder builder = this.a;
    if (builder != null)
      builder.setStyle((Notification.Style)paramDecoratedCustomViewStyle); 
  }
  
  public final void r(String paramString) {
    Notification.Builder builder = this.a;
    if (builder != null) {
      builder.setSubText(paramString);
      return;
    } 
    s21 s211 = this.b;
    s211.getClass();
    s211.m = s21.c(paramString);
  }
  
  public final void s() {
    Notification.Builder builder = this.a;
    if (builder != null) {
      builder.setVisibility(1);
      return;
    } 
    this.b.u = 1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */