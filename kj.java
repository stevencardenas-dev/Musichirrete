import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.jaudiotagger.tag.id3.tT.hrSTyFuSIm;

public final class kj {
  public static final rp0 k = new rp0("CastContext", null);
  
  public static final Object l = new Object();
  
  public static volatile kj m;
  
  public final Context a;
  
  public final ud2 b;
  
  public final bl1 c;
  
  public final vc2 d;
  
  public final mj e;
  
  public final pb2 f;
  
  public final hf2 g;
  
  public final wg2 h;
  
  public final vh2 i;
  
  public final xf2 j;
  
  public kj(Context paramContext, mj parammj, List paramList, eh2 parameh2, pb2 parampb2) {
    this.a = paramContext;
    this.e = parammj;
    this.f = parampb2;
    this.h = new wg2(paramContext);
    this.i = parameh2.i;
    boolean bool = TextUtils.isEmpty(parammj.b);
    IBinder iBinder = null;
    if (!bool) {
      this.j = new xf2(paramContext, parammj, parameh2);
    } else {
      this.j = null;
    } 
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    xf2 xf21 = this.j;
    if (xf21 != null)
      hashMap.put(xf21.b, xf21.c); 
    if (paramList != null)
      for (xf2 xf22 : paramList) {
        n21.n("Additional SessionProvider must not be null.", xf22);
        String str = xf22.b;
        n21.l(str, "Category for SessionProvider must not be null or empty string.");
        bool = hashMap.containsKey(str);
        StringBuilder stringBuilder = new StringBuilder("SessionProvider for category ");
        stringBuilder.append(str);
        stringBuilder.append(" already added");
        n21.g(stringBuilder.toString(), bool ^ true);
        hashMap.put(str, xf22.c);
      }  
    parammj.r = new yo2(1);
    try {
      ud2 ud21 = lf2.a(paramContext, parammj, parameh2, hashMap);
      this.b = ud21;
      try {
        IInterface iInterface = ud21;
        Parcel parcel = iInterface.u(iInterface.o(), 6);
        IBinder iBinder1 = parcel.readStrongBinder();
        if (iBinder1 == null) {
          iInterface = null;
        } else {
          iInterface = iBinder1.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
          if (iInterface instanceof le2) {
            iInterface = iInterface;
          } else {
            iInterface = new na2(iBinder1, "com.google.android.gms.cast.framework.IDiscoveryManager", 1);
          } 
        } 
        parcel.recycle();
        this.d = new vc2((le2)iInterface);
        try {
          na2 na2;
          iInterface = ud21;
          parcel = iInterface.u(iInterface.o(), 5);
          IBinder iBinder2 = parcel.readStrongBinder();
          if (iBinder2 == null) {
            iBinder2 = iBinder;
          } else {
            IInterface iInterface1 = iBinder2.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
            if (iInterface1 instanceof ff2) {
              na2 = (ff2)iInterface1;
            } else {
              na2 = new na2((IBinder)na2, "com.google.android.gms.cast.framework.ISessionManager", 1);
            } 
          } 
          parcel.recycle();
          bl1 bl11 = new bl1((ff2)na2, paramContext);
          this.c = bl11;
          n21.l("PrecacheManager", "The log tag cannot be null or empty.");
          vh2 vh21 = this.i;
          if (vh21 != null) {
            vh21.f = bl11;
            cl cl = vh21.c;
            n21.m(cl);
            cl.post(new qh2(vh21, 0));
          } 
          ExecutorService executorService = Executors.newFixedThreadPool(3);
          if (executorService instanceof uu2) {
            executorService = executorService;
          } else if (executorService instanceof ScheduledExecutorService) {
            executorService = new xu2((ScheduledExecutorService)executorService);
          } else {
            executorService = new uu2(executorService);
          } 
          dk2 dk2 = new dk2(paramContext, (uu2)executorService);
          n21.l("BaseNetUtils", "The log tag cannot be null or empty.");
          dk2.a();
          hf2 hf21 = new hf2();
          this.g = hf21;
          try {
            od2 od2 = (od2)ud21;
            Parcel parcel1 = od2.o();
            mh2.c(parcel1, hf21);
            od2.o0(parcel1, 3);
            tg2 tg2 = this.h.a;
            hf21.f.add(tg2);
            if (!Collections.unmodifiableList(parammj.n).isEmpty()) {
              rp0 rp01 = k;
              String str = "Setting Route Discovery for appIds: ".concat(String.valueOf(Collections.unmodifiableList(this.e.n)));
              Log.i(rp01.a, rp01.c(str, new Object[0]));
              null = this.h;
              List<?> list = Collections.unmodifiableList(this.e.n);
              null.getClass();
              rp0 rp02 = wg2.f;
              int i = list.size();
              StringBuilder stringBuilder = new StringBuilder(String.valueOf(i).length() + 26);
              stringBuilder.append("SetRouteDiscovery for ");
              stringBuilder.append(i);
              stringBuilder.append(" IDs");
              rp02.b(stringBuilder.toString(), new Object[0]);
              LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
              Iterator<?> iterator = list.iterator();
              while (iterator.hasNext())
                linkedHashSet.add(m92.Z((String)iterator.next())); 
              Map<Object, Object> map = null.c;
              rp02.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map.keySet())), new Object[0]);
              HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
              /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/Map}, name=null} */
              try {
                for (String str1 : linkedHashSet) {
                  qg2 qg2 = (qg2)map.get(m92.Z(str1));
                  if (qg2 != null)
                    hashMap1.put(str1, qg2); 
                } 
              } finally {}
              map.clear();
              map.putAll(hashMap1);
              /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/Map<[ObjectType{java/lang/Object}, ObjectType{java/lang/Object}]>}, name=null} */
              rp02.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map.keySet())), new Object[0]);
              synchronized (null.d) {
                null.clear();
                null.addAll(linkedHashSet);
                null.q();
              } 
            } 
            parampb2.d(new String[] { "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", hrSTyFuSIm.TZVQMJeAmN, "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS" }).c(new a42(20, this));
            ah ah = ah.b();
            ah.d = new en2(parampb2, new String[] { "com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES" }, 2);
            ah.e = new u70[] { g92.l };
            ah.c = false;
            ah.b = 8427;
            parampb2.c(0, ah.a()).c(new eg2(this));
            return;
          } catch (RemoteException remoteException) {
            throw new IllegalStateException("Failed to call addAppVisibilityListener", remoteException);
          } 
        } catch (RemoteException remoteException) {
          throw new IllegalStateException("Failed to call getSessionManagerImpl", remoteException);
        } 
      } catch (RemoteException remoteException) {
        throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", remoteException);
      } 
    } catch (RemoteException remoteException) {
      throw new IllegalStateException("Failed to call newCastContextImpl", remoteException);
    } 
  }
  
  public static kj b(Context paramContext) {
    // Byte code:
    //   0: invokestatic j : ()V
    //   3: getstatic kj.m : Lkj;
    //   6: ifnonnull -> 231
    //   9: getstatic kj.l : Ljava/lang/Object;
    //   12: astore_1
    //   13: aload_1
    //   14: monitorenter
    //   15: getstatic kj.m : Lkj;
    //   18: ifnonnull -> 222
    //   21: aload_0
    //   22: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   25: astore_2
    //   26: aload_2
    //   27: invokestatic a : (Landroid/content/Context;)Lbu;
    //   30: astore_3
    //   31: aload_2
    //   32: invokevirtual getPackageName : ()Ljava/lang/String;
    //   35: astore_0
    //   36: aload_3
    //   37: getfield b : Landroid/content/Context;
    //   40: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   43: aload_0
    //   44: sipush #128
    //   47: invokevirtual getApplicationInfo : (Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   50: astore_0
    //   51: aload_0
    //   52: ifnonnull -> 60
    //   55: aconst_null
    //   56: astore_0
    //   57: goto -> 77
    //   60: aload_0
    //   61: getfield metaData : Landroid/os/Bundle;
    //   64: astore_0
    //   65: aload_0
    //   66: ifnull -> 55
    //   69: aload_0
    //   70: ldc_w 'com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME'
    //   73: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   76: astore_0
    //   77: aload_0
    //   78: ifnull -> 195
    //   81: aload_0
    //   82: invokestatic forName : (Ljava/lang/String;)Ljava/lang/Class;
    //   85: ldc_w com/google/sample/cast/refplayer/CastOptionsProvider
    //   88: invokevirtual asSubclass : (Ljava/lang/Class;)Ljava/lang/Class;
    //   91: aconst_null
    //   92: invokevirtual getDeclaredConstructor : ([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   95: aconst_null
    //   96: invokevirtual newInstance : ([Ljava/lang/Object;)Ljava/lang/Object;
    //   99: checkcast com/google/sample/cast/refplayer/CastOptionsProvider
    //   102: astore #6
    //   104: aload #6
    //   106: aload_2
    //   107: invokevirtual getCastOptions : (Landroid/content/Context;)Lmj;
    //   110: astore_0
    //   111: new pb2
    //   114: astore_3
    //   115: aload_3
    //   116: aload_2
    //   117: getstatic pb2.l : Lg7;
    //   120: getstatic j5.a : Li5;
    //   123: getstatic ie0.c : Lie0;
    //   126: invokespecial <init> : (Landroid/content/Context;Lg7;Lj5;Lie0;)V
    //   129: new eh2
    //   132: astore #5
    //   134: aload #5
    //   136: aload_2
    //   137: aload_2
    //   138: invokestatic d : (Landroid/content/Context;)Liv0;
    //   141: aload_0
    //   142: aload_3
    //   143: invokespecial <init> : (Landroid/content/Context;Liv0;Lmj;Lpb2;)V
    //   146: new kj
    //   149: astore #4
    //   151: aload #4
    //   153: aload_2
    //   154: aload_0
    //   155: aload #6
    //   157: aload_2
    //   158: invokevirtual getAdditionalSessionProviders : (Landroid/content/Context;)Ljava/util/List;
    //   161: aload #5
    //   163: aload_3
    //   164: invokespecial <init> : (Landroid/content/Context;Lmj;Ljava/util/List;Leh2;Lpb2;)V
    //   167: aload #4
    //   169: putstatic kj.m : Lkj;
    //   172: goto -> 222
    //   175: astore_0
    //   176: goto -> 227
    //   179: astore_0
    //   180: new java/lang/RuntimeException
    //   183: astore_2
    //   184: aload_2
    //   185: aload_0
    //   186: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   189: aload_2
    //   190: athrow
    //   191: astore_2
    //   192: goto -> 208
    //   195: new java/lang/IllegalStateException
    //   198: astore_0
    //   199: aload_0
    //   200: ldc_w 'The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.'
    //   203: invokespecial <init> : (Ljava/lang/String;)V
    //   206: aload_0
    //   207: athrow
    //   208: new java/lang/IllegalStateException
    //   211: astore_0
    //   212: aload_0
    //   213: ldc_w 'Failed to initialize CastContext with manifest options.'
    //   216: aload_2
    //   217: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   220: aload_0
    //   221: athrow
    //   222: aload_1
    //   223: monitorexit
    //   224: goto -> 231
    //   227: aload_1
    //   228: monitorexit
    //   229: aload_0
    //   230: athrow
    //   231: getstatic kj.m : Lkj;
    //   234: areturn
    //   235: astore_0
    //   236: goto -> 55
    // Exception table:
    //   from	to	target	type
    //   15	26	175	finally
    //   26	51	235	android/content/pm/PackageManager$NameNotFoundException
    //   26	51	175	finally
    //   60	65	235	android/content/pm/PackageManager$NameNotFoundException
    //   60	65	175	finally
    //   69	77	235	android/content/pm/PackageManager$NameNotFoundException
    //   69	77	175	finally
    //   81	104	191	java/lang/ReflectiveOperationException
    //   81	104	175	finally
    //   104	146	175	finally
    //   146	172	179	wx0
    //   146	172	175	finally
    //   180	191	175	finally
    //   195	208	191	java/lang/ReflectiveOperationException
    //   195	208	175	finally
    //   208	222	175	finally
    //   222	224	175	finally
    //   227	229	175	finally
  }
  
  public final cv0 a() {
    n21.j();
    try {
      od2 od2 = (od2)this.b;
      Parcel parcel = od2.u(od2.o(), 1);
      Bundle bundle = (Bundle)mh2.a(parcel, Bundle.CREATOR);
      parcel.recycle();
      return cv0.b(bundle);
    } catch (RemoteException remoteException) {
      String str = ud2.class.getSimpleName();
      k.a((Exception)remoteException, "Unable to call %s on %s.", new Object[] { "getMergedSelectorAsBundle", str });
      return null;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */