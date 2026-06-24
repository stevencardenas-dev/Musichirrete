import android.os.LocaleList;
import java.util.Locale;

public final class vo0 {
  public static final vo0 b = new vo0(new wo0(new LocaleList(new Locale[0])));
  
  public final wo0 a;
  
  public vo0(wo0 paramwo0) {
    this.a = paramwo0;
  }
  
  public static vo0 a(String paramString) {
    if (paramString == null || paramString.isEmpty())
      return b; 
    String[] arrayOfString = paramString.split(",", -1);
    int i = arrayOfString.length;
    Locale[] arrayOfLocale = new Locale[i];
    for (byte b = 0; b < i; b++)
      arrayOfLocale[b] = Locale.forLanguageTag(arrayOfString[b]); 
    return new vo0(new wo0(new LocaleList(arrayOfLocale)));
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof vo0) {
      paramObject = ((vo0)paramObject).a;
      if (this.a.equals(paramObject))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    return this.a.a.hashCode();
  }
  
  public final String toString() {
    return this.a.a.toString();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vo0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */