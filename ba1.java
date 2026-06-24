import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;

public final class ba1 {
  public final Context a;
  
  public long b = 0L;
  
  public SharedPreferences c;
  
  public SharedPreferences.Editor d;
  
  public boolean e;
  
  public String f;
  
  public PreferenceScreen g;
  
  public w91 h;
  
  public w91 i;
  
  public w91 j;
  
  public ba1(Context paramContext) {
    this.a = paramContext;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramContext.getPackageName());
    stringBuilder.append("_preferences");
    this.f = stringBuilder.toString();
    this.c = null;
  }
  
  public final SharedPreferences.Editor a() {
    if (this.e) {
      if (this.d == null)
        this.d = b().edit(); 
      return this.d;
    } 
    return b().edit();
  }
  
  public final SharedPreferences b() {
    if (this.c == null) {
      String str = this.f;
      this.c = this.a.getSharedPreferences(str, 0);
    } 
    return this.c;
  }
  
  public final PreferenceScreen c(Context paramContext) {
    PreferenceScreen preferenceScreen;
    this.e = true;
    null = new aa1(paramContext, this);
    XmlResourceParser xmlResourceParser = paramContext.getResources().getXml(2132082690);
    try {
      PreferenceGroup preferenceGroup = null.c(xmlResourceParser);
      xmlResourceParser.close();
      preferenceScreen = (PreferenceScreen)preferenceGroup;
      preferenceScreen.m(this);
      SharedPreferences.Editor editor = this.d;
      if (editor != null)
        editor.apply(); 
      return preferenceScreen;
    } finally {
      preferenceScreen.close();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ba1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */