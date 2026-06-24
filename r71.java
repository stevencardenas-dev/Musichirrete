public final class r71 {
  public static final r71 d = new r71(1.0F, 1.0F, 0);
  
  public final float a;
  
  public final float b;
  
  public final int c;
  
  public r71(float paramFloat1, float paramFloat2, int paramInt) {
    boolean bool2 = false;
    if (paramFloat1 > 0.0F) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    n21.h(bool1);
    boolean bool1 = bool2;
    if (paramFloat2 > 0.0F)
      bool1 = true; 
    n21.h(bool1);
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = Math.round(paramFloat1 * 1000.0F);
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && r71.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.a == ((r71)paramObject).a && this.b == ((r71)paramObject).b)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i = Float.floatToRawIntBits(this.a);
    return (Float.floatToRawIntBits(this.b) + (i + 527) * 31) * 31;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\r71.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */