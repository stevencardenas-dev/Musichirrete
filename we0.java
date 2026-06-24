public class we0 extends uk1 {
  public jy1 a = null;
  
  public final Object b(tk0 paramtk0) {
    jy1 jy11 = this.a;
    if (jy11 != null)
      return jy11.b(paramtk0); 
    tp.f("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    return null;
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    jy1 jy11 = this.a;
    if (jy11 != null) {
      jy11.c(paramcl0, paramObject);
      return;
    } 
    tp.f("Adapter for type with cyclic dependency has been used before dependency has been resolved");
  }
  
  public final jy1 d() {
    jy1 jy11 = this.a;
    if (jy11 != null)
      return jy11; 
    tp.f("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\we0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */