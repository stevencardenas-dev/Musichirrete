public final class ix1 extends pr1 implements ad0 {
  public k31[] g;
  
  public jx1 h;
  
  public bw1 i;
  
  public int j;
  
  public int k;
  
  public int l;
  
  public int m;
  
  public final k31[] n;
  
  public final jx1 o;
  
  public final bw1 p;
  
  public ix1(k31[] paramArrayOfk31, jx1 paramjx1, bw1 parambw1, cs paramcs) {
    super(2, paramcs);
  }
  
  public final Object g(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    return ((ix1)l((cs)paramObject2, paramObject1)).n(l02.a);
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    paramObject = this.o;
    bw1 bw11 = this.p;
    return new ix1(this.n, (jx1)paramObject, bw11, paramcs);
  }
  
  public final Object n(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield m : I
    //   4: istore_2
    //   5: iload_2
    //   6: ifeq -> 70
    //   9: iload_2
    //   10: iconst_1
    //   11: if_icmpeq -> 19
    //   14: iload_2
    //   15: iconst_2
    //   16: if_icmpne -> 63
    //   19: aload_0
    //   20: getfield l : I
    //   23: istore_3
    //   24: aload_0
    //   25: getfield k : I
    //   28: istore_2
    //   29: aload_0
    //   30: getfield j : I
    //   33: istore #4
    //   35: aload_0
    //   36: getfield i : Lbw1;
    //   39: astore #9
    //   41: aload_0
    //   42: getfield h : Ljx1;
    //   45: astore #7
    //   47: aload_0
    //   48: getfield g : [Lk31;
    //   51: astore #8
    //   53: aload_1
    //   54: invokestatic r0 : (Ljava/lang/Object;)V
    //   57: aload #9
    //   59: astore_1
    //   60: goto -> 205
    //   63: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   65: invokestatic f : (Ljava/lang/String;)V
    //   68: aconst_null
    //   69: areturn
    //   70: aload_1
    //   71: invokestatic r0 : (Ljava/lang/Object;)V
    //   74: aload_0
    //   75: getfield n : [Lk31;
    //   78: astore #8
    //   80: aload #8
    //   82: arraylength
    //   83: istore_3
    //   84: iconst_0
    //   85: istore_2
    //   86: aload_0
    //   87: getfield o : Ljx1;
    //   90: astore #7
    //   92: aload_0
    //   93: getfield p : Lbw1;
    //   96: astore_1
    //   97: iconst_0
    //   98: istore #4
    //   100: iload_2
    //   101: iload_3
    //   102: if_icmpge -> 281
    //   105: aload #8
    //   107: iload_2
    //   108: aaload
    //   109: astore #9
    //   111: iload #4
    //   113: iconst_1
    //   114: iadd
    //   115: istore #5
    //   117: aload #9
    //   119: invokevirtual ordinal : ()I
    //   122: istore #6
    //   124: iload #6
    //   126: ifeq -> 271
    //   129: getstatic ys.b : Lys;
    //   132: astore #9
    //   134: iload #6
    //   136: iconst_1
    //   137: if_icmpeq -> 216
    //   140: iload #6
    //   142: iconst_2
    //   143: if_icmpne -> 208
    //   146: aload_0
    //   147: aload #8
    //   149: putfield g : [Lk31;
    //   152: aload_0
    //   153: aload #7
    //   155: putfield h : Ljx1;
    //   158: aload_0
    //   159: aload_1
    //   160: putfield i : Lbw1;
    //   163: aload_0
    //   164: iload #5
    //   166: putfield j : I
    //   169: aload_0
    //   170: iload_2
    //   171: putfield k : I
    //   174: aload_0
    //   175: iload_3
    //   176: putfield l : I
    //   179: aload_0
    //   180: iconst_2
    //   181: putfield m : I
    //   184: aload #7
    //   186: aload_1
    //   187: iload #4
    //   189: aload_0
    //   190: invokestatic d : (Ljx1;Lbw1;ILds;)Ljava/lang/Object;
    //   193: aload #9
    //   195: if_acmpne -> 201
    //   198: goto -> 268
    //   201: iload #5
    //   203: istore #4
    //   205: goto -> 275
    //   208: new java/lang/RuntimeException
    //   211: dup
    //   212: invokespecial <init> : ()V
    //   215: athrow
    //   216: aload_0
    //   217: aload #8
    //   219: putfield g : [Lk31;
    //   222: aload_0
    //   223: aload #7
    //   225: putfield h : Ljx1;
    //   228: aload_0
    //   229: aload_1
    //   230: putfield i : Lbw1;
    //   233: aload_0
    //   234: iload #5
    //   236: putfield j : I
    //   239: aload_0
    //   240: iload_2
    //   241: putfield k : I
    //   244: aload_0
    //   245: iload_3
    //   246: putfield l : I
    //   249: aload_0
    //   250: iconst_1
    //   251: putfield m : I
    //   254: aload #7
    //   256: aload_1
    //   257: iload #4
    //   259: aload_0
    //   260: invokestatic c : (Ljx1;Lbw1;ILds;)Ljava/lang/Object;
    //   263: aload #9
    //   265: if_acmpne -> 201
    //   268: aload #9
    //   270: areturn
    //   271: iload #5
    //   273: istore #4
    //   275: iinc #2, 1
    //   278: goto -> 100
    //   281: getstatic l02.a : Ll02;
    //   284: areturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ix1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */