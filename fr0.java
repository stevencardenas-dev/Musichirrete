import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;

public abstract class fr0 {
  public static final if0 a;
  
  static {
    int i = ps1.a;
    Iterator iterator = null;
    try {
      String str = System.getProperty("kotlinx.coroutines.fast.service.loader");
    } catch (SecurityException securityException) {
      securityException = null;
    } 
    if (securityException != null)
      Boolean.parseBoolean((String)securityException); 
    try {
      p4 p4 = new p4();
      super();
      Iterator iterator1 = Arrays.<p4>asList(new p4[] { p4 }).iterator();
      iterator1.getClass();
      Iterator<Iterator> iterator2 = pk1.e0(new aq(new rk1(iterator1))).iterator();
      if (!iterator2.hasNext()) {
        iterator1 = iterator;
      } else {
        iterator1 = iterator2.next();
        if (iterator2.hasNext()) {
          ((p4)iterator1).getClass();
          do {
            ((p4)iterator2.next()).getClass();
          } while (iterator2.hasNext());
        } 
      } 
      if ((p4)iterator1 != null) {
        Looper looper = Looper.getMainLooper();
        if (looper != null)
          return; 
        return;
      } 
      return;
    } finally {
      securityException = null;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fr0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */