public final class d90 implements w80 {
  public final int b;
  
  public final w80 c;
  
  public final hd0 e;
  
  public final Object a(x80 paramx80, cs paramcs) {
    // Byte code:
    //   0: aload_0
    //   1: astore #10
    //   3: aload #10
    //   5: getfield b : I
    //   8: istore_3
    //   9: getstatic ys.b : Lys;
    //   12: astore #12
    //   14: getstatic l02.a : Ll02;
    //   17: astore #9
    //   19: iload_3
    //   20: tableswitch default -> 40, 0 -> 83
    //   40: new g90
    //   43: dup
    //   44: iconst_0
    //   45: aload_1
    //   46: aload #10
    //   48: getfield e : Lhd0;
    //   51: checkcast ad0
    //   54: invokespecial <init> : (ILjava/lang/Object;Ljava/lang/Object;)V
    //   57: astore_1
    //   58: aload #10
    //   60: getfield c : Lw80;
    //   63: aload_1
    //   64: aload_2
    //   65: invokeinterface a : (Lx80;Lcs;)Ljava/lang/Object;
    //   70: astore_1
    //   71: aload_1
    //   72: aload #12
    //   74: if_acmpne -> 80
    //   77: aload_1
    //   78: astore #9
    //   80: aload #9
    //   82: areturn
    //   83: aload_1
    //   84: astore #8
    //   86: aload_2
    //   87: instanceof c90
    //   90: ifeq -> 121
    //   93: aload_2
    //   94: checkcast c90
    //   97: astore_1
    //   98: aload_1
    //   99: getfield g : I
    //   102: istore_3
    //   103: iload_3
    //   104: ldc -2147483648
    //   106: iand
    //   107: ifeq -> 121
    //   110: aload_1
    //   111: iload_3
    //   112: ldc -2147483648
    //   114: iadd
    //   115: putfield g : I
    //   118: goto -> 132
    //   121: new c90
    //   124: dup
    //   125: aload #10
    //   127: aload_2
    //   128: invokespecial <init> : (Ld90;Lcs;)V
    //   131: astore_1
    //   132: aload_1
    //   133: getfield f : Ljava/lang/Object;
    //   136: astore #11
    //   138: aload_1
    //   139: getfield g : I
    //   142: istore_3
    //   143: iload_3
    //   144: ifeq -> 235
    //   147: iload_3
    //   148: iconst_1
    //   149: if_icmpeq -> 204
    //   152: iload_3
    //   153: iconst_2
    //   154: if_icmpne -> 194
    //   157: aload_1
    //   158: getfield l : J
    //   161: lstore #4
    //   163: aload_1
    //   164: getfield k : Ljava/lang/Throwable;
    //   167: astore #10
    //   169: aload_1
    //   170: getfield j : Lx80;
    //   173: astore_2
    //   174: aload_1
    //   175: getfield i : Ld90;
    //   178: astore #13
    //   180: aload #11
    //   182: invokestatic r0 : (Ljava/lang/Object;)V
    //   185: aload_1
    //   186: astore #8
    //   188: aload #13
    //   190: astore_1
    //   191: goto -> 441
    //   194: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   196: invokestatic f : (Ljava/lang/String;)V
    //   199: aconst_null
    //   200: astore_1
    //   201: goto -> 478
    //   204: aload_1
    //   205: getfield l : J
    //   208: lstore #4
    //   210: aload_1
    //   211: getfield j : Lx80;
    //   214: astore_2
    //   215: aload_1
    //   216: getfield i : Ld90;
    //   219: astore #10
    //   221: aload #11
    //   223: invokestatic r0 : (Ljava/lang/Object;)V
    //   226: aload_1
    //   227: astore #8
    //   229: aload #10
    //   231: astore_1
    //   232: goto -> 315
    //   235: aload #11
    //   237: invokestatic r0 : (Ljava/lang/Object;)V
    //   240: lconst_0
    //   241: lstore #4
    //   243: aload #8
    //   245: astore_2
    //   246: aload_1
    //   247: astore #8
    //   249: aload #10
    //   251: astore_1
    //   252: aload_1
    //   253: getfield c : Lw80;
    //   256: checkcast j90
    //   259: astore #10
    //   261: aload #8
    //   263: aload_1
    //   264: putfield i : Ld90;
    //   267: aload #8
    //   269: aload_2
    //   270: putfield j : Lx80;
    //   273: aload #8
    //   275: aconst_null
    //   276: putfield k : Ljava/lang/Throwable;
    //   279: aload #8
    //   281: lload #4
    //   283: putfield l : J
    //   286: aload #8
    //   288: iconst_1
    //   289: putfield g : I
    //   292: aload #10
    //   294: aload_2
    //   295: aload #8
    //   297: invokestatic f : (Lj90;Lx80;Lds;)Ljava/io/Serializable;
    //   300: astore #11
    //   302: aload #11
    //   304: aload #12
    //   306: if_acmpne -> 315
    //   309: aload #12
    //   311: astore_1
    //   312: goto -> 478
    //   315: aload #11
    //   317: checkcast java/lang/Throwable
    //   320: astore #10
    //   322: aload #10
    //   324: ifnull -> 466
    //   327: aload_1
    //   328: getfield e : Lhd0;
    //   331: astore #11
    //   333: new java/lang/Long
    //   336: dup
    //   337: lload #4
    //   339: invokespecial <init> : (J)V
    //   342: astore #11
    //   344: aload #8
    //   346: aload_1
    //   347: putfield i : Ld90;
    //   350: aload #8
    //   352: aload_2
    //   353: putfield j : Lx80;
    //   356: aload #8
    //   358: aload #10
    //   360: putfield k : Ljava/lang/Throwable;
    //   363: aload #8
    //   365: lload #4
    //   367: putfield l : J
    //   370: aload #8
    //   372: iconst_2
    //   373: putfield g : I
    //   376: aload #11
    //   378: checkcast java/lang/Number
    //   381: invokevirtual longValue : ()J
    //   384: lstore #6
    //   386: new pr1
    //   389: dup
    //   390: iconst_4
    //   391: aload #8
    //   393: checkcast cs
    //   396: invokespecial <init> : (ILcs;)V
    //   399: astore #11
    //   401: aload #11
    //   403: aload #10
    //   405: putfield h : Ljava/lang/Throwable;
    //   408: aload #11
    //   410: lload #6
    //   412: putfield i : J
    //   415: aload #11
    //   417: aload #9
    //   419: invokevirtual n : (Ljava/lang/Object;)Ljava/lang/Object;
    //   422: astore #13
    //   424: aload #13
    //   426: astore #11
    //   428: aload #13
    //   430: aload #12
    //   432: if_acmpne -> 441
    //   435: aload #12
    //   437: astore_1
    //   438: goto -> 478
    //   441: aload #11
    //   443: checkcast java/lang/Boolean
    //   446: invokevirtual booleanValue : ()Z
    //   449: ifeq -> 463
    //   452: lload #4
    //   454: lconst_1
    //   455: ladd
    //   456: lstore #4
    //   458: iconst_1
    //   459: istore_3
    //   460: goto -> 471
    //   463: aload #10
    //   465: athrow
    //   466: iconst_0
    //   467: istore_3
    //   468: goto -> 460
    //   471: iload_3
    //   472: ifne -> 480
    //   475: aload #9
    //   477: astore_1
    //   478: aload_1
    //   479: areturn
    //   480: goto -> 252
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d90.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */