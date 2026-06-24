import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class so1 {
  public static final boolean a;
  
  public static final ro1 b;
  
  public static final ro1 c;
  
  public static final List d;
  
  static {
    boolean bool;
    try {
      Class.forName("java.sql.Date");
      bool = true;
    } catch (ClassNotFoundException classNotFoundException) {
      bool = false;
    } 
    a = bool;
    if (bool) {
      b = new ro1(0, Date.class);
      c = new ro1(1, Timestamp.class);
      d = Collections.unmodifiableList(Arrays.asList((Object[])new ky1[] { oo1.b, no1.b, qo1.b }));
    } else {
      b = null;
      c = null;
      d = Collections.EMPTY_LIST;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\so1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */