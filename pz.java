import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;

public final class pz {
  public final Context a;
  
  public final qz b;
  
  public VelocityTracker c;
  
  public float d;
  
  public int e = -1;
  
  public int f = -1;
  
  public int g = -1;
  
  public final int[] h = new int[] { Integer.MAX_VALUE, 0 };
  
  public pz(Context paramContext, qz paramqz) {
    this.a = paramContext;
    this.b = paramqz;
  }
  
  public final void a(MotionEvent paramMotionEvent, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getSource : ()I
    //   4: istore #10
    //   6: aload_1
    //   7: invokevirtual getDeviceId : ()I
    //   10: istore #11
    //   12: aload_0
    //   13: getfield f : I
    //   16: istore #8
    //   18: aload_0
    //   19: getfield h : [I
    //   22: astore #18
    //   24: iload #8
    //   26: iload #10
    //   28: if_icmpne -> 57
    //   31: aload_0
    //   32: getfield g : I
    //   35: iload #11
    //   37: if_icmpne -> 57
    //   40: aload_0
    //   41: getfield e : I
    //   44: iload_2
    //   45: if_icmpeq -> 51
    //   48: goto -> 57
    //   51: iconst_0
    //   52: istore #8
    //   54: goto -> 413
    //   57: aload_0
    //   58: getfield a : Landroid/content/Context;
    //   61: astore #20
    //   63: aload #20
    //   65: invokestatic get : (Landroid/content/Context;)Landroid/view/ViewConfiguration;
    //   68: astore #19
    //   70: aload_1
    //   71: invokevirtual getDeviceId : ()I
    //   74: istore #9
    //   76: aload_1
    //   77: invokevirtual getSource : ()I
    //   80: istore #8
    //   82: getstatic android/os/Build$VERSION.SDK_INT : I
    //   85: istore #12
    //   87: iload #12
    //   89: bipush #34
    //   91: if_icmplt -> 114
    //   94: getstatic w22.a : Ljava/lang/reflect/Method;
    //   97: astore #21
    //   99: aload #19
    //   101: iload #9
    //   103: iload_2
    //   104: iload #8
    //   106: invokestatic i : (Landroid/view/ViewConfiguration;III)I
    //   109: istore #8
    //   111: goto -> 233
    //   114: getstatic w22.a : Ljava/lang/reflect/Method;
    //   117: astore #21
    //   119: iload #9
    //   121: invokestatic getDevice : (I)Landroid/view/InputDevice;
    //   124: astore #21
    //   126: aload #21
    //   128: ifnull -> 229
    //   131: aload #21
    //   133: iload_2
    //   134: iload #8
    //   136: invokevirtual getMotionRange : (II)Landroid/view/InputDevice$MotionRange;
    //   139: ifnull -> 229
    //   142: aload #20
    //   144: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   147: astore #21
    //   149: iload #8
    //   151: ldc 4194304
    //   153: if_icmpne -> 178
    //   156: iload_2
    //   157: bipush #26
    //   159: if_icmpne -> 178
    //   162: aload #21
    //   164: ldc 'config_viewMinRotaryEncoderFlingVelocity'
    //   166: ldc 'dimen'
    //   168: ldc 'android'
    //   170: invokevirtual getIdentifier : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   173: istore #8
    //   175: goto -> 181
    //   178: iconst_m1
    //   179: istore #8
    //   181: aload #19
    //   183: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   186: pop
    //   187: iload #8
    //   189: iconst_m1
    //   190: if_icmpeq -> 219
    //   193: iload #8
    //   195: ifeq -> 229
    //   198: aload #21
    //   200: iload #8
    //   202: invokevirtual getDimensionPixelSize : (I)I
    //   205: istore #9
    //   207: iload #9
    //   209: istore #8
    //   211: iload #9
    //   213: ifge -> 233
    //   216: goto -> 229
    //   219: aload #19
    //   221: invokevirtual getScaledMinimumFlingVelocity : ()I
    //   224: istore #8
    //   226: goto -> 233
    //   229: ldc 2147483647
    //   231: istore #8
    //   233: aload #18
    //   235: iconst_0
    //   236: iload #8
    //   238: iastore
    //   239: aload_1
    //   240: invokevirtual getDeviceId : ()I
    //   243: istore #8
    //   245: aload_1
    //   246: invokevirtual getSource : ()I
    //   249: istore #9
    //   251: iload #12
    //   253: bipush #34
    //   255: if_icmplt -> 273
    //   258: aload #19
    //   260: iload #8
    //   262: iload_2
    //   263: iload #9
    //   265: invokestatic h : (Landroid/view/ViewConfiguration;III)I
    //   268: istore #8
    //   270: goto -> 387
    //   273: iload #8
    //   275: invokestatic getDevice : (I)Landroid/view/InputDevice;
    //   278: astore #21
    //   280: aload #21
    //   282: ifnull -> 383
    //   285: aload #21
    //   287: iload_2
    //   288: iload #9
    //   290: invokevirtual getMotionRange : (II)Landroid/view/InputDevice$MotionRange;
    //   293: ifnull -> 383
    //   296: aload #20
    //   298: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   301: astore #20
    //   303: iload #9
    //   305: ldc 4194304
    //   307: if_icmpne -> 332
    //   310: iload_2
    //   311: bipush #26
    //   313: if_icmpne -> 332
    //   316: aload #20
    //   318: ldc 'config_viewMaxRotaryEncoderFlingVelocity'
    //   320: ldc 'dimen'
    //   322: ldc 'android'
    //   324: invokevirtual getIdentifier : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   327: istore #8
    //   329: goto -> 335
    //   332: iconst_m1
    //   333: istore #8
    //   335: aload #19
    //   337: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   340: pop
    //   341: iload #8
    //   343: iconst_m1
    //   344: if_icmpeq -> 373
    //   347: iload #8
    //   349: ifeq -> 383
    //   352: aload #20
    //   354: iload #8
    //   356: invokevirtual getDimensionPixelSize : (I)I
    //   359: istore #9
    //   361: iload #9
    //   363: istore #8
    //   365: iload #9
    //   367: ifge -> 387
    //   370: goto -> 383
    //   373: aload #19
    //   375: invokevirtual getScaledMaximumFlingVelocity : ()I
    //   378: istore #8
    //   380: goto -> 387
    //   383: ldc -2147483648
    //   385: istore #8
    //   387: aload #18
    //   389: iconst_1
    //   390: iload #8
    //   392: iastore
    //   393: aload_0
    //   394: iload #10
    //   396: putfield f : I
    //   399: aload_0
    //   400: iload #11
    //   402: putfield g : I
    //   405: aload_0
    //   406: iload_2
    //   407: putfield e : I
    //   410: iconst_1
    //   411: istore #8
    //   413: aload #18
    //   415: iconst_0
    //   416: iaload
    //   417: istore #9
    //   419: aload_0
    //   420: getfield c : Landroid/view/VelocityTracker;
    //   423: astore #19
    //   425: iload #9
    //   427: ldc 2147483647
    //   429: if_icmpne -> 448
    //   432: aload #19
    //   434: ifnull -> 1288
    //   437: aload #19
    //   439: invokevirtual recycle : ()V
    //   442: aload_0
    //   443: aconst_null
    //   444: putfield c : Landroid/view/VelocityTracker;
    //   447: return
    //   448: aload #19
    //   450: ifnonnull -> 460
    //   453: aload_0
    //   454: invokestatic obtain : ()Landroid/view/VelocityTracker;
    //   457: putfield c : Landroid/view/VelocityTracker;
    //   460: aload_0
    //   461: getfield c : Landroid/view/VelocityTracker;
    //   464: astore #19
    //   466: getstatic y12.a : Ljava/util/Map;
    //   469: astore #20
    //   471: aload #19
    //   473: aload_1
    //   474: invokevirtual addMovement : (Landroid/view/MotionEvent;)V
    //   477: getstatic android/os/Build$VERSION.SDK_INT : I
    //   480: istore #9
    //   482: fconst_0
    //   483: fstore_3
    //   484: iload #9
    //   486: bipush #34
    //   488: if_icmplt -> 494
    //   491: goto -> 668
    //   494: aload_1
    //   495: invokevirtual getSource : ()I
    //   498: ldc 4194304
    //   500: if_icmpne -> 668
    //   503: getstatic y12.a : Ljava/util/Map;
    //   506: astore #20
    //   508: aload #20
    //   510: aload #19
    //   512: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   517: ifne -> 537
    //   520: aload #20
    //   522: aload #19
    //   524: new z12
    //   527: dup
    //   528: invokespecial <init> : ()V
    //   531: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   536: pop
    //   537: aload #20
    //   539: aload #19
    //   541: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   546: checkcast z12
    //   549: astore #20
    //   551: aload #20
    //   553: getfield b : [J
    //   556: astore #21
    //   558: aload_1
    //   559: invokevirtual getEventTime : ()J
    //   562: lstore #14
    //   564: aload #20
    //   566: getfield d : I
    //   569: ifeq -> 602
    //   572: lload #14
    //   574: aload #21
    //   576: aload #20
    //   578: getfield e : I
    //   581: laload
    //   582: lsub
    //   583: ldc2_w 40
    //   586: lcmp
    //   587: ifle -> 602
    //   590: aload #20
    //   592: iconst_0
    //   593: putfield d : I
    //   596: aload #20
    //   598: fconst_0
    //   599: putfield c : F
    //   602: aload #20
    //   604: getfield e : I
    //   607: iconst_1
    //   608: iadd
    //   609: bipush #20
    //   611: irem
    //   612: istore #10
    //   614: aload #20
    //   616: iload #10
    //   618: putfield e : I
    //   621: aload #20
    //   623: getfield d : I
    //   626: istore #9
    //   628: iload #9
    //   630: bipush #20
    //   632: if_icmpeq -> 644
    //   635: aload #20
    //   637: iload #9
    //   639: iconst_1
    //   640: iadd
    //   641: putfield d : I
    //   644: aload #20
    //   646: getfield a : [F
    //   649: iload #10
    //   651: aload_1
    //   652: bipush #26
    //   654: invokevirtual getAxisValue : (I)F
    //   657: fastore
    //   658: aload #21
    //   660: aload #20
    //   662: getfield e : I
    //   665: lload #14
    //   667: lastore
    //   668: aload #19
    //   670: sipush #1000
    //   673: ldc 3.4028235E38
    //   675: invokevirtual computeCurrentVelocity : (IF)V
    //   678: getstatic y12.a : Ljava/util/Map;
    //   681: aload #19
    //   683: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   688: checkcast z12
    //   691: astore #20
    //   693: aload #20
    //   695: ifnull -> 1137
    //   698: aload #20
    //   700: getfield a : [F
    //   703: astore_1
    //   704: aload #20
    //   706: getfield b : [J
    //   709: astore #21
    //   711: aload #20
    //   713: getfield d : I
    //   716: istore #9
    //   718: iload #9
    //   720: iconst_2
    //   721: if_icmpge -> 732
    //   724: fconst_0
    //   725: fstore #4
    //   727: fconst_0
    //   728: fstore_3
    //   729: goto -> 1061
    //   732: aload #20
    //   734: getfield e : I
    //   737: istore #10
    //   739: iload #10
    //   741: bipush #20
    //   743: iadd
    //   744: iload #9
    //   746: iconst_1
    //   747: isub
    //   748: isub
    //   749: bipush #20
    //   751: irem
    //   752: istore #9
    //   754: aload #21
    //   756: iload #10
    //   758: laload
    //   759: lstore #16
    //   761: aload #21
    //   763: iload #9
    //   765: laload
    //   766: lstore #14
    //   768: aload #20
    //   770: getfield d : I
    //   773: istore #10
    //   775: lload #16
    //   777: lload #14
    //   779: lsub
    //   780: ldc2_w 100
    //   783: lcmp
    //   784: ifle -> 808
    //   787: aload #20
    //   789: iload #10
    //   791: iconst_1
    //   792: isub
    //   793: putfield d : I
    //   796: iload #9
    //   798: iconst_1
    //   799: iadd
    //   800: bipush #20
    //   802: irem
    //   803: istore #9
    //   805: goto -> 761
    //   808: iload #10
    //   810: iconst_2
    //   811: if_icmpge -> 817
    //   814: goto -> 724
    //   817: iload #10
    //   819: iconst_2
    //   820: if_icmpne -> 868
    //   823: iload #9
    //   825: iconst_1
    //   826: iadd
    //   827: bipush #20
    //   829: irem
    //   830: istore #9
    //   832: aload #21
    //   834: iload #9
    //   836: laload
    //   837: lstore #16
    //   839: lload #14
    //   841: lload #16
    //   843: lcmp
    //   844: ifne -> 850
    //   847: goto -> 724
    //   850: aload_1
    //   851: iload #9
    //   853: faload
    //   854: lload #16
    //   856: lload #14
    //   858: lsub
    //   859: l2f
    //   860: fdiv
    //   861: fstore #4
    //   863: fconst_0
    //   864: fstore_3
    //   865: goto -> 1061
    //   868: fconst_0
    //   869: fstore #4
    //   871: iconst_0
    //   872: istore #10
    //   874: iconst_0
    //   875: istore #11
    //   877: aload #20
    //   879: getfield d : I
    //   882: istore #12
    //   884: fconst_1
    //   885: fstore #5
    //   887: iload #10
    //   889: iload #12
    //   891: iconst_1
    //   892: isub
    //   893: if_icmpge -> 1033
    //   896: iload #10
    //   898: iload #9
    //   900: iadd
    //   901: istore #12
    //   903: aload #21
    //   905: iload #12
    //   907: bipush #20
    //   909: irem
    //   910: laload
    //   911: lstore #14
    //   913: iload #12
    //   915: iconst_1
    //   916: iadd
    //   917: bipush #20
    //   919: irem
    //   920: istore #13
    //   922: aload #21
    //   924: iload #13
    //   926: laload
    //   927: lload #14
    //   929: lcmp
    //   930: ifne -> 936
    //   933: goto -> 1027
    //   936: iload #11
    //   938: iconst_1
    //   939: iadd
    //   940: istore #12
    //   942: fload #4
    //   944: fload_3
    //   945: fcmpg
    //   946: ifge -> 953
    //   949: ldc -1.0
    //   951: fstore #5
    //   953: fload #4
    //   955: invokestatic abs : (F)F
    //   958: fconst_2
    //   959: fmul
    //   960: f2d
    //   961: invokestatic sqrt : (D)D
    //   964: d2f
    //   965: fstore #7
    //   967: aload_1
    //   968: iload #13
    //   970: faload
    //   971: aload #21
    //   973: iload #13
    //   975: laload
    //   976: lload #14
    //   978: lsub
    //   979: l2f
    //   980: fdiv
    //   981: fstore #6
    //   983: fload #4
    //   985: fload #6
    //   987: invokestatic abs : (F)F
    //   990: fload #6
    //   992: fload #5
    //   994: fload #7
    //   996: fmul
    //   997: fsub
    //   998: fmul
    //   999: fadd
    //   1000: fstore #5
    //   1002: iload #12
    //   1004: istore #11
    //   1006: fload #5
    //   1008: fstore #4
    //   1010: iload #12
    //   1012: iconst_1
    //   1013: if_icmpne -> 1027
    //   1016: fload #5
    //   1018: ldc 0.5
    //   1020: fmul
    //   1021: fstore #4
    //   1023: iload #12
    //   1025: istore #11
    //   1027: iinc #10, 1
    //   1030: goto -> 877
    //   1033: fload #4
    //   1035: fload_3
    //   1036: fcmpg
    //   1037: ifge -> 1044
    //   1040: ldc -1.0
    //   1042: fstore #5
    //   1044: fload #5
    //   1046: fload #4
    //   1048: invokestatic abs : (F)F
    //   1051: fconst_2
    //   1052: fmul
    //   1053: f2d
    //   1054: invokestatic sqrt : (D)D
    //   1057: d2f
    //   1058: fmul
    //   1059: fstore #4
    //   1061: fload #4
    //   1063: ldc 1000.0
    //   1065: fmul
    //   1066: fstore #4
    //   1068: aload #20
    //   1070: fload #4
    //   1072: putfield c : F
    //   1075: fload #4
    //   1077: ldc 3.4028235E38
    //   1079: invokestatic abs : (F)F
    //   1082: fneg
    //   1083: fcmpg
    //   1084: ifge -> 1104
    //   1087: aload #20
    //   1089: ldc 3.4028235E38
    //   1091: invokestatic abs : (F)F
    //   1094: fneg
    //   1095: putfield c : F
    //   1098: fload_3
    //   1099: fstore #4
    //   1101: goto -> 1140
    //   1104: fload_3
    //   1105: fstore #4
    //   1107: aload #20
    //   1109: getfield c : F
    //   1112: ldc 3.4028235E38
    //   1114: invokestatic abs : (F)F
    //   1117: fcmpl
    //   1118: ifle -> 1140
    //   1121: aload #20
    //   1123: ldc 3.4028235E38
    //   1125: invokestatic abs : (F)F
    //   1128: putfield c : F
    //   1131: fload_3
    //   1132: fstore #4
    //   1134: goto -> 1140
    //   1137: fconst_0
    //   1138: fstore #4
    //   1140: getstatic android/os/Build$VERSION.SDK_INT : I
    //   1143: bipush #34
    //   1145: if_icmplt -> 1158
    //   1148: aload #19
    //   1150: iload_2
    //   1151: invokestatic d : (Landroid/view/VelocityTracker;I)F
    //   1154: fstore_3
    //   1155: goto -> 1223
    //   1158: iload_2
    //   1159: ifne -> 1171
    //   1162: aload #19
    //   1164: invokevirtual getXVelocity : ()F
    //   1167: fstore_3
    //   1168: goto -> 1223
    //   1171: iload_2
    //   1172: iconst_1
    //   1173: if_icmpne -> 1185
    //   1176: aload #19
    //   1178: invokevirtual getYVelocity : ()F
    //   1181: fstore_3
    //   1182: goto -> 1223
    //   1185: getstatic y12.a : Ljava/util/Map;
    //   1188: aload #19
    //   1190: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1195: checkcast z12
    //   1198: astore_1
    //   1199: aload_1
    //   1200: ifnull -> 1220
    //   1203: iload_2
    //   1204: bipush #26
    //   1206: if_icmpeq -> 1212
    //   1209: goto -> 1220
    //   1212: aload_1
    //   1213: getfield c : F
    //   1216: fstore_3
    //   1217: goto -> 1223
    //   1220: fload #4
    //   1222: fstore_3
    //   1223: aload_0
    //   1224: getfield b : Lqz;
    //   1227: astore_1
    //   1228: aload_1
    //   1229: invokeinterface i : ()F
    //   1234: fload_3
    //   1235: fmul
    //   1236: fstore #5
    //   1238: fload #5
    //   1240: invokestatic signum : (F)F
    //   1243: fstore_3
    //   1244: iload #8
    //   1246: ifne -> 1268
    //   1249: fload_3
    //   1250: aload_0
    //   1251: getfield d : F
    //   1254: invokestatic signum : (F)F
    //   1257: fcmpl
    //   1258: ifeq -> 1274
    //   1261: fload_3
    //   1262: fload #4
    //   1264: fcmpl
    //   1265: ifeq -> 1274
    //   1268: aload_1
    //   1269: invokeinterface n : ()V
    //   1274: fload #5
    //   1276: invokestatic abs : (F)F
    //   1279: aload #18
    //   1281: iconst_0
    //   1282: iaload
    //   1283: i2f
    //   1284: fcmpg
    //   1285: ifge -> 1289
    //   1288: return
    //   1289: aload #18
    //   1291: iconst_1
    //   1292: iaload
    //   1293: istore_2
    //   1294: iload_2
    //   1295: ineg
    //   1296: i2f
    //   1297: fload #5
    //   1299: iload_2
    //   1300: i2f
    //   1301: invokestatic min : (FF)F
    //   1304: invokestatic max : (FF)F
    //   1307: fstore_3
    //   1308: aload_1
    //   1309: fload_3
    //   1310: invokeinterface f : (F)Z
    //   1315: ifeq -> 1321
    //   1318: goto -> 1324
    //   1321: fload #4
    //   1323: fstore_3
    //   1324: aload_0
    //   1325: fload_3
    //   1326: putfield d : F
    //   1329: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */