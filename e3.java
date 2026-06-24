public final class e3 implements Runnable {
  public final int b;
  
  public final Object c;
  
  public final void run() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: istore_3
    //   5: lconst_0
    //   6: lstore #7
    //   8: iconst_0
    //   9: istore_2
    //   10: iconst_0
    //   11: istore #4
    //   13: iload_3
    //   14: tableswitch default -> 144, 0 -> 2154, 1 -> 1882, 2 -> 1778, 3 -> 1761, 4 -> 1743, 5 -> 1665, 6 -> 1642, 7 -> 1585, 8 -> 1561, 9 -> 1540, 10 -> 1529, 11 -> 1496, 12 -> 1409, 13 -> 1382, 14 -> 1369, 15 -> 807, 16 -> 743, 17 -> 686, 18 -> 614, 19 -> 569, 20 -> 524, 21 -> 375, 22 -> 352, 23 -> 322, 24 -> 307, 25 -> 213, 26 -> 193, 27 -> 182, 28 -> 171
    //   144: aload_0
    //   145: getfield c : Ljava/lang/Object;
    //   148: checkcast java/lang/Runnable
    //   151: invokeinterface run : ()V
    //   156: goto -> 170
    //   159: astore #13
    //   161: ldc 'Executor'
    //   163: ldc 'Background execution failure.'
    //   165: aload #13
    //   167: invokestatic r : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    //   170: return
    //   171: aload_0
    //   172: getfield c : Ljava/lang/Object;
    //   175: checkcast gf1
    //   178: invokevirtual a : ()V
    //   181: return
    //   182: aload_0
    //   183: getfield c : Ljava/lang/Object;
    //   186: checkcast z91
    //   189: invokevirtual p : ()V
    //   192: return
    //   193: aload_0
    //   194: getfield c : Ljava/lang/Object;
    //   197: checkcast w91
    //   200: getfield c0 : Landroidx/recyclerview/widget/RecyclerView;
    //   203: astore #13
    //   205: aload #13
    //   207: aload #13
    //   209: invokevirtual focusableViewAvailable : (Landroid/view/View;)V
    //   212: return
    //   213: aload_0
    //   214: getfield c : Ljava/lang/Object;
    //   217: checkcast in/krosbits/musicolet/PlaylistActivity
    //   220: astore #13
    //   222: aload #13
    //   224: invokevirtual isFinishing : ()Z
    //   227: ifeq -> 233
    //   230: goto -> 306
    //   233: aload #13
    //   235: getfield R : Lss0;
    //   238: astore #14
    //   240: aload #14
    //   242: ifnull -> 306
    //   245: aload #14
    //   247: aload #13
    //   249: getfield Z : I
    //   252: invokevirtual l : (I)V
    //   255: aload #13
    //   257: getfield R : Lss0;
    //   260: aload #13
    //   262: getfield Y : I
    //   265: invokevirtual m : (I)V
    //   268: aload #13
    //   270: getfield R : Lss0;
    //   273: invokevirtual isShowing : ()Z
    //   276: ifne -> 287
    //   279: aload #13
    //   281: getfield R : Lss0;
    //   284: invokevirtual show : ()V
    //   287: aload #13
    //   289: getfield S : Lss0;
    //   292: invokevirtual isShowing : ()Z
    //   295: ifeq -> 306
    //   298: aload #13
    //   300: getfield S : Lss0;
    //   303: invokevirtual dismiss : ()V
    //   306: return
    //   307: new java/lang/RuntimeException
    //   310: dup
    //   311: aload_0
    //   312: getfield c : Ljava/lang/Object;
    //   315: checkcast java/lang/Exception
    //   318: invokespecial <init> : (Ljava/lang/Throwable;)V
    //   321: athrow
    //   322: aload_0
    //   323: getfield c : Ljava/lang/Object;
    //   326: checkcast tz0
    //   329: astore #13
    //   331: aload #13
    //   333: aload #13
    //   335: getfield b : Lrv1;
    //   338: invokevirtual c : (Lrv1;)V
    //   341: goto -> 351
    //   344: astore #13
    //   346: aload #13
    //   348: invokevirtual printStackTrace : ()V
    //   351: return
    //   352: aload_0
    //   353: getfield c : Ljava/lang/Object;
    //   356: checkcast in/krosbits/musicolet/MusicActivity
    //   359: astore #13
    //   361: aload #13
    //   363: getfield N0 : Lq6;
    //   366: ifnull -> 374
    //   369: aload #13
    //   371: invokevirtual t0 : ()V
    //   374: return
    //   375: aload_0
    //   376: getfield c : Ljava/lang/Object;
    //   379: checkcast in/krosbits/musicolet/MiniPlayerActivity
    //   382: astore #13
    //   384: aload #13
    //   386: getfield T : Lz3;
    //   389: ifnull -> 523
    //   392: aload #13
    //   394: getfield i0 : Z
    //   397: istore #6
    //   399: iload #6
    //   401: ifeq -> 523
    //   404: aload #13
    //   406: getfield z0 : Z
    //   409: ifne -> 499
    //   412: iload #6
    //   414: ifeq -> 499
    //   417: aload #13
    //   419: getfield S : Lhc;
    //   422: invokevirtual A : ()I
    //   425: istore_2
    //   426: aload #13
    //   428: getfield d0 : Landroid/widget/TextView;
    //   431: astore #14
    //   433: new java/lang/StringBuilder
    //   436: dup
    //   437: invokespecial <init> : ()V
    //   440: astore #15
    //   442: aload #15
    //   444: iload_2
    //   445: i2l
    //   446: iconst_0
    //   447: iconst_0
    //   448: invokestatic B : (JZI)Ljava/lang/String;
    //   451: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   454: pop
    //   455: aload #15
    //   457: ldc '/'
    //   459: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   462: pop
    //   463: aload #15
    //   465: aload #13
    //   467: getfield j0 : I
    //   470: i2l
    //   471: iconst_0
    //   472: iconst_0
    //   473: invokestatic B : (JZI)Ljava/lang/String;
    //   476: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   479: pop
    //   480: aload #14
    //   482: aload #15
    //   484: invokevirtual toString : ()Ljava/lang/String;
    //   487: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   490: aload #13
    //   492: getfield g0 : Landroid/widget/SeekBar;
    //   495: iload_2
    //   496: invokevirtual setProgress : (I)V
    //   499: aload #13
    //   501: getfield S : Lhc;
    //   504: invokevirtual J : ()Z
    //   507: ifeq -> 523
    //   510: aload #13
    //   512: getfield k0 : Landroid/os/Handler;
    //   515: aload_0
    //   516: ldc2_w 1000
    //   519: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   522: pop
    //   523: return
    //   524: aload_0
    //   525: getfield c : Ljava/lang/Object;
    //   528: checkcast ou0
    //   531: getfield c : Lqu0;
    //   534: astore #13
    //   536: aload #13
    //   538: getfield P : Lhv0;
    //   541: ifnull -> 568
    //   544: aload #13
    //   546: aconst_null
    //   547: putfield P : Lhv0;
    //   550: aload #13
    //   552: getfield f0 : Z
    //   555: ifeq -> 568
    //   558: aload #13
    //   560: aload #13
    //   562: getfield g0 : Z
    //   565: invokevirtual q : (Z)V
    //   568: return
    //   569: aload_0
    //   570: getfield c : Ljava/lang/Object;
    //   573: checkcast qu0
    //   576: astore #13
    //   578: aload #13
    //   580: iconst_1
    //   581: invokevirtual j : (Z)V
    //   584: aload #13
    //   586: getfield H : Landroidx/mediarouter/app/OverlayListView;
    //   589: invokevirtual requestLayout : ()V
    //   592: aload #13
    //   594: getfield H : Landroidx/mediarouter/app/OverlayListView;
    //   597: invokevirtual getViewTreeObserver : ()Landroid/view/ViewTreeObserver;
    //   600: new l7
    //   603: dup
    //   604: iconst_4
    //   605: aload #13
    //   607: invokespecial <init> : (ILjava/lang/Object;)V
    //   610: invokevirtual addOnGlobalLayoutListener : (Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    //   613: return
    //   614: aload_0
    //   615: getfield c : Ljava/lang/Object;
    //   618: checkcast in/krosbits/android/widgets/LyricsView
    //   621: astore #13
    //   623: aload #13
    //   625: getfield O0 : Lrq0;
    //   628: invokeinterface f : ()Z
    //   633: ifne -> 639
    //   636: goto -> 685
    //   639: aload #13
    //   641: invokevirtual v0 : ()V
    //   644: goto -> 685
    //   647: astore #14
    //   649: aload #14
    //   651: invokevirtual printStackTrace : ()V
    //   654: aload #13
    //   656: getfield R0 : Landroid/os/Handler;
    //   659: astore #14
    //   661: aload #14
    //   663: ifnull -> 685
    //   666: aload #13
    //   668: getfield X0 : Le3;
    //   671: astore #13
    //   673: aload #13
    //   675: ifnull -> 685
    //   678: aload #14
    //   680: aload #13
    //   682: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   685: return
    //   686: aload_0
    //   687: getfield c : Ljava/lang/Object;
    //   690: checkcast in/krosbits/musicolet/LyricsEditActivity
    //   693: astore #13
    //   695: aload #13
    //   697: getfield n0 : Z
    //   700: ifeq -> 742
    //   703: aload #13
    //   705: invokevirtual v0 : ()V
    //   708: aload #13
    //   710: getfield m0 : Lhc;
    //   713: invokevirtual J : ()Z
    //   716: ifeq -> 742
    //   719: aload #13
    //   721: getfield q0 : Landroid/os/Handler;
    //   724: aload_0
    //   725: ldc2_w 250
    //   728: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   731: pop
    //   732: goto -> 742
    //   735: astore #13
    //   737: aload #13
    //   739: invokevirtual printStackTrace : ()V
    //   742: return
    //   743: aload_0
    //   744: getfield c : Ljava/lang/Object;
    //   747: checkcast vz0
    //   750: getfield a : Ljava/lang/Object;
    //   753: astore #13
    //   755: aload #13
    //   757: monitorenter
    //   758: aload_0
    //   759: getfield c : Ljava/lang/Object;
    //   762: checkcast vz0
    //   765: getfield f : Ljava/lang/Object;
    //   768: astore #14
    //   770: aload_0
    //   771: getfield c : Ljava/lang/Object;
    //   774: checkcast vz0
    //   777: getstatic vz0.k : Ljava/lang/Object;
    //   780: putfield f : Ljava/lang/Object;
    //   783: aload #13
    //   785: monitorexit
    //   786: aload_0
    //   787: getfield c : Ljava/lang/Object;
    //   790: checkcast vz0
    //   793: aload #14
    //   795: invokevirtual e : (Ljava/lang/Object;)V
    //   798: return
    //   799: astore #14
    //   801: aload #13
    //   803: monitorexit
    //   804: aload #14
    //   806: athrow
    //   807: aload_0
    //   808: getfield c : Ljava/lang/Object;
    //   811: checkcast ij0
    //   814: astore #13
    //   816: aload #13
    //   818: getfield c : Lhe1;
    //   821: ifnull -> 1368
    //   824: invokestatic currentTimeMillis : ()J
    //   827: lstore #9
    //   829: aload #13
    //   831: getfield B : J
    //   834: lstore #11
    //   836: lload #11
    //   838: ldc2_w -9223372036854775808
    //   841: lcmp
    //   842: ifne -> 848
    //   845: goto -> 858
    //   848: lload #9
    //   850: lload #11
    //   852: lsub
    //   853: lstore #7
    //   855: goto -> 845
    //   858: aload #13
    //   860: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   863: invokevirtual getLayoutManager : ()Landroidx/recyclerview/widget/a;
    //   866: astore #14
    //   868: aload #13
    //   870: getfield A : Landroid/graphics/Rect;
    //   873: ifnonnull -> 888
    //   876: aload #13
    //   878: new android/graphics/Rect
    //   881: dup
    //   882: invokespecial <init> : ()V
    //   885: putfield A : Landroid/graphics/Rect;
    //   888: aload #14
    //   890: aload #13
    //   892: getfield c : Lhe1;
    //   895: getfield b : Landroid/view/View;
    //   898: aload #13
    //   900: getfield A : Landroid/graphics/Rect;
    //   903: invokevirtual n : (Landroid/view/View;Landroid/graphics/Rect;)V
    //   906: aload #14
    //   908: invokevirtual o : ()Z
    //   911: ifeq -> 1020
    //   914: aload #13
    //   916: getfield j : F
    //   919: aload #13
    //   921: getfield h : F
    //   924: fadd
    //   925: f2i
    //   926: istore_3
    //   927: iload_3
    //   928: aload #13
    //   930: getfield A : Landroid/graphics/Rect;
    //   933: getfield left : I
    //   936: isub
    //   937: aload #13
    //   939: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   942: invokevirtual getPaddingLeft : ()I
    //   945: isub
    //   946: istore_2
    //   947: aload #13
    //   949: getfield h : F
    //   952: fstore_1
    //   953: fload_1
    //   954: fconst_0
    //   955: fcmpg
    //   956: ifge -> 966
    //   959: iload_2
    //   960: ifge -> 966
    //   963: goto -> 1022
    //   966: fload_1
    //   967: fconst_0
    //   968: fcmpl
    //   969: ifle -> 1020
    //   972: aload #13
    //   974: getfield c : Lhe1;
    //   977: getfield b : Landroid/view/View;
    //   980: invokevirtual getWidth : ()I
    //   983: iload_3
    //   984: iadd
    //   985: aload #13
    //   987: getfield A : Landroid/graphics/Rect;
    //   990: getfield right : I
    //   993: iadd
    //   994: aload #13
    //   996: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   999: invokevirtual getWidth : ()I
    //   1002: aload #13
    //   1004: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   1007: invokevirtual getPaddingRight : ()I
    //   1010: isub
    //   1011: isub
    //   1012: istore_2
    //   1013: iload_2
    //   1014: ifle -> 1020
    //   1017: goto -> 963
    //   1020: iconst_0
    //   1021: istore_2
    //   1022: iload #4
    //   1024: istore_3
    //   1025: aload #14
    //   1027: invokevirtual p : ()Z
    //   1030: ifeq -> 1153
    //   1033: aload #13
    //   1035: getfield k : F
    //   1038: aload #13
    //   1040: getfield i : F
    //   1043: fadd
    //   1044: f2i
    //   1045: istore #5
    //   1047: iload #5
    //   1049: aload #13
    //   1051: getfield A : Landroid/graphics/Rect;
    //   1054: getfield top : I
    //   1057: isub
    //   1058: aload #13
    //   1060: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   1063: invokevirtual getPaddingTop : ()I
    //   1066: isub
    //   1067: istore_3
    //   1068: aload #13
    //   1070: getfield i : F
    //   1073: fstore_1
    //   1074: fload_1
    //   1075: fconst_0
    //   1076: fcmpg
    //   1077: ifge -> 1087
    //   1080: iload_3
    //   1081: ifge -> 1087
    //   1084: goto -> 1153
    //   1087: iload #4
    //   1089: istore_3
    //   1090: fload_1
    //   1091: fconst_0
    //   1092: fcmpl
    //   1093: ifle -> 1153
    //   1096: aload #13
    //   1098: getfield c : Lhe1;
    //   1101: getfield b : Landroid/view/View;
    //   1104: invokevirtual getHeight : ()I
    //   1107: iload #5
    //   1109: iadd
    //   1110: aload #13
    //   1112: getfield A : Landroid/graphics/Rect;
    //   1115: getfield bottom : I
    //   1118: iadd
    //   1119: aload #13
    //   1121: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   1124: invokevirtual getHeight : ()I
    //   1127: aload #13
    //   1129: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   1132: invokevirtual getPaddingBottom : ()I
    //   1135: isub
    //   1136: isub
    //   1137: istore #5
    //   1139: iload #4
    //   1141: istore_3
    //   1142: iload #5
    //   1144: ifle -> 1153
    //   1147: iload #5
    //   1149: istore_3
    //   1150: goto -> 1084
    //   1153: iload_2
    //   1154: istore #4
    //   1156: iload_2
    //   1157: ifeq -> 1210
    //   1160: aload #13
    //   1162: getfield m : Lgj0;
    //   1165: astore #15
    //   1167: aload #13
    //   1169: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   1172: astore #14
    //   1174: aload #13
    //   1176: getfield c : Lhe1;
    //   1179: getfield b : Landroid/view/View;
    //   1182: invokevirtual getWidth : ()I
    //   1185: istore #4
    //   1187: aload #13
    //   1189: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   1192: invokevirtual getWidth : ()I
    //   1195: pop
    //   1196: aload #15
    //   1198: aload #14
    //   1200: iload #4
    //   1202: iload_2
    //   1203: lload #7
    //   1205: invokevirtual j : (Landroidx/recyclerview/widget/RecyclerView;IIJ)I
    //   1208: istore #4
    //   1210: iload_3
    //   1211: ifeq -> 1264
    //   1214: aload #13
    //   1216: getfield m : Lgj0;
    //   1219: astore #15
    //   1221: aload #13
    //   1223: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   1226: astore #14
    //   1228: aload #13
    //   1230: getfield c : Lhe1;
    //   1233: getfield b : Landroid/view/View;
    //   1236: invokevirtual getHeight : ()I
    //   1239: istore_2
    //   1240: aload #13
    //   1242: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   1245: invokevirtual getHeight : ()I
    //   1248: pop
    //   1249: aload #15
    //   1251: aload #14
    //   1253: iload_2
    //   1254: iload_3
    //   1255: lload #7
    //   1257: invokevirtual j : (Landroidx/recyclerview/widget/RecyclerView;IIJ)I
    //   1260: istore_3
    //   1261: goto -> 1264
    //   1264: iload #4
    //   1266: ifne -> 1287
    //   1269: iload_3
    //   1270: ifeq -> 1276
    //   1273: goto -> 1287
    //   1276: aload #13
    //   1278: ldc2_w -9223372036854775808
    //   1281: putfield B : J
    //   1284: goto -> 1368
    //   1287: aload #13
    //   1289: getfield B : J
    //   1292: ldc2_w -9223372036854775808
    //   1295: lcmp
    //   1296: ifne -> 1306
    //   1299: aload #13
    //   1301: lload #9
    //   1303: putfield B : J
    //   1306: aload #13
    //   1308: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   1311: iload #4
    //   1313: iload_3
    //   1314: invokevirtual scrollBy : (II)V
    //   1317: aload #13
    //   1319: getfield c : Lhe1;
    //   1322: astore #14
    //   1324: aload #14
    //   1326: ifnull -> 1336
    //   1329: aload #13
    //   1331: aload #14
    //   1333: invokevirtual o : (Lhe1;)V
    //   1336: aload #13
    //   1338: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   1341: aload #13
    //   1343: getfield s : Le3;
    //   1346: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)Z
    //   1349: pop
    //   1350: aload #13
    //   1352: getfield r : Landroidx/recyclerview/widget/RecyclerView;
    //   1355: astore #14
    //   1357: getstatic v22.a : Ljava/util/WeakHashMap;
    //   1360: astore #13
    //   1362: aload #14
    //   1364: aload_0
    //   1365: invokevirtual postOnAnimation : (Ljava/lang/Runnable;)V
    //   1368: return
    //   1369: aload_0
    //   1370: getfield c : Ljava/lang/Object;
    //   1373: checkcast lb0
    //   1376: iconst_1
    //   1377: invokevirtual z : (Z)Z
    //   1380: pop
    //   1381: return
    //   1382: aload_0
    //   1383: getfield c : Ljava/lang/Object;
    //   1386: checkcast ua0
    //   1389: astore #13
    //   1391: aload #13
    //   1393: getfield N : Lsa0;
    //   1396: ifnull -> 1408
    //   1399: aload #13
    //   1401: invokevirtual L : ()Lsa0;
    //   1404: invokevirtual getClass : ()Ljava/lang/Class;
    //   1407: pop
    //   1408: return
    //   1409: aload_0
    //   1410: getfield c : Ljava/lang/Object;
    //   1413: checkcast r70
    //   1416: astore #13
    //   1418: aload #13
    //   1420: getfield z : Landroid/animation/ValueAnimator;
    //   1423: astore #14
    //   1425: aload #13
    //   1427: getfield A : I
    //   1430: istore_2
    //   1431: iload_2
    //   1432: iconst_1
    //   1433: if_icmpeq -> 1444
    //   1436: iload_2
    //   1437: iconst_2
    //   1438: if_icmpeq -> 1449
    //   1441: goto -> 1495
    //   1444: aload #14
    //   1446: invokevirtual cancel : ()V
    //   1449: aload #13
    //   1451: iconst_3
    //   1452: putfield A : I
    //   1455: aload #14
    //   1457: iconst_2
    //   1458: newarray float
    //   1460: dup
    //   1461: iconst_0
    //   1462: aload #14
    //   1464: invokevirtual getAnimatedValue : ()Ljava/lang/Object;
    //   1467: checkcast java/lang/Float
    //   1470: invokevirtual floatValue : ()F
    //   1473: fastore
    //   1474: dup
    //   1475: iconst_1
    //   1476: fconst_0
    //   1477: fastore
    //   1478: invokevirtual setFloatValues : ([F)V
    //   1481: aload #14
    //   1483: ldc2_w 500
    //   1486: invokevirtual setDuration : (J)Landroid/animation/ValueAnimator;
    //   1489: pop
    //   1490: aload #14
    //   1492: invokevirtual start : ()V
    //   1495: return
    //   1496: aload_0
    //   1497: getfield c : Ljava/lang/Object;
    //   1500: checkcast w60
    //   1503: astore #13
    //   1505: aload #13
    //   1507: getfield s : Z
    //   1510: ifeq -> 1528
    //   1513: aload #13
    //   1515: invokevirtual d0 : ()V
    //   1518: goto -> 1528
    //   1521: astore #13
    //   1523: aload #13
    //   1525: invokevirtual printStackTrace : ()V
    //   1528: return
    //   1529: aload_0
    //   1530: getfield c : Ljava/lang/Object;
    //   1533: checkcast l30
    //   1536: invokevirtual M0 : ()V
    //   1539: return
    //   1540: aload_0
    //   1541: getfield c : Ljava/lang/Object;
    //   1544: checkcast y10
    //   1547: astore #13
    //   1549: aload #13
    //   1551: aconst_null
    //   1552: putfield n : Le3;
    //   1555: aload #13
    //   1557: invokevirtual drawableStateChanged : ()V
    //   1560: return
    //   1561: aload_0
    //   1562: getfield c : Ljava/lang/Object;
    //   1565: checkcast wz
    //   1568: astore #14
    //   1570: aload #14
    //   1572: monitorenter
    //   1573: aload #14
    //   1575: monitorexit
    //   1576: return
    //   1577: astore #13
    //   1579: aload #14
    //   1581: monitorexit
    //   1582: aload #13
    //   1584: athrow
    //   1585: aload_0
    //   1586: getfield c : Ljava/lang/Object;
    //   1589: checkcast jz
    //   1592: astore #13
    //   1594: aload #13
    //   1596: getfield C : J
    //   1599: invokestatic currentTimeMillis : ()J
    //   1602: lsub
    //   1603: l2i
    //   1604: istore_2
    //   1605: iload_2
    //   1606: iflt -> 1641
    //   1609: aload #13
    //   1611: getfield f : Landroid/widget/TextView;
    //   1614: iload_2
    //   1615: i2l
    //   1616: iconst_0
    //   1617: iconst_0
    //   1618: invokestatic B : (JZI)Ljava/lang/String;
    //   1621: invokevirtual setText : (Ljava/lang/CharSequence;)V
    //   1624: aload #13
    //   1626: getfield e : Landroid/os/Handler;
    //   1629: aload #13
    //   1631: getfield D : Le3;
    //   1634: ldc2_w 1000
    //   1637: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   1640: pop
    //   1641: return
    //   1642: aload_0
    //   1643: getfield c : Ljava/lang/Object;
    //   1646: checkcast vy
    //   1649: astore #13
    //   1651: aload #13
    //   1653: getfield d0 : Lty;
    //   1656: aload #13
    //   1658: getfield l0 : Landroid/app/Dialog;
    //   1661: invokevirtual onDismiss : (Landroid/content/DialogInterface;)V
    //   1664: return
    //   1665: aload_0
    //   1666: getfield c : Ljava/lang/Object;
    //   1669: checkcast ah
    //   1672: astore #13
    //   1674: aload #13
    //   1676: iconst_0
    //   1677: putfield c : Z
    //   1680: aload #13
    //   1682: getfield e : Ljava/lang/Object;
    //   1685: checkcast com/google/android/material/bottomsheet/BottomSheetBehavior
    //   1688: astore #14
    //   1690: aload #14
    //   1692: getfield O : Ly22;
    //   1695: astore #15
    //   1697: aload #15
    //   1699: ifnull -> 1723
    //   1702: aload #15
    //   1704: invokevirtual f : ()Z
    //   1707: ifeq -> 1723
    //   1710: aload #13
    //   1712: aload #13
    //   1714: getfield b : I
    //   1717: invokevirtual c : (I)V
    //   1720: goto -> 1742
    //   1723: aload #14
    //   1725: getfield N : I
    //   1728: iconst_2
    //   1729: if_icmpne -> 1742
    //   1732: aload #14
    //   1734: aload #13
    //   1736: getfield b : I
    //   1739: invokevirtual J : (I)V
    //   1742: return
    //   1743: new java/lang/NullPointerException
    //   1746: dup
    //   1747: aload_0
    //   1748: getfield c : Ljava/lang/Object;
    //   1751: checkcast java/lang/StringBuilder
    //   1754: invokevirtual toString : ()Ljava/lang/String;
    //   1757: invokespecial <init> : (Ljava/lang/String;)V
    //   1760: athrow
    //   1761: getstatic kd.H : Landroid/os/Handler;
    //   1764: new e
    //   1767: dup
    //   1768: iconst_4
    //   1769: aload_0
    //   1770: invokespecial <init> : (ILjava/lang/Object;)V
    //   1773: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   1776: pop
    //   1777: return
    //   1778: aload_0
    //   1779: getfield c : Ljava/lang/Object;
    //   1782: checkcast pc
    //   1785: astore #13
    //   1787: aload #13
    //   1789: getfield N : Landroid/os/Handler;
    //   1792: astore #15
    //   1794: aload #15
    //   1796: aload_0
    //   1797: invokevirtual removeCallbacks : (Ljava/lang/Runnable;)V
    //   1800: aload #13
    //   1802: getfield G : Z
    //   1805: ifeq -> 1881
    //   1808: aload #13
    //   1810: getfield M : [Ljava/lang/String;
    //   1813: astore #14
    //   1815: aload #14
    //   1817: arraylength
    //   1818: istore_3
    //   1819: iload_2
    //   1820: iload_3
    //   1821: if_icmpge -> 1855
    //   1824: aload #13
    //   1826: aload #14
    //   1828: iload_2
    //   1829: aaload
    //   1830: invokevirtual checkSelfPermission : (Ljava/lang/String;)I
    //   1833: ifeq -> 1849
    //   1836: aload #15
    //   1838: aload_0
    //   1839: ldc2_w 1000
    //   1842: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   1845: pop
    //   1846: goto -> 1881
    //   1849: iinc #2, 1
    //   1852: goto -> 1819
    //   1855: aload #13
    //   1857: aload #13
    //   1859: invokevirtual getIntent : ()Landroid/content/Intent;
    //   1862: ldc_w 67108864
    //   1865: invokevirtual addFlags : (I)Landroid/content/Intent;
    //   1868: invokevirtual startActivity : (Landroid/content/Intent;)V
    //   1871: goto -> 1881
    //   1874: astore #13
    //   1876: aload #13
    //   1878: invokevirtual printStackTrace : ()V
    //   1881: return
    //   1882: aload_0
    //   1883: getfield c : Ljava/lang/Object;
    //   1886: checkcast go0
    //   1889: astore #16
    //   1891: aload #16
    //   1893: getfield e : Ly10;
    //   1896: astore #13
    //   1898: aload #16
    //   1900: getfield b : Lra;
    //   1903: astore #15
    //   1905: aload #16
    //   1907: getfield q : Z
    //   1910: ifne -> 1916
    //   1913: goto -> 2153
    //   1916: aload #16
    //   1918: getfield o : Z
    //   1921: ifeq -> 1965
    //   1924: aload #16
    //   1926: iconst_0
    //   1927: putfield o : Z
    //   1930: invokestatic currentAnimationTimeMillis : ()J
    //   1933: lstore #7
    //   1935: aload #15
    //   1937: lload #7
    //   1939: putfield e : J
    //   1942: aload #15
    //   1944: ldc2_w -1
    //   1947: putfield g : J
    //   1950: aload #15
    //   1952: lload #7
    //   1954: putfield f : J
    //   1957: aload #15
    //   1959: ldc_w 0.5
    //   1962: putfield h : F
    //   1965: aload #15
    //   1967: getfield g : J
    //   1970: lconst_0
    //   1971: lcmp
    //   1972: ifle -> 1997
    //   1975: invokestatic currentAnimationTimeMillis : ()J
    //   1978: aload #15
    //   1980: getfield g : J
    //   1983: aload #15
    //   1985: getfield i : I
    //   1988: i2l
    //   1989: ladd
    //   1990: lcmp
    //   1991: ifle -> 1997
    //   1994: goto -> 2005
    //   1997: aload #16
    //   1999: invokevirtual e : ()Z
    //   2002: ifne -> 2014
    //   2005: aload #16
    //   2007: iconst_0
    //   2008: putfield q : Z
    //   2011: goto -> 2153
    //   2014: aload #16
    //   2016: getfield p : Z
    //   2019: ifeq -> 2059
    //   2022: aload #16
    //   2024: iconst_0
    //   2025: putfield p : Z
    //   2028: invokestatic uptimeMillis : ()J
    //   2031: lstore #7
    //   2033: lload #7
    //   2035: lload #7
    //   2037: iconst_3
    //   2038: fconst_0
    //   2039: fconst_0
    //   2040: iconst_0
    //   2041: invokestatic obtain : (JJIFFI)Landroid/view/MotionEvent;
    //   2044: astore #14
    //   2046: aload #13
    //   2048: aload #14
    //   2050: invokevirtual onTouchEvent : (Landroid/view/MotionEvent;)Z
    //   2053: pop
    //   2054: aload #14
    //   2056: invokevirtual recycle : ()V
    //   2059: aload #15
    //   2061: getfield f : J
    //   2064: lconst_0
    //   2065: lcmp
    //   2066: ifeq -> 2147
    //   2069: invokestatic currentAnimationTimeMillis : ()J
    //   2072: lstore #7
    //   2074: aload #15
    //   2076: lload #7
    //   2078: invokevirtual a : (J)F
    //   2081: fstore_1
    //   2082: aload #15
    //   2084: getfield f : J
    //   2087: lstore #9
    //   2089: aload #15
    //   2091: lload #7
    //   2093: putfield f : J
    //   2096: lload #7
    //   2098: lload #9
    //   2100: lsub
    //   2101: l2f
    //   2102: fload_1
    //   2103: ldc_w 4.0
    //   2106: fmul
    //   2107: ldc_w -4.0
    //   2110: fload_1
    //   2111: fmul
    //   2112: fload_1
    //   2113: fmul
    //   2114: fadd
    //   2115: fmul
    //   2116: aload #15
    //   2118: getfield d : F
    //   2121: fmul
    //   2122: f2i
    //   2123: istore_2
    //   2124: aload #16
    //   2126: getfield s : Ly10;
    //   2129: iload_2
    //   2130: invokevirtual scrollListBy : (I)V
    //   2133: getstatic v22.a : Ljava/util/WeakHashMap;
    //   2136: astore #14
    //   2138: aload #13
    //   2140: aload_0
    //   2141: invokevirtual postOnAnimation : (Ljava/lang/Runnable;)V
    //   2144: goto -> 2153
    //   2147: ldc_w 'Cannot compute scroll delta before calling start()'
    //   2150: invokestatic f : (Ljava/lang/String;)V
    //   2153: return
    //   2154: aload_0
    //   2155: getfield c : Ljava/lang/Object;
    //   2158: checkcast in/krosbits/android/widgets/AdvanceSeekbar
    //   2161: astore #14
    //   2163: aload #14
    //   2165: getfield o : Z
    //   2168: ifeq -> 2338
    //   2171: aload #14
    //   2173: getfield s : Lf3;
    //   2176: astore #13
    //   2178: aload #13
    //   2180: ifnull -> 2338
    //   2183: aload #13
    //   2185: checkcast z40
    //   2188: astore #13
    //   2190: aload #14
    //   2192: invokevirtual getTag : ()Ljava/lang/Object;
    //   2195: astore #14
    //   2197: aload #14
    //   2199: instanceof java/lang/Integer
    //   2202: ifeq -> 2338
    //   2205: aload #14
    //   2207: checkcast java/lang/Integer
    //   2210: invokevirtual intValue : ()I
    //   2213: istore_2
    //   2214: new java/lang/StringBuilder
    //   2217: dup
    //   2218: getstatic androidx/recyclerview/widget/dVrV/jLnXOLx.iXUKzefcgneRdcF : Ljava/lang/String;
    //   2221: invokespecial <init> : (Ljava/lang/String;)V
    //   2224: astore #14
    //   2226: aload #14
    //   2228: iload_2
    //   2229: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   2232: pop
    //   2233: iconst_0
    //   2234: aload #14
    //   2236: invokevirtual toString : ()Ljava/lang/String;
    //   2239: iconst_1
    //   2240: invokestatic P0 : (ILjava/lang/CharSequence;Z)V
    //   2243: aload #13
    //   2245: invokevirtual P : ()Landroid/content/Context;
    //   2248: astore #15
    //   2250: aload #13
    //   2252: getfield f0 : [Landroid/widget/TextView;
    //   2255: iload_2
    //   2256: aaload
    //   2257: invokevirtual getText : ()Ljava/lang/CharSequence;
    //   2260: invokeinterface toString : ()Ljava/lang/String;
    //   2265: astore #14
    //   2267: aload #13
    //   2269: aload #13
    //   2271: getfield e0 : [Lin/krosbits/android/widgets/AdvanceSeekbar;
    //   2274: iload_2
    //   2275: aaload
    //   2276: invokevirtual getProgress : ()I
    //   2279: invokevirtual D0 : (I)S
    //   2282: pop
    //   2283: new ms0
    //   2286: dup
    //   2287: aload #15
    //   2289: invokespecial <init> : (Landroid/content/Context;)V
    //   2292: astore #13
    //   2294: aload #13
    //   2296: ldc_w 2131492969
    //   2299: iconst_0
    //   2300: invokevirtual e : (IZ)V
    //   2303: aload #13
    //   2305: aload #14
    //   2307: putfield f : Ljava/lang/CharSequence;
    //   2310: aload #13
    //   2312: ldc_w 2131887030
    //   2315: invokevirtual n : (I)V
    //   2318: aload #13
    //   2320: ldc_w 2131886278
    //   2323: invokevirtual k : (I)V
    //   2326: new ss0
    //   2329: dup
    //   2330: aload #13
    //   2332: invokespecial <init> : (Lms0;)V
    //   2335: invokevirtual show : ()V
    //   2338: return
    //   2339: astore #13
    //   2341: goto -> 374
    // Exception table:
    //   from	to	target	type
    //   144	156	159	java/lang/Exception
    //   322	341	344	finally
    //   369	374	2339	finally
    //   623	636	647	finally
    //   639	644	647	finally
    //   695	732	735	finally
    //   758	786	799	finally
    //   801	804	799	finally
    //   1513	1518	1521	finally
    //   1573	1576	1577	finally
    //   1579	1582	1577	finally
    //   1794	1819	1874	finally
    //   1824	1846	1874	finally
    //   1855	1871	1874	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\e3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */