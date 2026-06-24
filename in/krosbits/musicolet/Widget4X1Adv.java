package in.krosbits.musicolet;

import ag0;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import c81;
import dd1;
import j52;
import km0;

public class Widget4X1Adv extends AppWidgetProvider {
  public static boolean a;
  
  public static void a(Context paramContext, AppWidgetManager paramAppWidgetManager, int paramInt) {
    RemoteViews remoteViews = new RemoteViews(paramContext.getPackageName(), 2131493217);
    km0 km0 = MusicService.y();
    if (km0 != null) {
      int i = km0.b;
      Intent intent3 = (new Intent(paramContext, MusicService.class)).setAction("ACTION_NEXT").putExtra("EXT_DIP", false);
      Intent intent1 = (new Intent(paramContext, MusicService.class)).setAction("ACTION_PREV").putExtra("EXT_DIP", false);
      Intent intent2 = (new Intent(paramContext, MusicService.class)).setAction("ACTION_PLAY_PAUSE");
      remoteViews.setOnClickPendingIntent(2131296884, ag0.M(paramContext, 0, intent1, false));
      remoteViews.setOnClickPendingIntent(2131296875, ag0.M(paramContext, 0, intent3, false));
      remoteViews.setOnClickPendingIntent(2131296879, ag0.M(paramContext, 0, intent2, false));
      j52 j52 = dd1.F(paramContext, km0);
      if (j52.b) {
        remoteViews.setInt(2131297919, "setColorFilter", j52.g);
        remoteViews.setInt(2131296884, "setColorFilter", j52.e);
        remoteViews.setInt(2131296884, "setImageAlpha", j52.f);
        remoteViews.setInt(2131296879, "setColorFilter", j52.e);
        remoteViews.setInt(2131296879, "setImageAlpha", j52.f);
        remoteViews.setInt(2131296859, "setColorFilter", j52.e);
        remoteViews.setInt(2131296859, "setImageAlpha", j52.f);
        remoteViews.setInt(2131296951, "setColorFilter", j52.e);
        remoteViews.setInt(2131296951, "setImageAlpha", j52.f);
        remoteViews.setInt(2131296875, "setColorFilter", j52.e);
        remoteViews.setInt(2131296875, "setImageAlpha", j52.f);
        remoteViews.setInt(2131296897, "setColorFilter", j52.e);
        remoteViews.setInt(2131296897, "setImageAlpha", j52.f);
        remoteViews.setInt(2131296862, "setColorFilter", j52.e);
        remoteViews.setInt(2131296862, "setImageAlpha", j52.f);
        remoteViews.setTextColor(2131297890, j52.c);
        remoteViews.setTextColor(2131297692, j52.c);
      } 
      if (MyApplication.o().getBoolean("k_b_w41sffrw", true)) {
        intent2 = (new Intent(paramContext, MusicService.class)).setAction("AF10");
        remoteViews.setOnClickPendingIntent(2131296897, ag0.M(paramContext, 0, (new Intent(paramContext, MusicService.class)).setAction("AR10"), false));
        remoteViews.setOnClickPendingIntent(2131296862, ag0.M(paramContext, 0, intent2, false));
        remoteViews.setViewVisibility(2131296897, 0);
        remoteViews.setViewVisibility(2131296862, 0);
      } else {
        remoteViews.setViewVisibility(2131296897, 8);
        remoteViews.setViewVisibility(2131296862, 8);
      } 
      if (MusicService.V0 == null)
        MusicService.v0(km0); 
      remoteViews.setTextViewText(2131297890, MusicService.X0);
      if (MyApplication.o().getBoolean("k_b_w41saa", true)) {
        paramContext.getResources().getDimension(2131165390);
        Bitmap bitmap = j52.a();
        if (bitmap != null) {
          remoteViews.setImageViewBitmap(2131296913, bitmap);
          remoteViews.setViewVisibility(2131296913, 0);
        } else {
          remoteViews.setViewVisibility(2131296913, 4);
          j52.b();
        } 
      } else {
        remoteViews.setViewVisibility(2131296913, 8);
      } 
      if (MyApplication.o().getBoolean("k_b_w41sfv", true)) {
        Intent intent = (new Intent(paramContext, MusicService.class)).setAction("ACT_FAV").putExtra("EXT_S_RID", i);
        if (c81.c(paramContext).c(km0)) {
          remoteViews.setImageViewResource(2131296859, 2131231058);
        } else {
          remoteViews.setImageViewResource(2131296859, 2131231057);
        } 
        remoteViews.setOnClickPendingIntent(2131296859, ag0.M(paramContext, 0, intent, false));
        remoteViews.setViewVisibility(2131296859, 0);
      } else {
        remoteViews.setViewVisibility(2131296859, 8);
      } 
      if (MyApplication.o().getBoolean("k_b_w41sadpl", true)) {
        remoteViews.setOnClickPendingIntent(2131296951, ag0.G(paramContext, (new Intent(paramContext, GhostSearchActivity.class)).setAction("A_ADTPL").putExtra("E_1_SRI", i).putExtra("E_SHOLCSR", true)));
        remoteViews.setViewVisibility(2131296951, 0);
      } else {
        remoteViews.setViewVisibility(2131296951, 8);
      } 
      try {
        if (MusicService.E0 != null && MusicService.F0 && !MusicService.P0.j) {
          remoteViews.setImageViewResource(2131296879, 2131231061);
        } else {
          remoteViews.setImageViewResource(2131296879, 2131231063);
        } 
      } catch (Exception exception) {}
    } else {
      RemoteViews remoteViews1 = new RemoteViews(paramContext.getPackageName(), 2131492982);
      j52 j52 = dd1.F(paramContext, km0);
      remoteViews = remoteViews1;
      if (j52.b) {
        remoteViews1.setInt(2131297919, "setColorFilter", j52.g);
        remoteViews1.setTextColor(2131297890, j52.c);
        remoteViews = remoteViews1;
      } 
    } 
    remoteViews.setInt(2131297919, "setAlpha", (int)(MyApplication.o().getInt("I_WIDTRS", 100) / 100.0D * 255.0D));
    remoteViews.setOnClickPendingIntent(16908288, PendingIntent.getActivity(paramContext, 0, (new Intent(paramContext, MusicActivity.class)).setAction("android.intent.action.MAIN").addFlags(67108864).putExtra("jump_key", "jump_player").putExtra("smooth", false), 167772160, ag0.r()));
    paramAppWidgetManager.updateAppWidget(paramInt, remoteViews);
  }
  
  public final void onDisabled(Context paramContext) {}
  
  public final void onEnabled(Context paramContext) {}
  
  public final void onUpdate(Context paramContext, AppWidgetManager paramAppWidgetManager, int[] paramArrayOfint) {
    int i = paramArrayOfint.length;
    for (byte b = 0; b < i; b++) {
      int j = paramArrayOfint[b];
      if (a) {
        paramAppWidgetManager.updateAppWidget(j, new RemoteViews(paramContext.getPackageName(), 2131492980));
      } else {
        try {
          a(paramContext, paramAppWidgetManager, j);
        } finally {
          Exception exception = null;
        } 
      } 
    } 
    a = false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\Widget4X1Adv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */