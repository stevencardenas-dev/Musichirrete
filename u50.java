import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public final class u50 implements TextWatcher {
  public final int b;
  
  public final v50 c;
  
  private final void a(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {}
  
  private final void b(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {}
  
  private final void c(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {}
  
  private final void d(int paramInt1, int paramInt2, int paramInt3, CharSequence paramCharSequence) {}
  
  public final void afterTextChanged(Editable paramEditable) {
    int i = this.b;
    int j = 0;
    boolean bool = false;
    v50 v501 = this.c;
    switch (i) {
      default:
        editText = v501.D0;
        try {
          i = Integer.parseInt(editText.getText().toString().trim());
        } catch (NumberFormatException numberFormatException) {
          numberFormatException.printStackTrace();
          i = 0;
        } 
        if (i < 0)
          i = bool; 
        j = i;
        if (i > 59)
          j = 59; 
        editText.removeTextChangedListener(this);
        if (j > 0) {
          String str = String.valueOf(j);
          editText.setText(str);
          if (str.length() > 0)
            editText.setSelection(str.length()); 
        } 
        editText.addTextChangedListener(this);
        return;
      case 0:
        break;
    } 
    EditText editText = ((v50)editText).E0;
    try {
      i = Integer.parseInt(editText.getText().toString().trim());
    } catch (NumberFormatException numberFormatException) {
      numberFormatException.printStackTrace();
      i = 0;
    } 
    if (i < 0)
      i = j; 
    j = i;
    if (i > 9)
      j = 9; 
    editText.removeTextChangedListener(this);
    if (j > 0) {
      String str = String.valueOf(j);
      editText.setText(str);
      if (str.length() > 0)
        editText.setSelection(str.length()); 
    } 
    editText.addTextChangedListener(this);
  }
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {
    paramInt1 = this.b;
  }
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {
    paramInt1 = this.b;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u50.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */