import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class m70 implements ko1 {
  public final Handler a = new Handler(Looper.getMainLooper());
  
  public final Context b;
  
  public final sr2 c;
  
  public final hh2 d;
  
  public final bu e;
  
  public final a42 f;
  
  public final a42 g;
  
  public final ThreadPoolExecutor h;
  
  public final qp2 i;
  
  public final File j;
  
  public final AtomicReference k = new AtomicReference();
  
  public final Set l = Collections.synchronizedSet(new HashSet());
  
  public final Set m = Collections.synchronizedSet(new HashSet());
  
  public final AtomicBoolean n = new AtomicBoolean(false);
  
  public m70(Context paramContext, File paramFile, sr2 paramsr2, hh2 paramhh2) {
    this.b = paramContext;
    this.j = paramFile;
    this.c = paramsr2;
    this.d = paramhh2;
    this.h = threadPoolExecutor;
    this.e = bu1;
    this.g = new a42(23);
    this.f = new a42(23);
    this.i = qp2.b;
  }
  
  public final void a(ol0 paramol0) {
    synchronized (this.g) {
      ((HashSet)null.c).remove(paramol0);
      return;
    } 
  }
  
  public final du2 b(List paramList) {
    return g92.C(new jo1(-5));
  }
  
  public final du2 c(v90 paramv90) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield k : Ljava/util/concurrent/atomic/AtomicReference;
    //   6: invokevirtual get : ()Ljava/lang/Object;
    //   9: checkcast tb2
    //   12: astore #14
    //   14: new ap2
    //   17: astore #13
    //   19: aload #13
    //   21: aload #14
    //   23: aload_1
    //   24: invokespecial <init> : (Ltb2;Lv90;)V
    //   27: aload #13
    //   29: invokestatic c : (Ljava/util/concurrent/Callable;)Ljava/lang/Object;
    //   32: checkcast tb2
    //   35: astore #13
    //   37: aload_0
    //   38: getfield k : Ljava/util/concurrent/atomic/AtomicReference;
    //   41: astore #15
    //   43: aload #15
    //   45: aload #14
    //   47: aload #13
    //   49: invokevirtual compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   52: istore #12
    //   54: iload #12
    //   56: ifeq -> 64
    //   59: aload_0
    //   60: monitorexit
    //   61: goto -> 93
    //   64: aload #15
    //   66: invokevirtual get : ()Ljava/lang/Object;
    //   69: aload #14
    //   71: if_acmpeq -> 43
    //   74: aload #15
    //   76: invokevirtual get : ()Ljava/lang/Object;
    //   79: astore #16
    //   81: aload #16
    //   83: aload #14
    //   85: if_acmpeq -> 43
    //   88: aload_0
    //   89: monitorexit
    //   90: aconst_null
    //   91: astore #13
    //   93: aload #13
    //   95: ifnull -> 1112
    //   98: aload #13
    //   100: getfield a : I
    //   103: istore_3
    //   104: new java/util/ArrayList
    //   107: dup
    //   108: invokespecial <init> : ()V
    //   111: astore #16
    //   113: aload_1
    //   114: getfield c : Ljava/util/ArrayList;
    //   117: astore #13
    //   119: aload #13
    //   121: invokevirtual size : ()I
    //   124: istore #4
    //   126: iconst_0
    //   127: istore #5
    //   129: iconst_0
    //   130: istore_2
    //   131: iload_2
    //   132: iload #4
    //   134: if_icmpge -> 165
    //   137: aload #13
    //   139: iload_2
    //   140: invokevirtual get : (I)Ljava/lang/Object;
    //   143: astore #14
    //   145: iinc #2, 1
    //   148: aload #16
    //   150: aload #14
    //   152: checkcast java/util/Locale
    //   155: invokevirtual getLanguage : ()Ljava/lang/String;
    //   158: invokevirtual add : (Ljava/lang/Object;)Z
    //   161: pop
    //   162: goto -> 131
    //   165: new java/util/HashSet
    //   168: dup
    //   169: invokespecial <init> : ()V
    //   172: astore #18
    //   174: new java/util/ArrayList
    //   177: dup
    //   178: invokespecial <init> : ()V
    //   181: astore #17
    //   183: aload_0
    //   184: getfield j : Ljava/io/File;
    //   187: getstatic no2.a : Lno2;
    //   190: invokevirtual listFiles : (Ljava/io/FileFilter;)[Ljava/io/File;
    //   193: astore #13
    //   195: aload #13
    //   197: ifnull -> 1091
    //   200: iconst_0
    //   201: istore #4
    //   203: lconst_0
    //   204: lstore #10
    //   206: iload #5
    //   208: istore_2
    //   209: iload #4
    //   211: aload #13
    //   213: arraylength
    //   214: if_icmpge -> 843
    //   217: aload #13
    //   219: iload #4
    //   221: aaload
    //   222: astore #19
    //   224: aload #19
    //   226: invokestatic h0 : (Ljava/io/File;)Ljava/lang/String;
    //   229: astore #20
    //   231: aload #20
    //   233: ldc '\.config\.'
    //   235: iconst_2
    //   236: invokevirtual split : (Ljava/lang/String;I)[Ljava/lang/String;
    //   239: iload_2
    //   240: aaload
    //   241: astore #14
    //   243: aload #18
    //   245: aload #20
    //   247: invokevirtual add : (Ljava/lang/Object;)Z
    //   250: pop
    //   251: aload_1
    //   252: getfield b : Ljava/util/ArrayList;
    //   255: aload #14
    //   257: invokevirtual contains : (Ljava/lang/Object;)Z
    //   260: ifeq -> 673
    //   263: aload #20
    //   265: ldc '\.config\.'
    //   267: iconst_2
    //   268: invokevirtual split : (Ljava/lang/String;I)[Ljava/lang/String;
    //   271: iload_2
    //   272: aaload
    //   273: astore #15
    //   275: aload_0
    //   276: getfield e : Lbu;
    //   279: getfield b : Landroid/content/Context;
    //   282: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   285: invokevirtual getConfiguration : ()Landroid/content/res/Configuration;
    //   288: invokevirtual getLocales : ()Landroid/os/LocaleList;
    //   291: astore #22
    //   293: new java/util/ArrayList
    //   296: dup
    //   297: aload #22
    //   299: invokevirtual size : ()I
    //   302: invokespecial <init> : (I)V
    //   305: astore #23
    //   307: iload_2
    //   308: istore #5
    //   310: iload #5
    //   312: aload #22
    //   314: invokevirtual size : ()I
    //   317: if_icmpge -> 391
    //   320: aload #22
    //   322: iload #5
    //   324: invokevirtual get : (I)Ljava/util/Locale;
    //   327: astore #14
    //   329: aload #14
    //   331: invokevirtual getLanguage : ()Ljava/lang/String;
    //   334: astore #21
    //   336: aload #14
    //   338: invokevirtual getCountry : ()Ljava/lang/String;
    //   341: invokevirtual isEmpty : ()Z
    //   344: ifeq -> 354
    //   347: ldc ''
    //   349: astore #14
    //   351: goto -> 369
    //   354: ldc '_'
    //   356: aload #14
    //   358: invokevirtual getCountry : ()Ljava/lang/String;
    //   361: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   364: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   367: astore #14
    //   369: aload #23
    //   371: aload #21
    //   373: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   376: aload #14
    //   378: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   381: invokevirtual add : (Ljava/lang/Object;)Z
    //   384: pop
    //   385: iinc #5, 1
    //   388: goto -> 310
    //   391: new java/util/HashSet
    //   394: dup
    //   395: aload #23
    //   397: invokespecial <init> : (Ljava/util/Collection;)V
    //   400: astore #23
    //   402: aload_0
    //   403: invokevirtual l : ()La42;
    //   406: iconst_1
    //   407: anewarray java/lang/String
    //   410: dup
    //   411: iconst_0
    //   412: aload #15
    //   414: aastore
    //   415: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   418: invokevirtual s : (Ljava/util/Collection;)Ljava/util/HashMap;
    //   421: astore #14
    //   423: new java/util/HashSet
    //   426: dup
    //   427: invokespecial <init> : ()V
    //   430: astore #21
    //   432: aload #14
    //   434: invokevirtual values : ()Ljava/util/Collection;
    //   437: invokeinterface iterator : ()Ljava/util/Iterator;
    //   442: astore #15
    //   444: aload #15
    //   446: invokeinterface hasNext : ()Z
    //   451: ifeq -> 475
    //   454: aload #21
    //   456: aload #15
    //   458: invokeinterface next : ()Ljava/lang/Object;
    //   463: checkcast java/util/Set
    //   466: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   471: pop
    //   472: goto -> 444
    //   475: new java/util/HashSet
    //   478: dup
    //   479: invokespecial <init> : ()V
    //   482: astore #22
    //   484: aload #23
    //   486: invokevirtual iterator : ()Ljava/util/Iterator;
    //   489: astore #23
    //   491: aload #23
    //   493: invokeinterface hasNext : ()Z
    //   498: ifeq -> 549
    //   501: aload #23
    //   503: invokeinterface next : ()Ljava/lang/Object;
    //   508: checkcast java/lang/String
    //   511: astore #15
    //   513: aload #15
    //   515: ldc '_'
    //   517: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   520: ifeq -> 538
    //   523: aload #15
    //   525: ldc '_'
    //   527: iconst_m1
    //   528: invokevirtual split : (Ljava/lang/String;I)[Ljava/lang/String;
    //   531: iload_2
    //   532: aaload
    //   533: astore #15
    //   535: goto -> 538
    //   538: aload #22
    //   540: aload #15
    //   542: invokevirtual add : (Ljava/lang/Object;)Z
    //   545: pop
    //   546: goto -> 491
    //   549: aload #22
    //   551: aload_0
    //   552: getfield m : Ljava/util/Set;
    //   555: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   560: pop
    //   561: aload #22
    //   563: aload #16
    //   565: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   570: pop
    //   571: new java/util/HashSet
    //   574: dup
    //   575: invokespecial <init> : ()V
    //   578: astore #15
    //   580: aload #14
    //   582: invokevirtual entrySet : ()Ljava/util/Set;
    //   585: invokeinterface iterator : ()Ljava/util/Iterator;
    //   590: astore #23
    //   592: aload #23
    //   594: invokeinterface hasNext : ()Z
    //   599: ifeq -> 650
    //   602: aload #23
    //   604: invokeinterface next : ()Ljava/lang/Object;
    //   609: checkcast java/util/Map$Entry
    //   612: astore #14
    //   614: aload #22
    //   616: aload #14
    //   618: invokeinterface getKey : ()Ljava/lang/Object;
    //   623: invokevirtual contains : (Ljava/lang/Object;)Z
    //   626: ifeq -> 592
    //   629: aload #15
    //   631: aload #14
    //   633: invokeinterface getValue : ()Ljava/lang/Object;
    //   638: checkcast java/util/Collection
    //   641: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   646: pop
    //   647: goto -> 592
    //   650: aload #21
    //   652: aload #20
    //   654: invokevirtual contains : (Ljava/lang/Object;)Z
    //   657: ifeq -> 815
    //   660: aload #15
    //   662: aload #20
    //   664: invokevirtual contains : (Ljava/lang/Object;)Z
    //   667: ifeq -> 673
    //   670: goto -> 815
    //   673: aload_1
    //   674: getfield c : Ljava/util/ArrayList;
    //   677: astore #14
    //   679: new java/util/ArrayList
    //   682: dup
    //   683: aload_0
    //   684: getfield l : Ljava/util/Set;
    //   687: invokespecial <init> : (Ljava/util/Collection;)V
    //   690: astore #15
    //   692: aload #15
    //   694: iconst_2
    //   695: anewarray java/lang/String
    //   698: dup
    //   699: iconst_0
    //   700: getstatic org/jaudiotagger/audio/real/Nq/JkpGFvCVQHzgc.qxxppbXfvX : Ljava/lang/String;
    //   703: aastore
    //   704: dup
    //   705: iconst_1
    //   706: ldc_w 'base'
    //   709: aastore
    //   710: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   713: invokevirtual addAll : (Ljava/util/Collection;)Z
    //   716: pop
    //   717: aload_0
    //   718: invokevirtual l : ()La42;
    //   721: aload #15
    //   723: invokevirtual s : (Ljava/util/Collection;)Ljava/util/HashMap;
    //   726: astore #15
    //   728: aload #14
    //   730: invokevirtual size : ()I
    //   733: istore #7
    //   735: iload_2
    //   736: istore #5
    //   738: lload #10
    //   740: lstore #8
    //   742: iload #5
    //   744: iload #7
    //   746: if_icmpge -> 833
    //   749: aload #14
    //   751: iload #5
    //   753: invokevirtual get : (I)Ljava/lang/Object;
    //   756: astore #21
    //   758: iload #5
    //   760: iconst_1
    //   761: iadd
    //   762: istore #6
    //   764: aload #21
    //   766: checkcast java/util/Locale
    //   769: astore #21
    //   771: iload #6
    //   773: istore #5
    //   775: aload #15
    //   777: aload #21
    //   779: invokevirtual getLanguage : ()Ljava/lang/String;
    //   782: invokevirtual containsKey : (Ljava/lang/Object;)Z
    //   785: ifeq -> 738
    //   788: iload #6
    //   790: istore #5
    //   792: aload #15
    //   794: aload #21
    //   796: invokevirtual getLanguage : ()Ljava/lang/String;
    //   799: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   802: checkcast java/util/Set
    //   805: aload #20
    //   807: invokeinterface contains : (Ljava/lang/Object;)Z
    //   812: ifeq -> 738
    //   815: lload #10
    //   817: aload #19
    //   819: invokevirtual length : ()J
    //   822: ladd
    //   823: lstore #8
    //   825: aload #17
    //   827: aload #19
    //   829: invokevirtual add : (Ljava/lang/Object;)Z
    //   832: pop
    //   833: iinc #4, 1
    //   836: lload #8
    //   838: lstore #10
    //   840: goto -> 209
    //   843: aload #18
    //   845: invokevirtual toString : ()Ljava/lang/String;
    //   848: astore #15
    //   850: aload_1
    //   851: getfield b : Ljava/util/ArrayList;
    //   854: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   857: astore #13
    //   859: new java/lang/StringBuilder
    //   862: dup
    //   863: ldc_w 'availableSplits '
    //   866: invokespecial <init> : (Ljava/lang/String;)V
    //   869: astore #14
    //   871: aload #14
    //   873: aload #15
    //   875: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   878: pop
    //   879: aload #14
    //   881: ldc_w ' want '
    //   884: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   887: pop
    //   888: aload #14
    //   890: aload #13
    //   892: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   895: pop
    //   896: ldc_w 'FakeSplitInstallManager'
    //   899: aload #14
    //   901: invokevirtual toString : ()Ljava/lang/String;
    //   904: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   907: pop
    //   908: aload_1
    //   909: getfield b : Ljava/util/ArrayList;
    //   912: invokevirtual size : ()I
    //   915: iconst_1
    //   916: if_icmpne -> 959
    //   919: aload_0
    //   920: getfield d : Lhh2;
    //   923: invokevirtual a : ()Ljava/lang/Object;
    //   926: checkcast jh2
    //   929: getfield b : Ljava/util/Map;
    //   932: aload_1
    //   933: getfield b : Ljava/util/ArrayList;
    //   936: iload_2
    //   937: invokevirtual get : (I)Ljava/lang/Object;
    //   940: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   945: checkcast java/lang/Integer
    //   948: astore #14
    //   950: aload #14
    //   952: astore #13
    //   954: aload #14
    //   956: ifnonnull -> 974
    //   959: aload_0
    //   960: getfield d : Lhh2;
    //   963: invokevirtual a : ()Ljava/lang/Object;
    //   966: checkcast jh2
    //   969: getfield a : Ljava/lang/Integer;
    //   972: astore #13
    //   974: aload #13
    //   976: ifnull -> 989
    //   979: aload_0
    //   980: aload #13
    //   982: invokevirtual intValue : ()I
    //   985: invokevirtual k : (I)Ldu2;
    //   988: areturn
    //   989: aload #18
    //   991: new java/util/HashSet
    //   994: dup
    //   995: aload_1
    //   996: getfield b : Ljava/util/ArrayList;
    //   999: invokespecial <init> : (Ljava/util/Collection;)V
    //   1002: invokeinterface containsAll : (Ljava/util/Collection;)Z
    //   1007: ifne -> 1017
    //   1010: aload_0
    //   1011: bipush #-2
    //   1013: invokevirtual k : (I)Ldu2;
    //   1016: areturn
    //   1017: aload_1
    //   1018: getfield b : Ljava/util/ArrayList;
    //   1021: astore #13
    //   1023: iload_3
    //   1024: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1027: astore_1
    //   1028: aload_0
    //   1029: iconst_1
    //   1030: iconst_0
    //   1031: lconst_0
    //   1032: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1035: lload #10
    //   1037: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1040: aload #13
    //   1042: aload_1
    //   1043: aload #16
    //   1045: invokevirtual n : (IILjava/lang/Long;Ljava/lang/Long;Ljava/util/ArrayList;Ljava/lang/Integer;Ljava/util/ArrayList;)Z
    //   1048: pop
    //   1049: aload_0
    //   1050: getfield h : Ljava/util/concurrent/ThreadPoolExecutor;
    //   1053: new lf0
    //   1056: dup
    //   1057: aload_0
    //   1058: aload #17
    //   1060: aload #16
    //   1062: bipush #7
    //   1064: iconst_0
    //   1065: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IZ)V
    //   1068: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   1073: new du2
    //   1076: dup
    //   1077: invokespecial <init> : ()V
    //   1080: astore #13
    //   1082: aload #13
    //   1084: aload_1
    //   1085: invokevirtual g : (Ljava/lang/Object;)V
    //   1088: aload #13
    //   1090: areturn
    //   1091: getstatic com/google/android/gms/common/internal/Qg/nFLlOYeP.ZDBxszXsAyvFD : Ljava/lang/String;
    //   1094: ldc_w 'Specified splits directory does not exist.'
    //   1097: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   1100: pop
    //   1101: aload_0
    //   1102: bipush #-5
    //   1104: invokevirtual k : (I)Ldu2;
    //   1107: areturn
    //   1108: astore_1
    //   1109: goto -> 1126
    //   1112: aload_0
    //   1113: bipush #-100
    //   1115: invokevirtual k : (I)Ldu2;
    //   1118: astore_1
    //   1119: aload_1
    //   1120: areturn
    //   1121: astore_1
    //   1122: aload_0
    //   1123: monitorexit
    //   1124: aload_1
    //   1125: athrow
    //   1126: aload_0
    //   1127: aload_1
    //   1128: invokevirtual b : ()Ljava/lang/Exception;
    //   1131: checkcast jo1
    //   1134: getfield b : Lcom/google/android/gms/common/api/Status;
    //   1137: getfield b : I
    //   1140: invokevirtual k : (I)Ldu2;
    //   1143: areturn
    // Exception table:
    //   from	to	target	type
    //   0	2	1108	gh2
    //   2	43	1121	finally
    //   43	54	1121	finally
    //   59	61	1108	gh2
    //   64	81	1121	finally
    //   88	90	1108	gh2
    //   98	104	1108	gh2
    //   1112	1119	1108	gh2
    //   1122	1124	1121	finally
    //   1124	1126	1108	gh2
  }
  
  public final du2 d(List paramList) {
    return g92.C(new jo1(-5));
  }
  
  public final Set e() {
    HashSet hashSet = new HashSet();
    hashSet.addAll(this.c.b());
    hashSet.addAll(this.l);
    return hashSet;
  }
  
  public final du2 f(int paramInt) {
    /* monitor enter ThisExpression{ObjectType{m70}} */
    try {
      try {
        tb2 tb22 = this.k.get();
        kp2 kp2 = new kp2();
        this(tb22, paramInt);
        tb2 tb21 = (tb2)gh2.c(kp2);
        AtomicReference<tb2> atomicReference = this.k;
        while (true) {
          boolean bool = atomicReference.compareAndSet(tb22, tb21);
          if (bool) {
            /* monitor exit ThisExpression{ObjectType{m70}} */
            break;
          } 
          if (atomicReference.get() != tb22) {
            tb2 tb2 = (tb2)atomicReference.get();
            if (tb2 != tb22) {
              /* monitor exit ThisExpression{ObjectType{m70}} */
              tb21 = null;
              break;
            } 
          } 
        } 
        if (tb21 != null) {
          Handler handler = this.a;
          vi2 vi2 = new vi2();
          this(28, this, tb21);
          handler.post(vi2);
        } 
        du2 du2 = new du2();
        this();
        du2.g(null);
        return du2;
      } finally {}
    } catch (gh2 exception) {}
    /* monitor exit ThisExpression{ObjectType{m70}} */
    throw exception;
  }
  
  public final boolean g(tb2 paramtb2, Activity paramActivity) {
    return false;
  }
  
  public final void h(ol0 paramol0) {
    synchronized (this.g) {
      ((HashSet<ol0>)null.c).add(paramol0);
      return;
    } 
  }
  
  public final Set i() {
    HashSet hashSet = new HashSet();
    sr2 sr21 = this.c;
    if (sr21.c() != null)
      hashSet.addAll(sr21.c()); 
    hashSet.addAll(this.m);
    return hashSet;
  }
  
  public final du2 j(List paramList) {
    return g92.C(new jo1(-5));
  }
  
  public final du2 k(int paramInt) {
    m(new qp0(paramInt));
    return g92.C(new jo1(paramInt));
  }
  
  public final a42 l() {
    Context context = this.b;
    try {
      PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
      Bundle bundle = packageInfo.applicationInfo.metaData;
      a42 a421 = this.c.a(bundle);
      if (a421 != null)
        return a421; 
      tp.f("Language information could not be found. Make sure you are using the target application context, not the tests context, and the app is built as a bundle.");
      return null;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      throw new IllegalStateException("App is not found in PackageManager", nameNotFoundException);
    } 
  }
  
  public final tb2 m(xq2 paramxq2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield k : Ljava/util/concurrent/atomic/AtomicReference;
    //   6: invokevirtual get : ()Ljava/lang/Object;
    //   9: checkcast tb2
    //   12: astore_3
    //   13: aload_1
    //   14: aload_3
    //   15: invokeinterface a : (Ltb2;)Ltb2;
    //   20: astore #5
    //   22: aload_0
    //   23: getfield k : Ljava/util/concurrent/atomic/AtomicReference;
    //   26: astore #4
    //   28: aload #4
    //   30: aload_3
    //   31: aload #5
    //   33: invokevirtual compareAndSet : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   36: istore_2
    //   37: iload_2
    //   38: ifeq -> 46
    //   41: aload_0
    //   42: monitorexit
    //   43: aload #5
    //   45: areturn
    //   46: aload #4
    //   48: invokevirtual get : ()Ljava/lang/Object;
    //   51: aload_3
    //   52: if_acmpeq -> 28
    //   55: aload #4
    //   57: invokevirtual get : ()Ljava/lang/Object;
    //   60: astore_1
    //   61: aload_1
    //   62: aload_3
    //   63: if_acmpeq -> 28
    //   66: aload_0
    //   67: monitorexit
    //   68: aconst_null
    //   69: areturn
    //   70: astore_1
    //   71: aload_0
    //   72: monitorexit
    //   73: aload_1
    //   74: athrow
    // Exception table:
    //   from	to	target	type
    //   2	28	70	finally
    //   28	37	70	finally
    //   46	61	70	finally
    //   71	73	70	finally
  }
  
  public final boolean n(int paramInt1, int paramInt2, Long paramLong1, Long paramLong2, ArrayList paramArrayList1, Integer paramInteger, ArrayList paramArrayList2) {
    tb2 tb2 = m(new dl2(paramInteger, paramInt1, paramInt2, paramLong1, paramLong2, paramArrayList1, paramArrayList2));
    if (tb2 != null) {
      vi2 vi2 = new vi2(28, this, tb2);
      this.a.post(vi2);
      return true;
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m70.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */