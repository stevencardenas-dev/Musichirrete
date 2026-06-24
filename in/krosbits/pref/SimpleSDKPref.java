package in.krosbits.pref;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import androidx.preference.Preference;
import cc1;

public class SimpleSDKPref extends Preference {
  public SimpleSDKPref(Context paramContext) {
    super(paramContext, null);
    F(null);
  }
  
  public SimpleSDKPref(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    F(paramAttributeSet);
  }
  
  public SimpleSDKPref(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt, 0);
    F(paramAttributeSet);
  }
  
  public SimpleSDKPref(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    F(paramAttributeSet);
  }
  
  public final void F(AttributeSet paramAttributeSet) {
    TypedArray typedArray = this.b.obtainStyledAttributes(paramAttributeSet, cc1.d);
    int i = typedArray.getInt(0, 16);
    if (Build.VERSION.SDK_INT < i)
      C(false); 
    typedArray.recycle();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbits\pref\SimpleSDKPref.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */