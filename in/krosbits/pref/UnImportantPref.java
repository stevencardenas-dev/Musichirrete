package in.krosbits.pref;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Html;
import android.util.AttributeSet;
import androidx.preference.Preference;
import cc1;

public class UnImportantPref extends Preference {
  public String O;
  
  public UnImportantPref(Context paramContext) {
    super(paramContext, null);
    F(null);
  }
  
  public UnImportantPref(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    F(paramAttributeSet);
  }
  
  public UnImportantPref(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt, 0);
    F(paramAttributeSet);
  }
  
  public UnImportantPref(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    F(paramAttributeSet);
  }
  
  public final void B(CharSequence paramCharSequence) {
    if (paramCharSequence instanceof String) {
      super.B((CharSequence)Html.fromHtml((String)paramCharSequence));
      return;
    } 
    super.B(paramCharSequence);
  }
  
  public final void F(AttributeSet paramAttributeSet) {
    TypedArray typedArray = this.b.obtainStyledAttributes(paramAttributeSet, cc1.j);
    this.O = typedArray.getString(0);
    typedArray.recycle();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\pref\UnImportantPref.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */