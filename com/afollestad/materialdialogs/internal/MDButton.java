package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import re0;

public class MDButton extends TextView {
  public boolean b = false;
  
  public re0 c;
  
  public final int e;
  
  public Drawable f;
  
  public Drawable g;
  
  public MDButton(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    this.e = paramContext.getResources().getDimensionPixelSize(2131166078);
    this.c = re0.e;
  }
  
  public MDButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    this.e = paramContext.getResources().getDimensionPixelSize(2131166078);
    this.c = re0.e;
  }
  
  public MDButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
    this.e = paramContext.getResources().getDimensionPixelSize(2131166078);
    this.c = re0.e;
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2) {
    if (this.b != paramBoolean1 || paramBoolean2) {
      Drawable drawable;
      if (paramBoolean1) {
        i = this.c.a() | 0x10;
      } else {
        i = 17;
      } 
      setGravity(i);
      int j = 4;
      int i = j;
      if (paramBoolean1) {
        int k = this.c.ordinal();
        i = j;
        if (k != 1)
          if (k != 2) {
            i = 5;
          } else {
            i = 6;
          }  
      } 
      setTextAlignment(i);
      if (paramBoolean1) {
        drawable = this.f;
      } else {
        drawable = this.g;
      } 
      setBackground(drawable);
      if (paramBoolean1) {
        int k = getPaddingTop();
        i = this.e;
        j = getPaddingBottom();
        setPadding(this.e, k, i, j);
      } 
      this.b = paramBoolean1;
      return;
    } 
  }
  
  public void setAllCapsCompat(boolean paramBoolean) {
    setAllCaps(paramBoolean);
  }
  
  public void setDefaultSelector(Drawable paramDrawable) {
    this.g = paramDrawable;
    if (!this.b)
      a(false, true); 
  }
  
  public void setStackedGravity(re0 paramre0) {
    this.c = paramre0;
  }
  
  public void setStackedSelector(Drawable paramDrawable) {
    this.f = paramDrawable;
    if (this.b)
      a(true, true); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\afollestad\materialdialogs\internal\MDButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */