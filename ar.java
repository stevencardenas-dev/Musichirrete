public final class ar implements w80 {
  public final int b;
  
  public final Object c;
  
  public final Object a(x80 paramx80, cs paramcs) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: istore_3
    //   5: aconst_null
    //   6: astore #6
    //   8: getstatic ys.b : Lys;
    //   11: astore #5
    //   13: aload_0
    //   14: getfield c : Ljava/lang/Object;
    //   17: astore #8
    //   19: getstatic l02.a : Ll02;
    //   22: astore #4
    //   24: iload_3
    //   25: tableswitch default -> 48, 0 -> 305, 1 -> 132
    //   48: aload #8
    //   50: checkcast [Lw80;
    //   53: astore #6
    //   55: new nn
    //   58: dup
    //   59: aload #6
    //   61: new tx1
    //   64: dup
    //   65: iconst_2
    //   66: aload #6
    //   68: invokespecial <init> : (ILjava/lang/Object;)V
    //   71: new pr1
    //   74: dup
    //   75: iconst_3
    //   76: aconst_null
    //   77: invokespecial <init> : (ILcs;)V
    //   80: aload_1
    //   81: aconst_null
    //   82: invokespecial <init> : ([Lw80;Ltx1;Ld72;Lx80;Lcs;)V
    //   85: astore_1
    //   86: new gj1
    //   89: dup
    //   90: aload_2
    //   91: aload_2
    //   92: invokeinterface e : ()Los;
    //   97: invokespecial <init> : (Lcs;Los;)V
    //   100: astore_2
    //   101: aload_2
    //   102: aload_2
    //   103: aload_1
    //   104: invokestatic U : (Lgj1;Lgj1;Lad0;)Ljava/lang/Object;
    //   107: astore_1
    //   108: aload_1
    //   109: aload #5
    //   111: if_acmpne -> 117
    //   114: goto -> 120
    //   117: aload #4
    //   119: astore_1
    //   120: aload_1
    //   121: aload #5
    //   123: if_acmpne -> 129
    //   126: aload_1
    //   127: astore #4
    //   129: aload #4
    //   131: areturn
    //   132: aload_2
    //   133: instanceof o
    //   136: ifeq -> 173
    //   139: aload_2
    //   140: checkcast o
    //   143: astore #7
    //   145: aload #7
    //   147: getfield i : I
    //   150: istore_3
    //   151: iload_3
    //   152: ldc -2147483648
    //   154: iand
    //   155: ifeq -> 173
    //   158: aload #7
    //   160: iload_3
    //   161: ldc -2147483648
    //   163: iadd
    //   164: putfield i : I
    //   167: aload #7
    //   169: astore_2
    //   170: goto -> 183
    //   173: new o
    //   176: dup
    //   177: aload_0
    //   178: aload_2
    //   179: invokespecial <init> : (Lar;Lcs;)V
    //   182: astore_2
    //   183: aload_2
    //   184: getfield g : Ljava/lang/Object;
    //   187: astore #7
    //   189: aload_2
    //   190: getfield i : I
    //   193: istore_3
    //   194: iload_3
    //   195: ifeq -> 238
    //   198: iload_3
    //   199: iconst_1
    //   200: if_icmpne -> 227
    //   203: aload_2
    //   204: getfield f : Lbi1;
    //   207: astore_1
    //   208: aload #7
    //   210: invokestatic r0 : (Ljava/lang/Object;)V
    //   213: aload_1
    //   214: invokevirtual o : ()V
    //   217: aload #4
    //   219: astore_1
    //   220: goto -> 290
    //   223: astore_2
    //   224: goto -> 299
    //   227: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   229: invokestatic f : (Ljava/lang/String;)V
    //   232: aload #6
    //   234: astore_1
    //   235: goto -> 290
    //   238: aload #7
    //   240: invokestatic r0 : (Ljava/lang/Object;)V
    //   243: aload_2
    //   244: getfield c : Los;
    //   247: astore #4
    //   249: aload #4
    //   251: invokevirtual getClass : ()Ljava/lang/Class;
    //   254: pop
    //   255: new bi1
    //   258: dup
    //   259: aload_1
    //   260: aload #4
    //   262: invokespecial <init> : (Lx80;Los;)V
    //   265: astore_1
    //   266: aload_2
    //   267: aload_1
    //   268: putfield f : Lbi1;
    //   271: aload_2
    //   272: iconst_1
    //   273: putfield i : I
    //   276: aload #8
    //   278: checkcast vq
    //   281: aload_1
    //   282: aload_2
    //   283: invokevirtual g : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   286: pop
    //   287: aload #5
    //   289: astore_1
    //   290: aload_1
    //   291: areturn
    //   292: goto -> 299
    //   295: astore_2
    //   296: goto -> 292
    //   299: aload_1
    //   300: invokevirtual o : ()V
    //   303: aload_2
    //   304: athrow
    //   305: aload #8
    //   307: checkcast d90
    //   310: new zq
    //   313: dup
    //   314: iconst_0
    //   315: aload_1
    //   316: invokespecial <init> : (ILjava/lang/Object;)V
    //   319: aload_2
    //   320: invokevirtual a : (Lx80;Lcs;)Ljava/lang/Object;
    //   323: astore_1
    //   324: aload_1
    //   325: aload #5
    //   327: if_acmpne -> 333
    //   330: aload_1
    //   331: astore #4
    //   333: aload #4
    //   335: areturn
    // Exception table:
    //   from	to	target	type
    //   208	213	223	finally
    //   266	287	295	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */