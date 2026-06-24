public final class mc2 extends oc2 {
  public final void b(Object paramObject, long paramLong, byte paramByte) {
    if (pc2.g) {
      pc2.c(paramObject, paramLong, paramByte);
      return;
    } 
    pc2.d(paramObject, paramLong, paramByte);
  }
  
  public final boolean d(long paramLong, Object paramObject) {
    return pc2.g ? pc2.n(paramLong, paramObject) : pc2.o(paramLong, paramObject);
  }
  
  public final void e(long paramLong, Object paramObject, boolean paramBoolean) {
    if (pc2.g) {
      pc2.c(paramObject, paramLong, paramBoolean);
      return;
    } 
    pc2.d(paramObject, paramLong, paramBoolean);
  }
  
  public final float f(long paramLong, Object paramObject) {
    return Float.intBitsToFloat(this.a.getInt(paramObject, paramLong));
  }
  
  public final void i(Object paramObject, long paramLong, float paramFloat) {
    int i = Float.floatToIntBits(paramFloat);
    this.a.putInt(paramObject, paramLong, i);
  }
  
  public final double j(long paramLong, Object paramObject) {
    return Double.longBitsToDouble(this.a.getLong(paramObject, paramLong));
  }
  
  public final void l(Object paramObject, long paramLong, double paramDouble) {
    long l = Double.doubleToLongBits(paramDouble);
    this.a.putLong(paramObject, paramLong, l);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mc2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */