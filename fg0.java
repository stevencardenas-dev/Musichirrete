import java.util.ArrayList;

public final class fg0 extends m52 {
  public static final int[] k = new int[2];
  
  public static void m(int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, int paramInt5) {
    paramInt1 = paramInt2 - paramInt1;
    paramInt2 = paramInt4 - paramInt3;
    if (paramInt5 != -1) {
      if (paramInt5 != 0) {
        if (paramInt5 == 1) {
          paramInt2 = (int)(paramInt1 * paramFloat + 0.5F);
          paramArrayOfint[0] = paramInt1;
          paramArrayOfint[1] = paramInt2;
          return;
        } 
      } else {
        paramArrayOfint[0] = (int)(paramInt2 * paramFloat + 0.5F);
        paramArrayOfint[1] = paramInt2;
        return;
      } 
    } else {
      paramInt4 = (int)(paramInt2 * paramFloat + 0.5F);
      paramInt3 = (int)(paramInt1 / paramFloat + 0.5F);
      if (paramInt4 <= paramInt1) {
        paramArrayOfint[0] = paramInt4;
        paramArrayOfint[1] = paramInt2;
        return;
      } 
      if (paramInt3 <= paramInt2) {
        paramArrayOfint[0] = paramInt1;
        paramArrayOfint[1] = paramInt3;
      } 
    } 
  }
  
  public final void a(cy paramcy) {
    // Byte code:
    //   0: aload_0
    //   1: getfield j : I
    //   4: invokestatic y : (I)I
    //   7: iconst_3
    //   8: if_icmpeq -> 1798
    //   11: aload_0
    //   12: getfield e : Lrz;
    //   15: astore_1
    //   16: aload_1
    //   17: getfield j : Z
    //   20: istore #9
    //   22: aload_0
    //   23: getfield h : Liy;
    //   26: astore #11
    //   28: aload_0
    //   29: getfield i : Liy;
    //   32: astore #10
    //   34: iload #9
    //   36: ifne -> 72
    //   39: aload_0
    //   40: getfield d : I
    //   43: iconst_3
    //   44: if_icmpne -> 72
    //   47: aload_0
    //   48: getfield b : Ler;
    //   51: astore #13
    //   53: aload #13
    //   55: getfield r : I
    //   58: istore #4
    //   60: iload #4
    //   62: iconst_2
    //   63: if_icmpeq -> 1277
    //   66: iload #4
    //   68: iconst_3
    //   69: if_icmpeq -> 75
    //   72: goto -> 1329
    //   75: aload #13
    //   77: getfield s : I
    //   80: istore #4
    //   82: iload #4
    //   84: ifeq -> 212
    //   87: iload #4
    //   89: iconst_3
    //   90: if_icmpne -> 96
    //   93: goto -> 212
    //   96: aload #13
    //   98: getfield X : I
    //   101: istore #4
    //   103: iload #4
    //   105: iconst_m1
    //   106: if_icmpeq -> 181
    //   109: iload #4
    //   111: ifeq -> 159
    //   114: iload #4
    //   116: iconst_1
    //   117: if_icmpeq -> 126
    //   120: iconst_0
    //   121: istore #4
    //   123: goto -> 203
    //   126: aload #13
    //   128: getfield e : Ld22;
    //   131: getfield e : Lrz;
    //   134: getfield g : I
    //   137: i2f
    //   138: fstore_3
    //   139: aload #13
    //   141: getfield W : F
    //   144: fstore_2
    //   145: fload_3
    //   146: fload_2
    //   147: fmul
    //   148: fstore_2
    //   149: fload_2
    //   150: ldc 0.5
    //   152: fadd
    //   153: f2i
    //   154: istore #4
    //   156: goto -> 203
    //   159: aload #13
    //   161: getfield e : Ld22;
    //   164: getfield e : Lrz;
    //   167: getfield g : I
    //   170: i2f
    //   171: aload #13
    //   173: getfield W : F
    //   176: fdiv
    //   177: fstore_2
    //   178: goto -> 149
    //   181: aload #13
    //   183: getfield e : Ld22;
    //   186: getfield e : Lrz;
    //   189: getfield g : I
    //   192: i2f
    //   193: fstore_3
    //   194: aload #13
    //   196: getfield W : F
    //   199: fstore_2
    //   200: goto -> 145
    //   203: aload_1
    //   204: iload #4
    //   206: invokevirtual d : (I)V
    //   209: goto -> 72
    //   212: aload #13
    //   214: getfield e : Ld22;
    //   217: astore #14
    //   219: aload #14
    //   221: getfield h : Liy;
    //   224: astore #12
    //   226: aload #14
    //   228: getfield i : Liy;
    //   231: astore #14
    //   233: aload #13
    //   235: getfield I : Lbq;
    //   238: getfield f : Lbq;
    //   241: ifnull -> 250
    //   244: iconst_1
    //   245: istore #4
    //   247: goto -> 253
    //   250: iconst_0
    //   251: istore #4
    //   253: aload #13
    //   255: getfield J : Lbq;
    //   258: getfield f : Lbq;
    //   261: ifnull -> 270
    //   264: iconst_1
    //   265: istore #5
    //   267: goto -> 273
    //   270: iconst_0
    //   271: istore #5
    //   273: aload #13
    //   275: getfield K : Lbq;
    //   278: getfield f : Lbq;
    //   281: ifnull -> 290
    //   284: iconst_1
    //   285: istore #6
    //   287: goto -> 293
    //   290: iconst_0
    //   291: istore #6
    //   293: aload #13
    //   295: getfield L : Lbq;
    //   298: getfield f : Lbq;
    //   301: ifnull -> 310
    //   304: iconst_1
    //   305: istore #7
    //   307: goto -> 316
    //   310: iconst_0
    //   311: istore #7
    //   313: goto -> 307
    //   316: aload #13
    //   318: getfield X : I
    //   321: istore #8
    //   323: iload #4
    //   325: ifeq -> 779
    //   328: iload #5
    //   330: ifeq -> 779
    //   333: iload #6
    //   335: ifeq -> 779
    //   338: iload #7
    //   340: ifeq -> 779
    //   343: aload #13
    //   345: getfield W : F
    //   348: fstore_2
    //   349: aload #12
    //   351: getfield j : Z
    //   354: istore #9
    //   356: aload #12
    //   358: getfield l : Ljava/util/ArrayList;
    //   361: astore #13
    //   363: getstatic fg0.k : [I
    //   366: astore #15
    //   368: iload #9
    //   370: ifeq -> 498
    //   373: aload #14
    //   375: getfield j : Z
    //   378: ifeq -> 498
    //   381: aload #11
    //   383: getfield c : Z
    //   386: ifeq -> 1797
    //   389: aload #10
    //   391: getfield c : Z
    //   394: ifne -> 400
    //   397: goto -> 1797
    //   400: aload #15
    //   402: aload #11
    //   404: getfield l : Ljava/util/ArrayList;
    //   407: iconst_0
    //   408: invokevirtual get : (I)Ljava/lang/Object;
    //   411: checkcast iy
    //   414: getfield g : I
    //   417: aload #11
    //   419: getfield f : I
    //   422: iadd
    //   423: aload #10
    //   425: getfield l : Ljava/util/ArrayList;
    //   428: iconst_0
    //   429: invokevirtual get : (I)Ljava/lang/Object;
    //   432: checkcast iy
    //   435: getfield g : I
    //   438: aload #10
    //   440: getfield f : I
    //   443: isub
    //   444: aload #12
    //   446: getfield g : I
    //   449: aload #12
    //   451: getfield f : I
    //   454: iadd
    //   455: aload #14
    //   457: getfield g : I
    //   460: aload #14
    //   462: getfield f : I
    //   465: isub
    //   466: fload_2
    //   467: iload #8
    //   469: invokestatic m : ([IIIIIFI)V
    //   472: aload_1
    //   473: aload #15
    //   475: iconst_0
    //   476: iaload
    //   477: invokevirtual d : (I)V
    //   480: aload_0
    //   481: getfield b : Ler;
    //   484: getfield e : Ld22;
    //   487: getfield e : Lrz;
    //   490: aload #15
    //   492: iconst_1
    //   493: iaload
    //   494: invokevirtual d : (I)V
    //   497: return
    //   498: aload #11
    //   500: getfield j : Z
    //   503: ifeq -> 627
    //   506: aload #10
    //   508: getfield j : Z
    //   511: ifeq -> 627
    //   514: aload #12
    //   516: getfield c : Z
    //   519: ifeq -> 1797
    //   522: aload #14
    //   524: getfield c : Z
    //   527: ifne -> 533
    //   530: goto -> 1797
    //   533: aload #15
    //   535: aload #11
    //   537: getfield g : I
    //   540: aload #11
    //   542: getfield f : I
    //   545: iadd
    //   546: aload #10
    //   548: getfield g : I
    //   551: aload #10
    //   553: getfield f : I
    //   556: isub
    //   557: aload #13
    //   559: iconst_0
    //   560: invokevirtual get : (I)Ljava/lang/Object;
    //   563: checkcast iy
    //   566: getfield g : I
    //   569: aload #12
    //   571: getfield f : I
    //   574: iadd
    //   575: aload #14
    //   577: getfield l : Ljava/util/ArrayList;
    //   580: iconst_0
    //   581: invokevirtual get : (I)Ljava/lang/Object;
    //   584: checkcast iy
    //   587: getfield g : I
    //   590: aload #14
    //   592: getfield f : I
    //   595: isub
    //   596: fload_2
    //   597: iload #8
    //   599: invokestatic m : ([IIIIIFI)V
    //   602: aload_1
    //   603: aload #15
    //   605: iconst_0
    //   606: iaload
    //   607: invokevirtual d : (I)V
    //   610: aload_0
    //   611: getfield b : Ler;
    //   614: getfield e : Ld22;
    //   617: getfield e : Lrz;
    //   620: aload #15
    //   622: iconst_1
    //   623: iaload
    //   624: invokevirtual d : (I)V
    //   627: aload #11
    //   629: getfield c : Z
    //   632: ifeq -> 1797
    //   635: aload #10
    //   637: getfield c : Z
    //   640: ifeq -> 1797
    //   643: aload #12
    //   645: getfield c : Z
    //   648: ifeq -> 1797
    //   651: aload #14
    //   653: getfield c : Z
    //   656: ifne -> 662
    //   659: goto -> 1797
    //   662: aload #15
    //   664: aload #11
    //   666: getfield l : Ljava/util/ArrayList;
    //   669: iconst_0
    //   670: invokevirtual get : (I)Ljava/lang/Object;
    //   673: checkcast iy
    //   676: getfield g : I
    //   679: aload #11
    //   681: getfield f : I
    //   684: iadd
    //   685: aload #10
    //   687: getfield l : Ljava/util/ArrayList;
    //   690: iconst_0
    //   691: invokevirtual get : (I)Ljava/lang/Object;
    //   694: checkcast iy
    //   697: getfield g : I
    //   700: aload #10
    //   702: getfield f : I
    //   705: isub
    //   706: aload #13
    //   708: iconst_0
    //   709: invokevirtual get : (I)Ljava/lang/Object;
    //   712: checkcast iy
    //   715: getfield g : I
    //   718: aload #12
    //   720: getfield f : I
    //   723: iadd
    //   724: aload #14
    //   726: getfield l : Ljava/util/ArrayList;
    //   729: iconst_0
    //   730: invokevirtual get : (I)Ljava/lang/Object;
    //   733: checkcast iy
    //   736: getfield g : I
    //   739: aload #14
    //   741: getfield f : I
    //   744: isub
    //   745: fload_2
    //   746: iload #8
    //   748: invokestatic m : ([IIIIIFI)V
    //   751: aload_1
    //   752: aload #15
    //   754: iconst_0
    //   755: iaload
    //   756: invokevirtual d : (I)V
    //   759: aload_0
    //   760: getfield b : Ler;
    //   763: getfield e : Ld22;
    //   766: getfield e : Lrz;
    //   769: aload #15
    //   771: iconst_1
    //   772: iaload
    //   773: invokevirtual d : (I)V
    //   776: goto -> 1329
    //   779: iload #4
    //   781: ifeq -> 1028
    //   784: iload #6
    //   786: ifeq -> 1028
    //   789: aload #11
    //   791: getfield c : Z
    //   794: ifeq -> 1797
    //   797: aload #10
    //   799: getfield c : Z
    //   802: ifne -> 808
    //   805: goto -> 1797
    //   808: aload #13
    //   810: getfield W : F
    //   813: fstore_2
    //   814: aload #11
    //   816: getfield l : Ljava/util/ArrayList;
    //   819: iconst_0
    //   820: invokevirtual get : (I)Ljava/lang/Object;
    //   823: checkcast iy
    //   826: getfield g : I
    //   829: aload #11
    //   831: getfield f : I
    //   834: iadd
    //   835: istore #4
    //   837: aload #10
    //   839: getfield l : Ljava/util/ArrayList;
    //   842: iconst_0
    //   843: invokevirtual get : (I)Ljava/lang/Object;
    //   846: checkcast iy
    //   849: getfield g : I
    //   852: aload #10
    //   854: getfield f : I
    //   857: isub
    //   858: istore #5
    //   860: iload #8
    //   862: iconst_m1
    //   863: if_icmpeq -> 954
    //   866: iload #8
    //   868: ifeq -> 954
    //   871: iload #8
    //   873: iconst_1
    //   874: if_icmpeq -> 880
    //   877: goto -> 1329
    //   880: aload_0
    //   881: iload #5
    //   883: iload #4
    //   885: isub
    //   886: iconst_0
    //   887: invokevirtual g : (II)I
    //   890: istore #4
    //   892: iload #4
    //   894: i2f
    //   895: fload_2
    //   896: fdiv
    //   897: ldc 0.5
    //   899: fadd
    //   900: f2i
    //   901: istore #6
    //   903: aload_0
    //   904: iload #6
    //   906: iconst_1
    //   907: invokevirtual g : (II)I
    //   910: istore #5
    //   912: iload #6
    //   914: iload #5
    //   916: if_icmpeq -> 930
    //   919: iload #5
    //   921: i2f
    //   922: fload_2
    //   923: fmul
    //   924: ldc 0.5
    //   926: fadd
    //   927: f2i
    //   928: istore #4
    //   930: aload_1
    //   931: iload #4
    //   933: invokevirtual d : (I)V
    //   936: aload_0
    //   937: getfield b : Ler;
    //   940: getfield e : Ld22;
    //   943: getfield e : Lrz;
    //   946: iload #5
    //   948: invokevirtual d : (I)V
    //   951: goto -> 1329
    //   954: aload_0
    //   955: iload #5
    //   957: iload #4
    //   959: isub
    //   960: iconst_0
    //   961: invokevirtual g : (II)I
    //   964: istore #4
    //   966: iload #4
    //   968: i2f
    //   969: fload_2
    //   970: fmul
    //   971: ldc 0.5
    //   973: fadd
    //   974: f2i
    //   975: istore #6
    //   977: aload_0
    //   978: iload #6
    //   980: iconst_1
    //   981: invokevirtual g : (II)I
    //   984: istore #5
    //   986: iload #6
    //   988: iload #5
    //   990: if_icmpeq -> 1004
    //   993: iload #5
    //   995: i2f
    //   996: fload_2
    //   997: fdiv
    //   998: ldc 0.5
    //   1000: fadd
    //   1001: f2i
    //   1002: istore #4
    //   1004: aload_1
    //   1005: iload #4
    //   1007: invokevirtual d : (I)V
    //   1010: aload_0
    //   1011: getfield b : Ler;
    //   1014: getfield e : Ld22;
    //   1017: getfield e : Lrz;
    //   1020: iload #5
    //   1022: invokevirtual d : (I)V
    //   1025: goto -> 1329
    //   1028: iload #5
    //   1030: ifeq -> 1329
    //   1033: iload #7
    //   1035: ifeq -> 1329
    //   1038: aload #12
    //   1040: getfield c : Z
    //   1043: ifeq -> 1797
    //   1046: aload #14
    //   1048: getfield c : Z
    //   1051: ifne -> 1057
    //   1054: goto -> 1797
    //   1057: aload #13
    //   1059: getfield W : F
    //   1062: fstore_2
    //   1063: aload #12
    //   1065: getfield l : Ljava/util/ArrayList;
    //   1068: iconst_0
    //   1069: invokevirtual get : (I)Ljava/lang/Object;
    //   1072: checkcast iy
    //   1075: getfield g : I
    //   1078: aload #12
    //   1080: getfield f : I
    //   1083: iadd
    //   1084: istore #4
    //   1086: aload #14
    //   1088: getfield l : Ljava/util/ArrayList;
    //   1091: iconst_0
    //   1092: invokevirtual get : (I)Ljava/lang/Object;
    //   1095: checkcast iy
    //   1098: getfield g : I
    //   1101: aload #14
    //   1103: getfield f : I
    //   1106: isub
    //   1107: istore #5
    //   1109: iload #8
    //   1111: iconst_m1
    //   1112: if_icmpeq -> 1203
    //   1115: iload #8
    //   1117: ifeq -> 1129
    //   1120: iload #8
    //   1122: iconst_1
    //   1123: if_icmpeq -> 1203
    //   1126: goto -> 1329
    //   1129: aload_0
    //   1130: iload #5
    //   1132: iload #4
    //   1134: isub
    //   1135: iconst_1
    //   1136: invokevirtual g : (II)I
    //   1139: istore #4
    //   1141: iload #4
    //   1143: i2f
    //   1144: fload_2
    //   1145: fmul
    //   1146: ldc 0.5
    //   1148: fadd
    //   1149: f2i
    //   1150: istore #6
    //   1152: aload_0
    //   1153: iload #6
    //   1155: iconst_0
    //   1156: invokevirtual g : (II)I
    //   1159: istore #5
    //   1161: iload #6
    //   1163: iload #5
    //   1165: if_icmpeq -> 1179
    //   1168: iload #5
    //   1170: i2f
    //   1171: fload_2
    //   1172: fdiv
    //   1173: ldc 0.5
    //   1175: fadd
    //   1176: f2i
    //   1177: istore #4
    //   1179: aload_1
    //   1180: iload #5
    //   1182: invokevirtual d : (I)V
    //   1185: aload_0
    //   1186: getfield b : Ler;
    //   1189: getfield e : Ld22;
    //   1192: getfield e : Lrz;
    //   1195: iload #4
    //   1197: invokevirtual d : (I)V
    //   1200: goto -> 1329
    //   1203: aload_0
    //   1204: iload #5
    //   1206: iload #4
    //   1208: isub
    //   1209: iconst_1
    //   1210: invokevirtual g : (II)I
    //   1213: istore #4
    //   1215: iload #4
    //   1217: i2f
    //   1218: fload_2
    //   1219: fdiv
    //   1220: ldc 0.5
    //   1222: fadd
    //   1223: f2i
    //   1224: istore #6
    //   1226: aload_0
    //   1227: iload #6
    //   1229: iconst_0
    //   1230: invokevirtual g : (II)I
    //   1233: istore #5
    //   1235: iload #6
    //   1237: iload #5
    //   1239: if_icmpeq -> 1253
    //   1242: iload #5
    //   1244: i2f
    //   1245: fload_2
    //   1246: fmul
    //   1247: ldc 0.5
    //   1249: fadd
    //   1250: f2i
    //   1251: istore #4
    //   1253: aload_1
    //   1254: iload #5
    //   1256: invokevirtual d : (I)V
    //   1259: aload_0
    //   1260: getfield b : Ler;
    //   1263: getfield e : Ld22;
    //   1266: getfield e : Lrz;
    //   1269: iload #4
    //   1271: invokevirtual d : (I)V
    //   1274: goto -> 1329
    //   1277: aload #13
    //   1279: getfield T : Ler;
    //   1282: astore #12
    //   1284: aload #12
    //   1286: ifnull -> 1329
    //   1289: aload #12
    //   1291: getfield d : Lfg0;
    //   1294: getfield e : Lrz;
    //   1297: astore #12
    //   1299: aload #12
    //   1301: getfield j : Z
    //   1304: ifeq -> 1329
    //   1307: aload #13
    //   1309: getfield w : F
    //   1312: fstore_2
    //   1313: aload_1
    //   1314: aload #12
    //   1316: getfield g : I
    //   1319: i2f
    //   1320: fload_2
    //   1321: fmul
    //   1322: ldc 0.5
    //   1324: fadd
    //   1325: f2i
    //   1326: invokevirtual d : (I)V
    //   1329: aload #11
    //   1331: getfield c : Z
    //   1334: istore #9
    //   1336: aload #11
    //   1338: getfield l : Ljava/util/ArrayList;
    //   1341: astore #13
    //   1343: iload #9
    //   1345: ifeq -> 1797
    //   1348: aload #10
    //   1350: getfield c : Z
    //   1353: istore #9
    //   1355: aload #10
    //   1357: getfield l : Ljava/util/ArrayList;
    //   1360: astore #12
    //   1362: iload #9
    //   1364: ifne -> 1370
    //   1367: goto -> 1797
    //   1370: aload #11
    //   1372: getfield j : Z
    //   1375: ifeq -> 1396
    //   1378: aload #10
    //   1380: getfield j : Z
    //   1383: ifeq -> 1396
    //   1386: aload_1
    //   1387: getfield j : Z
    //   1390: ifeq -> 1396
    //   1393: goto -> 1797
    //   1396: aload_1
    //   1397: getfield j : Z
    //   1400: ifne -> 1505
    //   1403: aload_0
    //   1404: getfield d : I
    //   1407: iconst_3
    //   1408: if_icmpne -> 1505
    //   1411: aload_0
    //   1412: getfield b : Ler;
    //   1415: astore #14
    //   1417: aload #14
    //   1419: getfield r : I
    //   1422: ifne -> 1505
    //   1425: aload #14
    //   1427: invokevirtual v : ()Z
    //   1430: ifne -> 1505
    //   1433: aload #13
    //   1435: iconst_0
    //   1436: invokevirtual get : (I)Ljava/lang/Object;
    //   1439: checkcast iy
    //   1442: astore #13
    //   1444: aload #12
    //   1446: iconst_0
    //   1447: invokevirtual get : (I)Ljava/lang/Object;
    //   1450: checkcast iy
    //   1453: astore #12
    //   1455: aload #13
    //   1457: getfield g : I
    //   1460: aload #11
    //   1462: getfield f : I
    //   1465: iadd
    //   1466: istore #5
    //   1468: aload #12
    //   1470: getfield g : I
    //   1473: aload #10
    //   1475: getfield f : I
    //   1478: iadd
    //   1479: istore #4
    //   1481: aload #11
    //   1483: iload #5
    //   1485: invokevirtual d : (I)V
    //   1488: aload #10
    //   1490: iload #4
    //   1492: invokevirtual d : (I)V
    //   1495: aload_1
    //   1496: iload #4
    //   1498: iload #5
    //   1500: isub
    //   1501: invokevirtual d : (I)V
    //   1504: return
    //   1505: aload_1
    //   1506: getfield j : Z
    //   1509: ifne -> 1655
    //   1512: aload_0
    //   1513: getfield d : I
    //   1516: iconst_3
    //   1517: if_icmpne -> 1655
    //   1520: aload_0
    //   1521: getfield a : I
    //   1524: iconst_1
    //   1525: if_icmpne -> 1655
    //   1528: aload #13
    //   1530: invokevirtual size : ()I
    //   1533: ifle -> 1655
    //   1536: aload #12
    //   1538: invokevirtual size : ()I
    //   1541: ifle -> 1655
    //   1544: aload #13
    //   1546: iconst_0
    //   1547: invokevirtual get : (I)Ljava/lang/Object;
    //   1550: checkcast iy
    //   1553: astore #14
    //   1555: aload #12
    //   1557: iconst_0
    //   1558: invokevirtual get : (I)Ljava/lang/Object;
    //   1561: checkcast iy
    //   1564: astore #15
    //   1566: aload #14
    //   1568: getfield g : I
    //   1571: istore #4
    //   1573: aload #11
    //   1575: getfield f : I
    //   1578: istore #5
    //   1580: aload #15
    //   1582: getfield g : I
    //   1585: aload #10
    //   1587: getfield f : I
    //   1590: iadd
    //   1591: iload #4
    //   1593: iload #5
    //   1595: iadd
    //   1596: isub
    //   1597: aload_1
    //   1598: getfield m : I
    //   1601: invokestatic min : (II)I
    //   1604: istore #4
    //   1606: aload_0
    //   1607: getfield b : Ler;
    //   1610: astore #14
    //   1612: aload #14
    //   1614: getfield v : I
    //   1617: istore #6
    //   1619: aload #14
    //   1621: getfield u : I
    //   1624: iload #4
    //   1626: invokestatic max : (II)I
    //   1629: istore #5
    //   1631: iload #5
    //   1633: istore #4
    //   1635: iload #6
    //   1637: ifle -> 1649
    //   1640: iload #6
    //   1642: iload #5
    //   1644: invokestatic min : (II)I
    //   1647: istore #4
    //   1649: aload_1
    //   1650: iload #4
    //   1652: invokevirtual d : (I)V
    //   1655: aload_1
    //   1656: getfield j : Z
    //   1659: ifne -> 1665
    //   1662: goto -> 1797
    //   1665: aload #13
    //   1667: iconst_0
    //   1668: invokevirtual get : (I)Ljava/lang/Object;
    //   1671: checkcast iy
    //   1674: astore #13
    //   1676: aload #12
    //   1678: iconst_0
    //   1679: invokevirtual get : (I)Ljava/lang/Object;
    //   1682: checkcast iy
    //   1685: astore #12
    //   1687: aload #13
    //   1689: getfield g : I
    //   1692: istore #5
    //   1694: aload #11
    //   1696: getfield f : I
    //   1699: istore #7
    //   1701: aload #12
    //   1703: getfield g : I
    //   1706: istore #4
    //   1708: aload #10
    //   1710: getfield f : I
    //   1713: istore #6
    //   1715: aload_0
    //   1716: getfield b : Ler;
    //   1719: getfield d0 : F
    //   1722: fstore_2
    //   1723: aload #13
    //   1725: aload #12
    //   1727: if_acmpne -> 1736
    //   1730: ldc 0.5
    //   1732: fstore_2
    //   1733: goto -> 1750
    //   1736: iload #7
    //   1738: iload #5
    //   1740: iadd
    //   1741: istore #5
    //   1743: iload #6
    //   1745: iload #4
    //   1747: iadd
    //   1748: istore #4
    //   1750: aload_1
    //   1751: getfield g : I
    //   1754: istore #6
    //   1756: iload #5
    //   1758: i2f
    //   1759: fstore_3
    //   1760: aload #11
    //   1762: iload #4
    //   1764: iload #5
    //   1766: isub
    //   1767: iload #6
    //   1769: isub
    //   1770: i2f
    //   1771: fload_2
    //   1772: fmul
    //   1773: fload_3
    //   1774: ldc 0.5
    //   1776: fadd
    //   1777: fadd
    //   1778: f2i
    //   1779: invokevirtual d : (I)V
    //   1782: aload #10
    //   1784: aload #11
    //   1786: getfield g : I
    //   1789: aload_1
    //   1790: getfield g : I
    //   1793: iadd
    //   1794: invokevirtual d : (I)V
    //   1797: return
    //   1798: aload_0
    //   1799: getfield b : Ler;
    //   1802: astore_1
    //   1803: aload_0
    //   1804: aload_1
    //   1805: getfield I : Lbq;
    //   1808: aload_1
    //   1809: getfield K : Lbq;
    //   1812: iconst_0
    //   1813: invokevirtual l : (Lbq;Lbq;I)V
    //   1816: return
  }
  
  public final void d() {
    er er2;
    er er1 = this.b;
    boolean bool = er1.a;
    iy iy3 = this.e;
    if (bool)
      iy3.d(er1.o()); 
    bool = iy3.j;
    ArrayList arrayList2 = iy3.k;
    ArrayList arrayList1 = iy3.l;
    iy iy2 = this.i;
    iy iy1 = this.h;
    if (!bool) {
      er er = this.b;
      int i = er.p0[0];
      this.d = i;
      if (i != 3) {
        if (i == 4) {
          er er4 = er.T;
          if (er4 != null) {
            int j = er4.p0[0];
            if (j == 1 || j == 4) {
              int k = er4.o();
              i = this.b.I.d();
              j = this.b.K.d();
              m52.b(iy1, er4.d.h, this.b.I.d());
              m52.b(iy2, er4.d.i, -this.b.K.d());
              iy3.d(k - i - j);
              return;
            } 
          } 
        } 
        if (i == 1)
          iy3.d(er.o()); 
      } 
    } else if (this.d == 4) {
      er er5 = this.b;
      er er4 = er5.T;
      if (er4 != null) {
        int i = er4.p0[0];
        if (i == 1 || i == 4) {
          m52.b(iy1, er4.d.h, er5.I.d());
          m52.b(iy2, er4.d.i, -this.b.K.d());
          return;
        } 
      } 
    } 
    if (iy3.j) {
      er er = this.b;
      if (er.a) {
        bq[] arrayOfBq1 = er.Q;
        bq bq3 = arrayOfBq1[0];
        bq bq4 = bq3.f;
        if (bq4 != null && (arrayOfBq1[1]).f != null) {
          bool = er.v();
          er2 = this.b;
          if (bool) {
            iy1.f = er2.Q[0].d();
            iy2.f = -this.b.Q[1].d();
            return;
          } 
          iy3 = m52.h(er2.Q[0]);
          if (iy3 != null)
            m52.b(iy1, iy3, this.b.Q[0].d()); 
          iy3 = m52.h(this.b.Q[1]);
          if (iy3 != null)
            m52.b(iy2, iy3, -this.b.Q[1].d()); 
          iy1.b = true;
          iy2.b = true;
          return;
        } 
        if (bq4 != null) {
          iy iy = m52.h(bq3);
          if (iy != null) {
            m52.b(iy1, iy, this.b.Q[0].d());
            m52.b(iy2, iy1, iy3.g);
            return;
          } 
        } else {
          bq3 = arrayOfBq1[1];
          if (bq3.f != null) {
            iy iy = m52.h(bq3);
            if (iy != null) {
              m52.b(iy2, iy, -this.b.Q[1].d());
              m52.b(iy1, iy2, -iy3.g);
              return;
            } 
          } else if (!(er instanceof yb) && er.T != null && (er.g(7)).f == null) {
            er3 = this.b;
            m52.b(iy1, er3.T.d.h, er3.p());
            m52.b(iy2, iy1, iy3.g);
            return;
          } 
        } 
        return;
      } 
    } 
    if (this.d == 3) {
      d22 d22;
      er er = this.b;
      int i = er.r;
      if (i != 2) {
        if (i == 3)
          if (er.s == 3) {
            iy1.a = this;
            iy2.a = this;
            d22 d221 = er.e;
            d221.h.a = this;
            d221.i.a = this;
            iy3.a = this;
            if (er.w()) {
              er3.add(this.b.e.e);
              this.b.e.e.k.add(iy3);
              d22 = this.b.e;
              d22.e.a = this;
              er3.add(d22.h);
              er3.add(this.b.e.i);
              this.b.e.h.k.add(iy3);
              this.b.e.i.k.add(iy3);
            } else {
              bool = this.b.v();
              er3 = this.b;
              if (bool) {
                er3.e.e.l.add(iy3);
                d22.add(this.b.e.e);
              } else {
                er3.e.e.l.add(iy3);
              } 
            } 
          } else {
            rz rz = er.e.e;
            er3.add(rz);
            rz.k.add(iy3);
            this.b.e.h.k.add(iy3);
            this.b.e.i.k.add(iy3);
            iy3.b = true;
            d22.add(iy1);
            d22.add(iy2);
            iy1.l.add(iy3);
            iy2.l.add(iy3);
          }  
      } else {
        er er4 = er.T;
        if (er4 != null) {
          rz rz = er4.e.e;
          er3.add(rz);
          rz.k.add(iy3);
          iy3.b = true;
          d22.add(iy1);
          d22.add(iy2);
        } 
      } 
    } 
    er er3 = this.b;
    bq[] arrayOfBq = er3.Q;
    bq bq2 = arrayOfBq[0];
    bq bq1 = bq2.f;
    if (bq1 != null && (arrayOfBq[1]).f != null) {
      bool = er3.v();
      er2 = this.b;
      if (bool) {
        iy1.f = er2.Q[0].d();
        iy2.f = -this.b.Q[1].d();
        return;
      } 
      iy2 = m52.h(er2.Q[0]);
      iy1 = m52.h(this.b.Q[1]);
      if (iy2 != null)
        iy2.b(this); 
      if (iy1 != null)
        iy1.b(this); 
      this.j = 4;
      return;
    } 
    if (bq1 != null) {
      iy iy = m52.h(bq2);
      if (iy != null) {
        m52.b(iy1, iy, this.b.Q[0].d());
        c(iy2, iy1, 1, (rz)er2);
        return;
      } 
    } else {
      iy iy;
      bq1 = arrayOfBq[1];
      if (bq1.f != null) {
        iy = m52.h(bq1);
        if (iy != null) {
          m52.b(iy2, iy, -this.b.Q[1].d());
          c(iy1, iy2, -1, (rz)er2);
          return;
        } 
      } else if (!(iy instanceof yb)) {
        er er = ((er)iy).T;
        if (er != null) {
          m52.b(iy1, er.d.h, iy.p());
          c(iy2, iy1, 1, (rz)er2);
        } 
      } 
    } 
  }
  
  public final void e() {
    iy iy = this.h;
    if (iy.j)
      this.b.Y = iy.g; 
  }
  
  public final void f() {
    this.c = null;
    this.h.c();
    this.i.c();
    this.e.c();
    this.g = false;
  }
  
  public final boolean k() {
    return (this.d != 3 || this.b.r == 0);
  }
  
  public final void n() {
    this.g = false;
    iy iy = this.h;
    iy.c();
    iy.j = false;
    iy = this.i;
    iy.c();
    iy.j = false;
    this.e.j = false;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("HorizontalRun ");
    stringBuilder.append(this.b.h0);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fg0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */