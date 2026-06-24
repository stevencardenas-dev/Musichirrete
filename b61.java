import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;

public final class b61 extends o40 {
  public final int e = 2131231027;
  
  public EditText f;
  
  public final ql g = new ql(5, this);
  
  public b61(n40 paramn40, int paramInt) {
    super(paramn40);
    if (paramInt != 0)
      this.e = paramInt; 
  }
  
  public final void b() {
    p();
  }
  
  public final int c() {
    return 2131887060;
  }
  
  public final int d() {
    return this.e;
  }
  
  public final View.OnClickListener f() {
    return this.g;
  }
  
  public final boolean j() {
    return true;
  }
  
  public final boolean k() {
    boolean bool;
    EditText editText = this.f;
    if (editText != null && editText.getTransformationMethod() instanceof PasswordTransformationMethod) {
      bool = true;
    } else {
      bool = false;
    } 
    return bool ^ true;
  }
  
  public final void l(EditText paramEditText) {
    this.f = paramEditText;
    p();
  }
  
  public final void q() {
    EditText editText = this.f;
    if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224))
      this.f.setTransformationMethod((TransformationMethod)PasswordTransformationMethod.getInstance()); 
  }
  
  public final void r() {
    EditText editText = this.f;
    if (editText != null)
      editText.setTransformationMethod((TransformationMethod)PasswordTransformationMethod.getInstance()); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\b61.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */