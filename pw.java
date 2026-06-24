import java.util.Enumeration;
import java.util.NoSuchElementException;

public final class pw implements Enumeration {
  public final boolean hasMoreElements() {
    return false;
  }
  
  public final Object nextElement() {
    throw new NoSuchElementException("No more elements");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */