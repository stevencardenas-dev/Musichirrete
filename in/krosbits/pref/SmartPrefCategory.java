package in.krosbits.pref;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Html;
import android.util.AttributeSet;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import cc1;
import ws2;

public class SmartPrefCategory extends PreferenceCategory {
  public SmartPrefCategory(Context paramContext) {
    super(paramContext, null);
    H(null);
  }
  
  public SmartPrefCategory(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    H(paramAttributeSet);
  }
  
  public SmartPrefCategory(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt, 0);
    H(paramAttributeSet);
  }
  
  public SmartPrefCategory(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    H(paramAttributeSet);
  }
  
  public final void H(AttributeSet paramAttributeSet) {
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
      typedArray.recycle();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\pref\SmartPrefCategory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */