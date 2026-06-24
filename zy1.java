import java.net.URI;
import java.net.URISyntaxException;

public class zy1 extends jy1 {
  public final Object b(tk0 paramtk0) {
    if (paramtk0.C() == 9) {
      paramtk0.y();
      return null;
    } 
    try {
      String str = paramtk0.A();
      return str.equals("null") ? null : new URI(str);
    } catch (URISyntaxException uRISyntaxException) {
      throw new RuntimeException(uRISyntaxException);
    } 
  }
  
  public final void c(cl0 paramcl0, Object paramObject) {
    paramObject = paramObject;
    if (paramObject == null) {
      paramObject = null;
    } else {
      paramObject = paramObject.toASCIIString();
    } 
    paramcl0.w((String)paramObject);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zy1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */