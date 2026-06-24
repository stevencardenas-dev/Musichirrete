public final class kr1 implements bw1, ad1 {
  public final er1 a;
  
  public kr1(er1 paramer1) {
    this.a = paramer1;
  }
  
  public final Object a(aw1 paramaw1, ad0 paramad0, pr1 parampr1) {
    return e(paramaw1, paramad0, parampr1);
  }
  
  public final th1 b() {
    return this.a;
  }
  
  public final Object c(pr1 parampr1) {
    return Boolean.valueOf(this.a.b.l());
  }
  
  public final Object d(String paramString, wc0 paramwc0, ds paramds) {
    or1 or1 = this.a.a(paramString);
    try {
      return paramwc0.h(or1);
    } finally {
      paramwc0 = null;
    } 
  }
  
  public final Object e(aw1 paramaw1, ad0 paramad0, ds paramds) {
    // Byte code:
    //   0: aload_3
    //   1: instanceof jr1
    //   4: ifeq -> 41
    //   7: aload_3
    //   8: checkcast jr1
    //   11: astore #5
    //   13: aload #5
    //   15: getfield j : I
    //   18: istore #4
    //   20: iload #4
    //   22: ldc -2147483648
    //   24: iand
    //   25: ifeq -> 41
    //   28: aload #5
    //   30: iload #4
    //   32: ldc -2147483648
    //   34: iadd
    //   35: putfield j : I
    //   38: goto -> 52
    //   41: new jr1
    //   44: dup
    //   45: aload_0
    //   46: aload_3
    //   47: invokespecial <init> : (Lkr1;Lds;)V
    //   50: astore #5
    //   52: aload #5
    //   54: getfield h : Ljava/lang/Object;
    //   57: astore #6
    //   59: aload #5
    //   61: getfield j : I
    //   64: istore #4
    //   66: iload #4
    //   68: ifeq -> 114
    //   71: iload #4
    //   73: iconst_1
    //   74: if_icmpne -> 107
    //   77: aload #5
    //   79: getfield g : Lac0;
    //   82: astore_3
    //   83: aload #5
    //   85: getfield f : Lkr1;
    //   88: astore #5
    //   90: aload_3
    //   91: astore_2
    //   92: aload #5
    //   94: astore_1
    //   95: aload #6
    //   97: invokestatic r0 : (Ljava/lang/Object;)V
    //   100: goto -> 372
    //   103: astore_3
    //   104: goto -> 410
    //   107: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   109: invokestatic f : (Ljava/lang/String;)V
    //   112: aconst_null
    //   113: areturn
    //   114: aload #6
    //   116: invokestatic r0 : (Ljava/lang/Object;)V
    //   119: aload_0
    //   120: getfield a : Ler1;
    //   123: getfield b : Lac0;
    //   126: astore_3
    //   127: aload_3
    //   128: invokevirtual l : ()Z
    //   131: pop
    //   132: aload_1
    //   133: invokevirtual ordinal : ()I
    //   136: istore #4
    //   138: iload #4
    //   140: ifeq -> 177
    //   143: iload #4
    //   145: iconst_1
    //   146: if_icmpeq -> 170
    //   149: iload #4
    //   151: iconst_2
    //   152: if_icmpne -> 162
    //   155: aload_3
    //   156: invokevirtual a : ()V
    //   159: goto -> 318
    //   162: new java/lang/RuntimeException
    //   165: dup
    //   166: invokespecial <init> : ()V
    //   169: athrow
    //   170: aload_3
    //   171: invokevirtual c : ()V
    //   174: goto -> 318
    //   177: iconst_0
    //   178: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   181: astore_1
    //   182: aload_3
    //   183: getfield b : Landroid/database/sqlite/SQLiteDatabase;
    //   186: astore #6
    //   188: getstatic ac0.g : Lvl0;
    //   191: astore #7
    //   193: aload #7
    //   195: invokeinterface getValue : ()Ljava/lang/Object;
    //   200: checkcast java/lang/reflect/Method
    //   203: ifnull -> 314
    //   206: getstatic ac0.f : Lvl0;
    //   209: astore #8
    //   211: aload #8
    //   213: invokeinterface getValue : ()Ljava/lang/Object;
    //   218: checkcast java/lang/reflect/Method
    //   221: ifnull -> 314
    //   224: aload #7
    //   226: invokeinterface getValue : ()Ljava/lang/Object;
    //   231: checkcast java/lang/reflect/Method
    //   234: astore #7
    //   236: aload #7
    //   238: invokevirtual getClass : ()Ljava/lang/Class;
    //   241: pop
    //   242: aload #8
    //   244: invokeinterface getValue : ()Ljava/lang/Object;
    //   249: checkcast java/lang/reflect/Method
    //   252: astore #8
    //   254: aload #8
    //   256: invokevirtual getClass : ()Ljava/lang/Class;
    //   259: pop
    //   260: aload #8
    //   262: aload #6
    //   264: aconst_null
    //   265: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   268: astore #6
    //   270: aload #6
    //   272: ifnull -> 306
    //   275: aload #7
    //   277: aload #6
    //   279: iconst_4
    //   280: anewarray java/lang/Object
    //   283: dup
    //   284: iconst_0
    //   285: aload_1
    //   286: aastore
    //   287: dup
    //   288: iconst_1
    //   289: aconst_null
    //   290: aastore
    //   291: dup
    //   292: iconst_2
    //   293: aload_1
    //   294: aastore
    //   295: dup
    //   296: iconst_3
    //   297: aconst_null
    //   298: aastore
    //   299: invokevirtual invoke : (Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   302: pop
    //   303: goto -> 318
    //   306: ldc 'Required value was null.'
    //   308: invokestatic f : (Ljava/lang/String;)V
    //   311: goto -> 318
    //   314: aload_3
    //   315: invokevirtual a : ()V
    //   318: new q81
    //   321: astore_1
    //   322: aload_1
    //   323: iconst_1
    //   324: aload_0
    //   325: invokespecial <init> : (ILjava/lang/Object;)V
    //   328: aload #5
    //   330: aload_0
    //   331: putfield f : Lkr1;
    //   334: aload #5
    //   336: aload_3
    //   337: putfield g : Lac0;
    //   340: aload #5
    //   342: iconst_1
    //   343: putfield j : I
    //   346: aload_2
    //   347: aload_1
    //   348: aload #5
    //   350: invokeinterface g : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   355: astore #6
    //   357: getstatic ys.b : Lys;
    //   360: astore_1
    //   361: aload #6
    //   363: aload_1
    //   364: if_acmpne -> 369
    //   367: aload_1
    //   368: areturn
    //   369: aload_0
    //   370: astore #5
    //   372: aload_3
    //   373: astore_2
    //   374: aload #5
    //   376: astore_1
    //   377: aload_3
    //   378: invokevirtual m : ()V
    //   381: aload_3
    //   382: invokevirtual g : ()V
    //   385: aload_3
    //   386: invokevirtual l : ()Z
    //   389: ifne -> 398
    //   392: aload #5
    //   394: invokevirtual getClass : ()Ljava/lang/Class;
    //   397: pop
    //   398: aload #6
    //   400: areturn
    //   401: astore #5
    //   403: aload_0
    //   404: astore_1
    //   405: aload_3
    //   406: astore_2
    //   407: aload #5
    //   409: astore_3
    //   410: aload_2
    //   411: invokevirtual g : ()V
    //   414: aload_2
    //   415: invokevirtual l : ()Z
    //   418: ifne -> 426
    //   421: aload_1
    //   422: invokevirtual getClass : ()Ljava/lang/Class;
    //   425: pop
    //   426: aload_3
    //   427: athrow
    // Exception table:
    //   from	to	target	type
    //   95	100	103	finally
    //   318	357	401	finally
    //   377	381	103	finally
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kr1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */