import android.content.res.Configuration;
import android.os.LocaleList;

public abstract class l6 {
  public static void a(Configuration paramConfiguration1, Configuration paramConfiguration2, Configuration paramConfiguration3) {
    LocaleList localeList1 = paramConfiguration1.getLocales();
    LocaleList localeList2 = paramConfiguration2.getLocales();
    if (!localeList1.equals(localeList2)) {
      paramConfiguration3.setLocales(localeList2);
      paramConfiguration3.locale = paramConfiguration2.locale;
    } 
  }
  
  public static vo0 b(Configuration paramConfiguration) {
    return vo0.a(paramConfiguration.getLocales().toLanguageTags());
  }
  
  public static void c(vo0 paramvo0) {
    LocaleList.setDefault(LocaleList.forLanguageTags(paramvo0.a.a.toLanguageTags()));
  }
  
  public static void d(Configuration paramConfiguration, vo0 paramvo0) {
    paramConfiguration.setLocales(LocaleList.forLanguageTags(paramvo0.a.a.toLanguageTags()));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\l6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */