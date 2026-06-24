import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

public final class z30 implements TransformationMethod {
  public final TransformationMethod b;
  
  public z30(TransformationMethod paramTransformationMethod) {
    this.b = paramTransformationMethod;
  }
  
  public final CharSequence getTransformation(CharSequence paramCharSequence, View paramView) {
    if (paramView.isInEditMode())
      return paramCharSequence; 
    TransformationMethod transformationMethod = this.b;
    CharSequence charSequence = paramCharSequence;
    if (transformationMethod != null)
      charSequence = transformationMethod.getTransformation(paramCharSequence, paramView); 
    if (charSequence == null)
      return charSequence; 
    z51.j();
    throw null;
  }
  
  public final void onFocusChanged(View paramView, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, Rect paramRect) {
    TransformationMethod transformationMethod = this.b;
    if (transformationMethod != null)
      transformationMethod.onFocusChanged(paramView, paramCharSequence, paramBoolean, paramInt, paramRect); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\z30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */