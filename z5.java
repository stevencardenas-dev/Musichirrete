import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;

public final class z5 extends CheckedTextView {
  public final a6 b;
  
  public final v2 c;
  
  public final b8 e;
  
  public b7 f;
  
  public z5(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, 2130968832);
    ku1.a(getContext(), (View)this);
    b8 b81 = new b8((TextView)this);
    this.e = b81;
    b81.f(paramAttributeSet, 2130968832);
    b81.b();
    v2 v21 = new v2((View)this);
    this.c = v21;
    v21.k(paramAttributeSet, 2130968832);
    this.b = new a6((TextView)this);
    Context context = getContext();
    int[] arrayOfInt = nc1.l;
    zv0 zv0 = zv0.y(2130968832, 0, context, paramAttributeSet, arrayOfInt);
    TypedArray typedArray = (TypedArray)zv0.e;
    v22.m((View)this, getContext(), arrayOfInt, paramAttributeSet, (TypedArray)zv0.e, 2130968832);
    try {
      if (typedArray.hasValue(1)) {
        int i = typedArray.getResourceId(1, 0);
        if (i != 0)
          try {
            setCheckMarkDrawable(ws2.I(getContext(), i));
            if (typedArray.hasValue(2))
              setCheckMarkTintList(zv0.n(2)); 
            if (typedArray.hasValue(3))
              setCheckMarkTintMode(l10.c(typedArray.getInt(3, -1), null)); 
            zv0.z();
            getEmojiTextViewHelper().b(paramAttributeSet, 2130968832);
            return;
          } catch (android.content.res.Resources.NotFoundException notFoundException) {} 
      } 
    } finally {}
    if (typedArray.hasValue(0)) {
      int i = typedArray.getResourceId(0, 0);
      if (i != 0)
        setCheckMarkDrawable(ws2.I(getContext(), i)); 
    } 
    if (typedArray.hasValue(2))
      setCheckMarkTintList(zv0.n(2)); 
    if (typedArray.hasValue(3))
      setCheckMarkTintMode(l10.c(typedArray.getInt(3, -1), null)); 
    zv0.z();
    getEmojiTextViewHelper().b(paramAttributeSet, 2130968832);
  }
  
  private b7 getEmojiTextViewHelper() {
    if (this.f == null)
      this.f = new b7((TextView)this); 
    return this.f;
  }
  
  public final void drawableStateChanged() {
    super.drawableStateChanged();
    b8 b81 = this.e;
    if (b81 != null)
      b81.b(); 
    v2 v21 = this.c;
    if (v21 != null)
      v21.a(); 
    a6 a61 = this.b;
    if (a61 != null)
      a61.b(); 
  }
  
  public ActionMode.Callback getCustomSelectionActionModeCallback() {
    return wf2.l0(super.getCustomSelectionActionModeCallback());
  }
  
  public ColorStateList getSupportBackgroundTintList() {
    v2 v21 = this.c;
    return (v21 != null) ? v21.h() : null;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    v2 v21 = this.c;
    return (v21 != null) ? v21.i() : null;
  }
  
  public ColorStateList getSupportCheckMarkTintList() {
    a6 a61 = this.b;
    return (a61 != null) ? a61.a : null;
  }
  
  public PorterDuff.Mode getSupportCheckMarkTintMode() {
    a6 a61 = this.b;
    return (a61 != null) ? a61.b : null;
  }
  
  public ColorStateList getSupportCompoundDrawablesTintList() {
    return this.e.d();
  }
  
  public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
    return this.e.e();
  }
  
  public final InputConnection onCreateInputConnection(EditorInfo paramEditorInfo) {
    InputConnection inputConnection = super.onCreateInputConnection(paramEditorInfo);
    zo2.H(paramEditorInfo, inputConnection, (TextView)this);
    return inputConnection;
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
  
  public void setCheckMarkDrawable(int paramInt) {
    setCheckMarkDrawable(ws2.I(getContext(), paramInt));
  }
  
  public void setCheckMarkDrawable(Drawable paramDrawable) {
    super.setCheckMarkDrawable(paramDrawable);
    a6 a61 = this.b;
    if (a61 != null) {
      if (a61.e) {
        a61.e = false;
        return;
      } 
      a61.e = true;
      a61.b();
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
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback) {
    super.setCustomSelectionActionModeCallback(wf2.p0(paramCallback, (TextView)this));
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean) {
    getEmojiTextViewHelper().d(paramBoolean);
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
  
  public void setSupportCheckMarkTintList(ColorStateList paramColorStateList) {
    a6 a61 = this.b;
    if (a61 != null) {
      a61.a = paramColorStateList;
      a61.c = true;
      a61.b();
    } 
  }
  
  public void setSupportCheckMarkTintMode(PorterDuff.Mode paramMode) {
    a6 a61 = this.b;
    if (a61 != null) {
      a61.b = paramMode;
      a61.d = true;
      a61.b();
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
  
  public final void setTextAppearance(Context paramContext, int paramInt) {
    super.setTextAppearance(paramContext, paramInt);
    b8 b81 = this.e;
    if (b81 != null)
      b81.g(paramContext, paramInt); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\z5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */