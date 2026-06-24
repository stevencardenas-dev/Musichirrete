import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public final class y30 implements TextWatcher {
  public final EditText b;
  
  public boolean c;
  
  public y30(EditText paramEditText) {
    this.b = paramEditText;
    this.c = true;
  }
  
  public final void afterTextChanged(Editable paramEditable) {}
  
  public final void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {
    this.b.isInEditMode();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\y30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */