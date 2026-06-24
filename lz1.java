public class lz1 extends jy1 {
  public final Object b(tk0 paramtk0) {
    if (paramtk0.C() == 9) {
      paramtk0.y();
      return null;
    } 
    try {
      int i = paramtk0.u();
      return Integer.valueOf(i);
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
    paramcl0.u(paramObject.intValue());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */