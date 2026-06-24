import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

public class l30 extends t91 {
  public final e3 A0 = new e3(10, this);
  
  public long B0 = -1L;
  
  public EditText y0;
  
  public CharSequence z0;
  
  public final void J0(View paramView) {
    super.J0(paramView);
    EditText editText = (EditText)paramView.findViewById(16908291);
    this.y0 = editText;
    if (editText != null) {
      editText.requestFocus();
      this.y0.setText(this.z0);
      editText = this.y0;
      editText.setSelection(editText.getText().length());
      ((EditTextPreference)I0()).getClass();
      return;
    } 
    tp.f("Dialog view must contain an EditText with id @android:id/edit");
  }
  
  public final void K0(boolean paramBoolean) {
    if (paramBoolean) {
      String str = this.y0.getText().toString();
      EditTextPreference editTextPreference = (EditTextPreference)I0();
      editTextPreference.getClass();
      editTextPreference.F(str);
    } 
  }
  
  public final void M0() {
    long l = this.B0;
    if (l != -1L && l + 1000L > SystemClock.currentThreadTimeMillis()) {
      EditText editText = this.y0;
      if (editText == null || !editText.isFocused()) {
        this.B0 = -1L;
        return;
      } 
      if (((InputMethodManager)this.y0.getContext().getSystemService("input_method")).showSoftInput((View)this.y0, 0)) {
        this.B0 = -1L;
        return;
      } 
      editText = this.y0;
      e3 e31 = this.A0;
      editText.removeCallbacks(e31);
      this.y0.postDelayed(e31, 50L);
      return;
    } 
  }
  
  public final void f0(Bundle paramBundle) {
    super.f0(paramBundle);
    if (paramBundle == null) {
      this.z0 = ((EditTextPreference)I0()).U;
      return;
    } 
    this.z0 = paramBundle.getCharSequence("EditTextPreferenceDialogFragment.text");
  }
  
  public final void n0(Bundle paramBundle) {
    super.n0(paramBundle);
    paramBundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.z0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\l30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */