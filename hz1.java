public class hz1 extends jy1 {
  public final Object b(tk0 paramtk0) {
    int i = paramtk0.C();
    if (i == 9) {
      paramtk0.y();
      return null;
    } 
    return (i == 6) ? Boolean.valueOf(Boolean.parseBoolean(paramtk0.A())) : Boolean.valueOf(paramtk0.r());
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    Boolean bool = (Boolean)paramObject;
    if (bool == null) {
      paramcl0.o();
    } else {
      String str;
      paramcl0.y();
      paramcl0.a();
      paramObject = paramcl0.b;
      if (bool.booleanValue()) {
        str = "true";
      } else {
        str = "false";
      } 
      paramObject.write(str);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */