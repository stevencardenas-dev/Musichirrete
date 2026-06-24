package androidx.appcompat.widget;

import a6;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import b7;
import b8;
import ku1;
import v2;
import ws2;
import zu1;

public class AppCompatCheckBox extends CheckBox implements zu1 {
  public final a6 b;
  
  public final v2 c;
  
  public final b8 e;
  
  public b7 f;
  
  public AppCompatCheckBox(Context paramContext) {
    this(paramContext, null);
  }
  
  public AppCompatCheckBox(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130968821);
  }
  
  public AppCompatCheckBox(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    ku1.a(getContext(), (View)this);
    a6 a61 = new a6((TextView)this);
    this.b = a61;
    a61.c(paramAttributeSet, paramInt);
    v2 v21 = new v2((View)this);
    this.c = v21;
    v21.k(paramAttributeSet, paramInt);
    b8 b81 = new b8((TextView)this);
    this.e = b81;
    b81.f(paramAttributeSet, paramInt);
    getEmojiTextViewHelper().b(paramAttributeSet, paramInt);
  }
  
  private b7 getEmojiTextViewHelper() {
    if (this.f == null)
      this.f = new b7((TextView)this); 
    return this.f;
  }
  
  public final void drawableStateChanged() {
    super.drawableStateChanged();
    v2 v21 = this.c;
    if (v21 != null)
      v21.a(); 
    b8 b81 = this.e;
    if (b81 != null)
      b81.b(); 
  }
  
  public ColorStateList getSupportBackgroundTintList() {
    v2 v21 = this.c;
    return (v21 != null) ? v21.h() : null;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    v2 v21 = this.c;
    return (v21 != null) ? v21.i() : null;
  }
  
  public ColorStateList getSupportButtonTintList() {
    a6 a61 = this.b;
    return (a61 != null) ? a61.a : null;
  }
  
  public PorterDuff.Mode getSupportButtonTintMode() {
    a6 a61 = this.b;
    return (a61 != null) ? a61.b : null;
  }
  
  public ColorStateList getSupportCompoundDrawablesTintList() {
    return this.e.d();
  }
  
  public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
    return this.e.e();
  }
  
  public void setAllCaps(boolean paramBoolean) {
    super.setAllCaps(paramBoolean);
    getEmojiTextViewHelper().c(paramBoolean);
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    super.setBackgroundDrawable(paramDrawable);
    v2 v21 = this.c;
    if (v21 != null)
      v21.m(); 
  }
  
  public void setBackgroundResource(int paramInt) {
    super.setBackgroundResource(paramInt);
    v2 v21 = this.c;
    if (v21 != null)
      v21.n(paramInt); 
  }
  
  public void setButtonDrawable(int paramInt) {
    setButtonDrawable(ws2.I(getContext(), paramInt));
  }
  
  public void setButtonDrawable(Drawable paramDrawable) {
    super.setButtonDrawable(paramDrawable);
    a6 a61 = this.b;
    if (a61 != null) {
      if (a61.e) {
        a61.e = false;
        return;
      } 
      a61.e = true;
      a61.a();
    } 
  }
  
  public final void setCompoundDrawables(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    super.setCompoundDrawables(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    b8 b81 = this.e;
    if (b81 != null)
      b81.b(); 
  }
  
  public final void setCompoundDrawablesRelative(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    super.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    b8 b81 = this.e;
    if (b81 != null)
      b81.b(); 
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean) {
    getEmojiTextViewHelper().d(paramBoolean);
  }
  
  public void setFilters(InputFilter[] paramArrayOfInputFilter) {
    super.setFilters(getEmojiTextViewHelper().a(paramArrayOfInputFilter));
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    v2 v21 = this.c;
    if (v21 != null)
      v21.s(paramColorStateList); 
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    v2 v21 = this.c;
    if (v21 != null)
      v21.t(paramMode); 
  }
  
  public void setSupportButtonTintList(ColorStateList paramColorStateList) {
    a6 a61 = this.b;
    if (a61 != null) {
      a61.a = paramColorStateList;
      a61.c = true;
      a61.a();
    } 
  }
  
  public void setSupportButtonTintMode(PorterDuff.Mode paramMode) {
    a6 a61 = this.b;
    if (a61 != null) {
      a61.b = paramMode;
      a61.d = true;
      a61.a();
    } 
  }
  
  public void setSupportCompoundDrawablesTintList(ColorStateList paramColorStateList) {
    b8 b81 = this.e;
    b81.l(paramColorStateList);
    b81.b();
  }
  
  public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode paramMode) {
    b8 b81 = this.e;
    b81.m(paramMode);
    b81.b();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\widget\AppCompatCheckBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */