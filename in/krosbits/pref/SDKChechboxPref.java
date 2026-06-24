package in.krosbits.pref;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import cc1;

public class SDKChechboxPref extends CheckBoxPreference {
  public SDKChechboxPref(Context paramContext) {
    super(paramContext, null);
    I(null);
  }
  
  public SDKChechboxPref(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    I(paramAttributeSet);
  }
  
  public SDKChechboxPref(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt, 0);
    I(paramAttributeSet);
  }
  
  public SDKChechboxPref(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    I(paramAttributeSet);
  }
  
  public final void I(AttributeSet paramAttributeSet) {
    TypedArray typedArray = ((Preference)this).b.obtainStyledAttributes(paramAttributeSet, cc1.d);
    int i = typedArray.getInt(0, 16);
    if (Build.VERSION.SDK_INT < i)
      C(false); 
    typedArray.recycle();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\pref\SDKChechboxPref.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */