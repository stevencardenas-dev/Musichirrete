import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Set;

public final class gg2 {
  public final Context a;
  
  public gg2(Context paramContext) {
    this.a = paramContext;
  }
  
  public final Set a() {
    Exception exception;
    /* monitor enter TypeReferenceDotClassExpression{ObjectType{gg2}} */
    try {
      SharedPreferences sharedPreferences = this.a.getSharedPreferences("playcore_split_install_internal", 0);
      HashSet hashSet = new HashSet();
      this();
      Set set2 = sharedPreferences.getStringSet("modules_to_uninstall_if_emulated", hashSet);
      Set set1 = set2;
      if (set2 == null) {
        set1 = new HashSet();
        super();
      } 
    } catch (Exception exception1) {
      HashSet hashSet = new HashSet();
    } finally {}
    /* monitor exit TypeReferenceDotClassExpression{ObjectType{gg2}} */
    return (Set)exception;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\gg2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */