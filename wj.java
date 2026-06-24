import java.util.ArrayList;

public final class wj extends m52 {
  public final ArrayList k;
  
  public int l;
  
  public wj(er paramer, int paramInt) {
    super(paramer);
    ArrayList<er> arrayList = new ArrayList();
    this.k = arrayList;
    this.f = paramInt;
    er er1 = this.b;
    for (paramer = er1.k(paramInt); paramer != null; paramer = er2) {
      er er2 = paramer.k(this.f);
      er1 = paramer;
    } 
    this.b = er1;
    paramInt = this.f;
    if (paramInt == 0) {
      fg0 fg0 = er1.d;
    } else if (paramInt == 1) {
      d22 d22 = er1.e;
    } else {
      paramer = null;
    } 
    arrayList.add(paramer);
    for (er1 = er1.j(this.f); er1 != null; er1 = er1.j(this.f)) {
      paramInt = this.f;
      if (paramInt == 0) {
        fg0 fg0 = er1.d;
      } else if (paramInt == 1) {
        d22 d22 = er1.e;
      } else {
        paramer = null;
      } 
      arrayList.add(paramer);
    } 
    int i = arrayList.size();
    paramInt = 0;
    while (paramInt < i) {
      paramer = arrayList.get(paramInt);
      int j = paramInt + 1;
      m52 m521 = (m52)paramer;
      int k = this.f;
      if (k == 0) {
        m521.b.b = this;
        paramInt = j;
        continue;
      } 
      paramInt = j;
      if (k == 1) {
        m521.b.c = this;
        paramInt = j;
      } 
    } 
    if (this.f == 0 && ((fr)this.b.T).v0 && arrayList.size() > 1)
      this.b = ((m52)arrayList.get(arrayList.size() - 1)).b; 
    paramInt = this.f;
    paramer = this.b;
    if (paramInt == 0) {
      paramInt = paramer.i0;
    } else {
      paramInt = paramer.j0;
    } 
    this.l = paramInt;
  }
  
  public final void a(cy paramcy) {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : Liy;
    //   4: astore #23
    //   6: aload #23
    //   8: getfield j : Z
    //   11: ifeq -> 2378
    //   14: aload_0
    //   15: getfield i : Liy;
    //   18: astore #22
    //   20: aload #22
    //   22: getfield j : Z
    //   25: ifne -> 31
    //   28: goto -> 2378
    //   31: aload_0
    //   32: getfield b : Ler;
    //   35: getfield T : Ler;
    //   38: astore_1
    //   39: aload_1
    //   40: instanceof fr
    //   43: ifeq -> 58
    //   46: aload_1
    //   47: checkcast fr
    //   50: getfield v0 : Z
    //   53: istore #21
    //   55: goto -> 61
    //   58: iconst_0
    //   59: istore #21
    //   61: aload #22
    //   63: getfield g : I
    //   66: aload #23
    //   68: getfield g : I
    //   71: isub
    //   72: istore #20
    //   74: aload_0
    //   75: getfield k : Ljava/util/ArrayList;
    //   78: astore_1
    //   79: aload_1
    //   80: invokevirtual size : ()I
    //   83: istore #19
    //   85: iconst_0
    //   86: istore #5
    //   88: iconst_m1
    //   89: istore #6
    //   91: iload #5
    //   93: iload #19
    //   95: if_icmpge -> 128
    //   98: iload #5
    //   100: istore #13
    //   102: aload_1
    //   103: iload #5
    //   105: invokevirtual get : (I)Ljava/lang/Object;
    //   108: checkcast m52
    //   111: getfield b : Ler;
    //   114: getfield g0 : I
    //   117: bipush #8
    //   119: if_icmpne -> 131
    //   122: iinc #5, 1
    //   125: goto -> 88
    //   128: iconst_m1
    //   129: istore #13
    //   131: iload #19
    //   133: iconst_1
    //   134: isub
    //   135: istore #18
    //   137: iload #18
    //   139: istore #5
    //   141: iload #6
    //   143: istore #14
    //   145: iload #5
    //   147: iflt -> 180
    //   150: aload_1
    //   151: iload #5
    //   153: invokevirtual get : (I)Ljava/lang/Object;
    //   156: checkcast m52
    //   159: getfield b : Ler;
    //   162: getfield g0 : I
    //   165: bipush #8
    //   167: if_icmpne -> 176
    //   170: iinc #5, -1
    //   173: goto -> 141
    //   176: iload #5
    //   178: istore #14
    //   180: iconst_0
    //   181: istore #8
    //   183: iload #8
    //   185: iconst_2
    //   186: if_icmpge -> 614
    //   189: fconst_0
    //   190: fstore_2
    //   191: iconst_0
    //   192: istore #10
    //   194: iconst_0
    //   195: istore #6
    //   197: iconst_0
    //   198: istore #5
    //   200: iconst_0
    //   201: istore #7
    //   203: iload #8
    //   205: istore #9
    //   207: iload #10
    //   209: iload #19
    //   211: if_icmpge -> 577
    //   214: aload_1
    //   215: iload #10
    //   217: invokevirtual get : (I)Ljava/lang/Object;
    //   220: checkcast m52
    //   223: astore #26
    //   225: aload #26
    //   227: getfield b : Ler;
    //   230: astore #24
    //   232: aload #24
    //   234: getfield g0 : I
    //   237: bipush #8
    //   239: if_icmpne -> 249
    //   242: iload #5
    //   244: istore #11
    //   246: goto -> 567
    //   249: iload #7
    //   251: iconst_1
    //   252: iadd
    //   253: istore #12
    //   255: iload #6
    //   257: istore #7
    //   259: iload #10
    //   261: ifle -> 288
    //   264: iload #6
    //   266: istore #7
    //   268: iload #10
    //   270: iload #13
    //   272: if_icmplt -> 288
    //   275: iload #6
    //   277: aload #26
    //   279: getfield h : Liy;
    //   282: getfield f : I
    //   285: iadd
    //   286: istore #7
    //   288: aload #26
    //   290: getfield e : Lrz;
    //   293: astore #25
    //   295: aload #25
    //   297: getfield g : I
    //   300: istore #8
    //   302: aload #26
    //   304: getfield d : I
    //   307: iconst_3
    //   308: if_icmpeq -> 317
    //   311: iconst_1
    //   312: istore #6
    //   314: goto -> 320
    //   317: iconst_0
    //   318: istore #6
    //   320: iload #6
    //   322: ifeq -> 379
    //   325: aload_0
    //   326: getfield f : I
    //   329: istore #11
    //   331: iload #11
    //   333: ifne -> 353
    //   336: aload #24
    //   338: getfield d : Lfg0;
    //   341: getfield e : Lrz;
    //   344: getfield j : Z
    //   347: ifne -> 353
    //   350: goto -> 2378
    //   353: iload #11
    //   355: iconst_1
    //   356: if_icmpne -> 376
    //   359: aload #24
    //   361: getfield e : Ld22;
    //   364: getfield e : Lrz;
    //   367: getfield j : Z
    //   370: ifne -> 376
    //   373: goto -> 2378
    //   376: goto -> 424
    //   379: aload #26
    //   381: getfield a : I
    //   384: iconst_1
    //   385: if_icmpne -> 409
    //   388: iload #9
    //   390: ifne -> 409
    //   393: aload #25
    //   395: getfield m : I
    //   398: istore #6
    //   400: iinc #5, 1
    //   403: iconst_1
    //   404: istore #8
    //   406: goto -> 436
    //   409: aload #25
    //   411: getfield j : Z
    //   414: ifeq -> 424
    //   417: iload #8
    //   419: istore #6
    //   421: goto -> 403
    //   424: iload #6
    //   426: istore #11
    //   428: iload #8
    //   430: istore #6
    //   432: iload #11
    //   434: istore #8
    //   436: iload #8
    //   438: ifne -> 492
    //   441: iload #5
    //   443: iconst_1
    //   444: iadd
    //   445: istore #6
    //   447: aload #24
    //   449: getfield k0 : [F
    //   452: aload_0
    //   453: getfield f : I
    //   456: faload
    //   457: fstore #4
    //   459: iload #7
    //   461: istore #8
    //   463: iload #6
    //   465: istore #5
    //   467: fload_2
    //   468: fstore_3
    //   469: fload #4
    //   471: fconst_0
    //   472: fcmpl
    //   473: iflt -> 501
    //   476: fload_2
    //   477: fload #4
    //   479: fadd
    //   480: fstore_3
    //   481: iload #7
    //   483: istore #8
    //   485: iload #6
    //   487: istore #5
    //   489: goto -> 501
    //   492: iload #7
    //   494: iload #6
    //   496: iadd
    //   497: istore #8
    //   499: fload_2
    //   500: fstore_3
    //   501: iload #8
    //   503: istore #6
    //   505: iload #5
    //   507: istore #11
    //   509: iload #12
    //   511: istore #7
    //   513: fload_3
    //   514: fstore_2
    //   515: iload #10
    //   517: iload #18
    //   519: if_icmpge -> 567
    //   522: iload #8
    //   524: istore #6
    //   526: iload #5
    //   528: istore #11
    //   530: iload #12
    //   532: istore #7
    //   534: fload_3
    //   535: fstore_2
    //   536: iload #10
    //   538: iload #14
    //   540: if_icmpge -> 567
    //   543: iload #8
    //   545: aload #26
    //   547: getfield i : Liy;
    //   550: getfield f : I
    //   553: ineg
    //   554: iadd
    //   555: istore #6
    //   557: fload_3
    //   558: fstore_2
    //   559: iload #12
    //   561: istore #7
    //   563: iload #5
    //   565: istore #11
    //   567: iinc #10, 1
    //   570: iload #11
    //   572: istore #5
    //   574: goto -> 207
    //   577: iload #6
    //   579: iload #20
    //   581: if_icmplt -> 601
    //   584: iload #5
    //   586: ifne -> 592
    //   589: goto -> 601
    //   592: iload #9
    //   594: iconst_1
    //   595: iadd
    //   596: istore #8
    //   598: goto -> 183
    //   601: iload #7
    //   603: istore #15
    //   605: iload #5
    //   607: istore #7
    //   609: fload_2
    //   610: fstore_3
    //   611: goto -> 625
    //   614: fconst_0
    //   615: fstore_3
    //   616: iconst_0
    //   617: istore #7
    //   619: iconst_0
    //   620: istore #15
    //   622: iconst_0
    //   623: istore #6
    //   625: aload #23
    //   627: getfield g : I
    //   630: istore #8
    //   632: iload #21
    //   634: ifeq -> 644
    //   637: aload #22
    //   639: getfield g : I
    //   642: istore #8
    //   644: ldc 0.5
    //   646: fstore_2
    //   647: iload #8
    //   649: istore #5
    //   651: iload #6
    //   653: iload #20
    //   655: if_icmple -> 700
    //   658: iload #21
    //   660: ifeq -> 683
    //   663: iload #8
    //   665: iload #6
    //   667: iload #20
    //   669: isub
    //   670: i2f
    //   671: fconst_2
    //   672: fdiv
    //   673: ldc 0.5
    //   675: fadd
    //   676: f2i
    //   677: iadd
    //   678: istore #5
    //   680: goto -> 700
    //   683: iload #8
    //   685: iload #6
    //   687: iload #20
    //   689: isub
    //   690: i2f
    //   691: fconst_2
    //   692: fdiv
    //   693: ldc 0.5
    //   695: fadd
    //   696: f2i
    //   697: isub
    //   698: istore #5
    //   700: iload #7
    //   702: ifle -> 1149
    //   705: iload #20
    //   707: iload #6
    //   709: isub
    //   710: i2f
    //   711: fstore #4
    //   713: fload #4
    //   715: iload #7
    //   717: i2f
    //   718: fdiv
    //   719: ldc 0.5
    //   721: fadd
    //   722: f2i
    //   723: istore #9
    //   725: iconst_0
    //   726: istore #16
    //   728: iconst_0
    //   729: istore #8
    //   731: iload #5
    //   733: istore #10
    //   735: iload #16
    //   737: iload #19
    //   739: if_icmpge -> 965
    //   742: aload_1
    //   743: iload #16
    //   745: invokevirtual get : (I)Ljava/lang/Object;
    //   748: checkcast m52
    //   751: astore #23
    //   753: aload #23
    //   755: getfield b : Ler;
    //   758: astore #24
    //   760: aload #23
    //   762: getfield e : Lrz;
    //   765: astore #22
    //   767: aload #24
    //   769: getfield g0 : I
    //   772: bipush #8
    //   774: if_icmpne -> 780
    //   777: goto -> 959
    //   780: aload #23
    //   782: getfield d : I
    //   785: iconst_3
    //   786: if_icmpne -> 777
    //   789: aload #22
    //   791: getfield j : Z
    //   794: ifne -> 777
    //   797: fload_3
    //   798: fconst_0
    //   799: fcmpl
    //   800: ifle -> 826
    //   803: aload #24
    //   805: getfield k0 : [F
    //   808: aload_0
    //   809: getfield f : I
    //   812: faload
    //   813: fload #4
    //   815: fmul
    //   816: fload_3
    //   817: fdiv
    //   818: fload_2
    //   819: fadd
    //   820: f2i
    //   821: istore #5
    //   823: goto -> 830
    //   826: iload #9
    //   828: istore #5
    //   830: aload_0
    //   831: getfield f : I
    //   834: ifne -> 854
    //   837: aload #24
    //   839: getfield v : I
    //   842: istore #12
    //   844: aload #24
    //   846: getfield u : I
    //   849: istore #11
    //   851: goto -> 868
    //   854: aload #24
    //   856: getfield y : I
    //   859: istore #12
    //   861: aload #24
    //   863: getfield x : I
    //   866: istore #11
    //   868: aload #23
    //   870: getfield a : I
    //   873: iconst_1
    //   874: if_icmpne -> 892
    //   877: iload #5
    //   879: aload #22
    //   881: getfield m : I
    //   884: invokestatic min : (II)I
    //   887: istore #17
    //   889: goto -> 896
    //   892: iload #5
    //   894: istore #17
    //   896: iload #11
    //   898: iload #17
    //   900: invokestatic max : (II)I
    //   903: istore #17
    //   905: iload #17
    //   907: istore #11
    //   909: iload #12
    //   911: ifle -> 923
    //   914: iload #12
    //   916: iload #17
    //   918: invokestatic min : (II)I
    //   921: istore #11
    //   923: iload #5
    //   925: istore #17
    //   927: iload #8
    //   929: istore #12
    //   931: iload #11
    //   933: iload #5
    //   935: if_icmpeq -> 948
    //   938: iload #8
    //   940: iconst_1
    //   941: iadd
    //   942: istore #12
    //   944: iload #11
    //   946: istore #17
    //   948: aload #22
    //   950: iload #17
    //   952: invokevirtual d : (I)V
    //   955: iload #12
    //   957: istore #8
    //   959: iinc #16, 1
    //   962: goto -> 735
    //   965: iload #8
    //   967: ifle -> 1113
    //   970: iload #7
    //   972: iload #8
    //   974: isub
    //   975: istore #11
    //   977: iconst_0
    //   978: istore #9
    //   980: iconst_0
    //   981: istore #5
    //   983: iload #11
    //   985: istore #7
    //   987: iload #5
    //   989: istore #6
    //   991: iload #9
    //   993: iload #19
    //   995: if_icmpge -> 1113
    //   998: aload_1
    //   999: iload #9
    //   1001: invokevirtual get : (I)Ljava/lang/Object;
    //   1004: checkcast m52
    //   1007: astore #22
    //   1009: aload #22
    //   1011: getfield b : Ler;
    //   1014: getfield g0 : I
    //   1017: bipush #8
    //   1019: if_icmpne -> 1025
    //   1022: goto -> 1107
    //   1025: iload #5
    //   1027: istore #6
    //   1029: iload #9
    //   1031: ifle -> 1058
    //   1034: iload #5
    //   1036: istore #6
    //   1038: iload #9
    //   1040: iload #13
    //   1042: if_icmplt -> 1058
    //   1045: iload #5
    //   1047: aload #22
    //   1049: getfield h : Liy;
    //   1052: getfield f : I
    //   1055: iadd
    //   1056: istore #6
    //   1058: iload #6
    //   1060: aload #22
    //   1062: getfield e : Lrz;
    //   1065: getfield g : I
    //   1068: iadd
    //   1069: istore #6
    //   1071: iload #6
    //   1073: istore #5
    //   1075: iload #9
    //   1077: iload #18
    //   1079: if_icmpge -> 1107
    //   1082: iload #6
    //   1084: istore #5
    //   1086: iload #9
    //   1088: iload #14
    //   1090: if_icmpge -> 1107
    //   1093: iload #6
    //   1095: aload #22
    //   1097: getfield i : Liy;
    //   1100: getfield f : I
    //   1103: ineg
    //   1104: iadd
    //   1105: istore #5
    //   1107: iinc #9, 1
    //   1110: goto -> 983
    //   1113: aload_0
    //   1114: getfield l : I
    //   1117: iconst_2
    //   1118: if_icmpne -> 1140
    //   1121: iload #8
    //   1123: ifne -> 1140
    //   1126: aload_0
    //   1127: iconst_0
    //   1128: putfield l : I
    //   1131: iload #10
    //   1133: istore #5
    //   1135: fload_2
    //   1136: fstore_3
    //   1137: goto -> 1152
    //   1140: iload #10
    //   1142: istore #5
    //   1144: fload_2
    //   1145: fstore_3
    //   1146: goto -> 1152
    //   1149: ldc 0.5
    //   1151: fstore_3
    //   1152: iload #6
    //   1154: iload #20
    //   1156: if_icmple -> 1164
    //   1159: aload_0
    //   1160: iconst_2
    //   1161: putfield l : I
    //   1164: iload #15
    //   1166: ifle -> 1186
    //   1169: iload #7
    //   1171: ifne -> 1186
    //   1174: iload #13
    //   1176: iload #14
    //   1178: if_icmpne -> 1186
    //   1181: aload_0
    //   1182: iconst_2
    //   1183: putfield l : I
    //   1186: aload_0
    //   1187: getfield l : I
    //   1190: istore #8
    //   1192: iload #8
    //   1194: iconst_1
    //   1195: if_icmpne -> 1613
    //   1198: iload #15
    //   1200: iconst_1
    //   1201: if_icmple -> 1219
    //   1204: iload #20
    //   1206: iload #6
    //   1208: isub
    //   1209: iload #15
    //   1211: iconst_1
    //   1212: isub
    //   1213: idiv
    //   1214: istore #6
    //   1216: goto -> 1240
    //   1219: iload #15
    //   1221: iconst_1
    //   1222: if_icmpne -> 1237
    //   1225: iload #20
    //   1227: iload #6
    //   1229: isub
    //   1230: iconst_2
    //   1231: idiv
    //   1232: istore #6
    //   1234: goto -> 1240
    //   1237: iconst_0
    //   1238: istore #6
    //   1240: iload #6
    //   1242: istore #8
    //   1244: iload #7
    //   1246: ifle -> 1252
    //   1249: iconst_0
    //   1250: istore #8
    //   1252: iconst_0
    //   1253: istore #6
    //   1255: iload #5
    //   1257: istore #7
    //   1259: iload #6
    //   1261: iload #19
    //   1263: if_icmpge -> 2378
    //   1266: iload #21
    //   1268: ifeq -> 1283
    //   1271: iload #19
    //   1273: iload #6
    //   1275: iconst_1
    //   1276: iadd
    //   1277: isub
    //   1278: istore #5
    //   1280: goto -> 1287
    //   1283: iload #6
    //   1285: istore #5
    //   1287: aload_1
    //   1288: iload #5
    //   1290: invokevirtual get : (I)Ljava/lang/Object;
    //   1293: checkcast m52
    //   1296: astore #22
    //   1298: aload #22
    //   1300: getfield b : Ler;
    //   1303: astore #25
    //   1305: aload #22
    //   1307: getfield i : Liy;
    //   1310: astore #23
    //   1312: aload #22
    //   1314: getfield h : Liy;
    //   1317: astore #24
    //   1319: aload #25
    //   1321: getfield g0 : I
    //   1324: bipush #8
    //   1326: if_icmpne -> 1350
    //   1329: aload #24
    //   1331: iload #7
    //   1333: invokevirtual d : (I)V
    //   1336: aload #23
    //   1338: iload #7
    //   1340: invokevirtual d : (I)V
    //   1343: iload #7
    //   1345: istore #5
    //   1347: goto -> 1603
    //   1350: iload #7
    //   1352: istore #5
    //   1354: iload #6
    //   1356: ifle -> 1381
    //   1359: iload #21
    //   1361: ifeq -> 1374
    //   1364: iload #7
    //   1366: iload #8
    //   1368: isub
    //   1369: istore #5
    //   1371: goto -> 1381
    //   1374: iload #7
    //   1376: iload #8
    //   1378: iadd
    //   1379: istore #5
    //   1381: iload #5
    //   1383: istore #7
    //   1385: iload #6
    //   1387: ifle -> 1429
    //   1390: iload #5
    //   1392: istore #7
    //   1394: iload #6
    //   1396: iload #13
    //   1398: if_icmplt -> 1429
    //   1401: iload #21
    //   1403: ifeq -> 1419
    //   1406: iload #5
    //   1408: aload #24
    //   1410: getfield f : I
    //   1413: isub
    //   1414: istore #7
    //   1416: goto -> 1429
    //   1419: iload #5
    //   1421: aload #24
    //   1423: getfield f : I
    //   1426: iadd
    //   1427: istore #7
    //   1429: iload #21
    //   1431: ifeq -> 1444
    //   1434: aload #23
    //   1436: iload #7
    //   1438: invokevirtual d : (I)V
    //   1441: goto -> 1451
    //   1444: aload #24
    //   1446: iload #7
    //   1448: invokevirtual d : (I)V
    //   1451: aload #22
    //   1453: getfield e : Lrz;
    //   1456: astore #25
    //   1458: aload #25
    //   1460: getfield g : I
    //   1463: istore #9
    //   1465: iload #9
    //   1467: istore #5
    //   1469: aload #22
    //   1471: getfield d : I
    //   1474: iconst_3
    //   1475: if_icmpne -> 1498
    //   1478: iload #9
    //   1480: istore #5
    //   1482: aload #22
    //   1484: getfield a : I
    //   1487: iconst_1
    //   1488: if_icmpne -> 1498
    //   1491: aload #25
    //   1493: getfield m : I
    //   1496: istore #5
    //   1498: iload #21
    //   1500: ifeq -> 1513
    //   1503: iload #7
    //   1505: iload #5
    //   1507: isub
    //   1508: istore #7
    //   1510: goto -> 1520
    //   1513: iload #7
    //   1515: iload #5
    //   1517: iadd
    //   1518: istore #7
    //   1520: iload #21
    //   1522: ifeq -> 1535
    //   1525: aload #24
    //   1527: iload #7
    //   1529: invokevirtual d : (I)V
    //   1532: goto -> 1545
    //   1535: aload #23
    //   1537: iload #7
    //   1539: invokevirtual d : (I)V
    //   1542: goto -> 1532
    //   1545: aload #22
    //   1547: iconst_1
    //   1548: putfield g : Z
    //   1551: iload #7
    //   1553: istore #5
    //   1555: iload #6
    //   1557: iload #18
    //   1559: if_icmpge -> 1603
    //   1562: iload #7
    //   1564: istore #5
    //   1566: iload #6
    //   1568: iload #14
    //   1570: if_icmpge -> 1603
    //   1573: iload #21
    //   1575: ifeq -> 1592
    //   1578: iload #7
    //   1580: aload #23
    //   1582: getfield f : I
    //   1585: ineg
    //   1586: isub
    //   1587: istore #5
    //   1589: goto -> 1603
    //   1592: iload #7
    //   1594: aload #23
    //   1596: getfield f : I
    //   1599: ineg
    //   1600: iadd
    //   1601: istore #5
    //   1603: iinc #6, 1
    //   1606: iload #5
    //   1608: istore #7
    //   1610: goto -> 1259
    //   1613: iload #8
    //   1615: ifne -> 1974
    //   1618: iload #20
    //   1620: iload #6
    //   1622: isub
    //   1623: iload #15
    //   1625: iconst_1
    //   1626: iadd
    //   1627: idiv
    //   1628: istore #8
    //   1630: iload #7
    //   1632: ifle -> 1638
    //   1635: iconst_0
    //   1636: istore #8
    //   1638: iconst_0
    //   1639: istore #6
    //   1641: iload #6
    //   1643: iload #19
    //   1645: if_icmpge -> 2378
    //   1648: iload #21
    //   1650: ifeq -> 1665
    //   1653: iload #19
    //   1655: iload #6
    //   1657: iconst_1
    //   1658: iadd
    //   1659: isub
    //   1660: istore #7
    //   1662: goto -> 1669
    //   1665: iload #6
    //   1667: istore #7
    //   1669: aload_1
    //   1670: iload #7
    //   1672: invokevirtual get : (I)Ljava/lang/Object;
    //   1675: checkcast m52
    //   1678: astore #23
    //   1680: aload #23
    //   1682: getfield b : Ler;
    //   1685: astore #25
    //   1687: aload #23
    //   1689: getfield i : Liy;
    //   1692: astore #22
    //   1694: aload #23
    //   1696: getfield h : Liy;
    //   1699: astore #24
    //   1701: aload #25
    //   1703: getfield g0 : I
    //   1706: bipush #8
    //   1708: if_icmpne -> 1728
    //   1711: aload #24
    //   1713: iload #5
    //   1715: invokevirtual d : (I)V
    //   1718: aload #22
    //   1720: iload #5
    //   1722: invokevirtual d : (I)V
    //   1725: goto -> 1968
    //   1728: iload #21
    //   1730: ifeq -> 1743
    //   1733: iload #5
    //   1735: iload #8
    //   1737: isub
    //   1738: istore #7
    //   1740: goto -> 1750
    //   1743: iload #5
    //   1745: iload #8
    //   1747: iadd
    //   1748: istore #7
    //   1750: iload #7
    //   1752: istore #5
    //   1754: iload #6
    //   1756: ifle -> 1798
    //   1759: iload #7
    //   1761: istore #5
    //   1763: iload #6
    //   1765: iload #13
    //   1767: if_icmplt -> 1798
    //   1770: iload #21
    //   1772: ifeq -> 1788
    //   1775: iload #7
    //   1777: aload #24
    //   1779: getfield f : I
    //   1782: isub
    //   1783: istore #5
    //   1785: goto -> 1798
    //   1788: iload #7
    //   1790: aload #24
    //   1792: getfield f : I
    //   1795: iadd
    //   1796: istore #5
    //   1798: iload #21
    //   1800: ifeq -> 1813
    //   1803: aload #22
    //   1805: iload #5
    //   1807: invokevirtual d : (I)V
    //   1810: goto -> 1820
    //   1813: aload #24
    //   1815: iload #5
    //   1817: invokevirtual d : (I)V
    //   1820: aload #23
    //   1822: getfield e : Lrz;
    //   1825: astore #25
    //   1827: aload #25
    //   1829: getfield g : I
    //   1832: istore #9
    //   1834: iload #9
    //   1836: istore #7
    //   1838: aload #23
    //   1840: getfield d : I
    //   1843: iconst_3
    //   1844: if_icmpne -> 1872
    //   1847: iload #9
    //   1849: istore #7
    //   1851: aload #23
    //   1853: getfield a : I
    //   1856: iconst_1
    //   1857: if_icmpne -> 1872
    //   1860: iload #9
    //   1862: aload #25
    //   1864: getfield m : I
    //   1867: invokestatic min : (II)I
    //   1870: istore #7
    //   1872: iload #21
    //   1874: ifeq -> 1887
    //   1877: iload #5
    //   1879: iload #7
    //   1881: isub
    //   1882: istore #7
    //   1884: goto -> 1894
    //   1887: iload #5
    //   1889: iload #7
    //   1891: iadd
    //   1892: istore #7
    //   1894: iload #21
    //   1896: ifeq -> 1909
    //   1899: aload #24
    //   1901: iload #7
    //   1903: invokevirtual d : (I)V
    //   1906: goto -> 1916
    //   1909: aload #22
    //   1911: iload #7
    //   1913: invokevirtual d : (I)V
    //   1916: iload #7
    //   1918: istore #5
    //   1920: iload #6
    //   1922: iload #18
    //   1924: if_icmpge -> 1968
    //   1927: iload #7
    //   1929: istore #5
    //   1931: iload #6
    //   1933: iload #14
    //   1935: if_icmpge -> 1968
    //   1938: iload #21
    //   1940: ifeq -> 1957
    //   1943: iload #7
    //   1945: aload #22
    //   1947: getfield f : I
    //   1950: ineg
    //   1951: isub
    //   1952: istore #5
    //   1954: goto -> 1968
    //   1957: iload #7
    //   1959: aload #22
    //   1961: getfield f : I
    //   1964: ineg
    //   1965: iadd
    //   1966: istore #5
    //   1968: iinc #6, 1
    //   1971: goto -> 1641
    //   1974: iload #8
    //   1976: iconst_2
    //   1977: if_icmpne -> 2378
    //   1980: aload_0
    //   1981: getfield f : I
    //   1984: istore #8
    //   1986: aload_0
    //   1987: getfield b : Ler;
    //   1990: astore #22
    //   1992: iload #8
    //   1994: ifne -> 2006
    //   1997: aload #22
    //   1999: getfield d0 : F
    //   2002: fstore_2
    //   2003: goto -> 2012
    //   2006: aload #22
    //   2008: getfield e0 : F
    //   2011: fstore_2
    //   2012: fload_2
    //   2013: fstore #4
    //   2015: iload #21
    //   2017: ifeq -> 2025
    //   2020: fconst_1
    //   2021: fload_2
    //   2022: fsub
    //   2023: fstore #4
    //   2025: iload #20
    //   2027: iload #6
    //   2029: isub
    //   2030: i2f
    //   2031: fload #4
    //   2033: fmul
    //   2034: fload_3
    //   2035: fadd
    //   2036: f2i
    //   2037: istore #6
    //   2039: iload #6
    //   2041: iflt -> 2049
    //   2044: iload #7
    //   2046: ifle -> 2052
    //   2049: iconst_0
    //   2050: istore #6
    //   2052: iload #21
    //   2054: ifeq -> 2067
    //   2057: iload #5
    //   2059: iload #6
    //   2061: isub
    //   2062: istore #5
    //   2064: goto -> 2074
    //   2067: iload #5
    //   2069: iload #6
    //   2071: iadd
    //   2072: istore #5
    //   2074: iconst_0
    //   2075: istore #6
    //   2077: iload #6
    //   2079: iload #19
    //   2081: if_icmpge -> 2378
    //   2084: iload #21
    //   2086: ifeq -> 2101
    //   2089: iload #19
    //   2091: iload #6
    //   2093: iconst_1
    //   2094: iadd
    //   2095: isub
    //   2096: istore #7
    //   2098: goto -> 2105
    //   2101: iload #6
    //   2103: istore #7
    //   2105: aload_1
    //   2106: iload #7
    //   2108: invokevirtual get : (I)Ljava/lang/Object;
    //   2111: checkcast m52
    //   2114: astore #23
    //   2116: aload #23
    //   2118: getfield b : Ler;
    //   2121: astore #25
    //   2123: aload #23
    //   2125: getfield i : Liy;
    //   2128: astore #22
    //   2130: aload #23
    //   2132: getfield h : Liy;
    //   2135: astore #24
    //   2137: aload #25
    //   2139: getfield g0 : I
    //   2142: bipush #8
    //   2144: if_icmpne -> 2164
    //   2147: aload #24
    //   2149: iload #5
    //   2151: invokevirtual d : (I)V
    //   2154: aload #22
    //   2156: iload #5
    //   2158: invokevirtual d : (I)V
    //   2161: goto -> 2372
    //   2164: iload #5
    //   2166: istore #7
    //   2168: iload #6
    //   2170: ifle -> 2212
    //   2173: iload #5
    //   2175: istore #7
    //   2177: iload #6
    //   2179: iload #13
    //   2181: if_icmplt -> 2212
    //   2184: iload #21
    //   2186: ifeq -> 2202
    //   2189: iload #5
    //   2191: aload #24
    //   2193: getfield f : I
    //   2196: isub
    //   2197: istore #7
    //   2199: goto -> 2212
    //   2202: iload #5
    //   2204: aload #24
    //   2206: getfield f : I
    //   2209: iadd
    //   2210: istore #7
    //   2212: iload #21
    //   2214: ifeq -> 2227
    //   2217: aload #22
    //   2219: iload #7
    //   2221: invokevirtual d : (I)V
    //   2224: goto -> 2234
    //   2227: aload #24
    //   2229: iload #7
    //   2231: invokevirtual d : (I)V
    //   2234: aload #23
    //   2236: getfield e : Lrz;
    //   2239: astore #25
    //   2241: aload #25
    //   2243: getfield g : I
    //   2246: istore #5
    //   2248: aload #23
    //   2250: getfield d : I
    //   2253: iconst_3
    //   2254: if_icmpne -> 2276
    //   2257: aload #23
    //   2259: getfield a : I
    //   2262: iconst_1
    //   2263: if_icmpne -> 2276
    //   2266: aload #25
    //   2268: getfield m : I
    //   2271: istore #5
    //   2273: goto -> 2276
    //   2276: iload #21
    //   2278: ifeq -> 2291
    //   2281: iload #7
    //   2283: iload #5
    //   2285: isub
    //   2286: istore #7
    //   2288: goto -> 2298
    //   2291: iload #7
    //   2293: iload #5
    //   2295: iadd
    //   2296: istore #7
    //   2298: iload #21
    //   2300: ifeq -> 2313
    //   2303: aload #24
    //   2305: iload #7
    //   2307: invokevirtual d : (I)V
    //   2310: goto -> 2320
    //   2313: aload #22
    //   2315: iload #7
    //   2317: invokevirtual d : (I)V
    //   2320: iload #7
    //   2322: istore #5
    //   2324: iload #6
    //   2326: iload #18
    //   2328: if_icmpge -> 2372
    //   2331: iload #7
    //   2333: istore #5
    //   2335: iload #6
    //   2337: iload #14
    //   2339: if_icmpge -> 2372
    //   2342: iload #21
    //   2344: ifeq -> 2361
    //   2347: iload #7
    //   2349: aload #22
    //   2351: getfield f : I
    //   2354: ineg
    //   2355: isub
    //   2356: istore #5
    //   2358: goto -> 2372
    //   2361: iload #7
    //   2363: aload #22
    //   2365: getfield f : I
    //   2368: ineg
    //   2369: iadd
    //   2370: istore #5
    //   2372: iinc #6, 1
    //   2375: goto -> 2077
    //   2378: return
  }
  
  public final void d() {
    iy iy3;
    ArrayList<Object> arrayList = this.k;
    int j = arrayList.size();
    int i = 0;
    while (i < j) {
      m52 m521 = (m52)arrayList.get(i);
      i++;
      ((m52)m521).d();
    } 
    i = arrayList.size();
    if (i < 1)
      return; 
    er er2 = ((m52)arrayList.get(0)).b;
    er er1 = ((m52)arrayList.get(i - 1)).b;
    i = this.f;
    iy iy1 = this.i;
    iy iy2 = this.h;
    if (i == 0) {
      bq bq2 = er2.I;
      bq bq1 = er1.K;
      iy3 = m52.i(bq2, 0);
      i = bq2.d();
      er er = m();
      if (er != null)
        i = er.I.d(); 
      if (iy3 != null)
        m52.b(iy2, iy3, i); 
      iy3 = m52.i(bq1, 0);
      i = bq1.d();
      er1 = n();
      if (er1 != null)
        i = er1.K.d(); 
      if (iy3 != null)
        m52.b(iy1, iy3, -i); 
    } else {
      bq bq2 = ((er)iy3).J;
      bq bq1 = er1.L;
      iy iy5 = m52.i(bq2, 1);
      i = bq2.d();
      er er4 = m();
      if (er4 != null)
        i = er4.J.d(); 
      if (iy5 != null)
        m52.b(iy2, iy5, i); 
      iy iy4 = m52.i(bq1, 1);
      i = bq1.d();
      er er3 = n();
      if (er3 != null)
        i = er3.L.d(); 
      if (iy4 != null)
        m52.b(iy1, iy4, -i); 
    } 
    iy2.a = this;
    iy1.a = this;
  }
  
  public final void e() {
    byte b = 0;
    while (true) {
      ArrayList<m52> arrayList = this.k;
      if (b < arrayList.size()) {
        ((m52)arrayList.get(b)).e();
        b++;
        continue;
      } 
      break;
    } 
  }
  
  public final void f() {
    this.c = null;
    ArrayList<Object> arrayList = this.k;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      m52 m521 = (m52)arrayList.get(b);
      b++;
      ((m52)m521).f();
    } 
  }
  
  public final long j() {
    ArrayList<m52> arrayList = this.k;
    int i = arrayList.size();
    long l = 0L;
    for (byte b = 0; b < i; b++) {
      m52 m521 = arrayList.get(b);
      long l1 = m521.h.f;
      long l2 = m521.j();
      l = m521.i.f + l2 + l + l1;
    } 
    return l;
  }
  
  public final boolean k() {
    ArrayList<m52> arrayList = this.k;
    int i = arrayList.size();
    for (byte b = 0; b < i; b++) {
      if (!((m52)arrayList.get(b)).k())
        return false; 
    } 
    return true;
  }
  
  public final er m() {
    byte b = 0;
    while (true) {
      ArrayList arrayList = this.k;
      if (b < arrayList.size()) {
        er er = ((m52)arrayList.get(b)).b;
        if (er.g0 != 8)
          return er; 
        b++;
        continue;
      } 
      return null;
    } 
  }
  
  public final er n() {
    ArrayList arrayList = this.k;
    for (int i = arrayList.size() - 1; i >= 0; i--) {
      er er = ((m52)arrayList.get(i)).b;
      if (er.g0 != 8)
        return er; 
    } 
    return null;
  }
  
  public final String toString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder("ChainRun ");
    if (this.f == 0) {
      str = "horizontal : ";
    } else {
      str = "vertical : ";
    } 
    stringBuilder.append(str);
    ArrayList<Object> arrayList = this.k;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      m52 m521 = (m52)arrayList.get(b);
      b++;
      m521 = m521;
      stringBuilder.append("<");
      stringBuilder.append(m521);
      stringBuilder.append("> ");
    } 
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */