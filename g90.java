public final class g90 implements x80 {
  public final int b;
  
  public final Object c;
  
  public final Object e;
  
  public final Object k(Object paramObject, cs paramcs) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : I
    //   4: istore_3
    //   5: getstatic l02.a : Ll02;
    //   8: astore #6
    //   10: aload_0
    //   11: getfield e : Ljava/lang/Object;
    //   14: astore #8
    //   16: aload_0
    //   17: getfield c : Ljava/lang/Object;
    //   20: astore #5
    //   22: iload_3
    //   23: tableswitch default -> 40, 0 -> 64
    //   40: aload_1
    //   41: checkcast lr
    //   44: astore_1
    //   45: aload #5
    //   47: checkcast d41
    //   50: aload #8
    //   52: checkcast y72
    //   55: aload_1
    //   56: invokeinterface b : (Ly72;Llr;)V
    //   61: aload #6
    //   63: areturn
    //   64: aload_2
    //   65: instanceof f90
    //   68: ifeq -> 105
    //   71: aload_2
    //   72: checkcast f90
    //   75: astore #4
    //   77: aload #4
    //   79: getfield g : I
    //   82: istore_3
    //   83: iload_3
    //   84: ldc -2147483648
    //   86: iand
    //   87: ifeq -> 105
    //   90: aload #4
    //   92: iload_3
    //   93: ldc -2147483648
    //   95: iadd
    //   96: putfield g : I
    //   99: aload #4
    //   101: astore_2
    //   102: goto -> 115
    //   105: new f90
    //   108: dup
    //   109: aload_0
    //   110: aload_2
    //   111: invokespecial <init> : (Lg90;Lcs;)V
    //   114: astore_2
    //   115: aload_2
    //   116: getfield f : Ljava/lang/Object;
    //   119: astore #9
    //   121: aload_2
    //   122: getfield g : I
    //   125: istore_3
    //   126: getstatic ys.b : Lys;
    //   129: astore #7
    //   131: iload_3
    //   132: ifeq -> 186
    //   135: iload_3
    //   136: iconst_1
    //   137: if_icmpeq -> 166
    //   140: iload_3
    //   141: iconst_2
    //   142: if_icmpne -> 156
    //   145: aload #9
    //   147: invokestatic r0 : (Ljava/lang/Object;)V
    //   150: aload #6
    //   152: astore_1
    //   153: goto -> 277
    //   156: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   158: invokestatic f : (Ljava/lang/String;)V
    //   161: aconst_null
    //   162: astore_1
    //   163: goto -> 277
    //   166: aload_2
    //   167: getfield j : Lx80;
    //   170: astore #5
    //   172: aload_2
    //   173: getfield i : Ljava/lang/Object;
    //   176: astore #4
    //   178: aload #9
    //   180: invokestatic r0 : (Ljava/lang/Object;)V
    //   183: goto -> 241
    //   186: aload #9
    //   188: invokestatic r0 : (Ljava/lang/Object;)V
    //   191: aload #5
    //   193: checkcast x80
    //   196: astore #5
    //   198: aload #8
    //   200: checkcast ad0
    //   203: astore #4
    //   205: aload_2
    //   206: aload_1
    //   207: putfield i : Ljava/lang/Object;
    //   210: aload_2
    //   211: aload #5
    //   213: putfield j : Lx80;
    //   216: aload_2
    //   217: iconst_1
    //   218: putfield g : I
    //   221: aload #4
    //   223: aload_1
    //   224: aload_2
    //   225: invokeinterface g : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   230: aload #7
    //   232: if_acmpne -> 238
    //   235: goto -> 274
    //   238: aload_1
    //   239: astore #4
    //   241: aload_2
    //   242: aconst_null
    //   243: putfield i : Ljava/lang/Object;
    //   246: aload_2
    //   247: aconst_null
    //   248: putfield j : Lx80;
    //   251: aload_2
    //   252: iconst_2
    //   253: putfield g : I
    //   256: aload #6
    //   258: astore_1
    //   259: aload #5
    //   261: aload #4
    //   263: aload_2
    //   264: invokeinterface k : (Ljava/lang/Object;Lcs;)Ljava/lang/Object;
    //   269: aload #7
    //   271: if_acmpne -> 277
    //   274: aload #7
    //   276: astore_1
    //   277: aload_1
    //   278: areturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\g90.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */