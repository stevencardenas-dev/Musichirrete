import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

public final class l40 {
  public final n40 a;
  
  public l40(n40 paramn40) {
    this.a = paramn40;
  }
  
  public final void a(TextInputLayout paramTextInputLayout) {
    n40 n401 = this.a;
    vm vm = n401.x;
    if (n401.u == paramTextInputLayout.getEditText())
      return; 
    EditText editText2 = n401.u;
    if (editText2 != null) {
      editText2.removeTextChangedListener(vm);
      if (n401.u.getOnFocusChangeListener() == n401.a().e())
        n401.u.setOnFocusChangeListener(null); 
    } 
    EditText editText1 = paramTextInputLayout.getEditText();
    n401.u = editText1;
    if (editText1 != null)
      editText1.addTextChangedListener(vm); 
    n401.a().l(n401.u);
    n401.i(n401.a());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\l40.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */