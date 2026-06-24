package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import c7;
import fe;
import j;
import k0;
import ok;
import v22;

public class CheckableImageButton extends c7 implements Checkable {
  public static final int[] i = new int[] { 16842912 };
  
  public boolean f;
  
  public boolean g = true;
  
  public boolean h = true;
  
  public CheckableImageButton(Context paramContext) {
    this(paramContext, null);
  }
  
  public CheckableImageButton(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130969329);
  }
  
  public CheckableImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    v22.n((View)this, (k0)new fe(2, this));
  }
  
  public final boolean isChecked() {
    return this.f;
  }
  
  public final int[] onCreateDrawableState(int paramInt) {
    return this.f ? View.mergeDrawableStates(super.onCreateDrawableState(paramInt + 1), i) : super.onCreateDrawableState(paramInt);
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof ok)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    ok ok = (ok)paramParcelable;
    super.onRestoreInstanceState(((j)ok).b);
    setChecked(ok.e);
  }
  
  public final Parcelable onSaveInstanceState() {
    j j = new j(super.onSaveInstanceState());
    ((ok)j).e = this.f;
    return (Parcelable)j;
  }
  
  public void setCheckable(boolean paramBoolean) {
    if (this.g != paramBoolean) {
      this.g = paramBoolean;
      sendAccessibilityEvent(0);
    } 
  }
  
  public void setChecked(boolean paramBoolean) {
    if (this.g && this.f != paramBoolean) {
      this.f = paramBoolean;
      refreshDrawableState();
      sendAccessibilityEvent(2048);
    } 
  }
  
  public void setPressable(boolean paramBoolean) {
    this.h = paramBoolean;
  }
  
  public void setPressed(boolean paramBoolean) {
    if (this.h)
      super.setPressed(paramBoolean); 
  }
  
  public final void toggle() {
    setChecked(this.f ^ true);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\internal\CheckableImageButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */