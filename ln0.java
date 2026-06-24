import java.util.Arrays;

public final class ln0 {
  public static boolean q = false;
  
  public int a = 1000;
  
  public boolean b = false;
  
  public int c = 0;
  
  public final ha1 d;
  
  public int e = 32;
  
  public int f = 32;
  
  public c9[] g = new c9[32];
  
  public boolean h = false;
  
  public boolean[] i = new boolean[32];
  
  public int j = 1;
  
  public int k = 0;
  
  public int l = 32;
  
  public final zv0 m;
  
  public pn1[] n = new pn1[1000];
  
  public int o = 0;
  
  public c9 p;
  
  public ln0() {
    s();
    zv0 zv01 = new zv0(3);
    zv01.c = new z81();
    zv01.e = new z81();
    zv01.f = new pn1[32];
    this.m = zv01;
    c9 c91 = new c9(zv01);
    ((ha1)c91).f = new pn1[128];
    ((ha1)c91).g = new pn1[128];
    ((ha1)c91).h = 0;
    ((ha1)c91).i = new j01((ha1)c91);
    this.d = (ha1)c91;
    this.p = new c9(zv01);
  }
  
  public static int n(Object paramObject) {
    paramObject = ((bq)paramObject).i;
    return (paramObject != null) ? (int)(((pn1)paramObject).g + 0.5F) : 0;
  }
  
  public final pn1 a(int paramInt) {
    z81 z81 = (z81)this.m.e;
    int i = z81.c;
    Object object = null;
    if (i > 0) {
      i--;
      Object[] arrayOfObject = z81.b;
      object = arrayOfObject[i];
      arrayOfObject[i] = null;
      z81.c = i;
    } 
    object = object;
    if (object == null) {
      object = new pn1(paramInt);
      ((pn1)object).n = paramInt;
    } else {
      object.c();
      ((pn1)object).n = paramInt;
    } 
    paramInt = this.o;
    i = this.a;
    if (paramInt >= i) {
      paramInt = i * 2;
      this.a = paramInt;
      this.n = Arrays.<pn1>copyOf(this.n, paramInt);
    } 
    pn1[] arrayOfPn1 = this.n;
    paramInt = this.o;
    this.o = paramInt + 1;
    arrayOfPn1[paramInt] = (pn1)object;
    return (pn1)object;
  }
  
  public final void b(pn1 parampn11, pn1 parampn12, int paramInt1, float paramFloat, pn1 parampn13, pn1 parampn14, int paramInt2, int paramInt3) {
    c9 c91 = l();
    if (parampn12 == parampn13) {
      c91.d.g(parampn11, 1.0F);
      c91.d.g(parampn14, 1.0F);
      c91.d.g(parampn12, -2.0F);
    } else {
      w8 w8 = c91.d;
      if (paramFloat == 0.5F) {
        w8.g(parampn11, 1.0F);
        c91.d.g(parampn12, -1.0F);
        c91.d.g(parampn13, -1.0F);
        c91.d.g(parampn14, 1.0F);
        if (paramInt1 > 0 || paramInt2 > 0)
          c91.b = (-paramInt1 + paramInt2); 
      } else if (paramFloat <= 0.0F) {
        w8.g(parampn11, -1.0F);
        c91.d.g(parampn12, 1.0F);
        c91.b = paramInt1;
      } else if (paramFloat >= 1.0F) {
        w8.g(parampn14, -1.0F);
        c91.d.g(parampn13, 1.0F);
        c91.b = -paramInt2;
      } else {
        float f = 1.0F - paramFloat;
        w8.g(parampn11, f * 1.0F);
        c91.d.g(parampn12, f * -1.0F);
        c91.d.g(parampn13, -1.0F * paramFloat);
        c91.d.g(parampn14, 1.0F * paramFloat);
        if (paramInt1 > 0 || paramInt2 > 0) {
          float f1 = -paramInt1;
          c91.b = paramInt2 * paramFloat + f1 * f;
        } 
      } 
    } 
    if (paramInt3 != 8)
      c91.a(this, paramInt3); 
    c(c91);
  }
  
  public final void c(c9 paramc9) {
    // Byte code:
    //   0: aload_0
    //   1: getfield k : I
    //   4: iconst_1
    //   5: iadd
    //   6: aload_0
    //   7: getfield l : I
    //   10: if_icmpge -> 26
    //   13: aload_0
    //   14: getfield j : I
    //   17: iconst_1
    //   18: iadd
    //   19: aload_0
    //   20: getfield f : I
    //   23: if_icmplt -> 30
    //   26: aload_0
    //   27: invokevirtual o : ()V
    //   30: aload_1
    //   31: getfield e : Z
    //   34: ifne -> 1116
    //   37: aload_1
    //   38: getfield c : Ljava/util/ArrayList;
    //   41: astore #14
    //   43: aload_0
    //   44: getfield g : [Lc9;
    //   47: arraylength
    //   48: ifne -> 54
    //   51: goto -> 242
    //   54: iconst_0
    //   55: istore #8
    //   57: iload #8
    //   59: ifne -> 215
    //   62: aload_1
    //   63: getfield d : Lw8;
    //   66: invokevirtual d : ()I
    //   69: istore #10
    //   71: iconst_0
    //   72: istore #9
    //   74: iload #9
    //   76: iload #10
    //   78: if_icmpge -> 126
    //   81: aload_1
    //   82: getfield d : Lw8;
    //   85: iload #9
    //   87: invokevirtual e : (I)Lpn1;
    //   90: astore #15
    //   92: aload #15
    //   94: getfield e : I
    //   97: iconst_m1
    //   98: if_icmpne -> 112
    //   101: aload #15
    //   103: getfield h : Z
    //   106: ifne -> 112
    //   109: goto -> 120
    //   112: aload #14
    //   114: aload #15
    //   116: invokevirtual add : (Ljava/lang/Object;)Z
    //   119: pop
    //   120: iinc #9, 1
    //   123: goto -> 74
    //   126: aload #14
    //   128: invokevirtual size : ()I
    //   131: istore #10
    //   133: iload #10
    //   135: ifle -> 209
    //   138: iconst_0
    //   139: istore #9
    //   141: iload #9
    //   143: iload #10
    //   145: if_icmpge -> 201
    //   148: aload #14
    //   150: iload #9
    //   152: invokevirtual get : (I)Ljava/lang/Object;
    //   155: checkcast pn1
    //   158: astore #15
    //   160: aload #15
    //   162: getfield h : Z
    //   165: ifeq -> 179
    //   168: aload_1
    //   169: aload_0
    //   170: aload #15
    //   172: iconst_1
    //   173: invokevirtual h : (Lln0;Lpn1;Z)V
    //   176: goto -> 195
    //   179: aload_1
    //   180: aload_0
    //   181: aload_0
    //   182: getfield g : [Lc9;
    //   185: aload #15
    //   187: getfield e : I
    //   190: aaload
    //   191: iconst_1
    //   192: invokevirtual i : (Lln0;Lc9;Z)V
    //   195: iinc #9, 1
    //   198: goto -> 141
    //   201: aload #14
    //   203: invokevirtual clear : ()V
    //   206: goto -> 57
    //   209: iconst_1
    //   210: istore #8
    //   212: goto -> 57
    //   215: aload_1
    //   216: getfield a : Lpn1;
    //   219: ifnull -> 242
    //   222: aload_1
    //   223: getfield d : Lw8;
    //   226: invokevirtual d : ()I
    //   229: ifne -> 242
    //   232: aload_1
    //   233: iconst_1
    //   234: putfield e : Z
    //   237: aload_0
    //   238: iconst_1
    //   239: putfield b : Z
    //   242: aload_1
    //   243: invokevirtual e : ()Z
    //   246: ifeq -> 252
    //   249: goto -> 1129
    //   252: aload_1
    //   253: getfield b : F
    //   256: fstore_2
    //   257: fconst_0
    //   258: fstore_3
    //   259: fload_2
    //   260: fconst_0
    //   261: fcmpg
    //   262: ifge -> 341
    //   265: aload_1
    //   266: fload_2
    //   267: ldc -1.0
    //   269: fmul
    //   270: putfield b : F
    //   273: aload_1
    //   274: getfield d : Lw8;
    //   277: astore #14
    //   279: aload #14
    //   281: getfield h : I
    //   284: istore #9
    //   286: iconst_0
    //   287: istore #8
    //   289: iload #9
    //   291: iconst_m1
    //   292: if_icmpeq -> 341
    //   295: iload #8
    //   297: aload #14
    //   299: getfield a : I
    //   302: if_icmpge -> 341
    //   305: aload #14
    //   307: getfield g : [F
    //   310: astore #15
    //   312: aload #15
    //   314: iload #9
    //   316: aload #15
    //   318: iload #9
    //   320: faload
    //   321: ldc -1.0
    //   323: fmul
    //   324: fastore
    //   325: aload #14
    //   327: getfield f : [I
    //   330: iload #9
    //   332: iaload
    //   333: istore #9
    //   335: iinc #8, 1
    //   338: goto -> 289
    //   341: aload_1
    //   342: getfield d : Lw8;
    //   345: invokevirtual d : ()I
    //   348: istore #13
    //   350: fconst_0
    //   351: fstore #5
    //   353: fconst_0
    //   354: fstore_2
    //   355: aconst_null
    //   356: astore #15
    //   358: aconst_null
    //   359: astore #14
    //   361: iconst_0
    //   362: istore #9
    //   364: iconst_0
    //   365: istore #11
    //   367: iconst_0
    //   368: istore #10
    //   370: iload #9
    //   372: iload #13
    //   374: if_icmpge -> 755
    //   377: aload_1
    //   378: getfield d : Lw8;
    //   381: iload #9
    //   383: invokevirtual f : (I)F
    //   386: fstore #7
    //   388: aload_1
    //   389: getfield d : Lw8;
    //   392: iload #9
    //   394: invokevirtual e : (I)Lpn1;
    //   397: astore #17
    //   399: aload #17
    //   401: getfield n : I
    //   404: iconst_1
    //   405: if_icmpne -> 540
    //   408: aload #15
    //   410: ifnonnull -> 454
    //   413: aload #17
    //   415: getfield m : I
    //   418: iconst_1
    //   419: if_icmpgt -> 425
    //   422: goto -> 534
    //   425: iconst_0
    //   426: istore #8
    //   428: aload #17
    //   430: astore #16
    //   432: fload #7
    //   434: fstore #4
    //   436: aload #14
    //   438: astore #18
    //   440: iload #8
    //   442: istore #12
    //   444: fload_2
    //   445: fstore #6
    //   447: iload #10
    //   449: istore #8
    //   451: goto -> 726
    //   454: fload #5
    //   456: fload #7
    //   458: fcmpl
    //   459: ifle -> 474
    //   462: aload #17
    //   464: getfield m : I
    //   467: iconst_1
    //   468: if_icmpgt -> 425
    //   471: goto -> 534
    //   474: aload #15
    //   476: astore #16
    //   478: aload #14
    //   480: astore #18
    //   482: fload #5
    //   484: fstore #4
    //   486: iload #11
    //   488: istore #12
    //   490: fload_2
    //   491: fstore #6
    //   493: iload #10
    //   495: istore #8
    //   497: iload #11
    //   499: ifne -> 726
    //   502: aload #15
    //   504: astore #16
    //   506: aload #14
    //   508: astore #18
    //   510: fload #5
    //   512: fstore #4
    //   514: iload #11
    //   516: istore #12
    //   518: fload_2
    //   519: fstore #6
    //   521: iload #10
    //   523: istore #8
    //   525: aload #17
    //   527: getfield m : I
    //   530: iconst_1
    //   531: if_icmpgt -> 726
    //   534: iconst_1
    //   535: istore #8
    //   537: goto -> 428
    //   540: aload #15
    //   542: astore #16
    //   544: aload #14
    //   546: astore #18
    //   548: fload #5
    //   550: fstore #4
    //   552: iload #11
    //   554: istore #12
    //   556: fload_2
    //   557: fstore #6
    //   559: iload #10
    //   561: istore #8
    //   563: aload #15
    //   565: ifnonnull -> 726
    //   568: aload #15
    //   570: astore #16
    //   572: aload #14
    //   574: astore #18
    //   576: fload #5
    //   578: fstore #4
    //   580: iload #11
    //   582: istore #12
    //   584: fload_2
    //   585: fstore #6
    //   587: iload #10
    //   589: istore #8
    //   591: fload #7
    //   593: fload_3
    //   594: fcmpg
    //   595: ifge -> 726
    //   598: aload #14
    //   600: ifnonnull -> 641
    //   603: aload #17
    //   605: getfield m : I
    //   608: iconst_1
    //   609: if_icmpgt -> 615
    //   612: goto -> 720
    //   615: iconst_0
    //   616: istore #8
    //   618: fload #7
    //   620: fstore #6
    //   622: aload #15
    //   624: astore #16
    //   626: aload #17
    //   628: astore #18
    //   630: fload #5
    //   632: fstore #4
    //   634: iload #11
    //   636: istore #12
    //   638: goto -> 726
    //   641: fload_2
    //   642: fload #7
    //   644: fcmpl
    //   645: ifle -> 660
    //   648: aload #17
    //   650: getfield m : I
    //   653: iconst_1
    //   654: if_icmpgt -> 615
    //   657: goto -> 720
    //   660: aload #15
    //   662: astore #16
    //   664: aload #14
    //   666: astore #18
    //   668: fload #5
    //   670: fstore #4
    //   672: iload #11
    //   674: istore #12
    //   676: fload_2
    //   677: fstore #6
    //   679: iload #10
    //   681: istore #8
    //   683: iload #10
    //   685: ifne -> 726
    //   688: aload #15
    //   690: astore #16
    //   692: aload #14
    //   694: astore #18
    //   696: fload #5
    //   698: fstore #4
    //   700: iload #11
    //   702: istore #12
    //   704: fload_2
    //   705: fstore #6
    //   707: iload #10
    //   709: istore #8
    //   711: aload #17
    //   713: getfield m : I
    //   716: iconst_1
    //   717: if_icmpgt -> 726
    //   720: iconst_1
    //   721: istore #8
    //   723: goto -> 618
    //   726: iinc #9, 1
    //   729: aload #16
    //   731: astore #15
    //   733: aload #18
    //   735: astore #14
    //   737: fload #4
    //   739: fstore #5
    //   741: iload #12
    //   743: istore #11
    //   745: fload #6
    //   747: fstore_2
    //   748: iload #8
    //   750: istore #10
    //   752: goto -> 370
    //   755: aload #15
    //   757: ifnull -> 763
    //   760: goto -> 767
    //   763: aload #14
    //   765: astore #15
    //   767: aload #15
    //   769: ifnonnull -> 778
    //   772: iconst_1
    //   773: istore #8
    //   775: goto -> 787
    //   778: aload_1
    //   779: aload #15
    //   781: invokevirtual g : (Lpn1;)V
    //   784: iconst_0
    //   785: istore #8
    //   787: aload_1
    //   788: getfield d : Lw8;
    //   791: invokevirtual d : ()I
    //   794: ifne -> 802
    //   797: aload_1
    //   798: iconst_1
    //   799: putfield e : Z
    //   802: iload #8
    //   804: ifeq -> 1073
    //   807: aload_0
    //   808: getfield j : I
    //   811: iconst_1
    //   812: iadd
    //   813: aload_0
    //   814: getfield f : I
    //   817: if_icmplt -> 824
    //   820: aload_0
    //   821: invokevirtual o : ()V
    //   824: aload_0
    //   825: iconst_3
    //   826: invokevirtual a : (I)Lpn1;
    //   829: astore #15
    //   831: aload_0
    //   832: getfield c : I
    //   835: iconst_1
    //   836: iadd
    //   837: istore #8
    //   839: aload_0
    //   840: iload #8
    //   842: putfield c : I
    //   845: aload_0
    //   846: aload_0
    //   847: getfield j : I
    //   850: iconst_1
    //   851: iadd
    //   852: putfield j : I
    //   855: aload #15
    //   857: iload #8
    //   859: putfield c : I
    //   862: aload_0
    //   863: getfield m : Lzv0;
    //   866: astore #14
    //   868: aload #14
    //   870: getfield f : Ljava/lang/Object;
    //   873: checkcast [Lpn1;
    //   876: iload #8
    //   878: aload #15
    //   880: aastore
    //   881: aload_1
    //   882: aload #15
    //   884: putfield a : Lpn1;
    //   887: aload_0
    //   888: getfield k : I
    //   891: istore #8
    //   893: aload_0
    //   894: aload_1
    //   895: invokevirtual h : (Lc9;)V
    //   898: aload_0
    //   899: getfield k : I
    //   902: iload #8
    //   904: iconst_1
    //   905: iadd
    //   906: if_icmpne -> 1073
    //   909: aload_0
    //   910: getfield p : Lc9;
    //   913: astore #17
    //   915: aload #17
    //   917: aconst_null
    //   918: putfield a : Lpn1;
    //   921: aload #17
    //   923: getfield d : Lw8;
    //   926: invokevirtual b : ()V
    //   929: iconst_0
    //   930: istore #8
    //   932: iload #8
    //   934: aload_1
    //   935: getfield d : Lw8;
    //   938: invokevirtual d : ()I
    //   941: if_icmpge -> 983
    //   944: aload_1
    //   945: getfield d : Lw8;
    //   948: iload #8
    //   950: invokevirtual e : (I)Lpn1;
    //   953: astore #16
    //   955: aload_1
    //   956: getfield d : Lw8;
    //   959: iload #8
    //   961: invokevirtual f : (I)F
    //   964: fstore_2
    //   965: aload #17
    //   967: getfield d : Lw8;
    //   970: aload #16
    //   972: fload_2
    //   973: iconst_1
    //   974: invokevirtual a : (Lpn1;FZ)V
    //   977: iinc #8, 1
    //   980: goto -> 932
    //   983: aload_0
    //   984: aload_0
    //   985: getfield p : Lc9;
    //   988: invokevirtual r : (Lc9;)V
    //   991: aload #15
    //   993: getfield e : I
    //   996: iconst_m1
    //   997: if_icmpne -> 1067
    //   1000: aload_1
    //   1001: getfield a : Lpn1;
    //   1004: aload #15
    //   1006: if_acmpne -> 1029
    //   1009: aload_1
    //   1010: aconst_null
    //   1011: aload #15
    //   1013: invokevirtual f : ([ZLpn1;)Lpn1;
    //   1016: astore #15
    //   1018: aload #15
    //   1020: ifnull -> 1029
    //   1023: aload_1
    //   1024: aload #15
    //   1026: invokevirtual g : (Lpn1;)V
    //   1029: aload_1
    //   1030: getfield e : Z
    //   1033: ifne -> 1045
    //   1036: aload_1
    //   1037: getfield a : Lpn1;
    //   1040: aload_0
    //   1041: aload_1
    //   1042: invokevirtual e : (Lln0;Lc9;)V
    //   1045: aload #14
    //   1047: getfield c : Ljava/lang/Object;
    //   1050: checkcast z81
    //   1053: aload_1
    //   1054: invokevirtual c : (Lc9;)V
    //   1057: aload_0
    //   1058: aload_0
    //   1059: getfield k : I
    //   1062: iconst_1
    //   1063: isub
    //   1064: putfield k : I
    //   1067: iconst_1
    //   1068: istore #8
    //   1070: goto -> 1076
    //   1073: iconst_0
    //   1074: istore #8
    //   1076: aload_1
    //   1077: getfield a : Lpn1;
    //   1080: astore #14
    //   1082: aload #14
    //   1084: ifnull -> 1129
    //   1087: iload #8
    //   1089: istore #9
    //   1091: aload #14
    //   1093: getfield n : I
    //   1096: iconst_1
    //   1097: if_icmpeq -> 1119
    //   1100: aload_1
    //   1101: getfield b : F
    //   1104: fload_3
    //   1105: fcmpg
    //   1106: iflt -> 1129
    //   1109: iload #8
    //   1111: istore #9
    //   1113: goto -> 1119
    //   1116: iconst_0
    //   1117: istore #9
    //   1119: iload #9
    //   1121: ifne -> 1129
    //   1124: aload_0
    //   1125: aload_1
    //   1126: invokevirtual h : (Lc9;)V
    //   1129: return
  }
  
  public final void d(pn1 parampn1, int paramInt) {
    int i = parampn1.e;
    if (i == -1) {
      parampn1.d(this, paramInt);
      for (paramInt = 0; paramInt < this.c + 1; paramInt++)
        parampn1 = ((pn1[])this.m.f)[paramInt]; 
      return;
    } 
    if (i != -1) {
      c9 c92 = this.g[i];
      if (c92.e) {
        c92.b = paramInt;
        return;
      } 
      if (c92.d.d() == 0) {
        c92.e = true;
        c92.b = paramInt;
        return;
      } 
      c92 = l();
      if (paramInt < 0) {
        c92.b = (paramInt * -1);
        c92.d.g(parampn1, 1.0F);
      } else {
        c92.b = paramInt;
        c92.d.g(parampn1, -1.0F);
      } 
      c(c92);
      return;
    } 
    c9 c91 = l();
    c91.a = parampn1;
    float f = paramInt;
    parampn1.g = f;
    c91.b = f;
    c91.e = true;
    c(c91);
  }
  
  public final void e(pn1 parampn11, pn1 parampn12, int paramInt1, int paramInt2) {
    if (paramInt2 == 8 && parampn12.h && parampn11.e == -1) {
      parampn11.d(this, parampn12.g + paramInt1);
      return;
    } 
    c9 c91 = l();
    int i = 0;
    int j = 0;
    if (paramInt1 != 0) {
      i = j;
      j = paramInt1;
      if (paramInt1 < 0) {
        j = paramInt1 * -1;
        i = 1;
      } 
      c91.b = j;
    } 
    w8 w8 = c91.d;
    if (i == 0) {
      w8.g(parampn11, -1.0F);
      c91.d.g(parampn12, 1.0F);
    } else {
      w8.g(parampn11, 1.0F);
      c91.d.g(parampn12, -1.0F);
    } 
    if (paramInt2 != 8)
      c91.a(this, paramInt2); 
    c(c91);
  }
  
  public final void f(pn1 parampn11, pn1 parampn12, int paramInt1, int paramInt2) {
    c9 c91 = l();
    pn1 pn11 = m();
    pn11.f = 0;
    c91.b(parampn11, parampn12, pn11, paramInt1);
    if (paramInt2 != 8) {
      paramInt1 = (int)(c91.d.c(pn11) * -1.0F);
      parampn11 = j(paramInt2);
      c91.d.g(parampn11, paramInt1);
    } 
    c(c91);
  }
  
  public final void g(pn1 parampn11, pn1 parampn12, int paramInt1, int paramInt2) {
    c9 c91 = l();
    pn1 pn11 = m();
    pn11.f = 0;
    c91.c(parampn11, parampn12, pn11, paramInt1);
    if (paramInt2 != 8) {
      paramInt1 = (int)(c91.d.c(pn11) * -1.0F);
      parampn11 = j(paramInt2);
      c91.d.g(parampn11, paramInt1);
    } 
    c(c91);
  }
  
  public final void h(c9 paramc9) {
    if (paramc9.e) {
      paramc9.a.d(this, paramc9.b);
    } else {
      c9[] arrayOfC9 = this.g;
      int i = this.k;
      arrayOfC9[i] = paramc9;
      pn1 pn11 = paramc9.a;
      pn11.e = i;
      this.k = i + 1;
      pn11.e(this, paramc9);
    } 
    if (this.b) {
      for (int i = 0; i < this.k; i = j + 1) {
        if (this.g[i] == null)
          System.out.println("WTF"); 
        paramc9 = this.g[i];
        int j = i;
        if (paramc9 != null) {
          j = i;
          if (paramc9.e) {
            paramc9.a.d(this, paramc9.b);
            ((z81)this.m.c).c(paramc9);
            this.g[i] = null;
            j = i + 1;
            int k = j;
            while (true) {
              int m = this.k;
              if (j < m) {
                c9[] arrayOfC9 = this.g;
                k = j - 1;
                paramc9 = arrayOfC9[j];
                arrayOfC9[k] = paramc9;
                pn1 pn11 = paramc9.a;
                if (pn11.e == j)
                  pn11.e = k; 
                k = j;
                j++;
                continue;
              } 
              if (k < m)
                this.g[k] = null; 
              this.k = m - 1;
              j = i - 1;
              break;
            } 
          } 
        } 
      } 
      this.b = false;
    } 
  }
  
  public final void i() {
    for (byte b = 0; b < this.k; b++) {
      c9 c91 = this.g[b];
      c91.a.g = c91.b;
    } 
  }
  
  public final pn1 j(int paramInt) {
    if (this.j + 1 >= this.f)
      o(); 
    pn1 pn11 = a(4);
    float[] arrayOfFloat = pn11.j;
    int i = this.c + 1;
    this.c = i;
    this.j++;
    pn11.c = i;
    pn11.f = paramInt;
    ((pn1[])this.m.f)[i] = pn11;
    ha1 ha11 = this.d;
    ha11.i.c = pn11;
    Arrays.fill(arrayOfFloat, 0.0F);
    arrayOfFloat[pn11.f] = 1.0F;
    ha11.j(pn11);
    return pn11;
  }
  
  public final pn1 k(Object paramObject) {
    if (paramObject != null) {
      if (this.j + 1 >= this.f)
        o(); 
      if (paramObject instanceof bq) {
        bq bq = (bq)paramObject;
        pn1 pn11 = bq.i;
        paramObject = pn11;
        if (pn11 == null) {
          bq.h();
          paramObject = bq.i;
        } 
        int i = ((pn1)paramObject).c;
        zv0 zv01 = this.m;
        if (i == -1 || i > this.c || ((pn1[])zv01.f)[i] == null) {
          if (i != -1)
            paramObject.c(); 
          i = this.c + 1;
          this.c = i;
          this.j++;
          ((pn1)paramObject).c = i;
          ((pn1)paramObject).n = 1;
          ((pn1[])zv01.f)[i] = (pn1)paramObject;
          return (pn1)paramObject;
        } 
        return (pn1)paramObject;
      } 
    } 
    return null;
  }
  
  public final c9 l() {
    zv0 zv01 = this.m;
    z81 z81 = (z81)zv01.c;
    int i = z81.c;
    if (i > 0) {
      i--;
      Object[] arrayOfObject = z81.b;
      c91 = (c9)arrayOfObject[i];
      arrayOfObject[i] = null;
      z81.c = i;
    } else {
      c91 = null;
    } 
    c9 c91 = c91;
    if (c91 == null) {
      c91 = new c9(zv01);
    } else {
      c91.a = null;
      c91.d.b();
      c91.b = 0.0F;
      c91.e = false;
    } 
    return c91;
  }
  
  public final pn1 m() {
    if (this.j + 1 >= this.f)
      o(); 
    pn1 pn11 = a(3);
    int i = this.c + 1;
    this.c = i;
    this.j++;
    pn11.c = i;
    ((pn1[])this.m.f)[i] = pn11;
    return pn11;
  }
  
  public final void o() {
    int i = this.e * 2;
    this.e = i;
    this.g = Arrays.<c9>copyOf(this.g, i);
    zv0 zv01 = this.m;
    zv01.f = Arrays.<pn1>copyOf((pn1[])zv01.f, this.e);
    i = this.e;
    this.i = new boolean[i];
    this.f = i;
    this.l = i;
  }
  
  public final void p() {
    ha1 ha11 = this.d;
    if (ha11.e()) {
      i();
      return;
    } 
    if (this.h) {
      for (byte b = 0; b < this.k; b++) {
        if (!(this.g[b]).e) {
          q(ha11);
          return;
        } 
      } 
      i();
      return;
    } 
    q(ha11);
  }
  
  public final void q(ha1 paramha1) {
    for (int i = 0; i < this.k; i++) {
      c9 c91 = this.g[i];
      if (c91.a.n != 1 && c91.b < 0.0F) {
        boolean bool = false;
        for (i = 0; !bool; i = k) {
          Object object;
          int k = i + 1;
          float f = Float.MAX_VALUE;
          int j = -1;
          i = -1;
          byte b2 = 0;
          byte b1;
          for (b1 = 0; b2 < this.k; b1 = b) {
            float f1;
            Object object1;
            byte b;
            int m;
            c9 c92 = this.g[b2];
            if (c92.a.n == 1) {
              f1 = f;
              int n = j;
              m = i;
              b = b1;
            } else if (c92.e) {
              f1 = f;
              int n = j;
              m = i;
              b = b1;
            } else {
              f1 = f;
              int n = j;
              m = i;
              b = b1;
              if (c92.b < 0.0F) {
                Object object2;
                int i1 = c92.d.d();
                byte b3 = 0;
                while (true) {
                  f1 = f;
                  n = j;
                  Object object3 = object2;
                  b = b1;
                  if (b3 < i1) {
                    pn1 pn11 = c92.d.e(b3);
                    float f2 = c92.d.c(pn11);
                    if (f2 <= 0.0F) {
                      f1 = f;
                      int i2 = j;
                      Object object4 = object2;
                      b = b1;
                      continue;
                    } 
                    b = 0;
                    object1 = object2;
                    byte b4 = b;
                    while (true) {
                      f1 = f;
                      m = j;
                      Object object4 = object1;
                      b = b1;
                      b4++;
                      b1 = b;
                    } 
                    continue;
                  } 
                  break;
                  b3++;
                  f = f1;
                  j = m;
                  object2 = SYNTHETIC_LOCAL_VARIABLE_14;
                  b1 = b;
                } 
              } 
            } 
            b2++;
            f = f1;
            object = object1;
            i = m;
          } 
          if (object != -1) {
            c9 c92 = this.g[object];
            c92.a.e = -1;
            c92.g(((pn1[])this.m.f)[i]);
            pn1 pn11 = c92.a;
            pn11.e = object;
            pn11.e(this, c92);
          } else {
            bool = true;
          } 
          if (k > this.j / 2)
            bool = true; 
        } 
        break;
      } 
    } 
    r(paramha1);
    i();
  }
  
  public final void r(c9 paramc9) {
    int i;
    for (i = 0; i < this.j; i++)
      this.i[i] = false; 
    int j = 0;
    for (i = 0; !j; i = k) {
      int k = i + 1;
      if (k >= this.j * 2)
        break; 
      pn1 pn11 = paramc9.a;
      if (pn11 != null)
        this.i[pn11.c] = true; 
      pn11 = paramc9.d(this.i);
      if (pn11 != null) {
        boolean[] arrayOfBoolean = this.i;
        i = pn11.c;
        if (arrayOfBoolean[i])
          break; 
        arrayOfBoolean[i] = true;
      } 
      if (pn11 != null) {
        float f = Float.MAX_VALUE;
        i = 0;
        int m;
        label61: for (m = -1; i < this.k; m = n) {
          float f1;
          int n;
          c9 c91 = this.g[i];
          if (c91.a.n == 1) {
            f1 = f;
            n = m;
          } else if (c91.e) {
            f1 = f;
            n = m;
          } else {
            w8 w8 = c91.d;
            int i1 = w8.h;
            if (i1 != -1)
              for (byte b = 0; i1 != -1 && b < w8.a; b++) {
                if (w8.e[i1] == pn11.c) {
                  i1 = 1;
                  continue label61;
                } 
                i1 = w8.f[i1];
              }  
            i1 = 0;
            f1 = f;
            n = m;
            if (i1 != 0) {
              float f2 = c91.d.c(pn11);
              f1 = f;
              n = m;
              if (f2 < 0.0F) {
                f2 = -c91.b / f2;
                f1 = f;
                n = m;
                if (f2 < f) {
                  n = i;
                  f1 = f2;
                } 
              } 
            } 
          } 
          i++;
          f = f1;
        } 
        i = j;
        if (m > -1) {
          c9 c91 = this.g[m];
          c91.a.e = -1;
          c91.g(pn11);
          pn11 = c91.a;
          pn11.e = m;
          pn11.e(this, c91);
          i = j;
        } 
      } else {
        i = 1;
      } 
      j = i;
    } 
  }
  
  public final void s() {
    for (byte b = 0; b < this.k; b++) {
      c9 c91 = this.g[b];
      if (c91 != null)
        ((z81)this.m.c).c(c91); 
      this.g[b] = null;
    } 
  }
  
  public final void t() {
    int i = 0;
    while (true) {
      pn1 pn11;
      zv0 zv01 = this.m;
      pn1[] arrayOfPn11 = (pn1[])zv01.f;
      if (i < arrayOfPn11.length) {
        pn11 = arrayOfPn11[i];
        if (pn11 != null)
          pn11.c(); 
        i++;
        continue;
      } 
      z81 z81 = (z81)((zv0)pn11).e;
      pn1[] arrayOfPn12 = this.n;
      int j = this.o;
      z81.getClass();
      i = j;
      if (j > arrayOfPn12.length)
        i = arrayOfPn12.length; 
      for (j = 0; j < i; j++) {
        pn1 pn12 = arrayOfPn12[j];
        int k = z81.c;
        Object[] arrayOfObject = z81.b;
        if (k < arrayOfObject.length) {
          arrayOfObject[k] = pn12;
          z81.c = k + 1;
        } 
      } 
      this.o = 0;
      Arrays.fill((Object[])((zv0)pn11).f, (Object)null);
      this.c = 0;
      ha1 ha11 = this.d;
      ha11.h = 0;
      ha11.b = 0.0F;
      this.j = 1;
      for (i = 0; i < this.k; i++)
        c9 c91 = this.g[i]; 
      s();
      this.k = 0;
      this.p = new c9((zv0)pn11);
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ln0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */