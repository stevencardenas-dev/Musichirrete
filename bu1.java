import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.tabs.xm.VDgS;
import com.google.android.material.textfield.TextInputLayout;

public final class bu1 extends k0 {
  public final TextInputLayout d;
  
  public bu1(TextInputLayout paramTextInputLayout) {
    this.d = paramTextInputLayout;
  }
  
  public final void d(View paramView, t0 paramt0) {
    boolean bool;
    CharSequence charSequence2;
    AccessibilityNodeInfo accessibilityNodeInfo = paramt0.a;
    this.a.onInitializeAccessibilityNodeInfo(paramView, accessibilityNodeInfo);
    TextInputLayout textInputLayout = this.d;
    EditText editText = textInputLayout.getEditText();
    if (editText != null) {
      charSequence2 = (CharSequence)editText.getText();
    } else {
      charSequence2 = null;
    } 
    CharSequence charSequence1 = textInputLayout.getHint();
    CharSequence charSequence4 = textInputLayout.getError();
    CharSequence charSequence3 = textInputLayout.getPlaceholderText();
    int i = textInputLayout.getCounterMaxLength();
    CharSequence charSequence5 = textInputLayout.getCounterOverflowDescription();
    boolean bool2 = TextUtils.isEmpty(charSequence2);
    boolean bool1 = TextUtils.isEmpty(charSequence1);
    boolean bool3 = textInputLayout.x0;
    boolean bool4 = TextUtils.isEmpty(charSequence4);
    if (!bool4 || !TextUtils.isEmpty(charSequence5)) {
      bool = true;
    } else {
      bool = false;
    } 
    if (!bool1) {
      charSequence1 = charSequence1.toString();
    } else {
      charSequence1 = "";
    } 
    ep1 ep1 = textInputLayout.c;
    AppCompatTextView appCompatTextView2 = ep1.c;
    if (appCompatTextView2.getVisibility() == 0) {
      accessibilityNodeInfo.setLabelFor((View)appCompatTextView2);
      accessibilityNodeInfo.setTraversalAfter((View)appCompatTextView2);
    } else {
      accessibilityNodeInfo.setTraversalAfter((View)ep1.f);
    } 
    String str = VDgS.zyZoMpLDiwHT;
    if (!bool2) {
      accessibilityNodeInfo.setText(charSequence2);
    } else if (!TextUtils.isEmpty(charSequence1)) {
      accessibilityNodeInfo.setText(charSequence1);
      if (!bool3 && charSequence3 != null) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)charSequence1);
        stringBuilder.append(str);
        stringBuilder.append(charSequence3);
        accessibilityNodeInfo.setText(stringBuilder.toString());
      } 
    } else if (charSequence3 != null) {
      accessibilityNodeInfo.setText(charSequence3);
    } 
    if (!TextUtils.isEmpty(charSequence1)) {
      if (Build.VERSION.SDK_INT >= 26) {
        paramt0.l((String)charSequence1);
      } else {
        charSequence3 = charSequence1;
        if (!bool2) {
          charSequence3 = new StringBuilder();
          charSequence3.append(charSequence2);
          charSequence3.append(str);
          charSequence3.append((String)charSequence1);
          charSequence3 = charSequence3.toString();
        } 
        accessibilityNodeInfo.setText(charSequence3);
      } 
      paramt0.p(bool2);
    } 
    if (charSequence2 == null || charSequence2.length() != i)
      i = -1; 
    accessibilityNodeInfo.setMaxTextLength(i);
    if (bool) {
      if (!bool4) {
        charSequence1 = charSequence4;
      } else {
        charSequence1 = charSequence5;
      } 
      accessibilityNodeInfo.setError(charSequence1);
    } 
    AppCompatTextView appCompatTextView1 = textInputLayout.m.y;
    if (appCompatTextView1 != null)
      accessibilityNodeInfo.setLabelFor((View)appCompatTextView1); 
    textInputLayout.e.a().m(paramt0);
  }
  
  public final void e(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    super.e(paramView, paramAccessibilityEvent);
    this.d.e.a().n(paramAccessibilityEvent);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bu1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */