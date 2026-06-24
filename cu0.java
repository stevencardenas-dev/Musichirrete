import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jaudiotagger.audio.real.Nq.JkpGFvCVQHzgc;

public final class cu0 extends zu0 {
  public final MediaRouter2 k;
  
  public final ae0 l;
  
  public final ArrayMap m = new ArrayMap();
  
  public final MediaRouter2.RouteCallback n;
  
  public final bu0 o = new bu0(this);
  
  public final wt0 p = new wt0(this);
  
  public final vt0 q;
  
  public boolean r;
  
  public ArrayList s = new ArrayList();
  
  public final ArrayMap t = new ArrayMap();
  
  public String u;
  
  static {
    Log.isLoggable("MR2Provider", 3);
  }
  
  public cu0(Context paramContext, ae0 paramae0) {
    super(paramContext, null);
    this.k = MediaRouter2.getInstance(paramContext);
    this.l = paramae0;
    this.q = new vt0(new Handler(Looper.getMainLooper()));
    if (Build.VERSION.SDK_INT >= 34) {
      this.n = new au0(1, this);
      return;
    } 
    this.n = new au0(0, this);
  }
  
  public static Messenger h(MediaRouter2.RoutingController paramRoutingController) {
    Bundle bundle = paramRoutingController.getControlHints();
    return (bundle == null) ? null : (Messenger)bundle.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
  }
  
  public static String i(xu0 paramxu0) {
    if (!(paramxu0 instanceof yt0))
      return null; 
    MediaRouter2.RoutingController routingController = ((yt0)paramxu0).g;
    return (routingController == null) ? null : routingController.getId();
  }
  
  public final wu0 a(String paramString, yu0 paramyu0) {
    Iterator<Map.Entry> iterator = this.m.entrySet().iterator();
    while (iterator.hasNext()) {
      yt0 yt0 = (yt0)((Map.Entry)iterator.next()).getValue();
      if (TextUtils.equals(paramString, yt0.f))
        return yt0; 
    } 
    return null;
  }
  
  public final xu0 b(String paramString) {
    return new zt0((String)this.t.get(paramString), null);
  }
  
  public final xu0 d(String paramString1, String paramString2) {
    String str = (String)this.t.get(paramString1);
    for (yt0 yt0 : this.m.values()) {
      if (TextUtils.equals(paramString2, yt0.k()))
        return new zt0(str, yt0); 
    } 
    StringBuilder stringBuilder = new StringBuilder("Could not find the matching GroupRouteController. routeId=");
    stringBuilder.append(paramString1);
    stringBuilder.append(", routeGroupId=");
    stringBuilder.append(paramString2);
    paramString1 = stringBuilder.toString();
    Log.w(JkpGFvCVQHzgc.rGCM, paramString1);
    return new zt0(str, null);
  }
  
  public final void e(tu0 paramtu0) {
    int i;
    if (iv0.c == null) {
      i = 0;
    } else {
      i = (iv0.c()).D;
    } 
    MediaRouter2.RouteCallback routeCallback = this.n;
    wt0 wt01 = this.p;
    bu0 bu01 = this.o;
    if (i > 0) {
      cv0 cv0;
      ArrayList arrayList;
      lv0 lv0 = (iv0.c()).w;
      if (lv0 == null) {
        bool = false;
      } else {
        bool = lv0.c;
      } 
      tu0 tu01 = paramtu0;
      if (paramtu0 == null)
        tu01 = new tu0(cv0.c, false); 
      tu01.a();
      ArrayList<String> arrayList1 = tu01.b.c();
      if (bool) {
        if (!arrayList1.contains("android.media.intent.category.LIVE_AUDIO"))
          arrayList1.add("android.media.intent.category.LIVE_AUDIO"); 
      } else {
        arrayList1.remove("android.media.intent.category.LIVE_AUDIO");
      } 
      if (!arrayList1.isEmpty()) {
        int j = arrayList1.size();
        i = 0;
        paramtu0 = null;
        while (true) {
          arrayList = (ArrayList)paramtu0;
          if (i < j) {
            arrayList = (ArrayList)arrayList1.get(i);
            int k = i + 1;
            String str = (String)arrayList;
            if (str != null) {
              ArrayList<String> arrayList3;
              arrayList = (ArrayList)paramtu0;
              if (paramtu0 == null)
                arrayList3 = new ArrayList(); 
              i = k;
              ArrayList<String> arrayList2 = arrayList3;
              if (!arrayList3.contains(str)) {
                arrayList3.add(str);
                i = k;
                arrayList2 = arrayList3;
              } 
              continue;
            } 
            l0.l("category must not be null");
            return;
          } 
          break;
        } 
      } else {
        arrayList = null;
      } 
      if (arrayList == null) {
        cv0 = cv0.c;
      } else {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", arrayList);
        cv0 = new cv0(bundle, arrayList);
      } 
      boolean bool = tu01.b();
      if (cv0 != null) {
        RouteDiscoveryPreference routeDiscoveryPreference;
        Bundle bundle = new Bundle();
        bundle.putBundle("selector", cv0.a);
        bundle.putBoolean("activeScan", bool);
        MediaRouter2 mediaRouter2 = this.k;
        cv0.a();
        if (cv0.b.contains(null)) {
          RouteDiscoveryPreference.Builder builder = new RouteDiscoveryPreference.Builder();
          routeDiscoveryPreference = (new RouteDiscoveryPreference.Builder(new ArrayList(), false)).build();
        } else {
          bool = bundle.getBoolean("activeScan");
          ArrayList<String> arrayList2 = new ArrayList();
          arrayList1 = routeDiscoveryPreference.c();
          int j = arrayList1.size();
          for (i = 0; i < j; i = k) {
            routeDiscoveryPreference = (RouteDiscoveryPreference)arrayList1.get(i);
            int k = i + 1;
            String str = (String)routeDiscoveryPreference;
            str.getClass();
            int m = str.hashCode();
            i = -1;
            switch (m) {
              case 1693091761:
                if (!str.equals("android.media.intent.category.REMOTE_VIDEO_PLAYBACK"))
                  break; 
                i = 4;
                break;
              case 1601181366:
                if (!str.equals("android.media.intent.category.REMOTE_AUDIO_PLAYBACK"))
                  break; 
                i = 3;
                break;
              case 975975375:
                if (!str.equals("android.media.intent.category.LIVE_VIDEO"))
                  break; 
                i = 2;
                break;
              case 956939050:
                if (!str.equals("android.media.intent.category.LIVE_AUDIO"))
                  break; 
                i = 1;
                break;
              case -2065577523:
                if (!str.equals("android.media.intent.category.REMOTE_PLAYBACK"))
                  break; 
                i = 0;
                break;
            } 
            switch (i) {
              case 4:
                str = "android.media.route.feature.REMOTE_VIDEO_PLAYBACK";
                break;
              case 3:
                str = "android.media.route.feature.REMOTE_AUDIO_PLAYBACK";
                break;
              case 2:
                str = "android.media.route.feature.LIVE_VIDEO";
                break;
              case 1:
                str = "android.media.route.feature.LIVE_AUDIO";
                break;
              case 0:
                str = "android.media.route.feature.REMOTE_PLAYBACK";
                break;
            } 
            arrayList2.add(str);
          } 
          routeDiscoveryPreference = (new RouteDiscoveryPreference.Builder(arrayList2, bool)).build();
        } 
        vt0 vt01 = this.q;
        mediaRouter2.registerRouteCallback(vt01, routeCallback, routeDiscoveryPreference);
        this.k.registerTransferCallback(vt01, bu01);
        this.k.registerControllerCallback(vt01, wt01);
        return;
      } 
      l0.l("selector must not be null");
      return;
    } 
    this.k.unregisterRouteCallback(routeCallback);
    this.k.unregisterTransferCallback(bu01);
    this.k.unregisterControllerCallback(wt01);
  }
  
  public final void j() {
    ArrayList<MediaRoute2Info> arrayList2 = new ArrayList();
    ArraySet arraySet = new ArraySet();
    Iterator iterator = this.k.getRoutes().iterator();
    while (iterator.hasNext()) {
      MediaRoute2Info mediaRoute2Info = m60.d(iterator.next());
      if (mediaRoute2Info == null || arraySet.contains(mediaRoute2Info) || mediaRoute2Info.isSystemRoute())
        continue; 
      if (this.r) {
        String str = mediaRoute2Info.getId();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b.getPackageName());
        stringBuilder.append("/");
        if (!str.startsWith(stringBuilder.toString()))
          continue; 
      } 
      arraySet.add(mediaRoute2Info);
      arrayList2.add(mediaRoute2Info);
    } 
    if (arrayList2.equals(this.s))
      return; 
    this.s = arrayList2;
    ArrayMap arrayMap = this.t;
    arrayMap.clear();
    ArrayList<ArrayList<MediaRoute2Info>> arrayList1 = this.s;
    int j = arrayList1.size();
    boolean bool = false;
    int i = 0;
    while (i < j) {
      StringBuilder stringBuilder;
      arrayList2 = arrayList1.get(i);
      i++;
      MediaRoute2Info mediaRoute2Info = m60.d(arrayList2);
      Bundle bundle = mediaRoute2Info.getExtras();
      if (bundle == null || bundle.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
        stringBuilder = new StringBuilder("Cannot find the original route Id. route=");
        stringBuilder.append(mediaRoute2Info);
        Log.w("MR2Provider", stringBuilder.toString());
        continue;
      } 
      arrayMap.put(mediaRoute2Info.getId(), stringBuilder.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
    } 
    ArrayList<su0> arrayList = new ArrayList();
    arrayList1 = this.s;
    int k = arrayList1.size();
    i = 0;
    while (i < k) {
      arrayList2 = arrayList1.get(i);
      j = i + 1;
      su0 su0 = n0.B(m60.d(arrayList2));
      i = j;
      if (su0 != null) {
        arrayList.add(su0);
        i = j;
      } 
    } 
    arrayList1 = new ArrayList<ArrayList<MediaRoute2Info>>();
    if (!arrayList.isEmpty()) {
      j = arrayList.size();
      i = bool;
      while (i < j) {
        arrayList2 = (ArrayList<MediaRoute2Info>)arrayList.get(i);
        i++;
        su0 su0 = (su0)arrayList2;
        if (su0 != null) {
          if (!arrayList1.contains(su0)) {
            arrayList1.add(su0);
            continue;
          } 
          l0.l("route descriptor already added");
          return;
        } 
        l0.l("route must not be null");
        return;
      } 
    } 
    f(new av0(arrayList1, true));
  }
  
  public final void k(MediaRouter2.RoutingController paramRoutingController) {
    StringBuilder stringBuilder;
    n2 n2;
    yt0 yt0 = (yt0)this.m.get(paramRoutingController);
    if (yt0 == null) {
      stringBuilder = new StringBuilder("setDynamicRouteDescriptors: No matching routeController found. routingController=");
      stringBuilder.append(paramRoutingController);
      Log.w("MR2Provider", stringBuilder.toString());
      return;
    } 
    List list1 = paramRoutingController.getSelectedRoutes();
    if (list1.isEmpty()) {
      stringBuilder = new StringBuilder("setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=");
      stringBuilder.append(paramRoutingController);
      Log.w("MR2Provider", stringBuilder.toString());
      return;
    } 
    ArrayList arrayList3 = n0.m((List)stringBuilder);
    su0 su02 = n0.B(m60.d(stringBuilder.get(0)));
    Bundle bundle2 = paramRoutingController.getControlHints();
    String str2 = this.b.getString(2131886876);
    String str4 = null;
    String str1 = str2;
    String str3 = str4;
    if (bundle2 != null) {
      str1 = str2;
      try {
        str3 = bundle2.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
        String str = str2;
        str1 = str2;
        if (!TextUtils.isEmpty(str3))
          str = str3; 
        str1 = str;
        Bundle bundle = bundle2.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
        str1 = str;
        str3 = str4;
        if (bundle != null) {
          str1 = str;
          su0 su0 = new su0();
          str1 = str;
          this(bundle);
          str1 = str;
        } 
      } catch (Exception exception) {
        Log.w("MR2Provider", "Exception while unparceling control hints.", exception);
        str3 = str4;
      } 
    } 
    if (str3 == null) {
      n2 = new n2(paramRoutingController.getId(), str1);
      Bundle bundle = (Bundle)n2.c;
      bundle.putInt("connectionState", 2);
      bundle.putInt("playbackType", 1);
    } else {
      n2 = new n2((su0)str3);
    } 
    Bundle bundle1 = (Bundle)n2.c;
    bundle1.putInt("volume", paramRoutingController.getVolume());
    bundle1.putInt("volumeMax", paramRoutingController.getVolumeMax());
    bundle1.putInt("volumeHandling", paramRoutingController.getVolumeHandling());
    ((ArrayList)n2.f).clear();
    n2.e(su02.b());
    ((ArrayList)n2.e).clear();
    n2.g(arrayList3);
    su0 su01 = n2.k();
    ArrayList arrayList1 = n0.m(paramRoutingController.getSelectableRoutes());
    ArrayList arrayList2 = n0.m(paramRoutingController.getDeselectableRoutes());
    av0 av0 = this.i;
    if (av0 == null) {
      Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
      return;
    } 
    ArrayList<vu0> arrayList = new ArrayList();
    List list2 = av0.b;
    if (!list2.isEmpty())
      for (su0 su0 : list2) {
        boolean bool;
        String str = su0.d();
        if (arrayList3.contains(str)) {
          bool = true;
        } else {
          bool = true;
        } 
        boolean bool1 = arrayList1.contains(str);
        arrayList.add(new vu0(su0, bool, arrayList2.contains(str), bool1, true));
      }  
    yt0.o = su01;
    yt0.j(su01, arrayList);
  }
  
  public final void l(String paramString) {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull -> 7
    //   4: goto -> 59
    //   7: aload_0
    //   8: getfield s : Ljava/util/ArrayList;
    //   11: astore #5
    //   13: aload #5
    //   15: invokevirtual size : ()I
    //   18: istore_3
    //   19: iconst_0
    //   20: istore_2
    //   21: iload_2
    //   22: iload_3
    //   23: if_icmpge -> 59
    //   26: aload #5
    //   28: iload_2
    //   29: invokevirtual get : (I)Ljava/lang/Object;
    //   32: astore #4
    //   34: iinc #2, 1
    //   37: aload #4
    //   39: invokestatic d : (Ljava/lang/Object;)Landroid/media/MediaRoute2Info;
    //   42: astore #4
    //   44: aload #4
    //   46: invokevirtual getId : ()Ljava/lang/String;
    //   49: aload_1
    //   50: invokestatic equals : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   53: ifeq -> 21
    //   56: goto -> 62
    //   59: aconst_null
    //   60: astore #4
    //   62: aload #4
    //   64: ifnonnull -> 98
    //   67: new java/lang/StringBuilder
    //   70: dup
    //   71: ldc_w 'transferTo: Specified route not found. routeId='
    //   74: invokespecial <init> : (Ljava/lang/String;)V
    //   77: astore #4
    //   79: aload #4
    //   81: aload_1
    //   82: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: ldc 'MR2Provider'
    //   88: aload #4
    //   90: invokevirtual toString : ()Ljava/lang/String;
    //   93: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   96: pop
    //   97: return
    //   98: aload_0
    //   99: getfield u : Ljava/lang/String;
    //   102: aload_1
    //   103: invokestatic equals : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   106: ifeq -> 138
    //   109: new java/lang/StringBuilder
    //   112: dup
    //   113: ldc_w 'Ignoring attempt to transfer to pending transfer route: '
    //   116: invokespecial <init> : (Ljava/lang/String;)V
    //   119: astore_1
    //   120: aload_1
    //   121: aload #4
    //   123: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   126: pop
    //   127: ldc 'MR2Provider'
    //   129: aload_1
    //   130: invokevirtual toString : ()Ljava/lang/String;
    //   133: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   136: pop
    //   137: return
    //   138: aload_0
    //   139: aload_1
    //   140: putfield u : Ljava/lang/String;
    //   143: aload_0
    //   144: getfield k : Landroid/media/MediaRouter2;
    //   147: aload #4
    //   149: invokevirtual transferTo : (Landroid/media/MediaRoute2Info;)V
    //   152: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cu0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */