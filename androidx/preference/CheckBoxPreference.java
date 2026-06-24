package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import da1;
import dd1;
import jc1;
import nk;

public class CheckBoxPreference extends TwoStatePreference {
  public final nk T = new nk(0, this);
  
  public CheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, dd1.x(paramContext, 2130968817, 16842895), 0);
  }
  
  public CheckBoxPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, jc1.b, paramInt1, paramInt2);
    String str2 = typedArray.getString(5);
    String str1 = str2;
    if (str2 == null)
      str1 = typedArray.getString(0); 
    this.P = str1;
    if (this.O)
      j(); 
    str2 = typedArray.getString(4);
    str1 = str2;
    if (str2 == null)
      str1 = typedArray.getString(1); 
    this.Q = str1;
    if (!this.O)
      j(); 
    this.S = typedArray.getBoolean(3, typedArray.getBoolean(2, false));
    typedArray.recycle();
  }
  
  public final void H(View paramView) {
    boolean bool = paramView instanceof CompoundButton;
    if (bool)
      ((CompoundButton)paramView).setOnCheckedChangeListener(null); 
    if (paramView instanceof Checkable)
      ((Checkable)paramView).setChecked(this.O); 
    if (bool)
      ((CompoundButton)paramView).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this.T); 
  }
  
  public final void n(da1 paramda1) {
    super.n(paramda1);
    H(paramda1.s(16908289));
    G(paramda1.s(16908304));
  }
  
  public final void w(View paramView) {
    v();
    if (!((AccessibilityManager)this.b.getSystemService("accessibility")).isEnabled())
      return; 
    H(paramView.findViewById(16908289));
    G(paramView.findViewById(16908304));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\preference\CheckBoxPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */