import android.app.Notification;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.BackEvent;

public abstract class q0 {
  public static final b11 a(BackEvent paramBackEvent) {
    long l;
    float f1 = paramBackEvent.getTouchX();
    float f3 = paramBackEvent.getTouchY();
    float f2 = paramBackEvent.getProgress();
    int i = paramBackEvent.getSwipeEdge();
    if (Build.VERSION.SDK_INT >= 36) {
      l = paramBackEvent.getFrameTimeMillis();
    } else {
      l = 0L;
    } 
    return new b11(f2, f1, f3, i, l);
  }
  
  public static int b(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    return paramAccessibilityNodeInfo.getChecked();
  }
  
  public static int c(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    return paramAccessibilityNodeInfo.getExpandedState();
  }
  
  public static CharSequence d(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    return paramAccessibilityNodeInfo.getSupplementalDescription();
  }
  
  public static boolean e(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    return paramAccessibilityNodeInfo.isFieldRequired();
  }
  
  public static void f(Notification.Builder paramBuilder) {
    paramBuilder.setShortCriticalText(null);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\q0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */