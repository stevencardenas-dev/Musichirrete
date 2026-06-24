import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import android.util.Log;
import com.google.android.gms.common.api.internal.jEVH.KjdXPYm;
import in.krosbits.musicolet.MusicService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.jaudiotagger.audio.dsf.qdA.GMDx;

public final class ee0 {
  public static final int H = 0;
  
  public wu0 A;
  
  public tu0 B;
  
  public tu0 C;
  
  public int D;
  
  public p01 E;
  
  public zv0 F;
  
  public final ae0 G;
  
  public final be0 a;
  
  public final HashMap b;
  
  public final gf1 c;
  
  public hv0 d;
  
  public xu0 e;
  
  public f f;
  
  public wm0 g;
  
  public final Context h;
  
  public final ArrayList i;
  
  public final ArrayList j;
  
  public final HashMap k;
  
  public final HashMap l;
  
  public final ArrayList m;
  
  public final ArrayList n;
  
  public final lf1 o;
  
  public final ae0 p;
  
  public final boolean q;
  
  public final boolean r;
  
  public cu0 s;
  
  public final h71 t;
  
  public bu u;
  
  public final jv0 v;
  
  public lv0 w;
  
  public hv0 x;
  
  public hv0 y;
  
  public hv0 z;
  
  static {
    Log.isLoggable("AxMediaRouter", 3);
  }
  
  public ee0(Context paramContext) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: new be0
    //   8: dup
    //   9: aload_0
    //   10: invokespecial <init> : (Lee0;)V
    //   13: putfield a : Lbe0;
    //   16: aload_0
    //   17: new java/util/HashMap
    //   20: dup
    //   21: invokespecial <init> : ()V
    //   24: putfield b : Ljava/util/HashMap;
    //   27: aload_0
    //   28: new java/util/ArrayList
    //   31: dup
    //   32: invokespecial <init> : ()V
    //   35: putfield i : Ljava/util/ArrayList;
    //   38: aload_0
    //   39: new java/util/ArrayList
    //   42: dup
    //   43: invokespecial <init> : ()V
    //   46: putfield j : Ljava/util/ArrayList;
    //   49: aload_0
    //   50: new java/util/HashMap
    //   53: dup
    //   54: invokespecial <init> : ()V
    //   57: putfield k : Ljava/util/HashMap;
    //   60: aload_0
    //   61: new java/util/HashMap
    //   64: dup
    //   65: invokespecial <init> : ()V
    //   68: putfield l : Ljava/util/HashMap;
    //   71: aload_0
    //   72: new java/util/ArrayList
    //   75: dup
    //   76: invokespecial <init> : ()V
    //   79: putfield m : Ljava/util/ArrayList;
    //   82: aload_0
    //   83: new java/util/ArrayList
    //   86: dup
    //   87: invokespecial <init> : ()V
    //   90: putfield n : Ljava/util/ArrayList;
    //   93: new java/lang/Object
    //   96: dup
    //   97: invokespecial <init> : ()V
    //   100: astore #5
    //   102: aload #5
    //   104: iconst_0
    //   105: putfield c : I
    //   108: aload #5
    //   110: iconst_3
    //   111: putfield d : I
    //   114: aload_0
    //   115: aload #5
    //   117: putfield o : Llf1;
    //   120: aload_0
    //   121: new ae0
    //   124: dup
    //   125: aload_0
    //   126: invokespecial <init> : (Lee0;)V
    //   129: putfield p : Lae0;
    //   132: aload_0
    //   133: new ae0
    //   136: dup
    //   137: aload_0
    //   138: invokespecial <init> : (Lee0;)V
    //   141: putfield G : Lae0;
    //   144: aload_0
    //   145: aload_1
    //   146: putfield h : Landroid/content/Context;
    //   149: aload_0
    //   150: aload_1
    //   151: ldc 'activity'
    //   153: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   156: checkcast android/app/ActivityManager
    //   159: invokevirtual isLowRamDevice : ()Z
    //   162: putfield q : Z
    //   165: getstatic android/os/Build$VERSION.SDK_INT : I
    //   168: istore_2
    //   169: iload_2
    //   170: bipush #30
    //   172: if_icmplt -> 225
    //   175: getstatic androidx/mediarouter/media/MediaTransferReceiver.a : I
    //   178: istore_3
    //   179: new android/content/Intent
    //   182: dup
    //   183: aload_1
    //   184: ldc androidx/mediarouter/media/MediaTransferReceiver
    //   186: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   189: astore #5
    //   191: aload #5
    //   193: aload_1
    //   194: invokevirtual getPackageName : ()Ljava/lang/String;
    //   197: invokevirtual setPackage : (Ljava/lang/String;)Landroid/content/Intent;
    //   200: pop
    //   201: aload_1
    //   202: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   205: aload #5
    //   207: iconst_0
    //   208: invokevirtual queryBroadcastReceivers : (Landroid/content/Intent;I)Ljava/util/List;
    //   211: invokeinterface size : ()I
    //   216: ifle -> 225
    //   219: iconst_1
    //   220: istore #4
    //   222: goto -> 228
    //   225: iconst_0
    //   226: istore #4
    //   228: aload_0
    //   229: iload #4
    //   231: putfield r : Z
    //   234: getstatic qs1.a : I
    //   237: istore_3
    //   238: new android/content/Intent
    //   241: dup
    //   242: aload_1
    //   243: ldc qs1
    //   245: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   248: astore #5
    //   250: aload #5
    //   252: aload_1
    //   253: invokevirtual getPackageName : ()Ljava/lang/String;
    //   256: invokevirtual setPackage : (Ljava/lang/String;)Landroid/content/Intent;
    //   259: pop
    //   260: aload_1
    //   261: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   264: aload #5
    //   266: iconst_0
    //   267: invokevirtual queryBroadcastReceivers : (Landroid/content/Intent;I)Ljava/util/List;
    //   270: invokeinterface size : ()I
    //   275: pop
    //   276: iload_2
    //   277: bipush #30
    //   279: if_icmplt -> 308
    //   282: iload #4
    //   284: ifeq -> 308
    //   287: new cu0
    //   290: dup
    //   291: aload_1
    //   292: new ae0
    //   295: dup
    //   296: aload_0
    //   297: invokespecial <init> : (Lee0;)V
    //   300: invokespecial <init> : (Landroid/content/Context;Lae0;)V
    //   303: astore #5
    //   305: goto -> 311
    //   308: aconst_null
    //   309: astore #5
    //   311: aload_0
    //   312: aload #5
    //   314: putfield s : Lcu0;
    //   317: new h71
    //   320: dup
    //   321: aload_1
    //   322: aload_0
    //   323: invokespecial <init> : (Landroid/content/Context;Lee0;)V
    //   326: astore #5
    //   328: aload_0
    //   329: aload #5
    //   331: putfield t : Lh71;
    //   334: aload_0
    //   335: new jv0
    //   338: dup
    //   339: new e
    //   342: dup
    //   343: bipush #21
    //   345: aload_0
    //   346: invokespecial <init> : (ILjava/lang/Object;)V
    //   349: invokespecial <init> : (Le;)V
    //   352: putfield v : Ljv0;
    //   355: aload_0
    //   356: aload #5
    //   358: iconst_1
    //   359: invokevirtual a : (Lzu0;Z)V
    //   362: aload_0
    //   363: getfield s : Lcu0;
    //   366: astore #5
    //   368: aload #5
    //   370: ifnull -> 380
    //   373: aload_0
    //   374: aload #5
    //   376: iconst_1
    //   377: invokevirtual a : (Lzu0;Z)V
    //   380: new gf1
    //   383: dup
    //   384: aload_1
    //   385: aload_0
    //   386: invokespecial <init> : (Landroid/content/Context;Lee0;)V
    //   389: astore_1
    //   390: aload_0
    //   391: aload_1
    //   392: putfield c : Lgf1;
    //   395: aload_1
    //   396: getfield g : Z
    //   399: ifne -> 500
    //   402: aload_1
    //   403: iconst_1
    //   404: putfield g : Z
    //   407: new android/content/IntentFilter
    //   410: dup
    //   411: invokespecial <init> : ()V
    //   414: astore #8
    //   416: aload #8
    //   418: ldc 'android.intent.action.PACKAGE_ADDED'
    //   420: invokevirtual addAction : (Ljava/lang/String;)V
    //   423: aload #8
    //   425: ldc 'android.intent.action.PACKAGE_REMOVED'
    //   427: invokevirtual addAction : (Ljava/lang/String;)V
    //   430: aload #8
    //   432: ldc 'android.intent.action.PACKAGE_CHANGED'
    //   434: invokevirtual addAction : (Ljava/lang/String;)V
    //   437: aload #8
    //   439: getstatic com/google/android/gms/common/util/DyJ/oXrNDUqUkE.DMfBOyqADMmS : Ljava/lang/String;
    //   442: invokevirtual addAction : (Ljava/lang/String;)V
    //   445: aload #8
    //   447: ldc 'android.intent.action.PACKAGE_RESTARTED'
    //   449: invokevirtual addAction : (Ljava/lang/String;)V
    //   452: aload #8
    //   454: ldc 'package'
    //   456: invokevirtual addDataScheme : (Ljava/lang/String;)V
    //   459: aload_1
    //   460: getfield a : Landroid/content/Context;
    //   463: astore #5
    //   465: aload_1
    //   466: getfield h : Lq6;
    //   469: astore #6
    //   471: aload_1
    //   472: getfield c : Landroid/os/Handler;
    //   475: astore #7
    //   477: aload #5
    //   479: aload #6
    //   481: aload #8
    //   483: aconst_null
    //   484: aload #7
    //   486: invokevirtual registerReceiver : (Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;
    //   489: pop
    //   490: aload #7
    //   492: aload_1
    //   493: getfield i : Le3;
    //   496: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   499: pop
    //   500: return
  }
  
  public final void a(zu0 paramzu0, boolean paramBoolean) {
    if (d(paramzu0) == null) {
      gv0 gv0 = new gv0(paramzu0, paramBoolean);
      this.m.add(gv0);
      this.a.b(513, gv0);
      o(gv0, paramzu0.i);
      iv0.b();
      paramzu0.f = this.p;
      paramzu0.g(this.B);
    } 
  }
  
  public final String b(gv0 paramgv0, String paramString) {
    // Byte code:
    //   0: aload_1
    //   1: getfield d : Lbh0;
    //   4: getfield c : Ljava/lang/Object;
    //   7: checkcast android/content/ComponentName
    //   10: invokevirtual flattenToShortString : ()Ljava/lang/String;
    //   13: astore #7
    //   15: aload_1
    //   16: getfield c : Z
    //   19: istore #6
    //   21: iload #6
    //   23: ifeq -> 31
    //   26: aload_2
    //   27: astore_1
    //   28: goto -> 41
    //   31: aload #7
    //   33: ldc_w ':'
    //   36: aload_2
    //   37: invokestatic l : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   40: astore_1
    //   41: aload_0
    //   42: getfield l : Ljava/util/HashMap;
    //   45: astore #8
    //   47: iload #6
    //   49: ifne -> 291
    //   52: aload_0
    //   53: getfield j : Ljava/util/ArrayList;
    //   56: astore #9
    //   58: aload #9
    //   60: invokevirtual size : ()I
    //   63: istore #4
    //   65: iconst_0
    //   66: istore_3
    //   67: iload_3
    //   68: iload #4
    //   70: if_icmpge -> 101
    //   73: aload #9
    //   75: iload_3
    //   76: invokevirtual get : (I)Ljava/lang/Object;
    //   79: checkcast hv0
    //   82: getfield c : Ljava/lang/String;
    //   85: aload_1
    //   86: invokevirtual equals : (Ljava/lang/Object;)Z
    //   89: ifeq -> 95
    //   92: goto -> 103
    //   95: iinc #3, 1
    //   98: goto -> 67
    //   101: iconst_m1
    //   102: istore_3
    //   103: iload_3
    //   104: ifge -> 110
    //   107: goto -> 291
    //   110: new java/lang/StringBuilder
    //   113: dup
    //   114: ldc_w 'Either '
    //   117: invokespecial <init> : (Ljava/lang/String;)V
    //   120: astore #10
    //   122: aload #10
    //   124: aload_2
    //   125: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: pop
    //   129: aload #10
    //   131: ldc_w ' isn't unique in '
    //   134: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   137: pop
    //   138: aload #10
    //   140: aload #7
    //   142: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: pop
    //   146: aload #10
    //   148: ldc_w ' or we're trying to assign a unique ID for an already added route'
    //   151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: pop
    //   155: ldc 'AxMediaRouter'
    //   157: aload #10
    //   159: invokevirtual toString : ()Ljava/lang/String;
    //   162: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   165: pop
    //   166: iconst_2
    //   167: istore #4
    //   169: getstatic java/util/Locale.US : Ljava/util/Locale;
    //   172: astore #10
    //   174: new java/lang/StringBuilder
    //   177: dup
    //   178: invokespecial <init> : ()V
    //   181: astore #10
    //   183: aload #10
    //   185: aload_1
    //   186: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: pop
    //   190: aload #10
    //   192: ldc_w '_'
    //   195: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: pop
    //   199: aload #10
    //   201: iload #4
    //   203: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   206: pop
    //   207: aload #10
    //   209: invokevirtual toString : ()Ljava/lang/String;
    //   212: astore #10
    //   214: aload #9
    //   216: invokevirtual size : ()I
    //   219: istore #5
    //   221: iconst_0
    //   222: istore_3
    //   223: iload_3
    //   224: iload #5
    //   226: if_icmpge -> 258
    //   229: aload #9
    //   231: iload_3
    //   232: invokevirtual get : (I)Ljava/lang/Object;
    //   235: checkcast hv0
    //   238: getfield c : Ljava/lang/String;
    //   241: aload #10
    //   243: invokevirtual equals : (Ljava/lang/Object;)Z
    //   246: ifeq -> 252
    //   249: goto -> 260
    //   252: iinc #3, 1
    //   255: goto -> 223
    //   258: iconst_m1
    //   259: istore_3
    //   260: iload_3
    //   261: ifge -> 285
    //   264: aload #8
    //   266: new u51
    //   269: dup
    //   270: aload #7
    //   272: aload_2
    //   273: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   276: aload #10
    //   278: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   281: pop
    //   282: aload #10
    //   284: areturn
    //   285: iinc #4, 1
    //   288: goto -> 169
    //   291: aload #8
    //   293: new u51
    //   296: dup
    //   297: aload #7
    //   299: aload_2
    //   300: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   303: aload_1
    //   304: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   307: pop
    //   308: aload_1
    //   309: areturn
  }
  
  public final hv0 c() {
    ArrayList<Object> arrayList = this.j;
    int j = arrayList.size();
    int i = 0;
    while (i < j) {
      hv0 hv01 = (hv0)arrayList.get(i);
      int k = i + 1;
      hv01 = hv01;
      i = k;
      if (hv01 != this.x) {
        i = k;
        if (hv01.c() == this.t) {
          i = k;
          if (hv01.m("android.media.intent.category.LIVE_AUDIO")) {
            i = k;
            if (!hv01.m("android.media.intent.category.LIVE_VIDEO")) {
              i = k;
              if (hv01.f())
                return hv01; 
            } 
          } 
        } 
      } 
    } 
    return this.x;
  }
  
  public final gv0 d(zu0 paramzu0) {
    ArrayList<Object> arrayList = this.m;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      gv0 gv0 = (gv0)arrayList.get(b);
      b++;
      gv0 = gv0;
      if (gv0.a == paramzu0)
        return gv0; 
    } 
    return null;
  }
  
  public final ArrayList e() {
    ArrayList arrayList = new ArrayList();
    Iterator iterator = this.k.values().iterator();
    if (!iterator.hasNext())
      return arrayList; 
    throw x41.g(iterator);
  }
  
  public final xu0 f(hv0 paramhv0) {
    Iterator iterator1;
    if (paramhv0 == this.d) {
      xu0 xu02 = this.e;
      if (xu02 != null)
        return xu02; 
    } 
    boolean bool = paramhv0 instanceof fv0;
    HashMap hashMap = this.k;
    if (bool) {
      fv0 fv0 = (fv0)paramhv0;
      iv0.b();
      if (iv0.c().e().contains(fv0)) {
        iterator1 = hashMap.values().iterator();
        if (!iterator1.hasNext())
          return null; 
        throw x41.g(iterator1);
      } 
    } 
    xu0 xu01 = (xu0)this.b.get(((hv0)iterator1).c);
    if (xu01 != null)
      return xu01; 
    Iterator iterator2 = hashMap.values().iterator();
    if (!iterator2.hasNext())
      return xu01; 
    throw x41.g(iterator2);
  }
  
  public final hv0 g() {
    hv0 hv01 = this.d;
    if (hv01 != null)
      return hv01; 
    tp.f("There is no currently selected route.  The media router has not yet been fully initialized.");
    return null;
  }
  
  public final boolean h() {
    if (this.r) {
      lv0 lv01 = this.w;
      if (lv01 == null || lv01.a)
        return true; 
    } 
    return false;
  }
  
  public final void i() {
    if (this.d.e()) {
      List<?> list = Collections.unmodifiableList(this.d.w);
      HashSet<String> hashSet = new HashSet();
      Iterator<?> iterator = list.iterator();
      while (iterator.hasNext())
        hashSet.add(((hv0)iterator.next()).c); 
      HashMap<String, xu0> hashMap = this.b;
      Iterator<Map.Entry> iterator1 = hashMap.entrySet().iterator();
      while (iterator1.hasNext()) {
        Map.Entry entry = iterator1.next();
        if (!hashSet.contains(entry.getKey())) {
          xu0 xu01 = (xu0)entry.getValue();
          xu01.h(0);
          xu01.d();
          iterator1.remove();
        } 
      } 
      for (hv0 hv01 : list) {
        if (!hashMap.containsKey(hv01.c)) {
          xu0 xu01 = hv01.c().d(hv01.b, this.d.b);
          if (xu01 != null) {
            xu01.e();
            hashMap.put(hv01.c, xu01);
          } 
        } 
      } 
    } 
  }
  
  public final void j(ee0 paramee0, hv0 paramhv01, xu0 paramxu0, int paramInt, boolean paramBoolean, hv0 paramhv02, Collection paramCollection) {
    MusicService musicService;
    wm0 wm02 = this.g;
    if (wm02 != null) {
      xu0 xu01 = (xu0)wm02.g;
      if (!wm02.e && !wm02.f) {
        wm02.f = true;
        if (xu01 != null) {
          xu01.h(0);
          xu01.d();
        } 
      } 
      this.g = null;
    } 
    wm0 wm01 = new wm0(paramee0, paramhv01, paramxu0, paramInt, paramBoolean, paramhv02, paramCollection);
    this.g = wm01;
    if (wm01.a == 3) {
      f f1 = this.f;
      if (f1 != null) {
        musicService = (MusicService)f1.c;
        if (musicService.w && MusicService.F0)
          musicService.p(); 
        this.g.d();
        return;
      } 
    } 
    musicService.d();
  }
  
  public final void k(hv0 paramhv0, int paramInt, boolean paramBoolean) {
    cu0 cu01;
    boolean bool = this.j.contains(paramhv0);
    String str = KjdXPYm.xNishyn;
    if (!bool) {
      StringBuilder stringBuilder1 = new StringBuilder("Ignoring attempt to select removed route: ");
      stringBuilder1.append(paramhv0);
      Log.w(str, stringBuilder1.toString());
      return;
    } 
    if (!paramhv0.g) {
      StringBuilder stringBuilder1 = new StringBuilder("Ignoring attempt to select disabled route: ");
      stringBuilder1.append(paramhv0);
      Log.w(str, stringBuilder1.toString());
      return;
    } 
    hv0 hv01 = this.d;
    if (hv01 != paramhv0) {
      if (hv01 != null) {
        hv01 = hv01.a();
      } else {
        hv01 = null;
      } 
      if (hv01 != null && Collections.unmodifiableList(hv01.w).size() == 1) {
        byte b;
        vu0 vu0 = (vu0)((fv0)hv01).y.get(paramhv0.c);
        if (vu0 != null) {
          b = vu0.b;
        } else {
          b = 4;
        } 
        if (b == 3 || b == 2) {
          StringBuilder stringBuilder1 = new StringBuilder("Ignoring attempt to select selected route: ");
          stringBuilder1.append(paramhv0);
          Log.w(str, stringBuilder1.toString());
          return;
        } 
      } 
      if (Build.VERSION.SDK_INT >= 30) {
        zu0 zu0 = paramhv0.c();
        cu01 = this.s;
        if (zu0 == cu01 && this.d != paramhv0) {
          cu01.l(paramhv0.b);
          return;
        } 
      } 
      l(paramhv0, paramInt, paramBoolean);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder("Ignoring attempt to select selected route: ");
    stringBuilder.append(paramhv0);
    Log.w((String)cu01, stringBuilder.toString());
  }
  
  public final void l(hv0 paramhv0, int paramInt, boolean paramBoolean) {
    NullPointerException nullPointerException;
    Message message;
    int i;
    be0 be01;
    if (this.d == paramhv0)
      return; 
    hv0 hv01 = this.x;
    boolean bool = true;
    if (paramhv0 == hv01) {
      i = 1;
    } else {
      i = 0;
    } 
    if (this.y != null && i) {
      StackTraceElement[] arrayOfStackTraceElement = Thread.currentThread().getStackTrace();
      StringBuilder stringBuilder2 = new StringBuilder("- Stacktrace: [");
      i = 3;
      while (i < arrayOfStackTraceElement.length) {
        StackTraceElement stackTraceElement = arrayOfStackTraceElement[i];
        stringBuilder2.append(stackTraceElement.getClassName());
        stringBuilder2.append(".");
        stringBuilder2.append(stackTraceElement.getMethodName());
        stringBuilder2.append(":");
        stringBuilder2.append(stackTraceElement.getLineNumber());
        int j = i + 1;
        i = j;
        if (j < arrayOfStackTraceElement.length) {
          stringBuilder2.append(", ");
          i = j;
        } 
      } 
      stringBuilder2.append("]");
      hv01 = this.d;
      if (hv01 != null) {
        Locale locale = Locale.US;
        String str4 = hv01.d;
        iv0.b();
        if ((iv0.c()).y != hv01)
          bool = false; 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str4);
        stringBuilder.append(IGBYXeDFmKYajx.kWjqjUntroiQZF);
        stringBuilder.append(bool);
        stringBuilder.append(", syncMediaRoute1Provider=");
        stringBuilder.append(paramBoolean);
        stringBuilder.append(")");
        String str3 = stringBuilder.toString();
      } else {
        hv01 = null;
      } 
      StringBuilder stringBuilder1 = x41.q("Changing selection(", (String)hv01, ") to default while BT is available: pkgName=");
      stringBuilder1.append(this.h.getPackageName());
      stringBuilder1.append(stringBuilder2);
      Log.w("AxMediaRouter", stringBuilder1.toString());
    } 
    if (this.z != null) {
      this.z = null;
      wu0 wu01 = this.A;
      if (wu01 != null) {
        wu01.h(3);
        this.A.d();
        this.A = null;
      } 
    } 
    if (h()) {
      av0 av0 = paramhv0.a.e;
      if (av0 != null && av0.c) {
        zu0 zu01 = paramhv0.c();
        String str = paramhv0.b;
        Bundle bundle1 = new Bundle();
        bundle1.putString("clientPackageName", this.h.getPackageName());
        wu0 wu01 = zu01.a(str, new yu0(bundle1));
        if (wu01 != null) {
          Executor executor;
          Context context = this.h;
          if (Build.VERSION.SDK_INT >= 28) {
            executor = k5.e(context);
          } else {
            executor = new a60(new Handler(executor.getMainLooper()), 0);
          } 
          ae0 ae01 = this.G;
          Object object = wu01.a;
          /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          if (executor != null) {
            if (ae01 != null) {
              try {
                wu01.b = executor;
                wu01.c = ae01;
                ArrayList arrayList = wu01.e;
                if (arrayList != null && !arrayList.isEmpty()) {
                  su0 su0 = wu01.d;
                  ArrayList arrayList1 = wu01.e;
                  wu01.d = null;
                  wu01.e = null;
                  Executor executor1 = wu01.b;
                  uu0 uu0 = new uu0();
                  this(wu01, ae01, su0, arrayList1, 1);
                  executor1.execute(uu0);
                } 
              } finally {}
              /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
              this.z = paramhv0;
              this.A = wu01;
              wu01.e();
              return;
            } 
            NullPointerException nullPointerException1 = new NullPointerException();
            this("Listener shouldn't be null");
            throw nullPointerException1;
          } 
          nullPointerException = new NullPointerException();
          this("Executor shouldn't be null");
          throw nullPointerException;
        } 
        StringBuilder stringBuilder = new StringBuilder("setSelectedRouteInternal: Failed to create dynamic group route controller. route=");
        stringBuilder.append(nullPointerException);
        Log.w("AxMediaRouter", stringBuilder.toString());
      } 
    } 
    zu0 zu0 = nullPointerException.c();
    String str1 = ((hv0)nullPointerException).b;
    Bundle bundle = new Bundle();
    String str2 = this.h.getPackageName();
    bundle.putString(GMDx.jIEDKnx, str2);
    xu0 xu01 = zu0.c(str1, new yu0(bundle));
    if (xu01 != null)
      xu01.e(); 
    if (this.d == null) {
      this.d = (hv0)nullPointerException;
      this.e = xu01;
      be01 = this.a;
      be01.getClass();
      message = be01.obtainMessage(262, new de0(null, (hv0)nullPointerException, paramBoolean));
      message.arg1 = paramInt;
      message.sendToTarget();
      return;
    } 
    j(this, (hv0)message, (xu0)be01, paramInt, paramBoolean, null, null);
  }
  
  public final void m() {
    // Byte code:
    //   0: new java/lang/Object
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #18
    //   9: aload_0
    //   10: getfield v : Ljv0;
    //   13: astore #19
    //   15: lconst_0
    //   16: lstore #8
    //   18: aload #19
    //   20: lconst_0
    //   21: putfield c : J
    //   24: aload #19
    //   26: iconst_0
    //   27: putfield e : Z
    //   30: aload #19
    //   32: invokestatic elapsedRealtime : ()J
    //   35: putfield d : J
    //   38: aload #19
    //   40: getfield a : Landroid/os/Handler;
    //   43: aload #19
    //   45: getfield b : Le;
    //   48: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   51: aload_0
    //   52: getfield i : Ljava/util/ArrayList;
    //   55: astore #16
    //   57: aload #16
    //   59: invokevirtual size : ()I
    //   62: istore_3
    //   63: iconst_0
    //   64: istore #4
    //   66: iconst_0
    //   67: istore_1
    //   68: iload_3
    //   69: iconst_1
    //   70: isub
    //   71: istore #5
    //   73: aload_0
    //   74: getfield q : Z
    //   77: istore #14
    //   79: iload #5
    //   81: iflt -> 462
    //   84: aload #16
    //   86: iload #5
    //   88: invokevirtual get : (I)Ljava/lang/Object;
    //   91: checkcast java/lang/ref/WeakReference
    //   94: invokevirtual get : ()Ljava/lang/Object;
    //   97: checkcast iv0
    //   100: astore #17
    //   102: aload #17
    //   104: ifnonnull -> 128
    //   107: aload #16
    //   109: iload #5
    //   111: invokevirtual remove : (I)Ljava/lang/Object;
    //   114: pop
    //   115: iload_1
    //   116: istore_2
    //   117: aload #16
    //   119: astore #17
    //   121: lload #8
    //   123: lstore #10
    //   125: goto -> 446
    //   128: aload #17
    //   130: getfield b : Ljava/util/ArrayList;
    //   133: astore #20
    //   135: aload #20
    //   137: invokevirtual size : ()I
    //   140: istore #7
    //   142: iload #4
    //   144: iload #7
    //   146: iadd
    //   147: istore #6
    //   149: iconst_0
    //   150: istore_3
    //   151: lload #8
    //   153: lstore #10
    //   155: aload #16
    //   157: astore #17
    //   159: iload #6
    //   161: istore #4
    //   163: iload_1
    //   164: istore_2
    //   165: iload_3
    //   166: iload #7
    //   168: if_icmpge -> 125
    //   171: aload #20
    //   173: iload_3
    //   174: invokevirtual get : (I)Ljava/lang/Object;
    //   177: checkcast ev0
    //   180: astore #17
    //   182: aload #17
    //   184: getfield c : Lcv0;
    //   187: astore #21
    //   189: aload #21
    //   191: ifnull -> 439
    //   194: aload #21
    //   196: invokevirtual c : ()Ljava/util/ArrayList;
    //   199: astore #21
    //   201: aload #21
    //   203: invokevirtual isEmpty : ()Z
    //   206: ifne -> 303
    //   209: aload #21
    //   211: invokevirtual size : ()I
    //   214: istore #4
    //   216: iconst_0
    //   217: istore_2
    //   218: iload_2
    //   219: iload #4
    //   221: if_icmpge -> 303
    //   224: aload #21
    //   226: iload_2
    //   227: invokevirtual get : (I)Ljava/lang/Object;
    //   230: astore #22
    //   232: iinc #2, 1
    //   235: aload #22
    //   237: checkcast java/lang/String
    //   240: astore #22
    //   242: aload #22
    //   244: ifnull -> 294
    //   247: aload #18
    //   249: getfield a : Ljava/util/ArrayList;
    //   252: ifnonnull -> 267
    //   255: aload #18
    //   257: new java/util/ArrayList
    //   260: dup
    //   261: invokespecial <init> : ()V
    //   264: putfield a : Ljava/util/ArrayList;
    //   267: aload #18
    //   269: getfield a : Ljava/util/ArrayList;
    //   272: aload #22
    //   274: invokevirtual contains : (Ljava/lang/Object;)Z
    //   277: ifne -> 291
    //   280: aload #18
    //   282: getfield a : Ljava/util/ArrayList;
    //   285: aload #22
    //   287: invokevirtual add : (Ljava/lang/Object;)Z
    //   290: pop
    //   291: goto -> 218
    //   294: ldc_w 'category must not be null'
    //   297: invokestatic l : (Ljava/lang/String;)V
    //   300: goto -> 303
    //   303: aload #17
    //   305: getfield d : I
    //   308: iconst_1
    //   309: iand
    //   310: ifeq -> 318
    //   313: iconst_1
    //   314: istore_2
    //   315: goto -> 320
    //   318: iconst_0
    //   319: istore_2
    //   320: aload #17
    //   322: getfield e : J
    //   325: lstore #10
    //   327: iload_2
    //   328: ifne -> 340
    //   331: aload #19
    //   333: invokevirtual getClass : ()Ljava/lang/Class;
    //   336: pop
    //   337: goto -> 359
    //   340: aload #19
    //   342: getfield d : J
    //   345: lstore #12
    //   347: lload #12
    //   349: lload #10
    //   351: lsub
    //   352: ldc2_w 30000
    //   355: lcmp
    //   356: iflt -> 362
    //   359: goto -> 390
    //   362: aload #19
    //   364: aload #19
    //   366: getfield c : J
    //   369: lload #10
    //   371: ldc2_w 30000
    //   374: ladd
    //   375: lload #12
    //   377: lsub
    //   378: invokestatic max : (JJ)J
    //   381: putfield c : J
    //   384: aload #19
    //   386: iconst_1
    //   387: putfield e : Z
    //   390: iload_2
    //   391: ifeq -> 396
    //   394: iconst_1
    //   395: istore_1
    //   396: aload #17
    //   398: getfield d : I
    //   401: istore #4
    //   403: iload_1
    //   404: istore_2
    //   405: iload #4
    //   407: iconst_4
    //   408: iand
    //   409: ifeq -> 421
    //   412: iload_1
    //   413: istore_2
    //   414: iload #14
    //   416: ifne -> 421
    //   419: iconst_1
    //   420: istore_2
    //   421: iload_2
    //   422: istore_1
    //   423: iload #4
    //   425: bipush #8
    //   427: iand
    //   428: ifeq -> 433
    //   431: iconst_1
    //   432: istore_1
    //   433: iinc #3, 1
    //   436: goto -> 151
    //   439: getstatic com/android/billingclient/api/wH/DJqHMztxflt.DuQdAG : Ljava/lang/String;
    //   442: invokestatic l : (Ljava/lang/String;)V
    //   445: return
    //   446: lload #10
    //   448: lstore #8
    //   450: aload #17
    //   452: astore #16
    //   454: iload #5
    //   456: istore_3
    //   457: iload_2
    //   458: istore_1
    //   459: goto -> 68
    //   462: aload #19
    //   464: getfield e : Z
    //   467: ifeq -> 501
    //   470: aload #19
    //   472: getfield c : J
    //   475: lstore #10
    //   477: lload #10
    //   479: lload #8
    //   481: lcmp
    //   482: ifle -> 501
    //   485: aload #19
    //   487: getfield a : Landroid/os/Handler;
    //   490: aload #19
    //   492: getfield b : Le;
    //   495: lload #10
    //   497: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   500: pop
    //   501: aload #19
    //   503: getfield e : Z
    //   506: istore #15
    //   508: aload_0
    //   509: iload #4
    //   511: putfield D : I
    //   514: iload_1
    //   515: ifeq -> 528
    //   518: aload #18
    //   520: invokevirtual a : ()Lcv0;
    //   523: astore #16
    //   525: goto -> 533
    //   528: getstatic cv0.c : Lcv0;
    //   531: astore #16
    //   533: aload #18
    //   535: invokevirtual a : ()Lcv0;
    //   538: astore #17
    //   540: aload_0
    //   541: invokevirtual h : ()Z
    //   544: ifne -> 550
    //   547: goto -> 661
    //   550: aload_0
    //   551: getfield C : Ltu0;
    //   554: astore #18
    //   556: aload #18
    //   558: ifnull -> 594
    //   561: aload #18
    //   563: invokevirtual a : ()V
    //   566: aload #18
    //   568: getfield b : Lcv0;
    //   571: aload #17
    //   573: invokevirtual equals : (Ljava/lang/Object;)Z
    //   576: ifeq -> 594
    //   579: aload_0
    //   580: getfield C : Ltu0;
    //   583: invokevirtual b : ()Z
    //   586: iload #15
    //   588: if_icmpne -> 594
    //   591: goto -> 661
    //   594: aload #17
    //   596: invokevirtual a : ()V
    //   599: aload #17
    //   601: getfield b : Ljava/util/List;
    //   604: invokeinterface isEmpty : ()Z
    //   609: ifeq -> 635
    //   612: iload #15
    //   614: ifne -> 635
    //   617: aload_0
    //   618: getfield C : Ltu0;
    //   621: ifnonnull -> 627
    //   624: goto -> 661
    //   627: aload_0
    //   628: aconst_null
    //   629: putfield C : Ltu0;
    //   632: goto -> 650
    //   635: aload_0
    //   636: new tu0
    //   639: dup
    //   640: aload #17
    //   642: iload #15
    //   644: invokespecial <init> : (Lcv0;Z)V
    //   647: putfield C : Ltu0;
    //   650: aload_0
    //   651: getfield s : Lcu0;
    //   654: aload_0
    //   655: getfield C : Ltu0;
    //   658: invokevirtual g : (Ltu0;)V
    //   661: aload_0
    //   662: getfield B : Ltu0;
    //   665: astore #17
    //   667: aload #17
    //   669: ifnull -> 705
    //   672: aload #17
    //   674: invokevirtual a : ()V
    //   677: aload #17
    //   679: getfield b : Lcv0;
    //   682: aload #16
    //   684: invokevirtual equals : (Ljava/lang/Object;)Z
    //   687: ifeq -> 705
    //   690: aload_0
    //   691: getfield B : Ltu0;
    //   694: invokevirtual b : ()Z
    //   697: iload #15
    //   699: if_icmpne -> 705
    //   702: goto -> 848
    //   705: aload #16
    //   707: invokevirtual a : ()V
    //   710: aload #16
    //   712: getfield b : Ljava/util/List;
    //   715: invokeinterface isEmpty : ()Z
    //   720: ifeq -> 746
    //   723: iload #15
    //   725: ifne -> 746
    //   728: aload_0
    //   729: getfield B : Ltu0;
    //   732: ifnonnull -> 738
    //   735: goto -> 848
    //   738: aload_0
    //   739: aconst_null
    //   740: putfield B : Ltu0;
    //   743: goto -> 761
    //   746: aload_0
    //   747: new tu0
    //   750: dup
    //   751: aload #16
    //   753: iload #15
    //   755: invokespecial <init> : (Lcv0;Z)V
    //   758: putfield B : Ltu0;
    //   761: iload_1
    //   762: ifeq -> 784
    //   765: iload #15
    //   767: ifne -> 784
    //   770: iload #14
    //   772: ifeq -> 784
    //   775: ldc 'AxMediaRouter'
    //   777: ldc_w 'Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.'
    //   780: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   783: pop
    //   784: aload_0
    //   785: getfield m : Ljava/util/ArrayList;
    //   788: astore #16
    //   790: aload #16
    //   792: invokevirtual size : ()I
    //   795: istore_2
    //   796: iconst_0
    //   797: istore_1
    //   798: iload_1
    //   799: iload_2
    //   800: if_icmpge -> 848
    //   803: aload #16
    //   805: iload_1
    //   806: invokevirtual get : (I)Ljava/lang/Object;
    //   809: astore #17
    //   811: iinc #1, 1
    //   814: aload #17
    //   816: checkcast gv0
    //   819: getfield a : Lzu0;
    //   822: astore #17
    //   824: aload #17
    //   826: aload_0
    //   827: getfield s : Lcu0;
    //   830: if_acmpne -> 836
    //   833: goto -> 798
    //   836: aload #17
    //   838: aload_0
    //   839: getfield B : Ltu0;
    //   842: invokevirtual g : (Ltu0;)V
    //   845: goto -> 798
    //   848: return
  }
  
  public final void n() {
    hv0 hv01 = this.d;
    if (hv01 != null) {
      p01 p011;
      int i = hv01.p;
      lf1 lf11 = this.o;
      lf11.a = i;
      lf11.b = hv01.q;
      boolean bool = hv01.e();
      int j = 0;
      if (bool && !iv0.h()) {
        i = 0;
      } else {
        i = hv01.o;
      } 
      lf11.c = i;
      lf11.d = this.d.m;
      if (h() && this.d.c() == this.s) {
        lf11.e = cu0.i(this.e);
      } else {
        lf11.e = null;
      } 
      Iterator iterator = this.n.iterator();
      if (!iterator.hasNext()) {
        p011 = this.E;
        if (p011 != null) {
          hv0 hv03 = this.d;
          hv0 hv02 = this.x;
          if (hv02 != null) {
            if (hv03 == hv02 || hv03 == this.y) {
              p011.b();
              return;
            } 
            i = j;
            if (lf11.c == 1)
              i = 2; 
            int k = lf11.b;
            j = lf11.a;
            String str = lf11.e;
            zv0 zv01 = (zv0)p011.c;
            if (zv01 != null) {
              el el = (el)p011.e;
              if (el != null && i == 0 && k == 0) {
                el.d = j;
                t42.a(el.a(), j);
                return;
              } 
              el = new el(p011, i, k, j, str);
              p011.e = el;
              ((tv0)zv01.c).a.setPlaybackToRemote(el.a());
              return;
            } 
          } else {
            tp.f("There is no default route.  The media router has not yet been fully initialized.");
            return;
          } 
        } 
      } else {
        throw x41.g(p011);
      } 
    } else {
      p01 p011 = this.E;
      if (p011 != null)
        p011.b(); 
    } 
  }
  
  public final void o(gv0 paramgv0, av0 paramav0) {
    // Byte code:
    //   0: aload_1
    //   1: getfield e : Lav0;
    //   4: astore #9
    //   6: aload_1
    //   7: getfield b : Ljava/util/ArrayList;
    //   10: astore #8
    //   12: aload #9
    //   14: aload_2
    //   15: if_acmpeq -> 855
    //   18: aload_1
    //   19: aload_2
    //   20: putfield e : Lav0;
    //   23: aload_0
    //   24: getfield j : Ljava/util/ArrayList;
    //   27: astore #9
    //   29: aload_0
    //   30: getfield a : Lbe0;
    //   33: astore #10
    //   35: aload_2
    //   36: ifnull -> 111
    //   39: aload_2
    //   40: getfield b : Ljava/util/List;
    //   43: astore #13
    //   45: aload #13
    //   47: invokeinterface size : ()I
    //   52: istore #4
    //   54: iconst_0
    //   55: istore_3
    //   56: iload_3
    //   57: iload #4
    //   59: if_icmpge -> 117
    //   62: aload #13
    //   64: iload_3
    //   65: invokeinterface get : (I)Ljava/lang/Object;
    //   70: checkcast su0
    //   73: astore #11
    //   75: aload #11
    //   77: ifnull -> 97
    //   80: aload #11
    //   82: invokevirtual e : ()Z
    //   85: ifne -> 91
    //   88: goto -> 97
    //   91: iinc #3, 1
    //   94: goto -> 56
    //   97: aload_2
    //   98: aload_0
    //   99: getfield t : Lh71;
    //   102: getfield i : Lav0;
    //   105: if_acmpne -> 111
    //   108: goto -> 117
    //   111: iconst_0
    //   112: istore #7
    //   114: goto -> 684
    //   117: new java/util/ArrayList
    //   120: dup
    //   121: invokespecial <init> : ()V
    //   124: astore #12
    //   126: new java/util/ArrayList
    //   129: dup
    //   130: invokespecial <init> : ()V
    //   133: astore #11
    //   135: aload #13
    //   137: invokeinterface iterator : ()Ljava/util/Iterator;
    //   142: astore_2
    //   143: iconst_0
    //   144: istore_3
    //   145: iconst_0
    //   146: istore #7
    //   148: aload_2
    //   149: invokeinterface hasNext : ()Z
    //   154: ifeq -> 521
    //   157: aload_2
    //   158: invokeinterface next : ()Ljava/lang/Object;
    //   163: checkcast su0
    //   166: astore #13
    //   168: aload #13
    //   170: ifnull -> 181
    //   173: aload #13
    //   175: invokevirtual e : ()Z
    //   178: ifne -> 184
    //   181: goto -> 487
    //   184: aload #13
    //   186: invokevirtual d : ()Ljava/lang/String;
    //   189: astore #16
    //   191: aload #8
    //   193: invokevirtual size : ()I
    //   196: istore #5
    //   198: iconst_0
    //   199: istore #4
    //   201: iload #4
    //   203: iload #5
    //   205: if_icmpge -> 238
    //   208: aload #8
    //   210: iload #4
    //   212: invokevirtual get : (I)Ljava/lang/Object;
    //   215: checkcast hv0
    //   218: getfield b : Ljava/lang/String;
    //   221: aload #16
    //   223: invokevirtual equals : (Ljava/lang/Object;)Z
    //   226: ifeq -> 232
    //   229: goto -> 241
    //   232: iinc #4, 1
    //   235: goto -> 201
    //   238: iconst_m1
    //   239: istore #4
    //   241: iload #4
    //   243: ifge -> 356
    //   246: aload_0
    //   247: aload_1
    //   248: aload #16
    //   250: invokevirtual b : (Lgv0;Ljava/lang/String;)Ljava/lang/String;
    //   253: astore #14
    //   255: aload #13
    //   257: getfield a : Landroid/os/Bundle;
    //   260: astore #15
    //   262: new hv0
    //   265: dup
    //   266: aload_1
    //   267: aload #16
    //   269: aload #14
    //   271: aload #15
    //   273: ldc_w 'isSystemRoute'
    //   276: iconst_0
    //   277: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   280: invokespecial <init> : (Lgv0;Ljava/lang/String;Ljava/lang/String;Z)V
    //   283: astore #14
    //   285: aload #8
    //   287: iload_3
    //   288: aload #14
    //   290: invokevirtual add : (ILjava/lang/Object;)V
    //   293: aload #9
    //   295: aload #14
    //   297: invokevirtual add : (Ljava/lang/Object;)Z
    //   300: pop
    //   301: aload #13
    //   303: invokevirtual c : ()Ljava/util/ArrayList;
    //   306: invokevirtual isEmpty : ()Z
    //   309: ifne -> 332
    //   312: aload #12
    //   314: new u51
    //   317: dup
    //   318: aload #14
    //   320: aload #13
    //   322: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   325: invokevirtual add : (Ljava/lang/Object;)Z
    //   328: pop
    //   329: goto -> 350
    //   332: aload #14
    //   334: aload #13
    //   336: invokevirtual i : (Lsu0;)I
    //   339: pop
    //   340: aload #10
    //   342: sipush #257
    //   345: aload #14
    //   347: invokevirtual b : (ILjava/lang/Object;)V
    //   350: iinc #3, 1
    //   353: goto -> 484
    //   356: iload #4
    //   358: iload_3
    //   359: if_icmpge -> 396
    //   362: new java/lang/StringBuilder
    //   365: dup
    //   366: ldc_w 'Ignoring route descriptor with duplicate id: '
    //   369: invokespecial <init> : (Ljava/lang/String;)V
    //   372: astore #14
    //   374: aload #14
    //   376: aload #13
    //   378: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   381: pop
    //   382: ldc 'AxMediaRouter'
    //   384: aload #14
    //   386: invokevirtual toString : ()Ljava/lang/String;
    //   389: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   392: pop
    //   393: goto -> 484
    //   396: aload #8
    //   398: iload #4
    //   400: invokevirtual get : (I)Ljava/lang/Object;
    //   403: checkcast hv0
    //   406: astore #14
    //   408: iload_3
    //   409: iconst_1
    //   410: iadd
    //   411: istore #5
    //   413: aload #8
    //   415: iload #4
    //   417: iload_3
    //   418: invokestatic swap : (Ljava/util/List;II)V
    //   421: aload #13
    //   423: invokevirtual c : ()Ljava/util/ArrayList;
    //   426: invokevirtual isEmpty : ()Z
    //   429: ifne -> 452
    //   432: aload #11
    //   434: new u51
    //   437: dup
    //   438: aload #14
    //   440: aload #13
    //   442: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   445: invokevirtual add : (Ljava/lang/Object;)Z
    //   448: pop
    //   449: goto -> 481
    //   452: aload_0
    //   453: aload #14
    //   455: aload #13
    //   457: invokevirtual p : (Lhv0;Lsu0;)I
    //   460: ifeq -> 481
    //   463: aload #14
    //   465: aload_0
    //   466: getfield d : Lhv0;
    //   469: if_acmpne -> 481
    //   472: iload #5
    //   474: istore_3
    //   475: iconst_1
    //   476: istore #7
    //   478: goto -> 484
    //   481: iload #5
    //   483: istore_3
    //   484: goto -> 148
    //   487: new java/lang/StringBuilder
    //   490: dup
    //   491: ldc_w 'Ignoring invalid route descriptor: '
    //   494: invokespecial <init> : (Ljava/lang/String;)V
    //   497: astore #14
    //   499: aload #14
    //   501: aload #13
    //   503: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   506: pop
    //   507: ldc 'AxMediaRouter'
    //   509: aload #14
    //   511: invokevirtual toString : ()Ljava/lang/String;
    //   514: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   517: pop
    //   518: goto -> 484
    //   521: iconst_0
    //   522: istore #5
    //   524: aload #12
    //   526: invokevirtual size : ()I
    //   529: istore #6
    //   531: iconst_0
    //   532: istore #4
    //   534: iload #4
    //   536: iload #6
    //   538: if_icmpge -> 592
    //   541: aload #12
    //   543: iload #4
    //   545: invokevirtual get : (I)Ljava/lang/Object;
    //   548: astore_2
    //   549: iinc #4, 1
    //   552: aload_2
    //   553: checkcast u51
    //   556: astore #13
    //   558: aload #13
    //   560: getfield a : Ljava/lang/Object;
    //   563: checkcast hv0
    //   566: astore_2
    //   567: aload_2
    //   568: aload #13
    //   570: getfield b : Ljava/lang/Object;
    //   573: checkcast su0
    //   576: invokevirtual i : (Lsu0;)I
    //   579: pop
    //   580: aload #10
    //   582: sipush #257
    //   585: aload_2
    //   586: invokevirtual b : (ILjava/lang/Object;)V
    //   589: goto -> 534
    //   592: aload #11
    //   594: invokevirtual size : ()I
    //   597: istore #6
    //   599: iload #5
    //   601: istore #4
    //   603: iload #4
    //   605: iload #6
    //   607: if_icmpge -> 681
    //   610: aload #11
    //   612: iload #4
    //   614: invokevirtual get : (I)Ljava/lang/Object;
    //   617: astore_2
    //   618: iload #4
    //   620: iconst_1
    //   621: iadd
    //   622: istore #5
    //   624: aload_2
    //   625: checkcast u51
    //   628: astore #12
    //   630: aload #12
    //   632: getfield a : Ljava/lang/Object;
    //   635: checkcast hv0
    //   638: astore_2
    //   639: iload #5
    //   641: istore #4
    //   643: aload_0
    //   644: aload_2
    //   645: aload #12
    //   647: getfield b : Ljava/lang/Object;
    //   650: checkcast su0
    //   653: invokevirtual p : (Lhv0;Lsu0;)I
    //   656: ifeq -> 603
    //   659: iload #5
    //   661: istore #4
    //   663: aload_2
    //   664: aload_0
    //   665: getfield d : Lhv0;
    //   668: if_acmpne -> 603
    //   671: iconst_1
    //   672: istore #7
    //   674: iload #5
    //   676: istore #4
    //   678: goto -> 603
    //   681: goto -> 756
    //   684: aload_2
    //   685: ifnull -> 716
    //   688: new java/lang/StringBuilder
    //   691: dup
    //   692: ldc_w 'Ignoring invalid provider descriptor: '
    //   695: invokespecial <init> : (Ljava/lang/String;)V
    //   698: astore #11
    //   700: aload #11
    //   702: aload_2
    //   703: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   706: pop
    //   707: aload #11
    //   709: invokevirtual toString : ()Ljava/lang/String;
    //   712: astore_2
    //   713: goto -> 747
    //   716: new java/lang/StringBuilder
    //   719: dup
    //   720: ldc_w 'Ignoring null provider descriptor from '
    //   723: invokespecial <init> : (Ljava/lang/String;)V
    //   726: astore_2
    //   727: aload_2
    //   728: aload_1
    //   729: getfield d : Lbh0;
    //   732: getfield c : Ljava/lang/Object;
    //   735: checkcast android/content/ComponentName
    //   738: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   741: pop
    //   742: aload_2
    //   743: invokevirtual toString : ()Ljava/lang/String;
    //   746: astore_2
    //   747: ldc 'AxMediaRouter'
    //   749: aload_2
    //   750: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   753: pop
    //   754: iconst_0
    //   755: istore_3
    //   756: aload #8
    //   758: invokevirtual size : ()I
    //   761: iconst_1
    //   762: isub
    //   763: istore #4
    //   765: iload #4
    //   767: iload_3
    //   768: if_icmplt -> 801
    //   771: aload #8
    //   773: iload #4
    //   775: invokevirtual get : (I)Ljava/lang/Object;
    //   778: checkcast hv0
    //   781: astore_2
    //   782: aload_2
    //   783: aconst_null
    //   784: invokevirtual i : (Lsu0;)I
    //   787: pop
    //   788: aload #9
    //   790: aload_2
    //   791: invokevirtual remove : (Ljava/lang/Object;)Z
    //   794: pop
    //   795: iinc #4, -1
    //   798: goto -> 765
    //   801: aload_0
    //   802: iload #7
    //   804: invokevirtual q : (Z)V
    //   807: aload #8
    //   809: invokevirtual size : ()I
    //   812: iconst_1
    //   813: isub
    //   814: istore #4
    //   816: iload #4
    //   818: iload_3
    //   819: if_icmplt -> 846
    //   822: aload #10
    //   824: sipush #258
    //   827: aload #8
    //   829: iload #4
    //   831: invokevirtual remove : (I)Ljava/lang/Object;
    //   834: checkcast hv0
    //   837: invokevirtual b : (ILjava/lang/Object;)V
    //   840: iinc #4, -1
    //   843: goto -> 816
    //   846: aload #10
    //   848: sipush #515
    //   851: aload_1
    //   852: invokevirtual b : (ILjava/lang/Object;)V
    //   855: return
  }
  
  public final int p(hv0 paramhv0, su0 paramsu0) {
    int i = paramhv0.i(paramsu0);
    if (i != 0) {
      be0 be01 = this.a;
      if ((i & 0x1) != 0)
        be01.b(259, paramhv0); 
      if ((i & 0x2) != 0)
        be01.b(260, paramhv0); 
      if ((i & 0x4) != 0)
        be01.b(261, paramhv0); 
    } 
    return i;
  }
  
  public final void q(boolean paramBoolean) {
    hv0 hv02 = this.x;
    if (hv02 != null && !hv02.f()) {
      StringBuilder stringBuilder = new StringBuilder("Clearing the default route because it is no longer selectable: ");
      stringBuilder.append(this.x);
      Log.i("AxMediaRouter", stringBuilder.toString());
      this.x = null;
    } 
    hv0 hv03 = this.x;
    h71 h711 = this.t;
    ArrayList<hv0> arrayList = this.j;
    if (hv03 == null) {
      int j = arrayList.size();
      int i = 0;
      while (i < j) {
        hv03 = arrayList.get(i);
        int k = i + 1;
        hv03 = hv03;
        i = k;
        if (hv03.c() == h711) {
          i = k;
          if (hv03.b.equals("DEFAULT_ROUTE")) {
            i = k;
            if (hv03.f()) {
              this.x = hv03;
              StringBuilder stringBuilder = new StringBuilder("Found default route: ");
              stringBuilder.append(this.x);
              Log.i("AxMediaRouter", stringBuilder.toString());
              break;
            } 
          } 
        } 
      } 
    } 
    hv03 = this.y;
    if (hv03 != null && !hv03.f()) {
      StringBuilder stringBuilder = new StringBuilder("Clearing the bluetooth route because it is no longer selectable: ");
      stringBuilder.append(this.y);
      Log.i("AxMediaRouter", stringBuilder.toString());
      this.y = null;
    } 
    if (this.y == null) {
      int j = arrayList.size();
      int i = 0;
      while (i < j) {
        hv03 = arrayList.get(i);
        int k = i + 1;
        hv03 = hv03;
        i = k;
        if (hv03.c() == h711) {
          i = k;
          if (hv03.m("android.media.intent.category.LIVE_AUDIO")) {
            i = k;
            if (!hv03.m("android.media.intent.category.LIVE_VIDEO")) {
              i = k;
              if (hv03.f()) {
                this.y = hv03;
                StringBuilder stringBuilder = new StringBuilder("Found bluetooth route: ");
                stringBuilder.append(this.y);
                Log.i("AxMediaRouter", stringBuilder.toString());
                break;
              } 
            } 
          } 
        } 
      } 
    } 
    hv0 hv01 = this.d;
    if (hv01 == null || !hv01.g) {
      StringBuilder stringBuilder = new StringBuilder("Unselecting the current route because it is no longer selectable: ");
      stringBuilder.append(this.d);
      Log.i("AxMediaRouter", stringBuilder.toString());
      l(c(), 0, true);
      return;
    } 
    if (paramBoolean) {
      i();
      n();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ee0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */