import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class hq {
  public final ConstraintLayout a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public final ConstraintLayout h;
  
  public hq(ConstraintLayout paramConstraintLayout1, ConstraintLayout paramConstraintLayout2) {
    this.h = paramConstraintLayout1;
    this.a = paramConstraintLayout2;
  }
  
  public static boolean a(int paramInt1, int paramInt2, int paramInt3) {
    if (paramInt1 != paramInt2) {
      paramInt1 = View.MeasureSpec.getMode(paramInt1);
      int i = View.MeasureSpec.getMode(paramInt2);
      paramInt2 = View.MeasureSpec.getSize(paramInt2);
      if (i != 1073741824 || (paramInt1 != Integer.MIN_VALUE && paramInt1 != 0) || paramInt3 != paramInt2)
        return false; 
    } 
    return true;
  }
  
  public final void b(er paramer, re paramre) {
    // Byte code:
    //   0: aload_1
    //   1: getfield K : Lbq;
    //   4: astore #21
    //   6: aload_1
    //   7: getfield I : Lbq;
    //   10: astore #20
    //   12: aload_1
    //   13: getfield g0 : I
    //   16: bipush #8
    //   18: if_icmpne -> 44
    //   21: aload_1
    //   22: getfield F : Z
    //   25: ifne -> 44
    //   28: aload_2
    //   29: iconst_0
    //   30: putfield e : I
    //   33: aload_2
    //   34: iconst_0
    //   35: putfield f : I
    //   38: aload_2
    //   39: iconst_0
    //   40: putfield g : I
    //   43: return
    //   44: aload_1
    //   45: getfield T : Ler;
    //   48: ifnonnull -> 54
    //   51: goto -> 897
    //   54: getstatic androidx/constraintlayout/widget/ConstraintLayout.r : Lkm1;
    //   57: astore #19
    //   59: aload_2
    //   60: getfield a : I
    //   63: istore #8
    //   65: aload_2
    //   66: getfield b : I
    //   69: istore #9
    //   71: aload_2
    //   72: getfield c : I
    //   75: istore #4
    //   77: aload_2
    //   78: getfield d : I
    //   81: istore #10
    //   83: aload_0
    //   84: getfield b : I
    //   87: aload_0
    //   88: getfield c : I
    //   91: iadd
    //   92: istore #7
    //   94: aload_0
    //   95: getfield d : I
    //   98: istore #6
    //   100: aload_1
    //   101: getfield f0 : Landroid/view/View;
    //   104: astore #19
    //   106: iload #8
    //   108: invokestatic y : (I)I
    //   111: istore #5
    //   113: iload #5
    //   115: ifeq -> 346
    //   118: iload #5
    //   120: iconst_1
    //   121: if_icmpeq -> 330
    //   124: iload #5
    //   126: iconst_2
    //   127: if_icmpeq -> 201
    //   130: iload #5
    //   132: iconst_3
    //   133: if_icmpeq -> 142
    //   136: iconst_0
    //   137: istore #4
    //   139: goto -> 355
    //   142: aload_0
    //   143: getfield f : I
    //   146: istore #11
    //   148: aload #20
    //   150: ifnull -> 163
    //   153: aload #20
    //   155: getfield g : I
    //   158: istore #4
    //   160: goto -> 166
    //   163: iconst_0
    //   164: istore #4
    //   166: iload #4
    //   168: istore #5
    //   170: aload #21
    //   172: ifnull -> 185
    //   175: iload #4
    //   177: aload #21
    //   179: getfield g : I
    //   182: iadd
    //   183: istore #5
    //   185: iload #11
    //   187: iload #6
    //   189: iload #5
    //   191: iadd
    //   192: iconst_m1
    //   193: invokestatic getChildMeasureSpec : (III)I
    //   196: istore #4
    //   198: goto -> 355
    //   201: aload_0
    //   202: getfield f : I
    //   205: iload #6
    //   207: bipush #-2
    //   209: invokestatic getChildMeasureSpec : (III)I
    //   212: istore #6
    //   214: aload_1
    //   215: getfield r : I
    //   218: iconst_1
    //   219: if_icmpne -> 228
    //   222: iconst_1
    //   223: istore #5
    //   225: goto -> 231
    //   228: iconst_0
    //   229: istore #5
    //   231: aload_2
    //   232: getfield j : I
    //   235: istore #11
    //   237: iload #11
    //   239: iconst_1
    //   240: if_icmpeq -> 253
    //   243: iload #6
    //   245: istore #4
    //   247: iload #11
    //   249: iconst_2
    //   250: if_icmpne -> 355
    //   253: aload #19
    //   255: invokevirtual getMeasuredHeight : ()I
    //   258: aload_1
    //   259: invokevirtual i : ()I
    //   262: if_icmpne -> 271
    //   265: iconst_1
    //   266: istore #4
    //   268: goto -> 274
    //   271: iconst_0
    //   272: istore #4
    //   274: aload_2
    //   275: getfield j : I
    //   278: iconst_2
    //   279: if_icmpeq -> 316
    //   282: iload #5
    //   284: ifeq -> 316
    //   287: iload #5
    //   289: ifeq -> 297
    //   292: iload #4
    //   294: ifne -> 316
    //   297: aload #19
    //   299: instanceof androidx/constraintlayout/widget/Placeholder
    //   302: ifne -> 316
    //   305: iload #6
    //   307: istore #4
    //   309: aload_1
    //   310: invokevirtual y : ()Z
    //   313: ifeq -> 355
    //   316: aload_1
    //   317: invokevirtual o : ()I
    //   320: ldc 1073741824
    //   322: invokestatic makeMeasureSpec : (II)I
    //   325: istore #4
    //   327: goto -> 355
    //   330: aload_0
    //   331: getfield f : I
    //   334: iload #6
    //   336: bipush #-2
    //   338: invokestatic getChildMeasureSpec : (III)I
    //   341: istore #4
    //   343: goto -> 355
    //   346: iload #4
    //   348: ldc 1073741824
    //   350: invokestatic makeMeasureSpec : (II)I
    //   353: istore #4
    //   355: iload #9
    //   357: invokestatic y : (I)I
    //   360: istore #5
    //   362: iload #5
    //   364: ifeq -> 599
    //   367: iload #5
    //   369: iconst_1
    //   370: if_icmpeq -> 583
    //   373: iload #5
    //   375: iconst_2
    //   376: if_icmpeq -> 454
    //   379: iload #5
    //   381: iconst_3
    //   382: if_icmpeq -> 391
    //   385: iconst_0
    //   386: istore #5
    //   388: goto -> 608
    //   391: aload_0
    //   392: getfield g : I
    //   395: istore #10
    //   397: aload #20
    //   399: ifnull -> 414
    //   402: aload_1
    //   403: getfield J : Lbq;
    //   406: getfield g : I
    //   409: istore #5
    //   411: goto -> 417
    //   414: iconst_0
    //   415: istore #5
    //   417: iload #5
    //   419: istore #6
    //   421: aload #21
    //   423: ifnull -> 438
    //   426: iload #5
    //   428: aload_1
    //   429: getfield L : Lbq;
    //   432: getfield g : I
    //   435: iadd
    //   436: istore #6
    //   438: iload #10
    //   440: iload #7
    //   442: iload #6
    //   444: iadd
    //   445: iconst_m1
    //   446: invokestatic getChildMeasureSpec : (III)I
    //   449: istore #5
    //   451: goto -> 608
    //   454: aload_0
    //   455: getfield g : I
    //   458: iload #7
    //   460: bipush #-2
    //   462: invokestatic getChildMeasureSpec : (III)I
    //   465: istore #7
    //   467: aload_1
    //   468: getfield s : I
    //   471: iconst_1
    //   472: if_icmpne -> 481
    //   475: iconst_1
    //   476: istore #6
    //   478: goto -> 484
    //   481: iconst_0
    //   482: istore #6
    //   484: aload_2
    //   485: getfield j : I
    //   488: istore #10
    //   490: iload #10
    //   492: iconst_1
    //   493: if_icmpeq -> 506
    //   496: iload #7
    //   498: istore #5
    //   500: iload #10
    //   502: iconst_2
    //   503: if_icmpne -> 608
    //   506: aload #19
    //   508: invokevirtual getMeasuredWidth : ()I
    //   511: aload_1
    //   512: invokevirtual o : ()I
    //   515: if_icmpne -> 524
    //   518: iconst_1
    //   519: istore #5
    //   521: goto -> 527
    //   524: iconst_0
    //   525: istore #5
    //   527: aload_2
    //   528: getfield j : I
    //   531: iconst_2
    //   532: if_icmpeq -> 569
    //   535: iload #6
    //   537: ifeq -> 569
    //   540: iload #6
    //   542: ifeq -> 550
    //   545: iload #5
    //   547: ifne -> 569
    //   550: aload #19
    //   552: instanceof androidx/constraintlayout/widget/Placeholder
    //   555: ifne -> 569
    //   558: iload #7
    //   560: istore #5
    //   562: aload_1
    //   563: invokevirtual z : ()Z
    //   566: ifeq -> 608
    //   569: aload_1
    //   570: invokevirtual i : ()I
    //   573: ldc 1073741824
    //   575: invokestatic makeMeasureSpec : (II)I
    //   578: istore #5
    //   580: goto -> 608
    //   583: aload_0
    //   584: getfield g : I
    //   587: iload #7
    //   589: bipush #-2
    //   591: invokestatic getChildMeasureSpec : (III)I
    //   594: istore #5
    //   596: goto -> 608
    //   599: iload #10
    //   601: ldc 1073741824
    //   603: invokestatic makeMeasureSpec : (II)I
    //   606: istore #5
    //   608: aload_1
    //   609: getfield T : Ler;
    //   612: checkcast fr
    //   615: astore #21
    //   617: aload_0
    //   618: getfield h : Landroidx/constraintlayout/widget/ConstraintLayout;
    //   621: astore #20
    //   623: aload #21
    //   625: ifnull -> 768
    //   628: aload #20
    //   630: getfield k : I
    //   633: sipush #256
    //   636: invokestatic p : (II)Z
    //   639: ifeq -> 768
    //   642: aload #19
    //   644: invokevirtual getMeasuredWidth : ()I
    //   647: aload_1
    //   648: invokevirtual o : ()I
    //   651: if_icmpne -> 768
    //   654: aload #19
    //   656: invokevirtual getMeasuredWidth : ()I
    //   659: aload #21
    //   661: invokevirtual o : ()I
    //   664: if_icmpge -> 768
    //   667: aload #19
    //   669: invokevirtual getMeasuredHeight : ()I
    //   672: aload_1
    //   673: invokevirtual i : ()I
    //   676: if_icmpne -> 768
    //   679: aload #19
    //   681: invokevirtual getMeasuredHeight : ()I
    //   684: aload #21
    //   686: invokevirtual i : ()I
    //   689: if_icmpge -> 768
    //   692: aload #19
    //   694: invokevirtual getBaseline : ()I
    //   697: aload_1
    //   698: getfield a0 : I
    //   701: if_icmpne -> 768
    //   704: aload_1
    //   705: invokevirtual x : ()Z
    //   708: ifne -> 768
    //   711: aload_1
    //   712: getfield G : I
    //   715: iload #4
    //   717: aload_1
    //   718: invokevirtual o : ()I
    //   721: invokestatic a : (III)Z
    //   724: ifeq -> 768
    //   727: aload_1
    //   728: getfield H : I
    //   731: iload #5
    //   733: aload_1
    //   734: invokevirtual i : ()I
    //   737: invokestatic a : (III)Z
    //   740: ifeq -> 768
    //   743: aload_2
    //   744: aload_1
    //   745: invokevirtual o : ()I
    //   748: putfield e : I
    //   751: aload_2
    //   752: aload_1
    //   753: invokevirtual i : ()I
    //   756: putfield f : I
    //   759: aload_2
    //   760: aload_1
    //   761: getfield a0 : I
    //   764: putfield g : I
    //   767: return
    //   768: iload #8
    //   770: iconst_3
    //   771: if_icmpne -> 780
    //   774: iconst_1
    //   775: istore #6
    //   777: goto -> 783
    //   780: iconst_0
    //   781: istore #6
    //   783: iload #9
    //   785: iconst_3
    //   786: if_icmpne -> 795
    //   789: iconst_1
    //   790: istore #7
    //   792: goto -> 798
    //   795: iconst_0
    //   796: istore #7
    //   798: iload #9
    //   800: iconst_4
    //   801: if_icmpeq -> 819
    //   804: iload #9
    //   806: iconst_1
    //   807: if_icmpne -> 813
    //   810: goto -> 819
    //   813: iconst_0
    //   814: istore #10
    //   816: goto -> 822
    //   819: iconst_1
    //   820: istore #10
    //   822: iload #8
    //   824: iconst_4
    //   825: if_icmpeq -> 843
    //   828: iload #8
    //   830: iconst_1
    //   831: if_icmpne -> 837
    //   834: goto -> 843
    //   837: iconst_0
    //   838: istore #11
    //   840: goto -> 846
    //   843: iconst_1
    //   844: istore #11
    //   846: iload #6
    //   848: ifeq -> 866
    //   851: aload_1
    //   852: getfield W : F
    //   855: fconst_0
    //   856: fcmpl
    //   857: ifle -> 866
    //   860: iconst_1
    //   861: istore #12
    //   863: goto -> 869
    //   866: iconst_0
    //   867: istore #12
    //   869: iload #7
    //   871: ifeq -> 889
    //   874: aload_1
    //   875: getfield W : F
    //   878: fconst_0
    //   879: fcmpl
    //   880: ifle -> 889
    //   883: iconst_1
    //   884: istore #13
    //   886: goto -> 892
    //   889: iconst_0
    //   890: istore #13
    //   892: aload #19
    //   894: ifnonnull -> 898
    //   897: return
    //   898: aload #19
    //   900: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   903: checkcast gq
    //   906: astore #21
    //   908: aload_2
    //   909: getfield j : I
    //   912: istore #8
    //   914: iload #8
    //   916: iconst_1
    //   917: if_icmpeq -> 965
    //   920: iload #8
    //   922: iconst_2
    //   923: if_icmpeq -> 965
    //   926: iload #6
    //   928: ifeq -> 965
    //   931: aload_1
    //   932: getfield r : I
    //   935: ifne -> 965
    //   938: iload #7
    //   940: ifeq -> 965
    //   943: aload_1
    //   944: getfield s : I
    //   947: ifeq -> 953
    //   950: goto -> 965
    //   953: iconst_0
    //   954: istore #4
    //   956: iconst_0
    //   957: istore #8
    //   959: iconst_0
    //   960: istore #7
    //   962: goto -> 1322
    //   965: aload #19
    //   967: iload #4
    //   969: iload #5
    //   971: invokevirtual measure : (II)V
    //   974: aload_1
    //   975: iload #4
    //   977: putfield G : I
    //   980: aload_1
    //   981: iload #5
    //   983: putfield H : I
    //   986: aload_1
    //   987: iconst_0
    //   988: putfield g : Z
    //   991: aload #19
    //   993: invokevirtual getMeasuredWidth : ()I
    //   996: istore #15
    //   998: aload #19
    //   1000: invokevirtual getMeasuredHeight : ()I
    //   1003: istore #14
    //   1005: aload #19
    //   1007: invokevirtual getBaseline : ()I
    //   1010: istore #16
    //   1012: aload_1
    //   1013: getfield u : I
    //   1016: istore #6
    //   1018: iload #6
    //   1020: ifle -> 1035
    //   1023: iload #6
    //   1025: iload #15
    //   1027: invokestatic max : (II)I
    //   1030: istore #7
    //   1032: goto -> 1039
    //   1035: iload #15
    //   1037: istore #7
    //   1039: aload_1
    //   1040: getfield v : I
    //   1043: istore #8
    //   1045: iload #7
    //   1047: istore #6
    //   1049: iload #8
    //   1051: ifle -> 1063
    //   1054: iload #8
    //   1056: iload #7
    //   1058: invokestatic min : (II)I
    //   1061: istore #6
    //   1063: aload_1
    //   1064: getfield x : I
    //   1067: istore #7
    //   1069: iload #7
    //   1071: ifle -> 1086
    //   1074: iload #7
    //   1076: iload #14
    //   1078: invokestatic max : (II)I
    //   1081: istore #7
    //   1083: goto -> 1093
    //   1086: iload #14
    //   1088: istore #7
    //   1090: goto -> 1083
    //   1093: aload_1
    //   1094: getfield y : I
    //   1097: istore #8
    //   1099: iload #7
    //   1101: istore #9
    //   1103: iload #8
    //   1105: ifle -> 1117
    //   1108: iload #8
    //   1110: iload #7
    //   1112: invokestatic min : (II)I
    //   1115: istore #9
    //   1117: iload #9
    //   1119: istore #8
    //   1121: iload #6
    //   1123: istore #7
    //   1125: aload #20
    //   1127: getfield k : I
    //   1130: iconst_1
    //   1131: invokestatic p : (II)Z
    //   1134: ifne -> 1216
    //   1137: iload #12
    //   1139: ifeq -> 1170
    //   1142: iload #10
    //   1144: ifeq -> 1170
    //   1147: aload_1
    //   1148: getfield W : F
    //   1151: fstore_3
    //   1152: iload #9
    //   1154: i2f
    //   1155: fload_3
    //   1156: fmul
    //   1157: ldc 0.5
    //   1159: fadd
    //   1160: f2i
    //   1161: istore #7
    //   1163: iload #9
    //   1165: istore #8
    //   1167: goto -> 1216
    //   1170: iload #9
    //   1172: istore #8
    //   1174: iload #6
    //   1176: istore #7
    //   1178: iload #13
    //   1180: ifeq -> 1216
    //   1183: iload #9
    //   1185: istore #8
    //   1187: iload #6
    //   1189: istore #7
    //   1191: iload #11
    //   1193: ifeq -> 1216
    //   1196: aload_1
    //   1197: getfield W : F
    //   1200: fstore_3
    //   1201: iload #6
    //   1203: i2f
    //   1204: fload_3
    //   1205: fdiv
    //   1206: ldc 0.5
    //   1208: fadd
    //   1209: f2i
    //   1210: istore #8
    //   1212: iload #6
    //   1214: istore #7
    //   1216: iload #15
    //   1218: iload #7
    //   1220: if_icmpne -> 1240
    //   1223: iload #14
    //   1225: iload #8
    //   1227: if_icmpeq -> 1233
    //   1230: goto -> 1240
    //   1233: iload #16
    //   1235: istore #4
    //   1237: goto -> 1322
    //   1240: iload #15
    //   1242: iload #7
    //   1244: if_icmpeq -> 1256
    //   1247: iload #7
    //   1249: ldc 1073741824
    //   1251: invokestatic makeMeasureSpec : (II)I
    //   1254: istore #4
    //   1256: iload #14
    //   1258: iload #8
    //   1260: if_icmpeq -> 1275
    //   1263: iload #8
    //   1265: ldc 1073741824
    //   1267: invokestatic makeMeasureSpec : (II)I
    //   1270: istore #5
    //   1272: goto -> 1275
    //   1275: aload #19
    //   1277: iload #4
    //   1279: iload #5
    //   1281: invokevirtual measure : (II)V
    //   1284: aload_1
    //   1285: iload #4
    //   1287: putfield G : I
    //   1290: aload_1
    //   1291: iload #5
    //   1293: putfield H : I
    //   1296: aload_1
    //   1297: iconst_0
    //   1298: putfield g : Z
    //   1301: aload #19
    //   1303: invokevirtual getMeasuredWidth : ()I
    //   1306: istore #7
    //   1308: aload #19
    //   1310: invokevirtual getMeasuredHeight : ()I
    //   1313: istore #8
    //   1315: aload #19
    //   1317: invokevirtual getBaseline : ()I
    //   1320: istore #4
    //   1322: iload #4
    //   1324: iconst_m1
    //   1325: if_icmpeq -> 1334
    //   1328: iconst_1
    //   1329: istore #17
    //   1331: goto -> 1337
    //   1334: iconst_0
    //   1335: istore #17
    //   1337: iload #7
    //   1339: aload_2
    //   1340: getfield c : I
    //   1343: if_icmpne -> 1364
    //   1346: iload #8
    //   1348: aload_2
    //   1349: getfield d : I
    //   1352: if_icmpeq -> 1358
    //   1355: goto -> 1364
    //   1358: iconst_0
    //   1359: istore #18
    //   1361: goto -> 1367
    //   1364: iconst_1
    //   1365: istore #18
    //   1367: aload_2
    //   1368: iload #18
    //   1370: putfield i : Z
    //   1373: aload #21
    //   1375: getfield c0 : Z
    //   1378: ifeq -> 1387
    //   1381: iconst_1
    //   1382: istore #17
    //   1384: goto -> 1387
    //   1387: iload #17
    //   1389: ifeq -> 1412
    //   1392: iload #4
    //   1394: iconst_m1
    //   1395: if_icmpeq -> 1412
    //   1398: aload_1
    //   1399: getfield a0 : I
    //   1402: iload #4
    //   1404: if_icmpeq -> 1412
    //   1407: aload_2
    //   1408: iconst_1
    //   1409: putfield i : Z
    //   1412: aload_2
    //   1413: iload #7
    //   1415: putfield e : I
    //   1418: aload_2
    //   1419: iload #8
    //   1421: putfield f : I
    //   1424: aload_2
    //   1425: iload #17
    //   1427: putfield h : Z
    //   1430: aload_2
    //   1431: iload #4
    //   1433: putfield g : I
    //   1436: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */