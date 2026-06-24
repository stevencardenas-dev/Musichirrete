public final class vt extends pr1 implements ad0 {
  public aw1 g;
  
  public int h;
  
  public Object i;
  
  public final boolean j;
  
  public final boolean k;
  
  public final eh1 l;
  
  public final wc0 m;
  
  public vt(cs paramcs, wc0 paramwc0, eh1 parameh1, boolean paramBoolean1, boolean paramBoolean2) {
    super(2, paramcs);
  }
  
  public final Object g(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    return ((vt)l((cs)paramObject2, paramObject1)).n(l02.a);
  }
  
  public final cs l(cs paramcs, Object paramObject) {
    eh1 eh11 = this.l;
    paramcs = new vt(paramcs, this.m, eh11, this.j, this.k);
    ((vt)paramcs).i = paramObject;
    return paramcs;
  }
  
  public final Object n(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : I
    //   4: istore_2
    //   5: aload_0
    //   6: getfield m : Lwc0;
    //   9: astore #9
    //   11: aload_0
    //   12: getfield l : Leh1;
    //   15: astore #7
    //   17: aload_0
    //   18: getfield k : Z
    //   21: istore_3
    //   22: getstatic ys.b : Lys;
    //   25: astore #8
    //   27: iload_2
    //   28: ifeq -> 141
    //   31: iload_2
    //   32: iconst_1
    //   33: if_icmpeq -> 116
    //   36: iload_2
    //   37: iconst_2
    //   38: if_icmpeq -> 91
    //   41: iload_2
    //   42: iconst_3
    //   43: if_icmpeq -> 75
    //   46: iload_2
    //   47: iconst_4
    //   48: if_icmpne -> 67
    //   51: aload_0
    //   52: getfield i : Ljava/lang/Object;
    //   55: astore #4
    //   57: aload_1
    //   58: invokestatic r0 : (Ljava/lang/Object;)V
    //   61: aload_1
    //   62: astore #5
    //   64: goto -> 390
    //   67: getstatic org/jaudiotagger/audio/dsf/qdA/GMDx.wfaPLkPcWEyJXI : Ljava/lang/String;
    //   70: invokestatic f : (Ljava/lang/String;)V
    //   73: aconst_null
    //   74: areturn
    //   75: aload_0
    //   76: getfield i : Ljava/lang/Object;
    //   79: checkcast bw1
    //   82: astore #4
    //   84: aload_1
    //   85: invokestatic r0 : (Ljava/lang/Object;)V
    //   88: goto -> 349
    //   91: aload_0
    //   92: getfield g : Law1;
    //   95: astore #4
    //   97: aload_0
    //   98: getfield i : Ljava/lang/Object;
    //   101: checkcast bw1
    //   104: astore #5
    //   106: aload_1
    //   107: invokestatic r0 : (Ljava/lang/Object;)V
    //   110: aload #5
    //   112: astore_1
    //   113: goto -> 273
    //   116: aload_0
    //   117: getfield g : Law1;
    //   120: astore #4
    //   122: aload_0
    //   123: getfield i : Ljava/lang/Object;
    //   126: checkcast bw1
    //   129: astore #5
    //   131: aload_1
    //   132: invokestatic r0 : (Ljava/lang/Object;)V
    //   135: aload_1
    //   136: astore #6
    //   138: goto -> 223
    //   141: aload_1
    //   142: invokestatic r0 : (Ljava/lang/Object;)V
    //   145: aload_0
    //   146: getfield i : Ljava/lang/Object;
    //   149: checkcast bw1
    //   152: astore #4
    //   154: aload_0
    //   155: getfield j : Z
    //   158: ifeq -> 427
    //   161: iload_3
    //   162: ifeq -> 172
    //   165: getstatic aw1.b : Law1;
    //   168: astore_1
    //   169: goto -> 176
    //   172: getstatic aw1.c : Law1;
    //   175: astore_1
    //   176: iload_3
    //   177: ifne -> 282
    //   180: aload_0
    //   181: aload #4
    //   183: putfield i : Ljava/lang/Object;
    //   186: aload_0
    //   187: aload_1
    //   188: putfield g : Law1;
    //   191: aload_0
    //   192: iconst_1
    //   193: putfield h : I
    //   196: aload #4
    //   198: aload_0
    //   199: invokeinterface c : (Lpr1;)Ljava/lang/Object;
    //   204: astore #6
    //   206: aload #6
    //   208: aload #8
    //   210: if_acmpne -> 216
    //   213: goto -> 380
    //   216: aload #4
    //   218: astore #5
    //   220: aload_1
    //   221: astore #4
    //   223: aload #6
    //   225: checkcast java/lang/Boolean
    //   228: invokevirtual booleanValue : ()Z
    //   231: ifne -> 276
    //   234: aload #7
    //   236: invokevirtual f : ()Lyi0;
    //   239: astore_1
    //   240: aload_0
    //   241: aload #5
    //   243: putfield i : Ljava/lang/Object;
    //   246: aload_0
    //   247: aload #4
    //   249: putfield g : Law1;
    //   252: aload_0
    //   253: iconst_2
    //   254: putfield h : I
    //   257: aload_1
    //   258: aload_0
    //   259: invokevirtual a : (Lpr1;)Ljava/lang/Object;
    //   262: aload #8
    //   264: if_acmpne -> 270
    //   267: goto -> 380
    //   270: aload #5
    //   272: astore_1
    //   273: goto -> 292
    //   276: aload #5
    //   278: astore_1
    //   279: goto -> 292
    //   282: aload #4
    //   284: astore #5
    //   286: aload_1
    //   287: astore #4
    //   289: aload #5
    //   291: astore_1
    //   292: new ut
    //   295: dup
    //   296: aconst_null
    //   297: aload #9
    //   299: iconst_0
    //   300: invokespecial <init> : (Lcs;Lwc0;I)V
    //   303: astore #5
    //   305: aload_0
    //   306: aload_1
    //   307: putfield i : Ljava/lang/Object;
    //   310: aload_0
    //   311: aconst_null
    //   312: putfield g : Law1;
    //   315: aload_0
    //   316: iconst_3
    //   317: putfield h : I
    //   320: aload_1
    //   321: aload #4
    //   323: aload #5
    //   325: aload_0
    //   326: invokeinterface a : (Law1;Lad0;Lpr1;)Ljava/lang/Object;
    //   331: astore #5
    //   333: aload_1
    //   334: astore #4
    //   336: aload #5
    //   338: astore_1
    //   339: aload #5
    //   341: aload #8
    //   343: if_acmpne -> 349
    //   346: goto -> 380
    //   349: iload_3
    //   350: ifne -> 425
    //   353: aload_0
    //   354: aload_1
    //   355: putfield i : Ljava/lang/Object;
    //   358: aload_0
    //   359: iconst_4
    //   360: putfield h : I
    //   363: aload #4
    //   365: aload_0
    //   366: invokeinterface c : (Lpr1;)Ljava/lang/Object;
    //   371: astore #4
    //   373: aload #4
    //   375: aload #8
    //   377: if_acmpne -> 383
    //   380: aload #8
    //   382: areturn
    //   383: aload #4
    //   385: astore #5
    //   387: aload_1
    //   388: astore #4
    //   390: aload #5
    //   392: checkcast java/lang/Boolean
    //   395: invokevirtual booleanValue : ()Z
    //   398: ifne -> 422
    //   401: aload #7
    //   403: invokevirtual f : ()Lyi0;
    //   406: astore_1
    //   407: aload_1
    //   408: getfield b : Ljx1;
    //   411: aload_1
    //   412: getfield e : Li2;
    //   415: aload_1
    //   416: getfield f : Li2;
    //   419: invokevirtual e : (Llc0;Llc0;)V
    //   422: aload #4
    //   424: areturn
    //   425: aload_1
    //   426: areturn
    //   427: aload #4
    //   429: invokevirtual getClass : ()Ljava/lang/Class;
    //   432: pop
    //   433: aload #9
    //   435: aload #4
    //   437: checkcast ad1
    //   440: invokeinterface b : ()Lth1;
    //   445: invokeinterface h : (Ljava/lang/Object;)Ljava/lang/Object;
    //   450: areturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */