import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Parcelable;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import androidx.core.graphics.drawable.IconCompat;
import androidx.profileinstaller.Vuyf.nBRIsU;
import java.io.File;
import java.util.Iterator;
import java.util.List;

public abstract class ii0 {
  public static Context a;
  
  public static Boolean b;
  
  public static final StringBuilder c = new StringBuilder();
  
  public static long a(File paramFile) {
    long l;
    try {
      StatFs statFs = new StatFs();
      this(paramFile.getAbsolutePath());
      l = statFs.getBlockCount() * statFs.getBlockSize() / 50L;
    } catch (IllegalArgumentException illegalArgumentException) {
      l = 5242880L;
    } 
    return Math.max(Math.min(l, 52428800L), 5242880L);
  }
  
  public static void b() {
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
      return; 
    tp.f("Method call should happen from the main thread.");
  }
  
  public static Notification.Builder c(Context paramContext, String paramString) {
    return new Notification.Builder(paramContext, paramString);
  }
  
  public static String d(zf1 paramzf1) {
    List<cw1> list = paramzf1.d;
    Uri uri = paramzf1.b;
    StringBuilder stringBuilder = c;
    if (uri != null) {
      String str1 = uri.toString();
      stringBuilder.ensureCapacity(str1.length() + 50);
      stringBuilder.append(str1);
    } else {
      stringBuilder.ensureCapacity(50);
      stringBuilder.append(paramzf1.c);
    } 
    stringBuilder.append('\n');
    if (paramzf1.a()) {
      stringBuilder.append("resize:");
      stringBuilder.append(paramzf1.e);
      stringBuilder.append('x');
      stringBuilder.append(paramzf1.f);
      stringBuilder.append('\n');
    } 
    if (paramzf1.g) {
      stringBuilder.append("centerCrop");
      stringBuilder.append('\n');
    } else if (paramzf1.h) {
      stringBuilder.append("centerInside");
      stringBuilder.append('\n');
    } 
    if (list != null) {
      int i = list.size();
      for (byte b = 0; b < i; b++) {
        stringBuilder.append(((cw1)list.get(b)).b());
        stringBuilder.append('\n');
      } 
    } 
    String str = stringBuilder.toString();
    stringBuilder.setLength(0);
    return str;
  }
  
  public static Icon e(Bitmap paramBitmap) {
    return Icon.createWithAdaptiveBitmap(paramBitmap);
  }
  
  public static void f(Configuration paramConfiguration1, Configuration paramConfiguration2, Configuration paramConfiguration3) {
    int i = l0.b(paramConfiguration1);
    int j = l0.b(paramConfiguration2) & 0x3;
    if ((i & 0x3) != j)
      l0.e(paramConfiguration3, l0.b(paramConfiguration3) | j); 
    i = l0.b(paramConfiguration1);
    j = l0.b(paramConfiguration2) & 0xC;
    if ((i & 0xC) != j)
      l0.e(paramConfiguration3, l0.b(paramConfiguration3) | j); 
  }
  
  public static float g(ViewConfiguration paramViewConfiguration) {
    return paramViewConfiguration.getScaledHorizontalScrollFactor();
  }
  
  public static float h(ViewConfiguration paramViewConfiguration) {
    return paramViewConfiguration.getScaledVerticalScrollFactor();
  }
  
  public static boolean i(Context paramContext) {
    Context context;
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{ii0}} */
    try {
      context = paramContext.getApplicationContext();
      Context context1 = a;
      if (context1 != null) {
        Boolean bool1 = b;
        if (bool1 != null && context1 == context) {
          boolean bool2 = bool1.booleanValue();
          /* monitor exit TypeReferenceDotClassExpression{ObjectType{ii0}} */
          return bool2;
        } 
      } 
    } finally {}
    b = null;
    if (ws2.S()) {
      b = Boolean.valueOf(context.getPackageManager().isInstantApp());
    } else {
      try {
        paramContext.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
        b = Boolean.TRUE;
      } catch (ClassNotFoundException classNotFoundException) {
        b = Boolean.FALSE;
      } 
    } 
    a = context;
    boolean bool = b.booleanValue();
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{ii0}} */
    return bool;
  }
  
  public static boolean j(Context paramContext) {
    if (Build.VERSION.SDK_INT >= 26)
      return ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported(); 
    if (n21.p(paramContext, "com.android.launcher.permission.INSTALL_SHORTCUT") != 0)
      return false; 
    Iterator iterator = paramContext.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).iterator();
    while (iterator.hasNext()) {
      String str = ((ResolveInfo)iterator.next()).activityInfo.permission;
      if (TextUtils.isEmpty(str) || "com.android.launcher.permission.INSTALL_SHORTCUT".equals(str))
        return true; 
    } 
    return false;
  }
  
  public static Intent k(Context paramContext, ua2 paramua2, IntentFilter paramIntentFilter) {
    return paramContext.registerReceiver(paramua2, paramIntentFilter, null, null, 0);
  }
  
  public static Intent l(Context paramContext, ua2 paramua2, IntentFilter paramIntentFilter) {
    return paramContext.registerReceiver(paramua2, paramIntentFilter, null, null, 2);
  }
  
  public static void m(Context paramContext, q6 paramq6, IntentFilter paramIntentFilter) {
    if (Build.VERSION.SDK_INT >= 26) {
      paramContext.registerReceiver(paramq6, paramIntentFilter, null, null, 2);
      return;
    } 
    paramContext.registerReceiver(paramq6, paramIntentFilter, null, null);
  }
  
  public static void n(Context paramContext, om1 paramom1) {
    int i = Build.VERSION.SDK_INT;
    StringBuilder stringBuilder = null;
    if (i >= 26) {
      ((ShortcutManager)paramContext.getSystemService(ShortcutManager.class)).requestPinShortcut(paramom1.a(), null);
      return;
    } 
    if (!j(paramContext))
      return; 
    Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
    Intent[] arrayOfIntent = paramom1.c;
    intent.putExtra("android.intent.extra.shortcut.INTENT", (Parcelable)arrayOfIntent[arrayOfIntent.length - 1]).putExtra("android.intent.extra.shortcut.NAME", paramom1.e.toString());
    IconCompat iconCompat = paramom1.f;
    if (iconCompat != null) {
      Object object;
      Context context = paramom1.a;
      if (iconCompat.a == 2) {
        object = iconCompat.b;
        if (object != null) {
          String str = (String)object;
          if (str.contains(":")) {
            object = str.split(":", -1)[1];
            String str1 = object.split("/", -1)[0];
            String str3 = object.split("/", -1)[1];
            String str2 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str3)) {
              Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
            } else {
              String str4 = iconCompat.d();
              if (nBRIsU.UpdcriPruZy.equals(str4)) {
                object = Resources.getSystem();
              } else {
                PackageManager packageManager = context.getPackageManager();
                try {
                  ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str4, 8192);
                  object = stringBuilder;
                  if (applicationInfo != null)
                    object = packageManager.getResourcesForApplication(applicationInfo); 
                } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException1) {
                  object = new StringBuilder("Unable to find pkg=");
                  object.append(str4);
                  object.append(" for icon");
                  Log.e("IconCompat", object.toString(), (Throwable)nameNotFoundException1);
                  object = null;
                } 
              } 
              i = object.getIdentifier(str3, str1, str2);
              if (iconCompat.e != i) {
                object = new StringBuilder("Id has changed for ");
                object.append(str4);
                object.append(" ");
                object.append(str);
                Log.i("IconCompat", object.toString());
                iconCompat.e = i;
              } 
            } 
          } 
        } 
      } 
      i = iconCompat.a;
      if (i != 1) {
        if (i != 2) {
          if (i == 5) {
            object = IconCompat.a((Bitmap)iconCompat.b, true);
          } else {
            l0.l("Icon type not supported for intent shortcuts");
            return;
          } 
        } else {
          try {
            intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", (Parcelable)Intent.ShortcutIconResource.fromContext(context.createPackageContext(iconCompat.d(), 0), iconCompat.e));
          } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
            object = iconCompat.b;
            stringBuilder = new StringBuilder("Can't find package ");
            stringBuilder.append(object);
            throw new IllegalArgumentException(stringBuilder.toString(), nameNotFoundException);
          } 
          nameNotFoundException.sendBroadcast(intent);
        } 
      } else {
        object = iconCompat.b;
      } 
      intent.putExtra("android.intent.extra.shortcut.ICON", (Parcelable)object);
    } 
    nameNotFoundException.sendBroadcast(intent);
  }
  
  public static void o(MenuItem paramMenuItem, char paramChar, int paramInt) {
    paramMenuItem.setAlphabeticShortcut(paramChar, paramInt);
  }
  
  public static void p(Notification.Builder paramBuilder) {
    paramBuilder.setBadgeIconType(0);
  }
  
  public static void q(MenuItem paramMenuItem, CharSequence paramCharSequence) {
    paramMenuItem.setContentDescription(paramCharSequence);
  }
  
  public static void r(Notification.Builder paramBuilder) {
    paramBuilder.setGroupAlertBehavior(0);
  }
  
  public static void s(MenuItem paramMenuItem, ColorStateList paramColorStateList) {
    paramMenuItem.setIconTintList(paramColorStateList);
  }
  
  public static void t(MenuItem paramMenuItem, PorterDuff.Mode paramMode) {
    paramMenuItem.setIconTintMode(paramMode);
  }
  
  public static void u(MenuItem paramMenuItem, char paramChar, int paramInt) {
    paramMenuItem.setNumericShortcut(paramChar, paramInt);
  }
  
  public static void v(Notification.Builder paramBuilder) {
    paramBuilder.setSettingsText(null);
  }
  
  public static void w(Notification.Builder paramBuilder) {
    paramBuilder.setShortcutId(null);
  }
  
  public static void x(Notification.Builder paramBuilder) {
    paramBuilder.setTimeoutAfter(0L);
  }
  
  public static void y(MenuItem paramMenuItem, CharSequence paramCharSequence) {
    paramMenuItem.setTooltipText(paramCharSequence);
  }
  
  public static void z(Context paramContext, Intent paramIntent) {
    paramContext.startForegroundService(paramIntent);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ii0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */