public final class ln implements x80 {
  public final lh b;
  
  public final int c;
  
  public ln(lh paramlh, int paramInt) {
    this.b = paramlh;
    this.c = paramInt;
  }
  
  public final Object k(Object paramObject, cs paramcs) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof kn
    //   4: ifeq -> 38
    //   7: aload_2
    //   8: checkcast kn
    //   11: astore #4
    //   13: aload #4
    //   15: getfield h : I
    //   18: istore_3
    //   19: iload_3
    //   20: ldc -2147483648
    //   22: iand
    //   23: ifeq -> 38
    //   26: aload #4
    //   28: iload_3
    //   29: ldc -2147483648
    //   31: iadd
    //   32: putfield h : I
    //   35: goto -> 49
    //   38: new kn
    //   41: dup
    //   42: aload_0
    //   43: aload_2
    //   44: invokespecial <init> : (Lln;Lcs;)V
    //   47: astore #4
    //   49: aload #4
    //   51: getfield f : Ljava/lang/Object;
    //   54: astore #7
    //   56: aload #4
    //   58: getfield h : I
    //   61: istore_3
    //   62: aconst_null
    //   63: astore #6
    //   65: getstatic ys.b : Lys;
    //   68: astore #5
    //   70: getstatic l02.a : Ll02;
    //   73: astore_2
    //   74: iload_3
    //   75: ifeq -> 110
    //   78: iload_3
    //   79: iconst_1
    //   80: if_icmpeq -> 102
    //   83: iload_3
    //   84: iconst_2
    //   85: if_icmpne -> 95
    //   88: aload #7
    //   90: invokestatic r0 : (Ljava/lang/Object;)V
    //   93: aload_2
    //   94: areturn
    //   95: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   97: invokestatic f : (Ljava/lang/String;)V
    //   100: aconst_null
    //   101: areturn
    //   102: aload #7
    //   104: invokestatic r0 : (Ljava/lang/Object;)V
    //   107: goto -> 154
    //   110: aload #7
    //   112: invokestatic r0 : (Ljava/lang/Object;)V
    //   115: new th0
    //   118: dup
    //   119: aload_0
    //   120: getfield c : I
    //   123: aload_1
    //   124: invokespecial <init> : (ILjava/lang/Object;)V
    //   127: astore_1
    //   128: aload #4
    //   130: iconst_1
    //   131: putfield h : I
    //   134: aload_0
    //   135: getfield b : Llh;
    //   138: aload #4
    //   140: aload_1
    //   141: invokeinterface b : (Lcs;Ljava/lang/Object;)Ljava/lang/Object;
    //   146: aload #5
    //   148: if_acmpne -> 154
    //   151: goto -> 305
    //   154: aload #4
    //   156: iconst_2
    //   157: putfield h : I
    //   160: aload #4
    //   162: getfield c : Los;
    //   165: astore #7
    //   167: aload #7
    //   169: invokevirtual getClass : ()Ljava/lang/Class;
    //   172: pop
    //   173: aload #7
    //   175: invokestatic y : (Los;)V
    //   178: aload #4
    //   180: invokestatic N : (Lcs;)Lcs;
    //   183: astore #4
    //   185: aload #6
    //   187: astore_1
    //   188: aload #4
    //   190: instanceof xz
    //   193: ifeq -> 202
    //   196: aload #4
    //   198: checkcast xz
    //   201: astore_1
    //   202: aload_1
    //   203: ifnonnull -> 211
    //   206: aload_2
    //   207: astore_1
    //   208: goto -> 288
    //   211: aload_1
    //   212: getfield f : Lrs;
    //   215: astore #4
    //   217: aload #4
    //   219: aload #7
    //   221: invokevirtual q : (Los;)Z
    //   224: ifeq -> 248
    //   227: aload_1
    //   228: aload_2
    //   229: putfield h : Ljava/lang/Object;
    //   232: aload_1
    //   233: iconst_1
    //   234: putfield e : I
    //   237: aload #4
    //   239: aload #7
    //   241: aload_1
    //   242: invokevirtual p : (Los;Ljava/lang/Runnable;)V
    //   245: goto -> 285
    //   248: aload #7
    //   250: new n
    //   253: dup
    //   254: getstatic y82.c : Lfb0;
    //   257: invokespecial <init> : (Lns;)V
    //   260: invokeinterface k : (Los;)Los;
    //   265: astore #6
    //   267: aload_1
    //   268: aload_2
    //   269: putfield h : Ljava/lang/Object;
    //   272: aload_1
    //   273: iconst_1
    //   274: putfield e : I
    //   277: aload #4
    //   279: aload #6
    //   281: aload_1
    //   282: invokevirtual p : (Los;Ljava/lang/Runnable;)V
    //   285: aload #5
    //   287: astore_1
    //   288: aload_1
    //   289: aload #5
    //   291: if_acmpne -> 297
    //   294: goto -> 299
    //   297: aload_2
    //   298: astore_1
    //   299: aload_1
    //   300: aload #5
    //   302: if_acmpne -> 308
    //   305: aload #5
    //   307: areturn
    //   308: aload_2
    //   309: areturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ln.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */