public final class ra {
  public int a;
  
  public int b;
  
  public float c;
  
  public float d;
  
  public long e;
  
  public long f;
  
  public long g;
  
  public float h;
  
  public int i;
  
  public final float a(long paramLong) {
    long l2 = this.e;
    if (paramLong < l2)
      return 0.0F; 
    long l1 = this.g;
    if (l1 < 0L || paramLong < l1)
      return go0.b((float)(paramLong - l2) / this.a, 0.0F, 1.0F) * 0.5F; 
    float f = this.h;
    return go0.b((float)(paramLong - l1) / this.i, 0.0F, 1.0F) * f + 1.0F - f;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ra.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */