import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zh2 implements Serializable, Map {
  public static final zh2 j = new zh2(null, new Object[0], 0, 0);
  
  public static final zh2 k = new zh2(null, new Object[0], 0, 1);
  
  public final int b;
  
  public final transient Object c;
  
  public final transient Object[] e;
  
  public final transient int f;
  
  public transient AbstractCollection g;
  
  public transient AbstractCollection h;
  
  public transient AbstractCollection i;
  
  public static void a(Set paramSet) {
    // Byte code:
    //   0: aload_0
    //   1: ifnull -> 14
    //   4: aload_0
    //   5: invokeinterface size : ()I
    //   10: istore_1
    //   11: goto -> 16
    //   14: iconst_4
    //   15: istore_1
    //   16: iload_1
    //   17: iload_1
    //   18: iadd
    //   19: istore_1
    //   20: iload_1
    //   21: anewarray java/lang/Object
    //   24: astore #12
    //   26: aload #12
    //   28: astore #11
    //   30: aload_0
    //   31: ifnull -> 66
    //   34: aload_0
    //   35: invokeinterface size : ()I
    //   40: istore_2
    //   41: iload_2
    //   42: iload_2
    //   43: iadd
    //   44: istore_2
    //   45: aload #12
    //   47: astore #11
    //   49: iload_2
    //   50: iload_1
    //   51: if_icmple -> 66
    //   54: aload #12
    //   56: iload_1
    //   57: iload_2
    //   58: invokestatic s0 : (II)I
    //   61: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   64: astore #11
    //   66: aload_0
    //   67: invokeinterface iterator : ()Ljava/util/Iterator;
    //   72: astore #12
    //   74: iconst_0
    //   75: istore_1
    //   76: iconst_0
    //   77: istore_2
    //   78: aload #12
    //   80: invokeinterface hasNext : ()Z
    //   85: istore #10
    //   87: iconst_1
    //   88: istore #8
    //   90: iload #10
    //   92: ifeq -> 239
    //   95: aload #12
    //   97: invokeinterface next : ()Ljava/lang/Object;
    //   102: checkcast java/util/Map$Entry
    //   105: astore_0
    //   106: aload_0
    //   107: invokeinterface getKey : ()Ljava/lang/Object;
    //   112: astore #13
    //   114: aload_0
    //   115: invokeinterface getValue : ()Ljava/lang/Object;
    //   120: astore #14
    //   122: iload_2
    //   123: iconst_1
    //   124: iadd
    //   125: istore_3
    //   126: aload #11
    //   128: arraylength
    //   129: istore #5
    //   131: iload_3
    //   132: iload_3
    //   133: iadd
    //   134: istore #4
    //   136: aload #11
    //   138: astore_0
    //   139: iload #4
    //   141: iload #5
    //   143: if_icmple -> 159
    //   146: aload #11
    //   148: iload #5
    //   150: iload #4
    //   152: invokestatic s0 : (II)I
    //   155: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   158: astore_0
    //   159: aload #13
    //   161: ifnull -> 225
    //   164: aload #14
    //   166: ifnull -> 193
    //   169: iload_2
    //   170: iload_2
    //   171: iadd
    //   172: istore_2
    //   173: aload_0
    //   174: iload_2
    //   175: aload #13
    //   177: aastore
    //   178: aload_0
    //   179: iload_2
    //   180: iconst_1
    //   181: iadd
    //   182: aload #14
    //   184: aastore
    //   185: iload_3
    //   186: istore_2
    //   187: aload_0
    //   188: astore #11
    //   190: goto -> 78
    //   193: aload #13
    //   195: invokevirtual toString : ()Ljava/lang/String;
    //   198: astore_0
    //   199: new java/lang/StringBuilder
    //   202: dup
    //   203: aload_0
    //   204: invokevirtual length : ()I
    //   207: bipush #26
    //   209: iadd
    //   210: invokespecial <init> : (I)V
    //   213: ldc 'null value in entry: '
    //   215: aload_0
    //   216: ldc '=null'
    //   218: invokestatic o : (Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   221: invokestatic h : (Ljava/lang/String;)V
    //   224: return
    //   225: ldc 'null key in entry: null='
    //   227: aload #14
    //   229: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   232: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   235: invokestatic h : (Ljava/lang/String;)V
    //   238: return
    //   239: iload_2
    //   240: ifne -> 248
    //   243: aconst_null
    //   244: astore_0
    //   245: goto -> 1122
    //   248: iload_2
    //   249: iconst_1
    //   250: if_icmpne -> 272
    //   253: aload #11
    //   255: iconst_0
    //   256: aaload
    //   257: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   260: pop
    //   261: aload #11
    //   263: iconst_1
    //   264: aaload
    //   265: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   268: pop
    //   269: goto -> 243
    //   272: iload_2
    //   273: aload #11
    //   275: arraylength
    //   276: iconst_1
    //   277: ishr
    //   278: invokestatic A0 : (II)V
    //   281: iload_2
    //   282: invokestatic g : (I)I
    //   285: istore_3
    //   286: iload_2
    //   287: iconst_1
    //   288: if_icmpne -> 316
    //   291: aload #11
    //   293: iconst_0
    //   294: aaload
    //   295: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   298: pop
    //   299: aload #11
    //   301: iconst_1
    //   302: aaload
    //   303: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   306: pop
    //   307: iconst_0
    //   308: istore_1
    //   309: iconst_1
    //   310: istore_2
    //   311: aconst_null
    //   312: astore_0
    //   313: goto -> 1075
    //   316: iload_3
    //   317: iconst_1
    //   318: isub
    //   319: istore #9
    //   321: iload_3
    //   322: sipush #128
    //   325: if_icmpgt -> 573
    //   328: iload_3
    //   329: newarray byte
    //   331: astore #12
    //   333: aload #12
    //   335: iconst_m1
    //   336: invokestatic fill : ([BB)V
    //   339: iconst_0
    //   340: istore #4
    //   342: iconst_0
    //   343: istore_3
    //   344: aconst_null
    //   345: astore_0
    //   346: iload #4
    //   348: iload_2
    //   349: if_icmpge -> 529
    //   352: iload_3
    //   353: iload_3
    //   354: iadd
    //   355: istore #6
    //   357: iload #4
    //   359: iload #4
    //   361: iadd
    //   362: istore #5
    //   364: aload #11
    //   366: iload #5
    //   368: aaload
    //   369: astore #14
    //   371: aload #14
    //   373: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   376: pop
    //   377: aload #11
    //   379: iload #5
    //   381: iconst_1
    //   382: ixor
    //   383: aaload
    //   384: astore #13
    //   386: aload #13
    //   388: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   391: pop
    //   392: aload #14
    //   394: invokevirtual hashCode : ()I
    //   397: invokestatic a : (I)I
    //   400: istore #5
    //   402: iload #5
    //   404: iload #9
    //   406: iand
    //   407: istore #7
    //   409: aload #12
    //   411: iload #7
    //   413: baload
    //   414: sipush #255
    //   417: iand
    //   418: istore #5
    //   420: iload #5
    //   422: sipush #255
    //   425: if_icmpne -> 464
    //   428: aload #12
    //   430: iload #7
    //   432: iload #6
    //   434: i2b
    //   435: bastore
    //   436: iload_3
    //   437: iload #4
    //   439: if_icmpge -> 458
    //   442: aload #11
    //   444: iload #6
    //   446: aload #14
    //   448: aastore
    //   449: aload #11
    //   451: iload #6
    //   453: iconst_1
    //   454: ixor
    //   455: aload #13
    //   457: aastore
    //   458: iinc #3, 1
    //   461: goto -> 514
    //   464: aload #14
    //   466: aload #11
    //   468: iload #5
    //   470: aaload
    //   471: invokevirtual equals : (Ljava/lang/Object;)Z
    //   474: ifeq -> 520
    //   477: iload #5
    //   479: iconst_1
    //   480: ixor
    //   481: istore #5
    //   483: aload #11
    //   485: iload #5
    //   487: aaload
    //   488: astore_0
    //   489: aload_0
    //   490: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   493: pop
    //   494: new jm2
    //   497: dup
    //   498: aload #14
    //   500: aload #13
    //   502: aload_0
    //   503: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   506: astore_0
    //   507: aload #11
    //   509: iload #5
    //   511: aload #13
    //   513: aastore
    //   514: iinc #4, 1
    //   517: goto -> 346
    //   520: iload #7
    //   522: iconst_1
    //   523: iadd
    //   524: istore #5
    //   526: goto -> 402
    //   529: iload_3
    //   530: iload_2
    //   531: if_icmpne -> 542
    //   534: aload #12
    //   536: astore_0
    //   537: iconst_1
    //   538: istore_2
    //   539: goto -> 1075
    //   542: iconst_3
    //   543: anewarray java/lang/Object
    //   546: astore #13
    //   548: aload #13
    //   550: iload_1
    //   551: aload #12
    //   553: aastore
    //   554: aload #13
    //   556: iconst_1
    //   557: iload_3
    //   558: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   561: aastore
    //   562: aload #13
    //   564: iconst_2
    //   565: aload_0
    //   566: aastore
    //   567: aload #13
    //   569: astore_0
    //   570: goto -> 537
    //   573: iconst_0
    //   574: istore #7
    //   576: iconst_0
    //   577: istore #6
    //   579: iconst_0
    //   580: istore #5
    //   582: iload_3
    //   583: ldc 32768
    //   585: if_icmpgt -> 825
    //   588: iload_3
    //   589: newarray short
    //   591: astore #12
    //   593: aload #12
    //   595: iconst_m1
    //   596: invokestatic fill : ([SS)V
    //   599: iconst_0
    //   600: istore_1
    //   601: iload_1
    //   602: istore_3
    //   603: aconst_null
    //   604: astore_0
    //   605: iload_1
    //   606: iload_2
    //   607: if_icmpge -> 777
    //   610: iload_3
    //   611: iload_3
    //   612: iadd
    //   613: istore #6
    //   615: iload_1
    //   616: iload_1
    //   617: iadd
    //   618: istore #4
    //   620: aload #11
    //   622: iload #4
    //   624: aaload
    //   625: astore #14
    //   627: aload #14
    //   629: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   632: pop
    //   633: aload #11
    //   635: iload #4
    //   637: iconst_1
    //   638: ixor
    //   639: aaload
    //   640: astore #13
    //   642: aload #13
    //   644: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   647: pop
    //   648: aload #14
    //   650: invokevirtual hashCode : ()I
    //   653: invokestatic a : (I)I
    //   656: istore #4
    //   658: iload #4
    //   660: iload #9
    //   662: iand
    //   663: istore #4
    //   665: aload #12
    //   667: iload #4
    //   669: saload
    //   670: i2c
    //   671: istore #8
    //   673: iload #8
    //   675: ldc 65535
    //   677: if_icmpne -> 715
    //   680: aload #12
    //   682: iload #4
    //   684: iload #6
    //   686: i2s
    //   687: sastore
    //   688: iload_3
    //   689: iload_1
    //   690: if_icmpge -> 709
    //   693: aload #11
    //   695: iload #6
    //   697: aload #14
    //   699: aastore
    //   700: aload #11
    //   702: iload #6
    //   704: iconst_1
    //   705: ixor
    //   706: aload #13
    //   708: aastore
    //   709: iinc #3, 1
    //   712: goto -> 765
    //   715: aload #14
    //   717: aload #11
    //   719: iload #8
    //   721: aaload
    //   722: invokevirtual equals : (Ljava/lang/Object;)Z
    //   725: ifeq -> 771
    //   728: iload #8
    //   730: iconst_1
    //   731: ixor
    //   732: istore #4
    //   734: aload #11
    //   736: iload #4
    //   738: aaload
    //   739: astore_0
    //   740: aload_0
    //   741: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   744: pop
    //   745: new jm2
    //   748: dup
    //   749: aload #14
    //   751: aload #13
    //   753: aload_0
    //   754: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   757: astore_0
    //   758: aload #11
    //   760: iload #4
    //   762: aload #13
    //   764: aastore
    //   765: iinc #1, 1
    //   768: goto -> 605
    //   771: iinc #4, 1
    //   774: goto -> 658
    //   777: iload_3
    //   778: iload_2
    //   779: if_icmpne -> 791
    //   782: aload #12
    //   784: astore_0
    //   785: iload #5
    //   787: istore_1
    //   788: goto -> 537
    //   791: iconst_3
    //   792: anewarray java/lang/Object
    //   795: astore #13
    //   797: aload #13
    //   799: iconst_0
    //   800: aload #12
    //   802: aastore
    //   803: aload #13
    //   805: iconst_1
    //   806: iload_3
    //   807: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   810: aastore
    //   811: aload #13
    //   813: iconst_2
    //   814: aload_0
    //   815: aastore
    //   816: aload #13
    //   818: astore_0
    //   819: iload #7
    //   821: istore_1
    //   822: goto -> 570
    //   825: iload_3
    //   826: newarray int
    //   828: astore #12
    //   830: aload #12
    //   832: iconst_m1
    //   833: invokestatic fill : ([II)V
    //   836: iconst_0
    //   837: istore #4
    //   839: iload #4
    //   841: istore_3
    //   842: aconst_null
    //   843: astore_0
    //   844: iload #8
    //   846: istore_1
    //   847: iload #4
    //   849: iload_2
    //   850: if_icmpge -> 1020
    //   853: iload_3
    //   854: iload_3
    //   855: iadd
    //   856: istore #7
    //   858: iload #4
    //   860: iload #4
    //   862: iadd
    //   863: istore #5
    //   865: aload #11
    //   867: iload #5
    //   869: aaload
    //   870: astore #14
    //   872: aload #14
    //   874: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   877: pop
    //   878: aload #11
    //   880: iload #5
    //   882: iload_1
    //   883: ixor
    //   884: aaload
    //   885: astore #13
    //   887: aload #13
    //   889: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   892: pop
    //   893: aload #14
    //   895: invokevirtual hashCode : ()I
    //   898: invokestatic a : (I)I
    //   901: istore #5
    //   903: iload #5
    //   905: iload #9
    //   907: iand
    //   908: istore #5
    //   910: aload #12
    //   912: iload #5
    //   914: iaload
    //   915: istore #8
    //   917: iload #8
    //   919: iconst_m1
    //   920: if_icmpne -> 958
    //   923: aload #12
    //   925: iload #5
    //   927: iload #7
    //   929: iastore
    //   930: iload_3
    //   931: iload #4
    //   933: if_icmpge -> 952
    //   936: aload #11
    //   938: iload #7
    //   940: aload #14
    //   942: aastore
    //   943: aload #11
    //   945: iload #7
    //   947: iconst_1
    //   948: ixor
    //   949: aload #13
    //   951: aastore
    //   952: iinc #3, 1
    //   955: goto -> 1008
    //   958: aload #14
    //   960: aload #11
    //   962: iload #8
    //   964: aaload
    //   965: invokevirtual equals : (Ljava/lang/Object;)Z
    //   968: ifeq -> 1014
    //   971: iload #8
    //   973: iconst_1
    //   974: ixor
    //   975: istore #5
    //   977: aload #11
    //   979: iload #5
    //   981: aaload
    //   982: astore_0
    //   983: aload_0
    //   984: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   987: pop
    //   988: new jm2
    //   991: dup
    //   992: aload #14
    //   994: aload #13
    //   996: aload_0
    //   997: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1000: astore_0
    //   1001: aload #11
    //   1003: iload #5
    //   1005: aload #13
    //   1007: aastore
    //   1008: iinc #4, 1
    //   1011: goto -> 847
    //   1014: iinc #5, 1
    //   1017: goto -> 903
    //   1020: iload_1
    //   1021: istore #4
    //   1023: iload_3
    //   1024: iload_2
    //   1025: if_icmpne -> 1040
    //   1028: aload #12
    //   1030: astore_0
    //   1031: iload #6
    //   1033: istore_1
    //   1034: iload #4
    //   1036: istore_2
    //   1037: goto -> 1075
    //   1040: iconst_3
    //   1041: anewarray java/lang/Object
    //   1044: astore #13
    //   1046: aload #13
    //   1048: iconst_0
    //   1049: aload #12
    //   1051: aastore
    //   1052: aload #13
    //   1054: iload #4
    //   1056: iload_3
    //   1057: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1060: aastore
    //   1061: aload #13
    //   1063: iconst_2
    //   1064: aload_0
    //   1065: aastore
    //   1066: aload #13
    //   1068: astore_0
    //   1069: iload #4
    //   1071: istore_2
    //   1072: iload #6
    //   1074: istore_1
    //   1075: aload_0
    //   1076: instanceof [Ljava/lang/Object;
    //   1079: ifeq -> 243
    //   1082: aload_0
    //   1083: checkcast [Ljava/lang/Object;
    //   1086: astore #12
    //   1088: aload #12
    //   1090: iconst_2
    //   1091: aaload
    //   1092: checkcast jm2
    //   1095: astore_0
    //   1096: aload #12
    //   1098: iload_1
    //   1099: aaload
    //   1100: astore #13
    //   1102: aload #12
    //   1104: iload_2
    //   1105: aaload
    //   1106: checkcast java/lang/Integer
    //   1109: invokevirtual intValue : ()I
    //   1112: istore_1
    //   1113: aload #11
    //   1115: iload_1
    //   1116: iload_1
    //   1117: iadd
    //   1118: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   1121: pop
    //   1122: aload_0
    //   1123: ifnonnull -> 1127
    //   1126: return
    //   1127: aload_0
    //   1128: getfield c : Ljava/lang/Object;
    //   1131: astore #13
    //   1133: aload_0
    //   1134: getfield b : Ljava/lang/Object;
    //   1137: astore #11
    //   1139: aload_0
    //   1140: getfield a : Ljava/lang/Object;
    //   1143: astore #12
    //   1145: aload #12
    //   1147: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1150: astore_0
    //   1151: aload #11
    //   1153: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1156: astore #11
    //   1158: aload #12
    //   1160: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1163: astore #12
    //   1165: aload #13
    //   1167: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   1170: astore #14
    //   1172: new java/lang/StringBuilder
    //   1175: dup
    //   1176: aload_0
    //   1177: invokevirtual length : ()I
    //   1180: bipush #33
    //   1182: iadd
    //   1183: aload #11
    //   1185: invokevirtual length : ()I
    //   1188: iadd
    //   1189: iconst_5
    //   1190: iadd
    //   1191: aload #12
    //   1193: invokevirtual length : ()I
    //   1196: iadd
    //   1197: iconst_1
    //   1198: iadd
    //   1199: aload #14
    //   1201: invokevirtual length : ()I
    //   1204: iadd
    //   1205: invokespecial <init> : (I)V
    //   1208: astore #13
    //   1210: getstatic r3/IKWi/AyxAR.cYuiYvUOqKYHIez : Ljava/lang/String;
    //   1213: astore #15
    //   1215: aload #13
    //   1217: ldc 'Multiple entries with same key: '
    //   1219: aload_0
    //   1220: aload #15
    //   1222: aload #11
    //   1224: invokestatic v : (Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   1227: aload #13
    //   1229: ldc ' and '
    //   1231: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1234: pop
    //   1235: aload #13
    //   1237: aload #12
    //   1239: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1242: pop
    //   1243: aload #13
    //   1245: aload #15
    //   1247: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1250: pop
    //   1251: aload #13
    //   1253: aload #14
    //   1255: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1258: pop
    //   1259: new java/lang/IllegalArgumentException
    //   1262: dup
    //   1263: aload #13
    //   1265: invokevirtual toString : ()Ljava/lang/String;
    //   1268: invokespecial <init> : (Ljava/lang/String;)V
    //   1271: athrow
  }
  
  public static zh2 b(int paramInt, Object[] paramArrayOfObject, d7 paramd7) {
    // Byte code:
    //   0: iload_0
    //   1: istore #4
    //   3: aload_1
    //   4: astore #12
    //   6: iload #4
    //   8: ifne -> 15
    //   11: getstatic zh2.j : Lzh2;
    //   14: areturn
    //   15: aconst_null
    //   16: astore_1
    //   17: aconst_null
    //   18: astore #15
    //   20: aconst_null
    //   21: astore #13
    //   23: aconst_null
    //   24: astore #14
    //   26: iconst_1
    //   27: istore #7
    //   29: iload #4
    //   31: iconst_1
    //   32: if_icmpne -> 64
    //   35: aload #12
    //   37: iconst_0
    //   38: aaload
    //   39: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   42: pop
    //   43: aload #12
    //   45: iconst_1
    //   46: aaload
    //   47: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   50: pop
    //   51: new zh2
    //   54: dup
    //   55: aconst_null
    //   56: aload #12
    //   58: iconst_1
    //   59: iconst_0
    //   60: invokespecial <init> : (Ljava/lang/Object;[Ljava/lang/Object;II)V
    //   63: areturn
    //   64: iload #4
    //   66: aload #12
    //   68: arraylength
    //   69: iconst_1
    //   70: ishr
    //   71: invokestatic w0 : (II)V
    //   74: iconst_2
    //   75: istore #8
    //   77: iload #4
    //   79: iconst_2
    //   80: invokestatic max : (II)I
    //   83: istore #5
    //   85: iload #5
    //   87: ldc 751619276
    //   89: if_icmpge -> 122
    //   92: iload #5
    //   94: iconst_1
    //   95: isub
    //   96: invokestatic highestOneBit : (I)I
    //   99: istore_3
    //   100: iload_3
    //   101: iload_3
    //   102: iadd
    //   103: istore_3
    //   104: iload_3
    //   105: istore_0
    //   106: iload_3
    //   107: i2d
    //   108: ldc2_w 0.7
    //   111: dmul
    //   112: iload #5
    //   114: i2d
    //   115: dcmpg
    //   116: ifge -> 132
    //   119: goto -> 100
    //   122: ldc 1073741824
    //   124: istore_0
    //   125: iload #5
    //   127: ldc 1073741824
    //   129: if_icmpge -> 1043
    //   132: iload #4
    //   134: iconst_1
    //   135: if_icmpne -> 167
    //   138: aload #12
    //   140: iconst_0
    //   141: aaload
    //   142: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   145: pop
    //   146: aload #12
    //   148: iconst_1
    //   149: aaload
    //   150: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   153: pop
    //   154: iconst_1
    //   155: istore #4
    //   157: iconst_1
    //   158: istore_0
    //   159: iconst_2
    //   160: istore_3
    //   161: aload #13
    //   163: astore_1
    //   164: goto -> 954
    //   167: iload_0
    //   168: iconst_1
    //   169: isub
    //   170: istore #9
    //   172: iload_0
    //   173: sipush #128
    //   176: if_icmpgt -> 451
    //   179: iload_0
    //   180: newarray byte
    //   182: astore #13
    //   184: aload #13
    //   186: iconst_m1
    //   187: invokestatic fill : ([BB)V
    //   190: iconst_0
    //   191: istore #5
    //   193: iconst_0
    //   194: istore #6
    //   196: iload #8
    //   198: istore_0
    //   199: iload #7
    //   201: istore_3
    //   202: aload #14
    //   204: astore_1
    //   205: iload #5
    //   207: iload #4
    //   209: if_icmpge -> 392
    //   212: iload #6
    //   214: iload #6
    //   216: iadd
    //   217: istore #8
    //   219: iload #5
    //   221: iload #5
    //   223: iadd
    //   224: istore #7
    //   226: aload #12
    //   228: iload #7
    //   230: aaload
    //   231: astore #15
    //   233: aload #15
    //   235: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   238: pop
    //   239: aload #12
    //   241: iload #7
    //   243: iload_3
    //   244: ixor
    //   245: aaload
    //   246: astore #14
    //   248: aload #14
    //   250: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   253: pop
    //   254: aload #15
    //   256: invokevirtual hashCode : ()I
    //   259: invokestatic V : (I)I
    //   262: istore #7
    //   264: iload #7
    //   266: iload #9
    //   268: iand
    //   269: istore #10
    //   271: aload #13
    //   273: iload #10
    //   275: baload
    //   276: sipush #255
    //   279: iand
    //   280: istore #7
    //   282: iload #7
    //   284: sipush #255
    //   287: if_icmpne -> 327
    //   290: aload #13
    //   292: iload #10
    //   294: iload #8
    //   296: i2b
    //   297: bastore
    //   298: iload #6
    //   300: iload #5
    //   302: if_icmpge -> 321
    //   305: aload #12
    //   307: iload #8
    //   309: aload #15
    //   311: aastore
    //   312: aload #12
    //   314: iload #8
    //   316: iconst_1
    //   317: ixor
    //   318: aload #14
    //   320: aastore
    //   321: iinc #6, 1
    //   324: goto -> 377
    //   327: aload #15
    //   329: aload #12
    //   331: iload #7
    //   333: aaload
    //   334: invokevirtual equals : (Ljava/lang/Object;)Z
    //   337: ifeq -> 383
    //   340: iload #7
    //   342: iconst_1
    //   343: ixor
    //   344: istore #7
    //   346: aload #12
    //   348: iload #7
    //   350: aaload
    //   351: astore_1
    //   352: aload_1
    //   353: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   356: pop
    //   357: new fh2
    //   360: dup
    //   361: aload #15
    //   363: aload #14
    //   365: aload_1
    //   366: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   369: astore_1
    //   370: aload #12
    //   372: iload #7
    //   374: aload #14
    //   376: aastore
    //   377: iinc #5, 1
    //   380: goto -> 205
    //   383: iload #10
    //   385: iconst_1
    //   386: iadd
    //   387: istore #7
    //   389: goto -> 264
    //   392: iload_0
    //   393: istore #5
    //   395: iload #6
    //   397: iload #4
    //   399: if_icmpne -> 413
    //   402: aload #13
    //   404: astore_1
    //   405: iload_3
    //   406: istore_0
    //   407: iload #5
    //   409: istore_3
    //   410: goto -> 954
    //   413: iconst_3
    //   414: anewarray java/lang/Object
    //   417: astore #14
    //   419: aload #14
    //   421: iconst_0
    //   422: aload #13
    //   424: aastore
    //   425: aload #14
    //   427: iload_3
    //   428: iload #6
    //   430: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   433: aastore
    //   434: aload #14
    //   436: iload #5
    //   438: aload_1
    //   439: aastore
    //   440: iload_3
    //   441: istore_0
    //   442: aload #14
    //   444: astore_1
    //   445: iload #5
    //   447: istore_3
    //   448: goto -> 954
    //   451: iconst_1
    //   452: istore #7
    //   454: iconst_1
    //   455: istore #8
    //   457: iconst_2
    //   458: istore_3
    //   459: iload_0
    //   460: ldc 32768
    //   462: if_icmpgt -> 714
    //   465: iload_0
    //   466: newarray short
    //   468: astore #13
    //   470: aload #13
    //   472: iconst_m1
    //   473: invokestatic fill : ([SS)V
    //   476: iconst_0
    //   477: istore_0
    //   478: iconst_0
    //   479: istore #5
    //   481: iload_0
    //   482: iload #4
    //   484: if_icmpge -> 660
    //   487: iload #5
    //   489: iload #5
    //   491: iadd
    //   492: istore #10
    //   494: iload_0
    //   495: iload_0
    //   496: iadd
    //   497: istore #6
    //   499: aload #12
    //   501: iload #6
    //   503: aaload
    //   504: astore #15
    //   506: aload #15
    //   508: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   511: pop
    //   512: aload #12
    //   514: iload #6
    //   516: iconst_1
    //   517: ixor
    //   518: aaload
    //   519: astore #14
    //   521: aload #14
    //   523: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   526: pop
    //   527: aload #15
    //   529: invokevirtual hashCode : ()I
    //   532: invokestatic V : (I)I
    //   535: istore #6
    //   537: iload #6
    //   539: iload #9
    //   541: iand
    //   542: istore #11
    //   544: aload #13
    //   546: iload #11
    //   548: saload
    //   549: i2c
    //   550: istore #6
    //   552: iload #6
    //   554: ldc 65535
    //   556: if_icmpne -> 595
    //   559: aload #13
    //   561: iload #11
    //   563: iload #10
    //   565: i2s
    //   566: sastore
    //   567: iload #5
    //   569: iload_0
    //   570: if_icmpge -> 589
    //   573: aload #12
    //   575: iload #10
    //   577: aload #15
    //   579: aastore
    //   580: aload #12
    //   582: iload #10
    //   584: iconst_1
    //   585: ixor
    //   586: aload #14
    //   588: aastore
    //   589: iinc #5, 1
    //   592: goto -> 645
    //   595: aload #15
    //   597: aload #12
    //   599: iload #6
    //   601: aaload
    //   602: invokevirtual equals : (Ljava/lang/Object;)Z
    //   605: ifeq -> 651
    //   608: iload #6
    //   610: iconst_1
    //   611: ixor
    //   612: istore #6
    //   614: aload #12
    //   616: iload #6
    //   618: aaload
    //   619: astore_1
    //   620: aload_1
    //   621: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   624: pop
    //   625: new fh2
    //   628: dup
    //   629: aload #15
    //   631: aload #14
    //   633: aload_1
    //   634: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   637: astore_1
    //   638: aload #12
    //   640: iload #6
    //   642: aload #14
    //   644: aastore
    //   645: iinc #0, 1
    //   648: goto -> 481
    //   651: iload #11
    //   653: iconst_1
    //   654: iadd
    //   655: istore #6
    //   657: goto -> 537
    //   660: iload #5
    //   662: iload #4
    //   664: if_icmpne -> 679
    //   667: aload #13
    //   669: astore_1
    //   670: iload #8
    //   672: istore_0
    //   673: iload_3
    //   674: istore #5
    //   676: goto -> 445
    //   679: iconst_3
    //   680: anewarray java/lang/Object
    //   683: astore #14
    //   685: aload #14
    //   687: iconst_0
    //   688: aload #13
    //   690: aastore
    //   691: aload #14
    //   693: iconst_1
    //   694: iload #5
    //   696: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   699: aastore
    //   700: aload #14
    //   702: iconst_2
    //   703: aload_1
    //   704: aastore
    //   705: aload #14
    //   707: astore_1
    //   708: iload #7
    //   710: istore_0
    //   711: goto -> 954
    //   714: iload_0
    //   715: newarray int
    //   717: astore #13
    //   719: aload #13
    //   721: iconst_m1
    //   722: invokestatic fill : ([II)V
    //   725: iconst_0
    //   726: istore_0
    //   727: iconst_0
    //   728: istore #5
    //   730: aload #15
    //   732: astore_1
    //   733: iload_0
    //   734: iload #4
    //   736: if_icmpge -> 909
    //   739: iload #5
    //   741: iload #5
    //   743: iadd
    //   744: istore #10
    //   746: iload_0
    //   747: iload_0
    //   748: iadd
    //   749: istore #6
    //   751: aload #12
    //   753: iload #6
    //   755: aaload
    //   756: astore #15
    //   758: aload #15
    //   760: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   763: pop
    //   764: aload #12
    //   766: iload #6
    //   768: iconst_1
    //   769: ixor
    //   770: aaload
    //   771: astore #14
    //   773: aload #14
    //   775: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   778: pop
    //   779: aload #15
    //   781: invokevirtual hashCode : ()I
    //   784: invokestatic V : (I)I
    //   787: istore #6
    //   789: iload #6
    //   791: iload #9
    //   793: iand
    //   794: istore #11
    //   796: aload #13
    //   798: iload #11
    //   800: iaload
    //   801: istore #6
    //   803: iload #6
    //   805: iconst_m1
    //   806: if_icmpne -> 844
    //   809: aload #13
    //   811: iload #11
    //   813: iload #10
    //   815: iastore
    //   816: iload #5
    //   818: iload_0
    //   819: if_icmpge -> 838
    //   822: aload #12
    //   824: iload #10
    //   826: aload #15
    //   828: aastore
    //   829: aload #12
    //   831: iload #10
    //   833: iconst_1
    //   834: ixor
    //   835: aload #14
    //   837: aastore
    //   838: iinc #5, 1
    //   841: goto -> 894
    //   844: aload #15
    //   846: aload #12
    //   848: iload #6
    //   850: aaload
    //   851: invokevirtual equals : (Ljava/lang/Object;)Z
    //   854: ifeq -> 900
    //   857: iload #6
    //   859: iconst_1
    //   860: ixor
    //   861: istore #6
    //   863: aload #12
    //   865: iload #6
    //   867: aaload
    //   868: astore_1
    //   869: aload_1
    //   870: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   873: pop
    //   874: new fh2
    //   877: dup
    //   878: aload #15
    //   880: aload #14
    //   882: aload_1
    //   883: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   886: astore_1
    //   887: aload #12
    //   889: iload #6
    //   891: aload #14
    //   893: aastore
    //   894: iinc #0, 1
    //   897: goto -> 733
    //   900: iload #11
    //   902: iconst_1
    //   903: iadd
    //   904: istore #6
    //   906: goto -> 789
    //   909: iload #5
    //   911: iload #4
    //   913: if_icmpne -> 922
    //   916: aload #13
    //   918: astore_1
    //   919: goto -> 670
    //   922: iconst_3
    //   923: anewarray java/lang/Object
    //   926: astore #14
    //   928: aload #14
    //   930: iconst_0
    //   931: aload #13
    //   933: aastore
    //   934: aload #14
    //   936: iconst_1
    //   937: iload #5
    //   939: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   942: aastore
    //   943: aload #14
    //   945: iconst_2
    //   946: aload_1
    //   947: aastore
    //   948: aload #14
    //   950: astore_1
    //   951: goto -> 708
    //   954: aload #12
    //   956: astore #13
    //   958: aload_1
    //   959: astore #14
    //   961: aload_1
    //   962: instanceof [Ljava/lang/Object;
    //   965: ifeq -> 1028
    //   968: aload_1
    //   969: checkcast [Ljava/lang/Object;
    //   972: astore_1
    //   973: aload_1
    //   974: iload_3
    //   975: aaload
    //   976: checkcast fh2
    //   979: astore #13
    //   981: aload_2
    //   982: ifnull -> 1022
    //   985: aload_2
    //   986: aload #13
    //   988: putfield e : Ljava/lang/Object;
    //   991: aload_1
    //   992: iconst_0
    //   993: aaload
    //   994: astore #14
    //   996: aload_1
    //   997: iload_0
    //   998: aaload
    //   999: checkcast java/lang/Integer
    //   1002: invokevirtual intValue : ()I
    //   1005: istore #4
    //   1007: aload #12
    //   1009: iload #4
    //   1011: iload #4
    //   1013: iadd
    //   1014: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
    //   1017: astore #13
    //   1019: goto -> 1028
    //   1022: aload #13
    //   1024: invokevirtual a : ()Ljava/lang/IllegalArgumentException;
    //   1027: athrow
    //   1028: new zh2
    //   1031: dup
    //   1032: aload #14
    //   1034: aload #13
    //   1036: iload #4
    //   1038: iconst_0
    //   1039: invokespecial <init> : (Ljava/lang/Object;[Ljava/lang/Object;II)V
    //   1042: areturn
    //   1043: ldc 'collection too large'
    //   1045: invokestatic l : (Ljava/lang/String;)V
    //   1048: aconst_null
    //   1049: areturn
  }
  
  public final void clear() {
    switch (this.b) {
      default:
        throw new UnsupportedOperationException();
      case 0:
        break;
    } 
    throw new UnsupportedOperationException();
  }
  
  public final boolean containsKey(Object paramObject) {
    boolean bool;
    switch (this.b) {
      default:
        if (get(paramObject) != null) {
          bool = true;
        } else {
          bool = false;
        } 
        return bool;
      case 0:
        break;
    } 
    if (get(paramObject) != null) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final boolean containsValue(Object paramObject) {
    vm2 vm21;
    vm2 vm22;
    switch (this.b) {
      default:
        vm22 = (vm2)this.i;
        vm21 = vm22;
        if (vm22 == null) {
          vm21 = new vm2(this.e, 1, this.f);
          this.i = vm21;
        } 
        return vm21.contains(paramObject);
      case 0:
        break;
    } 
    yh2 yh22 = (yh2)this.i;
    yh2 yh21 = yh22;
    if (yh22 == null) {
      yh21 = new yh2(this.e, 1, this.f);
      this.i = yh21;
    } 
    return yh21.contains(paramObject);
  }
  
  public final Set entrySet() {
    rm2 rm21;
    rm2 rm22;
    switch (this.b) {
      default:
        rm22 = (rm2)this.g;
        rm21 = rm22;
        if (rm22 == null) {
          rm21 = new rm2(this, this.e, this.f);
          this.g = rm21;
        } 
        return rm21;
      case 0:
        break;
    } 
    wh2 wh22 = (wh2)this.g;
    wh2 wh21 = wh22;
    if (wh22 == null) {
      wh21 = new wh2(this, this.e, this.f);
      this.g = wh21;
    } 
    return wh21;
  }
  
  public final boolean equals(Object paramObject) {
    int i = this.b;
    boolean bool1 = false;
    boolean bool2 = false;
    switch (i) {
      default:
        if (this == paramObject) {
          bool1 = true;
        } else if (!(paramObject instanceof Map)) {
          bool1 = bool2;
        } else {
          paramObject = paramObject;
          bool1 = entrySet().equals(paramObject.entrySet());
        } 
        return bool1;
      case 0:
        break;
    } 
    if (this == paramObject) {
      bool1 = true;
    } else if (paramObject instanceof Map) {
      paramObject = paramObject;
      bool1 = entrySet().equals(paramObject.entrySet());
    } 
    return bool1;
  }
  
  public final Object get(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: istore_3
    //   5: aload_0
    //   6: getfield c : Ljava/lang/Object;
    //   9: astore #8
    //   11: aload_0
    //   12: getfield e : [Ljava/lang/Object;
    //   15: astore #7
    //   17: aload_0
    //   18: getfield f : I
    //   21: istore_2
    //   22: aconst_null
    //   23: astore #5
    //   25: aconst_null
    //   26: astore #6
    //   28: iload_3
    //   29: tableswitch default -> 48, 0 -> 344
    //   48: aload_1
    //   49: ifnonnull -> 57
    //   52: aconst_null
    //   53: astore_1
    //   54: goto -> 326
    //   57: iload_2
    //   58: iconst_1
    //   59: if_icmpne -> 96
    //   62: aload #7
    //   64: iconst_0
    //   65: aaload
    //   66: astore #5
    //   68: aload #5
    //   70: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   73: pop
    //   74: aload #5
    //   76: aload_1
    //   77: invokevirtual equals : (Ljava/lang/Object;)Z
    //   80: ifeq -> 52
    //   83: aload #7
    //   85: iconst_1
    //   86: aaload
    //   87: astore_1
    //   88: aload_1
    //   89: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   92: pop
    //   93: goto -> 326
    //   96: aload #8
    //   98: ifnonnull -> 104
    //   101: goto -> 52
    //   104: aload #8
    //   106: instanceof [B
    //   109: ifeq -> 187
    //   112: aload #8
    //   114: checkcast [B
    //   117: astore #5
    //   119: aload #5
    //   121: arraylength
    //   122: istore_3
    //   123: aload_1
    //   124: invokevirtual hashCode : ()I
    //   127: invokestatic a : (I)I
    //   130: istore_2
    //   131: iload_2
    //   132: iload_3
    //   133: iconst_1
    //   134: isub
    //   135: iand
    //   136: istore_2
    //   137: aload #5
    //   139: iload_2
    //   140: baload
    //   141: sipush #255
    //   144: iand
    //   145: istore #4
    //   147: iload #4
    //   149: sipush #255
    //   152: if_icmpne -> 158
    //   155: goto -> 52
    //   158: aload_1
    //   159: aload #7
    //   161: iload #4
    //   163: aaload
    //   164: invokevirtual equals : (Ljava/lang/Object;)Z
    //   167: ifeq -> 181
    //   170: aload #7
    //   172: iload #4
    //   174: iconst_1
    //   175: ixor
    //   176: aaload
    //   177: astore_1
    //   178: goto -> 326
    //   181: iinc #2, 1
    //   184: goto -> 131
    //   187: aload #8
    //   189: instanceof [S
    //   192: ifeq -> 266
    //   195: aload #8
    //   197: checkcast [S
    //   200: astore #5
    //   202: aload #5
    //   204: arraylength
    //   205: istore_3
    //   206: aload_1
    //   207: invokevirtual hashCode : ()I
    //   210: invokestatic a : (I)I
    //   213: istore_2
    //   214: iload_2
    //   215: iload_3
    //   216: iconst_1
    //   217: isub
    //   218: iand
    //   219: istore #4
    //   221: aload #5
    //   223: iload #4
    //   225: saload
    //   226: i2c
    //   227: istore_2
    //   228: iload_2
    //   229: ldc 65535
    //   231: if_icmpne -> 237
    //   234: goto -> 52
    //   237: aload_1
    //   238: aload #7
    //   240: iload_2
    //   241: aaload
    //   242: invokevirtual equals : (Ljava/lang/Object;)Z
    //   245: ifeq -> 258
    //   248: aload #7
    //   250: iload_2
    //   251: iconst_1
    //   252: ixor
    //   253: aaload
    //   254: astore_1
    //   255: goto -> 326
    //   258: iload #4
    //   260: iconst_1
    //   261: iadd
    //   262: istore_2
    //   263: goto -> 214
    //   266: aload #8
    //   268: checkcast [I
    //   271: astore #5
    //   273: aload #5
    //   275: arraylength
    //   276: istore_3
    //   277: aload_1
    //   278: invokevirtual hashCode : ()I
    //   281: invokestatic a : (I)I
    //   284: istore_2
    //   285: iload_2
    //   286: iload_3
    //   287: iconst_1
    //   288: isub
    //   289: iand
    //   290: istore_2
    //   291: aload #5
    //   293: iload_2
    //   294: iaload
    //   295: istore #4
    //   297: iload #4
    //   299: iconst_m1
    //   300: if_icmpne -> 306
    //   303: goto -> 52
    //   306: aload_1
    //   307: aload #7
    //   309: iload #4
    //   311: aaload
    //   312: invokevirtual equals : (Ljava/lang/Object;)Z
    //   315: ifeq -> 338
    //   318: aload #7
    //   320: iload #4
    //   322: iconst_1
    //   323: ixor
    //   324: aaload
    //   325: astore_1
    //   326: aload_1
    //   327: ifnonnull -> 336
    //   330: aload #6
    //   332: astore_1
    //   333: goto -> 336
    //   336: aload_1
    //   337: areturn
    //   338: iinc #2, 1
    //   341: goto -> 285
    //   344: aload_1
    //   345: ifnonnull -> 353
    //   348: aconst_null
    //   349: astore_1
    //   350: goto -> 622
    //   353: iload_2
    //   354: iconst_1
    //   355: if_icmpne -> 392
    //   358: aload #7
    //   360: iconst_0
    //   361: aaload
    //   362: astore #6
    //   364: aload #6
    //   366: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   369: pop
    //   370: aload #6
    //   372: aload_1
    //   373: invokevirtual equals : (Ljava/lang/Object;)Z
    //   376: ifeq -> 348
    //   379: aload #7
    //   381: iconst_1
    //   382: aaload
    //   383: astore_1
    //   384: aload_1
    //   385: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   388: pop
    //   389: goto -> 622
    //   392: aload #8
    //   394: ifnonnull -> 400
    //   397: goto -> 348
    //   400: aload #8
    //   402: instanceof [B
    //   405: ifeq -> 483
    //   408: aload #8
    //   410: checkcast [B
    //   413: astore #6
    //   415: aload #6
    //   417: arraylength
    //   418: istore_3
    //   419: aload_1
    //   420: invokevirtual hashCode : ()I
    //   423: invokestatic V : (I)I
    //   426: istore_2
    //   427: iload_2
    //   428: iload_3
    //   429: iconst_1
    //   430: isub
    //   431: iand
    //   432: istore_2
    //   433: aload #6
    //   435: iload_2
    //   436: baload
    //   437: sipush #255
    //   440: iand
    //   441: istore #4
    //   443: iload #4
    //   445: sipush #255
    //   448: if_icmpne -> 454
    //   451: goto -> 348
    //   454: aload_1
    //   455: aload #7
    //   457: iload #4
    //   459: aaload
    //   460: invokevirtual equals : (Ljava/lang/Object;)Z
    //   463: ifeq -> 477
    //   466: aload #7
    //   468: iload #4
    //   470: iconst_1
    //   471: ixor
    //   472: aaload
    //   473: astore_1
    //   474: goto -> 622
    //   477: iinc #2, 1
    //   480: goto -> 427
    //   483: aload #8
    //   485: instanceof [S
    //   488: ifeq -> 562
    //   491: aload #8
    //   493: checkcast [S
    //   496: astore #6
    //   498: aload #6
    //   500: arraylength
    //   501: istore_3
    //   502: aload_1
    //   503: invokevirtual hashCode : ()I
    //   506: invokestatic V : (I)I
    //   509: istore_2
    //   510: iload_2
    //   511: iload_3
    //   512: iconst_1
    //   513: isub
    //   514: iand
    //   515: istore_2
    //   516: aload #6
    //   518: iload_2
    //   519: saload
    //   520: i2c
    //   521: istore #4
    //   523: iload #4
    //   525: ldc 65535
    //   527: if_icmpne -> 533
    //   530: goto -> 348
    //   533: aload_1
    //   534: aload #7
    //   536: iload #4
    //   538: aaload
    //   539: invokevirtual equals : (Ljava/lang/Object;)Z
    //   542: ifeq -> 556
    //   545: aload #7
    //   547: iload #4
    //   549: iconst_1
    //   550: ixor
    //   551: aaload
    //   552: astore_1
    //   553: goto -> 622
    //   556: iinc #2, 1
    //   559: goto -> 510
    //   562: aload #8
    //   564: checkcast [I
    //   567: astore #6
    //   569: aload #6
    //   571: arraylength
    //   572: istore_3
    //   573: aload_1
    //   574: invokevirtual hashCode : ()I
    //   577: invokestatic V : (I)I
    //   580: istore_2
    //   581: iload_2
    //   582: iload_3
    //   583: iconst_1
    //   584: isub
    //   585: iand
    //   586: istore_2
    //   587: aload #6
    //   589: iload_2
    //   590: iaload
    //   591: istore #4
    //   593: iload #4
    //   595: iconst_m1
    //   596: if_icmpne -> 602
    //   599: goto -> 348
    //   602: aload_1
    //   603: aload #7
    //   605: iload #4
    //   607: aaload
    //   608: invokevirtual equals : (Ljava/lang/Object;)Z
    //   611: ifeq -> 634
    //   614: aload #7
    //   616: iload #4
    //   618: iconst_1
    //   619: ixor
    //   620: aaload
    //   621: astore_1
    //   622: aload_1
    //   623: ifnonnull -> 632
    //   626: aload #5
    //   628: astore_1
    //   629: goto -> 632
    //   632: aload_1
    //   633: areturn
    //   634: iinc #2, 1
    //   637: goto -> 581
  }
  
  public final Object getOrDefault(Object paramObject1, Object paramObject2) {
    switch (this.b) {
      default:
        paramObject1 = get(paramObject1);
        if (paramObject1 != null)
          paramObject2 = paramObject1; 
        return paramObject2;
      case 0:
        break;
    } 
    paramObject1 = get(paramObject1);
    if (paramObject1 != null)
      paramObject2 = paramObject1; 
    return paramObject2;
  }
  
  public final int hashCode() {
    rm2 rm21;
    Iterator<rm2> iterator;
    rm2 rm22;
    switch (this.b) {
      default:
        rm22 = (rm2)this.g;
        rm21 = rm22;
        if (rm22 == null) {
          rm21 = new rm2(this, this.e, this.f);
          this.g = rm21;
        } 
        iterator = rm21.iterator();
        for (i = 0; iterator.hasNext(); i += b) {
          byte b;
          rm22 = iterator.next();
          if (rm22 != null) {
            b = rm22.hashCode();
          } else {
            b = 0;
          } 
        } 
        return i;
      case 0:
        break;
    } 
    wh2 wh22 = (wh2)this.g;
    wh2 wh21 = wh22;
    if (wh22 == null) {
      wh21 = new wh2(this, this.e, this.f);
      this.g = wh21;
    } 
    Iterator<wh2> iterator1 = wh21.iterator();
    int i;
    for (i = 0; iterator1.hasNext(); i += b) {
      byte b;
      wh21 = iterator1.next();
      if (wh21 != null) {
        b = wh21.hashCode();
      } else {
        b = 0;
      } 
    } 
    return i;
  }
  
  public final boolean isEmpty() {
    boolean bool;
    switch (this.b) {
      default:
        if (size() == 0) {
          bool = true;
        } else {
          bool = false;
        } 
        return bool;
      case 0:
        break;
    } 
    if (size() == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool;
  }
  
  public final Set keySet() {
    tm2 tm21;
    tm2 tm22;
    switch (this.b) {
      default:
        tm22 = (tm2)this.h;
        tm21 = tm22;
        if (tm22 == null) {
          tm21 = new tm2(this, new vm2(this.e, 0, this.f));
          this.h = tm21;
        } 
        return tm21;
      case 0:
        break;
    } 
    xh2 xh22 = (xh2)this.h;
    xh2 xh21 = xh22;
    if (xh22 == null) {
      xh21 = new xh2(this, new yh2(this.e, 0, this.f));
      this.h = xh21;
    } 
    return xh21;
  }
  
  public final Object put(Object paramObject1, Object paramObject2) {
    switch (this.b) {
      default:
        throw new UnsupportedOperationException();
      case 0:
        break;
    } 
    throw new UnsupportedOperationException();
  }
  
  public final void putAll(Map paramMap) {
    switch (this.b) {
      default:
        throw new UnsupportedOperationException();
      case 0:
        break;
    } 
    throw new UnsupportedOperationException();
  }
  
  public final Object remove(Object paramObject) {
    switch (this.b) {
      default:
        throw new UnsupportedOperationException();
      case 0:
        break;
    } 
    throw new UnsupportedOperationException();
  }
  
  public final int size() {
    switch (this.b) {
      default:
        return this.f;
      case 0:
        break;
    } 
    return this.f;
  }
  
  public final String toString() {
    StringBuilder stringBuilder1;
    String str;
    int k = this.b;
    Map.Entry entry = null;
    StringBuilder stringBuilder2 = null;
    int i = 1;
    int j = 1;
    switch (k) {
      default:
        i = this.f;
        if (i >= 0) {
          stringBuilder2 = new StringBuilder((int)Math.min(i * 8L, 1073741824L));
          stringBuilder2.append('{');
          Iterator<Map.Entry> iterator = ((rm2)entrySet()).iterator();
          for (i = j; iterator.hasNext(); i = 0) {
            entry = iterator.next();
            if (i == 0)
              stringBuilder2.append(", "); 
            stringBuilder2.append(entry.getKey());
            stringBuilder2.append('=');
            stringBuilder2.append(entry.getValue());
          } 
          stringBuilder2.append('}');
          str = stringBuilder2.toString();
        } else {
          ck2.b(String.valueOf(i).length() + 33, i, "size cannot be negative but was: ");
          stringBuilder1 = stringBuilder2;
        } 
        return (String)stringBuilder1;
      case 0:
        break;
    } 
    j = this.f;
    if (j >= 0) {
      stringBuilder1 = new StringBuilder((int)Math.min(j * 8L, 1073741824L));
      stringBuilder1.append('{');
      for (Map.Entry entry1 : entrySet()) {
        if (i == 0)
          stringBuilder1.append(", "); 
        stringBuilder1.append(entry1.getKey());
        stringBuilder1.append('=');
        stringBuilder1.append(entry1.getValue());
        i = 0;
      } 
      stringBuilder1.append('}');
      str = stringBuilder1.toString();
    } else {
      l0.l(ga1.i("size cannot be negative but was: ", j));
    } 
    return str;
  }
  
  public final Collection values() {
    vm2 vm21;
    vm2 vm22;
    switch (this.b) {
      default:
        vm22 = (vm2)this.i;
        vm21 = vm22;
        if (vm22 == null) {
          vm21 = new vm2(this.e, 1, this.f);
          this.i = vm21;
        } 
        return vm21;
      case 0:
        break;
    } 
    yh2 yh22 = (yh2)this.i;
    yh2 yh21 = yh22;
    if (yh22 == null) {
      yh21 = new yh2(this.e, 1, this.f);
      this.i = yh21;
    } 
    return yh21;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zh2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */