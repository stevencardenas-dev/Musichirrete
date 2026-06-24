import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public final class f4 implements TransformationMethod {
  public Locale b;
  
  public final CharSequence getTransformation(CharSequence paramCharSequence, View paramView) {
    return (paramCharSequence != null) ? paramCharSequence.toString().toUpperCase(this.b) : null;
  }
  
  public final void onFocusChanged(View paramView, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, Rect paramRect) {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\f4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */