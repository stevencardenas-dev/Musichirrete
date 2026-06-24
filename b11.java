public final class b11 {
  public final int a;
  
  public final float b;
  
  public final float c;
  
  public final float d;
  
  public final long e;
  
  public b11(float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, long paramLong) {
    this.a = paramInt;
    this.b = paramFloat1;
    this.c = paramFloat2;
    this.d = paramFloat3;
    this.e = paramLong;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject != null && b11.class == paramObject.getClass()) {
      paramObject = paramObject;
      if (this.c == ((b11)paramObject).c && this.d == ((b11)paramObject).d && this.b == ((b11)paramObject).b)
        return (this.a != ((b11)paramObject).a) ? false : (!(this.e != ((b11)paramObject).e)); 
    } 
    return false;
  }
  
  public final int hashCode() {
    int j = Float.hashCode(this.c);
    int k = Float.hashCode(this.d);
    int m = Float.hashCode(this.b);
    int i = Integer.hashCode(this.a);
    return Long.hashCode(this.e) + (i + (m + (k + j * 31) * 31) * 31) * 31;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("NavigationEvent(touchX=");
    stringBuilder.append(this.c);
    stringBuilder.append(", touchY=");
    stringBuilder.append(this.d);
    stringBuilder.append(", progress=");
    stringBuilder.append(this.b);
    stringBuilder.append(", swipeEdge=");
    stringBuilder.append(this.a);
    stringBuilder.append(", frameTimeMillis=");
    stringBuilder.append(this.e);
    stringBuilder.append(')');
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */