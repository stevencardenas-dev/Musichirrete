public final class i90 implements x80 {
  public final int b;
  
  public final Object c;
  
  public final Object e;
  
  public final hd0 f;
  
  public i90(x80 paramx80, eh1 parameh1, ps paramps) {
    this.c = paramx80;
    this.e = parameh1;
    this.f = paramps;
  }
  
  public i90(x80 paramx80, os paramos) {
    this.c = paramos;
    this.e = wf2.g0(paramos);
    this.f = new sc(paramx80, null, 11);
  }
  
  public final Object k(Object paramObject, cs paramcs) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: istore_3
    //   5: getstatic l02.a : Ll02;
    //   8: astore #4
    //   10: getstatic ys.b : Lys;
    //   13: astore #7
    //   15: aload_0
    //   16: getfield f : Lhd0;
    //   19: astore #8
    //   21: aload_0
    //   22: getfield e : Ljava/lang/Object;
    //   25: astore #9
    //   27: aload_0
    //   28: getfield c : Ljava/lang/Object;
    //   31: astore #10
    //   33: iload_3
    //   34: tableswitch default -> 52, 0 -> 82
    //   52: aload #10
    //   54: checkcast os
    //   57: aload_1
    //   58: aload #9
    //   60: aload #8
    //   62: checkcast sc
    //   65: aload_2
    //   66: invokestatic q0 : (Los;Ljava/lang/Object;Ljava/lang/Object;Lad0;Lcs;)Ljava/lang/Object;
    //   69: astore_1
    //   70: aload_1
    //   71: aload #7
    //   73: if_acmpne -> 79
    //   76: aload_1
    //   77: astore #4
    //   79: aload #4
    //   81: areturn
    //   82: aload_2
    //   83: instanceof h90
    //   86: ifeq -> 123
    //   89: aload_2
    //   90: checkcast h90
    //   93: astore #5
    //   95: aload #5
    //   97: getfield g : I
    //   100: istore_3
    //   101: iload_3
    //   102: ldc -2147483648
    //   104: iand
    //   105: ifeq -> 123
    //   108: aload #5
    //   110: iload_3
    //   111: ldc -2147483648
    //   113: iadd
    //   114: putfield g : I
    //   117: aload #5
    //   119: astore_2
    //   120: goto -> 133
    //   123: new h90
    //   126: dup
    //   127: aload_0
    //   128: aload_2
    //   129: invokespecial <init> : (Li90;Lcs;)V
    //   132: astore_2
    //   133: aload_2
    //   134: getfield f : Ljava/lang/Object;
    //   137: astore #6
    //   139: aload_2
    //   140: getfield g : I
    //   143: istore_3
    //   144: iload_3
    //   145: ifeq -> 194
    //   148: iload_3
    //   149: iconst_1
    //   150: if_icmpeq -> 180
    //   153: iload_3
    //   154: iconst_2
    //   155: if_icmpne -> 169
    //   158: aload #6
    //   160: invokestatic r0 : (Ljava/lang/Object;)V
    //   163: aload #4
    //   165: astore_1
    //   166: goto -> 286
    //   169: getstatic com/pavelsikun/seekbarpreference/lu/FgdLmmRfTxSFKI.xNEi : Ljava/lang/String;
    //   172: invokestatic f : (Ljava/lang/String;)V
    //   175: aconst_null
    //   176: astore_1
    //   177: goto -> 286
    //   180: aload_2
    //   181: getfield h : Lx80;
    //   184: astore #5
    //   186: aload #6
    //   188: invokestatic r0 : (Ljava/lang/Object;)V
    //   191: goto -> 255
    //   194: aload #6
    //   196: invokestatic r0 : (Ljava/lang/Object;)V
    //   199: aload #10
    //   201: checkcast x80
    //   204: astore #5
    //   206: aload_1
    //   207: checkcast java/util/Set
    //   210: astore_1
    //   211: aload #9
    //   213: checkcast eh1
    //   216: astore_1
    //   217: aload #8
    //   219: checkcast ps
    //   222: astore #6
    //   224: aload_2
    //   225: aload #5
    //   227: putfield h : Lx80;
    //   230: aload_2
    //   231: iconst_1
    //   232: putfield g : I
    //   235: aload_1
    //   236: iconst_1
    //   237: aload #6
    //   239: aload_2
    //   240: invokestatic O : (Leh1;ZLps;Lds;)Ljava/lang/Object;
    //   243: astore #6
    //   245: aload #6
    //   247: aload #7
    //   249: if_acmpne -> 255
    //   252: goto -> 283
    //   255: aload_2
    //   256: aconst_null
    //   257: putfield h : Lx80;
    //   260: aload_2
    //   261: iconst_2
    //   262: putfield g : I
    //   265: aload #4
    //   267: astore_1
    //   268: aload #5
    //   270: aload #6
    //   272: aload_2
    //   273: invokeinterface k : (Ljava/lang/Object;Lcs;)Ljava/lang/Object;
    //   278: aload #7
    //   280: if_acmpne -> 286
    //   283: aload #7
    //   285: astore_1
    //   286: aload_1
    //   287: areturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\i90.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */