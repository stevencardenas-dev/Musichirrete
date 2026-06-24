import android.os.Handler;

public final class lz0 {
  public static boolean s;
  
  public final gh1 a = new gh1(26, false);
  
  public int b;
  
  public int c;
  
  public li1 d;
  
  public long e;
  
  public long f = Long.MIN_VALUE;
  
  public boolean g;
  
  public boolean h;
  
  public final w9 i;
  
  public final e01 j;
  
  public rv k = null;
  
  public rv l;
  
  public final rv m;
  
  public la0 n;
  
  public long o;
  
  public boolean p;
  
  public boolean q;
  
  public boolean r;
  
  public lz0(Handler paramHandler, e01 parame01) {
    this.i = new w9(paramHandler, 0);
    this.j = parame01;
    parame01.d = new bh0(14, this);
    this.m = new rv();
    this.r = true;
  }
  
  public final boolean a() {
    // Byte code:
    //   0: aload_0
    //   1: getfield l : Lrv;
    //   4: ifnonnull -> 131
    //   7: aload_0
    //   8: getfield k : Lrv;
    //   11: astore #20
    //   13: aload #20
    //   15: astore #19
    //   17: aload #20
    //   19: ifnonnull -> 78
    //   22: aload_0
    //   23: getfield n : Lla0;
    //   26: getfield l : I
    //   29: istore_2
    //   30: iload_2
    //   31: iconst_m1
    //   32: if_icmpeq -> 38
    //   35: goto -> 41
    //   38: ldc 66560
    //   40: istore_2
    //   41: new rv
    //   44: dup
    //   45: invokespecial <init> : ()V
    //   48: astore #19
    //   50: iload_2
    //   51: invokestatic allocateDirect : (I)Ljava/nio/ByteBuffer;
    //   54: astore #20
    //   56: aload #19
    //   58: aload #20
    //   60: putfield a : Ljava/nio/ByteBuffer;
    //   63: aload #20
    //   65: invokestatic nativeOrder : ()Ljava/nio/ByteOrder;
    //   68: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   71: pop
    //   72: aload_0
    //   73: aload #19
    //   75: putfield k : Lrv;
    //   78: aload #19
    //   80: invokevirtual clear : ()V
    //   83: aload_0
    //   84: getfield a : Lgh1;
    //   87: astore #20
    //   89: aload #20
    //   91: aconst_null
    //   92: putfield c : Ljava/lang/Object;
    //   95: aload_0
    //   96: aload #20
    //   98: aload #19
    //   100: iconst_0
    //   101: invokevirtual d : (Lgh1;Lrv;Z)I
    //   104: bipush #-3
    //   106: if_icmpne -> 116
    //   109: aload_0
    //   110: aconst_null
    //   111: putfield n : Lla0;
    //   114: iconst_0
    //   115: ireturn
    //   116: aload #19
    //   118: getfield a : Ljava/nio/ByteBuffer;
    //   121: invokevirtual flip : ()Ljava/nio/Buffer;
    //   124: pop
    //   125: aload_0
    //   126: aload #19
    //   128: putfield l : Lrv;
    //   131: aload_0
    //   132: getfield r : Z
    //   135: istore #17
    //   137: aload_0
    //   138: getfield j : Le01;
    //   141: astore #20
    //   143: iload #17
    //   145: ifeq -> 527
    //   148: ldc 'MAR.rd>atcnc.as.cf'
    //   150: invokestatic G : (Ljava/lang/String;)V
    //   153: aload_0
    //   154: getfield n : Lla0;
    //   157: astore #19
    //   159: aload #19
    //   161: getfield z : I
    //   164: istore #6
    //   166: aload #19
    //   168: getfield x : I
    //   171: istore #4
    //   173: aload #19
    //   175: getfield y : I
    //   178: istore #5
    //   180: getstatic d12.a : I
    //   183: bipush #26
    //   185: if_icmpgt -> 197
    //   188: ldc 'fugu'
    //   190: getstatic d12.b : Ljava/lang/String;
    //   193: invokevirtual equals : (Ljava/lang/Object;)Z
    //   196: pop
    //   197: iload #5
    //   199: iload #4
    //   201: invokestatic c : (I)I
    //   204: aload #19
    //   206: getfield z : I
    //   209: invokestatic getMinBufferSize : (III)I
    //   212: istore_2
    //   213: aload #19
    //   215: getfield l : I
    //   218: iload_2
    //   219: invokestatic max : (II)I
    //   222: istore #7
    //   224: aload #20
    //   226: invokevirtual getClass : ()Ljava/lang/Class;
    //   229: pop
    //   230: getstatic d12.a : I
    //   233: bipush #21
    //   235: if_icmpge -> 270
    //   238: iload #4
    //   240: bipush #8
    //   242: if_icmpne -> 270
    //   245: bipush #6
    //   247: newarray int
    //   249: astore #19
    //   251: iconst_0
    //   252: istore_2
    //   253: iload_2
    //   254: bipush #6
    //   256: if_icmpge -> 270
    //   259: aload #19
    //   261: iload_2
    //   262: iload_2
    //   263: iastore
    //   264: iinc #2, 1
    //   267: goto -> 253
    //   270: iload #6
    //   272: invokestatic f : (I)Z
    //   275: istore #17
    //   277: iconst_4
    //   278: invokestatic f : (I)Z
    //   281: ifeq -> 288
    //   284: getstatic d12.a : I
    //   287: istore_2
    //   288: new t9
    //   291: dup
    //   292: iload #5
    //   294: iload #4
    //   296: iload #6
    //   298: invokespecial <init> : (III)V
    //   301: pop
    //   302: getstatic d12.a : I
    //   305: istore #8
    //   307: iload #8
    //   309: bipush #28
    //   311: if_icmpgt -> 356
    //   314: iload #17
    //   316: ifne -> 356
    //   319: iload #4
    //   321: bipush #7
    //   323: if_icmpne -> 332
    //   326: bipush #8
    //   328: istore_2
    //   329: goto -> 362
    //   332: iload #4
    //   334: iconst_3
    //   335: if_icmpeq -> 350
    //   338: iload #4
    //   340: iconst_4
    //   341: if_icmpeq -> 350
    //   344: iload #4
    //   346: iconst_5
    //   347: if_icmpne -> 356
    //   350: bipush #6
    //   352: istore_2
    //   353: goto -> 329
    //   356: iload #4
    //   358: istore_2
    //   359: goto -> 329
    //   362: iload_2
    //   363: istore_3
    //   364: iload #8
    //   366: bipush #26
    //   368: if_icmpgt -> 400
    //   371: iload_2
    //   372: istore_3
    //   373: ldc 'fugu'
    //   375: getstatic d12.b : Ljava/lang/String;
    //   378: invokevirtual equals : (Ljava/lang/Object;)Z
    //   381: ifeq -> 400
    //   384: iload_2
    //   385: istore_3
    //   386: iload #17
    //   388: ifne -> 400
    //   391: iload_2
    //   392: istore_3
    //   393: iload_2
    //   394: iconst_1
    //   395: if_icmpne -> 400
    //   398: iconst_2
    //   399: istore_3
    //   400: iload_3
    //   401: invokestatic c : (I)I
    //   404: istore #8
    //   406: iload #8
    //   408: ifeq -> 512
    //   411: iload #17
    //   413: ifeq -> 427
    //   416: iload #6
    //   418: iload #4
    //   420: invokestatic e : (II)I
    //   423: istore_2
    //   424: goto -> 429
    //   427: iconst_m1
    //   428: istore_2
    //   429: iload #17
    //   431: ifeq -> 445
    //   434: iload #6
    //   436: iload #4
    //   438: invokestatic e : (II)I
    //   441: istore_3
    //   442: goto -> 450
    //   445: iconst_m1
    //   446: istore_3
    //   447: goto -> 442
    //   450: new c01
    //   453: dup
    //   454: iload #17
    //   456: iload_2
    //   457: iload #5
    //   459: iload_3
    //   460: iload #5
    //   462: iload #8
    //   464: iload #6
    //   466: iload #7
    //   468: iconst_2
    //   469: imul
    //   470: iconst_0
    //   471: anewarray u9
    //   474: invokespecial <init> : (ZIIIIIII[Lu9;)V
    //   477: astore #19
    //   479: aload #20
    //   481: invokevirtual h : ()Z
    //   484: ifeq -> 497
    //   487: aload #20
    //   489: aload #19
    //   491: putfield f : Lc01;
    //   494: goto -> 504
    //   497: aload #20
    //   499: aload #19
    //   501: putfield g : Lc01;
    //   504: aload_0
    //   505: iconst_0
    //   506: putfield r : Z
    //   509: goto -> 527
    //   512: new java/lang/Exception
    //   515: dup
    //   516: ldc 'Unsupported channel count: '
    //   518: iload #4
    //   520: invokestatic i : (Ljava/lang/String;I)Ljava/lang/String;
    //   523: invokespecial <init> : (Ljava/lang/String;)V
    //   526: athrow
    //   527: aload_0
    //   528: getfield l : Lrv;
    //   531: astore #19
    //   533: aload #19
    //   535: getfield a : Ljava/nio/ByteBuffer;
    //   538: astore #22
    //   540: aload #19
    //   542: getfield b : J
    //   545: lstore #11
    //   547: aload #20
    //   549: getfield b : Lca;
    //   552: astore #21
    //   554: aload #20
    //   556: getfield z : Ljava/nio/ByteBuffer;
    //   559: astore #19
    //   561: aload #19
    //   563: ifnull -> 582
    //   566: aload #22
    //   568: aload #19
    //   570: if_acmpne -> 576
    //   573: goto -> 582
    //   576: iconst_0
    //   577: istore #17
    //   579: goto -> 585
    //   582: iconst_1
    //   583: istore #17
    //   585: iload #17
    //   587: invokestatic h : (Z)V
    //   590: aload #20
    //   592: getfield f : Lc01;
    //   595: ifnull -> 720
    //   598: aload #20
    //   600: invokevirtual b : ()Z
    //   603: ifne -> 609
    //   606: goto -> 1918
    //   609: aload #20
    //   611: getfield f : Lc01;
    //   614: astore #19
    //   616: aload #20
    //   618: getfield g : Lc01;
    //   621: astore #23
    //   623: aload #19
    //   625: invokevirtual getClass : ()Ljava/lang/Class;
    //   628: pop
    //   629: aload #23
    //   631: getfield g : I
    //   634: aload #19
    //   636: getfield g : I
    //   639: if_icmpne -> 687
    //   642: aload #23
    //   644: getfield e : I
    //   647: aload #19
    //   649: getfield e : I
    //   652: if_icmpne -> 687
    //   655: aload #23
    //   657: getfield f : I
    //   660: aload #19
    //   662: getfield f : I
    //   665: if_icmpne -> 687
    //   668: aload #20
    //   670: aload #20
    //   672: getfield f : Lc01;
    //   675: putfield g : Lc01;
    //   678: aload #20
    //   680: aconst_null
    //   681: putfield f : Lc01;
    //   684: goto -> 708
    //   687: aload #20
    //   689: invokevirtual j : ()V
    //   692: aload #20
    //   694: invokevirtual f : ()Z
    //   697: ifeq -> 703
    //   700: goto -> 1918
    //   703: aload #20
    //   705: invokevirtual c : ()V
    //   708: aload #20
    //   710: aload #20
    //   712: getfield k : Lr71;
    //   715: lload #11
    //   717: invokevirtual a : (Lr71;J)V
    //   720: aload #20
    //   722: invokevirtual h : ()Z
    //   725: ifne -> 1597
    //   728: aload #20
    //   730: getfield a : Landroid/os/ConditionVariable;
    //   733: invokevirtual block : ()V
    //   736: aload #20
    //   738: getfield g : Lc01;
    //   741: astore #23
    //   743: aload #23
    //   745: invokevirtual getClass : ()Ljava/lang/Class;
    //   748: pop
    //   749: aload #20
    //   751: getfield K : Z
    //   754: istore #17
    //   756: aload #20
    //   758: getfield i : Lk9;
    //   761: astore #19
    //   763: aload #20
    //   765: getfield I : I
    //   768: istore_2
    //   769: aload #23
    //   771: getfield e : I
    //   774: istore #5
    //   776: aload #23
    //   778: getfield f : I
    //   781: istore #4
    //   783: getstatic d12.a : I
    //   786: istore_3
    //   787: iload_3
    //   788: bipush #21
    //   790: if_icmplt -> 902
    //   793: iload #17
    //   795: ifeq -> 826
    //   798: new android/media/AudioAttributes$Builder
    //   801: dup
    //   802: invokespecial <init> : ()V
    //   805: iconst_3
    //   806: invokevirtual setContentType : (I)Landroid/media/AudioAttributes$Builder;
    //   809: bipush #16
    //   811: invokevirtual setFlags : (I)Landroid/media/AudioAttributes$Builder;
    //   814: iconst_1
    //   815: invokevirtual setUsage : (I)Landroid/media/AudioAttributes$Builder;
    //   818: invokevirtual build : ()Landroid/media/AudioAttributes;
    //   821: astore #19
    //   823: goto -> 836
    //   826: aload #19
    //   828: invokevirtual a : ()Landroid/media/AudioAttributes;
    //   831: astore #19
    //   833: goto -> 823
    //   836: new android/media/AudioFormat$Builder
    //   839: dup
    //   840: invokespecial <init> : ()V
    //   843: iload #4
    //   845: invokevirtual setChannelMask : (I)Landroid/media/AudioFormat$Builder;
    //   848: aload #23
    //   850: getfield g : I
    //   853: invokevirtual setEncoding : (I)Landroid/media/AudioFormat$Builder;
    //   856: iload #5
    //   858: invokevirtual setSampleRate : (I)Landroid/media/AudioFormat$Builder;
    //   861: invokevirtual build : ()Landroid/media/AudioFormat;
    //   864: astore #24
    //   866: aload #23
    //   868: getfield h : I
    //   871: istore #6
    //   873: iload_2
    //   874: ifeq -> 880
    //   877: goto -> 882
    //   880: iconst_0
    //   881: istore_2
    //   882: new android/media/AudioTrack
    //   885: dup
    //   886: aload #19
    //   888: aload #24
    //   890: iload #6
    //   892: iconst_1
    //   893: iload_2
    //   894: invokespecial <init> : (Landroid/media/AudioAttributes;Landroid/media/AudioFormat;III)V
    //   897: astore #19
    //   899: goto -> 981
    //   902: aload #19
    //   904: invokevirtual getClass : ()Ljava/lang/Class;
    //   907: pop
    //   908: iload_2
    //   909: ifne -> 946
    //   912: new android/media/AudioTrack
    //   915: dup
    //   916: iconst_3
    //   917: aload #23
    //   919: getfield e : I
    //   922: aload #23
    //   924: getfield f : I
    //   927: aload #23
    //   929: getfield g : I
    //   932: aload #23
    //   934: getfield h : I
    //   937: iconst_1
    //   938: invokespecial <init> : (IIIIII)V
    //   941: astore #19
    //   943: goto -> 981
    //   946: new android/media/AudioTrack
    //   949: dup
    //   950: iconst_3
    //   951: aload #23
    //   953: getfield e : I
    //   956: aload #23
    //   958: getfield f : I
    //   961: aload #23
    //   963: getfield g : I
    //   966: aload #23
    //   968: getfield h : I
    //   971: iconst_1
    //   972: iload_2
    //   973: invokespecial <init> : (IIIIIII)V
    //   976: astore #19
    //   978: goto -> 899
    //   981: aload #19
    //   983: invokevirtual getState : ()I
    //   986: istore_2
    //   987: iload_2
    //   988: iconst_1
    //   989: if_icmpne -> 1495
    //   992: aload #20
    //   994: aload #19
    //   996: putfield h : Landroid/media/AudioTrack;
    //   999: aload #19
    //   1001: invokevirtual getAudioSessionId : ()I
    //   1004: istore_2
    //   1005: iload_3
    //   1006: bipush #21
    //   1008: if_icmpge -> 1094
    //   1011: aload #20
    //   1013: getfield e : Landroid/media/AudioTrack;
    //   1016: astore #19
    //   1018: aload #19
    //   1020: ifnull -> 1065
    //   1023: iload_2
    //   1024: aload #19
    //   1026: invokevirtual getAudioSessionId : ()I
    //   1029: if_icmpeq -> 1065
    //   1032: aload #20
    //   1034: getfield e : Landroid/media/AudioTrack;
    //   1037: astore #19
    //   1039: aload #19
    //   1041: ifnonnull -> 1047
    //   1044: goto -> 1065
    //   1047: aload #20
    //   1049: aconst_null
    //   1050: putfield e : Landroid/media/AudioTrack;
    //   1053: new kf
    //   1056: dup
    //   1057: aload #19
    //   1059: invokespecial <init> : (Landroid/media/AudioTrack;)V
    //   1062: invokevirtual start : ()V
    //   1065: aload #20
    //   1067: getfield e : Landroid/media/AudioTrack;
    //   1070: ifnonnull -> 1094
    //   1073: aload #20
    //   1075: new android/media/AudioTrack
    //   1078: dup
    //   1079: iconst_3
    //   1080: sipush #4000
    //   1083: iconst_4
    //   1084: iconst_2
    //   1085: iconst_2
    //   1086: iconst_0
    //   1087: iload_2
    //   1088: invokespecial <init> : (IIIIIII)V
    //   1091: putfield e : Landroid/media/AudioTrack;
    //   1094: aload #20
    //   1096: getfield I : I
    //   1099: iload_2
    //   1100: if_icmpeq -> 1162
    //   1103: aload #20
    //   1105: iload_2
    //   1106: putfield I : I
    //   1109: aload #20
    //   1111: getfield d : Lbh0;
    //   1114: astore #19
    //   1116: aload #19
    //   1118: ifnull -> 1162
    //   1121: aload #19
    //   1123: getfield c : Ljava/lang/Object;
    //   1126: checkcast lz0
    //   1129: getfield i : Lw9;
    //   1132: astore #23
    //   1134: aload #23
    //   1136: getfield a : Landroid/os/Handler;
    //   1139: astore #19
    //   1141: aload #19
    //   1143: ifnull -> 1162
    //   1146: aload #19
    //   1148: new v9
    //   1151: dup
    //   1152: aload #23
    //   1154: iload_2
    //   1155: invokespecial <init> : (Lw9;I)V
    //   1158: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   1161: pop
    //   1162: aload #20
    //   1164: aload #20
    //   1166: getfield k : Lr71;
    //   1169: lload #11
    //   1171: invokevirtual a : (Lr71;J)V
    //   1174: aload #20
    //   1176: getfield h : Landroid/media/AudioTrack;
    //   1179: astore #19
    //   1181: aload #20
    //   1183: getfield g : Lc01;
    //   1186: astore #23
    //   1188: aload #23
    //   1190: getfield g : I
    //   1193: istore #5
    //   1195: aload #23
    //   1197: getfield d : I
    //   1200: istore #4
    //   1202: aload #23
    //   1204: getfield h : I
    //   1207: istore_2
    //   1208: aload #21
    //   1210: aload #19
    //   1212: putfield c : Landroid/media/AudioTrack;
    //   1215: aload #21
    //   1217: iload #4
    //   1219: putfield d : I
    //   1222: aload #21
    //   1224: iload_2
    //   1225: putfield e : I
    //   1228: aload #21
    //   1230: new ba
    //   1233: dup
    //   1234: aload #19
    //   1236: invokespecial <init> : (Landroid/media/AudioTrack;)V
    //   1239: putfield f : Lba;
    //   1242: aload #21
    //   1244: aload #19
    //   1246: invokevirtual getSampleRate : ()I
    //   1249: putfield g : I
    //   1252: iload_3
    //   1253: bipush #23
    //   1255: if_icmpge -> 1277
    //   1258: iload #5
    //   1260: iconst_5
    //   1261: if_icmpeq -> 1271
    //   1264: iload #5
    //   1266: bipush #6
    //   1268: if_icmpne -> 1277
    //   1271: iconst_1
    //   1272: istore #17
    //   1274: goto -> 1280
    //   1277: iconst_0
    //   1278: istore #17
    //   1280: aload #21
    //   1282: iload #17
    //   1284: putfield h : Z
    //   1287: iload #5
    //   1289: invokestatic f : (I)Z
    //   1292: istore #17
    //   1294: aload #21
    //   1296: iload #17
    //   1298: putfield o : Z
    //   1301: iload #17
    //   1303: ifeq -> 1327
    //   1306: iload_2
    //   1307: iload #4
    //   1309: idiv
    //   1310: i2l
    //   1311: ldc2_w 1000000
    //   1314: lmul
    //   1315: aload #21
    //   1317: getfield g : I
    //   1320: i2l
    //   1321: ldiv
    //   1322: lstore #9
    //   1324: goto -> 1332
    //   1327: ldc2_w -9223372036854775807
    //   1330: lstore #9
    //   1332: aload #21
    //   1334: lload #9
    //   1336: putfield i : J
    //   1339: aload #21
    //   1341: lconst_0
    //   1342: putfield q : J
    //   1345: aload #21
    //   1347: lconst_0
    //   1348: putfield r : J
    //   1351: aload #21
    //   1353: lconst_0
    //   1354: putfield s : J
    //   1357: aload #21
    //   1359: iconst_0
    //   1360: putfield n : Z
    //   1363: aload #21
    //   1365: ldc2_w -9223372036854775807
    //   1368: putfield v : J
    //   1371: aload #21
    //   1373: ldc2_w -9223372036854775807
    //   1376: putfield w : J
    //   1379: aload #21
    //   1381: lconst_0
    //   1382: putfield p : J
    //   1385: aload #21
    //   1387: lconst_0
    //   1388: putfield m : J
    //   1391: aload #20
    //   1393: invokevirtual h : ()Z
    //   1396: ifne -> 1402
    //   1399: goto -> 1439
    //   1402: aload #20
    //   1404: getfield h : Landroid/media/AudioTrack;
    //   1407: astore #19
    //   1409: aload #20
    //   1411: getfield w : F
    //   1414: fstore_1
    //   1415: iload_3
    //   1416: bipush #21
    //   1418: if_icmplt -> 1431
    //   1421: aload #19
    //   1423: fload_1
    //   1424: invokevirtual setVolume : (F)I
    //   1427: pop
    //   1428: goto -> 1439
    //   1431: aload #19
    //   1433: fload_1
    //   1434: fload_1
    //   1435: invokevirtual setStereoVolume : (FF)I
    //   1438: pop
    //   1439: aload #20
    //   1441: getfield J : Ljb;
    //   1444: getfield a : I
    //   1447: istore_2
    //   1448: iload_2
    //   1449: ifeq -> 1479
    //   1452: aload #20
    //   1454: getfield h : Landroid/media/AudioTrack;
    //   1457: iload_2
    //   1458: invokevirtual attachAuxEffect : (I)I
    //   1461: pop
    //   1462: aload #20
    //   1464: getfield h : Landroid/media/AudioTrack;
    //   1467: aload #20
    //   1469: getfield J : Ljb;
    //   1472: getfield b : F
    //   1475: invokevirtual setAuxEffectSendLevel : (F)I
    //   1478: pop
    //   1479: aload #20
    //   1481: getfield H : Z
    //   1484: ifeq -> 1597
    //   1487: aload #20
    //   1489: invokevirtual i : ()V
    //   1492: goto -> 1597
    //   1495: aload #19
    //   1497: invokevirtual release : ()V
    //   1500: aload #23
    //   1502: getfield h : I
    //   1505: istore_3
    //   1506: new java/lang/StringBuilder
    //   1509: dup
    //   1510: ldc_w 'AudioTrack init failed: '
    //   1513: invokespecial <init> : (Ljava/lang/String;)V
    //   1516: astore #19
    //   1518: aload #19
    //   1520: iload_2
    //   1521: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1524: pop
    //   1525: aload #19
    //   1527: ldc_w ', Config('
    //   1530: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1533: pop
    //   1534: aload #19
    //   1536: iload #5
    //   1538: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1541: pop
    //   1542: aload #19
    //   1544: ldc_w ', '
    //   1547: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1550: pop
    //   1551: aload #19
    //   1553: iload #4
    //   1555: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1558: pop
    //   1559: aload #19
    //   1561: ldc_w ', '
    //   1564: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1567: pop
    //   1568: aload #19
    //   1570: iload_3
    //   1571: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1574: pop
    //   1575: aload #19
    //   1577: ldc_w ')'
    //   1580: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1583: pop
    //   1584: new java/lang/Exception
    //   1587: dup
    //   1588: aload #19
    //   1590: invokevirtual toString : ()Ljava/lang/String;
    //   1593: invokespecial <init> : (Ljava/lang/String;)V
    //   1596: athrow
    //   1597: aload #20
    //   1599: invokevirtual e : ()J
    //   1602: lstore #9
    //   1604: aload #21
    //   1606: getfield c : Landroid/media/AudioTrack;
    //   1609: astore #19
    //   1611: aload #19
    //   1613: invokevirtual getClass : ()Ljava/lang/Class;
    //   1616: pop
    //   1617: aload #19
    //   1619: invokevirtual getPlayState : ()I
    //   1622: istore_2
    //   1623: aload #21
    //   1625: getfield h : Z
    //   1628: ifeq -> 1663
    //   1631: iload_2
    //   1632: iconst_2
    //   1633: if_icmpne -> 1645
    //   1636: aload #21
    //   1638: iconst_0
    //   1639: putfield n : Z
    //   1642: goto -> 1918
    //   1645: iload_2
    //   1646: iconst_1
    //   1647: if_icmpne -> 1663
    //   1650: aload #21
    //   1652: invokevirtual a : ()J
    //   1655: lconst_0
    //   1656: lcmp
    //   1657: ifne -> 1663
    //   1660: goto -> 1918
    //   1663: aload #21
    //   1665: getfield n : Z
    //   1668: istore #18
    //   1670: aload #21
    //   1672: lload #9
    //   1674: invokevirtual b : (J)Z
    //   1677: istore #17
    //   1679: aload #21
    //   1681: iload #17
    //   1683: putfield n : Z
    //   1686: iload #18
    //   1688: ifeq -> 1805
    //   1691: iload #17
    //   1693: ifne -> 1805
    //   1696: iload_2
    //   1697: iconst_1
    //   1698: if_icmpeq -> 1805
    //   1701: aload #21
    //   1703: getfield a : Lbh0;
    //   1706: astore #19
    //   1708: aload #21
    //   1710: getfield e : I
    //   1713: istore_2
    //   1714: aload #21
    //   1716: getfield i : J
    //   1719: invokestatic b : (J)J
    //   1722: lstore #9
    //   1724: aload #19
    //   1726: getfield c : Ljava/lang/Object;
    //   1729: checkcast e01
    //   1732: astore #19
    //   1734: aload #19
    //   1736: getfield d : Lbh0;
    //   1739: ifnull -> 1805
    //   1742: invokestatic elapsedRealtime : ()J
    //   1745: lstore #13
    //   1747: aload #19
    //   1749: getfield L : J
    //   1752: lstore #15
    //   1754: aload #19
    //   1756: getfield d : Lbh0;
    //   1759: getfield c : Ljava/lang/Object;
    //   1762: checkcast lz0
    //   1765: getfield i : Lw9;
    //   1768: astore #23
    //   1770: aload #23
    //   1772: getfield a : Landroid/os/Handler;
    //   1775: astore #19
    //   1777: aload #19
    //   1779: ifnull -> 1805
    //   1782: aload #19
    //   1784: new v9
    //   1787: dup
    //   1788: aload #23
    //   1790: iload_2
    //   1791: lload #9
    //   1793: lload #13
    //   1795: lload #15
    //   1797: lsub
    //   1798: invokespecial <init> : (Lw9;IJJ)V
    //   1801: invokevirtual post : (Ljava/lang/Runnable;)Z
    //   1804: pop
    //   1805: aload #20
    //   1807: getfield z : Ljava/nio/ByteBuffer;
    //   1810: ifnonnull -> 3112
    //   1813: aload #22
    //   1815: invokevirtual hasRemaining : ()Z
    //   1818: ifne -> 1824
    //   1821: goto -> 2849
    //   1824: aload #20
    //   1826: getfield g : Lc01;
    //   1829: astore #19
    //   1831: aload #19
    //   1833: getfield a : Z
    //   1836: ifne -> 2854
    //   1839: aload #20
    //   1841: getfield t : I
    //   1844: ifne -> 2854
    //   1847: aload #19
    //   1849: getfield g : I
    //   1852: istore_2
    //   1853: iload_2
    //   1854: bipush #14
    //   1856: if_icmpeq -> 2696
    //   1859: iload_2
    //   1860: bipush #17
    //   1862: if_icmpeq -> 2321
    //   1865: iload_2
    //   1866: bipush #18
    //   1868: if_icmpeq -> 2232
    //   1871: iload_2
    //   1872: tableswitch default -> 1908, 5 -> 2232, 6 -> 2232, 7 -> 2066, 8 -> 2066, 9 -> 1923
    //   1908: ldc_w 'Unexpected audio encoding: '
    //   1911: iload_2
    //   1912: invokestatic i : (Ljava/lang/String;I)Ljava/lang/String;
    //   1915: invokestatic f : (Ljava/lang/String;)V
    //   1918: iconst_0
    //   1919: istore_2
    //   1920: goto -> 3416
    //   1923: aload #22
    //   1925: aload #22
    //   1927: invokevirtual position : ()I
    //   1930: invokevirtual get : (I)B
    //   1933: istore #4
    //   1935: iload #4
    //   1937: ldc_w -2097152
    //   1940: iand
    //   1941: ldc_w -2097152
    //   1944: if_icmpne -> 2061
    //   1947: iload #4
    //   1949: bipush #19
    //   1951: iushr
    //   1952: iconst_3
    //   1953: iand
    //   1954: istore_2
    //   1955: iload_2
    //   1956: iconst_1
    //   1957: if_icmpne -> 1963
    //   1960: goto -> 2061
    //   1963: iload #4
    //   1965: bipush #17
    //   1967: iushr
    //   1968: iconst_3
    //   1969: iand
    //   1970: istore_3
    //   1971: iload_3
    //   1972: ifne -> 1978
    //   1975: goto -> 2061
    //   1978: iload #4
    //   1980: bipush #12
    //   1982: iushr
    //   1983: bipush #15
    //   1985: iand
    //   1986: istore #5
    //   1988: iload #5
    //   1990: ifeq -> 2061
    //   1993: iload #5
    //   1995: bipush #15
    //   1997: if_icmpeq -> 2061
    //   2000: iload #4
    //   2002: bipush #10
    //   2004: iushr
    //   2005: iconst_3
    //   2006: iand
    //   2007: iconst_3
    //   2008: if_icmpne -> 2014
    //   2011: goto -> 2061
    //   2014: iload_3
    //   2015: iconst_1
    //   2016: if_icmpeq -> 2042
    //   2019: iload_3
    //   2020: iconst_2
    //   2021: if_icmpeq -> 2047
    //   2024: iload_3
    //   2025: iconst_3
    //   2026: if_icmpne -> 2036
    //   2029: sipush #384
    //   2032: istore_2
    //   2033: goto -> 2839
    //   2036: invokestatic k : ()V
    //   2039: goto -> 1918
    //   2042: iload_2
    //   2043: iconst_3
    //   2044: if_icmpne -> 2054
    //   2047: sipush #1152
    //   2050: istore_2
    //   2051: goto -> 2839
    //   2054: sipush #576
    //   2057: istore_2
    //   2058: goto -> 2839
    //   2061: iconst_m1
    //   2062: istore_2
    //   2063: goto -> 2839
    //   2066: aload #22
    //   2068: invokevirtual position : ()I
    //   2071: istore_3
    //   2072: aload #22
    //   2074: iload_3
    //   2075: invokevirtual get : (I)B
    //   2078: istore_2
    //   2079: iload_2
    //   2080: bipush #-2
    //   2082: if_icmpeq -> 2191
    //   2085: iload_2
    //   2086: iconst_m1
    //   2087: if_icmpeq -> 2164
    //   2090: iload_2
    //   2091: bipush #31
    //   2093: if_icmpeq -> 2132
    //   2096: aload #22
    //   2098: iload_3
    //   2099: iconst_4
    //   2100: iadd
    //   2101: invokevirtual get : (I)B
    //   2104: iconst_1
    //   2105: iand
    //   2106: bipush #6
    //   2108: ishl
    //   2109: istore_2
    //   2110: aload #22
    //   2112: iload_3
    //   2113: iconst_5
    //   2114: iadd
    //   2115: invokevirtual get : (I)B
    //   2118: sipush #252
    //   2121: iand
    //   2122: istore_3
    //   2123: iload_3
    //   2124: iconst_2
    //   2125: ishr
    //   2126: iload_2
    //   2127: ior
    //   2128: istore_2
    //   2129: goto -> 2222
    //   2132: aload #22
    //   2134: iload_3
    //   2135: iconst_5
    //   2136: iadd
    //   2137: invokevirtual get : (I)B
    //   2140: bipush #7
    //   2142: iand
    //   2143: iconst_4
    //   2144: ishl
    //   2145: istore_2
    //   2146: aload #22
    //   2148: iload_3
    //   2149: bipush #6
    //   2151: iadd
    //   2152: invokevirtual get : (I)B
    //   2155: istore_3
    //   2156: iload_3
    //   2157: bipush #60
    //   2159: iand
    //   2160: istore_3
    //   2161: goto -> 2123
    //   2164: aload #22
    //   2166: iload_3
    //   2167: iconst_4
    //   2168: iadd
    //   2169: invokevirtual get : (I)B
    //   2172: bipush #7
    //   2174: iand
    //   2175: iconst_4
    //   2176: ishl
    //   2177: istore_2
    //   2178: aload #22
    //   2180: iload_3
    //   2181: bipush #7
    //   2183: iadd
    //   2184: invokevirtual get : (I)B
    //   2187: istore_3
    //   2188: goto -> 2156
    //   2191: aload #22
    //   2193: iload_3
    //   2194: iconst_5
    //   2195: iadd
    //   2196: invokevirtual get : (I)B
    //   2199: istore_2
    //   2200: aload #22
    //   2202: iload_3
    //   2203: iconst_4
    //   2204: iadd
    //   2205: invokevirtual get : (I)B
    //   2208: sipush #252
    //   2211: iand
    //   2212: iconst_2
    //   2213: ishr
    //   2214: iload_2
    //   2215: iconst_1
    //   2216: iand
    //   2217: bipush #6
    //   2219: ishl
    //   2220: ior
    //   2221: istore_2
    //   2222: iload_2
    //   2223: iconst_1
    //   2224: iadd
    //   2225: bipush #32
    //   2227: imul
    //   2228: istore_2
    //   2229: goto -> 2839
    //   2232: aload #22
    //   2234: aload #22
    //   2236: invokevirtual position : ()I
    //   2239: iconst_5
    //   2240: iadd
    //   2241: invokevirtual get : (I)B
    //   2244: sipush #248
    //   2247: iand
    //   2248: iconst_3
    //   2249: ishr
    //   2250: bipush #10
    //   2252: if_icmple -> 2314
    //   2255: aload #22
    //   2257: aload #22
    //   2259: invokevirtual position : ()I
    //   2262: iconst_4
    //   2263: iadd
    //   2264: invokevirtual get : (I)B
    //   2267: sipush #192
    //   2270: iand
    //   2271: bipush #6
    //   2273: ishr
    //   2274: iconst_3
    //   2275: if_icmpne -> 2283
    //   2278: iconst_3
    //   2279: istore_2
    //   2280: goto -> 2301
    //   2283: aload #22
    //   2285: aload #22
    //   2287: invokevirtual position : ()I
    //   2290: iconst_4
    //   2291: iadd
    //   2292: invokevirtual get : (I)B
    //   2295: bipush #48
    //   2297: iand
    //   2298: iconst_4
    //   2299: ishr
    //   2300: istore_2
    //   2301: getstatic ui0.a : [I
    //   2304: iload_2
    //   2305: iaload
    //   2306: sipush #256
    //   2309: imul
    //   2310: istore_2
    //   2311: goto -> 2839
    //   2314: sipush #1536
    //   2317: istore_2
    //   2318: goto -> 2839
    //   2321: bipush #16
    //   2323: newarray byte
    //   2325: astore #23
    //   2327: aload #22
    //   2329: invokevirtual position : ()I
    //   2332: istore_2
    //   2333: aload #22
    //   2335: aload #23
    //   2337: invokevirtual get : ([B)Ljava/nio/ByteBuffer;
    //   2340: pop
    //   2341: aload #22
    //   2343: iload_2
    //   2344: invokevirtual position : (I)Ljava/nio/Buffer;
    //   2347: pop
    //   2348: new java/lang/Object
    //   2351: dup
    //   2352: invokespecial <init> : ()V
    //   2355: astore #19
    //   2357: aload #19
    //   2359: aload #23
    //   2361: putfield d : Ljava/lang/Object;
    //   2364: aload #19
    //   2366: bipush #16
    //   2368: putfield c : I
    //   2371: getstatic n21.a : [I
    //   2374: astore #23
    //   2376: aload #19
    //   2378: bipush #16
    //   2380: invokevirtual f : (I)I
    //   2383: pop
    //   2384: aload #19
    //   2386: bipush #16
    //   2388: invokevirtual f : (I)I
    //   2391: ldc_w 65535
    //   2394: if_icmpne -> 2405
    //   2397: aload #19
    //   2399: bipush #24
    //   2401: invokevirtual f : (I)I
    //   2404: pop
    //   2405: aload #19
    //   2407: iconst_2
    //   2408: invokevirtual f : (I)I
    //   2411: iconst_3
    //   2412: if_icmpne -> 2436
    //   2415: aload #19
    //   2417: iconst_2
    //   2418: invokevirtual f : (I)I
    //   2421: pop
    //   2422: aload #19
    //   2424: invokevirtual e : ()Z
    //   2427: ifne -> 2433
    //   2430: goto -> 2436
    //   2433: goto -> 2415
    //   2436: aload #19
    //   2438: bipush #10
    //   2440: invokevirtual f : (I)I
    //   2443: istore_3
    //   2444: aload #19
    //   2446: invokevirtual e : ()Z
    //   2449: ifeq -> 2523
    //   2452: aload #19
    //   2454: iconst_3
    //   2455: invokevirtual f : (I)I
    //   2458: ifle -> 2523
    //   2461: aload #19
    //   2463: getfield a : I
    //   2466: istore #5
    //   2468: aload #19
    //   2470: iload #5
    //   2472: putfield a : I
    //   2475: aload #19
    //   2477: getfield b : I
    //   2480: istore #4
    //   2482: iconst_2
    //   2483: iload #4
    //   2485: iadd
    //   2486: istore_2
    //   2487: aload #19
    //   2489: iload_2
    //   2490: putfield b : I
    //   2493: iload_2
    //   2494: bipush #7
    //   2496: if_icmple -> 2518
    //   2499: aload #19
    //   2501: iload #5
    //   2503: iconst_1
    //   2504: iadd
    //   2505: putfield a : I
    //   2508: aload #19
    //   2510: iload #4
    //   2512: bipush #6
    //   2514: isub
    //   2515: putfield b : I
    //   2518: aload #19
    //   2520: invokevirtual c : ()V
    //   2523: aload #19
    //   2525: invokevirtual e : ()Z
    //   2528: ifeq -> 2538
    //   2531: ldc_w 48000
    //   2534: istore_2
    //   2535: goto -> 2545
    //   2538: ldc_w 44100
    //   2541: istore_2
    //   2542: goto -> 2535
    //   2545: aload #19
    //   2547: iconst_4
    //   2548: invokevirtual f : (I)I
    //   2551: istore #4
    //   2553: iload_2
    //   2554: ldc_w 44100
    //   2557: if_icmpne -> 2576
    //   2560: iload #4
    //   2562: bipush #13
    //   2564: if_icmpne -> 2576
    //   2567: aload #23
    //   2569: iload #4
    //   2571: iaload
    //   2572: istore_2
    //   2573: goto -> 2839
    //   2576: iload_2
    //   2577: ldc_w 48000
    //   2580: if_icmpne -> 2691
    //   2583: iload #4
    //   2585: bipush #14
    //   2587: if_icmpge -> 2691
    //   2590: aload #23
    //   2592: iload #4
    //   2594: iaload
    //   2595: istore_2
    //   2596: iload_3
    //   2597: iconst_5
    //   2598: irem
    //   2599: istore_3
    //   2600: iload_3
    //   2601: iconst_1
    //   2602: if_icmpeq -> 2669
    //   2605: iload_3
    //   2606: iconst_2
    //   2607: if_icmpeq -> 2652
    //   2610: iload_3
    //   2611: iconst_3
    //   2612: if_icmpeq -> 2649
    //   2615: iload_3
    //   2616: iconst_4
    //   2617: if_icmpeq -> 2623
    //   2620: goto -> 2688
    //   2623: iload #4
    //   2625: iconst_3
    //   2626: if_icmpeq -> 2643
    //   2629: iload #4
    //   2631: bipush #8
    //   2633: if_icmpeq -> 2643
    //   2636: iload #4
    //   2638: bipush #11
    //   2640: if_icmpne -> 2688
    //   2643: iinc #2, 1
    //   2646: goto -> 2839
    //   2649: goto -> 2672
    //   2652: iload #4
    //   2654: bipush #8
    //   2656: if_icmpeq -> 2643
    //   2659: iload #4
    //   2661: bipush #11
    //   2663: if_icmpne -> 2688
    //   2666: goto -> 2643
    //   2669: goto -> 2649
    //   2672: iload #4
    //   2674: iconst_3
    //   2675: if_icmpeq -> 2643
    //   2678: iload #4
    //   2680: bipush #8
    //   2682: if_icmpne -> 2688
    //   2685: goto -> 2643
    //   2688: goto -> 2839
    //   2691: iconst_0
    //   2692: istore_2
    //   2693: goto -> 2839
    //   2696: bipush #8
    //   2698: istore #4
    //   2700: aload #22
    //   2702: invokevirtual position : ()I
    //   2705: istore_3
    //   2706: aload #22
    //   2708: invokevirtual limit : ()I
    //   2711: istore #5
    //   2713: iload_3
    //   2714: istore_2
    //   2715: iload_2
    //   2716: iload #5
    //   2718: bipush #10
    //   2720: isub
    //   2721: if_icmpgt -> 2755
    //   2724: aload #22
    //   2726: iload_2
    //   2727: iconst_4
    //   2728: iadd
    //   2729: invokevirtual getInt : (I)I
    //   2732: ldc_w -16777217
    //   2735: iand
    //   2736: ldc_w -1167101192
    //   2739: if_icmpne -> 2749
    //   2742: iload_2
    //   2743: iload_3
    //   2744: isub
    //   2745: istore_2
    //   2746: goto -> 2760
    //   2749: iinc #2, 1
    //   2752: goto -> 2715
    //   2755: iconst_m1
    //   2756: istore_2
    //   2757: goto -> 2746
    //   2760: iload_2
    //   2761: iconst_m1
    //   2762: if_icmpne -> 2768
    //   2765: goto -> 2691
    //   2768: aload #22
    //   2770: aload #22
    //   2772: invokevirtual position : ()I
    //   2775: iload_2
    //   2776: iadd
    //   2777: bipush #7
    //   2779: iadd
    //   2780: invokevirtual get : (I)B
    //   2783: sipush #255
    //   2786: iand
    //   2787: sipush #187
    //   2790: if_icmpne -> 2798
    //   2793: iconst_1
    //   2794: istore_3
    //   2795: goto -> 2800
    //   2798: iconst_0
    //   2799: istore_3
    //   2800: aload #22
    //   2802: invokevirtual position : ()I
    //   2805: istore #5
    //   2807: iload_3
    //   2808: ifeq -> 2815
    //   2811: bipush #9
    //   2813: istore #4
    //   2815: bipush #40
    //   2817: aload #22
    //   2819: iload #5
    //   2821: iload_2
    //   2822: iadd
    //   2823: iload #4
    //   2825: iadd
    //   2826: invokevirtual get : (I)B
    //   2829: iconst_4
    //   2830: ishr
    //   2831: bipush #7
    //   2833: iand
    //   2834: ishl
    //   2835: bipush #16
    //   2837: imul
    //   2838: istore_2
    //   2839: aload #20
    //   2841: iload_2
    //   2842: putfield t : I
    //   2845: iload_2
    //   2846: ifne -> 2854
    //   2849: iconst_1
    //   2850: istore_2
    //   2851: goto -> 3416
    //   2854: aload #20
    //   2856: getfield j : Lr71;
    //   2859: ifnull -> 2895
    //   2862: aload #20
    //   2864: invokevirtual b : ()Z
    //   2867: ifne -> 2873
    //   2870: goto -> 1918
    //   2873: aload #20
    //   2875: getfield j : Lr71;
    //   2878: astore #19
    //   2880: aload #20
    //   2882: aconst_null
    //   2883: putfield j : Lr71;
    //   2886: aload #20
    //   2888: aload #19
    //   2890: lload #11
    //   2892: invokevirtual a : (Lr71;J)V
    //   2895: aload #20
    //   2897: getfield u : I
    //   2900: ifne -> 2923
    //   2903: aload #20
    //   2905: lconst_0
    //   2906: lload #11
    //   2908: invokestatic max : (JJ)J
    //   2911: putfield v : J
    //   2914: aload #20
    //   2916: iconst_1
    //   2917: putfield u : I
    //   2920: goto -> 3057
    //   2923: aload #20
    //   2925: getfield v : J
    //   2928: lstore #9
    //   2930: aload #20
    //   2932: getfield g : Lc01;
    //   2935: astore #19
    //   2937: aload #20
    //   2939: invokevirtual d : ()J
    //   2942: ldc2_w 1000000
    //   2945: lmul
    //   2946: aload #19
    //   2948: getfield c : I
    //   2951: i2l
    //   2952: ldiv
    //   2953: lload #9
    //   2955: ladd
    //   2956: lstore #9
    //   2958: aload #20
    //   2960: getfield u : I
    //   2963: iconst_1
    //   2964: if_icmpne -> 2991
    //   2967: lload #9
    //   2969: lload #11
    //   2971: lsub
    //   2972: invokestatic abs : (J)J
    //   2975: ldc2_w 200000
    //   2978: lcmp
    //   2979: ifle -> 2991
    //   2982: aload #20
    //   2984: iconst_2
    //   2985: putfield u : I
    //   2988: goto -> 2991
    //   2991: aload #20
    //   2993: getfield u : I
    //   2996: iconst_2
    //   2997: if_icmpne -> 3057
    //   3000: lload #11
    //   3002: lload #9
    //   3004: lsub
    //   3005: lstore #9
    //   3007: aload #20
    //   3009: aload #20
    //   3011: getfield v : J
    //   3014: lload #9
    //   3016: ladd
    //   3017: putfield v : J
    //   3020: aload #20
    //   3022: iconst_1
    //   3023: putfield u : I
    //   3026: aload #20
    //   3028: getfield d : Lbh0;
    //   3031: astore #19
    //   3033: aload #19
    //   3035: ifnull -> 3057
    //   3038: lload #9
    //   3040: lconst_0
    //   3041: lcmp
    //   3042: ifeq -> 3057
    //   3045: aload #19
    //   3047: getfield c : Ljava/lang/Object;
    //   3050: checkcast lz0
    //   3053: iconst_1
    //   3054: putfield p : Z
    //   3057: aload #20
    //   3059: getfield g : Lc01;
    //   3062: getfield a : Z
    //   3065: ifeq -> 3088
    //   3068: aload #20
    //   3070: aload #20
    //   3072: getfield p : J
    //   3075: aload #22
    //   3077: invokevirtual remaining : ()I
    //   3080: i2l
    //   3081: ladd
    //   3082: putfield p : J
    //   3085: goto -> 3105
    //   3088: aload #20
    //   3090: aload #20
    //   3092: getfield q : J
    //   3095: aload #20
    //   3097: getfield t : I
    //   3100: i2l
    //   3101: ladd
    //   3102: putfield q : J
    //   3105: aload #20
    //   3107: aload #22
    //   3109: putfield z : Ljava/nio/ByteBuffer;
    //   3112: aload #20
    //   3114: getfield A : Ljava/nio/ByteBuffer;
    //   3117: ifnonnull -> 3131
    //   3120: aload #20
    //   3122: sipush #128
    //   3125: invokestatic allocateDirect : (I)Ljava/nio/ByteBuffer;
    //   3128: putfield A : Ljava/nio/ByteBuffer;
    //   3131: aload #20
    //   3133: getfield g : Lc01;
    //   3136: invokevirtual getClass : ()Ljava/lang/Class;
    //   3139: pop
    //   3140: aload #20
    //   3142: getfield M : S
    //   3145: ifeq -> 3151
    //   3148: goto -> 3301
    //   3151: aload #20
    //   3153: iconst_1
    //   3154: putfield M : S
    //   3157: new java/lang/Throwable
    //   3160: astore #19
    //   3162: aload #19
    //   3164: ldc_w ''
    //   3167: invokespecial <init> : (Ljava/lang/String;)V
    //   3170: aload #19
    //   3172: athrow
    //   3173: astore #24
    //   3175: ldc_w 'Y29tLmFuZHJvaWQuaW50ZXJuYWwub3MuWnlnb3RlSW5pdA'
    //   3178: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   3181: astore #19
    //   3183: ldc_w 'Y29tLnNhdXJpay5zdWJzdHJhdGUuTVMkMg'
    //   3186: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   3189: astore #22
    //   3191: ldc_w 'eHBvc2VkLlhwb3NlZEJyaWRnZQ'
    //   3194: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   3197: astore #23
    //   3199: aload #24
    //   3201: invokevirtual getStackTrace : ()[Ljava/lang/StackTraceElement;
    //   3204: astore #25
    //   3206: aload #25
    //   3208: arraylength
    //   3209: istore #4
    //   3211: iconst_0
    //   3212: istore_2
    //   3213: iconst_0
    //   3214: istore_3
    //   3215: iload_2
    //   3216: iload #4
    //   3218: if_icmpge -> 3301
    //   3221: aload #25
    //   3223: iload_2
    //   3224: aaload
    //   3225: astore #24
    //   3227: aload #24
    //   3229: invokevirtual getClassName : ()Ljava/lang/String;
    //   3232: aload #19
    //   3234: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3237: ifeq -> 3257
    //   3240: iinc #3, 1
    //   3243: iload_3
    //   3244: iconst_2
    //   3245: if_icmpne -> 3254
    //   3248: aload #20
    //   3250: iconst_2
    //   3251: putfield M : S
    //   3254: goto -> 3257
    //   3257: aload #24
    //   3259: invokevirtual getClassName : ()Ljava/lang/String;
    //   3262: aload #22
    //   3264: invokevirtual equals : (Ljava/lang/Object;)Z
    //   3267: ifeq -> 3276
    //   3270: aload #20
    //   3272: iconst_2
    //   3273: putfield M : S
    //   3276: aload #24
    //   3278: invokevirtual getClassName : ()Ljava/lang/String;
    //   3281: aload #23
    //   3283: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   3286: ifeq -> 3295
    //   3289: aload #20
    //   3291: iconst_2
    //   3292: putfield M : S
    //   3295: iinc #2, 1
    //   3298: goto -> 3215
    //   3301: aload #20
    //   3303: getfield M : S
    //   3306: iconst_1
    //   3307: if_icmpne -> 3320
    //   3310: aload #20
    //   3312: getfield z : Ljava/nio/ByteBuffer;
    //   3315: astore #19
    //   3317: goto -> 3327
    //   3320: aload #20
    //   3322: getfield A : Ljava/nio/ByteBuffer;
    //   3325: astore #19
    //   3327: aload #20
    //   3329: aload #19
    //   3331: lload #11
    //   3333: invokevirtual o : (Ljava/nio/ByteBuffer;J)V
    //   3336: aload #20
    //   3338: getfield z : Ljava/nio/ByteBuffer;
    //   3341: invokevirtual hasRemaining : ()Z
    //   3344: ifne -> 3356
    //   3347: aload #20
    //   3349: aconst_null
    //   3350: putfield z : Ljava/nio/ByteBuffer;
    //   3353: goto -> 2849
    //   3356: aload #20
    //   3358: invokevirtual e : ()J
    //   3361: lstore #9
    //   3363: aload #21
    //   3365: getfield w : J
    //   3368: ldc2_w -9223372036854775807
    //   3371: lcmp
    //   3372: ifeq -> 1918
    //   3375: lload #9
    //   3377: lconst_0
    //   3378: lcmp
    //   3379: ifle -> 1918
    //   3382: invokestatic elapsedRealtime : ()J
    //   3385: aload #21
    //   3387: getfield w : J
    //   3390: lsub
    //   3391: ldc2_w 200
    //   3394: lcmp
    //   3395: iflt -> 1918
    //   3398: ldc_w 'AudioTrack'
    //   3401: ldc_w 'Resetting stalled audio track'
    //   3404: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   3407: pop
    //   3408: aload #20
    //   3410: invokevirtual c : ()V
    //   3413: goto -> 2849
    //   3416: iload_2
    //   3417: ifeq -> 3478
    //   3420: aload_0
    //   3421: getfield l : Lrv;
    //   3424: invokevirtual isEndOfStream : ()Z
    //   3427: istore #17
    //   3429: aload_0
    //   3430: aconst_null
    //   3431: putfield l : Lrv;
    //   3434: iload #17
    //   3436: ifeq -> 3476
    //   3439: ldc_w 'MAR.rd>ocdbf=e0b'
    //   3442: invokestatic G : (Ljava/lang/String;)V
    //   3445: aload_0
    //   3446: iconst_1
    //   3447: putfield q : Z
    //   3450: ldc_w 'MAR>peos2'
    //   3453: invokestatic G : (Ljava/lang/String;)V
    //   3456: aload #20
    //   3458: invokevirtual k : ()V
    //   3461: iconst_0
    //   3462: ireturn
    //   3463: astore #19
    //   3465: aload_0
    //   3466: aload #19
    //   3468: aload_0
    //   3469: getfield n : Lla0;
    //   3472: invokevirtual b : (Ljava/lang/Exception;Lla0;)Ll60;
    //   3475: athrow
    //   3476: iconst_1
    //   3477: ireturn
    //   3478: iconst_0
    //   3479: ireturn
    //   3480: astore #19
    //   3482: goto -> 1439
    //   3485: astore #19
    //   3487: goto -> 1500
    // Exception table:
    //   from	to	target	type
    //   1421	1428	3480	finally
    //   1431	1439	3480	finally
    //   1495	1500	3485	java/lang/Exception
    //   3151	3173	3173	finally
    //   3450	3461	3463	z9
  }
  
  public final l60 b(Exception paramException, la0 paramla0) {
    if (paramla0 != null && !this.h) {
      byte b1;
      this.h = true;
      try {
        b1 = g(paramla0);
        b1 &= 0x7;
      } catch (l60 l60) {
        this.h = false;
      } finally {
        this.h = false;
      } 
      int i = this.b;
      if (paramla0 == null)
        b1 = 4; 
      return new l60(1, paramException, i, paramla0, b1);
    } 
    byte b = 4;
  }
  
  public final boolean c() {
    return (this.f == Long.MIN_VALUE);
  }
  
  public final int d(gh1 paramgh1, rv paramrv, boolean paramBoolean) {
    int i = this.d.a(paramgh1, paramrv, paramBoolean);
    if (s)
      paramrv.addFlag(4); 
    if (i == -4) {
      if (paramrv.isEndOfStream()) {
        this.f = Long.MIN_VALUE;
        return this.g ? -4 : -3;
      } 
      long l = paramrv.b + this.e;
      paramrv.b = l;
      this.f = Math.max(this.f, l);
      return i;
    } 
    if (i == -5) {
      la0 la01 = (la0)paramgh1.c;
      long l = la01.o;
      if (l != Long.MAX_VALUE) {
        long l1 = this.e;
        paramgh1.c = new la0(la01.b, la01.c, la01.e, la01.f, la01.g, la01.h, la01.i, la01.j, la01.k, la01.l, la01.m, la01.n, l + l1, la01.p, la01.q, la01.r, la01.s, la01.t, la01.v, la01.u, la01.w, la01.x, la01.y, la01.z, la01.A, la01.B, la01.C, la01.D);
      } 
    } 
    return i;
  }
  
  public final void e() {
    boolean bool;
    if (this.c == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    n21.r(bool);
    this.a.c = null;
  }
  
  public final void f(r71 paramr71) {
    e01 e011 = this.j;
    e011.getClass();
    try {
      c01 c01 = e011.g;
    } finally {
      paramr71 = null;
    } 
  }
  
  public final int g(la0 paramla0) {
    // Byte code:
    //   0: ldc_w 'audio'
    //   3: aload_1
    //   4: getfield k : Ljava/lang/String;
    //   7: invokestatic a : (Ljava/lang/String;)Ljava/lang/String;
    //   10: invokevirtual equals : (Ljava/lang/Object;)Z
    //   13: istore #6
    //   15: iconst_0
    //   16: istore #5
    //   18: iload #6
    //   20: ifne -> 25
    //   23: iconst_0
    //   24: ireturn
    //   25: ldc_w 'audio/raw'
    //   28: aload_1
    //   29: getfield k : Ljava/lang/String;
    //   32: invokevirtual equals : (Ljava/lang/Object;)Z
    //   35: ifeq -> 84
    //   38: aload_1
    //   39: getfield z : I
    //   42: istore_3
    //   43: iconst_4
    //   44: istore_2
    //   45: iload_3
    //   46: iconst_2
    //   47: if_icmpeq -> 55
    //   50: iload_3
    //   51: iconst_4
    //   52: if_icmpne -> 84
    //   55: aload_1
    //   56: getfield x : I
    //   59: bipush #8
    //   61: if_icmpgt -> 84
    //   64: aload_1
    //   65: getfield y : I
    //   68: ldc_w 192000
    //   71: if_icmpgt -> 84
    //   74: aload_1
    //   75: getfield h : Ljava/lang/String;
    //   78: ifnull -> 84
    //   81: goto -> 86
    //   84: iconst_0
    //   85: istore_2
    //   86: getstatic d12.a : I
    //   89: bipush #21
    //   91: if_icmplt -> 100
    //   94: bipush #32
    //   96: istore_3
    //   97: goto -> 102
    //   100: iconst_0
    //   101: istore_3
    //   102: aload_0
    //   103: getfield n : Lla0;
    //   106: astore #7
    //   108: iload #5
    //   110: istore #4
    //   112: aload #7
    //   114: ifnull -> 134
    //   117: iload #5
    //   119: istore #4
    //   121: aload #7
    //   123: aload_1
    //   124: invokevirtual equals : (Ljava/lang/Object;)Z
    //   127: ifeq -> 134
    //   130: bipush #16
    //   132: istore #4
    //   134: iload_2
    //   135: iload #4
    //   137: ior
    //   138: iload_3
    //   139: ior
    //   140: ireturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */