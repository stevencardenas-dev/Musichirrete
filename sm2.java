public final class sm2 extends oc2 {
  public final double a(long paramLong, Object paramObject) {
    return Double.longBitsToDouble(this.a.getLong(paramObject, paramLong));
  }
  
  public final float c(long paramLong, Object paramObject) {
    return Float.intBitsToFloat(this.a.getInt(paramObject, paramLong));
  }
  
  public final void e(long paramLong, Object paramObject, boolean paramBoolean) {
    if (wm2.g) {
      wm2.c(paramObject, paramLong, paramBoolean);
      return;
    } 
    wm2.d(paramObject, paramLong, paramBoolean);
  }
  
  public final void g(Object paramObject, long paramLong, byte paramByte) {
    if (wm2.g) {
      wm2.c(paramObject, paramLong, paramByte);
      return;
    } 
    wm2.d(paramObject, paramLong, paramByte);
  }
  
  public final void h(Object paramObject, long paramLong, double paramDouble) {
    long l = Double.doubleToLongBits(paramDouble);
    this.a.putLong(paramObject, paramLong, l);
  }
  
  public final void k(Object paramObject, long paramLong, float paramFloat) {
    int i = Float.floatToIntBits(paramFloat);
    this.a.putInt(paramObject, paramLong, i);
  }
  
  public final boolean m(long paramLong, Object paramObject) {
    return wm2.g ? wm2.m(paramLong, paramObject) : wm2.n(paramLong, paramObject);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sm2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */