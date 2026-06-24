import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.work.impl.utils.qnuS.eRUgfgGAccgka;
import com.google.android.gms.common.api.Gldr.hbrAVtEa;
import com.google.android.material.textview.pJx.ybWnIKHovcRr;
import in.krosbits.musicolet.IapActivity;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ef {
  public final Long A;
  
  public final dd1 B;
  
  public final Object a = new Object();
  
  public volatile int b = 0;
  
  public final String c;
  
  public final String d;
  
  public final Handler e = new Handler(Looper.getMainLooper());
  
  public volatile sa2 f;
  
  public final Context g;
  
  public final j01 h;
  
  public volatile qe2 i;
  
  public volatile dh2 j;
  
  public boolean k;
  
  public int l = 0;
  
  public boolean m;
  
  public boolean n;
  
  public boolean o;
  
  public boolean p;
  
  public boolean q;
  
  public boolean r;
  
  public boolean s;
  
  public boolean t;
  
  public boolean u;
  
  public boolean v;
  
  public boolean w;
  
  public final zb0 x;
  
  public final boolean y;
  
  public ExecutorService z;
  
  public ef(zb0 paramzb0, Context paramContext, df paramdf) {
    long l = (new Random()).nextLong();
    this.A = Long.valueOf(l);
    this.B = fg2.a;
    this.c = "8.3.0";
    String str = i();
    this.d = str;
    this.g = paramContext.getApplicationContext();
    qn2 qn2 = rn2.z();
    qn2.b();
    rn2.x((rn2)qn2.c);
    if (str != null) {
      qn2.b();
      rn2.y((rn2)qn2.c, str);
    } 
    str = this.g.getPackageName();
    qn2.b();
    rn2.q((rn2)qn2.c, str);
    qn2.b();
    rn2.D((rn2)qn2.c, l);
    qn2.b();
    rn2.w((rn2)qn2.c);
    int i = Build.VERSION.SDK_INT;
    qn2.b();
    rn2.A((rn2)qn2.c, i);
    qn2.c();
    y(qn2, paramContext);
    try {
      i = (this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0)).versionCode;
      qn2.b();
      rn2.B((rn2)qn2.c, i);
    } finally {
      paramContext = null;
    } 
    ph2.h("BillingClient", "Billing client should have a valid listener but the provided is null.");
    this.f = new sa2(this.g, null, this.h);
    this.x = paramzb0;
    this.g.getPackageName();
  }
  
  public ef(zb0 paramzb0, Context paramContext, lf paramlf, df paramdf) {
    long l = (new Random()).nextLong();
    this.A = Long.valueOf(l);
    this.B = fg2.a;
    this.c = "8.3.0";
    String str = i();
    this.d = str;
    this.g = paramContext.getApplicationContext();
    qn2 qn2 = rn2.z();
    qn2.b();
    rn2.x((rn2)qn2.c);
    if (str != null) {
      qn2.b();
      rn2.y((rn2)qn2.c, str);
    } 
    str = this.g.getPackageName();
    qn2.b();
    rn2.q((rn2)qn2.c, str);
    qn2.b();
    rn2.D((rn2)qn2.c, l);
    qn2.b();
    rn2.w((rn2)qn2.c);
    int i = Build.VERSION.SDK_INT;
    qn2.b();
    rn2.A((rn2)qn2.c, i);
    qn2.c();
    y(qn2, paramContext);
    try {
      i = (this.g.getPackageManager().getPackageInfo(this.g.getPackageName(), 0)).versionCode;
      qn2.b();
      rn2.B((rn2)qn2.c, i);
    } finally {
      paramContext = null;
    } 
    if (paramlf == null)
      ph2.h("BillingClient", hbrAVtEa.beGbXSYOlq); 
    this.f = new sa2(this.g, paramlf, this.h);
    this.x = paramzb0;
    this.y = false;
    this.g.getPackageName();
  }
  
  public static Future g(Callable<?> paramCallable, long paramLong, Runnable paramRunnable, Handler paramHandler, ExecutorService paramExecutorService) {
    try {
      Future<?> future = paramExecutorService.submit(paramCallable);
      double d = paramLong;
      paramHandler.postDelayed(new vi2(22, future, paramRunnable), (long)(d * 0.95D));
      return future;
    } catch (Exception exception) {
      ph2.i("BillingClient", "Async task throws exception!", exception);
      return null;
    } 
  }
  
  public static String i() {
    try {
      return (String)Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
    } catch (Exception exception) {
      return null;
    } 
  }
  
  public static void k(ef paramef, int paramInt) {
    IntentFilter intentFilter;
    if (paramInt == 0) {
      jc2 jc2;
      Object object = paramef.a;
      /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      try {
        if (paramef.b == 3) {
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          return;
        } 
      } finally {}
      paramef.s(2);
      if (paramef.f != null) {
        jc2 = (jc2)paramef.f;
      } else {
        jc2 = null;
      } 
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      if (jc2 != null) {
        boolean bool = paramef.u;
        intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter1 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter1.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        ((sa2)jc2).b = bool;
        jc2 jc21 = (jc2)((sa2)jc2).h;
        object = ((sa2)jc2).c;
        jc21.a((Context)object, intentFilter1);
        bool = ((sa2)jc2).b;
        jc2 = (jc2)((sa2)jc2).g;
        if (bool) {
          jc2.b((Context)object, intentFilter);
          return;
        } 
        jc2.a((Context)object, intentFilter);
      } 
      return;
    } 
    intentFilter.s(0);
  }
  
  public static final void y(qn2 paramqn2, Context paramContext) {
    try {
      ActivityManager activityManager = (ActivityManager)paramContext.getSystemService("activity");
      if (activityManager != null) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this();
        activityManager.getMemoryInfo(memoryInfo);
        int i = (int)(memoryInfo.totalMem / 1048576L);
        paramqn2.b();
        rn2.v((rn2)paramqn2.c, i);
        String str = Build.BRAND;
        paramqn2.b();
        rn2.r((rn2)paramqn2.c);
        str = Build.MODEL;
        paramqn2.b();
        rn2.u((rn2)paramqn2.c);
        str = Build.MANUFACTURER;
        paramqn2.b();
        rn2.t((rn2)paramqn2.c);
        str = Build.FINGERPRINT;
        paramqn2.b();
        rn2.s((rn2)paramqn2.c);
      } 
      return;
    } catch (RuntimeException runtimeException) {
      ph2.i("BillingClient", "Runtime error while populating device info.", runtimeException);
      return;
    } 
  }
  
  public final void A(int paramInt1, int paramInt2, qf paramqf) {
    try {
      return;
    } finally {
      paramqf = null;
      ph2.i("BillingClient", "Unable to log.", (Throwable)paramqf);
    } 
  }
  
  public final void B(int paramInt, qf paramqf, long paramLong) {
    try {
      int i = xi2.a;
    } finally {
      paramqf = null;
      ph2.i("BillingClient", "Unable to log.", (Throwable)paramqf);
    } 
  }
  
  public final void C(int paramInt1, int paramInt2, qf paramqf, String paramString) {
    try {
      return;
    } finally {
      paramqf = null;
      ph2.i(ybWnIKHovcRr.mDNYbJYnvGr, "Unable to log.", (Throwable)paramqf);
    } 
  }
  
  public final void D(int paramInt, qf paramqf, long paramLong, boolean paramBoolean) {
    try {
      cn2 cn2;
      int i = xi2.a;
      return;
    } finally {
      paramqf = null;
      ph2.i("BillingClient", "Unable to log.", (Throwable)paramqf);
    } 
  }
  
  public final void E(int paramInt, qf paramqf, String paramString, long paramLong, boolean paramBoolean) {
    try {
      cn2 cn2;
      int i = xi2.a;
      return;
    } finally {
      paramqf = null;
      ph2.i("BillingClient", "Unable to log.", (Throwable)paramqf);
    } 
  }
  
  public final void F(qf paramqf) {
    if (Thread.interrupted())
      return; 
    vi2 vi2 = new vi2(21, this, paramqf);
    this.e.post(vi2);
  }
  
  public void a(f1 paramf1, hf paramhf) {
    if (g(new cc2(this, paramhf, paramf1, 2), 30000L, new vi2(20, this, paramhf), l(), f()) == null) {
      qf qf = o();
      A(25, 3, qf);
      paramhf.a(qf);
    } 
  }
  
  public void b() {
    // Byte code:
    //   0: getstatic xi2.a : I
    //   3: istore_1
    //   4: aload_0
    //   5: bipush #12
    //   7: getstatic on2.c : Lon2;
    //   10: invokestatic c : (ILon2;)Lkn2;
    //   13: invokevirtual q : (Lkn2;)V
    //   16: goto -> 29
    //   19: astore_2
    //   20: ldc 'BillingClient'
    //   22: ldc_w 'Unable to log.'
    //   25: aload_2
    //   26: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   29: aload_0
    //   30: getfield a : Ljava/lang/Object;
    //   33: astore_2
    //   34: aload_2
    //   35: monitorenter
    //   36: aload_0
    //   37: getfield f : Lsa2;
    //   40: ifnull -> 98
    //   43: aload_0
    //   44: getfield f : Lsa2;
    //   47: astore_3
    //   48: aload_3
    //   49: getfield g : Ljava/lang/Object;
    //   52: checkcast jc2
    //   55: astore #4
    //   57: aload_3
    //   58: getfield c : Ljava/lang/Object;
    //   61: checkcast android/content/Context
    //   64: astore #5
    //   66: aload #4
    //   68: aload #5
    //   70: invokevirtual c : (Landroid/content/Context;)V
    //   73: aload_3
    //   74: getfield h : Ljava/lang/Object;
    //   77: checkcast jc2
    //   80: aload #5
    //   82: invokevirtual c : (Landroid/content/Context;)V
    //   85: goto -> 98
    //   88: astore_3
    //   89: ldc 'BillingClient'
    //   91: ldc_w 'There was an exception while shutting down broadcast manager while ending connection!'
    //   94: aload_3
    //   95: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   98: ldc 'BillingClient'
    //   100: ldc_w 'Unbinding from service.'
    //   103: invokestatic g : (Ljava/lang/String;Ljava/lang/String;)V
    //   106: aload_0
    //   107: invokevirtual u : ()V
    //   110: goto -> 123
    //   113: astore_3
    //   114: ldc 'BillingClient'
    //   116: ldc_w 'There was an exception while unbinding from the service while ending connection!'
    //   119: aload_3
    //   120: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   123: aload_0
    //   124: monitorenter
    //   125: aload_0
    //   126: getfield z : Ljava/util/concurrent/ExecutorService;
    //   129: astore_3
    //   130: aload_3
    //   131: ifnull -> 146
    //   134: aload_3
    //   135: invokeinterface shutdownNow : ()Ljava/util/List;
    //   140: pop
    //   141: aload_0
    //   142: aconst_null
    //   143: putfield z : Ljava/util/concurrent/ExecutorService;
    //   146: aload_0
    //   147: monitorexit
    //   148: goto -> 155
    //   151: astore_3
    //   152: goto -> 167
    //   155: aload_0
    //   156: iconst_3
    //   157: invokevirtual s : (I)V
    //   160: goto -> 184
    //   163: astore_3
    //   164: goto -> 195
    //   167: aload_0
    //   168: monitorexit
    //   169: aload_3
    //   170: athrow
    //   171: astore_3
    //   172: ldc 'BillingClient'
    //   174: ldc_w 'There was an exception while shutting down the executor service while ending connection!'
    //   177: aload_3
    //   178: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   181: goto -> 155
    //   184: aload_2
    //   185: monitorexit
    //   186: return
    //   187: astore_3
    //   188: aload_0
    //   189: iconst_3
    //   190: invokevirtual s : (I)V
    //   193: aload_3
    //   194: athrow
    //   195: aload_2
    //   196: monitorexit
    //   197: aload_3
    //   198: athrow
    // Exception table:
    //   from	to	target	type
    //   0	16	19	finally
    //   36	85	88	finally
    //   89	98	163	finally
    //   98	110	113	finally
    //   114	123	163	finally
    //   123	125	171	finally
    //   125	130	151	finally
    //   134	146	151	finally
    //   146	148	171	finally
    //   155	160	163	finally
    //   167	169	151	finally
    //   169	171	171	finally
    //   172	181	187	finally
    //   184	186	163	finally
    //   188	195	163	finally
    //   195	197	163	finally
  }
  
  public qf c(IapActivity paramIapActivity, of paramof) {
    // Byte code:
    //   0: new java/util/Random
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: invokevirtual nextLong : ()J
    //   10: lstore #8
    //   12: aload_0
    //   13: getfield f : Lsa2;
    //   16: ifnull -> 2982
    //   19: aload_0
    //   20: getfield f : Lsa2;
    //   23: getfield e : Ljava/lang/Object;
    //   26: checkcast lf
    //   29: ifnull -> 2982
    //   32: aload_0
    //   33: invokevirtual v : ()Z
    //   36: ifne -> 58
    //   39: getstatic ij2.j : Lqf;
    //   42: astore_1
    //   43: aload_0
    //   44: iconst_2
    //   45: aload_1
    //   46: lload #8
    //   48: invokevirtual B : (ILqf;J)V
    //   51: aload_0
    //   52: aload_1
    //   53: invokevirtual F : (Lqf;)V
    //   56: aload_1
    //   57: areturn
    //   58: aload_0
    //   59: getfield a : Ljava/lang/Object;
    //   62: astore #12
    //   64: aload #12
    //   66: monitorenter
    //   67: aload_0
    //   68: getfield j : Ldh2;
    //   71: ifnull -> 89
    //   74: aload_0
    //   75: getfield j : Ldh2;
    //   78: invokevirtual getClass : ()Ljava/lang/Class;
    //   81: pop
    //   82: goto -> 89
    //   85: astore_1
    //   86: goto -> 2977
    //   89: aload #12
    //   91: monitorexit
    //   92: new java/util/ArrayList
    //   95: dup
    //   96: invokespecial <init> : ()V
    //   99: astore #18
    //   101: aload #18
    //   103: aload_2
    //   104: getfield d : Ljava/lang/Object;
    //   107: checkcast java/util/ArrayList
    //   110: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   113: pop
    //   114: aload_2
    //   115: getfield c : Ljava/lang/Object;
    //   118: checkcast ch2
    //   121: astore #15
    //   123: aload #18
    //   125: invokevirtual iterator : ()Ljava/util/Iterator;
    //   128: astore #12
    //   130: aload #12
    //   132: invokeinterface hasNext : ()Z
    //   137: ifeq -> 152
    //   140: aload #12
    //   142: invokeinterface next : ()Ljava/lang/Object;
    //   147: astore #12
    //   149: goto -> 155
    //   152: aconst_null
    //   153: astore #12
    //   155: aload #12
    //   157: ifnonnull -> 2971
    //   160: aload #15
    //   162: invokevirtual iterator : ()Ljava/util/Iterator;
    //   165: checkcast yg2
    //   168: astore #12
    //   170: aload #12
    //   172: invokevirtual hasNext : ()Z
    //   175: ifeq -> 188
    //   178: aload #12
    //   180: invokevirtual next : ()Ljava/lang/Object;
    //   183: astore #12
    //   185: goto -> 191
    //   188: aconst_null
    //   189: astore #12
    //   191: aload #12
    //   193: checkcast mf
    //   196: astore #17
    //   198: aload #17
    //   200: getfield a : Lta1;
    //   203: astore #13
    //   205: aload #13
    //   207: getfield c : Ljava/lang/String;
    //   210: astore #12
    //   212: aload #13
    //   214: getfield d : Ljava/lang/String;
    //   217: astore #16
    //   219: aload #16
    //   221: ldc_w 'subs'
    //   224: invokevirtual equals : (Ljava/lang/Object;)Z
    //   227: ifeq -> 269
    //   230: aload_0
    //   231: getfield k : Z
    //   234: ifeq -> 240
    //   237: goto -> 269
    //   240: ldc 'BillingClient'
    //   242: ldc_w 'Current client doesn't support subscriptions.'
    //   245: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   248: getstatic ij2.l : Lqf;
    //   251: astore_1
    //   252: aload_0
    //   253: bipush #9
    //   255: aload_1
    //   256: lload #8
    //   258: iconst_0
    //   259: invokevirtual D : (ILqf;JZ)V
    //   262: aload_0
    //   263: aload_1
    //   264: invokevirtual F : (Lqf;)V
    //   267: aload_1
    //   268: areturn
    //   269: aload_2
    //   270: getfield b : Ljava/lang/Object;
    //   273: checkcast hp2
    //   276: invokevirtual getClass : ()Ljava/lang/Class;
    //   279: pop
    //   280: aload_2
    //   281: getfield a : Z
    //   284: ifne -> 339
    //   287: aload_2
    //   288: getfield c : Ljava/lang/Object;
    //   291: checkcast ch2
    //   294: astore #13
    //   296: aload #13
    //   298: ifnull -> 375
    //   301: aload #13
    //   303: invokeinterface size : ()I
    //   308: istore #4
    //   310: iconst_0
    //   311: istore_3
    //   312: iload_3
    //   313: iload #4
    //   315: if_icmpge -> 375
    //   318: aload #13
    //   320: iload_3
    //   321: invokeinterface get : (I)Ljava/lang/Object;
    //   326: checkcast mf
    //   329: invokevirtual getClass : ()Ljava/lang/Class;
    //   332: pop
    //   333: iinc #3, 1
    //   336: goto -> 312
    //   339: aload_0
    //   340: getfield m : Z
    //   343: ifne -> 375
    //   346: ldc 'BillingClient'
    //   348: ldc_w 'Current client doesn't support extra params for buy intent.'
    //   351: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   354: getstatic ij2.f : Lqf;
    //   357: astore_1
    //   358: aload_0
    //   359: bipush #18
    //   361: aload_1
    //   362: lload #8
    //   364: iconst_0
    //   365: invokevirtual D : (ILqf;JZ)V
    //   368: aload_0
    //   369: aload_1
    //   370: invokevirtual F : (Lqf;)V
    //   373: aload_1
    //   374: areturn
    //   375: aload #18
    //   377: invokevirtual size : ()I
    //   380: iconst_1
    //   381: if_icmple -> 420
    //   384: aload_0
    //   385: getfield q : Z
    //   388: ifne -> 420
    //   391: ldc 'BillingClient'
    //   393: ldc_w 'Current client doesn't support multi-item purchases.'
    //   396: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   399: getstatic ij2.m : Lqf;
    //   402: astore_1
    //   403: aload_0
    //   404: bipush #19
    //   406: aload_1
    //   407: lload #8
    //   409: iconst_0
    //   410: invokevirtual D : (ILqf;JZ)V
    //   413: aload_0
    //   414: aload_1
    //   415: invokevirtual F : (Lqf;)V
    //   418: aload_1
    //   419: areturn
    //   420: aload #15
    //   422: invokeinterface isEmpty : ()Z
    //   427: ifne -> 466
    //   430: aload_0
    //   431: getfield r : Z
    //   434: ifne -> 466
    //   437: ldc 'BillingClient'
    //   439: getstatic in/krosbits/android/widgets/swipetoloadlayout/vZ/LHyji.DfSO : Ljava/lang/String;
    //   442: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   445: getstatic ij2.o : Lqf;
    //   448: astore_1
    //   449: aload_0
    //   450: bipush #20
    //   452: aload_1
    //   453: lload #8
    //   455: iconst_0
    //   456: invokevirtual D : (ILqf;JZ)V
    //   459: aload_0
    //   460: aload_1
    //   461: invokevirtual F : (Lqf;)V
    //   464: aload_1
    //   465: areturn
    //   466: aload_2
    //   467: getfield c : Ljava/lang/Object;
    //   470: checkcast ch2
    //   473: invokevirtual isEmpty : ()Z
    //   476: ifeq -> 487
    //   479: getstatic ij2.i : Lqf;
    //   482: astore #13
    //   484: goto -> 1099
    //   487: aload_2
    //   488: getfield c : Ljava/lang/Object;
    //   491: checkcast ch2
    //   494: iconst_0
    //   495: invokeinterface get : (I)Ljava/lang/Object;
    //   500: checkcast mf
    //   503: astore #19
    //   505: iconst_1
    //   506: istore_3
    //   507: iload_3
    //   508: aload_2
    //   509: getfield c : Ljava/lang/Object;
    //   512: checkcast ch2
    //   515: invokevirtual size : ()I
    //   518: if_icmpge -> 600
    //   521: aload_2
    //   522: getfield c : Ljava/lang/Object;
    //   525: checkcast ch2
    //   528: iload_3
    //   529: invokeinterface get : (I)Ljava/lang/Object;
    //   534: checkcast mf
    //   537: astore #14
    //   539: aload #14
    //   541: getfield a : Lta1;
    //   544: getfield d : Ljava/lang/String;
    //   547: astore #13
    //   549: aload #13
    //   551: aload #19
    //   553: getfield a : Lta1;
    //   556: getfield d : Ljava/lang/String;
    //   559: invokevirtual equals : (Ljava/lang/Object;)Z
    //   562: ifne -> 594
    //   565: aload #14
    //   567: getfield a : Lta1;
    //   570: getfield d : Ljava/lang/String;
    //   573: ldc_w 'play_pass_subs'
    //   576: invokevirtual equals : (Ljava/lang/Object;)Z
    //   579: ifne -> 594
    //   582: ldc_w 'All products should have same ProductType.'
    //   585: iconst_5
    //   586: invokestatic a : (Ljava/lang/String;I)Lqf;
    //   589: astore #13
    //   591: goto -> 1099
    //   594: iinc #3, 1
    //   597: goto -> 507
    //   600: aload #12
    //   602: astore #14
    //   604: aload #19
    //   606: getfield a : Lta1;
    //   609: astore #20
    //   611: aload #20
    //   613: getfield b : Lorg/json/JSONObject;
    //   616: ldc_w 'packageName'
    //   619: invokevirtual optString : (Ljava/lang/String;)Ljava/lang/String;
    //   622: astore #22
    //   624: new java/util/HashMap
    //   627: dup
    //   628: invokespecial <init> : ()V
    //   631: astore #21
    //   633: new java/util/HashSet
    //   636: dup
    //   637: invokespecial <init> : ()V
    //   640: astore #12
    //   642: aload_2
    //   643: getfield c : Ljava/lang/Object;
    //   646: checkcast ch2
    //   649: astore #13
    //   651: aload #13
    //   653: invokeinterface size : ()I
    //   658: istore #4
    //   660: iconst_0
    //   661: istore_3
    //   662: iload_3
    //   663: iload #4
    //   665: if_icmpge -> 894
    //   668: aload #13
    //   670: iload_3
    //   671: invokeinterface get : (I)Ljava/lang/Object;
    //   676: checkcast mf
    //   679: astore #25
    //   681: aload #25
    //   683: invokevirtual getClass : ()Ljava/lang/Class;
    //   686: pop
    //   687: aload #25
    //   689: getfield a : Lta1;
    //   692: astore #24
    //   694: aload #24
    //   696: getfield i : Ljava/util/ArrayList;
    //   699: astore #26
    //   701: aload #24
    //   703: getfield c : Ljava/lang/String;
    //   706: astore #23
    //   708: aload #26
    //   710: ifnull -> 763
    //   713: aload #25
    //   715: getfield b : Ljava/lang/String;
    //   718: ifnonnull -> 763
    //   721: new java/lang/StringBuilder
    //   724: dup
    //   725: ldc_w 'offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: '
    //   728: invokespecial <init> : (Ljava/lang/String;)V
    //   731: astore #12
    //   733: aload #12
    //   735: aload #23
    //   737: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   740: pop
    //   741: aload #12
    //   743: invokevirtual toString : ()Ljava/lang/String;
    //   746: iconst_5
    //   747: invokestatic a : (Ljava/lang/String;I)Lqf;
    //   750: astore #12
    //   752: aload #12
    //   754: astore #13
    //   756: aload #14
    //   758: astore #12
    //   760: goto -> 1099
    //   763: aload #21
    //   765: aload #23
    //   767: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   770: ifeq -> 816
    //   773: new java/lang/StringBuilder
    //   776: dup
    //   777: getstatic in/krosbits/utils/SgV/zpEN.AWy : Ljava/lang/String;
    //   780: invokespecial <init> : (Ljava/lang/String;)V
    //   783: astore #12
    //   785: aload #12
    //   787: aload #23
    //   789: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   792: pop
    //   793: aload #12
    //   795: ldc_w '.'
    //   798: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   801: pop
    //   802: aload #12
    //   804: invokevirtual toString : ()Ljava/lang/String;
    //   807: iconst_5
    //   808: invokestatic a : (Ljava/lang/String;I)Lqf;
    //   811: astore #12
    //   813: goto -> 752
    //   816: aload #21
    //   818: aload #23
    //   820: aload #25
    //   822: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   825: pop
    //   826: aload #20
    //   828: getfield d : Ljava/lang/String;
    //   831: ldc_w 'play_pass_subs'
    //   834: invokevirtual equals : (Ljava/lang/Object;)Z
    //   837: ifne -> 888
    //   840: aload #24
    //   842: getfield d : Ljava/lang/String;
    //   845: ldc_w 'play_pass_subs'
    //   848: invokevirtual equals : (Ljava/lang/Object;)Z
    //   851: ifne -> 888
    //   854: aload #22
    //   856: aload #24
    //   858: getfield b : Lorg/json/JSONObject;
    //   861: ldc_w 'packageName'
    //   864: invokevirtual optString : (Ljava/lang/String;)Ljava/lang/String;
    //   867: invokevirtual equals : (Ljava/lang/Object;)Z
    //   870: ifeq -> 876
    //   873: goto -> 888
    //   876: ldc_w 'All products must have the same package name.'
    //   879: iconst_5
    //   880: invokestatic a : (Ljava/lang/String;I)Lqf;
    //   883: astore #12
    //   885: goto -> 752
    //   888: iinc #3, 1
    //   891: goto -> 662
    //   894: aload #12
    //   896: invokevirtual iterator : ()Ljava/util/Iterator;
    //   899: astore #13
    //   901: aload #13
    //   903: invokeinterface hasNext : ()Z
    //   908: ifeq -> 990
    //   911: aload #13
    //   913: invokeinterface next : ()Ljava/lang/Object;
    //   918: checkcast java/lang/String
    //   921: astore #12
    //   923: aload #21
    //   925: aload #12
    //   927: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   930: ifeq -> 901
    //   933: aload #21
    //   935: aload #12
    //   937: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   940: checkcast mf
    //   943: invokevirtual getClass : ()Ljava/lang/Class;
    //   946: pop
    //   947: new java/lang/StringBuilder
    //   950: dup
    //   951: ldc_w 'OldProductId must not be one of the products to be purchased. Invalid old product id: '
    //   954: invokespecial <init> : (Ljava/lang/String;)V
    //   957: astore #13
    //   959: aload #13
    //   961: aload #12
    //   963: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   966: pop
    //   967: aload #13
    //   969: ldc_w '.'
    //   972: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   975: pop
    //   976: aload #13
    //   978: invokevirtual toString : ()Ljava/lang/String;
    //   981: iconst_5
    //   982: invokestatic a : (Ljava/lang/String;I)Lqf;
    //   985: astore #12
    //   987: goto -> 752
    //   990: aload #20
    //   992: getfield j : Ljava/util/ArrayList;
    //   995: astore #13
    //   997: aload #19
    //   999: getfield b : Ljava/lang/String;
    //   1002: astore #19
    //   1004: aload #19
    //   1006: ifnull -> 1091
    //   1009: aload #13
    //   1011: ifnull -> 1091
    //   1014: aload #13
    //   1016: invokevirtual size : ()I
    //   1019: istore #4
    //   1021: iconst_0
    //   1022: istore_3
    //   1023: iload_3
    //   1024: iload #4
    //   1026: if_icmpge -> 1063
    //   1029: aload #13
    //   1031: iload_3
    //   1032: invokevirtual get : (I)Ljava/lang/Object;
    //   1035: astore #12
    //   1037: iinc #3, 1
    //   1040: aload #12
    //   1042: checkcast qa1
    //   1045: astore #12
    //   1047: aload #19
    //   1049: aload #12
    //   1051: getfield d : Ljava/lang/String;
    //   1054: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1057: ifeq -> 1023
    //   1060: goto -> 1066
    //   1063: aconst_null
    //   1064: astore #12
    //   1066: aload #12
    //   1068: ifnull -> 1091
    //   1071: aload #12
    //   1073: getfield g : Leg2;
    //   1076: ifnull -> 1091
    //   1079: ldc_w 'Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.'
    //   1082: iconst_5
    //   1083: invokestatic a : (Ljava/lang/String;I)Lqf;
    //   1086: astore #12
    //   1088: goto -> 752
    //   1091: getstatic ij2.i : Lqf;
    //   1094: astore #12
    //   1096: goto -> 752
    //   1099: aload #13
    //   1101: getstatic ij2.i : Lqf;
    //   1104: if_acmpeq -> 1127
    //   1107: aload_0
    //   1108: bipush #108
    //   1110: aload #13
    //   1112: lload #8
    //   1114: iconst_0
    //   1115: invokevirtual D : (ILqf;JZ)V
    //   1118: aload_0
    //   1119: aload #13
    //   1121: invokevirtual F : (Lqf;)V
    //   1124: aload #13
    //   1126: areturn
    //   1127: aload_0
    //   1128: getfield m : Z
    //   1131: ifeq -> 2438
    //   1134: aload_0
    //   1135: getfield n : Z
    //   1138: istore #7
    //   1140: aload_0
    //   1141: getfield x : Lzb0;
    //   1144: invokevirtual getClass : ()Ljava/lang/Class;
    //   1147: pop
    //   1148: aload_0
    //   1149: getfield x : Lzb0;
    //   1152: invokevirtual getClass : ()Ljava/lang/Class;
    //   1155: pop
    //   1156: aload_0
    //   1157: getfield y : Z
    //   1160: istore #6
    //   1162: aload_0
    //   1163: getfield c : Ljava/lang/String;
    //   1166: astore #19
    //   1168: aload_0
    //   1169: getfield d : Ljava/lang/String;
    //   1172: astore #13
    //   1174: aload_0
    //   1175: getfield A : Ljava/lang/Long;
    //   1178: invokevirtual longValue : ()J
    //   1181: lstore #10
    //   1183: aload_0
    //   1184: getfield g : Landroid/content/Context;
    //   1187: invokevirtual getPackageName : ()Ljava/lang/String;
    //   1190: pop
    //   1191: getstatic ph2.a : I
    //   1194: istore_3
    //   1195: new android/os/Bundle
    //   1198: dup
    //   1199: invokespecial <init> : ()V
    //   1202: astore #14
    //   1204: aload #14
    //   1206: aload #19
    //   1208: aload #13
    //   1210: lload #10
    //   1212: invokestatic b : (Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;J)V
    //   1215: aload #14
    //   1217: getstatic com/google/android/gms/common/api/Gldr/hbrAVtEa.xHMk : Ljava/lang/String;
    //   1220: lload #8
    //   1222: invokevirtual putLong : (Ljava/lang/String;J)V
    //   1225: aload_2
    //   1226: getfield b : Ljava/lang/Object;
    //   1229: checkcast hp2
    //   1232: invokevirtual getClass : ()Ljava/lang/Class;
    //   1235: pop
    //   1236: aconst_null
    //   1237: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1240: ifne -> 1255
    //   1243: aload #14
    //   1245: getstatic androidx/work/impl/utils/qnuS/eRUgfgGAccgka.DZNFKq : Ljava/lang/String;
    //   1248: aconst_null
    //   1249: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   1252: goto -> 1255
    //   1255: aconst_null
    //   1256: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1259: ifne -> 1271
    //   1262: aload #14
    //   1264: ldc_w 'obfuscatedProfileId'
    //   1267: aconst_null
    //   1268: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   1271: aconst_null
    //   1272: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1275: ifne -> 1304
    //   1278: aload #14
    //   1280: ldc_w 'skusToReplace'
    //   1283: new java/util/ArrayList
    //   1286: dup
    //   1287: iconst_1
    //   1288: anewarray java/lang/String
    //   1291: dup
    //   1292: iconst_0
    //   1293: aconst_null
    //   1294: aastore
    //   1295: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   1298: invokespecial <init> : (Ljava/util/Collection;)V
    //   1301: invokevirtual putStringArrayList : (Ljava/lang/String;Ljava/util/ArrayList;)V
    //   1304: aload_2
    //   1305: getfield b : Ljava/lang/Object;
    //   1308: checkcast hp2
    //   1311: invokevirtual getClass : ()Ljava/lang/Class;
    //   1314: pop
    //   1315: aconst_null
    //   1316: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1319: ifne -> 1342
    //   1322: aload_2
    //   1323: getfield b : Ljava/lang/Object;
    //   1326: checkcast hp2
    //   1329: invokevirtual getClass : ()Ljava/lang/Class;
    //   1332: pop
    //   1333: aload #14
    //   1335: ldc_w 'oldSkuPurchaseToken'
    //   1338: aconst_null
    //   1339: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   1342: aconst_null
    //   1343: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1346: ifne -> 1358
    //   1349: aload #14
    //   1351: ldc_w 'oldSkuPurchaseId'
    //   1354: aconst_null
    //   1355: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   1358: aload_2
    //   1359: getfield b : Ljava/lang/Object;
    //   1362: checkcast hp2
    //   1365: invokevirtual getClass : ()Ljava/lang/Class;
    //   1368: pop
    //   1369: aconst_null
    //   1370: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1373: ifne -> 1396
    //   1376: aload_2
    //   1377: getfield b : Ljava/lang/Object;
    //   1380: checkcast hp2
    //   1383: invokevirtual getClass : ()Ljava/lang/Class;
    //   1386: pop
    //   1387: aload #14
    //   1389: ldc_w 'originalExternalTransactionId'
    //   1392: aconst_null
    //   1393: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   1396: aconst_null
    //   1397: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1400: ifne -> 1412
    //   1403: aload #14
    //   1405: ldc_w 'paymentsPurchaseParams'
    //   1408: aconst_null
    //   1409: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   1412: iload #7
    //   1414: ifeq -> 1429
    //   1417: aload #14
    //   1419: ldc_w 'enablePendingPurchases'
    //   1422: iconst_1
    //   1423: invokevirtual putBoolean : (Ljava/lang/String;Z)V
    //   1426: goto -> 1429
    //   1429: iload #6
    //   1431: ifne -> 1437
    //   1434: goto -> 1446
    //   1437: aload #14
    //   1439: ldc_w 'enableAlternativeBilling'
    //   1442: iconst_1
    //   1443: invokevirtual putBoolean : (Ljava/lang/String;Z)V
    //   1446: new java/util/ArrayList
    //   1449: dup
    //   1450: invokespecial <init> : ()V
    //   1453: astore #13
    //   1455: aload_2
    //   1456: getfield c : Ljava/lang/Object;
    //   1459: checkcast ch2
    //   1462: iconst_0
    //   1463: invokevirtual l : (I)Lyg2;
    //   1466: astore #19
    //   1468: aload #19
    //   1470: invokevirtual hasNext : ()Z
    //   1473: ifeq -> 1491
    //   1476: aload #19
    //   1478: invokevirtual next : ()Ljava/lang/Object;
    //   1481: checkcast mf
    //   1484: invokevirtual getClass : ()Ljava/lang/Class;
    //   1487: pop
    //   1488: goto -> 1468
    //   1491: aload #13
    //   1493: invokevirtual isEmpty : ()Z
    //   1496: ifne -> 1541
    //   1499: invokestatic p : ()Lnj2;
    //   1502: astore #19
    //   1504: aload #19
    //   1506: invokevirtual b : ()V
    //   1509: aload #19
    //   1511: getfield c : Lwk2;
    //   1514: checkcast oj2
    //   1517: aload #13
    //   1519: invokestatic q : (Loj2;Ljava/util/ArrayList;)V
    //   1522: aload #14
    //   1524: ldc_w 'subscriptionProductReplacementParamsList'
    //   1527: aload #19
    //   1529: invokevirtual a : ()Lwk2;
    //   1532: checkcast oj2
    //   1535: invokevirtual b : ()[B
    //   1538: invokevirtual putByteArray : (Ljava/lang/String;[B)V
    //   1541: aload #18
    //   1543: invokevirtual isEmpty : ()Z
    //   1546: ifne -> 1719
    //   1549: new java/util/ArrayList
    //   1552: dup
    //   1553: invokespecial <init> : ()V
    //   1556: astore #13
    //   1558: new java/util/ArrayList
    //   1561: dup
    //   1562: invokespecial <init> : ()V
    //   1565: pop
    //   1566: new java/util/ArrayList
    //   1569: dup
    //   1570: invokespecial <init> : ()V
    //   1573: pop
    //   1574: new java/util/ArrayList
    //   1577: dup
    //   1578: invokespecial <init> : ()V
    //   1581: pop
    //   1582: new java/util/ArrayList
    //   1585: dup
    //   1586: invokespecial <init> : ()V
    //   1589: pop
    //   1590: aload #18
    //   1592: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1595: astore #19
    //   1597: aload #19
    //   1599: invokeinterface hasNext : ()Z
    //   1604: ifne -> 1713
    //   1607: aload #13
    //   1609: invokevirtual isEmpty : ()Z
    //   1612: ifne -> 1625
    //   1615: aload #14
    //   1617: ldc_w 'skuDetailsTokens'
    //   1620: aload #13
    //   1622: invokevirtual putStringArrayList : (Ljava/lang/String;Ljava/util/ArrayList;)V
    //   1625: aload #18
    //   1627: invokevirtual size : ()I
    //   1630: iconst_1
    //   1631: if_icmple -> 1695
    //   1634: new java/util/ArrayList
    //   1637: dup
    //   1638: aload #18
    //   1640: invokevirtual size : ()I
    //   1643: iconst_1
    //   1644: isub
    //   1645: invokespecial <init> : (I)V
    //   1648: astore #13
    //   1650: new java/util/ArrayList
    //   1653: dup
    //   1654: aload #18
    //   1656: invokevirtual size : ()I
    //   1659: iconst_1
    //   1660: isub
    //   1661: invokespecial <init> : (I)V
    //   1664: astore #19
    //   1666: iconst_1
    //   1667: aload #18
    //   1669: invokevirtual size : ()I
    //   1672: if_icmplt -> 1698
    //   1675: aload #14
    //   1677: ldc_w 'additionalSkus'
    //   1680: aload #13
    //   1682: invokevirtual putStringArrayList : (Ljava/lang/String;Ljava/util/ArrayList;)V
    //   1685: aload #14
    //   1687: ldc_w 'additionalSkuTypes'
    //   1690: aload #19
    //   1692: invokevirtual putStringArrayList : (Ljava/lang/String;Ljava/util/ArrayList;)V
    //   1695: goto -> 2141
    //   1698: aload #18
    //   1700: iconst_1
    //   1701: invokevirtual get : (I)Ljava/lang/Object;
    //   1704: invokevirtual getClass : ()Ljava/lang/Class;
    //   1707: pop
    //   1708: invokestatic b : ()V
    //   1711: aconst_null
    //   1712: areturn
    //   1713: aload #19
    //   1715: invokestatic g : (Ljava/util/Iterator;)Ljava/lang/ClassCastException;
    //   1718: athrow
    //   1719: new java/util/ArrayList
    //   1722: dup
    //   1723: aload #15
    //   1725: invokeinterface size : ()I
    //   1730: iconst_1
    //   1731: isub
    //   1732: invokespecial <init> : (I)V
    //   1735: astore #20
    //   1737: new java/util/ArrayList
    //   1740: dup
    //   1741: aload #15
    //   1743: invokeinterface size : ()I
    //   1748: iconst_1
    //   1749: isub
    //   1750: invokespecial <init> : (I)V
    //   1753: astore #23
    //   1755: new java/util/ArrayList
    //   1758: dup
    //   1759: invokespecial <init> : ()V
    //   1762: astore #22
    //   1764: new java/util/ArrayList
    //   1767: dup
    //   1768: invokespecial <init> : ()V
    //   1771: astore #19
    //   1773: new java/util/ArrayList
    //   1776: dup
    //   1777: invokespecial <init> : ()V
    //   1780: astore #21
    //   1782: new java/util/ArrayList
    //   1785: dup
    //   1786: invokespecial <init> : ()V
    //   1789: astore #18
    //   1791: iconst_0
    //   1792: istore_3
    //   1793: iload_3
    //   1794: aload #15
    //   1796: invokeinterface size : ()I
    //   1801: if_icmpge -> 2037
    //   1804: aload #15
    //   1806: iload_3
    //   1807: invokeinterface get : (I)Ljava/lang/Object;
    //   1812: checkcast mf
    //   1815: astore #13
    //   1817: aload #13
    //   1819: getfield a : Lta1;
    //   1822: astore #24
    //   1824: aload #24
    //   1826: getfield g : Ljava/lang/String;
    //   1829: invokevirtual isEmpty : ()Z
    //   1832: ifne -> 1846
    //   1835: aload #22
    //   1837: aload #24
    //   1839: getfield g : Ljava/lang/String;
    //   1842: invokevirtual add : (Ljava/lang/Object;)Z
    //   1845: pop
    //   1846: aload #13
    //   1848: getfield b : Ljava/lang/String;
    //   1851: astore #25
    //   1853: aload #19
    //   1855: aload #25
    //   1857: invokevirtual add : (Ljava/lang/Object;)Z
    //   1860: pop
    //   1861: aload #25
    //   1863: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1866: ifne -> 1958
    //   1869: aload #24
    //   1871: getfield j : Ljava/util/ArrayList;
    //   1874: astore #13
    //   1876: aload #13
    //   1878: ifnull -> 1958
    //   1881: aload #13
    //   1883: invokevirtual isEmpty : ()Z
    //   1886: ifne -> 1958
    //   1889: aload #13
    //   1891: invokevirtual size : ()I
    //   1894: istore #5
    //   1896: iconst_0
    //   1897: istore #4
    //   1899: iload #4
    //   1901: iload #5
    //   1903: if_icmpge -> 1958
    //   1906: aload #13
    //   1908: iload #4
    //   1910: invokevirtual get : (I)Ljava/lang/Object;
    //   1913: checkcast qa1
    //   1916: astore #26
    //   1918: aload #26
    //   1920: getfield f : Ljava/lang/String;
    //   1923: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1926: ifne -> 1952
    //   1929: aload #26
    //   1931: getfield d : Ljava/lang/String;
    //   1934: aload #25
    //   1936: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1939: ifeq -> 1952
    //   1942: aload #26
    //   1944: getfield f : Ljava/lang/String;
    //   1947: astore #13
    //   1949: goto -> 1965
    //   1952: iinc #4, 1
    //   1955: goto -> 1899
    //   1958: aload #24
    //   1960: getfield h : Ljava/lang/String;
    //   1963: astore #13
    //   1965: aload #13
    //   1967: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1970: ifne -> 1981
    //   1973: aload #21
    //   1975: aload #13
    //   1977: invokevirtual add : (Ljava/lang/Object;)Z
    //   1980: pop
    //   1981: iload_3
    //   1982: ifle -> 2031
    //   1985: aload #20
    //   1987: aload #15
    //   1989: iload_3
    //   1990: invokeinterface get : (I)Ljava/lang/Object;
    //   1995: checkcast mf
    //   1998: getfield a : Lta1;
    //   2001: getfield c : Ljava/lang/String;
    //   2004: invokevirtual add : (Ljava/lang/Object;)Z
    //   2007: pop
    //   2008: aload #23
    //   2010: aload #15
    //   2012: iload_3
    //   2013: invokeinterface get : (I)Ljava/lang/Object;
    //   2018: checkcast mf
    //   2021: getfield a : Lta1;
    //   2024: getfield d : Ljava/lang/String;
    //   2027: invokevirtual add : (Ljava/lang/Object;)Z
    //   2030: pop
    //   2031: iinc #3, 1
    //   2034: goto -> 1793
    //   2037: lload #8
    //   2039: lstore #10
    //   2041: aload #14
    //   2043: ldc_w 'SKU_OFFER_ID_TOKEN_LIST'
    //   2046: aload #19
    //   2048: invokevirtual putStringArrayList : (Ljava/lang/String;Ljava/util/ArrayList;)V
    //   2051: aload #18
    //   2053: invokevirtual isEmpty : ()Z
    //   2056: ifne -> 2069
    //   2059: aload #14
    //   2061: ldc_w 'autoPayBalanceThresholdList'
    //   2064: aload #18
    //   2066: invokevirtual putIntegerArrayList : (Ljava/lang/String;Ljava/util/ArrayList;)V
    //   2069: aload #22
    //   2071: invokevirtual isEmpty : ()Z
    //   2074: ifne -> 2087
    //   2077: aload #14
    //   2079: ldc_w 'skuDetailsTokens'
    //   2082: aload #22
    //   2084: invokevirtual putStringArrayList : (Ljava/lang/String;Ljava/util/ArrayList;)V
    //   2087: aload #21
    //   2089: invokevirtual isEmpty : ()Z
    //   2092: ifne -> 2105
    //   2095: aload #14
    //   2097: ldc_w 'SKU_SERIALIZED_DOCID_LIST'
    //   2100: aload #21
    //   2102: invokevirtual putStringArrayList : (Ljava/lang/String;Ljava/util/ArrayList;)V
    //   2105: lload #10
    //   2107: lstore #8
    //   2109: aload #20
    //   2111: invokevirtual isEmpty : ()Z
    //   2114: ifne -> 2141
    //   2117: aload #14
    //   2119: ldc_w 'additionalSkus'
    //   2122: aload #20
    //   2124: invokevirtual putStringArrayList : (Ljava/lang/String;Ljava/util/ArrayList;)V
    //   2127: aload #14
    //   2129: ldc_w 'additionalSkuTypes'
    //   2132: aload #23
    //   2134: invokevirtual putStringArrayList : (Ljava/lang/String;Ljava/util/ArrayList;)V
    //   2137: lload #10
    //   2139: lstore #8
    //   2141: aload #14
    //   2143: ldc_w 'SKU_OFFER_ID_TOKEN_LIST'
    //   2146: invokevirtual containsKey : (Ljava/lang/String;)Z
    //   2149: ifeq -> 2180
    //   2152: aload_0
    //   2153: getfield o : Z
    //   2156: ifne -> 2180
    //   2159: getstatic ij2.n : Lqf;
    //   2162: astore_1
    //   2163: aload_0
    //   2164: bipush #21
    //   2166: aload_1
    //   2167: lload #8
    //   2169: iconst_0
    //   2170: invokevirtual D : (ILqf;JZ)V
    //   2173: aload_0
    //   2174: aload_1
    //   2175: invokevirtual F : (Lqf;)V
    //   2178: aload_1
    //   2179: areturn
    //   2180: aload #17
    //   2182: getfield a : Lta1;
    //   2185: getfield b : Lorg/json/JSONObject;
    //   2188: ldc_w 'packageName'
    //   2191: invokevirtual optString : (Ljava/lang/String;)Ljava/lang/String;
    //   2194: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   2197: ifne -> 2227
    //   2200: aload #14
    //   2202: ldc_w 'skuPackageName'
    //   2205: aload #17
    //   2207: getfield a : Lta1;
    //   2210: getfield b : Lorg/json/JSONObject;
    //   2213: ldc_w 'packageName'
    //   2216: invokevirtual optString : (Ljava/lang/String;)Ljava/lang/String;
    //   2219: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   2222: iconst_1
    //   2223: istore_3
    //   2224: goto -> 2232
    //   2227: iconst_0
    //   2228: istore_3
    //   2229: goto -> 2224
    //   2232: aconst_null
    //   2233: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   2236: ifne -> 2248
    //   2239: aload #14
    //   2241: getstatic org/jaudiotagger/audio/opus/bsQ/uvJYmft.hgfJDxDkkur : Ljava/lang/String;
    //   2244: aconst_null
    //   2245: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   2248: aload_1
    //   2249: invokevirtual getIntent : ()Landroid/content/Intent;
    //   2252: astore #13
    //   2254: aload #13
    //   2256: ifnonnull -> 2270
    //   2259: ldc 'BillingClient'
    //   2261: ldc_w 'Activity's intent is null.'
    //   2264: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   2267: goto -> 2344
    //   2270: aload #13
    //   2272: ldc_w 'PROXY_PACKAGE'
    //   2275: invokevirtual getStringExtra : (Ljava/lang/String;)Ljava/lang/String;
    //   2278: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   2281: ifne -> 2344
    //   2284: aload #13
    //   2286: getstatic org/jaudiotagger/audio/exceptions/yb/zLtYiJUm.NdFMpvd : Ljava/lang/String;
    //   2289: invokevirtual getStringExtra : (Ljava/lang/String;)Ljava/lang/String;
    //   2292: astore #13
    //   2294: aload #14
    //   2296: ldc_w 'proxyPackage'
    //   2299: aload #13
    //   2301: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   2304: aload #14
    //   2306: ldc_w 'proxyPackageVersion'
    //   2309: aload_0
    //   2310: getfield g : Landroid/content/Context;
    //   2313: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   2316: aload #13
    //   2318: iconst_0
    //   2319: invokevirtual getPackageInfo : (Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   2322: getfield versionName : Ljava/lang/String;
    //   2325: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   2328: goto -> 2344
    //   2331: astore #13
    //   2333: aload #14
    //   2335: ldc_w 'proxyPackageVersion'
    //   2338: ldc_w 'package not found'
    //   2341: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   2344: aload_0
    //   2345: getfield r : Z
    //   2348: ifeq -> 2367
    //   2351: aload #15
    //   2353: invokeinterface isEmpty : ()Z
    //   2358: ifne -> 2367
    //   2361: bipush #17
    //   2363: istore_3
    //   2364: goto -> 2403
    //   2367: aload_0
    //   2368: getfield p : Z
    //   2371: ifeq -> 2384
    //   2374: iload_3
    //   2375: ifeq -> 2384
    //   2378: bipush #15
    //   2380: istore_3
    //   2381: goto -> 2364
    //   2384: aload_0
    //   2385: getfield n : Z
    //   2388: ifeq -> 2397
    //   2391: bipush #9
    //   2393: istore_3
    //   2394: goto -> 2364
    //   2397: bipush #6
    //   2399: istore_3
    //   2400: goto -> 2364
    //   2403: new nd2
    //   2406: dup
    //   2407: aload_0
    //   2408: iload_3
    //   2409: aload #12
    //   2411: aload #16
    //   2413: aload_2
    //   2414: aload #14
    //   2416: invokespecial <init> : (Lef;ILjava/lang/String;Ljava/lang/String;Lof;Landroid/os/Bundle;)V
    //   2419: ldc2_w 5000
    //   2422: aconst_null
    //   2423: aload_0
    //   2424: getfield e : Landroid/os/Handler;
    //   2427: aload_0
    //   2428: invokevirtual f : ()Ljava/util/concurrent/ExecutorService;
    //   2431: invokestatic g : (Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;
    //   2434: astore_2
    //   2435: goto -> 2467
    //   2438: new cc2
    //   2441: dup
    //   2442: aload_0
    //   2443: aload #12
    //   2445: aload #16
    //   2447: iconst_1
    //   2448: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    //   2451: ldc2_w 5000
    //   2454: aconst_null
    //   2455: aload_0
    //   2456: getfield e : Landroid/os/Handler;
    //   2459: aload_0
    //   2460: invokevirtual f : ()Ljava/util/concurrent/ExecutorService;
    //   2463: invokestatic g : (Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;Ljava/util/concurrent/ExecutorService;)Ljava/util/concurrent/Future;
    //   2466: astore_2
    //   2467: aload_2
    //   2468: ifnonnull -> 2540
    //   2471: getstatic ij2.c : Lqf;
    //   2474: astore_1
    //   2475: lload #8
    //   2477: lstore #10
    //   2479: aload_0
    //   2480: bipush #25
    //   2482: aload_1
    //   2483: lload #10
    //   2485: iconst_0
    //   2486: invokevirtual D : (ILqf;JZ)V
    //   2489: aload_0
    //   2490: aload_1
    //   2491: invokevirtual F : (Lqf;)V
    //   2494: aload_1
    //   2495: areturn
    //   2496: lload #8
    //   2498: lstore #10
    //   2500: astore_1
    //   2501: goto -> 2905
    //   2504: lload #8
    //   2506: lstore #10
    //   2508: astore_1
    //   2509: goto -> 2938
    //   2512: lload #8
    //   2514: lstore #10
    //   2516: astore_1
    //   2517: goto -> 2938
    //   2520: astore_1
    //   2521: lload #8
    //   2523: lstore #10
    //   2525: goto -> 2905
    //   2528: astore_1
    //   2529: lload #8
    //   2531: lstore #10
    //   2533: goto -> 2938
    //   2536: astore_1
    //   2537: goto -> 2529
    //   2540: lload #8
    //   2542: lstore #10
    //   2544: aload_2
    //   2545: ldc2_w 5000
    //   2548: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   2551: invokeinterface get : (JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    //   2556: checkcast android/os/Bundle
    //   2559: astore #12
    //   2561: ldc 'BillingClient'
    //   2563: aload #12
    //   2565: invokestatic a : (Ljava/lang/String;Landroid/os/Bundle;)I
    //   2568: istore_3
    //   2569: ldc 'BillingClient'
    //   2571: aload #12
    //   2573: invokestatic f : (Ljava/lang/String;Landroid/os/Bundle;)Ljava/lang/String;
    //   2576: astore_2
    //   2577: iload_3
    //   2578: ifeq -> 2846
    //   2581: new java/lang/StringBuilder
    //   2584: astore_1
    //   2585: aload_1
    //   2586: invokespecial <init> : ()V
    //   2589: aload_1
    //   2590: ldc_w 'Unable to buy item, Error response code: '
    //   2593: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2596: pop
    //   2597: aload_1
    //   2598: iload_3
    //   2599: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2602: pop
    //   2603: ldc 'BillingClient'
    //   2605: aload_1
    //   2606: invokevirtual toString : ()Ljava/lang/String;
    //   2609: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   2612: aload_2
    //   2613: iload_3
    //   2614: invokestatic a : (Ljava/lang/String;I)Lqf;
    //   2617: astore_2
    //   2618: aload #12
    //   2620: ifnonnull -> 2628
    //   2623: iconst_1
    //   2624: istore_3
    //   2625: goto -> 2737
    //   2628: aload #12
    //   2630: ldc_w 'LOG_REASON'
    //   2633: invokevirtual get : (Ljava/lang/String;)Ljava/lang/Object;
    //   2636: astore_1
    //   2637: aload_1
    //   2638: ifnonnull -> 2644
    //   2641: goto -> 2623
    //   2644: aload_1
    //   2645: instanceof java/lang/Integer
    //   2648: ifeq -> 2669
    //   2651: aload_1
    //   2652: checkcast java/lang/Integer
    //   2655: invokevirtual intValue : ()I
    //   2658: invokestatic d : (I)I
    //   2661: istore_3
    //   2662: goto -> 2737
    //   2665: astore_1
    //   2666: goto -> 2716
    //   2669: aload_1
    //   2670: invokevirtual getClass : ()Ljava/lang/Class;
    //   2673: invokevirtual getName : ()Ljava/lang/String;
    //   2676: astore_1
    //   2677: new java/lang/StringBuilder
    //   2680: astore #13
    //   2682: aload #13
    //   2684: invokespecial <init> : ()V
    //   2687: aload #13
    //   2689: ldc_w 'Unexpected type for bundle log reason: '
    //   2692: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2695: pop
    //   2696: aload #13
    //   2698: aload_1
    //   2699: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2702: pop
    //   2703: ldc 'BillingClient'
    //   2705: aload #13
    //   2707: invokevirtual toString : ()Ljava/lang/String;
    //   2710: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   2713: goto -> 2623
    //   2716: ldc 'BillingClient'
    //   2718: ldc_w 'Failed to get log reason from bundle: '
    //   2721: aload_1
    //   2722: invokevirtual getMessage : ()Ljava/lang/String;
    //   2725: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   2728: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   2731: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   2734: goto -> 2623
    //   2737: iload_3
    //   2738: istore #4
    //   2740: iload_3
    //   2741: iconst_1
    //   2742: if_icmpne -> 2749
    //   2745: bipush #23
    //   2747: istore #4
    //   2749: aload #12
    //   2751: ifnonnull -> 2759
    //   2754: aconst_null
    //   2755: astore_1
    //   2756: goto -> 2795
    //   2759: aload #12
    //   2761: ldc_w 'ADDITIONAL_LOG_DETAILS'
    //   2764: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   2767: astore_1
    //   2768: goto -> 2795
    //   2771: astore_1
    //   2772: aload_1
    //   2773: invokevirtual getMessage : ()Ljava/lang/String;
    //   2776: astore_1
    //   2777: ldc 'BillingClient'
    //   2779: getstatic org/jaudiotagger/audio/exceptions/yb/zLtYiJUm.yWBbgcYCE : Ljava/lang/String;
    //   2782: aload_1
    //   2783: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   2786: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   2789: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   2792: goto -> 2754
    //   2795: aload_0
    //   2796: iload #4
    //   2798: aload_2
    //   2799: aload_1
    //   2800: lload #8
    //   2802: iconst_0
    //   2803: invokevirtual E : (ILqf;Ljava/lang/String;JZ)V
    //   2806: lload #8
    //   2808: lstore #10
    //   2810: iconst_0
    //   2811: istore #6
    //   2813: aload_0
    //   2814: aload_2
    //   2815: invokevirtual F : (Lqf;)V
    //   2818: aload_2
    //   2819: areturn
    //   2820: astore_1
    //   2821: lload #8
    //   2823: lstore #10
    //   2825: iconst_0
    //   2826: istore #6
    //   2828: goto -> 2905
    //   2831: astore_1
    //   2832: lload #8
    //   2834: lstore #10
    //   2836: iconst_0
    //   2837: istore #6
    //   2839: goto -> 2938
    //   2842: astore_1
    //   2843: goto -> 2832
    //   2846: new android/content/Intent
    //   2849: astore_2
    //   2850: aload_2
    //   2851: aload_1
    //   2852: ldc_w com/android/billingclient/api/ProxyBillingActivity
    //   2855: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   2858: aload_2
    //   2859: ldc_w 'BUY_INTENT'
    //   2862: aload #12
    //   2864: ldc_w 'BUY_INTENT'
    //   2867: invokevirtual getParcelable : (Ljava/lang/String;)Landroid/os/Parcelable;
    //   2870: checkcast android/app/PendingIntent
    //   2873: invokevirtual putExtra : (Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    //   2876: pop
    //   2877: aload_2
    //   2878: ldc_w 'billingClientTransactionId'
    //   2881: lload #10
    //   2883: invokevirtual putExtra : (Ljava/lang/String;J)Landroid/content/Intent;
    //   2886: pop
    //   2887: aload_2
    //   2888: ldc_w 'wasServiceAutoReconnected'
    //   2891: iconst_0
    //   2892: invokevirtual putExtra : (Ljava/lang/String;Z)Landroid/content/Intent;
    //   2895: pop
    //   2896: aload_1
    //   2897: aload_2
    //   2898: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   2901: getstatic ij2.i : Lqf;
    //   2904: areturn
    //   2905: ldc 'BillingClient'
    //   2907: ldc_w 'Exception while launching billing flow. Try to reconnect'
    //   2910: aload_1
    //   2911: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2914: getstatic ij2.j : Lqf;
    //   2917: astore_2
    //   2918: aload_0
    //   2919: iconst_5
    //   2920: aload_2
    //   2921: aload_1
    //   2922: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/String;
    //   2925: lload #8
    //   2927: iconst_0
    //   2928: invokevirtual E : (ILqf;Ljava/lang/String;JZ)V
    //   2931: aload_0
    //   2932: aload_2
    //   2933: invokevirtual F : (Lqf;)V
    //   2936: aload_2
    //   2937: areturn
    //   2938: ldc 'BillingClient'
    //   2940: ldc_w 'Time out while launching billing flow. Try to reconnect'
    //   2943: aload_1
    //   2944: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   2947: getstatic ij2.k : Lqf;
    //   2950: astore_2
    //   2951: aload_0
    //   2952: iconst_4
    //   2953: aload_2
    //   2954: aload_1
    //   2955: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/String;
    //   2958: lload #8
    //   2960: iconst_0
    //   2961: invokevirtual E : (ILqf;Ljava/lang/String;JZ)V
    //   2964: aload_0
    //   2965: aload_2
    //   2966: invokevirtual F : (Lqf;)V
    //   2969: aload_2
    //   2970: areturn
    //   2971: invokestatic b : ()V
    //   2974: goto -> 1711
    //   2977: aload #12
    //   2979: monitorexit
    //   2980: aload_1
    //   2981: athrow
    //   2982: getstatic ij2.q : Lqf;
    //   2985: astore_1
    //   2986: aload_0
    //   2987: bipush #12
    //   2989: aload_1
    //   2990: lload #8
    //   2992: invokevirtual B : (ILqf;J)V
    //   2995: aload_1
    //   2996: areturn
    // Exception table:
    //   from	to	target	type
    //   67	82	85	finally
    //   89	92	85	finally
    //   2304	2328	2331	android/content/pm/PackageManager$NameNotFoundException
    //   2471	2475	2536	java/util/concurrent/TimeoutException
    //   2471	2475	2528	java/util/concurrent/CancellationException
    //   2471	2475	2520	java/lang/Exception
    //   2479	2494	2512	java/util/concurrent/TimeoutException
    //   2479	2494	2504	java/util/concurrent/CancellationException
    //   2479	2494	2496	java/lang/Exception
    //   2544	2577	2512	java/util/concurrent/TimeoutException
    //   2544	2577	2504	java/util/concurrent/CancellationException
    //   2544	2577	2496	java/lang/Exception
    //   2581	2618	2512	java/util/concurrent/TimeoutException
    //   2581	2618	2504	java/util/concurrent/CancellationException
    //   2581	2618	2496	java/lang/Exception
    //   2628	2637	2665	finally
    //   2644	2662	2665	finally
    //   2669	2713	2665	finally
    //   2716	2734	2512	java/util/concurrent/TimeoutException
    //   2716	2734	2504	java/util/concurrent/CancellationException
    //   2716	2734	2496	java/lang/Exception
    //   2759	2768	2771	finally
    //   2772	2792	2512	java/util/concurrent/TimeoutException
    //   2772	2792	2504	java/util/concurrent/CancellationException
    //   2772	2792	2496	java/lang/Exception
    //   2795	2806	2842	java/util/concurrent/TimeoutException
    //   2795	2806	2831	java/util/concurrent/CancellationException
    //   2795	2806	2820	java/lang/Exception
    //   2813	2818	2512	java/util/concurrent/TimeoutException
    //   2813	2818	2504	java/util/concurrent/CancellationException
    //   2813	2818	2496	java/lang/Exception
    //   2846	2901	2512	java/util/concurrent/TimeoutException
    //   2846	2901	2504	java/util/concurrent/CancellationException
    //   2846	2901	2496	java/lang/Exception
    //   2977	2980	85	finally
  }
  
  public void d(ib1 paramib1, hf paramhf) {
    if (g(new cc2(this, paramhf, paramib1, 4), 30000L, new vi2(23, this, paramhf), l(), f()) == null) {
      qf qf = o();
      A(25, 7, qf);
      yg2 yg2 = ch2.c;
      paramhf.b(qf, new bh0(22, th2.g));
    } 
  }
  
  public void e(lf paramlf) {
    t(paramlf);
  }
  
  public final ExecutorService f() {
    /* monitor enter ThisExpression{ObjectType{ef}} */
    try {
      if (this.z == null) {
        int i = ph2.a;
        og2 og2 = new og2();
        this(this);
        this.z = Executors.newFixedThreadPool(i, og2);
      } 
    } finally {
      Exception exception;
    } 
    ExecutorService executorService = this.z;
    /* monitor exit ThisExpression{ObjectType{ef}} */
    return executorService;
  }
  
  public final void h() {
    if (!TextUtils.isEmpty(null))
      return; 
    this.g.getPackageName();
  }
  
  public final void j(hf paramhf, qf paramqf, int paramInt, Exception paramException) {
    ph2.i("BillingClient", "Error in acknowledge purchase!", paramException);
    C(paramInt, 3, paramqf, xi2.a(paramException));
    paramhf.a(paramqf);
  }
  
  public final Handler l() {
    return (Looper.myLooper() == null) ? this.e : new Handler(Looper.myLooper());
  }
  
  public final d7 m(qf paramqf, int paramInt, String paramString, Exception paramException) {
    ph2.i("BillingClient", paramString, paramException);
    C(paramInt, 7, paramqf, xi2.a(paramException));
    return new d7(paramqf.a, paramqf.c, new ArrayList(), new ArrayList());
  }
  
  public final qf n() {
    ph2.g("BillingClient", "Service connection is valid. No need to re-initialize.");
    dn2 dn2 = kn2.q();
    dn2.b();
    kn2.p((kn2)dn2.c, 6);
    ko2 ko2 = lo2.p();
    ko2.b();
    lo2.u((lo2)ko2.c);
    ko2.c(false);
    ko2.d();
    dn2.b();
    kn2.v((kn2)dn2.c, (lo2)ko2.a());
    q((kn2)dn2.a());
    return ij2.i;
  }
  
  public final qf o() {
    byte b = 0;
    Object object = this.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    while (true) {
      if (b < 2) {
        try {
          (new int[2])[0] = 0;
          (new int[2])[1] = 3;
          int i = (new int[2])[b];
          if (this.b == i) {
            /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
            return ij2.j;
          } 
        } finally {
          Exception exception;
        } 
        b++;
        continue;
      } 
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      return ij2.h;
    } 
  }
  
  public final void p(cn2 paramcn2) {
    try {
      j01 j011 = this.h;
      int i = this.l;
    } finally {
      paramcn2 = null;
      ph2.i("BillingClient", "Unable to log.", (Throwable)paramcn2);
    } 
  }
  
  public final void q(kn2 paramkn2) {
    try {
      j01 j011 = this.h;
      int i = this.l;
      return;
    } finally {
      paramkn2 = null;
      ph2.i("BillingClient", "Unable to log.", (Throwable)paramkn2);
    } 
  }
  
  public final void r(int paramInt, qf paramqf) {
    try {
      int i = xi2.a;
      bn2 bn2 = (bn2)xi2.b(paramInt, 6, paramqf, null, on2.c).l();
      ko2 ko2 = lo2.p();
      ko2.c(false);
      ko2.d();
      return;
    } finally {
      paramqf = null;
      ph2.i("BillingClient", "Unable to log.", (Throwable)paramqf);
    } 
  }
  
  public final void s(int paramInt) {
    Object object = this.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (this.b == 3) {
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
        return;
      } 
    } finally {
      Exception exception;
    } 
    int i = this.b;
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          str1 = "CLOSED";
        } else {
          str1 = "CONNECTED";
        } 
      } else {
        str1 = "CONNECTING";
      } 
    } else {
      str1 = "DISCONNECTED";
    } 
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt != 2) {
          str2 = "CLOSED";
        } else {
          str2 = "CONNECTED";
        } 
      } else {
        str2 = "CONNECTING";
      } 
    } else {
      str2 = "DISCONNECTED";
    } 
    StringBuilder stringBuilder = new StringBuilder();
    this("Setting clientState from ");
    String str1;
    String str2;
    stringBuilder.append(str1);
    stringBuilder.append(" to ");
    stringBuilder.append(str2);
    ph2.g("BillingClient", stringBuilder.toString());
    this.b = paramInt;
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
  
  public final void t(lf paramlf) {
    Object object = this.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      if (x()) {
        qf qf = n();
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      } else if (this.b == 1) {
        ph2.h("BillingClient", "Client is already in the process of connecting to billing service.");
        qf qf = ij2.d;
        r(37, qf);
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      } else if (this.b == 3) {
        ph2.h("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
        qf qf = ij2.j;
        r(38, qf);
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
      } else {
        s(1);
        u();
        ph2.g("BillingClient", "Starting in-app billing setup.");
        dh2 dh21 = new dh2();
        this(this, paramlf);
        this.j = dh21;
        dh2 dh22 = this.j;
        synchronized (dh22.f.a) {
          cp1 cp1 = dh22.c;
          cp1.c = 0L;
          cp1.b = false;
          cp1.c();
          /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
          null = new Intent("com.android.vending.billing.InAppBillingService.BIND");
          null.setPackage(eRUgfgGAccgka.rSDoBdcawaOC);
          object = this.g.getPackageManager().queryIntentServices((Intent)null, 0);
          if (object != null && !object.isEmpty()) {
            ServiceInfo serviceInfo = ((ResolveInfo)object.get(0)).serviceInfo;
            byte b = 40;
            if (serviceInfo != null) {
              object = serviceInfo.packageName;
              String str = serviceInfo.name;
              if (Objects.equals(object, "com.android.vending") && str != null) {
                object = new ComponentName((String)object, str);
                null = new Intent((Intent)null);
                null.setComponent((ComponentName)object);
                null.putExtra("playBillingLibraryVersion", this.c);
                synchronized (this.a) {
                  if (this.b == 2) {
                    null = n();
                  } else if (this.b != 1) {
                    ph2.h("BillingClient", "Client state no longer CONNECTING, returning service disconnected.");
                    null = ij2.j;
                    r(105, (qf)null);
                  } else {
                    dh2 dh23 = this.j;
                    if (this.g.bindService((Intent)null, dh23, 1)) {
                      ph2.g("BillingClient", "Service was bonded successfully.");
                      null = null;
                    } else {
                      ph2.h("BillingClient", "Connection to Billing service is blocked.");
                      b = 39;
                      s(0);
                      ph2.g("BillingClient", "Billing service unavailable on device.");
                      null = ij2.b;
                      r(b, (qf)null);
                    } 
                  } 
                } 
              } else {
                ph2.h("BillingClient", "The device doesn't have valid Play Store.");
                s(0);
                ph2.g("BillingClient", "Billing service unavailable on device.");
                null = ij2.b;
                r(b, (qf)null);
              } 
            } else {
              ph2.h("BillingClient", "The device doesn't have valid Play Store.");
              s(0);
              ph2.g("BillingClient", "Billing service unavailable on device.");
              null = ij2.b;
              r(b, (qf)null);
            } 
          } else {
            byte b = 41;
            s(0);
            ph2.g("BillingClient", "Billing service unavailable on device.");
            null = ij2.b;
            r(b, (qf)null);
          } 
          if (null != null)
            paramlf.j((qf)null); 
          return;
        } 
      } 
    } finally {}
    if (SYNTHETIC_LOCAL_VARIABLE_3 != null)
      paramlf.j((qf)SYNTHETIC_LOCAL_VARIABLE_3); 
  }
  
  public final void u() {
    Object object = this.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      dh2 dh21 = this.j;
      if (dh21 != null)
        try {
          this.g.unbindService(this.j);
          this.i = null;
        } finally {
          dh21 = null;
        }  
    } finally {
      Exception exception;
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
  }
  
  public final boolean v() {
    try {
      ph2.g("BillingClient", "Already connected or not opted into auto reconnection.");
      qf qf = ij2.i;
      fj2 fj2 = new fj2();
      TimeUnit.MILLISECONDS.getClass();
      int i = qf.a;
      if (i == 0) {
        StringBuilder stringBuilder = new StringBuilder();
        this("Reconnection succeeded with result: ");
        stringBuilder.append(i);
        ph2.g("BillingClient", stringBuilder.toString());
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        this("Reconnection failed with result: ");
        stringBuilder.append(i);
        ph2.h("BillingClient", stringBuilder.toString());
      } 
    } catch (Exception exception) {
      if (exception instanceof InterruptedException)
        Thread.currentThread().interrupt(); 
      ph2.i("BillingClient", "Error during reconnection attempt: ", exception);
    } 
    return x();
  }
  
  public final boolean w() {
    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
    dd1 dd11 = this.B;
    if (dd11 != null) {
      long l3 = dd11.F0();
      long l2 = 30000L;
      byte b = 1;
      long l1 = 30000L;
      while (true) {
        if (b <= 3) {
          try {
            if (Math.max(0L, l1) <= 0L) {
              ph2.h("BillingClient", "No time remaining for reconnection attempt.");
              return x();
            } 
          } catch (Exception exception) {}
          ph2.g("BillingClient", "Already connected or not opted into auto reconnection.");
          qf qf = ij2.i;
          fj2 fj2 = new fj2();
          timeUnit.getClass();
          int i = qf.a;
          if (i == 0) {
            StringBuilder stringBuilder1 = new StringBuilder();
            this();
            stringBuilder1.append("Reconnection succeeded with result: ");
            stringBuilder1.append(i);
            ph2.g("BillingClient", stringBuilder1.toString());
            return x();
          } 
          StringBuilder stringBuilder = new StringBuilder();
          this();
          stringBuilder.append("Reconnection failed with result: ");
          stringBuilder.append(i);
          ph2.h("BillingClient", stringBuilder.toString());
        } else {
          break;
        } 
        long l4 = l2 - (dd11.F0() - l3 + 0L) / 1000000L;
        long l5 = (long)Math.pow(2.0D, (b - 1)) * 1000L;
        if (l4 < l5) {
          ph2.h("BillingClient", "Reconnection failed due to timeout limit reached.");
          return x();
        } 
        l1 = l4;
        if (b < 3) {
          l1 = l4;
          if (l5 > 0L)
            try {
              Thread.sleep(l5);
              l1 = (dd11.F0() - l3 + 0L) / 1000000L;
              l1 = l2 - l1;
            } catch (InterruptedException interruptedException) {
              Thread.currentThread().interrupt();
              ph2.i("BillingClient", "Error sleeping during reconnection attempt: ", interruptedException);
              break;
            }  
        } 
        b++;
      } 
      ph2.h("BillingClient", "Max retries reached.");
      return x();
    } 
    k91.h("ticker");
    return false;
  }
  
  public final boolean x() {
    boolean bool;
    Object object = this.a;
    /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    try {
      int i = this.b;
      boolean bool1 = false;
      bool = bool1;
      if (i == 2) {
        bool = bool1;
        if (this.i != null) {
          bool = bool1;
          if (this.j != null)
            bool = true; 
        } 
      } 
    } finally {
      Exception exception;
    } 
    /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    return bool;
  }
  
  public final qj2 z(qf paramqf, int paramInt, String paramString, Exception paramException) {
    C(paramInt, 9, paramqf, xi2.a(paramException));
    ph2.i("BillingClient", paramString, paramException);
    return new qj2(paramqf, null);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */