public abstract class oe extends i9 {
  public static final h91 d0;
  
  public static final h91 e0;
  
  public static final h91 f0;
  
  public static final h91 g0;
  
  public static final h91 h0;
  
  public static final h91 i0 = new h91(h20.j, 604800000L);
  
  public static final g91 j0;
  
  public static final g91 k0;
  
  public static final g91 l0;
  
  public static final g91 m0;
  
  public static final g91 n0;
  
  public static final g91 o0;
  
  public static final g91 p0;
  
  public static final g91 q0;
  
  public static final a92 r0;
  
  public static final a92 s0;
  
  public static final me t0 = (me)new g91(iu.r, g0, h0);
  
  public final transient ne[] b0 = new ne[1024];
  
  public final int c0 = 4;
  
  public oe(f92 paramf92) {
    super(paramf92, null);
  }
  
  public static int V0(long paramLong) {
    if (paramLong >= 0L) {
      paramLong /= 86400000L;
    } else {
      long l = (paramLong - 86399999L) / 86400000L;
      paramLong = l;
      if (l < -3L)
        return (int)((l + 4L) % 7L) + 7; 
    } 
    return (int)((paramLong + 3L) % 7L) + 1;
  }
  
  public static int Y0(long paramLong) {
    return (paramLong >= 0L) ? (int)(paramLong % 86400000L) : ((int)((paramLong + 1L) % 86400000L) + 86399999);
  }
  
  public final hv G() {
    dd1 dd1 = this.p;
    return (dd1 != null) ? dd1.G() : hv.c;
  }
  
  public final long T0(int paramInt1, int paramInt2, int paramInt3) {
    wf2.o0(iu.j, paramInt1, -292275055, 292278994);
    wf2.o0(iu.l, paramInt2, 1, 12);
    wf2.o0(iu.m, paramInt3, 1, W0(paramInt1, paramInt2));
    long l = f1(paramInt1, paramInt2, paramInt3);
    paramInt2 = l cmp 0L;
    return (paramInt2 < 0 && paramInt1 == 292278994) ? Long.MAX_VALUE : ((paramInt2 > 0 && paramInt1 == -292275055) ? Long.MIN_VALUE : l);
  }
  
  public final int U0(long paramLong, int paramInt1, int paramInt2) {
    long l = e1(paramInt1);
    return (int)((paramLong - Z0(paramInt1, paramInt2) + l) / 86400000L) + 1;
  }
  
  public abstract int W0(int paramInt1, int paramInt2);
  
  public final long X0(int paramInt) {
    long l = e1(paramInt);
    paramInt = V0(l);
    return (paramInt > 8 - this.c0) ? ((8 - paramInt) * 86400000L + l) : (l - (paramInt - 1) * 86400000L);
  }
  
  public abstract long Z0(int paramInt1, int paramInt2);
  
  public final int a1(int paramInt, long paramLong) {
    long l = X0(paramInt);
    return (paramLong < l) ? b1(paramInt - 1) : ((paramLong >= X0(paramInt + 1)) ? 1 : ((int)((paramLong - l) / 604800000L) + 1));
  }
  
  public final int b1(int paramInt) {
    long l = X0(paramInt);
    return (int)((X0(paramInt + 1) - l) / 604800000L);
  }
  
  public final int c1(long paramLong) {
    int j = d1(paramLong);
    int i = a1(j, paramLong);
    return (i == 1) ? d1(paramLong + 604800000L) : ((i > 51) ? d1(paramLong - 1209600000L) : j);
  }
  
  public final int d1(long paramLong) {
    long l3 = paramLong >> 1L;
    long l2 = 31083597720000L + l3;
    long l1 = l2;
    if (l2 < 0L)
      l1 = 31067819244001L + l3; 
    int j = (int)(l1 / 15778476000L);
    l2 = e1(j);
    l3 = paramLong - l2;
    if (l3 < 0L)
      return j - 1; 
    l1 = 31536000000L;
    int i = j;
    if (l3 >= 31536000000L) {
      if (g1(j))
        l1 = 31622400000L; 
      i = j;
      if (l2 + l1 <= paramLong)
        i = j + 1; 
    } 
    return i;
  }
  
  public final long e1(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: sipush #1023
    //   4: iand
    //   5: istore_3
    //   6: aload_0
    //   7: getfield b0 : [Lne;
    //   10: astore #6
    //   12: aload #6
    //   14: iload_3
    //   15: aaload
    //   16: astore #5
    //   18: aload #5
    //   20: ifnull -> 36
    //   23: aload #5
    //   25: astore #4
    //   27: aload #5
    //   29: getfield a : I
    //   32: iload_1
    //   33: if_icmpeq -> 128
    //   36: aload_0
    //   37: checkcast ue0
    //   40: astore #4
    //   42: iload_1
    //   43: bipush #100
    //   45: idiv
    //   46: istore_2
    //   47: iload_1
    //   48: ifge -> 70
    //   51: iload_1
    //   52: iconst_3
    //   53: iadd
    //   54: iconst_2
    //   55: ishr
    //   56: iload_2
    //   57: isub
    //   58: iload_2
    //   59: iconst_3
    //   60: iadd
    //   61: iconst_2
    //   62: ishr
    //   63: iadd
    //   64: iconst_1
    //   65: isub
    //   66: istore_2
    //   67: goto -> 95
    //   70: iload_2
    //   71: iconst_2
    //   72: ishr
    //   73: iload_1
    //   74: iconst_2
    //   75: ishr
    //   76: iload_2
    //   77: isub
    //   78: iadd
    //   79: istore_2
    //   80: aload #4
    //   82: iload_1
    //   83: invokevirtual g1 : (I)Z
    //   86: ifeq -> 95
    //   89: iinc #2, -1
    //   92: goto -> 95
    //   95: new ne
    //   98: dup
    //   99: iload_1
    //   100: iload_1
    //   101: i2l
    //   102: ldc2_w 365
    //   105: lmul
    //   106: iload_2
    //   107: ldc_w 719527
    //   110: isub
    //   111: i2l
    //   112: ladd
    //   113: ldc2_w 86400000
    //   116: lmul
    //   117: invokespecial <init> : (IJ)V
    //   120: astore #4
    //   122: aload #6
    //   124: iload_3
    //   125: aload #4
    //   127: aastore
    //   128: aload #4
    //   130: getfield b : J
    //   133: lreturn
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && getClass() == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.c0 == ((oe)paramObject).c0 && G().equals(paramObject.G()))
        return true; 
    } 
    return false;
  }
  
  public final long f1(int paramInt1, int paramInt2, int paramInt3) {
    long l2 = e1(paramInt1);
    long l1 = Z0(paramInt1, paramInt2);
    return (paramInt3 - 1) * 86400000L + l1 + l2;
  }
  
  public abstract boolean g1(int paramInt);
  
  public final int hashCode() {
    int i = getClass().getName().hashCode();
    return G().hashCode() + i * 11 + this.c0;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder(60);
    String str2 = getClass().getName();
    int i = str2.lastIndexOf('.');
    String str1 = str2;
    if (i >= 0)
      str1 = str2.substring(i + 1); 
    stringBuilder.append(str1);
    stringBuilder.append('[');
    hv hv = G();
    if (hv != null)
      stringBuilder.append(hv.b); 
    i = this.c0;
    if (i != 4) {
      stringBuilder.append(",mdfw=");
      stringBuilder.append(i);
    } 
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
  
  public final long z(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7) {
    dd1 dd1 = this.p;
    if (dd1 != null)
      return dd1.z(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7); 
    wf2.o0(iu.v, paramInt4, 0, 23);
    wf2.o0(iu.x, paramInt5, 0, 59);
    wf2.o0(iu.z, paramInt6, 0, 59);
    wf2.o0(iu.B, paramInt7, 0, 999);
    paramInt5 = (int)(paramInt6 * 1000 + paramInt5 * 60000 + paramInt4 * 3600000 + paramInt7);
    long l2 = T0(paramInt1, paramInt2, paramInt3);
    paramInt4 = paramInt5;
    long l1 = l2;
    if (l2 == Long.MIN_VALUE) {
      l1 = T0(paramInt1, paramInt2, paramInt3 + 1);
      paramInt4 = paramInt5 - 86400000;
    } 
    l2 = paramInt4 + l1;
    paramInt1 = l2 cmp 0L;
    return (paramInt1 < 0 && l1 > 0L) ? Long.MAX_VALUE : ((paramInt1 > 0 && l1 < 0L) ? Long.MIN_VALUE : l2);
  }
  
  static {
    h91 h914 = new h91(h20.o, 1000L);
    d0 = h914;
    h91 h915 = new h91(h20.n, 60000L);
    e0 = h915;
    h91 h912 = new h91(h20.m, 3600000L);
    f0 = h912;
    h91 h911 = new h91(h20.l, 43200000L);
    g0 = h911;
    h91 h913 = new h91(h20.k, 86400000L);
    h0 = h913;
  }
  
  static {
    iu iu = iu.B;
    sx0 sx0 = sx0.b;
    j0 = new g91(iu, sx0, h914);
    k0 = new g91(iu.A, sx0, h913);
    l0 = new g91(iu.z, h914, h915);
    m0 = new g91(iu.y, h914, h913);
    n0 = new g91(iu.x, h915, h912);
    o0 = new g91(iu.w, h915, h913);
    g91 g912 = new g91(iu.v, h912, h913);
    p0 = g912;
    g91 g911 = new g91(iu.s, h912, h911);
    q0 = g911;
    r0 = (a92)new tv(g912, iu.u);
    s0 = (a92)new tv(g911, iu.t);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\oe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */