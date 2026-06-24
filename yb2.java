import android.os.Parcel;
import android.os.Parcelable;

public final class yb2 implements Parcelable.Creator {
  public final int a;
  
  public final Object createFromParcel(Parcel paramParcel) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : I
    //   4: istore #18
    //   6: fconst_0
    //   7: fstore #10
    //   9: dconst_0
    //   10: dstore_2
    //   11: lconst_0
    //   12: lstore #26
    //   14: iconst_0
    //   15: istore #12
    //   17: iconst_0
    //   18: istore #14
    //   20: iconst_0
    //   21: istore #13
    //   23: iconst_0
    //   24: istore #11
    //   26: iconst_0
    //   27: istore #16
    //   29: iconst_0
    //   30: istore #15
    //   32: iconst_0
    //   33: istore #22
    //   35: iconst_0
    //   36: istore #23
    //   38: iconst_0
    //   39: istore #17
    //   41: aconst_null
    //   42: astore #36
    //   44: aconst_null
    //   45: astore #41
    //   47: aconst_null
    //   48: astore #33
    //   50: aconst_null
    //   51: astore #32
    //   53: aconst_null
    //   54: astore #38
    //   56: aconst_null
    //   57: astore #37
    //   59: aconst_null
    //   60: astore #42
    //   62: aconst_null
    //   63: astore #35
    //   65: aconst_null
    //   66: astore #40
    //   68: aconst_null
    //   69: astore #39
    //   71: aconst_null
    //   72: astore #34
    //   74: iload #18
    //   76: tableswitch default -> 208, 0 -> 6205, 1 -> 5889, 2 -> 5622, 3 -> 5382, 4 -> 5220, 5 -> 5126, 6 -> 4999, 7 -> 4893, 8 -> 4825, 9 -> 4686, 10 -> 4453, 11 -> 4312, 12 -> 4127, 13 -> 3685, 14 -> 3548, 15 -> 3209, 16 -> 3089, 17 -> 2908, 18 -> 2603, 19 -> 2375, 20 -> 1850, 21 -> 1708, 22 -> 1547, 23 -> 1279, 24 -> 1184, 25 -> 892, 26 -> 577, 27 -> 483, 28 -> 363
    //   208: aload_1
    //   209: invokestatic q0 : (Landroid/os/Parcel;)I
    //   212: istore #12
    //   214: aconst_null
    //   215: astore #35
    //   217: aconst_null
    //   218: astore #33
    //   220: aload #34
    //   222: astore #32
    //   224: iload #17
    //   226: istore #11
    //   228: aload #35
    //   230: astore #34
    //   232: aload_1
    //   233: invokevirtual dataPosition : ()I
    //   236: iload #12
    //   238: if_icmpge -> 341
    //   241: aload_1
    //   242: invokevirtual readInt : ()I
    //   245: istore #13
    //   247: iload #13
    //   249: i2c
    //   250: istore #14
    //   252: iload #14
    //   254: iconst_1
    //   255: if_icmpeq -> 330
    //   258: iload #14
    //   260: iconst_2
    //   261: if_icmpeq -> 319
    //   264: iload #14
    //   266: iconst_3
    //   267: if_icmpeq -> 302
    //   270: iload #14
    //   272: iconst_4
    //   273: if_icmpeq -> 285
    //   276: aload_1
    //   277: iload #13
    //   279: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   282: goto -> 232
    //   285: aload_1
    //   286: iload #13
    //   288: getstatic sp.CREATOR : Landroid/os/Parcelable$Creator;
    //   291: invokestatic s : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   294: checkcast sp
    //   297: astore #33
    //   299: goto -> 232
    //   302: aload_1
    //   303: iload #13
    //   305: getstatic android/app/PendingIntent.CREATOR : Landroid/os/Parcelable$Creator;
    //   308: invokestatic s : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   311: checkcast android/app/PendingIntent
    //   314: astore #34
    //   316: goto -> 232
    //   319: aload_1
    //   320: iload #13
    //   322: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   325: astore #32
    //   327: goto -> 232
    //   330: aload_1
    //   331: iload #13
    //   333: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   336: istore #11
    //   338: goto -> 232
    //   341: aload_1
    //   342: iload #12
    //   344: invokestatic B : (Landroid/os/Parcel;I)V
    //   347: new com/google/android/gms/common/api/Status
    //   350: dup
    //   351: iload #11
    //   353: aload #32
    //   355: aload #34
    //   357: aload #33
    //   359: invokespecial <init> : (ILjava/lang/String;Landroid/app/PendingIntent;Lsp;)V
    //   362: areturn
    //   363: aload_1
    //   364: invokestatic q0 : (Landroid/os/Parcel;)I
    //   367: istore #15
    //   369: iconst_0
    //   370: istore #13
    //   372: iconst_0
    //   373: istore #14
    //   375: iload #12
    //   377: istore #11
    //   379: iload #14
    //   381: istore #12
    //   383: aload_1
    //   384: invokevirtual dataPosition : ()I
    //   387: iload #15
    //   389: if_icmpge -> 463
    //   392: aload_1
    //   393: invokevirtual readInt : ()I
    //   396: istore #16
    //   398: iload #16
    //   400: i2c
    //   401: istore #14
    //   403: iload #14
    //   405: iconst_2
    //   406: if_icmpeq -> 452
    //   409: iload #14
    //   411: iconst_3
    //   412: if_icmpeq -> 441
    //   415: iload #14
    //   417: iconst_4
    //   418: if_icmpeq -> 430
    //   421: aload_1
    //   422: iload #16
    //   424: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   427: goto -> 383
    //   430: aload_1
    //   431: iload #16
    //   433: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   436: istore #12
    //   438: goto -> 383
    //   441: aload_1
    //   442: iload #16
    //   444: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   447: istore #13
    //   449: goto -> 383
    //   452: aload_1
    //   453: iload #16
    //   455: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   458: istore #11
    //   460: goto -> 383
    //   463: aload_1
    //   464: iload #15
    //   466: invokestatic B : (Landroid/os/Parcel;I)V
    //   469: new f22
    //   472: dup
    //   473: iload #11
    //   475: iload #13
    //   477: iload #12
    //   479: invokespecial <init> : (III)V
    //   482: areturn
    //   483: aload_1
    //   484: invokestatic q0 : (Landroid/os/Parcel;)I
    //   487: istore #13
    //   489: aconst_null
    //   490: astore #33
    //   492: aload #36
    //   494: astore #32
    //   496: aload_1
    //   497: invokevirtual dataPosition : ()I
    //   500: iload #13
    //   502: if_icmpge -> 559
    //   505: aload_1
    //   506: invokevirtual readInt : ()I
    //   509: istore #11
    //   511: iload #11
    //   513: i2c
    //   514: istore #12
    //   516: iload #12
    //   518: iconst_2
    //   519: if_icmpeq -> 548
    //   522: iload #12
    //   524: iconst_3
    //   525: if_icmpeq -> 537
    //   528: aload_1
    //   529: iload #11
    //   531: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   534: goto -> 496
    //   537: aload_1
    //   538: iload #11
    //   540: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   543: astore #33
    //   545: goto -> 496
    //   548: aload_1
    //   549: iload #11
    //   551: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   554: astore #32
    //   556: goto -> 496
    //   559: aload_1
    //   560: iload #13
    //   562: invokestatic B : (Landroid/os/Parcel;I)V
    //   565: new m12
    //   568: dup
    //   569: aload #32
    //   571: aload #33
    //   573: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   576: areturn
    //   577: aload_1
    //   578: invokestatic q0 : (Landroid/os/Parcel;)I
    //   581: istore #20
    //   583: fconst_0
    //   584: fstore #8
    //   586: iconst_0
    //   587: istore #19
    //   589: iconst_0
    //   590: istore #18
    //   592: iload #18
    //   594: istore #11
    //   596: iload #11
    //   598: istore #12
    //   600: iload #12
    //   602: istore #13
    //   604: iload #13
    //   606: istore #14
    //   608: iload #14
    //   610: istore #15
    //   612: iload #15
    //   614: istore #16
    //   616: iload #16
    //   618: istore #17
    //   620: aconst_null
    //   621: astore #33
    //   623: aconst_null
    //   624: astore #32
    //   626: aload_1
    //   627: invokevirtual dataPosition : ()I
    //   630: iload #20
    //   632: if_icmpge -> 854
    //   635: aload_1
    //   636: invokevirtual readInt : ()I
    //   639: istore #21
    //   641: iload #21
    //   643: i2c
    //   644: tableswitch default -> 708, 2 -> 838, 3 -> 827, 4 -> 816, 5 -> 805, 6 -> 794, 7 -> 783, 8 -> 772, 9 -> 761, 10 -> 750, 11 -> 739, 12 -> 728, 13 -> 717
    //   708: aload_1
    //   709: iload #21
    //   711: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   714: goto -> 626
    //   717: aload_1
    //   718: iload #21
    //   720: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   723: astore #32
    //   725: goto -> 626
    //   728: aload_1
    //   729: iload #21
    //   731: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   734: istore #17
    //   736: goto -> 626
    //   739: aload_1
    //   740: iload #21
    //   742: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   745: istore #16
    //   747: goto -> 626
    //   750: aload_1
    //   751: iload #21
    //   753: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   756: astore #33
    //   758: goto -> 626
    //   761: aload_1
    //   762: iload #21
    //   764: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   767: istore #15
    //   769: goto -> 626
    //   772: aload_1
    //   773: iload #21
    //   775: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   778: istore #14
    //   780: goto -> 626
    //   783: aload_1
    //   784: iload #21
    //   786: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   789: istore #13
    //   791: goto -> 626
    //   794: aload_1
    //   795: iload #21
    //   797: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   800: istore #12
    //   802: goto -> 626
    //   805: aload_1
    //   806: iload #21
    //   808: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   811: istore #11
    //   813: goto -> 626
    //   816: aload_1
    //   817: iload #21
    //   819: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   822: istore #18
    //   824: goto -> 626
    //   827: aload_1
    //   828: iload #21
    //   830: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   833: istore #19
    //   835: goto -> 626
    //   838: aload_1
    //   839: iload #21
    //   841: iconst_4
    //   842: invokestatic x0 : (Landroid/os/Parcel;II)V
    //   845: aload_1
    //   846: invokevirtual readFloat : ()F
    //   849: fstore #8
    //   851: goto -> 626
    //   854: aload_1
    //   855: iload #20
    //   857: invokestatic B : (Landroid/os/Parcel;I)V
    //   860: new fu1
    //   863: dup
    //   864: fload #8
    //   866: iload #19
    //   868: iload #18
    //   870: iload #11
    //   872: iload #12
    //   874: iload #13
    //   876: iload #14
    //   878: iload #15
    //   880: aload #33
    //   882: iload #16
    //   884: iload #17
    //   886: aload #32
    //   888: invokespecial <init> : (FIIIIIIILjava/lang/String;IILjava/lang/String;)V
    //   891: areturn
    //   892: aload_1
    //   893: invokestatic q0 : (Landroid/os/Parcel;)I
    //   896: istore #12
    //   898: iconst_0
    //   899: istore #11
    //   901: aconst_null
    //   902: astore #40
    //   904: aconst_null
    //   905: astore #39
    //   907: aload #39
    //   909: astore #32
    //   911: aload #32
    //   913: astore #33
    //   915: aload #33
    //   917: astore #34
    //   919: aload #34
    //   921: astore #35
    //   923: aload #35
    //   925: astore #36
    //   927: aload #36
    //   929: astore #37
    //   931: aload #37
    //   933: astore #38
    //   935: aload_1
    //   936: invokevirtual dataPosition : ()I
    //   939: iload #12
    //   941: if_icmpge -> 1150
    //   944: aload_1
    //   945: invokevirtual readInt : ()I
    //   948: istore #13
    //   950: iload #13
    //   952: i2c
    //   953: tableswitch default -> 1012, 2 -> 1139, 3 -> 1128, 4 -> 1115, 5 -> 1104, 6 -> 1093, 7 -> 1076, 8 -> 1065, 9 -> 1054, 10 -> 1043, 11 -> 1032, 12 -> 1021
    //   1012: aload_1
    //   1013: iload #13
    //   1015: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   1018: goto -> 935
    //   1021: aload_1
    //   1022: iload #13
    //   1024: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   1027: istore #11
    //   1029: goto -> 935
    //   1032: aload_1
    //   1033: iload #13
    //   1035: invokestatic a0 : (Landroid/os/Parcel;I)Ljava/lang/Boolean;
    //   1038: astore #38
    //   1040: goto -> 935
    //   1043: aload_1
    //   1044: iload #13
    //   1046: invokestatic a0 : (Landroid/os/Parcel;I)Ljava/lang/Boolean;
    //   1049: astore #37
    //   1051: goto -> 935
    //   1054: aload_1
    //   1055: iload #13
    //   1057: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   1060: astore #36
    //   1062: goto -> 935
    //   1065: aload_1
    //   1066: iload #13
    //   1068: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   1071: astore #35
    //   1073: goto -> 935
    //   1076: aload_1
    //   1077: iload #13
    //   1079: getstatic android/net/Uri.CREATOR : Landroid/os/Parcelable$Creator;
    //   1082: invokestatic s : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   1085: checkcast android/net/Uri
    //   1088: astore #34
    //   1090: goto -> 935
    //   1093: aload_1
    //   1094: iload #13
    //   1096: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   1099: astore #33
    //   1101: goto -> 935
    //   1104: aload_1
    //   1105: iload #13
    //   1107: invokestatic u : (Landroid/os/Parcel;I)Ljava/util/ArrayList;
    //   1110: astore #32
    //   1112: goto -> 935
    //   1115: aload_1
    //   1116: iload #13
    //   1118: getstatic i52.CREATOR : Landroid/os/Parcelable$Creator;
    //   1121: invokestatic w : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //   1124: pop
    //   1125: goto -> 935
    //   1128: aload_1
    //   1129: iload #13
    //   1131: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   1134: astore #39
    //   1136: goto -> 935
    //   1139: aload_1
    //   1140: iload #13
    //   1142: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   1145: astore #40
    //   1147: goto -> 935
    //   1150: aload_1
    //   1151: iload #12
    //   1153: invokestatic B : (Landroid/os/Parcel;I)V
    //   1156: new q8
    //   1159: dup
    //   1160: aload #40
    //   1162: aload #39
    //   1164: aload #32
    //   1166: aload #33
    //   1168: aload #34
    //   1170: aload #35
    //   1172: aload #36
    //   1174: aload #37
    //   1176: aload #38
    //   1178: iload #11
    //   1180: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;I)V
    //   1183: areturn
    //   1184: aload_1
    //   1185: invokestatic q0 : (Landroid/os/Parcel;)I
    //   1188: istore #12
    //   1190: aload #41
    //   1192: astore #32
    //   1194: iload #14
    //   1196: istore #11
    //   1198: aload_1
    //   1199: invokevirtual dataPosition : ()I
    //   1202: iload #12
    //   1204: if_icmpge -> 1261
    //   1207: aload_1
    //   1208: invokevirtual readInt : ()I
    //   1211: istore #14
    //   1213: iload #14
    //   1215: i2c
    //   1216: istore #13
    //   1218: iload #13
    //   1220: iconst_1
    //   1221: if_icmpeq -> 1250
    //   1224: iload #13
    //   1226: iconst_2
    //   1227: if_icmpeq -> 1239
    //   1230: aload_1
    //   1231: iload #14
    //   1233: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   1236: goto -> 1198
    //   1239: aload_1
    //   1240: iload #14
    //   1242: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   1245: astore #32
    //   1247: goto -> 1198
    //   1250: aload_1
    //   1251: iload #14
    //   1253: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   1256: istore #11
    //   1258: goto -> 1198
    //   1261: aload_1
    //   1262: iload #12
    //   1264: invokestatic B : (Landroid/os/Parcel;I)V
    //   1267: new com/google/android/gms/common/api/Scope
    //   1270: dup
    //   1271: aload #32
    //   1273: iload #11
    //   1275: invokespecial <init> : (Ljava/lang/String;I)V
    //   1278: areturn
    //   1279: aload_1
    //   1280: invokestatic q0 : (Landroid/os/Parcel;)I
    //   1283: istore #13
    //   1285: lconst_0
    //   1286: lstore #26
    //   1288: iconst_0
    //   1289: istore #12
    //   1291: iconst_0
    //   1292: istore #11
    //   1294: aconst_null
    //   1295: astore #37
    //   1297: aconst_null
    //   1298: astore #36
    //   1300: aload #36
    //   1302: astore #32
    //   1304: aload #32
    //   1306: astore #33
    //   1308: aload #33
    //   1310: astore #34
    //   1312: aload #34
    //   1314: astore #35
    //   1316: aload_1
    //   1317: invokevirtual dataPosition : ()I
    //   1320: iload #13
    //   1322: if_icmpge -> 1492
    //   1325: aload_1
    //   1326: invokevirtual readInt : ()I
    //   1329: istore #14
    //   1331: iload #14
    //   1333: i2c
    //   1334: tableswitch default -> 1384, 2 -> 1481, 3 -> 1470, 4 -> 1459, 5 -> 1448, 6 -> 1437, 7 -> 1426, 8 -> 1415, 9 -> 1404, 10 -> 1393
    //   1384: aload_1
    //   1385: iload #14
    //   1387: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   1390: goto -> 1316
    //   1393: aload_1
    //   1394: iload #14
    //   1396: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   1399: astore #37
    //   1401: goto -> 1316
    //   1404: aload_1
    //   1405: iload #14
    //   1407: invokestatic u : (Landroid/os/Parcel;I)Ljava/util/ArrayList;
    //   1410: astore #35
    //   1412: goto -> 1316
    //   1415: aload_1
    //   1416: iload #14
    //   1418: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   1421: istore #11
    //   1423: goto -> 1316
    //   1426: aload_1
    //   1427: iload #14
    //   1429: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   1432: astore #34
    //   1434: goto -> 1316
    //   1437: aload_1
    //   1438: iload #14
    //   1440: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   1443: astore #33
    //   1445: goto -> 1316
    //   1448: aload_1
    //   1449: iload #14
    //   1451: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   1454: astore #32
    //   1456: goto -> 1316
    //   1459: aload_1
    //   1460: iload #14
    //   1462: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   1465: astore #36
    //   1467: goto -> 1316
    //   1470: aload_1
    //   1471: iload #14
    //   1473: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   1476: istore #12
    //   1478: goto -> 1316
    //   1481: aload_1
    //   1482: iload #14
    //   1484: invokestatic g0 : (Landroid/os/Parcel;I)J
    //   1487: lstore #26
    //   1489: goto -> 1316
    //   1492: aload_1
    //   1493: iload #13
    //   1495: invokestatic B : (Landroid/os/Parcel;I)V
    //   1498: getstatic qj.a : Ljava/util/regex/Pattern;
    //   1501: astore_1
    //   1502: aload #37
    //   1504: ifnonnull -> 1512
    //   1507: aconst_null
    //   1508: astore_1
    //   1509: goto -> 1522
    //   1512: new org/json/JSONObject
    //   1515: dup
    //   1516: aload #37
    //   1518: invokespecial <init> : (Ljava/lang/String;)V
    //   1521: astore_1
    //   1522: new com/google/android/gms/cast/MediaTrack
    //   1525: dup
    //   1526: lload #26
    //   1528: iload #12
    //   1530: aload #36
    //   1532: aload #32
    //   1534: aload #33
    //   1536: aload #34
    //   1538: iload #11
    //   1540: aload #35
    //   1542: aload_1
    //   1543: invokespecial <init> : (JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lorg/json/JSONObject;)V
    //   1546: areturn
    //   1547: aload_1
    //   1548: invokestatic q0 : (Landroid/os/Parcel;)I
    //   1551: istore #13
    //   1553: lconst_0
    //   1554: lstore #30
    //   1556: lconst_0
    //   1557: lstore #28
    //   1559: lload #28
    //   1561: lstore #26
    //   1563: aconst_null
    //   1564: astore #33
    //   1566: aconst_null
    //   1567: astore #32
    //   1569: aload_1
    //   1570: invokevirtual dataPosition : ()I
    //   1573: iload #13
    //   1575: if_icmpge -> 1684
    //   1578: aload_1
    //   1579: invokevirtual readInt : ()I
    //   1582: istore #11
    //   1584: iload #11
    //   1586: i2c
    //   1587: istore #12
    //   1589: iload #12
    //   1591: iconst_2
    //   1592: if_icmpeq -> 1673
    //   1595: iload #12
    //   1597: iconst_3
    //   1598: if_icmpeq -> 1662
    //   1601: iload #12
    //   1603: iconst_4
    //   1604: if_icmpeq -> 1651
    //   1607: iload #12
    //   1609: iconst_5
    //   1610: if_icmpeq -> 1640
    //   1613: iload #12
    //   1615: bipush #6
    //   1617: if_icmpeq -> 1629
    //   1620: aload_1
    //   1621: iload #11
    //   1623: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   1626: goto -> 1569
    //   1629: aload_1
    //   1630: iload #11
    //   1632: invokestatic g0 : (Landroid/os/Parcel;I)J
    //   1635: lstore #26
    //   1637: goto -> 1569
    //   1640: aload_1
    //   1641: iload #11
    //   1643: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   1646: astore #32
    //   1648: goto -> 1569
    //   1651: aload_1
    //   1652: iload #11
    //   1654: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   1657: astore #33
    //   1659: goto -> 1569
    //   1662: aload_1
    //   1663: iload #11
    //   1665: invokestatic g0 : (Landroid/os/Parcel;I)J
    //   1668: lstore #28
    //   1670: goto -> 1569
    //   1673: aload_1
    //   1674: iload #11
    //   1676: invokestatic g0 : (Landroid/os/Parcel;I)J
    //   1679: lstore #30
    //   1681: goto -> 1569
    //   1684: aload_1
    //   1685: iload #13
    //   1687: invokestatic B : (Landroid/os/Parcel;I)V
    //   1690: new r2
    //   1693: dup
    //   1694: lload #30
    //   1696: lload #28
    //   1698: aload #33
    //   1700: aload #32
    //   1702: lload #26
    //   1704: invokespecial <init> : (JJLjava/lang/String;Ljava/lang/String;J)V
    //   1707: areturn
    //   1708: aload_1
    //   1709: invokestatic q0 : (Landroid/os/Parcel;)I
    //   1712: istore #15
    //   1714: iconst_1
    //   1715: istore #22
    //   1717: iconst_0
    //   1718: istore #14
    //   1720: iconst_0
    //   1721: istore #12
    //   1723: iload #13
    //   1725: istore #11
    //   1727: iload #14
    //   1729: istore #13
    //   1731: aload_1
    //   1732: invokevirtual dataPosition : ()I
    //   1735: iload #15
    //   1737: if_icmpge -> 1828
    //   1740: aload_1
    //   1741: invokevirtual readInt : ()I
    //   1744: istore #14
    //   1746: iload #14
    //   1748: i2c
    //   1749: istore #16
    //   1751: iload #16
    //   1753: iconst_1
    //   1754: if_icmpeq -> 1817
    //   1757: iload #16
    //   1759: iconst_2
    //   1760: if_icmpeq -> 1806
    //   1763: iload #16
    //   1765: iconst_3
    //   1766: if_icmpeq -> 1795
    //   1769: iload #16
    //   1771: iconst_4
    //   1772: if_icmpeq -> 1784
    //   1775: aload_1
    //   1776: iload #14
    //   1778: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   1781: goto -> 1731
    //   1784: aload_1
    //   1785: iload #14
    //   1787: invokestatic Z : (Landroid/os/Parcel;I)Z
    //   1790: istore #22
    //   1792: goto -> 1731
    //   1795: aload_1
    //   1796: iload #14
    //   1798: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   1801: istore #12
    //   1803: goto -> 1731
    //   1806: aload_1
    //   1807: iload #14
    //   1809: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   1812: istore #13
    //   1814: goto -> 1731
    //   1817: aload_1
    //   1818: iload #14
    //   1820: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   1823: istore #11
    //   1825: goto -> 1731
    //   1828: aload_1
    //   1829: iload #15
    //   1831: invokestatic B : (Landroid/os/Parcel;I)V
    //   1834: new eo
    //   1837: dup
    //   1838: iload #11
    //   1840: iload #22
    //   1842: iload #13
    //   1844: iload #12
    //   1846: invokespecial <init> : (IZII)V
    //   1849: areturn
    //   1850: aload_1
    //   1851: invokestatic q0 : (Landroid/os/Parcel;)I
    //   1854: istore #19
    //   1856: dconst_0
    //   1857: dstore #4
    //   1859: dconst_0
    //   1860: dstore_2
    //   1861: lconst_0
    //   1862: lstore #30
    //   1864: lconst_0
    //   1865: lstore #28
    //   1867: lload #28
    //   1869: lstore #26
    //   1871: iconst_0
    //   1872: istore #18
    //   1874: iconst_0
    //   1875: istore #17
    //   1877: iload #17
    //   1879: istore #11
    //   1881: iload #11
    //   1883: istore #12
    //   1885: iload #12
    //   1887: istore #13
    //   1889: iload #13
    //   1891: istore #14
    //   1893: iload #14
    //   1895: istore #15
    //   1897: iload #15
    //   1899: istore #16
    //   1901: aconst_null
    //   1902: astore #39
    //   1904: aconst_null
    //   1905: astore #38
    //   1907: aload #38
    //   1909: astore #32
    //   1911: aload #32
    //   1913: astore #33
    //   1915: aload #33
    //   1917: astore #34
    //   1919: aload #34
    //   1921: astore #35
    //   1923: aload #35
    //   1925: astore #36
    //   1927: aload #36
    //   1929: astore #37
    //   1931: aload_1
    //   1932: invokevirtual dataPosition : ()I
    //   1935: iload #19
    //   1937: if_icmpge -> 2320
    //   1940: aload_1
    //   1941: invokevirtual readInt : ()I
    //   1944: istore #20
    //   1946: iload #20
    //   1948: i2c
    //   1949: tableswitch default -> 2048, 2 -> 2303, 3 -> 2292, 4 -> 2281, 5 -> 2270, 6 -> 2259, 7 -> 2248, 8 -> 2237, 9 -> 2226, 10 -> 2216, 11 -> 2205, 12 -> 2194, 13 -> 2183, 14 -> 2172, 15 -> 2161, 16 -> 2150, 17 -> 2136, 18 -> 2125, 19 -> 2108, 20 -> 2091, 21 -> 2074, 22 -> 2057
    //   2048: aload_1
    //   2049: iload #20
    //   2051: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   2054: goto -> 1931
    //   2057: aload_1
    //   2058: iload #20
    //   2060: getstatic tt0.CREATOR : Landroid/os/Parcelable$Creator;
    //   2063: invokestatic s : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   2066: checkcast tt0
    //   2069: astore #37
    //   2071: goto -> 1931
    //   2074: aload_1
    //   2075: iload #20
    //   2077: getstatic it0.CREATOR : Landroid/os/Parcelable$Creator;
    //   2080: invokestatic s : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   2083: checkcast it0
    //   2086: astore #36
    //   2088: goto -> 1931
    //   2091: aload_1
    //   2092: iload #20
    //   2094: getstatic f22.CREATOR : Landroid/os/Parcelable$Creator;
    //   2097: invokestatic s : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   2100: checkcast f22
    //   2103: astore #35
    //   2105: goto -> 1931
    //   2108: aload_1
    //   2109: iload #20
    //   2111: getstatic r2.CREATOR : Landroid/os/Parcelable$Creator;
    //   2114: invokestatic s : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   2117: checkcast r2
    //   2120: astore #34
    //   2122: goto -> 1931
    //   2125: aload_1
    //   2126: iload #20
    //   2128: invokestatic Z : (Landroid/os/Parcel;I)Z
    //   2131: istore #16
    //   2133: goto -> 1931
    //   2136: aload_1
    //   2137: iload #20
    //   2139: getstatic ut0.CREATOR : Landroid/os/Parcelable$Creator;
    //   2142: invokestatic w : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //   2145: astore #33
    //   2147: goto -> 1931
    //   2150: aload_1
    //   2151: iload #20
    //   2153: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   2156: istore #15
    //   2158: goto -> 1931
    //   2161: aload_1
    //   2162: iload #20
    //   2164: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   2167: astore #32
    //   2169: goto -> 1931
    //   2172: aload_1
    //   2173: iload #20
    //   2175: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   2178: istore #14
    //   2180: goto -> 1931
    //   2183: aload_1
    //   2184: iload #20
    //   2186: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   2189: istore #13
    //   2191: goto -> 1931
    //   2194: aload_1
    //   2195: iload #20
    //   2197: invokestatic q : (Landroid/os/Parcel;I)[J
    //   2200: astore #38
    //   2202: goto -> 1931
    //   2205: aload_1
    //   2206: iload #20
    //   2208: invokestatic Z : (Landroid/os/Parcel;I)Z
    //   2211: istore #12
    //   2213: goto -> 1931
    //   2216: aload_1
    //   2217: iload #20
    //   2219: invokestatic b0 : (Landroid/os/Parcel;I)D
    //   2222: dstore_2
    //   2223: goto -> 1931
    //   2226: aload_1
    //   2227: iload #20
    //   2229: invokestatic g0 : (Landroid/os/Parcel;I)J
    //   2232: lstore #26
    //   2234: goto -> 1931
    //   2237: aload_1
    //   2238: iload #20
    //   2240: invokestatic g0 : (Landroid/os/Parcel;I)J
    //   2243: lstore #28
    //   2245: goto -> 1931
    //   2248: aload_1
    //   2249: iload #20
    //   2251: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   2254: istore #11
    //   2256: goto -> 1931
    //   2259: aload_1
    //   2260: iload #20
    //   2262: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   2265: istore #17
    //   2267: goto -> 1931
    //   2270: aload_1
    //   2271: iload #20
    //   2273: invokestatic b0 : (Landroid/os/Parcel;I)D
    //   2276: dstore #4
    //   2278: goto -> 1931
    //   2281: aload_1
    //   2282: iload #20
    //   2284: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   2287: istore #18
    //   2289: goto -> 1931
    //   2292: aload_1
    //   2293: iload #20
    //   2295: invokestatic g0 : (Landroid/os/Parcel;I)J
    //   2298: lstore #30
    //   2300: goto -> 1931
    //   2303: aload_1
    //   2304: iload #20
    //   2306: getstatic com/google/android/gms/cast/MediaInfo.CREATOR : Landroid/os/Parcelable$Creator;
    //   2309: invokestatic s : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   2312: checkcast com/google/android/gms/cast/MediaInfo
    //   2315: astore #39
    //   2317: goto -> 1931
    //   2320: aload_1
    //   2321: iload #19
    //   2323: invokestatic B : (Landroid/os/Parcel;I)V
    //   2326: new kw0
    //   2329: dup
    //   2330: aload #39
    //   2332: lload #30
    //   2334: iload #18
    //   2336: dload #4
    //   2338: iload #17
    //   2340: iload #11
    //   2342: lload #28
    //   2344: lload #26
    //   2346: dload_2
    //   2347: iload #12
    //   2349: aload #38
    //   2351: iload #13
    //   2353: iload #14
    //   2355: aload #32
    //   2357: iload #15
    //   2359: aload #33
    //   2361: iload #16
    //   2363: aload #34
    //   2365: aload #35
    //   2367: aload #36
    //   2369: aload #37
    //   2371: invokespecial <init> : (Lcom/google/android/gms/cast/MediaInfo;JIDIIJJDZ[JIILjava/lang/String;ILjava/util/ArrayList;ZLr2;Lf22;Lit0;Ltt0;)V
    //   2374: areturn
    //   2375: aload_1
    //   2376: invokestatic q0 : (Landroid/os/Parcel;)I
    //   2379: istore #12
    //   2381: dconst_0
    //   2382: dstore #6
    //   2384: dconst_0
    //   2385: dstore #4
    //   2387: dload #4
    //   2389: dstore_2
    //   2390: iconst_0
    //   2391: istore #11
    //   2393: iconst_0
    //   2394: istore #22
    //   2396: aconst_null
    //   2397: astore #34
    //   2399: aconst_null
    //   2400: astore #33
    //   2402: aload #33
    //   2404: astore #32
    //   2406: aload_1
    //   2407: invokevirtual dataPosition : ()I
    //   2410: iload #12
    //   2412: if_icmpge -> 2574
    //   2415: aload_1
    //   2416: invokevirtual readInt : ()I
    //   2419: istore #13
    //   2421: iload #13
    //   2423: i2c
    //   2424: tableswitch default -> 2472, 2 -> 2557, 3 -> 2546, 4 -> 2535, 5 -> 2524, 6 -> 2513, 7 -> 2503, 8 -> 2492, 9 -> 2481
    //   2472: aload_1
    //   2473: iload #13
    //   2475: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   2478: goto -> 2406
    //   2481: aload_1
    //   2482: iload #13
    //   2484: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   2487: astore #32
    //   2489: goto -> 2406
    //   2492: aload_1
    //   2493: iload #13
    //   2495: invokestatic q : (Landroid/os/Parcel;I)[J
    //   2498: astore #33
    //   2500: goto -> 2406
    //   2503: aload_1
    //   2504: iload #13
    //   2506: invokestatic b0 : (Landroid/os/Parcel;I)D
    //   2509: dstore_2
    //   2510: goto -> 2406
    //   2513: aload_1
    //   2514: iload #13
    //   2516: invokestatic b0 : (Landroid/os/Parcel;I)D
    //   2519: dstore #4
    //   2521: goto -> 2406
    //   2524: aload_1
    //   2525: iload #13
    //   2527: invokestatic b0 : (Landroid/os/Parcel;I)D
    //   2530: dstore #6
    //   2532: goto -> 2406
    //   2535: aload_1
    //   2536: iload #13
    //   2538: invokestatic Z : (Landroid/os/Parcel;I)Z
    //   2541: istore #22
    //   2543: goto -> 2406
    //   2546: aload_1
    //   2547: iload #13
    //   2549: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   2552: istore #11
    //   2554: goto -> 2406
    //   2557: aload_1
    //   2558: iload #13
    //   2560: getstatic com/google/android/gms/cast/MediaInfo.CREATOR : Landroid/os/Parcelable$Creator;
    //   2563: invokestatic s : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   2566: checkcast com/google/android/gms/cast/MediaInfo
    //   2569: astore #34
    //   2571: goto -> 2406
    //   2574: aload_1
    //   2575: iload #12
    //   2577: invokestatic B : (Landroid/os/Parcel;I)V
    //   2580: new ut0
    //   2583: dup
    //   2584: aload #34
    //   2586: iload #11
    //   2588: iload #22
    //   2590: dload #6
    //   2592: dload #4
    //   2594: dload_2
    //   2595: aload #33
    //   2597: aload #32
    //   2599: invokespecial <init> : (Lcom/google/android/gms/cast/MediaInfo;IZDDD[JLjava/lang/String;)V
    //   2602: areturn
    //   2603: aload_1
    //   2604: invokestatic q0 : (Landroid/os/Parcel;)I
    //   2607: istore #15
    //   2609: iconst_0
    //   2610: istore #14
    //   2612: iconst_0
    //   2613: istore #13
    //   2615: iload #13
    //   2617: istore #12
    //   2619: aconst_null
    //   2620: astore #36
    //   2622: aconst_null
    //   2623: astore #35
    //   2625: aload #35
    //   2627: astore #32
    //   2629: aload #32
    //   2631: astore #34
    //   2633: aload_1
    //   2634: invokevirtual dataPosition : ()I
    //   2637: iload #15
    //   2639: if_icmpge -> 2832
    //   2642: aload_1
    //   2643: invokevirtual readInt : ()I
    //   2646: istore #16
    //   2648: iload #16
    //   2650: i2c
    //   2651: tableswitch default -> 2704, 2 -> 2821, 3 -> 2810, 4 -> 2799, 5 -> 2788, 6 -> 2771, 7 -> 2760, 8 -> 2746, 9 -> 2735, 10 -> 2724, 11 -> 2713
    //   2704: aload_1
    //   2705: iload #16
    //   2707: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   2710: goto -> 2633
    //   2713: aload_1
    //   2714: iload #16
    //   2716: invokestatic Z : (Landroid/os/Parcel;I)Z
    //   2719: istore #12
    //   2721: goto -> 2633
    //   2724: aload_1
    //   2725: iload #16
    //   2727: invokestatic g0 : (Landroid/os/Parcel;I)J
    //   2730: lstore #26
    //   2732: goto -> 2633
    //   2735: aload_1
    //   2736: iload #16
    //   2738: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   2741: istore #13
    //   2743: goto -> 2633
    //   2746: aload_1
    //   2747: iload #16
    //   2749: getstatic ut0.CREATOR : Landroid/os/Parcelable$Creator;
    //   2752: invokestatic w : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //   2755: astore #34
    //   2757: goto -> 2633
    //   2760: aload_1
    //   2761: iload #16
    //   2763: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   2766: istore #14
    //   2768: goto -> 2633
    //   2771: aload_1
    //   2772: iload #16
    //   2774: getstatic st0.CREATOR : Landroid/os/Parcelable$Creator;
    //   2777: invokestatic s : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   2780: checkcast st0
    //   2783: astore #32
    //   2785: goto -> 2633
    //   2788: aload_1
    //   2789: iload #16
    //   2791: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   2794: astore #35
    //   2796: goto -> 2633
    //   2799: aload_1
    //   2800: iload #16
    //   2802: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   2805: istore #11
    //   2807: goto -> 2633
    //   2810: aload_1
    //   2811: iload #16
    //   2813: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   2816: astore #36
    //   2818: goto -> 2633
    //   2821: aload_1
    //   2822: iload #16
    //   2824: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   2827: astore #33
    //   2829: goto -> 2633
    //   2832: aload_1
    //   2833: iload #15
    //   2835: invokestatic B : (Landroid/os/Parcel;I)V
    //   2838: new java/lang/Object
    //   2841: dup
    //   2842: invokespecial <init> : ()V
    //   2845: astore_1
    //   2846: aload_1
    //   2847: aload #33
    //   2849: putfield b : Ljava/lang/String;
    //   2852: aload_1
    //   2853: aload #36
    //   2855: putfield c : Ljava/lang/String;
    //   2858: aload_1
    //   2859: iload #11
    //   2861: putfield e : I
    //   2864: aload_1
    //   2865: aload #35
    //   2867: putfield f : Ljava/lang/String;
    //   2870: aload_1
    //   2871: aload #32
    //   2873: putfield g : Lst0;
    //   2876: aload_1
    //   2877: iload #14
    //   2879: putfield h : I
    //   2882: aload_1
    //   2883: aload #34
    //   2885: putfield i : Ljava/util/List;
    //   2888: aload_1
    //   2889: iload #13
    //   2891: putfield j : I
    //   2894: aload_1
    //   2895: lload #26
    //   2897: putfield k : J
    //   2900: aload_1
    //   2901: iload #12
    //   2903: putfield l : Z
    //   2906: aload_1
    //   2907: areturn
    //   2908: aload_1
    //   2909: invokestatic q0 : (Landroid/os/Parcel;)I
    //   2912: istore #12
    //   2914: aconst_null
    //   2915: astore #34
    //   2917: aconst_null
    //   2918: astore #33
    //   2920: iload #16
    //   2922: istore #11
    //   2924: aload_1
    //   2925: invokevirtual dataPosition : ()I
    //   2928: iload #12
    //   2930: if_icmpge -> 3044
    //   2933: aload_1
    //   2934: invokevirtual readInt : ()I
    //   2937: istore #14
    //   2939: iload #14
    //   2941: i2c
    //   2942: istore #13
    //   2944: iload #13
    //   2946: iconst_2
    //   2947: if_icmpeq -> 3033
    //   2950: iload #13
    //   2952: iconst_3
    //   2953: if_icmpeq -> 3022
    //   2956: iload #13
    //   2958: iconst_4
    //   2959: if_icmpeq -> 3008
    //   2962: iload #13
    //   2964: iconst_5
    //   2965: if_icmpeq -> 2994
    //   2968: iload #13
    //   2970: bipush #6
    //   2972: if_icmpeq -> 2984
    //   2975: aload_1
    //   2976: iload #14
    //   2978: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   2981: goto -> 2924
    //   2984: aload_1
    //   2985: iload #14
    //   2987: invokestatic b0 : (Landroid/os/Parcel;I)D
    //   2990: dstore_2
    //   2991: goto -> 2924
    //   2994: aload_1
    //   2995: iload #14
    //   2997: getstatic i52.CREATOR : Landroid/os/Parcelable$Creator;
    //   3000: invokestatic w : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //   3003: astore #33
    //   3005: goto -> 2924
    //   3008: aload_1
    //   3009: iload #14
    //   3011: getstatic kt0.CREATOR : Landroid/os/Parcelable$Creator;
    //   3014: invokestatic w : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //   3017: astore #34
    //   3019: goto -> 2924
    //   3022: aload_1
    //   3023: iload #14
    //   3025: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   3028: astore #32
    //   3030: goto -> 2924
    //   3033: aload_1
    //   3034: iload #14
    //   3036: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   3039: istore #11
    //   3041: goto -> 2924
    //   3044: aload_1
    //   3045: iload #12
    //   3047: invokestatic B : (Landroid/os/Parcel;I)V
    //   3050: new java/lang/Object
    //   3053: dup
    //   3054: invokespecial <init> : ()V
    //   3057: astore_1
    //   3058: aload_1
    //   3059: iload #11
    //   3061: putfield b : I
    //   3064: aload_1
    //   3065: aload #32
    //   3067: putfield c : Ljava/lang/String;
    //   3070: aload_1
    //   3071: aload #34
    //   3073: putfield e : Ljava/util/List;
    //   3076: aload_1
    //   3077: aload #33
    //   3079: putfield f : Ljava/util/List;
    //   3082: aload_1
    //   3083: dload_2
    //   3084: putfield g : D
    //   3087: aload_1
    //   3088: areturn
    //   3089: aload_1
    //   3090: invokestatic q0 : (Landroid/os/Parcel;)I
    //   3093: istore #12
    //   3095: aconst_null
    //   3096: astore #33
    //   3098: aload #38
    //   3100: astore #32
    //   3102: iload #15
    //   3104: istore #11
    //   3106: aload_1
    //   3107: invokevirtual dataPosition : ()I
    //   3110: iload #12
    //   3112: if_icmpge -> 3189
    //   3115: aload_1
    //   3116: invokevirtual readInt : ()I
    //   3119: istore #13
    //   3121: iload #13
    //   3123: i2c
    //   3124: istore #14
    //   3126: iload #14
    //   3128: iconst_2
    //   3129: if_icmpeq -> 3175
    //   3132: iload #14
    //   3134: iconst_3
    //   3135: if_icmpeq -> 3164
    //   3138: iload #14
    //   3140: iconst_4
    //   3141: if_icmpeq -> 3153
    //   3144: aload_1
    //   3145: iload #13
    //   3147: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   3150: goto -> 3106
    //   3153: aload_1
    //   3154: iload #13
    //   3156: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   3159: istore #11
    //   3161: goto -> 3106
    //   3164: aload_1
    //   3165: iload #13
    //   3167: invokestatic m : (Landroid/os/Parcel;I)Landroid/os/Bundle;
    //   3170: astore #33
    //   3172: goto -> 3106
    //   3175: aload_1
    //   3176: iload #13
    //   3178: getstatic i52.CREATOR : Landroid/os/Parcelable$Creator;
    //   3181: invokestatic w : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //   3184: astore #32
    //   3186: goto -> 3106
    //   3189: aload_1
    //   3190: iload #12
    //   3192: invokestatic B : (Landroid/os/Parcel;I)V
    //   3195: new kt0
    //   3198: dup
    //   3199: aload #32
    //   3201: aload #33
    //   3203: iload #11
    //   3205: invokespecial <init> : (Ljava/util/ArrayList;Landroid/os/Bundle;I)V
    //   3208: areturn
    //   3209: aload_1
    //   3210: invokestatic q0 : (Landroid/os/Parcel;)I
    //   3213: istore #11
    //   3215: dconst_0
    //   3216: dstore_2
    //   3217: lconst_0
    //   3218: lstore #28
    //   3220: lconst_0
    //   3221: lstore #26
    //   3223: aconst_null
    //   3224: astore #40
    //   3226: aconst_null
    //   3227: astore #39
    //   3229: aload #39
    //   3231: astore #32
    //   3233: aload #32
    //   3235: astore #33
    //   3237: aload #33
    //   3239: astore #34
    //   3241: aload #34
    //   3243: astore #35
    //   3245: aload #35
    //   3247: astore #36
    //   3249: aload #36
    //   3251: astore #37
    //   3253: aload #37
    //   3255: astore #38
    //   3257: aload_1
    //   3258: invokevirtual dataPosition : ()I
    //   3261: iload #11
    //   3263: if_icmpge -> 3488
    //   3266: aload_1
    //   3267: invokevirtual readInt : ()I
    //   3270: istore #12
    //   3272: iload #12
    //   3274: i2c
    //   3275: tableswitch default -> 3336, 2 -> 3471, 3 -> 3454, 4 -> 3443, 5 -> 3432, 6 -> 3422, 7 -> 3411, 8 -> 3400, 9 -> 3389, 10 -> 3378, 11 -> 3367, 12 -> 3356, 13 -> 3345
    //   3336: aload_1
    //   3337: iload #12
    //   3339: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   3342: goto -> 3257
    //   3345: aload_1
    //   3346: iload #12
    //   3348: invokestatic g0 : (Landroid/os/Parcel;I)J
    //   3351: lstore #26
    //   3353: goto -> 3257
    //   3356: aload_1
    //   3357: iload #12
    //   3359: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   3362: astore #38
    //   3364: goto -> 3257
    //   3367: aload_1
    //   3368: iload #12
    //   3370: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   3373: astore #37
    //   3375: goto -> 3257
    //   3378: aload_1
    //   3379: iload #12
    //   3381: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   3384: astore #36
    //   3386: goto -> 3257
    //   3389: aload_1
    //   3390: iload #12
    //   3392: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   3395: astore #35
    //   3397: goto -> 3257
    //   3400: aload_1
    //   3401: iload #12
    //   3403: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   3406: astore #40
    //   3408: goto -> 3257
    //   3411: aload_1
    //   3412: iload #12
    //   3414: invokestatic q : (Landroid/os/Parcel;I)[J
    //   3417: astore #34
    //   3419: goto -> 3257
    //   3422: aload_1
    //   3423: iload #12
    //   3425: invokestatic b0 : (Landroid/os/Parcel;I)D
    //   3428: dstore_2
    //   3429: goto -> 3257
    //   3432: aload_1
    //   3433: iload #12
    //   3435: invokestatic g0 : (Landroid/os/Parcel;I)J
    //   3438: lstore #28
    //   3440: goto -> 3257
    //   3443: aload_1
    //   3444: iload #12
    //   3446: invokestatic a0 : (Landroid/os/Parcel;I)Ljava/lang/Boolean;
    //   3449: astore #33
    //   3451: goto -> 3257
    //   3454: aload_1
    //   3455: iload #12
    //   3457: getstatic tt0.CREATOR : Landroid/os/Parcelable$Creator;
    //   3460: invokestatic s : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   3463: checkcast tt0
    //   3466: astore #32
    //   3468: goto -> 3257
    //   3471: aload_1
    //   3472: iload #12
    //   3474: getstatic com/google/android/gms/cast/MediaInfo.CREATOR : Landroid/os/Parcelable$Creator;
    //   3477: invokestatic s : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   3480: checkcast com/google/android/gms/cast/MediaInfo
    //   3483: astore #39
    //   3485: goto -> 3257
    //   3488: aload_1
    //   3489: iload #11
    //   3491: invokestatic B : (Landroid/os/Parcel;I)V
    //   3494: getstatic qj.a : Ljava/util/regex/Pattern;
    //   3497: astore_1
    //   3498: aload #40
    //   3500: ifnonnull -> 3508
    //   3503: aconst_null
    //   3504: astore_1
    //   3505: goto -> 3518
    //   3508: new org/json/JSONObject
    //   3511: dup
    //   3512: aload #40
    //   3514: invokespecial <init> : (Ljava/lang/String;)V
    //   3517: astore_1
    //   3518: new jt0
    //   3521: dup
    //   3522: aload #39
    //   3524: aload #32
    //   3526: aload #33
    //   3528: lload #28
    //   3530: dload_2
    //   3531: aload #34
    //   3533: aload_1
    //   3534: aload #35
    //   3536: aload #36
    //   3538: aload #37
    //   3540: aload #38
    //   3542: lload #26
    //   3544: invokespecial <init> : (Lcom/google/android/gms/cast/MediaInfo;Ltt0;Ljava/lang/Boolean;JD[JLorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    //   3547: areturn
    //   3548: aload_1
    //   3549: invokestatic q0 : (Landroid/os/Parcel;)I
    //   3552: istore #13
    //   3554: lconst_0
    //   3555: lstore #28
    //   3557: lconst_0
    //   3558: lstore #26
    //   3560: iconst_0
    //   3561: istore #23
    //   3563: iconst_0
    //   3564: istore #22
    //   3566: aload_1
    //   3567: invokevirtual dataPosition : ()I
    //   3570: iload #13
    //   3572: if_icmpge -> 3663
    //   3575: aload_1
    //   3576: invokevirtual readInt : ()I
    //   3579: istore #11
    //   3581: iload #11
    //   3583: i2c
    //   3584: istore #12
    //   3586: iload #12
    //   3588: iconst_2
    //   3589: if_icmpeq -> 3652
    //   3592: iload #12
    //   3594: iconst_3
    //   3595: if_icmpeq -> 3641
    //   3598: iload #12
    //   3600: iconst_4
    //   3601: if_icmpeq -> 3630
    //   3604: iload #12
    //   3606: iconst_5
    //   3607: if_icmpeq -> 3619
    //   3610: aload_1
    //   3611: iload #11
    //   3613: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   3616: goto -> 3566
    //   3619: aload_1
    //   3620: iload #11
    //   3622: invokestatic Z : (Landroid/os/Parcel;I)Z
    //   3625: istore #22
    //   3627: goto -> 3566
    //   3630: aload_1
    //   3631: iload #11
    //   3633: invokestatic Z : (Landroid/os/Parcel;I)Z
    //   3636: istore #23
    //   3638: goto -> 3566
    //   3641: aload_1
    //   3642: iload #11
    //   3644: invokestatic g0 : (Landroid/os/Parcel;I)J
    //   3647: lstore #26
    //   3649: goto -> 3566
    //   3652: aload_1
    //   3653: iload #11
    //   3655: invokestatic g0 : (Landroid/os/Parcel;I)J
    //   3658: lstore #28
    //   3660: goto -> 3566
    //   3663: aload_1
    //   3664: iload #13
    //   3666: invokestatic B : (Landroid/os/Parcel;I)V
    //   3669: new it0
    //   3672: dup
    //   3673: lload #28
    //   3675: lload #26
    //   3677: iload #23
    //   3679: iload #22
    //   3681: invokespecial <init> : (JJZZ)V
    //   3684: areturn
    //   3685: aload_1
    //   3686: invokestatic q0 : (Landroid/os/Parcel;)I
    //   3689: istore #12
    //   3691: lconst_0
    //   3692: lstore #28
    //   3694: lconst_0
    //   3695: lstore #26
    //   3697: iconst_0
    //   3698: istore #11
    //   3700: aconst_null
    //   3701: astore #45
    //   3703: aconst_null
    //   3704: astore #44
    //   3706: aload #44
    //   3708: astore #32
    //   3710: aload #32
    //   3712: astore #33
    //   3714: aload #33
    //   3716: astore #34
    //   3718: aload #34
    //   3720: astore #35
    //   3722: aload #35
    //   3724: astore #36
    //   3726: aload #36
    //   3728: astore #37
    //   3730: aload #37
    //   3732: astore #38
    //   3734: aload #38
    //   3736: astore #39
    //   3738: aload #39
    //   3740: astore #40
    //   3742: aload #40
    //   3744: astore #41
    //   3746: aload #41
    //   3748: astore #42
    //   3750: aload #42
    //   3752: astore #43
    //   3754: aload_1
    //   3755: invokevirtual dataPosition : ()I
    //   3758: iload #12
    //   3760: if_icmpge -> 4079
    //   3763: aload_1
    //   3764: invokevirtual readInt : ()I
    //   3767: istore #13
    //   3769: iload #13
    //   3771: i2c
    //   3772: tableswitch default -> 3856, 2 -> 4068, 3 -> 4057, 4 -> 4046, 5 -> 4029, 6 -> 4018, 7 -> 4004, 8 -> 3987, 9 -> 3976, 10 -> 3962, 11 -> 3948, 12 -> 3937, 13 -> 3920, 14 -> 3909, 15 -> 3898, 16 -> 3887, 17 -> 3876, 18 -> 3865
    //   3856: aload_1
    //   3857: iload #13
    //   3859: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   3862: goto -> 3754
    //   3865: aload_1
    //   3866: iload #13
    //   3868: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   3871: astore #43
    //   3873: goto -> 3754
    //   3876: aload_1
    //   3877: iload #13
    //   3879: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   3882: astore #42
    //   3884: goto -> 3754
    //   3887: aload_1
    //   3888: iload #13
    //   3890: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   3893: astore #41
    //   3895: goto -> 3754
    //   3898: aload_1
    //   3899: iload #13
    //   3901: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   3904: astore #40
    //   3906: goto -> 3754
    //   3909: aload_1
    //   3910: iload #13
    //   3912: invokestatic g0 : (Landroid/os/Parcel;I)J
    //   3915: lstore #26
    //   3917: goto -> 3754
    //   3920: aload_1
    //   3921: iload #13
    //   3923: getstatic m12.CREATOR : Landroid/os/Parcelable$Creator;
    //   3926: invokestatic s : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   3929: checkcast m12
    //   3932: astore #39
    //   3934: goto -> 3754
    //   3937: aload_1
    //   3938: iload #13
    //   3940: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   3943: astore #38
    //   3945: goto -> 3754
    //   3948: aload_1
    //   3949: iload #13
    //   3951: getstatic p2.CREATOR : Landroid/os/Parcelable$Creator;
    //   3954: invokestatic w : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //   3957: astore #37
    //   3959: goto -> 3754
    //   3962: aload_1
    //   3963: iload #13
    //   3965: getstatic q2.CREATOR : Landroid/os/Parcelable$Creator;
    //   3968: invokestatic w : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //   3971: astore #36
    //   3973: goto -> 3754
    //   3976: aload_1
    //   3977: iload #13
    //   3979: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   3982: astore #35
    //   3984: goto -> 3754
    //   3987: aload_1
    //   3988: iload #13
    //   3990: getstatic fu1.CREATOR : Landroid/os/Parcelable$Creator;
    //   3993: invokestatic s : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   3996: checkcast fu1
    //   3999: astore #34
    //   4001: goto -> 3754
    //   4004: aload_1
    //   4005: iload #13
    //   4007: getstatic com/google/android/gms/cast/MediaTrack.CREATOR : Landroid/os/Parcelable$Creator;
    //   4010: invokestatic w : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
    //   4013: astore #33
    //   4015: goto -> 3754
    //   4018: aload_1
    //   4019: iload #13
    //   4021: invokestatic g0 : (Landroid/os/Parcel;I)J
    //   4024: lstore #28
    //   4026: goto -> 3754
    //   4029: aload_1
    //   4030: iload #13
    //   4032: getstatic kt0.CREATOR : Landroid/os/Parcelable$Creator;
    //   4035: invokestatic s : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   4038: checkcast kt0
    //   4041: astore #32
    //   4043: goto -> 3754
    //   4046: aload_1
    //   4047: iload #13
    //   4049: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   4052: astore #44
    //   4054: goto -> 3754
    //   4057: aload_1
    //   4058: iload #13
    //   4060: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   4063: istore #11
    //   4065: goto -> 3754
    //   4068: aload_1
    //   4069: iload #13
    //   4071: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   4074: astore #45
    //   4076: goto -> 3754
    //   4079: aload_1
    //   4080: iload #12
    //   4082: invokestatic B : (Landroid/os/Parcel;I)V
    //   4085: new com/google/android/gms/cast/MediaInfo
    //   4088: dup
    //   4089: aload #45
    //   4091: iload #11
    //   4093: aload #44
    //   4095: aload #32
    //   4097: lload #28
    //   4099: aload #33
    //   4101: aload #34
    //   4103: aload #35
    //   4105: aload #36
    //   4107: aload #37
    //   4109: aload #38
    //   4111: aload #39
    //   4113: lload #26
    //   4115: aload #40
    //   4117: aload #41
    //   4119: aload #42
    //   4121: aload #43
    //   4123: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;Lkt0;JLjava/util/List;Lfu1;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Lm12;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   4126: areturn
    //   4127: aload_1
    //   4128: invokestatic q0 : (Landroid/os/Parcel;)I
    //   4131: istore #13
    //   4133: lconst_0
    //   4134: lstore #26
    //   4136: aconst_null
    //   4137: astore #35
    //   4139: aconst_null
    //   4140: astore #34
    //   4142: aload #34
    //   4144: astore #32
    //   4146: aload #32
    //   4148: astore #33
    //   4150: aload_1
    //   4151: invokevirtual dataPosition : ()I
    //   4154: iload #13
    //   4156: if_icmpge -> 4265
    //   4159: aload_1
    //   4160: invokevirtual readInt : ()I
    //   4163: istore #11
    //   4165: iload #11
    //   4167: i2c
    //   4168: istore #12
    //   4170: iload #12
    //   4172: iconst_2
    //   4173: if_icmpeq -> 4254
    //   4176: iload #12
    //   4178: iconst_3
    //   4179: if_icmpeq -> 4243
    //   4182: iload #12
    //   4184: iconst_4
    //   4185: if_icmpeq -> 4232
    //   4188: iload #12
    //   4190: iconst_5
    //   4191: if_icmpeq -> 4221
    //   4194: iload #12
    //   4196: bipush #6
    //   4198: if_icmpeq -> 4210
    //   4201: aload_1
    //   4202: iload #11
    //   4204: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   4207: goto -> 4150
    //   4210: aload_1
    //   4211: iload #11
    //   4213: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   4216: astore #35
    //   4218: goto -> 4150
    //   4221: aload_1
    //   4222: iload #11
    //   4224: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   4227: astore #33
    //   4229: goto -> 4150
    //   4232: aload_1
    //   4233: iload #11
    //   4235: invokestatic e0 : (Landroid/os/Parcel;I)Ljava/lang/Integer;
    //   4238: astore #32
    //   4240: goto -> 4150
    //   4243: aload_1
    //   4244: iload #11
    //   4246: invokestatic g0 : (Landroid/os/Parcel;I)J
    //   4249: lstore #26
    //   4251: goto -> 4150
    //   4254: aload_1
    //   4255: iload #11
    //   4257: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   4260: astore #34
    //   4262: goto -> 4150
    //   4265: aload_1
    //   4266: iload #13
    //   4268: invokestatic B : (Landroid/os/Parcel;I)V
    //   4271: getstatic qj.a : Ljava/util/regex/Pattern;
    //   4274: astore_1
    //   4275: aload #35
    //   4277: ifnonnull -> 4285
    //   4280: aconst_null
    //   4281: astore_1
    //   4282: goto -> 4295
    //   4285: new org/json/JSONObject
    //   4288: dup
    //   4289: aload #35
    //   4291: invokespecial <init> : (Ljava/lang/String;)V
    //   4294: astore_1
    //   4295: new com/google/android/gms/cast/MediaError
    //   4298: dup
    //   4299: aload #34
    //   4301: lload #26
    //   4303: aload #32
    //   4305: aload #33
    //   4307: aload_1
    //   4308: invokespecial <init> : (Ljava/lang/String;JLjava/lang/Integer;Ljava/lang/String;Lorg/json/JSONObject;)V
    //   4311: areturn
    //   4312: aload_1
    //   4313: invokestatic q0 : (Landroid/os/Parcel;)I
    //   4316: istore #12
    //   4318: iconst_0
    //   4319: istore #23
    //   4321: aconst_null
    //   4322: astore #33
    //   4324: aload #37
    //   4326: astore #32
    //   4328: aload_1
    //   4329: invokevirtual dataPosition : ()I
    //   4332: iload #12
    //   4334: if_icmpge -> 4431
    //   4337: aload_1
    //   4338: invokevirtual readInt : ()I
    //   4341: istore #11
    //   4343: iload #11
    //   4345: i2c
    //   4346: istore #13
    //   4348: iload #13
    //   4350: iconst_2
    //   4351: if_icmpeq -> 4420
    //   4354: iload #13
    //   4356: iconst_3
    //   4357: if_icmpeq -> 4409
    //   4360: iload #13
    //   4362: iconst_4
    //   4363: if_icmpeq -> 4398
    //   4366: iload #13
    //   4368: iconst_5
    //   4369: if_icmpeq -> 4381
    //   4372: aload_1
    //   4373: iload #11
    //   4375: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   4378: goto -> 4328
    //   4381: aload_1
    //   4382: iload #11
    //   4384: getstatic ht.CREATOR : Landroid/os/Parcelable$Creator;
    //   4387: invokestatic s : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   4390: checkcast ht
    //   4393: astore #33
    //   4395: goto -> 4328
    //   4398: aload_1
    //   4399: iload #11
    //   4401: invokestatic Z : (Landroid/os/Parcel;I)Z
    //   4404: istore #23
    //   4406: goto -> 4328
    //   4409: aload_1
    //   4410: iload #11
    //   4412: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   4415: astore #32
    //   4417: goto -> 4328
    //   4420: aload_1
    //   4421: iload #11
    //   4423: invokestatic Z : (Landroid/os/Parcel;I)Z
    //   4426: istore #22
    //   4428: goto -> 4328
    //   4431: aload_1
    //   4432: iload #12
    //   4434: invokestatic B : (Landroid/os/Parcel;I)V
    //   4437: new sl0
    //   4440: dup
    //   4441: iload #22
    //   4443: aload #32
    //   4445: iload #23
    //   4447: aload #33
    //   4449: invokespecial <init> : (ZLjava/lang/String;ZLht;)V
    //   4452: areturn
    //   4453: aload_1
    //   4454: invokestatic q0 : (Landroid/os/Parcel;)I
    //   4457: istore #11
    //   4459: lconst_0
    //   4460: lstore #28
    //   4462: lconst_0
    //   4463: lstore #26
    //   4465: iconst_0
    //   4466: istore #24
    //   4468: iconst_0
    //   4469: istore #23
    //   4471: iload #23
    //   4473: istore #22
    //   4475: aconst_null
    //   4476: astore #33
    //   4478: aconst_null
    //   4479: astore #32
    //   4481: aload_1
    //   4482: invokevirtual dataPosition : ()I
    //   4485: iload #11
    //   4487: if_icmpge -> 4658
    //   4490: aload_1
    //   4491: invokevirtual readInt : ()I
    //   4494: istore #12
    //   4496: iload #12
    //   4498: i2c
    //   4499: tableswitch default -> 4540, 2 -> 4647, 3 -> 4636, 4 -> 4625, 5 -> 4614, 6 -> 4571, 7 -> 4560, 8 -> 4549
    //   4540: aload_1
    //   4541: iload #12
    //   4543: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   4546: goto -> 4481
    //   4549: aload_1
    //   4550: iload #12
    //   4552: invokestatic Z : (Landroid/os/Parcel;I)Z
    //   4555: istore #22
    //   4557: goto -> 4481
    //   4560: aload_1
    //   4561: iload #12
    //   4563: invokestatic Z : (Landroid/os/Parcel;I)Z
    //   4566: istore #23
    //   4568: goto -> 4481
    //   4571: aload_1
    //   4572: iload #12
    //   4574: invokestatic h0 : (Landroid/os/Parcel;I)I
    //   4577: istore #12
    //   4579: aload_1
    //   4580: invokevirtual dataPosition : ()I
    //   4583: istore #13
    //   4585: iload #12
    //   4587: ifne -> 4596
    //   4590: aconst_null
    //   4591: astore #32
    //   4593: goto -> 4481
    //   4596: aload_1
    //   4597: invokevirtual createStringArray : ()[Ljava/lang/String;
    //   4600: astore #32
    //   4602: aload_1
    //   4603: iload #13
    //   4605: iload #12
    //   4607: iadd
    //   4608: invokevirtual setDataPosition : (I)V
    //   4611: goto -> 4481
    //   4614: aload_1
    //   4615: iload #12
    //   4617: invokestatic Z : (Landroid/os/Parcel;I)Z
    //   4620: istore #24
    //   4622: goto -> 4481
    //   4625: aload_1
    //   4626: iload #12
    //   4628: invokestatic g0 : (Landroid/os/Parcel;I)J
    //   4631: lstore #26
    //   4633: goto -> 4481
    //   4636: aload_1
    //   4637: iload #12
    //   4639: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   4642: astore #33
    //   4644: goto -> 4481
    //   4647: aload_1
    //   4648: iload #12
    //   4650: invokestatic g0 : (Landroid/os/Parcel;I)J
    //   4653: lstore #28
    //   4655: goto -> 4481
    //   4658: aload_1
    //   4659: iload #11
    //   4661: invokestatic B : (Landroid/os/Parcel;I)V
    //   4664: new q2
    //   4667: dup
    //   4668: lload #28
    //   4670: aload #33
    //   4672: lload #26
    //   4674: iload #24
    //   4676: aload #32
    //   4678: iload #23
    //   4680: iload #22
    //   4682: invokespecial <init> : (JLjava/lang/String;JZ[Ljava/lang/String;ZZ)V
    //   4685: areturn
    //   4686: aload_1
    //   4687: invokestatic q0 : (Landroid/os/Parcel;)I
    //   4690: istore #12
    //   4692: ldc2_w -1
    //   4695: lstore #26
    //   4697: iconst_0
    //   4698: istore #11
    //   4700: iconst_0
    //   4701: istore #22
    //   4703: aconst_null
    //   4704: astore #32
    //   4706: aload_1
    //   4707: invokevirtual dataPosition : ()I
    //   4710: iload #12
    //   4712: if_icmpge -> 4803
    //   4715: aload_1
    //   4716: invokevirtual readInt : ()I
    //   4719: istore #13
    //   4721: iload #13
    //   4723: i2c
    //   4724: istore #14
    //   4726: iload #14
    //   4728: iconst_1
    //   4729: if_icmpeq -> 4792
    //   4732: iload #14
    //   4734: iconst_2
    //   4735: if_icmpeq -> 4781
    //   4738: iload #14
    //   4740: iconst_3
    //   4741: if_icmpeq -> 4770
    //   4744: iload #14
    //   4746: iconst_4
    //   4747: if_icmpeq -> 4759
    //   4750: aload_1
    //   4751: iload #13
    //   4753: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   4756: goto -> 4706
    //   4759: aload_1
    //   4760: iload #13
    //   4762: invokestatic Z : (Landroid/os/Parcel;I)Z
    //   4765: istore #22
    //   4767: goto -> 4706
    //   4770: aload_1
    //   4771: iload #13
    //   4773: invokestatic g0 : (Landroid/os/Parcel;I)J
    //   4776: lstore #26
    //   4778: goto -> 4706
    //   4781: aload_1
    //   4782: iload #13
    //   4784: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   4787: istore #11
    //   4789: goto -> 4706
    //   4792: aload_1
    //   4793: iload #13
    //   4795: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   4798: astore #32
    //   4800: goto -> 4706
    //   4803: aload_1
    //   4804: iload #12
    //   4806: invokestatic B : (Landroid/os/Parcel;I)V
    //   4809: new u70
    //   4812: dup
    //   4813: aload #32
    //   4815: iload #11
    //   4817: lload #26
    //   4819: iload #22
    //   4821: invokespecial <init> : (Ljava/lang/String;IJZ)V
    //   4824: areturn
    //   4825: aload_1
    //   4826: invokestatic q0 : (Landroid/os/Parcel;)I
    //   4829: istore #11
    //   4831: aload #42
    //   4833: astore #32
    //   4835: aload_1
    //   4836: invokevirtual dataPosition : ()I
    //   4839: iload #11
    //   4841: if_icmpge -> 4877
    //   4844: aload_1
    //   4845: invokevirtual readInt : ()I
    //   4848: istore #12
    //   4850: iload #12
    //   4852: i2c
    //   4853: iconst_2
    //   4854: if_icmpeq -> 4866
    //   4857: aload_1
    //   4858: iload #12
    //   4860: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   4863: goto -> 4835
    //   4866: aload_1
    //   4867: iload #12
    //   4869: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   4872: astore #32
    //   4874: goto -> 4835
    //   4877: aload_1
    //   4878: iload #11
    //   4880: invokestatic B : (Landroid/os/Parcel;I)V
    //   4883: new wb2
    //   4886: dup
    //   4887: aload #32
    //   4889: invokespecial <init> : (Ljava/lang/String;)V
    //   4892: areturn
    //   4893: aload_1
    //   4894: invokestatic q0 : (Landroid/os/Parcel;)I
    //   4897: istore #12
    //   4899: aconst_null
    //   4900: astore #33
    //   4902: aload #35
    //   4904: astore #32
    //   4906: aload_1
    //   4907: invokevirtual dataPosition : ()I
    //   4910: iload #12
    //   4912: if_icmpge -> 4981
    //   4915: aload_1
    //   4916: invokevirtual readInt : ()I
    //   4919: istore #13
    //   4921: iload #13
    //   4923: i2c
    //   4924: istore #11
    //   4926: iload #11
    //   4928: iconst_2
    //   4929: if_icmpeq -> 4964
    //   4932: iload #11
    //   4934: iconst_3
    //   4935: if_icmpeq -> 4947
    //   4938: aload_1
    //   4939: iload #13
    //   4941: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   4944: goto -> 4906
    //   4947: aload_1
    //   4948: iload #13
    //   4950: getstatic he2.CREATOR : Landroid/os/Parcelable$Creator;
    //   4953: invokestatic s : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   4956: checkcast he2
    //   4959: astore #33
    //   4961: goto -> 4906
    //   4964: aload_1
    //   4965: iload #13
    //   4967: getstatic he2.CREATOR : Landroid/os/Parcelable$Creator;
    //   4970: invokestatic s : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   4973: checkcast he2
    //   4976: astore #32
    //   4978: goto -> 4906
    //   4981: aload_1
    //   4982: iload #12
    //   4984: invokestatic B : (Landroid/os/Parcel;I)V
    //   4987: new oe2
    //   4990: dup
    //   4991: aload #32
    //   4993: aload #33
    //   4995: invokespecial <init> : (Lhe2;Lhe2;)V
    //   4998: areturn
    //   4999: aload_1
    //   5000: invokestatic q0 : (Landroid/os/Parcel;)I
    //   5003: istore #13
    //   5005: fconst_0
    //   5006: fstore #9
    //   5008: fconst_0
    //   5009: fstore #8
    //   5011: aload_1
    //   5012: invokevirtual dataPosition : ()I
    //   5015: iload #13
    //   5017: if_icmpge -> 5106
    //   5020: aload_1
    //   5021: invokevirtual readInt : ()I
    //   5024: istore #12
    //   5026: iload #12
    //   5028: i2c
    //   5029: istore #11
    //   5031: iload #11
    //   5033: iconst_2
    //   5034: if_icmpeq -> 5090
    //   5037: iload #11
    //   5039: iconst_3
    //   5040: if_icmpeq -> 5074
    //   5043: iload #11
    //   5045: iconst_4
    //   5046: if_icmpeq -> 5058
    //   5049: aload_1
    //   5050: iload #12
    //   5052: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   5055: goto -> 5011
    //   5058: aload_1
    //   5059: iload #12
    //   5061: iconst_4
    //   5062: invokestatic x0 : (Landroid/os/Parcel;II)V
    //   5065: aload_1
    //   5066: invokevirtual readFloat : ()F
    //   5069: fstore #8
    //   5071: goto -> 5011
    //   5074: aload_1
    //   5075: iload #12
    //   5077: iconst_4
    //   5078: invokestatic x0 : (Landroid/os/Parcel;II)V
    //   5081: aload_1
    //   5082: invokevirtual readFloat : ()F
    //   5085: fstore #9
    //   5087: goto -> 5011
    //   5090: aload_1
    //   5091: iload #12
    //   5093: iconst_4
    //   5094: invokestatic x0 : (Landroid/os/Parcel;II)V
    //   5097: aload_1
    //   5098: invokevirtual readFloat : ()F
    //   5101: fstore #10
    //   5103: goto -> 5011
    //   5106: aload_1
    //   5107: iload #13
    //   5109: invokestatic B : (Landroid/os/Parcel;I)V
    //   5112: new he2
    //   5115: dup
    //   5116: fload #10
    //   5118: fload #9
    //   5120: fload #8
    //   5122: invokespecial <init> : (FFF)V
    //   5125: areturn
    //   5126: aload_1
    //   5127: invokestatic q0 : (Landroid/os/Parcel;)I
    //   5130: istore #12
    //   5132: aconst_null
    //   5133: astore #33
    //   5135: aload #40
    //   5137: astore #32
    //   5139: aload_1
    //   5140: invokevirtual dataPosition : ()I
    //   5143: iload #12
    //   5145: if_icmpge -> 5202
    //   5148: aload_1
    //   5149: invokevirtual readInt : ()I
    //   5152: istore #11
    //   5154: iload #11
    //   5156: i2c
    //   5157: istore #13
    //   5159: iload #13
    //   5161: iconst_1
    //   5162: if_icmpeq -> 5191
    //   5165: iload #13
    //   5167: iconst_2
    //   5168: if_icmpeq -> 5180
    //   5171: aload_1
    //   5172: iload #11
    //   5174: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   5177: goto -> 5139
    //   5180: aload_1
    //   5181: iload #11
    //   5183: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   5186: astore #33
    //   5188: goto -> 5139
    //   5191: aload_1
    //   5192: iload #11
    //   5194: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   5197: astore #32
    //   5199: goto -> 5139
    //   5202: aload_1
    //   5203: iload #12
    //   5205: invokestatic B : (Landroid/os/Parcel;I)V
    //   5208: new ht
    //   5211: dup
    //   5212: aload #32
    //   5214: aload #33
    //   5216: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   5219: areturn
    //   5220: aload_1
    //   5221: invokestatic q0 : (Landroid/os/Parcel;)I
    //   5224: istore #16
    //   5226: iconst_0
    //   5227: istore #15
    //   5229: iconst_0
    //   5230: istore #14
    //   5232: iload #14
    //   5234: istore #11
    //   5236: iload #11
    //   5238: istore #12
    //   5240: iload #12
    //   5242: istore #13
    //   5244: aload_1
    //   5245: invokevirtual dataPosition : ()I
    //   5248: iload #16
    //   5250: if_icmpge -> 5358
    //   5253: aload_1
    //   5254: invokevirtual readInt : ()I
    //   5257: istore #18
    //   5259: iload #18
    //   5261: i2c
    //   5262: istore #17
    //   5264: iload #17
    //   5266: iconst_1
    //   5267: if_icmpeq -> 5347
    //   5270: iload #17
    //   5272: iconst_2
    //   5273: if_icmpeq -> 5336
    //   5276: iload #17
    //   5278: iconst_3
    //   5279: if_icmpeq -> 5325
    //   5282: iload #17
    //   5284: iconst_4
    //   5285: if_icmpeq -> 5314
    //   5288: iload #17
    //   5290: iconst_5
    //   5291: if_icmpeq -> 5303
    //   5294: aload_1
    //   5295: iload #18
    //   5297: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   5300: goto -> 5244
    //   5303: aload_1
    //   5304: iload #18
    //   5306: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   5309: istore #13
    //   5311: goto -> 5244
    //   5314: aload_1
    //   5315: iload #18
    //   5317: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   5320: istore #12
    //   5322: goto -> 5244
    //   5325: aload_1
    //   5326: iload #18
    //   5328: invokestatic Z : (Landroid/os/Parcel;I)Z
    //   5331: istore #11
    //   5333: goto -> 5244
    //   5336: aload_1
    //   5337: iload #18
    //   5339: invokestatic Z : (Landroid/os/Parcel;I)Z
    //   5342: istore #14
    //   5344: goto -> 5244
    //   5347: aload_1
    //   5348: iload #18
    //   5350: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   5353: istore #15
    //   5355: goto -> 5244
    //   5358: aload_1
    //   5359: iload #16
    //   5361: invokestatic B : (Landroid/os/Parcel;I)V
    //   5364: new hh1
    //   5367: dup
    //   5368: iload #15
    //   5370: iload #14
    //   5372: iload #11
    //   5374: iload #12
    //   5376: iload #13
    //   5378: invokespecial <init> : (IZZII)V
    //   5381: areturn
    //   5382: aload_1
    //   5383: invokestatic q0 : (Landroid/os/Parcel;)I
    //   5386: istore #13
    //   5388: dconst_0
    //   5389: dstore #4
    //   5391: iconst_0
    //   5392: istore #12
    //   5394: iconst_0
    //   5395: istore #11
    //   5397: aconst_null
    //   5398: astore #33
    //   5400: aload #39
    //   5402: astore #32
    //   5404: iload #23
    //   5406: istore #22
    //   5408: aload_1
    //   5409: invokevirtual dataPosition : ()I
    //   5412: iload #13
    //   5414: if_icmpge -> 5565
    //   5417: aload_1
    //   5418: invokevirtual readInt : ()I
    //   5421: istore #14
    //   5423: iload #14
    //   5425: i2c
    //   5426: tableswitch default -> 5468, 2 -> 5555, 3 -> 5544, 4 -> 5533, 5 -> 5516, 6 -> 5505, 7 -> 5488, 8 -> 5477
    //   5468: aload_1
    //   5469: iload #14
    //   5471: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   5474: goto -> 5408
    //   5477: aload_1
    //   5478: iload #14
    //   5480: invokestatic b0 : (Landroid/os/Parcel;I)D
    //   5483: dstore #4
    //   5485: goto -> 5408
    //   5488: aload_1
    //   5489: iload #14
    //   5491: getstatic oe2.CREATOR : Landroid/os/Parcelable$Creator;
    //   5494: invokestatic s : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   5497: checkcast oe2
    //   5500: astore #33
    //   5502: goto -> 5408
    //   5505: aload_1
    //   5506: iload #14
    //   5508: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   5511: istore #11
    //   5513: goto -> 5408
    //   5516: aload_1
    //   5517: iload #14
    //   5519: getstatic q8.CREATOR : Landroid/os/Parcelable$Creator;
    //   5522: invokestatic s : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   5525: checkcast q8
    //   5528: astore #32
    //   5530: goto -> 5408
    //   5533: aload_1
    //   5534: iload #14
    //   5536: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   5539: istore #12
    //   5541: goto -> 5408
    //   5544: aload_1
    //   5545: iload #14
    //   5547: invokestatic Z : (Landroid/os/Parcel;I)Z
    //   5550: istore #22
    //   5552: goto -> 5408
    //   5555: aload_1
    //   5556: iload #14
    //   5558: invokestatic b0 : (Landroid/os/Parcel;I)D
    //   5561: dstore_2
    //   5562: goto -> 5408
    //   5565: aload_1
    //   5566: iload #13
    //   5568: invokestatic B : (Landroid/os/Parcel;I)V
    //   5571: new java/lang/Object
    //   5574: dup
    //   5575: invokespecial <init> : ()V
    //   5578: astore_1
    //   5579: aload_1
    //   5580: dload_2
    //   5581: putfield b : D
    //   5584: aload_1
    //   5585: iload #22
    //   5587: putfield c : Z
    //   5590: aload_1
    //   5591: iload #12
    //   5593: putfield e : I
    //   5596: aload_1
    //   5597: aload #32
    //   5599: putfield f : Lq8;
    //   5602: aload_1
    //   5603: iload #11
    //   5605: putfield g : I
    //   5608: aload_1
    //   5609: aload #33
    //   5611: putfield h : Loe2;
    //   5614: aload_1
    //   5615: dload #4
    //   5617: putfield i : D
    //   5620: aload_1
    //   5621: areturn
    //   5622: aload_1
    //   5623: invokestatic q0 : (Landroid/os/Parcel;)I
    //   5626: istore #12
    //   5628: iconst_0
    //   5629: istore #11
    //   5631: iconst_0
    //   5632: istore #25
    //   5634: iload #25
    //   5636: istore #22
    //   5638: iload #22
    //   5640: istore #23
    //   5642: iload #23
    //   5644: istore #24
    //   5646: aconst_null
    //   5647: astore #36
    //   5649: aconst_null
    //   5650: astore #35
    //   5652: aload #35
    //   5654: astore #32
    //   5656: aload #32
    //   5658: astore #33
    //   5660: aload #33
    //   5662: astore #34
    //   5664: aload_1
    //   5665: invokevirtual dataPosition : ()I
    //   5668: iload #12
    //   5670: if_icmpge -> 5855
    //   5673: aload_1
    //   5674: invokevirtual readInt : ()I
    //   5677: istore #13
    //   5679: iload #13
    //   5681: i2c
    //   5682: tableswitch default -> 5736, 2 -> 5844, 3 -> 5833, 4 -> 5822, 5 -> 5811, 6 -> 5800, 7 -> 5789, 8 -> 5778, 9 -> 5767, 10 -> 5756, 11 -> 5745
    //   5736: aload_1
    //   5737: iload #13
    //   5739: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   5742: goto -> 5664
    //   5745: aload_1
    //   5746: iload #13
    //   5748: invokestatic Z : (Landroid/os/Parcel;I)Z
    //   5751: istore #24
    //   5753: goto -> 5664
    //   5756: aload_1
    //   5757: iload #13
    //   5759: invokestatic Z : (Landroid/os/Parcel;I)Z
    //   5762: istore #23
    //   5764: goto -> 5664
    //   5767: aload_1
    //   5768: iload #13
    //   5770: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   5773: astore #34
    //   5775: goto -> 5664
    //   5778: aload_1
    //   5779: iload #13
    //   5781: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   5784: astore #33
    //   5786: goto -> 5664
    //   5789: aload_1
    //   5790: iload #13
    //   5792: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   5795: astore #32
    //   5797: goto -> 5664
    //   5800: aload_1
    //   5801: iload #13
    //   5803: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   5806: astore #35
    //   5808: goto -> 5664
    //   5811: aload_1
    //   5812: iload #13
    //   5814: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   5817: astore #36
    //   5819: goto -> 5664
    //   5822: aload_1
    //   5823: iload #13
    //   5825: invokestatic Z : (Landroid/os/Parcel;I)Z
    //   5828: istore #22
    //   5830: goto -> 5664
    //   5833: aload_1
    //   5834: iload #13
    //   5836: invokestatic Z : (Landroid/os/Parcel;I)Z
    //   5839: istore #25
    //   5841: goto -> 5664
    //   5844: aload_1
    //   5845: iload #13
    //   5847: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   5850: istore #11
    //   5852: goto -> 5664
    //   5855: aload_1
    //   5856: iload #12
    //   5858: invokestatic B : (Landroid/os/Parcel;I)V
    //   5861: new ec2
    //   5864: dup
    //   5865: iload #11
    //   5867: iload #25
    //   5869: iload #22
    //   5871: aload #36
    //   5873: aload #35
    //   5875: aload #32
    //   5877: aload #33
    //   5879: aload #34
    //   5881: iload #23
    //   5883: iload #24
    //   5885: invokespecial <init> : (IZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V
    //   5888: areturn
    //   5889: aload_1
    //   5890: invokestatic q0 : (Landroid/os/Parcel;)I
    //   5893: istore #11
    //   5895: lconst_0
    //   5896: lstore #28
    //   5898: lconst_0
    //   5899: lstore #26
    //   5901: aconst_null
    //   5902: astore #41
    //   5904: aconst_null
    //   5905: astore #40
    //   5907: aload #40
    //   5909: astore #32
    //   5911: aload #32
    //   5913: astore #33
    //   5915: aload #33
    //   5917: astore #34
    //   5919: aload #34
    //   5921: astore #35
    //   5923: aload #35
    //   5925: astore #36
    //   5927: aload #36
    //   5929: astore #37
    //   5931: aload #37
    //   5933: astore #38
    //   5935: aload #38
    //   5937: astore #39
    //   5939: aload_1
    //   5940: invokevirtual dataPosition : ()I
    //   5943: iload #11
    //   5945: if_icmpge -> 6167
    //   5948: aload_1
    //   5949: invokevirtual readInt : ()I
    //   5952: istore #12
    //   5954: iload #12
    //   5956: i2c
    //   5957: tableswitch default -> 6020, 2 -> 6156, 3 -> 6145, 4 -> 6134, 5 -> 6123, 6 -> 6112, 7 -> 6101, 8 -> 6090, 9 -> 6079, 10 -> 6068, 11 -> 6057, 12 -> 6046, 13 -> 6029
    //   6020: aload_1
    //   6021: iload #12
    //   6023: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   6026: goto -> 5939
    //   6029: aload_1
    //   6030: iload #12
    //   6032: getstatic m12.CREATOR : Landroid/os/Parcelable$Creator;
    //   6035: invokestatic s : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   6038: checkcast m12
    //   6041: astore #39
    //   6043: goto -> 5939
    //   6046: aload_1
    //   6047: iload #12
    //   6049: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   6052: astore #38
    //   6054: goto -> 5939
    //   6057: aload_1
    //   6058: iload #12
    //   6060: invokestatic g0 : (Landroid/os/Parcel;I)J
    //   6063: lstore #26
    //   6065: goto -> 5939
    //   6068: aload_1
    //   6069: iload #12
    //   6071: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   6074: astore #37
    //   6076: goto -> 5939
    //   6079: aload_1
    //   6080: iload #12
    //   6082: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   6085: astore #36
    //   6087: goto -> 5939
    //   6090: aload_1
    //   6091: iload #12
    //   6093: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   6096: astore #35
    //   6098: goto -> 5939
    //   6101: aload_1
    //   6102: iload #12
    //   6104: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   6107: astore #34
    //   6109: goto -> 5939
    //   6112: aload_1
    //   6113: iload #12
    //   6115: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   6118: astore #33
    //   6120: goto -> 5939
    //   6123: aload_1
    //   6124: iload #12
    //   6126: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   6129: astore #32
    //   6131: goto -> 5939
    //   6134: aload_1
    //   6135: iload #12
    //   6137: invokestatic g0 : (Landroid/os/Parcel;I)J
    //   6140: lstore #28
    //   6142: goto -> 5939
    //   6145: aload_1
    //   6146: iload #12
    //   6148: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   6151: astore #40
    //   6153: goto -> 5939
    //   6156: aload_1
    //   6157: iload #12
    //   6159: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   6162: astore #41
    //   6164: goto -> 5939
    //   6167: aload_1
    //   6168: iload #11
    //   6170: invokestatic B : (Landroid/os/Parcel;I)V
    //   6173: new p2
    //   6176: dup
    //   6177: aload #41
    //   6179: aload #40
    //   6181: lload #28
    //   6183: aload #32
    //   6185: aload #33
    //   6187: aload #34
    //   6189: aload #35
    //   6191: aload #36
    //   6193: aload #37
    //   6195: lload #26
    //   6197: aload #38
    //   6199: aload #39
    //   6201: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lm12;)V
    //   6204: areturn
    //   6205: aload_1
    //   6206: invokestatic q0 : (Landroid/os/Parcel;)I
    //   6209: istore #13
    //   6211: iconst_0
    //   6212: istore #12
    //   6214: iconst_0
    //   6215: istore #11
    //   6217: aconst_null
    //   6218: astore #34
    //   6220: aconst_null
    //   6221: astore #33
    //   6223: aload #33
    //   6225: astore #32
    //   6227: aload_1
    //   6228: invokevirtual dataPosition : ()I
    //   6231: iload #13
    //   6233: if_icmpge -> 6347
    //   6236: aload_1
    //   6237: invokevirtual readInt : ()I
    //   6240: istore #15
    //   6242: iload #15
    //   6244: i2c
    //   6245: istore #14
    //   6247: iload #14
    //   6249: iconst_1
    //   6250: if_icmpeq -> 6336
    //   6253: iload #14
    //   6255: iconst_2
    //   6256: if_icmpeq -> 6325
    //   6259: iload #14
    //   6261: iconst_3
    //   6262: if_icmpeq -> 6308
    //   6265: iload #14
    //   6267: iconst_4
    //   6268: if_icmpeq -> 6297
    //   6271: iload #14
    //   6273: iconst_5
    //   6274: if_icmpeq -> 6286
    //   6277: aload_1
    //   6278: iload #15
    //   6280: invokestatic m0 : (Landroid/os/Parcel;I)V
    //   6283: goto -> 6227
    //   6286: aload_1
    //   6287: iload #15
    //   6289: invokestatic e0 : (Landroid/os/Parcel;I)Ljava/lang/Integer;
    //   6292: astore #32
    //   6294: goto -> 6227
    //   6297: aload_1
    //   6298: iload #15
    //   6300: invokestatic t : (Landroid/os/Parcel;I)Ljava/lang/String;
    //   6303: astore #33
    //   6305: goto -> 6227
    //   6308: aload_1
    //   6309: iload #15
    //   6311: getstatic android/app/PendingIntent.CREATOR : Landroid/os/Parcelable$Creator;
    //   6314: invokestatic s : (Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
    //   6317: checkcast android/app/PendingIntent
    //   6320: astore #34
    //   6322: goto -> 6227
    //   6325: aload_1
    //   6326: iload #15
    //   6328: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   6331: istore #11
    //   6333: goto -> 6227
    //   6336: aload_1
    //   6337: iload #15
    //   6339: invokestatic d0 : (Landroid/os/Parcel;I)I
    //   6342: istore #12
    //   6344: goto -> 6227
    //   6347: aload_1
    //   6348: iload #13
    //   6350: invokestatic B : (Landroid/os/Parcel;I)V
    //   6353: new sp
    //   6356: dup
    //   6357: iload #12
    //   6359: iload #11
    //   6361: aload #34
    //   6363: aload #33
    //   6365: aload #32
    //   6367: invokespecial <init> : (IILandroid/app/PendingIntent;Ljava/lang/String;Ljava/lang/Integer;)V
    //   6370: areturn
    //   6371: astore_1
    //   6372: goto -> 1507
    //   6375: astore_1
    //   6376: goto -> 3503
    //   6379: astore_1
    //   6380: goto -> 4280
    // Exception table:
    //   from	to	target	type
    //   1512	1522	6371	org/json/JSONException
    //   3508	3518	6375	org/json/JSONException
    //   4285	4295	6379	org/json/JSONException
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */