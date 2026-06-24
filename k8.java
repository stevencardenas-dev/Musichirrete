import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public final class k8 extends ToggleButton {
  public final v2 b;
  
  public final b8 c;
  
  public b7 e;
  
  public k8(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, 16842827);
    ku1.a(getContext(), (View)this);
    v2 v21 = new v2((View)this);
    this.b = v21;
    v21.k(paramAttributeSet, 16842827);
    b8 b81 = new b8((TextView)this);
    this.c = b81;
    b81.f(paramAttributeSet, 16842827);
    getEmojiTextViewHelper().b(paramAttributeSet, 16842827);
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
  
  public void setAllCaps(boolean paramBoolean) {
    super.setAllCaps(paramBoolean);
    getEmojiTextViewHelper().c(paramBoolean);
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
  
  public final void setCompoundDrawables(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    super.setCompoundDrawables(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    b8 b81 = this.c;
    if (b81 != null)
      b81.b(); 
  }
  
  public final void setCompoundDrawablesRelative(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    super.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    b8 b81 = this.c;
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
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\k8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */