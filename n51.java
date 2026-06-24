import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.pavelsikun.seekbarpreference.lu.FgdLmmRfTxSFKI;

public abstract class n51 {
  public static final String a = qp0.j("PackageManagerHelper");
  
  public static void a(Context paramContext, Class paramClass, boolean paramBoolean) {
    String str2 = "disabled";
    String str3 = a;
    String str4 = FgdLmmRfTxSFKI.JzOoFyEvueFA;
    try {
      String str = paramClass.getName();
      PackageManager packageManager1 = paramContext.getPackageManager();
      ComponentName componentName1 = new ComponentName();
      this(paramContext, str);
      b = packageManager1.getComponentEnabledSetting(componentName1);
      boolean bool = false;
      if (b != 0 && b == 1)
        bool = true; 
      if (paramBoolean == bool) {
        qp0.h().b(str3, str4.concat(paramClass.getName()));
        return;
      } 
    } catch (Exception exception) {}
    PackageManager packageManager = paramContext.getPackageManager();
    ComponentName componentName = new ComponentName();
    this(paramContext, paramClass.getName());
    String str1;
    byte b;
    if (paramBoolean) {
      b = 1;
    } else {
      b = 2;
    } 
    packageManager.setComponentEnabledSetting(componentName, b, 1);
    qp0 qp0 = qp0.h();
    StringBuilder stringBuilder = new StringBuilder();
    this();
    stringBuilder.append(paramClass.getName());
    stringBuilder.append(" ");
    if (paramBoolean) {
      str1 = "enabled";
    } else {
      str1 = "disabled";
    } 
    stringBuilder.append(str1);
    qp0.b(str3, stringBuilder.toString());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */