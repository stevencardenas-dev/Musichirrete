import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

public final class t30 implements InputFilter {
  public final TextView a;
  
  public t30(TextView paramTextView) {
    this.a = paramTextView;
  }
  
  public final CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4) {
    if (this.a.isInEditMode())
      return paramCharSequence; 
    z51.j();
    throw null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\t30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */