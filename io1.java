import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;

public final class io1 {
  public static final AtomicReference e = new AtomicReference(null);
  
  public final pz0 a;
  
  public final gg2 b;
  
  public final HashSet c = new HashSet();
  
  public final a42 d;
  
  public io1(Context paramContext) {
    try {
      pz0 pz01 = new pz0();
      super();
      pz01.b = paramContext;
      pz01.a = (paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0)).versionCode;
      this.a = pz01;
      this.d = new a42(8, pz01);
      this.b = new gg2(paramContext);
      return;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      throw new RuntimeException("Failed to initialize FileStorage", nameNotFoundException);
    } 
  }
  
  public static void a(Activity paramActivity) {
    // Byte code:
    //   0: getstatic io1.e : Ljava/util/concurrent/atomic/AtomicReference;
    //   3: invokevirtual get : ()Ljava/lang/Object;
    //   6: checkcast io1
    //   9: astore_2
    //   10: aload_2
    //   11: ifnonnull -> 37
    //   14: aload_0
    //   15: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   18: ifnull -> 30
    //   21: aload_0
    //   22: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   25: iconst_0
    //   26: invokestatic d : (Landroid/content/Context;Z)Z
    //   29: pop
    //   30: aload_0
    //   31: iconst_0
    //   32: invokestatic d : (Landroid/content/Context;Z)Z
    //   35: pop
    //   36: return
    //   37: aload_2
    //   38: getfield d : La42;
    //   41: astore_3
    //   42: aload_2
    //   43: getfield c : Ljava/util/HashSet;
    //   46: astore_1
    //   47: aload_1
    //   48: monitorenter
    //   49: new java/util/HashSet
    //   52: astore #4
    //   54: aload #4
    //   56: aload_2
    //   57: getfield c : Ljava/util/HashSet;
    //   60: invokespecial <init> : (Ljava/util/Collection;)V
    //   63: aload_1
    //   64: monitorexit
    //   65: aload_3
    //   66: monitorenter
    //   67: invokestatic getThreadPolicy : ()Landroid/os/StrictMode$ThreadPolicy;
    //   70: astore_1
    //   71: invokestatic allowThreadDiskReads : ()Landroid/os/StrictMode$ThreadPolicy;
    //   74: pop
    //   75: invokestatic allowThreadDiskWrites : ()Landroid/os/StrictMode$ThreadPolicy;
    //   78: pop
    //   79: goto -> 102
    //   82: astore_0
    //   83: goto -> 250
    //   86: astore_2
    //   87: goto -> 93
    //   90: astore_2
    //   91: aconst_null
    //   92: astore_1
    //   93: ldc 'SplitCompat'
    //   95: ldc 'Unable to set up strict mode.'
    //   97: aload_2
    //   98: invokestatic i : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   101: pop
    //   102: new java/util/HashSet
    //   105: astore_2
    //   106: aload_2
    //   107: invokespecial <init> : ()V
    //   110: aload #4
    //   112: invokevirtual iterator : ()Ljava/util/Iterator;
    //   115: astore #5
    //   117: aload #5
    //   119: invokeinterface hasNext : ()Z
    //   124: ifeq -> 201
    //   127: aload #5
    //   129: invokeinterface next : ()Ljava/lang/Object;
    //   134: checkcast java/lang/String
    //   137: astore #6
    //   139: aload_3
    //   140: getfield c : Ljava/lang/Object;
    //   143: checkcast pz0
    //   146: astore #4
    //   148: new java/io/File
    //   151: astore #7
    //   153: aload #7
    //   155: aload #4
    //   157: invokevirtual k : ()Ljava/io/File;
    //   160: ldc 'verified-splits'
    //   162: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   165: aload #7
    //   167: invokestatic i : (Ljava/io/File;)V
    //   170: aload_2
    //   171: aload #7
    //   173: aload #6
    //   175: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   178: ldc '.apk'
    //   180: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   183: invokestatic h : (Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    //   186: invokevirtual add : (Ljava/lang/Object;)Z
    //   189: pop
    //   190: goto -> 117
    //   193: astore_0
    //   194: goto -> 237
    //   197: astore_0
    //   198: goto -> 220
    //   201: aload_3
    //   202: aload_0
    //   203: aload_2
    //   204: invokevirtual t : (Landroid/content/Context;Ljava/util/HashSet;)V
    //   207: aload_1
    //   208: ifnull -> 215
    //   211: aload_1
    //   212: invokestatic setThreadPolicy : (Landroid/os/StrictMode$ThreadPolicy;)V
    //   215: aload_3
    //   216: monitorexit
    //   217: goto -> 236
    //   220: ldc 'SplitCompat'
    //   222: ldc 'Error installing additional splits'
    //   224: aload_0
    //   225: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   228: pop
    //   229: aload_1
    //   230: ifnull -> 215
    //   233: goto -> 211
    //   236: return
    //   237: aload_1
    //   238: ifnonnull -> 244
    //   241: goto -> 248
    //   244: aload_1
    //   245: invokestatic setThreadPolicy : (Landroid/os/StrictMode$ThreadPolicy;)V
    //   248: aload_0
    //   249: athrow
    //   250: aload_3
    //   251: monitorexit
    //   252: aload_0
    //   253: athrow
    //   254: astore_0
    //   255: aload_1
    //   256: monitorexit
    //   257: aload_0
    //   258: athrow
    // Exception table:
    //   from	to	target	type
    //   49	65	254	finally
    //   67	71	90	java/lang/Exception
    //   67	71	82	finally
    //   71	79	86	java/lang/Exception
    //   71	79	82	finally
    //   93	102	82	finally
    //   102	117	197	java/lang/Exception
    //   102	117	193	finally
    //   117	190	197	java/lang/Exception
    //   117	190	193	finally
    //   201	207	197	java/lang/Exception
    //   201	207	193	finally
    //   211	215	82	finally
    //   220	229	193	finally
    //   244	248	82	finally
    //   248	250	82	finally
    //   250	252	82	finally
    //   255	257	254	finally
  }
  
  public static boolean d(Context paramContext, boolean paramBoolean) {
    boolean bool;
    AtomicReference<io1> atomicReference;
    io1 io11 = new io1(paramContext);
    while (true) {
      atomicReference = e;
      if (atomicReference.compareAndSet(null, io11)) {
        bool = true;
        break;
      } 
      if (atomicReference.get() != null && atomicReference.get() != null) {
        bool = false;
        break;
      } 
    } 
    io11 = atomicReference.get();
    if (bool) {
      qp2 qp2 = qp2.b;
      ae2 ae2 = new ae2(paramContext, ws2.w0(), new ge2(paramContext, io11.a), io11.a);
      qp2.c.set(ae2);
      up2 up2 = new up2(io11);
      AtomicReference<up2> atomicReference1 = ar2.a;
      do {
      
      } while (!atomicReference1.compareAndSet(null, up2) && (atomicReference1.get() == null || atomicReference1.get() == null));
      ws2.w0().execute(new yi1(24, paramContext));
    } 
    try {
      io11.c(paramContext, paramBoolean);
      return true;
    } catch (Exception exception) {
      Log.e("SplitCompat", "Error installing additional splits", exception);
      return false;
    } 
  }
  
  public final void b(HashSet paramHashSet) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual iterator : ()Ljava/util/Iterator;
    //   4: astore_1
    //   5: aload_1
    //   6: invokeinterface hasNext : ()Z
    //   11: ifeq -> 71
    //   14: aload_1
    //   15: invokeinterface next : ()Ljava/lang/Object;
    //   20: checkcast java/lang/String
    //   23: astore_2
    //   24: aload_0
    //   25: getfield a : Lpz0;
    //   28: astore_3
    //   29: aload_3
    //   30: invokevirtual getClass : ()Ljava/lang/Class;
    //   33: pop
    //   34: new java/io/File
    //   37: dup
    //   38: aload_3
    //   39: invokevirtual k : ()Ljava/io/File;
    //   42: ldc 'verified-splits'
    //   44: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   47: astore_3
    //   48: aload_3
    //   49: invokestatic i : (Ljava/io/File;)V
    //   52: aload_3
    //   53: aload_2
    //   54: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   57: ldc '.apk'
    //   59: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   62: invokestatic h : (Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    //   65: invokestatic g : (Ljava/io/File;)V
    //   68: goto -> 5
    //   71: aload_0
    //   72: getfield b : Lgg2;
    //   75: astore_1
    //   76: aload_1
    //   77: invokevirtual getClass : ()Ljava/lang/Class;
    //   80: pop
    //   81: ldc gg2
    //   83: monitorenter
    //   84: aload_1
    //   85: getfield a : Landroid/content/Context;
    //   88: ldc 'playcore_split_install_internal'
    //   90: iconst_0
    //   91: invokevirtual getSharedPreferences : (Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   94: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   99: astore_1
    //   100: new java/util/HashSet
    //   103: astore_2
    //   104: aload_2
    //   105: invokespecial <init> : ()V
    //   108: aload_1
    //   109: ldc_w 'modules_to_uninstall_if_emulated'
    //   112: aload_2
    //   113: invokeinterface putStringSet : (Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;
    //   118: invokeinterface apply : ()V
    //   123: ldc gg2
    //   125: monitorexit
    //   126: return
    //   127: astore_1
    //   128: ldc gg2
    //   130: monitorexit
    //   131: aload_1
    //   132: athrow
    // Exception table:
    //   from	to	target	type
    //   84	126	127	finally
    //   128	131	127	finally
  }
  
  public final void c(Context paramContext, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_2
    //   3: ifeq -> 20
    //   6: aload_0
    //   7: getfield a : Lpz0;
    //   10: invokevirtual f : ()V
    //   13: goto -> 42
    //   16: astore_1
    //   17: goto -> 1255
    //   20: invokestatic w0 : ()Ljava/util/concurrent/ThreadPoolExecutor;
    //   23: astore #4
    //   25: new yi1
    //   28: astore_3
    //   29: aload_3
    //   30: bipush #27
    //   32: aload_0
    //   33: invokespecial <init> : (ILjava/lang/Object;)V
    //   36: aload #4
    //   38: aload_3
    //   39: invokevirtual execute : (Ljava/lang/Runnable;)V
    //   42: aload_1
    //   43: invokevirtual getPackageName : ()Ljava/lang/String;
    //   46: astore #4
    //   48: aload_1
    //   49: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   52: aload #4
    //   54: iconst_0
    //   55: invokevirtual getPackageInfo : (Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   58: getfield splitNames : [Ljava/lang/String;
    //   61: astore_3
    //   62: aload_3
    //   63: ifnonnull -> 81
    //   66: new java/util/ArrayList
    //   69: astore_3
    //   70: aload_3
    //   71: invokespecial <init> : ()V
    //   74: goto -> 86
    //   77: astore_1
    //   78: goto -> 1211
    //   81: aload_3
    //   82: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   85: astore_3
    //   86: aload_0
    //   87: getfield a : Lpz0;
    //   90: invokevirtual e : ()Ljava/util/HashSet;
    //   93: astore #5
    //   95: aload_0
    //   96: getfield b : Lgg2;
    //   99: invokevirtual a : ()Ljava/util/Set;
    //   102: astore #9
    //   104: new java/util/HashSet
    //   107: astore #6
    //   109: aload #6
    //   111: invokespecial <init> : ()V
    //   114: aload #5
    //   116: invokevirtual iterator : ()Ljava/util/Iterator;
    //   119: astore #8
    //   121: aload #8
    //   123: invokeinterface hasNext : ()Z
    //   128: ifeq -> 224
    //   131: aload #8
    //   133: invokeinterface next : ()Ljava/lang/Object;
    //   138: checkcast qf2
    //   141: getfield b : Ljava/lang/String;
    //   144: astore #7
    //   146: aload_3
    //   147: aload #7
    //   149: invokeinterface contains : (Ljava/lang/Object;)Z
    //   154: ifne -> 206
    //   157: getstatic sr2.c : Lf1;
    //   160: astore #4
    //   162: aload #7
    //   164: ldc_w 'config.'
    //   167: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   170: ifeq -> 181
    //   173: ldc_w ''
    //   176: astore #4
    //   178: goto -> 194
    //   181: aload #7
    //   183: ldc_w '\.config\.'
    //   186: iconst_2
    //   187: invokevirtual split : (Ljava/lang/String;I)[Ljava/lang/String;
    //   190: iconst_0
    //   191: aaload
    //   192: astore #4
    //   194: aload #9
    //   196: aload #4
    //   198: invokeinterface contains : (Ljava/lang/Object;)Z
    //   203: ifeq -> 121
    //   206: aload #6
    //   208: aload #7
    //   210: invokevirtual add : (Ljava/lang/Object;)Z
    //   213: pop
    //   214: aload #8
    //   216: invokeinterface remove : ()V
    //   221: goto -> 121
    //   224: iload_2
    //   225: ifeq -> 237
    //   228: aload_0
    //   229: aload #6
    //   231: invokevirtual b : (Ljava/util/HashSet;)V
    //   234: goto -> 271
    //   237: aload #6
    //   239: invokevirtual isEmpty : ()Z
    //   242: ifne -> 271
    //   245: invokestatic w0 : ()Ljava/util/concurrent/ThreadPoolExecutor;
    //   248: astore #7
    //   250: new zn2
    //   253: astore #4
    //   255: aload #4
    //   257: iconst_2
    //   258: aload_0
    //   259: aload #6
    //   261: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   264: aload #7
    //   266: aload #4
    //   268: invokevirtual execute : (Ljava/lang/Runnable;)V
    //   271: new java/util/HashSet
    //   274: astore #4
    //   276: aload #4
    //   278: invokespecial <init> : ()V
    //   281: aload #5
    //   283: invokevirtual iterator : ()Ljava/util/Iterator;
    //   286: astore #6
    //   288: aload #6
    //   290: invokeinterface hasNext : ()Z
    //   295: ifeq -> 332
    //   298: aload #6
    //   300: invokeinterface next : ()Ljava/lang/Object;
    //   305: checkcast qf2
    //   308: getfield b : Ljava/lang/String;
    //   311: astore #7
    //   313: aload #7
    //   315: invokestatic d : (Ljava/lang/String;)Z
    //   318: ifne -> 288
    //   321: aload #4
    //   323: aload #7
    //   325: invokevirtual add : (Ljava/lang/Object;)Z
    //   328: pop
    //   329: goto -> 288
    //   332: aload_3
    //   333: invokeinterface iterator : ()Ljava/util/Iterator;
    //   338: astore_3
    //   339: aload_3
    //   340: invokeinterface hasNext : ()Z
    //   345: ifeq -> 378
    //   348: aload_3
    //   349: invokeinterface next : ()Ljava/lang/Object;
    //   354: checkcast java/lang/String
    //   357: astore #6
    //   359: aload #6
    //   361: invokestatic d : (Ljava/lang/String;)Z
    //   364: ifne -> 339
    //   367: aload #4
    //   369: aload #6
    //   371: invokevirtual add : (Ljava/lang/Object;)Z
    //   374: pop
    //   375: goto -> 339
    //   378: new java/util/HashSet
    //   381: astore #6
    //   383: aload #6
    //   385: aload #5
    //   387: invokevirtual size : ()I
    //   390: invokespecial <init> : (I)V
    //   393: aload #5
    //   395: invokevirtual iterator : ()Ljava/util/Iterator;
    //   398: astore #7
    //   400: aload #7
    //   402: invokeinterface hasNext : ()Z
    //   407: ifeq -> 498
    //   410: aload #7
    //   412: invokeinterface next : ()Ljava/lang/Object;
    //   417: checkcast qf2
    //   420: astore #5
    //   422: aload #5
    //   424: getfield b : Ljava/lang/String;
    //   427: astore #8
    //   429: getstatic sr2.c : Lf1;
    //   432: astore_3
    //   433: aload #8
    //   435: ldc_w 'config.'
    //   438: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   441: ifne -> 487
    //   444: aload #5
    //   446: getfield b : Ljava/lang/String;
    //   449: astore_3
    //   450: aload_3
    //   451: ldc_w 'config.'
    //   454: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   457: ifeq -> 467
    //   460: ldc_w ''
    //   463: astore_3
    //   464: goto -> 478
    //   467: aload_3
    //   468: ldc_w '\.config\.'
    //   471: iconst_2
    //   472: invokevirtual split : (Ljava/lang/String;I)[Ljava/lang/String;
    //   475: iconst_0
    //   476: aaload
    //   477: astore_3
    //   478: aload #4
    //   480: aload_3
    //   481: invokevirtual contains : (Ljava/lang/Object;)Z
    //   484: ifeq -> 400
    //   487: aload #6
    //   489: aload #5
    //   491: invokevirtual add : (Ljava/lang/Object;)Z
    //   494: pop
    //   495: goto -> 400
    //   498: new gp2
    //   501: astore #8
    //   503: aload #8
    //   505: aload_0
    //   506: getfield a : Lpz0;
    //   509: invokespecial <init> : (Lpz0;)V
    //   512: getstatic android/os/Build$VERSION.SDK_INT : I
    //   515: tableswitch default -> 544, 24 -> 602, 25 -> 589, 26 -> 577, 27 -> 547
    //   544: goto -> 565
    //   547: getstatic android/os/Build$VERSION.PREVIEW_SDK_INT : I
    //   550: ifne -> 565
    //   553: new eg2
    //   556: dup
    //   557: iconst_1
    //   558: invokespecial <init> : (I)V
    //   561: astore_3
    //   562: goto -> 613
    //   565: new eg2
    //   568: astore_3
    //   569: aload_3
    //   570: iconst_2
    //   571: invokespecial <init> : (I)V
    //   574: goto -> 562
    //   577: new bg2
    //   580: dup
    //   581: iconst_1
    //   582: invokespecial <init> : (I)V
    //   585: astore_3
    //   586: goto -> 562
    //   589: new zb0
    //   592: dup
    //   593: bipush #29
    //   595: invokespecial <init> : (I)V
    //   598: astore_3
    //   599: goto -> 562
    //   602: new java/lang/Object
    //   605: dup
    //   606: invokespecial <init> : ()V
    //   609: astore_3
    //   610: goto -> 562
    //   613: aload_1
    //   614: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
    //   617: astore #7
    //   619: aconst_null
    //   620: astore #5
    //   622: iload_2
    //   623: ifeq -> 642
    //   626: aload_3
    //   627: aload #7
    //   629: aload #8
    //   631: invokevirtual a : ()Ljava/util/HashSet;
    //   634: invokeinterface m : (Ljava/lang/ClassLoader;Ljava/util/HashSet;)V
    //   639: goto -> 761
    //   642: aload #6
    //   644: invokevirtual iterator : ()Ljava/util/Iterator;
    //   647: astore #9
    //   649: aload #9
    //   651: invokeinterface hasNext : ()Z
    //   656: ifeq -> 761
    //   659: aload #9
    //   661: invokeinterface next : ()Ljava/lang/Object;
    //   666: checkcast qf2
    //   669: astore #11
    //   671: new java/util/concurrent/atomic/AtomicBoolean
    //   674: astore #12
    //   676: aload #12
    //   678: iconst_1
    //   679: invokespecial <init> : (Z)V
    //   682: new java/util/HashSet
    //   685: astore #4
    //   687: aload #4
    //   689: invokespecial <init> : ()V
    //   692: new n2
    //   695: astore #10
    //   697: aload #10
    //   699: aload #8
    //   701: aload #11
    //   703: aload #4
    //   705: aload #12
    //   707: bipush #20
    //   709: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Cloneable;Ljava/lang/Object;I)V
    //   712: aload #11
    //   714: aload #10
    //   716: invokestatic b : (Lqf2;Lao2;)V
    //   719: aload #12
    //   721: invokevirtual get : ()Z
    //   724: ifeq -> 730
    //   727: goto -> 733
    //   730: aconst_null
    //   731: astore #4
    //   733: aload #4
    //   735: ifnonnull -> 748
    //   738: aload #9
    //   740: invokeinterface remove : ()V
    //   745: goto -> 649
    //   748: aload_3
    //   749: aload #7
    //   751: aload #4
    //   753: invokeinterface m : (Ljava/lang/ClassLoader;Ljava/util/HashSet;)V
    //   758: goto -> 649
    //   761: new java/util/HashSet
    //   764: astore #8
    //   766: aload #8
    //   768: invokespecial <init> : ()V
    //   771: aload #6
    //   773: invokevirtual iterator : ()Ljava/util/Iterator;
    //   776: astore #10
    //   778: aload #10
    //   780: invokeinterface hasNext : ()Z
    //   785: ifeq -> 1007
    //   788: aload #10
    //   790: invokeinterface next : ()Ljava/lang/Object;
    //   795: checkcast qf2
    //   798: astore #9
    //   800: new java/util/zip/ZipFile
    //   803: astore #4
    //   805: aload #4
    //   807: aload #9
    //   809: getfield a : Ljava/io/File;
    //   812: invokespecial <init> : (Ljava/io/File;)V
    //   815: aload #4
    //   817: ldc_w 'classes.dex'
    //   820: invokevirtual getEntry : (Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   823: astore #11
    //   825: aload #4
    //   827: invokevirtual close : ()V
    //   830: aload #11
    //   832: ifnull -> 936
    //   835: aload_0
    //   836: getfield a : Lpz0;
    //   839: astore #12
    //   841: aload #9
    //   843: getfield b : Ljava/lang/String;
    //   846: astore #4
    //   848: aload #12
    //   850: invokevirtual getClass : ()Ljava/lang/Class;
    //   853: pop
    //   854: new java/io/File
    //   857: astore #11
    //   859: aload #11
    //   861: aload #12
    //   863: invokevirtual k : ()Ljava/io/File;
    //   866: ldc_w 'dex'
    //   869: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   872: aload #11
    //   874: invokestatic i : (Ljava/io/File;)V
    //   877: aload #11
    //   879: aload #4
    //   881: invokestatic h : (Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
    //   884: astore #4
    //   886: aload #4
    //   888: invokestatic i : (Ljava/io/File;)V
    //   891: aload_3
    //   892: aload #7
    //   894: aload #4
    //   896: aload #9
    //   898: getfield a : Ljava/io/File;
    //   901: iload_2
    //   902: invokeinterface k : (Ljava/lang/ClassLoader;Ljava/io/File;Ljava/io/File;Z)Z
    //   907: ifeq -> 913
    //   910: goto -> 936
    //   913: ldc 'SplitCompat'
    //   915: ldc_w 'split was not installed '
    //   918: aload #9
    //   920: getfield a : Ljava/io/File;
    //   923: invokevirtual toString : ()Ljava/lang/String;
    //   926: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   929: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   932: pop
    //   933: goto -> 778
    //   936: aload #8
    //   938: aload #9
    //   940: getfield a : Ljava/io/File;
    //   943: invokevirtual add : (Ljava/lang/Object;)Z
    //   946: pop
    //   947: goto -> 778
    //   950: astore_1
    //   951: aload #4
    //   953: astore_3
    //   954: goto -> 961
    //   957: astore_1
    //   958: aload #5
    //   960: astore_3
    //   961: aload_3
    //   962: ifnull -> 1005
    //   965: aload_3
    //   966: invokevirtual close : ()V
    //   969: goto -> 1005
    //   972: astore_3
    //   973: ldc_w java/lang/Throwable
    //   976: ldc_w 'addSuppressed'
    //   979: iconst_1
    //   980: anewarray java/lang/Class
    //   983: dup
    //   984: iconst_0
    //   985: ldc_w java/lang/Throwable
    //   988: aastore
    //   989: invokevirtual getDeclaredMethod : (Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   992: aload_1
    //   993: iconst_1
    //   994: anewarray java/lang/Object
    //   997: dup
    //   998: iconst_0
    //   999: aload_3
    //   1000: aastore
    //   1001: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1004: pop
    //   1005: aload_1
    //   1006: athrow
    //   1007: aload_0
    //   1008: getfield d : La42;
    //   1011: aload_1
    //   1012: aload #8
    //   1014: invokevirtual t : (Landroid/content/Context;Ljava/util/HashSet;)V
    //   1017: new java/util/HashSet
    //   1020: astore_1
    //   1021: aload_1
    //   1022: invokespecial <init> : ()V
    //   1025: aload #6
    //   1027: invokevirtual iterator : ()Ljava/util/Iterator;
    //   1030: astore #4
    //   1032: aload #4
    //   1034: invokeinterface hasNext : ()Z
    //   1039: ifeq -> 1183
    //   1042: aload #4
    //   1044: invokeinterface next : ()Ljava/lang/Object;
    //   1049: checkcast qf2
    //   1052: astore #6
    //   1054: aload #8
    //   1056: aload #6
    //   1058: getfield a : Ljava/io/File;
    //   1061: invokevirtual contains : (Ljava/lang/Object;)Z
    //   1064: istore_2
    //   1065: aload #6
    //   1067: getfield b : Ljava/lang/String;
    //   1070: astore_3
    //   1071: iload_2
    //   1072: ifeq -> 1134
    //   1075: new java/lang/StringBuilder
    //   1078: astore #5
    //   1080: aload #5
    //   1082: invokespecial <init> : ()V
    //   1085: aload #5
    //   1087: ldc_w 'Split ''
    //   1090: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1093: pop
    //   1094: aload #5
    //   1096: aload_3
    //   1097: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1100: pop
    //   1101: aload #5
    //   1103: ldc_w '' installation emulated'
    //   1106: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1109: pop
    //   1110: ldc 'SplitCompat'
    //   1112: aload #5
    //   1114: invokevirtual toString : ()Ljava/lang/String;
    //   1117: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   1120: pop
    //   1121: aload_1
    //   1122: aload #6
    //   1124: getfield b : Ljava/lang/String;
    //   1127: invokevirtual add : (Ljava/lang/Object;)Z
    //   1130: pop
    //   1131: goto -> 1032
    //   1134: new java/lang/StringBuilder
    //   1137: astore #5
    //   1139: aload #5
    //   1141: invokespecial <init> : ()V
    //   1144: aload #5
    //   1146: ldc_w 'Split ''
    //   1149: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1152: pop
    //   1153: aload #5
    //   1155: aload_3
    //   1156: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1159: pop
    //   1160: aload #5
    //   1162: getstatic androidx/profileinstaller/Vuyf/nBRIsU.tdFztRct : Ljava/lang/String;
    //   1165: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1168: pop
    //   1169: ldc 'SplitCompat'
    //   1171: aload #5
    //   1173: invokevirtual toString : ()Ljava/lang/String;
    //   1176: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   1179: pop
    //   1180: goto -> 1032
    //   1183: aload_0
    //   1184: getfield c : Ljava/util/HashSet;
    //   1187: astore_3
    //   1188: aload_3
    //   1189: monitorenter
    //   1190: aload_0
    //   1191: getfield c : Ljava/util/HashSet;
    //   1194: aload_1
    //   1195: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   1200: pop
    //   1201: aload_3
    //   1202: monitorexit
    //   1203: aload_0
    //   1204: monitorexit
    //   1205: return
    //   1206: astore_1
    //   1207: aload_3
    //   1208: monitorexit
    //   1209: aload_1
    //   1210: athrow
    //   1211: new java/io/IOException
    //   1214: astore #5
    //   1216: new java/lang/StringBuilder
    //   1219: astore_3
    //   1220: aload_3
    //   1221: ldc_w 'Cannot load data for application ''
    //   1224: invokespecial <init> : (Ljava/lang/String;)V
    //   1227: aload_3
    //   1228: aload #4
    //   1230: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1233: pop
    //   1234: aload_3
    //   1235: ldc_w '''
    //   1238: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1241: pop
    //   1242: aload #5
    //   1244: aload_3
    //   1245: invokevirtual toString : ()Ljava/lang/String;
    //   1248: aload_1
    //   1249: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1252: aload #5
    //   1254: athrow
    //   1255: aload_0
    //   1256: monitorexit
    //   1257: aload_1
    //   1258: athrow
    //   1259: astore_3
    //   1260: goto -> 1005
    // Exception table:
    //   from	to	target	type
    //   6	13	16	finally
    //   20	42	16	finally
    //   42	48	16	finally
    //   48	62	77	android/content/pm/PackageManager$NameNotFoundException
    //   48	62	16	finally
    //   66	74	77	android/content/pm/PackageManager$NameNotFoundException
    //   66	74	16	finally
    //   81	86	77	android/content/pm/PackageManager$NameNotFoundException
    //   81	86	16	finally
    //   86	121	16	finally
    //   121	173	16	finally
    //   181	194	16	finally
    //   194	206	16	finally
    //   206	221	16	finally
    //   228	234	16	finally
    //   237	271	16	finally
    //   271	288	16	finally
    //   288	329	16	finally
    //   332	339	16	finally
    //   339	375	16	finally
    //   378	400	16	finally
    //   400	460	16	finally
    //   467	478	16	finally
    //   478	487	16	finally
    //   487	495	16	finally
    //   498	544	16	finally
    //   547	562	16	finally
    //   565	574	16	finally
    //   577	586	16	finally
    //   589	599	16	finally
    //   602	610	16	finally
    //   613	619	16	finally
    //   626	639	16	finally
    //   642	649	16	finally
    //   649	727	16	finally
    //   738	745	16	finally
    //   748	758	16	finally
    //   761	778	16	finally
    //   778	800	16	finally
    //   800	815	957	java/io/IOException
    //   800	815	16	finally
    //   815	830	950	java/io/IOException
    //   815	830	16	finally
    //   835	910	16	finally
    //   913	933	16	finally
    //   936	947	16	finally
    //   965	969	972	java/io/IOException
    //   965	969	16	finally
    //   973	1005	1259	java/lang/Exception
    //   973	1005	16	finally
    //   1005	1007	16	finally
    //   1007	1032	16	finally
    //   1032	1065	16	finally
    //   1075	1131	16	finally
    //   1134	1180	16	finally
    //   1183	1190	16	finally
    //   1190	1203	1206	finally
    //   1207	1209	1206	finally
    //   1209	1211	16	finally
    //   1211	1255	16	finally
    //   1255	1257	16	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\io1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */