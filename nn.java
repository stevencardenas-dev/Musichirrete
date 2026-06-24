public final class nn extends pr1 implements ad0 {
  public final int g;
  
  public int h;
  
  public int i;
  
  public int j;
  
  public Object k;
  
  public Object l;
  
  public Object m;
  
  public Object n;
  
  public Object o;
  
  public final Object p;
  
  public final Object q;
  
  public nn(cy1 paramcy1, by1 paramby1, cs paramcs) {
    super(2, paramcs);
  }
  
  public nn(w80[] paramArrayOfw80, tx1 paramtx1, d72 paramd72, x80 paramx80, cs paramcs) {
    super(2, paramcs);
  }
  
  public final Object g(Object paramObject1, Object paramObject2) {
    int i = this.g;
    l02 l02 = l02.a;
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    switch (i) {
      default:
        return ((nn)l((cs)paramObject2, paramObject1)).n(l02);
      case 0:
        break;
    } 
    return ((nn)l((cs)paramObject2, paramObject1)).n(l02);
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    int i = this.g;
    Object object1 = this.q;
    Object object2 = this.p;
    switch (i) {
      default:
        paramcs = new nn((cy1)object2, (by1)object1, paramcs);
        ((nn)paramcs).k = paramObject;
        return paramcs;
      case 0:
        break;
    } 
    paramcs = new nn((w80[])this.n, (tx1)this.o, (d72)object2, (x80)object1, paramcs);
    ((nn)paramcs).k = paramObject;
    return paramcs;
  }
  
  public final Object n(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : I
    //   4: istore_2
    //   5: getstatic l02.a : Ll02;
    //   8: astore #14
    //   10: getstatic ys.b : Lys;
    //   13: astore #15
    //   15: aload_0
    //   16: getfield q : Ljava/lang/Object;
    //   19: astore #10
    //   21: aload_0
    //   22: getfield p : Ljava/lang/Object;
    //   25: astore #12
    //   27: iload_2
    //   28: tableswitch default -> 48, 0 -> 1292
    //   48: aload #12
    //   50: checkcast cy1
    //   53: astore #18
    //   55: aload #10
    //   57: checkcast by1
    //   60: astore #17
    //   62: aload #17
    //   64: getfield e : Lvx1;
    //   67: astore #10
    //   69: aload #17
    //   71: getfield c : Lip1;
    //   74: astore #16
    //   76: aload_0
    //   77: getfield k : Ljava/lang/Object;
    //   80: checkcast xs
    //   83: astore #13
    //   85: aload_0
    //   86: getfield j : I
    //   89: istore_2
    //   90: iload_2
    //   91: ifeq -> 274
    //   94: iload_2
    //   95: iconst_1
    //   96: if_icmpeq -> 267
    //   99: iload_2
    //   100: iconst_2
    //   101: if_icmpeq -> 260
    //   104: iload_2
    //   105: iconst_3
    //   106: if_icmpeq -> 253
    //   109: iload_2
    //   110: iconst_4
    //   111: if_icmpeq -> 185
    //   114: iload_2
    //   115: iconst_5
    //   116: if_icmpne -> 175
    //   119: aload_0
    //   120: getfield m : Ljava/lang/Object;
    //   123: checkcast android/os/ParcelFileDescriptor
    //   126: astore #11
    //   128: aload_0
    //   129: getfield l : Ljava/lang/Object;
    //   132: checkcast android/os/ParcelFileDescriptor
    //   135: astore #10
    //   137: aload_1
    //   138: invokestatic r0 : (Ljava/lang/Object;)V
    //   141: aload #10
    //   143: astore_1
    //   144: aload #11
    //   146: astore #10
    //   148: goto -> 999
    //   151: astore #12
    //   153: aload #11
    //   155: astore_1
    //   156: aload #12
    //   158: astore #11
    //   160: goto -> 1129
    //   163: astore #12
    //   165: aload #11
    //   167: astore_1
    //   168: aload #12
    //   170: astore #11
    //   172: goto -> 1211
    //   175: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   177: invokestatic f : (Ljava/lang/String;)V
    //   180: aconst_null
    //   181: astore_1
    //   182: goto -> 1205
    //   185: aload_0
    //   186: getfield i : I
    //   189: istore_2
    //   190: aload_0
    //   191: getfield h : I
    //   194: istore_3
    //   195: aload_0
    //   196: getfield o : Ljava/lang/Object;
    //   199: checkcast dk0
    //   202: astore #12
    //   204: aload_0
    //   205: getfield n : Ljava/lang/Object;
    //   208: checkcast in/krosbits/nativex/Cn
    //   211: astore #11
    //   213: aload_0
    //   214: getfield m : Ljava/lang/Object;
    //   217: checkcast android/os/ParcelFileDescriptor
    //   220: astore #13
    //   222: aload_0
    //   223: getfield l : Ljava/lang/Object;
    //   226: checkcast android/os/ParcelFileDescriptor
    //   229: astore #10
    //   231: aload_1
    //   232: invokestatic r0 : (Ljava/lang/Object;)V
    //   235: aload #10
    //   237: astore_1
    //   238: aload #13
    //   240: astore #10
    //   242: goto -> 756
    //   245: astore #11
    //   247: aload #13
    //   249: astore_1
    //   250: goto -> 160
    //   253: aload_1
    //   254: invokestatic r0 : (Ljava/lang/Object;)V
    //   257: goto -> 437
    //   260: aload_1
    //   261: invokestatic r0 : (Ljava/lang/Object;)V
    //   264: goto -> 381
    //   267: aload_1
    //   268: invokestatic r0 : (Ljava/lang/Object;)V
    //   271: goto -> 327
    //   274: aload_1
    //   275: invokestatic r0 : (Ljava/lang/Object;)V
    //   278: aload #18
    //   280: getfield j : Lvj0;
    //   283: astore_1
    //   284: aload_1
    //   285: ifnull -> 327
    //   288: aload_1
    //   289: checkcast dk0
    //   292: invokevirtual O : ()Z
    //   295: ifne -> 327
    //   298: aload_0
    //   299: aload #13
    //   301: putfield k : Ljava/lang/Object;
    //   304: aload_0
    //   305: iconst_0
    //   306: putfield h : I
    //   309: aload_0
    //   310: iconst_1
    //   311: putfield j : I
    //   314: aload_1
    //   315: aload_0
    //   316: invokestatic k : (Lvj0;Lpr1;)Ljava/lang/Object;
    //   319: aload #15
    //   321: if_acmpne -> 327
    //   324: goto -> 993
    //   327: aload #13
    //   329: invokestatic q : (Lxs;)V
    //   332: aload #18
    //   334: getfield k : Lvj0;
    //   337: astore_1
    //   338: aload_1
    //   339: ifnull -> 381
    //   342: aload_1
    //   343: checkcast dk0
    //   346: invokevirtual O : ()Z
    //   349: ifne -> 381
    //   352: aload_0
    //   353: aload #13
    //   355: putfield k : Ljava/lang/Object;
    //   358: aload_0
    //   359: iconst_0
    //   360: putfield h : I
    //   363: aload_0
    //   364: iconst_2
    //   365: putfield j : I
    //   368: aload_1
    //   369: aload_0
    //   370: invokestatic k : (Lvj0;Lpr1;)Ljava/lang/Object;
    //   373: aload #15
    //   375: if_acmpne -> 381
    //   378: goto -> 993
    //   381: aload #13
    //   383: invokestatic q : (Lxs;)V
    //   386: aload #10
    //   388: ifnull -> 437
    //   391: aload #10
    //   393: getfield c : Lbp1;
    //   396: astore_1
    //   397: aload_1
    //   398: ifnull -> 437
    //   401: aload_1
    //   402: invokevirtual O : ()Z
    //   405: ifne -> 437
    //   408: aload_0
    //   409: aload #13
    //   411: putfield k : Ljava/lang/Object;
    //   414: aload_0
    //   415: iconst_0
    //   416: putfield h : I
    //   419: aload_0
    //   420: iconst_3
    //   421: putfield j : I
    //   424: aload_1
    //   425: aload_0
    //   426: invokevirtual Q : (Lds;)Ljava/lang/Object;
    //   429: aload #15
    //   431: if_acmpne -> 437
    //   434: goto -> 993
    //   437: aload #13
    //   439: invokestatic q : (Lxs;)V
    //   442: getstatic in/krosbits/musicolet/MyApplication.i : Lin/krosbits/musicolet/MyApplication;
    //   445: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   448: astore #19
    //   450: aload #19
    //   452: invokevirtual getCacheDir : ()Ljava/io/File;
    //   455: astore_1
    //   456: invokestatic currentTimeMillis : ()J
    //   459: lstore #7
    //   461: aload #18
    //   463: getfield h : Li51;
    //   466: astore #20
    //   468: aload #18
    //   470: getfield c : Ljava/util/List;
    //   473: astore #11
    //   475: aload #20
    //   477: getfield e : Ljava/lang/String;
    //   480: astore #20
    //   482: new java/lang/StringBuilder
    //   485: dup
    //   486: ldc 'tr_af_'
    //   488: invokespecial <init> : (Ljava/lang/String;)V
    //   491: astore #21
    //   493: aload #21
    //   495: lload #7
    //   497: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   500: pop
    //   501: aload #21
    //   503: ldc '.'
    //   505: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   508: pop
    //   509: aload #21
    //   511: aload #20
    //   513: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   516: pop
    //   517: new java/io/File
    //   520: dup
    //   521: aload_1
    //   522: aload #21
    //   524: invokevirtual toString : ()Ljava/lang/String;
    //   527: invokespecial <init> : (Ljava/io/File;Ljava/lang/String;)V
    //   530: astore_1
    //   531: aload_1
    //   532: invokevirtual createNewFile : ()Z
    //   535: pop
    //   536: aload_1
    //   537: invokevirtual deleteOnExit : ()V
    //   540: aload_1
    //   541: invokestatic s : (Ljava/io/File;)Lcd1;
    //   544: astore #20
    //   546: aload #10
    //   548: ifnull -> 568
    //   551: aload #10
    //   553: getfield p : Ljava/util/ArrayList;
    //   556: astore_1
    //   557: aload_1
    //   558: ifnull -> 568
    //   561: aload_1
    //   562: aload #20
    //   564: invokevirtual add : (Ljava/lang/Object;)Z
    //   567: pop
    //   568: aload #17
    //   570: getfield b : Lkm0;
    //   573: invokevirtual d : ()Lv00;
    //   576: ldc 'r'
    //   578: invokestatic J : (Lu00;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    //   581: astore_1
    //   582: aload #20
    //   584: ldc 'rwt'
    //   586: invokestatic J : (Lu00;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;
    //   589: astore #10
    //   591: aload #11
    //   593: iconst_0
    //   594: invokeinterface get : (I)Ljava/lang/Object;
    //   599: checkcast java/lang/Number
    //   602: invokevirtual floatValue : ()F
    //   605: f2i
    //   606: istore_3
    //   607: aload #11
    //   609: iconst_1
    //   610: invokeinterface get : (I)Ljava/lang/Object;
    //   615: checkcast java/lang/Number
    //   618: invokevirtual floatValue : ()F
    //   621: f2i
    //   622: istore_2
    //   623: new in/krosbits/nativex/Cn
    //   626: astore #11
    //   628: aload #11
    //   630: aload_1
    //   631: invokevirtual getFd : ()I
    //   634: aload #10
    //   636: invokevirtual getFd : ()I
    //   639: iload_3
    //   640: iload_2
    //   641: aload #18
    //   643: getfield h : Li51;
    //   646: invokevirtual ordinal : ()I
    //   649: invokespecial <init> : (IIIII)V
    //   652: aload #13
    //   654: invokeinterface g : ()Los;
    //   659: invokestatic y : (Los;)V
    //   662: new yx1
    //   665: astore #18
    //   667: aload #12
    //   669: checkcast cy1
    //   672: astore #12
    //   674: aload #18
    //   676: aload #11
    //   678: aload #12
    //   680: aload #20
    //   682: aload #17
    //   684: iload_2
    //   685: iload_3
    //   686: aload #19
    //   688: aconst_null
    //   689: invokespecial <init> : (Lin/krosbits/nativex/Cn;Lcy1;Lcd1;Lby1;IILandroid/content/Context;Lcs;)V
    //   692: aload #13
    //   694: aconst_null
    //   695: aconst_null
    //   696: aload #18
    //   698: iconst_3
    //   699: invokestatic L : (Lxs;Los;Lat;Lad0;I)Lbp1;
    //   702: astore #12
    //   704: aload #16
    //   706: invokevirtual f : ()Ljava/lang/Object;
    //   709: astore #13
    //   711: aload #16
    //   713: aload #13
    //   715: aload #13
    //   717: checkcast cy1
    //   720: aconst_null
    //   721: fconst_0
    //   722: fconst_0
    //   723: fconst_0
    //   724: aconst_null
    //   725: fconst_0
    //   726: aload #12
    //   728: aconst_null
    //   729: aconst_null
    //   730: aconst_null
    //   731: aload #11
    //   733: aconst_null
    //   734: aconst_null
    //   735: aconst_null
    //   736: aconst_null
    //   737: aconst_null
    //   738: aconst_null
    //   739: aconst_null
    //   740: ldc_w 2088447
    //   743: invokestatic a : (Lcy1;Ljava/util/List;FFFLi51;FLbp1;Lbp1;Lbp1;Lbp1;Lin/krosbits/nativex/Cn;Lcd1;Ljava/util/List;Li51;Ljava/lang/String;Ljava/lang/String;Landroid/util/Size;Landroid/graphics/Bitmap;I)Lcy1;
    //   746: invokevirtual e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   749: istore #9
    //   751: iload #9
    //   753: ifeq -> 704
    //   756: aload #12
    //   758: invokevirtual O : ()Z
    //   761: ifne -> 924
    //   764: aload #12
    //   766: invokevirtual N : ()Z
    //   769: ifne -> 924
    //   772: aload #16
    //   774: invokevirtual f : ()Ljava/lang/Object;
    //   777: astore #13
    //   779: aload #16
    //   781: aload #13
    //   783: aload #13
    //   785: checkcast cy1
    //   788: aconst_null
    //   789: fconst_0
    //   790: fconst_0
    //   791: fconst_0
    //   792: aconst_null
    //   793: aload #11
    //   795: invokevirtual d : ()D
    //   798: d2f
    //   799: aconst_null
    //   800: aconst_null
    //   801: aconst_null
    //   802: aconst_null
    //   803: aconst_null
    //   804: aconst_null
    //   805: aconst_null
    //   806: aconst_null
    //   807: aconst_null
    //   808: aconst_null
    //   809: aconst_null
    //   810: aconst_null
    //   811: ldc_w 2096895
    //   814: invokestatic a : (Lcy1;Ljava/util/List;FFFLi51;FLbp1;Lbp1;Lbp1;Lbp1;Lin/krosbits/nativex/Cn;Lcd1;Ljava/util/List;Li51;Ljava/lang/String;Ljava/lang/String;Landroid/util/Size;Landroid/graphics/Bitmap;I)Lcy1;
    //   817: invokevirtual e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   820: istore #9
    //   822: iload #9
    //   824: ifeq -> 772
    //   827: aload_0
    //   828: aconst_null
    //   829: putfield k : Ljava/lang/Object;
    //   832: aload_0
    //   833: aload_1
    //   834: putfield l : Ljava/lang/Object;
    //   837: aload_0
    //   838: aload #10
    //   840: putfield m : Ljava/lang/Object;
    //   843: aload_0
    //   844: aload #11
    //   846: putfield n : Ljava/lang/Object;
    //   849: aload_0
    //   850: aload #12
    //   852: putfield o : Ljava/lang/Object;
    //   855: aload_0
    //   856: iload_3
    //   857: putfield h : I
    //   860: aload_0
    //   861: iload_2
    //   862: putfield i : I
    //   865: aload_0
    //   866: iconst_4
    //   867: putfield j : I
    //   870: ldc2_w 500
    //   873: aload_0
    //   874: invokestatic o : (JLds;)Ljava/lang/Object;
    //   877: astore #13
    //   879: aload #13
    //   881: aload #15
    //   883: if_acmpne -> 756
    //   886: goto -> 993
    //   889: astore #11
    //   891: aload_1
    //   892: astore #12
    //   894: aload #10
    //   896: astore_1
    //   897: aload #12
    //   899: astore #10
    //   901: goto -> 1129
    //   904: astore #13
    //   906: goto -> 756
    //   909: astore #11
    //   911: aload_1
    //   912: astore #12
    //   914: aload #10
    //   916: astore_1
    //   917: aload #12
    //   919: astore #10
    //   921: goto -> 1211
    //   924: aload #12
    //   926: invokevirtual N : ()Z
    //   929: ifeq -> 937
    //   932: aload #11
    //   934: invokevirtual a : ()V
    //   937: aload_0
    //   938: aconst_null
    //   939: putfield k : Ljava/lang/Object;
    //   942: aload_0
    //   943: aload_1
    //   944: putfield l : Ljava/lang/Object;
    //   947: aload_0
    //   948: aload #10
    //   950: putfield m : Ljava/lang/Object;
    //   953: aload_0
    //   954: aconst_null
    //   955: putfield n : Ljava/lang/Object;
    //   958: aload_0
    //   959: aconst_null
    //   960: putfield o : Ljava/lang/Object;
    //   963: aload_0
    //   964: iload_3
    //   965: putfield h : I
    //   968: aload_0
    //   969: iload_2
    //   970: putfield i : I
    //   973: aload_0
    //   974: iconst_5
    //   975: putfield j : I
    //   978: aload #12
    //   980: aload_0
    //   981: invokevirtual Q : (Lds;)Ljava/lang/Object;
    //   984: astore #11
    //   986: aload #11
    //   988: aload #15
    //   990: if_acmpne -> 999
    //   993: aload #15
    //   995: astore_1
    //   996: goto -> 1205
    //   999: aload_1
    //   1000: ifnull -> 1007
    //   1003: aload_1
    //   1004: invokevirtual close : ()V
    //   1007: aload #10
    //   1009: ifnull -> 1017
    //   1012: aload #10
    //   1014: invokevirtual close : ()V
    //   1017: aload #16
    //   1019: invokevirtual f : ()Ljava/lang/Object;
    //   1022: astore_1
    //   1023: aload #16
    //   1025: aload_1
    //   1026: aload_1
    //   1027: checkcast cy1
    //   1030: aconst_null
    //   1031: fconst_0
    //   1032: fconst_0
    //   1033: fconst_0
    //   1034: aconst_null
    //   1035: fconst_0
    //   1036: aconst_null
    //   1037: aconst_null
    //   1038: aconst_null
    //   1039: aconst_null
    //   1040: aconst_null
    //   1041: aconst_null
    //   1042: aconst_null
    //   1043: aconst_null
    //   1044: aconst_null
    //   1045: aconst_null
    //   1046: aconst_null
    //   1047: aconst_null
    //   1048: ldc_w 2087423
    //   1051: invokestatic a : (Lcy1;Ljava/util/List;FFFLi51;FLbp1;Lbp1;Lbp1;Lbp1;Lin/krosbits/nativex/Cn;Lcd1;Ljava/util/List;Li51;Ljava/lang/String;Ljava/lang/String;Landroid/util/Size;Landroid/graphics/Bitmap;I)Lcy1;
    //   1054: invokevirtual e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1057: ifeq -> 1017
    //   1060: goto -> 1202
    //   1063: astore #11
    //   1065: goto -> 891
    //   1068: astore #11
    //   1070: goto -> 911
    //   1073: astore #11
    //   1075: goto -> 891
    //   1078: astore #11
    //   1080: goto -> 911
    //   1083: astore #11
    //   1085: aload_1
    //   1086: astore #10
    //   1088: aconst_null
    //   1089: astore_1
    //   1090: goto -> 1129
    //   1093: astore #11
    //   1095: aload_1
    //   1096: astore #10
    //   1098: aconst_null
    //   1099: astore_1
    //   1100: goto -> 1211
    //   1103: aconst_null
    //   1104: astore_1
    //   1105: aconst_null
    //   1106: astore #10
    //   1108: goto -> 1129
    //   1111: aconst_null
    //   1112: astore_1
    //   1113: aconst_null
    //   1114: astore #10
    //   1116: goto -> 1211
    //   1119: astore #11
    //   1121: goto -> 1103
    //   1124: astore #11
    //   1126: goto -> 1111
    //   1129: aload_1
    //   1130: astore #12
    //   1132: aload #10
    //   1134: astore #13
    //   1136: aload #11
    //   1138: invokevirtual printStackTrace : ()V
    //   1141: aload #10
    //   1143: ifnull -> 1151
    //   1146: aload #10
    //   1148: invokevirtual close : ()V
    //   1151: aload_1
    //   1152: ifnull -> 1159
    //   1155: aload_1
    //   1156: invokevirtual close : ()V
    //   1159: aload #16
    //   1161: invokevirtual f : ()Ljava/lang/Object;
    //   1164: astore_1
    //   1165: aload #16
    //   1167: aload_1
    //   1168: aload_1
    //   1169: checkcast cy1
    //   1172: aconst_null
    //   1173: fconst_0
    //   1174: fconst_0
    //   1175: fconst_0
    //   1176: aconst_null
    //   1177: fconst_0
    //   1178: aconst_null
    //   1179: aconst_null
    //   1180: aconst_null
    //   1181: aconst_null
    //   1182: aconst_null
    //   1183: aconst_null
    //   1184: aconst_null
    //   1185: aconst_null
    //   1186: aconst_null
    //   1187: aconst_null
    //   1188: aconst_null
    //   1189: aconst_null
    //   1190: ldc_w 2087423
    //   1193: invokestatic a : (Lcy1;Ljava/util/List;FFFLi51;FLbp1;Lbp1;Lbp1;Lbp1;Lin/krosbits/nativex/Cn;Lcd1;Ljava/util/List;Li51;Ljava/lang/String;Ljava/lang/String;Landroid/util/Size;Landroid/graphics/Bitmap;I)Lcy1;
    //   1196: invokevirtual e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1199: ifeq -> 1159
    //   1202: aload #14
    //   1204: astore_1
    //   1205: aload_1
    //   1206: areturn
    //   1207: astore_1
    //   1208: goto -> 1221
    //   1211: aload_1
    //   1212: astore #12
    //   1214: aload #10
    //   1216: astore #13
    //   1218: aload #11
    //   1220: athrow
    //   1221: aload #13
    //   1223: ifnull -> 1231
    //   1226: aload #13
    //   1228: invokevirtual close : ()V
    //   1231: aload #12
    //   1233: ifnull -> 1241
    //   1236: aload #12
    //   1238: invokevirtual close : ()V
    //   1241: aload #16
    //   1243: invokevirtual f : ()Ljava/lang/Object;
    //   1246: astore #10
    //   1248: aload #16
    //   1250: aload #10
    //   1252: aload #10
    //   1254: checkcast cy1
    //   1257: aconst_null
    //   1258: fconst_0
    //   1259: fconst_0
    //   1260: fconst_0
    //   1261: aconst_null
    //   1262: fconst_0
    //   1263: aconst_null
    //   1264: aconst_null
    //   1265: aconst_null
    //   1266: aconst_null
    //   1267: aconst_null
    //   1268: aconst_null
    //   1269: aconst_null
    //   1270: aconst_null
    //   1271: aconst_null
    //   1272: aconst_null
    //   1273: aconst_null
    //   1274: aconst_null
    //   1275: ldc_w 2087423
    //   1278: invokestatic a : (Lcy1;Ljava/util/List;FFFLi51;FLbp1;Lbp1;Lbp1;Lbp1;Lin/krosbits/nativex/Cn;Lcd1;Ljava/util/List;Li51;Ljava/lang/String;Ljava/lang/String;Landroid/util/Size;Landroid/graphics/Bitmap;I)Lcy1;
    //   1281: invokevirtual e : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   1284: ifne -> 1290
    //   1287: goto -> 1241
    //   1290: aload_1
    //   1291: athrow
    //   1292: aload #10
    //   1294: checkcast x80
    //   1297: astore #17
    //   1299: aload #12
    //   1301: checkcast d72
    //   1304: astore #19
    //   1306: getstatic dd1.g : Lf1;
    //   1309: astore #18
    //   1311: aload_0
    //   1312: getfield j : I
    //   1315: istore_2
    //   1316: iload_2
    //   1317: ifeq -> 1521
    //   1320: iload_2
    //   1321: iconst_1
    //   1322: if_icmpeq -> 1459
    //   1325: iload_2
    //   1326: iconst_2
    //   1327: if_icmpeq -> 1402
    //   1330: iload_2
    //   1331: iconst_3
    //   1332: if_icmpne -> 1392
    //   1335: aload_0
    //   1336: getfield i : I
    //   1339: istore #4
    //   1341: aload_0
    //   1342: getfield h : I
    //   1345: istore_2
    //   1346: aload_0
    //   1347: getfield m : Ljava/lang/Object;
    //   1350: checkcast [B
    //   1353: astore #12
    //   1355: aload_0
    //   1356: getfield l : Ljava/lang/Object;
    //   1359: checkcast dk
    //   1362: astore #11
    //   1364: aload_0
    //   1365: getfield k : Ljava/lang/Object;
    //   1368: checkcast [Ljava/lang/Object;
    //   1371: astore #10
    //   1373: aload_1
    //   1374: invokestatic r0 : (Ljava/lang/Object;)V
    //   1377: aconst_null
    //   1378: astore #13
    //   1380: iconst_1
    //   1381: istore_3
    //   1382: aload #12
    //   1384: astore_1
    //   1385: aload #13
    //   1387: astore #12
    //   1389: goto -> 1647
    //   1392: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   1394: invokestatic f : (Ljava/lang/String;)V
    //   1397: aconst_null
    //   1398: astore_1
    //   1399: goto -> 1943
    //   1402: aload_0
    //   1403: getfield i : I
    //   1406: istore #4
    //   1408: aload_0
    //   1409: getfield h : I
    //   1412: istore_2
    //   1413: aload_0
    //   1414: getfield m : Ljava/lang/Object;
    //   1417: checkcast [B
    //   1420: astore #12
    //   1422: aload_0
    //   1423: getfield l : Ljava/lang/Object;
    //   1426: checkcast dk
    //   1429: astore #11
    //   1431: aload_0
    //   1432: getfield k : Ljava/lang/Object;
    //   1435: checkcast [Ljava/lang/Object;
    //   1438: astore #10
    //   1440: aload_1
    //   1441: invokestatic r0 : (Ljava/lang/Object;)V
    //   1444: aconst_null
    //   1445: astore #13
    //   1447: iconst_1
    //   1448: istore_3
    //   1449: aload #12
    //   1451: astore_1
    //   1452: aload #13
    //   1454: astore #12
    //   1456: goto -> 1647
    //   1459: aload_0
    //   1460: getfield i : I
    //   1463: istore #4
    //   1465: aload_0
    //   1466: getfield h : I
    //   1469: istore_2
    //   1470: aload_0
    //   1471: getfield m : Ljava/lang/Object;
    //   1474: checkcast [B
    //   1477: astore #13
    //   1479: aload_0
    //   1480: getfield l : Ljava/lang/Object;
    //   1483: checkcast dk
    //   1486: astore #11
    //   1488: aload_0
    //   1489: getfield k : Ljava/lang/Object;
    //   1492: checkcast [Ljava/lang/Object;
    //   1495: astore #10
    //   1497: aload_1
    //   1498: invokestatic r0 : (Ljava/lang/Object;)V
    //   1501: aload_1
    //   1502: checkcast jk
    //   1505: getfield a : Ljava/lang/Object;
    //   1508: astore #12
    //   1510: aload #10
    //   1512: astore_1
    //   1513: aconst_null
    //   1514: astore #10
    //   1516: iconst_1
    //   1517: istore_3
    //   1518: goto -> 1721
    //   1521: aload_1
    //   1522: invokestatic r0 : (Ljava/lang/Object;)V
    //   1525: aload_0
    //   1526: getfield k : Ljava/lang/Object;
    //   1529: checkcast xs
    //   1532: astore #13
    //   1534: aload_0
    //   1535: getfield n : Ljava/lang/Object;
    //   1538: checkcast [Lw80;
    //   1541: arraylength
    //   1542: istore #5
    //   1544: iload #5
    //   1546: ifne -> 1552
    //   1549: goto -> 1755
    //   1552: iload #5
    //   1554: anewarray java/lang/Object
    //   1557: astore #10
    //   1559: aload #10
    //   1561: iconst_0
    //   1562: iload #5
    //   1564: aload #18
    //   1566: invokestatic fill : ([Ljava/lang/Object;IILjava/lang/Object;)V
    //   1569: aconst_null
    //   1570: astore #12
    //   1572: iload #5
    //   1574: aconst_null
    //   1575: bipush #6
    //   1577: invokestatic a : (ILhh;I)Llh;
    //   1580: astore #11
    //   1582: new java/util/concurrent/atomic/AtomicInteger
    //   1585: dup
    //   1586: iload #5
    //   1588: invokespecial <init> : (I)V
    //   1591: astore_1
    //   1592: iconst_0
    //   1593: istore_2
    //   1594: iload_2
    //   1595: iload #5
    //   1597: if_icmpge -> 1634
    //   1600: aload #13
    //   1602: aconst_null
    //   1603: aconst_null
    //   1604: new mn
    //   1607: dup
    //   1608: aload_0
    //   1609: getfield n : Ljava/lang/Object;
    //   1612: checkcast [Lw80;
    //   1615: iload_2
    //   1616: aload_1
    //   1617: aload #11
    //   1619: aconst_null
    //   1620: invokespecial <init> : ([Lw80;ILjava/util/concurrent/atomic/AtomicInteger;Llh;Lcs;)V
    //   1623: iconst_3
    //   1624: invokestatic L : (Lxs;Los;Lat;Lad0;I)Lbp1;
    //   1627: pop
    //   1628: iinc #2, 1
    //   1631: goto -> 1594
    //   1634: iload #5
    //   1636: newarray byte
    //   1638: astore_1
    //   1639: iconst_1
    //   1640: istore_3
    //   1641: iconst_0
    //   1642: istore #4
    //   1644: iload #5
    //   1646: istore_2
    //   1647: iload #4
    //   1649: iload_3
    //   1650: iadd
    //   1651: i2b
    //   1652: istore #4
    //   1654: aload_0
    //   1655: aload #10
    //   1657: putfield k : Ljava/lang/Object;
    //   1660: aload_0
    //   1661: aload #11
    //   1663: putfield l : Ljava/lang/Object;
    //   1666: aload_0
    //   1667: aload_1
    //   1668: putfield m : Ljava/lang/Object;
    //   1671: aload_0
    //   1672: iload_2
    //   1673: putfield h : I
    //   1676: aload_0
    //   1677: iload #4
    //   1679: putfield i : I
    //   1682: aload_0
    //   1683: iload_3
    //   1684: putfield j : I
    //   1687: aload #11
    //   1689: aload_0
    //   1690: invokeinterface p : (Lnn;)Ljava/lang/Object;
    //   1695: astore #16
    //   1697: aload #16
    //   1699: aload #15
    //   1701: if_acmpne -> 1707
    //   1704: goto -> 1940
    //   1707: aload_1
    //   1708: astore #13
    //   1710: aload #10
    //   1712: astore_1
    //   1713: aload #12
    //   1715: astore #10
    //   1717: aload #16
    //   1719: astore #12
    //   1721: aload #12
    //   1723: instanceof ik
    //   1726: ifne -> 1732
    //   1729: goto -> 1736
    //   1732: aload #10
    //   1734: astore #12
    //   1736: aload #12
    //   1738: checkcast th0
    //   1741: astore #16
    //   1743: iload_2
    //   1744: istore #5
    //   1746: aload #16
    //   1748: astore #12
    //   1750: aload #16
    //   1752: ifnonnull -> 1761
    //   1755: aload #14
    //   1757: astore_1
    //   1758: goto -> 1943
    //   1761: aload #12
    //   1763: getfield a : I
    //   1766: istore #6
    //   1768: aload_1
    //   1769: iload #6
    //   1771: aaload
    //   1772: astore #16
    //   1774: aload_1
    //   1775: iload #6
    //   1777: aload #12
    //   1779: getfield b : Ljava/lang/Object;
    //   1782: aastore
    //   1783: iload #5
    //   1785: istore_2
    //   1786: aload #16
    //   1788: aload #18
    //   1790: if_acmpne -> 1798
    //   1793: iload #5
    //   1795: iconst_1
    //   1796: isub
    //   1797: istore_2
    //   1798: aload #13
    //   1800: iload #6
    //   1802: baload
    //   1803: iload #4
    //   1805: if_icmpeq -> 1859
    //   1808: aload #13
    //   1810: iload #6
    //   1812: iload #4
    //   1814: i2b
    //   1815: bastore
    //   1816: aload #11
    //   1818: invokeinterface m : ()Ljava/lang/Object;
    //   1823: astore #12
    //   1825: aload #12
    //   1827: instanceof ik
    //   1830: ifne -> 1836
    //   1833: goto -> 1840
    //   1836: aload #10
    //   1838: astore #12
    //   1840: aload #12
    //   1842: checkcast th0
    //   1845: astore #16
    //   1847: iload_2
    //   1848: istore #5
    //   1850: aload #16
    //   1852: astore #12
    //   1854: aload #16
    //   1856: ifnonnull -> 1761
    //   1859: iload_2
    //   1860: ifne -> 1945
    //   1863: aload_0
    //   1864: getfield o : Ljava/lang/Object;
    //   1867: checkcast tx1
    //   1870: getfield c : Ljava/lang/Object;
    //   1873: checkcast [Lw80;
    //   1876: arraylength
    //   1877: anewarray lr
    //   1880: astore #12
    //   1882: iconst_0
    //   1883: iconst_0
    //   1884: bipush #14
    //   1886: aload_1
    //   1887: aload #12
    //   1889: invokestatic G0 : (III[Ljava/lang/Object;[Ljava/lang/Object;)V
    //   1892: aload_0
    //   1893: aload_1
    //   1894: putfield k : Ljava/lang/Object;
    //   1897: aload_0
    //   1898: aload #11
    //   1900: putfield l : Ljava/lang/Object;
    //   1903: aload_0
    //   1904: aload #13
    //   1906: putfield m : Ljava/lang/Object;
    //   1909: aload_0
    //   1910: iload_2
    //   1911: putfield h : I
    //   1914: aload_0
    //   1915: iload #4
    //   1917: putfield i : I
    //   1920: aload_0
    //   1921: iconst_3
    //   1922: putfield j : I
    //   1925: aload #19
    //   1927: aload #17
    //   1929: aload #12
    //   1931: aload_0
    //   1932: invokevirtual c : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1935: aload #15
    //   1937: if_acmpne -> 1945
    //   1940: aload #15
    //   1942: astore_1
    //   1943: aload_1
    //   1944: areturn
    //   1945: aload #13
    //   1947: astore #12
    //   1949: aload_1
    //   1950: astore #13
    //   1952: aload #12
    //   1954: astore_1
    //   1955: aload #10
    //   1957: astore #12
    //   1959: aload #13
    //   1961: astore #10
    //   1963: goto -> 1647
    //   1966: astore_1
    //   1967: goto -> 235
    //   1970: astore #13
    //   1972: goto -> 756
    //   1975: astore_1
    //   1976: goto -> 1017
    //   1979: astore_1
    //   1980: goto -> 1159
    //   1983: astore #10
    //   1985: goto -> 1241
    // Exception table:
    //   from	to	target	type
    //   137	141	163	java/util/concurrent/CancellationException
    //   137	141	151	finally
    //   231	235	1966	java/util/concurrent/CancellationException
    //   231	235	245	finally
    //   568	582	1124	java/util/concurrent/CancellationException
    //   568	582	1119	finally
    //   582	591	1093	java/util/concurrent/CancellationException
    //   582	591	1083	finally
    //   591	674	1078	java/util/concurrent/CancellationException
    //   591	674	1073	finally
    //   674	704	1068	java/util/concurrent/CancellationException
    //   674	704	1063	finally
    //   704	751	1068	java/util/concurrent/CancellationException
    //   704	751	1063	finally
    //   756	772	909	java/util/concurrent/CancellationException
    //   756	772	889	finally
    //   772	822	909	java/util/concurrent/CancellationException
    //   772	822	889	finally
    //   827	865	904	java/util/concurrent/CancellationException
    //   827	865	889	finally
    //   865	879	1970	java/util/concurrent/CancellationException
    //   865	879	889	finally
    //   924	937	909	java/util/concurrent/CancellationException
    //   924	937	889	finally
    //   937	986	909	java/util/concurrent/CancellationException
    //   937	986	889	finally
    //   1003	1007	1975	finally
    //   1012	1017	1975	finally
    //   1136	1141	1207	finally
    //   1146	1151	1979	finally
    //   1155	1159	1979	finally
    //   1218	1221	1207	finally
    //   1226	1231	1983	finally
    //   1236	1241	1983	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */