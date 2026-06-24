package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;
import b8;
import g7;
import ku1;
import v2;
import wf2;
import ws2;
import zo2;
import zv0;

public class AppCompatAutoCompleteTextView extends AutoCompleteTextView {
  public static final int[] f = new int[] { 16843126 };
  
  public final v2 b;
  
  public final b8 c;
  
  public final g7 e;
  
  public AppCompatAutoCompleteTextView(Context paramContext) {
    this(paramContext, null);
  }
  
  public AppCompatAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130968650);
  }
  
  public AppCompatAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    ku1.a(getContext(), (View)this);
    zv0 zv0 = zv0.y(paramInt, 0, getContext(), paramAttributeSet, f);
    if (((TypedArray)zv0.e).hasValue(0))
      setDropDownBackgroundDrawable(zv0.o(0)); 
    zv0.z();
    v2 v21 = new v2((View)this);
    this.b = v21;
    v21.k(paramAttributeSet, paramInt);
    b8 b81 = new b8((TextView)this);
    this.c = b81;
    b81.f(paramAttributeSet, paramInt);
    b81.b();
    g7 g71 = new g7((EditText)this, 6);
    this.e = g71;
    g71.A(paramAttributeSet, paramInt);
    KeyListener keyListener = getKeyListener();
    if (!(keyListener instanceof android.text.method.NumberKeyListener)) {
      boolean bool3 = isFocusable();
      boolean bool1 = isClickable();
      boolean bool2 = isLongClickable();
      paramInt = getInputType();
      KeyListener keyListener1 = g71.w(keyListener);
      if (keyListener1 != keyListener) {
        super.setKeyListener(keyListener1);
        setRawInputType(paramInt);
        setFocusable(bool3);
        setClickable(bool1);
        setLongClickable(bool2);
      } 
    } 
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
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo) {
    InputConnection inputConnection = super.onCreateInputConnection(paramEditorInfo);
    zo2.H(paramEditorInfo, inputConnection, (TextView)this);
    return (InputConnection)this.e.C(inputConnection);
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
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback) {
    super.setCustomSelectionActionModeCallback(wf2.p0(paramCallback, (TextView)this));
  }
  
  public void setDropDownBackgroundResource(int paramInt) {
    setDropDownBackgroundDrawable(ws2.I(getContext(), paramInt));
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean) {
    this.e.H(paramBoolean);
  }
  
  public void setKeyListener(KeyListener paramKeyListener) {
    super.setKeyListener(this.e.w(paramKeyListener));
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
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\widget\AppCompatAutoCompleteTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */