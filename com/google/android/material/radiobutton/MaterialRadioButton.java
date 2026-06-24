package com.google.android.material.radiobutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatRadioButton;
import g92;
import m92;
import qv;
import wf2;
import zb1;

public class MaterialRadioButton extends AppCompatRadioButton {
  public static final int[][] i = new int[][] { { 16842910, 16842912 }, { 16842910, -16842912 }, { -16842910, 16842912 }, { -16842910, -16842912 } };
  
  public ColorStateList g;
  
  public boolean h;
  
  public MaterialRadioButton(Context paramContext) {
    this(paramContext, null);
  }
  
  public MaterialRadioButton(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130969849);
  }
  
  public MaterialRadioButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(qv.n0(paramContext, paramAttributeSet, paramInt, 2131952876), paramAttributeSet, paramInt);
    paramContext = getContext();
    TypedArray typedArray = g92.S(paramContext, paramAttributeSet, zb1.s, paramInt, 2131952876, new int[0]);
    if (typedArray.hasValue(0))
      setButtonTintList(wf2.u(paramContext, typedArray, 0)); 
    this.h = typedArray.getBoolean(1, false);
    typedArray.recycle();
  }
  
  private ColorStateList getMaterialThemeColorsTintList() {
    if (this.g == null) {
      int j = m92.x((View)this, 2130968899);
      int i = m92.x((View)this, 2130968921);
      int k = m92.x((View)this, 2130968945);
      int m = m92.L(1.0F, k, j);
      j = m92.L(0.54F, k, i);
      int n = m92.L(0.38F, k, i);
      i = m92.L(0.38F, k, i);
      this.g = new ColorStateList(i, new int[] { m, j, n, i });
    } 
    return this.g;
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    if (this.h && getButtonTintList() == null)
      setUseMaterialThemeColors(true); 
  }
  
  public void setUseMaterialThemeColors(boolean paramBoolean) {
    this.h = paramBoolean;
    if (paramBoolean) {
      setButtonTintList(getMaterialThemeColorsTintList());
      return;
    } 
    setButtonTintList(null);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\radiobutton\MaterialRadioButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */