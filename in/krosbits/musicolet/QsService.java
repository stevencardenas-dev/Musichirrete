package in.krosbits.musicolet;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.UserManager;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;

public class QsService extends TileService {
  public static Boolean b;
  
  public static void a(Context paramContext) {
    try {
      if (Build.VERSION.SDK_INT >= 33) {
        if (b == null)
          b = Boolean.valueOf(((UserManager)paramContext.getApplicationContext().getSystemService("user")).isProfile()); 
        if (b.booleanValue())
          return; 
      } 
      ComponentName componentName = new ComponentName();
      return;
    } finally {
      paramContext = null;
      paramContext.printStackTrace();
    } 
  }
  
  public final void b() {
    try {
      boolean bool;
      Tile tile = getQsTile();
      if (MusicService.P0 != null && MusicService.E0 != null && MusicService.F0 && !MusicService.P0.j) {
        bool = true;
      } else {
        bool = false;
      } 
      tile.setLabel(getString(2131886189));
      if (bool) {
        tile.setState(2);
        tile.setContentDescription(getString(2131886363));
      } else {
        tile.setState(1);
        tile.setContentDescription(getString(2131887085));
      } 
      return;
    } finally {
      Exception exception = null;
      exception.printStackTrace();
    } 
  }
  
  public final IBinder onBind(Intent paramIntent) {
    try {
      return iBinder;
    } finally {
      paramIntent = null;
      paramIntent.printStackTrace();
    } 
  }
  
  public final void onClick() {
    // Byte code:
    //   0: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   3: ifnull -> 34
    //   6: getstatic in/krosbits/musicolet/MusicService.E0 : Lhc;
    //   9: ifnull -> 34
    //   12: getstatic in/krosbits/musicolet/MusicService.F0 : Z
    //   15: ifeq -> 34
    //   18: getstatic in/krosbits/musicolet/MusicService.P0 : Lin/krosbits/musicolet/MusicService;
    //   21: getfield j : Z
    //   24: istore_2
    //   25: iload_2
    //   26: ifne -> 34
    //   29: iconst_1
    //   30: istore_1
    //   31: goto -> 36
    //   34: iconst_0
    //   35: istore_1
    //   36: iload_1
    //   37: ifeq -> 77
    //   40: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   43: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   46: astore_3
    //   47: new android/content/Intent
    //   50: astore #4
    //   52: aload #4
    //   54: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   57: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   60: ldc in/krosbits/musicolet/MusicService
    //   62: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   65: aload_3
    //   66: aload #4
    //   68: ldc 'ACTION_CLOSE'
    //   70: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   73: invokestatic a : (Landroid/content/Context;Landroid/content/Intent;)V
    //   76: return
    //   77: getstatic in/krosbits/musicolet/MyApplication.w : I
    //   80: iconst_m1
    //   81: if_icmpne -> 132
    //   84: new android/content/Intent
    //   87: astore_3
    //   88: aload_3
    //   89: aload_0
    //   90: ldc in/krosbits/musicolet/MusicActivity
    //   92: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   95: aload_3
    //   96: ldc 268435456
    //   98: invokevirtual addFlags : (I)Landroid/content/Intent;
    //   101: astore_3
    //   102: getstatic android/os/Build$VERSION.SDK_INT : I
    //   105: bipush #34
    //   107: if_icmplt -> 126
    //   110: aload_0
    //   111: aload_0
    //   112: iconst_0
    //   113: aload_3
    //   114: ldc 167772160
    //   116: invokestatic r : ()Landroid/os/Bundle;
    //   119: invokestatic getActivity : (Landroid/content/Context;ILandroid/content/Intent;ILandroid/os/Bundle;)Landroid/app/PendingIntent;
    //   122: invokevirtual startActivityAndCollapse : (Landroid/app/PendingIntent;)V
    //   125: return
    //   126: aload_0
    //   127: aload_3
    //   128: invokevirtual startActivityAndCollapse : (Landroid/content/Intent;)V
    //   131: return
    //   132: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   135: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   138: astore #4
    //   140: new android/content/Intent
    //   143: astore_3
    //   144: aload_3
    //   145: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   148: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   151: ldc in/krosbits/musicolet/MusicService
    //   153: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   156: aload #4
    //   158: aload_3
    //   159: ldc 'musicolet.media.r.1'
    //   161: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   164: invokestatic a : (Landroid/content/Context;Landroid/content/Intent;)V
    //   167: return
    //   168: astore_3
    //   169: aload_3
    //   170: invokevirtual printStackTrace : ()V
    //   173: return
    // Exception table:
    //   from	to	target	type
    //   0	25	168	finally
    //   40	76	168	finally
    //   77	125	168	finally
    //   126	131	168	finally
    //   132	167	168	finally
  }
  
  public final void onStartListening() {
    b();
  }
  
  public final void onStopListening() {}
  
  public final void onTileAdded() {
    b();
  }
  
  public final void onTileRemoved() {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\musicolet\QsService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */