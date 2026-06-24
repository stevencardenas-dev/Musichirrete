package in.krosbits.pref;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import cc1;

public class SDKSwitchPref extends SwitchPreferenceCompat {
  public SDKSwitchPref(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    TypedArray typedArray = ((Preference)this).b.obtainStyledAttributes(paramAttributeSet, cc1.d);
    int i = typedArray.getInt(0, 16);
    if (Build.VERSION.SDK_INT < i)
      C(false); 
    typedArray.recycle();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\pref\SDKSwitchPref.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */