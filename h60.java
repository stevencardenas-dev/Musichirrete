public final class h60 {
  public final long a;
  
  public final long b;
  
  public h60(long paramLong1, long paramLong2) {
    if (paramLong2 == 0L) {
      this.a = 0L;
      this.b = 1L;
      return;
    } 
    this.a = paramLong1;
    this.b = paramLong2;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.a);
    stringBuilder.append("/");
    stringBuilder.append(this.b);
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\h60.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */