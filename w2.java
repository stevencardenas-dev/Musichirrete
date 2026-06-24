public final class w2 extends zd {
  public final ip2 f;
  
  public w2(uv1 paramuv1, int[] paramArrayOfint, ip2 paramip2) {
    super(paramuv1, paramArrayOfint);
    this.f = paramip2;
  }
  
  public static void a(long[][][] paramArrayOflong, int paramInt, long[][] paramArrayOflong1, int[] paramArrayOfint) {
    long l = 0L;
    byte b;
    for (b = 0; b < paramArrayOflong.length; b++) {
      long[] arrayOfLong = paramArrayOflong[b][paramInt];
      long l1 = paramArrayOflong1[b][paramArrayOfint[b]];
      arrayOfLong[1] = l1;
      l += l1;
    } 
    int i = paramArrayOflong.length;
    for (b = 0; b < i; b++)
      paramArrayOflong[b][paramInt][0] = l; 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\w2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */