import java.util.Locale;

public final class nd0 extends nh0 {
  public final ue0 g;
  
  public final int h;
  
  public final int i;
  
  public nd0(ue0 paramue0) {
    super(iu.l, 2629746000L);
    this.g = paramue0;
    this.h = 12;
    this.i = 2;
  }
  
  public final long A(long paramLong1, long paramLong2) {
    // Byte code:
    //   0: lload_3
    //   1: l2i
    //   2: istore #5
    //   4: iload #5
    //   6: i2l
    //   7: lload_3
    //   8: lcmp
    //   9: ifne -> 20
    //   12: aload_0
    //   13: iload #5
    //   15: lload_1
    //   16: invokevirtual a : (IJ)J
    //   19: lreturn
    //   20: aload_0
    //   21: getfield g : Lue0;
    //   24: astore #22
    //   26: aload #22
    //   28: invokevirtual getClass : ()Ljava/lang/Class;
    //   31: pop
    //   32: lload_1
    //   33: invokestatic Y0 : (J)I
    //   36: i2l
    //   37: lstore #20
    //   39: aload #22
    //   41: lload_1
    //   42: invokevirtual d1 : (J)I
    //   45: istore #9
    //   47: aload #22
    //   49: iload #9
    //   51: lload_1
    //   52: invokevirtual h1 : (IJ)I
    //   55: istore #8
    //   57: iload #8
    //   59: iconst_1
    //   60: isub
    //   61: i2l
    //   62: lload_3
    //   63: ladd
    //   64: lstore #12
    //   66: aload_0
    //   67: getfield h : I
    //   70: istore #6
    //   72: lload #12
    //   74: lconst_0
    //   75: lcmp
    //   76: iflt -> 115
    //   79: iload #9
    //   81: i2l
    //   82: lstore #14
    //   84: iload #6
    //   86: i2l
    //   87: lstore #16
    //   89: lload #12
    //   91: lload #16
    //   93: ldiv
    //   94: lload #14
    //   96: ladd
    //   97: lstore #14
    //   99: lload #12
    //   101: lload #16
    //   103: lrem
    //   104: lconst_1
    //   105: ladd
    //   106: lstore #12
    //   108: lload #12
    //   110: lstore #16
    //   112: goto -> 193
    //   115: iload #9
    //   117: i2l
    //   118: lstore #14
    //   120: iload #6
    //   122: i2l
    //   123: lstore #16
    //   125: lload #12
    //   127: lload #16
    //   129: ldiv
    //   130: lload #14
    //   132: ladd
    //   133: lstore #18
    //   135: lload #18
    //   137: lconst_1
    //   138: lsub
    //   139: lstore #14
    //   141: lload #12
    //   143: invokestatic abs : (J)J
    //   146: lload #16
    //   148: lrem
    //   149: l2i
    //   150: istore #7
    //   152: iload #7
    //   154: istore #5
    //   156: iload #7
    //   158: ifne -> 165
    //   161: iload #6
    //   163: istore #5
    //   165: iload #6
    //   167: iload #5
    //   169: isub
    //   170: iconst_1
    //   171: iadd
    //   172: i2l
    //   173: lstore #12
    //   175: lload #12
    //   177: lstore #16
    //   179: lload #12
    //   181: lconst_1
    //   182: lcmp
    //   183: ifne -> 193
    //   186: lload #18
    //   188: lstore #14
    //   190: goto -> 108
    //   193: lload #14
    //   195: ldc2_w -292275054
    //   198: lcmp
    //   199: iflt -> 274
    //   202: lload #14
    //   204: ldc2_w 292278993
    //   207: lcmp
    //   208: ifgt -> 274
    //   211: lload #14
    //   213: l2i
    //   214: istore #11
    //   216: lload #16
    //   218: l2i
    //   219: istore #10
    //   221: aload #22
    //   223: lload_1
    //   224: iload #9
    //   226: iload #8
    //   228: invokevirtual U0 : (JII)I
    //   231: istore #7
    //   233: aload #22
    //   235: iload #11
    //   237: iload #10
    //   239: invokevirtual W0 : (II)I
    //   242: istore #6
    //   244: iload #7
    //   246: istore #5
    //   248: iload #7
    //   250: iload #6
    //   252: if_icmple -> 259
    //   255: iload #6
    //   257: istore #5
    //   259: aload #22
    //   261: iload #11
    //   263: iload #10
    //   265: iload #5
    //   267: invokevirtual f1 : (III)J
    //   270: lload #20
    //   272: ladd
    //   273: lreturn
    //   274: new java/lang/StringBuilder
    //   277: dup
    //   278: ldc 'Magnitude of add amount is too large: '
    //   280: invokespecial <init> : (Ljava/lang/String;)V
    //   283: astore #22
    //   285: aload #22
    //   287: lload_3
    //   288: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   291: pop
    //   292: new java/lang/IllegalArgumentException
    //   295: dup
    //   296: aload #22
    //   298: invokevirtual toString : ()Ljava/lang/String;
    //   301: invokespecial <init> : (Ljava/lang/String;)V
    //   304: athrow
  }
  
  public final long a(int paramInt, long paramLong) {
    if (paramInt == 0)
      return paramLong; 
    ue0 ue01 = this.g;
    ue01.getClass();
    long l = oe.Y0(paramLong);
    int j = ue01.d1(paramLong);
    int n = ue01.h1(j, paramLong);
    int m = n - 1;
    int i = m + paramInt;
    int k = this.h;
    if (n > 0 && i < 0) {
      i = paramInt + k;
      if (Math.signum(i) == Math.signum(paramInt)) {
        paramInt = j - 1;
      } else {
        i = paramInt - k;
        paramInt = j + 1;
      } 
      i += m;
    } else {
      paramInt = j;
    } 
    if (i >= 0) {
      paramInt = i / k + paramInt;
      i = i % k + 1;
    } else {
      m = i / k + paramInt;
      i = Math.abs(i) % k;
      paramInt = i;
      if (i == 0)
        paramInt = k; 
      i = k - paramInt + 1;
      if (i == 1) {
        paramInt = m;
      } else {
        paramInt = m - 1;
      } 
    } 
    m = ue01.U0(paramLong, j, n);
    k = ue01.W0(paramInt, i);
    j = m;
    if (m > k)
      j = k; 
    return ue01.f1(paramInt, i, j) + l;
  }
  
  public final int b(long paramLong) {
    ue0 ue01 = this.g;
    return ue01.h1(ue01.d1(paramLong), paramLong);
  }
  
  public final String c(int paramInt, Locale paramLocale) {
    return (md0.b(paramLocale)).e[paramInt];
  }
  
  public final String f(int paramInt, Locale paramLocale) {
    return (md0.b(paramLocale)).d[paramInt];
  }
  
  public final g20 j() {
    return this.g.w;
  }
  
  public final int k(Locale paramLocale) {
    return (md0.b(paramLocale)).l;
  }
  
  public final int l() {
    return this.h;
  }
  
  public final int o() {
    return 1;
  }
  
  public final g20 p() {
    return this.g.A;
  }
  
  public final boolean r(long paramLong) {
    ue0 ue01 = this.g;
    int i = ue01.d1(paramLong);
    return (ue01.g1(i) && ue01.h1(i, paramLong) == this.i);
  }
  
  public final boolean s() {
    return false;
  }
  
  public final long u(long paramLong) {
    return paramLong - v(paramLong);
  }
  
  public final long v(long paramLong) {
    ue0 ue01 = this.g;
    int i = ue01.d1(paramLong);
    int j = ue01.h1(i, paramLong);
    paramLong = ue01.e1(i);
    return ue01.Z0(i, j) + paramLong;
  }
  
  public final long w(int paramInt, long paramLong) {
    wf2.n0(this, paramInt, 1, this.h);
    ue0 ue01 = this.g;
    int m = ue01.d1(paramLong);
    int j = ue01.U0(paramLong, m, ue01.h1(m, paramLong));
    int k = ue01.W0(m, paramInt);
    int i = j;
    if (j > k)
      i = k; 
    return ue01.f1(m, paramInt, i) + oe.Y0(paramLong);
  }
  
  public final int z(String paramString, Locale paramLocale) {
    Integer integer = (Integer)(md0.b(paramLocale)).i.get(paramString);
    if (integer != null)
      return integer.intValue(); 
    throw new eh0(iu.l, paramString);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nd0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */