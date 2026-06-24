public final class jb {
  public final int a;
  
  public final float b;
  
  public jb(int paramInt, float paramFloat) {
    this.a = paramInt;
    this.b = paramFloat;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && jb.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.a == ((jb)paramObject).a && Float.compare(((jb)paramObject).b, this.b) == 0)
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    int i = this.a;
    return Float.floatToIntBits(this.b) + (527 + i) * 31;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */