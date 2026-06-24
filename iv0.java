import android.content.Context;
import android.media.MediaRouter2;
import android.media.RouteListingPreference;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class iv0 {
  public static ee0 c;
  
  public final Context a;
  
  public final ArrayList b = new ArrayList();
  
  static {
    Log.isLoggable("AxMediaRouter", 3);
  }
  
  public iv0(Context paramContext) {
    this.a = paramContext;
  }
  
  public static void b() {
    if (Looper.myLooper() == Looper.getMainLooper())
      return; 
    tp.f("The media router service must only be accessed on the application's main thread.");
  }
  
  public static ee0 c() {
    ee0 ee01 = c;
    if (ee01 != null)
      return ee01; 
    tp.f("getGlobalRouter cannot be called when sGlobal is null");
    return null;
  }
  
  public static iv0 d(Context paramContext) {
    if (paramContext != null) {
      b();
      if (c == null)
        c = new ee0(paramContext.getApplicationContext()); 
      ArrayList<WeakReference<iv0>> arrayList = c.i;
      int i = arrayList.size();
      while (--i >= 0) {
        iv0 iv02 = ((WeakReference<iv0>)arrayList.get(i)).get();
        if (iv02 == null) {
          arrayList.remove(i);
          continue;
        } 
        if (iv02.a == paramContext)
          return iv02; 
      } 
      iv0 iv01 = new iv0(paramContext);
      arrayList.add(new WeakReference<iv0>(iv01));
      return iv01;
    } 
    l0.l("context must not be null");
    return null;
  }
  
  public static MediaSessionCompat.Token e() {
    ee0 ee01 = c;
    if (ee01 != null) {
      p01 p01 = ee01.E;
      if (p01 != null) {
        zv0 zv0 = (zv0)p01.c;
        if (zv0 != null)
          return ((tv0)zv0.c).c; 
      } else {
        zv0 zv0 = ee01.F;
        if (zv0 != null)
          return ((tv0)zv0.c).c; 
      } 
    } 
    return null;
  }
  
  public static ArrayList f() {
    b();
    return (c()).j;
  }
  
  public static hv0 g() {
    b();
    return c().g();
  }
  
  public static boolean h() {
    if (c == null)
      return false; 
    lv0 lv0 = (c()).w;
    if (lv0 != null) {
      Bundle bundle = lv0.e;
      if (bundle != null && !bundle.getBoolean("androidx.mediarouter.media.MediaRouterParams.ENABLE_GROUP_VOLUME_UX", true))
        return false; 
    } 
    return true;
  }
  
  public static boolean i(cv0 paramcv0, int paramInt) {
    if (paramcv0 != null) {
      b();
      ee0 ee01 = c();
      ArrayList<hv0> arrayList = ee01.j;
      paramcv0.a();
      if (!paramcv0.b.isEmpty()) {
        boolean bool;
        if ((paramInt & 0x2) == 0 && ee01.q)
          return true; 
        lv0 lv0 = ee01.w;
        if (lv0 != null && lv0.b && ee01.h()) {
          bool = true;
        } else {
          bool = false;
        } 
        int i = arrayList.size();
        byte b = 0;
        while (b < i) {
          hv0 hv0 = arrayList.get(b);
          if (((paramInt & 0x1) != 0 && hv0.d()) || (bool && !hv0.d() && hv0.c() != ee01.s) || !hv0.h(paramcv0)) {
            b++;
            continue;
          } 
          return true;
        } 
      } 
      return false;
    } 
    l0.l("selector must not be null");
    return false;
  }
  
  public static void k(Object paramObject) {
    p01 p01;
    b();
    ee0 ee01 = c();
    zv0 zv01 = null;
    zv0 zv02 = null;
    if (paramObject != null) {
      Context context = ee01.h;
      zv01 = zv02;
      if (context != null) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
          paramObject = new xv0(paramObject);
        } else if (i >= 28) {
          paramObject = new tv0(paramObject);
        } else {
          paramObject = new tv0(paramObject);
        } 
        zv01 = new zv0(context, (tv0)paramObject);
      } 
      p01 = new p01(ee01, zv01);
    } 
    paramObject = ee01.E;
    if (paramObject != null)
      paramObject.b(); 
    ee01.E = p01;
    if (p01 != null)
      ee01.n(); 
  }
  
  public static void l(nh1 paramnh1) {
    b();
    cu0 cu0 = (c()).s;
    if (cu0 != null && Build.VERSION.SDK_INT >= 34) {
      MediaRouter2 mediaRouter2 = cu0.k;
      if (paramnh1 != null) {
        RouteListingPreference routeListingPreference = p0.n(paramnh1);
      } else {
        paramnh1 = null;
      } 
      p0.m(mediaRouter2, (RouteListingPreference)paramnh1);
    } 
  }
  
  public static void m(int paramInt) {
    if (paramInt >= 0 && paramInt <= 3) {
      b();
      ee0 ee01 = c();
      hv0 hv0 = ee01.c();
      if (ee01.g() != hv0)
        ee01.k(hv0, paramInt, true); 
      return;
    } 
    l0.l("Unsupported reason to unselect route");
  }
  
  public final void a(cv0 paramcv0, dv0 paramdv0, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 413
    //   4: aload_2
    //   5: ifnull -> 406
    //   8: invokestatic b : ()V
    //   11: aload_0
    //   12: getfield b : Ljava/util/ArrayList;
    //   15: astore #11
    //   17: aload #11
    //   19: invokevirtual size : ()I
    //   22: istore #6
    //   24: iconst_0
    //   25: istore #5
    //   27: iconst_0
    //   28: istore #4
    //   30: iload #4
    //   32: iload #6
    //   34: if_icmpge -> 63
    //   37: aload #11
    //   39: iload #4
    //   41: invokevirtual get : (I)Ljava/lang/Object;
    //   44: checkcast ev0
    //   47: getfield b : Ldv0;
    //   50: aload_2
    //   51: if_acmpne -> 57
    //   54: goto -> 66
    //   57: iinc #4, 1
    //   60: goto -> 30
    //   63: iconst_m1
    //   64: istore #4
    //   66: iload #4
    //   68: ifge -> 93
    //   71: new ev0
    //   74: dup
    //   75: aload_0
    //   76: aload_2
    //   77: invokespecial <init> : (Liv0;Ldv0;)V
    //   80: astore #10
    //   82: aload #11
    //   84: aload #10
    //   86: invokevirtual add : (Ljava/lang/Object;)Z
    //   89: pop
    //   90: goto -> 105
    //   93: aload #11
    //   95: iload #4
    //   97: invokevirtual get : (I)Ljava/lang/Object;
    //   100: checkcast ev0
    //   103: astore #10
    //   105: aload #10
    //   107: getfield d : I
    //   110: istore #4
    //   112: iconst_1
    //   113: istore #6
    //   115: iload_3
    //   116: iload #4
    //   118: if_icmpeq -> 133
    //   121: aload #10
    //   123: iload_3
    //   124: putfield d : I
    //   127: iconst_1
    //   128: istore #4
    //   130: goto -> 136
    //   133: iconst_0
    //   134: istore #4
    //   136: invokestatic elapsedRealtime : ()J
    //   139: lstore #8
    //   141: iload_3
    //   142: iconst_1
    //   143: iand
    //   144: ifeq -> 150
    //   147: iconst_1
    //   148: istore #4
    //   150: aload #10
    //   152: lload #8
    //   154: putfield e : J
    //   157: aload #10
    //   159: getfield c : Lcv0;
    //   162: astore_2
    //   163: aload_2
    //   164: invokevirtual a : ()V
    //   167: aload_1
    //   168: invokevirtual a : ()V
    //   171: aload_2
    //   172: getfield b : Ljava/util/List;
    //   175: aload_1
    //   176: getfield b : Ljava/util/List;
    //   179: invokeinterface containsAll : (Ljava/util/Collection;)Z
    //   184: ifne -> 392
    //   187: aload #10
    //   189: getfield c : Lcv0;
    //   192: astore_2
    //   193: aload_2
    //   194: ifnull -> 386
    //   197: aload_2
    //   198: invokevirtual a : ()V
    //   201: aload_2
    //   202: getfield b : Ljava/util/List;
    //   205: invokeinterface isEmpty : ()Z
    //   210: ifne -> 228
    //   213: new java/util/ArrayList
    //   216: dup
    //   217: aload_2
    //   218: getfield b : Ljava/util/List;
    //   221: invokespecial <init> : (Ljava/util/Collection;)V
    //   224: astore_2
    //   225: goto -> 230
    //   228: aconst_null
    //   229: astore_2
    //   230: aload_1
    //   231: invokevirtual c : ()Ljava/util/ArrayList;
    //   234: astore #11
    //   236: aload_2
    //   237: astore_1
    //   238: aload #11
    //   240: invokevirtual isEmpty : ()Z
    //   243: ifne -> 337
    //   246: aload #11
    //   248: invokevirtual size : ()I
    //   251: istore #7
    //   253: iload #5
    //   255: istore_3
    //   256: aload_2
    //   257: astore_1
    //   258: iload_3
    //   259: iload #7
    //   261: if_icmpge -> 337
    //   264: aload #11
    //   266: iload_3
    //   267: invokevirtual get : (I)Ljava/lang/Object;
    //   270: astore_1
    //   271: iload_3
    //   272: iconst_1
    //   273: iadd
    //   274: istore #4
    //   276: aload_1
    //   277: checkcast java/lang/String
    //   280: astore #12
    //   282: aload #12
    //   284: ifnull -> 330
    //   287: aload_2
    //   288: astore_1
    //   289: aload_2
    //   290: ifnonnull -> 301
    //   293: new java/util/ArrayList
    //   296: dup
    //   297: invokespecial <init> : ()V
    //   300: astore_1
    //   301: iload #4
    //   303: istore_3
    //   304: aload_1
    //   305: astore_2
    //   306: aload_1
    //   307: aload #12
    //   309: invokevirtual contains : (Ljava/lang/Object;)Z
    //   312: ifne -> 256
    //   315: aload_1
    //   316: aload #12
    //   318: invokevirtual add : (Ljava/lang/Object;)Z
    //   321: pop
    //   322: iload #4
    //   324: istore_3
    //   325: aload_1
    //   326: astore_2
    //   327: goto -> 256
    //   330: ldc_w 'category must not be null'
    //   333: invokestatic l : (Ljava/lang/String;)V
    //   336: return
    //   337: aload_1
    //   338: ifnonnull -> 348
    //   341: getstatic cv0.c : Lcv0;
    //   344: astore_1
    //   345: goto -> 374
    //   348: new android/os/Bundle
    //   351: dup
    //   352: invokespecial <init> : ()V
    //   355: astore_2
    //   356: aload_2
    //   357: ldc_w 'controlCategories'
    //   360: aload_1
    //   361: invokevirtual putStringArrayList : (Ljava/lang/String;Ljava/util/ArrayList;)V
    //   364: new cv0
    //   367: dup
    //   368: aload_2
    //   369: aload_1
    //   370: invokespecial <init> : (Landroid/os/Bundle;Ljava/util/ArrayList;)V
    //   373: astore_1
    //   374: aload #10
    //   376: aload_1
    //   377: putfield c : Lcv0;
    //   380: iload #6
    //   382: istore_3
    //   383: goto -> 395
    //   386: ldc 'selector must not be null'
    //   388: invokestatic l : (Ljava/lang/String;)V
    //   391: return
    //   392: iload #4
    //   394: istore_3
    //   395: iload_3
    //   396: ifeq -> 405
    //   399: invokestatic c : ()Lee0;
    //   402: invokevirtual m : ()V
    //   405: return
    //   406: ldc_w 'callback must not be null'
    //   409: invokestatic l : (Ljava/lang/String;)V
    //   412: return
    //   413: ldc 'selector must not be null'
    //   415: invokestatic l : (Ljava/lang/String;)V
    //   418: return
  }
  
  public final void j(dv0 paramdv0) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 71
    //   4: invokestatic b : ()V
    //   7: aload_0
    //   8: getfield b : Ljava/util/ArrayList;
    //   11: astore #4
    //   13: aload #4
    //   15: invokevirtual size : ()I
    //   18: istore_3
    //   19: iconst_0
    //   20: istore_2
    //   21: iload_2
    //   22: iload_3
    //   23: if_icmpge -> 51
    //   26: aload #4
    //   28: iload_2
    //   29: invokevirtual get : (I)Ljava/lang/Object;
    //   32: checkcast ev0
    //   35: getfield b : Ldv0;
    //   38: aload_1
    //   39: if_acmpne -> 45
    //   42: goto -> 53
    //   45: iinc #2, 1
    //   48: goto -> 21
    //   51: iconst_m1
    //   52: istore_2
    //   53: iload_2
    //   54: iflt -> 70
    //   57: aload #4
    //   59: iload_2
    //   60: invokevirtual remove : (I)Ljava/lang/Object;
    //   63: pop
    //   64: invokestatic c : ()Lee0;
    //   67: invokevirtual m : ()V
    //   70: return
    //   71: ldc_w 'callback must not be null'
    //   74: invokestatic l : (Ljava/lang/String;)V
    //   77: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\iv0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */