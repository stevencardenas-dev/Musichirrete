import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

public final class nw1 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
  public kw1 b;
  
  public ViewGroup c;
  
  public final boolean onPreDraw() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Lkw1;
    //   4: astore #11
    //   6: aload_0
    //   7: getfield c : Landroid/view/ViewGroup;
    //   10: astore #10
    //   12: aload #10
    //   14: invokevirtual getViewTreeObserver : ()Landroid/view/ViewTreeObserver;
    //   17: aload_0
    //   18: invokevirtual removeOnPreDrawListener : (Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
    //   21: aload #10
    //   23: aload_0
    //   24: invokevirtual removeOnAttachStateChangeListener : (Landroid/view/View$OnAttachStateChangeListener;)V
    //   27: getstatic ow1.c : Ljava/util/ArrayList;
    //   30: aload #10
    //   32: invokevirtual remove : (Ljava/lang/Object;)Z
    //   35: istore #6
    //   37: iconst_1
    //   38: istore_2
    //   39: iload #6
    //   41: ifne -> 46
    //   44: iconst_1
    //   45: ireturn
    //   46: invokestatic b : ()Lb9;
    //   49: astore #12
    //   51: aload #12
    //   53: aload #10
    //   55: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   58: checkcast java/util/ArrayList
    //   61: astore #8
    //   63: aload #8
    //   65: ifnonnull -> 101
    //   68: new java/util/ArrayList
    //   71: dup
    //   72: invokespecial <init> : ()V
    //   75: astore #7
    //   77: aload #12
    //   79: aload #10
    //   81: aload #7
    //   83: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   86: pop
    //   87: aconst_null
    //   88: astore #9
    //   90: aload #7
    //   92: astore #8
    //   94: aload #9
    //   96: astore #7
    //   98: goto -> 124
    //   101: aload #8
    //   103: astore #7
    //   105: aload #8
    //   107: invokevirtual size : ()I
    //   110: ifle -> 87
    //   113: new java/util/ArrayList
    //   116: dup
    //   117: aload #8
    //   119: invokespecial <init> : (Ljava/util/Collection;)V
    //   122: astore #7
    //   124: aload #8
    //   126: aload #11
    //   128: invokevirtual add : (Ljava/lang/Object;)Z
    //   131: pop
    //   132: aload #11
    //   134: new mw1
    //   137: dup
    //   138: aload_0
    //   139: aload #12
    //   141: invokespecial <init> : (Lnw1;Lb9;)V
    //   144: invokevirtual a : (Ljw1;)V
    //   147: aload #11
    //   149: aload #10
    //   151: iconst_0
    //   152: invokevirtual h : (Landroid/view/ViewGroup;Z)V
    //   155: aload #7
    //   157: ifnull -> 197
    //   160: aload #7
    //   162: invokevirtual size : ()I
    //   165: istore_3
    //   166: iconst_0
    //   167: istore_1
    //   168: iload_1
    //   169: iload_3
    //   170: if_icmpge -> 197
    //   173: aload #7
    //   175: iload_1
    //   176: invokevirtual get : (I)Ljava/lang/Object;
    //   179: astore #8
    //   181: iinc #1, 1
    //   184: aload #8
    //   186: checkcast kw1
    //   189: aload #10
    //   191: invokevirtual B : (Landroid/view/View;)V
    //   194: goto -> 168
    //   197: aload #11
    //   199: new java/util/ArrayList
    //   202: dup
    //   203: invokespecial <init> : ()V
    //   206: putfield n : Ljava/util/ArrayList;
    //   209: aload #11
    //   211: new java/util/ArrayList
    //   214: dup
    //   215: invokespecial <init> : ()V
    //   218: putfield o : Ljava/util/ArrayList;
    //   221: aload #11
    //   223: getfield j : Ln2;
    //   226: astore #12
    //   228: aload #11
    //   230: getfield k : Ln2;
    //   233: astore #9
    //   235: new b9
    //   238: dup
    //   239: aload #12
    //   241: getfield c : Ljava/lang/Object;
    //   244: checkcast b9
    //   247: invokespecial <init> : (Lzm1;)V
    //   250: astore #8
    //   252: new b9
    //   255: dup
    //   256: aload #9
    //   258: getfield c : Ljava/lang/Object;
    //   261: checkcast b9
    //   264: invokespecial <init> : (Lzm1;)V
    //   267: astore #7
    //   269: iconst_0
    //   270: istore_3
    //   271: iload_2
    //   272: istore_1
    //   273: aload #11
    //   275: getfield m : [I
    //   278: astore #13
    //   280: iload_3
    //   281: aload #13
    //   283: arraylength
    //   284: if_icmpge -> 978
    //   287: aload #13
    //   289: iload_3
    //   290: iaload
    //   291: istore_2
    //   292: iload_2
    //   293: iload_1
    //   294: if_icmpeq -> 857
    //   297: iload_2
    //   298: iconst_2
    //   299: if_icmpeq -> 679
    //   302: iload_2
    //   303: iconst_3
    //   304: if_icmpeq -> 501
    //   307: iload_2
    //   308: iconst_4
    //   309: if_icmpeq -> 319
    //   312: iload_1
    //   313: istore_2
    //   314: iload_2
    //   315: istore_1
    //   316: goto -> 972
    //   319: aload #12
    //   321: getfield f : Ljava/lang/Object;
    //   324: checkcast sp0
    //   327: astore #17
    //   329: aload #9
    //   331: getfield f : Ljava/lang/Object;
    //   334: checkcast sp0
    //   337: astore #16
    //   339: aload #17
    //   341: invokevirtual e : ()I
    //   344: istore #5
    //   346: iconst_0
    //   347: istore #4
    //   349: iload_1
    //   350: istore_2
    //   351: iload #4
    //   353: iload #5
    //   355: if_icmpge -> 314
    //   358: aload #17
    //   360: iload #4
    //   362: invokevirtual f : (I)Ljava/lang/Object;
    //   365: checkcast android/view/View
    //   368: astore #15
    //   370: aload #15
    //   372: ifnull -> 495
    //   375: aload #11
    //   377: aload #15
    //   379: invokevirtual v : (Landroid/view/View;)Z
    //   382: ifeq -> 495
    //   385: aload #16
    //   387: aload #17
    //   389: iload #4
    //   391: invokevirtual c : (I)J
    //   394: invokevirtual b : (J)Ljava/lang/Object;
    //   397: checkcast android/view/View
    //   400: astore #18
    //   402: aload #18
    //   404: ifnull -> 492
    //   407: aload #11
    //   409: aload #18
    //   411: invokevirtual v : (Landroid/view/View;)Z
    //   414: ifeq -> 492
    //   417: aload #8
    //   419: aload #15
    //   421: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   424: checkcast tw1
    //   427: astore #14
    //   429: aload #7
    //   431: aload #18
    //   433: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   436: checkcast tw1
    //   439: astore #13
    //   441: aload #14
    //   443: ifnull -> 492
    //   446: aload #13
    //   448: ifnull -> 492
    //   451: aload #11
    //   453: getfield n : Ljava/util/ArrayList;
    //   456: aload #14
    //   458: invokevirtual add : (Ljava/lang/Object;)Z
    //   461: pop
    //   462: aload #11
    //   464: getfield o : Ljava/util/ArrayList;
    //   467: aload #13
    //   469: invokevirtual add : (Ljava/lang/Object;)Z
    //   472: pop
    //   473: aload #8
    //   475: aload #15
    //   477: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   480: pop
    //   481: aload #7
    //   483: aload #18
    //   485: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   488: pop
    //   489: goto -> 495
    //   492: goto -> 495
    //   495: iinc #4, 1
    //   498: goto -> 349
    //   501: iload_1
    //   502: istore_2
    //   503: aload #12
    //   505: getfield e : Ljava/lang/Object;
    //   508: checkcast android/util/SparseArray
    //   511: astore #17
    //   513: aload #9
    //   515: getfield e : Ljava/lang/Object;
    //   518: checkcast android/util/SparseArray
    //   521: astore #16
    //   523: aload #17
    //   525: invokevirtual size : ()I
    //   528: istore #5
    //   530: iconst_0
    //   531: istore #4
    //   533: iload_2
    //   534: istore_1
    //   535: iload #4
    //   537: iload #5
    //   539: if_icmpge -> 972
    //   542: aload #17
    //   544: iload #4
    //   546: invokevirtual valueAt : (I)Ljava/lang/Object;
    //   549: checkcast android/view/View
    //   552: astore #13
    //   554: aload #13
    //   556: ifnull -> 673
    //   559: aload #11
    //   561: aload #13
    //   563: invokevirtual v : (Landroid/view/View;)Z
    //   566: ifeq -> 673
    //   569: aload #16
    //   571: aload #17
    //   573: iload #4
    //   575: invokevirtual keyAt : (I)I
    //   578: invokevirtual get : (I)Ljava/lang/Object;
    //   581: checkcast android/view/View
    //   584: astore #15
    //   586: aload #15
    //   588: ifnull -> 673
    //   591: aload #11
    //   593: aload #15
    //   595: invokevirtual v : (Landroid/view/View;)Z
    //   598: ifeq -> 673
    //   601: aload #8
    //   603: aload #13
    //   605: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   608: checkcast tw1
    //   611: astore #14
    //   613: aload #7
    //   615: aload #15
    //   617: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   620: checkcast tw1
    //   623: astore #18
    //   625: aload #14
    //   627: ifnull -> 673
    //   630: aload #18
    //   632: ifnull -> 673
    //   635: aload #11
    //   637: getfield n : Ljava/util/ArrayList;
    //   640: aload #14
    //   642: invokevirtual add : (Ljava/lang/Object;)Z
    //   645: pop
    //   646: aload #11
    //   648: getfield o : Ljava/util/ArrayList;
    //   651: aload #18
    //   653: invokevirtual add : (Ljava/lang/Object;)Z
    //   656: pop
    //   657: aload #8
    //   659: aload #13
    //   661: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   664: pop
    //   665: aload #7
    //   667: aload #15
    //   669: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   672: pop
    //   673: iinc #4, 1
    //   676: goto -> 533
    //   679: iload_1
    //   680: istore_2
    //   681: aload #12
    //   683: getfield g : Ljava/lang/Object;
    //   686: checkcast b9
    //   689: astore #15
    //   691: aload #9
    //   693: getfield g : Ljava/lang/Object;
    //   696: checkcast b9
    //   699: astore #17
    //   701: aload #15
    //   703: getfield e : I
    //   706: istore #5
    //   708: iconst_0
    //   709: istore #4
    //   711: iload_2
    //   712: istore_1
    //   713: iload #4
    //   715: iload #5
    //   717: if_icmpge -> 972
    //   720: aload #15
    //   722: iload #4
    //   724: invokevirtual i : (I)Ljava/lang/Object;
    //   727: checkcast android/view/View
    //   730: astore #13
    //   732: aload #13
    //   734: ifnull -> 851
    //   737: aload #11
    //   739: aload #13
    //   741: invokevirtual v : (Landroid/view/View;)Z
    //   744: ifeq -> 851
    //   747: aload #17
    //   749: aload #15
    //   751: iload #4
    //   753: invokevirtual f : (I)Ljava/lang/Object;
    //   756: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   759: checkcast android/view/View
    //   762: astore #18
    //   764: aload #18
    //   766: ifnull -> 851
    //   769: aload #11
    //   771: aload #18
    //   773: invokevirtual v : (Landroid/view/View;)Z
    //   776: ifeq -> 851
    //   779: aload #8
    //   781: aload #13
    //   783: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   786: checkcast tw1
    //   789: astore #14
    //   791: aload #7
    //   793: aload #18
    //   795: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   798: checkcast tw1
    //   801: astore #16
    //   803: aload #14
    //   805: ifnull -> 851
    //   808: aload #16
    //   810: ifnull -> 851
    //   813: aload #11
    //   815: getfield n : Ljava/util/ArrayList;
    //   818: aload #14
    //   820: invokevirtual add : (Ljava/lang/Object;)Z
    //   823: pop
    //   824: aload #11
    //   826: getfield o : Ljava/util/ArrayList;
    //   829: aload #16
    //   831: invokevirtual add : (Ljava/lang/Object;)Z
    //   834: pop
    //   835: aload #8
    //   837: aload #13
    //   839: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   842: pop
    //   843: aload #7
    //   845: aload #18
    //   847: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   850: pop
    //   851: iinc #4, 1
    //   854: goto -> 711
    //   857: iload_1
    //   858: istore_2
    //   859: aload #8
    //   861: getfield e : I
    //   864: iconst_1
    //   865: isub
    //   866: istore #4
    //   868: iload_2
    //   869: istore_1
    //   870: iload #4
    //   872: iflt -> 972
    //   875: aload #8
    //   877: iload #4
    //   879: invokevirtual f : (I)Ljava/lang/Object;
    //   882: checkcast android/view/View
    //   885: astore #13
    //   887: aload #13
    //   889: ifnull -> 966
    //   892: aload #11
    //   894: aload #13
    //   896: invokevirtual v : (Landroid/view/View;)Z
    //   899: ifeq -> 966
    //   902: aload #7
    //   904: aload #13
    //   906: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   909: checkcast tw1
    //   912: astore #14
    //   914: aload #14
    //   916: ifnull -> 966
    //   919: aload #11
    //   921: aload #14
    //   923: getfield b : Landroid/view/View;
    //   926: invokevirtual v : (Landroid/view/View;)Z
    //   929: ifeq -> 966
    //   932: aload #8
    //   934: iload #4
    //   936: invokevirtual g : (I)Ljava/lang/Object;
    //   939: checkcast tw1
    //   942: astore #13
    //   944: aload #11
    //   946: getfield n : Ljava/util/ArrayList;
    //   949: aload #13
    //   951: invokevirtual add : (Ljava/lang/Object;)Z
    //   954: pop
    //   955: aload #11
    //   957: getfield o : Ljava/util/ArrayList;
    //   960: aload #14
    //   962: invokevirtual add : (Ljava/lang/Object;)Z
    //   965: pop
    //   966: iinc #4, -1
    //   969: goto -> 868
    //   972: iinc #3, 1
    //   975: goto -> 273
    //   978: iconst_0
    //   979: istore_2
    //   980: iload_2
    //   981: aload #8
    //   983: getfield e : I
    //   986: if_icmpge -> 1040
    //   989: aload #8
    //   991: iload_2
    //   992: invokevirtual i : (I)Ljava/lang/Object;
    //   995: checkcast tw1
    //   998: astore #9
    //   1000: aload #11
    //   1002: aload #9
    //   1004: getfield b : Landroid/view/View;
    //   1007: invokevirtual v : (Landroid/view/View;)Z
    //   1010: ifeq -> 1034
    //   1013: aload #11
    //   1015: getfield n : Ljava/util/ArrayList;
    //   1018: aload #9
    //   1020: invokevirtual add : (Ljava/lang/Object;)Z
    //   1023: pop
    //   1024: aload #11
    //   1026: getfield o : Ljava/util/ArrayList;
    //   1029: aconst_null
    //   1030: invokevirtual add : (Ljava/lang/Object;)Z
    //   1033: pop
    //   1034: iinc #2, 1
    //   1037: goto -> 980
    //   1040: iconst_0
    //   1041: istore_2
    //   1042: iload_2
    //   1043: aload #7
    //   1045: getfield e : I
    //   1048: if_icmpge -> 1105
    //   1051: aload #7
    //   1053: iload_2
    //   1054: invokevirtual i : (I)Ljava/lang/Object;
    //   1057: checkcast tw1
    //   1060: astore #8
    //   1062: aload #11
    //   1064: aload #8
    //   1066: getfield b : Landroid/view/View;
    //   1069: invokevirtual v : (Landroid/view/View;)Z
    //   1072: ifeq -> 1099
    //   1075: aload #11
    //   1077: getfield o : Ljava/util/ArrayList;
    //   1080: aload #8
    //   1082: invokevirtual add : (Ljava/lang/Object;)Z
    //   1085: pop
    //   1086: aload #11
    //   1088: getfield n : Ljava/util/ArrayList;
    //   1091: aconst_null
    //   1092: invokevirtual add : (Ljava/lang/Object;)Z
    //   1095: pop
    //   1096: goto -> 1099
    //   1099: iinc #2, 1
    //   1102: goto -> 1042
    //   1105: invokestatic q : ()Lb9;
    //   1108: astore #9
    //   1110: aload #9
    //   1112: getfield e : I
    //   1115: istore_2
    //   1116: aload #10
    //   1118: invokevirtual getWindowId : ()Landroid/view/WindowId;
    //   1121: astore #14
    //   1123: iload_2
    //   1124: iconst_1
    //   1125: isub
    //   1126: istore_3
    //   1127: iload_1
    //   1128: istore_2
    //   1129: iload_3
    //   1130: istore_1
    //   1131: iload_1
    //   1132: iflt -> 1340
    //   1135: aload #9
    //   1137: iload_1
    //   1138: invokevirtual f : (I)Ljava/lang/Object;
    //   1141: checkcast android/animation/Animator
    //   1144: astore #12
    //   1146: aload #12
    //   1148: ifnull -> 1332
    //   1151: aload #9
    //   1153: aload #12
    //   1155: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1158: checkcast fw1
    //   1161: astore #7
    //   1163: aload #7
    //   1165: ifnull -> 1332
    //   1168: aload #7
    //   1170: getfield e : Lkw1;
    //   1173: astore #13
    //   1175: aload #7
    //   1177: getfield a : Landroid/view/View;
    //   1180: astore #16
    //   1182: aload #16
    //   1184: ifnull -> 1332
    //   1187: aload #14
    //   1189: aload #7
    //   1191: getfield d : Landroid/view/WindowId;
    //   1194: invokevirtual equals : (Ljava/lang/Object;)Z
    //   1197: ifeq -> 1332
    //   1200: aload #7
    //   1202: getfield c : Ltw1;
    //   1205: astore #15
    //   1207: aload #11
    //   1209: aload #16
    //   1211: iload_2
    //   1212: invokevirtual s : (Landroid/view/View;Z)Ltw1;
    //   1215: astore #17
    //   1217: aload #11
    //   1219: aload #16
    //   1221: iload_2
    //   1222: invokevirtual o : (Landroid/view/View;Z)Ltw1;
    //   1225: astore #8
    //   1227: aload #8
    //   1229: astore #7
    //   1231: aload #17
    //   1233: ifnonnull -> 1266
    //   1236: aload #8
    //   1238: astore #7
    //   1240: aload #8
    //   1242: ifnonnull -> 1266
    //   1245: aload #11
    //   1247: getfield k : Ln2;
    //   1250: getfield c : Ljava/lang/Object;
    //   1253: checkcast b9
    //   1256: aload #16
    //   1258: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1261: checkcast tw1
    //   1264: astore #7
    //   1266: aload #17
    //   1268: ifnonnull -> 1276
    //   1271: aload #7
    //   1273: ifnull -> 1332
    //   1276: aload #13
    //   1278: aload #15
    //   1280: aload #7
    //   1282: invokevirtual u : (Ltw1;Ltw1;)Z
    //   1285: ifeq -> 1332
    //   1288: aload #13
    //   1290: invokevirtual p : ()Lkw1;
    //   1293: invokevirtual getClass : ()Ljava/lang/Class;
    //   1296: pop
    //   1297: aload #12
    //   1299: invokevirtual isRunning : ()Z
    //   1302: ifne -> 1327
    //   1305: aload #12
    //   1307: invokevirtual isStarted : ()Z
    //   1310: ifeq -> 1316
    //   1313: goto -> 1327
    //   1316: aload #9
    //   1318: aload #12
    //   1320: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   1323: pop
    //   1324: goto -> 1332
    //   1327: aload #12
    //   1329: invokevirtual cancel : ()V
    //   1332: iinc #1, -1
    //   1335: iconst_1
    //   1336: istore_2
    //   1337: goto -> 1131
    //   1340: aload #11
    //   1342: aload #10
    //   1344: aload #11
    //   1346: getfield j : Ln2;
    //   1349: aload #11
    //   1351: getfield k : Ln2;
    //   1354: aload #11
    //   1356: getfield n : Ljava/util/ArrayList;
    //   1359: aload #11
    //   1361: getfield o : Ljava/util/ArrayList;
    //   1364: invokevirtual l : (Landroid/view/ViewGroup;Ln2;Ln2;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    //   1367: aload #11
    //   1369: invokevirtual C : ()V
    //   1372: iconst_1
    //   1373: ireturn
  }
  
  public final void onViewAttachedToWindow(View paramView) {}
  
  public final void onViewDetachedFromWindow(View paramView) {
    ViewGroup viewGroup = this.c;
    viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
    viewGroup.removeOnAttachStateChangeListener(this);
    ow1.c.remove(viewGroup);
    ArrayList<View> arrayList = (ArrayList)ow1.b().get(viewGroup);
    if (arrayList != null && arrayList.size() > 0) {
      int i = arrayList.size();
      byte b = 0;
      while (b < i) {
        paramView = arrayList.get(b);
        b++;
        ((kw1)paramView).B((View)viewGroup);
      } 
    } 
    this.b.i(true);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nw1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */