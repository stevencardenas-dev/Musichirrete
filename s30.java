import android.text.Editable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

public final class s30 extends InputConnectionWrapper {
  public final TextView a;
  
  public final hp2 b;
  
  public s30(TextView paramTextView, InputConnection paramInputConnection) {
    super(paramInputConnection, false);
    this.a = paramTextView;
    this.b = (hp2)object;
  }
  
  public final boolean deleteSurroundingText(int paramInt1, int paramInt2) {
    Editable editable = this.a.getEditableText();
    this.b.getClass();
    return (hp2.b(this, editable, paramInt1, paramInt2, false) || super.deleteSurroundingText(paramInt1, paramInt2));
  }
  
  public final boolean deleteSurroundingTextInCodePoints(int paramInt1, int paramInt2) {
    Editable editable = this.a.getEditableText();
    this.b.getClass();
    return (hp2.b(this, editable, paramInt1, paramInt2, true) || super.deleteSurroundingTextInCodePoints(paramInt1, paramInt2));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */