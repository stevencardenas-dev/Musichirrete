import java.util.LinkedHashSet;

public final class e11 {
  public final ip1 a = new ip1(f11.i);
  
  public final ip1 b;
  
  public final ed1 c;
  
  public final v8 d;
  
  public final v8 e;
  
  public w31 f;
  
  public int g;
  
  public d11 h;
  
  public final LinkedHashSet i;
  
  public final LinkedHashSet j;
  
  public final LinkedHashSet k;
  
  public boolean l;
  
  public boolean m;
  
  public boolean n;
  
  public e11() {
    ip1 ip11 = new ip1(new c11());
    this.b = ip11;
    this.c = new ed1(ip11);
    this.d = new v8();
    this.e = new v8();
    this.i = new LinkedHashSet();
    this.j = new LinkedHashSet();
    this.k = new LinkedHashSet();
  }
  
  public final void a(n2 paramn2, d11 paramd11, int paramInt) {
    paramn2.getClass();
    if (paramd11.a == null) {
      boolean bool;
      LinkedHashSet<d11> linkedHashSet;
      if (paramInt != 0) {
        if (paramInt != 1) {
          linkedHashSet = this.i;
        } else {
          linkedHashSet = this.j;
        } 
      } else {
        linkedHashSet = this.k;
      } 
      linkedHashSet.add(paramd11);
      paramd11.a = paramn2;
      ((c11)this.c.b.f()).getClass();
      if (paramInt != 0) {
        if (paramInt != 1) {
          bool = this.n;
        } else {
          bool = this.l;
        } 
      } else {
        bool = this.m;
      } 
      paramd11.b(bool);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder("Input '");
    stringBuilder.append(paramd11);
    n2 n21 = paramd11.a;
    stringBuilder.append("' is already added to dispatcher ");
    stringBuilder.append(n21);
    stringBuilder.append('.');
    throw new IllegalArgumentException(stringBuilder.toString().toString());
  }
  
  public final void b() {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_0
    //   3: getfield d : Lv8;
    //   6: astore #14
    //   8: aload #14
    //   10: ifnull -> 27
    //   13: aload #14
    //   15: invokevirtual isEmpty : ()Z
    //   18: ifeq -> 27
    //   21: iconst_0
    //   22: istore #4
    //   24: goto -> 66
    //   27: aload #14
    //   29: invokevirtual iterator : ()Ljava/util/Iterator;
    //   32: astore #7
    //   34: aload #7
    //   36: invokeinterface hasNext : ()Z
    //   41: ifeq -> 21
    //   44: aload #7
    //   46: invokeinterface next : ()Ljava/lang/Object;
    //   51: checkcast w31
    //   54: getfield b : Z
    //   57: ifne -> 63
    //   60: goto -> 34
    //   63: iconst_1
    //   64: istore #4
    //   66: aload_0
    //   67: getfield e : Lv8;
    //   70: astore #13
    //   72: aload #13
    //   74: ifnull -> 91
    //   77: aload #13
    //   79: invokevirtual isEmpty : ()Z
    //   82: ifeq -> 91
    //   85: iconst_0
    //   86: istore #5
    //   88: goto -> 130
    //   91: aload #13
    //   93: invokevirtual iterator : ()Ljava/util/Iterator;
    //   96: astore #7
    //   98: aload #7
    //   100: invokeinterface hasNext : ()Z
    //   105: ifeq -> 85
    //   108: aload #7
    //   110: invokeinterface next : ()Ljava/lang/Object;
    //   115: checkcast w31
    //   118: getfield b : Z
    //   121: ifne -> 127
    //   124: goto -> 98
    //   127: iconst_1
    //   128: istore #5
    //   130: iload #4
    //   132: ifne -> 149
    //   135: iload #5
    //   137: ifeq -> 143
    //   140: goto -> 149
    //   143: iconst_0
    //   144: istore #6
    //   146: goto -> 152
    //   149: iconst_1
    //   150: istore #6
    //   152: aload_0
    //   153: getfield m : Z
    //   156: iload #4
    //   158: if_icmpeq -> 166
    //   161: iconst_1
    //   162: istore_1
    //   163: goto -> 168
    //   166: iconst_0
    //   167: istore_1
    //   168: aload_0
    //   169: getfield l : Z
    //   172: iload #5
    //   174: if_icmpeq -> 182
    //   177: iconst_1
    //   178: istore_2
    //   179: goto -> 184
    //   182: iconst_0
    //   183: istore_2
    //   184: aload_0
    //   185: getfield n : Z
    //   188: iload #6
    //   190: if_icmpeq -> 196
    //   193: goto -> 198
    //   196: iconst_0
    //   197: istore_3
    //   198: aload_0
    //   199: getfield k : Ljava/util/LinkedHashSet;
    //   202: astore #12
    //   204: iload_1
    //   205: ifeq -> 245
    //   208: aload #12
    //   210: invokeinterface iterator : ()Ljava/util/Iterator;
    //   215: astore #7
    //   217: aload #7
    //   219: invokeinterface hasNext : ()Z
    //   224: ifeq -> 245
    //   227: aload #7
    //   229: invokeinterface next : ()Ljava/lang/Object;
    //   234: checkcast d11
    //   237: iload #4
    //   239: invokevirtual b : (Z)V
    //   242: goto -> 217
    //   245: aload_0
    //   246: getfield j : Ljava/util/LinkedHashSet;
    //   249: astore #10
    //   251: iload_2
    //   252: ifeq -> 292
    //   255: aload #10
    //   257: invokeinterface iterator : ()Ljava/util/Iterator;
    //   262: astore #7
    //   264: aload #7
    //   266: invokeinterface hasNext : ()Z
    //   271: ifeq -> 292
    //   274: aload #7
    //   276: invokeinterface next : ()Ljava/lang/Object;
    //   281: checkcast d11
    //   284: iload #5
    //   286: invokevirtual b : (Z)V
    //   289: goto -> 264
    //   292: aload_0
    //   293: getfield i : Ljava/util/LinkedHashSet;
    //   296: astore #11
    //   298: iload_3
    //   299: ifeq -> 339
    //   302: aload #11
    //   304: invokeinterface iterator : ()Ljava/util/Iterator;
    //   309: astore #7
    //   311: aload #7
    //   313: invokeinterface hasNext : ()Z
    //   318: ifeq -> 339
    //   321: aload #7
    //   323: invokeinterface next : ()Ljava/lang/Object;
    //   328: checkcast d11
    //   331: iload #6
    //   333: invokevirtual b : (Z)V
    //   336: goto -> 311
    //   339: aload_0
    //   340: iload #4
    //   342: putfield m : Z
    //   345: aload_0
    //   346: iload #5
    //   348: putfield l : Z
    //   351: aload_0
    //   352: iload #6
    //   354: putfield n : Z
    //   357: aload_0
    //   358: getfield f : Lw31;
    //   361: astore #7
    //   363: aload #7
    //   365: astore #8
    //   367: aload #7
    //   369: ifnonnull -> 379
    //   372: aload_0
    //   373: iconst_0
    //   374: invokevirtual c : (I)Lw31;
    //   377: astore #8
    //   379: aload_0
    //   380: getfield f : Lw31;
    //   383: astore #9
    //   385: aload #9
    //   387: astore #7
    //   389: aload #9
    //   391: ifnonnull -> 401
    //   394: aload_0
    //   395: iconst_0
    //   396: invokevirtual c : (I)Lw31;
    //   399: astore #7
    //   401: aload #7
    //   403: aload #8
    //   405: invokestatic c : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   408: ifne -> 414
    //   411: goto -> 714
    //   414: aload #7
    //   416: ifnonnull -> 431
    //   419: new c11
    //   422: dup
    //   423: invokespecial <init> : ()V
    //   426: astore #7
    //   428: goto -> 572
    //   431: new java/util/ArrayList
    //   434: dup
    //   435: invokespecial <init> : ()V
    //   438: astore #8
    //   440: aload #14
    //   442: invokevirtual iterator : ()Ljava/util/Iterator;
    //   445: astore #9
    //   447: aload #9
    //   449: invokeinterface hasNext : ()Z
    //   454: ifeq -> 474
    //   457: aload #9
    //   459: invokeinterface next : ()Ljava/lang/Object;
    //   464: checkcast w31
    //   467: invokevirtual getClass : ()Ljava/lang/Class;
    //   470: pop
    //   471: goto -> 447
    //   474: aload #13
    //   476: invokevirtual iterator : ()Ljava/util/Iterator;
    //   479: astore #9
    //   481: aload #9
    //   483: invokeinterface hasNext : ()Z
    //   488: ifeq -> 508
    //   491: aload #9
    //   493: invokeinterface next : ()Ljava/lang/Object;
    //   498: checkcast w31
    //   501: invokevirtual getClass : ()Ljava/lang/Class;
    //   504: pop
    //   505: goto -> 481
    //   508: aload #7
    //   510: getfield a : Lx31;
    //   513: astore #9
    //   515: new tn0
    //   518: dup
    //   519: bipush #10
    //   521: invokespecial <init> : (I)V
    //   524: astore #7
    //   526: aload #7
    //   528: aload #8
    //   530: invokestatic l0 : (Ljava/util/AbstractList;Ljava/lang/Iterable;)V
    //   533: aload #7
    //   535: aload #9
    //   537: invokevirtual add : (Ljava/lang/Object;)Z
    //   540: pop
    //   541: aload #7
    //   543: getstatic d40.b : Ld40;
    //   546: invokestatic l0 : (Ljava/util/AbstractList;Ljava/lang/Iterable;)V
    //   549: aload #7
    //   551: invokestatic b : (Ltn0;)Ltn0;
    //   554: astore #7
    //   556: new c11
    //   559: dup
    //   560: aload #8
    //   562: invokevirtual size : ()I
    //   565: aload #7
    //   567: invokespecial <init> : (ILjava/util/List;)V
    //   570: astore #7
    //   572: aload_0
    //   573: getfield b : Lip1;
    //   576: astore #8
    //   578: aload #8
    //   580: invokevirtual f : ()Ljava/lang/Object;
    //   583: checkcast c11
    //   586: aload #7
    //   588: invokestatic c : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   591: ifeq -> 597
    //   594: goto -> 714
    //   597: aload #8
    //   599: aconst_null
    //   600: aload #7
    //   602: invokevirtual g : (Ljava/lang/Object;Ljava/lang/Object;)Z
    //   605: pop
    //   606: aload #12
    //   608: invokeinterface iterator : ()Ljava/util/Iterator;
    //   613: astore #7
    //   615: aload #7
    //   617: invokeinterface hasNext : ()Z
    //   622: ifeq -> 642
    //   625: aload #7
    //   627: invokeinterface next : ()Ljava/lang/Object;
    //   632: checkcast d11
    //   635: invokevirtual getClass : ()Ljava/lang/Class;
    //   638: pop
    //   639: goto -> 615
    //   642: aload #10
    //   644: invokeinterface iterator : ()Ljava/util/Iterator;
    //   649: astore #7
    //   651: aload #7
    //   653: invokeinterface hasNext : ()Z
    //   658: ifeq -> 678
    //   661: aload #7
    //   663: invokeinterface next : ()Ljava/lang/Object;
    //   668: checkcast d11
    //   671: invokevirtual getClass : ()Ljava/lang/Class;
    //   674: pop
    //   675: goto -> 651
    //   678: aload #11
    //   680: invokeinterface iterator : ()Ljava/util/Iterator;
    //   685: astore #7
    //   687: aload #7
    //   689: invokeinterface hasNext : ()Z
    //   694: ifeq -> 714
    //   697: aload #7
    //   699: invokeinterface next : ()Ljava/lang/Object;
    //   704: checkcast d11
    //   707: invokevirtual getClass : ()Ljava/lang/Class;
    //   710: pop
    //   711: goto -> 687
    //   714: return
  }
  
  public final w31 c(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Lv8;
    //   4: astore #5
    //   6: aload_0
    //   7: getfield d : Lv8;
    //   10: astore_2
    //   11: aconst_null
    //   12: astore #4
    //   14: aconst_null
    //   15: astore_3
    //   16: iload_1
    //   17: iconst_m1
    //   18: if_icmpeq -> 231
    //   21: iload_1
    //   22: ifeq -> 131
    //   25: iload_1
    //   26: iconst_1
    //   27: if_icmpne -> 93
    //   30: aload_2
    //   31: invokevirtual iterator : ()Ljava/util/Iterator;
    //   34: astore_2
    //   35: aload_2
    //   36: invokeinterface hasNext : ()Z
    //   41: ifeq -> 60
    //   44: aload_2
    //   45: invokeinterface next : ()Ljava/lang/Object;
    //   50: checkcast w31
    //   53: invokevirtual getClass : ()Ljava/lang/Class;
    //   56: pop
    //   57: goto -> 35
    //   60: aload #5
    //   62: invokevirtual iterator : ()Ljava/util/Iterator;
    //   65: astore_2
    //   66: aload_2
    //   67: invokeinterface hasNext : ()Z
    //   72: ifeq -> 91
    //   75: aload_2
    //   76: invokeinterface next : ()Ljava/lang/Object;
    //   81: checkcast w31
    //   84: invokevirtual getClass : ()Ljava/lang/Class;
    //   87: pop
    //   88: goto -> 66
    //   91: aconst_null
    //   92: areturn
    //   93: new java/lang/StringBuilder
    //   96: dup
    //   97: ldc 'Unsupported direction: ''
    //   99: invokespecial <init> : (Ljava/lang/String;)V
    //   102: astore_2
    //   103: aload_2
    //   104: iload_1
    //   105: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: aload_2
    //   110: ldc ''.'
    //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: new java/lang/IllegalStateException
    //   119: dup
    //   120: aload_2
    //   121: invokevirtual toString : ()Ljava/lang/String;
    //   124: invokevirtual toString : ()Ljava/lang/String;
    //   127: invokespecial <init> : (Ljava/lang/String;)V
    //   130: athrow
    //   131: aload_2
    //   132: invokevirtual iterator : ()Ljava/util/Iterator;
    //   135: astore #6
    //   137: aload #6
    //   139: invokeinterface hasNext : ()Z
    //   144: ifeq -> 173
    //   147: aload #6
    //   149: invokeinterface next : ()Ljava/lang/Object;
    //   154: astore #4
    //   156: aload #4
    //   158: astore_2
    //   159: aload #4
    //   161: checkcast w31
    //   164: getfield b : Z
    //   167: ifne -> 175
    //   170: goto -> 137
    //   173: aconst_null
    //   174: astore_2
    //   175: aload_2
    //   176: checkcast w31
    //   179: astore_2
    //   180: aload_2
    //   181: ifnonnull -> 229
    //   184: aload #5
    //   186: invokevirtual iterator : ()Ljava/util/Iterator;
    //   189: astore #4
    //   191: aload_3
    //   192: astore_2
    //   193: aload #4
    //   195: invokeinterface hasNext : ()Z
    //   200: ifeq -> 224
    //   203: aload #4
    //   205: invokeinterface next : ()Ljava/lang/Object;
    //   210: astore_2
    //   211: aload_2
    //   212: checkcast w31
    //   215: getfield b : Z
    //   218: ifne -> 224
    //   221: goto -> 191
    //   224: aload_2
    //   225: checkcast w31
    //   228: areturn
    //   229: aload_2
    //   230: areturn
    //   231: aload_2
    //   232: invokevirtual iterator : ()Ljava/util/Iterator;
    //   235: astore_3
    //   236: aload_3
    //   237: invokeinterface hasNext : ()Z
    //   242: ifeq -> 265
    //   245: aload_3
    //   246: invokeinterface next : ()Ljava/lang/Object;
    //   251: astore_2
    //   252: aload_2
    //   253: checkcast w31
    //   256: getfield b : Z
    //   259: ifeq -> 236
    //   262: goto -> 267
    //   265: aconst_null
    //   266: astore_2
    //   267: aload_2
    //   268: checkcast w31
    //   271: astore_2
    //   272: aload_2
    //   273: ifnonnull -> 316
    //   276: aload #5
    //   278: invokevirtual iterator : ()Ljava/util/Iterator;
    //   281: astore_3
    //   282: aload #4
    //   284: astore_2
    //   285: aload_3
    //   286: invokeinterface hasNext : ()Z
    //   291: ifeq -> 311
    //   294: aload_3
    //   295: invokeinterface next : ()Ljava/lang/Object;
    //   300: astore_2
    //   301: aload_2
    //   302: checkcast w31
    //   305: getfield b : Z
    //   308: ifeq -> 282
    //   311: aload_2
    //   312: checkcast w31
    //   315: areturn
    //   316: aload_2
    //   317: areturn
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\e11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */