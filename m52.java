public abstract class m52 implements cy {
  public int a;
  
  public er b;
  
  public sh1 c;
  
  public int d;
  
  public final rz e = new rz(this);
  
  public int f = 0;
  
  public boolean g = false;
  
  public final iy h = new iy(this);
  
  public final iy i = new iy(this);
  
  public int j = 1;
  
  public m52(er paramer) {
    this.b = paramer;
  }
  
  public static void b(iy paramiy1, iy paramiy2, int paramInt) {
    paramiy1.l.add(paramiy2);
    paramiy1.f = paramInt;
    paramiy2.k.add(paramiy1);
  }
  
  public static iy h(bq parambq) {
    parambq = parambq.f;
    if (parambq != null) {
      er er1 = parambq.d;
      int i = x41.y(parambq.e);
      return (i != 1) ? ((i != 2) ? ((i != 3) ? ((i != 4) ? ((i == 5) ? er1.e.k : null) : er1.e.i) : er1.d.i) : er1.e.h) : er1.d.h;
    } 
    return null;
  }
  
  public static iy i(bq parambq, int paramInt) {
    bq bq1 = parambq.f;
    if (bq1 != null) {
      fg0 fg0;
      d22 d22;
      er er1 = bq1.d;
      if (paramInt == 0) {
        fg0 = er1.d;
      } else {
        d22 = ((er)fg0).e;
      } 
      paramInt = x41.y(bq1.e);
      return (paramInt != 1 && paramInt != 2) ? ((paramInt == 3 || paramInt == 4) ? d22.i : null) : d22.h;
    } 
    return null;
  }
  
  public final void c(iy paramiy1, iy paramiy2, int paramInt, rz paramrz) {
    paramiy1.l.add(paramiy2);
    paramiy1.l.add(this.e);
    paramiy1.h = paramInt;
    paramiy1.i = paramrz;
    paramiy2.k.add(paramiy1);
    paramrz.k.add(paramiy1);
  }
  
  public abstract void d();
  
  public abstract void e();
  
  public abstract void f();
  
  public final int g(int paramInt1, int paramInt2) {
    er er1 = this.b;
    if (paramInt2 == 0) {
      int i = er1.v;
      paramInt2 = Math.max(er1.u, paramInt1);
      if (i > 0)
        paramInt2 = Math.min(i, paramInt1); 
      if (paramInt2 != paramInt1)
        return paramInt2; 
    } else {
      int i = er1.y;
      paramInt2 = Math.max(er1.x, paramInt1);
      if (i > 0)
        paramInt2 = Math.min(i, paramInt1); 
      if (paramInt2 != paramInt1)
        return paramInt2; 
    } 
    return paramInt1;
  }
  
  public long j() {
    rz rz1 = this.e;
    return rz1.j ? rz1.g : 0L;
  }
  
  public abstract boolean k();
  
  public final void l(bq parambq1, bq parambq2, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic h : (Lbq;)Liy;
    //   4: astore #11
    //   6: aload_2
    //   7: invokestatic h : (Lbq;)Liy;
    //   10: astore #12
    //   12: aload #11
    //   14: getfield j : Z
    //   17: ifeq -> 519
    //   20: aload #12
    //   22: getfield j : Z
    //   25: ifne -> 31
    //   28: goto -> 519
    //   31: aload #11
    //   33: getfield g : I
    //   36: istore #6
    //   38: aload_1
    //   39: invokevirtual d : ()I
    //   42: iload #6
    //   44: iadd
    //   45: istore #7
    //   47: aload #12
    //   49: getfield g : I
    //   52: aload_2
    //   53: invokevirtual d : ()I
    //   56: isub
    //   57: istore #8
    //   59: iload #8
    //   61: iload #7
    //   63: isub
    //   64: istore #9
    //   66: aload_0
    //   67: getfield e : Lrz;
    //   70: astore_2
    //   71: aload_2
    //   72: getfield j : Z
    //   75: ifne -> 372
    //   78: aload_0
    //   79: getfield d : I
    //   82: iconst_3
    //   83: if_icmpne -> 372
    //   86: aload_0
    //   87: getfield a : I
    //   90: istore #6
    //   92: iload #6
    //   94: ifeq -> 361
    //   97: iload #6
    //   99: iconst_1
    //   100: if_icmpeq -> 340
    //   103: iload #6
    //   105: iconst_2
    //   106: if_icmpeq -> 250
    //   109: iload #6
    //   111: iconst_3
    //   112: if_icmpeq -> 118
    //   115: goto -> 372
    //   118: aload_0
    //   119: getfield b : Ler;
    //   122: astore #13
    //   124: aload #13
    //   126: getfield d : Lfg0;
    //   129: astore_1
    //   130: aload_1
    //   131: getfield d : I
    //   134: iconst_3
    //   135: if_icmpne -> 174
    //   138: aload_1
    //   139: getfield a : I
    //   142: iconst_3
    //   143: if_icmpne -> 174
    //   146: aload #13
    //   148: getfield e : Ld22;
    //   151: astore #14
    //   153: aload #14
    //   155: getfield d : I
    //   158: iconst_3
    //   159: if_icmpne -> 174
    //   162: aload #14
    //   164: getfield a : I
    //   167: iconst_3
    //   168: if_icmpne -> 174
    //   171: goto -> 372
    //   174: iload_3
    //   175: ifne -> 184
    //   178: aload #13
    //   180: getfield e : Ld22;
    //   183: astore_1
    //   184: aload_1
    //   185: getfield e : Lrz;
    //   188: astore_1
    //   189: aload_1
    //   190: getfield j : Z
    //   193: ifeq -> 372
    //   196: aload #13
    //   198: getfield W : F
    //   201: fstore #4
    //   203: aload_1
    //   204: getfield g : I
    //   207: istore #6
    //   209: iload_3
    //   210: iconst_1
    //   211: if_icmpne -> 229
    //   214: iload #6
    //   216: i2f
    //   217: fload #4
    //   219: fdiv
    //   220: ldc 0.5
    //   222: fadd
    //   223: f2i
    //   224: istore #6
    //   226: goto -> 241
    //   229: fload #4
    //   231: iload #6
    //   233: i2f
    //   234: fmul
    //   235: ldc 0.5
    //   237: fadd
    //   238: f2i
    //   239: istore #6
    //   241: aload_2
    //   242: iload #6
    //   244: invokevirtual d : (I)V
    //   247: goto -> 372
    //   250: aload_0
    //   251: getfield b : Ler;
    //   254: astore #13
    //   256: aload #13
    //   258: getfield T : Ler;
    //   261: astore_1
    //   262: aload_1
    //   263: ifnull -> 372
    //   266: iload_3
    //   267: ifne -> 278
    //   270: aload_1
    //   271: getfield d : Lfg0;
    //   274: astore_1
    //   275: goto -> 283
    //   278: aload_1
    //   279: getfield e : Ld22;
    //   282: astore_1
    //   283: aload_1
    //   284: getfield e : Lrz;
    //   287: astore_1
    //   288: aload_1
    //   289: getfield j : Z
    //   292: ifeq -> 372
    //   295: iload_3
    //   296: ifne -> 309
    //   299: aload #13
    //   301: getfield w : F
    //   304: fstore #4
    //   306: goto -> 316
    //   309: aload #13
    //   311: getfield z : F
    //   314: fstore #4
    //   316: aload_2
    //   317: aload_0
    //   318: aload_1
    //   319: getfield g : I
    //   322: i2f
    //   323: fload #4
    //   325: fmul
    //   326: ldc 0.5
    //   328: fadd
    //   329: f2i
    //   330: iload_3
    //   331: invokevirtual g : (II)I
    //   334: invokevirtual d : (I)V
    //   337: goto -> 372
    //   340: aload_2
    //   341: aload_0
    //   342: aload_2
    //   343: getfield m : I
    //   346: iload_3
    //   347: invokevirtual g : (II)I
    //   350: iload #9
    //   352: invokestatic min : (II)I
    //   355: invokevirtual d : (I)V
    //   358: goto -> 372
    //   361: aload_2
    //   362: aload_0
    //   363: iload #9
    //   365: iload_3
    //   366: invokevirtual g : (II)I
    //   369: invokevirtual d : (I)V
    //   372: aload_2
    //   373: getfield j : Z
    //   376: ifne -> 382
    //   379: goto -> 519
    //   382: aload_2
    //   383: getfield g : I
    //   386: istore #10
    //   388: aload_0
    //   389: getfield i : Liy;
    //   392: astore #14
    //   394: aload_0
    //   395: getfield h : Liy;
    //   398: astore_1
    //   399: iload #10
    //   401: iload #9
    //   403: if_icmpne -> 420
    //   406: aload_1
    //   407: iload #7
    //   409: invokevirtual d : (I)V
    //   412: aload #14
    //   414: iload #8
    //   416: invokevirtual d : (I)V
    //   419: return
    //   420: aload_0
    //   421: getfield b : Ler;
    //   424: astore #13
    //   426: iload_3
    //   427: ifne -> 440
    //   430: aload #13
    //   432: getfield d0 : F
    //   435: fstore #4
    //   437: goto -> 447
    //   440: aload #13
    //   442: getfield e0 : F
    //   445: fstore #4
    //   447: iload #8
    //   449: istore_3
    //   450: iload #7
    //   452: istore #6
    //   454: aload #11
    //   456: aload #12
    //   458: if_acmpne -> 478
    //   461: aload #11
    //   463: getfield g : I
    //   466: istore #6
    //   468: aload #12
    //   470: getfield g : I
    //   473: istore_3
    //   474: ldc 0.5
    //   476: fstore #4
    //   478: iload #6
    //   480: i2f
    //   481: fstore #5
    //   483: aload_1
    //   484: iload_3
    //   485: iload #6
    //   487: isub
    //   488: iload #10
    //   490: isub
    //   491: i2f
    //   492: fload #4
    //   494: fmul
    //   495: fload #5
    //   497: ldc 0.5
    //   499: fadd
    //   500: fadd
    //   501: f2i
    //   502: invokevirtual d : (I)V
    //   505: aload #14
    //   507: aload_1
    //   508: getfield g : I
    //   511: aload_2
    //   512: getfield g : I
    //   515: iadd
    //   516: invokevirtual d : (I)V
    //   519: return
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m52.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */