package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import b7;
import b8;
import d42;
import j8;
import ku1;
import v2;
import wf2;

public class AppCompatButton extends Button {
  public final v2 b;
  
  public final b8 c;
  
  public b7 e;
  
  public AppCompatButton(Context paramContext) {
    this(paramContext, null);
  }
  
  public AppCompatButton(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130968746);
  }
  
  public AppCompatButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    ku1.a(getContext(), (View)this);
    v2 v21 = new v2((View)this);
    this.b = v21;
    v21.k(paramAttributeSet, paramInt);
    b8 b81 = new b8((TextView)this);
    this.c = b81;
    b81.f(paramAttributeSet, paramInt);
    b81.b();
    getEmojiTextViewHelper().b(paramAttributeSet, paramInt);
  }
  
  private b7 getEmojiTextViewHelper() {
    if (this.e == null)
      this.e = new b7((TextView)this); 
    return this.e;
  }
  
  public final void drawableStateChanged() {
    super.drawableStateChanged();
    v2 v21 = this.b;
    if (v21 != null)
      v21.a(); 
    b8 b81 = this.c;
    if (b81 != null)
      b81.b(); 
  }
  
  public int getAutoSizeMaxTextSize() {
    if (d42.c)
      return super.getAutoSizeMaxTextSize(); 
    b8 b81 = this.c;
    return (b81 != null) ? Math.round(b81.i.e) : -1;
  }
  
  public int getAutoSizeMinTextSize() {
    if (d42.c)
      return super.getAutoSizeMinTextSize(); 
    b8 b81 = this.c;
    return (b81 != null) ? Math.round(b81.i.d) : -1;
  }
  
  public int getAutoSizeStepGranularity() {
    if (d42.c)
      return super.getAutoSizeStepGranularity(); 
    b8 b81 = this.c;
    return (b81 != null) ? Math.round(b81.i.c) : -1;
  }
  
  public int[] getAutoSizeTextAvailableSizes() {
    if (d42.c)
      return super.getAutoSizeTextAvailableSizes(); 
    b8 b81 = this.c;
    return (b81 != null) ? b81.i.f : new int[0];
  }
  
  public int getAutoSizeTextType() {
    if (d42.c)
      return (super.getAutoSizeTextType() == 1) ? 1 : 0; 
    b8 b81 = this.c;
    return (b81 != null) ? b81.i.a : 0;
  }
  
  public ActionMode.Callback getCustomSelectionActionModeCallback() {
    return wf2.l0(super.getCustomSelectionActionModeCallback());
  }
  
  public ColorStateList getSupportBackgroundTintList() {
    v2 v21 = this.b;
    return (v21 != null) ? v21.h() : null;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    v2 v21 = this.b;
    return (v21 != null) ? v21.i() : null;
  }
  
  public ColorStateList getSupportCompoundDrawablesTintList() {
    return this.c.d();
  }
  
  public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
    return this.c.e();
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(Button.class.getName());
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(Button.class.getName());
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    b8 b81 = this.c;
    if (b81 != null && !d42.c)
      b81.i.a(); 
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    b8 b81 = this.c;
    if (b81 != null) {
      j8 j8 = b81.i;
      if (!d42.c && j8.f())
        j8.a(); 
    } 
  }
  
  public void setAllCaps(boolean paramBoolean) {
    super.setAllCaps(paramBoolean);
    getEmojiTextViewHelper().c(paramBoolean);
  }
  
  public final void setAutoSizeTextTypeUniformWithConfiguration(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (d42.c) {
      super.setAutoSizeTextTypeUniformWithConfiguration(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    } 
    b8 b81 = this.c;
    if (b81 != null)
      b81.i(paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] paramArrayOfint, int paramInt) {
    if (d42.c) {
      super.setAutoSizeTextTypeUniformWithPresetSizes(paramArrayOfint, paramInt);
      return;
    } 
    b8 b81 = this.c;
    if (b81 != null)
      b81.j(paramArrayOfint, paramInt); 
  }
  
  public void setAutoSizeTextTypeWithDefaults(int paramInt) {
    if (d42.c) {
      super.setAutoSizeTextTypeWithDefaults(paramInt);
      return;
    } 
    b8 b81 = this.c;
    if (b81 != null)
      b81.k(paramInt); 
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
    v2 v21 = this.b;
    if (v21 != null)
      v21.m(); 
  }
  
  public void setBackgroundResource(int paramInt) {
    super.setBackgroundResource(paramInt);
    v2 v21 = this.b;
    if (v21 != null)
      v21.n(paramInt); 
  }
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback) {
    super.setCustomSelectionActionModeCallback(wf2.p0(paramCallback, (TextView)this));
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean) {
    getEmojiTextViewHelper().d(paramBoolean);
  }
  
  public void setFilters(InputFilter[] paramArrayOfInputFilter) {
    super.setFilters(getEmojiTextViewHelper().a(paramArrayOfInputFilter));
  }
  
  public void setSupportAllCaps(boolean paramBoolean) {
    b8 b81 = this.c;
    if (b81 != null)
      b81.a.setAllCaps(paramBoolean); 
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    v2 v21 = this.b;
    if (v21 != null)
      v21.s(paramColorStateList); 
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    v2 v21 = this.b;
    if (v21 != null)
      v21.t(paramMode); 
  }
  
  public void setSupportCompoundDrawablesTintList(ColorStateList paramColorStateList) {
    b8 b81 = this.c;
    b81.l(paramColorStateList);
    b81.b();
  }
  
  public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode paramMode) {
    b8 b81 = this.c;
    b81.m(paramMode);
    b81.b();
  }
  
  public final void setTextAppearance(Context paramContext, int paramInt) {
    super.setTextAppearance(paramContext, paramInt);
    b8 b81 = this.c;
    if (b81 != null)
      b81.g(paramContext, paramInt); 
  }
  
  public final void setTextSize(int paramInt, float paramFloat) {
    boolean bool = d42.c;
    if (bool) {
      super.setTextSize(paramInt, paramFloat);
      return;
    } 
    b8 b81 = this.c;
    if (b81 != null) {
      j8 j8 = b81.i;
      if (!bool && !j8.f())
        j8.g(paramInt, paramFloat); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\widget\AppCompatButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */