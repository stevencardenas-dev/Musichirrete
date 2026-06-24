package in.krosbits.pref;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Html;
import android.text.Spanned;
import android.util.AttributeSet;
import androidx.preference.Preference;
import cc1;
import dd1;
import ws2;

public class HtmlPreference extends Preference {
  public HtmlPreference(Context paramContext) {
    super(paramContext, null);
    F(null);
  }
  
  public HtmlPreference(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    F(paramAttributeSet);
  }
  
  public HtmlPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt, 0);
    F(paramAttributeSet);
  }
  
  public HtmlPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    F(paramAttributeSet);
  }
  
  public final void B(CharSequence paramCharSequence) {
    Spanned spanned;
    CharSequence charSequence = paramCharSequence;
    if (!(paramCharSequence instanceof Spanned))
      spanned = Html.fromHtml(String.valueOf(paramCharSequence)); 
    super.B((CharSequence)spanned);
  }
  
  public final void F(AttributeSet paramAttributeSet) {
    CharSequence charSequence = g();
    if (charSequence != null)
      B((CharSequence)Html.fromHtml(charSequence.toString())); 
    if (paramAttributeSet != null) {
      TypedArray typedArray = this.b.obtainStyledAttributes(paramAttributeSet, cc1.c);
      boolean bool2 = typedArray.getBoolean(1, false);
      boolean bool1 = typedArray.getBoolean(0, false);
      if (bool2 && !ws2.U())
        C(false); 
      if (bool1)
        C(false); 
      dd1.p0(this, typedArray.getString(2));
      typedArray.recycle();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\pref\HtmlPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */