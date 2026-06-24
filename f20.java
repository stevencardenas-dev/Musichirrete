public abstract class f20 implements Comparable {
  public static final hp2 b = (hp2)new Object();
  
  public static final long c = m92.m(4611686018427387903L);
  
  public static final long e = m92.m(-4611686018427387903L);
  
  public static final long a(long paramLong1, long paramLong2) {
    long l = paramLong2 / 1000000L;
    paramLong1 = m92.b(paramLong1, l);
    if (-4611686018426L <= paramLong1 && paramLong1 < 4611686018427L) {
      int i = i20.a;
      return paramLong1 * 1000000L + paramLong2 - l * 1000000L << 1L;
    } 
    return m92.m(paramLong1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\f20.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */