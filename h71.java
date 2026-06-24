import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import java.util.ArrayList;
import java.util.Locale;
import org.jaudiotagger.audio.Hy.PwbbJfsdcHrAjW;

public final class h71 extends zu0 {
  public static final ArrayList u;
  
  public static final ArrayList v;
  
  public final ee0 k;
  
  public final MediaRouter l;
  
  public final mv0 m;
  
  public final nv0 n;
  
  public final MediaRouter.RouteCategory o;
  
  public int p;
  
  public boolean q;
  
  public boolean r;
  
  public final ArrayList s = new ArrayList();
  
  public final ArrayList t = new ArrayList();
  
  static {
    IntentFilter intentFilter2 = new IntentFilter();
    intentFilter2.addCategory("android.media.intent.category.LIVE_AUDIO");
    ArrayList<IntentFilter> arrayList1 = new ArrayList();
    u = arrayList1;
    arrayList1.add(intentFilter2);
    IntentFilter intentFilter1 = new IntentFilter();
    intentFilter1.addCategory("android.media.intent.category.LIVE_VIDEO");
    ArrayList<IntentFilter> arrayList2 = new ArrayList();
    v = arrayList2;
    arrayList2.add(intentFilter1);
  }
  
  public h71(Context paramContext, ee0 paramee0) {
    super(paramContext, new bh0(9, new ComponentName("android", h71.class.getName())));
    this.k = paramee0;
    MediaRouter mediaRouter = (MediaRouter)paramContext.getSystemService("media_router");
    this.l = mediaRouter;
    this.m = new mv0(this);
    this.n = new nv0(this);
    this.o = mediaRouter.createRouteCategory(paramContext.getResources().getString(2131886884), false);
    s();
  }
  
  public static k71 m(MediaRouter.RouteInfo paramRouteInfo) {
    Object object = paramRouteInfo.getTag();
    return (object instanceof k71) ? (k71)object : null;
  }
  
  public static void t(k71 paramk71) {
    int i;
    MediaRouter.UserRouteInfo userRouteInfo = paramk71.b;
    hv0 hv0 = paramk71.a;
    userRouteInfo.setName(hv0.d);
    userRouteInfo.setPlaybackType(hv0.l);
    userRouteInfo.setPlaybackStream(hv0.m);
    userRouteInfo.setVolume(hv0.p);
    userRouteInfo.setVolumeMax(hv0.q);
    if (hv0.e() && !iv0.h()) {
      i = 0;
    } else {
      i = hv0.o;
    } 
    userRouteInfo.setVolumeHandling(i);
    userRouteInfo.setDescription(hv0.e);
  }
  
  public final xu0 b(String paramString) {
    int i = j(paramString);
    return (i >= 0) ? new i71(((j71)this.s.get(i)).a) : null;
  }
  
  public final void e(tu0 paramtu0) {
    boolean bool;
    int i = 0;
    byte b = 0;
    if (paramtu0 != null) {
      paramtu0.a();
      ArrayList<String> arrayList = paramtu0.b.c();
      int j = arrayList.size();
      i = 0;
      while (b < j) {
        String str = arrayList.get(b);
        if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
          i |= 0x1;
        } else if (str.equals("android.media.intent.category.LIVE_VIDEO")) {
          i |= 0x2;
        } else {
          i |= 0x800000;
        } 
        b++;
      } 
      bool = paramtu0.b();
    } else {
      bool = false;
    } 
    if (this.p != i || this.q != bool) {
      this.p = i;
      this.q = bool;
      s();
      return;
    } 
  }
  
  public final boolean h(MediaRouter.RouteInfo paramRouteInfo) {
    if (m(paramRouteInfo) == null && i(paramRouteInfo) < 0) {
      String str;
      if (this.l.getDefaultRoute() == paramRouteInfo) {
        str = "DEFAULT_ROUTE";
      } else {
        str = String.format(Locale.US, "ROUTE_%08x", new Object[] { Integer.valueOf(l(paramRouteInfo).hashCode()) });
      } 
      if (j(str) >= 0)
        for (byte b = 2;; b++) {
          Locale locale = Locale.US;
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(str);
          stringBuilder.append("_");
          stringBuilder.append(b);
          String str1 = stringBuilder.toString();
          if (j(str1) < 0) {
            str = str1;
            j71 = new j71(paramRouteInfo, str);
            r(j71);
            this.s.add(j71);
            return true;
          } 
        }  
      j71 j71 = new j71((MediaRouter.RouteInfo)j71, str);
      r(j71);
      this.s.add(j71);
      return true;
    } 
    return false;
  }
  
  public final int i(MediaRouter.RouteInfo paramRouteInfo) {
    ArrayList arrayList = this.s;
    int i = arrayList.size();
    for (byte b = 0; b < i; b++) {
      if (((j71)arrayList.get(b)).a == paramRouteInfo)
        return b; 
    } 
    return -1;
  }
  
  public final int j(String paramString) {
    ArrayList arrayList = this.s;
    int i = arrayList.size();
    for (byte b = 0; b < i; b++) {
      if (((j71)arrayList.get(b)).b.equals(paramString))
        return b; 
    } 
    return -1;
  }
  
  public final int k(hv0 paramhv0) {
    ArrayList arrayList = this.t;
    int i = arrayList.size();
    for (byte b = 0; b < i; b++) {
      if (((k71)arrayList.get(b)).a == paramhv0)
        return b; 
    } 
    return -1;
  }
  
  public final String l(MediaRouter.RouteInfo paramRouteInfo) {
    Context context = this.b;
    CharSequence charSequence = paramRouteInfo.getName(context);
    if (!TextUtils.isEmpty(charSequence))
      return charSequence.toString(); 
    if ((paramRouteInfo.getSupportedTypes() & 0x800000) == 0) {
      int i = paramRouteInfo.getDeviceType();
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            i = 2131886882;
          } else {
            i = 2131886879;
          } 
        } else {
          i = 2131886880;
        } 
      } else {
        i = 2131886881;
      } 
      return context.getString(i);
    } 
    return "";
  }
  
  public final void n(hv0 paramhv0) {
    k71 k71;
    zu0 zu01 = paramhv0.c();
    MediaRouter mediaRouter = this.l;
    if (zu01 != this) {
      MediaRouter.UserRouteInfo userRouteInfo = mediaRouter.createUserRoute(this.o);
      k71 = new k71(paramhv0, userRouteInfo);
      userRouteInfo.setTag(k71);
      userRouteInfo.setVolumeCallback(this.n);
      t(k71);
      this.t.add(k71);
      mediaRouter.addUserRoute(userRouteInfo);
      return;
    } 
    int i = i(mediaRouter.getSelectedRoute(8388611));
    if (i >= 0 && ((j71)this.s.get(i)).b.equals(((hv0)k71).b))
      k71.l(false); 
  }
  
  public final void o(hv0 paramhv0) {
    if (paramhv0.c() != this) {
      int i = k(paramhv0);
      if (i >= 0) {
        MediaRouter.UserRouteInfo userRouteInfo = ((k71)this.t.remove(i)).b;
        userRouteInfo.setTag(null);
        userRouteInfo.setVolumeCallback(null);
        try {
          this.l.removeUserRoute(userRouteInfo);
          return;
        } catch (IllegalArgumentException illegalArgumentException) {
          Log.w("AxSysMediaRouteProvider", "Failed to remove user route", illegalArgumentException);
        } 
      } 
    } 
  }
  
  public final void p(hv0 paramhv0) {
    if (paramhv0.g()) {
      zu0 zu01 = paramhv0.c();
      MediaRouter mediaRouter = this.l;
      if (zu01 != this) {
        int i = k(paramhv0);
        if (i >= 0) {
          mediaRouter.selectRoute(8388611, (MediaRouter.RouteInfo)((k71)this.t.get(i)).b);
          return;
        } 
      } else {
        int i = j(paramhv0.b);
        if (i >= 0)
          mediaRouter.selectRoute(8388611, ((j71)this.s.get(i)).a); 
      } 
    } 
  }
  
  public final void q() {
    ArrayList<su0> arrayList1 = new ArrayList();
    ArrayList arrayList = this.s;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      su0 su0 = ((j71)arrayList.get(b)).c;
      if (su0 != null) {
        if (!arrayList1.contains(su0)) {
          arrayList1.add(su0);
          b++;
          continue;
        } 
        l0.l("route descriptor already added");
        return;
      } 
      l0.l("route must not be null");
      return;
    } 
    f(new av0(arrayList1, false));
  }
  
  public final void r(j71 paramj71) {
    boolean bool;
    String str = paramj71.b;
    MediaRouter.RouteInfo routeInfo = paramj71.a;
    n2 n2 = new n2(str, l(routeInfo));
    Bundle bundle = (Bundle)n2.c;
    int i = routeInfo.getSupportedTypes();
    if ((i & 0x1) != 0)
      n2.e(u); 
    if ((i & 0x2) != 0)
      n2.e(v); 
    bundle.putInt("playbackType", routeInfo.getPlaybackType());
    bundle.putInt("playbackStream", routeInfo.getPlaybackStream());
    bundle.putInt("volume", routeInfo.getVolume());
    bundle.putInt("volumeMax", routeInfo.getVolumeMax());
    bundle.putInt("volumeHandling", routeInfo.getVolumeHandling());
    if ((i & 0x800000) == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    bundle.putBoolean("isSystemRoute", bool);
    if (!routeInfo.isEnabled())
      bundle.putBoolean("enabled", false); 
    if (routeInfo.isConnecting())
      bundle.putInt("connectionState", 1); 
    Display display = routeInfo.getPresentationDisplay();
    if (display != null)
      bundle.putInt("presentationDisplayId", display.getDisplayId()); 
    CharSequence charSequence = routeInfo.getDescription();
    if (charSequence != null) {
      charSequence = charSequence.toString();
      bundle.putString(PwbbJfsdcHrAjW.yLRqLWIMxyoJupR, (String)charSequence);
    } 
    bundle.putInt("deviceType", routeInfo.getDeviceType());
    paramj71.c = n2.k();
  }
  
  public final void s() {
    boolean bool1;
    boolean bool2 = this.r;
    mv0 mv01 = this.m;
    MediaRouter mediaRouter = this.l;
    if (bool2)
      mediaRouter.removeCallback(mv01); 
    this.r = true;
    int i = this.q;
    mediaRouter.addCallback(this.p, mv01, i | 0x2);
    int k = mediaRouter.getRouteCount();
    ArrayList<MediaRouter.RouteInfo> arrayList = new ArrayList(k);
    int j = 0;
    for (i = 0; i < k; i++)
      arrayList.add(mediaRouter.getRouteAt(i)); 
    int m = arrayList.size();
    k = 0;
    i = j;
    j = k;
    while (j < m) {
      mediaRouter = (MediaRouter)arrayList.get(j);
      j++;
      bool1 = i | h((MediaRouter.RouteInfo)mediaRouter);
    } 
    if (bool1)
      q(); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\h71.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */