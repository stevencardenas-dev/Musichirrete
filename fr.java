import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public final class fr extends er {
  public int A0;
  
  public vj[] B0;
  
  public vj[] C0;
  
  public int D0;
  
  public boolean E0;
  
  public boolean F0;
  
  public WeakReference G0;
  
  public WeakReference H0;
  
  public WeakReference I0;
  
  public WeakReference J0;
  
  public final HashSet K0;
  
  public final re L0;
  
  public ArrayList q0 = new ArrayList();
  
  public final p01 r0 = new p01(this);
  
  public final hy s0;
  
  public int t0;
  
  public hq u0;
  
  public boolean v0;
  
  public final ln0 w0;
  
  public int x0;
  
  public int y0;
  
  public int z0;
  
  public fr() {
    Object object = new Object();
    ((hy)object).b = true;
    ((hy)object).c = true;
    ((hy)object).e = new ArrayList();
    new ArrayList();
    ((hy)object).f = null;
    ((hy)object).g = (re)new Object();
    ((hy)object).h = new ArrayList();
    ((hy)object).a = this;
    ((hy)object).d = this;
    this.s0 = (hy)object;
    this.u0 = null;
    this.v0 = false;
    this.w0 = new ln0();
    this.z0 = 0;
    this.A0 = 0;
    this.B0 = new vj[4];
    this.C0 = new vj[4];
    this.D0 = 257;
    this.E0 = false;
    this.F0 = false;
    this.G0 = null;
    this.H0 = null;
    this.I0 = null;
    this.J0 = null;
    this.K0 = new HashSet();
    this.L0 = (re)new Object();
  }
  
  public static void R(er paramer, hq paramhq, re paramre) {
    boolean bool1;
    boolean bool2;
    if (paramhq == null)
      return; 
    int i = paramer.g0;
    int[] arrayOfInt1 = paramer.t;
    if (i == 8 || paramer instanceof bf0 || paramer instanceof yb) {
      paramre.e = 0;
      paramre.f = 0;
      return;
    } 
    int[] arrayOfInt2 = paramer.p0;
    paramre.a = arrayOfInt2[0];
    boolean bool3 = true;
    paramre.b = arrayOfInt2[1];
    paramre.c = paramer.o();
    paramre.d = paramer.i();
    paramre.i = false;
    paramre.j = 0;
    if (paramre.a == 3) {
      j = 1;
    } else {
      j = 0;
    } 
    if (paramre.b == 3) {
      i = 1;
    } else {
      i = 0;
    } 
    if (j && paramer.W > 0.0F) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (i != 0 && paramer.W > 0.0F) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    int k = j;
    if (j) {
      k = j;
      if (paramer.r(0)) {
        k = j;
        if (paramer.r == 0) {
          k = j;
          if (!bool2) {
            paramre.a = 2;
            if (i != 0 && paramer.s == 0)
              paramre.a = 1; 
            k = 0;
          } 
        } 
      } 
    } 
    int j = i;
    if (i != 0) {
      j = i;
      if (paramer.r(1)) {
        j = i;
        if (paramer.s == 0) {
          j = i;
          if (!bool1) {
            paramre.b = 2;
            if (k != 0 && paramer.r == 0)
              paramre.b = 1; 
            j = 0;
          } 
        } 
      } 
    } 
    if (paramer.y()) {
      paramre.a = 1;
      k = 0;
    } 
    if (paramer.z()) {
      paramre.b = 1;
      j = 0;
    } 
    if (bool2)
      if (arrayOfInt1[0] == 4) {
        paramre.a = 1;
      } else if (j == 0) {
        if (paramre.b == 1) {
          i = paramre.d;
        } else {
          paramre.a = 2;
          paramhq.b(paramer, paramre);
          i = paramre.f;
        } 
        paramre.a = 1;
        paramre.c = (int)(paramer.W * i);
      }  
    if (bool1)
      if (arrayOfInt1[1] == 4) {
        paramre.b = 1;
      } else if (k == 0) {
        if (paramre.a == 1) {
          i = paramre.c;
        } else {
          paramre.b = 2;
          paramhq.b(paramer, paramre);
          i = paramre.e;
        } 
        paramre.b = 1;
        j = paramer.X;
        float f = paramer.W;
        if (j == -1) {
          paramre.d = (int)(i / f);
        } else {
          paramre.d = (int)(f * i);
        } 
      }  
    paramhq.b(paramer, paramre);
    paramer.K(paramre.e);
    paramer.H(paramre.f);
    paramer.E = paramre.h;
    i = paramre.g;
    paramer.a0 = i;
    if (i <= 0)
      bool3 = false; 
    paramer.E = bool3;
    paramre.j = 0;
  }
  
  public final void A() {
    this.w0.t();
    this.x0 = 0;
    this.y0 = 0;
    this.q0.clear();
    super.A();
  }
  
  public final void C(zv0 paramzv0) {
    super.C(paramzv0);
    int i = this.q0.size();
    for (byte b = 0; b < i; b++)
      ((er)this.q0.get(b)).C(paramzv0); 
  }
  
  public final void L(boolean paramBoolean1, boolean paramBoolean2) {
    super.L(paramBoolean1, paramBoolean2);
    int i = this.q0.size();
    for (byte b = 0; b < i; b++)
      ((er)this.q0.get(b)).L(paramBoolean1, paramBoolean2); 
  }
  
  public final void N(er paramer, int paramInt) {
    if (paramInt == 0) {
      paramInt = this.z0;
      vj[] arrayOfVj = this.C0;
      if (paramInt + 1 >= arrayOfVj.length)
        this.C0 = Arrays.<vj>copyOf(arrayOfVj, arrayOfVj.length * 2); 
      arrayOfVj = this.C0;
      paramInt = this.z0;
      arrayOfVj[paramInt] = new vj(paramer, 0, this.v0);
      this.z0 = paramInt + 1;
      return;
    } 
    if (paramInt == 1) {
      paramInt = this.A0;
      vj[] arrayOfVj = this.B0;
      if (paramInt + 1 >= arrayOfVj.length)
        this.B0 = Arrays.<vj>copyOf(arrayOfVj, arrayOfVj.length * 2); 
      arrayOfVj = this.B0;
      paramInt = this.A0;
      arrayOfVj[paramInt] = new vj(paramer, 1, this.v0);
      this.A0 = paramInt + 1;
    } 
  }
  
  public final void O(ln0 paramln0) {
    boolean bool = S(64);
    b(paramln0, bool);
    int k = this.q0.size();
    int i = 0;
    int j = 0;
    while (i < k) {
      er er1 = this.q0.get(i);
      boolean[] arrayOfBoolean = er1.S;
      arrayOfBoolean[0] = false;
      arrayOfBoolean[1] = false;
      if (er1 instanceof yb)
        j = 1; 
      i++;
    } 
    if (j)
      for (i = 0; i < k; i++) {
        er er1 = this.q0.get(i);
        if (er1 instanceof yb) {
          yb yb = (yb)er1;
          for (j = 0; j < yb.r0; j++) {
            er1 = yb.q0[j];
            if (yb.t0 || er1.c()) {
              int m = yb.s0;
              if (m == 0 || m == 1) {
                er1.S[0] = true;
              } else if (m == 2 || m == 3) {
                er1.S[1] = true;
              } 
            } 
          } 
        } 
      }  
    HashSet<er> hashSet = this.K0;
    hashSet.clear();
    for (i = 0; i < k; i++) {
      er er1 = this.q0.get(i);
      er1.getClass();
      if (er1 instanceof bf0)
        er1.b(paramln0, bool); 
    } 
    while (hashSet.size() > 0) {
      i = hashSet.size();
      Iterator<er> iterator = hashSet.iterator();
      if (!iterator.hasNext()) {
        if (i == hashSet.size()) {
          iterator = hashSet.iterator();
          while (iterator.hasNext())
            ((er)iterator.next()).b(paramln0, bool); 
          hashSet.clear();
        } 
        continue;
      } 
      ((er)iterator.next()).getClass();
      tp.b();
      return;
    } 
    if (ln0.q) {
      hashSet = new HashSet();
      for (i = 0; i < k; i++) {
        er er1 = this.q0.get(i);
        er1.getClass();
        if (!(er1 instanceof bf0))
          hashSet.add(er1); 
      } 
      if (this.p0[0] == 2) {
        i = 0;
      } else {
        i = 1;
      } 
      a(this, paramln0, hashSet, i, false);
      for (er er1 : hashSet) {
        qz1.g(this, paramln0, er1);
        er1.b(paramln0, bool);
      } 
    } else {
      for (i = 0; i < k; i++) {
        er er1 = this.q0.get(i);
        if (er1 instanceof fr) {
          int[] arrayOfInt = er1.p0;
          int m = arrayOfInt[0];
          j = arrayOfInt[1];
          if (m == 2)
            er1.I(1); 
          if (j == 2)
            er1.J(1); 
          er1.b(paramln0, bool);
          if (m == 2)
            er1.I(m); 
          if (j == 2)
            er1.J(j); 
        } else {
          qz1.g(this, paramln0, er1);
          if (!(er1 instanceof bf0))
            er1.b(paramln0, bool); 
        } 
      } 
    } 
    if (this.z0 > 0)
      qv.e(this, paramln0, null, 0); 
    if (this.A0 > 0)
      qv.e(this, paramln0, null, 1); 
  }
  
  public final boolean P(int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield s0 : Lhy;
    //   4: astore #14
    //   6: aload #14
    //   8: getfield e : Ljava/util/ArrayList;
    //   11: astore #12
    //   13: aload #14
    //   15: getfield a : Lfr;
    //   18: astore #13
    //   20: iconst_0
    //   21: istore #11
    //   23: aload #13
    //   25: iconst_0
    //   26: invokevirtual h : (I)I
    //   29: istore #6
    //   31: aload #13
    //   33: iconst_1
    //   34: invokevirtual h : (I)I
    //   37: istore #7
    //   39: aload #13
    //   41: invokevirtual p : ()I
    //   44: istore #8
    //   46: aload #13
    //   48: invokevirtual q : ()I
    //   51: istore #5
    //   53: iload_2
    //   54: ifeq -> 232
    //   57: iload #6
    //   59: iconst_2
    //   60: if_icmpeq -> 69
    //   63: iload #7
    //   65: iconst_2
    //   66: if_icmpne -> 232
    //   69: aload #12
    //   71: invokevirtual size : ()I
    //   74: istore #9
    //   76: iconst_0
    //   77: istore_3
    //   78: iload_2
    //   79: istore #10
    //   81: iload_3
    //   82: iload #9
    //   84: if_icmpge -> 133
    //   87: aload #12
    //   89: iload_3
    //   90: invokevirtual get : (I)Ljava/lang/Object;
    //   93: astore #15
    //   95: iload_3
    //   96: iconst_1
    //   97: iadd
    //   98: istore #4
    //   100: aload #15
    //   102: checkcast m52
    //   105: astore #15
    //   107: iload #4
    //   109: istore_3
    //   110: aload #15
    //   112: getfield f : I
    //   115: iload_1
    //   116: if_icmpne -> 78
    //   119: iload #4
    //   121: istore_3
    //   122: aload #15
    //   124: invokevirtual k : ()Z
    //   127: ifne -> 78
    //   130: iconst_0
    //   131: istore #10
    //   133: iload_1
    //   134: ifne -> 186
    //   137: iload #10
    //   139: ifeq -> 232
    //   142: iload #6
    //   144: iconst_2
    //   145: if_icmpne -> 232
    //   148: aload #13
    //   150: iconst_1
    //   151: invokevirtual I : (I)V
    //   154: aload #13
    //   156: aload #14
    //   158: aload #13
    //   160: iconst_0
    //   161: invokevirtual d : (Lfr;I)I
    //   164: invokevirtual K : (I)V
    //   167: aload #13
    //   169: getfield d : Lfg0;
    //   172: getfield e : Lrz;
    //   175: aload #13
    //   177: invokevirtual o : ()I
    //   180: invokevirtual d : (I)V
    //   183: goto -> 232
    //   186: iload #10
    //   188: ifeq -> 232
    //   191: iload #7
    //   193: iconst_2
    //   194: if_icmpne -> 232
    //   197: aload #13
    //   199: iconst_1
    //   200: invokevirtual J : (I)V
    //   203: aload #13
    //   205: aload #14
    //   207: aload #13
    //   209: iconst_1
    //   210: invokevirtual d : (Lfr;I)I
    //   213: invokevirtual H : (I)V
    //   216: aload #13
    //   218: getfield e : Ld22;
    //   221: getfield e : Lrz;
    //   224: aload #13
    //   226: invokevirtual i : ()I
    //   229: invokevirtual d : (I)V
    //   232: aload #13
    //   234: getfield p0 : [I
    //   237: astore #15
    //   239: iload_1
    //   240: ifne -> 299
    //   243: aload #15
    //   245: iconst_0
    //   246: iaload
    //   247: istore_3
    //   248: iload_3
    //   249: iconst_1
    //   250: if_icmpeq -> 258
    //   253: iload_3
    //   254: iconst_4
    //   255: if_icmpne -> 317
    //   258: aload #13
    //   260: invokevirtual o : ()I
    //   263: iload #8
    //   265: iadd
    //   266: istore_3
    //   267: aload #13
    //   269: getfield d : Lfg0;
    //   272: getfield i : Liy;
    //   275: iload_3
    //   276: invokevirtual d : (I)V
    //   279: aload #13
    //   281: getfield d : Lfg0;
    //   284: getfield e : Lrz;
    //   287: iload_3
    //   288: iload #8
    //   290: isub
    //   291: invokevirtual d : (I)V
    //   294: iconst_1
    //   295: istore_3
    //   296: goto -> 361
    //   299: aload #15
    //   301: iconst_1
    //   302: iaload
    //   303: istore_3
    //   304: iload_3
    //   305: iconst_1
    //   306: if_icmpeq -> 322
    //   309: iload_3
    //   310: iconst_4
    //   311: if_icmpne -> 317
    //   314: goto -> 322
    //   317: iconst_0
    //   318: istore_3
    //   319: goto -> 361
    //   322: aload #13
    //   324: invokevirtual i : ()I
    //   327: iload #5
    //   329: iadd
    //   330: istore_3
    //   331: aload #13
    //   333: getfield e : Ld22;
    //   336: getfield i : Liy;
    //   339: iload_3
    //   340: invokevirtual d : (I)V
    //   343: aload #13
    //   345: getfield e : Ld22;
    //   348: getfield e : Lrz;
    //   351: iload_3
    //   352: iload #5
    //   354: isub
    //   355: invokevirtual d : (I)V
    //   358: goto -> 294
    //   361: aload #14
    //   363: invokevirtual g : ()V
    //   366: aload #12
    //   368: invokevirtual size : ()I
    //   371: istore #5
    //   373: iconst_0
    //   374: istore #4
    //   376: iload #4
    //   378: iload #5
    //   380: if_icmpge -> 443
    //   383: aload #12
    //   385: iload #4
    //   387: invokevirtual get : (I)Ljava/lang/Object;
    //   390: astore #14
    //   392: iinc #4, 1
    //   395: aload #14
    //   397: checkcast m52
    //   400: astore #14
    //   402: aload #14
    //   404: getfield f : I
    //   407: iload_1
    //   408: if_icmpeq -> 414
    //   411: goto -> 376
    //   414: aload #14
    //   416: getfield b : Ler;
    //   419: aload #13
    //   421: if_acmpne -> 435
    //   424: aload #14
    //   426: getfield g : Z
    //   429: ifne -> 435
    //   432: goto -> 376
    //   435: aload #14
    //   437: invokevirtual e : ()V
    //   440: goto -> 376
    //   443: aload #12
    //   445: invokevirtual size : ()I
    //   448: istore #8
    //   450: iconst_0
    //   451: istore #4
    //   453: iload #4
    //   455: iload #8
    //   457: if_icmpge -> 586
    //   460: aload #12
    //   462: iload #4
    //   464: invokevirtual get : (I)Ljava/lang/Object;
    //   467: astore #14
    //   469: iload #4
    //   471: iconst_1
    //   472: iadd
    //   473: istore #5
    //   475: aload #14
    //   477: checkcast m52
    //   480: astore #14
    //   482: aload #14
    //   484: getfield f : I
    //   487: iload_1
    //   488: if_icmpeq -> 498
    //   491: iload #5
    //   493: istore #4
    //   495: goto -> 453
    //   498: iload_3
    //   499: ifne -> 519
    //   502: aload #14
    //   504: getfield b : Ler;
    //   507: aload #13
    //   509: if_acmpne -> 519
    //   512: iload #5
    //   514: istore #4
    //   516: goto -> 453
    //   519: aload #14
    //   521: getfield h : Liy;
    //   524: getfield j : Z
    //   527: ifne -> 536
    //   530: iload #11
    //   532: istore_2
    //   533: goto -> 588
    //   536: aload #14
    //   538: getfield i : Liy;
    //   541: getfield j : Z
    //   544: ifne -> 553
    //   547: iload #11
    //   549: istore_2
    //   550: goto -> 588
    //   553: iload #5
    //   555: istore #4
    //   557: aload #14
    //   559: instanceof wj
    //   562: ifne -> 453
    //   565: iload #5
    //   567: istore #4
    //   569: aload #14
    //   571: getfield e : Lrz;
    //   574: getfield j : Z
    //   577: ifne -> 453
    //   580: iload #11
    //   582: istore_2
    //   583: goto -> 588
    //   586: iconst_1
    //   587: istore_2
    //   588: aload #13
    //   590: iload #6
    //   592: invokevirtual I : (I)V
    //   595: aload #13
    //   597: iload #7
    //   599: invokevirtual J : (I)V
    //   602: iload_2
    //   603: ireturn
  }
  
  public final void Q() {
    // Byte code:
    //   0: getstatic qz1.e : [Z
    //   3: astore #29
    //   5: aload_0
    //   6: iconst_0
    //   7: putfield Y : I
    //   10: aload_0
    //   11: iconst_0
    //   12: putfield Z : I
    //   15: aload_0
    //   16: iconst_0
    //   17: putfield E0 : Z
    //   20: aload_0
    //   21: iconst_0
    //   22: putfield F0 : Z
    //   25: aload_0
    //   26: getfield q0 : Ljava/util/ArrayList;
    //   29: invokevirtual size : ()I
    //   32: istore #13
    //   34: iconst_0
    //   35: aload_0
    //   36: invokevirtual o : ()I
    //   39: invokestatic max : (II)I
    //   42: istore #4
    //   44: iconst_0
    //   45: aload_0
    //   46: invokevirtual i : ()I
    //   49: invokestatic max : (II)I
    //   52: istore_2
    //   53: aload_0
    //   54: getfield p0 : [I
    //   57: astore #17
    //   59: aload #17
    //   61: iconst_1
    //   62: iaload
    //   63: istore #5
    //   65: aload #17
    //   67: iconst_0
    //   68: iaload
    //   69: istore_3
    //   70: aload_0
    //   71: getfield t0 : I
    //   74: istore_1
    //   75: aload_0
    //   76: getfield J : Lbq;
    //   79: astore #28
    //   81: aload_0
    //   82: getfield I : Lbq;
    //   85: astore #27
    //   87: iload_1
    //   88: ifne -> 1145
    //   91: aload_0
    //   92: getfield D0 : I
    //   95: iconst_1
    //   96: invokestatic p : (II)Z
    //   99: ifeq -> 1145
    //   102: aload_0
    //   103: getfield u0 : Lhq;
    //   106: astore #19
    //   108: aload #17
    //   110: iconst_0
    //   111: iaload
    //   112: istore #6
    //   114: aload #17
    //   116: iconst_1
    //   117: iaload
    //   118: istore #9
    //   120: aload_0
    //   121: invokevirtual B : ()V
    //   124: aload_0
    //   125: getfield q0 : Ljava/util/ArrayList;
    //   128: astore #18
    //   130: aload #18
    //   132: invokevirtual size : ()I
    //   135: istore #10
    //   137: iconst_0
    //   138: istore_1
    //   139: iload_1
    //   140: iload #10
    //   142: if_icmpge -> 163
    //   145: aload #18
    //   147: iload_1
    //   148: invokevirtual get : (I)Ljava/lang/Object;
    //   151: checkcast er
    //   154: invokevirtual B : ()V
    //   157: iinc #1, 1
    //   160: goto -> 139
    //   163: aload_0
    //   164: getfield v0 : Z
    //   167: istore #15
    //   169: iload #6
    //   171: iconst_1
    //   172: if_icmpne -> 187
    //   175: aload_0
    //   176: iconst_0
    //   177: aload_0
    //   178: invokevirtual o : ()I
    //   181: invokevirtual F : (II)V
    //   184: goto -> 198
    //   187: aload #27
    //   189: iconst_0
    //   190: invokevirtual i : (I)V
    //   193: aload_0
    //   194: iconst_0
    //   195: putfield Y : I
    //   198: iconst_0
    //   199: istore #8
    //   201: iconst_0
    //   202: istore_1
    //   203: iconst_0
    //   204: istore #7
    //   206: iload #8
    //   208: iload #10
    //   210: if_icmpge -> 380
    //   213: aload #18
    //   215: iload #8
    //   217: invokevirtual get : (I)Ljava/lang/Object;
    //   220: checkcast er
    //   223: astore #20
    //   225: aload #20
    //   227: instanceof bf0
    //   230: ifeq -> 340
    //   233: aload #20
    //   235: checkcast bf0
    //   238: astore #20
    //   240: aload #20
    //   242: getfield u0 : I
    //   245: istore #6
    //   247: iload #6
    //   249: iconst_1
    //   250: if_icmpne -> 337
    //   253: aload #20
    //   255: getfield r0 : I
    //   258: istore_1
    //   259: iload_1
    //   260: iconst_m1
    //   261: if_icmpeq -> 273
    //   264: aload #20
    //   266: iload_1
    //   267: invokevirtual N : (I)V
    //   270: goto -> 335
    //   273: aload #20
    //   275: getfield s0 : I
    //   278: iconst_m1
    //   279: if_icmpeq -> 307
    //   282: aload_0
    //   283: invokevirtual y : ()Z
    //   286: ifeq -> 307
    //   289: aload #20
    //   291: aload_0
    //   292: invokevirtual o : ()I
    //   295: aload #20
    //   297: getfield s0 : I
    //   300: isub
    //   301: invokevirtual N : (I)V
    //   304: goto -> 335
    //   307: aload_0
    //   308: invokevirtual y : ()Z
    //   311: ifeq -> 335
    //   314: aload #20
    //   316: aload #20
    //   318: getfield q0 : F
    //   321: aload_0
    //   322: invokevirtual o : ()I
    //   325: i2f
    //   326: fmul
    //   327: ldc_w 0.5
    //   330: fadd
    //   331: f2i
    //   332: invokevirtual N : (I)V
    //   335: iconst_1
    //   336: istore_1
    //   337: goto -> 374
    //   340: iload_1
    //   341: istore #6
    //   343: iload #6
    //   345: istore_1
    //   346: aload #20
    //   348: instanceof yb
    //   351: ifeq -> 337
    //   354: iload #6
    //   356: istore_1
    //   357: aload #20
    //   359: checkcast yb
    //   362: invokevirtual P : ()I
    //   365: ifne -> 337
    //   368: iload #6
    //   370: istore_1
    //   371: iconst_1
    //   372: istore #7
    //   374: iinc #8, 1
    //   377: goto -> 206
    //   380: iload_1
    //   381: ifeq -> 452
    //   384: iconst_0
    //   385: istore_1
    //   386: iload_1
    //   387: iload #10
    //   389: if_icmpge -> 452
    //   392: aload #18
    //   394: iload_1
    //   395: invokevirtual get : (I)Ljava/lang/Object;
    //   398: checkcast er
    //   401: astore #20
    //   403: aload #20
    //   405: instanceof bf0
    //   408: ifeq -> 443
    //   411: aload #20
    //   413: checkcast bf0
    //   416: astore #20
    //   418: aload #20
    //   420: getfield u0 : I
    //   423: iconst_1
    //   424: if_icmpne -> 440
    //   427: iconst_0
    //   428: aload #19
    //   430: aload #20
    //   432: iload #15
    //   434: invokestatic E : (ILhq;Ler;Z)V
    //   437: goto -> 446
    //   440: goto -> 446
    //   443: goto -> 440
    //   446: iinc #1, 1
    //   449: goto -> 386
    //   452: iconst_0
    //   453: aload #19
    //   455: aload_0
    //   456: iload #15
    //   458: invokestatic E : (ILhq;Ler;Z)V
    //   461: iload #7
    //   463: ifeq -> 535
    //   466: iconst_0
    //   467: istore_1
    //   468: iload_1
    //   469: iload #10
    //   471: if_icmpge -> 535
    //   474: aload #18
    //   476: iload_1
    //   477: invokevirtual get : (I)Ljava/lang/Object;
    //   480: checkcast er
    //   483: astore #20
    //   485: aload #20
    //   487: instanceof yb
    //   490: ifeq -> 529
    //   493: aload #20
    //   495: checkcast yb
    //   498: astore #20
    //   500: aload #20
    //   502: invokevirtual P : ()I
    //   505: ifne -> 529
    //   508: aload #20
    //   510: invokevirtual O : ()Z
    //   513: ifeq -> 529
    //   516: iconst_1
    //   517: aload #19
    //   519: aload #20
    //   521: iload #15
    //   523: invokestatic E : (ILhq;Ler;Z)V
    //   526: goto -> 529
    //   529: iinc #1, 1
    //   532: goto -> 468
    //   535: iload #9
    //   537: iconst_1
    //   538: if_icmpne -> 553
    //   541: aload_0
    //   542: iconst_0
    //   543: aload_0
    //   544: invokevirtual i : ()I
    //   547: invokevirtual G : (II)V
    //   550: goto -> 564
    //   553: aload #28
    //   555: iconst_0
    //   556: invokevirtual i : (I)V
    //   559: aload_0
    //   560: iconst_0
    //   561: putfield Z : I
    //   564: iconst_0
    //   565: istore #6
    //   567: iconst_0
    //   568: istore #7
    //   570: iconst_0
    //   571: istore_1
    //   572: iload #6
    //   574: iload #10
    //   576: if_icmpge -> 769
    //   579: aload #18
    //   581: iload #6
    //   583: invokevirtual get : (I)Ljava/lang/Object;
    //   586: checkcast er
    //   589: astore #20
    //   591: aload #20
    //   593: instanceof bf0
    //   596: ifeq -> 715
    //   599: aload #20
    //   601: checkcast bf0
    //   604: astore #20
    //   606: iload #7
    //   608: istore #8
    //   610: iload_1
    //   611: istore #9
    //   613: aload #20
    //   615: getfield u0 : I
    //   618: ifne -> 756
    //   621: aload #20
    //   623: getfield r0 : I
    //   626: istore #7
    //   628: iload #7
    //   630: iconst_m1
    //   631: if_icmpeq -> 644
    //   634: aload #20
    //   636: iload #7
    //   638: invokevirtual N : (I)V
    //   641: goto -> 706
    //   644: aload #20
    //   646: getfield s0 : I
    //   649: iconst_m1
    //   650: if_icmpeq -> 678
    //   653: aload_0
    //   654: invokevirtual z : ()Z
    //   657: ifeq -> 678
    //   660: aload #20
    //   662: aload_0
    //   663: invokevirtual i : ()I
    //   666: aload #20
    //   668: getfield s0 : I
    //   671: isub
    //   672: invokevirtual N : (I)V
    //   675: goto -> 706
    //   678: aload_0
    //   679: invokevirtual z : ()Z
    //   682: ifeq -> 706
    //   685: aload #20
    //   687: aload #20
    //   689: getfield q0 : F
    //   692: aload_0
    //   693: invokevirtual i : ()I
    //   696: i2f
    //   697: fmul
    //   698: ldc_w 0.5
    //   701: fadd
    //   702: f2i
    //   703: invokevirtual N : (I)V
    //   706: iconst_1
    //   707: istore #8
    //   709: iload_1
    //   710: istore #9
    //   712: goto -> 756
    //   715: iload #7
    //   717: istore #8
    //   719: iload_1
    //   720: istore #9
    //   722: aload #20
    //   724: instanceof yb
    //   727: ifeq -> 756
    //   730: iload #7
    //   732: istore #8
    //   734: iload_1
    //   735: istore #9
    //   737: aload #20
    //   739: checkcast yb
    //   742: invokevirtual P : ()I
    //   745: iconst_1
    //   746: if_icmpne -> 756
    //   749: iconst_1
    //   750: istore #9
    //   752: iload #7
    //   754: istore #8
    //   756: iinc #6, 1
    //   759: iload #8
    //   761: istore #7
    //   763: iload #9
    //   765: istore_1
    //   766: goto -> 572
    //   769: iload #7
    //   771: ifeq -> 833
    //   774: iconst_0
    //   775: istore #6
    //   777: iload #6
    //   779: iload #10
    //   781: if_icmpge -> 833
    //   784: aload #18
    //   786: iload #6
    //   788: invokevirtual get : (I)Ljava/lang/Object;
    //   791: checkcast er
    //   794: astore #20
    //   796: aload #20
    //   798: instanceof bf0
    //   801: ifeq -> 827
    //   804: aload #20
    //   806: checkcast bf0
    //   809: astore #20
    //   811: aload #20
    //   813: getfield u0 : I
    //   816: ifne -> 827
    //   819: iconst_1
    //   820: aload #19
    //   822: aload #20
    //   824: invokestatic k0 : (ILhq;Ler;)V
    //   827: iinc #6, 1
    //   830: goto -> 777
    //   833: iconst_0
    //   834: aload #19
    //   836: aload_0
    //   837: invokestatic k0 : (ILhq;Ler;)V
    //   840: iload_1
    //   841: ifeq -> 909
    //   844: iconst_0
    //   845: istore_1
    //   846: iload_1
    //   847: iload #10
    //   849: if_icmpge -> 909
    //   852: aload #18
    //   854: iload_1
    //   855: invokevirtual get : (I)Ljava/lang/Object;
    //   858: checkcast er
    //   861: astore #20
    //   863: aload #20
    //   865: instanceof yb
    //   868: ifeq -> 903
    //   871: aload #20
    //   873: checkcast yb
    //   876: astore #20
    //   878: aload #20
    //   880: invokevirtual P : ()I
    //   883: iconst_1
    //   884: if_icmpne -> 903
    //   887: aload #20
    //   889: invokevirtual O : ()Z
    //   892: ifeq -> 903
    //   895: iconst_1
    //   896: aload #19
    //   898: aload #20
    //   900: invokestatic k0 : (ILhq;Ler;)V
    //   903: iinc #1, 1
    //   906: goto -> 846
    //   909: iconst_0
    //   910: istore_1
    //   911: iload_1
    //   912: iload #10
    //   914: if_icmpge -> 1021
    //   917: aload #18
    //   919: iload_1
    //   920: invokevirtual get : (I)Ljava/lang/Object;
    //   923: checkcast er
    //   926: astore #20
    //   928: aload #20
    //   930: invokevirtual x : ()Z
    //   933: ifeq -> 1015
    //   936: aload #20
    //   938: invokestatic h : (Ler;)Z
    //   941: ifeq -> 1015
    //   944: aload #20
    //   946: aload #19
    //   948: getstatic qv.b : Lre;
    //   951: invokestatic R : (Ler;Lhq;Lre;)V
    //   954: aload #20
    //   956: instanceof bf0
    //   959: ifeq -> 997
    //   962: aload #20
    //   964: checkcast bf0
    //   967: getfield u0 : I
    //   970: ifne -> 984
    //   973: iconst_0
    //   974: aload #19
    //   976: aload #20
    //   978: invokestatic k0 : (ILhq;Ler;)V
    //   981: goto -> 1015
    //   984: iconst_0
    //   985: aload #19
    //   987: aload #20
    //   989: iload #15
    //   991: invokestatic E : (ILhq;Ler;Z)V
    //   994: goto -> 1015
    //   997: iconst_0
    //   998: aload #19
    //   1000: aload #20
    //   1002: iload #15
    //   1004: invokestatic E : (ILhq;Ler;Z)V
    //   1007: iconst_0
    //   1008: aload #19
    //   1010: aload #20
    //   1012: invokestatic k0 : (ILhq;Ler;)V
    //   1015: iinc #1, 1
    //   1018: goto -> 911
    //   1021: iconst_0
    //   1022: istore_1
    //   1023: aload #17
    //   1025: astore #24
    //   1027: iload_1
    //   1028: iload #13
    //   1030: if_icmpge -> 1149
    //   1033: aload_0
    //   1034: getfield q0 : Ljava/util/ArrayList;
    //   1037: iload_1
    //   1038: invokevirtual get : (I)Ljava/lang/Object;
    //   1041: checkcast er
    //   1044: astore #19
    //   1046: aload #19
    //   1048: invokevirtual x : ()Z
    //   1051: ifeq -> 1139
    //   1054: aload #19
    //   1056: instanceof bf0
    //   1059: ifne -> 1139
    //   1062: aload #19
    //   1064: instanceof yb
    //   1067: ifne -> 1139
    //   1070: aload #19
    //   1072: iconst_0
    //   1073: invokevirtual h : (I)I
    //   1076: istore #7
    //   1078: aload #19
    //   1080: iconst_1
    //   1081: invokevirtual h : (I)I
    //   1084: istore #6
    //   1086: iload #7
    //   1088: iconst_3
    //   1089: if_icmpne -> 1119
    //   1092: aload #19
    //   1094: getfield r : I
    //   1097: iconst_1
    //   1098: if_icmpeq -> 1119
    //   1101: iload #6
    //   1103: iconst_3
    //   1104: if_icmpne -> 1119
    //   1107: aload #19
    //   1109: getfield s : I
    //   1112: iconst_1
    //   1113: if_icmpeq -> 1119
    //   1116: goto -> 1139
    //   1119: new java/lang/Object
    //   1122: dup
    //   1123: invokespecial <init> : ()V
    //   1126: astore #18
    //   1128: aload #19
    //   1130: aload_0
    //   1131: getfield u0 : Lhq;
    //   1134: aload #18
    //   1136: invokestatic R : (Ler;Lhq;Lre;)V
    //   1139: iinc #1, 1
    //   1142: goto -> 1023
    //   1145: aload #17
    //   1147: astore #24
    //   1149: aload_0
    //   1150: getfield w0 : Lln0;
    //   1153: astore #30
    //   1155: iload #13
    //   1157: iconst_2
    //   1158: if_icmple -> 1175
    //   1161: iload_3
    //   1162: iconst_2
    //   1163: if_icmpeq -> 1191
    //   1166: iload #5
    //   1168: iconst_2
    //   1169: if_icmpne -> 1175
    //   1172: goto -> 1191
    //   1175: iload #4
    //   1177: istore #6
    //   1179: iload #5
    //   1181: istore #4
    //   1183: iload_3
    //   1184: istore_1
    //   1185: iload #6
    //   1187: istore_3
    //   1188: goto -> 3296
    //   1191: aload_0
    //   1192: getfield D0 : I
    //   1195: sipush #1024
    //   1198: invokestatic p : (II)Z
    //   1201: ifeq -> 1175
    //   1204: aload_0
    //   1205: getfield u0 : Lhq;
    //   1208: astore #32
    //   1210: aload_0
    //   1211: getfield q0 : Ljava/util/ArrayList;
    //   1214: astore #31
    //   1216: aload #31
    //   1218: invokevirtual size : ()I
    //   1221: istore #7
    //   1223: iconst_0
    //   1224: istore_1
    //   1225: iload_1
    //   1226: iload #7
    //   1228: if_icmpge -> 1302
    //   1231: aload #31
    //   1233: iload_1
    //   1234: invokevirtual get : (I)Ljava/lang/Object;
    //   1237: checkcast er
    //   1240: astore #17
    //   1242: aload #24
    //   1244: iconst_0
    //   1245: iaload
    //   1246: istore #8
    //   1248: aload #24
    //   1250: iconst_1
    //   1251: iaload
    //   1252: istore #6
    //   1254: aload #17
    //   1256: getfield p0 : [I
    //   1259: astore #17
    //   1261: iload #8
    //   1263: iload #6
    //   1265: aload #17
    //   1267: iconst_0
    //   1268: iaload
    //   1269: aload #17
    //   1271: iconst_1
    //   1272: iaload
    //   1273: invokestatic Y : (IIII)Z
    //   1276: ifne -> 1296
    //   1279: iload_2
    //   1280: istore #8
    //   1282: iload #5
    //   1284: istore #6
    //   1286: iload #4
    //   1288: istore #7
    //   1290: iload_3
    //   1291: istore #5
    //   1293: goto -> 3166
    //   1296: iinc #1, 1
    //   1299: goto -> 1225
    //   1302: iconst_0
    //   1303: istore_1
    //   1304: aconst_null
    //   1305: astore #22
    //   1307: aconst_null
    //   1308: astore #20
    //   1310: aconst_null
    //   1311: astore #17
    //   1313: aconst_null
    //   1314: astore #21
    //   1316: aconst_null
    //   1317: astore #18
    //   1319: aconst_null
    //   1320: astore #19
    //   1322: iload_3
    //   1323: istore #6
    //   1325: iload #5
    //   1327: istore_3
    //   1328: iload_1
    //   1329: istore #5
    //   1331: iload #4
    //   1333: istore_1
    //   1334: iload #5
    //   1336: iload #7
    //   1338: if_icmpge -> 1898
    //   1341: aload #31
    //   1343: iload #5
    //   1345: invokevirtual get : (I)Ljava/lang/Object;
    //   1348: checkcast er
    //   1351: astore #33
    //   1353: aload #24
    //   1355: iconst_0
    //   1356: iaload
    //   1357: istore #8
    //   1359: aload #24
    //   1361: iconst_1
    //   1362: iaload
    //   1363: istore #4
    //   1365: aload #33
    //   1367: getfield p0 : [I
    //   1370: astore #23
    //   1372: iload #8
    //   1374: iload #4
    //   1376: aload #23
    //   1378: iconst_0
    //   1379: iaload
    //   1380: aload #23
    //   1382: iconst_1
    //   1383: iaload
    //   1384: invokestatic Y : (IIII)Z
    //   1387: ifne -> 1401
    //   1390: aload #33
    //   1392: aload #32
    //   1394: aload_0
    //   1395: getfield L0 : Lre;
    //   1398: invokestatic R : (Ler;Lhq;Lre;)V
    //   1401: aload #33
    //   1403: instanceof bf0
    //   1406: istore #15
    //   1408: aload #22
    //   1410: astore #26
    //   1412: aload #19
    //   1414: astore #25
    //   1416: iload #15
    //   1418: ifeq -> 1517
    //   1421: aload #33
    //   1423: checkcast bf0
    //   1426: astore #34
    //   1428: aload #19
    //   1430: astore #23
    //   1432: aload #34
    //   1434: getfield u0 : I
    //   1437: ifne -> 1466
    //   1440: aload #19
    //   1442: astore #23
    //   1444: aload #19
    //   1446: ifnonnull -> 1458
    //   1449: new java/util/ArrayList
    //   1452: dup
    //   1453: invokespecial <init> : ()V
    //   1456: astore #23
    //   1458: aload #23
    //   1460: aload #34
    //   1462: invokevirtual add : (Ljava/lang/Object;)Z
    //   1465: pop
    //   1466: aload #22
    //   1468: astore #26
    //   1470: aload #23
    //   1472: astore #25
    //   1474: aload #34
    //   1476: getfield u0 : I
    //   1479: iconst_1
    //   1480: if_icmpne -> 1517
    //   1483: aload #22
    //   1485: astore #19
    //   1487: aload #22
    //   1489: ifnonnull -> 1501
    //   1492: new java/util/ArrayList
    //   1495: dup
    //   1496: invokespecial <init> : ()V
    //   1499: astore #19
    //   1501: aload #19
    //   1503: aload #34
    //   1505: invokevirtual add : (Ljava/lang/Object;)Z
    //   1508: pop
    //   1509: aload #23
    //   1511: astore #25
    //   1513: aload #19
    //   1515: astore #26
    //   1517: aload #17
    //   1519: astore #19
    //   1521: aload #18
    //   1523: astore #23
    //   1525: aload #33
    //   1527: instanceof yb
    //   1530: ifeq -> 1695
    //   1533: aload #33
    //   1535: instanceof yb
    //   1538: ifeq -> 1636
    //   1541: aload #33
    //   1543: checkcast yb
    //   1546: astore #34
    //   1548: aload #17
    //   1550: astore #22
    //   1552: aload #34
    //   1554: invokevirtual P : ()I
    //   1557: ifne -> 1586
    //   1560: aload #17
    //   1562: astore #22
    //   1564: aload #17
    //   1566: ifnonnull -> 1578
    //   1569: new java/util/ArrayList
    //   1572: dup
    //   1573: invokespecial <init> : ()V
    //   1576: astore #22
    //   1578: aload #22
    //   1580: aload #34
    //   1582: invokevirtual add : (Ljava/lang/Object;)Z
    //   1585: pop
    //   1586: aload #22
    //   1588: astore #19
    //   1590: aload #18
    //   1592: astore #23
    //   1594: aload #34
    //   1596: invokevirtual P : ()I
    //   1599: iconst_1
    //   1600: if_icmpne -> 1695
    //   1603: aload #18
    //   1605: astore #23
    //   1607: aload #18
    //   1609: ifnonnull -> 1621
    //   1612: new java/util/ArrayList
    //   1615: dup
    //   1616: invokespecial <init> : ()V
    //   1619: astore #23
    //   1621: aload #23
    //   1623: aload #34
    //   1625: invokevirtual add : (Ljava/lang/Object;)Z
    //   1628: pop
    //   1629: aload #22
    //   1631: astore #19
    //   1633: goto -> 1695
    //   1636: aload #33
    //   1638: checkcast yb
    //   1641: astore #22
    //   1643: aload #17
    //   1645: astore #19
    //   1647: aload #17
    //   1649: ifnonnull -> 1661
    //   1652: new java/util/ArrayList
    //   1655: dup
    //   1656: invokespecial <init> : ()V
    //   1659: astore #19
    //   1661: aload #19
    //   1663: aload #22
    //   1665: invokevirtual add : (Ljava/lang/Object;)Z
    //   1668: pop
    //   1669: aload #18
    //   1671: astore #23
    //   1673: aload #18
    //   1675: ifnonnull -> 1687
    //   1678: new java/util/ArrayList
    //   1681: dup
    //   1682: invokespecial <init> : ()V
    //   1685: astore #23
    //   1687: aload #23
    //   1689: aload #22
    //   1691: invokevirtual add : (Ljava/lang/Object;)Z
    //   1694: pop
    //   1695: aload #21
    //   1697: astore #18
    //   1699: aload #33
    //   1701: getfield I : Lbq;
    //   1704: getfield f : Lbq;
    //   1707: ifnonnull -> 1776
    //   1710: aload #21
    //   1712: astore #18
    //   1714: aload #33
    //   1716: getfield K : Lbq;
    //   1719: getfield f : Lbq;
    //   1722: ifnonnull -> 1776
    //   1725: aload #21
    //   1727: astore #18
    //   1729: iload #15
    //   1731: ifne -> 1776
    //   1734: aload #21
    //   1736: astore #18
    //   1738: aload #33
    //   1740: instanceof yb
    //   1743: ifne -> 1776
    //   1746: aload #21
    //   1748: astore #17
    //   1750: aload #21
    //   1752: ifnonnull -> 1764
    //   1755: new java/util/ArrayList
    //   1758: dup
    //   1759: invokespecial <init> : ()V
    //   1762: astore #17
    //   1764: aload #17
    //   1766: aload #33
    //   1768: invokevirtual add : (Ljava/lang/Object;)Z
    //   1771: pop
    //   1772: aload #17
    //   1774: astore #18
    //   1776: aload #20
    //   1778: astore #17
    //   1780: aload #33
    //   1782: getfield J : Lbq;
    //   1785: getfield f : Lbq;
    //   1788: ifnonnull -> 1868
    //   1791: aload #20
    //   1793: astore #17
    //   1795: aload #33
    //   1797: getfield L : Lbq;
    //   1800: getfield f : Lbq;
    //   1803: ifnonnull -> 1868
    //   1806: aload #20
    //   1808: astore #17
    //   1810: aload #33
    //   1812: getfield M : Lbq;
    //   1815: getfield f : Lbq;
    //   1818: ifnonnull -> 1868
    //   1821: aload #20
    //   1823: astore #17
    //   1825: iload #15
    //   1827: ifne -> 1868
    //   1830: aload #20
    //   1832: astore #17
    //   1834: aload #33
    //   1836: instanceof yb
    //   1839: ifne -> 1868
    //   1842: aload #20
    //   1844: astore #17
    //   1846: aload #20
    //   1848: ifnonnull -> 1860
    //   1851: new java/util/ArrayList
    //   1854: dup
    //   1855: invokespecial <init> : ()V
    //   1858: astore #17
    //   1860: aload #17
    //   1862: aload #33
    //   1864: invokevirtual add : (Ljava/lang/Object;)Z
    //   1867: pop
    //   1868: iinc #5, 1
    //   1871: aload #26
    //   1873: astore #22
    //   1875: aload #17
    //   1877: astore #20
    //   1879: aload #19
    //   1881: astore #17
    //   1883: aload #18
    //   1885: astore #21
    //   1887: aload #23
    //   1889: astore #18
    //   1891: aload #25
    //   1893: astore #19
    //   1895: goto -> 1334
    //   1898: iload_1
    //   1899: istore #9
    //   1901: iload #6
    //   1903: istore #4
    //   1905: new java/util/ArrayList
    //   1908: dup
    //   1909: invokespecial <init> : ()V
    //   1912: astore #23
    //   1914: aload #22
    //   1916: ifnull -> 1964
    //   1919: aload #22
    //   1921: invokevirtual size : ()I
    //   1924: istore #6
    //   1926: iconst_0
    //   1927: istore #5
    //   1929: iload #5
    //   1931: iload #6
    //   1933: if_icmpge -> 1964
    //   1936: aload #22
    //   1938: iload #5
    //   1940: invokevirtual get : (I)Ljava/lang/Object;
    //   1943: astore #25
    //   1945: iinc #5, 1
    //   1948: aload #25
    //   1950: checkcast bf0
    //   1953: iconst_0
    //   1954: aload #23
    //   1956: aconst_null
    //   1957: invokestatic r : (Ler;ILjava/util/ArrayList;Lk52;)Lk52;
    //   1960: pop
    //   1961: goto -> 1929
    //   1964: aload #17
    //   1966: ifnull -> 2036
    //   1969: aload #17
    //   1971: invokevirtual size : ()I
    //   1974: istore #6
    //   1976: iconst_0
    //   1977: istore #5
    //   1979: iload #5
    //   1981: iload #6
    //   1983: if_icmpge -> 2036
    //   1986: aload #17
    //   1988: iload #5
    //   1990: invokevirtual get : (I)Ljava/lang/Object;
    //   1993: astore #22
    //   1995: iinc #5, 1
    //   1998: aload #22
    //   2000: checkcast yb
    //   2003: astore #22
    //   2005: aload #22
    //   2007: iconst_0
    //   2008: aload #23
    //   2010: aconst_null
    //   2011: invokestatic r : (Ler;ILjava/util/ArrayList;Lk52;)Lk52;
    //   2014: astore #25
    //   2016: aload #22
    //   2018: iconst_0
    //   2019: aload #25
    //   2021: aload #23
    //   2023: invokevirtual N : (ILk52;Ljava/util/ArrayList;)V
    //   2026: aload #25
    //   2028: aload #23
    //   2030: invokevirtual a : (Ljava/util/ArrayList;)V
    //   2033: goto -> 1979
    //   2036: aload_0
    //   2037: iconst_2
    //   2038: invokevirtual g : (I)Lbq;
    //   2041: getfield a : Ljava/util/HashSet;
    //   2044: astore #17
    //   2046: aload #17
    //   2048: ifnull -> 2092
    //   2051: aload #17
    //   2053: invokevirtual iterator : ()Ljava/util/Iterator;
    //   2056: astore #17
    //   2058: aload #17
    //   2060: invokeinterface hasNext : ()Z
    //   2065: ifeq -> 2092
    //   2068: aload #17
    //   2070: invokeinterface next : ()Ljava/lang/Object;
    //   2075: checkcast bq
    //   2078: getfield d : Ler;
    //   2081: iconst_0
    //   2082: aload #23
    //   2084: aconst_null
    //   2085: invokestatic r : (Ler;ILjava/util/ArrayList;Lk52;)Lk52;
    //   2088: pop
    //   2089: goto -> 2058
    //   2092: aload_0
    //   2093: iconst_4
    //   2094: invokevirtual g : (I)Lbq;
    //   2097: getfield a : Ljava/util/HashSet;
    //   2100: astore #17
    //   2102: aload #17
    //   2104: ifnull -> 2148
    //   2107: aload #17
    //   2109: invokevirtual iterator : ()Ljava/util/Iterator;
    //   2112: astore #17
    //   2114: aload #17
    //   2116: invokeinterface hasNext : ()Z
    //   2121: ifeq -> 2148
    //   2124: aload #17
    //   2126: invokeinterface next : ()Ljava/lang/Object;
    //   2131: checkcast bq
    //   2134: getfield d : Ler;
    //   2137: iconst_0
    //   2138: aload #23
    //   2140: aconst_null
    //   2141: invokestatic r : (Ler;ILjava/util/ArrayList;Lk52;)Lk52;
    //   2144: pop
    //   2145: goto -> 2114
    //   2148: aload_0
    //   2149: bipush #7
    //   2151: invokevirtual g : (I)Lbq;
    //   2154: getfield a : Ljava/util/HashSet;
    //   2157: astore #17
    //   2159: aload #17
    //   2161: ifnull -> 2205
    //   2164: aload #17
    //   2166: invokevirtual iterator : ()Ljava/util/Iterator;
    //   2169: astore #17
    //   2171: aload #17
    //   2173: invokeinterface hasNext : ()Z
    //   2178: ifeq -> 2205
    //   2181: aload #17
    //   2183: invokeinterface next : ()Ljava/lang/Object;
    //   2188: checkcast bq
    //   2191: getfield d : Ler;
    //   2194: iconst_0
    //   2195: aload #23
    //   2197: aconst_null
    //   2198: invokestatic r : (Ler;ILjava/util/ArrayList;Lk52;)Lk52;
    //   2201: pop
    //   2202: goto -> 2171
    //   2205: aload #21
    //   2207: ifnull -> 2255
    //   2210: aload #21
    //   2212: invokevirtual size : ()I
    //   2215: istore #6
    //   2217: iconst_0
    //   2218: istore #5
    //   2220: iload #5
    //   2222: iload #6
    //   2224: if_icmpge -> 2255
    //   2227: aload #21
    //   2229: iload #5
    //   2231: invokevirtual get : (I)Ljava/lang/Object;
    //   2234: astore #17
    //   2236: iinc #5, 1
    //   2239: aload #17
    //   2241: checkcast er
    //   2244: iconst_0
    //   2245: aload #23
    //   2247: aconst_null
    //   2248: invokestatic r : (Ler;ILjava/util/ArrayList;Lk52;)Lk52;
    //   2251: pop
    //   2252: goto -> 2220
    //   2255: aload #19
    //   2257: ifnull -> 2305
    //   2260: aload #19
    //   2262: invokevirtual size : ()I
    //   2265: istore #6
    //   2267: iconst_0
    //   2268: istore #5
    //   2270: iload #5
    //   2272: iload #6
    //   2274: if_icmpge -> 2305
    //   2277: aload #19
    //   2279: iload #5
    //   2281: invokevirtual get : (I)Ljava/lang/Object;
    //   2284: astore #17
    //   2286: iinc #5, 1
    //   2289: aload #17
    //   2291: checkcast bf0
    //   2294: iconst_1
    //   2295: aload #23
    //   2297: aconst_null
    //   2298: invokestatic r : (Ler;ILjava/util/ArrayList;Lk52;)Lk52;
    //   2301: pop
    //   2302: goto -> 2270
    //   2305: aload #18
    //   2307: ifnull -> 2377
    //   2310: aload #18
    //   2312: invokevirtual size : ()I
    //   2315: istore #6
    //   2317: iconst_0
    //   2318: istore #5
    //   2320: iload #5
    //   2322: iload #6
    //   2324: if_icmpge -> 2377
    //   2327: aload #18
    //   2329: iload #5
    //   2331: invokevirtual get : (I)Ljava/lang/Object;
    //   2334: astore #17
    //   2336: iinc #5, 1
    //   2339: aload #17
    //   2341: checkcast yb
    //   2344: astore #17
    //   2346: aload #17
    //   2348: iconst_1
    //   2349: aload #23
    //   2351: aconst_null
    //   2352: invokestatic r : (Ler;ILjava/util/ArrayList;Lk52;)Lk52;
    //   2355: astore #19
    //   2357: aload #17
    //   2359: iconst_1
    //   2360: aload #19
    //   2362: aload #23
    //   2364: invokevirtual N : (ILk52;Ljava/util/ArrayList;)V
    //   2367: aload #19
    //   2369: aload #23
    //   2371: invokevirtual a : (Ljava/util/ArrayList;)V
    //   2374: goto -> 2320
    //   2377: aload_0
    //   2378: iconst_3
    //   2379: invokevirtual g : (I)Lbq;
    //   2382: getfield a : Ljava/util/HashSet;
    //   2385: astore #17
    //   2387: aload #17
    //   2389: ifnull -> 2433
    //   2392: aload #17
    //   2394: invokevirtual iterator : ()Ljava/util/Iterator;
    //   2397: astore #17
    //   2399: aload #17
    //   2401: invokeinterface hasNext : ()Z
    //   2406: ifeq -> 2433
    //   2409: aload #17
    //   2411: invokeinterface next : ()Ljava/lang/Object;
    //   2416: checkcast bq
    //   2419: getfield d : Ler;
    //   2422: iconst_1
    //   2423: aload #23
    //   2425: aconst_null
    //   2426: invokestatic r : (Ler;ILjava/util/ArrayList;Lk52;)Lk52;
    //   2429: pop
    //   2430: goto -> 2399
    //   2433: aload_0
    //   2434: bipush #6
    //   2436: invokevirtual g : (I)Lbq;
    //   2439: getfield a : Ljava/util/HashSet;
    //   2442: astore #17
    //   2444: aload #17
    //   2446: ifnull -> 2490
    //   2449: aload #17
    //   2451: invokevirtual iterator : ()Ljava/util/Iterator;
    //   2454: astore #17
    //   2456: aload #17
    //   2458: invokeinterface hasNext : ()Z
    //   2463: ifeq -> 2490
    //   2466: aload #17
    //   2468: invokeinterface next : ()Ljava/lang/Object;
    //   2473: checkcast bq
    //   2476: getfield d : Ler;
    //   2479: iconst_1
    //   2480: aload #23
    //   2482: aconst_null
    //   2483: invokestatic r : (Ler;ILjava/util/ArrayList;Lk52;)Lk52;
    //   2486: pop
    //   2487: goto -> 2456
    //   2490: aload_0
    //   2491: iconst_5
    //   2492: invokevirtual g : (I)Lbq;
    //   2495: getfield a : Ljava/util/HashSet;
    //   2498: astore #17
    //   2500: aload #17
    //   2502: ifnull -> 2546
    //   2505: aload #17
    //   2507: invokevirtual iterator : ()Ljava/util/Iterator;
    //   2510: astore #17
    //   2512: aload #17
    //   2514: invokeinterface hasNext : ()Z
    //   2519: ifeq -> 2546
    //   2522: aload #17
    //   2524: invokeinterface next : ()Ljava/lang/Object;
    //   2529: checkcast bq
    //   2532: getfield d : Ler;
    //   2535: iconst_1
    //   2536: aload #23
    //   2538: aconst_null
    //   2539: invokestatic r : (Ler;ILjava/util/ArrayList;Lk52;)Lk52;
    //   2542: pop
    //   2543: goto -> 2512
    //   2546: aload_0
    //   2547: bipush #7
    //   2549: invokevirtual g : (I)Lbq;
    //   2552: getfield a : Ljava/util/HashSet;
    //   2555: astore #17
    //   2557: aload #17
    //   2559: ifnull -> 2603
    //   2562: aload #17
    //   2564: invokevirtual iterator : ()Ljava/util/Iterator;
    //   2567: astore #17
    //   2569: aload #17
    //   2571: invokeinterface hasNext : ()Z
    //   2576: ifeq -> 2603
    //   2579: aload #17
    //   2581: invokeinterface next : ()Ljava/lang/Object;
    //   2586: checkcast bq
    //   2589: getfield d : Ler;
    //   2592: iconst_1
    //   2593: aload #23
    //   2595: aconst_null
    //   2596: invokestatic r : (Ler;ILjava/util/ArrayList;Lk52;)Lk52;
    //   2599: pop
    //   2600: goto -> 2569
    //   2603: aload #20
    //   2605: ifnull -> 2653
    //   2608: aload #20
    //   2610: invokevirtual size : ()I
    //   2613: istore #6
    //   2615: iconst_0
    //   2616: istore #5
    //   2618: iload #5
    //   2620: iload #6
    //   2622: if_icmpge -> 2653
    //   2625: aload #20
    //   2627: iload #5
    //   2629: invokevirtual get : (I)Ljava/lang/Object;
    //   2632: astore #17
    //   2634: iinc #5, 1
    //   2637: aload #17
    //   2639: checkcast er
    //   2642: iconst_1
    //   2643: aload #23
    //   2645: aconst_null
    //   2646: invokestatic r : (Ler;ILjava/util/ArrayList;Lk52;)Lk52;
    //   2649: pop
    //   2650: goto -> 2618
    //   2653: iconst_0
    //   2654: istore #5
    //   2656: iload #5
    //   2658: iload #7
    //   2660: if_icmpge -> 2852
    //   2663: aload #31
    //   2665: iload #5
    //   2667: invokevirtual get : (I)Ljava/lang/Object;
    //   2670: checkcast er
    //   2673: astore #18
    //   2675: aload #18
    //   2677: getfield p0 : [I
    //   2680: astore #17
    //   2682: aload #17
    //   2684: iconst_0
    //   2685: iaload
    //   2686: iconst_3
    //   2687: if_icmpne -> 2846
    //   2690: aload #17
    //   2692: iconst_1
    //   2693: iaload
    //   2694: iconst_3
    //   2695: if_icmpne -> 2846
    //   2698: aload #18
    //   2700: getfield n0 : I
    //   2703: istore #10
    //   2705: aload #23
    //   2707: invokevirtual size : ()I
    //   2710: istore #8
    //   2712: iconst_0
    //   2713: istore #6
    //   2715: iload #6
    //   2717: iload #8
    //   2719: if_icmpge -> 2753
    //   2722: aload #23
    //   2724: iload #6
    //   2726: invokevirtual get : (I)Ljava/lang/Object;
    //   2729: checkcast k52
    //   2732: astore #17
    //   2734: iload #10
    //   2736: aload #17
    //   2738: getfield b : I
    //   2741: if_icmpne -> 2747
    //   2744: goto -> 2756
    //   2747: iinc #6, 1
    //   2750: goto -> 2715
    //   2753: aconst_null
    //   2754: astore #17
    //   2756: aload #18
    //   2758: getfield o0 : I
    //   2761: istore #8
    //   2763: aload #23
    //   2765: invokevirtual size : ()I
    //   2768: istore #10
    //   2770: iconst_0
    //   2771: istore #6
    //   2773: iload #6
    //   2775: iload #10
    //   2777: if_icmpge -> 2811
    //   2780: aload #23
    //   2782: iload #6
    //   2784: invokevirtual get : (I)Ljava/lang/Object;
    //   2787: checkcast k52
    //   2790: astore #18
    //   2792: iload #8
    //   2794: aload #18
    //   2796: getfield b : I
    //   2799: if_icmpne -> 2805
    //   2802: goto -> 2814
    //   2805: iinc #6, 1
    //   2808: goto -> 2773
    //   2811: aconst_null
    //   2812: astore #18
    //   2814: aload #17
    //   2816: ifnull -> 2846
    //   2819: aload #18
    //   2821: ifnull -> 2846
    //   2824: aload #17
    //   2826: iconst_0
    //   2827: aload #18
    //   2829: invokevirtual c : (ILk52;)V
    //   2832: aload #18
    //   2834: iconst_2
    //   2835: putfield c : I
    //   2838: aload #23
    //   2840: aload #17
    //   2842: invokevirtual remove : (Ljava/lang/Object;)Z
    //   2845: pop
    //   2846: iinc #5, 1
    //   2849: goto -> 2656
    //   2852: aload #23
    //   2854: invokevirtual size : ()I
    //   2857: iconst_1
    //   2858: if_icmpgt -> 2878
    //   2861: iload_2
    //   2862: istore #8
    //   2864: iload_3
    //   2865: istore #6
    //   2867: iload #9
    //   2869: istore #7
    //   2871: iload #4
    //   2873: istore #5
    //   2875: goto -> 3166
    //   2878: aload #24
    //   2880: iconst_0
    //   2881: iaload
    //   2882: iconst_2
    //   2883: if_icmpne -> 3006
    //   2886: aload #23
    //   2888: invokevirtual size : ()I
    //   2891: istore #10
    //   2893: iconst_0
    //   2894: istore #6
    //   2896: iconst_0
    //   2897: istore #5
    //   2899: aconst_null
    //   2900: astore #17
    //   2902: iload #5
    //   2904: iload #10
    //   2906: if_icmpge -> 2983
    //   2909: aload #23
    //   2911: iload #5
    //   2913: invokevirtual get : (I)Ljava/lang/Object;
    //   2916: astore #18
    //   2918: iload #5
    //   2920: iconst_1
    //   2921: iadd
    //   2922: istore #7
    //   2924: aload #18
    //   2926: checkcast k52
    //   2929: astore #18
    //   2931: aload #18
    //   2933: getfield c : I
    //   2936: iconst_1
    //   2937: if_icmpne -> 2947
    //   2940: iload #7
    //   2942: istore #5
    //   2944: goto -> 2902
    //   2947: aload #18
    //   2949: aload #30
    //   2951: iconst_0
    //   2952: invokevirtual b : (Lln0;I)I
    //   2955: istore #8
    //   2957: iload #7
    //   2959: istore #5
    //   2961: iload #8
    //   2963: iload #6
    //   2965: if_icmple -> 2902
    //   2968: aload #18
    //   2970: astore #17
    //   2972: iload #8
    //   2974: istore #6
    //   2976: iload #7
    //   2978: istore #5
    //   2980: goto -> 2902
    //   2983: aload #17
    //   2985: ifnull -> 3006
    //   2988: aload_0
    //   2989: iconst_1
    //   2990: invokevirtual I : (I)V
    //   2993: aload_0
    //   2994: iload #6
    //   2996: invokevirtual K : (I)V
    //   2999: aload #17
    //   3001: astore #18
    //   3003: goto -> 3009
    //   3006: aconst_null
    //   3007: astore #18
    //   3009: aload #24
    //   3011: iconst_1
    //   3012: iaload
    //   3013: iconst_2
    //   3014: if_icmpne -> 3132
    //   3017: aload #23
    //   3019: invokevirtual size : ()I
    //   3022: istore #10
    //   3024: iconst_0
    //   3025: istore #6
    //   3027: iconst_0
    //   3028: istore #5
    //   3030: aconst_null
    //   3031: astore #17
    //   3033: iload #5
    //   3035: iload #10
    //   3037: if_icmpge -> 3113
    //   3040: aload #23
    //   3042: iload #5
    //   3044: invokevirtual get : (I)Ljava/lang/Object;
    //   3047: astore #19
    //   3049: iload #5
    //   3051: iconst_1
    //   3052: iadd
    //   3053: istore #7
    //   3055: aload #19
    //   3057: checkcast k52
    //   3060: astore #19
    //   3062: aload #19
    //   3064: getfield c : I
    //   3067: ifne -> 3077
    //   3070: iload #7
    //   3072: istore #5
    //   3074: goto -> 3033
    //   3077: aload #19
    //   3079: aload #30
    //   3081: iconst_1
    //   3082: invokevirtual b : (Lln0;I)I
    //   3085: istore #8
    //   3087: iload #7
    //   3089: istore #5
    //   3091: iload #8
    //   3093: iload #6
    //   3095: if_icmple -> 3033
    //   3098: aload #19
    //   3100: astore #17
    //   3102: iload #8
    //   3104: istore #6
    //   3106: iload #7
    //   3108: istore #5
    //   3110: goto -> 3033
    //   3113: aload #17
    //   3115: ifnull -> 3132
    //   3118: aload_0
    //   3119: iconst_1
    //   3120: invokevirtual J : (I)V
    //   3123: aload_0
    //   3124: iload #6
    //   3126: invokevirtual H : (I)V
    //   3129: goto -> 3135
    //   3132: aconst_null
    //   3133: astore #17
    //   3135: aload #18
    //   3137: ifnonnull -> 3159
    //   3140: iload_2
    //   3141: istore #8
    //   3143: iload_3
    //   3144: istore #6
    //   3146: iload #9
    //   3148: istore #7
    //   3150: iload #4
    //   3152: istore #5
    //   3154: aload #17
    //   3156: ifnull -> 3166
    //   3159: iload #4
    //   3161: istore #8
    //   3163: goto -> 3182
    //   3166: iload #8
    //   3168: istore_2
    //   3169: iload #6
    //   3171: istore #4
    //   3173: iload #7
    //   3175: istore_3
    //   3176: iload #5
    //   3178: istore_1
    //   3179: goto -> 3296
    //   3182: iload #8
    //   3184: iconst_2
    //   3185: if_icmpne -> 3229
    //   3188: aload_0
    //   3189: invokevirtual o : ()I
    //   3192: istore #4
    //   3194: iload #9
    //   3196: iload #4
    //   3198: if_icmpge -> 3220
    //   3201: iload #9
    //   3203: ifle -> 3220
    //   3206: aload_0
    //   3207: iload #9
    //   3209: invokevirtual K : (I)V
    //   3212: aload_0
    //   3213: iconst_1
    //   3214: putfield E0 : Z
    //   3217: goto -> 3229
    //   3220: aload_0
    //   3221: invokevirtual o : ()I
    //   3224: istore #4
    //   3226: goto -> 3235
    //   3229: iload_1
    //   3230: istore #4
    //   3232: goto -> 3226
    //   3235: iload_3
    //   3236: iconst_2
    //   3237: if_icmpne -> 3279
    //   3240: aload_0
    //   3241: invokevirtual i : ()I
    //   3244: istore #5
    //   3246: iload_2
    //   3247: istore_1
    //   3248: iload_1
    //   3249: iload #5
    //   3251: if_icmpge -> 3271
    //   3254: iload_1
    //   3255: ifle -> 3271
    //   3258: aload_0
    //   3259: iload_1
    //   3260: invokevirtual H : (I)V
    //   3263: aload_0
    //   3264: iconst_1
    //   3265: putfield F0 : Z
    //   3268: goto -> 3281
    //   3271: aload_0
    //   3272: invokevirtual i : ()I
    //   3275: istore_1
    //   3276: goto -> 3281
    //   3279: iload_2
    //   3280: istore_1
    //   3281: iconst_1
    //   3282: istore_2
    //   3283: iload #4
    //   3285: istore #7
    //   3287: iload_3
    //   3288: istore #9
    //   3290: iload_1
    //   3291: istore #10
    //   3293: goto -> 3315
    //   3296: iconst_0
    //   3297: istore #5
    //   3299: iload_2
    //   3300: istore #10
    //   3302: iload #4
    //   3304: istore #9
    //   3306: iload_3
    //   3307: istore #7
    //   3309: iload_1
    //   3310: istore #8
    //   3312: iload #5
    //   3314: istore_2
    //   3315: aload #28
    //   3317: astore #20
    //   3319: aload #27
    //   3321: astore #17
    //   3323: aload_0
    //   3324: bipush #64
    //   3326: invokevirtual S : (I)Z
    //   3329: ifne -> 3350
    //   3332: aload_0
    //   3333: sipush #128
    //   3336: invokevirtual S : (I)Z
    //   3339: ifeq -> 3345
    //   3342: goto -> 3350
    //   3345: iconst_0
    //   3346: istore_1
    //   3347: goto -> 3352
    //   3350: iconst_1
    //   3351: istore_1
    //   3352: aload #30
    //   3354: invokevirtual getClass : ()Ljava/lang/Class;
    //   3357: pop
    //   3358: aload #30
    //   3360: iconst_0
    //   3361: putfield h : Z
    //   3364: aload_0
    //   3365: getfield D0 : I
    //   3368: ifeq -> 3384
    //   3371: iload_1
    //   3372: ifeq -> 3384
    //   3375: aload #30
    //   3377: iconst_1
    //   3378: putfield h : Z
    //   3381: goto -> 3384
    //   3384: aload_0
    //   3385: getfield q0 : Ljava/util/ArrayList;
    //   3388: astore #21
    //   3390: aload #24
    //   3392: iconst_0
    //   3393: iaload
    //   3394: iconst_2
    //   3395: if_icmpeq -> 3414
    //   3398: aload #24
    //   3400: iconst_1
    //   3401: iaload
    //   3402: iconst_2
    //   3403: if_icmpne -> 3409
    //   3406: goto -> 3414
    //   3409: iconst_0
    //   3410: istore_3
    //   3411: goto -> 3416
    //   3414: iconst_1
    //   3415: istore_3
    //   3416: aload_0
    //   3417: iconst_0
    //   3418: putfield z0 : I
    //   3421: aload_0
    //   3422: iconst_0
    //   3423: putfield A0 : I
    //   3426: iconst_0
    //   3427: istore_1
    //   3428: iload_1
    //   3429: iload #13
    //   3431: if_icmpge -> 3469
    //   3434: aload_0
    //   3435: getfield q0 : Ljava/util/ArrayList;
    //   3438: iload_1
    //   3439: invokevirtual get : (I)Ljava/lang/Object;
    //   3442: checkcast er
    //   3445: astore #18
    //   3447: aload #18
    //   3449: instanceof fr
    //   3452: ifeq -> 3463
    //   3455: aload #18
    //   3457: checkcast fr
    //   3460: invokevirtual Q : ()V
    //   3463: iinc #1, 1
    //   3466: goto -> 3428
    //   3469: aload_0
    //   3470: bipush #64
    //   3472: invokevirtual S : (I)Z
    //   3475: istore #16
    //   3477: iconst_0
    //   3478: istore #5
    //   3480: iconst_1
    //   3481: istore_1
    //   3482: iload_2
    //   3483: istore #4
    //   3485: iload_3
    //   3486: istore #11
    //   3488: iload #5
    //   3490: istore_2
    //   3491: iload_1
    //   3492: ifeq -> 4601
    //   3495: iload_2
    //   3496: iconst_1
    //   3497: iadd
    //   3498: istore #12
    //   3500: aload #30
    //   3502: invokevirtual t : ()V
    //   3505: aload_0
    //   3506: iconst_0
    //   3507: putfield z0 : I
    //   3510: aload_0
    //   3511: iconst_0
    //   3512: putfield A0 : I
    //   3515: aload_0
    //   3516: aload #30
    //   3518: invokevirtual e : (Lln0;)V
    //   3521: iconst_0
    //   3522: istore_2
    //   3523: iload_2
    //   3524: iload #13
    //   3526: if_icmpge -> 3556
    //   3529: aload_0
    //   3530: getfield q0 : Ljava/util/ArrayList;
    //   3533: iload_2
    //   3534: invokevirtual get : (I)Ljava/lang/Object;
    //   3537: checkcast er
    //   3540: aload #30
    //   3542: invokevirtual e : (Lln0;)V
    //   3545: iinc #2, 1
    //   3548: goto -> 3523
    //   3551: astore #19
    //   3553: goto -> 3988
    //   3556: aload_0
    //   3557: aload #30
    //   3559: invokevirtual O : (Lln0;)V
    //   3562: aload_0
    //   3563: getfield G0 : Ljava/lang/ref/WeakReference;
    //   3566: astore #18
    //   3568: aload #18
    //   3570: ifnull -> 3684
    //   3573: aload #18
    //   3575: invokevirtual get : ()Ljava/lang/Object;
    //   3578: ifnull -> 3684
    //   3581: aload_0
    //   3582: getfield G0 : Ljava/lang/ref/WeakReference;
    //   3585: invokevirtual get : ()Ljava/lang/Object;
    //   3588: checkcast bq
    //   3591: astore #19
    //   3593: aload #30
    //   3595: aload #20
    //   3597: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   3600: astore #18
    //   3602: aload #30
    //   3604: aload #19
    //   3606: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   3609: astore #22
    //   3611: aload #17
    //   3613: astore #19
    //   3615: aload #30
    //   3617: aload #22
    //   3619: aload #18
    //   3621: iconst_0
    //   3622: iconst_5
    //   3623: invokevirtual f : (Lpn1;Lpn1;II)V
    //   3626: aload #17
    //   3628: astore #19
    //   3630: aload_0
    //   3631: aconst_null
    //   3632: putfield G0 : Ljava/lang/ref/WeakReference;
    //   3635: goto -> 3684
    //   3638: astore #18
    //   3640: aload #19
    //   3642: astore #17
    //   3644: aload #18
    //   3646: astore #19
    //   3648: aload #17
    //   3650: astore #18
    //   3652: aload #19
    //   3654: astore #17
    //   3656: iconst_1
    //   3657: istore_1
    //   3658: aload #17
    //   3660: astore #19
    //   3662: aload #18
    //   3664: astore #17
    //   3666: goto -> 3988
    //   3669: astore #18
    //   3671: goto -> 3676
    //   3674: astore #18
    //   3676: goto -> 3644
    //   3679: astore #18
    //   3681: goto -> 3676
    //   3684: aload #17
    //   3686: astore #19
    //   3688: aload_0
    //   3689: getfield I0 : Ljava/lang/ref/WeakReference;
    //   3692: astore #18
    //   3694: aload #18
    //   3696: ifnull -> 3763
    //   3699: aload #17
    //   3701: astore #19
    //   3703: aload #18
    //   3705: invokevirtual get : ()Ljava/lang/Object;
    //   3708: ifnull -> 3763
    //   3711: aload #17
    //   3713: astore #19
    //   3715: aload_0
    //   3716: getfield I0 : Ljava/lang/ref/WeakReference;
    //   3719: invokevirtual get : ()Ljava/lang/Object;
    //   3722: checkcast bq
    //   3725: astore #18
    //   3727: aload #17
    //   3729: astore #19
    //   3731: aload #30
    //   3733: aload #30
    //   3735: aload_0
    //   3736: getfield L : Lbq;
    //   3739: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   3742: aload #30
    //   3744: aload #18
    //   3746: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   3749: iconst_0
    //   3750: iconst_5
    //   3751: invokevirtual f : (Lpn1;Lpn1;II)V
    //   3754: aload #17
    //   3756: astore #19
    //   3758: aload_0
    //   3759: aconst_null
    //   3760: putfield I0 : Ljava/lang/ref/WeakReference;
    //   3763: aload #17
    //   3765: astore #19
    //   3767: aload_0
    //   3768: getfield H0 : Ljava/lang/ref/WeakReference;
    //   3771: astore #22
    //   3773: aload #17
    //   3775: astore #18
    //   3777: aload #22
    //   3779: ifnull -> 3868
    //   3782: aload #17
    //   3784: astore #19
    //   3786: aload #17
    //   3788: astore #18
    //   3790: aload #22
    //   3792: invokevirtual get : ()Ljava/lang/Object;
    //   3795: ifnull -> 3868
    //   3798: aload #17
    //   3800: astore #19
    //   3802: aload_0
    //   3803: getfield H0 : Ljava/lang/ref/WeakReference;
    //   3806: invokevirtual get : ()Ljava/lang/Object;
    //   3809: checkcast bq
    //   3812: astore #22
    //   3814: aload #30
    //   3816: aload #17
    //   3818: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   3821: astore #18
    //   3823: aload #30
    //   3825: aload #22
    //   3827: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   3830: astore #22
    //   3832: aload #17
    //   3834: astore #19
    //   3836: aload #30
    //   3838: aload #22
    //   3840: aload #18
    //   3842: iconst_0
    //   3843: iconst_5
    //   3844: invokevirtual f : (Lpn1;Lpn1;II)V
    //   3847: aload #17
    //   3849: astore #19
    //   3851: aload_0
    //   3852: aconst_null
    //   3853: putfield H0 : Ljava/lang/ref/WeakReference;
    //   3856: aload #17
    //   3858: astore #18
    //   3860: goto -> 3868
    //   3863: astore #18
    //   3865: goto -> 3644
    //   3868: aload #18
    //   3870: astore #19
    //   3872: aload_0
    //   3873: getfield J0 : Ljava/lang/ref/WeakReference;
    //   3876: astore #17
    //   3878: aload #17
    //   3880: ifnull -> 3969
    //   3883: aload #18
    //   3885: astore #19
    //   3887: aload #17
    //   3889: invokevirtual get : ()Ljava/lang/Object;
    //   3892: ifnull -> 3969
    //   3895: aload #18
    //   3897: astore #19
    //   3899: aload_0
    //   3900: getfield J0 : Ljava/lang/ref/WeakReference;
    //   3903: invokevirtual get : ()Ljava/lang/Object;
    //   3906: checkcast bq
    //   3909: astore #22
    //   3911: aload #18
    //   3913: astore #19
    //   3915: aload #30
    //   3917: aload_0
    //   3918: getfield K : Lbq;
    //   3921: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   3924: astore #17
    //   3926: aload #30
    //   3928: aload #22
    //   3930: invokevirtual k : (Ljava/lang/Object;)Lpn1;
    //   3933: astore #19
    //   3935: aload #30
    //   3937: aload #17
    //   3939: aload #19
    //   3941: iconst_0
    //   3942: iconst_5
    //   3943: invokevirtual f : (Lpn1;Lpn1;II)V
    //   3946: aload_0
    //   3947: aconst_null
    //   3948: putfield J0 : Ljava/lang/ref/WeakReference;
    //   3951: goto -> 3969
    //   3954: astore #17
    //   3956: goto -> 3656
    //   3959: astore #17
    //   3961: goto -> 3656
    //   3964: astore #17
    //   3966: goto -> 3961
    //   3969: aload #30
    //   3971: invokevirtual p : ()V
    //   3974: iconst_1
    //   3975: istore_1
    //   3976: aload #18
    //   3978: astore #17
    //   3980: goto -> 4028
    //   3983: astore #19
    //   3985: goto -> 3648
    //   3988: aload #19
    //   3990: invokevirtual printStackTrace : ()V
    //   3993: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   3996: astore #18
    //   3998: new java/lang/StringBuilder
    //   4001: dup
    //   4002: ldc_w 'EXCEPTION : '
    //   4005: invokespecial <init> : (Ljava/lang/String;)V
    //   4008: astore #22
    //   4010: aload #22
    //   4012: aload #19
    //   4014: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   4017: pop
    //   4018: aload #18
    //   4020: aload #22
    //   4022: invokevirtual toString : ()Ljava/lang/String;
    //   4025: invokevirtual println : (Ljava/lang/String;)V
    //   4028: iload_1
    //   4029: ifeq -> 4121
    //   4032: aload #29
    //   4034: iconst_2
    //   4035: iconst_0
    //   4036: bastore
    //   4037: aload_0
    //   4038: bipush #64
    //   4040: invokevirtual S : (I)Z
    //   4043: istore #15
    //   4045: aload_0
    //   4046: aload #30
    //   4048: iload #15
    //   4050: invokevirtual M : (Lln0;Z)V
    //   4053: aload_0
    //   4054: getfield q0 : Ljava/util/ArrayList;
    //   4057: invokevirtual size : ()I
    //   4060: istore_3
    //   4061: iconst_0
    //   4062: istore_2
    //   4063: iconst_0
    //   4064: istore_1
    //   4065: iload_2
    //   4066: iload_3
    //   4067: if_icmpge -> 4118
    //   4070: aload_0
    //   4071: getfield q0 : Ljava/util/ArrayList;
    //   4074: iload_2
    //   4075: invokevirtual get : (I)Ljava/lang/Object;
    //   4078: checkcast er
    //   4081: astore #18
    //   4083: aload #18
    //   4085: aload #30
    //   4087: iload #15
    //   4089: invokevirtual M : (Lln0;Z)V
    //   4092: aload #18
    //   4094: getfield h : I
    //   4097: iconst_m1
    //   4098: if_icmpne -> 4110
    //   4101: aload #18
    //   4103: getfield i : I
    //   4106: iconst_m1
    //   4107: if_icmpeq -> 4112
    //   4110: iconst_1
    //   4111: istore_1
    //   4112: iinc #2, 1
    //   4115: goto -> 4065
    //   4118: goto -> 4163
    //   4121: aload_0
    //   4122: aload #30
    //   4124: iload #16
    //   4126: invokevirtual M : (Lln0;Z)V
    //   4129: iconst_0
    //   4130: istore_1
    //   4131: iload_1
    //   4132: iload #13
    //   4134: if_icmpge -> 4161
    //   4137: aload_0
    //   4138: getfield q0 : Ljava/util/ArrayList;
    //   4141: iload_1
    //   4142: invokevirtual get : (I)Ljava/lang/Object;
    //   4145: checkcast er
    //   4148: aload #30
    //   4150: iload #16
    //   4152: invokevirtual M : (Lln0;Z)V
    //   4155: iinc #1, 1
    //   4158: goto -> 4131
    //   4161: iconst_0
    //   4162: istore_1
    //   4163: iload_1
    //   4164: istore_2
    //   4165: iload #4
    //   4167: istore_3
    //   4168: iload #11
    //   4170: ifeq -> 4377
    //   4173: iload_1
    //   4174: istore_2
    //   4175: iload #4
    //   4177: istore_3
    //   4178: iload #12
    //   4180: bipush #8
    //   4182: if_icmpge -> 4377
    //   4185: iload_1
    //   4186: istore_2
    //   4187: iload #4
    //   4189: istore_3
    //   4190: aload #29
    //   4192: iconst_2
    //   4193: baload
    //   4194: ifeq -> 4377
    //   4197: iconst_0
    //   4198: istore_3
    //   4199: iconst_0
    //   4200: istore_2
    //   4201: iconst_0
    //   4202: istore #5
    //   4204: iload_3
    //   4205: iload #13
    //   4207: if_icmpge -> 4271
    //   4210: aload_0
    //   4211: getfield q0 : Ljava/util/ArrayList;
    //   4214: iload_3
    //   4215: invokevirtual get : (I)Ljava/lang/Object;
    //   4218: checkcast er
    //   4221: astore #18
    //   4223: aload #18
    //   4225: getfield Y : I
    //   4228: istore #6
    //   4230: iload #5
    //   4232: aload #18
    //   4234: invokevirtual o : ()I
    //   4237: iload #6
    //   4239: iadd
    //   4240: invokestatic max : (II)I
    //   4243: istore #5
    //   4245: aload #18
    //   4247: getfield Z : I
    //   4250: istore #6
    //   4252: iload_2
    //   4253: aload #18
    //   4255: invokevirtual i : ()I
    //   4258: iload #6
    //   4260: iadd
    //   4261: invokestatic max : (II)I
    //   4264: istore_2
    //   4265: iinc #3, 1
    //   4268: goto -> 4204
    //   4271: aload_0
    //   4272: getfield b0 : I
    //   4275: iload #5
    //   4277: invokestatic max : (II)I
    //   4280: istore_3
    //   4281: aload_0
    //   4282: getfield c0 : I
    //   4285: iload_2
    //   4286: invokestatic max : (II)I
    //   4289: istore #14
    //   4291: iload_1
    //   4292: istore #6
    //   4294: iload #4
    //   4296: istore #5
    //   4298: iload #8
    //   4300: iconst_2
    //   4301: if_icmpne -> 4335
    //   4304: iload_1
    //   4305: istore #6
    //   4307: iload #4
    //   4309: istore #5
    //   4311: aload_0
    //   4312: invokevirtual o : ()I
    //   4315: iload_3
    //   4316: if_icmpge -> 4335
    //   4319: aload_0
    //   4320: iload_3
    //   4321: invokevirtual K : (I)V
    //   4324: aload #24
    //   4326: iconst_0
    //   4327: iconst_2
    //   4328: iastore
    //   4329: iconst_1
    //   4330: istore #6
    //   4332: iconst_1
    //   4333: istore #5
    //   4335: iload #6
    //   4337: istore_2
    //   4338: iload #5
    //   4340: istore_3
    //   4341: iload #9
    //   4343: iconst_2
    //   4344: if_icmpne -> 4377
    //   4347: iload #6
    //   4349: istore_2
    //   4350: iload #5
    //   4352: istore_3
    //   4353: aload_0
    //   4354: invokevirtual i : ()I
    //   4357: iload #14
    //   4359: if_icmpge -> 4377
    //   4362: aload_0
    //   4363: iload #14
    //   4365: invokevirtual H : (I)V
    //   4368: aload #24
    //   4370: iconst_1
    //   4371: iconst_2
    //   4372: iastore
    //   4373: iconst_1
    //   4374: istore_2
    //   4375: iconst_1
    //   4376: istore_3
    //   4377: aload_0
    //   4378: getfield b0 : I
    //   4381: aload_0
    //   4382: invokevirtual o : ()I
    //   4385: invokestatic max : (II)I
    //   4388: istore_1
    //   4389: iload_1
    //   4390: aload_0
    //   4391: invokevirtual o : ()I
    //   4394: if_icmple -> 4414
    //   4397: aload_0
    //   4398: iload_1
    //   4399: invokevirtual K : (I)V
    //   4402: aload #24
    //   4404: iconst_0
    //   4405: iconst_1
    //   4406: iastore
    //   4407: iconst_1
    //   4408: istore_1
    //   4409: iconst_1
    //   4410: istore_3
    //   4411: goto -> 4416
    //   4414: iload_2
    //   4415: istore_1
    //   4416: aload_0
    //   4417: getfield c0 : I
    //   4420: aload_0
    //   4421: invokevirtual i : ()I
    //   4424: invokestatic max : (II)I
    //   4427: istore_2
    //   4428: iload_2
    //   4429: aload_0
    //   4430: invokevirtual i : ()I
    //   4433: if_icmple -> 4453
    //   4436: aload_0
    //   4437: iload_2
    //   4438: invokevirtual H : (I)V
    //   4441: aload #24
    //   4443: iconst_1
    //   4444: iconst_1
    //   4445: iastore
    //   4446: iconst_1
    //   4447: istore_2
    //   4448: iconst_1
    //   4449: istore_1
    //   4450: goto -> 4455
    //   4453: iload_3
    //   4454: istore_2
    //   4455: iload_2
    //   4456: ifne -> 4580
    //   4459: iload_2
    //   4460: istore #4
    //   4462: iload_1
    //   4463: istore_3
    //   4464: aload #24
    //   4466: iconst_0
    //   4467: iaload
    //   4468: iconst_2
    //   4469: if_icmpne -> 4517
    //   4472: iload_2
    //   4473: istore #4
    //   4475: iload_1
    //   4476: istore_3
    //   4477: iload #7
    //   4479: ifle -> 4517
    //   4482: iload_2
    //   4483: istore #4
    //   4485: iload_1
    //   4486: istore_3
    //   4487: aload_0
    //   4488: invokevirtual o : ()I
    //   4491: iload #7
    //   4493: if_icmple -> 4517
    //   4496: aload_0
    //   4497: iconst_1
    //   4498: putfield E0 : Z
    //   4501: aload #24
    //   4503: iconst_0
    //   4504: iconst_1
    //   4505: iastore
    //   4506: aload_0
    //   4507: iload #7
    //   4509: invokevirtual K : (I)V
    //   4512: iconst_1
    //   4513: istore #4
    //   4515: iconst_1
    //   4516: istore_3
    //   4517: iload #4
    //   4519: istore_2
    //   4520: iload_3
    //   4521: istore_1
    //   4522: aload #24
    //   4524: iconst_1
    //   4525: iaload
    //   4526: iconst_2
    //   4527: if_icmpne -> 4577
    //   4530: iload #4
    //   4532: istore_2
    //   4533: iload_3
    //   4534: istore_1
    //   4535: iload #10
    //   4537: ifle -> 4577
    //   4540: iload #4
    //   4542: istore_2
    //   4543: iload_3
    //   4544: istore_1
    //   4545: aload_0
    //   4546: invokevirtual i : ()I
    //   4549: iload #10
    //   4551: if_icmple -> 4577
    //   4554: aload_0
    //   4555: iconst_1
    //   4556: putfield F0 : Z
    //   4559: aload #24
    //   4561: iconst_1
    //   4562: iconst_1
    //   4563: iastore
    //   4564: aload_0
    //   4565: iload #10
    //   4567: invokevirtual H : (I)V
    //   4570: iconst_1
    //   4571: istore_2
    //   4572: iconst_1
    //   4573: istore_1
    //   4574: goto -> 4583
    //   4577: goto -> 4583
    //   4580: goto -> 4577
    //   4583: iload #12
    //   4585: bipush #8
    //   4587: if_icmple -> 4592
    //   4590: iconst_0
    //   4591: istore_1
    //   4592: iload_2
    //   4593: istore #4
    //   4595: iload #12
    //   4597: istore_2
    //   4598: goto -> 3491
    //   4601: aload_0
    //   4602: aload #21
    //   4604: putfield q0 : Ljava/util/ArrayList;
    //   4607: iload #4
    //   4609: ifeq -> 4624
    //   4612: aload #24
    //   4614: iconst_0
    //   4615: iload #8
    //   4617: iastore
    //   4618: aload #24
    //   4620: iconst_1
    //   4621: iload #9
    //   4623: iastore
    //   4624: aload_0
    //   4625: aload #30
    //   4627: getfield m : Lzv0;
    //   4630: invokevirtual C : (Lzv0;)V
    //   4633: return
    // Exception table:
    //   from	to	target	type
    //   3500	3521	3551	java/lang/Exception
    //   3529	3545	3551	java/lang/Exception
    //   3556	3562	3551	java/lang/Exception
    //   3562	3568	3983	java/lang/Exception
    //   3573	3593	3679	java/lang/Exception
    //   3593	3602	3674	java/lang/Exception
    //   3602	3611	3669	java/lang/Exception
    //   3615	3626	3638	java/lang/Exception
    //   3630	3635	3638	java/lang/Exception
    //   3688	3694	3638	java/lang/Exception
    //   3703	3711	3638	java/lang/Exception
    //   3715	3727	3638	java/lang/Exception
    //   3731	3754	3638	java/lang/Exception
    //   3758	3763	3638	java/lang/Exception
    //   3767	3773	3638	java/lang/Exception
    //   3790	3798	3638	java/lang/Exception
    //   3802	3814	3638	java/lang/Exception
    //   3814	3832	3863	java/lang/Exception
    //   3836	3847	3638	java/lang/Exception
    //   3851	3856	3638	java/lang/Exception
    //   3872	3878	3638	java/lang/Exception
    //   3887	3895	3638	java/lang/Exception
    //   3899	3911	3638	java/lang/Exception
    //   3915	3926	3638	java/lang/Exception
    //   3926	3935	3964	java/lang/Exception
    //   3935	3946	3959	java/lang/Exception
    //   3946	3951	3954	java/lang/Exception
    //   3969	3974	3954	java/lang/Exception
  }
  
  public final boolean S(int paramInt) {
    return ((this.D0 & paramInt) == paramInt);
  }
  
  public final void l(StringBuilder paramStringBuilder) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.j);
    stringBuilder.append(":{\n");
    paramStringBuilder.append(stringBuilder.toString());
    stringBuilder = new StringBuilder("  actualWidth:");
    stringBuilder.append(this.U);
    paramStringBuilder.append(stringBuilder.toString());
    paramStringBuilder.append("\n");
    stringBuilder = new StringBuilder("  actualHeight:");
    stringBuilder.append(this.V);
    paramStringBuilder.append(stringBuilder.toString());
    paramStringBuilder.append("\n");
    ArrayList<Object> arrayList = this.q0;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      er er1 = (er)arrayList.get(b);
      b++;
      ((er)er1).l(paramStringBuilder);
      paramStringBuilder.append(",\n");
    } 
    paramStringBuilder.append("}");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */