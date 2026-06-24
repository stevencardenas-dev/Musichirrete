import android.content.Context;
import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import in.krosbits.musicolet.FolderExcluderActivity;
import java.util.concurrent.Executors;

public final class ip2 implements bw2, y00, ns, o91, j70 {
  public static final ip2 b = (ip2)new Object();
  
  public static final ip2 c = (ip2)new Object();
  
  public static final ip2 e = (ip2)new Object();
  
  public static final ip2 f = (ip2)new Object();
  
  public static final ip2 g = (ip2)new Object();
  
  public static final ip2 h = (ip2)new Object();
  
  public static final ip2 i = (ip2)new Object();
  
  public static final ip2 j = (ip2)new Object();
  
  public static final ip2 k = (ip2)new Object();
  
  public static final ip2 l = (ip2)new Object();
  
  public static final ip2 m = (ip2)new Object();
  
  public static final ip2 n = (ip2)new Object();
  
  public static final ip2 o = (ip2)new Object();
  
  public static final ip2 p = (ip2)new Object();
  
  public static final ip2 q = (ip2)new Object();
  
  public static final ip2 r = (ip2)new Object();
  
  public static final ip2 s = (ip2)new Object();
  
  public static final ip2 t = (ip2)new Object();
  
  public static final ip2 u = (ip2)new Object();
  
  public static ip2 v;
  
  public boolean b(Class<?> paramClass) {
    return pv2.class.isAssignableFrom(paramClass);
  }
  
  public iw2 c(Class<?> paramClass) {
    if (pv2.class.isAssignableFrom(paramClass))
      try {
        return (iw2)pv2.f(paramClass.asSubclass(pv2.class)).i(3, null);
      } catch (Exception exception) {
        k91.m("Unable to get message info for ".concat(paramClass.getName()), exception);
        return null;
      }  
    l0.l("Unsupported message type: ".concat(paramClass.getName()));
    return null;
  }
  
  public void f(Context paramContext, v00 paramv00) {
    if (paramv00 != null && paramContext instanceof FolderExcluderActivity) {
      FolderExcluderActivity folderExcluderActivity = (FolderExcluderActivity)paramContext;
      if (((pc)folderExcluderActivity).D && folderExcluderActivity == FolderExcluderActivity.Y) {
        String str = paramv00.b.toString();
        if (!folderExcluderActivity.S.contains(str)) {
          folderExcluderActivity.S.add(str);
          folderExcluderActivity.R.getAdapter().g();
          folderExcluderActivity.V = true;
        } 
      } 
    } 
  }
  
  public Object get() {
    return new ki1(0, Executors.newSingleThreadExecutor());
  }
  
  public CharSequence j(Preference paramPreference) {
    EditTextPreference editTextPreference = (EditTextPreference)paramPreference;
    return TextUtils.isEmpty(editTextPreference.U) ? ((Preference)editTextPreference).b.getString(2131887013) : editTextPreference.U;
  }
  
  public boolean n(v00 paramv00) {
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ip2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */