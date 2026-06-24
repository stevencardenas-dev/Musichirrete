import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

public final class s21 {
  public final ArrayList A;
  
  public final Context a;
  
  public final ArrayList b = new ArrayList();
  
  public final ArrayList c = new ArrayList();
  
  public final ArrayList d = new ArrayList();
  
  public CharSequence e;
  
  public CharSequence f;
  
  public PendingIntent g;
  
  public PendingIntent h;
  
  public IconCompat i;
  
  public int j;
  
  public boolean k = true;
  
  public hd l;
  
  public CharSequence m;
  
  public int n;
  
  public int o;
  
  public boolean p;
  
  public boolean q = false;
  
  public String r;
  
  public Bundle s;
  
  public int t = 0;
  
  public int u = 0;
  
  public RemoteViews v;
  
  public RemoteViews w;
  
  public String x;
  
  public final boolean y;
  
  public final Notification z;
  
  public s21(Context paramContext, String paramString) {
    Notification notification = new Notification();
    this.z = notification;
    this.a = paramContext;
    this.x = paramString;
    notification.when = System.currentTimeMillis();
    notification.audioStreamType = -1;
    this.j = 0;
    this.A = new ArrayList();
    this.y = true;
  }
  
  public static CharSequence c(CharSequence paramCharSequence) {
    if (paramCharSequence == null)
      return paramCharSequence; 
    CharSequence charSequence = paramCharSequence;
    if (paramCharSequence.length() > 5120)
      charSequence = paramCharSequence.subSequence(0, 5120); 
    return charSequence;
  }
  
  public final void a(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent) {
    IconCompat iconCompat = null;
    if (paramInt != 0)
      iconCompat = IconCompat.b(null, "", paramInt); 
    o21 o21 = new o21(iconCompat, paramCharSequence, paramPendingIntent, new Bundle(), null, true, true);
    this.b.add(o21);
  }
  
  public final Notification b() {
    Notification notification;
    p01 p01 = new p01(this);
    s21 s211 = (s21)p01.e;
    hd hd1 = s211.l;
    if (hd1 != null)
      hd1.a(p01); 
    int i = Build.VERSION.SDK_INT;
    Notification.Builder builder = (Notification.Builder)p01.c;
    if (i >= 26) {
      notification = builder.build();
    } else {
      notification = notification.build();
    } 
    RemoteViews remoteViews = s211.v;
    if (remoteViews != null)
      notification.contentView = remoteViews; 
    if (hd1 != null)
      s211.l.getClass(); 
    if (hd1 != null) {
      Bundle bundle = notification.extras;
      if (bundle != null) {
        String str = hd1.b();
        if (str != null)
          bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", str); 
      } 
    } 
    return notification;
  }
  
  public final void d(int paramInt, boolean paramBoolean) {
    Notification notification = this.z;
    if (paramBoolean) {
      notification.flags = paramInt | notification.flags;
      return;
    } 
    notification.flags = (paramInt ^ 0xFFFFFFFF) & notification.flags;
  }
  
  public final void e(Bitmap paramBitmap) {
    IconCompat iconCompat;
    if (paramBitmap == null) {
      paramBitmap = null;
    } else {
      if (Build.VERSION.SDK_INT < 27) {
        Resources resources = this.a.getResources();
        int i = resources.getDimensionPixelSize(2131165327);
        int j = resources.getDimensionPixelSize(2131165326);
        if (paramBitmap.getWidth() > i || paramBitmap.getHeight() > j) {
          double d = Math.min(i / Math.max(1, paramBitmap.getWidth()), j / Math.max(1, paramBitmap.getHeight()));
          paramBitmap = Bitmap.createScaledBitmap(paramBitmap, (int)Math.ceil(paramBitmap.getWidth() * d), (int)Math.ceil(paramBitmap.getHeight() * d), true);
        } 
      } 
      PorterDuff.Mode mode = IconCompat.k;
      paramBitmap.getClass();
      IconCompat iconCompat1 = new IconCompat(1);
      iconCompat1.b = paramBitmap;
      iconCompat = iconCompat1;
    } 
    this.i = iconCompat;
  }
  
  public final void f(hd paramhd) {
    if (this.l != paramhd) {
      this.l = paramhd;
      if ((s21)paramhd.a != this) {
        paramhd.a = this;
        f(paramhd);
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */