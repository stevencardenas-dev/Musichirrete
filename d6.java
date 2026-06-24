import android.app.LocaleManager;
import android.os.LocaleList;

public abstract class d6 {
  public static LocaleList a(Object paramObject) {
    return ((LocaleManager)paramObject).getApplicationLocales();
  }
  
  public static void b(Object paramObject, LocaleList paramLocaleList) {
    ((LocaleManager)paramObject).setApplicationLocales(paramLocaleList);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\d6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */