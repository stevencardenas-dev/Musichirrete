public class oy1 extends jy1 {
  public final Object b(tk0 paramtk0) {
    if (paramtk0.C() == 9) {
      paramtk0.y();
      return null;
    } 
    try {
      long l = paramtk0.v();
      return Long.valueOf(l);
    } catch (NumberFormatException numberFormatException) {
      throw new RuntimeException(numberFormatException);
    } 
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    paramObject = paramObject;
    if (paramObject == null) {
      paramcl0.o();
      return;
    } 
    paramcl0.u(paramObject.longValue());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\oy1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */