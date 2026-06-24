import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

public final class au1 implements TextWatcher {
  public int b;
  
  public final EditText c;
  
  public final TextInputLayout e;
  
  public au1(TextInputLayout paramTextInputLayout, EditText paramEditText) {
    this.e = paramTextInputLayout;
    this.c = paramEditText;
    this.b = paramEditText.getLineCount();
  }
  
  public final void afterTextChanged(Editable paramEditable) {
    TextInputLayout textInputLayout = this.e;
    textInputLayout.w(textInputLayout.D0 ^ true, false);
    if (textInputLayout.n)
      textInputLayout.p(paramEditable); 
    if (textInputLayout.v)
      textInputLayout.x(paramEditable); 
    EditText editText = this.c;
    int i = editText.getLineCount();
    int j = this.b;
    if (i != j) {
      if (i < j) {
        j = editText.getMinimumHeight();
        int k = textInputLayout.w0;
        if (j != k)
          editText.setMinimumHeight(k); 
      } 
      this.b = i;
    } 
  }
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\au1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */