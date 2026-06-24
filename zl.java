public final class zl implements nt0, mt0 {
  public final nt0 b;
  
  public mt0 c;
  
  public yl[] e;
  
  public long f;
  
  public final long g;
  
  public zl(nt0 paramnt0, long paramLong) {
    this.b = paramnt0;
    this.e = new yl[0];
    this.f = 0L;
    this.g = paramLong;
  }
  
  public final boolean a() {
    return this.b.a();
  }
  
  public final void b(nt0 paramnt0) {
    mt0 mt01 = this.c;
    mt01.getClass();
    mt01.b(this);
  }
  
  public final long c() {
    long l = this.b.c();
    if (l != Long.MIN_VALUE) {
      long l1 = this.g;
      if (l1 == Long.MIN_VALUE || l < l1)
        return l; 
    } 
    return Long.MIN_VALUE;
  }
  
  public final long d() {
    long l1 = this.f;
    if (l1 != -9223372036854775807L) {
      this.f = -9223372036854775807L;
      long l = d();
      return (l != -9223372036854775807L) ? l : l1;
    } 
    l1 = this.b.d();
    if (l1 == -9223372036854775807L)
      return -9223372036854775807L; 
    boolean bool2 = false;
    if (l1 >= 0L) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    n21.r(bool1);
    long l2 = this.g;
    if (l2 != Long.MIN_VALUE) {
      bool1 = bool2;
      if (l1 <= l2) {
        bool1 = true;
        n21.r(bool1);
        return l1;
      } 
      n21.r(bool1);
      return l1;
    } 
    boolean bool1 = true;
    n21.r(bool1);
    return l1;
  }
  
  public final long e(long paramLong, bk1 parambk1) {
    if (paramLong == 0L)
      return 0L; 
    long l1 = parambk1.a;
    long l2 = parambk1.b;
    int i = d12.a;
    long l3 = Math.max(0L, Math.min(l1, paramLong));
    l1 = this.g;
    if (l1 == Long.MIN_VALUE) {
      l1 = Long.MAX_VALUE;
    } else {
      l1 -= paramLong;
    } 
    l1 = Math.max(0L, Math.min(l2, l1));
    if (l3 != parambk1.a || l1 != l2)
      parambk1 = new bk1(l3, l1); 
    return this.b.e(paramLong, parambk1);
  }
  
  public final void g(mt0 parammt0, long paramLong) {
    this.c = parammt0;
    this.b.g(this, paramLong);
  }
  
  public final long h(zd[] paramArrayOfzd, boolean[] paramArrayOfboolean1, li1[] paramArrayOfli1, boolean[] paramArrayOfboolean2, long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: aload_3
    //   2: arraylength
    //   3: anewarray yl
    //   6: putfield e : [Lyl;
    //   9: aload_3
    //   10: arraylength
    //   11: anewarray li1
    //   14: astore #14
    //   16: iconst_0
    //   17: istore #8
    //   19: iconst_0
    //   20: istore #7
    //   22: aload_3
    //   23: arraylength
    //   24: istore #9
    //   26: aconst_null
    //   27: astore #13
    //   29: iload #7
    //   31: iload #9
    //   33: if_icmpge -> 83
    //   36: aload_0
    //   37: getfield e : [Lyl;
    //   40: astore #16
    //   42: aload_3
    //   43: iload #7
    //   45: aaload
    //   46: checkcast yl
    //   49: astore #15
    //   51: aload #16
    //   53: iload #7
    //   55: aload #15
    //   57: aastore
    //   58: aload #15
    //   60: ifnull -> 70
    //   63: aload #15
    //   65: getfield a : Lli1;
    //   68: astore #13
    //   70: aload #14
    //   72: iload #7
    //   74: aload #13
    //   76: aastore
    //   77: iinc #7, 1
    //   80: goto -> 22
    //   83: aload_0
    //   84: getfield b : Lnt0;
    //   87: aload_1
    //   88: aload_2
    //   89: aload #14
    //   91: aload #4
    //   93: lload #5
    //   95: invokeinterface h : ([Lzd;[Z[Lli1;[ZJ)J
    //   100: lstore #11
    //   102: aload_0
    //   103: ldc2_w -9223372036854775807
    //   106: putfield f : J
    //   109: lload #11
    //   111: lload #5
    //   113: lcmp
    //   114: ifeq -> 156
    //   117: lload #11
    //   119: lconst_0
    //   120: lcmp
    //   121: iflt -> 150
    //   124: aload_0
    //   125: getfield g : J
    //   128: lstore #5
    //   130: lload #5
    //   132: ldc2_w -9223372036854775808
    //   135: lcmp
    //   136: ifeq -> 156
    //   139: lload #11
    //   141: lload #5
    //   143: lcmp
    //   144: ifgt -> 150
    //   147: goto -> 156
    //   150: iconst_0
    //   151: istore #10
    //   153: goto -> 159
    //   156: iconst_1
    //   157: istore #10
    //   159: iload #10
    //   161: invokestatic r : (Z)V
    //   164: iload #8
    //   166: istore #7
    //   168: iload #7
    //   170: aload_3
    //   171: arraylength
    //   172: if_icmpge -> 246
    //   175: aload #14
    //   177: iload #7
    //   179: aaload
    //   180: astore #4
    //   182: aload_0
    //   183: getfield e : [Lyl;
    //   186: astore_1
    //   187: aload #4
    //   189: ifnonnull -> 200
    //   192: aload_1
    //   193: iload #7
    //   195: aconst_null
    //   196: aastore
    //   197: goto -> 232
    //   200: aload_1
    //   201: iload #7
    //   203: aaload
    //   204: astore_2
    //   205: aload_2
    //   206: ifnull -> 218
    //   209: aload_2
    //   210: getfield a : Lli1;
    //   213: aload #4
    //   215: if_acmpeq -> 232
    //   218: aload_1
    //   219: iload #7
    //   221: new yl
    //   224: dup
    //   225: aload_0
    //   226: aload #4
    //   228: invokespecial <init> : (Lzl;Lli1;)V
    //   231: aastore
    //   232: aload_3
    //   233: iload #7
    //   235: aload_1
    //   236: iload #7
    //   238: aaload
    //   239: aastore
    //   240: iinc #7, 1
    //   243: goto -> 168
    //   246: lload #11
    //   248: lreturn
  }
  
  public final vv1 i() {
    return this.b.i();
  }
  
  public final long j() {
    long l = this.b.j();
    if (l != Long.MIN_VALUE) {
      long l1 = this.g;
      if (l1 == Long.MIN_VALUE || l < l1)
        return l; 
    } 
    return Long.MIN_VALUE;
  }
  
  public final void k() {
    this.b.k();
  }
  
  public final long l(long paramLong) {
    this.f = -9223372036854775807L;
    yl[] arrayOfYl = this.e;
    int i = arrayOfYl.length;
    boolean bool2 = false;
    for (byte b = 0; b < i; b++) {
      yl yl1 = arrayOfYl[b];
      if (yl1 != null)
        yl1.b = false; 
    } 
    long l = this.b.l(paramLong);
    if (l != paramLong) {
      boolean bool = bool2;
      if (l >= 0L) {
        paramLong = this.g;
        if (paramLong != Long.MIN_VALUE) {
          bool = bool2;
          if (l <= paramLong) {
            bool = true;
            n21.r(bool);
            return l;
          } 
          n21.r(bool);
          return l;
        } 
      } else {
        n21.r(bool);
        return l;
      } 
    } 
    boolean bool1 = true;
    n21.r(bool1);
    return l;
  }
  
  public final void m(long paramLong) {
    this.b.m(paramLong);
  }
  
  public final boolean n(long paramLong) {
    return this.b.n(paramLong);
  }
  
  public final void o(long paramLong) {
    this.b.o(paramLong);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */