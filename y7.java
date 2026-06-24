import android.os.LocaleList;
import android.widget.TextView;

public abstract class y7 {
  public static LocaleList a(String paramString) {
    return LocaleList.forLanguageTags(paramString);
  }
  
  public static void b(TextView paramTextView, LocaleList paramLocaleList) {
    paramTextView.setTextLocales(paramLocaleList);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\y7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */