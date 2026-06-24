package in.krosbits.musicolet;

import ag0;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.RemoteViews;
import c81;
import com.google.android.gms.auth.api.signin.cwa.RqlokDsQOju;
import com.google.android.gms.cast.framework.internal.featurehighlight.aS.xveccWbRzqx;
import dd1;
import j52;
import java.util.ArrayList;
import km0;
import n52;

public class Widget4X3 extends AppWidgetProvider {
  public static boolean a;
  
  public static void a(Context paramContext, AppWidgetManager paramAppWidgetManager, int paramInt) {
    n52 n52;
    RemoteViews remoteViews = new RemoteViews(paramContext.getPackageName(), 2131493218);
    km0 km0 = MusicService.y();
    if (km0 != null) {
      int j = km0.b;
      Intent intent4 = (new Intent(paramContext, MusicService.class)).setAction("ACTION_NEXT").putExtra("EXT_DIP", false);
      Intent intent2 = (new Intent(paramContext, MusicService.class)).setAction("ACTION_PREV").putExtra("EXT_DIP", false);
      Intent intent3 = (new Intent(paramContext, MusicService.class)).setAction("ACTION_PLAY_PAUSE");
      remoteViews.setOnClickPendingIntent(2131296884, ag0.M(paramContext, 0, intent2, false));
      remoteViews.setOnClickPendingIntent(2131296875, ag0.M(paramContext, 0, intent4, false));
      remoteViews.setOnClickPendingIntent(2131296879, ag0.M(paramContext, 0, intent3, false));
      j52 j52 = dd1.F(paramContext, km0);
      if (j52.b) {
        remoteViews.setInt(2131297919, "setColorFilter", j52.g);
        remoteViews.setInt(2131297920, "setColorFilter", j52.g);
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
        remoteViews.setTextColor(2131297839, j52.d);
      } 
      if (MyApplication.o().getBoolean(RqlokDsQOju.jxbvWh, true)) {
        intent3 = (new Intent(paramContext, MusicService.class)).setAction("AF10");
        intent4 = (new Intent(paramContext, MusicService.class)).setAction("AR10");
        remoteViews.setOnClickPendingIntent(2131296862, ag0.M(paramContext, 0, intent3, false));
        remoteViews.setOnClickPendingIntent(2131296897, ag0.M(paramContext, 0, intent4, false));
        remoteViews.setViewVisibility(2131296897, 0);
        remoteViews.setViewVisibility(2131296862, 0);
      } else {
        remoteViews.setViewVisibility(2131296897, 8);
        remoteViews.setViewVisibility(2131296862, 8);
      } 
      if (MusicService.V0 == null)
        MusicService.v0(km0); 
      remoteViews.setTextViewText(2131297890, MusicService.X0);
      remoteViews.setTextViewText(2131297692, MusicService.Z0);
      if (MyApplication.o().getBoolean("k_b_w43saa", true)) {
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
      if (MyApplication.o().getBoolean("k_b_w43sfv", true)) {
        Intent intent5 = (new Intent(paramContext, MusicService.class)).setAction("ACT_FAV").putExtra("EXT_S_RID", j);
        if (c81.c(paramContext).c(km0)) {
          remoteViews.setImageViewResource(2131296859, 2131231058);
        } else {
          remoteViews.setImageViewResource(2131296859, 2131231057);
        } 
        remoteViews.setOnClickPendingIntent(2131296859, ag0.M(paramContext, 0, intent5, false));
        remoteViews.setViewVisibility(2131296859, 0);
      } else {
        remoteViews.setViewVisibility(2131296859, 8);
      } 
      if (MyApplication.o().getBoolean("k_b_w43sadpl", true)) {
        remoteViews.setOnClickPendingIntent(2131296951, ag0.G(paramContext, (new Intent(paramContext, GhostSearchActivity.class)).setAction("A_ADTPL").putExtra("E_1_SRI", j).putExtra("E_SHOLCSR", true)));
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
      Intent intent1 = new Intent(paramContext, WidgetService.class);
      intent1.putExtra("appWidgetId", paramInt);
      intent1.setData(Uri.parse(intent1.toUri(1)));
      remoteViews.setRemoteAdapter(2131297047, intent1);
      remoteViews.setPendingIntentTemplate(2131297047, ag0.M(paramContext, 0, (new Intent(paramContext, MusicService.class)).setAction("ACTION_WQJTS"), false));
      if (WidgetService.b == null)
        WidgetService.b = new n52(); 
      n52 = WidgetService.b;
      ArrayList arrayList = n52.a;
      if (n52 == null)
        WidgetService.b = new n52(); 
      j = WidgetService.b.b;
      if (arrayList != null && j < arrayList.size()) {
        remoteViews.setTextViewText(2131297839, paramContext.getString(2131886418, new Object[] { Integer.valueOf(j + 1), Integer.valueOf(arrayList.size()) }));
        remoteViews.setScrollPosition(2131297047, j);
      } else {
        remoteViews.setTextViewText(2131297839, "Current Play-Queue");
      } 
    } else {
      RemoteViews remoteViews1 = new RemoteViews(paramContext.getPackageName(), 2131492981);
      j52 j52 = dd1.F(paramContext, (km0)n52);
      remoteViews = remoteViews1;
      if (j52.b) {
        remoteViews1.setInt(2131297919, "setColorFilter", j52.g);
        remoteViews1.setTextColor(2131297890, j52.c);
        remoteViews = remoteViews1;
      } 
    } 
    int i = (int)(MyApplication.o().getInt("I_WIDTRS", 100) / 100.0D * 255.0D);
    remoteViews.setInt(2131297919, "setImageAlpha", i);
    remoteViews.setInt(2131297920, "setImageAlpha", i);
    remoteViews.setOnClickPendingIntent(16908288, PendingIntent.getActivity(paramContext, 0, (new Intent(paramContext, MusicActivity.class)).setAction("jump_player").addFlags(335544320).putExtra("jump_key", "jump_player").putExtra("smooth", false), 167772160, ag0.r()));
    Intent intent = new Intent(paramContext, MusicActivity.class);
    String str = xveccWbRzqx.PynEFdaiaF;
    remoteViews.setOnClickPendingIntent(2131297383, PendingIntent.getActivity(paramContext, 0, intent.setAction(str).addFlags(335544320).putExtra("jump_key", str).putExtra("smooth", false), 167772160, ag0.r()));
    paramAppWidgetManager.updateAppWidget(paramInt, remoteViews);
  }
  
  public final void onDisabled(Context paramContext) {
    WidgetService.b = null;
  }
  
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


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\Widget4X3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */