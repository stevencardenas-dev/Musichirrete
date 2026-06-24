import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.io.Serializable;

public final class vq extends pr1 implements ad0 {
  public final int g;
  
  public int h;
  
  public Object i;
  
  public Object j;
  
  public final Object k;
  
  public final Object l;
  
  public vq(ConstraintTrackingWorker paramConstraintTrackingWorker, oo0 paramoo0, bv0 parambv0, y72 paramy72, cs paramcs) {
    super(2, paramcs);
  }
  
  public vq(jx1 paramjx1, int[] paramArrayOfint, String[] paramArrayOfString, cs paramcs) {
    super(2, paramcs);
  }
  
  public final Object g(Object paramObject1, Object paramObject2) {
    int i = this.g;
    l02 l02 = l02.a;
    switch (i) {
      default:
        paramObject1 = paramObject1;
        return ((vq)l((cs)paramObject2, paramObject1)).n(l02);
      case 4:
        paramObject1 = paramObject1;
        ((vq)l((cs)paramObject2, paramObject1)).n(l02);
        return ys.b;
      case 3:
        paramObject1 = paramObject1;
        return ((vq)l((cs)paramObject2, paramObject1)).n(l02);
      case 2:
        paramObject1 = paramObject1;
        return ((vq)l((cs)paramObject2, paramObject1)).n(l02);
      case 1:
        paramObject1 = paramObject1;
        return ((vq)l((cs)paramObject2, paramObject1)).n(l02);
      case 0:
        break;
    } 
    paramObject1 = paramObject1;
    return ((vq)l((cs)paramObject2, paramObject1)).n(l02);
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    int i = this.g;
    Object object1 = this.l;
    Object object2 = this.k;
    switch (i) {
      default:
        return new vq(this.i, (y72)this.j, object2, object1, paramcs, 5);
      case 4:
        paramcs = new vq((jx1)this.j, (int[])object2, (String[])object1, paramcs);
        ((vq)paramcs).i = paramObject;
        return paramcs;
      case 3:
        return new vq(object2, (u20)object1, paramcs, 3);
      case 2:
        paramcs = new vq(object2, (iq0)object1, paramcs, 2);
        ((vq)paramcs).j = paramObject;
        return paramcs;
      case 1:
        return new vq((ConstraintTrackingWorker)object2, (oo0)object1, (bv0)this.i, (y72)this.j, paramcs);
      case 0:
        break;
    } 
    return new vq(this.i, (y72)this.j, object2, object1, paramcs, 0);
  }
  
  public final Object n(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : I
    //   4: istore_2
    //   5: getstatic l02.a : Ll02;
    //   8: astore #10
    //   10: aload_0
    //   11: getfield k : Ljava/lang/Object;
    //   14: astore #12
    //   16: getstatic ys.b : Lys;
    //   19: astore #9
    //   21: aload_0
    //   22: getfield l : Ljava/lang/Object;
    //   25: astore #14
    //   27: aconst_null
    //   28: astore #16
    //   30: aconst_null
    //   31: astore #11
    //   33: iload_2
    //   34: tableswitch default -> 68, 0 -> 2157, 1 -> 2058, 2 -> 1059, 3 -> 849, 4 -> 337
    //   68: aload_0
    //   69: getfield j : Ljava/lang/Object;
    //   72: checkcast y72
    //   75: getfield c : Ljava/lang/String;
    //   78: astore #15
    //   80: aload_0
    //   81: getfield i : Ljava/lang/Object;
    //   84: checkcast oo0
    //   87: astore #13
    //   89: aload_0
    //   90: getfield h : I
    //   93: istore_2
    //   94: iload_2
    //   95: ifeq -> 133
    //   98: iload_2
    //   99: iconst_1
    //   100: if_icmpeq -> 126
    //   103: iload_2
    //   104: iconst_2
    //   105: if_icmpne -> 115
    //   108: aload_1
    //   109: invokestatic r0 : (Ljava/lang/Object;)V
    //   112: goto -> 335
    //   115: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   117: invokestatic f : (Ljava/lang/String;)V
    //   120: aload #11
    //   122: astore_1
    //   123: goto -> 335
    //   126: aload_1
    //   127: invokestatic r0 : (Ljava/lang/Object;)V
    //   130: goto -> 170
    //   133: aload_1
    //   134: invokestatic r0 : (Ljava/lang/Object;)V
    //   137: aload #13
    //   139: invokevirtual a : ()Lei;
    //   142: astore_1
    //   143: aload_0
    //   144: iconst_1
    //   145: putfield h : I
    //   148: aload_1
    //   149: aload #13
    //   151: aload_0
    //   152: invokestatic a : (Lho0;Loo0;Lpr1;)Ljava/lang/Object;
    //   155: astore #10
    //   157: aload #10
    //   159: astore_1
    //   160: aload #10
    //   162: aload #9
    //   164: if_acmpne -> 170
    //   167: goto -> 311
    //   170: aload_1
    //   171: checkcast ja0
    //   174: astore_1
    //   175: aload_1
    //   176: ifnull -> 320
    //   179: getstatic k72.a : Ljava/lang/String;
    //   182: astore #16
    //   184: invokestatic h : ()Lqp0;
    //   187: astore #10
    //   189: new java/lang/StringBuilder
    //   192: dup
    //   193: ldc 'Updating notification for '
    //   195: invokespecial <init> : (Ljava/lang/String;)V
    //   198: astore #11
    //   200: aload #11
    //   202: aload #15
    //   204: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: pop
    //   208: aload #10
    //   210: aload #16
    //   212: aload #11
    //   214: invokevirtual toString : ()Ljava/lang/String;
    //   217: invokevirtual b : (Ljava/lang/String;Ljava/lang/String;)V
    //   220: aload #12
    //   222: checkcast m72
    //   225: astore #10
    //   227: aload #14
    //   229: checkcast android/content/Context
    //   232: astore #12
    //   234: aload #13
    //   236: getfield b : Landroidx/work/WorkerParameters;
    //   239: getfield a : Ljava/util/UUID;
    //   242: astore #13
    //   244: aload #10
    //   246: getfield a : Ln2;
    //   249: getfield c : Ljava/lang/Object;
    //   252: checkcast tk1
    //   255: astore #11
    //   257: new l72
    //   260: dup
    //   261: aload #10
    //   263: aload #13
    //   265: aload_1
    //   266: aload #12
    //   268: invokespecial <init> : (Lm72;Ljava/util/UUID;Lja0;Landroid/content/Context;)V
    //   271: astore_1
    //   272: aload #11
    //   274: invokevirtual getClass : ()Ljava/lang/Class;
    //   277: pop
    //   278: new vn
    //   281: dup
    //   282: bipush #7
    //   284: aload #11
    //   286: aload_1
    //   287: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   290: invokestatic A : (Lci;)Lei;
    //   293: astore_1
    //   294: aload_0
    //   295: iconst_2
    //   296: putfield h : I
    //   299: aload_1
    //   300: aload_0
    //   301: invokestatic e : (Lho0;Lpr1;)Ljava/lang/Object;
    //   304: astore_1
    //   305: aload_1
    //   306: aload #9
    //   308: if_acmpne -> 317
    //   311: aload #9
    //   313: astore_1
    //   314: goto -> 335
    //   317: goto -> 335
    //   320: ldc 'Worker was marked important ('
    //   322: aload #15
    //   324: ldc ') but did not provide ForegroundInfo'
    //   326: invokestatic w : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   329: invokestatic f : (Ljava/lang/String;)V
    //   332: aload #11
    //   334: astore_1
    //   335: aload_1
    //   336: areturn
    //   337: aload #12
    //   339: checkcast [I
    //   342: astore #12
    //   344: aload_0
    //   345: getfield j : Ljava/lang/Object;
    //   348: checkcast jx1
    //   351: astore #13
    //   353: aload_0
    //   354: getfield h : I
    //   357: istore_2
    //   358: iload_2
    //   359: ifeq -> 447
    //   362: iload_2
    //   363: iconst_1
    //   364: if_icmpeq -> 425
    //   367: iload_2
    //   368: iconst_2
    //   369: if_icmpeq -> 406
    //   372: iload_2
    //   373: iconst_3
    //   374: if_icmpeq -> 388
    //   377: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   379: invokestatic f : (Ljava/lang/String;)V
    //   382: aconst_null
    //   383: astore #9
    //   385: goto -> 721
    //   388: aload_1
    //   389: invokestatic r0 : (Ljava/lang/Object;)V
    //   392: new co
    //   395: astore_1
    //   396: aload_1
    //   397: invokespecial <init> : ()V
    //   400: aload_1
    //   401: athrow
    //   402: astore_1
    //   403: goto -> 725
    //   406: aload_0
    //   407: getfield i : Ljava/lang/Object;
    //   410: checkcast x80
    //   413: astore #10
    //   415: aload_1
    //   416: invokestatic r0 : (Ljava/lang/Object;)V
    //   419: aload #10
    //   421: astore_1
    //   422: goto -> 666
    //   425: aload_0
    //   426: getfield i : Ljava/lang/Object;
    //   429: checkcast x80
    //   432: astore #11
    //   434: aload_1
    //   435: invokestatic r0 : (Ljava/lang/Object;)V
    //   438: aload_1
    //   439: astore #10
    //   441: aload #11
    //   443: astore_1
    //   444: goto -> 620
    //   447: aload_1
    //   448: invokestatic r0 : (Ljava/lang/Object;)V
    //   451: aload_0
    //   452: getfield i : Ljava/lang/Object;
    //   455: checkcast x80
    //   458: astore #10
    //   460: aload #13
    //   462: getfield h : Lof;
    //   465: astore #11
    //   467: aload #11
    //   469: invokevirtual getClass : ()Ljava/lang/Class;
    //   472: pop
    //   473: aload #12
    //   475: invokevirtual getClass : ()Ljava/lang/Class;
    //   478: pop
    //   479: aload #11
    //   481: getfield b : Ljava/lang/Object;
    //   484: checkcast java/util/concurrent/locks/ReentrantLock
    //   487: astore_1
    //   488: aload_1
    //   489: invokevirtual lock : ()V
    //   492: aload #12
    //   494: arraylength
    //   495: istore #4
    //   497: iconst_0
    //   498: istore_2
    //   499: iconst_0
    //   500: istore_3
    //   501: iload_2
    //   502: iload #4
    //   504: if_icmpge -> 568
    //   507: aload #12
    //   509: iload_2
    //   510: iaload
    //   511: istore #5
    //   513: aload #11
    //   515: getfield c : Ljava/lang/Object;
    //   518: checkcast [J
    //   521: astore #15
    //   523: aload #15
    //   525: iload #5
    //   527: laload
    //   528: lstore #6
    //   530: aload #15
    //   532: iload #5
    //   534: lload #6
    //   536: lconst_1
    //   537: ladd
    //   538: lastore
    //   539: lload #6
    //   541: lconst_0
    //   542: lcmp
    //   543: ifne -> 562
    //   546: aload #11
    //   548: iconst_1
    //   549: putfield a : Z
    //   552: iconst_1
    //   553: istore_3
    //   554: goto -> 562
    //   557: astore #9
    //   559: goto -> 842
    //   562: iinc #2, 1
    //   565: goto -> 501
    //   568: aload_1
    //   569: invokevirtual unlock : ()V
    //   572: aload #10
    //   574: astore_1
    //   575: iload_3
    //   576: ifeq -> 666
    //   579: aload #13
    //   581: getfield a : Landroidx/work/impl/WorkDatabase_Impl;
    //   584: astore_1
    //   585: aload_0
    //   586: aload #10
    //   588: putfield i : Ljava/lang/Object;
    //   591: aload_0
    //   592: iconst_1
    //   593: putfield h : I
    //   596: aload_1
    //   597: aload_0
    //   598: invokestatic r : (Leh1;Lds;)Los;
    //   601: astore #11
    //   603: aload #10
    //   605: astore_1
    //   606: aload #11
    //   608: astore #10
    //   610: aload #11
    //   612: aload #9
    //   614: if_acmpne -> 620
    //   617: goto -> 721
    //   620: aload #10
    //   622: checkcast os
    //   625: astore #10
    //   627: new tq
    //   630: dup
    //   631: aload #13
    //   633: aconst_null
    //   634: iconst_5
    //   635: invokespecial <init> : (Ljava/lang/Object;Lcs;I)V
    //   638: astore #11
    //   640: aload_0
    //   641: aload_1
    //   642: putfield i : Ljava/lang/Object;
    //   645: aload_0
    //   646: iconst_2
    //   647: putfield h : I
    //   650: aload #10
    //   652: aload #11
    //   654: aload_0
    //   655: invokestatic l0 : (Los;Lad0;Lcs;)Ljava/lang/Object;
    //   658: aload #9
    //   660: if_acmpne -> 666
    //   663: goto -> 721
    //   666: new me1
    //   669: astore #11
    //   671: aload #11
    //   673: invokespecial <init> : ()V
    //   676: aload #13
    //   678: getfield i : Lbh0;
    //   681: astore #15
    //   683: new cx1
    //   686: astore #10
    //   688: aload #10
    //   690: aload #11
    //   692: aload_1
    //   693: aload #14
    //   695: checkcast [Ljava/lang/String;
    //   698: aload #12
    //   700: invokespecial <init> : (Lme1;Lx80;[Ljava/lang/String;[I)V
    //   703: aload_0
    //   704: aconst_null
    //   705: putfield i : Ljava/lang/Object;
    //   708: aload_0
    //   709: iconst_3
    //   710: putfield h : I
    //   713: aload #15
    //   715: aload #10
    //   717: aload_0
    //   718: invokevirtual q : (Lcx1;Lds;)V
    //   721: aload #9
    //   723: areturn
    //   724: astore_1
    //   725: aload #13
    //   727: getfield h : Lof;
    //   730: astore #10
    //   732: aload #10
    //   734: invokevirtual getClass : ()Ljava/lang/Class;
    //   737: pop
    //   738: aload #12
    //   740: invokevirtual getClass : ()Ljava/lang/Class;
    //   743: pop
    //   744: aload #10
    //   746: getfield b : Ljava/lang/Object;
    //   749: checkcast java/util/concurrent/locks/ReentrantLock
    //   752: astore #9
    //   754: aload #9
    //   756: invokevirtual lock : ()V
    //   759: aload #12
    //   761: arraylength
    //   762: istore_3
    //   763: iconst_0
    //   764: istore_2
    //   765: iload_2
    //   766: iload_3
    //   767: if_icmpge -> 828
    //   770: aload #12
    //   772: iload_2
    //   773: iaload
    //   774: istore #4
    //   776: aload #10
    //   778: getfield c : Ljava/lang/Object;
    //   781: checkcast [J
    //   784: astore #11
    //   786: aload #11
    //   788: iload #4
    //   790: laload
    //   791: lstore #6
    //   793: aload #11
    //   795: iload #4
    //   797: lload #6
    //   799: lconst_1
    //   800: lsub
    //   801: lastore
    //   802: lload #6
    //   804: lconst_1
    //   805: lcmp
    //   806: ifne -> 822
    //   809: aload #10
    //   811: iconst_1
    //   812: putfield a : Z
    //   815: goto -> 822
    //   818: astore_1
    //   819: goto -> 835
    //   822: iinc #2, 1
    //   825: goto -> 765
    //   828: aload #9
    //   830: invokevirtual unlock : ()V
    //   833: aload_1
    //   834: athrow
    //   835: aload #9
    //   837: invokevirtual unlock : ()V
    //   840: aload_1
    //   841: athrow
    //   842: aload_1
    //   843: invokevirtual unlock : ()V
    //   846: aload #9
    //   848: athrow
    //   849: aload_0
    //   850: getfield h : I
    //   853: istore_2
    //   854: iload_2
    //   855: ifeq -> 930
    //   858: iload_2
    //   859: iconst_1
    //   860: if_icmpeq -> 902
    //   863: iload_2
    //   864: iconst_2
    //   865: if_icmpne -> 892
    //   868: aload_0
    //   869: getfield i : Ljava/lang/Object;
    //   872: checkcast wz0
    //   875: astore #9
    //   877: aload_1
    //   878: invokestatic r0 : (Ljava/lang/Object;)V
    //   881: goto -> 1030
    //   884: astore #10
    //   886: aload #9
    //   888: astore_1
    //   889: goto -> 1049
    //   892: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   894: invokestatic f : (Ljava/lang/String;)V
    //   897: aconst_null
    //   898: astore_1
    //   899: goto -> 1041
    //   902: aload_0
    //   903: getfield j : Ljava/lang/Object;
    //   906: checkcast u20
    //   909: astore #11
    //   911: aload_0
    //   912: getfield i : Ljava/lang/Object;
    //   915: checkcast wz0
    //   918: astore #12
    //   920: aload_1
    //   921: invokestatic r0 : (Ljava/lang/Object;)V
    //   924: aload #12
    //   926: astore_1
    //   927: goto -> 976
    //   930: aload_1
    //   931: invokestatic r0 : (Ljava/lang/Object;)V
    //   934: aload #12
    //   936: checkcast yz0
    //   939: astore_1
    //   940: aload #14
    //   942: checkcast u20
    //   945: astore #11
    //   947: aload_0
    //   948: aload_1
    //   949: putfield i : Ljava/lang/Object;
    //   952: aload_0
    //   953: aload #11
    //   955: putfield j : Ljava/lang/Object;
    //   958: aload_0
    //   959: iconst_1
    //   960: putfield h : I
    //   963: aload_1
    //   964: aload_0
    //   965: invokevirtual c : (Lds;)Ljava/lang/Object;
    //   968: aload #9
    //   970: if_acmpne -> 976
    //   973: goto -> 1021
    //   976: new sc
    //   979: astore #12
    //   981: aload #12
    //   983: aload #11
    //   985: aconst_null
    //   986: bipush #8
    //   988: invokespecial <init> : (Ljava/lang/Object;Lcs;I)V
    //   991: aload_0
    //   992: aload_1
    //   993: putfield i : Ljava/lang/Object;
    //   996: aload_0
    //   997: aconst_null
    //   998: putfield j : Ljava/lang/Object;
    //   1001: aload_0
    //   1002: iconst_2
    //   1003: putfield h : I
    //   1006: aload #12
    //   1008: aload_0
    //   1009: invokestatic n : (Lad0;Lcs;)Ljava/lang/Object;
    //   1012: astore #11
    //   1014: aload #11
    //   1016: aload #9
    //   1018: if_acmpne -> 1027
    //   1021: aload #9
    //   1023: astore_1
    //   1024: goto -> 1041
    //   1027: aload_1
    //   1028: astore #9
    //   1030: aload #9
    //   1032: aconst_null
    //   1033: invokeinterface a : (Ljava/lang/Object;)V
    //   1038: aload #10
    //   1040: astore_1
    //   1041: aload_1
    //   1042: areturn
    //   1043: astore #9
    //   1045: aload #9
    //   1047: astore #10
    //   1049: aload_1
    //   1050: aconst_null
    //   1051: invokeinterface a : (Ljava/lang/Object;)V
    //   1056: aload #10
    //   1058: athrow
    //   1059: aload #14
    //   1061: checkcast iq0
    //   1064: astore #11
    //   1066: aload #12
    //   1068: checkcast km0
    //   1071: astore #18
    //   1073: aload_0
    //   1074: getfield j : Ljava/lang/Object;
    //   1077: checkcast xs
    //   1080: astore #17
    //   1082: aload_0
    //   1083: getfield h : I
    //   1086: istore_2
    //   1087: iload_2
    //   1088: ifeq -> 1126
    //   1091: iload_2
    //   1092: iconst_1
    //   1093: if_icmpne -> 1115
    //   1096: aload_0
    //   1097: getfield i : Ljava/lang/Object;
    //   1100: checkcast aq0
    //   1103: astore #9
    //   1105: aload_1
    //   1106: invokestatic r0 : (Ljava/lang/Object;)V
    //   1109: aload #9
    //   1111: astore_1
    //   1112: goto -> 2047
    //   1115: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   1117: invokestatic f : (Ljava/lang/String;)V
    //   1120: aconst_null
    //   1121: astore #9
    //   1123: goto -> 2055
    //   1126: aload_1
    //   1127: invokestatic r0 : (Ljava/lang/Object;)V
    //   1130: getstatic cq0.a : Lcs1;
    //   1133: astore_1
    //   1134: aload #18
    //   1136: invokestatic d : (Lkm0;)Ljava/io/File;
    //   1139: astore_1
    //   1140: aload #17
    //   1142: invokestatic q : (Lxs;)V
    //   1145: getstatic lk.a : Ljava/nio/charset/Charset;
    //   1148: astore #13
    //   1150: new java/io/InputStreamReader
    //   1153: astore #10
    //   1155: new java/io/FileInputStream
    //   1158: astore #12
    //   1160: aload #12
    //   1162: aload_1
    //   1163: invokespecial <init> : (Ljava/io/File;)V
    //   1166: aload #10
    //   1168: aload #12
    //   1170: aload #13
    //   1172: invokespecial <init> : (Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    //   1175: new java/io/StringWriter
    //   1178: astore_1
    //   1179: aload_1
    //   1180: invokespecial <init> : ()V
    //   1183: sipush #8192
    //   1186: newarray char
    //   1188: astore #12
    //   1190: aload #10
    //   1192: aload #12
    //   1194: invokevirtual read : ([C)I
    //   1197: istore_2
    //   1198: iload_2
    //   1199: iflt -> 1221
    //   1202: aload_1
    //   1203: aload #12
    //   1205: iconst_0
    //   1206: iload_2
    //   1207: invokevirtual write : ([CII)V
    //   1210: aload #10
    //   1212: aload #12
    //   1214: invokevirtual read : ([C)I
    //   1217: istore_2
    //   1218: goto -> 1198
    //   1221: aload_1
    //   1222: invokevirtual toString : ()Ljava/lang/String;
    //   1225: astore_1
    //   1226: aload_1
    //   1227: invokevirtual getClass : ()Ljava/lang/Class;
    //   1230: pop
    //   1231: aload #10
    //   1233: invokevirtual close : ()V
    //   1236: goto -> 1242
    //   1239: astore_1
    //   1240: aconst_null
    //   1241: astore_1
    //   1242: aload #17
    //   1244: invokeinterface g : ()Los;
    //   1249: invokestatic y : (Los;)V
    //   1252: aload_1
    //   1253: ifnull -> 1280
    //   1256: new my
    //   1259: astore #10
    //   1261: aload #10
    //   1263: invokespecial <init> : ()V
    //   1266: aload #10
    //   1268: aload_1
    //   1269: invokevirtual a : (Ljava/lang/String;)Ljava/lang/Object;
    //   1272: checkcast aq0
    //   1275: astore #10
    //   1277: goto -> 1283
    //   1280: aconst_null
    //   1281: astore #10
    //   1283: aload #17
    //   1285: invokeinterface g : ()Los;
    //   1290: invokestatic y : (Los;)V
    //   1293: aload #10
    //   1295: ifnull -> 1327
    //   1298: aload #10
    //   1300: aload #18
    //   1302: aload #11
    //   1304: invokevirtual g : (Lkm0;Liq0;)Z
    //   1307: ifeq -> 1327
    //   1310: aload #17
    //   1312: invokeinterface g : ()Los;
    //   1317: invokestatic y : (Los;)V
    //   1320: aload #10
    //   1322: astore #9
    //   1324: goto -> 2055
    //   1327: aload #17
    //   1329: invokeinterface g : ()Los;
    //   1334: invokestatic y : (Los;)V
    //   1337: aload #10
    //   1339: ifnull -> 1351
    //   1342: aload #10
    //   1344: invokevirtual f : ()Liq0;
    //   1347: astore_1
    //   1348: goto -> 1353
    //   1351: aconst_null
    //   1352: astore_1
    //   1353: aload #11
    //   1355: aload_1
    //   1356: if_acmpne -> 1369
    //   1359: aload #10
    //   1361: invokevirtual c : ()Liq0;
    //   1364: astore #12
    //   1366: goto -> 1372
    //   1369: aconst_null
    //   1370: astore #12
    //   1372: iconst_1
    //   1373: newarray boolean
    //   1375: astore #13
    //   1377: aload #13
    //   1379: iconst_0
    //   1380: iconst_0
    //   1381: bastore
    //   1382: aload #10
    //   1384: ifnull -> 1419
    //   1387: aload #10
    //   1389: invokevirtual e : ()Ljava/lang/String;
    //   1392: astore_1
    //   1393: aload_1
    //   1394: ifnull -> 1419
    //   1397: aload #12
    //   1399: getstatic iq0.e : Liq0;
    //   1402: if_acmpne -> 1419
    //   1405: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   1408: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   1411: aload_1
    //   1412: invokestatic q : (Landroid/content/Context;Ljava/lang/String;)Lv00;
    //   1415: astore_1
    //   1416: goto -> 1421
    //   1419: aconst_null
    //   1420: astore_1
    //   1421: iconst_1
    //   1422: anewarray v00
    //   1425: astore #15
    //   1427: aload #15
    //   1429: iconst_0
    //   1430: aload_1
    //   1431: aastore
    //   1432: aload #12
    //   1434: ifnull -> 1446
    //   1437: aload #12
    //   1439: getfield b : I
    //   1442: istore_3
    //   1443: goto -> 1452
    //   1446: aload #11
    //   1448: getfield b : I
    //   1451: istore_3
    //   1452: aload #12
    //   1454: ifnull -> 1462
    //   1457: iconst_1
    //   1458: istore_2
    //   1459: goto -> 1464
    //   1462: iconst_0
    //   1463: istore_2
    //   1464: iload_3
    //   1465: iconst_1
    //   1466: if_icmpne -> 1638
    //   1469: aload #15
    //   1471: iconst_0
    //   1472: aaload
    //   1473: ifnull -> 1481
    //   1476: iconst_1
    //   1477: istore_3
    //   1478: goto -> 1483
    //   1481: iconst_0
    //   1482: istore_3
    //   1483: aload #18
    //   1485: aload #15
    //   1487: invokestatic q : (Lkm0;[Lv00;)Ljava/lang/String;
    //   1490: astore_1
    //   1491: aload_1
    //   1492: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1495: ifeq -> 1576
    //   1498: iload_3
    //   1499: ifne -> 1506
    //   1502: iload_2
    //   1503: ifeq -> 1509
    //   1506: goto -> 1566
    //   1509: aload #18
    //   1511: invokestatic C : (Lkm0;)Lorg/jaudiotagger/tag/Tag;
    //   1514: invokestatic A : (Lorg/jaudiotagger/tag/Tag;)Ljava/lang/String;
    //   1517: astore #11
    //   1519: aload #11
    //   1521: astore_1
    //   1522: goto -> 1534
    //   1525: astore #11
    //   1527: aload #11
    //   1529: invokevirtual printStackTrace : ()V
    //   1532: aconst_null
    //   1533: astore_1
    //   1534: iconst_0
    //   1535: istore #8
    //   1537: aload_1
    //   1538: astore #11
    //   1540: goto -> 1582
    //   1543: astore #11
    //   1545: aload #11
    //   1547: invokevirtual printStackTrace : ()V
    //   1550: goto -> 1534
    //   1553: astore #11
    //   1555: aload #11
    //   1557: invokevirtual printStackTrace : ()V
    //   1560: invokestatic gc : ()V
    //   1563: goto -> 1534
    //   1566: aload #13
    //   1568: iconst_0
    //   1569: iconst_1
    //   1570: bastore
    //   1571: aconst_null
    //   1572: astore_1
    //   1573: goto -> 1763
    //   1576: iconst_1
    //   1577: istore #8
    //   1579: aload_1
    //   1580: astore #11
    //   1582: aload #11
    //   1584: astore_1
    //   1585: aload #11
    //   1587: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1590: ifne -> 1635
    //   1593: aload #11
    //   1595: invokevirtual trim : ()Ljava/lang/String;
    //   1598: ldc_w '\\r\\n'
    //   1601: ldc_w '\\n'
    //   1604: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1607: ldc_w '\\r'
    //   1610: ldc_w '\\n'
    //   1613: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1616: astore_1
    //   1617: aload_1
    //   1618: invokevirtual length : ()I
    //   1621: ifne -> 1629
    //   1624: aconst_null
    //   1625: astore_1
    //   1626: goto -> 1635
    //   1629: aload #13
    //   1631: iconst_0
    //   1632: iload #8
    //   1634: bastore
    //   1635: goto -> 1763
    //   1638: aload #18
    //   1640: invokestatic C : (Lkm0;)Lorg/jaudiotagger/tag/Tag;
    //   1643: invokestatic A : (Lorg/jaudiotagger/tag/Tag;)Ljava/lang/String;
    //   1646: astore_1
    //   1647: goto -> 1676
    //   1650: astore_1
    //   1651: aload_1
    //   1652: invokevirtual printStackTrace : ()V
    //   1655: goto -> 1674
    //   1658: astore_1
    //   1659: aload_1
    //   1660: invokevirtual printStackTrace : ()V
    //   1663: goto -> 1674
    //   1666: astore_1
    //   1667: aload_1
    //   1668: invokevirtual printStackTrace : ()V
    //   1671: invokestatic gc : ()V
    //   1674: aconst_null
    //   1675: astore_1
    //   1676: aload_1
    //   1677: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1680: ifeq -> 1706
    //   1683: iload_2
    //   1684: ifne -> 1706
    //   1687: aload #18
    //   1689: aload #15
    //   1691: invokestatic q : (Lkm0;[Lv00;)Ljava/lang/String;
    //   1694: astore_1
    //   1695: aload_1
    //   1696: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1699: iconst_1
    //   1700: ixor
    //   1701: istore #8
    //   1703: goto -> 1709
    //   1706: iconst_0
    //   1707: istore #8
    //   1709: aload_1
    //   1710: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   1713: ifne -> 1760
    //   1716: aload_1
    //   1717: invokevirtual trim : ()Ljava/lang/String;
    //   1720: ldc_w '\\r\\n'
    //   1723: ldc_w '\\n'
    //   1726: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1729: ldc_w '\\r'
    //   1732: ldc_w '\\n'
    //   1735: invokevirtual replace : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
    //   1738: astore_1
    //   1739: aload_1
    //   1740: invokevirtual length : ()I
    //   1743: ifne -> 1751
    //   1746: aconst_null
    //   1747: astore_1
    //   1748: goto -> 1763
    //   1751: aload #13
    //   1753: iconst_0
    //   1754: iload #8
    //   1756: bastore
    //   1757: goto -> 1763
    //   1760: goto -> 1757
    //   1763: aload #17
    //   1765: invokeinterface g : ()Los;
    //   1770: invokestatic y : (Los;)V
    //   1773: aload #13
    //   1775: iconst_0
    //   1776: baload
    //   1777: ifeq -> 1788
    //   1780: getstatic iq0.e : Liq0;
    //   1783: astore #13
    //   1785: goto -> 1793
    //   1788: getstatic iq0.c : Liq0;
    //   1791: astore #13
    //   1793: aload #15
    //   1795: iconst_0
    //   1796: aaload
    //   1797: astore #21
    //   1799: aload #14
    //   1801: checkcast iq0
    //   1804: astore #19
    //   1806: new java/lang/Long
    //   1809: dup
    //   1810: aload #18
    //   1812: getfield l : J
    //   1815: invokespecial <init> : (J)V
    //   1818: astore #20
    //   1820: aload #21
    //   1822: ifnull -> 1842
    //   1825: new java/lang/Long
    //   1828: dup
    //   1829: aload #21
    //   1831: invokevirtual m : ()J
    //   1834: invokespecial <init> : (J)V
    //   1837: astore #14
    //   1839: goto -> 1845
    //   1842: aconst_null
    //   1843: astore #14
    //   1845: aload #21
    //   1847: ifnull -> 1888
    //   1850: aload #21
    //   1852: invokevirtual j : ()Landroid/net/Uri;
    //   1855: astore #11
    //   1857: aload #11
    //   1859: ifnull -> 1888
    //   1862: aload #11
    //   1864: invokevirtual toString : ()Ljava/lang/String;
    //   1867: astore #15
    //   1869: aload #15
    //   1871: astore #11
    //   1873: aload #15
    //   1875: ifnonnull -> 1881
    //   1878: goto -> 1888
    //   1881: aload #11
    //   1883: astore #15
    //   1885: goto -> 1914
    //   1888: aload #13
    //   1890: getstatic iq0.c : Liq0;
    //   1893: if_acmpne -> 1911
    //   1896: aload #10
    //   1898: ifnull -> 1911
    //   1901: aload #10
    //   1903: invokevirtual e : ()Ljava/lang/String;
    //   1906: astore #11
    //   1908: goto -> 1881
    //   1911: aconst_null
    //   1912: astore #15
    //   1914: aload #21
    //   1916: ifnull -> 1941
    //   1919: aload #21
    //   1921: invokevirtual h : ()Ljava/lang/String;
    //   1924: astore #11
    //   1926: aload #11
    //   1928: ifnonnull -> 1934
    //   1931: goto -> 1941
    //   1934: aload #11
    //   1936: astore #10
    //   1938: goto -> 1973
    //   1941: aload #16
    //   1943: astore #11
    //   1945: aload #13
    //   1947: getstatic iq0.c : Liq0;
    //   1950: if_acmpne -> 1969
    //   1953: aload #16
    //   1955: astore #11
    //   1957: aload #10
    //   1959: ifnull -> 1969
    //   1962: aload #10
    //   1964: invokevirtual d : ()Ljava/lang/String;
    //   1967: astore #11
    //   1969: aload #11
    //   1971: astore #10
    //   1973: new aq0
    //   1976: dup
    //   1977: aload #13
    //   1979: aload #19
    //   1981: aload #12
    //   1983: aload #20
    //   1985: aload #14
    //   1987: aload_1
    //   1988: aload #15
    //   1990: aload #10
    //   1992: invokespecial <init> : (Liq0;Liq0;Liq0;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   1995: astore #10
    //   1997: aload #17
    //   1999: invokeinterface g : ()Los;
    //   2004: invokestatic y : (Los;)V
    //   2007: getstatic cq0.a : Lcs1;
    //   2010: astore_1
    //   2011: aload_0
    //   2012: aload #17
    //   2014: putfield j : Ljava/lang/Object;
    //   2017: aload_0
    //   2018: aload #10
    //   2020: putfield i : Ljava/lang/Object;
    //   2023: aload_0
    //   2024: iconst_1
    //   2025: putfield h : I
    //   2028: aload #10
    //   2030: astore_1
    //   2031: aload #18
    //   2033: aload #10
    //   2035: aload_0
    //   2036: invokestatic p : (Lkm0;Laq0;Lpr1;)Ljava/lang/Object;
    //   2039: aload #9
    //   2041: if_acmpne -> 1112
    //   2044: goto -> 2055
    //   2047: aload #17
    //   2049: invokestatic q : (Lxs;)V
    //   2052: aload_1
    //   2053: astore #9
    //   2055: aload #9
    //   2057: areturn
    //   2058: aload_0
    //   2059: getfield h : I
    //   2062: istore_2
    //   2063: iload_2
    //   2064: ifeq -> 2089
    //   2067: iload_2
    //   2068: iconst_1
    //   2069: if_icmpne -> 2079
    //   2072: aload_1
    //   2073: invokestatic r0 : (Ljava/lang/Object;)V
    //   2076: goto -> 2155
    //   2079: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   2081: invokestatic f : (Ljava/lang/String;)V
    //   2084: aconst_null
    //   2085: astore_1
    //   2086: goto -> 2155
    //   2089: aload_1
    //   2090: invokestatic r0 : (Ljava/lang/Object;)V
    //   2093: aload #12
    //   2095: checkcast androidx/work/impl/workers/ConstraintTrackingWorker
    //   2098: astore_1
    //   2099: aload #14
    //   2101: checkcast oo0
    //   2104: astore #11
    //   2106: aload_0
    //   2107: getfield i : Ljava/lang/Object;
    //   2110: checkcast bv0
    //   2113: astore #12
    //   2115: aload_0
    //   2116: getfield j : Ljava/lang/Object;
    //   2119: checkcast y72
    //   2122: astore #10
    //   2124: aload_0
    //   2125: iconst_1
    //   2126: putfield h : I
    //   2129: aload_1
    //   2130: aload #11
    //   2132: aload #12
    //   2134: aload #10
    //   2136: aload_0
    //   2137: invokestatic d : (Landroidx/work/impl/workers/ConstraintTrackingWorker;Loo0;Lbv0;Ly72;Lds;)Ljava/lang/Object;
    //   2140: astore #10
    //   2142: aload #10
    //   2144: astore_1
    //   2145: aload #10
    //   2147: aload #9
    //   2149: if_acmpne -> 2155
    //   2152: aload #9
    //   2154: astore_1
    //   2155: aload_1
    //   2156: areturn
    //   2157: aload_0
    //   2158: getfield h : I
    //   2161: istore_2
    //   2162: iload_2
    //   2163: ifeq -> 2188
    //   2166: iload_2
    //   2167: iconst_1
    //   2168: if_icmpne -> 2178
    //   2171: aload_1
    //   2172: invokestatic r0 : (Ljava/lang/Object;)V
    //   2175: goto -> 2239
    //   2178: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   2180: invokestatic f : (Ljava/lang/String;)V
    //   2183: aconst_null
    //   2184: astore_1
    //   2185: goto -> 2271
    //   2188: aload_1
    //   2189: invokestatic r0 : (Ljava/lang/Object;)V
    //   2192: aload_0
    //   2193: getfield i : Ljava/lang/Object;
    //   2196: checkcast bv0
    //   2199: astore #11
    //   2201: aload_0
    //   2202: getfield j : Ljava/lang/Object;
    //   2205: checkcast y72
    //   2208: astore_1
    //   2209: aload_0
    //   2210: iconst_1
    //   2211: putfield h : I
    //   2214: aload #11
    //   2216: aload_1
    //   2217: aload_0
    //   2218: invokestatic a : (Lbv0;Ly72;Lds;)Ljava/lang/Object;
    //   2221: astore #11
    //   2223: aload #11
    //   2225: astore_1
    //   2226: aload #11
    //   2228: aload #9
    //   2230: if_acmpne -> 2239
    //   2233: aload #9
    //   2235: astore_1
    //   2236: goto -> 2271
    //   2239: aload_1
    //   2240: checkcast java/lang/Number
    //   2243: invokevirtual intValue : ()I
    //   2246: istore_2
    //   2247: aload #12
    //   2249: checkcast java/util/concurrent/atomic/AtomicInteger
    //   2252: iload_2
    //   2253: invokevirtual set : (I)V
    //   2256: aload #14
    //   2258: checkcast ho0
    //   2261: iconst_1
    //   2262: invokeinterface cancel : (Z)Z
    //   2267: pop
    //   2268: aload #10
    //   2270: astore_1
    //   2271: aload_1
    //   2272: areturn
    //   2273: astore_1
    //   2274: goto -> 1280
    // Exception table:
    //   from	to	target	type
    //   388	402	402	finally
    //   492	497	557	finally
    //   513	523	557	finally
    //   546	552	557	finally
    //   666	721	724	finally
    //   759	763	818	finally
    //   776	786	818	finally
    //   809	815	818	finally
    //   877	881	884	finally
    //   976	1014	1043	finally
    //   1145	1198	1239	finally
    //   1202	1218	1239	finally
    //   1221	1236	1239	finally
    //   1256	1277	2273	finally
    //   1509	1519	1525	finally
    //   1527	1532	1553	java/lang/OutOfMemoryError
    //   1527	1532	1543	finally
    //   1638	1647	1650	finally
    //   1651	1655	1666	java/lang/OutOfMemoryError
    //   1651	1655	1658	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */