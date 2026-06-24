public class qy1 extends jy1 {
  public final Object b(tk0 paramtk0) {
    if (paramtk0.C() == 9) {
      paramtk0.y();
      return null;
    } 
    String str = paramtk0.A();
    if (str.length() == 1)
      return Character.valueOf(str.charAt(0)); 
    StringBuilder stringBuilder = x41.q("Expecting character, got: ", str, "; at ");
    stringBuilder.append(paramtk0.m(true));
    throw new RuntimeException(stringBuilder.toString());
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    paramObject = paramObject;
    if (paramObject == null) {
      paramObject = null;
    } else {
      paramObject = String.valueOf(paramObject);
    } 
    paramcl0.w((String)paramObject);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qy1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */