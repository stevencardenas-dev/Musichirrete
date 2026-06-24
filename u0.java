import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

public class u0 extends AccessibilityNodeProvider {
  public final gh1 a;
  
  public u0(gh1 paramgh1) {
    this.a = paramgh1;
  }
  
  public final AccessibilityNodeInfo createAccessibilityNodeInfo(int paramInt) {
    t0 t0 = this.a.l(paramInt);
    return (t0 == null) ? null : t0.a;
  }
  
  public final List findAccessibilityNodeInfosByText(String paramString, int paramInt) {
    this.a.getClass();
    return null;
  }
  
  public final AccessibilityNodeInfo findFocus(int paramInt) {
    t0 t0 = this.a.m(paramInt);
    return (t0 == null) ? null : t0.a;
  }
  
  public final boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle) {
    return this.a.r(paramInt1, paramInt2, paramBundle);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */