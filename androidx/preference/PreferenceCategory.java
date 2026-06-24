package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import da1;
import dd1;
import he1;

public class PreferenceCategory extends PreferenceGroup {
  public PreferenceCategory(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, dd1.x(paramContext, 2130969815, 16842892), 0);
  }
  
  public final boolean D() {
    return super.i() ^ true;
  }
  
  public final boolean i() {
    return false;
  }
  
  public final void n(da1 paramda1) {
    super.n(paramda1);
    if (Build.VERSION.SDK_INT >= 28)
      ((he1)paramda1).b.setAccessibilityHeading(true); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\preference\PreferenceCategory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */