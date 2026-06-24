import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

public final class om1 {
  public Context a;
  
  public String b;
  
  public Intent[] c;
  
  public ComponentName d;
  
  public CharSequence e;
  
  public IconCompat f;
  
  public PersistableBundle g;
  
  public final ShortcutInfo a() {
    ShortcutInfo.Builder builder = new ShortcutInfo.Builder();
    builder = (new ShortcutInfo.Builder(this.a, this.b)).setShortLabel(this.e).setIntents(this.c);
    IconCompat iconCompat = this.f;
    if (iconCompat != null)
      builder.setIcon(iconCompat.f(this.a)); 
    if (!TextUtils.isEmpty(null))
      builder.setLongLabel(null); 
    if (!TextUtils.isEmpty(null))
      builder.setDisabledMessage(null); 
    ComponentName componentName = this.d;
    if (componentName != null)
      builder.setActivity(componentName); 
    builder.setRank(0);
    PersistableBundle persistableBundle = this.g;
    if (persistableBundle != null)
      builder.setExtras(persistableBundle); 
    int i = Build.VERSION.SDK_INT;
    if (i >= 29) {
      builder.setLongLived(false);
    } else {
      if (this.g == null)
        this.g = new PersistableBundle(); 
      this.g.putBoolean("extraLongLived", false);
      builder.setExtras(this.g);
    } 
    if (i >= 33)
      o0.e(builder); 
    return builder.build();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\om1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */