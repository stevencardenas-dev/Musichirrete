import java.util.HashSet;
import java.util.Set;

public abstract class ca2 {
  public static final Set<Object> a = new HashSet();
  
  public static void a(byte[] paramArrayOfbyte) {
    byte b = 0;
    int i = 0;
    while (b < paramArrayOfbyte.length) {
      i += paramArrayOfbyte[b];
      b += 7;
    } 
    a.add(Integer.valueOf(i));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ca2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */