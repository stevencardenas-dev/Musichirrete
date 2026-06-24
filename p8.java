import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;

public abstract class p8 {
  public static ColorStateList a(Drawable paramDrawable) {
    return (paramDrawable instanceof ColorDrawable) ? ColorStateList.valueOf(((ColorDrawable)paramDrawable).getColor()) : ((Build.VERSION.SDK_INT >= 29 && paramDrawable instanceof ColorStateListDrawable) ? ((ColorStateListDrawable)paramDrawable).getColorStateList() : null);
  }
  
  public static String b(Context paramContext) {
    return paramContext.getOpPackageName();
  }
  
  public static boolean c() {
    return Trace.isEnabled();
  }
  
  public static Insets d(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return Insets.of(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void e(Resources.Theme paramTheme) {
    paramTheme.rebase();
  }
  
  public static void f(Notification.Builder paramBuilder, boolean paramBoolean) {
    paramBuilder.setAllowSystemGeneratedContextualActions(paramBoolean);
  }
  
  public static void g(Notification.Builder paramBuilder) {
    paramBuilder.setBubbleMetadata(null);
  }
  
  public static void h(Notification.Action.Builder paramBuilder) {
    paramBuilder.setContextual(false);
  }
  
  public static void i(Outline paramOutline, Path paramPath) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 30) {
      k10.a(paramOutline, paramPath);
      return;
    } 
    if (i >= 29) {
      try {
        j10.a(paramOutline, paramPath);
      } catch (IllegalArgumentException illegalArgumentException) {}
      return;
    } 
    if (paramPath.isConvex())
      j10.a((Outline)illegalArgumentException, paramPath); 
  }
  
  public static void j(Service paramService, int paramInt, Notification paramNotification) {
    paramService.startForeground(paramInt, paramNotification, 0);
  }
  
  public static void k(SystemForegroundService paramSystemForegroundService, int paramInt1, Notification paramNotification, int paramInt2) {
    paramSystemForegroundService.startForeground(paramInt1, paramNotification, paramInt2);
  }
  
  public static void l(Service paramService, int paramInt, Notification paramNotification) {
    paramService.startForeground(paramInt, paramNotification, 2048);
  }
  
  public static void m(SystemForegroundService paramSystemForegroundService, int paramInt1, Notification paramNotification, int paramInt2) {
    try {
      paramSystemForegroundService.startForeground(paramInt1, paramNotification, paramInt2);
      return;
    } catch (ForegroundServiceStartNotAllowedException foregroundServiceStartNotAllowedException) {
      qp0 qp0 = qp0.h();
      String str = SystemForegroundService.g;
      if (qp0.b <= 5)
        Log.w(str, "Unable to start foreground service", (Throwable)foregroundServiceStartNotAllowedException); 
    } catch (SecurityException securityException) {
      qp0 qp0 = qp0.h();
      String str = SystemForegroundService.g;
      if (qp0.b <= 5)
        Log.w(str, "Unable to start foreground service", securityException); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\p8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */