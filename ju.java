import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

public abstract class ju {
  public static final ConcurrentHashMap a = new ConcurrentHashMap<Object, Object>();
  
  static {
    new AtomicReferenceArray(25);
  }
  
  public static ku a(String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual length : ()I
    //   4: ifeq -> 1445
    //   7: getstatic ju.a : Ljava/util/concurrent/ConcurrentHashMap;
    //   10: astore #12
    //   12: aload #12
    //   14: aload_0
    //   15: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   18: checkcast ku
    //   21: astore #11
    //   23: aload #11
    //   25: ifnonnull -> 1442
    //   28: new zu
    //   31: dup
    //   32: invokespecial <init> : ()V
    //   35: astore #14
    //   37: aload_0
    //   38: invokevirtual length : ()I
    //   41: istore #4
    //   43: iconst_1
    //   44: newarray int
    //   46: astore #13
    //   48: iconst_0
    //   49: istore_1
    //   50: iload_1
    //   51: iload #4
    //   53: if_icmpge -> 1403
    //   56: aload #13
    //   58: iconst_0
    //   59: iload_1
    //   60: iastore
    //   61: aload #13
    //   63: aload_0
    //   64: invokestatic b : ([ILjava/lang/String;)Ljava/lang/String;
    //   67: astore #11
    //   69: aload #13
    //   71: iconst_0
    //   72: iaload
    //   73: istore #5
    //   75: aload #11
    //   77: invokevirtual length : ()I
    //   80: istore_3
    //   81: iload_3
    //   82: ifne -> 88
    //   85: goto -> 1403
    //   88: aload #11
    //   90: iconst_0
    //   91: invokevirtual charAt : (I)C
    //   94: istore #6
    //   96: iload #6
    //   98: bipush #39
    //   100: if_icmpeq -> 1350
    //   103: iload #6
    //   105: bipush #75
    //   107: if_icmpeq -> 1337
    //   110: iload #6
    //   112: bipush #77
    //   114: if_icmpeq -> 1284
    //   117: iload #6
    //   119: bipush #83
    //   121: if_icmpeq -> 1271
    //   124: iload #6
    //   126: bipush #97
    //   128: if_icmpeq -> 1260
    //   131: iload #6
    //   133: bipush #104
    //   135: if_icmpeq -> 1247
    //   138: iload #6
    //   140: bipush #107
    //   142: if_icmpeq -> 1234
    //   145: iload #6
    //   147: bipush #109
    //   149: if_icmpeq -> 1221
    //   152: iload #6
    //   154: bipush #115
    //   156: if_icmpeq -> 1208
    //   159: iload #6
    //   161: bipush #71
    //   163: if_icmpeq -> 1197
    //   166: iload #6
    //   168: bipush #72
    //   170: if_icmpeq -> 1184
    //   173: iload #6
    //   175: bipush #89
    //   177: if_icmpeq -> 483
    //   180: iload #6
    //   182: bipush #90
    //   184: if_icmpeq -> 416
    //   187: iload #6
    //   189: bipush #100
    //   191: if_icmpeq -> 403
    //   194: iload #6
    //   196: bipush #101
    //   198: if_icmpeq -> 390
    //   201: iload #6
    //   203: tableswitch default -> 228, 67 -> 377, 68 -> 364, 69 -> 329
    //   228: iload #6
    //   230: tableswitch default -> 260, 119 -> 316, 120 -> 483, 121 -> 483, 122 -> 272
    //   260: ldc 'Illegal pattern component: '
    //   262: aload #11
    //   264: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   267: invokestatic l : (Ljava/lang/String;)V
    //   270: aconst_null
    //   271: areturn
    //   272: iload_3
    //   273: iconst_4
    //   274: if_icmplt -> 294
    //   277: aload #14
    //   279: new vu
    //   282: dup
    //   283: iconst_0
    //   284: invokespecial <init> : (I)V
    //   287: aconst_null
    //   288: invokevirtual d : (Lti0;Lri0;)V
    //   291: goto -> 1395
    //   294: new vu
    //   297: dup
    //   298: iconst_1
    //   299: invokespecial <init> : (I)V
    //   302: astore #11
    //   304: aload #14
    //   306: aload #11
    //   308: aload #11
    //   310: invokevirtual d : (Lti0;Lri0;)V
    //   313: goto -> 1395
    //   316: aload #14
    //   318: getstatic iu.p : Liu;
    //   321: iload_3
    //   322: iconst_2
    //   323: invokevirtual f : (Liu;II)V
    //   326: goto -> 1395
    //   329: iload_3
    //   330: iconst_4
    //   331: if_icmplt -> 345
    //   334: aload #14
    //   336: getstatic iu.q : Liu;
    //   339: invokevirtual m : (Liu;)V
    //   342: goto -> 1395
    //   345: aload #14
    //   347: new tu
    //   350: dup
    //   351: getstatic iu.q : Liu;
    //   354: iconst_1
    //   355: invokespecial <init> : (Liu;Z)V
    //   358: invokevirtual e : (Ljava/lang/Object;)V
    //   361: goto -> 1395
    //   364: aload #14
    //   366: getstatic iu.k : Liu;
    //   369: iload_3
    //   370: iconst_3
    //   371: invokevirtual f : (Liu;II)V
    //   374: goto -> 1395
    //   377: aload #14
    //   379: getstatic iu.h : Liu;
    //   382: iload_3
    //   383: iload_3
    //   384: invokevirtual l : (Liu;II)V
    //   387: goto -> 1395
    //   390: aload #14
    //   392: getstatic iu.q : Liu;
    //   395: iload_3
    //   396: iconst_1
    //   397: invokevirtual f : (Liu;II)V
    //   400: goto -> 1395
    //   403: aload #14
    //   405: getstatic iu.m : Liu;
    //   408: iload_3
    //   409: iconst_2
    //   410: invokevirtual f : (Liu;II)V
    //   413: goto -> 1395
    //   416: iload_3
    //   417: iconst_1
    //   418: if_icmpne -> 441
    //   421: aload #14
    //   423: new wu
    //   426: dup
    //   427: aconst_null
    //   428: iconst_2
    //   429: ldc 'Z'
    //   431: iconst_0
    //   432: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;Z)V
    //   435: invokevirtual e : (Ljava/lang/Object;)V
    //   438: goto -> 1395
    //   441: iload_3
    //   442: iconst_2
    //   443: if_icmpne -> 466
    //   446: aload #14
    //   448: new wu
    //   451: dup
    //   452: aconst_null
    //   453: iconst_2
    //   454: ldc 'Z'
    //   456: iconst_1
    //   457: invokespecial <init> : (Ljava/lang/String;ILjava/lang/String;Z)V
    //   460: invokevirtual e : (Ljava/lang/Object;)V
    //   463: goto -> 1395
    //   466: getstatic uu.b : Luu;
    //   469: astore #11
    //   471: aload #14
    //   473: aload #11
    //   475: aload #11
    //   477: invokevirtual d : (Lti0;Lri0;)V
    //   480: goto -> 1395
    //   483: iload_3
    //   484: iconst_2
    //   485: if_icmpne -> 881
    //   488: iload #5
    //   490: iconst_1
    //   491: iadd
    //   492: iload #4
    //   494: if_icmpge -> 725
    //   497: aload #13
    //   499: iconst_0
    //   500: aload #13
    //   502: iconst_0
    //   503: iaload
    //   504: iconst_1
    //   505: iadd
    //   506: iastore
    //   507: aload #13
    //   509: aload_0
    //   510: invokestatic b : ([ILjava/lang/String;)Ljava/lang/String;
    //   513: astore #11
    //   515: aload #11
    //   517: invokevirtual length : ()I
    //   520: istore_1
    //   521: iload_1
    //   522: ifle -> 705
    //   525: aload #11
    //   527: iconst_0
    //   528: invokevirtual charAt : (I)C
    //   531: lookupswitch default -> 692, 67 -> 700, 68 -> 700, 70 -> 700, 72 -> 700, 75 -> 700, 77 -> 695, 83 -> 700, 87 -> 700, 89 -> 700, 99 -> 700, 100 -> 700, 101 -> 700, 104 -> 700, 107 -> 700, 109 -> 700, 115 -> 700, 119 -> 700, 120 -> 700, 121 -> 700
    //   692: goto -> 705
    //   695: iload_1
    //   696: iconst_2
    //   697: if_icmpgt -> 705
    //   700: iconst_1
    //   701: istore_1
    //   702: goto -> 707
    //   705: iconst_0
    //   706: istore_1
    //   707: iload_1
    //   708: iconst_1
    //   709: ixor
    //   710: istore #8
    //   712: aload #13
    //   714: iconst_0
    //   715: aload #13
    //   717: iconst_0
    //   718: iaload
    //   719: iconst_1
    //   720: isub
    //   721: iastore
    //   722: goto -> 728
    //   725: iconst_1
    //   726: istore #8
    //   728: iload #6
    //   730: bipush #120
    //   732: if_icmpeq -> 808
    //   735: getstatic ev.a : Ljava/util/concurrent/atomic/AtomicReference;
    //   738: astore #11
    //   740: invokestatic currentTimeMillis : ()J
    //   743: lstore #9
    //   745: invokestatic T0 : ()Lxg0;
    //   748: astore #11
    //   750: lload #9
    //   752: ldc2_w -9223372036854775808
    //   755: lcmp
    //   756: ifeq -> 768
    //   759: lload #9
    //   761: ldc2_w 9223372036854775807
    //   764: lcmp
    //   765: ifne -> 773
    //   768: getstatic xg0.b0 : Lxg0;
    //   771: astore #11
    //   773: aload #11
    //   775: getfield V : Lhu;
    //   778: lload #9
    //   780: invokevirtual b : (J)I
    //   783: istore_1
    //   784: aload #14
    //   786: new xu
    //   789: dup
    //   790: getstatic iu.j : Liu;
    //   793: iload_1
    //   794: bipush #30
    //   796: isub
    //   797: iload #8
    //   799: invokespecial <init> : (Liu;IZ)V
    //   802: invokevirtual e : (Ljava/lang/Object;)V
    //   805: goto -> 1395
    //   808: getstatic ev.a : Ljava/util/concurrent/atomic/AtomicReference;
    //   811: astore #11
    //   813: invokestatic currentTimeMillis : ()J
    //   816: lstore #9
    //   818: invokestatic T0 : ()Lxg0;
    //   821: astore #11
    //   823: lload #9
    //   825: ldc2_w -9223372036854775808
    //   828: lcmp
    //   829: ifeq -> 841
    //   832: lload #9
    //   834: ldc2_w 9223372036854775807
    //   837: lcmp
    //   838: ifne -> 846
    //   841: getstatic xg0.b0 : Lxg0;
    //   844: astore #11
    //   846: aload #11
    //   848: getfield S : Lhu;
    //   851: lload #9
    //   853: invokevirtual b : (J)I
    //   856: istore_1
    //   857: aload #14
    //   859: new xu
    //   862: dup
    //   863: getstatic iu.o : Liu;
    //   866: iload_1
    //   867: bipush #30
    //   869: isub
    //   870: iload #8
    //   872: invokespecial <init> : (Liu;IZ)V
    //   875: invokevirtual e : (Ljava/lang/Object;)V
    //   878: goto -> 1395
    //   881: bipush #9
    //   883: istore_2
    //   884: iload_2
    //   885: istore_1
    //   886: iload #5
    //   888: iconst_1
    //   889: iadd
    //   890: iload #4
    //   892: if_icmpge -> 1121
    //   895: aload #13
    //   897: iconst_0
    //   898: aload #13
    //   900: iconst_0
    //   901: iaload
    //   902: iconst_1
    //   903: iadd
    //   904: iastore
    //   905: aload #13
    //   907: aload_0
    //   908: invokestatic b : ([ILjava/lang/String;)Ljava/lang/String;
    //   911: astore #11
    //   913: aload #11
    //   915: invokevirtual length : ()I
    //   918: istore #7
    //   920: iload_2
    //   921: istore_1
    //   922: iload #7
    //   924: ifle -> 1111
    //   927: aload #11
    //   929: iconst_0
    //   930: invokevirtual charAt : (I)C
    //   933: lookupswitch default -> 1096, 67 -> 1109, 68 -> 1109, 70 -> 1109, 72 -> 1109, 75 -> 1109, 77 -> 1101, 83 -> 1109, 87 -> 1109, 89 -> 1109, 99 -> 1109, 100 -> 1109, 101 -> 1109, 104 -> 1109, 107 -> 1109, 109 -> 1109, 115 -> 1109, 119 -> 1109, 120 -> 1109, 121 -> 1109
    //   1096: iload_2
    //   1097: istore_1
    //   1098: goto -> 1111
    //   1101: iload_2
    //   1102: istore_1
    //   1103: iload #7
    //   1105: iconst_2
    //   1106: if_icmpgt -> 1111
    //   1109: iload_3
    //   1110: istore_1
    //   1111: aload #13
    //   1113: iconst_0
    //   1114: aload #13
    //   1116: iconst_0
    //   1117: iaload
    //   1118: iconst_1
    //   1119: isub
    //   1120: iastore
    //   1121: iload #6
    //   1123: bipush #89
    //   1125: if_icmpeq -> 1171
    //   1128: iload #6
    //   1130: bipush #120
    //   1132: if_icmpeq -> 1158
    //   1135: iload #6
    //   1137: bipush #121
    //   1139: if_icmpeq -> 1145
    //   1142: goto -> 1395
    //   1145: aload #14
    //   1147: getstatic iu.j : Liu;
    //   1150: iload_3
    //   1151: iload_1
    //   1152: invokevirtual l : (Liu;II)V
    //   1155: goto -> 1395
    //   1158: aload #14
    //   1160: getstatic iu.o : Liu;
    //   1163: iload_3
    //   1164: iload_1
    //   1165: invokevirtual l : (Liu;II)V
    //   1168: goto -> 1395
    //   1171: aload #14
    //   1173: getstatic iu.g : Liu;
    //   1176: iload_3
    //   1177: iload_1
    //   1178: invokevirtual f : (Liu;II)V
    //   1181: goto -> 1395
    //   1184: aload #14
    //   1186: getstatic iu.v : Liu;
    //   1189: iload_3
    //   1190: iconst_2
    //   1191: invokevirtual f : (Liu;II)V
    //   1194: goto -> 1395
    //   1197: aload #14
    //   1199: getstatic iu.f : Liu;
    //   1202: invokevirtual m : (Liu;)V
    //   1205: goto -> 1395
    //   1208: aload #14
    //   1210: getstatic iu.z : Liu;
    //   1213: iload_3
    //   1214: iconst_2
    //   1215: invokevirtual f : (Liu;II)V
    //   1218: goto -> 1395
    //   1221: aload #14
    //   1223: getstatic iu.x : Liu;
    //   1226: iload_3
    //   1227: iconst_2
    //   1228: invokevirtual f : (Liu;II)V
    //   1231: goto -> 1395
    //   1234: aload #14
    //   1236: getstatic iu.u : Liu;
    //   1239: iload_3
    //   1240: iconst_2
    //   1241: invokevirtual f : (Liu;II)V
    //   1244: goto -> 1395
    //   1247: aload #14
    //   1249: getstatic iu.t : Liu;
    //   1252: iload_3
    //   1253: iconst_2
    //   1254: invokevirtual f : (Liu;II)V
    //   1257: goto -> 1395
    //   1260: aload #14
    //   1262: getstatic iu.r : Liu;
    //   1265: invokevirtual m : (Liu;)V
    //   1268: goto -> 1395
    //   1271: aload #14
    //   1273: getstatic iu.y : Liu;
    //   1276: iload_3
    //   1277: iload_3
    //   1278: invokevirtual h : (Liu;II)V
    //   1281: goto -> 1395
    //   1284: iload_3
    //   1285: iconst_3
    //   1286: if_icmplt -> 1324
    //   1289: iload_3
    //   1290: iconst_4
    //   1291: if_icmplt -> 1305
    //   1294: aload #14
    //   1296: getstatic iu.l : Liu;
    //   1299: invokevirtual m : (Liu;)V
    //   1302: goto -> 1395
    //   1305: aload #14
    //   1307: new tu
    //   1310: dup
    //   1311: getstatic iu.l : Liu;
    //   1314: iconst_1
    //   1315: invokespecial <init> : (Liu;Z)V
    //   1318: invokevirtual e : (Ljava/lang/Object;)V
    //   1321: goto -> 1395
    //   1324: aload #14
    //   1326: getstatic iu.l : Liu;
    //   1329: iload_3
    //   1330: iconst_2
    //   1331: invokevirtual f : (Liu;II)V
    //   1334: goto -> 1395
    //   1337: aload #14
    //   1339: getstatic iu.s : Liu;
    //   1342: iload_3
    //   1343: iconst_2
    //   1344: invokevirtual f : (Liu;II)V
    //   1347: goto -> 1395
    //   1350: aload #11
    //   1352: iconst_1
    //   1353: invokevirtual substring : (I)Ljava/lang/String;
    //   1356: astore #11
    //   1358: aload #11
    //   1360: invokevirtual length : ()I
    //   1363: iconst_1
    //   1364: if_icmpne -> 1381
    //   1367: aload #14
    //   1369: aload #11
    //   1371: iconst_0
    //   1372: invokevirtual charAt : (I)C
    //   1375: invokevirtual i : (C)V
    //   1378: goto -> 1395
    //   1381: aload #14
    //   1383: new java/lang/String
    //   1386: dup
    //   1387: aload #11
    //   1389: invokespecial <init> : (Ljava/lang/String;)V
    //   1392: invokevirtual j : (Ljava/lang/String;)V
    //   1395: iload #5
    //   1397: iconst_1
    //   1398: iadd
    //   1399: istore_1
    //   1400: goto -> 50
    //   1403: aload #14
    //   1405: invokevirtual r : ()Lku;
    //   1408: astore #11
    //   1410: aload #12
    //   1412: invokevirtual size : ()I
    //   1415: sipush #500
    //   1418: if_icmpge -> 1439
    //   1421: aload #12
    //   1423: aload_0
    //   1424: aload #11
    //   1426: invokevirtual putIfAbsent : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1429: checkcast ku
    //   1432: astore_0
    //   1433: aload_0
    //   1434: ifnull -> 1439
    //   1437: aload_0
    //   1438: areturn
    //   1439: aload #11
    //   1441: areturn
    //   1442: aload #11
    //   1444: areturn
    //   1445: ldc 'Invalid pattern specification'
    //   1447: invokestatic l : (Ljava/lang/String;)V
    //   1450: aconst_null
    //   1451: areturn
  }
  
  public static String b(int[] paramArrayOfint, String paramString) {
    int j;
    StringBuilder stringBuilder = new StringBuilder();
    int i = paramArrayOfint[0];
    int k = paramString.length();
    char c = paramString.charAt(i);
    if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
      stringBuilder.append(c);
      while (true) {
        int m = i + 1;
        j = i;
        if (m < k) {
          j = i;
          if (paramString.charAt(m) == c) {
            stringBuilder.append(c);
            i = m;
            continue;
          } 
        } 
        break;
      } 
    } else {
      stringBuilder.append('\'');
      int m = 0;
      while (true) {
        j = i;
        if (i < k) {
          c = paramString.charAt(i);
          if (c == '\'') {
            j = i + 1;
            if (j < k && paramString.charAt(j) == '\'') {
              stringBuilder.append(c);
              i = j;
            } else {
              m ^= 0x1;
            } 
          } else {
            if (m == 0 && ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))) {
              j = i - 1;
              break;
            } 
            stringBuilder.append(c);
          } 
          i++;
          continue;
        } 
        break;
      } 
    } 
    paramArrayOfint[0] = j;
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ju.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */