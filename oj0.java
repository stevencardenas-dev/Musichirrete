import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class oj0 extends HashMap implements Map, nj0, pj0 {
  public static void a(Map paramMap, StringWriter paramStringWriter) {
    if (paramMap == null) {
      paramStringWriter.write("null");
      return;
    } 
    Iterator<Map.Entry> iterator = paramMap.entrySet().iterator();
    paramStringWriter.write(123);
    boolean bool = true;
    while (iterator.hasNext()) {
      if (bool) {
        bool = false;
      } else {
        paramStringWriter.write(44);
      } 
      Map.Entry entry = iterator.next();
      paramStringWriter.write(34);
      paramStringWriter.write(qz1.q(String.valueOf(entry.getKey())));
      paramStringWriter.write(34);
      paramStringWriter.write(58);
      qz1.U(entry.getValue(), paramStringWriter);
    } 
    paramStringWriter.write(125);
  }
  
  public final String c() {
    StringWriter stringWriter = new StringWriter();
    try {
      a(this, stringWriter);
      return stringWriter.toString();
    } catch (IOException iOException) {
      k91.n(iOException);
      return null;
    } 
  }
  
  public final void d(StringWriter paramStringWriter) {
    a(this, paramStringWriter);
  }
  
  public final String toString() {
    return c();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\oj0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */