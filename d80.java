public final class d80 extends hv {
  public final String h;
  
  public final int i;
  
  public final int j;
  
  public d80(String paramString1, int paramInt1, int paramInt2, String paramString2) {
    super(paramString1);
    this.h = paramString2;
    this.i = paramInt1;
    this.j = paramInt2;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof d80) {
      paramObject = paramObject;
      if (this.b.equals(((hv)paramObject).b) && this.j == ((d80)paramObject).j && this.i == ((d80)paramObject).i)
        return true; 
    } 
    return false;
  }
  
  public final String f(long paramLong) {
    return this.h;
  }
  
  public final int h(long paramLong) {
    return this.i;
  }
  
  public final int hashCode() {
    int i = this.b.hashCode();
    int j = this.j;
    return this.i * 31 + j * 37 + i;
  }
  
  public final int i(long paramLong) {
    return this.i;
  }
  
  public final int k(long paramLong) {
    return this.j;
  }
  
  public final boolean l() {
    return true;
  }
  
  public final long m(long paramLong) {
    return paramLong;
  }
  
  public final long o(long paramLong) {
    return paramLong;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d80.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */