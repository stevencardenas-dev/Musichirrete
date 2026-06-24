public final class cb1 implements l12 {
  public boolean a = false;
  
  public boolean b = false;
  
  public v70 c;
  
  public final bb1 d;
  
  public cb1(bb1 parambb1) {
    this.d = parambb1;
  }
  
  public final l12 b(String paramString) {
    if (!this.a) {
      this.a = true;
      v70 v701 = this.c;
      boolean bool = this.b;
      this.d.e(v701, paramString, bool);
      return this;
    } 
    throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
  }
  
  public final l12 c(boolean paramBoolean) {
    if (!this.a) {
      this.a = true;
      v70 v701 = this.c;
      boolean bool = this.b;
      this.d.b(v701, paramBoolean, bool);
      return this;
    } 
    throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\cb1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */