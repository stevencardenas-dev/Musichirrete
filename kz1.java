public class kz1 extends jy1 {
  public final Object b(tk0 paramtk0) {
    if (paramtk0.C() == 9) {
      paramtk0.y();
      return null;
    } 
    try {
      int i = paramtk0.u();
      if (i <= 65535 && i >= -32768)
        return Short.valueOf((short)i); 
      StringBuilder stringBuilder = ga1.k(i, "Lossy conversion from ", " to short; at path ");
      stringBuilder.append(paramtk0.m(true));
      throw new RuntimeException(stringBuilder.toString());
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
    paramcl0.u(paramObject.shortValue());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */