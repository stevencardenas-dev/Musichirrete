public final class fy extends n21 {
  public final int k;
  
  public final void d(ai1 paramai1, Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield k : I
    //   4: istore_3
    //   5: iconst_3
    //   6: istore #4
    //   8: iload_3
    //   9: tableswitch default -> 44, 0 -> 1625, 1 -> 1584, 2 -> 1533, 3 -> 1495, 4 -> 82
    //   44: aload_2
    //   45: checkcast d82
    //   48: astore_2
    //   49: aload_1
    //   50: invokevirtual getClass : ()Ljava/lang/Class;
    //   53: pop
    //   54: aload_2
    //   55: invokevirtual getClass : ()Ljava/lang/Class;
    //   58: pop
    //   59: aload_1
    //   60: aload_2
    //   61: getfield a : Ljava/lang/String;
    //   64: iconst_1
    //   65: invokeinterface i : (Ljava/lang/String;I)V
    //   70: aload_1
    //   71: aload_2
    //   72: getfield b : Ljava/lang/String;
    //   75: iconst_2
    //   76: invokeinterface i : (Ljava/lang/String;I)V
    //   81: return
    //   82: aload_2
    //   83: checkcast y72
    //   86: astore #6
    //   88: aload_1
    //   89: invokevirtual getClass : ()Ljava/lang/Class;
    //   92: pop
    //   93: aload #6
    //   95: invokevirtual getClass : ()Ljava/lang/Class;
    //   98: pop
    //   99: aload_1
    //   100: aload #6
    //   102: getfield a : Ljava/lang/String;
    //   105: iconst_1
    //   106: invokeinterface i : (Ljava/lang/String;I)V
    //   111: aload_1
    //   112: iconst_2
    //   113: aload #6
    //   115: getfield b : Lo72;
    //   118: invokestatic l0 : (Lo72;)I
    //   121: i2l
    //   122: invokeinterface e : (IJ)V
    //   127: aload_1
    //   128: aload #6
    //   130: getfield c : Ljava/lang/String;
    //   133: iconst_3
    //   134: invokeinterface i : (Ljava/lang/String;I)V
    //   139: aload_1
    //   140: aload #6
    //   142: getfield d : Ljava/lang/String;
    //   145: iconst_4
    //   146: invokeinterface i : (Ljava/lang/String;I)V
    //   151: getstatic du.b : Ldu;
    //   154: astore_2
    //   155: aload_1
    //   156: iconst_5
    //   157: aload #6
    //   159: getfield e : Ldu;
    //   162: invokestatic n0 : (Ldu;)[B
    //   165: invokeinterface f : (I[B)V
    //   170: aload_1
    //   171: bipush #6
    //   173: aload #6
    //   175: getfield f : Ldu;
    //   178: invokestatic n0 : (Ldu;)[B
    //   181: invokeinterface f : (I[B)V
    //   186: aload_1
    //   187: bipush #7
    //   189: aload #6
    //   191: getfield g : J
    //   194: invokeinterface e : (IJ)V
    //   199: aload_1
    //   200: bipush #8
    //   202: aload #6
    //   204: getfield h : J
    //   207: invokeinterface e : (IJ)V
    //   212: aload_1
    //   213: bipush #9
    //   215: aload #6
    //   217: getfield i : J
    //   220: invokeinterface e : (IJ)V
    //   225: aload_1
    //   226: bipush #10
    //   228: aload #6
    //   230: getfield k : I
    //   233: i2l
    //   234: invokeinterface e : (IJ)V
    //   239: aload #6
    //   241: getfield l : Lqb;
    //   244: astore_2
    //   245: aload_2
    //   246: invokevirtual getClass : ()Ljava/lang/Class;
    //   249: pop
    //   250: aload_2
    //   251: invokevirtual ordinal : ()I
    //   254: istore_3
    //   255: iload_3
    //   256: ifeq -> 277
    //   259: iload_3
    //   260: iconst_1
    //   261: if_icmpne -> 269
    //   264: iconst_1
    //   265: istore_3
    //   266: goto -> 279
    //   269: new java/lang/RuntimeException
    //   272: dup
    //   273: invokespecial <init> : ()V
    //   276: athrow
    //   277: iconst_0
    //   278: istore_3
    //   279: aload_1
    //   280: bipush #11
    //   282: iload_3
    //   283: i2l
    //   284: invokeinterface e : (IJ)V
    //   289: aload_1
    //   290: bipush #12
    //   292: aload #6
    //   294: getfield m : J
    //   297: invokeinterface e : (IJ)V
    //   302: aload_1
    //   303: bipush #13
    //   305: aload #6
    //   307: getfield n : J
    //   310: invokeinterface e : (IJ)V
    //   315: aload_1
    //   316: bipush #14
    //   318: aload #6
    //   320: getfield o : J
    //   323: invokeinterface e : (IJ)V
    //   328: aload_1
    //   329: bipush #15
    //   331: aload #6
    //   333: getfield p : J
    //   336: invokeinterface e : (IJ)V
    //   341: aload_1
    //   342: bipush #16
    //   344: aload #6
    //   346: getfield q : Z
    //   349: i2l
    //   350: invokeinterface e : (IJ)V
    //   355: aload #6
    //   357: getfield r : Lg51;
    //   360: astore_2
    //   361: aload_2
    //   362: invokevirtual getClass : ()Ljava/lang/Class;
    //   365: pop
    //   366: aload_2
    //   367: invokevirtual ordinal : ()I
    //   370: istore_3
    //   371: iload_3
    //   372: ifeq -> 393
    //   375: iload_3
    //   376: iconst_1
    //   377: if_icmpne -> 385
    //   380: iconst_1
    //   381: istore_3
    //   382: goto -> 395
    //   385: new java/lang/RuntimeException
    //   388: dup
    //   389: invokespecial <init> : ()V
    //   392: athrow
    //   393: iconst_0
    //   394: istore_3
    //   395: aload_1
    //   396: bipush #17
    //   398: iload_3
    //   399: i2l
    //   400: invokeinterface e : (IJ)V
    //   405: aload_1
    //   406: bipush #18
    //   408: aload #6
    //   410: getfield s : I
    //   413: i2l
    //   414: invokeinterface e : (IJ)V
    //   419: aload_1
    //   420: bipush #19
    //   422: aload #6
    //   424: getfield t : I
    //   427: i2l
    //   428: invokeinterface e : (IJ)V
    //   433: aload_1
    //   434: bipush #20
    //   436: aload #6
    //   438: getfield u : J
    //   441: invokeinterface e : (IJ)V
    //   446: aload_1
    //   447: bipush #21
    //   449: aload #6
    //   451: getfield v : I
    //   454: i2l
    //   455: invokeinterface e : (IJ)V
    //   460: aload_1
    //   461: bipush #22
    //   463: aload #6
    //   465: getfield w : I
    //   468: i2l
    //   469: invokeinterface e : (IJ)V
    //   474: aload #6
    //   476: getfield x : Ljava/lang/String;
    //   479: astore_2
    //   480: aload_2
    //   481: ifnonnull -> 495
    //   484: aload_1
    //   485: bipush #23
    //   487: invokeinterface b : (I)V
    //   492: goto -> 504
    //   495: aload_1
    //   496: aload_2
    //   497: bipush #23
    //   499: invokeinterface i : (Ljava/lang/String;I)V
    //   504: aload #6
    //   506: getfield y : Ljava/lang/Boolean;
    //   509: astore_2
    //   510: aload_2
    //   511: ifnull -> 525
    //   514: aload_2
    //   515: invokevirtual booleanValue : ()Z
    //   518: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   521: astore_2
    //   522: goto -> 527
    //   525: aconst_null
    //   526: astore_2
    //   527: aload_2
    //   528: ifnonnull -> 542
    //   531: aload_1
    //   532: bipush #24
    //   534: invokeinterface b : (I)V
    //   539: goto -> 555
    //   542: aload_1
    //   543: bipush #24
    //   545: aload_2
    //   546: invokevirtual intValue : ()I
    //   549: i2l
    //   550: invokeinterface e : (IJ)V
    //   555: aload #6
    //   557: getfield j : Lhr;
    //   560: astore #7
    //   562: aload #7
    //   564: getfield a : Lc21;
    //   567: astore_2
    //   568: aload_2
    //   569: invokevirtual getClass : ()Ljava/lang/Class;
    //   572: pop
    //   573: aload_2
    //   574: invokevirtual ordinal : ()I
    //   577: istore #5
    //   579: iload #5
    //   581: ifeq -> 657
    //   584: iload #5
    //   586: iconst_1
    //   587: if_icmpeq -> 652
    //   590: iload #5
    //   592: iconst_2
    //   593: if_icmpeq -> 647
    //   596: iload #4
    //   598: istore_3
    //   599: iload #5
    //   601: iconst_3
    //   602: if_icmpeq -> 659
    //   605: iload #5
    //   607: iconst_4
    //   608: if_icmpeq -> 642
    //   611: getstatic android/os/Build$VERSION.SDK_INT : I
    //   614: bipush #30
    //   616: if_icmplt -> 631
    //   619: aload_2
    //   620: getstatic c21.h : Lc21;
    //   623: if_acmpne -> 631
    //   626: iconst_5
    //   627: istore_3
    //   628: goto -> 659
    //   631: aload_2
    //   632: ldc ' to int'
    //   634: ldc 'Could not convert '
    //   636: invokestatic o : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    //   639: goto -> 1439
    //   642: iconst_4
    //   643: istore_3
    //   644: goto -> 659
    //   647: iconst_2
    //   648: istore_3
    //   649: goto -> 659
    //   652: iconst_1
    //   653: istore_3
    //   654: goto -> 659
    //   657: iconst_0
    //   658: istore_3
    //   659: aload_1
    //   660: bipush #25
    //   662: iload_3
    //   663: i2l
    //   664: invokeinterface e : (IJ)V
    //   669: aload #7
    //   671: getfield b : Lv11;
    //   674: astore_2
    //   675: aload_2
    //   676: invokevirtual getClass : ()Ljava/lang/Class;
    //   679: pop
    //   680: getstatic android/os/Build$VERSION.SDK_INT : I
    //   683: istore_3
    //   684: iload_3
    //   685: bipush #28
    //   687: if_icmpge -> 697
    //   690: iconst_0
    //   691: newarray byte
    //   693: astore_2
    //   694: goto -> 1197
    //   697: aload_2
    //   698: getfield a : Ljava/lang/Object;
    //   701: checkcast android/net/NetworkRequest
    //   704: astore #6
    //   706: aload #6
    //   708: ifnonnull -> 718
    //   711: iconst_0
    //   712: newarray byte
    //   714: astore_2
    //   715: goto -> 1197
    //   718: new java/io/ByteArrayOutputStream
    //   721: dup
    //   722: invokespecial <init> : ()V
    //   725: astore #8
    //   727: new java/io/ObjectOutputStream
    //   730: astore #9
    //   732: aload #9
    //   734: aload #8
    //   736: invokespecial <init> : (Ljava/io/OutputStream;)V
    //   739: iload_3
    //   740: bipush #31
    //   742: if_icmplt -> 754
    //   745: aload #6
    //   747: invokestatic f : (Landroid/net/NetworkRequest;)[I
    //   750: astore_2
    //   751: goto -> 857
    //   754: new java/util/ArrayList
    //   757: astore_2
    //   758: aload_2
    //   759: invokespecial <init> : ()V
    //   762: iconst_0
    //   763: istore_3
    //   764: iload_3
    //   765: bipush #10
    //   767: if_icmpge -> 852
    //   770: bipush #10
    //   772: newarray int
    //   774: dup
    //   775: iconst_0
    //   776: iconst_2
    //   777: iastore
    //   778: dup
    //   779: iconst_1
    //   780: iconst_0
    //   781: iastore
    //   782: dup
    //   783: iconst_2
    //   784: iconst_3
    //   785: iastore
    //   786: dup
    //   787: iconst_3
    //   788: bipush #6
    //   790: iastore
    //   791: dup
    //   792: iconst_4
    //   793: bipush #10
    //   795: iastore
    //   796: dup
    //   797: iconst_5
    //   798: bipush #9
    //   800: iastore
    //   801: dup
    //   802: bipush #6
    //   804: bipush #8
    //   806: iastore
    //   807: dup
    //   808: bipush #7
    //   810: iconst_4
    //   811: iastore
    //   812: dup
    //   813: bipush #8
    //   815: iconst_1
    //   816: iastore
    //   817: dup
    //   818: bipush #9
    //   820: iconst_5
    //   821: iastore
    //   822: iload_3
    //   823: iaload
    //   824: istore #4
    //   826: aload #6
    //   828: iload #4
    //   830: invokestatic s : (Landroid/net/NetworkRequest;I)Z
    //   833: ifeq -> 846
    //   836: aload_2
    //   837: iload #4
    //   839: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   842: invokevirtual add : (Ljava/lang/Object;)Z
    //   845: pop
    //   846: iinc #3, 1
    //   849: goto -> 764
    //   852: aload_2
    //   853: invokestatic u0 : (Ljava/util/ArrayList;)[I
    //   856: astore_2
    //   857: getstatic android/os/Build$VERSION.SDK_INT : I
    //   860: bipush #31
    //   862: if_icmplt -> 875
    //   865: aload #6
    //   867: invokestatic a : (Landroid/net/NetworkRequest;)[I
    //   870: astore #6
    //   872: goto -> 1103
    //   875: new java/util/ArrayList
    //   878: astore #10
    //   880: aload #10
    //   882: invokespecial <init> : ()V
    //   885: iconst_0
    //   886: istore_3
    //   887: iload_3
    //   888: bipush #30
    //   890: if_icmpge -> 1096
    //   893: bipush #30
    //   895: newarray int
    //   897: dup
    //   898: iconst_0
    //   899: bipush #17
    //   901: iastore
    //   902: dup
    //   903: iconst_1
    //   904: iconst_5
    //   905: iastore
    //   906: dup
    //   907: iconst_2
    //   908: iconst_2
    //   909: iastore
    //   910: dup
    //   911: iconst_3
    //   912: bipush #10
    //   914: iastore
    //   915: dup
    //   916: iconst_4
    //   917: bipush #29
    //   919: iastore
    //   920: dup
    //   921: iconst_5
    //   922: bipush #19
    //   924: iastore
    //   925: dup
    //   926: bipush #6
    //   928: iconst_3
    //   929: iastore
    //   930: dup
    //   931: bipush #7
    //   933: bipush #32
    //   935: iastore
    //   936: dup
    //   937: bipush #8
    //   939: bipush #7
    //   941: iastore
    //   942: dup
    //   943: bipush #9
    //   945: iconst_4
    //   946: iastore
    //   947: dup
    //   948: bipush #10
    //   950: bipush #12
    //   952: iastore
    //   953: dup
    //   954: bipush #11
    //   956: bipush #36
    //   958: iastore
    //   959: dup
    //   960: bipush #12
    //   962: bipush #23
    //   964: iastore
    //   965: dup
    //   966: bipush #13
    //   968: iconst_0
    //   969: iastore
    //   970: dup
    //   971: bipush #14
    //   973: bipush #33
    //   975: iastore
    //   976: dup
    //   977: bipush #15
    //   979: bipush #20
    //   981: iastore
    //   982: dup
    //   983: bipush #16
    //   985: bipush #11
    //   987: iastore
    //   988: dup
    //   989: bipush #17
    //   991: bipush #13
    //   993: iastore
    //   994: dup
    //   995: bipush #18
    //   997: bipush #18
    //   999: iastore
    //   1000: dup
    //   1001: bipush #19
    //   1003: bipush #21
    //   1005: iastore
    //   1006: dup
    //   1007: bipush #20
    //   1009: bipush #15
    //   1011: iastore
    //   1012: dup
    //   1013: bipush #21
    //   1015: bipush #35
    //   1017: iastore
    //   1018: dup
    //   1019: bipush #22
    //   1021: bipush #34
    //   1023: iastore
    //   1024: dup
    //   1025: bipush #23
    //   1027: bipush #8
    //   1029: iastore
    //   1030: dup
    //   1031: bipush #24
    //   1033: iconst_1
    //   1034: iastore
    //   1035: dup
    //   1036: bipush #25
    //   1038: bipush #25
    //   1040: iastore
    //   1041: dup
    //   1042: bipush #26
    //   1044: bipush #14
    //   1046: iastore
    //   1047: dup
    //   1048: bipush #27
    //   1050: bipush #16
    //   1052: iastore
    //   1053: dup
    //   1054: bipush #28
    //   1056: bipush #6
    //   1058: iastore
    //   1059: dup
    //   1060: bipush #29
    //   1062: bipush #9
    //   1064: iastore
    //   1065: iload_3
    //   1066: iaload
    //   1067: istore #4
    //   1069: aload #6
    //   1071: iload #4
    //   1073: invokestatic r : (Landroid/net/NetworkRequest;I)Z
    //   1076: ifeq -> 1090
    //   1079: aload #10
    //   1081: iload #4
    //   1083: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1086: invokevirtual add : (Ljava/lang/Object;)Z
    //   1089: pop
    //   1090: iinc #3, 1
    //   1093: goto -> 887
    //   1096: aload #10
    //   1098: invokestatic u0 : (Ljava/util/ArrayList;)[I
    //   1101: astore #6
    //   1103: aload #9
    //   1105: aload_2
    //   1106: arraylength
    //   1107: invokevirtual writeInt : (I)V
    //   1110: aload_2
    //   1111: arraylength
    //   1112: istore #4
    //   1114: iconst_0
    //   1115: istore_3
    //   1116: iload_3
    //   1117: iload #4
    //   1119: if_icmpge -> 1140
    //   1122: aload #9
    //   1124: aload_2
    //   1125: iload_3
    //   1126: iaload
    //   1127: invokevirtual writeInt : (I)V
    //   1130: iinc #3, 1
    //   1133: goto -> 1116
    //   1136: astore_1
    //   1137: goto -> 1473
    //   1140: aload #9
    //   1142: aload #6
    //   1144: arraylength
    //   1145: invokevirtual writeInt : (I)V
    //   1148: aload #6
    //   1150: arraylength
    //   1151: istore #4
    //   1153: iconst_0
    //   1154: istore_3
    //   1155: iload_3
    //   1156: iload #4
    //   1158: if_icmpge -> 1176
    //   1161: aload #9
    //   1163: aload #6
    //   1165: iload_3
    //   1166: iaload
    //   1167: invokevirtual writeInt : (I)V
    //   1170: iinc #3, 1
    //   1173: goto -> 1155
    //   1176: aload #9
    //   1178: invokevirtual close : ()V
    //   1181: aload #8
    //   1183: invokevirtual close : ()V
    //   1186: aload #8
    //   1188: invokevirtual toByteArray : ()[B
    //   1191: astore_2
    //   1192: aload_2
    //   1193: invokevirtual getClass : ()Ljava/lang/Class;
    //   1196: pop
    //   1197: aload_1
    //   1198: bipush #26
    //   1200: aload_2
    //   1201: invokeinterface f : (I[B)V
    //   1206: aload_1
    //   1207: bipush #27
    //   1209: aload #7
    //   1211: getfield c : Z
    //   1214: i2l
    //   1215: invokeinterface e : (IJ)V
    //   1220: aload_1
    //   1221: bipush #28
    //   1223: aload #7
    //   1225: getfield d : Z
    //   1228: i2l
    //   1229: invokeinterface e : (IJ)V
    //   1234: aload_1
    //   1235: bipush #29
    //   1237: aload #7
    //   1239: getfield e : Z
    //   1242: i2l
    //   1243: invokeinterface e : (IJ)V
    //   1248: aload_1
    //   1249: bipush #30
    //   1251: aload #7
    //   1253: getfield f : Z
    //   1256: i2l
    //   1257: invokeinterface e : (IJ)V
    //   1262: aload_1
    //   1263: bipush #31
    //   1265: aload #7
    //   1267: getfield g : J
    //   1270: invokeinterface e : (IJ)V
    //   1275: aload_1
    //   1276: bipush #32
    //   1278: aload #7
    //   1280: getfield h : J
    //   1283: invokeinterface e : (IJ)V
    //   1288: aload #7
    //   1290: getfield i : Ljava/util/Set;
    //   1293: astore #7
    //   1295: aload #7
    //   1297: invokevirtual getClass : ()Ljava/lang/Class;
    //   1300: pop
    //   1301: aload #7
    //   1303: invokeinterface isEmpty : ()Z
    //   1308: ifeq -> 1318
    //   1311: iconst_0
    //   1312: newarray byte
    //   1314: astore_2
    //   1315: goto -> 1430
    //   1318: new java/io/ByteArrayOutputStream
    //   1321: dup
    //   1322: invokespecial <init> : ()V
    //   1325: astore_2
    //   1326: new java/io/ObjectOutputStream
    //   1329: astore #6
    //   1331: aload #6
    //   1333: aload_2
    //   1334: invokespecial <init> : (Ljava/io/OutputStream;)V
    //   1337: aload #6
    //   1339: aload #7
    //   1341: invokeinterface size : ()I
    //   1346: invokevirtual writeInt : (I)V
    //   1349: aload #7
    //   1351: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1356: astore #8
    //   1358: aload #8
    //   1360: invokeinterface hasNext : ()Z
    //   1365: ifeq -> 1411
    //   1368: aload #8
    //   1370: invokeinterface next : ()Ljava/lang/Object;
    //   1375: checkcast gr
    //   1378: astore #7
    //   1380: aload #6
    //   1382: aload #7
    //   1384: getfield a : Landroid/net/Uri;
    //   1387: invokevirtual toString : ()Ljava/lang/String;
    //   1390: invokevirtual writeUTF : (Ljava/lang/String;)V
    //   1393: aload #6
    //   1395: aload #7
    //   1397: getfield b : Z
    //   1400: invokevirtual writeBoolean : (Z)V
    //   1403: goto -> 1358
    //   1406: astore #7
    //   1408: goto -> 1444
    //   1411: aload #6
    //   1413: invokevirtual close : ()V
    //   1416: aload_2
    //   1417: invokevirtual close : ()V
    //   1420: aload_2
    //   1421: invokevirtual toByteArray : ()[B
    //   1424: astore_2
    //   1425: aload_2
    //   1426: invokevirtual getClass : ()Ljava/lang/Class;
    //   1429: pop
    //   1430: aload_1
    //   1431: bipush #33
    //   1433: aload_2
    //   1434: invokeinterface f : (I[B)V
    //   1439: return
    //   1440: astore_1
    //   1441: goto -> 1457
    //   1444: aload #7
    //   1446: athrow
    //   1447: astore_1
    //   1448: aload #6
    //   1450: aload #7
    //   1452: invokestatic j : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   1455: aload_1
    //   1456: athrow
    //   1457: aload_1
    //   1458: athrow
    //   1459: astore #6
    //   1461: aload_2
    //   1462: aload_1
    //   1463: invokestatic j : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   1466: aload #6
    //   1468: athrow
    //   1469: astore_2
    //   1470: goto -> 1484
    //   1473: aload_1
    //   1474: athrow
    //   1475: astore_2
    //   1476: aload #9
    //   1478: aload_1
    //   1479: invokestatic j : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   1482: aload_2
    //   1483: athrow
    //   1484: aload_2
    //   1485: athrow
    //   1486: astore_1
    //   1487: aload #8
    //   1489: aload_2
    //   1490: invokestatic j : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   1493: aload_1
    //   1494: athrow
    //   1495: aload_2
    //   1496: checkcast s72
    //   1499: astore_2
    //   1500: aload_1
    //   1501: invokevirtual getClass : ()Ljava/lang/Class;
    //   1504: pop
    //   1505: aload_2
    //   1506: invokevirtual getClass : ()Ljava/lang/Class;
    //   1509: pop
    //   1510: aload_1
    //   1511: aload_2
    //   1512: getfield a : Ljava/lang/String;
    //   1515: iconst_1
    //   1516: invokeinterface i : (Ljava/lang/String;I)V
    //   1521: aload_1
    //   1522: aload_2
    //   1523: getfield b : Ljava/lang/String;
    //   1526: iconst_2
    //   1527: invokeinterface i : (Ljava/lang/String;I)V
    //   1532: return
    //   1533: aload_2
    //   1534: checkcast js1
    //   1537: astore_2
    //   1538: aload_1
    //   1539: invokevirtual getClass : ()Ljava/lang/Class;
    //   1542: pop
    //   1543: aload_2
    //   1544: invokevirtual getClass : ()Ljava/lang/Class;
    //   1547: pop
    //   1548: aload_1
    //   1549: aload_2
    //   1550: getfield a : Ljava/lang/String;
    //   1553: iconst_1
    //   1554: invokeinterface i : (Ljava/lang/String;I)V
    //   1559: aload_1
    //   1560: iconst_2
    //   1561: aload_2
    //   1562: getfield b : I
    //   1565: i2l
    //   1566: invokeinterface e : (IJ)V
    //   1571: aload_1
    //   1572: iconst_3
    //   1573: aload_2
    //   1574: getfield c : I
    //   1577: i2l
    //   1578: invokeinterface e : (IJ)V
    //   1583: return
    //   1584: aload_2
    //   1585: checkcast p91
    //   1588: astore_2
    //   1589: aload_1
    //   1590: invokevirtual getClass : ()Ljava/lang/Class;
    //   1593: pop
    //   1594: aload_2
    //   1595: invokevirtual getClass : ()Ljava/lang/Class;
    //   1598: pop
    //   1599: aload_1
    //   1600: aload_2
    //   1601: getfield a : Ljava/lang/String;
    //   1604: iconst_1
    //   1605: invokeinterface i : (Ljava/lang/String;I)V
    //   1610: aload_1
    //   1611: iconst_2
    //   1612: aload_2
    //   1613: getfield b : Ljava/lang/Long;
    //   1616: invokevirtual longValue : ()J
    //   1619: invokeinterface e : (IJ)V
    //   1624: return
    //   1625: aload_2
    //   1626: checkcast ay
    //   1629: astore_2
    //   1630: aload_1
    //   1631: invokevirtual getClass : ()Ljava/lang/Class;
    //   1634: pop
    //   1635: aload_2
    //   1636: invokevirtual getClass : ()Ljava/lang/Class;
    //   1639: pop
    //   1640: aload_1
    //   1641: aload_2
    //   1642: getfield a : Ljava/lang/String;
    //   1645: iconst_1
    //   1646: invokeinterface i : (Ljava/lang/String;I)V
    //   1651: aload_1
    //   1652: aload_2
    //   1653: getfield b : Ljava/lang/String;
    //   1656: iconst_2
    //   1657: invokeinterface i : (Ljava/lang/String;I)V
    //   1662: return
    // Exception table:
    //   from	to	target	type
    //   727	739	1469	finally
    //   745	751	1136	finally
    //   754	762	1136	finally
    //   770	846	1136	finally
    //   852	857	1136	finally
    //   857	872	1136	finally
    //   875	885	1136	finally
    //   893	1090	1136	finally
    //   1096	1103	1136	finally
    //   1103	1114	1136	finally
    //   1122	1130	1136	finally
    //   1140	1153	1136	finally
    //   1161	1170	1136	finally
    //   1176	1181	1469	finally
    //   1326	1337	1440	finally
    //   1337	1358	1406	finally
    //   1358	1403	1406	finally
    //   1411	1416	1440	finally
    //   1444	1447	1447	finally
    //   1448	1457	1440	finally
    //   1457	1459	1459	finally
    //   1473	1475	1475	finally
    //   1476	1484	1469	finally
    //   1484	1486	1486	finally
  }
  
  public final String t() {
    switch (this.k) {
      default:
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
      case 4:
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      case 3:
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
      case 2:
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
      case 1:
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
      case 0:
        break;
    } 
    return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */