public final class n00 implements x80 {
  public final int b;
  
  public final x80 c;
  
  public final me1 e;
  
  public n00(o00 paramo00, me1 paramme1, x80 paramx80) {
    this.e = paramme1;
    this.c = paramx80;
  }
  
  public n00(x80 paramx80, me1 paramme1) {
    this.c = paramx80;
    this.e = paramme1;
  }
  
  public final Object k(Object paramObject, cs paramcs) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: istore_3
    //   5: getstatic l02.a : Ll02;
    //   8: astore #4
    //   10: aload_0
    //   11: getfield c : Lx80;
    //   14: astore #7
    //   16: getstatic ys.b : Lys;
    //   19: astore #5
    //   21: iload_3
    //   22: tableswitch default -> 40, 0 -> 202
    //   40: aload_2
    //   41: instanceof b90
    //   44: ifeq -> 78
    //   47: aload_2
    //   48: checkcast b90
    //   51: astore #6
    //   53: aload #6
    //   55: getfield i : I
    //   58: istore_3
    //   59: iload_3
    //   60: ldc -2147483648
    //   62: iand
    //   63: ifeq -> 78
    //   66: aload #6
    //   68: iload_3
    //   69: ldc -2147483648
    //   71: iadd
    //   72: putfield i : I
    //   75: goto -> 89
    //   78: new b90
    //   81: dup
    //   82: aload_0
    //   83: aload_2
    //   84: invokespecial <init> : (Ln00;Lcs;)V
    //   87: astore #6
    //   89: aload #6
    //   91: getfield g : Ljava/lang/Object;
    //   94: astore #8
    //   96: aload #6
    //   98: getfield i : I
    //   101: istore_3
    //   102: iload_3
    //   103: ifeq -> 142
    //   106: iload_3
    //   107: iconst_1
    //   108: if_icmpne -> 132
    //   111: aload #6
    //   113: getfield f : Ln00;
    //   116: astore_2
    //   117: aload #8
    //   119: invokestatic r0 : (Ljava/lang/Object;)V
    //   122: aload #4
    //   124: astore_1
    //   125: goto -> 190
    //   128: astore_1
    //   129: goto -> 192
    //   132: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   134: invokestatic f : (Ljava/lang/String;)V
    //   137: aconst_null
    //   138: astore_1
    //   139: goto -> 190
    //   142: aload #8
    //   144: invokestatic r0 : (Ljava/lang/Object;)V
    //   147: aload_0
    //   148: astore_2
    //   149: aload #6
    //   151: aload_0
    //   152: putfield f : Ln00;
    //   155: aload_0
    //   156: astore_2
    //   157: aload #6
    //   159: iconst_1
    //   160: putfield i : I
    //   163: aload_0
    //   164: astore_2
    //   165: aload #7
    //   167: aload_1
    //   168: aload #6
    //   170: invokeinterface k : (Ljava/lang/Object;Lcs;)Ljava/lang/Object;
    //   175: astore #6
    //   177: aload #4
    //   179: astore_1
    //   180: aload #6
    //   182: aload #5
    //   184: if_acmpne -> 190
    //   187: aload #5
    //   189: astore_1
    //   190: aload_1
    //   191: areturn
    //   192: aload_2
    //   193: getfield e : Lme1;
    //   196: aload_1
    //   197: putfield b : Ljava/lang/Object;
    //   200: aload_1
    //   201: athrow
    //   202: aload_2
    //   203: instanceof m00
    //   206: ifeq -> 240
    //   209: aload_2
    //   210: checkcast m00
    //   213: astore #6
    //   215: aload #6
    //   217: getfield h : I
    //   220: istore_3
    //   221: iload_3
    //   222: ldc -2147483648
    //   224: iand
    //   225: ifeq -> 240
    //   228: aload #6
    //   230: iload_3
    //   231: ldc -2147483648
    //   233: iadd
    //   234: putfield h : I
    //   237: goto -> 251
    //   240: new m00
    //   243: dup
    //   244: aload_0
    //   245: aload_2
    //   246: invokespecial <init> : (Ln00;Lcs;)V
    //   249: astore #6
    //   251: aload #6
    //   253: getfield f : Ljava/lang/Object;
    //   256: astore_2
    //   257: aload #6
    //   259: getfield h : I
    //   262: istore_3
    //   263: iload_3
    //   264: ifeq -> 292
    //   267: iload_3
    //   268: iconst_1
    //   269: if_icmpne -> 282
    //   272: aload_2
    //   273: invokestatic r0 : (Ljava/lang/Object;)V
    //   276: aload #4
    //   278: astore_2
    //   279: goto -> 362
    //   282: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   284: invokestatic f : (Ljava/lang/String;)V
    //   287: aconst_null
    //   288: astore_2
    //   289: goto -> 362
    //   292: aload_2
    //   293: invokestatic r0 : (Ljava/lang/Object;)V
    //   296: aload_0
    //   297: getfield e : Lme1;
    //   300: astore #8
    //   302: aload #8
    //   304: getfield b : Ljava/lang/Object;
    //   307: astore #9
    //   309: aload #9
    //   311: getstatic dd1.f : Lf1;
    //   314: if_acmpeq -> 329
    //   317: aload #4
    //   319: astore_2
    //   320: aload #9
    //   322: aload_1
    //   323: invokestatic c : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   326: ifne -> 362
    //   329: aload #8
    //   331: aload_1
    //   332: putfield b : Ljava/lang/Object;
    //   335: aload #6
    //   337: iconst_1
    //   338: putfield h : I
    //   341: aload #4
    //   343: astore_2
    //   344: aload #7
    //   346: aload_1
    //   347: aload #6
    //   349: invokeinterface k : (Ljava/lang/Object;Lcs;)Ljava/lang/Object;
    //   354: aload #5
    //   356: if_acmpne -> 362
    //   359: aload #5
    //   361: astore_2
    //   362: aload_2
    //   363: areturn
    // Exception table:
    //   from	to	target	type
    //   117	122	128	finally
    //   149	155	128	finally
    //   157	163	128	finally
    //   165	177	128	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n00.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */