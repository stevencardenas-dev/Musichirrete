public class jz1 extends jy1 {
  public final Object b(tk0 paramtk0) {
    if (paramtk0.C() == 9) {
      paramtk0.y();
      return null;
    } 
    try {
      int i = paramtk0.u();
      if (i <= 255 && i >= -128)
        return Byte.valueOf((byte)i); 
      StringBuilder stringBuilder = ga1.k(i, "Lossy conversion from ", " to byte; at path ");
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
    paramcl0.u(paramObject.byteValue());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */