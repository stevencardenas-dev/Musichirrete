import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class mj0 extends ArrayList implements nj0, pj0 {
  public static final int b = 0;
  
  public static void e(Collection paramCollection, StringWriter paramStringWriter) {
    if (paramCollection == null) {
      paramStringWriter.write("null");
      return;
    } 
    Iterator<Object> iterator = paramCollection.iterator();
    paramStringWriter.write(91);
    boolean bool = true;
    while (iterator.hasNext()) {
      if (bool) {
        bool = false;
      } else {
        paramStringWriter.write(44);
      } 
      Object object = iterator.next();
      if (object == null) {
        paramStringWriter.write("null");
        continue;
      } 
      qz1.U(object, paramStringWriter);
    } 
    paramStringWriter.write(93);
  }
  
  public final String c() {
    StringWriter stringWriter = new StringWriter();
    try {
      e(this, stringWriter);
      return stringWriter.toString();
    } catch (IOException iOException) {
      k91.n(iOException);
      return null;
    } 
  }
  
  public final void d(StringWriter paramStringWriter) {
    e(this, paramStringWriter);
  }
  
  public final String toString() {
    return c();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\mj0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */