import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public abstract class in {
  public static final ThreadLocal a = new ThreadLocal();
  
  public static ColorStateList a(Resources paramResources, XmlResourceParser paramXmlResourceParser, Resources.Theme paramTheme) {
    int i;
    AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)paramXmlResourceParser);
    while (true) {
      i = paramXmlResourceParser.next();
      if (i != 2 && i != 1)
        continue; 
      break;
    } 
    if (i == 2)
      return b(paramResources, (XmlPullParser)paramXmlResourceParser, attributeSet, paramTheme); 
    throw new XmlPullParserException("No start tag found");
  }
  
  public static ColorStateList b(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme) {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface getName : ()Ljava/lang/String;
    //   6: astore #29
    //   8: aload #29
    //   10: getstatic com/google/android/gms/common/util/DyJ/oXrNDUqUkE.XAHGqu : Ljava/lang/String;
    //   13: invokevirtual equals : (Ljava/lang/Object;)Z
    //   16: ifeq -> 1402
    //   19: aload_1
    //   20: invokeinterface getDepth : ()I
    //   25: istore #20
    //   27: iconst_1
    //   28: istore #21
    //   30: iinc #20, 1
    //   33: bipush #20
    //   35: anewarray [I
    //   38: astore #30
    //   40: bipush #20
    //   42: newarray int
    //   44: astore #32
    //   46: iconst_0
    //   47: istore #23
    //   49: aload_1
    //   50: invokeinterface next : ()I
    //   55: istore #24
    //   57: iload #24
    //   59: iload #21
    //   61: if_icmpeq -> 1361
    //   64: aload_1
    //   65: invokeinterface getDepth : ()I
    //   70: istore #22
    //   72: iload #22
    //   74: iload #20
    //   76: if_icmpge -> 85
    //   79: iload #24
    //   81: iconst_3
    //   82: if_icmpeq -> 1361
    //   85: iload #24
    //   87: iconst_2
    //   88: if_icmpne -> 112
    //   91: iload #22
    //   93: iload #20
    //   95: if_icmpgt -> 112
    //   98: aload_1
    //   99: invokeinterface getName : ()Ljava/lang/String;
    //   104: ldc 'item'
    //   106: invokevirtual equals : (Ljava/lang/Object;)Z
    //   109: ifne -> 115
    //   112: goto -> 1358
    //   115: getstatic hc1.a : [I
    //   118: astore #29
    //   120: aload_3
    //   121: ifnonnull -> 136
    //   124: aload_0
    //   125: aload_2
    //   126: aload #29
    //   128: invokevirtual obtainAttributes : (Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
    //   131: astore #29
    //   133: goto -> 147
    //   136: aload_3
    //   137: aload_2
    //   138: aload #29
    //   140: iconst_0
    //   141: iconst_0
    //   142: invokevirtual obtainStyledAttributes : (Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
    //   145: astore #29
    //   147: aload #29
    //   149: iconst_0
    //   150: iconst_m1
    //   151: invokevirtual getResourceId : (II)I
    //   154: istore #24
    //   156: iload #24
    //   158: iconst_m1
    //   159: if_icmpeq -> 269
    //   162: getstatic in.a : Ljava/lang/ThreadLocal;
    //   165: astore #33
    //   167: aload #33
    //   169: invokevirtual get : ()Ljava/lang/Object;
    //   172: checkcast android/util/TypedValue
    //   175: astore #31
    //   177: aload #31
    //   179: ifnonnull -> 201
    //   182: new android/util/TypedValue
    //   185: dup
    //   186: invokespecial <init> : ()V
    //   189: astore #31
    //   191: aload #33
    //   193: aload #31
    //   195: invokevirtual set : (Ljava/lang/Object;)V
    //   198: goto -> 201
    //   201: aload_0
    //   202: iload #24
    //   204: aload #31
    //   206: iload #21
    //   208: invokevirtual getValue : (ILandroid/util/TypedValue;Z)V
    //   211: aload #31
    //   213: getfield type : I
    //   216: istore #22
    //   218: iload #22
    //   220: bipush #28
    //   222: if_icmplt -> 235
    //   225: iload #22
    //   227: bipush #31
    //   229: if_icmpgt -> 235
    //   232: goto -> 269
    //   235: aload_0
    //   236: aload_0
    //   237: iload #24
    //   239: invokevirtual getXml : (I)Landroid/content/res/XmlResourceParser;
    //   242: aload_3
    //   243: invokestatic a : (Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;
    //   246: invokevirtual getDefaultColor : ()I
    //   249: istore #22
    //   251: goto -> 279
    //   254: astore #31
    //   256: aload #29
    //   258: iconst_0
    //   259: ldc -65281
    //   261: invokevirtual getColor : (II)I
    //   264: istore #22
    //   266: goto -> 279
    //   269: aload #29
    //   271: iconst_0
    //   272: ldc -65281
    //   274: invokevirtual getColor : (II)I
    //   277: istore #22
    //   279: aload #29
    //   281: iload #21
    //   283: invokevirtual hasValue : (I)Z
    //   286: ifeq -> 302
    //   289: aload #29
    //   291: iload #21
    //   293: fconst_1
    //   294: invokevirtual getFloat : (IF)F
    //   297: fstore #4
    //   299: goto -> 326
    //   302: aload #29
    //   304: iconst_3
    //   305: invokevirtual hasValue : (I)Z
    //   308: ifeq -> 323
    //   311: aload #29
    //   313: iconst_3
    //   314: fconst_1
    //   315: invokevirtual getFloat : (IF)F
    //   318: fstore #4
    //   320: goto -> 326
    //   323: fconst_1
    //   324: fstore #4
    //   326: getstatic android/os/Build$VERSION.SDK_INT : I
    //   329: bipush #31
    //   331: if_icmplt -> 356
    //   334: aload #29
    //   336: iconst_2
    //   337: invokevirtual hasValue : (I)Z
    //   340: ifeq -> 356
    //   343: aload #29
    //   345: iconst_2
    //   346: ldc -1.0
    //   348: invokevirtual getFloat : (IF)F
    //   351: fstore #6
    //   353: goto -> 366
    //   356: aload #29
    //   358: iconst_4
    //   359: ldc -1.0
    //   361: invokevirtual getFloat : (IF)F
    //   364: fstore #6
    //   366: aload #29
    //   368: invokevirtual recycle : ()V
    //   371: aload_2
    //   372: invokeinterface getAttributeCount : ()I
    //   377: istore #28
    //   379: iload #28
    //   381: newarray int
    //   383: astore #29
    //   385: iconst_0
    //   386: istore #24
    //   388: iconst_0
    //   389: istore #25
    //   391: iload #24
    //   393: iload #28
    //   395: if_icmpge -> 499
    //   398: aload_2
    //   399: iload #24
    //   401: invokeinterface getAttributeNameResource : (I)I
    //   406: istore #27
    //   408: iload #25
    //   410: istore #26
    //   412: iload #27
    //   414: ldc 16843173
    //   416: if_icmpeq -> 489
    //   419: iload #25
    //   421: istore #26
    //   423: iload #27
    //   425: ldc 16843551
    //   427: if_icmpeq -> 489
    //   430: iload #25
    //   432: istore #26
    //   434: iload #27
    //   436: ldc 2130968630
    //   438: if_icmpeq -> 489
    //   441: iload #25
    //   443: istore #26
    //   445: iload #27
    //   447: ldc 2130969399
    //   449: if_icmpeq -> 489
    //   452: aload_2
    //   453: iload #24
    //   455: iconst_0
    //   456: invokeinterface getAttributeBooleanValue : (IZ)Z
    //   461: ifeq -> 471
    //   464: iload #27
    //   466: istore #26
    //   468: goto -> 476
    //   471: iload #27
    //   473: ineg
    //   474: istore #26
    //   476: aload #29
    //   478: iload #25
    //   480: iload #26
    //   482: iastore
    //   483: iload #25
    //   485: iconst_1
    //   486: iadd
    //   487: istore #26
    //   489: iinc #24, 1
    //   492: iload #26
    //   494: istore #25
    //   496: goto -> 391
    //   499: aload #29
    //   501: iload #25
    //   503: invokestatic trimStateSet : ([II)[I
    //   506: astore #29
    //   508: ldc 100.0
    //   510: fstore #5
    //   512: fload #6
    //   514: fconst_0
    //   515: fcmpl
    //   516: iflt -> 534
    //   519: fload #6
    //   521: ldc 100.0
    //   523: fcmpg
    //   524: ifgt -> 534
    //   527: iload #21
    //   529: istore #24
    //   531: goto -> 537
    //   534: iconst_0
    //   535: istore #24
    //   537: fload #4
    //   539: fconst_1
    //   540: fcmpl
    //   541: ifne -> 552
    //   544: iload #24
    //   546: ifne -> 552
    //   549: goto -> 1200
    //   552: iload #22
    //   554: invokestatic alpha : (I)I
    //   557: i2f
    //   558: fload #4
    //   560: fmul
    //   561: ldc 0.5
    //   563: fadd
    //   564: f2i
    //   565: iconst_0
    //   566: sipush #255
    //   569: invokestatic i : (III)I
    //   572: istore #25
    //   574: iload #24
    //   576: ifeq -> 1182
    //   579: iload #22
    //   581: invokestatic a : (I)Lfi;
    //   584: astore #31
    //   586: aload #31
    //   588: getfield a : F
    //   591: fstore #4
    //   593: aload #31
    //   595: getfield b : F
    //   598: fstore #9
    //   600: getstatic k42.k : Lk42;
    //   603: astore #35
    //   605: fload #9
    //   607: f2d
    //   608: dconst_1
    //   609: dcmpg
    //   610: iflt -> 637
    //   613: fload #6
    //   615: invokestatic round : (F)I
    //   618: i2d
    //   619: dconst_0
    //   620: dcmpg
    //   621: ifle -> 637
    //   624: fload #6
    //   626: invokestatic round : (F)I
    //   629: i2d
    //   630: ldc2_w 100.0
    //   633: dcmpl
    //   634: iflt -> 644
    //   637: iload #20
    //   639: istore #22
    //   641: goto -> 1172
    //   644: fload #4
    //   646: fconst_0
    //   647: fcmpg
    //   648: ifge -> 657
    //   651: fconst_0
    //   652: fstore #7
    //   654: goto -> 666
    //   657: ldc 360.0
    //   659: fload #4
    //   661: invokestatic min : (FF)F
    //   664: fstore #7
    //   666: fconst_0
    //   667: fstore #8
    //   669: fload #9
    //   671: fstore #4
    //   673: iload #21
    //   675: istore #24
    //   677: aconst_null
    //   678: astore #33
    //   680: fload #8
    //   682: fload #9
    //   684: fsub
    //   685: invokestatic abs : (F)F
    //   688: ldc 0.4
    //   690: fcmpl
    //   691: iflt -> 1141
    //   694: ldc 1000.0
    //   696: fstore #13
    //   698: fload #5
    //   700: fstore #10
    //   702: fconst_0
    //   703: fstore #11
    //   705: ldc 1000.0
    //   707: fstore #12
    //   709: aconst_null
    //   710: astore #31
    //   712: fload #11
    //   714: fload #10
    //   716: fsub
    //   717: invokestatic abs : (F)F
    //   720: ldc 0.01
    //   722: fcmpl
    //   723: ifle -> 1047
    //   726: fload #10
    //   728: fload #11
    //   730: fsub
    //   731: fconst_2
    //   732: fdiv
    //   733: fstore #14
    //   735: fload #14
    //   737: fload #11
    //   739: fadd
    //   740: fstore #14
    //   742: fload #14
    //   744: fload #4
    //   746: fload #7
    //   748: invokestatic b : (FFF)Lfi;
    //   751: getstatic k42.k : Lk42;
    //   754: invokevirtual c : (Lk42;)I
    //   757: istore #22
    //   759: iload #22
    //   761: invokestatic red : (I)I
    //   764: invokestatic Q : (I)F
    //   767: fstore #19
    //   769: iload #22
    //   771: invokestatic green : (I)I
    //   774: invokestatic Q : (I)F
    //   777: fstore #16
    //   779: iload #22
    //   781: invokestatic blue : (I)I
    //   784: invokestatic Q : (I)F
    //   787: fstore #15
    //   789: getstatic g92.d : [[F
    //   792: iload #21
    //   794: aaload
    //   795: astore #34
    //   797: aload #34
    //   799: iconst_0
    //   800: faload
    //   801: fstore #18
    //   803: aload #34
    //   805: iload #21
    //   807: faload
    //   808: fstore #17
    //   810: fload #15
    //   812: aload #34
    //   814: iconst_2
    //   815: faload
    //   816: fmul
    //   817: fload #16
    //   819: fload #17
    //   821: fmul
    //   822: fload #19
    //   824: fload #18
    //   826: fmul
    //   827: fadd
    //   828: fadd
    //   829: fload #5
    //   831: fdiv
    //   832: fstore #15
    //   834: fload #15
    //   836: ldc 0.008856452
    //   838: fcmpg
    //   839: ifgt -> 852
    //   842: fload #15
    //   844: ldc 903.2963
    //   846: fmul
    //   847: fstore #15
    //   849: goto -> 867
    //   852: fload #15
    //   854: f2d
    //   855: invokestatic cbrt : (D)D
    //   858: d2f
    //   859: ldc 116.0
    //   861: fmul
    //   862: ldc 16.0
    //   864: fsub
    //   865: fstore #15
    //   867: fload #6
    //   869: fload #15
    //   871: fsub
    //   872: invokestatic abs : (F)F
    //   875: fstore #16
    //   877: fload #16
    //   879: ldc 0.2
    //   881: fcmpg
    //   882: ifge -> 1004
    //   885: iload #22
    //   887: invokestatic a : (I)Lfi;
    //   890: astore #34
    //   892: aload #34
    //   894: getfield c : F
    //   897: aload #34
    //   899: getfield b : F
    //   902: fload #7
    //   904: invokestatic b : (FFF)Lfi;
    //   907: astore #36
    //   909: aload #34
    //   911: getfield d : F
    //   914: aload #36
    //   916: getfield d : F
    //   919: fsub
    //   920: fstore #18
    //   922: aload #34
    //   924: getfield e : F
    //   927: aload #36
    //   929: getfield e : F
    //   932: fsub
    //   933: fstore #17
    //   935: aload #34
    //   937: getfield f : F
    //   940: aload #36
    //   942: getfield f : F
    //   945: fsub
    //   946: fstore #19
    //   948: fload #19
    //   950: fload #19
    //   952: fmul
    //   953: fload #17
    //   955: fload #17
    //   957: fmul
    //   958: fload #18
    //   960: fload #18
    //   962: fmul
    //   963: fadd
    //   964: fadd
    //   965: f2d
    //   966: invokestatic sqrt : (D)D
    //   969: ldc2_w 0.63
    //   972: invokestatic pow : (DD)D
    //   975: ldc2_w 1.41
    //   978: dmul
    //   979: d2f
    //   980: fstore #17
    //   982: fload #17
    //   984: fconst_1
    //   985: fcmpg
    //   986: ifgt -> 1004
    //   989: fload #17
    //   991: fstore #12
    //   993: fload #16
    //   995: fstore #13
    //   997: aload #34
    //   999: astore #31
    //   1001: goto -> 1004
    //   1004: fload #13
    //   1006: fconst_0
    //   1007: fcmpl
    //   1008: ifne -> 1025
    //   1011: fload #12
    //   1013: fconst_0
    //   1014: fcmpl
    //   1015: ifne -> 1025
    //   1018: iload #20
    //   1020: istore #22
    //   1022: goto -> 1050
    //   1025: fload #15
    //   1027: fload #6
    //   1029: fcmpg
    //   1030: ifge -> 1040
    //   1033: fload #14
    //   1035: fstore #11
    //   1037: goto -> 1044
    //   1040: fload #14
    //   1042: fstore #10
    //   1044: goto -> 712
    //   1047: goto -> 1018
    //   1050: iload #24
    //   1052: ifeq -> 1102
    //   1055: aload #31
    //   1057: ifnull -> 1080
    //   1060: aload #31
    //   1062: aload #35
    //   1064: invokevirtual c : (Lk42;)I
    //   1067: istore #20
    //   1069: iload #20
    //   1071: istore #24
    //   1073: iload #22
    //   1075: istore #20
    //   1077: goto -> 1186
    //   1080: fload #9
    //   1082: fload #8
    //   1084: fsub
    //   1085: fconst_2
    //   1086: fdiv
    //   1087: fload #8
    //   1089: fadd
    //   1090: fstore #4
    //   1092: iload #22
    //   1094: istore #20
    //   1096: iconst_0
    //   1097: istore #24
    //   1099: goto -> 680
    //   1102: aload #31
    //   1104: ifnonnull -> 1114
    //   1107: fload #4
    //   1109: fstore #9
    //   1111: goto -> 1122
    //   1114: fload #4
    //   1116: fstore #8
    //   1118: aload #31
    //   1120: astore #33
    //   1122: fload #9
    //   1124: fload #8
    //   1126: fsub
    //   1127: fconst_2
    //   1128: fdiv
    //   1129: fload #8
    //   1131: fadd
    //   1132: fstore #4
    //   1134: iload #22
    //   1136: istore #20
    //   1138: goto -> 680
    //   1141: iload #20
    //   1143: istore #22
    //   1145: aload #33
    //   1147: ifnonnull -> 1160
    //   1150: fload #6
    //   1152: invokestatic L : (F)I
    //   1155: istore #20
    //   1157: goto -> 1069
    //   1160: aload #33
    //   1162: aload #35
    //   1164: invokevirtual c : (Lk42;)I
    //   1167: istore #20
    //   1169: goto -> 1069
    //   1172: fload #6
    //   1174: invokestatic L : (F)I
    //   1177: istore #20
    //   1179: goto -> 1069
    //   1182: iload #22
    //   1184: istore #24
    //   1186: ldc_w 16777215
    //   1189: iload #24
    //   1191: iand
    //   1192: iload #25
    //   1194: bipush #24
    //   1196: ishl
    //   1197: ior
    //   1198: istore #22
    //   1200: iload #23
    //   1202: iconst_1
    //   1203: iadd
    //   1204: istore #25
    //   1206: aload #32
    //   1208: arraylength
    //   1209: istore #24
    //   1211: bipush #8
    //   1213: istore #26
    //   1215: aload #32
    //   1217: astore #31
    //   1219: iload #25
    //   1221: iload #24
    //   1223: if_icmple -> 1262
    //   1226: iload #23
    //   1228: iconst_4
    //   1229: if_icmpgt -> 1239
    //   1232: bipush #8
    //   1234: istore #24
    //   1236: goto -> 1245
    //   1239: iload #23
    //   1241: iconst_2
    //   1242: imul
    //   1243: istore #24
    //   1245: iload #24
    //   1247: newarray int
    //   1249: astore #31
    //   1251: aload #32
    //   1253: iconst_0
    //   1254: aload #31
    //   1256: iconst_0
    //   1257: iload #23
    //   1259: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1262: aload #31
    //   1264: iload #23
    //   1266: iload #22
    //   1268: iastore
    //   1269: aload #30
    //   1271: astore #32
    //   1273: iload #25
    //   1275: aload #30
    //   1277: arraylength
    //   1278: if_icmple -> 1333
    //   1281: aload #30
    //   1283: invokevirtual getClass : ()Ljava/lang/Class;
    //   1286: invokevirtual getComponentType : ()Ljava/lang/Class;
    //   1289: astore #32
    //   1291: iload #23
    //   1293: iconst_4
    //   1294: if_icmpgt -> 1304
    //   1297: iload #26
    //   1299: istore #22
    //   1301: goto -> 1310
    //   1304: iload #23
    //   1306: iconst_2
    //   1307: imul
    //   1308: istore #22
    //   1310: aload #32
    //   1312: iload #22
    //   1314: invokestatic newInstance : (Ljava/lang/Class;I)Ljava/lang/Object;
    //   1317: checkcast [Ljava/lang/Object;
    //   1320: astore #32
    //   1322: aload #30
    //   1324: iconst_0
    //   1325: aload #32
    //   1327: iconst_0
    //   1328: iload #23
    //   1330: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1333: aload #32
    //   1335: iload #23
    //   1337: aload #29
    //   1339: aastore
    //   1340: aload #32
    //   1342: checkcast [[I
    //   1345: astore #30
    //   1347: iload #25
    //   1349: istore #23
    //   1351: aload #31
    //   1353: astore #32
    //   1355: goto -> 49
    //   1358: goto -> 49
    //   1361: iload #23
    //   1363: newarray int
    //   1365: astore_0
    //   1366: iload #23
    //   1368: anewarray [I
    //   1371: astore_1
    //   1372: aload #32
    //   1374: iconst_0
    //   1375: aload_0
    //   1376: iconst_0
    //   1377: iload #23
    //   1379: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1382: aload #30
    //   1384: iconst_0
    //   1385: aload_1
    //   1386: iconst_0
    //   1387: iload #23
    //   1389: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   1392: new android/content/res/ColorStateList
    //   1395: dup
    //   1396: aload_1
    //   1397: aload_0
    //   1398: invokespecial <init> : ([[I[I)V
    //   1401: areturn
    //   1402: aload_1
    //   1403: invokeinterface getPositionDescription : ()Ljava/lang/String;
    //   1408: astore_1
    //   1409: new java/lang/StringBuilder
    //   1412: dup
    //   1413: invokespecial <init> : ()V
    //   1416: astore_0
    //   1417: aload_0
    //   1418: aload_1
    //   1419: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1422: pop
    //   1423: aload_0
    //   1424: ldc_w ': invalid color state list tag '
    //   1427: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1430: pop
    //   1431: aload_0
    //   1432: aload #29
    //   1434: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1437: pop
    //   1438: new org/xmlpull/v1/XmlPullParserException
    //   1441: dup
    //   1442: aload_0
    //   1443: invokevirtual toString : ()Ljava/lang/String;
    //   1446: invokespecial <init> : (Ljava/lang/String;)V
    //   1449: athrow
    // Exception table:
    //   from	to	target	type
    //   235	251	254	java/lang/Exception
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */