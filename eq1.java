public final class eq1 implements CharSequence {
  public char[] b;
  
  public String c;
  
  public final char charAt(int paramInt) {
    return this.b[paramInt];
  }
  
  public final int length() {
    return this.b.length;
  }
  
  public final CharSequence subSequence(int paramInt1, int paramInt2) {
    return new String(this.b, paramInt1, paramInt2 - paramInt1);
  }
  
  public final String toString() {
    if (this.c == null)
      this.c = new String(this.b); 
    return this.c;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\eq1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */