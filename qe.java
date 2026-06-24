public abstract class qe extends oe {
  public static final int[] u0 = new int[] { 
      31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 
      30, 31 };
  
  public static final int[] v0 = new int[] { 
      31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 
      30, 31 };
  
  public static final long[] w0 = new long[12];
  
  public static final long[] x0 = new long[12];
  
  static {
    long l2 = 0L;
    int i = 0;
    long l1 = 0L;
    while (i < 11) {
      l2 += u0[i] * 86400000L;
      long[] arrayOfLong = w0;
      int j = i + 1;
      arrayOfLong[j] = l2;
      l1 += v0[i] * 86400000L;
      x0[j] = l1;
      i = j;
    } 
  }
  
  public final int W0(int paramInt1, int paramInt2) {
    return g1(paramInt1) ? v0[paramInt2 - 1] : u0[paramInt2 - 1];
  }
  
  public final long Z0(int paramInt1, int paramInt2) {
    return g1(paramInt1) ? x0[paramInt2 - 1] : w0[paramInt2 - 1];
  }
  
  public final int h1(int paramInt, long paramLong) {
    int i = (int)(paramLong - e1(paramInt) >> 10L);
    if (g1(paramInt)) {
      if (i < 15356250) {
        if (i < 7678125) {
          if (i < 2615625)
            return 1; 
          if (i < 5062500)
            return 2; 
        } else {
          return (i < 10209375) ? 4 : ((i < 12825000) ? 5 : 6);
        } 
      } else {
        if (i < 23118750) {
          if (i < 17971875)
            return 7; 
          if (i < 20587500)
            return 8; 
        } else {
          return (i < 25734375) ? 10 : ((i < 28265625) ? 11 : 12);
        } 
        return 9;
      } 
    } else {
      return (i < 15271875) ? ((i < 7593750) ? ((i < 2615625) ? 1 : ((i < 4978125) ? 2 : 3)) : ((i < 10125000) ? 4 : ((i < 12740625) ? 5 : 6))) : ((i < 23034375) ? ((i < 17887500) ? 7 : ((i < 20503125) ? 8 : 9)) : ((i < 25650000) ? 10 : ((i < 28181250) ? 11 : 12)));
    } 
    return 3;
  }
  
  public final boolean i1(long paramLong) {
    return (this.P.b(paramLong) == 29 && this.U.r(paramLong));
  }
  
  public final long j1(int paramInt, long paramLong) {
    int m = d1(paramLong);
    int i = (int)((paramLong - e1(m)) / 86400000L);
    int j = i + 1;
    int k = oe.Y0(paramLong);
    if (j > 59)
      if (g1(m)) {
        if (!g1(paramInt))
          return f1(paramInt, 1, i) + k; 
      } else if (g1(paramInt)) {
        i += 2;
        return f1(paramInt, 1, i) + k;
      }  
    i = j;
    return f1(paramInt, 1, i) + k;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */