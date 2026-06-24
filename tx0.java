import java.util.ArrayList;

public abstract class tx0 {
  public static final ArrayList a = new ArrayList();
  
  public static String a(String paramString) {
    if (paramString == null)
      return null; 
    int i = paramString.indexOf('/');
    return (i == -1) ? null : paramString.substring(0, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\tx0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */