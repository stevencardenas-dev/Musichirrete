import java.util.concurrent.atomic.AtomicBoolean;

public final class w81 implements bw1, ad1 {
  public final yp a;
  
  public final boolean b;
  
  public final v8 c;
  
  public final AtomicBoolean d;
  
  public w81(yp paramyp, boolean paramBoolean) {
    this.a = paramyp;
    this.b = paramBoolean;
    this.c = new v8();
    this.d = new AtomicBoolean(false);
  }
  
  public final Object a(aw1 paramaw1, ad0 paramad0, pr1 parampr1) {
    if (!this.d.get()) {
      os os = parampr1.c;
      os.getClass();
      os = os.l(lp.c);
      if (os != null && ((lp)os).b == this)
        return g(paramaw1, paramad0, parampr1); 
      m92.V("Attempted to use connection on a different coroutine", 21);
      throw null;
    } 
    m92.V("Connection is recycled", 21);
    throw null;
  }
  
  public final th1 b() {
    return this.a;
  }
  
  public final Object c(pr1 parampr1) {
    if (!this.d.get()) {
      os os = parampr1.c;
      os.getClass();
      os = os.l(lp.c);
      if (os != null && ((lp)os).b == this)
        return Boolean.valueOf(this.c.isEmpty() ^ true); 
      m92.V("Attempted to use connection on a different coroutine", 21);
      throw null;
    } 
    m92.V("Connection is recycled", 21);
    throw null;
  }
  
  public final Object d(String paramString, wc0 paramwc0, ds paramds) {
    // Byte code:
    //   0: aload_3
    //   1: instanceof v81
    //   4: ifeq -> 44
    //   7: aload_3
    //   8: checkcast v81
    //   11: astore #5
    //   13: aload #5
    //   15: getfield l : I
    //   18: istore #4
    //   20: iload #4
    //   22: ldc -2147483648
    //   24: iand
    //   25: ifeq -> 44
    //   28: aload #5
    //   30: iload #4
    //   32: ldc -2147483648
    //   34: iadd
    //   35: putfield l : I
    //   38: aload #5
    //   40: astore_3
    //   41: goto -> 54
    //   44: new v81
    //   47: dup
    //   48: aload_0
    //   49: aload_3
    //   50: invokespecial <init> : (Lw81;Lds;)V
    //   53: astore_3
    //   54: aload_3
    //   55: getfield j : Ljava/lang/Object;
    //   58: astore #6
    //   60: aload_3
    //   61: getfield l : I
    //   64: istore #4
    //   66: iload #4
    //   68: ifeq -> 113
    //   71: iload #4
    //   73: iconst_1
    //   74: if_icmpne -> 106
    //   77: aload_3
    //   78: getfield i : Lyp;
    //   81: astore_1
    //   82: aload_3
    //   83: getfield h : Lwc0;
    //   86: astore_2
    //   87: aload_3
    //   88: getfield g : Ljava/lang/String;
    //   91: astore #5
    //   93: aload_3
    //   94: getfield f : Lw81;
    //   97: astore_3
    //   98: aload #6
    //   100: invokestatic r0 : (Ljava/lang/Object;)V
    //   103: goto -> 237
    //   106: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   108: invokestatic f : (Ljava/lang/String;)V
    //   111: aconst_null
    //   112: areturn
    //   113: aload #6
    //   115: invokestatic r0 : (Ljava/lang/Object;)V
    //   118: aload_0
    //   119: getfield d : Ljava/util/concurrent/atomic/AtomicBoolean;
    //   122: invokevirtual get : ()Z
    //   125: ifne -> 315
    //   128: aload_3
    //   129: getfield c : Los;
    //   132: astore #5
    //   134: aload #5
    //   136: invokevirtual getClass : ()Ljava/lang/Class;
    //   139: pop
    //   140: aload #5
    //   142: getstatic lp.c : Lip2;
    //   145: invokeinterface l : (Lns;)Lms;
    //   150: checkcast lp
    //   153: astore #5
    //   155: aload #5
    //   157: ifnull -> 306
    //   160: aload #5
    //   162: getfield b : Lw81;
    //   165: aload_0
    //   166: if_acmpne -> 306
    //   169: aload_3
    //   170: aload_0
    //   171: putfield f : Lw81;
    //   174: aload_3
    //   175: aload_1
    //   176: putfield g : Ljava/lang/String;
    //   179: aload_3
    //   180: aload_2
    //   181: putfield h : Lwc0;
    //   184: aload_0
    //   185: getfield a : Lyp;
    //   188: astore #6
    //   190: aload_3
    //   191: aload #6
    //   193: putfield i : Lyp;
    //   196: aload_3
    //   197: iconst_1
    //   198: putfield l : I
    //   201: aload #6
    //   203: getfield c : Lwz0;
    //   206: aload_3
    //   207: invokeinterface c : (Lds;)Ljava/lang/Object;
    //   212: astore #8
    //   214: getstatic ys.b : Lys;
    //   217: astore #7
    //   219: aload_0
    //   220: astore_3
    //   221: aload_1
    //   222: astore #5
    //   224: aload #6
    //   226: astore_1
    //   227: aload #8
    //   229: aload #7
    //   231: if_acmpne -> 237
    //   234: aload #7
    //   236: areturn
    //   237: new p81
    //   240: astore #6
    //   242: aload #6
    //   244: aload_3
    //   245: aload_3
    //   246: getfield a : Lyp;
    //   249: aload #5
    //   251: invokevirtual O : (Ljava/lang/String;)Lai1;
    //   254: invokespecial <init> : (Lw81;Lai1;)V
    //   257: aload_2
    //   258: aload #6
    //   260: invokeinterface h : (Ljava/lang/Object;)Ljava/lang/Object;
    //   265: astore_2
    //   266: aload #6
    //   268: aconst_null
    //   269: invokestatic d : (Lai1;Ljava/lang/Throwable;)V
    //   272: aload_1
    //   273: aconst_null
    //   274: invokeinterface a : (Ljava/lang/Object;)V
    //   279: aload_2
    //   280: areturn
    //   281: astore_2
    //   282: goto -> 297
    //   285: astore_2
    //   286: aload_2
    //   287: athrow
    //   288: astore_3
    //   289: aload #6
    //   291: aload_2
    //   292: invokestatic d : (Lai1;Ljava/lang/Throwable;)V
    //   295: aload_3
    //   296: athrow
    //   297: aload_1
    //   298: aconst_null
    //   299: invokeinterface a : (Ljava/lang/Object;)V
    //   304: aload_2
    //   305: athrow
    //   306: ldc 'Attempted to use connection on a different coroutine'
    //   308: bipush #21
    //   310: invokestatic V : (Ljava/lang/String;I)V
    //   313: aconst_null
    //   314: athrow
    //   315: ldc 'Connection is recycled'
    //   317: bipush #21
    //   319: invokestatic V : (Ljava/lang/String;I)V
    //   322: aconst_null
    //   323: athrow
    // Exception table:
    //   from	to	target	type
    //   237	257	281	finally
    //   257	266	285	finally
    //   266	272	281	finally
    //   286	288	288	finally
    //   289	297	281	finally
  }
  
  public final Object e(aw1 paramaw1, ds paramds) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof s81
    //   4: ifeq -> 41
    //   7: aload_2
    //   8: checkcast s81
    //   11: astore #5
    //   13: aload #5
    //   15: getfield k : I
    //   18: istore_3
    //   19: iload_3
    //   20: ldc -2147483648
    //   22: iand
    //   23: ifeq -> 41
    //   26: aload #5
    //   28: iload_3
    //   29: ldc -2147483648
    //   31: iadd
    //   32: putfield k : I
    //   35: aload #5
    //   37: astore_2
    //   38: goto -> 51
    //   41: new s81
    //   44: dup
    //   45: aload_0
    //   46: aload_2
    //   47: invokespecial <init> : (Lw81;Lds;)V
    //   50: astore_2
    //   51: aload_2
    //   52: getfield i : Ljava/lang/Object;
    //   55: astore #6
    //   57: aload_2
    //   58: getfield k : I
    //   61: istore_3
    //   62: iload_3
    //   63: ifeq -> 102
    //   66: iload_3
    //   67: iconst_1
    //   68: if_icmpne -> 95
    //   71: aload_2
    //   72: getfield h : Lyp;
    //   75: astore_1
    //   76: aload_2
    //   77: getfield g : Law1;
    //   80: astore #5
    //   82: aload_2
    //   83: getfield f : Lw81;
    //   86: astore_2
    //   87: aload #6
    //   89: invokestatic r0 : (Ljava/lang/Object;)V
    //   92: goto -> 170
    //   95: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   97: invokestatic f : (Ljava/lang/String;)V
    //   100: aconst_null
    //   101: areturn
    //   102: aload #6
    //   104: invokestatic r0 : (Ljava/lang/Object;)V
    //   107: aload_2
    //   108: aload_0
    //   109: putfield f : Lw81;
    //   112: aload_2
    //   113: aload_1
    //   114: putfield g : Law1;
    //   117: aload_0
    //   118: getfield a : Lyp;
    //   121: astore #6
    //   123: aload_2
    //   124: aload #6
    //   126: putfield h : Lyp;
    //   129: aload_2
    //   130: iconst_1
    //   131: putfield k : I
    //   134: aload #6
    //   136: getfield c : Lwz0;
    //   139: aload_2
    //   140: invokeinterface c : (Lds;)Ljava/lang/Object;
    //   145: astore #8
    //   147: getstatic ys.b : Lys;
    //   150: astore #7
    //   152: aload_0
    //   153: astore_2
    //   154: aload_1
    //   155: astore #5
    //   157: aload #6
    //   159: astore_1
    //   160: aload #8
    //   162: aload #7
    //   164: if_acmpne -> 170
    //   167: aload #7
    //   169: areturn
    //   170: aload_2
    //   171: getfield c : Lv8;
    //   174: astore #6
    //   176: aload_2
    //   177: getfield a : Lyp;
    //   180: astore_2
    //   181: aload #6
    //   183: getfield e : I
    //   186: istore #4
    //   188: aload #6
    //   190: invokevirtual isEmpty : ()Z
    //   193: ifeq -> 258
    //   196: aload #5
    //   198: invokevirtual ordinal : ()I
    //   201: istore_3
    //   202: iload_3
    //   203: ifeq -> 249
    //   206: iload_3
    //   207: iconst_1
    //   208: if_icmpeq -> 240
    //   211: iload_3
    //   212: iconst_2
    //   213: if_icmpne -> 230
    //   216: aload_2
    //   217: getstatic org/jaudiotagger/audio/dff/vR/CKYHNesT.GhdIaSIIi : Ljava/lang/String;
    //   220: invokestatic n : (Lth1;Ljava/lang/String;)V
    //   223: goto -> 295
    //   226: astore_2
    //   227: goto -> 324
    //   230: new co
    //   233: astore_2
    //   234: aload_2
    //   235: invokespecial <init> : ()V
    //   238: aload_2
    //   239: athrow
    //   240: aload_2
    //   241: ldc 'BEGIN IMMEDIATE TRANSACTION'
    //   243: invokestatic n : (Lth1;Ljava/lang/String;)V
    //   246: goto -> 295
    //   249: aload_2
    //   250: ldc 'BEGIN DEFERRED TRANSACTION'
    //   252: invokestatic n : (Lth1;Ljava/lang/String;)V
    //   255: goto -> 295
    //   258: new java/lang/StringBuilder
    //   261: astore #5
    //   263: aload #5
    //   265: ldc 'SAVEPOINT ''
    //   267: invokespecial <init> : (Ljava/lang/String;)V
    //   270: aload #5
    //   272: iload #4
    //   274: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   277: pop
    //   278: aload #5
    //   280: bipush #39
    //   282: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   285: pop
    //   286: aload_2
    //   287: aload #5
    //   289: invokevirtual toString : ()Ljava/lang/String;
    //   292: invokestatic n : (Lth1;Ljava/lang/String;)V
    //   295: new r81
    //   298: astore_2
    //   299: aload_2
    //   300: iload #4
    //   302: invokespecial <init> : (I)V
    //   305: aload #6
    //   307: aload_2
    //   308: invokevirtual addLast : (Ljava/lang/Object;)V
    //   311: getstatic l02.a : Ll02;
    //   314: astore_2
    //   315: aload_1
    //   316: aconst_null
    //   317: invokeinterface a : (Ljava/lang/Object;)V
    //   322: aload_2
    //   323: areturn
    //   324: aload_1
    //   325: aconst_null
    //   326: invokeinterface a : (Ljava/lang/Object;)V
    //   331: aload_2
    //   332: athrow
    // Exception table:
    //   from	to	target	type
    //   170	202	226	finally
    //   216	223	226	finally
    //   230	240	226	finally
    //   240	246	226	finally
    //   249	255	226	finally
    //   258	295	226	finally
    //   295	315	226	finally
  }
  
  public final Object f(boolean paramBoolean, ds paramds) {
    // Byte code:
    //   0: aload_2
    //   1: instanceof t81
    //   4: ifeq -> 41
    //   7: aload_2
    //   8: checkcast t81
    //   11: astore #4
    //   13: aload #4
    //   15: getfield k : I
    //   18: istore_3
    //   19: iload_3
    //   20: ldc -2147483648
    //   22: iand
    //   23: ifeq -> 41
    //   26: aload #4
    //   28: iload_3
    //   29: ldc -2147483648
    //   31: iadd
    //   32: putfield k : I
    //   35: aload #4
    //   37: astore_2
    //   38: goto -> 51
    //   41: new t81
    //   44: dup
    //   45: aload_0
    //   46: aload_2
    //   47: invokespecial <init> : (Lw81;Lds;)V
    //   50: astore_2
    //   51: aload_2
    //   52: getfield i : Ljava/lang/Object;
    //   55: astore #6
    //   57: aload_2
    //   58: getfield k : I
    //   61: istore_3
    //   62: iload_3
    //   63: ifeq -> 111
    //   66: iload_3
    //   67: iconst_1
    //   68: if_icmpne -> 103
    //   71: aload_2
    //   72: getfield h : Z
    //   75: istore_1
    //   76: aload_2
    //   77: getfield g : Lyp;
    //   80: astore #4
    //   82: aload_2
    //   83: getfield f : Lw81;
    //   86: astore #5
    //   88: aload #6
    //   90: invokestatic r0 : (Ljava/lang/Object;)V
    //   93: aload #4
    //   95: astore_2
    //   96: aload #5
    //   98: astore #4
    //   100: goto -> 177
    //   103: getstatic org/jaudiotagger/audio/dff/vR/CKYHNesT.eQARrrBL : Ljava/lang/String;
    //   106: invokestatic f : (Ljava/lang/String;)V
    //   109: aconst_null
    //   110: areturn
    //   111: aload #6
    //   113: invokestatic r0 : (Ljava/lang/Object;)V
    //   116: aload_2
    //   117: aload_0
    //   118: putfield f : Lw81;
    //   121: aload_0
    //   122: getfield a : Lyp;
    //   125: astore #5
    //   127: aload_2
    //   128: aload #5
    //   130: putfield g : Lyp;
    //   133: aload_2
    //   134: iload_1
    //   135: putfield h : Z
    //   138: aload_2
    //   139: iconst_1
    //   140: putfield k : I
    //   143: aload #5
    //   145: getfield c : Lwz0;
    //   148: aload_2
    //   149: invokeinterface c : (Lds;)Ljava/lang/Object;
    //   154: astore #6
    //   156: getstatic ys.b : Lys;
    //   159: astore #7
    //   161: aload_0
    //   162: astore #4
    //   164: aload #5
    //   166: astore_2
    //   167: aload #6
    //   169: aload #7
    //   171: if_acmpne -> 177
    //   174: aload #7
    //   176: areturn
    //   177: aload #4
    //   179: getfield c : Lv8;
    //   182: astore #6
    //   184: aload #4
    //   186: getfield a : Lyp;
    //   189: astore #4
    //   191: aload #6
    //   193: invokevirtual isEmpty : ()Z
    //   196: ifne -> 364
    //   199: aload #6
    //   201: invokestatic m0 : (Ljava/util/AbstractList;)Ljava/lang/Object;
    //   204: checkcast r81
    //   207: astore #5
    //   209: iload_1
    //   210: ifeq -> 288
    //   213: aload #5
    //   215: invokevirtual getClass : ()Ljava/lang/Class;
    //   218: pop
    //   219: aload #6
    //   221: invokevirtual isEmpty : ()Z
    //   224: ifeq -> 243
    //   227: aload #4
    //   229: ldc_w 'END TRANSACTION'
    //   232: invokestatic n : (Lth1;Ljava/lang/String;)V
    //   235: goto -> 349
    //   238: astore #4
    //   240: goto -> 380
    //   243: new java/lang/StringBuilder
    //   246: astore #6
    //   248: aload #6
    //   250: ldc_w 'RELEASE SAVEPOINT ''
    //   253: invokespecial <init> : (Ljava/lang/String;)V
    //   256: aload #6
    //   258: aload #5
    //   260: getfield a : I
    //   263: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   266: pop
    //   267: aload #6
    //   269: bipush #39
    //   271: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   274: pop
    //   275: aload #4
    //   277: aload #6
    //   279: invokevirtual toString : ()Ljava/lang/String;
    //   282: invokestatic n : (Lth1;Ljava/lang/String;)V
    //   285: goto -> 349
    //   288: aload #6
    //   290: invokevirtual isEmpty : ()Z
    //   293: ifeq -> 307
    //   296: aload #4
    //   298: ldc_w 'ROLLBACK TRANSACTION'
    //   301: invokestatic n : (Lth1;Ljava/lang/String;)V
    //   304: goto -> 349
    //   307: new java/lang/StringBuilder
    //   310: astore #6
    //   312: aload #6
    //   314: ldc_w 'ROLLBACK TRANSACTION TO SAVEPOINT ''
    //   317: invokespecial <init> : (Ljava/lang/String;)V
    //   320: aload #6
    //   322: aload #5
    //   324: getfield a : I
    //   327: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   330: pop
    //   331: aload #6
    //   333: bipush #39
    //   335: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   338: pop
    //   339: aload #4
    //   341: aload #6
    //   343: invokevirtual toString : ()Ljava/lang/String;
    //   346: invokestatic n : (Lth1;Ljava/lang/String;)V
    //   349: getstatic l02.a : Ll02;
    //   352: astore #4
    //   354: aload_2
    //   355: aconst_null
    //   356: invokeinterface a : (Ljava/lang/Object;)V
    //   361: aload #4
    //   363: areturn
    //   364: new java/lang/IllegalStateException
    //   367: astore #4
    //   369: aload #4
    //   371: ldc_w 'Not in a transaction'
    //   374: invokespecial <init> : (Ljava/lang/String;)V
    //   377: aload #4
    //   379: athrow
    //   380: aload_2
    //   381: aconst_null
    //   382: invokeinterface a : (Ljava/lang/Object;)V
    //   387: aload #4
    //   389: athrow
    // Exception table:
    //   from	to	target	type
    //   177	209	238	finally
    //   213	235	238	finally
    //   243	285	238	finally
    //   288	304	238	finally
    //   307	349	238	finally
    //   349	354	238	finally
    //   364	380	238	finally
  }
  
  public final Object g(aw1 paramaw1, ad0 paramad0, ds paramds) {
    // Byte code:
    //   0: aload_3
    //   1: instanceof u81
    //   4: ifeq -> 44
    //   7: aload_3
    //   8: checkcast u81
    //   11: astore #6
    //   13: aload #6
    //   15: getfield k : I
    //   18: istore #4
    //   20: iload #4
    //   22: ldc -2147483648
    //   24: iand
    //   25: ifeq -> 44
    //   28: aload #6
    //   30: iload #4
    //   32: ldc -2147483648
    //   34: iadd
    //   35: putfield k : I
    //   38: aload #6
    //   40: astore_3
    //   41: goto -> 54
    //   44: new u81
    //   47: dup
    //   48: aload_0
    //   49: aload_3
    //   50: invokespecial <init> : (Lw81;Lds;)V
    //   53: astore_3
    //   54: aload_3
    //   55: getfield i : Ljava/lang/Object;
    //   58: astore #6
    //   60: aload_3
    //   61: getfield k : I
    //   64: istore #4
    //   66: iconst_0
    //   67: istore #5
    //   69: getstatic ys.b : Lys;
    //   72: astore #7
    //   74: iload #4
    //   76: ifeq -> 212
    //   79: iload #4
    //   81: iconst_1
    //   82: if_icmpeq -> 188
    //   85: iload #4
    //   87: iconst_2
    //   88: if_icmpeq -> 156
    //   91: iload #4
    //   93: iconst_3
    //   94: if_icmpeq -> 144
    //   97: iload #4
    //   99: iconst_4
    //   100: if_icmpeq -> 144
    //   103: iload #4
    //   105: iconst_5
    //   106: if_icmpeq -> 116
    //   109: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   111: invokestatic f : (Ljava/lang/String;)V
    //   114: aconst_null
    //   115: areturn
    //   116: aload_3
    //   117: getfield g : Ljava/io/Serializable;
    //   120: checkcast java/lang/Throwable
    //   123: astore_1
    //   124: aload_3
    //   125: getfield f : Ljava/lang/Object;
    //   128: checkcast java/lang/Throwable
    //   131: astore_2
    //   132: aload #6
    //   134: invokestatic r0 : (Ljava/lang/Object;)V
    //   137: goto -> 405
    //   140: astore_3
    //   141: goto -> 396
    //   144: aload_3
    //   145: getfield f : Ljava/lang/Object;
    //   148: astore_1
    //   149: aload #6
    //   151: invokestatic r0 : (Ljava/lang/Object;)V
    //   154: aload_1
    //   155: areturn
    //   156: aload_3
    //   157: getfield h : I
    //   160: istore #4
    //   162: aload_3
    //   163: getfield f : Ljava/lang/Object;
    //   166: checkcast w81
    //   169: astore_1
    //   170: aload #6
    //   172: invokestatic r0 : (Ljava/lang/Object;)V
    //   175: aload #6
    //   177: astore_2
    //   178: goto -> 318
    //   181: astore_2
    //   182: aload_1
    //   183: astore #6
    //   185: goto -> 357
    //   188: aload_3
    //   189: getfield g : Ljava/io/Serializable;
    //   192: checkcast ad0
    //   195: astore_2
    //   196: aload_3
    //   197: getfield f : Ljava/lang/Object;
    //   200: checkcast w81
    //   203: astore_1
    //   204: aload #6
    //   206: invokestatic r0 : (Ljava/lang/Object;)V
    //   209: goto -> 264
    //   212: aload #6
    //   214: invokestatic r0 : (Ljava/lang/Object;)V
    //   217: aload_1
    //   218: astore #6
    //   220: aload_1
    //   221: ifnonnull -> 229
    //   224: getstatic aw1.b : Law1;
    //   227: astore #6
    //   229: aload_3
    //   230: aload_0
    //   231: putfield f : Ljava/lang/Object;
    //   234: aload_3
    //   235: aload_2
    //   236: checkcast java/io/Serializable
    //   239: putfield g : Ljava/io/Serializable;
    //   242: aload_3
    //   243: iconst_1
    //   244: putfield k : I
    //   247: aload_0
    //   248: astore_1
    //   249: aload_0
    //   250: aload #6
    //   252: aload_3
    //   253: invokevirtual e : (Law1;Lds;)Ljava/lang/Object;
    //   256: aload #7
    //   258: if_acmpne -> 264
    //   261: goto -> 389
    //   264: new q81
    //   267: astore #6
    //   269: aload #6
    //   271: iconst_0
    //   272: aload_1
    //   273: invokespecial <init> : (ILjava/lang/Object;)V
    //   276: aload_3
    //   277: aload_1
    //   278: putfield f : Ljava/lang/Object;
    //   281: aload_3
    //   282: aconst_null
    //   283: putfield g : Ljava/io/Serializable;
    //   286: aload_3
    //   287: iconst_1
    //   288: putfield h : I
    //   291: aload_3
    //   292: iconst_2
    //   293: putfield k : I
    //   296: aload_2
    //   297: aload #6
    //   299: aload_3
    //   300: invokeinterface g : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   305: astore_2
    //   306: aload_2
    //   307: aload #7
    //   309: if_acmpne -> 315
    //   312: goto -> 389
    //   315: iconst_1
    //   316: istore #4
    //   318: iload #4
    //   320: ifeq -> 326
    //   323: iconst_1
    //   324: istore #5
    //   326: aload_3
    //   327: aload_2
    //   328: putfield f : Ljava/lang/Object;
    //   331: aload_3
    //   332: iconst_3
    //   333: putfield k : I
    //   336: aload_1
    //   337: iload #5
    //   339: aload_3
    //   340: invokevirtual f : (ZLds;)Ljava/lang/Object;
    //   343: aload #7
    //   345: if_acmpne -> 351
    //   348: goto -> 389
    //   351: aload_2
    //   352: areturn
    //   353: astore_2
    //   354: aload_1
    //   355: astore #6
    //   357: aload_2
    //   358: athrow
    //   359: astore_1
    //   360: aload_3
    //   361: aload_2
    //   362: putfield f : Ljava/lang/Object;
    //   365: aload_3
    //   366: aload_1
    //   367: putfield g : Ljava/io/Serializable;
    //   370: aload_3
    //   371: iconst_5
    //   372: putfield k : I
    //   375: aload #6
    //   377: iconst_0
    //   378: aload_3
    //   379: invokevirtual f : (ZLds;)Ljava/lang/Object;
    //   382: astore_3
    //   383: aload_3
    //   384: aload #7
    //   386: if_acmpne -> 392
    //   389: aload #7
    //   391: areturn
    //   392: goto -> 405
    //   395: astore_3
    //   396: aload_2
    //   397: ifnull -> 407
    //   400: aload_2
    //   401: aload_3
    //   402: invokestatic a : (Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    //   405: aload_1
    //   406: athrow
    //   407: aload_3
    //   408: athrow
    // Exception table:
    //   from	to	target	type
    //   132	137	140	android/database/SQLException
    //   170	175	181	finally
    //   264	306	353	finally
    //   357	359	359	finally
    //   360	383	395	android/database/SQLException
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\w81.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */