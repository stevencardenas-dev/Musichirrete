import java.io.Closeable;
import java.io.Flushable;
import java.util.regex.Pattern;

public final class wz implements Flushable, Closeable {
  public static final int b = 0;
  
  static {
    Pattern.compile("[a-z0-9_-]{1,120}");
  }
  
  public final void close() {
    /* monitor enter ThisExpression{ObjectType{wz}} */
    /* monitor exit ThisExpression{ObjectType{wz}} */
  }
  
  public final void flush() {
    /* monitor enter ThisExpression{ObjectType{wz}} */
    /* monitor exit ThisExpression{ObjectType{wz}} */
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */