import java.util.concurrent.atomic.AtomicBoolean;

public final class rp implements np {
  public final n81 b;
  
  public final n81 c;
  
  public final ThreadLocal e;
  
  public final AtomicBoolean f;
  
  public final long g;
  
  public rp(g7 paramg7) {
    long l;
    this.e = new ThreadLocal();
    this.f = new AtomicBoolean(false);
    hp2 hp2 = f20.b;
    j20 j20 = j20.f;
    if (j20.compareTo(j20) <= 0) {
      int i = i20.a;
      l = 60000000000L;
    } else {
      l = m92.X(30L, j20);
    } 
    this.g = l;
    n81 n811 = new n81(1, new pp(0, paramg7));
    this.b = n811;
    this.c = n811;
  }
  
  public rp(g7 paramg7, String paramString, int paramInt) {
    long l;
    this.e = new ThreadLocal();
    this.f = new AtomicBoolean(false);
    hp2 hp2 = f20.b;
    j20 j20 = j20.f;
    if (j20.compareTo(j20) <= 0) {
      int i = i20.a;
      l = 60000000000L;
    } else {
      l = m92.X(30L, j20);
    } 
    this.g = l;
    if (paramInt > 0) {
      this.b = new n81(paramInt, new op(paramg7, paramString, 0));
      this.c = new n81(1, new op(paramg7, paramString, 1));
      return;
    } 
    l0.l("Maximum number of readers must be greater than 0");
    throw null;
  }
  
  public final void a(boolean paramBoolean) {
    String str;
    if (paramBoolean) {
      str = "reader";
    } else {
      str = "writer";
    } 
    StringBuilder stringBuilder1 = new StringBuilder();
    StringBuilder stringBuilder2 = new StringBuilder("Timed out attempting to acquire a ");
    stringBuilder2.append(str);
    stringBuilder2.append(" connection.");
    stringBuilder1.append(stringBuilder2.toString());
    stringBuilder1.append("\n\nWriter pool:\n");
    this.c.c(stringBuilder1);
    stringBuilder1.append("Reader pool:");
    stringBuilder1.append('\n');
    this.b.c(stringBuilder1);
    m92.V(stringBuilder1.toString(), 5);
    throw null;
  }
  
  public final void close() {
    if (this.f.compareAndSet(false, true)) {
      this.b.b();
      this.c.b();
    } 
  }
  
  public final Object t(boolean paramBoolean, ad0 paramad0, ds paramds) {
    // Byte code:
    //   0: aload_0
    //   1: astore #9
    //   3: aload_2
    //   4: astore #8
    //   6: aload_3
    //   7: instanceof qp
    //   10: ifeq -> 47
    //   13: aload_3
    //   14: checkcast qp
    //   17: astore #13
    //   19: aload #13
    //   21: getfield o : I
    //   24: istore #4
    //   26: iload #4
    //   28: ldc -2147483648
    //   30: iand
    //   31: ifeq -> 47
    //   34: aload #13
    //   36: iload #4
    //   38: ldc -2147483648
    //   40: iadd
    //   41: putfield o : I
    //   44: goto -> 59
    //   47: new qp
    //   50: dup
    //   51: aload #9
    //   53: aload_3
    //   54: invokespecial <init> : (Lrp;Lds;)V
    //   57: astore #13
    //   59: aload #13
    //   61: getfield c : Los;
    //   64: astore #11
    //   66: aload #13
    //   68: getfield m : Ljava/lang/Object;
    //   71: astore #10
    //   73: aload #13
    //   75: getfield o : I
    //   78: istore #4
    //   80: getstatic ys.b : Lys;
    //   83: astore #15
    //   85: iload #4
    //   87: ifeq -> 271
    //   90: iload #4
    //   92: iconst_1
    //   93: if_icmpeq -> 263
    //   96: iload #4
    //   98: iconst_2
    //   99: if_icmpeq -> 255
    //   102: iload #4
    //   104: iconst_3
    //   105: if_icmpeq -> 170
    //   108: iload #4
    //   110: iconst_4
    //   111: if_icmpne -> 163
    //   114: aload #13
    //   116: getfield g : Ljava/io/Serializable;
    //   119: checkcast me1
    //   122: astore #8
    //   124: aload #13
    //   126: getfield f : Ljava/lang/Object;
    //   129: checkcast n81
    //   132: astore_3
    //   133: aload #10
    //   135: invokestatic r0 : (Ljava/lang/Object;)V
    //   138: aload #10
    //   140: astore_2
    //   141: aload #8
    //   143: astore #9
    //   145: aload_3
    //   146: astore #8
    //   148: goto -> 914
    //   151: astore #9
    //   153: aload #8
    //   155: astore_2
    //   156: aload #9
    //   158: astore #8
    //   160: goto -> 1011
    //   163: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   165: invokestatic f : (Ljava/lang/String;)V
    //   168: aconst_null
    //   169: areturn
    //   170: aload #13
    //   172: getfield l : Z
    //   175: istore_1
    //   176: aload #13
    //   178: getfield k : Lme1;
    //   181: astore #12
    //   183: aload #13
    //   185: getfield j : Los;
    //   188: astore #11
    //   190: aload #13
    //   192: getfield i : Lme1;
    //   195: astore #8
    //   197: aload #13
    //   199: getfield h : Ln81;
    //   202: astore_2
    //   203: aload #13
    //   205: getfield g : Ljava/io/Serializable;
    //   208: checkcast ad0
    //   211: astore_3
    //   212: aload #13
    //   214: getfield f : Ljava/lang/Object;
    //   217: checkcast rp
    //   220: astore #9
    //   222: aload #10
    //   224: invokestatic r0 : (Ljava/lang/Object;)V
    //   227: aload #8
    //   229: astore #10
    //   231: aload_3
    //   232: astore #8
    //   234: aload #10
    //   236: astore_3
    //   237: goto -> 630
    //   240: astore #10
    //   242: aload #8
    //   244: astore #14
    //   246: aload_3
    //   247: astore #8
    //   249: aload #14
    //   251: astore_3
    //   252: goto -> 633
    //   255: aload #10
    //   257: invokestatic r0 : (Ljava/lang/Object;)V
    //   260: aload #10
    //   262: areturn
    //   263: aload #10
    //   265: invokestatic r0 : (Ljava/lang/Object;)V
    //   268: aload #10
    //   270: areturn
    //   271: aload #10
    //   273: invokestatic r0 : (Ljava/lang/Object;)V
    //   276: aload #9
    //   278: getfield f : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   281: invokevirtual get : ()Z
    //   284: ifne -> 1085
    //   287: aload #9
    //   289: getfield e : Ljava/lang/ThreadLocal;
    //   292: astore #10
    //   294: aload #10
    //   296: invokevirtual get : ()Ljava/lang/Object;
    //   299: checkcast w81
    //   302: astore_3
    //   303: getstatic lp.c : Lip2;
    //   306: astore #12
    //   308: aload_3
    //   309: astore_2
    //   310: aload_3
    //   311: ifnonnull -> 347
    //   314: aload #11
    //   316: invokevirtual getClass : ()Ljava/lang/Class;
    //   319: pop
    //   320: aload #11
    //   322: aload #12
    //   324: invokeinterface l : (Lns;)Lms;
    //   329: checkcast lp
    //   332: astore_2
    //   333: aload_2
    //   334: ifnull -> 345
    //   337: aload_2
    //   338: getfield b : Lw81;
    //   341: astore_2
    //   342: goto -> 347
    //   345: aconst_null
    //   346: astore_2
    //   347: aload_2
    //   348: ifnull -> 487
    //   351: iload_1
    //   352: ifne -> 373
    //   355: aload_2
    //   356: getfield b : Z
    //   359: ifne -> 365
    //   362: goto -> 373
    //   365: ldc 'Cannot upgrade connection from reader to writer'
    //   367: iconst_1
    //   368: invokestatic V : (Ljava/lang/String;I)V
    //   371: aconst_null
    //   372: athrow
    //   373: aload #11
    //   375: invokevirtual getClass : ()Ljava/lang/Class;
    //   378: pop
    //   379: aload #11
    //   381: aload #12
    //   383: invokeinterface l : (Lns;)Lms;
    //   388: ifnonnull -> 459
    //   391: new lp
    //   394: dup
    //   395: aload_2
    //   396: invokespecial <init> : (Lw81;)V
    //   399: astore_3
    //   400: aload #10
    //   402: invokevirtual getClass : ()Ljava/lang/Class;
    //   405: pop
    //   406: aload_3
    //   407: new lu1
    //   410: dup
    //   411: aload_2
    //   412: aload #10
    //   414: invokespecial <init> : (Lw81;Ljava/lang/ThreadLocal;)V
    //   417: invokestatic f0 : (Lms;Los;)Los;
    //   420: astore_3
    //   421: new sc
    //   424: dup
    //   425: aload #8
    //   427: aload_2
    //   428: aconst_null
    //   429: iconst_3
    //   430: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Lcs;I)V
    //   433: astore_2
    //   434: aload #13
    //   436: iconst_1
    //   437: putfield o : I
    //   440: aload_3
    //   441: aload_2
    //   442: aload #13
    //   444: invokestatic l0 : (Los;Lad0;Lcs;)Ljava/lang/Object;
    //   447: astore_2
    //   448: aload_2
    //   449: aload #15
    //   451: if_acmpne -> 457
    //   454: goto -> 902
    //   457: aload_2
    //   458: areturn
    //   459: aload #13
    //   461: iconst_2
    //   462: putfield o : I
    //   465: aload #8
    //   467: aload_2
    //   468: aload #13
    //   470: invokeinterface g : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   475: astore_2
    //   476: aload_2
    //   477: aload #15
    //   479: if_acmpne -> 485
    //   482: goto -> 902
    //   485: aload_2
    //   486: areturn
    //   487: iload_1
    //   488: ifeq -> 500
    //   491: aload #9
    //   493: getfield b : Ln81;
    //   496: astore_2
    //   497: goto -> 509
    //   500: aload #9
    //   502: getfield c : Ln81;
    //   505: astore_2
    //   506: goto -> 497
    //   509: new java/lang/Object
    //   512: dup
    //   513: invokespecial <init> : ()V
    //   516: astore_3
    //   517: aload #11
    //   519: invokevirtual getClass : ()Ljava/lang/Class;
    //   522: pop
    //   523: new java/lang/Object
    //   526: dup
    //   527: invokespecial <init> : ()V
    //   530: astore #12
    //   532: aload #9
    //   534: getfield g : J
    //   537: lstore #6
    //   539: new ek
    //   542: astore #10
    //   544: aload #10
    //   546: aload #12
    //   548: aload_2
    //   549: aconst_null
    //   550: iconst_1
    //   551: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Lcs;I)V
    //   554: aload #13
    //   556: aload #9
    //   558: putfield f : Ljava/lang/Object;
    //   561: aload #13
    //   563: aload #8
    //   565: checkcast java/io/Serializable
    //   568: putfield g : Ljava/io/Serializable;
    //   571: aload #13
    //   573: aload_2
    //   574: putfield h : Ln81;
    //   577: aload #13
    //   579: aload_3
    //   580: putfield i : Lme1;
    //   583: aload #13
    //   585: aload #11
    //   587: putfield j : Los;
    //   590: aload #13
    //   592: aload #12
    //   594: putfield k : Lme1;
    //   597: aload #13
    //   599: iload_1
    //   600: putfield l : Z
    //   603: aload #13
    //   605: iconst_3
    //   606: putfield o : I
    //   609: lload #6
    //   611: aload #10
    //   613: aload #13
    //   615: invokestatic s0 : (JLek;Lqp;)Ljava/lang/Object;
    //   618: astore #10
    //   620: aload #10
    //   622: aload #15
    //   624: if_acmpne -> 630
    //   627: goto -> 902
    //   630: aconst_null
    //   631: astore #10
    //   633: goto -> 641
    //   636: astore #10
    //   638: goto -> 633
    //   641: aload #12
    //   643: getfield b : Ljava/lang/Object;
    //   646: checkcast yp
    //   649: astore #14
    //   651: aload #14
    //   653: ifnull -> 746
    //   656: new w81
    //   659: astore #12
    //   661: aload #11
    //   663: invokevirtual getClass : ()Ljava/lang/Class;
    //   666: pop
    //   667: aload #14
    //   669: aload #11
    //   671: putfield e : Los;
    //   674: new java/lang/Throwable
    //   677: astore #11
    //   679: aload #11
    //   681: invokespecial <init> : ()V
    //   684: aload #14
    //   686: aload #11
    //   688: putfield f : Ljava/lang/Throwable;
    //   691: aload #9
    //   693: getfield b : Ln81;
    //   696: aload #9
    //   698: getfield c : Ln81;
    //   701: if_acmpeq -> 714
    //   704: iload_1
    //   705: ifeq -> 714
    //   708: iconst_1
    //   709: istore #5
    //   711: goto -> 717
    //   714: iconst_0
    //   715: istore #5
    //   717: aload #12
    //   719: aload #14
    //   721: iload #5
    //   723: invokespecial <init> : (Lyp;Z)V
    //   726: aload #12
    //   728: astore #11
    //   730: goto -> 749
    //   733: astore #8
    //   735: aload_3
    //   736: astore #9
    //   738: aload_2
    //   739: astore_3
    //   740: aload #9
    //   742: astore_2
    //   743: goto -> 160
    //   746: aconst_null
    //   747: astore #11
    //   749: aload_3
    //   750: aload #11
    //   752: putfield b : Ljava/lang/Object;
    //   755: aload #10
    //   757: instanceof vu1
    //   760: ifne -> 993
    //   763: aload #10
    //   765: ifnonnull -> 990
    //   768: aload #11
    //   770: ifnull -> 974
    //   773: aload #9
    //   775: invokevirtual getClass : ()Ljava/lang/Class;
    //   778: pop
    //   779: new lp
    //   782: astore #10
    //   784: aload #10
    //   786: aload #11
    //   788: invokespecial <init> : (Lw81;)V
    //   791: aload #9
    //   793: getfield e : Ljava/lang/ThreadLocal;
    //   796: astore #9
    //   798: aload #9
    //   800: invokevirtual getClass : ()Ljava/lang/Class;
    //   803: pop
    //   804: new lu1
    //   807: astore #12
    //   809: aload #12
    //   811: aload #11
    //   813: aload #9
    //   815: invokespecial <init> : (Lw81;Ljava/lang/ThreadLocal;)V
    //   818: aload #10
    //   820: aload #12
    //   822: invokestatic f0 : (Lms;Los;)Los;
    //   825: astore #9
    //   827: new sc
    //   830: astore #10
    //   832: aload #10
    //   834: aload #8
    //   836: aload_3
    //   837: aconst_null
    //   838: iconst_4
    //   839: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;Lcs;I)V
    //   842: aload #13
    //   844: aload_2
    //   845: putfield f : Ljava/lang/Object;
    //   848: aload #13
    //   850: aload_3
    //   851: putfield g : Ljava/io/Serializable;
    //   854: aload #13
    //   856: aconst_null
    //   857: putfield h : Ln81;
    //   860: aload #13
    //   862: aconst_null
    //   863: putfield i : Lme1;
    //   866: aload #13
    //   868: aconst_null
    //   869: putfield j : Los;
    //   872: aload #13
    //   874: aconst_null
    //   875: putfield k : Lme1;
    //   878: aload #13
    //   880: iconst_4
    //   881: putfield o : I
    //   884: aload #9
    //   886: aload #10
    //   888: aload #13
    //   890: invokestatic l0 : (Los;Lad0;Lcs;)Ljava/lang/Object;
    //   893: astore #10
    //   895: aload #10
    //   897: aload #15
    //   899: if_acmpne -> 905
    //   902: aload #15
    //   904: areturn
    //   905: aload_2
    //   906: astore #8
    //   908: aload_3
    //   909: astore #9
    //   911: aload #10
    //   913: astore_2
    //   914: aload #9
    //   916: getfield b : Ljava/lang/Object;
    //   919: checkcast w81
    //   922: astore_3
    //   923: aload_3
    //   924: ifnull -> 972
    //   927: aload_3
    //   928: getfield d : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   931: iconst_0
    //   932: iconst_1
    //   933: invokevirtual compareAndSet : (ZZ)Z
    //   936: istore_1
    //   937: iload_1
    //   938: ifeq -> 951
    //   941: aload_3
    //   942: getfield a : Lyp;
    //   945: ldc_w 'ROLLBACK TRANSACTION'
    //   948: invokestatic n : (Lth1;Ljava/lang/String;)V
    //   951: aload_3
    //   952: getfield a : Lyp;
    //   955: astore_3
    //   956: aload_3
    //   957: aconst_null
    //   958: putfield e : Los;
    //   961: aload_3
    //   962: aconst_null
    //   963: putfield f : Ljava/lang/Throwable;
    //   966: aload #8
    //   968: aload_3
    //   969: invokevirtual d : (Lyp;)V
    //   972: aload_2
    //   973: areturn
    //   974: new java/lang/IllegalArgumentException
    //   977: astore #8
    //   979: aload #8
    //   981: ldc_w 'Required value was null.'
    //   984: invokespecial <init> : (Ljava/lang/String;)V
    //   987: aload #8
    //   989: athrow
    //   990: aload #10
    //   992: athrow
    //   993: aload #9
    //   995: iload_1
    //   996: invokevirtual a : (Z)V
    //   999: aconst_null
    //   1000: athrow
    //   1001: astore #8
    //   1003: aload_2
    //   1004: astore #9
    //   1006: aload_3
    //   1007: astore_2
    //   1008: aload #9
    //   1010: astore_3
    //   1011: aload #8
    //   1013: athrow
    //   1014: astore #9
    //   1016: aload_2
    //   1017: getfield b : Ljava/lang/Object;
    //   1020: checkcast w81
    //   1023: astore_2
    //   1024: aload_2
    //   1025: ifnull -> 1082
    //   1028: aload_2
    //   1029: getfield d : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   1032: iconst_0
    //   1033: iconst_1
    //   1034: invokevirtual compareAndSet : (ZZ)Z
    //   1037: istore_1
    //   1038: iload_1
    //   1039: ifeq -> 1052
    //   1042: aload_2
    //   1043: getfield a : Lyp;
    //   1046: ldc_w 'ROLLBACK TRANSACTION'
    //   1049: invokestatic n : (Lth1;Ljava/lang/String;)V
    //   1052: aload_2
    //   1053: getfield a : Lyp;
    //   1056: astore_2
    //   1057: aload_2
    //   1058: aconst_null
    //   1059: putfield e : Los;
    //   1062: aload_2
    //   1063: aconst_null
    //   1064: putfield f : Ljava/lang/Throwable;
    //   1067: aload_3
    //   1068: aload_2
    //   1069: invokevirtual d : (Lyp;)V
    //   1072: goto -> 1082
    //   1075: astore_2
    //   1076: aload #8
    //   1078: aload_2
    //   1079: invokestatic a : (Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   1082: aload #9
    //   1084: athrow
    //   1085: ldc_w 'Connection pool is closed'
    //   1088: bipush #21
    //   1090: invokestatic V : (Ljava/lang/String;I)V
    //   1093: aconst_null
    //   1094: athrow
    //   1095: astore_3
    //   1096: goto -> 972
    //   1099: astore #9
    //   1101: goto -> 951
    //   1104: astore #10
    //   1106: goto -> 1052
    // Exception table:
    //   from	to	target	type
    //   133	138	151	finally
    //   222	227	240	finally
    //   517	532	1001	finally
    //   532	620	636	finally
    //   641	651	733	finally
    //   656	704	733	finally
    //   717	726	733	finally
    //   749	763	733	finally
    //   773	895	733	finally
    //   914	923	1095	finally
    //   927	937	1095	finally
    //   941	951	1099	android/database/SQLException
    //   941	951	1095	finally
    //   951	972	1095	finally
    //   974	990	733	finally
    //   990	993	733	finally
    //   993	1001	733	finally
    //   1011	1014	1014	finally
    //   1016	1024	1075	finally
    //   1028	1038	1075	finally
    //   1042	1052	1104	android/database/SQLException
    //   1042	1052	1075	finally
    //   1052	1072	1075	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\rp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */