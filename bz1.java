import java.util.UUID;

public class bz1 extends jy1 {
  public final Object b(tk0 paramtk0) {
    if (paramtk0.C() == 9) {
      paramtk0.y();
      return null;
    } 
    String str = paramtk0.A();
    try {
      return UUID.fromString(str);
    } catch (IllegalArgumentException illegalArgumentException) {
      StringBuilder stringBuilder = x41.q("Failed parsing '", str, "' as UUID; at path ");
      stringBuilder.append(paramtk0.m(true));
      throw new RuntimeException(stringBuilder.toString(), illegalArgumentException);
    } 
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    paramObject = paramObject;
    if (paramObject == null) {
      paramObject = null;
    } else {
      paramObject = paramObject.toString();
    } 
    paramcl0.w((String)paramObject);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */