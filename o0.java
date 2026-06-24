import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

public abstract class o0 {
  public static PackageInfo a(PackageManager paramPackageManager, Context paramContext) {
    return paramPackageManager.getPackageInfo(paramContext.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
  }
  
  public static Object b(String paramString, Bundle paramBundle) {
    return paramBundle.getParcelable(paramString, e2.class);
  }
  
  public static String c(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    return paramAccessibilityNodeInfo.getUniqueId();
  }
  
  public static boolean d(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    return paramAccessibilityNodeInfo.isTextSelectable();
  }
  
  public static void e(ShortcutInfo.Builder paramBuilder) {
    paramBuilder.setExcludedFromSurfaces(0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\o0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */