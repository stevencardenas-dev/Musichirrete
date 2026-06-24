import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

public final class wh0 extends View.AccessibilityDelegate {
  public final xh0 a;
  
  public wh0(xh0 paramxh0) {}
  
  public final void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramView, paramAccessibilityNodeInfo);
    EditText editText = this.a.h.getEditText();
    if (editText != null)
      paramAccessibilityNodeInfo.setLabeledBy((View)editText); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wh0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */