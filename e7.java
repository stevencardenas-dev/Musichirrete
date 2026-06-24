import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

public final class e7 extends MultiAutoCompleteTextView {
  public static final int[] f = new int[] { 16843126 };
  
  public final v2 b;
  
  public final b8 c;
  
  public final g7 e;
  
  public e7(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, 2130968650);
    ku1.a(getContext(), (View)this);
    zv0 zv0 = zv0.y(2130968650, 0, getContext(), paramAttributeSet, f);
    if (((TypedArray)zv0.e).hasValue(0))
      setDropDownBackgroundDrawable(zv0.o(0)); 
    zv0.z();
    v2 v21 = new v2((View)this);
    this.b = v21;
    v21.k(paramAttributeSet, 2130968650);
    b8 b81 = new b8((TextView)this);
    this.c = b81;
    b81.f(paramAttributeSet, 2130968650);
    b81.b();
    g7 g71 = new g7((EditText)this, 6);
    this.e = g71;
    g71.A(paramAttributeSet, 2130968650);
    KeyListener keyListener = getKeyListener();
    if (!(keyListener instanceof android.text.method.NumberKeyListener)) {
      boolean bool1 = isFocusable();
      boolean bool3 = isClickable();
      boolean bool2 = isLongClickable();
      int i = getInputType();
      KeyListener keyListener1 = g71.w(keyListener);
      if (keyListener1 != keyListener) {
        super.setKeyListener(keyListener1);
        setRawInputType(i);
        setFocusable(bool1);
        setClickable(bool3);
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
  
  public final InputConnection onCreateInputConnection(EditorInfo paramEditorInfo) {
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


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\e7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */