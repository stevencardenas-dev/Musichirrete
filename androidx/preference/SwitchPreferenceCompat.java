package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import da1;
import jc1;
import nk;

public class SwitchPreferenceCompat extends TwoStatePreference {
  public final nk T = new nk(3, this);
  
  public final String U;
  
  public final String V;
  
  public SwitchPreferenceCompat(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130970044, 0);
  }
  
  public SwitchPreferenceCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, jc1.m, paramInt1, paramInt2);
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
    boolean bool = paramView instanceof SwitchCompat;
    if (bool)
      ((SwitchCompat)paramView).setOnCheckedChangeListener(null); 
    if (paramView instanceof Checkable)
      ((Checkable)paramView).setChecked(this.O); 
    if (bool) {
      SwitchCompat switchCompat = (SwitchCompat)paramView;
      switchCompat.setTextOn(this.U);
      switchCompat.setTextOff(this.V);
      switchCompat.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this.T);
    } 
  }
  
  public final void n(da1 paramda1) {
    super.n(paramda1);
    H(paramda1.s(2131297565));
    G(paramda1.s(16908304));
  }
  
  public final void w(View paramView) {
    v();
    if (!((AccessibilityManager)this.b.getSystemService("accessibility")).isEnabled())
      return; 
    H(paramView.findViewById(2131297565));
    G(paramView.findViewById(16908304));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\preference\SwitchPreferenceCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */