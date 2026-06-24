import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

public final class xl2 implements em2 {
  public static final int[] j = new int[0];
  
  public static final Unsafe k = wm2.i();
  
  public final int[] a;
  
  public final Object[] b;
  
  public final int c;
  
  public final int d;
  
  public final yj2 e;
  
  public final int[] f;
  
  public final int g;
  
  public final int h;
  
  public final bg2 i;
  
  public xl2(int[] paramArrayOfint1, Object[] paramArrayOfObject, int paramInt1, int paramInt2, yj2 paramyj2, int[] paramArrayOfint2, int paramInt3, int paramInt4, bg2 parambg21, bg2 parambg22) {
    this.a = paramArrayOfint1;
    this.b = paramArrayOfObject;
    this.c = paramInt1;
    this.d = paramInt2;
    this.f = paramArrayOfint2;
    this.g = paramInt3;
    this.h = paramInt4;
    this.i = parambg21;
    this.e = paramyj2;
  }
  
  public static Field E(Class paramClass, String paramString) {
    try {
      return paramClass.getDeclaredField(paramString);
    } catch (NoSuchFieldException noSuchFieldException) {
      for (Field field : paramClass.getDeclaredFields()) {
        if (paramString.equals(field.getName()))
          return field; 
      } 
      String str1 = paramClass.getName();
      String str2 = Arrays.toString((Object[])SYNTHETIC_LOCAL_VARIABLE_5);
      StringBuilder stringBuilder = new StringBuilder("Field ");
      stringBuilder.append(paramString);
      stringBuilder.append(" for ");
      stringBuilder.append(str1);
      stringBuilder.append(" not found. Known fields are ");
      stringBuilder.append(str2);
      throw new RuntimeException(stringBuilder.toString(), noSuchFieldException);
    } 
  }
  
  public static boolean r(Object paramObject) {
    return (paramObject == null) ? false : ((paramObject instanceof wk2) ? ((wk2)paramObject).h() : true);
  }
  
  public static xl2 u(dm2 paramdm2, bg2 parambg21, bg2 parambg22) {
    // Byte code:
    //   0: aload_0
    //   1: instanceof dm2
    //   4: ifeq -> 2526
    //   7: aload_0
    //   8: getfield b : Ljava/lang/String;
    //   11: astore #26
    //   13: aload #26
    //   15: invokevirtual length : ()I
    //   18: istore #16
    //   20: aload #26
    //   22: iconst_0
    //   23: invokevirtual charAt : (I)C
    //   26: istore_3
    //   27: iload_3
    //   28: ldc 55296
    //   30: if_icmplt -> 61
    //   33: iconst_1
    //   34: istore_3
    //   35: iload_3
    //   36: iconst_1
    //   37: iadd
    //   38: istore #5
    //   40: iload #5
    //   42: istore #4
    //   44: aload #26
    //   46: iload_3
    //   47: invokevirtual charAt : (I)C
    //   50: ldc 55296
    //   52: if_icmplt -> 64
    //   55: iload #5
    //   57: istore_3
    //   58: goto -> 35
    //   61: iconst_1
    //   62: istore #4
    //   64: iload #4
    //   66: iconst_1
    //   67: iadd
    //   68: istore_3
    //   69: aload #26
    //   71: iload #4
    //   73: invokevirtual charAt : (I)C
    //   76: istore #6
    //   78: iload_3
    //   79: istore #4
    //   81: iload #6
    //   83: istore #5
    //   85: iload #6
    //   87: ldc 55296
    //   89: if_icmplt -> 164
    //   92: iload #6
    //   94: sipush #8191
    //   97: iand
    //   98: istore #5
    //   100: bipush #13
    //   102: istore #4
    //   104: iload_3
    //   105: istore #6
    //   107: iload #6
    //   109: iconst_1
    //   110: iadd
    //   111: istore_3
    //   112: aload #26
    //   114: iload #6
    //   116: invokevirtual charAt : (I)C
    //   119: istore #6
    //   121: iload #6
    //   123: ldc 55296
    //   125: if_icmplt -> 151
    //   128: iload #5
    //   130: iload #6
    //   132: sipush #8191
    //   135: iand
    //   136: iload #4
    //   138: ishl
    //   139: ior
    //   140: istore #5
    //   142: iinc #4, 13
    //   145: iload_3
    //   146: istore #6
    //   148: goto -> 107
    //   151: iload #5
    //   153: iload #6
    //   155: iload #4
    //   157: ishl
    //   158: ior
    //   159: istore #5
    //   161: iload_3
    //   162: istore #4
    //   164: iload #5
    //   166: ifne -> 213
    //   169: getstatic xl2.j : [I
    //   172: astore #23
    //   174: iconst_0
    //   175: istore #12
    //   177: iconst_0
    //   178: istore_3
    //   179: iload_3
    //   180: istore #9
    //   182: iload #9
    //   184: istore #8
    //   186: iload #8
    //   188: istore #6
    //   190: iload #6
    //   192: istore #5
    //   194: iload #5
    //   196: istore #7
    //   198: iload #9
    //   200: istore #10
    //   202: iload #8
    //   204: istore #14
    //   206: iload #6
    //   208: istore #13
    //   210: goto -> 1128
    //   213: iload #4
    //   215: iconst_1
    //   216: iadd
    //   217: istore #5
    //   219: aload #26
    //   221: iload #4
    //   223: invokevirtual charAt : (I)C
    //   226: istore #4
    //   228: iload #4
    //   230: istore_3
    //   231: iload #5
    //   233: istore #6
    //   235: iload #4
    //   237: ldc 55296
    //   239: if_icmplt -> 320
    //   242: iload #4
    //   244: sipush #8191
    //   247: iand
    //   248: istore_3
    //   249: bipush #13
    //   251: istore #4
    //   253: iload #5
    //   255: istore #6
    //   257: iload_3
    //   258: istore #5
    //   260: iload #6
    //   262: iconst_1
    //   263: iadd
    //   264: istore_3
    //   265: aload #26
    //   267: iload #6
    //   269: invokevirtual charAt : (I)C
    //   272: istore #6
    //   274: iload #6
    //   276: ldc 55296
    //   278: if_icmplt -> 304
    //   281: iload #5
    //   283: iload #6
    //   285: sipush #8191
    //   288: iand
    //   289: iload #4
    //   291: ishl
    //   292: ior
    //   293: istore #5
    //   295: iinc #4, 13
    //   298: iload_3
    //   299: istore #6
    //   301: goto -> 260
    //   304: iload #5
    //   306: iload #6
    //   308: iload #4
    //   310: ishl
    //   311: ior
    //   312: istore #4
    //   314: iload_3
    //   315: istore #6
    //   317: iload #4
    //   319: istore_3
    //   320: iload #6
    //   322: iconst_1
    //   323: iadd
    //   324: istore #4
    //   326: aload #26
    //   328: iload #6
    //   330: invokevirtual charAt : (I)C
    //   333: istore #6
    //   335: iload #6
    //   337: istore #10
    //   339: iload #4
    //   341: istore #5
    //   343: iload #6
    //   345: ldc 55296
    //   347: if_icmplt -> 426
    //   350: iload #6
    //   352: sipush #8191
    //   355: iand
    //   356: istore #6
    //   358: bipush #13
    //   360: istore #5
    //   362: iload #4
    //   364: istore #7
    //   366: iload #7
    //   368: iconst_1
    //   369: iadd
    //   370: istore #4
    //   372: aload #26
    //   374: iload #7
    //   376: invokevirtual charAt : (I)C
    //   379: istore #7
    //   381: iload #7
    //   383: ldc 55296
    //   385: if_icmplt -> 412
    //   388: iload #6
    //   390: iload #7
    //   392: sipush #8191
    //   395: iand
    //   396: iload #5
    //   398: ishl
    //   399: ior
    //   400: istore #6
    //   402: iinc #5, 13
    //   405: iload #4
    //   407: istore #7
    //   409: goto -> 366
    //   412: iload #6
    //   414: iload #7
    //   416: iload #5
    //   418: ishl
    //   419: ior
    //   420: istore #10
    //   422: iload #4
    //   424: istore #5
    //   426: iload #5
    //   428: iconst_1
    //   429: iadd
    //   430: istore #6
    //   432: aload #26
    //   434: iload #5
    //   436: invokevirtual charAt : (I)C
    //   439: istore #7
    //   441: iload #7
    //   443: istore #4
    //   445: iload #6
    //   447: istore #5
    //   449: iload #7
    //   451: ldc 55296
    //   453: if_icmplt -> 540
    //   456: iload #7
    //   458: sipush #8191
    //   461: iand
    //   462: istore #4
    //   464: bipush #13
    //   466: istore #5
    //   468: iload #6
    //   470: istore #7
    //   472: iload #4
    //   474: istore #6
    //   476: iload #7
    //   478: iconst_1
    //   479: iadd
    //   480: istore #4
    //   482: aload #26
    //   484: iload #7
    //   486: invokevirtual charAt : (I)C
    //   489: istore #7
    //   491: iload #7
    //   493: ldc 55296
    //   495: if_icmplt -> 522
    //   498: iload #6
    //   500: iload #7
    //   502: sipush #8191
    //   505: iand
    //   506: iload #5
    //   508: ishl
    //   509: ior
    //   510: istore #6
    //   512: iinc #5, 13
    //   515: iload #4
    //   517: istore #7
    //   519: goto -> 476
    //   522: iload #6
    //   524: iload #7
    //   526: iload #5
    //   528: ishl
    //   529: ior
    //   530: istore #6
    //   532: iload #4
    //   534: istore #5
    //   536: iload #6
    //   538: istore #4
    //   540: iload #5
    //   542: iconst_1
    //   543: iadd
    //   544: istore #6
    //   546: aload #26
    //   548: iload #5
    //   550: invokevirtual charAt : (I)C
    //   553: istore #7
    //   555: iload #7
    //   557: istore #5
    //   559: iload #6
    //   561: istore #8
    //   563: iload #7
    //   565: ldc 55296
    //   567: if_icmplt -> 646
    //   570: iload #7
    //   572: sipush #8191
    //   575: iand
    //   576: istore #7
    //   578: bipush #13
    //   580: istore #5
    //   582: iload #6
    //   584: istore #8
    //   586: iload #8
    //   588: iconst_1
    //   589: iadd
    //   590: istore #6
    //   592: aload #26
    //   594: iload #8
    //   596: invokevirtual charAt : (I)C
    //   599: istore #8
    //   601: iload #8
    //   603: ldc 55296
    //   605: if_icmplt -> 632
    //   608: iload #7
    //   610: iload #8
    //   612: sipush #8191
    //   615: iand
    //   616: iload #5
    //   618: ishl
    //   619: ior
    //   620: istore #7
    //   622: iinc #5, 13
    //   625: iload #6
    //   627: istore #8
    //   629: goto -> 586
    //   632: iload #7
    //   634: iload #8
    //   636: iload #5
    //   638: ishl
    //   639: ior
    //   640: istore #5
    //   642: iload #6
    //   644: istore #8
    //   646: iload #8
    //   648: iconst_1
    //   649: iadd
    //   650: istore #7
    //   652: aload #26
    //   654: iload #8
    //   656: invokevirtual charAt : (I)C
    //   659: istore #9
    //   661: iload #9
    //   663: istore #6
    //   665: iload #7
    //   667: istore #8
    //   669: iload #9
    //   671: ldc 55296
    //   673: if_icmplt -> 752
    //   676: iload #9
    //   678: sipush #8191
    //   681: iand
    //   682: istore #8
    //   684: bipush #13
    //   686: istore #6
    //   688: iload #7
    //   690: istore #9
    //   692: iload #9
    //   694: iconst_1
    //   695: iadd
    //   696: istore #7
    //   698: aload #26
    //   700: iload #9
    //   702: invokevirtual charAt : (I)C
    //   705: istore #9
    //   707: iload #9
    //   709: ldc 55296
    //   711: if_icmplt -> 738
    //   714: iload #8
    //   716: iload #9
    //   718: sipush #8191
    //   721: iand
    //   722: iload #6
    //   724: ishl
    //   725: ior
    //   726: istore #8
    //   728: iinc #6, 13
    //   731: iload #7
    //   733: istore #9
    //   735: goto -> 692
    //   738: iload #8
    //   740: iload #9
    //   742: iload #6
    //   744: ishl
    //   745: ior
    //   746: istore #6
    //   748: iload #7
    //   750: istore #8
    //   752: iload #8
    //   754: iconst_1
    //   755: iadd
    //   756: istore #9
    //   758: aload #26
    //   760: iload #8
    //   762: invokevirtual charAt : (I)C
    //   765: istore #8
    //   767: iload #8
    //   769: istore #7
    //   771: iload #9
    //   773: istore #11
    //   775: iload #8
    //   777: ldc 55296
    //   779: if_icmplt -> 866
    //   782: iload #8
    //   784: sipush #8191
    //   787: iand
    //   788: istore #7
    //   790: bipush #13
    //   792: istore #8
    //   794: iload #9
    //   796: istore #11
    //   798: iload #7
    //   800: istore #9
    //   802: iload #11
    //   804: iconst_1
    //   805: iadd
    //   806: istore #7
    //   808: aload #26
    //   810: iload #11
    //   812: invokevirtual charAt : (I)C
    //   815: istore #11
    //   817: iload #11
    //   819: ldc 55296
    //   821: if_icmplt -> 848
    //   824: iload #9
    //   826: iload #11
    //   828: sipush #8191
    //   831: iand
    //   832: iload #8
    //   834: ishl
    //   835: ior
    //   836: istore #9
    //   838: iinc #8, 13
    //   841: iload #7
    //   843: istore #11
    //   845: goto -> 802
    //   848: iload #9
    //   850: iload #11
    //   852: iload #8
    //   854: ishl
    //   855: ior
    //   856: istore #8
    //   858: iload #7
    //   860: istore #11
    //   862: iload #8
    //   864: istore #7
    //   866: iload #11
    //   868: iconst_1
    //   869: iadd
    //   870: istore #8
    //   872: aload #26
    //   874: iload #11
    //   876: invokevirtual charAt : (I)C
    //   879: istore #12
    //   881: iload #12
    //   883: istore #11
    //   885: iload #8
    //   887: istore #9
    //   889: iload #12
    //   891: ldc 55296
    //   893: if_icmplt -> 972
    //   896: iload #12
    //   898: sipush #8191
    //   901: iand
    //   902: istore #11
    //   904: bipush #13
    //   906: istore #9
    //   908: iload #8
    //   910: istore #12
    //   912: iload #12
    //   914: iconst_1
    //   915: iadd
    //   916: istore #8
    //   918: aload #26
    //   920: iload #12
    //   922: invokevirtual charAt : (I)C
    //   925: istore #12
    //   927: iload #12
    //   929: ldc 55296
    //   931: if_icmplt -> 958
    //   934: iload #11
    //   936: iload #12
    //   938: sipush #8191
    //   941: iand
    //   942: iload #9
    //   944: ishl
    //   945: ior
    //   946: istore #11
    //   948: iinc #9, 13
    //   951: iload #8
    //   953: istore #12
    //   955: goto -> 912
    //   958: iload #11
    //   960: iload #12
    //   962: iload #9
    //   964: ishl
    //   965: ior
    //   966: istore #11
    //   968: iload #8
    //   970: istore #9
    //   972: iload #9
    //   974: iconst_1
    //   975: iadd
    //   976: istore #12
    //   978: aload #26
    //   980: iload #9
    //   982: invokevirtual charAt : (I)C
    //   985: istore #13
    //   987: iload #13
    //   989: istore #8
    //   991: iload #12
    //   993: istore #9
    //   995: iload #13
    //   997: ldc 55296
    //   999: if_icmplt -> 1078
    //   1002: iload #13
    //   1004: sipush #8191
    //   1007: iand
    //   1008: istore #9
    //   1010: bipush #13
    //   1012: istore #8
    //   1014: iload #12
    //   1016: istore #13
    //   1018: iload #9
    //   1020: istore #12
    //   1022: iload #13
    //   1024: iconst_1
    //   1025: iadd
    //   1026: istore #9
    //   1028: aload #26
    //   1030: iload #13
    //   1032: invokevirtual charAt : (I)C
    //   1035: istore #13
    //   1037: iload #13
    //   1039: ldc 55296
    //   1041: if_icmplt -> 1068
    //   1044: iload #12
    //   1046: iload #13
    //   1048: sipush #8191
    //   1051: iand
    //   1052: iload #8
    //   1054: ishl
    //   1055: ior
    //   1056: istore #12
    //   1058: iinc #8, 13
    //   1061: iload #9
    //   1063: istore #13
    //   1065: goto -> 1022
    //   1068: iload #12
    //   1070: iload #13
    //   1072: iload #8
    //   1074: ishl
    //   1075: ior
    //   1076: istore #8
    //   1078: iload #8
    //   1080: iload #7
    //   1082: iadd
    //   1083: iload #11
    //   1085: iadd
    //   1086: newarray int
    //   1088: astore #23
    //   1090: iload_3
    //   1091: istore #11
    //   1093: iload #5
    //   1095: istore #13
    //   1097: iload_3
    //   1098: iload_3
    //   1099: iadd
    //   1100: iload #10
    //   1102: iadd
    //   1103: istore_3
    //   1104: iload #8
    //   1106: istore #5
    //   1108: iload #4
    //   1110: istore #14
    //   1112: iload #6
    //   1114: istore #10
    //   1116: iload #7
    //   1118: istore #12
    //   1120: iload #11
    //   1122: istore #7
    //   1124: iload #9
    //   1126: istore #4
    //   1128: getstatic xl2.k : Lsun/misc/Unsafe;
    //   1131: astore #29
    //   1133: aload_0
    //   1134: getfield c : [Ljava/lang/Object;
    //   1137: astore #25
    //   1139: aload_0
    //   1140: getfield a : Lyj2;
    //   1143: invokevirtual getClass : ()Ljava/lang/Class;
    //   1146: astore #27
    //   1148: iload #5
    //   1150: iload #12
    //   1152: iadd
    //   1153: istore #20
    //   1155: iload #10
    //   1157: iconst_3
    //   1158: imul
    //   1159: newarray int
    //   1161: astore #30
    //   1163: iload #10
    //   1165: iload #10
    //   1167: iadd
    //   1168: anewarray java/lang/Object
    //   1171: astore #24
    //   1173: iload #20
    //   1175: istore #6
    //   1177: iload #5
    //   1179: istore #8
    //   1181: iconst_0
    //   1182: istore #10
    //   1184: iconst_0
    //   1185: istore #9
    //   1187: iload #7
    //   1189: istore #15
    //   1191: iload #4
    //   1193: istore #7
    //   1195: iload #16
    //   1197: istore #4
    //   1199: iload #9
    //   1201: istore #21
    //   1203: iload #7
    //   1205: iload #4
    //   1207: if_icmpge -> 2498
    //   1210: iload #7
    //   1212: iconst_1
    //   1213: iadd
    //   1214: istore #9
    //   1216: aload #26
    //   1218: iload #7
    //   1220: invokevirtual charAt : (I)C
    //   1223: istore #16
    //   1225: iload #16
    //   1227: ldc 55296
    //   1229: if_icmplt -> 1319
    //   1232: iload #16
    //   1234: sipush #8191
    //   1237: iand
    //   1238: istore #12
    //   1240: iload #9
    //   1242: istore #7
    //   1244: bipush #13
    //   1246: istore #9
    //   1248: iload #7
    //   1250: iconst_1
    //   1251: iadd
    //   1252: istore #11
    //   1254: aload #26
    //   1256: iload #7
    //   1258: invokevirtual charAt : (I)C
    //   1261: istore #16
    //   1263: iload #4
    //   1265: istore #7
    //   1267: iload #16
    //   1269: ldc 55296
    //   1271: if_icmplt -> 1302
    //   1274: iload #12
    //   1276: iload #16
    //   1278: sipush #8191
    //   1281: iand
    //   1282: iload #9
    //   1284: ishl
    //   1285: ior
    //   1286: istore #12
    //   1288: iinc #9, 13
    //   1291: iload #7
    //   1293: istore #4
    //   1295: iload #11
    //   1297: istore #7
    //   1299: goto -> 1248
    //   1302: iload #12
    //   1304: iload #16
    //   1306: iload #9
    //   1308: ishl
    //   1309: ior
    //   1310: istore #16
    //   1312: iload #11
    //   1314: istore #9
    //   1316: goto -> 1323
    //   1319: iload #4
    //   1321: istore #7
    //   1323: iload #9
    //   1325: iconst_1
    //   1326: iadd
    //   1327: istore #4
    //   1329: aload #26
    //   1331: iload #9
    //   1333: invokevirtual charAt : (I)C
    //   1336: istore #11
    //   1338: iload #11
    //   1340: istore #18
    //   1342: iload #4
    //   1344: istore #9
    //   1346: iload #11
    //   1348: ldc 55296
    //   1350: if_icmplt -> 1429
    //   1353: iload #11
    //   1355: sipush #8191
    //   1358: iand
    //   1359: istore #11
    //   1361: bipush #13
    //   1363: istore #9
    //   1365: iload #4
    //   1367: istore #12
    //   1369: iload #12
    //   1371: iconst_1
    //   1372: iadd
    //   1373: istore #4
    //   1375: aload #26
    //   1377: iload #12
    //   1379: invokevirtual charAt : (I)C
    //   1382: istore #12
    //   1384: iload #12
    //   1386: ldc 55296
    //   1388: if_icmplt -> 1415
    //   1391: iload #11
    //   1393: iload #12
    //   1395: sipush #8191
    //   1398: iand
    //   1399: iload #9
    //   1401: ishl
    //   1402: ior
    //   1403: istore #11
    //   1405: iinc #9, 13
    //   1408: iload #4
    //   1410: istore #12
    //   1412: goto -> 1369
    //   1415: iload #11
    //   1417: iload #12
    //   1419: iload #9
    //   1421: ishl
    //   1422: ior
    //   1423: istore #18
    //   1425: iload #4
    //   1427: istore #9
    //   1429: iload #10
    //   1431: istore #17
    //   1433: iload #18
    //   1435: sipush #1024
    //   1438: iand
    //   1439: ifeq -> 1455
    //   1442: aload #23
    //   1444: iload #10
    //   1446: iload #21
    //   1448: iastore
    //   1449: iload #10
    //   1451: iconst_1
    //   1452: iadd
    //   1453: istore #17
    //   1455: iload #18
    //   1457: sipush #255
    //   1460: iand
    //   1461: istore #22
    //   1463: iload #18
    //   1465: sipush #2048
    //   1468: iand
    //   1469: istore #4
    //   1471: iload #22
    //   1473: bipush #51
    //   1475: if_icmplt -> 1834
    //   1478: iload #9
    //   1480: iconst_1
    //   1481: iadd
    //   1482: istore #12
    //   1484: aload #26
    //   1486: iload #9
    //   1488: invokevirtual charAt : (I)C
    //   1491: istore #11
    //   1493: iload #11
    //   1495: ldc 55296
    //   1497: if_icmplt -> 1571
    //   1500: iload #11
    //   1502: sipush #8191
    //   1505: iand
    //   1506: istore #11
    //   1508: bipush #13
    //   1510: istore #10
    //   1512: iload #12
    //   1514: iconst_1
    //   1515: iadd
    //   1516: istore #9
    //   1518: aload #26
    //   1520: iload #12
    //   1522: invokevirtual charAt : (I)C
    //   1525: istore #12
    //   1527: iload #12
    //   1529: ldc 55296
    //   1531: if_icmplt -> 1558
    //   1534: iload #11
    //   1536: iload #12
    //   1538: sipush #8191
    //   1541: iand
    //   1542: iload #10
    //   1544: ishl
    //   1545: ior
    //   1546: istore #11
    //   1548: iinc #10, 13
    //   1551: iload #9
    //   1553: istore #12
    //   1555: goto -> 1512
    //   1558: iload #11
    //   1560: iload #12
    //   1562: iload #10
    //   1564: ishl
    //   1565: ior
    //   1566: istore #11
    //   1568: goto -> 1575
    //   1571: iload #12
    //   1573: istore #9
    //   1575: iload #22
    //   1577: bipush #51
    //   1579: isub
    //   1580: istore #12
    //   1582: iload #12
    //   1584: bipush #9
    //   1586: if_icmpeq -> 1596
    //   1589: iload #12
    //   1591: bipush #17
    //   1593: if_icmpne -> 1599
    //   1596: goto -> 1668
    //   1599: iload_3
    //   1600: istore #10
    //   1602: iload #12
    //   1604: bipush #12
    //   1606: if_icmpne -> 1662
    //   1609: aload_0
    //   1610: invokevirtual a : ()I
    //   1613: iconst_1
    //   1614: if_icmpeq -> 1631
    //   1617: iload #4
    //   1619: ifeq -> 1625
    //   1622: goto -> 1631
    //   1625: iconst_0
    //   1626: istore #4
    //   1628: goto -> 1699
    //   1631: iload_3
    //   1632: iconst_1
    //   1633: iadd
    //   1634: istore #10
    //   1636: iload #21
    //   1638: iconst_3
    //   1639: idiv
    //   1640: istore #12
    //   1642: aload #24
    //   1644: iload #12
    //   1646: iload #12
    //   1648: iadd
    //   1649: iconst_1
    //   1650: iadd
    //   1651: aload #25
    //   1653: iload_3
    //   1654: aaload
    //   1655: aastore
    //   1656: iload #10
    //   1658: istore_3
    //   1659: iload_3
    //   1660: istore #10
    //   1662: iload #10
    //   1664: istore_3
    //   1665: goto -> 1699
    //   1668: iload_3
    //   1669: iconst_1
    //   1670: iadd
    //   1671: istore #10
    //   1673: iload #21
    //   1675: iconst_3
    //   1676: idiv
    //   1677: istore #12
    //   1679: aload #24
    //   1681: iload #12
    //   1683: iload #12
    //   1685: iadd
    //   1686: iconst_1
    //   1687: iadd
    //   1688: aload #25
    //   1690: iload_3
    //   1691: aaload
    //   1692: aastore
    //   1693: iload #10
    //   1695: istore_3
    //   1696: goto -> 1659
    //   1699: iload #11
    //   1701: iload #11
    //   1703: iadd
    //   1704: istore #11
    //   1706: iload #4
    //   1708: istore #10
    //   1710: aload #25
    //   1712: iload #11
    //   1714: aaload
    //   1715: astore #28
    //   1717: aload #28
    //   1719: instanceof java/lang/reflect/Field
    //   1722: ifeq -> 1735
    //   1725: aload #28
    //   1727: checkcast java/lang/reflect/Field
    //   1730: astore #28
    //   1732: goto -> 1754
    //   1735: aload #27
    //   1737: aload #28
    //   1739: checkcast java/lang/String
    //   1742: invokestatic E : (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   1745: astore #28
    //   1747: aload #25
    //   1749: iload #11
    //   1751: aload #28
    //   1753: aastore
    //   1754: aload #29
    //   1756: aload #28
    //   1758: invokevirtual objectFieldOffset : (Ljava/lang/reflect/Field;)J
    //   1761: l2i
    //   1762: istore #19
    //   1764: iload #11
    //   1766: iconst_1
    //   1767: iadd
    //   1768: istore #4
    //   1770: aload #25
    //   1772: iload #4
    //   1774: aaload
    //   1775: astore #28
    //   1777: aload #28
    //   1779: instanceof java/lang/reflect/Field
    //   1782: ifeq -> 1795
    //   1785: aload #28
    //   1787: checkcast java/lang/reflect/Field
    //   1790: astore #28
    //   1792: goto -> 1814
    //   1795: aload #27
    //   1797: aload #28
    //   1799: checkcast java/lang/String
    //   1802: invokestatic E : (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   1805: astore #28
    //   1807: aload #25
    //   1809: iload #4
    //   1811: aload #28
    //   1813: aastore
    //   1814: aload #29
    //   1816: aload #28
    //   1818: invokevirtual objectFieldOffset : (Ljava/lang/reflect/Field;)J
    //   1821: l2i
    //   1822: istore #11
    //   1824: iload #9
    //   1826: istore #4
    //   1828: iconst_0
    //   1829: istore #12
    //   1831: goto -> 2370
    //   1834: iload_3
    //   1835: iconst_1
    //   1836: iadd
    //   1837: istore #10
    //   1839: aload #27
    //   1841: aload #25
    //   1843: iload_3
    //   1844: aaload
    //   1845: checkcast java/lang/String
    //   1848: invokestatic E : (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   1851: astore #28
    //   1853: iload #22
    //   1855: bipush #9
    //   1857: if_icmpeq -> 1867
    //   1860: iload #22
    //   1862: bipush #17
    //   1864: if_icmpne -> 1870
    //   1867: goto -> 2084
    //   1870: iload #22
    //   1872: bipush #27
    //   1874: if_icmpeq -> 2057
    //   1877: iload #22
    //   1879: bipush #49
    //   1881: if_icmpne -> 1890
    //   1884: iinc #3, 2
    //   1887: goto -> 2060
    //   1890: iload #22
    //   1892: bipush #12
    //   1894: if_icmpeq -> 2005
    //   1897: iload #22
    //   1899: bipush #30
    //   1901: if_icmpeq -> 2005
    //   1904: iload #22
    //   1906: bipush #44
    //   1908: if_icmpne -> 1914
    //   1911: goto -> 2005
    //   1914: iload #22
    //   1916: bipush #50
    //   1918: if_icmpne -> 2002
    //   1921: iload_3
    //   1922: iconst_2
    //   1923: iadd
    //   1924: istore #12
    //   1926: iload #8
    //   1928: iconst_1
    //   1929: iadd
    //   1930: istore #11
    //   1932: aload #23
    //   1934: iload #8
    //   1936: iload #21
    //   1938: iastore
    //   1939: iload #21
    //   1941: iconst_3
    //   1942: idiv
    //   1943: istore #8
    //   1945: aload #25
    //   1947: iload #10
    //   1949: aaload
    //   1950: astore #31
    //   1952: iload #8
    //   1954: iload #8
    //   1956: iadd
    //   1957: istore #8
    //   1959: aload #24
    //   1961: iload #8
    //   1963: aload #31
    //   1965: aastore
    //   1966: iload #4
    //   1968: ifeq -> 1993
    //   1971: iinc #3, 3
    //   1974: aload #24
    //   1976: iload #8
    //   1978: iconst_1
    //   1979: iadd
    //   1980: aload #25
    //   1982: iload #12
    //   1984: aaload
    //   1985: aastore
    //   1986: iload #11
    //   1988: istore #8
    //   1990: goto -> 2105
    //   1993: iload #12
    //   1995: istore_3
    //   1996: iconst_0
    //   1997: istore #4
    //   1999: goto -> 1986
    //   2002: goto -> 2102
    //   2005: aload_0
    //   2006: invokevirtual a : ()I
    //   2009: iconst_1
    //   2010: if_icmpeq -> 2030
    //   2013: iload #4
    //   2015: ifeq -> 2021
    //   2018: goto -> 2030
    //   2021: iload #10
    //   2023: istore_3
    //   2024: iconst_0
    //   2025: istore #4
    //   2027: goto -> 2105
    //   2030: iinc #3, 2
    //   2033: iload #21
    //   2035: iconst_3
    //   2036: idiv
    //   2037: istore #11
    //   2039: aload #24
    //   2041: iload #11
    //   2043: iload #11
    //   2045: iadd
    //   2046: iconst_1
    //   2047: iadd
    //   2048: aload #25
    //   2050: iload #10
    //   2052: aaload
    //   2053: aastore
    //   2054: goto -> 2105
    //   2057: iinc #3, 2
    //   2060: iload #21
    //   2062: iconst_3
    //   2063: idiv
    //   2064: istore #11
    //   2066: aload #24
    //   2068: iload #11
    //   2070: iload #11
    //   2072: iadd
    //   2073: iconst_1
    //   2074: iadd
    //   2075: aload #25
    //   2077: iload #10
    //   2079: aaload
    //   2080: aastore
    //   2081: goto -> 2054
    //   2084: iload #21
    //   2086: iconst_3
    //   2087: idiv
    //   2088: istore_3
    //   2089: aload #24
    //   2091: iload_3
    //   2092: iload_3
    //   2093: iadd
    //   2094: iconst_1
    //   2095: iadd
    //   2096: aload #28
    //   2098: invokevirtual getType : ()Ljava/lang/Class;
    //   2101: aastore
    //   2102: iload #10
    //   2104: istore_3
    //   2105: aload #29
    //   2107: aload #28
    //   2109: invokevirtual objectFieldOffset : (Ljava/lang/reflect/Field;)J
    //   2112: l2i
    //   2113: istore #19
    //   2115: ldc 1048575
    //   2117: istore #11
    //   2119: iload #18
    //   2121: sipush #4096
    //   2124: iand
    //   2125: ifeq -> 2317
    //   2128: iload #22
    //   2130: bipush #17
    //   2132: if_icmpgt -> 2317
    //   2135: iload #9
    //   2137: iconst_1
    //   2138: iadd
    //   2139: istore #11
    //   2141: aload #26
    //   2143: iload #9
    //   2145: invokevirtual charAt : (I)C
    //   2148: istore #10
    //   2150: iload #10
    //   2152: ldc 55296
    //   2154: if_icmplt -> 2236
    //   2157: iload #10
    //   2159: sipush #8191
    //   2162: iand
    //   2163: istore #9
    //   2165: bipush #13
    //   2167: istore #10
    //   2169: iload #11
    //   2171: istore #12
    //   2173: iload #9
    //   2175: istore #11
    //   2177: iload #12
    //   2179: iconst_1
    //   2180: iadd
    //   2181: istore #9
    //   2183: aload #26
    //   2185: iload #12
    //   2187: invokevirtual charAt : (I)C
    //   2190: istore #12
    //   2192: iload #12
    //   2194: ldc 55296
    //   2196: if_icmplt -> 2223
    //   2199: iload #11
    //   2201: iload #12
    //   2203: sipush #8191
    //   2206: iand
    //   2207: iload #10
    //   2209: ishl
    //   2210: ior
    //   2211: istore #11
    //   2213: iinc #10, 13
    //   2216: iload #9
    //   2218: istore #12
    //   2220: goto -> 2177
    //   2223: iload #11
    //   2225: iload #12
    //   2227: iload #10
    //   2229: ishl
    //   2230: ior
    //   2231: istore #10
    //   2233: goto -> 2240
    //   2236: iload #11
    //   2238: istore #9
    //   2240: iload #10
    //   2242: bipush #32
    //   2244: idiv
    //   2245: iload #15
    //   2247: iload #15
    //   2249: iadd
    //   2250: iadd
    //   2251: istore #11
    //   2253: aload #25
    //   2255: iload #11
    //   2257: aaload
    //   2258: astore #28
    //   2260: aload #28
    //   2262: instanceof java/lang/reflect/Field
    //   2265: ifeq -> 2278
    //   2268: aload #28
    //   2270: checkcast java/lang/reflect/Field
    //   2273: astore #28
    //   2275: goto -> 2297
    //   2278: aload #27
    //   2280: aload #28
    //   2282: checkcast java/lang/String
    //   2285: invokestatic E : (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   2288: astore #28
    //   2290: aload #25
    //   2292: iload #11
    //   2294: aload #28
    //   2296: aastore
    //   2297: aload #29
    //   2299: aload #28
    //   2301: invokevirtual objectFieldOffset : (Ljava/lang/reflect/Field;)J
    //   2304: l2i
    //   2305: istore #11
    //   2307: iload #10
    //   2309: bipush #32
    //   2311: irem
    //   2312: istore #12
    //   2314: goto -> 2320
    //   2317: iconst_0
    //   2318: istore #12
    //   2320: iload #6
    //   2322: istore #10
    //   2324: iload #22
    //   2326: bipush #18
    //   2328: if_icmplt -> 2355
    //   2331: iload #6
    //   2333: istore #10
    //   2335: iload #22
    //   2337: bipush #49
    //   2339: if_icmpgt -> 2355
    //   2342: aload #23
    //   2344: iload #6
    //   2346: iload #19
    //   2348: iastore
    //   2349: iload #6
    //   2351: iconst_1
    //   2352: iadd
    //   2353: istore #10
    //   2355: iload #10
    //   2357: istore #6
    //   2359: iload #4
    //   2361: istore #10
    //   2363: iload #9
    //   2365: istore #4
    //   2367: goto -> 1831
    //   2370: aload #30
    //   2372: iload #21
    //   2374: iload #16
    //   2376: iastore
    //   2377: iload #18
    //   2379: sipush #512
    //   2382: iand
    //   2383: ifeq -> 2393
    //   2386: ldc 536870912
    //   2388: istore #9
    //   2390: goto -> 2396
    //   2393: iconst_0
    //   2394: istore #9
    //   2396: iload #18
    //   2398: sipush #256
    //   2401: iand
    //   2402: ifeq -> 2412
    //   2405: ldc 268435456
    //   2407: istore #16
    //   2409: goto -> 2415
    //   2412: iconst_0
    //   2413: istore #16
    //   2415: iload #10
    //   2417: ifeq -> 2427
    //   2420: ldc -2147483648
    //   2422: istore #10
    //   2424: goto -> 2430
    //   2427: iconst_0
    //   2428: istore #10
    //   2430: aload #30
    //   2432: iload #21
    //   2434: iconst_1
    //   2435: iadd
    //   2436: iload #9
    //   2438: iload #16
    //   2440: ior
    //   2441: iload #10
    //   2443: ior
    //   2444: iload #22
    //   2446: bipush #20
    //   2448: ishl
    //   2449: ior
    //   2450: iload #19
    //   2452: ior
    //   2453: iastore
    //   2454: iload #21
    //   2456: iconst_3
    //   2457: iadd
    //   2458: istore #16
    //   2460: aload #30
    //   2462: iload #21
    //   2464: iconst_2
    //   2465: iadd
    //   2466: iload #12
    //   2468: bipush #20
    //   2470: ishl
    //   2471: iload #11
    //   2473: ior
    //   2474: iastore
    //   2475: iload #4
    //   2477: istore #9
    //   2479: iload #7
    //   2481: istore #4
    //   2483: iload #9
    //   2485: istore #7
    //   2487: iload #17
    //   2489: istore #10
    //   2491: iload #16
    //   2493: istore #9
    //   2495: goto -> 1199
    //   2498: new xl2
    //   2501: dup
    //   2502: aload #30
    //   2504: aload #24
    //   2506: iload #14
    //   2508: iload #13
    //   2510: aload_0
    //   2511: getfield a : Lyj2;
    //   2514: aload #23
    //   2516: iload #5
    //   2518: iload #20
    //   2520: aload_1
    //   2521: aload_2
    //   2522: invokespecial <init> : ([I[Ljava/lang/Object;IILyj2;[IIILbg2;Lbg2;)V
    //   2525: areturn
    //   2526: invokestatic b : ()V
    //   2529: aconst_null
    //   2530: areturn
  }
  
  public static int v(long paramLong, Object paramObject) {
    return ((Integer)wm2.h(paramLong, paramObject)).intValue();
  }
  
  public static int x(int paramInt) {
    return paramInt >>> 20 & 0xFF;
  }
  
  public static long z(long paramLong, Object paramObject) {
    return ((Long)wm2.h(paramLong, paramObject)).longValue();
  }
  
  public final xj2 A(int paramInt) {
    paramInt /= 3;
    return (xj2)this.b[paramInt + paramInt + 1];
  }
  
  public final em2 B(int paramInt) {
    paramInt /= 3;
    paramInt += paramInt;
    Object[] arrayOfObject = this.b;
    em2 em21 = (em2)arrayOfObject[paramInt];
    if (em21 != null)
      return em21; 
    em21 = bm2.c.a((Class)arrayOfObject[paramInt + 1]);
    arrayOfObject[paramInt] = em21;
    return em21;
  }
  
  public final Object C(int paramInt, Object paramObject) {
    em2 em21 = B(paramInt);
    int i = y(paramInt);
    if (!p(paramInt, paramObject))
      return em21.f(); 
    long l = (i & 0xFFFFF);
    Object object = k.getObject(paramObject, l);
    if (r(object))
      return object; 
    paramObject = em21.f();
    if (object != null)
      em21.c(paramObject, object); 
    return paramObject;
  }
  
  public final Object D(int paramInt1, int paramInt2, Object paramObject) {
    em2 em21 = B(paramInt2);
    if (!s(paramInt1, paramInt2, paramObject))
      return em21.f(); 
    Object object = k.getObject(paramObject, (y(paramInt2) & 0xFFFFF));
    if (r(object))
      return object; 
    paramObject = em21.f();
    if (object != null)
      em21.c(paramObject, object); 
    return paramObject;
  }
  
  public final void a(Object paramObject) {
    if (r(paramObject)) {
      if (paramObject instanceof wk2) {
        wk2 wk2 = (wk2)paramObject;
        wk2.g();
        wk2.zza = 0;
        wk2.e();
      } 
      byte b = 0;
      while (true) {
        int[] arrayOfInt = this.a;
        if (b < arrayOfInt.length) {
          int i = y(b);
          int j = x(i);
          long l = (0xFFFFF & i);
          if (j != 9) {
            zj2 zj2;
            if (j != 60 && j != 68) {
              Unsafe unsafe;
              Object object;
              switch (j) {
                case 50:
                  unsafe = k;
                  object = unsafe.getObject(paramObject, l);
                  if (object != null) {
                    ((sl2)object).b = false;
                    unsafe.putObject(paramObject, l, object);
                  } 
                  break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                  zj2 = (zj2)wm2.h(l, paramObject);
                  if (zj2.b)
                    zj2.b = false; 
                  break;
                case 17:
                  if (p(b, paramObject))
                    B(b).a(k.getObject(paramObject, l)); 
                  break;
              } 
            } else if (s(zj2[b], b, paramObject)) {
              B(b).a(k.getObject(paramObject, l));
            } 
            b += 3;
            continue;
          } 
        } 
        this.i.getClass();
        paramObject = ((wk2)paramObject).zzc;
        if (((nm2)paramObject).e)
          ((nm2)paramObject).e = false; 
        break;
      } 
    } 
  }
  
  public final void b(Object paramObject, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, bk2 parambk2) {
    t(paramObject, paramArrayOfbyte, paramInt1, paramInt2, 0, parambk2);
  }
  
  public final void c(Object paramObject1, Object paramObject2) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic r : (Ljava/lang/Object;)Z
    //   4: ifeq -> 1212
    //   7: aload_2
    //   8: invokevirtual getClass : ()Ljava/lang/Class;
    //   11: pop
    //   12: iconst_0
    //   13: istore #5
    //   15: aload_1
    //   16: astore #11
    //   18: aload_0
    //   19: getfield a : [I
    //   22: astore_1
    //   23: iload #5
    //   25: aload_1
    //   26: arraylength
    //   27: if_icmpge -> 1205
    //   30: aload_0
    //   31: iload #5
    //   33: invokevirtual y : (I)I
    //   36: istore #8
    //   38: iload #8
    //   40: invokestatic x : (I)I
    //   43: istore #6
    //   45: aload_1
    //   46: iload #5
    //   48: iaload
    //   49: istore #7
    //   51: iload #8
    //   53: ldc 1048575
    //   55: iand
    //   56: i2l
    //   57: lstore #9
    //   59: iload #6
    //   61: tableswitch default -> 352, 0 -> 1160, 1 -> 1120, 2 -> 1086, 3 -> 1052, 4 -> 1018, 5 -> 984, 6 -> 950, 7 -> 910, 8 -> 876, 9 -> 864, 10 -> 830, 11 -> 796, 12 -> 762, 13 -> 728, 14 -> 694, 15 -> 660, 16 -> 626, 17 -> 614, 18 -> 499, 19 -> 499, 20 -> 499, 21 -> 499, 22 -> 499, 23 -> 499, 24 -> 499, 25 -> 499, 26 -> 499, 27 -> 499, 28 -> 499, 29 -> 499, 30 -> 499, 31 -> 499, 32 -> 499, 33 -> 499, 34 -> 499, 35 -> 499, 36 -> 499, 37 -> 499, 38 -> 499, 39 -> 499, 40 -> 499, 41 -> 499, 42 -> 499, 43 -> 499, 44 -> 499, 45 -> 499, 46 -> 499, 47 -> 499, 48 -> 499, 49 -> 499, 50 -> 469, 51 -> 424, 52 -> 424, 53 -> 424, 54 -> 424, 55 -> 424, 56 -> 424, 57 -> 424, 58 -> 424, 59 -> 424, 60 -> 412, 61 -> 367, 62 -> 367, 63 -> 367, 64 -> 367, 65 -> 367, 66 -> 367, 67 -> 367, 68 -> 355
    //   352: goto -> 1199
    //   355: aload_0
    //   356: iload #5
    //   358: aload #11
    //   360: aload_2
    //   361: invokevirtual k : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   364: goto -> 352
    //   367: aload_0
    //   368: iload #7
    //   370: iload #5
    //   372: aload_2
    //   373: invokevirtual s : (IILjava/lang/Object;)Z
    //   376: ifeq -> 352
    //   379: lload #9
    //   381: aload #11
    //   383: lload #9
    //   385: aload_2
    //   386: invokestatic h : (JLjava/lang/Object;)Ljava/lang/Object;
    //   389: invokestatic l : (JLjava/lang/Object;Ljava/lang/Object;)V
    //   392: aload #11
    //   394: aload_1
    //   395: iload #5
    //   397: iconst_2
    //   398: iadd
    //   399: iaload
    //   400: ldc 1048575
    //   402: iand
    //   403: i2l
    //   404: iload #7
    //   406: invokestatic j : (Ljava/lang/Object;JI)V
    //   409: goto -> 352
    //   412: aload_0
    //   413: iload #5
    //   415: aload #11
    //   417: aload_2
    //   418: invokevirtual k : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   421: goto -> 352
    //   424: aload_0
    //   425: iload #7
    //   427: iload #5
    //   429: aload_2
    //   430: invokevirtual s : (IILjava/lang/Object;)Z
    //   433: ifeq -> 352
    //   436: lload #9
    //   438: aload #11
    //   440: lload #9
    //   442: aload_2
    //   443: invokestatic h : (JLjava/lang/Object;)Ljava/lang/Object;
    //   446: invokestatic l : (JLjava/lang/Object;Ljava/lang/Object;)V
    //   449: aload #11
    //   451: aload_1
    //   452: iload #5
    //   454: iconst_2
    //   455: iadd
    //   456: iaload
    //   457: ldc 1048575
    //   459: iand
    //   460: i2l
    //   461: iload #7
    //   463: invokestatic j : (Ljava/lang/Object;JI)V
    //   466: goto -> 352
    //   469: getstatic fm2.a : Lbg2;
    //   472: astore_1
    //   473: lload #9
    //   475: aload #11
    //   477: lload #9
    //   479: aload #11
    //   481: invokestatic h : (JLjava/lang/Object;)Ljava/lang/Object;
    //   484: lload #9
    //   486: aload_2
    //   487: invokestatic h : (JLjava/lang/Object;)Ljava/lang/Object;
    //   490: invokestatic f : (Ljava/lang/Object;Ljava/lang/Object;)Lsl2;
    //   493: invokestatic l : (JLjava/lang/Object;Ljava/lang/Object;)V
    //   496: goto -> 352
    //   499: lload #9
    //   501: aload #11
    //   503: invokestatic h : (JLjava/lang/Object;)Ljava/lang/Object;
    //   506: checkcast bl2
    //   509: astore #12
    //   511: lload #9
    //   513: aload_2
    //   514: invokestatic h : (JLjava/lang/Object;)Ljava/lang/Object;
    //   517: checkcast bl2
    //   520: astore #13
    //   522: aload #12
    //   524: invokeinterface size : ()I
    //   529: istore #6
    //   531: aload #13
    //   533: invokeinterface size : ()I
    //   538: istore #7
    //   540: aload #12
    //   542: astore_1
    //   543: iload #6
    //   545: ifle -> 592
    //   548: aload #12
    //   550: astore_1
    //   551: iload #7
    //   553: ifle -> 592
    //   556: aload #12
    //   558: astore_1
    //   559: aload #12
    //   561: checkcast zj2
    //   564: getfield b : Z
    //   567: ifne -> 583
    //   570: aload #12
    //   572: iload #7
    //   574: iload #6
    //   576: iadd
    //   577: invokeinterface a : (I)Lbl2;
    //   582: astore_1
    //   583: aload_1
    //   584: aload #13
    //   586: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   591: pop
    //   592: iload #6
    //   594: ifgt -> 603
    //   597: aload #13
    //   599: astore_1
    //   600: goto -> 603
    //   603: lload #9
    //   605: aload #11
    //   607: aload_1
    //   608: invokestatic l : (JLjava/lang/Object;Ljava/lang/Object;)V
    //   611: goto -> 352
    //   614: aload_0
    //   615: iload #5
    //   617: aload #11
    //   619: aload_2
    //   620: invokevirtual j : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   623: goto -> 352
    //   626: aload_0
    //   627: iload #5
    //   629: aload_2
    //   630: invokevirtual p : (ILjava/lang/Object;)Z
    //   633: ifeq -> 352
    //   636: aload #11
    //   638: lload #9
    //   640: lload #9
    //   642: aload_2
    //   643: invokestatic f : (JLjava/lang/Object;)J
    //   646: invokestatic k : (Ljava/lang/Object;JJ)V
    //   649: aload_0
    //   650: iload #5
    //   652: aload #11
    //   654: invokevirtual l : (ILjava/lang/Object;)V
    //   657: goto -> 352
    //   660: aload_0
    //   661: iload #5
    //   663: aload_2
    //   664: invokevirtual p : (ILjava/lang/Object;)Z
    //   667: ifeq -> 352
    //   670: aload #11
    //   672: lload #9
    //   674: lload #9
    //   676: aload_2
    //   677: invokestatic e : (JLjava/lang/Object;)I
    //   680: invokestatic j : (Ljava/lang/Object;JI)V
    //   683: aload_0
    //   684: iload #5
    //   686: aload #11
    //   688: invokevirtual l : (ILjava/lang/Object;)V
    //   691: goto -> 352
    //   694: aload_0
    //   695: iload #5
    //   697: aload_2
    //   698: invokevirtual p : (ILjava/lang/Object;)Z
    //   701: ifeq -> 352
    //   704: aload #11
    //   706: lload #9
    //   708: lload #9
    //   710: aload_2
    //   711: invokestatic f : (JLjava/lang/Object;)J
    //   714: invokestatic k : (Ljava/lang/Object;JJ)V
    //   717: aload_0
    //   718: iload #5
    //   720: aload #11
    //   722: invokevirtual l : (ILjava/lang/Object;)V
    //   725: goto -> 352
    //   728: aload_0
    //   729: iload #5
    //   731: aload_2
    //   732: invokevirtual p : (ILjava/lang/Object;)Z
    //   735: ifeq -> 352
    //   738: aload #11
    //   740: lload #9
    //   742: lload #9
    //   744: aload_2
    //   745: invokestatic e : (JLjava/lang/Object;)I
    //   748: invokestatic j : (Ljava/lang/Object;JI)V
    //   751: aload_0
    //   752: iload #5
    //   754: aload #11
    //   756: invokevirtual l : (ILjava/lang/Object;)V
    //   759: goto -> 352
    //   762: aload_0
    //   763: iload #5
    //   765: aload_2
    //   766: invokevirtual p : (ILjava/lang/Object;)Z
    //   769: ifeq -> 352
    //   772: aload #11
    //   774: lload #9
    //   776: lload #9
    //   778: aload_2
    //   779: invokestatic e : (JLjava/lang/Object;)I
    //   782: invokestatic j : (Ljava/lang/Object;JI)V
    //   785: aload_0
    //   786: iload #5
    //   788: aload #11
    //   790: invokevirtual l : (ILjava/lang/Object;)V
    //   793: goto -> 352
    //   796: aload_0
    //   797: iload #5
    //   799: aload_2
    //   800: invokevirtual p : (ILjava/lang/Object;)Z
    //   803: ifeq -> 352
    //   806: aload #11
    //   808: lload #9
    //   810: lload #9
    //   812: aload_2
    //   813: invokestatic e : (JLjava/lang/Object;)I
    //   816: invokestatic j : (Ljava/lang/Object;JI)V
    //   819: aload_0
    //   820: iload #5
    //   822: aload #11
    //   824: invokevirtual l : (ILjava/lang/Object;)V
    //   827: goto -> 352
    //   830: aload_0
    //   831: iload #5
    //   833: aload_2
    //   834: invokevirtual p : (ILjava/lang/Object;)Z
    //   837: ifeq -> 352
    //   840: lload #9
    //   842: aload #11
    //   844: lload #9
    //   846: aload_2
    //   847: invokestatic h : (JLjava/lang/Object;)Ljava/lang/Object;
    //   850: invokestatic l : (JLjava/lang/Object;Ljava/lang/Object;)V
    //   853: aload_0
    //   854: iload #5
    //   856: aload #11
    //   858: invokevirtual l : (ILjava/lang/Object;)V
    //   861: goto -> 352
    //   864: aload_0
    //   865: iload #5
    //   867: aload #11
    //   869: aload_2
    //   870: invokevirtual j : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   873: goto -> 352
    //   876: aload_0
    //   877: iload #5
    //   879: aload_2
    //   880: invokevirtual p : (ILjava/lang/Object;)Z
    //   883: ifeq -> 352
    //   886: lload #9
    //   888: aload #11
    //   890: lload #9
    //   892: aload_2
    //   893: invokestatic h : (JLjava/lang/Object;)Ljava/lang/Object;
    //   896: invokestatic l : (JLjava/lang/Object;Ljava/lang/Object;)V
    //   899: aload_0
    //   900: iload #5
    //   902: aload #11
    //   904: invokevirtual l : (ILjava/lang/Object;)V
    //   907: goto -> 352
    //   910: aload_0
    //   911: iload #5
    //   913: aload_2
    //   914: invokevirtual p : (ILjava/lang/Object;)Z
    //   917: ifeq -> 352
    //   920: getstatic wm2.c : Loc2;
    //   923: astore_1
    //   924: aload_1
    //   925: lload #9
    //   927: aload #11
    //   929: aload_1
    //   930: lload #9
    //   932: aload_2
    //   933: invokevirtual m : (JLjava/lang/Object;)Z
    //   936: invokevirtual e : (JLjava/lang/Object;Z)V
    //   939: aload_0
    //   940: iload #5
    //   942: aload #11
    //   944: invokevirtual l : (ILjava/lang/Object;)V
    //   947: goto -> 352
    //   950: aload_0
    //   951: iload #5
    //   953: aload_2
    //   954: invokevirtual p : (ILjava/lang/Object;)Z
    //   957: ifeq -> 352
    //   960: aload #11
    //   962: lload #9
    //   964: lload #9
    //   966: aload_2
    //   967: invokestatic e : (JLjava/lang/Object;)I
    //   970: invokestatic j : (Ljava/lang/Object;JI)V
    //   973: aload_0
    //   974: iload #5
    //   976: aload #11
    //   978: invokevirtual l : (ILjava/lang/Object;)V
    //   981: goto -> 352
    //   984: aload_0
    //   985: iload #5
    //   987: aload_2
    //   988: invokevirtual p : (ILjava/lang/Object;)Z
    //   991: ifeq -> 352
    //   994: aload #11
    //   996: lload #9
    //   998: lload #9
    //   1000: aload_2
    //   1001: invokestatic f : (JLjava/lang/Object;)J
    //   1004: invokestatic k : (Ljava/lang/Object;JJ)V
    //   1007: aload_0
    //   1008: iload #5
    //   1010: aload #11
    //   1012: invokevirtual l : (ILjava/lang/Object;)V
    //   1015: goto -> 352
    //   1018: aload_0
    //   1019: iload #5
    //   1021: aload_2
    //   1022: invokevirtual p : (ILjava/lang/Object;)Z
    //   1025: ifeq -> 352
    //   1028: aload #11
    //   1030: lload #9
    //   1032: lload #9
    //   1034: aload_2
    //   1035: invokestatic e : (JLjava/lang/Object;)I
    //   1038: invokestatic j : (Ljava/lang/Object;JI)V
    //   1041: aload_0
    //   1042: iload #5
    //   1044: aload #11
    //   1046: invokevirtual l : (ILjava/lang/Object;)V
    //   1049: goto -> 352
    //   1052: aload_0
    //   1053: iload #5
    //   1055: aload_2
    //   1056: invokevirtual p : (ILjava/lang/Object;)Z
    //   1059: ifeq -> 352
    //   1062: aload #11
    //   1064: lload #9
    //   1066: lload #9
    //   1068: aload_2
    //   1069: invokestatic f : (JLjava/lang/Object;)J
    //   1072: invokestatic k : (Ljava/lang/Object;JJ)V
    //   1075: aload_0
    //   1076: iload #5
    //   1078: aload #11
    //   1080: invokevirtual l : (ILjava/lang/Object;)V
    //   1083: goto -> 352
    //   1086: aload_0
    //   1087: iload #5
    //   1089: aload_2
    //   1090: invokevirtual p : (ILjava/lang/Object;)Z
    //   1093: ifeq -> 352
    //   1096: aload #11
    //   1098: lload #9
    //   1100: lload #9
    //   1102: aload_2
    //   1103: invokestatic f : (JLjava/lang/Object;)J
    //   1106: invokestatic k : (Ljava/lang/Object;JJ)V
    //   1109: aload_0
    //   1110: iload #5
    //   1112: aload #11
    //   1114: invokevirtual l : (ILjava/lang/Object;)V
    //   1117: goto -> 352
    //   1120: aload_0
    //   1121: iload #5
    //   1123: aload_2
    //   1124: invokevirtual p : (ILjava/lang/Object;)Z
    //   1127: ifeq -> 352
    //   1130: getstatic wm2.c : Loc2;
    //   1133: astore_1
    //   1134: aload_1
    //   1135: aload #11
    //   1137: lload #9
    //   1139: aload_1
    //   1140: lload #9
    //   1142: aload_2
    //   1143: invokevirtual c : (JLjava/lang/Object;)F
    //   1146: invokevirtual k : (Ljava/lang/Object;JF)V
    //   1149: aload_0
    //   1150: iload #5
    //   1152: aload #11
    //   1154: invokevirtual l : (ILjava/lang/Object;)V
    //   1157: goto -> 352
    //   1160: aload_0
    //   1161: iload #5
    //   1163: aload_2
    //   1164: invokevirtual p : (ILjava/lang/Object;)Z
    //   1167: ifeq -> 352
    //   1170: getstatic wm2.c : Loc2;
    //   1173: astore_1
    //   1174: aload_1
    //   1175: lload #9
    //   1177: aload_2
    //   1178: invokevirtual a : (JLjava/lang/Object;)D
    //   1181: dstore_3
    //   1182: aload_1
    //   1183: aload #11
    //   1185: lload #9
    //   1187: dload_3
    //   1188: invokevirtual h : (Ljava/lang/Object;JD)V
    //   1191: aload_0
    //   1192: iload #5
    //   1194: aload #11
    //   1196: invokevirtual l : (ILjava/lang/Object;)V
    //   1199: iinc #5, 3
    //   1202: goto -> 18
    //   1205: aload #11
    //   1207: aload_2
    //   1208: invokestatic p : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   1211: return
    //   1212: ldc_w 'Mutating immutable message: '
    //   1215: aload_1
    //   1216: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1219: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   1222: invokestatic l : (Ljava/lang/String;)V
    //   1225: return
  }
  
  public final boolean d(wk2 paramwk21, wk2 paramwk22) {
    byte b = 0;
    while (true) {
      int[] arrayOfInt = this.a;
      if (b < arrayOfInt.length) {
        boolean bool;
        long l2;
        int j = y(b);
        int i = x(j);
        long l1 = (j & 0xFFFFF);
        switch (i) {
          case 51:
          case 52:
          case 53:
          case 54:
          case 55:
          case 56:
          case 57:
          case 58:
          case 59:
          case 60:
          case 61:
          case 62:
          case 63:
          case 64:
          case 65:
          case 66:
          case 67:
          case 68:
            l2 = (arrayOfInt[b + 2] & 0xFFFFF);
            if (wm2.e(l2, paramwk21) != wm2.e(l2, paramwk22) || !fm2.f(wm2.h(l1, paramwk21), wm2.h(l1, paramwk22)))
              break; 
            break;
          case 50:
            bool = fm2.f(wm2.h(l1, paramwk21), wm2.h(l1, paramwk22));
            if (!bool)
              break; 
            break;
          case 18:
          case 19:
          case 20:
          case 21:
          case 22:
          case 23:
          case 24:
          case 25:
          case 26:
          case 27:
          case 28:
          case 29:
          case 30:
          case 31:
          case 32:
          case 33:
          case 34:
          case 35:
          case 36:
          case 37:
          case 38:
          case 39:
          case 40:
          case 41:
          case 42:
          case 43:
          case 44:
          case 45:
          case 46:
          case 47:
          case 48:
          case 49:
            bool = fm2.f(wm2.h(l1, paramwk21), wm2.h(l1, paramwk22));
            if (!bool)
              break; 
            break;
          case 17:
            if (o(paramwk21, paramwk22, b) && fm2.f(wm2.h(l1, paramwk21), wm2.h(l1, paramwk22)))
              break; 
            break;
          case 16:
            if (o(paramwk21, paramwk22, b) && wm2.f(l1, paramwk21) == wm2.f(l1, paramwk22))
              break; 
            break;
          case 15:
            if (o(paramwk21, paramwk22, b) && wm2.e(l1, paramwk21) == wm2.e(l1, paramwk22))
              break; 
            break;
          case 14:
            if (o(paramwk21, paramwk22, b) && wm2.f(l1, paramwk21) == wm2.f(l1, paramwk22))
              break; 
            break;
          case 13:
            if (o(paramwk21, paramwk22, b) && wm2.e(l1, paramwk21) == wm2.e(l1, paramwk22))
              break; 
            break;
          case 12:
            if (o(paramwk21, paramwk22, b) && wm2.e(l1, paramwk21) == wm2.e(l1, paramwk22))
              break; 
            break;
          case 11:
            if (o(paramwk21, paramwk22, b) && wm2.e(l1, paramwk21) == wm2.e(l1, paramwk22))
              break; 
            break;
          case 10:
            if (o(paramwk21, paramwk22, b) && fm2.f(wm2.h(l1, paramwk21), wm2.h(l1, paramwk22)))
              break; 
            break;
          case 9:
            if (o(paramwk21, paramwk22, b) && fm2.f(wm2.h(l1, paramwk21), wm2.h(l1, paramwk22)))
              break; 
            break;
          case 8:
            if (o(paramwk21, paramwk22, b) && fm2.f(wm2.h(l1, paramwk21), wm2.h(l1, paramwk22)))
              break; 
            break;
          case 7:
            if (o(paramwk21, paramwk22, b)) {
              oc2 oc2 = wm2.c;
              if (oc2.m(l1, paramwk21) == oc2.m(l1, paramwk22))
                break; 
            } 
            break;
          case 6:
            if (o(paramwk21, paramwk22, b) && wm2.e(l1, paramwk21) == wm2.e(l1, paramwk22))
              break; 
            break;
          case 5:
            if (o(paramwk21, paramwk22, b) && wm2.f(l1, paramwk21) == wm2.f(l1, paramwk22))
              break; 
            break;
          case 4:
            if (o(paramwk21, paramwk22, b) && wm2.e(l1, paramwk21) == wm2.e(l1, paramwk22))
              break; 
            break;
          case 3:
            if (o(paramwk21, paramwk22, b) && wm2.f(l1, paramwk21) == wm2.f(l1, paramwk22))
              break; 
            break;
          case 2:
            if (o(paramwk21, paramwk22, b) && wm2.f(l1, paramwk21) == wm2.f(l1, paramwk22))
              break; 
            break;
          case 1:
            if (o(paramwk21, paramwk22, b)) {
              oc2 oc2 = wm2.c;
              if (Float.floatToIntBits(oc2.c(l1, paramwk21)) == Float.floatToIntBits(oc2.c(l1, paramwk22)))
                break; 
            } 
            break;
          case 0:
            if (o(paramwk21, paramwk22, b)) {
              oc2 oc2 = wm2.c;
              if (Double.doubleToLongBits(oc2.a(l1, paramwk21)) == Double.doubleToLongBits(oc2.a(l1, paramwk22)))
                break; 
            } 
            break;
        } 
        b += 3;
        continue;
      } 
      if (!paramwk21.zzc.equals(paramwk22.zzc))
        break; 
      return true;
    } 
    return false;
  }
  
  public final int e(wk2 paramwk2) {
    Object object;
    byte b = 0;
    boolean bool = false;
    while (true) {
      int i;
      int[] arrayOfInt = this.a;
      if (b < arrayOfInt.length) {
        Object object1;
        int j;
        boolean bool1;
        Object object2;
        int k = y(b);
        int n = x(k);
        int m = arrayOfInt[b];
        long l = (0xFFFFF & k);
        char c = 'ӕ';
        k = 37;
        switch (n) {
          default:
            object1 = object;
            break;
          case 68:
            object1 = object;
            if (s(m, b, paramwk2)) {
              j = object * 53;
              i = wm2.h(l, paramwk2).hashCode();
            } else {
              break;
            } 
            j = i + j;
            break;
          case 67:
            j = i;
            if (s(m, b, paramwk2)) {
              j = i * 53;
              l = z(l, paramwk2);
              Charset charset = il2.a;
            } else {
              break;
            } 
            j += (int)(l ^ l >>> 32L);
            break;
          case 66:
            j = i;
            if (s(m, b, paramwk2)) {
              j = i * 53;
              i = v(l, paramwk2);
            } else {
              break;
            } 
            j = i + j;
            break;
          case 65:
            j = i;
            if (s(m, b, paramwk2)) {
              j = i * 53;
              l = z(l, paramwk2);
              Charset charset = il2.a;
            } else {
              break;
            } 
            j += (int)(l ^ l >>> 32L);
            break;
          case 64:
            j = i;
            if (s(m, b, paramwk2)) {
              j = i * 53;
              i = v(l, paramwk2);
            } else {
              break;
            } 
            j = i + j;
            break;
          case 63:
            j = i;
            if (s(m, b, paramwk2)) {
              j = i * 53;
              i = v(l, paramwk2);
            } else {
              break;
            } 
            j = i + j;
            break;
          case 62:
            j = i;
            if (s(m, b, paramwk2)) {
              j = i * 53;
              i = v(l, paramwk2);
            } else {
              break;
            } 
            j = i + j;
            break;
          case 61:
            j = i;
            if (s(m, b, paramwk2)) {
              j = i * 53;
              i = wm2.h(l, paramwk2).hashCode();
            } else {
              break;
            } 
            j = i + j;
            break;
          case 60:
            j = i;
            if (s(m, b, paramwk2)) {
              j = i * 53;
              i = wm2.h(l, paramwk2).hashCode();
            } else {
              break;
            } 
            j = i + j;
            break;
          case 59:
            j = i;
            if (s(m, b, paramwk2)) {
              j = i * 53;
              i = ((String)wm2.h(l, paramwk2)).hashCode();
            } else {
              break;
            } 
            j = i + j;
            break;
          case 58:
            j = i;
          case 57:
            j = i;
            if (s(m, b, paramwk2)) {
              j = i * 53;
              i = v(l, paramwk2);
            } else {
              break;
            } 
            j = i + j;
            break;
          case 56:
            j = i;
            if (s(m, b, paramwk2)) {
              j = i * 53;
              l = z(l, paramwk2);
              Charset charset = il2.a;
            } else {
              break;
            } 
            j += (int)(l ^ l >>> 32L);
            break;
          case 55:
            j = i;
            if (s(m, b, paramwk2)) {
              j = i * 53;
              i = v(l, paramwk2);
            } else {
              break;
            } 
            j = i + j;
            break;
          case 54:
            j = i;
            if (s(m, b, paramwk2)) {
              j = i * 53;
              l = z(l, paramwk2);
              Charset charset = il2.a;
            } else {
              break;
            } 
            j += (int)(l ^ l >>> 32L);
            break;
          case 53:
            j = i;
            if (s(m, b, paramwk2)) {
              j = i * 53;
              l = z(l, paramwk2);
              Charset charset = il2.a;
            } else {
              break;
            } 
            j += (int)(l ^ l >>> 32L);
            break;
          case 52:
            j = i;
            if (s(m, b, paramwk2)) {
              j = i * 53;
              i = Float.floatToIntBits(((Float)wm2.h(l, paramwk2)).floatValue());
            } else {
              break;
            } 
            j = i + j;
            break;
          case 51:
            j = i;
            if (s(m, b, paramwk2)) {
              j = i * 53;
              l = Double.doubleToLongBits(((Double)wm2.h(l, paramwk2)).doubleValue());
              Charset charset = il2.a;
            } else {
              break;
            } 
            j += (int)(l ^ l >>> 32L);
            break;
          case 50:
            j = i * 53;
            i = wm2.h(l, paramwk2).hashCode();
            j = i + j;
            break;
          case 18:
          case 19:
          case 20:
          case 21:
          case 22:
          case 23:
          case 24:
          case 25:
          case 26:
          case 27:
          case 28:
          case 29:
          case 30:
          case 31:
          case 32:
          case 33:
          case 34:
          case 35:
          case 36:
          case 37:
          case 38:
          case 39:
          case 40:
          case 41:
          case 42:
          case 43:
          case 44:
          case 45:
          case 46:
          case 47:
          case 48:
          case 49:
            j = i * 53;
            i = wm2.h(l, paramwk2).hashCode();
            j = i + j;
            break;
          case 17:
            m = i * 53;
            object2 = wm2.h(l, paramwk2);
            i = m;
            if (object2 != null) {
              j = object2.hashCode();
              i = m;
            } 
            j = i + j;
            break;
          case 16:
            j = i * 53;
            l = wm2.f(l, paramwk2);
            object2 = il2.a;
            j += (int)(l ^ l >>> 32L);
            break;
          case 15:
            j = i * 53;
            i = wm2.e(l, paramwk2);
            j = i + j;
            break;
          case 14:
            j = i * 53;
            l = wm2.f(l, paramwk2);
            object2 = il2.a;
            j += (int)(l ^ l >>> 32L);
            break;
          case 13:
            j = i * 53;
            i = wm2.e(l, paramwk2);
            j = i + j;
            break;
          case 12:
            j = i * 53;
            i = wm2.e(l, paramwk2);
            j = i + j;
            break;
          case 11:
            j = i * 53;
            i = wm2.e(l, paramwk2);
            j = i + j;
            break;
          case 10:
            j = i * 53;
            i = wm2.h(l, paramwk2).hashCode();
            j = i + j;
            break;
          case 9:
            m = i * 53;
            object2 = wm2.h(l, paramwk2);
            i = m;
            if (object2 != null) {
              j = object2.hashCode();
              i = m;
            } 
            j = i + j;
            break;
          case 8:
            j = i * 53;
            i = ((String)wm2.h(l, paramwk2)).hashCode();
            j = i + j;
            break;
          case 7:
            m = i * 53;
            bool1 = wm2.c.m(l, paramwk2);
            object2 = il2.a;
            j = m;
            i = c;
          case 6:
            j = i * 53;
            i = wm2.e(l, paramwk2);
            j = i + j;
            break;
          case 5:
            j = i * 53;
            l = wm2.f(l, paramwk2);
            object2 = il2.a;
            j += (int)(l ^ l >>> 32L);
            break;
          case 4:
            j = i * 53;
            i = wm2.e(l, paramwk2);
            j = i + j;
            break;
          case 3:
            j = i * 53;
            l = wm2.f(l, paramwk2);
            object2 = il2.a;
            j += (int)(l ^ l >>> 32L);
            break;
          case 2:
            j = i * 53;
            l = wm2.f(l, paramwk2);
            object2 = il2.a;
            j += (int)(l ^ l >>> 32L);
            break;
          case 1:
            j = i * 53;
            i = Float.floatToIntBits(wm2.c.c(l, paramwk2));
            j = i + j;
            break;
          case 0:
            j = i * 53;
            l = Double.doubleToLongBits(wm2.c.a(l, paramwk2));
            object2 = il2.a;
            j += (int)(l ^ l >>> 32L);
            break;
        } 
        continue;
      } 
      return paramwk2.zzc.hashCode() + i * 53;
      b += true;
      object = SYNTHETIC_LOCAL_VARIABLE_2;
    } 
  }
  
  public final wk2 f() {
    return ((wk2)this.e).n();
  }
  
  public final int g(yj2 paramyj2) {
    // Byte code:
    //   0: getstatic xl2.k : Lsun/misc/Unsafe;
    //   3: astore #15
    //   5: ldc 1048575
    //   7: istore_3
    //   8: iconst_0
    //   9: istore #5
    //   11: iconst_0
    //   12: istore #4
    //   14: iconst_0
    //   15: istore #8
    //   17: aload_0
    //   18: getfield a : [I
    //   21: astore #16
    //   23: iload #5
    //   25: aload #16
    //   27: arraylength
    //   28: if_icmpge -> 3766
    //   31: aload_0
    //   32: iload #5
    //   34: invokevirtual y : (I)I
    //   37: istore #12
    //   39: iload #12
    //   41: invokestatic x : (I)I
    //   44: istore #11
    //   46: aload #16
    //   48: iload #5
    //   50: iaload
    //   51: istore #10
    //   53: aload #16
    //   55: iload #5
    //   57: iconst_2
    //   58: iadd
    //   59: iaload
    //   60: istore #7
    //   62: iload #7
    //   64: ldc 1048575
    //   66: iand
    //   67: istore #6
    //   69: iload #11
    //   71: bipush #17
    //   73: if_icmpgt -> 130
    //   76: iload_3
    //   77: istore_2
    //   78: iload #6
    //   80: iload_3
    //   81: if_icmpeq -> 111
    //   84: iload #6
    //   86: ldc 1048575
    //   88: if_icmpne -> 97
    //   91: iconst_0
    //   92: istore #4
    //   94: goto -> 108
    //   97: aload #15
    //   99: aload_1
    //   100: iload #6
    //   102: i2l
    //   103: invokevirtual getInt : (Ljava/lang/Object;J)I
    //   106: istore #4
    //   108: iload #6
    //   110: istore_2
    //   111: iconst_1
    //   112: iload #7
    //   114: bipush #20
    //   116: iushr
    //   117: ishl
    //   118: istore #9
    //   120: iload_2
    //   121: istore #7
    //   123: iload #4
    //   125: istore #6
    //   127: goto -> 140
    //   130: iconst_0
    //   131: istore #9
    //   133: iload #4
    //   135: istore #6
    //   137: iload_3
    //   138: istore #7
    //   140: iload #11
    //   142: getstatic rk2.c : Lrk2;
    //   145: getfield b : I
    //   148: if_icmplt -> 158
    //   151: getstatic rk2.e : Lrk2;
    //   154: invokevirtual getClass : ()Ljava/lang/Class;
    //   157: pop
    //   158: iload #12
    //   160: ldc 1048575
    //   162: iand
    //   163: i2l
    //   164: lstore #13
    //   166: iload #11
    //   168: tableswitch default -> 460, 0 -> 3728, 1 -> 3706, 2 -> 3660, 3 -> 3614, 4 -> 3567, 5 -> 3545, 6 -> 3523, 7 -> 3490, 8 -> 3406, 9 -> 3338, 10 -> 3280, 11 -> 3241, 12 -> 3194, 13 -> 3161, 14 -> 3127, 15 -> 3071, 16 -> 3012, 17 -> 2944, 18 -> 2924, 19 -> 2904, 20 -> 2844, 21 -> 2793, 22 -> 2742, 23 -> 2722, 24 -> 2702, 25 -> 2647, 26 -> 2533, 27 -> 2423, 28 -> 2334, 29 -> 2283, 30 -> 2232, 31 -> 2212, 32 -> 2192, 33 -> 2141, 34 -> 2076, 35 -> 2023, 36 -> 1971, 37 -> 1932, 38 -> 1893, 39 -> 1854, 40 -> 1801, 41 -> 1749, 42 -> 1699, 43 -> 1660, 44 -> 1621, 45 -> 1569, 46 -> 1516, 47 -> 1477, 48 -> 1430, 49 -> 1318, 50 -> 1207, 51 -> 1189, 52 -> 1171, 53 -> 1131, 54 -> 1091, 55 -> 1050, 56 -> 1032, 57 -> 1014, 58 -> 985, 59 -> 905, 60 -> 832, 61 -> 778, 62 -> 745, 63 -> 704, 64 -> 675, 65 -> 645, 66 -> 595, 67 -> 539, 68 -> 466
    //   460: iload #8
    //   462: istore_2
    //   463: goto -> 3750
    //   466: iload #8
    //   468: istore_2
    //   469: aload_0
    //   470: iload #10
    //   472: iload #5
    //   474: aload_1
    //   475: invokevirtual s : (IILjava/lang/Object;)Z
    //   478: ifeq -> 3750
    //   481: aload #15
    //   483: aload_1
    //   484: lload #13
    //   486: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   489: checkcast yj2
    //   492: astore #16
    //   494: aload_0
    //   495: iload #5
    //   497: invokevirtual B : (I)Lem2;
    //   500: astore #17
    //   502: getstatic fm2.a : Lbg2;
    //   505: astore #18
    //   507: iload #10
    //   509: iconst_3
    //   510: ishl
    //   511: invokestatic n : (I)I
    //   514: istore_2
    //   515: iload_2
    //   516: iload_2
    //   517: iadd
    //   518: istore_3
    //   519: aload #16
    //   521: aload #17
    //   523: invokevirtual c : (Lem2;)I
    //   526: istore_2
    //   527: iload_2
    //   528: iload_3
    //   529: iadd
    //   530: istore_2
    //   531: iload #8
    //   533: iload_2
    //   534: iadd
    //   535: istore_2
    //   536: goto -> 3750
    //   539: iload #8
    //   541: istore_2
    //   542: aload_0
    //   543: iload #10
    //   545: iload #5
    //   547: aload_1
    //   548: invokevirtual s : (IILjava/lang/Object;)Z
    //   551: ifeq -> 3750
    //   554: lload #13
    //   556: aload_1
    //   557: invokestatic z : (JLjava/lang/Object;)J
    //   560: lstore #13
    //   562: iload #10
    //   564: iconst_3
    //   565: ishl
    //   566: invokestatic n : (I)I
    //   569: istore_2
    //   570: lload #13
    //   572: bipush #63
    //   574: lshr
    //   575: lload #13
    //   577: lload #13
    //   579: ladd
    //   580: lxor
    //   581: invokestatic o : (J)I
    //   584: istore_3
    //   585: iload #8
    //   587: iload_3
    //   588: iload_2
    //   589: iadd
    //   590: iadd
    //   591: istore_2
    //   592: goto -> 3750
    //   595: iload #8
    //   597: istore_2
    //   598: aload_0
    //   599: iload #10
    //   601: iload #5
    //   603: aload_1
    //   604: invokevirtual s : (IILjava/lang/Object;)Z
    //   607: ifeq -> 3750
    //   610: lload #13
    //   612: aload_1
    //   613: invokestatic v : (JLjava/lang/Object;)I
    //   616: istore_3
    //   617: iload #10
    //   619: iconst_3
    //   620: ishl
    //   621: invokestatic n : (I)I
    //   624: istore_2
    //   625: iload_3
    //   626: bipush #31
    //   628: ishr
    //   629: iload_3
    //   630: iload_3
    //   631: iadd
    //   632: ixor
    //   633: istore_3
    //   634: iload_3
    //   635: iload_2
    //   636: iload #8
    //   638: invokestatic f : (III)I
    //   641: istore_2
    //   642: goto -> 3750
    //   645: iload #8
    //   647: istore_2
    //   648: aload_0
    //   649: iload #10
    //   651: iload #5
    //   653: aload_1
    //   654: invokevirtual s : (IILjava/lang/Object;)Z
    //   657: ifeq -> 3750
    //   660: iload #10
    //   662: iconst_3
    //   663: ishl
    //   664: bipush #8
    //   666: iload #8
    //   668: invokestatic f : (III)I
    //   671: istore_2
    //   672: goto -> 3750
    //   675: iload #8
    //   677: istore_2
    //   678: aload_0
    //   679: iload #10
    //   681: iload #5
    //   683: aload_1
    //   684: invokevirtual s : (IILjava/lang/Object;)Z
    //   687: ifeq -> 3750
    //   690: iload #10
    //   692: iconst_3
    //   693: ishl
    //   694: iconst_4
    //   695: iload #8
    //   697: invokestatic f : (III)I
    //   700: istore_2
    //   701: goto -> 3750
    //   704: iload #8
    //   706: istore_2
    //   707: aload_0
    //   708: iload #10
    //   710: iload #5
    //   712: aload_1
    //   713: invokevirtual s : (IILjava/lang/Object;)Z
    //   716: ifeq -> 3750
    //   719: lload #13
    //   721: aload_1
    //   722: invokestatic v : (JLjava/lang/Object;)I
    //   725: i2l
    //   726: lstore #13
    //   728: iload #10
    //   730: iconst_3
    //   731: ishl
    //   732: invokestatic n : (I)I
    //   735: istore_2
    //   736: lload #13
    //   738: invokestatic o : (J)I
    //   741: istore_3
    //   742: goto -> 585
    //   745: iload #8
    //   747: istore_2
    //   748: aload_0
    //   749: iload #10
    //   751: iload #5
    //   753: aload_1
    //   754: invokevirtual s : (IILjava/lang/Object;)Z
    //   757: ifeq -> 3750
    //   760: lload #13
    //   762: aload_1
    //   763: invokestatic v : (JLjava/lang/Object;)I
    //   766: istore_3
    //   767: iload #10
    //   769: iconst_3
    //   770: ishl
    //   771: invokestatic n : (I)I
    //   774: istore_2
    //   775: goto -> 634
    //   778: iload #8
    //   780: istore_2
    //   781: aload_0
    //   782: iload #10
    //   784: iload #5
    //   786: aload_1
    //   787: invokevirtual s : (IILjava/lang/Object;)Z
    //   790: ifeq -> 3750
    //   793: aload #15
    //   795: aload_1
    //   796: lload #13
    //   798: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   801: checkcast gk2
    //   804: astore #16
    //   806: iload #10
    //   808: iconst_3
    //   809: ishl
    //   810: invokestatic n : (I)I
    //   813: istore_2
    //   814: aload #16
    //   816: invokevirtual f : ()I
    //   819: istore_3
    //   820: iload_3
    //   821: iload_3
    //   822: iload_2
    //   823: iload #8
    //   825: invokestatic g : (IIII)I
    //   828: istore_2
    //   829: goto -> 3750
    //   832: iload #8
    //   834: istore_2
    //   835: aload_0
    //   836: iload #10
    //   838: iload #5
    //   840: aload_1
    //   841: invokevirtual s : (IILjava/lang/Object;)Z
    //   844: ifeq -> 3750
    //   847: aload #15
    //   849: aload_1
    //   850: lload #13
    //   852: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   855: astore #18
    //   857: aload_0
    //   858: iload #5
    //   860: invokevirtual B : (I)Lem2;
    //   863: astore #16
    //   865: getstatic fm2.a : Lbg2;
    //   868: astore #17
    //   870: aload #18
    //   872: checkcast yj2
    //   875: astore #17
    //   877: iload #10
    //   879: iconst_3
    //   880: ishl
    //   881: invokestatic n : (I)I
    //   884: istore_3
    //   885: aload #17
    //   887: aload #16
    //   889: invokevirtual c : (Lem2;)I
    //   892: istore_2
    //   893: iload_2
    //   894: iload_2
    //   895: iload_3
    //   896: iload #8
    //   898: invokestatic g : (IIII)I
    //   901: istore_2
    //   902: goto -> 3750
    //   905: iload #8
    //   907: istore_2
    //   908: aload_0
    //   909: iload #10
    //   911: iload #5
    //   913: aload_1
    //   914: invokevirtual s : (IILjava/lang/Object;)Z
    //   917: ifeq -> 3750
    //   920: iload #10
    //   922: iconst_3
    //   923: ishl
    //   924: istore_2
    //   925: aload #15
    //   927: aload_1
    //   928: lload #13
    //   930: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   933: astore #16
    //   935: aload #16
    //   937: instanceof gk2
    //   940: ifeq -> 964
    //   943: aload #16
    //   945: checkcast gk2
    //   948: astore #16
    //   950: iload_2
    //   951: invokestatic n : (I)I
    //   954: istore_2
    //   955: aload #16
    //   957: invokevirtual f : ()I
    //   960: istore_3
    //   961: goto -> 820
    //   964: aload #16
    //   966: checkcast java/lang/String
    //   969: astore #16
    //   971: iload_2
    //   972: invokestatic n : (I)I
    //   975: istore_2
    //   976: aload #16
    //   978: invokestatic b : (Ljava/lang/String;)I
    //   981: istore_3
    //   982: goto -> 820
    //   985: iload #8
    //   987: istore_2
    //   988: aload_0
    //   989: iload #10
    //   991: iload #5
    //   993: aload_1
    //   994: invokevirtual s : (IILjava/lang/Object;)Z
    //   997: ifeq -> 3750
    //   1000: iload #10
    //   1002: iconst_3
    //   1003: ishl
    //   1004: iconst_1
    //   1005: iload #8
    //   1007: invokestatic f : (III)I
    //   1010: istore_2
    //   1011: goto -> 3750
    //   1014: iload #8
    //   1016: istore_2
    //   1017: aload_0
    //   1018: iload #10
    //   1020: iload #5
    //   1022: aload_1
    //   1023: invokevirtual s : (IILjava/lang/Object;)Z
    //   1026: ifeq -> 3750
    //   1029: goto -> 690
    //   1032: iload #8
    //   1034: istore_2
    //   1035: aload_0
    //   1036: iload #10
    //   1038: iload #5
    //   1040: aload_1
    //   1041: invokevirtual s : (IILjava/lang/Object;)Z
    //   1044: ifeq -> 3750
    //   1047: goto -> 660
    //   1050: iload #8
    //   1052: istore_2
    //   1053: aload_0
    //   1054: iload #10
    //   1056: iload #5
    //   1058: aload_1
    //   1059: invokevirtual s : (IILjava/lang/Object;)Z
    //   1062: ifeq -> 3750
    //   1065: lload #13
    //   1067: aload_1
    //   1068: invokestatic v : (JLjava/lang/Object;)I
    //   1071: i2l
    //   1072: lstore #13
    //   1074: iload #10
    //   1076: iconst_3
    //   1077: ishl
    //   1078: invokestatic n : (I)I
    //   1081: istore_2
    //   1082: lload #13
    //   1084: invokestatic o : (J)I
    //   1087: istore_3
    //   1088: goto -> 585
    //   1091: iload #8
    //   1093: istore_2
    //   1094: aload_0
    //   1095: iload #10
    //   1097: iload #5
    //   1099: aload_1
    //   1100: invokevirtual s : (IILjava/lang/Object;)Z
    //   1103: ifeq -> 3750
    //   1106: lload #13
    //   1108: aload_1
    //   1109: invokestatic z : (JLjava/lang/Object;)J
    //   1112: lstore #13
    //   1114: iload #10
    //   1116: iconst_3
    //   1117: ishl
    //   1118: invokestatic n : (I)I
    //   1121: istore_2
    //   1122: lload #13
    //   1124: invokestatic o : (J)I
    //   1127: istore_3
    //   1128: goto -> 585
    //   1131: iload #8
    //   1133: istore_2
    //   1134: aload_0
    //   1135: iload #10
    //   1137: iload #5
    //   1139: aload_1
    //   1140: invokevirtual s : (IILjava/lang/Object;)Z
    //   1143: ifeq -> 3750
    //   1146: lload #13
    //   1148: aload_1
    //   1149: invokestatic z : (JLjava/lang/Object;)J
    //   1152: lstore #13
    //   1154: iload #10
    //   1156: iconst_3
    //   1157: ishl
    //   1158: invokestatic n : (I)I
    //   1161: istore_2
    //   1162: lload #13
    //   1164: invokestatic o : (J)I
    //   1167: istore_3
    //   1168: goto -> 585
    //   1171: iload #8
    //   1173: istore_2
    //   1174: aload_0
    //   1175: iload #10
    //   1177: iload #5
    //   1179: aload_1
    //   1180: invokevirtual s : (IILjava/lang/Object;)Z
    //   1183: ifeq -> 3750
    //   1186: goto -> 690
    //   1189: iload #8
    //   1191: istore_2
    //   1192: aload_0
    //   1193: iload #10
    //   1195: iload #5
    //   1197: aload_1
    //   1198: invokevirtual s : (IILjava/lang/Object;)Z
    //   1201: ifeq -> 3750
    //   1204: goto -> 660
    //   1207: aload #15
    //   1209: aload_1
    //   1210: lload #13
    //   1212: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1215: astore #17
    //   1217: iload #5
    //   1219: iconst_3
    //   1220: idiv
    //   1221: istore_2
    //   1222: aload_0
    //   1223: getfield b : [Ljava/lang/Object;
    //   1226: iload_2
    //   1227: iload_2
    //   1228: iadd
    //   1229: aaload
    //   1230: astore #16
    //   1232: aload #17
    //   1234: checkcast sl2
    //   1237: astore #17
    //   1239: aload #16
    //   1241: ifnonnull -> 1313
    //   1244: aload #17
    //   1246: invokevirtual isEmpty : ()Z
    //   1249: ifeq -> 1258
    //   1252: iload #8
    //   1254: istore_2
    //   1255: goto -> 3750
    //   1258: aload #17
    //   1260: invokevirtual entrySet : ()Ljava/util/Set;
    //   1263: invokeinterface iterator : ()Ljava/util/Iterator;
    //   1268: astore #16
    //   1270: aload #16
    //   1272: invokeinterface hasNext : ()Z
    //   1277: ifne -> 1286
    //   1280: iload #8
    //   1282: istore_2
    //   1283: goto -> 3750
    //   1286: aload #16
    //   1288: invokeinterface next : ()Ljava/lang/Object;
    //   1293: checkcast java/util/Map$Entry
    //   1296: astore_1
    //   1297: aload_1
    //   1298: invokeinterface getKey : ()Ljava/lang/Object;
    //   1303: pop
    //   1304: aload_1
    //   1305: invokeinterface getValue : ()Ljava/lang/Object;
    //   1310: pop
    //   1311: aconst_null
    //   1312: athrow
    //   1313: invokestatic b : ()V
    //   1316: iconst_0
    //   1317: ireturn
    //   1318: aload #15
    //   1320: aload_1
    //   1321: lload #13
    //   1323: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1326: checkcast java/util/List
    //   1329: astore #17
    //   1331: aload_0
    //   1332: iload #5
    //   1334: invokevirtual B : (I)Lem2;
    //   1337: astore #16
    //   1339: getstatic fm2.a : Lbg2;
    //   1342: astore #18
    //   1344: aload #17
    //   1346: invokeinterface size : ()I
    //   1351: istore #9
    //   1353: iload #9
    //   1355: ifne -> 1364
    //   1358: iconst_0
    //   1359: istore #4
    //   1361: goto -> 1421
    //   1364: iconst_0
    //   1365: istore_3
    //   1366: iconst_0
    //   1367: istore_2
    //   1368: iload_2
    //   1369: istore #4
    //   1371: iload_3
    //   1372: iload #9
    //   1374: if_icmpge -> 1421
    //   1377: aload #17
    //   1379: iload_3
    //   1380: invokeinterface get : (I)Ljava/lang/Object;
    //   1385: checkcast yj2
    //   1388: astore #18
    //   1390: iload #10
    //   1392: iconst_3
    //   1393: ishl
    //   1394: invokestatic n : (I)I
    //   1397: istore #4
    //   1399: iload_2
    //   1400: aload #18
    //   1402: aload #16
    //   1404: invokevirtual c : (Lem2;)I
    //   1407: iload #4
    //   1409: iload #4
    //   1411: iadd
    //   1412: iadd
    //   1413: iadd
    //   1414: istore_2
    //   1415: iinc #3, 1
    //   1418: goto -> 1368
    //   1421: iload #8
    //   1423: iload #4
    //   1425: iadd
    //   1426: istore_2
    //   1427: goto -> 3750
    //   1430: aload #15
    //   1432: aload_1
    //   1433: lload #13
    //   1435: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1438: checkcast java/util/List
    //   1441: invokestatic m : (Ljava/util/List;)I
    //   1444: istore #4
    //   1446: iload #8
    //   1448: istore_2
    //   1449: iload #4
    //   1451: ifle -> 3750
    //   1454: iload #10
    //   1456: iconst_3
    //   1457: ishl
    //   1458: invokestatic n : (I)I
    //   1461: istore_3
    //   1462: iload #4
    //   1464: istore_2
    //   1465: iload_2
    //   1466: iload_3
    //   1467: iload_2
    //   1468: iload #8
    //   1470: invokestatic g : (IIII)I
    //   1473: istore_2
    //   1474: goto -> 3750
    //   1477: aload #15
    //   1479: aload_1
    //   1480: lload #13
    //   1482: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1485: checkcast java/util/List
    //   1488: invokestatic l : (Ljava/util/List;)I
    //   1491: istore_3
    //   1492: iload #8
    //   1494: istore_2
    //   1495: iload_3
    //   1496: ifle -> 3750
    //   1499: iload #10
    //   1501: iconst_3
    //   1502: ishl
    //   1503: invokestatic n : (I)I
    //   1506: istore #4
    //   1508: iload_3
    //   1509: istore_2
    //   1510: iload #4
    //   1512: istore_3
    //   1513: goto -> 1465
    //   1516: aload #15
    //   1518: aload_1
    //   1519: lload #13
    //   1521: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1524: checkcast java/util/List
    //   1527: astore #16
    //   1529: getstatic fm2.a : Lbg2;
    //   1532: astore #17
    //   1534: aload #16
    //   1536: invokeinterface size : ()I
    //   1541: bipush #8
    //   1543: imul
    //   1544: istore_3
    //   1545: iload #8
    //   1547: istore_2
    //   1548: iload_3
    //   1549: ifle -> 3750
    //   1552: iload #10
    //   1554: iconst_3
    //   1555: ishl
    //   1556: invokestatic n : (I)I
    //   1559: istore #4
    //   1561: iload_3
    //   1562: istore_2
    //   1563: iload #4
    //   1565: istore_3
    //   1566: goto -> 1465
    //   1569: aload #15
    //   1571: aload_1
    //   1572: lload #13
    //   1574: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1577: checkcast java/util/List
    //   1580: astore #17
    //   1582: getstatic fm2.a : Lbg2;
    //   1585: astore #16
    //   1587: aload #17
    //   1589: invokeinterface size : ()I
    //   1594: iconst_4
    //   1595: imul
    //   1596: istore_3
    //   1597: iload #8
    //   1599: istore_2
    //   1600: iload_3
    //   1601: ifle -> 3750
    //   1604: iload #10
    //   1606: iconst_3
    //   1607: ishl
    //   1608: invokestatic n : (I)I
    //   1611: istore #4
    //   1613: iload_3
    //   1614: istore_2
    //   1615: iload #4
    //   1617: istore_3
    //   1618: goto -> 1465
    //   1621: aload #15
    //   1623: aload_1
    //   1624: lload #13
    //   1626: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1629: checkcast java/util/List
    //   1632: invokestatic g : (Ljava/util/List;)I
    //   1635: istore_3
    //   1636: iload #8
    //   1638: istore_2
    //   1639: iload_3
    //   1640: ifle -> 3750
    //   1643: iload #10
    //   1645: iconst_3
    //   1646: ishl
    //   1647: invokestatic n : (I)I
    //   1650: istore #4
    //   1652: iload_3
    //   1653: istore_2
    //   1654: iload #4
    //   1656: istore_3
    //   1657: goto -> 1465
    //   1660: aload #15
    //   1662: aload_1
    //   1663: lload #13
    //   1665: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1668: checkcast java/util/List
    //   1671: invokestatic n : (Ljava/util/List;)I
    //   1674: istore_3
    //   1675: iload #8
    //   1677: istore_2
    //   1678: iload_3
    //   1679: ifle -> 3750
    //   1682: iload #10
    //   1684: iconst_3
    //   1685: ishl
    //   1686: invokestatic n : (I)I
    //   1689: istore #4
    //   1691: iload_3
    //   1692: istore_2
    //   1693: iload #4
    //   1695: istore_3
    //   1696: goto -> 1465
    //   1699: aload #15
    //   1701: aload_1
    //   1702: lload #13
    //   1704: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1707: checkcast java/util/List
    //   1710: astore #16
    //   1712: getstatic fm2.a : Lbg2;
    //   1715: astore #17
    //   1717: aload #16
    //   1719: invokeinterface size : ()I
    //   1724: istore_3
    //   1725: iload #8
    //   1727: istore_2
    //   1728: iload_3
    //   1729: ifle -> 3750
    //   1732: iload #10
    //   1734: iconst_3
    //   1735: ishl
    //   1736: invokestatic n : (I)I
    //   1739: istore #4
    //   1741: iload_3
    //   1742: istore_2
    //   1743: iload #4
    //   1745: istore_3
    //   1746: goto -> 1465
    //   1749: aload #15
    //   1751: aload_1
    //   1752: lload #13
    //   1754: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1757: checkcast java/util/List
    //   1760: astore #17
    //   1762: getstatic fm2.a : Lbg2;
    //   1765: astore #16
    //   1767: aload #17
    //   1769: invokeinterface size : ()I
    //   1774: iconst_4
    //   1775: imul
    //   1776: istore_3
    //   1777: iload #8
    //   1779: istore_2
    //   1780: iload_3
    //   1781: ifle -> 3750
    //   1784: iload #10
    //   1786: iconst_3
    //   1787: ishl
    //   1788: invokestatic n : (I)I
    //   1791: istore #4
    //   1793: iload_3
    //   1794: istore_2
    //   1795: iload #4
    //   1797: istore_3
    //   1798: goto -> 1465
    //   1801: aload #15
    //   1803: aload_1
    //   1804: lload #13
    //   1806: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1809: checkcast java/util/List
    //   1812: astore #16
    //   1814: getstatic fm2.a : Lbg2;
    //   1817: astore #17
    //   1819: aload #16
    //   1821: invokeinterface size : ()I
    //   1826: bipush #8
    //   1828: imul
    //   1829: istore_3
    //   1830: iload #8
    //   1832: istore_2
    //   1833: iload_3
    //   1834: ifle -> 3750
    //   1837: iload #10
    //   1839: iconst_3
    //   1840: ishl
    //   1841: invokestatic n : (I)I
    //   1844: istore #4
    //   1846: iload_3
    //   1847: istore_2
    //   1848: iload #4
    //   1850: istore_3
    //   1851: goto -> 1465
    //   1854: aload #15
    //   1856: aload_1
    //   1857: lload #13
    //   1859: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1862: checkcast java/util/List
    //   1865: invokestatic j : (Ljava/util/List;)I
    //   1868: istore_3
    //   1869: iload #8
    //   1871: istore_2
    //   1872: iload_3
    //   1873: ifle -> 3750
    //   1876: iload #10
    //   1878: iconst_3
    //   1879: ishl
    //   1880: invokestatic n : (I)I
    //   1883: istore #4
    //   1885: iload_3
    //   1886: istore_2
    //   1887: iload #4
    //   1889: istore_3
    //   1890: goto -> 1465
    //   1893: aload #15
    //   1895: aload_1
    //   1896: lload #13
    //   1898: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1901: checkcast java/util/List
    //   1904: invokestatic o : (Ljava/util/List;)I
    //   1907: istore_3
    //   1908: iload #8
    //   1910: istore_2
    //   1911: iload_3
    //   1912: ifle -> 3750
    //   1915: iload #10
    //   1917: iconst_3
    //   1918: ishl
    //   1919: invokestatic n : (I)I
    //   1922: istore #4
    //   1924: iload_3
    //   1925: istore_2
    //   1926: iload #4
    //   1928: istore_3
    //   1929: goto -> 1465
    //   1932: aload #15
    //   1934: aload_1
    //   1935: lload #13
    //   1937: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1940: checkcast java/util/List
    //   1943: invokestatic k : (Ljava/util/List;)I
    //   1946: istore_3
    //   1947: iload #8
    //   1949: istore_2
    //   1950: iload_3
    //   1951: ifle -> 3750
    //   1954: iload #10
    //   1956: iconst_3
    //   1957: ishl
    //   1958: invokestatic n : (I)I
    //   1961: istore #4
    //   1963: iload_3
    //   1964: istore_2
    //   1965: iload #4
    //   1967: istore_3
    //   1968: goto -> 1465
    //   1971: aload #15
    //   1973: aload_1
    //   1974: lload #13
    //   1976: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   1979: checkcast java/util/List
    //   1982: astore #17
    //   1984: getstatic fm2.a : Lbg2;
    //   1987: astore #16
    //   1989: aload #17
    //   1991: invokeinterface size : ()I
    //   1996: iconst_4
    //   1997: imul
    //   1998: istore_3
    //   1999: iload #8
    //   2001: istore_2
    //   2002: iload_3
    //   2003: ifle -> 3750
    //   2006: iload #10
    //   2008: iconst_3
    //   2009: ishl
    //   2010: invokestatic n : (I)I
    //   2013: istore #4
    //   2015: iload_3
    //   2016: istore_2
    //   2017: iload #4
    //   2019: istore_3
    //   2020: goto -> 1465
    //   2023: aload #15
    //   2025: aload_1
    //   2026: lload #13
    //   2028: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2031: checkcast java/util/List
    //   2034: astore #17
    //   2036: getstatic fm2.a : Lbg2;
    //   2039: astore #16
    //   2041: aload #17
    //   2043: invokeinterface size : ()I
    //   2048: bipush #8
    //   2050: imul
    //   2051: istore_3
    //   2052: iload #8
    //   2054: istore_2
    //   2055: iload_3
    //   2056: ifle -> 3750
    //   2059: iload #10
    //   2061: iconst_3
    //   2062: ishl
    //   2063: invokestatic n : (I)I
    //   2066: istore #4
    //   2068: iload_3
    //   2069: istore_2
    //   2070: iload #4
    //   2072: istore_3
    //   2073: goto -> 1465
    //   2076: aload #15
    //   2078: aload_1
    //   2079: lload #13
    //   2081: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2084: checkcast java/util/List
    //   2087: astore #16
    //   2089: getstatic fm2.a : Lbg2;
    //   2092: astore #17
    //   2094: aload #16
    //   2096: invokeinterface size : ()I
    //   2101: istore_3
    //   2102: iload_3
    //   2103: ifne -> 2111
    //   2106: iconst_0
    //   2107: istore_2
    //   2108: goto -> 2133
    //   2111: aload #16
    //   2113: invokestatic m : (Ljava/util/List;)I
    //   2116: istore_2
    //   2117: iload #10
    //   2119: iconst_3
    //   2120: ishl
    //   2121: invokestatic n : (I)I
    //   2124: istore #4
    //   2126: iload #4
    //   2128: iload_3
    //   2129: imul
    //   2130: iload_2
    //   2131: iadd
    //   2132: istore_2
    //   2133: iload #8
    //   2135: iload_2
    //   2136: iadd
    //   2137: istore_2
    //   2138: goto -> 3750
    //   2141: aload #15
    //   2143: aload_1
    //   2144: lload #13
    //   2146: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2149: checkcast java/util/List
    //   2152: astore #17
    //   2154: getstatic fm2.a : Lbg2;
    //   2157: astore #16
    //   2159: aload #17
    //   2161: invokeinterface size : ()I
    //   2166: istore_3
    //   2167: iload_3
    //   2168: ifne -> 2174
    //   2171: goto -> 2106
    //   2174: aload #17
    //   2176: invokestatic l : (Ljava/util/List;)I
    //   2179: istore_2
    //   2180: iload #10
    //   2182: iconst_3
    //   2183: ishl
    //   2184: invokestatic n : (I)I
    //   2187: istore #4
    //   2189: goto -> 2126
    //   2192: iload #10
    //   2194: aload #15
    //   2196: aload_1
    //   2197: lload #13
    //   2199: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2202: checkcast java/util/List
    //   2205: invokestatic i : (ILjava/util/List;)I
    //   2208: istore_2
    //   2209: goto -> 531
    //   2212: iload #10
    //   2214: aload #15
    //   2216: aload_1
    //   2217: lload #13
    //   2219: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2222: checkcast java/util/List
    //   2225: invokestatic h : (ILjava/util/List;)I
    //   2228: istore_2
    //   2229: goto -> 531
    //   2232: aload #15
    //   2234: aload_1
    //   2235: lload #13
    //   2237: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2240: checkcast java/util/List
    //   2243: astore #17
    //   2245: getstatic fm2.a : Lbg2;
    //   2248: astore #16
    //   2250: aload #17
    //   2252: invokeinterface size : ()I
    //   2257: istore_3
    //   2258: iload_3
    //   2259: ifne -> 2265
    //   2262: goto -> 2106
    //   2265: aload #17
    //   2267: invokestatic g : (Ljava/util/List;)I
    //   2270: istore_2
    //   2271: iload #10
    //   2273: iconst_3
    //   2274: ishl
    //   2275: invokestatic n : (I)I
    //   2278: istore #4
    //   2280: goto -> 2126
    //   2283: aload #15
    //   2285: aload_1
    //   2286: lload #13
    //   2288: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2291: checkcast java/util/List
    //   2294: astore #16
    //   2296: getstatic fm2.a : Lbg2;
    //   2299: astore #17
    //   2301: aload #16
    //   2303: invokeinterface size : ()I
    //   2308: istore_3
    //   2309: iload_3
    //   2310: ifne -> 2316
    //   2313: goto -> 2106
    //   2316: aload #16
    //   2318: invokestatic n : (Ljava/util/List;)I
    //   2321: istore_2
    //   2322: iload #10
    //   2324: iconst_3
    //   2325: ishl
    //   2326: invokestatic n : (I)I
    //   2329: istore #4
    //   2331: goto -> 2126
    //   2334: aload #15
    //   2336: aload_1
    //   2337: lload #13
    //   2339: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2342: checkcast java/util/List
    //   2345: astore #17
    //   2347: getstatic fm2.a : Lbg2;
    //   2350: astore #16
    //   2352: aload #17
    //   2354: invokeinterface size : ()I
    //   2359: istore_2
    //   2360: iload_2
    //   2361: ifne -> 2367
    //   2364: goto -> 2106
    //   2367: iload #10
    //   2369: iconst_3
    //   2370: ishl
    //   2371: invokestatic n : (I)I
    //   2374: iload_2
    //   2375: imul
    //   2376: istore_3
    //   2377: iconst_0
    //   2378: istore #4
    //   2380: iload_3
    //   2381: istore_2
    //   2382: iload #4
    //   2384: aload #17
    //   2386: invokeinterface size : ()I
    //   2391: if_icmpge -> 2133
    //   2394: aload #17
    //   2396: iload #4
    //   2398: invokeinterface get : (I)Ljava/lang/Object;
    //   2403: checkcast gk2
    //   2406: invokevirtual f : ()I
    //   2409: istore_2
    //   2410: iload_2
    //   2411: iload_2
    //   2412: iload_3
    //   2413: invokestatic f : (III)I
    //   2416: istore_3
    //   2417: iinc #4, 1
    //   2420: goto -> 2380
    //   2423: aload #15
    //   2425: aload_1
    //   2426: lload #13
    //   2428: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2431: checkcast java/util/List
    //   2434: astore #17
    //   2436: aload_0
    //   2437: iload #5
    //   2439: invokevirtual B : (I)Lem2;
    //   2442: astore #16
    //   2444: getstatic fm2.a : Lbg2;
    //   2447: astore #18
    //   2449: aload #17
    //   2451: invokeinterface size : ()I
    //   2456: istore #9
    //   2458: iload #9
    //   2460: ifne -> 2469
    //   2463: iconst_0
    //   2464: istore #4
    //   2466: goto -> 2524
    //   2469: iload #10
    //   2471: iconst_3
    //   2472: ishl
    //   2473: invokestatic n : (I)I
    //   2476: iload #9
    //   2478: imul
    //   2479: istore_2
    //   2480: iconst_0
    //   2481: istore_3
    //   2482: iload_2
    //   2483: istore #4
    //   2485: iload_3
    //   2486: iload #9
    //   2488: if_icmpge -> 2524
    //   2491: aload #17
    //   2493: iload_3
    //   2494: invokeinterface get : (I)Ljava/lang/Object;
    //   2499: checkcast yj2
    //   2502: aload #16
    //   2504: invokevirtual c : (Lem2;)I
    //   2507: istore #4
    //   2509: iload #4
    //   2511: iload #4
    //   2513: iload_2
    //   2514: invokestatic f : (III)I
    //   2517: istore_2
    //   2518: iinc #3, 1
    //   2521: goto -> 2482
    //   2524: iload #8
    //   2526: iload #4
    //   2528: iadd
    //   2529: istore_2
    //   2530: goto -> 3750
    //   2533: aload #15
    //   2535: aload_1
    //   2536: lload #13
    //   2538: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2541: checkcast java/util/List
    //   2544: astore #16
    //   2546: getstatic fm2.a : Lbg2;
    //   2549: astore #17
    //   2551: aload #16
    //   2553: invokeinterface size : ()I
    //   2558: istore #9
    //   2560: iload #9
    //   2562: ifne -> 2568
    //   2565: goto -> 2106
    //   2568: iload #10
    //   2570: iconst_3
    //   2571: ishl
    //   2572: invokestatic n : (I)I
    //   2575: iload #9
    //   2577: imul
    //   2578: istore_3
    //   2579: iconst_0
    //   2580: istore #4
    //   2582: iload_3
    //   2583: istore_2
    //   2584: iload #4
    //   2586: iload #9
    //   2588: if_icmpge -> 2133
    //   2591: aload #16
    //   2593: iload #4
    //   2595: invokeinterface get : (I)Ljava/lang/Object;
    //   2600: astore #17
    //   2602: aload #17
    //   2604: instanceof gk2
    //   2607: ifeq -> 2629
    //   2610: aload #17
    //   2612: checkcast gk2
    //   2615: invokevirtual f : ()I
    //   2618: istore_2
    //   2619: iload_2
    //   2620: iload_2
    //   2621: iload_3
    //   2622: invokestatic f : (III)I
    //   2625: istore_3
    //   2626: goto -> 2641
    //   2629: aload #17
    //   2631: checkcast java/lang/String
    //   2634: invokestatic b : (Ljava/lang/String;)I
    //   2637: istore_2
    //   2638: goto -> 2619
    //   2641: iinc #4, 1
    //   2644: goto -> 2582
    //   2647: aload #15
    //   2649: aload_1
    //   2650: lload #13
    //   2652: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2655: checkcast java/util/List
    //   2658: astore #17
    //   2660: getstatic fm2.a : Lbg2;
    //   2663: astore #16
    //   2665: aload #17
    //   2667: invokeinterface size : ()I
    //   2672: istore_2
    //   2673: iload_2
    //   2674: ifne -> 2682
    //   2677: iconst_0
    //   2678: istore_2
    //   2679: goto -> 2694
    //   2682: iload #10
    //   2684: iconst_3
    //   2685: ishl
    //   2686: invokestatic n : (I)I
    //   2689: iconst_1
    //   2690: iadd
    //   2691: iload_2
    //   2692: imul
    //   2693: istore_2
    //   2694: iload #8
    //   2696: iload_2
    //   2697: iadd
    //   2698: istore_2
    //   2699: goto -> 3750
    //   2702: iload #10
    //   2704: aload #15
    //   2706: aload_1
    //   2707: lload #13
    //   2709: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2712: checkcast java/util/List
    //   2715: invokestatic h : (ILjava/util/List;)I
    //   2718: istore_2
    //   2719: goto -> 531
    //   2722: iload #10
    //   2724: aload #15
    //   2726: aload_1
    //   2727: lload #13
    //   2729: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2732: checkcast java/util/List
    //   2735: invokestatic i : (ILjava/util/List;)I
    //   2738: istore_2
    //   2739: goto -> 531
    //   2742: aload #15
    //   2744: aload_1
    //   2745: lload #13
    //   2747: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2750: checkcast java/util/List
    //   2753: astore #16
    //   2755: getstatic fm2.a : Lbg2;
    //   2758: astore #17
    //   2760: aload #16
    //   2762: invokeinterface size : ()I
    //   2767: istore_3
    //   2768: iload_3
    //   2769: ifne -> 2775
    //   2772: goto -> 2106
    //   2775: aload #16
    //   2777: invokestatic j : (Ljava/util/List;)I
    //   2780: istore_2
    //   2781: iload #10
    //   2783: iconst_3
    //   2784: ishl
    //   2785: invokestatic n : (I)I
    //   2788: istore #4
    //   2790: goto -> 2126
    //   2793: aload #15
    //   2795: aload_1
    //   2796: lload #13
    //   2798: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2801: checkcast java/util/List
    //   2804: astore #17
    //   2806: getstatic fm2.a : Lbg2;
    //   2809: astore #16
    //   2811: aload #17
    //   2813: invokeinterface size : ()I
    //   2818: istore_3
    //   2819: iload_3
    //   2820: ifne -> 2826
    //   2823: goto -> 2106
    //   2826: aload #17
    //   2828: invokestatic o : (Ljava/util/List;)I
    //   2831: istore_2
    //   2832: iload #10
    //   2834: iconst_3
    //   2835: ishl
    //   2836: invokestatic n : (I)I
    //   2839: istore #4
    //   2841: goto -> 2126
    //   2844: aload #15
    //   2846: aload_1
    //   2847: lload #13
    //   2849: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2852: checkcast java/util/List
    //   2855: astore #16
    //   2857: getstatic fm2.a : Lbg2;
    //   2860: astore #17
    //   2862: aload #16
    //   2864: invokeinterface size : ()I
    //   2869: ifne -> 2875
    //   2872: goto -> 2677
    //   2875: aload #16
    //   2877: invokestatic k : (Ljava/util/List;)I
    //   2880: istore_2
    //   2881: aload #16
    //   2883: invokeinterface size : ()I
    //   2888: istore_3
    //   2889: iload #10
    //   2891: iconst_3
    //   2892: ishl
    //   2893: invokestatic n : (I)I
    //   2896: iload_3
    //   2897: imul
    //   2898: iload_2
    //   2899: iadd
    //   2900: istore_2
    //   2901: goto -> 2694
    //   2904: iload #10
    //   2906: aload #15
    //   2908: aload_1
    //   2909: lload #13
    //   2911: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2914: checkcast java/util/List
    //   2917: invokestatic h : (ILjava/util/List;)I
    //   2920: istore_2
    //   2921: goto -> 531
    //   2924: iload #10
    //   2926: aload #15
    //   2928: aload_1
    //   2929: lload #13
    //   2931: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2934: checkcast java/util/List
    //   2937: invokestatic i : (ILjava/util/List;)I
    //   2940: istore_2
    //   2941: goto -> 531
    //   2944: iload #8
    //   2946: istore_2
    //   2947: aload_0
    //   2948: aload_1
    //   2949: iload #5
    //   2951: iload #7
    //   2953: iload #6
    //   2955: iload #9
    //   2957: invokevirtual q : (Ljava/lang/Object;IIII)Z
    //   2960: ifeq -> 3750
    //   2963: aload #15
    //   2965: aload_1
    //   2966: lload #13
    //   2968: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   2971: checkcast yj2
    //   2974: astore #17
    //   2976: aload_0
    //   2977: iload #5
    //   2979: invokevirtual B : (I)Lem2;
    //   2982: astore #16
    //   2984: getstatic fm2.a : Lbg2;
    //   2987: astore #18
    //   2989: iload #10
    //   2991: iconst_3
    //   2992: ishl
    //   2993: invokestatic n : (I)I
    //   2996: istore_2
    //   2997: iload_2
    //   2998: iload_2
    //   2999: iadd
    //   3000: istore_3
    //   3001: aload #17
    //   3003: aload #16
    //   3005: invokevirtual c : (Lem2;)I
    //   3008: istore_2
    //   3009: goto -> 527
    //   3012: iload #8
    //   3014: istore_2
    //   3015: aload_0
    //   3016: aload_1
    //   3017: iload #5
    //   3019: iload #7
    //   3021: iload #6
    //   3023: iload #9
    //   3025: invokevirtual q : (Ljava/lang/Object;IIII)Z
    //   3028: ifeq -> 3750
    //   3031: aload #15
    //   3033: aload_1
    //   3034: lload #13
    //   3036: invokevirtual getLong : (Ljava/lang/Object;J)J
    //   3039: lstore #13
    //   3041: iload #10
    //   3043: iconst_3
    //   3044: ishl
    //   3045: invokestatic n : (I)I
    //   3048: istore_2
    //   3049: lload #13
    //   3051: bipush #63
    //   3053: lshr
    //   3054: lload #13
    //   3056: lload #13
    //   3058: ladd
    //   3059: lxor
    //   3060: invokestatic o : (J)I
    //   3063: istore_3
    //   3064: iload_3
    //   3065: iload_2
    //   3066: iadd
    //   3067: istore_2
    //   3068: goto -> 531
    //   3071: iload #8
    //   3073: istore_2
    //   3074: aload_0
    //   3075: aload_1
    //   3076: iload #5
    //   3078: iload #7
    //   3080: iload #6
    //   3082: iload #9
    //   3084: invokevirtual q : (Ljava/lang/Object;IIII)Z
    //   3087: ifeq -> 3750
    //   3090: aload #15
    //   3092: aload_1
    //   3093: lload #13
    //   3095: invokevirtual getInt : (Ljava/lang/Object;J)I
    //   3098: istore_2
    //   3099: iload #10
    //   3101: iconst_3
    //   3102: ishl
    //   3103: invokestatic n : (I)I
    //   3106: istore_3
    //   3107: iload_2
    //   3108: bipush #31
    //   3110: ishr
    //   3111: iload_2
    //   3112: iload_2
    //   3113: iadd
    //   3114: ixor
    //   3115: istore_2
    //   3116: iload_2
    //   3117: iload_3
    //   3118: iload #8
    //   3120: invokestatic f : (III)I
    //   3123: istore_2
    //   3124: goto -> 3750
    //   3127: iload #8
    //   3129: istore_2
    //   3130: aload_0
    //   3131: aload_1
    //   3132: iload #5
    //   3134: iload #7
    //   3136: iload #6
    //   3138: iload #9
    //   3140: invokevirtual q : (Ljava/lang/Object;IIII)Z
    //   3143: ifeq -> 3750
    //   3146: iload #10
    //   3148: iconst_3
    //   3149: ishl
    //   3150: bipush #8
    //   3152: iload #8
    //   3154: invokestatic f : (III)I
    //   3157: istore_2
    //   3158: goto -> 3750
    //   3161: iload #8
    //   3163: istore_2
    //   3164: aload_0
    //   3165: aload_1
    //   3166: iload #5
    //   3168: iload #7
    //   3170: iload #6
    //   3172: iload #9
    //   3174: invokevirtual q : (Ljava/lang/Object;IIII)Z
    //   3177: ifeq -> 3750
    //   3180: iload #10
    //   3182: iconst_3
    //   3183: ishl
    //   3184: iconst_4
    //   3185: iload #8
    //   3187: invokestatic f : (III)I
    //   3190: istore_2
    //   3191: goto -> 3750
    //   3194: iload #8
    //   3196: istore_2
    //   3197: aload_0
    //   3198: aload_1
    //   3199: iload #5
    //   3201: iload #7
    //   3203: iload #6
    //   3205: iload #9
    //   3207: invokevirtual q : (Ljava/lang/Object;IIII)Z
    //   3210: ifeq -> 3750
    //   3213: aload #15
    //   3215: aload_1
    //   3216: lload #13
    //   3218: invokevirtual getInt : (Ljava/lang/Object;J)I
    //   3221: i2l
    //   3222: lstore #13
    //   3224: iload #10
    //   3226: iconst_3
    //   3227: ishl
    //   3228: invokestatic n : (I)I
    //   3231: istore_2
    //   3232: lload #13
    //   3234: invokestatic o : (J)I
    //   3237: istore_3
    //   3238: goto -> 3064
    //   3241: iload #8
    //   3243: istore_2
    //   3244: aload_0
    //   3245: aload_1
    //   3246: iload #5
    //   3248: iload #7
    //   3250: iload #6
    //   3252: iload #9
    //   3254: invokevirtual q : (Ljava/lang/Object;IIII)Z
    //   3257: ifeq -> 3750
    //   3260: aload #15
    //   3262: aload_1
    //   3263: lload #13
    //   3265: invokevirtual getInt : (Ljava/lang/Object;J)I
    //   3268: istore_2
    //   3269: iload #10
    //   3271: iconst_3
    //   3272: ishl
    //   3273: invokestatic n : (I)I
    //   3276: istore_3
    //   3277: goto -> 3116
    //   3280: iload #8
    //   3282: istore_2
    //   3283: aload_0
    //   3284: aload_1
    //   3285: iload #5
    //   3287: iload #7
    //   3289: iload #6
    //   3291: iload #9
    //   3293: invokevirtual q : (Ljava/lang/Object;IIII)Z
    //   3296: ifeq -> 3750
    //   3299: aload #15
    //   3301: aload_1
    //   3302: lload #13
    //   3304: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   3307: checkcast gk2
    //   3310: astore #16
    //   3312: iload #10
    //   3314: iconst_3
    //   3315: ishl
    //   3316: invokestatic n : (I)I
    //   3319: istore_2
    //   3320: aload #16
    //   3322: invokevirtual f : ()I
    //   3325: istore_3
    //   3326: iload_3
    //   3327: iload_3
    //   3328: iload_2
    //   3329: iload #8
    //   3331: invokestatic g : (IIII)I
    //   3334: istore_2
    //   3335: goto -> 3750
    //   3338: iload #8
    //   3340: istore_2
    //   3341: aload_0
    //   3342: aload_1
    //   3343: iload #5
    //   3345: iload #7
    //   3347: iload #6
    //   3349: iload #9
    //   3351: invokevirtual q : (Ljava/lang/Object;IIII)Z
    //   3354: ifeq -> 3750
    //   3357: aload #15
    //   3359: aload_1
    //   3360: lload #13
    //   3362: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   3365: astore #18
    //   3367: aload_0
    //   3368: iload #5
    //   3370: invokevirtual B : (I)Lem2;
    //   3373: astore #16
    //   3375: getstatic fm2.a : Lbg2;
    //   3378: astore #17
    //   3380: aload #18
    //   3382: checkcast yj2
    //   3385: astore #17
    //   3387: iload #10
    //   3389: iconst_3
    //   3390: ishl
    //   3391: invokestatic n : (I)I
    //   3394: istore_3
    //   3395: aload #17
    //   3397: aload #16
    //   3399: invokevirtual c : (Lem2;)I
    //   3402: istore_2
    //   3403: goto -> 893
    //   3406: iload #8
    //   3408: istore_2
    //   3409: aload_0
    //   3410: aload_1
    //   3411: iload #5
    //   3413: iload #7
    //   3415: iload #6
    //   3417: iload #9
    //   3419: invokevirtual q : (Ljava/lang/Object;IIII)Z
    //   3422: ifeq -> 3750
    //   3425: iload #10
    //   3427: iconst_3
    //   3428: ishl
    //   3429: istore_2
    //   3430: aload #15
    //   3432: aload_1
    //   3433: lload #13
    //   3435: invokevirtual getObject : (Ljava/lang/Object;J)Ljava/lang/Object;
    //   3438: astore #16
    //   3440: aload #16
    //   3442: instanceof gk2
    //   3445: ifeq -> 3469
    //   3448: aload #16
    //   3450: checkcast gk2
    //   3453: astore #16
    //   3455: iload_2
    //   3456: invokestatic n : (I)I
    //   3459: istore_2
    //   3460: aload #16
    //   3462: invokevirtual f : ()I
    //   3465: istore_3
    //   3466: goto -> 3326
    //   3469: aload #16
    //   3471: checkcast java/lang/String
    //   3474: astore #16
    //   3476: iload_2
    //   3477: invokestatic n : (I)I
    //   3480: istore_2
    //   3481: aload #16
    //   3483: invokestatic b : (Ljava/lang/String;)I
    //   3486: istore_3
    //   3487: goto -> 3326
    //   3490: iload #8
    //   3492: istore_2
    //   3493: aload_0
    //   3494: aload_1
    //   3495: iload #5
    //   3497: iload #7
    //   3499: iload #6
    //   3501: iload #9
    //   3503: invokevirtual q : (Ljava/lang/Object;IIII)Z
    //   3506: ifeq -> 3750
    //   3509: iload #10
    //   3511: iconst_3
    //   3512: ishl
    //   3513: iconst_1
    //   3514: iload #8
    //   3516: invokestatic f : (III)I
    //   3519: istore_2
    //   3520: goto -> 3750
    //   3523: iload #8
    //   3525: istore_2
    //   3526: aload_0
    //   3527: aload_1
    //   3528: iload #5
    //   3530: iload #7
    //   3532: iload #6
    //   3534: iload #9
    //   3536: invokevirtual q : (Ljava/lang/Object;IIII)Z
    //   3539: ifeq -> 3750
    //   3542: goto -> 3180
    //   3545: iload #8
    //   3547: istore_2
    //   3548: aload_0
    //   3549: aload_1
    //   3550: iload #5
    //   3552: iload #7
    //   3554: iload #6
    //   3556: iload #9
    //   3558: invokevirtual q : (Ljava/lang/Object;IIII)Z
    //   3561: ifeq -> 3750
    //   3564: goto -> 3146
    //   3567: iload #8
    //   3569: istore_2
    //   3570: aload_0
    //   3571: aload_1
    //   3572: iload #5
    //   3574: iload #7
    //   3576: iload #6
    //   3578: iload #9
    //   3580: invokevirtual q : (Ljava/lang/Object;IIII)Z
    //   3583: ifeq -> 3750
    //   3586: aload #15
    //   3588: aload_1
    //   3589: lload #13
    //   3591: invokevirtual getInt : (Ljava/lang/Object;J)I
    //   3594: i2l
    //   3595: lstore #13
    //   3597: iload #10
    //   3599: iconst_3
    //   3600: ishl
    //   3601: invokestatic n : (I)I
    //   3604: istore_2
    //   3605: lload #13
    //   3607: invokestatic o : (J)I
    //   3610: istore_3
    //   3611: goto -> 3064
    //   3614: iload #8
    //   3616: istore_2
    //   3617: aload_0
    //   3618: aload_1
    //   3619: iload #5
    //   3621: iload #7
    //   3623: iload #6
    //   3625: iload #9
    //   3627: invokevirtual q : (Ljava/lang/Object;IIII)Z
    //   3630: ifeq -> 3750
    //   3633: aload #15
    //   3635: aload_1
    //   3636: lload #13
    //   3638: invokevirtual getLong : (Ljava/lang/Object;J)J
    //   3641: lstore #13
    //   3643: iload #10
    //   3645: iconst_3
    //   3646: ishl
    //   3647: invokestatic n : (I)I
    //   3650: istore_2
    //   3651: lload #13
    //   3653: invokestatic o : (J)I
    //   3656: istore_3
    //   3657: goto -> 3064
    //   3660: iload #8
    //   3662: istore_2
    //   3663: aload_0
    //   3664: aload_1
    //   3665: iload #5
    //   3667: iload #7
    //   3669: iload #6
    //   3671: iload #9
    //   3673: invokevirtual q : (Ljava/lang/Object;IIII)Z
    //   3676: ifeq -> 3750
    //   3679: aload #15
    //   3681: aload_1
    //   3682: lload #13
    //   3684: invokevirtual getLong : (Ljava/lang/Object;J)J
    //   3687: lstore #13
    //   3689: iload #10
    //   3691: iconst_3
    //   3692: ishl
    //   3693: invokestatic n : (I)I
    //   3696: istore_2
    //   3697: lload #13
    //   3699: invokestatic o : (J)I
    //   3702: istore_3
    //   3703: goto -> 3064
    //   3706: iload #8
    //   3708: istore_2
    //   3709: aload_0
    //   3710: aload_1
    //   3711: iload #5
    //   3713: iload #7
    //   3715: iload #6
    //   3717: iload #9
    //   3719: invokevirtual q : (Ljava/lang/Object;IIII)Z
    //   3722: ifeq -> 3750
    //   3725: goto -> 3180
    //   3728: iload #8
    //   3730: istore_2
    //   3731: aload_0
    //   3732: aload_1
    //   3733: iload #5
    //   3735: iload #7
    //   3737: iload #6
    //   3739: iload #9
    //   3741: invokevirtual q : (Ljava/lang/Object;IIII)Z
    //   3744: ifeq -> 3750
    //   3747: goto -> 3146
    //   3750: iinc #5, 3
    //   3753: iload #7
    //   3755: istore_3
    //   3756: iload #6
    //   3758: istore #4
    //   3760: iload_2
    //   3761: istore #8
    //   3763: goto -> 17
    //   3766: aload_1
    //   3767: checkcast wk2
    //   3770: getfield zzc : Lnm2;
    //   3773: invokevirtual a : ()I
    //   3776: iload #8
    //   3778: iadd
    //   3779: ireturn
  }
  
  public final boolean h(Object paramObject) {
    int i = 0;
    byte b = 0;
    int j = 1048575;
    while (b < this.g) {
      int i1 = this.f[b];
      int[] arrayOfInt = this.a;
      int n = arrayOfInt[i1];
      int m = y(i1);
      int i2 = arrayOfInt[i1 + 2];
      int k = i2 & 0xFFFFF;
      i2 = 1 << i2 >>> 20;
      if (k != j) {
        if (k != 1048575) {
          long l = k;
          i = k.getInt(paramObject, l);
        } 
        j = k;
      } 
      if ((0x10000000 & m) != 0 && !q(paramObject, i1, j, i, i2))
        continue; 
      k = x(m);
      if (k != 9 && k != 17) {
        if (k != 27)
          if (k != 60 && k != 68) {
            if (k != 49) {
              if (k == 50 && !((sl2)wm2.h((m & 0xFFFFF), paramObject)).isEmpty()) {
                i = i1 / 3;
                throw x41.f(this.b[i + i]);
              } 
              continue;
            } 
          } else {
            if (s(n, i1, paramObject) && !B(i1).h(wm2.h((m & 0xFFFFF), paramObject)))
              continue; 
            continue;
          }  
        List list = (List)wm2.h((m & 0xFFFFF), paramObject);
        if (!list.isEmpty()) {
          em2 em21 = B(i1);
          for (k = 0; k < list.size(); k++) {
            if (!em21.h(list.get(k)))
              return false; 
          } 
        } 
        continue;
      } 
      if (q(paramObject, i1, j, i, i2) && !B(i1).h(wm2.h((m & 0xFFFFF), paramObject)))
        continue; 
      continue;
      b++;
    } 
    return true;
  }
  
  public final void i(Object paramObject, a42 parama42) {
    ik2 ik2 = (ik2)parama42.c;
    Unsafe unsafe = k;
    int j = 1048575;
    int i = 0;
    int k = 0;
    while (true) {
      int[] arrayOfInt = this.a;
      if (i < arrayOfInt.length) {
        int m;
        Object object1;
        int n;
        Object object2;
        Object object3;
        int i2;
        Object object4;
        em2 em21;
        bg2 bg22;
        List list;
        bg2 bg21;
        bg2 bg23;
        int i1 = y(i);
        int i4 = x(i1);
        int i3 = arrayOfInt[i];
        if (i4 <= 17) {
          int i5 = arrayOfInt[i + 2];
          n = i5 & 0xFFFFF;
          m = j;
          if (n != j) {
            if (n == 1048575) {
              k = 0;
            } else {
              k = unsafe.getInt(paramObject, n);
            } 
            m = n;
          } 
          n = 1 << i5 >>> 20;
        } else {
          n = 0;
          m = j;
        } 
        long l = (i1 & 0xFFFFF);
        i1 = 3;
        switch (i4) {
          default:
            j = i;
            break;
          case 68:
            j = i;
            if (s(i3, i, paramObject)) {
              Object object = unsafe.getObject(paramObject, l);
              object4 = B(i);
              object = object;
              ik2.i(i3, 3);
              object4.i(object, parama42);
              ik2.i(i3, 4);
              j = i;
            } 
            break;
          case 67:
            j = i;
            if (s(i3, i, paramObject)) {
              l = z(l, paramObject);
              ik2.l(i3, l >> 63L ^ l + l);
              j = i;
            } 
            break;
          case 66:
            j = i;
            if (s(i3, i, paramObject)) {
              j = v(l, paramObject);
              ik2.j(i3, j >> 31 ^ j + j);
              j = i;
            } 
            break;
          case 65:
            j = i;
            if (s(i3, i, paramObject)) {
              ik2.e(i3, z(l, paramObject));
              j = i;
            } 
            break;
          case 64:
            j = i;
            if (s(i3, i, paramObject)) {
              ik2.c(i3, v(l, paramObject));
              j = i;
            } 
            break;
          case 63:
            j = i;
            if (s(i3, i, paramObject)) {
              ik2.g(i3, v(l, paramObject));
              j = i;
            } 
            break;
          case 62:
            j = i;
            if (s(i3, i, paramObject)) {
              ik2.j(i3, v(l, paramObject));
              j = i;
            } 
            break;
          case 61:
            j = i;
            if (s(i3, i, paramObject)) {
              object4 = unsafe.getObject(paramObject, l);
              ik2.k(i3 << 3 | 0x2);
              ik2.k(object4.f());
              object4.h(ik2);
              j = i;
            } 
            break;
          case 60:
            j = i;
            if (s(i3, i, paramObject)) {
              parama42.y(i3, unsafe.getObject(paramObject, l), B(i));
              j = i;
            } 
            break;
          case 59:
            j = i;
            if (s(i3, i, paramObject)) {
              object4 = unsafe.getObject(paramObject, l);
              if (object4 instanceof String) {
                String str = (String)object4;
                ik2.k(i3 << 3 | 0x2);
                n = ik2.c;
                object4 = ik2.b;
                i1 = ik2.d;
                try {
                  i3 = ik2.n(str.length() * 3);
                  j = ik2.n(str.length());
                  if (j == i3) {
                    i3 = i1 + j;
                    ik2.d = i3;
                    n = an2.a((byte[])object4, i3, n - i3, str);
                    ik2.d = i1;
                    ik2.k(n - i1 - j);
                    ik2.d = n;
                    j = i;
                    break;
                  } 
                } catch (IndexOutOfBoundsException null) {}
                ik2.k(an2.b(str));
                j = ik2.d;
                ik2.d = an2.a((byte[])object4, j, n - j, str);
                j = i;
                break;
              } 
              object4 = object4;
              ik2.k(i3 << 3 | 0x2);
              ik2.k(object4.f());
              object4.h(ik2);
              j = i;
            } 
            break;
          case 58:
            j = i;
            if (s(i3, i, indexOutOfBoundsException)) {
              boolean bool = ((Boolean)wm2.h(l, indexOutOfBoundsException)).booleanValue();
              ik2.k(i3 << 3);
              ik2.a(bool);
              j = i;
            } 
            break;
          case 57:
            j = i;
            if (s(i3, i, indexOutOfBoundsException)) {
              ik2.c(i3, v(l, indexOutOfBoundsException));
              j = i;
            } 
            break;
          case 56:
            j = i;
            if (s(i3, i, indexOutOfBoundsException)) {
              ik2.e(i3, z(l, indexOutOfBoundsException));
              j = i;
            } 
            break;
          case 55:
            j = i;
            if (s(i3, i, indexOutOfBoundsException)) {
              ik2.g(i3, v(l, indexOutOfBoundsException));
              j = i;
            } 
            break;
          case 54:
            j = i;
            if (s(i3, i, indexOutOfBoundsException)) {
              ik2.l(i3, z(l, indexOutOfBoundsException));
              j = i;
            } 
            break;
          case 53:
            j = i;
            if (s(i3, i, indexOutOfBoundsException)) {
              ik2.l(i3, z(l, indexOutOfBoundsException));
              j = i;
            } 
            break;
          case 52:
            j = i;
            if (s(i3, i, indexOutOfBoundsException)) {
              ik2.c(i3, Float.floatToRawIntBits(((Float)wm2.h(l, indexOutOfBoundsException)).floatValue()));
              j = i;
            } 
            break;
          case 51:
            j = i;
            if (s(i3, i, indexOutOfBoundsException)) {
              ik2.e(i3, Double.doubleToRawLongBits(((Double)wm2.h(l, indexOutOfBoundsException)).doubleValue()));
              j = i;
            } 
            break;
          case 50:
            if (unsafe.getObject(indexOutOfBoundsException, l) == null) {
              j = i;
              break;
            } 
            i /= 3;
            throw x41.f(this.b[i + i]);
          case 49:
            object2 = object4[i];
            object4 = unsafe.getObject(indexOutOfBoundsException, l);
            em21 = B(i);
            bg23 = fm2.a;
            j = i;
            if (object4 != null) {
              j = i;
              if (!object4.isEmpty()) {
                n = 0;
                while (true) {
                  j = i;
                  if (n < object4.size()) {
                    yj2 yj21 = object4.get(n);
                    ik2.i(object2, 3);
                    em21.i(yj21, parama42);
                    ik2.i(object2, 4);
                    n++;
                    continue;
                  } 
                  break;
                } 
              } 
            } 
            break;
          case 48:
            fm2.c(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            j = i;
            break;
          case 47:
            fm2.b(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            j = i;
            break;
          case 46:
            fm2.a(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            j = i;
            break;
          case 45:
            fm2.y(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            j = i;
            break;
          case 44:
            fm2.s(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            j = i;
            break;
          case 43:
            fm2.d(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            j = i;
            break;
          case 42:
            fm2.q(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            j = i;
            break;
          case 41:
            fm2.t(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            j = i;
            break;
          case 40:
            fm2.u(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            j = i;
            break;
          case 39:
            fm2.w(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            j = i;
            break;
          case 38:
            fm2.e(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            j = i;
            break;
          case 37:
            fm2.x(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            j = i;
            break;
          case 36:
            fm2.v(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            j = i;
            break;
          case 35:
            fm2.r(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, true);
            j = i;
            break;
          case 34:
            fm2.c(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            j = i;
            break;
          case 33:
            fm2.b(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            j = i;
            break;
          case 32:
            fm2.a(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            j = i;
            break;
          case 31:
            fm2.y(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            j = i;
            break;
          case 30:
            fm2.s(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            j = i;
            break;
          case 29:
            fm2.d(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            j = i;
            break;
          case 28:
            object2 = object4[i];
            object4 = unsafe.getObject(indexOutOfBoundsException, l);
            bg22 = fm2.a;
            j = i;
            if (object4 != null) {
              j = i;
              if (!object4.isEmpty()) {
                n = 0;
                while (true) {
                  j = i;
                  if (n < object4.size()) {
                    gk2 gk2 = object4.get(n);
                    ik2.k(object2 << 3 | 0x2);
                    ik2.k(gk2.f());
                    gk2.h(ik2);
                    n++;
                    continue;
                  } 
                  break;
                } 
              } 
            } 
            break;
          case 27:
            object2 = object4[i];
            list = (List)unsafe.getObject(indexOutOfBoundsException, l);
            object4 = B(i);
            bg23 = fm2.a;
            j = i;
            if (list != null) {
              j = i;
              if (!list.isEmpty()) {
                n = 0;
                while (true) {
                  j = i;
                  if (n < list.size()) {
                    parama42.y(object2, list.get(n), (em2)object4);
                    n++;
                    continue;
                  } 
                  break;
                } 
              } 
            } 
            break;
          case 26:
            object3 = object4[i];
            object4 = unsafe.getObject(indexOutOfBoundsException, l);
            bg21 = fm2.a;
            j = i;
            if (object4 != null) {
              j = i;
              if (!object4.isEmpty()) {
                j = 0;
                object1 = object2;
                int i5 = j;
                while (true) {
                  j = i;
                  if (i5 < object4.size()) {
                    String str = object4.get(i5);
                    ik2.k(object3 << 3 | 0x2);
                    j = ik2.c;
                    byte[] arrayOfByte = ik2.b;
                    int i6 = ik2.d;
                    try {
                      int i7 = ik2.n(str.length() * 3);
                      i4 = ik2.n(str.length());
                      if (i4 == i7) {
                        i7 = i6 + i4;
                        ik2.d = i7;
                        j = an2.a(arrayOfByte, i7, j - i7, str);
                        ik2.d = i6;
                        ik2.k(j - i6 - i4);
                        ik2.d = j;
                      } else {
                        ik2.k(an2.b(str));
                        i4 = ik2.d;
                        ik2.d = an2.a(arrayOfByte, i4, j - i4, str);
                      } 
                    } catch (IndexOutOfBoundsException null) {}
                    i5++;
                    continue;
                  } 
                  break;
                } 
              } 
            } 
            break;
          case 25:
            fm2.q(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            j = i;
            break;
          case 24:
            fm2.t(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            j = i;
            break;
          case 23:
            fm2.u(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            j = i;
            break;
          case 22:
            fm2.w(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            j = i;
            break;
          case 21:
            fm2.e(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            j = i;
            break;
          case 20:
            fm2.x(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            j = i;
            break;
          case 19:
            fm2.v(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            j = i;
            break;
          case 18:
            fm2.r(object4[i], (List)unsafe.getObject(indexOutOfBoundsException, l), parama42, false);
            j = i;
            break;
          case 17:
            j = i;
            if (q(indexOutOfBoundsException, i, m, k, object1)) {
              Object object = unsafe.getObject(indexOutOfBoundsException, l);
              object4 = B(i);
              object = object;
              ik2.i(object3, 3);
              object4.i(object, parama42);
              ik2.i(object3, 4);
              j = i;
            } 
            break;
          case 16:
            j = i;
            if (q(indexOutOfBoundsException, i, m, k, object1)) {
              l = unsafe.getLong(indexOutOfBoundsException, l);
              ik2.l(object3, l >> 63L ^ l + l);
              j = i;
            } 
            break;
          case 15:
            j = i;
            if (q(indexOutOfBoundsException, i, m, k, object1)) {
              j = unsafe.getInt(indexOutOfBoundsException, l);
              ik2.j(object3, j >> 31 ^ j + j);
              j = i;
            } 
            break;
          case 14:
            j = i;
            if (q(indexOutOfBoundsException, i, m, k, object1)) {
              ik2.e(object3, unsafe.getLong(indexOutOfBoundsException, l));
              j = i;
            } 
            break;
          case 13:
            j = i;
            if (q(indexOutOfBoundsException, i, m, k, object1)) {
              ik2.c(object3, unsafe.getInt(indexOutOfBoundsException, l));
              j = i;
            } 
            break;
          case 12:
            j = i;
            if (q(indexOutOfBoundsException, i, m, k, object1)) {
              ik2.g(object3, unsafe.getInt(indexOutOfBoundsException, l));
              j = i;
            } 
            break;
          case 11:
            j = i;
            if (q(indexOutOfBoundsException, i, m, k, object1)) {
              ik2.j(object3, unsafe.getInt(indexOutOfBoundsException, l));
              j = i;
            } 
            break;
          case 10:
            j = i;
            if (q(indexOutOfBoundsException, i, m, k, object1)) {
              object4 = unsafe.getObject(indexOutOfBoundsException, l);
              ik2.k(object3 << 3 | 0x2);
              ik2.k(object4.f());
              object4.h(ik2);
              j = i;
            } 
            break;
          case 9:
            j = i;
            if (q(indexOutOfBoundsException, i, m, k, object1)) {
              parama42.y(object3, unsafe.getObject(indexOutOfBoundsException, l), B(i));
              j = i;
            } 
            break;
          case 8:
            j = i;
            if (q(indexOutOfBoundsException, i, m, k, object1)) {
              object4 = unsafe.getObject(indexOutOfBoundsException, l);
              if (object4 instanceof String) {
                String str = (String)object4;
                ik2.k(object3 << 3 | 0x2);
                j = ik2.c;
                object4 = ik2.b;
                int i5 = ik2.d;
                try {
                  i2 = ik2.n(str.length() * 3);
                  int i6 = ik2.n(str.length());
                  if (i6 == i2) {
                    i2 = i5 + i6;
                    ik2.d = i2;
                    j = an2.a((byte[])object4, i2, j - i2, str);
                    ik2.d = i5;
                    ik2.k(j - i5 - i6);
                    ik2.d = j;
                    j = i;
                    break;
                  } 
                } catch (IndexOutOfBoundsException indexOutOfBoundsException) {}
                ik2.k(an2.b(str));
                n = ik2.d;
                ik2.d = an2.a((byte[])object4, n, j - n, str);
                j = i;
                break;
              } 
              object4 = object4;
              ik2.k(i2 << 3 | 0x2);
              ik2.k(object4.f());
              object4.h(ik2);
              j = i;
            } 
            break;
          case 7:
            j = i;
            if (q(indexOutOfBoundsException, i, m, k, n)) {
              boolean bool = wm2.c.m(l, indexOutOfBoundsException);
              ik2.k(i2 << 3);
              ik2.a(bool);
              j = i;
            } 
            break;
          case 6:
            j = i;
            if (q(indexOutOfBoundsException, i, m, k, n)) {
              ik2.c(i2, unsafe.getInt(indexOutOfBoundsException, l));
              j = i;
            } 
            break;
          case 5:
            j = i;
            if (q(indexOutOfBoundsException, i, m, k, n)) {
              ik2.e(i2, unsafe.getLong(indexOutOfBoundsException, l));
              j = i;
            } 
            break;
          case 4:
            j = i;
            if (q(indexOutOfBoundsException, i, m, k, n)) {
              ik2.g(i2, unsafe.getInt(indexOutOfBoundsException, l));
              j = i;
            } 
            break;
          case 3:
            j = i;
            if (q(indexOutOfBoundsException, i, m, k, n)) {
              ik2.l(i2, unsafe.getLong(indexOutOfBoundsException, l));
              j = i;
            } 
            break;
          case 2:
            j = i;
            if (q(indexOutOfBoundsException, i, m, k, n)) {
              ik2.l(i2, unsafe.getLong(indexOutOfBoundsException, l));
              j = i;
            } 
            break;
          case 1:
            j = i;
            if (q(indexOutOfBoundsException, i, m, k, n)) {
              ik2.c(i2, Float.floatToRawIntBits(wm2.c.c(l, indexOutOfBoundsException)));
              j = i;
            } 
            break;
          case 0:
            j = i;
            if (q(indexOutOfBoundsException, i, m, k, n)) {
              ik2.e(i2, Double.doubleToRawLongBits(wm2.c.a(l, indexOutOfBoundsException)));
              j = i;
            } 
            break;
        } 
        i = j + 3;
        j = m;
        continue;
      } 
      ((wk2)indexOutOfBoundsException).zzc.d(parama42);
      return;
    } 
  }
  
  public final void j(int paramInt, Object paramObject1, Object paramObject2) {
    if (!p(paramInt, paramObject2))
      return; 
    int i = y(paramInt);
    Unsafe unsafe = k;
    long l = (i & 0xFFFFF);
    Object object = unsafe.getObject(paramObject2, l);
    if (object != null) {
      em2 em21 = B(paramInt);
      if (!p(paramInt, paramObject1)) {
        if (!r(object)) {
          unsafe.putObject(paramObject1, l, object);
        } else {
          paramObject2 = em21.f();
          em21.c(paramObject2, object);
          unsafe.putObject(paramObject1, l, paramObject2);
        } 
        l(paramInt, paramObject1);
        return;
      } 
      Object object1 = unsafe.getObject(paramObject1, l);
      paramObject2 = object1;
      if (!r(object1)) {
        paramObject2 = em21.f();
        em21.c(paramObject2, object1);
        unsafe.putObject(paramObject1, l, paramObject2);
      } 
      em21.c(paramObject2, object);
      return;
    } 
    paramInt = this.a[paramInt];
    paramObject1 = paramObject2.toString();
    paramObject2 = new StringBuilder("Source subfield ");
    paramObject2.append(paramInt);
    paramObject2.append(" is present but null: ");
    paramObject2.append((String)paramObject1);
    throw new IllegalStateException(paramObject2.toString());
  }
  
  public final void k(int paramInt, Object paramObject1, Object paramObject2) {
    Object object2 = this.a;
    int j = object2[paramInt];
    if (!s(j, paramInt, paramObject2))
      return; 
    int i = y(paramInt);
    Unsafe unsafe = k;
    long l = (i & 0xFFFFF);
    Object object3 = unsafe.getObject(paramObject2, l);
    if (object3 != null) {
      em2 em21 = B(paramInt);
      if (!s(j, paramInt, paramObject1)) {
        if (!r(object3)) {
          unsafe.putObject(paramObject1, l, object3);
        } else {
          paramObject2 = em21.f();
          em21.c(paramObject2, object3);
          unsafe.putObject(paramObject1, l, paramObject2);
        } 
        wm2.j(paramObject1, (object2[paramInt + 2] & 0xFFFFF), j);
        return;
      } 
      object2 = unsafe.getObject(paramObject1, l);
      paramObject2 = object2;
      if (!r(object2)) {
        paramObject2 = em21.f();
        em21.c(paramObject2, object2);
        unsafe.putObject(paramObject1, l, paramObject2);
      } 
      em21.c(paramObject2, object3);
      return;
    } 
    Object object1 = object2[paramInt];
    paramObject2 = paramObject2.toString();
    paramObject1 = new StringBuilder("Source subfield ");
    paramObject1.append(object1);
    paramObject1.append(" is present but null: ");
    paramObject1.append((String)paramObject2);
    throw new IllegalStateException(paramObject1.toString());
  }
  
  public final void l(int paramInt, Object paramObject) {
    paramInt = this.a[paramInt + 2];
    long l = (0xFFFFF & paramInt);
    if (l == 1048575L)
      return; 
    wm2.j(paramObject, l, 1 << paramInt >>> 20 | wm2.e(l, paramObject));
  }
  
  public final void m(int paramInt, Object paramObject1, Object paramObject2) {
    k.putObject(paramObject1, (y(paramInt) & 0xFFFFF), paramObject2);
    l(paramInt, paramObject1);
  }
  
  public final void n(int paramInt1, int paramInt2, Object paramObject1, Object paramObject2) {
    k.putObject(paramObject1, (y(paramInt2) & 0xFFFFF), paramObject2);
    wm2.j(paramObject1, (this.a[paramInt2 + 2] & 0xFFFFF), paramInt1);
  }
  
  public final boolean o(wk2 paramwk21, wk2 paramwk22, int paramInt) {
    return (p(paramInt, paramwk21) == p(paramInt, paramwk22));
  }
  
  public final boolean p(int paramInt, Object paramObject) {
    int i = this.a[paramInt + 2];
    long l = (i & 0xFFFFF);
    if (l == 1048575L) {
      paramInt = y(paramInt);
      i = x(paramInt);
      l = (paramInt & 0xFFFFF);
      switch (i) {
        default:
          l0.k();
          return false;
        case 17:
          return (wm2.h(l, paramObject) != null);
        case 16:
          return (wm2.f(l, paramObject) != 0L);
        case 15:
          return (wm2.e(l, paramObject) != 0);
        case 14:
          return (wm2.f(l, paramObject) != 0L);
        case 13:
          return (wm2.e(l, paramObject) != 0);
        case 12:
          return (wm2.e(l, paramObject) != 0);
        case 11:
          return (wm2.e(l, paramObject) != 0);
        case 10:
          return !gk2.c.equals(wm2.h(l, paramObject));
        case 9:
          return (wm2.h(l, paramObject) != null);
        case 8:
          paramObject = wm2.h(l, paramObject);
          if (paramObject instanceof String) {
            if (!((String)paramObject).isEmpty())
              return true; 
          } else if (paramObject instanceof gk2) {
            if (!gk2.c.equals(paramObject))
              return true; 
          } else {
            l0.k();
            return false;
          } 
          return false;
        case 7:
          return wm2.c.m(l, paramObject);
        case 6:
          return (wm2.e(l, paramObject) != 0);
        case 5:
          return (wm2.f(l, paramObject) != 0L);
        case 4:
          return (wm2.e(l, paramObject) != 0);
        case 3:
          return (wm2.f(l, paramObject) != 0L);
        case 2:
          return (wm2.f(l, paramObject) != 0L);
        case 1:
          return (Float.floatToRawIntBits(wm2.c.c(l, paramObject)) != 0);
        case 0:
          break;
      } 
      if (Double.doubleToRawLongBits(wm2.c.a(l, paramObject)) != 0L)
        return true; 
    } else if ((1 << i >>> 20 & wm2.e(l, paramObject)) != 0) {
      return true;
    } 
    return false;
  }
  
  public final boolean q(Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (paramInt2 == 1048575) ? p(paramInt1, paramObject) : (((paramInt3 & paramInt4) != 0));
  }
  
  public final boolean s(int paramInt1, int paramInt2, Object paramObject) {
    return (wm2.e((this.a[paramInt2 + 2] & 0xFFFFF), paramObject) == paramInt1);
  }
  
  public final int t(Object paramObject, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, bk2 parambk2) {
    xl2 xl21 = this;
    Object object = paramObject;
    byte[] arrayOfByte = paramArrayOfbyte;
    bk2 bk21 = parambk2;
    if (r(object)) {
      Object object1;
      byte[] arrayOfByte1;
      Object[] arrayOfObject;
      int[] arrayOfInt;
      Object object2 = k;
      int i = -1;
      int j = 0;
      int k = 1048575;
      boolean bool = false;
      byte b = 0;
      while (true) {
        bk2 bk22 = parambk2;
        arrayOfByte1 = paramArrayOfbyte;
        int n = j;
        int m = i;
        while (true) {
          arrayOfByte1 = paramArrayOfbyte;
          arrayOfObject = xl21.b;
          arrayOfInt = xl21.a;
          xl22 = xl21;
          object2 = SYNTHETIC_LOCAL_VARIABLE_37;
          k = n;
          paramInt1 = m;
          xl21 = this;
          m = i;
          n = b;
          object1 = SYNTHETIC_LOCAL_VARIABLE_19;
        } 
        break;
      } 
      if (object1 != 1048575)
        object2.putInt(arrayOfByte1, object1, bool); 
      i = this.g;
      while (i < this.h) {
        int m = this.f[i];
        int n = arrayOfInt[m];
        paramObject = wm2.h((y(m) & 0xFFFFF), arrayOfByte1);
        if (paramObject == null || A(m) == null) {
          i++;
          continue;
        } 
        paramObject = paramObject;
        paramInt1 = m / 3;
        throw x41.f(arrayOfObject[paramInt1 + paramInt1]);
      } 
      if (paramInt3 == 0) {
        if (paramInt1 != paramInt2) {
          ck2.c("Failed to parse the message.");
          return 0;
        } 
      } else if (paramInt1 > paramInt2 || j != paramInt3) {
        ck2.c("Failed to parse the message.");
        return 0;
      } 
      return paramInt1;
    } 
    l0.l("Mutating immutable message: ".concat(String.valueOf(object)));
    return 0;
  }
  
  public final int w(int paramInt1, int paramInt2) {
    int[] arrayOfInt = this.a;
    int i = arrayOfInt.length / 3 - 1;
    while (paramInt2 <= i) {
      int m = i + paramInt2 >>> 1;
      int k = m * 3;
      int j = arrayOfInt[k];
      if (paramInt1 == j)
        return k; 
      if (paramInt1 < j) {
        i = m - 1;
        continue;
      } 
      paramInt2 = m + 1;
    } 
    return -1;
  }
  
  public final int y(int paramInt) {
    return this.a[paramInt + 1];
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xl2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */