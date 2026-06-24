import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class lk0 implements k12 {
  public static final SimpleDateFormat a;
  
  static {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
    a = simpleDateFormat;
    simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
  }
  
  public final void a(Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    ((l12)paramObject2).b(a.format((Date)paramObject1));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\lk0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */