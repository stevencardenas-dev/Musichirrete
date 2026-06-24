import j$.util.DesugarTimeZone;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

public abstract class b12 {
  public static final Pattern a = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
  
  static {
    c12.a(0L, 0L, 0L);
    qh.a("efbbbf");
    qh.a("feff");
    qh.a("fffe");
    qh.a("0000ffff");
    qh.a("ffff0000");
    Charset.forName("UTF-8");
    Charset.forName("ISO-8859-1");
    Charset.forName("UTF-16BE");
    Charset.forName("UTF-16LE");
    Charset.forName("UTF-32BE");
    Charset.forName("UTF-32LE");
    DesugarTimeZone.getTimeZone("GMT");
    try {
      Throwable.class.getDeclaredMethod("addSuppressed", new Class[] { Throwable.class });
    } catch (Exception exception) {}
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */