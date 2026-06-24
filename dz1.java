import java.util.Locale;
import java.util.StringTokenizer;

public class dz1 extends jy1 {
  public final Object b(tk0 paramtk0) {
    String str1;
    int i = paramtk0.C();
    String str2 = null;
    if (i == 9) {
      paramtk0.y();
      return null;
    } 
    StringTokenizer stringTokenizer = new StringTokenizer(paramtk0.A(), "_");
    if (stringTokenizer.hasMoreElements()) {
      String str = stringTokenizer.nextToken();
    } else {
      paramtk0 = null;
    } 
    if (stringTokenizer.hasMoreElements()) {
      str1 = stringTokenizer.nextToken();
    } else {
      str1 = null;
    } 
    if (stringTokenizer.hasMoreElements())
      str2 = stringTokenizer.nextToken(); 
    return (str1 == null && str2 == null) ? new Locale((String)paramtk0) : ((str2 == null) ? new Locale((String)paramtk0, str1) : new Locale((String)paramtk0, str1, str2));
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


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dz1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */