public final class iy1 extends jy1 {
  public final jy1 a;
  
  public iy1(jy1 paramjy1) {
    this.a = paramjy1;
  }
  
  public final Object b(tk0 paramtk0) {
    if (paramtk0.C() == 9) {
      paramtk0.y();
      return null;
    } 
    return this.a.b(paramtk0);
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    if (paramObject == null) {
      paramcl0.o();
      return;
    } 
    this.a.c(paramcl0, paramObject);
  }
  
  public final String toString() {
    StringBuilder stringBuilder = new StringBuilder("NullSafeTypeAdapter[");
    stringBuilder.append(this.a);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\iy1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */