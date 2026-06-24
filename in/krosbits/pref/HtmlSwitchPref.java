package in.krosbits.pref;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Html;
import android.text.Spanned;
import android.util.AttributeSet;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import cc1;
import dd1;
import ws2;

public class HtmlSwitchPref extends SwitchPreferenceCompat {
  public HtmlSwitchPref(Context paramContext) {
    super(paramContext, null);
    I(null);
  }
  
  public HtmlSwitchPref(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    I(paramAttributeSet);
  }
  
  public HtmlSwitchPref(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt, 0);
    I(paramAttributeSet);
  }
  
  public HtmlSwitchPref(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    I(paramAttributeSet);
  }
  
  public final void B(CharSequence paramCharSequence) {
    Spanned spanned;
    CharSequence charSequence = paramCharSequence;
    if (!(paramCharSequence instanceof Spanned))
      spanned = Html.fromHtml(String.valueOf(paramCharSequence)); 
    super.B((CharSequence)spanned);
  }
  
  public final void I(AttributeSet paramAttributeSet) {
    CharSequence charSequence = g();
    if (charSequence != null)
      B((CharSequence)Html.fromHtml(charSequence.toString())); 
    if (paramAttributeSet != null) {
      TypedArray typedArray = ((Preference)this).b.obtainStyledAttributes(paramAttributeSet, cc1.c);
      boolean bool1 = typedArray.getBoolean(1, false);
      boolean bool2 = typedArray.getBoolean(0, false);
      if (bool1 && !ws2.U())
        C(false); 
      if (bool2)
        C(false); 
      dd1.p0((Preference)this, typedArray.getString(2));
      typedArray.recycle();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\pref\HtmlSwitchPref.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */