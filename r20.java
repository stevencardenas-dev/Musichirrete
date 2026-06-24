import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import org.jaudiotagger.audio.dsf.qdA.GMDx;

public final class r20 {
  public static final eg2 b;
  
  public static Boolean c;
  
  public static String d;
  
  public static boolean e = false;
  
  public static int f = -1;
  
  public static Boolean g;
  
  public static final ThreadLocal h = new ThreadLocal();
  
  public static final rf i = new rf(4);
  
  public static final bg2 j = new bg2(4);
  
  public static rp2 k;
  
  public static cq2 l;
  
  public final Context a;
  
  static {
    b = new eg2(5);
  }
  
  public r20(Context paramContext) {
    this.a = paramContext;
  }
  
  public static r20 a(Context paramContext, eg2 parameg2) {
    // Byte code:
    //   0: getstatic r3/IKWi/AyxAR.YNEHTRIMiAgU : Ljava/lang/String;
    //   3: astore #11
    //   5: getstatic org/jaudiotagger/audio/dsf/qdA/GMDx.jPVvWZSLq : Ljava/lang/String;
    //   8: astore #12
    //   10: aload_0
    //   11: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   14: astore #18
    //   16: aload #18
    //   18: ifnull -> 1862
    //   21: getstatic r20.h : Ljava/lang/ThreadLocal;
    //   24: astore #10
    //   26: aload #10
    //   28: invokevirtual get : ()Ljava/lang/Object;
    //   31: checkcast ep2
    //   34: astore #14
    //   36: new java/lang/Object
    //   39: dup
    //   40: invokespecial <init> : ()V
    //   43: astore #15
    //   45: aload #10
    //   47: aload #15
    //   49: invokevirtual set : (Ljava/lang/Object;)V
    //   52: getstatic r20.i : Lrf;
    //   55: astore #13
    //   57: aload #13
    //   59: invokevirtual get : ()Ljava/lang/Object;
    //   62: checkcast java/lang/Long
    //   65: astore #16
    //   67: aload #16
    //   69: invokevirtual longValue : ()J
    //   72: lstore #8
    //   74: aload #13
    //   76: invokestatic uptimeMillis : ()J
    //   79: invokestatic valueOf : (J)Ljava/lang/Long;
    //   82: invokevirtual set : (Ljava/lang/Object;)V
    //   85: aload_1
    //   86: aload_0
    //   87: getstatic r20.j : Lbg2;
    //   90: invokevirtual a : (Landroid/content/Context;Lp20;)Lq20;
    //   93: astore #17
    //   95: aload #17
    //   97: getfield a : I
    //   100: istore_2
    //   101: aload #17
    //   103: getfield b : I
    //   106: istore #6
    //   108: ldc 'com.google.android.gms.cast.framework.dynamite'
    //   110: invokevirtual length : ()I
    //   113: istore #4
    //   115: iload_2
    //   116: invokestatic valueOf : (I)Ljava/lang/String;
    //   119: invokevirtual length : ()I
    //   122: istore_3
    //   123: ldc 'com.google.android.gms.cast.framework.dynamite'
    //   125: invokevirtual length : ()I
    //   128: istore #7
    //   130: iload #6
    //   132: invokestatic valueOf : (I)Ljava/lang/String;
    //   135: invokevirtual length : ()I
    //   138: istore #5
    //   140: new java/lang/StringBuilder
    //   143: astore #19
    //   145: aload #19
    //   147: iload #4
    //   149: bipush #26
    //   151: iadd
    //   152: iload_3
    //   153: iadd
    //   154: bipush #19
    //   156: iadd
    //   157: iload #7
    //   159: iadd
    //   160: iconst_1
    //   161: iadd
    //   162: iload #5
    //   164: iadd
    //   165: invokespecial <init> : (I)V
    //   168: aload #19
    //   170: ldc 'Considering local module com.google.android.gms.cast.framework.dynamite:'
    //   172: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: pop
    //   176: aload #19
    //   178: iload_2
    //   179: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   182: pop
    //   183: aload #19
    //   185: ldc ' and remote module com.google.android.gms.cast.framework.dynamite:'
    //   187: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   190: pop
    //   191: aload #19
    //   193: iload #6
    //   195: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   198: pop
    //   199: ldc 'DynamiteModule'
    //   201: aload #19
    //   203: invokevirtual toString : ()Ljava/lang/String;
    //   206: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   209: pop
    //   210: aload #17
    //   212: getfield c : I
    //   215: istore_3
    //   216: iload_3
    //   217: ifeq -> 1701
    //   220: iload_3
    //   221: istore_2
    //   222: iload_3
    //   223: iconst_m1
    //   224: if_icmpne -> 237
    //   227: aload #17
    //   229: getfield a : I
    //   232: ifeq -> 1701
    //   235: iconst_m1
    //   236: istore_2
    //   237: goto -> 244
    //   240: astore_0
    //   241: goto -> 1812
    //   244: iload_2
    //   245: iconst_1
    //   246: if_icmpne -> 257
    //   249: aload #17
    //   251: getfield b : I
    //   254: ifeq -> 1701
    //   257: iload_2
    //   258: iconst_m1
    //   259: if_icmpne -> 332
    //   262: ldc 'DynamiteModule'
    //   264: ldc 'Selected local version of '
    //   266: ldc 'com.google.android.gms.cast.framework.dynamite'
    //   268: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   271: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   274: pop
    //   275: new r20
    //   278: dup
    //   279: aload #18
    //   281: invokespecial <init> : (Landroid/content/Context;)V
    //   284: astore_0
    //   285: lload #8
    //   287: lconst_0
    //   288: lcmp
    //   289: ifne -> 300
    //   292: aload #13
    //   294: invokevirtual remove : ()V
    //   297: goto -> 307
    //   300: aload #13
    //   302: aload #16
    //   304: invokevirtual set : (Ljava/lang/Object;)V
    //   307: aload #15
    //   309: getfield a : Landroid/database/Cursor;
    //   312: astore_1
    //   313: aload_1
    //   314: ifnull -> 323
    //   317: aload_1
    //   318: invokeinterface close : ()V
    //   323: aload #10
    //   325: aload #14
    //   327: invokevirtual set : (Ljava/lang/Object;)V
    //   330: aload_0
    //   331: areturn
    //   332: iload_2
    //   333: iconst_1
    //   334: if_icmpne -> 1653
    //   337: aload #17
    //   339: getfield b : I
    //   342: istore_3
    //   343: ldc r20
    //   345: monitorenter
    //   346: aload_0
    //   347: invokestatic b : (Landroid/content/Context;)Z
    //   350: ifeq -> 1358
    //   353: getstatic r20.c : Ljava/lang/Boolean;
    //   356: astore #12
    //   358: ldc r20
    //   360: monitorexit
    //   361: aload #12
    //   363: ifnull -> 1307
    //   366: aload #12
    //   368: invokevirtual booleanValue : ()Z
    //   371: ifeq -> 722
    //   374: ldc 'com.google.android.gms.cast.framework.dynamite'
    //   376: invokevirtual length : ()I
    //   379: istore_2
    //   380: iload_3
    //   381: invokestatic valueOf : (I)Ljava/lang/String;
    //   384: invokevirtual length : ()I
    //   387: istore #4
    //   389: new java/lang/StringBuilder
    //   392: astore #11
    //   394: aload #11
    //   396: iload_2
    //   397: bipush #40
    //   399: iadd
    //   400: iload #4
    //   402: iadd
    //   403: invokespecial <init> : (I)V
    //   406: aload #11
    //   408: ldc 'Selected remote version of com.google.android.gms.cast.framework.dynamite, version >= '
    //   410: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   413: pop
    //   414: aload #11
    //   416: iload_3
    //   417: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   420: pop
    //   421: ldc 'DynamiteModule'
    //   423: aload #11
    //   425: invokevirtual toString : ()Ljava/lang/String;
    //   428: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   431: pop
    //   432: ldc r20
    //   434: monitorenter
    //   435: getstatic r20.l : Lcq2;
    //   438: astore #11
    //   440: ldc r20
    //   442: monitorexit
    //   443: aload #11
    //   445: ifnull -> 698
    //   448: aload #10
    //   450: invokevirtual get : ()Ljava/lang/Object;
    //   453: checkcast ep2
    //   456: astore #10
    //   458: aload #10
    //   460: ifnull -> 683
    //   463: aload #10
    //   465: getfield a : Landroid/database/Cursor;
    //   468: ifnull -> 683
    //   471: aload_0
    //   472: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   475: astore #12
    //   477: aload #10
    //   479: getfield a : Landroid/database/Cursor;
    //   482: astore #10
    //   484: new j31
    //   487: aconst_null
    //   488: invokespecial <init> : (Ljava/lang/Object;)V
    //   491: ldc r20
    //   493: monitorenter
    //   494: getstatic r20.f : I
    //   497: iconst_2
    //   498: if_icmplt -> 506
    //   501: iconst_1
    //   502: istore_2
    //   503: goto -> 508
    //   506: iconst_0
    //   507: istore_2
    //   508: ldc r20
    //   510: monitorexit
    //   511: iload_2
    //   512: ifeq -> 583
    //   515: ldc 'DynamiteModule'
    //   517: ldc 'Dynamite loader version >= 2, using loadModule2NoCrashUtils'
    //   519: invokestatic v : (Ljava/lang/String;Ljava/lang/String;)I
    //   522: pop
    //   523: new j31
    //   526: astore #13
    //   528: aload #13
    //   530: aload #12
    //   532: invokespecial <init> : (Ljava/lang/Object;)V
    //   535: new j31
    //   538: astore #12
    //   540: aload #12
    //   542: aload #10
    //   544: invokespecial <init> : (Ljava/lang/Object;)V
    //   547: aload #11
    //   549: aload #13
    //   551: iload_3
    //   552: aload #12
    //   554: invokevirtual t0 : (Lj31;ILj31;)Lsg0;
    //   557: astore #10
    //   559: goto -> 627
    //   562: astore #10
    //   564: aload_0
    //   565: astore #11
    //   567: goto -> 1408
    //   570: astore #11
    //   572: goto -> 1440
    //   575: astore #10
    //   577: aload_0
    //   578: astore #12
    //   580: goto -> 1443
    //   583: ldc 'DynamiteModule'
    //   585: ldc 'Dynamite loader version < 2, falling back to loadModule2'
    //   587: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   590: pop
    //   591: new j31
    //   594: astore #13
    //   596: aload #13
    //   598: aload #12
    //   600: invokespecial <init> : (Ljava/lang/Object;)V
    //   603: new j31
    //   606: astore #12
    //   608: aload #12
    //   610: aload #10
    //   612: invokespecial <init> : (Ljava/lang/Object;)V
    //   615: aload #11
    //   617: aload #13
    //   619: iload_3
    //   620: aload #12
    //   622: invokevirtual s0 : (Lj31;ILj31;)Lsg0;
    //   625: astore #10
    //   627: aload #10
    //   629: invokestatic q0 : (Lsg0;)Ljava/lang/Object;
    //   632: checkcast android/content/Context
    //   635: astore #11
    //   637: aload #11
    //   639: ifnull -> 660
    //   642: new r20
    //   645: astore #10
    //   647: aload #10
    //   649: aload #11
    //   651: invokespecial <init> : (Landroid/content/Context;)V
    //   654: aload #10
    //   656: astore_0
    //   657: goto -> 1588
    //   660: new o20
    //   663: astore #10
    //   665: aload #10
    //   667: ldc 'Failed to get module context'
    //   669: invokespecial <init> : (Ljava/lang/String;)V
    //   672: aload #10
    //   674: athrow
    //   675: astore #10
    //   677: ldc r20
    //   679: monitorexit
    //   680: aload #10
    //   682: athrow
    //   683: new o20
    //   686: astore #10
    //   688: aload #10
    //   690: ldc 'No result cursor'
    //   692: invokespecial <init> : (Ljava/lang/String;)V
    //   695: aload #10
    //   697: athrow
    //   698: new o20
    //   701: astore #10
    //   703: aload #10
    //   705: getstatic org/jaudiotagger/audio/dff/vR/CKYHNesT.SSIN : Ljava/lang/String;
    //   708: invokespecial <init> : (Ljava/lang/String;)V
    //   711: aload #10
    //   713: athrow
    //   714: astore #10
    //   716: ldc r20
    //   718: monitorexit
    //   719: aload #10
    //   721: athrow
    //   722: ldc 'com.google.android.gms.cast.framework.dynamite'
    //   724: invokevirtual length : ()I
    //   727: istore_2
    //   728: iload_3
    //   729: invokestatic valueOf : (I)Ljava/lang/String;
    //   732: invokevirtual length : ()I
    //   735: istore #4
    //   737: new java/lang/StringBuilder
    //   740: astore #12
    //   742: aload #12
    //   744: iload_2
    //   745: bipush #40
    //   747: iadd
    //   748: iload #4
    //   750: iadd
    //   751: invokespecial <init> : (I)V
    //   754: aload #12
    //   756: aload #11
    //   758: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   761: pop
    //   762: aload #12
    //   764: iload_3
    //   765: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   768: pop
    //   769: ldc 'DynamiteModule'
    //   771: aload #12
    //   773: invokevirtual toString : ()Ljava/lang/String;
    //   776: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   779: pop
    //   780: aload_0
    //   781: invokestatic e : (Landroid/content/Context;)Lrp2;
    //   784: astore #19
    //   786: aload #19
    //   788: ifnull -> 1264
    //   791: aload #19
    //   793: aload #19
    //   795: invokevirtual o : ()Landroid/os/Parcel;
    //   798: bipush #6
    //   800: invokevirtual m : (Landroid/os/Parcel;I)Landroid/os/Parcel;
    //   803: astore #11
    //   805: aload #11
    //   807: invokevirtual readInt : ()I
    //   810: istore_2
    //   811: aload #11
    //   813: invokevirtual recycle : ()V
    //   816: iload_2
    //   817: iconst_3
    //   818: if_icmplt -> 1006
    //   821: aload #10
    //   823: invokevirtual get : ()Ljava/lang/Object;
    //   826: checkcast ep2
    //   829: astore #21
    //   831: aload #21
    //   833: ifnull -> 963
    //   836: new j31
    //   839: astore #20
    //   841: aload_0
    //   842: astore #13
    //   844: aload #13
    //   846: astore #11
    //   848: aload #13
    //   850: astore #10
    //   852: aload #13
    //   854: astore #12
    //   856: aload #20
    //   858: aload #13
    //   860: invokespecial <init> : (Ljava/lang/Object;)V
    //   863: aload #13
    //   865: astore #11
    //   867: aload #13
    //   869: astore #10
    //   871: aload #13
    //   873: astore #12
    //   875: aload #21
    //   877: getfield a : Landroid/database/Cursor;
    //   880: astore #21
    //   882: aload #13
    //   884: astore #11
    //   886: aload #13
    //   888: astore #10
    //   890: aload #13
    //   892: astore #12
    //   894: new j31
    //   897: astore #22
    //   899: aload #13
    //   901: astore #11
    //   903: aload #13
    //   905: astore #10
    //   907: aload #13
    //   909: astore #12
    //   911: aload #22
    //   913: aload #21
    //   915: invokespecial <init> : (Ljava/lang/Object;)V
    //   918: aload #13
    //   920: astore #11
    //   922: aload #13
    //   924: astore #10
    //   926: aload #13
    //   928: astore #12
    //   930: aload #19
    //   932: aload #20
    //   934: iload_3
    //   935: aload #22
    //   937: invokevirtual v0 : (Lj31;ILj31;)Lsg0;
    //   940: astore #13
    //   942: goto -> 1175
    //   945: astore #10
    //   947: goto -> 1408
    //   950: astore #11
    //   952: aload #10
    //   954: astore_0
    //   955: goto -> 1440
    //   958: astore #10
    //   960: goto -> 1443
    //   963: aload_0
    //   964: astore #11
    //   966: aload_0
    //   967: astore #10
    //   969: aload_0
    //   970: astore #12
    //   972: new o20
    //   975: astore #13
    //   977: aload_0
    //   978: astore #11
    //   980: aload_0
    //   981: astore #10
    //   983: aload_0
    //   984: astore #12
    //   986: aload #13
    //   988: ldc_w 'No cached result cursor holder'
    //   991: invokespecial <init> : (Ljava/lang/String;)V
    //   994: aload_0
    //   995: astore #11
    //   997: aload_0
    //   998: astore #10
    //   1000: aload_0
    //   1001: astore #12
    //   1003: aload #13
    //   1005: athrow
    //   1006: aload_0
    //   1007: astore #13
    //   1009: iload_2
    //   1010: iconst_2
    //   1011: if_icmpne -> 1096
    //   1014: aload #13
    //   1016: astore #11
    //   1018: aload #13
    //   1020: astore #10
    //   1022: aload #13
    //   1024: astore #12
    //   1026: ldc 'DynamiteModule'
    //   1028: ldc_w 'IDynamite loader version = 2'
    //   1031: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   1034: pop
    //   1035: aload #13
    //   1037: astore #11
    //   1039: aload #13
    //   1041: astore #10
    //   1043: aload #13
    //   1045: astore #12
    //   1047: new j31
    //   1050: astore #20
    //   1052: aload #13
    //   1054: astore #11
    //   1056: aload #13
    //   1058: astore #10
    //   1060: aload #13
    //   1062: astore #12
    //   1064: aload #20
    //   1066: aload #13
    //   1068: invokespecial <init> : (Ljava/lang/Object;)V
    //   1071: aload #13
    //   1073: astore #11
    //   1075: aload #13
    //   1077: astore #10
    //   1079: aload #13
    //   1081: astore #12
    //   1083: aload #19
    //   1085: aload #20
    //   1087: iload_3
    //   1088: invokevirtual t0 : (Lj31;I)Lsg0;
    //   1091: astore #13
    //   1093: goto -> 1175
    //   1096: aload #13
    //   1098: astore #11
    //   1100: aload #13
    //   1102: astore #10
    //   1104: aload #13
    //   1106: astore #12
    //   1108: ldc 'DynamiteModule'
    //   1110: ldc_w 'Dynamite loader version < 2, falling back to createModuleContext'
    //   1113: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   1116: pop
    //   1117: aload #13
    //   1119: astore #11
    //   1121: aload #13
    //   1123: astore #10
    //   1125: aload #13
    //   1127: astore #12
    //   1129: new j31
    //   1132: astore #20
    //   1134: aload #13
    //   1136: astore #11
    //   1138: aload #13
    //   1140: astore #10
    //   1142: aload #13
    //   1144: astore #12
    //   1146: aload #20
    //   1148: aload #13
    //   1150: invokespecial <init> : (Ljava/lang/Object;)V
    //   1153: aload #13
    //   1155: astore #11
    //   1157: aload #13
    //   1159: astore #10
    //   1161: aload #13
    //   1163: astore #12
    //   1165: aload #19
    //   1167: aload #20
    //   1169: iload_3
    //   1170: invokevirtual s0 : (Lj31;I)Lsg0;
    //   1173: astore #13
    //   1175: aload_0
    //   1176: astore #11
    //   1178: aload_0
    //   1179: astore #10
    //   1181: aload_0
    //   1182: astore #12
    //   1184: aload #13
    //   1186: invokestatic q0 : (Lsg0;)Ljava/lang/Object;
    //   1189: astore #13
    //   1191: aload #13
    //   1193: ifnull -> 1221
    //   1196: aload_0
    //   1197: astore #11
    //   1199: aload_0
    //   1200: astore #10
    //   1202: aload_0
    //   1203: astore #12
    //   1205: new r20
    //   1208: dup
    //   1209: aload #13
    //   1211: checkcast android/content/Context
    //   1214: invokespecial <init> : (Landroid/content/Context;)V
    //   1217: astore_0
    //   1218: goto -> 1588
    //   1221: aload_0
    //   1222: astore #11
    //   1224: aload_0
    //   1225: astore #10
    //   1227: aload_0
    //   1228: astore #12
    //   1230: new o20
    //   1233: astore #13
    //   1235: aload_0
    //   1236: astore #11
    //   1238: aload_0
    //   1239: astore #10
    //   1241: aload_0
    //   1242: astore #12
    //   1244: aload #13
    //   1246: ldc_w 'Failed to load remote module.'
    //   1249: invokespecial <init> : (Ljava/lang/String;)V
    //   1252: aload_0
    //   1253: astore #11
    //   1255: aload_0
    //   1256: astore #10
    //   1258: aload_0
    //   1259: astore #12
    //   1261: aload #13
    //   1263: athrow
    //   1264: aload_0
    //   1265: astore #11
    //   1267: aload_0
    //   1268: astore #10
    //   1270: aload_0
    //   1271: astore #12
    //   1273: new o20
    //   1276: astore #13
    //   1278: aload_0
    //   1279: astore #11
    //   1281: aload_0
    //   1282: astore #10
    //   1284: aload_0
    //   1285: astore #12
    //   1287: aload #13
    //   1289: ldc_w 'Failed to create IDynamiteLoader.'
    //   1292: invokespecial <init> : (Ljava/lang/String;)V
    //   1295: aload_0
    //   1296: astore #11
    //   1298: aload_0
    //   1299: astore #10
    //   1301: aload_0
    //   1302: astore #12
    //   1304: aload #13
    //   1306: athrow
    //   1307: aload_0
    //   1308: astore #11
    //   1310: aload_0
    //   1311: astore #10
    //   1313: aload_0
    //   1314: astore #12
    //   1316: new o20
    //   1319: astore #13
    //   1321: aload_0
    //   1322: astore #11
    //   1324: aload_0
    //   1325: astore #10
    //   1327: aload_0
    //   1328: astore #12
    //   1330: aload #13
    //   1332: ldc_w 'Failed to determine which loading route to use.'
    //   1335: invokespecial <init> : (Ljava/lang/String;)V
    //   1338: aload_0
    //   1339: astore #11
    //   1341: aload_0
    //   1342: astore #10
    //   1344: aload_0
    //   1345: astore #12
    //   1347: aload #13
    //   1349: athrow
    //   1350: astore #13
    //   1352: aload_0
    //   1353: astore #12
    //   1355: goto -> 1391
    //   1358: aload_0
    //   1359: astore #10
    //   1361: aload #10
    //   1363: astore_0
    //   1364: new o20
    //   1367: astore #11
    //   1369: aload #10
    //   1371: astore_0
    //   1372: aload #11
    //   1374: ldc_w 'Remote loading disabled'
    //   1377: invokespecial <init> : (Ljava/lang/String;)V
    //   1380: aload #10
    //   1382: astore_0
    //   1383: aload #11
    //   1385: athrow
    //   1386: astore #13
    //   1388: aload_0
    //   1389: astore #12
    //   1391: aload #12
    //   1393: astore_0
    //   1394: ldc r20
    //   1396: monitorexit
    //   1397: aload #12
    //   1399: astore #11
    //   1401: aload #12
    //   1403: astore #10
    //   1405: aload #13
    //   1407: athrow
    //   1408: aload #11
    //   1410: astore_0
    //   1411: new o20
    //   1414: astore #12
    //   1416: aload #11
    //   1418: astore_0
    //   1419: aload #12
    //   1421: ldc_w 'Failed to load remote module.'
    //   1424: aload #10
    //   1426: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1429: aload #11
    //   1431: astore_0
    //   1432: aload #12
    //   1434: athrow
    //   1435: astore #10
    //   1437: goto -> 1472
    //   1440: aload #11
    //   1442: athrow
    //   1443: aload #12
    //   1445: astore_0
    //   1446: new o20
    //   1449: astore #11
    //   1451: aload #12
    //   1453: astore_0
    //   1454: aload #11
    //   1456: ldc_w 'Failed to load remote module.'
    //   1459: aload #10
    //   1461: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1464: aload #12
    //   1466: astore_0
    //   1467: aload #11
    //   1469: athrow
    //   1470: astore #10
    //   1472: aload #10
    //   1474: invokevirtual getMessage : ()Ljava/lang/String;
    //   1477: astore #11
    //   1479: aload #11
    //   1481: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1484: invokevirtual length : ()I
    //   1487: istore_2
    //   1488: new java/lang/StringBuilder
    //   1491: astore #12
    //   1493: aload #12
    //   1495: iload_2
    //   1496: bipush #30
    //   1498: iadd
    //   1499: invokespecial <init> : (I)V
    //   1502: aload #12
    //   1504: ldc_w 'Failed to load remote module: '
    //   1507: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1510: pop
    //   1511: aload #12
    //   1513: aload #11
    //   1515: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1518: pop
    //   1519: ldc 'DynamiteModule'
    //   1521: aload #12
    //   1523: invokevirtual toString : ()Ljava/lang/String;
    //   1526: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   1529: pop
    //   1530: aload #17
    //   1532: getfield a : I
    //   1535: istore_2
    //   1536: iload_2
    //   1537: ifeq -> 1638
    //   1540: new qp0
    //   1543: astore #11
    //   1545: aload #11
    //   1547: iload_2
    //   1548: invokespecial <init> : (I)V
    //   1551: aload_1
    //   1552: aload_0
    //   1553: aload #11
    //   1555: invokevirtual a : (Landroid/content/Context;Lp20;)Lq20;
    //   1558: getfield c : I
    //   1561: iconst_m1
    //   1562: if_icmpne -> 1638
    //   1565: ldc 'DynamiteModule'
    //   1567: ldc 'Selected local version of '
    //   1569: ldc 'com.google.android.gms.cast.framework.dynamite'
    //   1571: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   1574: invokestatic i : (Ljava/lang/String;Ljava/lang/String;)I
    //   1577: pop
    //   1578: new r20
    //   1581: dup
    //   1582: aload #18
    //   1584: invokespecial <init> : (Landroid/content/Context;)V
    //   1587: astore_0
    //   1588: lload #8
    //   1590: lconst_0
    //   1591: lcmp
    //   1592: ifne -> 1604
    //   1595: getstatic r20.i : Lrf;
    //   1598: invokevirtual remove : ()V
    //   1601: goto -> 1612
    //   1604: getstatic r20.i : Lrf;
    //   1607: aload #16
    //   1609: invokevirtual set : (Ljava/lang/Object;)V
    //   1612: aload #15
    //   1614: getfield a : Landroid/database/Cursor;
    //   1617: astore_1
    //   1618: aload_1
    //   1619: ifnull -> 1628
    //   1622: aload_1
    //   1623: invokeinterface close : ()V
    //   1628: getstatic r20.h : Ljava/lang/ThreadLocal;
    //   1631: aload #14
    //   1633: invokevirtual set : (Ljava/lang/Object;)V
    //   1636: aload_0
    //   1637: areturn
    //   1638: new o20
    //   1641: astore_0
    //   1642: aload_0
    //   1643: ldc_w 'Remote load failed. No local fallback found.'
    //   1646: aload #10
    //   1648: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   1651: aload_0
    //   1652: athrow
    //   1653: new o20
    //   1656: astore_1
    //   1657: iload_2
    //   1658: invokestatic valueOf : (I)Ljava/lang/String;
    //   1661: invokevirtual length : ()I
    //   1664: istore_3
    //   1665: new java/lang/StringBuilder
    //   1668: astore_0
    //   1669: aload_0
    //   1670: iload_3
    //   1671: bipush #36
    //   1673: iadd
    //   1674: invokespecial <init> : (I)V
    //   1677: aload_0
    //   1678: ldc_w 'VersionPolicy returned invalid code:'
    //   1681: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1684: pop
    //   1685: aload_0
    //   1686: iload_2
    //   1687: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1690: pop
    //   1691: aload_1
    //   1692: aload_0
    //   1693: invokevirtual toString : ()Ljava/lang/String;
    //   1696: invokespecial <init> : (Ljava/lang/String;)V
    //   1699: aload_1
    //   1700: athrow
    //   1701: new o20
    //   1704: astore_0
    //   1705: aload #17
    //   1707: getfield a : I
    //   1710: istore #6
    //   1712: aload #17
    //   1714: getfield b : I
    //   1717: istore_3
    //   1718: ldc 'com.google.android.gms.cast.framework.dynamite'
    //   1720: invokevirtual length : ()I
    //   1723: istore #4
    //   1725: iload #6
    //   1727: invokestatic valueOf : (I)Ljava/lang/String;
    //   1730: invokevirtual length : ()I
    //   1733: istore_2
    //   1734: iload_3
    //   1735: invokestatic valueOf : (I)Ljava/lang/String;
    //   1738: invokevirtual length : ()I
    //   1741: istore #5
    //   1743: new java/lang/StringBuilder
    //   1746: astore_1
    //   1747: aload_1
    //   1748: iload #4
    //   1750: bipush #46
    //   1752: iadd
    //   1753: iload_2
    //   1754: iadd
    //   1755: bipush #23
    //   1757: iadd
    //   1758: iload #5
    //   1760: iadd
    //   1761: iconst_1
    //   1762: iadd
    //   1763: invokespecial <init> : (I)V
    //   1766: aload_1
    //   1767: ldc_w 'No acceptable module com.google.android.gms.cast.framework.dynamite found. Local version is '
    //   1770: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1773: pop
    //   1774: aload_1
    //   1775: iload #6
    //   1777: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1780: pop
    //   1781: aload_1
    //   1782: aload #12
    //   1784: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1787: pop
    //   1788: aload_1
    //   1789: iload_3
    //   1790: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1793: pop
    //   1794: aload_1
    //   1795: ldc_w '.'
    //   1798: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1801: pop
    //   1802: aload_0
    //   1803: aload_1
    //   1804: invokevirtual toString : ()Ljava/lang/String;
    //   1807: invokespecial <init> : (Ljava/lang/String;)V
    //   1810: aload_0
    //   1811: athrow
    //   1812: lload #8
    //   1814: lconst_0
    //   1815: lcmp
    //   1816: ifne -> 1828
    //   1819: getstatic r20.i : Lrf;
    //   1822: invokevirtual remove : ()V
    //   1825: goto -> 1836
    //   1828: getstatic r20.i : Lrf;
    //   1831: aload #16
    //   1833: invokevirtual set : (Ljava/lang/Object;)V
    //   1836: aload #15
    //   1838: getfield a : Landroid/database/Cursor;
    //   1841: astore_1
    //   1842: aload_1
    //   1843: ifnull -> 1852
    //   1846: aload_1
    //   1847: invokeinterface close : ()V
    //   1852: getstatic r20.h : Ljava/lang/ThreadLocal;
    //   1855: aload #14
    //   1857: invokevirtual set : (Ljava/lang/Object;)V
    //   1860: aload_0
    //   1861: athrow
    //   1862: new java/lang/Exception
    //   1865: dup
    //   1866: ldc_w 'null application Context'
    //   1869: invokespecial <init> : (Ljava/lang/String;)V
    //   1872: athrow
    // Exception table:
    //   from	to	target	type
    //   74	216	240	finally
    //   227	235	240	finally
    //   249	257	240	finally
    //   262	285	240	finally
    //   337	343	1470	o20
    //   337	343	240	finally
    //   343	346	575	android/os/RemoteException
    //   343	346	570	o20
    //   343	346	562	finally
    //   346	361	1350	finally
    //   366	435	575	android/os/RemoteException
    //   366	435	570	o20
    //   366	435	562	finally
    //   435	443	714	finally
    //   448	458	575	android/os/RemoteException
    //   448	458	570	o20
    //   448	458	562	finally
    //   463	494	575	android/os/RemoteException
    //   463	494	570	o20
    //   463	494	562	finally
    //   494	501	675	finally
    //   508	511	675	finally
    //   515	559	575	android/os/RemoteException
    //   515	559	570	o20
    //   515	559	562	finally
    //   583	627	575	android/os/RemoteException
    //   583	627	570	o20
    //   583	627	562	finally
    //   627	637	575	android/os/RemoteException
    //   627	637	570	o20
    //   627	637	562	finally
    //   642	654	575	android/os/RemoteException
    //   642	654	570	o20
    //   642	654	562	finally
    //   660	675	575	android/os/RemoteException
    //   660	675	570	o20
    //   660	675	562	finally
    //   677	680	675	finally
    //   680	683	575	android/os/RemoteException
    //   680	683	570	o20
    //   680	683	562	finally
    //   683	698	575	android/os/RemoteException
    //   683	698	570	o20
    //   683	698	562	finally
    //   698	714	575	android/os/RemoteException
    //   698	714	570	o20
    //   698	714	562	finally
    //   716	719	714	finally
    //   719	722	575	android/os/RemoteException
    //   719	722	570	o20
    //   719	722	562	finally
    //   722	786	575	android/os/RemoteException
    //   722	786	570	o20
    //   722	786	562	finally
    //   791	816	575	android/os/RemoteException
    //   791	816	570	o20
    //   791	816	562	finally
    //   821	831	575	android/os/RemoteException
    //   821	831	570	o20
    //   821	831	562	finally
    //   836	841	575	android/os/RemoteException
    //   836	841	570	o20
    //   836	841	562	finally
    //   856	863	958	android/os/RemoteException
    //   856	863	950	o20
    //   856	863	945	finally
    //   875	882	958	android/os/RemoteException
    //   875	882	950	o20
    //   875	882	945	finally
    //   894	899	958	android/os/RemoteException
    //   894	899	950	o20
    //   894	899	945	finally
    //   911	918	958	android/os/RemoteException
    //   911	918	950	o20
    //   911	918	945	finally
    //   930	942	958	android/os/RemoteException
    //   930	942	950	o20
    //   930	942	945	finally
    //   972	977	958	android/os/RemoteException
    //   972	977	950	o20
    //   972	977	945	finally
    //   986	994	958	android/os/RemoteException
    //   986	994	950	o20
    //   986	994	945	finally
    //   1003	1006	958	android/os/RemoteException
    //   1003	1006	950	o20
    //   1003	1006	945	finally
    //   1026	1035	958	android/os/RemoteException
    //   1026	1035	950	o20
    //   1026	1035	945	finally
    //   1047	1052	958	android/os/RemoteException
    //   1047	1052	950	o20
    //   1047	1052	945	finally
    //   1064	1071	958	android/os/RemoteException
    //   1064	1071	950	o20
    //   1064	1071	945	finally
    //   1083	1093	958	android/os/RemoteException
    //   1083	1093	950	o20
    //   1083	1093	945	finally
    //   1108	1117	958	android/os/RemoteException
    //   1108	1117	950	o20
    //   1108	1117	945	finally
    //   1129	1134	958	android/os/RemoteException
    //   1129	1134	950	o20
    //   1129	1134	945	finally
    //   1146	1153	958	android/os/RemoteException
    //   1146	1153	950	o20
    //   1146	1153	945	finally
    //   1165	1175	958	android/os/RemoteException
    //   1165	1175	950	o20
    //   1165	1175	945	finally
    //   1184	1191	958	android/os/RemoteException
    //   1184	1191	950	o20
    //   1184	1191	945	finally
    //   1205	1218	958	android/os/RemoteException
    //   1205	1218	950	o20
    //   1205	1218	945	finally
    //   1230	1235	958	android/os/RemoteException
    //   1230	1235	950	o20
    //   1230	1235	945	finally
    //   1244	1252	958	android/os/RemoteException
    //   1244	1252	950	o20
    //   1244	1252	945	finally
    //   1261	1264	958	android/os/RemoteException
    //   1261	1264	950	o20
    //   1261	1264	945	finally
    //   1273	1278	958	android/os/RemoteException
    //   1273	1278	950	o20
    //   1273	1278	945	finally
    //   1287	1295	958	android/os/RemoteException
    //   1287	1295	950	o20
    //   1287	1295	945	finally
    //   1304	1307	958	android/os/RemoteException
    //   1304	1307	950	o20
    //   1304	1307	945	finally
    //   1316	1321	958	android/os/RemoteException
    //   1316	1321	950	o20
    //   1316	1321	945	finally
    //   1330	1338	958	android/os/RemoteException
    //   1330	1338	950	o20
    //   1330	1338	945	finally
    //   1347	1350	958	android/os/RemoteException
    //   1347	1350	950	o20
    //   1347	1350	945	finally
    //   1364	1369	1386	finally
    //   1372	1380	1386	finally
    //   1383	1386	1386	finally
    //   1394	1397	1386	finally
    //   1405	1408	958	android/os/RemoteException
    //   1405	1408	950	o20
    //   1405	1408	945	finally
    //   1411	1416	1435	o20
    //   1411	1416	240	finally
    //   1419	1429	1435	o20
    //   1419	1429	240	finally
    //   1432	1435	1435	o20
    //   1432	1435	240	finally
    //   1440	1443	1435	o20
    //   1440	1443	240	finally
    //   1446	1451	1435	o20
    //   1446	1451	240	finally
    //   1454	1464	1435	o20
    //   1454	1464	240	finally
    //   1467	1470	1435	o20
    //   1467	1470	240	finally
    //   1472	1536	240	finally
    //   1540	1588	240	finally
    //   1638	1653	240	finally
    //   1653	1701	240	finally
    //   1701	1812	240	finally
  }
  
  public static boolean b(Context paramContext) {
    Boolean bool = Boolean.TRUE;
    if (bool.equals(null) || bool.equals(g))
      return true; 
    bool = g;
    boolean bool1 = false;
    boolean bool2 = false;
    if (bool == null) {
      boolean bool3;
      PackageManager packageManager = paramContext.getPackageManager();
      if (Build.VERSION.SDK_INT >= 29) {
        bool3 = true;
      } else {
        bool3 = false;
      } 
      ProviderInfo providerInfo = packageManager.resolveContentProvider("com.google.android.gms.chimera", bool3);
      boolean bool4 = bool2;
      if (le0.b.b(paramContext, 10000000) == 0) {
        bool4 = bool2;
        if (providerInfo != null) {
          bool4 = bool2;
          if ("com.google.android.gms".equals(providerInfo.packageName))
            bool4 = true; 
        } 
      } 
      g = Boolean.valueOf(bool4);
      bool1 = bool4;
      if (bool4) {
        ApplicationInfo applicationInfo = providerInfo.applicationInfo;
        bool1 = bool4;
        if (applicationInfo != null) {
          bool1 = bool4;
          if ((applicationInfo.flags & 0x81) == 0) {
            Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
            e = true;
            bool1 = bool4;
          } 
        } 
      } 
    } 
    if (!bool1)
      Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled."); 
    return bool1;
  }
  
  public static int c(Context paramContext, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #16
    //   3: aconst_null
    //   4: astore #17
    //   6: aconst_null
    //   7: astore #15
    //   9: aload #16
    //   11: astore #12
    //   13: aload #17
    //   15: astore #13
    //   17: getstatic r20.i : Lrf;
    //   20: invokevirtual get : ()Ljava/lang/Object;
    //   23: checkcast java/lang/Long
    //   26: invokevirtual longValue : ()J
    //   29: lstore #10
    //   31: ldc_w 'api_force_staging'
    //   34: astore #14
    //   36: iconst_1
    //   37: istore #5
    //   39: iconst_1
    //   40: iload_1
    //   41: if_icmpeq -> 49
    //   44: ldc_w 'api'
    //   47: astore #14
    //   49: aload #16
    //   51: astore #12
    //   53: aload #17
    //   55: astore #13
    //   57: new android/net/Uri$Builder
    //   60: astore #18
    //   62: aload #16
    //   64: astore #12
    //   66: aload #17
    //   68: astore #13
    //   70: aload #18
    //   72: invokespecial <init> : ()V
    //   75: aload #16
    //   77: astore #12
    //   79: aload #17
    //   81: astore #13
    //   83: aload #18
    //   85: ldc_w 'content'
    //   88: invokevirtual scheme : (Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   91: ldc_w 'com.google.android.gms.chimera'
    //   94: invokevirtual authority : (Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   97: aload #14
    //   99: invokevirtual path : (Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   102: ldc 'com.google.android.gms.cast.framework.dynamite'
    //   104: invokevirtual appendPath : (Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   107: ldc_w 'requestStartUptime'
    //   110: lload #10
    //   112: invokestatic valueOf : (J)Ljava/lang/String;
    //   115: invokevirtual appendQueryParameter : (Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   118: invokevirtual build : ()Landroid/net/Uri;
    //   121: astore #18
    //   123: aload #16
    //   125: astore #12
    //   127: aload #17
    //   129: astore #13
    //   131: aload_0
    //   132: invokevirtual getContentResolver : ()Landroid/content/ContentResolver;
    //   135: aload #18
    //   137: invokevirtual acquireUnstableContentProviderClient : (Landroid/net/Uri;)Landroid/content/ContentProviderClient;
    //   140: astore #14
    //   142: iconst_0
    //   143: istore_1
    //   144: aload #14
    //   146: ifnonnull -> 154
    //   149: aconst_null
    //   150: astore_0
    //   151: goto -> 500
    //   154: aload #14
    //   156: aload #18
    //   158: aconst_null
    //   159: aconst_null
    //   160: aconst_null
    //   161: aconst_null
    //   162: invokevirtual query : (Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   165: astore #12
    //   167: aload #12
    //   169: ifnonnull -> 189
    //   172: aload #16
    //   174: astore #12
    //   176: aload #17
    //   178: astore #13
    //   180: aload #14
    //   182: invokevirtual release : ()Z
    //   185: pop
    //   186: goto -> 149
    //   189: aload #12
    //   191: invokeinterface getCount : ()I
    //   196: istore #7
    //   198: aload #12
    //   200: invokeinterface getColumnCount : ()I
    //   205: istore #6
    //   207: new android/database/MatrixCursor
    //   210: astore_0
    //   211: aload_0
    //   212: aload #12
    //   214: invokeinterface getColumnNames : ()[Ljava/lang/String;
    //   219: iload #7
    //   221: invokespecial <init> : ([Ljava/lang/String;I)V
    //   224: iconst_0
    //   225: istore_3
    //   226: iload_3
    //   227: iload #7
    //   229: if_icmpge -> 428
    //   232: aload #12
    //   234: iload_3
    //   235: invokeinterface moveToPosition : (I)Z
    //   240: ifeq -> 415
    //   243: iload #6
    //   245: anewarray java/lang/Object
    //   248: astore #13
    //   250: iconst_0
    //   251: istore #4
    //   253: iload #4
    //   255: iload #6
    //   257: if_icmpge -> 403
    //   260: aload #12
    //   262: iload #4
    //   264: invokeinterface getType : (I)I
    //   269: istore #8
    //   271: iload #8
    //   273: ifeq -> 391
    //   276: iload #8
    //   278: iconst_1
    //   279: if_icmpeq -> 371
    //   282: iload #8
    //   284: iconst_2
    //   285: if_icmpeq -> 351
    //   288: iload #8
    //   290: iconst_3
    //   291: if_icmpeq -> 334
    //   294: iload #8
    //   296: iconst_4
    //   297: if_icmpne -> 321
    //   300: aload #13
    //   302: iload #4
    //   304: aload #12
    //   306: iload #4
    //   308: invokeinterface getBlob : (I)[B
    //   313: aastore
    //   314: goto -> 397
    //   317: astore_0
    //   318: goto -> 456
    //   321: new android/os/RemoteException
    //   324: astore_0
    //   325: aload_0
    //   326: ldc_w 'Unknown column type'
    //   329: invokespecial <init> : (Ljava/lang/String;)V
    //   332: aload_0
    //   333: athrow
    //   334: aload #13
    //   336: iload #4
    //   338: aload #12
    //   340: iload #4
    //   342: invokeinterface getString : (I)Ljava/lang/String;
    //   347: aastore
    //   348: goto -> 397
    //   351: aload #13
    //   353: iload #4
    //   355: aload #12
    //   357: iload #4
    //   359: invokeinterface getDouble : (I)D
    //   364: invokestatic valueOf : (D)Ljava/lang/Double;
    //   367: aastore
    //   368: goto -> 397
    //   371: aload #13
    //   373: iload #4
    //   375: aload #12
    //   377: iload #4
    //   379: invokeinterface getLong : (I)J
    //   384: invokestatic valueOf : (J)Ljava/lang/Long;
    //   387: aastore
    //   388: goto -> 397
    //   391: aload #13
    //   393: iload #4
    //   395: aconst_null
    //   396: aastore
    //   397: iinc #4, 1
    //   400: goto -> 253
    //   403: aload_0
    //   404: aload #13
    //   406: invokevirtual addRow : ([Ljava/lang/Object;)V
    //   409: iinc #3, 1
    //   412: goto -> 226
    //   415: new android/os/RemoteException
    //   418: astore_0
    //   419: aload_0
    //   420: ldc_w 'Cursor read incomplete (ContentProvider dead?)'
    //   423: invokespecial <init> : (Ljava/lang/String;)V
    //   426: aload_0
    //   427: athrow
    //   428: aload #12
    //   430: invokeinterface close : ()V
    //   435: aload #16
    //   437: astore #12
    //   439: aload #17
    //   441: astore #13
    //   443: aload #14
    //   445: invokevirtual release : ()Z
    //   448: pop
    //   449: goto -> 500
    //   452: astore_0
    //   453: goto -> 476
    //   456: aload #12
    //   458: invokeinterface close : ()V
    //   463: goto -> 474
    //   466: astore #12
    //   468: aload_0
    //   469: aload #12
    //   471: invokevirtual addSuppressed : (Ljava/lang/Throwable;)V
    //   474: aload_0
    //   475: athrow
    //   476: aload #16
    //   478: astore #12
    //   480: aload #17
    //   482: astore #13
    //   484: aload #14
    //   486: invokevirtual release : ()Z
    //   489: pop
    //   490: aload #16
    //   492: astore #12
    //   494: aload #17
    //   496: astore #13
    //   498: aload_0
    //   499: athrow
    //   500: aload_0
    //   501: ifnull -> 765
    //   504: aload_0
    //   505: invokeinterface moveToFirst : ()Z
    //   510: ifeq -> 765
    //   513: aload_0
    //   514: iconst_0
    //   515: invokeinterface getInt : (I)I
    //   520: istore #4
    //   522: iload #4
    //   524: ifle -> 672
    //   527: ldc r20
    //   529: monitorenter
    //   530: aload_0
    //   531: iconst_2
    //   532: invokeinterface getString : (I)Ljava/lang/String;
    //   537: putstatic r20.d : Ljava/lang/String;
    //   540: aload_0
    //   541: ldc_w 'loaderVersion'
    //   544: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   549: istore_3
    //   550: iload_3
    //   551: iflt -> 572
    //   554: aload_0
    //   555: iload_3
    //   556: invokeinterface getInt : (I)I
    //   561: putstatic r20.f : I
    //   564: goto -> 572
    //   567: astore #12
    //   569: goto -> 675
    //   572: aload_0
    //   573: ldc_w 'disableStandaloneDynamiteLoader2'
    //   576: invokeinterface getColumnIndex : (Ljava/lang/String;)I
    //   581: istore_3
    //   582: iload_3
    //   583: iflt -> 610
    //   586: aload_0
    //   587: iload_3
    //   588: invokeinterface getInt : (I)I
    //   593: ifeq -> 601
    //   596: iconst_1
    //   597: istore_1
    //   598: goto -> 603
    //   601: iconst_0
    //   602: istore_1
    //   603: iload_1
    //   604: putstatic r20.e : Z
    //   607: goto -> 612
    //   610: iconst_0
    //   611: istore_1
    //   612: ldc r20
    //   614: monitorexit
    //   615: getstatic r20.h : Ljava/lang/ThreadLocal;
    //   618: invokevirtual get : ()Ljava/lang/Object;
    //   621: checkcast ep2
    //   624: astore #12
    //   626: aload #12
    //   628: ifnull -> 651
    //   631: aload #12
    //   633: getfield a : Landroid/database/Cursor;
    //   636: ifnonnull -> 651
    //   639: aload #12
    //   641: aload_0
    //   642: putfield a : Landroid/database/Cursor;
    //   645: iload #5
    //   647: istore_3
    //   648: goto -> 653
    //   651: iconst_0
    //   652: istore_3
    //   653: iload_1
    //   654: istore #9
    //   656: iload #9
    //   658: istore_1
    //   659: iload_3
    //   660: ifeq -> 672
    //   663: aload #15
    //   665: astore_0
    //   666: iload #9
    //   668: istore_1
    //   669: goto -> 691
    //   672: goto -> 691
    //   675: ldc r20
    //   677: monitorexit
    //   678: aload #12
    //   680: athrow
    //   681: astore #12
    //   683: goto -> 790
    //   686: astore #12
    //   688: goto -> 793
    //   691: iload_2
    //   692: ifeq -> 752
    //   695: iload_1
    //   696: ifne -> 702
    //   699: goto -> 752
    //   702: aload_0
    //   703: astore #12
    //   705: aload_0
    //   706: astore #13
    //   708: new o20
    //   711: astore #14
    //   713: aload_0
    //   714: astore #12
    //   716: aload_0
    //   717: astore #13
    //   719: aload #14
    //   721: ldc_w 'forcing fallback to container DynamiteLoader impl'
    //   724: invokespecial <init> : (Ljava/lang/String;)V
    //   727: aload_0
    //   728: astore #12
    //   730: aload_0
    //   731: astore #13
    //   733: aload #14
    //   735: athrow
    //   736: astore #13
    //   738: aload #12
    //   740: astore_0
    //   741: aload #13
    //   743: astore #12
    //   745: goto -> 917
    //   748: astore_0
    //   749: goto -> 799
    //   752: aload_0
    //   753: ifnull -> 762
    //   756: aload_0
    //   757: invokeinterface close : ()V
    //   762: iload #4
    //   764: ireturn
    //   765: ldc 'DynamiteModule'
    //   767: ldc_w 'Failed to retrieve remote module version.'
    //   770: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   773: pop
    //   774: new o20
    //   777: astore #12
    //   779: aload #12
    //   781: ldc_w 'Failed to connect to dynamite module ContentResolver.'
    //   784: invokespecial <init> : (Ljava/lang/String;)V
    //   787: aload #12
    //   789: athrow
    //   790: goto -> 917
    //   793: aload_0
    //   794: astore #13
    //   796: aload #12
    //   798: astore_0
    //   799: aload #13
    //   801: astore #12
    //   803: aload_0
    //   804: instanceof o20
    //   807: ifne -> 911
    //   810: aload #13
    //   812: astore #12
    //   814: new o20
    //   817: astore #15
    //   819: aload #13
    //   821: astore #12
    //   823: aload_0
    //   824: invokevirtual getMessage : ()Ljava/lang/String;
    //   827: astore #14
    //   829: aload #13
    //   831: astore #12
    //   833: aload #14
    //   835: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   838: invokevirtual length : ()I
    //   841: istore_3
    //   842: aload #13
    //   844: astore #12
    //   846: new java/lang/StringBuilder
    //   849: astore #16
    //   851: aload #13
    //   853: astore #12
    //   855: aload #16
    //   857: iload_3
    //   858: bipush #25
    //   860: iadd
    //   861: invokespecial <init> : (I)V
    //   864: aload #13
    //   866: astore #12
    //   868: aload #16
    //   870: ldc_w 'V2 version check failed: '
    //   873: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   876: pop
    //   877: aload #13
    //   879: astore #12
    //   881: aload #16
    //   883: aload #14
    //   885: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   888: pop
    //   889: aload #13
    //   891: astore #12
    //   893: aload #15
    //   895: aload #16
    //   897: invokevirtual toString : ()Ljava/lang/String;
    //   900: aload_0
    //   901: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   904: aload #13
    //   906: astore #12
    //   908: aload #15
    //   910: athrow
    //   911: aload #13
    //   913: astore #12
    //   915: aload_0
    //   916: athrow
    //   917: aload_0
    //   918: ifnull -> 927
    //   921: aload_0
    //   922: invokeinterface close : ()V
    //   927: aload #12
    //   929: athrow
    //   930: astore_0
    //   931: goto -> 172
    // Exception table:
    //   from	to	target	type
    //   17	31	748	java/lang/Exception
    //   17	31	736	finally
    //   57	62	748	java/lang/Exception
    //   57	62	736	finally
    //   70	75	748	java/lang/Exception
    //   70	75	736	finally
    //   83	123	748	java/lang/Exception
    //   83	123	736	finally
    //   131	142	748	java/lang/Exception
    //   131	142	736	finally
    //   154	167	930	android/os/RemoteException
    //   154	167	452	finally
    //   180	186	748	java/lang/Exception
    //   180	186	736	finally
    //   189	224	317	finally
    //   232	250	317	finally
    //   260	271	317	finally
    //   300	314	317	finally
    //   321	334	317	finally
    //   334	348	317	finally
    //   351	368	317	finally
    //   371	388	317	finally
    //   403	409	317	finally
    //   415	428	317	finally
    //   428	435	930	android/os/RemoteException
    //   428	435	452	finally
    //   443	449	748	java/lang/Exception
    //   443	449	736	finally
    //   456	463	466	finally
    //   468	474	930	android/os/RemoteException
    //   468	474	452	finally
    //   474	476	930	android/os/RemoteException
    //   474	476	452	finally
    //   484	490	748	java/lang/Exception
    //   484	490	736	finally
    //   498	500	748	java/lang/Exception
    //   498	500	736	finally
    //   504	522	686	java/lang/Exception
    //   504	522	681	finally
    //   527	530	686	java/lang/Exception
    //   527	530	681	finally
    //   530	550	567	finally
    //   554	564	567	finally
    //   572	582	567	finally
    //   586	596	567	finally
    //   603	607	567	finally
    //   612	615	567	finally
    //   615	626	686	java/lang/Exception
    //   615	626	681	finally
    //   631	645	686	java/lang/Exception
    //   631	645	681	finally
    //   675	678	567	finally
    //   678	681	686	java/lang/Exception
    //   678	681	681	finally
    //   708	713	748	java/lang/Exception
    //   708	713	736	finally
    //   719	727	748	java/lang/Exception
    //   719	727	736	finally
    //   733	736	748	java/lang/Exception
    //   733	736	736	finally
    //   765	790	686	java/lang/Exception
    //   765	790	681	finally
    //   803	810	736	finally
    //   814	819	736	finally
    //   823	829	736	finally
    //   833	842	736	finally
    //   846	851	736	finally
    //   855	864	736	finally
    //   868	877	736	finally
    //   881	889	736	finally
    //   893	904	736	finally
    //   908	911	736	finally
    //   915	917	736	finally
  }
  
  public static void d(ClassLoader paramClassLoader) {
    try {
      IInterface iInterface;
      Class<?> clazz = paramClassLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2");
      paramClassLoader = null;
      IBinder iBinder = clazz.getConstructor(null).newInstance(null);
      if (iBinder != null) {
        iInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
        if (iInterface instanceof cq2) {
          iInterface = iInterface;
        } else {
          iInterface = new na2(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 2);
        } 
      } 
      l = (cq2)iInterface;
      return;
    } catch (ClassNotFoundException|IllegalAccessException|InstantiationException|java.lang.reflect.InvocationTargetException|NoSuchMethodException classNotFoundException) {
      throw new Exception("Failed to instantiate dynamite loader", classNotFoundException);
    } 
  }
  
  public static rp2 e(Context paramContext) {
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{r20}} */
    try {
      rp2 rp21 = k;
      if (rp21 != null) {
        /* monitor exit TypeReferenceDotClassExpression{ObjectType{r20}} */
        return rp21;
      } 
    } finally {}
    try {
      IBinder iBinder = (IBinder)paramContext.createPackageContext(GMDx.hQgWtJQJfEPc, 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
      if (iBinder == null) {
        paramContext = null;
      } else {
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
        if (iInterface instanceof rp2) {
          iInterface = iInterface;
        } else {
          iInterface = new na2(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 2);
        } 
      } 
    } catch (Exception exception) {}
    if (exception != null) {
      k = (rp2)exception;
      /* monitor exit TypeReferenceDotClassExpression{ObjectType{r20}} */
      return (rp2)exception;
    } 
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{r20}} */
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\r20.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */