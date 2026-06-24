public final class cx1 implements x80 {
  public final me1 b;
  
  public final x80 c;
  
  public final String[] e;
  
  public final int[] f;
  
  public cx1(me1 paramme1, x80 paramx80, String[] paramArrayOfString, int[] paramArrayOfint) {
    this.b = paramme1;
    this.c = paramx80;
    this.e = paramArrayOfString;
    this.f = paramArrayOfint;
  }
  
  public final Object a(int[] paramArrayOfint, cs paramcs) {
    // Byte code:
    //   0: aload_0
    //   1: astore #7
    //   3: aload_2
    //   4: instanceof bx1
    //   7: ifeq -> 44
    //   10: aload_2
    //   11: checkcast bx1
    //   14: astore #8
    //   16: aload #8
    //   18: getfield j : I
    //   21: istore_3
    //   22: iload_3
    //   23: ldc -2147483648
    //   25: iand
    //   26: ifeq -> 44
    //   29: aload #8
    //   31: iload_3
    //   32: ldc -2147483648
    //   34: iadd
    //   35: putfield j : I
    //   38: aload #8
    //   40: astore_2
    //   41: goto -> 55
    //   44: new bx1
    //   47: dup
    //   48: aload #7
    //   50: aload_2
    //   51: invokespecial <init> : (Lcx1;Lcs;)V
    //   54: astore_2
    //   55: aload_2
    //   56: getfield h : Ljava/lang/Object;
    //   59: astore #10
    //   61: aload_2
    //   62: getfield j : I
    //   65: istore_3
    //   66: aconst_null
    //   67: astore #8
    //   69: iload_3
    //   70: ifeq -> 113
    //   73: iload_3
    //   74: iconst_1
    //   75: if_icmpeq -> 93
    //   78: iload_3
    //   79: iconst_2
    //   80: if_icmpne -> 86
    //   83: goto -> 93
    //   86: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   88: invokestatic f : (Ljava/lang/String;)V
    //   91: aconst_null
    //   92: areturn
    //   93: aload_2
    //   94: getfield g : [I
    //   97: astore #9
    //   99: aload_2
    //   100: getfield f : Lcx1;
    //   103: astore #8
    //   105: aload #10
    //   107: invokestatic r0 : (Ljava/lang/Object;)V
    //   110: goto -> 365
    //   113: aload #10
    //   115: invokestatic r0 : (Ljava/lang/Object;)V
    //   118: aload #7
    //   120: getfield b : Lme1;
    //   123: astore #13
    //   125: aload #13
    //   127: getfield b : Ljava/lang/Object;
    //   130: astore #12
    //   132: aload #7
    //   134: getfield e : [Ljava/lang/String;
    //   137: astore #9
    //   139: aload #7
    //   141: getfield c : Lx80;
    //   144: astore #10
    //   146: getstatic ys.b : Lys;
    //   149: astore #11
    //   151: aload #12
    //   153: ifnonnull -> 204
    //   156: aload #9
    //   158: invokestatic K0 : ([Ljava/lang/Object;)Ljava/util/Set;
    //   161: astore #12
    //   163: aload_2
    //   164: aload #7
    //   166: putfield f : Lcx1;
    //   169: aload_2
    //   170: aload_1
    //   171: putfield g : [I
    //   174: aload_2
    //   175: iconst_1
    //   176: putfield j : I
    //   179: aload #7
    //   181: astore #8
    //   183: aload_1
    //   184: astore #9
    //   186: aload #10
    //   188: aload #12
    //   190: aload_2
    //   191: invokeinterface k : (Ljava/lang/Object;Lcs;)Ljava/lang/Object;
    //   196: aload #11
    //   198: if_acmpne -> 365
    //   201: goto -> 362
    //   204: new java/util/ArrayList
    //   207: dup
    //   208: invokespecial <init> : ()V
    //   211: astore #12
    //   213: aload #9
    //   215: arraylength
    //   216: istore #5
    //   218: iconst_0
    //   219: istore #4
    //   221: iconst_0
    //   222: istore_3
    //   223: iload #4
    //   225: iload #5
    //   227: if_icmpge -> 302
    //   230: aload #9
    //   232: iload #4
    //   234: aaload
    //   235: astore #14
    //   237: aload #13
    //   239: getfield b : Ljava/lang/Object;
    //   242: astore #15
    //   244: aload #15
    //   246: ifnull -> 294
    //   249: aload #15
    //   251: checkcast [I
    //   254: astore #15
    //   256: aload #7
    //   258: getfield f : [I
    //   261: iload_3
    //   262: iaload
    //   263: istore #6
    //   265: aload #15
    //   267: iload #6
    //   269: iaload
    //   270: aload_1
    //   271: iload #6
    //   273: iaload
    //   274: if_icmpeq -> 285
    //   277: aload #12
    //   279: aload #14
    //   281: invokevirtual add : (Ljava/lang/Object;)Z
    //   284: pop
    //   285: iinc #4, 1
    //   288: iinc #3, 1
    //   291: goto -> 223
    //   294: ldc 'Required value was null.'
    //   296: invokestatic f : (Ljava/lang/String;)V
    //   299: aload #8
    //   301: areturn
    //   302: aload #7
    //   304: astore #8
    //   306: aload_1
    //   307: astore #9
    //   309: aload #12
    //   311: invokevirtual isEmpty : ()Z
    //   314: ifne -> 365
    //   317: aload #12
    //   319: invokestatic x0 : (Ljava/util/ArrayList;)Ljava/util/Set;
    //   322: astore #12
    //   324: aload_2
    //   325: aload #7
    //   327: putfield f : Lcx1;
    //   330: aload_2
    //   331: aload_1
    //   332: putfield g : [I
    //   335: aload_2
    //   336: iconst_2
    //   337: putfield j : I
    //   340: aload #7
    //   342: astore #8
    //   344: aload_1
    //   345: astore #9
    //   347: aload #10
    //   349: aload #12
    //   351: aload_2
    //   352: invokeinterface k : (Ljava/lang/Object;Lcs;)Ljava/lang/Object;
    //   357: aload #11
    //   359: if_acmpne -> 365
    //   362: aload #11
    //   364: areturn
    //   365: aload #8
    //   367: getfield b : Lme1;
    //   370: aload #9
    //   372: putfield b : Ljava/lang/Object;
    //   375: getstatic l02.a : Ll02;
    //   378: areturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cx1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */