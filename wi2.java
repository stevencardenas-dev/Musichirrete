import android.content.Context;
import android.support.v4.graphics.drawable.uUq.IGBYXeDFmKYajx;
import in.krosbits.musicolet.IapActivity;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class wi2 extends ef {
  public final Context C;
  
  public volatile int D = 0;
  
  public volatile mf2 E;
  
  public volatile bl F;
  
  public volatile ScheduledExecutorService G;
  
  public wi2(zb0 paramzb0, Context paramContext, df paramdf) {
    super(paramzb0, paramContext, paramdf);
    this.C = paramContext;
  }
  
  public wi2(zb0 paramzb0, Context paramContext, lf paramlf, df paramdf) {
    super(paramzb0, paramContext, paramlf, paramdf);
    this.C = paramContext;
  }
  
  public final boolean G() {
    /* monitor enter ThisExpression{ObjectType{wi2}} */
    try {
      if (this.D == 2 && this.E != null) {
        bl bl1 = this.F;
        if (bl1 != null) {
          /* monitor exit ThisExpression{ObjectType{wi2}} */
          return true;
        } 
      } 
    } finally {
      Exception exception;
    } 
    /* monitor exit ThisExpression{ObjectType{wi2}} */
    return false;
  }
  
  public final hj2 H(int paramInt) {
    if (!G()) {
      ph2.h("BillingClientTesting", "Billing Override Service is not ready.");
      I(94, 28, ij2.a("Billing Override Service connection is disconnected.", -1));
      return new fj2(Integer.valueOf(0));
    } 
    mi2 mi2 = new mi2(paramInt, 0, this);
    Object object = new Object();
    ((tp2)object).c = (nt2)new Object();
    js2 js2 = new js2((tp2)object);
    ((tp2)object).b = js2;
    ((tp2)object).a = mi2.class;
    try {
      mi2.g((tp2)object);
      ((tp2)object).a = "billingOverrideService.getBillingOverride";
      return js2;
    } catch (Exception exception) {
      gl2 gl2 = new gl2(exception);
      ui0 ui0 = pp2.h;
      rr2 rr2 = js2.c;
      if (ui0.A0(rr2, null, gl2))
        pp2.d(rr2); 
      return js2;
    } 
  }
  
  public final void I(int paramInt1, int paramInt2, qf paramqf) {
    int i = xi2.a;
    cn2 cn2 = xi2.b(paramInt1, paramInt2, paramqf, null, on2.c);
    Objects.requireNonNull(cn2, "ApiFailure should not be null");
    this.h.J(cn2);
  }
  
  public final void J(int paramInt) {
    int i = xi2.a;
    kn2 kn2 = xi2.c(paramInt, on2.c);
    Objects.requireNonNull(kn2, "ApiSuccess should not be null");
    j01 j01 = this.h;
    j01.getClass();
    try {
      return;
    } finally {
      kn2 = null;
      ph2.i("BillingLogger", "Unable to log.", (Throwable)kn2);
    } 
  }
  
  public final void K(int paramInt, nr paramnr, Runnable paramRunnable) {
    Object object;
    hj2 hj2 = H(paramInt);
    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
    /* monitor enter ThisExpression{ObjectType{wi2}} */
    try {
      if (this.G == null)
        this.G = Executors.newSingleThreadScheduledExecutor(); 
    } finally {}
    ScheduledExecutorService scheduledExecutorService = this.G;
    /* monitor exit ThisExpression{ObjectType{wi2}} */
    if (hj2.isDone()) {
      object = hj2;
    } else {
      object = new Object();
      ((kj2)object).j = hj2;
      yi1 yi1 = new yi1();
      yi1.c = object;
      ((kj2)object).k = scheduledExecutorService.schedule(yi1, 28500L, timeUnit);
      hj2.b(yi1, ti2.b);
    } 
    oz0 oz0 = new oz0(this, paramInt, paramnr, paramRunnable);
    ExecutorService executorService = f();
    object.b(new vi2(0, object, oz0), executorService);
  }
  
  public final void a(f1 paramf1, hf paramhf) {
    K(3, new aa0(3, paramhf), new lf0(this, paramf1, paramhf, 6, false));
  }
  
  public final void b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: bipush #27
    //   5: invokevirtual J : (I)V
    //   8: aload_0
    //   9: getfield F : Lbl;
    //   12: ifnull -> 67
    //   15: aload_0
    //   16: getfield E : Lmf2;
    //   19: ifnull -> 67
    //   22: ldc 'BillingClientTesting'
    //   24: ldc_w 'Unbinding from Billing Override Service.'
    //   27: invokestatic g : (Ljava/lang/String;Ljava/lang/String;)V
    //   30: aload_0
    //   31: getfield C : Landroid/content/Context;
    //   34: aload_0
    //   35: getfield F : Lbl;
    //   38: invokevirtual unbindService : (Landroid/content/ServiceConnection;)V
    //   41: new bl
    //   44: astore_1
    //   45: aload_1
    //   46: iconst_3
    //   47: aload_0
    //   48: invokespecial <init> : (ILjava/lang/Object;)V
    //   51: aload_0
    //   52: aload_1
    //   53: putfield F : Lbl;
    //   56: goto -> 67
    //   59: astore_1
    //   60: goto -> 122
    //   63: astore_1
    //   64: goto -> 97
    //   67: aload_0
    //   68: aconst_null
    //   69: putfield E : Lmf2;
    //   72: aload_0
    //   73: getfield G : Ljava/util/concurrent/ScheduledExecutorService;
    //   76: ifnull -> 106
    //   79: aload_0
    //   80: getfield G : Ljava/util/concurrent/ScheduledExecutorService;
    //   83: invokeinterface shutdownNow : ()Ljava/util/List;
    //   88: pop
    //   89: aload_0
    //   90: aconst_null
    //   91: putfield G : Ljava/util/concurrent/ScheduledExecutorService;
    //   94: goto -> 106
    //   97: ldc 'BillingClientTesting'
    //   99: ldc_w 'There was an exception while ending Billing Override Service connection!'
    //   102: aload_1
    //   103: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   106: aload_0
    //   107: iconst_3
    //   108: putfield D : I
    //   111: aload_0
    //   112: monitorexit
    //   113: aload_0
    //   114: invokespecial b : ()V
    //   117: return
    //   118: astore_1
    //   119: goto -> 129
    //   122: aload_0
    //   123: iconst_3
    //   124: putfield D : I
    //   127: aload_1
    //   128: athrow
    //   129: aload_0
    //   130: monitorexit
    //   131: aload_1
    //   132: athrow
    // Exception table:
    //   from	to	target	type
    //   2	8	118	finally
    //   8	56	63	java/lang/RuntimeException
    //   8	56	59	finally
    //   67	94	63	java/lang/RuntimeException
    //   67	94	59	finally
    //   97	106	59	finally
    //   106	111	118	finally
    //   122	129	118	finally
    //   129	131	118	finally
  }
  
  public final qf c(IapActivity paramIapActivity, of paramof) {
    qf qf;
    boolean bool1;
    hj2 hj2 = H(2);
    boolean bool2 = false;
    try {
      bool1 = ((Integer)hj2.get(28500L, TimeUnit.MILLISECONDS)).intValue();
    } catch (TimeoutException timeoutException) {
      I(102, 28, ij2.r);
      ph2.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", timeoutException);
      bool1 = bool2;
    } catch (Exception exception) {}
    if (bool1) {
      qf = ij2.a(IGBYXeDFmKYajx.ESORVhRTax, bool1);
      I(93, 2, qf);
      F(qf);
    } else {
      try {
        qf = super.c((IapActivity)qf, paramof);
      } catch (Exception exception) {
        qf = ij2.h;
        I(103, 2, qf);
        ph2.i("BillingClientTesting", "An internal error occurred.", exception);
      } 
    } 
    return qf;
  }
  
  public final void d(ib1 paramib1, hf paramhf) {
    K(7, new aa0(2, paramhf), new lf0(this, paramib1, paramhf, 5, false));
  }
  
  public final void e(lf paramlf) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual G : ()Z
    //   6: ifeq -> 32
    //   9: ldc 'BillingClientTesting'
    //   11: ldc_w 'Billing Override Service connection is valid. No need to re-initialize.'
    //   14: invokestatic g : (Ljava/lang/String;Ljava/lang/String;)V
    //   17: aload_0
    //   18: bipush #26
    //   20: invokevirtual J : (I)V
    //   23: aload_0
    //   24: monitorexit
    //   25: goto -> 351
    //   28: astore_1
    //   29: goto -> 357
    //   32: aload_0
    //   33: getfield D : I
    //   36: istore_3
    //   37: iconst_1
    //   38: istore_2
    //   39: iload_3
    //   40: iconst_1
    //   41: if_icmpne -> 57
    //   44: ldc 'BillingClientTesting'
    //   46: ldc_w 'Client is already in the process of connecting to Billing Override Service.'
    //   49: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   52: aload_0
    //   53: monitorexit
    //   54: goto -> 351
    //   57: aload_0
    //   58: getfield D : I
    //   61: iconst_3
    //   62: if_icmpne -> 92
    //   65: ldc 'BillingClientTesting'
    //   67: ldc_w 'Billing Override Service Client was already closed and can't be reused. Please create another instance.'
    //   70: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   73: aload_0
    //   74: bipush #38
    //   76: bipush #26
    //   78: ldc 'Billing Override Service connection is disconnected.'
    //   80: iconst_m1
    //   81: invokestatic a : (Ljava/lang/String;I)Lqf;
    //   84: invokevirtual I : (IILqf;)V
    //   87: aload_0
    //   88: monitorexit
    //   89: goto -> 351
    //   92: aload_0
    //   93: iconst_1
    //   94: putfield D : I
    //   97: ldc 'BillingClientTesting'
    //   99: ldc_w 'Starting Billing Override Service setup.'
    //   102: invokestatic g : (Ljava/lang/String;Ljava/lang/String;)V
    //   105: new bl
    //   108: astore #4
    //   110: aload #4
    //   112: iconst_3
    //   113: aload_0
    //   114: invokespecial <init> : (ILjava/lang/Object;)V
    //   117: aload_0
    //   118: aload #4
    //   120: putfield F : Lbl;
    //   123: new android/content/Intent
    //   126: astore #4
    //   128: aload #4
    //   130: ldc_w 'com.google.android.apps.play.billingtestcompanion.BillingOverrideService.BIND'
    //   133: invokespecial <init> : (Ljava/lang/String;)V
    //   136: aload #4
    //   138: ldc_w 'com.google.android.apps.play.billingtestcompanion'
    //   141: invokevirtual setPackage : (Ljava/lang/String;)Landroid/content/Intent;
    //   144: pop
    //   145: aload_0
    //   146: getfield C : Landroid/content/Context;
    //   149: astore #5
    //   151: aload #5
    //   153: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   156: aload #4
    //   158: iconst_0
    //   159: invokevirtual queryIntentServices : (Landroid/content/Intent;I)Ljava/util/List;
    //   162: astore #6
    //   164: aload #6
    //   166: ifnull -> 318
    //   169: aload #6
    //   171: invokeinterface isEmpty : ()Z
    //   176: ifne -> 318
    //   179: aload #6
    //   181: iconst_0
    //   182: invokeinterface get : (I)Ljava/lang/Object;
    //   187: checkcast android/content/pm/ResolveInfo
    //   190: getfield serviceInfo : Landroid/content/pm/ServiceInfo;
    //   193: astore #6
    //   195: aload #6
    //   197: ifnull -> 321
    //   200: aload #6
    //   202: getfield packageName : Ljava/lang/String;
    //   205: astore #7
    //   207: aload #6
    //   209: getfield name : Ljava/lang/String;
    //   212: astore #8
    //   214: aload #7
    //   216: ldc_w 'com.google.android.apps.play.billingtestcompanion'
    //   219: invokestatic equals : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   222: ifeq -> 306
    //   225: aload #8
    //   227: ifnull -> 306
    //   230: new android/content/ComponentName
    //   233: astore #6
    //   235: aload #6
    //   237: aload #7
    //   239: aload #8
    //   241: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   244: new android/content/Intent
    //   247: astore #7
    //   249: aload #7
    //   251: aload #4
    //   253: invokespecial <init> : (Landroid/content/Intent;)V
    //   256: aload #7
    //   258: aload #6
    //   260: invokevirtual setComponent : (Landroid/content/ComponentName;)Landroid/content/Intent;
    //   263: pop
    //   264: aload #5
    //   266: aload #7
    //   268: aload_0
    //   269: getfield F : Lbl;
    //   272: iconst_1
    //   273: invokevirtual bindService : (Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   276: ifeq -> 292
    //   279: ldc 'BillingClientTesting'
    //   281: ldc_w 'Billing Override Service was bonded successfully.'
    //   284: invokestatic g : (Ljava/lang/String;Ljava/lang/String;)V
    //   287: aload_0
    //   288: monitorexit
    //   289: goto -> 351
    //   292: ldc 'BillingClientTesting'
    //   294: ldc_w 'Connection to Billing Override Service is blocked.'
    //   297: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   300: bipush #39
    //   302: istore_2
    //   303: goto -> 321
    //   306: getstatic com/google/android/gms/auth/api/signin/cwa/RqlokDsQOju.WRbnuINIPKAU : Ljava/lang/String;
    //   309: ldc_w 'The device doesn't have valid Play Billing Lab.'
    //   312: invokestatic h : (Ljava/lang/String;Ljava/lang/String;)V
    //   315: goto -> 300
    //   318: bipush #41
    //   320: istore_2
    //   321: aload_0
    //   322: iconst_0
    //   323: putfield D : I
    //   326: getstatic com/google/android/gms/common/util/DyJ/oXrNDUqUkE.LGiKnIcotZPPPH : Ljava/lang/String;
    //   329: ldc_w 'Billing Override Service unavailable on device.'
    //   332: invokestatic g : (Ljava/lang/String;Ljava/lang/String;)V
    //   335: aload_0
    //   336: iload_2
    //   337: bipush #26
    //   339: ldc_w 'Billing Override Service unavailable on device.'
    //   342: iconst_2
    //   343: invokestatic a : (Ljava/lang/String;I)Lqf;
    //   346: invokevirtual I : (IILqf;)V
    //   349: aload_0
    //   350: monitorexit
    //   351: aload_0
    //   352: aload_1
    //   353: invokevirtual t : (Llf;)V
    //   356: return
    //   357: aload_0
    //   358: monitorexit
    //   359: aload_1
    //   360: athrow
    // Exception table:
    //   from	to	target	type
    //   2	23	28	finally
    //   32	37	28	finally
    //   44	52	28	finally
    //   57	87	28	finally
    //   92	164	28	finally
    //   169	195	28	finally
    //   200	225	28	finally
    //   230	287	28	finally
    //   292	300	28	finally
    //   306	315	28	finally
    //   321	349	28	finally
    //   357	359	28	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wi2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */