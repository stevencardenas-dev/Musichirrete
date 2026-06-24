import java.util.ArrayList;
import java.util.HashSet;

public final class hy {
  public fr a;
  
  public boolean b;
  
  public boolean c;
  
  public fr d;
  
  public ArrayList e;
  
  public hq f;
  
  public re g;
  
  public ArrayList h;
  
  public final void a(iy paramiy, int paramInt, ArrayList<Object> paramArrayList, sh1 paramsh1) {
    m52 m52 = paramiy.d;
    sh1 sh11 = m52.c;
    iy iy1 = m52.i;
    iy iy2 = m52.h;
    if (sh11 == null) {
      fr fr1 = this.a;
      if (m52 != fr1.d && m52 != fr1.e) {
        Object object = paramsh1;
        if (paramsh1 == null) {
          object = new Object();
          ((sh1)object).a = null;
          ((sh1)object).b = new ArrayList();
          ((sh1)object).a = m52;
          paramArrayList.add(object);
        } 
        m52.c = (sh1)object;
        ((sh1)object).b.add(m52);
        ArrayList<Object> arrayList = iy2.k;
        int k = arrayList.size();
        boolean bool = false;
        int i = 0;
        while (i < k) {
          cy cy = (cy)arrayList.get(i);
          int m = i + 1;
          cy = cy;
          i = m;
          if (cy instanceof iy) {
            a((iy)cy, paramInt, paramArrayList, (sh1)object);
            i = m;
          } 
        } 
        arrayList = iy1.k;
        k = arrayList.size();
        i = 0;
        while (i < k) {
          cy cy = (cy)arrayList.get(i);
          int m = i + 1;
          cy = cy;
          i = m;
          if (cy instanceof iy) {
            a((iy)cy, paramInt, paramArrayList, (sh1)object);
            i = m;
          } 
        } 
        if (paramInt == 1 && m52 instanceof d22) {
          arrayList = ((d22)m52).k.k;
          k = arrayList.size();
          i = 0;
          while (i < k) {
            cy cy = (cy)arrayList.get(i);
            int m = i + 1;
            cy = cy;
            i = m;
            if (cy instanceof iy) {
              a((iy)cy, paramInt, paramArrayList, (sh1)object);
              i = m;
            } 
          } 
        } 
        ArrayList<ArrayList<Object>> arrayList2 = iy2.l;
        int j = arrayList2.size();
        i = 0;
        while (i < j) {
          arrayList = arrayList2.get(i);
          i++;
          a((iy)arrayList, paramInt, paramArrayList, (sh1)object);
        } 
        ArrayList<ArrayList<Object>> arrayList1 = iy1.l;
        j = arrayList1.size();
        i = 0;
        while (i < j) {
          arrayList = arrayList1.get(i);
          i++;
          a((iy)arrayList, paramInt, paramArrayList, (sh1)object);
        } 
        if (paramInt == 1 && m52 instanceof d22) {
          ArrayList<ArrayList<Object>> arrayList3 = ((d22)m52).k.l;
          j = arrayList3.size();
          i = bool;
          while (i < j) {
            arrayList = arrayList3.get(i);
            i++;
            a((iy)arrayList, paramInt, paramArrayList, (sh1)object);
          } 
        } 
      } 
    } 
  }
  
  public final void b(fr paramfr) {
    // Byte code:
    //   0: aload_1
    //   1: getfield q0 : Ljava/util/ArrayList;
    //   4: astore #13
    //   6: aload_1
    //   7: getfield p0 : [I
    //   10: astore #14
    //   12: aload #13
    //   14: invokevirtual size : ()I
    //   17: istore #10
    //   19: iconst_0
    //   20: istore #4
    //   22: iconst_0
    //   23: istore #5
    //   25: iload #5
    //   27: iload #10
    //   29: if_icmpge -> 1475
    //   32: aload #13
    //   34: iload #5
    //   36: invokevirtual get : (I)Ljava/lang/Object;
    //   39: astore #15
    //   41: iload #5
    //   43: iconst_1
    //   44: iadd
    //   45: istore #9
    //   47: aload #15
    //   49: checkcast er
    //   52: astore #16
    //   54: aload #16
    //   56: getfield p0 : [I
    //   59: astore #21
    //   61: aload #16
    //   63: getfield Q : [Lbq;
    //   66: astore #15
    //   68: aload #16
    //   70: getfield L : Lbq;
    //   73: astore #18
    //   75: aload #16
    //   77: getfield J : Lbq;
    //   80: astore #17
    //   82: aload #16
    //   84: getfield K : Lbq;
    //   87: astore #20
    //   89: aload #16
    //   91: getfield I : Lbq;
    //   94: astore #19
    //   96: aload #21
    //   98: iload #4
    //   100: iaload
    //   101: istore #5
    //   103: aload #21
    //   105: iconst_1
    //   106: iaload
    //   107: istore #7
    //   109: aload #16
    //   111: getfield g0 : I
    //   114: bipush #8
    //   116: if_icmpne -> 132
    //   119: aload #16
    //   121: iconst_1
    //   122: putfield a : Z
    //   125: iload #9
    //   127: istore #5
    //   129: goto -> 25
    //   132: aload #16
    //   134: getfield w : F
    //   137: fstore_2
    //   138: fload_2
    //   139: fconst_1
    //   140: fcmpg
    //   141: ifge -> 156
    //   144: iload #5
    //   146: iconst_3
    //   147: if_icmpne -> 156
    //   150: aload #16
    //   152: iconst_2
    //   153: putfield r : I
    //   156: aload #16
    //   158: getfield z : F
    //   161: fstore_3
    //   162: fload_3
    //   163: fconst_1
    //   164: fcmpg
    //   165: ifge -> 180
    //   168: iload #7
    //   170: iconst_3
    //   171: if_icmpne -> 180
    //   174: aload #16
    //   176: iconst_2
    //   177: putfield s : I
    //   180: aload #16
    //   182: getfield W : F
    //   185: fconst_0
    //   186: fcmpl
    //   187: ifle -> 293
    //   190: iload #5
    //   192: iconst_3
    //   193: if_icmpne -> 223
    //   196: iload #7
    //   198: iconst_2
    //   199: if_icmpeq -> 208
    //   202: iload #7
    //   204: iconst_1
    //   205: if_icmpne -> 211
    //   208: goto -> 214
    //   211: goto -> 223
    //   214: aload #16
    //   216: iconst_3
    //   217: putfield r : I
    //   220: goto -> 293
    //   223: iload #7
    //   225: iconst_3
    //   226: if_icmpne -> 250
    //   229: iload #5
    //   231: iconst_2
    //   232: if_icmpeq -> 241
    //   235: iload #5
    //   237: iconst_1
    //   238: if_icmpne -> 250
    //   241: aload #16
    //   243: iconst_3
    //   244: putfield s : I
    //   247: goto -> 293
    //   250: iload #5
    //   252: iconst_3
    //   253: if_icmpne -> 293
    //   256: iload #7
    //   258: iconst_3
    //   259: if_icmpne -> 293
    //   262: aload #16
    //   264: getfield r : I
    //   267: ifne -> 276
    //   270: aload #16
    //   272: iconst_3
    //   273: putfield r : I
    //   276: aload #16
    //   278: getfield s : I
    //   281: ifne -> 293
    //   284: aload #16
    //   286: iconst_3
    //   287: putfield s : I
    //   290: goto -> 293
    //   293: iload #5
    //   295: istore #6
    //   297: iload #5
    //   299: iconst_3
    //   300: if_icmpne -> 339
    //   303: iload #5
    //   305: istore #6
    //   307: aload #16
    //   309: getfield r : I
    //   312: iconst_1
    //   313: if_icmpne -> 339
    //   316: aload #19
    //   318: getfield f : Lbq;
    //   321: ifnull -> 336
    //   324: iload #5
    //   326: istore #6
    //   328: aload #20
    //   330: getfield f : Lbq;
    //   333: ifnonnull -> 339
    //   336: iconst_2
    //   337: istore #6
    //   339: iload #7
    //   341: istore #5
    //   343: iload #7
    //   345: iconst_3
    //   346: if_icmpne -> 385
    //   349: iload #7
    //   351: istore #5
    //   353: aload #16
    //   355: getfield s : I
    //   358: iconst_1
    //   359: if_icmpne -> 385
    //   362: aload #17
    //   364: getfield f : Lbq;
    //   367: ifnull -> 382
    //   370: iload #7
    //   372: istore #5
    //   374: aload #18
    //   376: getfield f : Lbq;
    //   379: ifnonnull -> 385
    //   382: iconst_2
    //   383: istore #5
    //   385: aload #16
    //   387: getfield d : Lfg0;
    //   390: astore #21
    //   392: aload #21
    //   394: iload #6
    //   396: putfield d : I
    //   399: aload #16
    //   401: getfield r : I
    //   404: istore #8
    //   406: aload #21
    //   408: iload #8
    //   410: putfield a : I
    //   413: aload #16
    //   415: getfield e : Ld22;
    //   418: astore #21
    //   420: aload #21
    //   422: iload #5
    //   424: putfield d : I
    //   427: aload #16
    //   429: getfield s : I
    //   432: istore #7
    //   434: aload #21
    //   436: iload #7
    //   438: putfield a : I
    //   441: iload #6
    //   443: iconst_4
    //   444: if_icmpeq -> 459
    //   447: iload #6
    //   449: iconst_1
    //   450: if_icmpeq -> 459
    //   453: iload #6
    //   455: iconst_2
    //   456: if_icmpne -> 480
    //   459: iload #5
    //   461: iconst_4
    //   462: if_icmpeq -> 477
    //   465: iload #5
    //   467: iconst_1
    //   468: if_icmpeq -> 1329
    //   471: iload #5
    //   473: iconst_2
    //   474: if_icmpne -> 480
    //   477: goto -> 1329
    //   480: iload #6
    //   482: iconst_3
    //   483: if_icmpne -> 807
    //   486: iload #5
    //   488: iconst_2
    //   489: if_icmpeq -> 504
    //   492: iload #5
    //   494: iconst_1
    //   495: if_icmpne -> 501
    //   498: goto -> 504
    //   501: goto -> 810
    //   504: iload #8
    //   506: iconst_3
    //   507: if_icmpne -> 601
    //   510: iload #5
    //   512: iconst_2
    //   513: if_icmpne -> 526
    //   516: aload_0
    //   517: iconst_2
    //   518: iconst_0
    //   519: iconst_2
    //   520: iconst_0
    //   521: aload #16
    //   523: invokevirtual f : (IIIILer;)V
    //   526: aload #16
    //   528: invokevirtual i : ()I
    //   531: istore #5
    //   533: aload_0
    //   534: iconst_1
    //   535: iload #5
    //   537: i2f
    //   538: aload #16
    //   540: getfield W : F
    //   543: fmul
    //   544: ldc 0.5
    //   546: fadd
    //   547: f2i
    //   548: iconst_1
    //   549: iload #5
    //   551: aload #16
    //   553: invokevirtual f : (IIIILer;)V
    //   556: aload #16
    //   558: getfield d : Lfg0;
    //   561: getfield e : Lrz;
    //   564: aload #16
    //   566: invokevirtual o : ()I
    //   569: invokevirtual d : (I)V
    //   572: aload #16
    //   574: getfield e : Ld22;
    //   577: getfield e : Lrz;
    //   580: aload #16
    //   582: invokevirtual i : ()I
    //   585: invokevirtual d : (I)V
    //   588: aload #16
    //   590: iconst_1
    //   591: putfield a : Z
    //   594: iload #9
    //   596: istore #5
    //   598: goto -> 25
    //   601: iload #8
    //   603: iconst_1
    //   604: if_icmpne -> 637
    //   607: aload_0
    //   608: iconst_2
    //   609: iconst_0
    //   610: iload #5
    //   612: iconst_0
    //   613: aload #16
    //   615: invokevirtual f : (IIIILer;)V
    //   618: aload #16
    //   620: getfield d : Lfg0;
    //   623: getfield e : Lrz;
    //   626: aload #16
    //   628: invokevirtual o : ()I
    //   631: putfield m : I
    //   634: goto -> 594
    //   637: iload #8
    //   639: iconst_2
    //   640: if_icmpne -> 734
    //   643: aload #14
    //   645: iload #4
    //   647: iaload
    //   648: istore #11
    //   650: iload #11
    //   652: iconst_1
    //   653: if_icmpeq -> 668
    //   656: iload #11
    //   658: iconst_4
    //   659: if_icmpne -> 665
    //   662: goto -> 668
    //   665: goto -> 810
    //   668: aload_0
    //   669: iconst_1
    //   670: fload_2
    //   671: aload_1
    //   672: invokevirtual o : ()I
    //   675: i2f
    //   676: fmul
    //   677: ldc 0.5
    //   679: fadd
    //   680: f2i
    //   681: iload #5
    //   683: aload #16
    //   685: invokevirtual i : ()I
    //   688: aload #16
    //   690: invokevirtual f : (IIIILer;)V
    //   693: aload #16
    //   695: getfield d : Lfg0;
    //   698: getfield e : Lrz;
    //   701: aload #16
    //   703: invokevirtual o : ()I
    //   706: invokevirtual d : (I)V
    //   709: aload #16
    //   711: getfield e : Ld22;
    //   714: getfield e : Lrz;
    //   717: aload #16
    //   719: invokevirtual i : ()I
    //   722: invokevirtual d : (I)V
    //   725: aload #16
    //   727: iconst_1
    //   728: putfield a : Z
    //   731: goto -> 594
    //   734: aload #15
    //   736: iload #4
    //   738: aaload
    //   739: getfield f : Lbq;
    //   742: ifnull -> 755
    //   745: aload #15
    //   747: iconst_1
    //   748: aaload
    //   749: getfield f : Lbq;
    //   752: ifnonnull -> 665
    //   755: aload_0
    //   756: iconst_2
    //   757: iconst_0
    //   758: iload #5
    //   760: iconst_0
    //   761: aload #16
    //   763: invokevirtual f : (IIIILer;)V
    //   766: aload #16
    //   768: getfield d : Lfg0;
    //   771: getfield e : Lrz;
    //   774: aload #16
    //   776: invokevirtual o : ()I
    //   779: invokevirtual d : (I)V
    //   782: aload #16
    //   784: getfield e : Ld22;
    //   787: getfield e : Lrz;
    //   790: aload #16
    //   792: invokevirtual i : ()I
    //   795: invokevirtual d : (I)V
    //   798: aload #16
    //   800: iconst_1
    //   801: putfield a : Z
    //   804: goto -> 594
    //   807: goto -> 665
    //   810: iload #5
    //   812: iconst_3
    //   813: if_icmpne -> 1154
    //   816: iload #6
    //   818: iconst_2
    //   819: if_icmpeq -> 834
    //   822: iload #6
    //   824: iconst_1
    //   825: if_icmpne -> 831
    //   828: goto -> 834
    //   831: goto -> 1157
    //   834: iload #7
    //   836: iconst_3
    //   837: if_icmpne -> 944
    //   840: iload #6
    //   842: iconst_2
    //   843: if_icmpne -> 856
    //   846: aload_0
    //   847: iconst_2
    //   848: iconst_0
    //   849: iconst_2
    //   850: iconst_0
    //   851: aload #16
    //   853: invokevirtual f : (IIIILer;)V
    //   856: aload #16
    //   858: invokevirtual o : ()I
    //   861: istore #5
    //   863: aload #16
    //   865: getfield W : F
    //   868: fstore_3
    //   869: fload_3
    //   870: fstore_2
    //   871: aload #16
    //   873: getfield X : I
    //   876: iconst_m1
    //   877: if_icmpne -> 884
    //   880: fconst_1
    //   881: fload_3
    //   882: fdiv
    //   883: fstore_2
    //   884: aload_0
    //   885: iconst_1
    //   886: iload #5
    //   888: iconst_1
    //   889: iload #5
    //   891: i2f
    //   892: fload_2
    //   893: fmul
    //   894: ldc 0.5
    //   896: fadd
    //   897: f2i
    //   898: aload #16
    //   900: invokevirtual f : (IIIILer;)V
    //   903: aload #16
    //   905: getfield d : Lfg0;
    //   908: getfield e : Lrz;
    //   911: aload #16
    //   913: invokevirtual o : ()I
    //   916: invokevirtual d : (I)V
    //   919: aload #16
    //   921: getfield e : Ld22;
    //   924: getfield e : Lrz;
    //   927: aload #16
    //   929: invokevirtual i : ()I
    //   932: invokevirtual d : (I)V
    //   935: aload #16
    //   937: iconst_1
    //   938: putfield a : Z
    //   941: goto -> 594
    //   944: iload #7
    //   946: iconst_1
    //   947: if_icmpne -> 980
    //   950: aload_0
    //   951: iload #6
    //   953: iconst_0
    //   954: iconst_2
    //   955: iconst_0
    //   956: aload #16
    //   958: invokevirtual f : (IIIILer;)V
    //   961: aload #16
    //   963: getfield e : Ld22;
    //   966: getfield e : Lrz;
    //   969: aload #16
    //   971: invokevirtual i : ()I
    //   974: putfield m : I
    //   977: goto -> 594
    //   980: iload #7
    //   982: iconst_2
    //   983: if_icmpne -> 1076
    //   986: aload #14
    //   988: iconst_1
    //   989: iaload
    //   990: istore #11
    //   992: iload #11
    //   994: iconst_1
    //   995: if_icmpeq -> 1010
    //   998: iload #11
    //   1000: iconst_4
    //   1001: if_icmpne -> 1007
    //   1004: goto -> 1010
    //   1007: goto -> 831
    //   1010: aload_0
    //   1011: iload #6
    //   1013: aload #16
    //   1015: invokevirtual o : ()I
    //   1018: iconst_1
    //   1019: fload_3
    //   1020: aload_1
    //   1021: invokevirtual i : ()I
    //   1024: i2f
    //   1025: fmul
    //   1026: ldc 0.5
    //   1028: fadd
    //   1029: f2i
    //   1030: aload #16
    //   1032: invokevirtual f : (IIIILer;)V
    //   1035: aload #16
    //   1037: getfield d : Lfg0;
    //   1040: getfield e : Lrz;
    //   1043: aload #16
    //   1045: invokevirtual o : ()I
    //   1048: invokevirtual d : (I)V
    //   1051: aload #16
    //   1053: getfield e : Ld22;
    //   1056: getfield e : Lrz;
    //   1059: aload #16
    //   1061: invokevirtual i : ()I
    //   1064: invokevirtual d : (I)V
    //   1067: aload #16
    //   1069: iconst_1
    //   1070: putfield a : Z
    //   1073: goto -> 594
    //   1076: aload #15
    //   1078: iconst_2
    //   1079: aaload
    //   1080: getfield f : Lbq;
    //   1083: ifnull -> 1102
    //   1086: aload #15
    //   1088: iconst_3
    //   1089: aaload
    //   1090: getfield f : Lbq;
    //   1093: ifnonnull -> 1099
    //   1096: goto -> 1102
    //   1099: goto -> 1157
    //   1102: aload_0
    //   1103: iconst_2
    //   1104: iconst_0
    //   1105: iload #5
    //   1107: iconst_0
    //   1108: aload #16
    //   1110: invokevirtual f : (IIIILer;)V
    //   1113: aload #16
    //   1115: getfield d : Lfg0;
    //   1118: getfield e : Lrz;
    //   1121: aload #16
    //   1123: invokevirtual o : ()I
    //   1126: invokevirtual d : (I)V
    //   1129: aload #16
    //   1131: getfield e : Ld22;
    //   1134: getfield e : Lrz;
    //   1137: aload #16
    //   1139: invokevirtual i : ()I
    //   1142: invokevirtual d : (I)V
    //   1145: aload #16
    //   1147: iconst_1
    //   1148: putfield a : Z
    //   1151: goto -> 594
    //   1154: goto -> 1099
    //   1157: iload #6
    //   1159: iconst_3
    //   1160: if_icmpne -> 594
    //   1163: iload #5
    //   1165: iconst_3
    //   1166: if_icmpne -> 594
    //   1169: iload #8
    //   1171: iconst_1
    //   1172: if_icmpeq -> 1284
    //   1175: iload #7
    //   1177: iconst_1
    //   1178: if_icmpne -> 1184
    //   1181: goto -> 1284
    //   1184: iload #7
    //   1186: iconst_2
    //   1187: if_icmpne -> 594
    //   1190: iload #8
    //   1192: iconst_2
    //   1193: if_icmpne -> 594
    //   1196: aload #14
    //   1198: iload #4
    //   1200: iaload
    //   1201: iconst_1
    //   1202: if_icmpne -> 594
    //   1205: aload #14
    //   1207: iconst_1
    //   1208: iaload
    //   1209: iconst_1
    //   1210: if_icmpne -> 594
    //   1213: aload_0
    //   1214: iconst_1
    //   1215: fload_2
    //   1216: aload_1
    //   1217: invokevirtual o : ()I
    //   1220: i2f
    //   1221: fmul
    //   1222: ldc 0.5
    //   1224: fadd
    //   1225: f2i
    //   1226: iconst_1
    //   1227: fload_3
    //   1228: aload_1
    //   1229: invokevirtual i : ()I
    //   1232: i2f
    //   1233: fmul
    //   1234: ldc 0.5
    //   1236: fadd
    //   1237: f2i
    //   1238: aload #16
    //   1240: invokevirtual f : (IIIILer;)V
    //   1243: aload #16
    //   1245: getfield d : Lfg0;
    //   1248: getfield e : Lrz;
    //   1251: aload #16
    //   1253: invokevirtual o : ()I
    //   1256: invokevirtual d : (I)V
    //   1259: aload #16
    //   1261: getfield e : Ld22;
    //   1264: getfield e : Lrz;
    //   1267: aload #16
    //   1269: invokevirtual i : ()I
    //   1272: invokevirtual d : (I)V
    //   1275: aload #16
    //   1277: iconst_1
    //   1278: putfield a : Z
    //   1281: goto -> 594
    //   1284: aload_0
    //   1285: iconst_2
    //   1286: iconst_0
    //   1287: iconst_2
    //   1288: iconst_0
    //   1289: aload #16
    //   1291: invokevirtual f : (IIIILer;)V
    //   1294: aload #16
    //   1296: getfield d : Lfg0;
    //   1299: getfield e : Lrz;
    //   1302: aload #16
    //   1304: invokevirtual o : ()I
    //   1307: putfield m : I
    //   1310: aload #16
    //   1312: getfield e : Ld22;
    //   1315: getfield e : Lrz;
    //   1318: aload #16
    //   1320: invokevirtual i : ()I
    //   1323: putfield m : I
    //   1326: goto -> 594
    //   1329: iload #6
    //   1331: istore #8
    //   1333: aload #16
    //   1335: invokevirtual o : ()I
    //   1338: istore #7
    //   1340: iload #8
    //   1342: istore #6
    //   1344: iload #8
    //   1346: iconst_4
    //   1347: if_icmpne -> 1371
    //   1350: aload_1
    //   1351: invokevirtual o : ()I
    //   1354: aload #19
    //   1356: getfield g : I
    //   1359: isub
    //   1360: aload #20
    //   1362: getfield g : I
    //   1365: isub
    //   1366: istore #7
    //   1368: iconst_1
    //   1369: istore #6
    //   1371: aload #16
    //   1373: invokevirtual i : ()I
    //   1376: istore #8
    //   1378: iload #5
    //   1380: iconst_4
    //   1381: if_icmpne -> 1420
    //   1384: aload_1
    //   1385: invokevirtual i : ()I
    //   1388: istore #11
    //   1390: aload #17
    //   1392: getfield g : I
    //   1395: istore #12
    //   1397: aload #18
    //   1399: getfield g : I
    //   1402: istore #8
    //   1404: iconst_1
    //   1405: istore #5
    //   1407: iload #11
    //   1409: iload #12
    //   1411: isub
    //   1412: iload #8
    //   1414: isub
    //   1415: istore #8
    //   1417: goto -> 1420
    //   1420: aload_0
    //   1421: iload #6
    //   1423: iload #7
    //   1425: iload #5
    //   1427: iload #8
    //   1429: aload #16
    //   1431: invokevirtual f : (IIIILer;)V
    //   1434: aload #16
    //   1436: getfield d : Lfg0;
    //   1439: getfield e : Lrz;
    //   1442: aload #16
    //   1444: invokevirtual o : ()I
    //   1447: invokevirtual d : (I)V
    //   1450: aload #16
    //   1452: getfield e : Ld22;
    //   1455: getfield e : Lrz;
    //   1458: aload #16
    //   1460: invokevirtual i : ()I
    //   1463: invokevirtual d : (I)V
    //   1466: aload #16
    //   1468: iconst_1
    //   1469: putfield a : Z
    //   1472: goto -> 594
    //   1475: return
  }
  
  public final void c() {
    HashSet<wj> hashSet;
    fr fr2 = this.a;
    ArrayList arrayList1 = this.h;
    ArrayList<fg0> arrayList = this.e;
    arrayList.clear();
    fr fr1 = this.d;
    fr1.d.f();
    fr1.e.f();
    arrayList.add(fr1.d);
    arrayList.add(fr1.e);
    ArrayList<Object> arrayList2 = fr1.q0;
    int k = arrayList2.size();
    er er = null;
    int i = 0;
    while (i < k) {
      HashSet<wj> hashSet1;
      er er1 = (er)arrayList2.get(i);
      int m = i + 1;
      er er2 = er1;
      if (er2 instanceof bf0) {
        m52 m52 = new m52(er2);
        er2.d.f();
        er2.e.f();
        m52.f = ((bf0)er2).u0;
        arrayList.add(m52);
        i = m;
        continue;
      } 
      if (er2.v()) {
        if (er2.b == null)
          er2.b = new wj(er2, 0); 
        er1 = er;
        if (er == null)
          hashSet1 = new HashSet(); 
        hashSet1.add(er2.b);
        hashSet = hashSet1;
      } else {
        arrayList.add(er2.d);
      } 
      if (er2.w()) {
        if (er2.c == null)
          er2.c = new wj(er2, 1); 
        hashSet1 = hashSet;
        if (hashSet == null)
          hashSet1 = new HashSet<wj>(); 
        hashSet1.add(er2.c);
      } else {
        arrayList.add(er2.e);
        hashSet1 = hashSet;
      } 
      hashSet = hashSet1;
      i = m;
      if (er2 instanceof yb) {
        arrayList.add(new m52(er2));
        hashSet = hashSet1;
        i = m;
      } 
    } 
    if (hashSet != null)
      arrayList.addAll(hashSet); 
    int j = arrayList.size();
    i = 0;
    while (i < j) {
      hashSet = (HashSet<wj>)arrayList.get(i);
      i++;
      ((m52)hashSet).f();
    } 
    j = arrayList.size();
    i = 0;
    while (i < j) {
      hashSet = (HashSet<wj>)arrayList.get(i);
      i++;
      m52 m52 = (m52)hashSet;
      if (m52.b == fr1)
        continue; 
      m52.d();
    } 
    arrayList1.clear();
    e(fr2.d, 0, arrayList1);
    e(fr2.e, 1, arrayList1);
    this.b = false;
  }
  
  public final int d(fr paramfr, int paramInt) {
    ArrayList arrayList = this.h;
    int i = arrayList.size();
    byte b = 0;
    long l = 0L;
    while (b < i) {
      long l1;
      m52 m52 = ((sh1)arrayList.get(b)).a;
      if ((m52 instanceof wj) ? (m52.f != paramInt) : ((paramInt == 0) ? !(m52 instanceof fg0) : !(m52 instanceof d22))) {
        l1 = 0L;
      } else {
        d22 d22;
        er er;
        if (paramInt == 0) {
          fg0 fg0 = paramfr.d;
        } else {
          d22 = paramfr.e;
        } 
        iy iy2 = d22.h;
        if (paramInt == 0) {
          fg0 fg0 = paramfr.d;
        } else {
          d22 = paramfr.e;
        } 
        iy iy4 = d22.i;
        iy iy3 = m52.h;
        iy iy1 = m52.i;
        boolean bool2 = iy3.l.contains(iy2);
        boolean bool1 = iy1.l.contains(iy4);
        long l2 = m52.j();
        if (bool2 && bool1) {
          float f1;
          l1 = sh1.b(iy3, 0L);
          long l4 = sh1.a(iy1, 0L);
          long l3 = l1 - l2;
          int j = iy1.f;
          l1 = l3;
          if (l3 >= -j)
            l1 = l3 + j; 
          l3 = -l4;
          long l5 = iy3.f;
          l4 = l3 - l2 - l5;
          l3 = l4;
          if (l4 >= l5)
            l3 = l4 - l5; 
          er = m52.b;
          if (paramInt == 0) {
            f1 = er.d0;
          } else if (paramInt == 1) {
            f1 = er.e0;
          } else {
            er.getClass();
            f1 = -1.0F;
          } 
          if (f1 > 0.0F) {
            float f = (float)l3 / f1;
            l1 = (long)((float)l1 / (1.0F - f1) + f);
          } else {
            l1 = 0L;
          } 
          float f2 = (float)l1;
          l3 = (long)(f2 * f1 + 0.5F);
          l1 = (long)x41.e(1.0F, f1, f2, 0.5F);
          l1 = iy3.f + l3 + l2 + l1 - iy1.f;
        } else if (bool2) {
          l1 = Math.max(sh1.b(iy3, iy3.f), iy3.f + l2);
        } else if (bool1) {
          l1 = sh1.a(iy1, iy1.f);
          long l3 = -iy1.f;
          l1 = Math.max(-l1, l3 + l2);
        } else {
          l1 = iy3.f;
          l1 = er.j() + l1 - iy1.f;
        } 
      } 
      l = Math.max(l, l1);
      b++;
    } 
    return (int)l;
  }
  
  public final void e(m52 paramm52, int paramInt, ArrayList paramArrayList) {
    iy iy2 = paramm52.h;
    iy iy1 = paramm52.i;
    ArrayList<Object> arrayList1 = iy2.k;
    int k = arrayList1.size();
    int j = 0;
    int i = 0;
    while (i < k) {
      cy cy = (cy)arrayList1.get(i);
      int m = i + 1;
      cy = cy;
      if (cy instanceof iy) {
        a((iy)cy, paramInt, paramArrayList, null);
        i = m;
        continue;
      } 
      i = m;
      if (cy instanceof m52) {
        a(((m52)cy).h, paramInt, paramArrayList, null);
        i = m;
      } 
    } 
    ArrayList<ArrayList<Object>> arrayList = iy1.k;
    k = arrayList.size();
    i = 0;
    while (i < k) {
      arrayList1 = arrayList.get(i);
      int m = i + 1;
      cy cy = (cy)arrayList1;
      if (cy instanceof iy) {
        a((iy)cy, paramInt, paramArrayList, null);
        i = m;
        continue;
      } 
      i = m;
      if (cy instanceof m52) {
        a(((m52)cy).i, paramInt, paramArrayList, null);
        i = m;
      } 
    } 
    if (paramInt == 1) {
      ArrayList<ArrayList<ArrayList<Object>>> arrayList2 = ((d22)paramm52).k.k;
      int m = arrayList2.size();
      i = j;
      while (i < m) {
        arrayList = arrayList2.get(i);
        j = i + 1;
        cy cy = (cy)arrayList;
        i = j;
        if (cy instanceof iy) {
          a((iy)cy, paramInt, paramArrayList, null);
          i = j;
        } 
      } 
    } 
  }
  
  public final void f(int paramInt1, int paramInt2, int paramInt3, int paramInt4, er paramer) {
    boolean bool;
    re re1 = this.g;
    re1.a = paramInt1;
    re1.b = paramInt3;
    re1.c = paramInt2;
    re1.d = paramInt4;
    this.f.b(paramer, re1);
    paramer.K(re1.e);
    paramer.H(re1.f);
    paramer.E = re1.h;
    paramInt1 = re1.g;
    paramer.a0 = paramInt1;
    if (paramInt1 > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    paramer.E = bool;
  }
  
  public final void g() {
    hy hy1 = this;
    ArrayList<er> arrayList = hy1.a.q0;
    int i = arrayList.size();
    for (byte b = 0; b < i; b++) {
      er er = arrayList.get(b);
      if (!er.a) {
        int[] arrayOfInt = er.p0;
        int n = arrayOfInt[0];
        int m = arrayOfInt[1];
        int j = er.r;
        int k = er.s;
        if (n == 2 || (n == 3 && j == 1)) {
          j = 1;
        } else {
          j = 0;
        } 
        if (m == 2 || (m == 3 && k == 1)) {
          k = 1;
        } else {
          k = 0;
        } 
        rz rz2 = er.d.e;
        boolean bool2 = rz2.j;
        rz rz1 = er.e.e;
        boolean bool1 = rz1.j;
        if (bool2 && bool1) {
          hy1.f(1, rz2.g, 1, rz1.g, er);
          er.a = true;
        } else if (bool2 && k != 0) {
          f(1, rz2.g, 2, rz1.g, er);
          d22 d22 = er.e;
          if (m == 3) {
            d22.e.m = er.i();
          } else {
            d22.e.d(er.i());
            er.a = true;
          } 
        } else if (bool1 && j != 0) {
          f(2, rz2.g, 1, rz1.g, er);
          fg0 fg0 = er.d;
          if (n == 3) {
            fg0.e.m = er.o();
          } else {
            fg0.e.d(er.o());
            er.a = true;
          } 
        } 
        if (er.a) {
          ke ke = er.e.l;
          if (ke != null)
            ke.d(er.a0); 
        } 
        hy1 = this;
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */