public abstract class jd0 extends yh implements id0, el0, hd0 {
  public final int i;
  
  public jd0(int paramInt1, Class paramClass, String paramString1, String paramString2, int paramInt2) {
    this(paramInt1, xh.b, paramClass, paramString1, paramString2, paramInt2, 0);
  }
  
  public jd0(int paramInt1, Object paramObject, Class paramClass, String paramString1, String paramString2, int paramInt2, int paramInt3) {
    super(paramObject, paramClass, paramString1, paramString2, bool);
    this.i = paramInt1;
  }
  
  public final int b() {
    return this.i;
  }
  
  public final el0 d() {
    ne1.a.getClass();
    return this;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof jd0) {
      paramObject = paramObject;
      if (this.f.equals(((yh)paramObject).f) && this.g.equals(((yh)paramObject).g) && ui0.c(this.c, ((yh)paramObject).c) && e().equals(paramObject.e()))
        return true; 
    } else if (paramObject instanceof jd0) {
      el0 el01 = this.b;
      if (el01 == null) {
        d();
        this.b = this;
        el01 = this;
      } 
      return paramObject.equals(el01);
    } 
    return false;
  }
  
  public final int hashCode() {
    e();
    int i = e().hashCode();
    int j = this.f.hashCode();
    return this.g.hashCode() + (j + i * 31) * 31;
  }
  
  public final String toString() {
    el0 el02 = this.b;
    el0 el01 = el02;
    if (el02 == null) {
      d();
      this.b = this;
      el01 = this;
    } 
    if (el01 != this)
      return el01.toString(); 
    String str = this.f;
    return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : x41.w("function ", str, " (Kotlin reflection is not available)");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jd0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */