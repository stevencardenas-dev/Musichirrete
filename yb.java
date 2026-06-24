import java.util.ArrayList;

public final class yb extends er {
  public er[] q0;
  
  public int r0;
  
  public int s0;
  
  public boolean t0;
  
  public int u0;
  
  public boolean v0;
  
  public final void N(int paramInt, k52 paramk52, ArrayList paramArrayList) {
    byte b2;
    byte b3 = 0;
    byte b1 = 0;
    while (true) {
      b2 = b3;
      if (b1 < this.r0) {
        er er1 = this.q0[b1];
        ArrayList<er> arrayList = paramk52.a;
        if (!arrayList.contains(er1))
          arrayList.add(er1); 
        b1++;
        continue;
      } 
      break;
    } 
    while (b2 < this.r0) {
      m92.r(this.q0[b2], paramInt, paramArrayList, paramk52);
      b2++;
    } 
  }
  
  public final boolean O() {
    // Byte code:
    //   0: iconst_0
    //   1: istore #5
    //   3: iconst_1
    //   4: istore_1
    //   5: iconst_0
    //   6: istore_2
    //   7: aload_0
    //   8: getfield r0 : I
    //   11: istore_3
    //   12: iload_2
    //   13: iload_3
    //   14: if_icmpge -> 113
    //   17: aload_0
    //   18: getfield q0 : [Ler;
    //   21: iload_2
    //   22: aaload
    //   23: astore #7
    //   25: aload_0
    //   26: getfield t0 : Z
    //   29: ifne -> 45
    //   32: aload #7
    //   34: invokevirtual c : ()Z
    //   37: ifne -> 45
    //   40: iload_1
    //   41: istore_3
    //   42: goto -> 105
    //   45: aload_0
    //   46: getfield s0 : I
    //   49: istore_3
    //   50: iload_3
    //   51: ifeq -> 59
    //   54: iload_3
    //   55: iconst_1
    //   56: if_icmpne -> 72
    //   59: aload #7
    //   61: invokevirtual y : ()Z
    //   64: ifne -> 72
    //   67: iconst_0
    //   68: istore_3
    //   69: goto -> 105
    //   72: aload_0
    //   73: getfield s0 : I
    //   76: istore #4
    //   78: iload #4
    //   80: iconst_2
    //   81: if_icmpeq -> 92
    //   84: iload_1
    //   85: istore_3
    //   86: iload #4
    //   88: iconst_3
    //   89: if_icmpne -> 105
    //   92: iload_1
    //   93: istore_3
    //   94: aload #7
    //   96: invokevirtual z : ()Z
    //   99: ifne -> 105
    //   102: goto -> 67
    //   105: iinc #2, 1
    //   108: iload_3
    //   109: istore_1
    //   110: goto -> 7
    //   113: iload_1
    //   114: ifeq -> 411
    //   117: iload_3
    //   118: ifle -> 411
    //   121: iconst_0
    //   122: istore_1
    //   123: iconst_0
    //   124: istore_3
    //   125: iload #5
    //   127: aload_0
    //   128: getfield r0 : I
    //   131: if_icmpge -> 365
    //   134: aload_0
    //   135: getfield q0 : [Ler;
    //   138: iload #5
    //   140: aaload
    //   141: astore #7
    //   143: aload_0
    //   144: getfield t0 : Z
    //   147: ifne -> 161
    //   150: aload #7
    //   152: invokevirtual c : ()Z
    //   155: ifne -> 161
    //   158: goto -> 359
    //   161: iload_1
    //   162: istore #4
    //   164: iload_3
    //   165: istore_2
    //   166: iload_3
    //   167: ifne -> 248
    //   170: aload_0
    //   171: getfield s0 : I
    //   174: istore_2
    //   175: iload_2
    //   176: ifne -> 192
    //   179: aload #7
    //   181: iconst_2
    //   182: invokevirtual g : (I)Lbq;
    //   185: invokevirtual c : ()I
    //   188: istore_1
    //   189: goto -> 243
    //   192: iload_2
    //   193: iconst_1
    //   194: if_icmpne -> 210
    //   197: aload #7
    //   199: iconst_4
    //   200: invokevirtual g : (I)Lbq;
    //   203: invokevirtual c : ()I
    //   206: istore_1
    //   207: goto -> 243
    //   210: iload_2
    //   211: iconst_2
    //   212: if_icmpne -> 228
    //   215: aload #7
    //   217: iconst_3
    //   218: invokevirtual g : (I)Lbq;
    //   221: invokevirtual c : ()I
    //   224: istore_1
    //   225: goto -> 243
    //   228: iload_2
    //   229: iconst_3
    //   230: if_icmpne -> 243
    //   233: aload #7
    //   235: iconst_5
    //   236: invokevirtual g : (I)Lbq;
    //   239: invokevirtual c : ()I
    //   242: istore_1
    //   243: iconst_1
    //   244: istore_2
    //   245: iload_1
    //   246: istore #4
    //   248: aload_0
    //   249: getfield s0 : I
    //   252: istore #6
    //   254: iload #6
    //   256: ifne -> 279
    //   259: iload #4
    //   261: aload #7
    //   263: iconst_2
    //   264: invokevirtual g : (I)Lbq;
    //   267: invokevirtual c : ()I
    //   270: invokestatic min : (II)I
    //   273: istore_1
    //   274: iload_2
    //   275: istore_3
    //   276: goto -> 359
    //   279: iload #6
    //   281: iconst_1
    //   282: if_icmpne -> 305
    //   285: iload #4
    //   287: aload #7
    //   289: iconst_4
    //   290: invokevirtual g : (I)Lbq;
    //   293: invokevirtual c : ()I
    //   296: invokestatic max : (II)I
    //   299: istore_1
    //   300: iload_2
    //   301: istore_3
    //   302: goto -> 359
    //   305: iload #6
    //   307: iconst_2
    //   308: if_icmpne -> 331
    //   311: iload #4
    //   313: aload #7
    //   315: iconst_3
    //   316: invokevirtual g : (I)Lbq;
    //   319: invokevirtual c : ()I
    //   322: invokestatic min : (II)I
    //   325: istore_1
    //   326: iload_2
    //   327: istore_3
    //   328: goto -> 359
    //   331: iload #4
    //   333: istore_1
    //   334: iload_2
    //   335: istore_3
    //   336: iload #6
    //   338: iconst_3
    //   339: if_icmpne -> 359
    //   342: iload #4
    //   344: aload #7
    //   346: iconst_5
    //   347: invokevirtual g : (I)Lbq;
    //   350: invokevirtual c : ()I
    //   353: invokestatic max : (II)I
    //   356: istore_1
    //   357: iload_2
    //   358: istore_3
    //   359: iinc #5, 1
    //   362: goto -> 125
    //   365: iload_1
    //   366: aload_0
    //   367: getfield u0 : I
    //   370: iadd
    //   371: istore_1
    //   372: aload_0
    //   373: getfield s0 : I
    //   376: istore_2
    //   377: iload_2
    //   378: ifeq -> 398
    //   381: iload_2
    //   382: iconst_1
    //   383: if_icmpne -> 389
    //   386: goto -> 398
    //   389: aload_0
    //   390: iload_1
    //   391: iload_1
    //   392: invokevirtual G : (II)V
    //   395: goto -> 404
    //   398: aload_0
    //   399: iload_1
    //   400: iload_1
    //   401: invokevirtual F : (II)V
    //   404: aload_0
    //   405: iconst_1
    //   406: putfield v0 : Z
    //   409: iconst_1
    //   410: ireturn
    //   411: iconst_0
    //   412: ireturn
  }
  
  public final int P() {
    int i = this.s0;
    return (i != 0 && i != 1) ? ((i != 2 && i != 3) ? -1 : 1) : 0;
  }
  
  public final void b(ln0 paramln0, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Q : [Lbq;
    //   4: astore #12
    //   6: aload_0
    //   7: getfield I : Lbq;
    //   10: astore #9
    //   12: aload #12
    //   14: iconst_0
    //   15: aload #9
    //   17: aastore
    //   18: aload_0
    //   19: getfield J : Lbq;
    //   22: astore #7
    //   24: aload #12
    //   26: iconst_2
    //   27: aload #7
    //   29: aastore
    //   30: aload_0
    //   31: getfield K : Lbq;
    //   34: astore #8
    //   36: aload #12
    //   38: iconst_1
    //   39: aload #8
    //   41: aastore
    //   42: aload_0
    //   43: getfield L : Lbq;
    //   46: astore #10
    //   48: aload #12
    //   50: iconst_3
    //   51: aload #10
    //   53: aastore
    //   54: iconst_0
    //   55: istore_3
    //   56: iload_3
    //   57: aload #12
    //   59: arraylength
    //   60: if_icmpge -> 86
    //   63: aload #12
    //   65: iload_3
    //   66: aaload
    //   67: astore #11
    //   69: aload #11
    //   71: aload_1
    //   72: aload #11
    //   74: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   77: putfield i : Lpn1;
    //   80: iinc #3, 1
    //   83: goto -> 56
    //   86: aload_0
    //   87: getfield s0 : I
    //   90: istore_3
    //   91: iload_3
    //   92: iflt -> 1007
    //   95: iload_3
    //   96: iconst_4
    //   97: if_icmpge -> 1007
    //   100: aload #12
    //   102: iload_3
    //   103: aaload
    //   104: astore #11
    //   106: aload_0
    //   107: getfield v0 : Z
    //   110: ifne -> 118
    //   113: aload_0
    //   114: invokevirtual O : ()Z
    //   117: pop
    //   118: aload_0
    //   119: getfield v0 : Z
    //   122: ifeq -> 211
    //   125: aload_0
    //   126: iconst_0
    //   127: putfield v0 : Z
    //   130: aload_0
    //   131: getfield s0 : I
    //   134: istore_3
    //   135: iload_3
    //   136: ifeq -> 184
    //   139: iload_3
    //   140: iconst_1
    //   141: if_icmpne -> 147
    //   144: goto -> 184
    //   147: iload_3
    //   148: iconst_2
    //   149: if_icmpeq -> 157
    //   152: iload_3
    //   153: iconst_3
    //   154: if_icmpne -> 1007
    //   157: aload_1
    //   158: aload #7
    //   160: getfield i : Lpn1;
    //   163: aload_0
    //   164: getfield Z : I
    //   167: invokevirtual d : (Lpn1;I)V
    //   170: aload_1
    //   171: aload #10
    //   173: getfield i : Lpn1;
    //   176: aload_0
    //   177: getfield Z : I
    //   180: invokevirtual d : (Lpn1;I)V
    //   183: return
    //   184: aload_1
    //   185: aload #9
    //   187: getfield i : Lpn1;
    //   190: aload_0
    //   191: getfield Y : I
    //   194: invokevirtual d : (Lpn1;I)V
    //   197: aload_1
    //   198: aload #8
    //   200: getfield i : Lpn1;
    //   203: aload_0
    //   204: getfield Y : I
    //   207: invokevirtual d : (Lpn1;I)V
    //   210: return
    //   211: iconst_0
    //   212: istore_3
    //   213: iload_3
    //   214: aload_0
    //   215: getfield r0 : I
    //   218: if_icmpge -> 356
    //   221: aload_0
    //   222: getfield q0 : [Ler;
    //   225: iload_3
    //   226: aaload
    //   227: astore #12
    //   229: aload_0
    //   230: getfield t0 : Z
    //   233: ifne -> 247
    //   236: aload #12
    //   238: invokevirtual c : ()Z
    //   241: ifne -> 247
    //   244: goto -> 350
    //   247: aload_0
    //   248: getfield s0 : I
    //   251: istore #4
    //   253: iload #4
    //   255: ifeq -> 264
    //   258: iload #4
    //   260: iconst_1
    //   261: if_icmpne -> 302
    //   264: aload #12
    //   266: getfield p0 : [I
    //   269: iconst_0
    //   270: iaload
    //   271: iconst_3
    //   272: if_icmpne -> 302
    //   275: aload #12
    //   277: getfield I : Lbq;
    //   280: getfield f : Lbq;
    //   283: ifnull -> 302
    //   286: aload #12
    //   288: getfield K : Lbq;
    //   291: getfield f : Lbq;
    //   294: ifnull -> 302
    //   297: iconst_1
    //   298: istore_3
    //   299: goto -> 358
    //   302: iload #4
    //   304: iconst_2
    //   305: if_icmpeq -> 314
    //   308: iload #4
    //   310: iconst_3
    //   311: if_icmpne -> 350
    //   314: aload #12
    //   316: getfield p0 : [I
    //   319: iconst_1
    //   320: iaload
    //   321: iconst_3
    //   322: if_icmpne -> 350
    //   325: aload #12
    //   327: getfield J : Lbq;
    //   330: getfield f : Lbq;
    //   333: ifnull -> 350
    //   336: aload #12
    //   338: getfield L : Lbq;
    //   341: getfield f : Lbq;
    //   344: ifnull -> 350
    //   347: goto -> 297
    //   350: iinc #3, 1
    //   353: goto -> 213
    //   356: iconst_0
    //   357: istore_3
    //   358: aload #9
    //   360: invokevirtual e : ()Z
    //   363: ifne -> 383
    //   366: aload #8
    //   368: invokevirtual e : ()Z
    //   371: ifeq -> 377
    //   374: goto -> 383
    //   377: iconst_0
    //   378: istore #4
    //   380: goto -> 386
    //   383: iconst_1
    //   384: istore #4
    //   386: aload #7
    //   388: invokevirtual e : ()Z
    //   391: ifne -> 411
    //   394: aload #10
    //   396: invokevirtual e : ()Z
    //   399: ifeq -> 405
    //   402: goto -> 411
    //   405: iconst_0
    //   406: istore #5
    //   408: goto -> 414
    //   411: iconst_1
    //   412: istore #5
    //   414: iload_3
    //   415: ifne -> 467
    //   418: aload_0
    //   419: getfield s0 : I
    //   422: istore_3
    //   423: iload_3
    //   424: ifne -> 432
    //   427: iload #4
    //   429: ifne -> 462
    //   432: iload_3
    //   433: iconst_2
    //   434: if_icmpne -> 442
    //   437: iload #5
    //   439: ifne -> 462
    //   442: iload_3
    //   443: iconst_1
    //   444: if_icmpne -> 452
    //   447: iload #4
    //   449: ifne -> 462
    //   452: iload_3
    //   453: iconst_3
    //   454: if_icmpne -> 467
    //   457: iload #5
    //   459: ifeq -> 467
    //   462: iconst_1
    //   463: istore_3
    //   464: goto -> 469
    //   467: iconst_0
    //   468: istore_3
    //   469: iload_3
    //   470: ifne -> 478
    //   473: iconst_4
    //   474: istore_3
    //   475: goto -> 480
    //   478: iconst_5
    //   479: istore_3
    //   480: iconst_0
    //   481: istore #4
    //   483: iload #4
    //   485: aload_0
    //   486: getfield r0 : I
    //   489: if_icmpge -> 744
    //   492: aload_0
    //   493: getfield q0 : [Ler;
    //   496: iload #4
    //   498: aaload
    //   499: astore #13
    //   501: aload_0
    //   502: getfield t0 : Z
    //   505: ifne -> 519
    //   508: aload #13
    //   510: invokevirtual c : ()Z
    //   513: ifne -> 519
    //   516: goto -> 738
    //   519: aload_1
    //   520: aload #13
    //   522: getfield Q : [Lbq;
    //   525: aload_0
    //   526: getfield s0 : I
    //   529: aaload
    //   530: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   533: astore #12
    //   535: aload #13
    //   537: getfield Q : [Lbq;
    //   540: astore #13
    //   542: aload_0
    //   543: getfield s0 : I
    //   546: istore #6
    //   548: aload #13
    //   550: iload #6
    //   552: aaload
    //   553: astore #14
    //   555: aload #14
    //   557: aload #12
    //   559: putfield i : Lpn1;
    //   562: aload #14
    //   564: getfield f : Lbq;
    //   567: astore #13
    //   569: aload #13
    //   571: ifnull -> 593
    //   574: aload #13
    //   576: getfield d : Ler;
    //   579: aload_0
    //   580: if_acmpne -> 593
    //   583: aload #14
    //   585: getfield g : I
    //   588: istore #5
    //   590: goto -> 596
    //   593: iconst_0
    //   594: istore #5
    //   596: iload #6
    //   598: ifeq -> 666
    //   601: iload #6
    //   603: iconst_2
    //   604: if_icmpne -> 610
    //   607: goto -> 666
    //   610: aload #11
    //   612: getfield i : Lpn1;
    //   615: astore #13
    //   617: aload_0
    //   618: getfield u0 : I
    //   621: istore #6
    //   623: aload_1
    //   624: invokevirtual l : ()Lc9;
    //   627: astore #14
    //   629: aload_1
    //   630: invokevirtual m : ()Lpn1;
    //   633: astore #15
    //   635: aload #15
    //   637: iconst_0
    //   638: putfield f : I
    //   641: aload #14
    //   643: aload #13
    //   645: aload #12
    //   647: aload #15
    //   649: iload #6
    //   651: iload #5
    //   653: iadd
    //   654: invokevirtual b : (Lpn1;Lpn1;Lpn1;I)V
    //   657: aload_1
    //   658: aload #14
    //   660: invokevirtual c : (Lc9;)V
    //   663: goto -> 719
    //   666: aload #11
    //   668: getfield i : Lpn1;
    //   671: astore #13
    //   673: aload_0
    //   674: getfield u0 : I
    //   677: istore #6
    //   679: aload_1
    //   680: invokevirtual l : ()Lc9;
    //   683: astore #14
    //   685: aload_1
    //   686: invokevirtual m : ()Lpn1;
    //   689: astore #15
    //   691: aload #15
    //   693: iconst_0
    //   694: putfield f : I
    //   697: aload #14
    //   699: aload #13
    //   701: aload #12
    //   703: aload #15
    //   705: iload #6
    //   707: iload #5
    //   709: isub
    //   710: invokevirtual c : (Lpn1;Lpn1;Lpn1;I)V
    //   713: aload_1
    //   714: aload #14
    //   716: invokevirtual c : (Lc9;)V
    //   719: aload_1
    //   720: aload #11
    //   722: getfield i : Lpn1;
    //   725: aload #12
    //   727: aload_0
    //   728: getfield u0 : I
    //   731: iload #5
    //   733: iadd
    //   734: iload_3
    //   735: invokevirtual e : (Lpn1;Lpn1;II)V
    //   738: iinc #4, 1
    //   741: goto -> 483
    //   744: aload_0
    //   745: getfield s0 : I
    //   748: istore_3
    //   749: iload_3
    //   750: ifne -> 813
    //   753: aload_1
    //   754: aload #8
    //   756: getfield i : Lpn1;
    //   759: aload #9
    //   761: getfield i : Lpn1;
    //   764: iconst_0
    //   765: bipush #8
    //   767: invokevirtual e : (Lpn1;Lpn1;II)V
    //   770: aload_1
    //   771: aload #9
    //   773: getfield i : Lpn1;
    //   776: aload_0
    //   777: getfield T : Ler;
    //   780: getfield K : Lbq;
    //   783: getfield i : Lpn1;
    //   786: iconst_0
    //   787: iconst_4
    //   788: invokevirtual e : (Lpn1;Lpn1;II)V
    //   791: aload_1
    //   792: aload #9
    //   794: getfield i : Lpn1;
    //   797: aload_0
    //   798: getfield T : Ler;
    //   801: getfield I : Lbq;
    //   804: getfield i : Lpn1;
    //   807: iconst_0
    //   808: iconst_0
    //   809: invokevirtual e : (Lpn1;Lpn1;II)V
    //   812: return
    //   813: iload_3
    //   814: iconst_1
    //   815: if_icmpne -> 878
    //   818: aload_1
    //   819: aload #9
    //   821: getfield i : Lpn1;
    //   824: aload #8
    //   826: getfield i : Lpn1;
    //   829: iconst_0
    //   830: bipush #8
    //   832: invokevirtual e : (Lpn1;Lpn1;II)V
    //   835: aload_1
    //   836: aload #9
    //   838: getfield i : Lpn1;
    //   841: aload_0
    //   842: getfield T : Ler;
    //   845: getfield I : Lbq;
    //   848: getfield i : Lpn1;
    //   851: iconst_0
    //   852: iconst_4
    //   853: invokevirtual e : (Lpn1;Lpn1;II)V
    //   856: aload_1
    //   857: aload #9
    //   859: getfield i : Lpn1;
    //   862: aload_0
    //   863: getfield T : Ler;
    //   866: getfield K : Lbq;
    //   869: getfield i : Lpn1;
    //   872: iconst_0
    //   873: iconst_0
    //   874: invokevirtual e : (Lpn1;Lpn1;II)V
    //   877: return
    //   878: iload_3
    //   879: iconst_2
    //   880: if_icmpne -> 943
    //   883: aload_1
    //   884: aload #10
    //   886: getfield i : Lpn1;
    //   889: aload #7
    //   891: getfield i : Lpn1;
    //   894: iconst_0
    //   895: bipush #8
    //   897: invokevirtual e : (Lpn1;Lpn1;II)V
    //   900: aload_1
    //   901: aload #7
    //   903: getfield i : Lpn1;
    //   906: aload_0
    //   907: getfield T : Ler;
    //   910: getfield L : Lbq;
    //   913: getfield i : Lpn1;
    //   916: iconst_0
    //   917: iconst_4
    //   918: invokevirtual e : (Lpn1;Lpn1;II)V
    //   921: aload_1
    //   922: aload #7
    //   924: getfield i : Lpn1;
    //   927: aload_0
    //   928: getfield T : Ler;
    //   931: getfield J : Lbq;
    //   934: getfield i : Lpn1;
    //   937: iconst_0
    //   938: iconst_0
    //   939: invokevirtual e : (Lpn1;Lpn1;II)V
    //   942: return
    //   943: iload_3
    //   944: iconst_3
    //   945: if_icmpne -> 1007
    //   948: aload_1
    //   949: aload #7
    //   951: getfield i : Lpn1;
    //   954: aload #10
    //   956: getfield i : Lpn1;
    //   959: iconst_0
    //   960: bipush #8
    //   962: invokevirtual e : (Lpn1;Lpn1;II)V
    //   965: aload_1
    //   966: aload #7
    //   968: getfield i : Lpn1;
    //   971: aload_0
    //   972: getfield T : Ler;
    //   975: getfield J : Lbq;
    //   978: getfield i : Lpn1;
    //   981: iconst_0
    //   982: iconst_4
    //   983: invokevirtual e : (Lpn1;Lpn1;II)V
    //   986: aload_1
    //   987: aload #7
    //   989: getfield i : Lpn1;
    //   992: aload_0
    //   993: getfield T : Ler;
    //   996: getfield L : Lbq;
    //   999: getfield i : Lpn1;
    //   1002: iconst_0
    //   1003: iconst_0
    //   1004: invokevirtual e : (Lpn1;Lpn1;II)V
    //   1007: return
  }
  
  public final boolean c() {
    return true;
  }
  
  public final String toString() {
    String str = x41.n(new StringBuilder("[Barrier] "), this.h0, " {");
    for (byte b = 0; b < this.r0; b++) {
      er er1 = this.q0[b];
      String str1 = str;
      if (b > 0)
        str1 = str.concat(", "); 
      StringBuilder stringBuilder = x41.p(str1);
      stringBuilder.append(er1.h0);
      str = stringBuilder.toString();
    } 
    return str.concat("}");
  }
  
  public final boolean y() {
    return this.v0;
  }
  
  public final boolean z() {
    return this.v0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\yb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */