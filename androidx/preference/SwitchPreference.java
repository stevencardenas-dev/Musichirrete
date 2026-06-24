package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import da1;
import jc1;
import nk;

public class SwitchPreference extends TwoStatePreference {
  public final nk T = new nk(2, this);
  
  public final String U;
  
  public final String V;
  
  public SwitchPreference(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, i, 0);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, jc1.l, i, 0);
    String str2 = typedArray.getString(7);
    String str1 = str2;
    if (str2 == null)
      str1 = typedArray.getString(0); 
    this.P = str1;
    if (this.O)
      j(); 
    str2 = typedArray.getString(6);
    str1 = str2;
    if (str2 == null)
      str1 = typedArray.getString(1); 
    this.Q = str1;
    if (!this.O)
      j(); 
    str2 = typedArray.getString(9);
    str1 = str2;
    if (str2 == null)
      str1 = typedArray.getString(3); 
    this.U = str1;
    j();
    str2 = typedArray.getString(8);
    str1 = str2;
    if (str2 == null)
      str1 = typedArray.getString(4); 
    this.V = str1;
    j();
    this.S = typedArray.getBoolean(5, typedArray.getBoolean(2, false));
    typedArray.recycle();
  }
  
  public final void H(View paramView) {
    boolean bool = paramView instanceof Switch;
    if (bool)
      ((Switch)paramView).setOnCheckedChangeListener(null); 
    if (paramView instanceof Checkable)
      ((Checkable)paramView).setChecked(this.O); 
    if (bool) {
      Switch switch_ = (Switch)paramView;
      switch_.setTextOn(this.U);
      switch_.setTextOff(this.V);
      switch_.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this.T);
    } 
  }
  
  public final void n(da1 paramda1) {
    super.n(paramda1);
    H(paramda1.s(16908352));
    G(paramda1.s(16908304));
  }
  
  public final void w(View paramView) {
    v();
    if (!((AccessibilityManager)this.b.getSystemService("accessibility")).isEnabled())
      return; 
    H(paramView.findViewById(16908352));
    G(paramView.findViewById(16908304));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\preference\SwitchPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */