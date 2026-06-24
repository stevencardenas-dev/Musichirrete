import java.text.DateFormatSymbols;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

public abstract class ev {
  public static final AtomicReference a = new AtomicReference();
  
  public static final DateFormatSymbols a(Locale paramLocale) {
    try {
      return (DateFormatSymbols)DateFormatSymbols.class.getMethod("getInstance", new Class[] { Locale.class }).invoke(null, new Object[] { paramLocale });
    } catch (Exception exception) {
      return new DateFormatSymbols(paramLocale);
    } 
  }
  
  public static void b(LinkedHashMap<String, hv> paramLinkedHashMap, String paramString1, String paramString2) {
    try {
      paramLinkedHashMap.put(paramString1, hv.c(paramString2));
    } catch (RuntimeException runtimeException) {}
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ev.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */