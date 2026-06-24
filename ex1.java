public final class ex1 extends pr1 implements ad0 {
  public final int g;
  
  public int h;
  
  public Object i;
  
  public final jx1 j;
  
  public final Object g(Object paramObject1, Object paramObject2) {
    int i = this.g;
    l02 l02 = l02.a;
    switch (i) {
      default:
        paramObject1 = paramObject1;
        return ((ex1)l((cs)paramObject2, paramObject1)).n(l02);
      case 1:
        paramObject1 = paramObject1;
        return ((ex1)l((cs)paramObject2, paramObject1)).n(l02);
      case 0:
        break;
    } 
    paramObject1 = paramObject1;
    return ((ex1)l((cs)paramObject2, paramObject1)).n(l02);
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    int i = this.g;
    jx1 jx11 = this.j;
    switch (i) {
      default:
        paramcs = new ex1(jx11, paramcs, 2);
        ((ex1)paramcs).i = paramObject;
        return paramcs;
      case 1:
        paramcs = new ex1(jx11, paramcs, 1);
        ((ex1)paramcs).i = paramObject;
        return paramcs;
      case 0:
        break;
    } 
    paramcs = new ex1(jx11, paramcs, 0);
    ((ex1)paramcs).i = paramObject;
    return paramcs;
  }
  
  public final Object n(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield g : I
    //   4: istore_2
    //   5: getstatic aw1.c : Law1;
    //   8: astore #10
    //   10: getstatic ys.b : Lys;
    //   13: astore #6
    //   15: aload_0
    //   16: getfield j : Ljx1;
    //   19: astore #11
    //   21: iload_2
    //   22: tableswitch default -> 44, 0 -> 583, 1 -> 396
    //   44: aload_0
    //   45: getfield h : I
    //   48: istore_2
    //   49: getstatic l02.a : Ll02;
    //   52: astore #8
    //   54: iload_2
    //   55: ifeq -> 106
    //   58: iload_2
    //   59: iconst_1
    //   60: if_icmpeq -> 90
    //   63: iload_2
    //   64: iconst_2
    //   65: if_icmpne -> 79
    //   68: aload_1
    //   69: invokestatic r0 : (Ljava/lang/Object;)V
    //   72: aload #8
    //   74: astore #6
    //   76: goto -> 386
    //   79: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   81: invokestatic f : (Ljava/lang/String;)V
    //   84: aconst_null
    //   85: astore #6
    //   87: goto -> 386
    //   90: aload_0
    //   91: getfield i : Ljava/lang/Object;
    //   94: checkcast bw1
    //   97: astore #7
    //   99: aload_1
    //   100: invokestatic r0 : (Ljava/lang/Object;)V
    //   103: goto -> 153
    //   106: aload_1
    //   107: invokestatic r0 : (Ljava/lang/Object;)V
    //   110: aload_0
    //   111: getfield i : Ljava/lang/Object;
    //   114: checkcast bw1
    //   117: astore #7
    //   119: aload_0
    //   120: aload #7
    //   122: putfield i : Ljava/lang/Object;
    //   125: aload_0
    //   126: iconst_1
    //   127: putfield h : I
    //   130: aload #7
    //   132: aload_0
    //   133: invokeinterface c : (Lpr1;)Ljava/lang/Object;
    //   138: astore #9
    //   140: aload #9
    //   142: astore_1
    //   143: aload #9
    //   145: aload #6
    //   147: if_acmpne -> 153
    //   150: goto -> 386
    //   153: aload_1
    //   154: checkcast java/lang/Boolean
    //   157: invokevirtual booleanValue : ()Z
    //   160: ifeq -> 166
    //   163: goto -> 72
    //   166: aload #11
    //   168: getfield h : Lof;
    //   171: astore #14
    //   173: aload #14
    //   175: getfield c : Ljava/lang/Object;
    //   178: checkcast [J
    //   181: astore #13
    //   183: aload #14
    //   185: getfield b : Ljava/lang/Object;
    //   188: checkcast java/util/concurrent/locks/ReentrantLock
    //   191: astore #12
    //   193: aload #12
    //   195: invokevirtual lock : ()V
    //   198: aload #14
    //   200: getfield a : Z
    //   203: istore #5
    //   205: iload #5
    //   207: ifne -> 220
    //   210: aload #12
    //   212: invokevirtual unlock : ()V
    //   215: aconst_null
    //   216: astore_1
    //   217: goto -> 342
    //   220: aload #14
    //   222: iconst_0
    //   223: putfield a : Z
    //   226: aload #13
    //   228: arraylength
    //   229: istore #4
    //   231: iload #4
    //   233: anewarray k31
    //   236: astore #9
    //   238: iconst_0
    //   239: istore_2
    //   240: iconst_0
    //   241: istore_3
    //   242: iconst_0
    //   243: istore #5
    //   245: iload_2
    //   246: iload #4
    //   248: if_icmpge -> 325
    //   251: aload #13
    //   253: iload_2
    //   254: laload
    //   255: lconst_0
    //   256: lcmp
    //   257: ifle -> 263
    //   260: iconst_1
    //   261: istore #5
    //   263: aload #14
    //   265: getfield d : Ljava/lang/Object;
    //   268: checkcast [Z
    //   271: astore_1
    //   272: iload #5
    //   274: aload_1
    //   275: iload_2
    //   276: baload
    //   277: if_icmpeq -> 310
    //   280: aload_1
    //   281: iload_2
    //   282: iload #5
    //   284: bastore
    //   285: iload #5
    //   287: ifeq -> 303
    //   290: getstatic k31.c : Lk31;
    //   293: astore_1
    //   294: iconst_1
    //   295: istore_3
    //   296: goto -> 314
    //   299: astore_1
    //   300: goto -> 389
    //   303: getstatic k31.e : Lk31;
    //   306: astore_1
    //   307: goto -> 294
    //   310: getstatic k31.b : Lk31;
    //   313: astore_1
    //   314: aload #9
    //   316: iload_2
    //   317: aload_1
    //   318: aastore
    //   319: iinc #2, 1
    //   322: goto -> 242
    //   325: iload_3
    //   326: ifeq -> 335
    //   329: aload #9
    //   331: astore_1
    //   332: goto -> 337
    //   335: aconst_null
    //   336: astore_1
    //   337: aload #12
    //   339: invokevirtual unlock : ()V
    //   342: aload_1
    //   343: ifnull -> 72
    //   346: new ix1
    //   349: dup
    //   350: aload_1
    //   351: aload #11
    //   353: aload #7
    //   355: aconst_null
    //   356: invokespecial <init> : ([Lk31;Ljx1;Lbw1;Lcs;)V
    //   359: astore_1
    //   360: aload_0
    //   361: aconst_null
    //   362: putfield i : Ljava/lang/Object;
    //   365: aload_0
    //   366: iconst_2
    //   367: putfield h : I
    //   370: aload #7
    //   372: aload #10
    //   374: aload_1
    //   375: aload_0
    //   376: invokeinterface a : (Law1;Lad0;Lpr1;)Ljava/lang/Object;
    //   381: aload #6
    //   383: if_acmpne -> 72
    //   386: aload #6
    //   388: areturn
    //   389: aload #12
    //   391: invokevirtual unlock : ()V
    //   394: aload_1
    //   395: athrow
    //   396: aload_0
    //   397: getfield h : I
    //   400: istore_2
    //   401: iload_2
    //   402: ifeq -> 454
    //   405: iload_2
    //   406: iconst_1
    //   407: if_icmpeq -> 432
    //   410: iload_2
    //   411: iconst_2
    //   412: if_icmpne -> 422
    //   415: aload_1
    //   416: invokestatic r0 : (Ljava/lang/Object;)V
    //   419: goto -> 569
    //   422: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   424: invokestatic f : (Ljava/lang/String;)V
    //   427: aconst_null
    //   428: astore_1
    //   429: goto -> 581
    //   432: aload_0
    //   433: getfield i : Ljava/lang/Object;
    //   436: checkcast bw1
    //   439: astore #8
    //   441: aload_1
    //   442: invokestatic r0 : (Ljava/lang/Object;)V
    //   445: aload_1
    //   446: astore #7
    //   448: aload #8
    //   450: astore_1
    //   451: goto -> 502
    //   454: aload_1
    //   455: invokestatic r0 : (Ljava/lang/Object;)V
    //   458: aload_0
    //   459: getfield i : Ljava/lang/Object;
    //   462: checkcast bw1
    //   465: astore_1
    //   466: aload_0
    //   467: aload_1
    //   468: putfield i : Ljava/lang/Object;
    //   471: aload_0
    //   472: iconst_1
    //   473: putfield h : I
    //   476: aload_1
    //   477: aload_0
    //   478: invokeinterface c : (Lpr1;)Ljava/lang/Object;
    //   483: astore #8
    //   485: aload #8
    //   487: astore #7
    //   489: aload #8
    //   491: aload #6
    //   493: if_acmpne -> 502
    //   496: aload #6
    //   498: astore_1
    //   499: goto -> 581
    //   502: aload #7
    //   504: checkcast java/lang/Boolean
    //   507: invokevirtual booleanValue : ()Z
    //   510: ifeq -> 516
    //   513: goto -> 577
    //   516: new ex1
    //   519: astore #7
    //   521: aload #7
    //   523: aload #11
    //   525: aconst_null
    //   526: iconst_0
    //   527: invokespecial <init> : (Ljx1;Lcs;I)V
    //   530: aload_0
    //   531: aconst_null
    //   532: putfield i : Ljava/lang/Object;
    //   535: aload_0
    //   536: iconst_2
    //   537: putfield h : I
    //   540: aload_1
    //   541: aload #10
    //   543: aload #7
    //   545: aload_0
    //   546: invokeinterface a : (Law1;Lad0;Lpr1;)Ljava/lang/Object;
    //   551: astore #7
    //   553: aload #7
    //   555: astore_1
    //   556: aload #7
    //   558: aload #6
    //   560: if_acmpne -> 569
    //   563: aload #6
    //   565: astore_1
    //   566: goto -> 581
    //   569: aload_1
    //   570: checkcast java/util/Set
    //   573: astore_1
    //   574: goto -> 581
    //   577: getstatic f40.b : Lf40;
    //   580: astore_1
    //   581: aload_1
    //   582: areturn
    //   583: aload_0
    //   584: getfield h : I
    //   587: istore_2
    //   588: iload_2
    //   589: ifeq -> 614
    //   592: iload_2
    //   593: iconst_1
    //   594: if_icmpne -> 604
    //   597: aload_1
    //   598: invokestatic r0 : (Ljava/lang/Object;)V
    //   601: goto -> 653
    //   604: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   606: invokestatic f : (Ljava/lang/String;)V
    //   609: aconst_null
    //   610: astore_1
    //   611: goto -> 653
    //   614: aload_1
    //   615: invokestatic r0 : (Ljava/lang/Object;)V
    //   618: aload_0
    //   619: getfield i : Ljava/lang/Object;
    //   622: checkcast q81
    //   625: astore_1
    //   626: aload_0
    //   627: iconst_1
    //   628: putfield h : I
    //   631: aload #11
    //   633: aload_1
    //   634: aload_0
    //   635: invokestatic a : (Ljx1;Lo81;Lds;)Ljava/lang/Object;
    //   638: astore #7
    //   640: aload #7
    //   642: astore_1
    //   643: aload #7
    //   645: aload #6
    //   647: if_acmpne -> 653
    //   650: aload #6
    //   652: astore_1
    //   653: aload_1
    //   654: areturn
    //   655: astore_1
    //   656: goto -> 577
    // Exception table:
    //   from	to	target	type
    //   198	205	299	finally
    //   220	238	299	finally
    //   263	272	299	finally
    //   290	294	299	finally
    //   303	307	299	finally
    //   310	314	299	finally
    //   415	419	655	android/database/SQLException
    //   516	553	655	android/database/SQLException
    //   569	574	655	android/database/SQLException
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ex1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */