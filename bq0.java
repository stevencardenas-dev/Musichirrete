public final class bq0 extends pr1 implements ad0 {
  public final int g;
  
  public int h;
  
  public final Object i;
  
  public final Object j;
  
  public Object k;
  
  public Object l;
  
  public final Object m;
  
  public bq0(km0 paramkm0, iq0 paramiq01, iq0 paramiq02, String paramString1, String paramString2, cs paramcs) {
    super(2, paramcs);
  }
  
  public bq0(vj0 paramvj0, km0 paramkm0, iq0 paramiq0, wc0 paramwc0, cs paramcs) {
    super(2, paramcs);
  }
  
  public bq0(wm0 paramwm0, xs paramxs, u20 paramu20, cs paramcs) {
    super(2, paramcs);
  }
  
  public final Object g(Object paramObject1, Object paramObject2) {
    int i = this.g;
    l02 l02 = l02.a;
    paramObject1 = paramObject1;
    paramObject2 = paramObject2;
    switch (i) {
      default:
        return ((bq0)l((cs)paramObject2, paramObject1)).n(l02);
      case 1:
        return ((bq0)l((cs)paramObject2, paramObject1)).n(l02);
      case 0:
        break;
    } 
    return ((bq0)l((cs)paramObject2, paramObject1)).n(l02);
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    int i = this.g;
    Object object1 = this.m;
    Object object3 = this.j;
    Object object2 = this.i;
    switch (i) {
      default:
        return new bq0((wm0)object2, (xs)object3, (u20)object1, paramcs);
      case 1:
        return new bq0((km0)object2, (iq0)object3, (iq0)this.k, (String)this.l, (String)object1, paramcs);
      case 0:
        break;
    } 
    paramcs = new bq0((vj0)this.l, (km0)object2, (iq0)object3, (wc0)object1, paramcs);
    ((bq0)paramcs).k = paramObject;
    return paramcs;
  }
  
  public final Object n(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : I
    //   4: istore_2
    //   5: aload_0
    //   6: getfield m : Ljava/lang/Object;
    //   9: astore #7
    //   11: aload_0
    //   12: getfield j : Ljava/lang/Object;
    //   15: astore #8
    //   17: getstatic ys.b : Lys;
    //   20: astore #4
    //   22: aload_0
    //   23: getfield i : Ljava/lang/Object;
    //   26: astore #5
    //   28: getstatic l02.a : Ll02;
    //   31: astore_3
    //   32: iload_2
    //   33: tableswitch default -> 56, 0 -> 502, 1 -> 391
    //   56: aload #5
    //   58: checkcast wm0
    //   61: astore #6
    //   63: aload_0
    //   64: getfield h : I
    //   67: istore_2
    //   68: iload_2
    //   69: ifeq -> 120
    //   72: iload_2
    //   73: iconst_1
    //   74: if_icmpne -> 109
    //   77: aload_0
    //   78: getfield l : Ljava/lang/Object;
    //   81: checkcast me1
    //   84: astore #5
    //   86: aload_0
    //   87: getfield k : Ljava/lang/Object;
    //   90: checkcast me1
    //   93: astore #4
    //   95: aload_1
    //   96: invokestatic r0 : (Ljava/lang/Object;)V
    //   99: aload #5
    //   101: astore_1
    //   102: goto -> 293
    //   105: astore_1
    //   106: goto -> 350
    //   109: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   111: invokestatic f : (Ljava/lang/String;)V
    //   114: aconst_null
    //   115: astore #4
    //   117: goto -> 337
    //   120: aload_1
    //   121: invokestatic r0 : (Ljava/lang/Object;)V
    //   124: aload #6
    //   126: getfield i : Ljava/lang/Object;
    //   129: checkcast pm0
    //   132: getstatic pm0.b : Lpm0;
    //   135: if_acmpne -> 141
    //   138: goto -> 334
    //   141: new java/lang/Object
    //   144: dup
    //   145: invokespecial <init> : ()V
    //   148: astore #5
    //   150: new java/lang/Object
    //   153: dup
    //   154: invokespecial <init> : ()V
    //   157: astore_1
    //   158: aload #8
    //   160: checkcast xs
    //   163: astore #8
    //   165: aload #7
    //   167: checkcast u20
    //   170: astore #11
    //   172: aload_0
    //   173: aload #5
    //   175: putfield k : Ljava/lang/Object;
    //   178: aload_0
    //   179: aload_1
    //   180: putfield l : Ljava/lang/Object;
    //   183: aload_0
    //   184: iconst_1
    //   185: putfield h : I
    //   188: new ni
    //   191: astore #7
    //   193: aload #7
    //   195: iconst_1
    //   196: aload_0
    //   197: invokestatic N : (Lcs;)Lcs;
    //   200: invokespecial <init> : (ILcs;)V
    //   203: aload #7
    //   205: invokevirtual x : ()V
    //   208: getstatic om0.Companion : Lmm0;
    //   211: invokevirtual getClass : ()Ljava/lang/Class;
    //   214: pop
    //   215: getstatic om0.ON_START : Lom0;
    //   218: astore #13
    //   220: getstatic om0.ON_STOP : Lom0;
    //   223: astore #9
    //   225: new yz0
    //   228: astore #12
    //   230: aload #12
    //   232: invokespecial <init> : ()V
    //   235: new sf1
    //   238: astore #10
    //   240: aload #10
    //   242: aload #13
    //   244: aload #5
    //   246: aload #8
    //   248: aload #9
    //   250: aload #7
    //   252: aload #12
    //   254: aload #11
    //   256: invokespecial <init> : (Lom0;Lme1;Lxs;Lom0;Lni;Lyz0;Lu20;)V
    //   259: aload_1
    //   260: aload #10
    //   262: putfield b : Ljava/lang/Object;
    //   265: aload #6
    //   267: aload #10
    //   269: invokevirtual a : (Lsm0;)V
    //   272: aload #7
    //   274: invokevirtual v : ()Ljava/lang/Object;
    //   277: astore #7
    //   279: aload #7
    //   281: aload #4
    //   283: if_acmpne -> 289
    //   286: goto -> 337
    //   289: aload #5
    //   291: astore #4
    //   293: aload #4
    //   295: getfield b : Ljava/lang/Object;
    //   298: checkcast vj0
    //   301: astore #4
    //   303: aload #4
    //   305: ifnull -> 316
    //   308: aload #4
    //   310: aconst_null
    //   311: invokeinterface c : (Ljava/util/concurrent/CancellationException;)V
    //   316: aload_1
    //   317: getfield b : Ljava/lang/Object;
    //   320: checkcast sm0
    //   323: astore_1
    //   324: aload_1
    //   325: ifnull -> 334
    //   328: aload #6
    //   330: aload_1
    //   331: invokevirtual g : (Lsm0;)V
    //   334: aload_3
    //   335: astore #4
    //   337: aload #4
    //   339: areturn
    //   340: astore_3
    //   341: aload #5
    //   343: astore #4
    //   345: aload_1
    //   346: astore #5
    //   348: aload_3
    //   349: astore_1
    //   350: aload #4
    //   352: getfield b : Ljava/lang/Object;
    //   355: checkcast vj0
    //   358: astore_3
    //   359: aload_3
    //   360: ifnull -> 370
    //   363: aload_3
    //   364: aconst_null
    //   365: invokeinterface c : (Ljava/util/concurrent/CancellationException;)V
    //   370: aload #5
    //   372: getfield b : Ljava/lang/Object;
    //   375: checkcast sm0
    //   378: astore_3
    //   379: aload_3
    //   380: ifnull -> 389
    //   383: aload #6
    //   385: aload_3
    //   386: invokevirtual g : (Lsm0;)V
    //   389: aload_1
    //   390: athrow
    //   391: aload_0
    //   392: getfield h : I
    //   395: istore_2
    //   396: iload_2
    //   397: ifeq -> 423
    //   400: iload_2
    //   401: iconst_1
    //   402: if_icmpne -> 412
    //   405: aload_1
    //   406: invokestatic r0 : (Ljava/lang/Object;)V
    //   409: goto -> 496
    //   412: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   414: invokestatic f : (Ljava/lang/String;)V
    //   417: aconst_null
    //   418: astore #4
    //   420: goto -> 499
    //   423: aload_1
    //   424: invokestatic r0 : (Ljava/lang/Object;)V
    //   427: getstatic cq0.a : Lcs1;
    //   430: astore_1
    //   431: aload #5
    //   433: checkcast km0
    //   436: astore_1
    //   437: new aq0
    //   440: dup
    //   441: aload #8
    //   443: checkcast iq0
    //   446: invokestatic o : ()Liq0;
    //   449: aload_0
    //   450: getfield k : Ljava/lang/Object;
    //   453: checkcast iq0
    //   456: aconst_null
    //   457: aconst_null
    //   458: aconst_null
    //   459: aload_0
    //   460: getfield l : Ljava/lang/Object;
    //   463: checkcast java/lang/String
    //   466: aload #7
    //   468: checkcast java/lang/String
    //   471: invokespecial <init> : (Liq0;Liq0;Liq0;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   474: astore #5
    //   476: aload_0
    //   477: iconst_1
    //   478: putfield h : I
    //   481: aload_1
    //   482: aload #5
    //   484: aload_0
    //   485: invokestatic p : (Lkm0;Laq0;Lpr1;)Ljava/lang/Object;
    //   488: aload #4
    //   490: if_acmpne -> 496
    //   493: goto -> 499
    //   496: aload_3
    //   497: astore #4
    //   499: aload #4
    //   501: areturn
    //   502: aload_0
    //   503: getfield k : Ljava/lang/Object;
    //   506: checkcast xs
    //   509: astore #6
    //   511: aload_0
    //   512: getfield h : I
    //   515: istore_2
    //   516: iload_2
    //   517: ifeq -> 543
    //   520: iload_2
    //   521: iconst_1
    //   522: if_icmpne -> 532
    //   525: aload_1
    //   526: invokestatic r0 : (Ljava/lang/Object;)V
    //   529: goto -> 633
    //   532: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   534: invokestatic f : (Ljava/lang/String;)V
    //   537: aconst_null
    //   538: astore #4
    //   540: goto -> 658
    //   543: aload_1
    //   544: invokestatic r0 : (Ljava/lang/Object;)V
    //   547: aload_0
    //   548: getfield l : Ljava/lang/Object;
    //   551: checkcast vj0
    //   554: astore_1
    //   555: aload_1
    //   556: ifnull -> 566
    //   559: aload_1
    //   560: aconst_null
    //   561: invokeinterface c : (Ljava/util/concurrent/CancellationException;)V
    //   566: getstatic cq0.a : Lcs1;
    //   569: astore_1
    //   570: aload #5
    //   572: checkcast km0
    //   575: astore_1
    //   576: aload #8
    //   578: checkcast iq0
    //   581: astore #8
    //   583: aload_0
    //   584: aload #6
    //   586: putfield k : Ljava/lang/Object;
    //   589: aload_0
    //   590: iconst_1
    //   591: putfield h : I
    //   594: getstatic e00.a : Lyw;
    //   597: astore #5
    //   599: getstatic fw.e : Lfw;
    //   602: new vq
    //   605: dup
    //   606: aload_1
    //   607: aload #8
    //   609: aconst_null
    //   610: iconst_2
    //   611: invokespecial <init> : (Ljava/lang/Object;Ljava/io/Serializable;Lcs;I)V
    //   614: aload_0
    //   615: invokestatic l0 : (Los;Lad0;Lcs;)Ljava/lang/Object;
    //   618: astore #5
    //   620: aload #5
    //   622: astore_1
    //   623: aload #5
    //   625: aload #4
    //   627: if_acmpne -> 633
    //   630: goto -> 658
    //   633: aload_1
    //   634: checkcast aq0
    //   637: astore_1
    //   638: aload #6
    //   640: invokestatic q : (Lxs;)V
    //   643: aload #7
    //   645: checkcast wc0
    //   648: aload_1
    //   649: invokeinterface h : (Ljava/lang/Object;)Ljava/lang/Object;
    //   654: pop
    //   655: aload_3
    //   656: astore #4
    //   658: aload #4
    //   660: areturn
    // Exception table:
    //   from	to	target	type
    //   95	99	105	finally
    //   158	279	340	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bq0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */