package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import b7;
import b8;
import c8;
import d42;
import d8;
import e8;
import g7;
import gh1;
import i91;
import j8;
import j91;
import java.util.concurrent.Future;
import ku1;
import l0;
import p0;
import sz1;
import v2;
import v7;
import wf2;
import ws2;
import zo2;

public class AppCompatTextView extends TextView {
  public final v2 b;
  
  public final b8 c;
  
  public final g7 e;
  
  public b7 f;
  
  public boolean g = false;
  
  public gh1 h = null;
  
  public Future i;
  
  public AppCompatTextView(Context paramContext) {
    this(paramContext, null);
  }
  
  public AppCompatTextView(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 16842884);
  }
  
  public AppCompatTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    ku1.a(getContext(), (View)this);
    v2 v21 = new v2((View)this);
    this.b = v21;
    v21.k(paramAttributeSet, paramInt);
    b8 b81 = new b8(this);
    this.c = b81;
    b81.f(paramAttributeSet, paramInt);
    b81.b();
    g7 g71 = new g7(7, false);
    g71.c = this;
    this.e = g71;
    getEmojiTextViewHelper().b(paramAttributeSet, paramInt);
  }
  
  private b7 getEmojiTextViewHelper() {
    if (this.f == null)
      this.f = new b7(this); 
    return this.f;
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
      return ((AppCompatTextView)((gh1)getSuperCaller()).c).getAutoSizeMaxTextSize(); 
    b8 b81 = this.c;
    return (b81 != null) ? Math.round(b81.i.e) : -1;
  }
  
  public int getAutoSizeMinTextSize() {
    if (d42.c)
      return ((AppCompatTextView)((gh1)getSuperCaller()).c).getAutoSizeMinTextSize(); 
    b8 b81 = this.c;
    return (b81 != null) ? Math.round(b81.i.d) : -1;
  }
  
  public int getAutoSizeStepGranularity() {
    if (d42.c)
      return ((AppCompatTextView)((gh1)getSuperCaller()).c).getAutoSizeStepGranularity(); 
    b8 b81 = this.c;
    return (b81 != null) ? Math.round(b81.i.c) : -1;
  }
  
  public int[] getAutoSizeTextAvailableSizes() {
    if (d42.c)
      return ((AppCompatTextView)((gh1)getSuperCaller()).c).getAutoSizeTextAvailableSizes(); 
    b8 b81 = this.c;
    return (b81 != null) ? b81.i.f : new int[0];
  }
  
  public int getAutoSizeTextType() {
    if (d42.c) {
      if (((AppCompatTextView)((gh1)getSuperCaller()).c).getAutoSizeTextType() == 1)
        return 1; 
    } else {
      b8 b81 = this.c;
      if (b81 != null)
        return b81.i.a; 
    } 
    return 0;
  }
  
  public ActionMode.Callback getCustomSelectionActionModeCallback() {
    return wf2.l0(super.getCustomSelectionActionModeCallback());
  }
  
  public int getFirstBaselineToTopHeight() {
    return getPaddingTop() - (getPaint().getFontMetricsInt()).top;
  }
  
  public int getLastBaselineToBottomHeight() {
    return getPaddingBottom() + (getPaint().getFontMetricsInt()).bottom;
  }
  
  public c8 getSuperCaller() {
    if (this.h == null) {
      int i = Build.VERSION.SDK_INT;
      if (i >= 34) {
        this.h = (gh1)new e8(this);
      } else if (i >= 28) {
        this.h = (gh1)new d8(this);
      } else if (i >= 26) {
        this.h = new gh1(9, this);
      } 
    } 
    return (c8)this.h;
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
  
  public CharSequence getText() {
    Future future = this.i;
    if (future != null)
      try {
        this.i = null;
        if (future.get() == null) {
          if (Build.VERSION.SDK_INT >= 29)
            throw null; 
          wf2.C(this);
          throw null;
        } 
        ClassCastException classCastException = new ClassCastException();
        this();
        throw classCastException;
      } catch (InterruptedException|java.util.concurrent.ExecutionException interruptedException) {} 
    return super.getText();
  }
  
  public TextClassifier getTextClassifier() {
    if (Build.VERSION.SDK_INT < 28) {
      g7 g71 = this.e;
      if (g71 != null) {
        TextClassifier textClassifier2 = (TextClassifier)g71.e;
        TextClassifier textClassifier1 = textClassifier2;
        if (textClassifier2 == null)
          textClassifier1 = v7.a((TextView)g71.c); 
        return textClassifier1;
      } 
    } 
    return ((AppCompatTextView)((gh1)getSuperCaller()).c).getTextClassifier();
  }
  
  public i91 getTextMetricsParamsCompat() {
    return wf2.C(this);
  }
  
  public final InputConnection onCreateInputConnection(EditorInfo paramEditorInfo) {
    InputConnection inputConnection = super.onCreateInputConnection(paramEditorInfo);
    this.c.getClass();
    b8.h(paramEditorInfo, inputConnection, this);
    zo2.H(paramEditorInfo, inputConnection, this);
    return inputConnection;
  }
  
  public final void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    int i = Build.VERSION.SDK_INT;
    if (i >= 30 && i < 33 && onCheckIsTextEditor())
      ((InputMethodManager)getContext().getSystemService("input_method")).isActive((View)this); 
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    b8 b81 = this.c;
    if (b81 != null && !d42.c)
      b81.i.a(); 
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    Future future = this.i;
    if (future != null)
      try {
        this.i = null;
        if (future.get() == null) {
          if (Build.VERSION.SDK_INT >= 29)
            throw null; 
          wf2.C(this);
          throw null;
        } 
        ClassCastException classCastException = new ClassCastException();
        this();
        throw classCastException;
      } catch (InterruptedException|java.util.concurrent.ExecutionException interruptedException) {} 
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {
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
      ((AppCompatTextView)((gh1)getSuperCaller()).c).setAutoSizeTextTypeUniformWithConfiguration(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    } 
    b8 b81 = this.c;
    if (b81 != null)
      b81.i(paramInt1, paramInt2, paramInt3, paramInt4); 
  }
  
  public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] paramArrayOfint, int paramInt) {
    if (d42.c) {
      ((AppCompatTextView)((gh1)getSuperCaller()).c).setAutoSizeTextTypeUniformWithPresetSizes(paramArrayOfint, paramInt);
      return;
    } 
    b8 b81 = this.c;
    if (b81 != null)
      b81.j(paramArrayOfint, paramInt); 
  }
  
  public void setAutoSizeTextTypeWithDefaults(int paramInt) {
    if (d42.c) {
      ((AppCompatTextView)((gh1)getSuperCaller()).c).setAutoSizeTextTypeWithDefaults(paramInt);
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
  
  public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Drawable drawable1;
    Drawable drawable2;
    Drawable drawable3;
    Context context = getContext();
    Drawable drawable4 = null;
    if (paramInt1 != 0) {
      drawable1 = ws2.I(context, paramInt1);
    } else {
      drawable1 = null;
    } 
    if (paramInt2 != 0) {
      drawable2 = ws2.I(context, paramInt2);
    } else {
      drawable2 = null;
    } 
    if (paramInt3 != 0) {
      drawable3 = ws2.I(context, paramInt3);
    } else {
      drawable3 = null;
    } 
    if (paramInt4 != 0)
      drawable4 = ws2.I(context, paramInt4); 
    setCompoundDrawablesRelativeWithIntrinsicBounds(drawable1, drawable2, drawable3, drawable4);
    b8 b81 = this.c;
    if (b81 != null)
      b81.b(); 
  }
  
  public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    super.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    b8 b81 = this.c;
    if (b81 != null)
      b81.b(); 
  }
  
  public final void setCompoundDrawablesWithIntrinsicBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Drawable drawable1;
    Drawable drawable2;
    Drawable drawable3;
    Context context = getContext();
    Drawable drawable4 = null;
    if (paramInt1 != 0) {
      drawable1 = ws2.I(context, paramInt1);
    } else {
      drawable1 = null;
    } 
    if (paramInt2 != 0) {
      drawable2 = ws2.I(context, paramInt2);
    } else {
      drawable2 = null;
    } 
    if (paramInt3 != 0) {
      drawable3 = ws2.I(context, paramInt3);
    } else {
      drawable3 = null;
    } 
    if (paramInt4 != 0)
      drawable4 = ws2.I(context, paramInt4); 
    setCompoundDrawablesWithIntrinsicBounds(drawable1, drawable2, drawable3, drawable4);
    b8 b81 = this.c;
    if (b81 != null)
      b81.b(); 
  }
  
  public final void setCompoundDrawablesWithIntrinsicBounds(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4) {
    super.setCompoundDrawablesWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    b8 b81 = this.c;
    if (b81 != null)
      b81.b(); 
  }
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback) {
    super.setCustomSelectionActionModeCallback(wf2.p0(paramCallback, this));
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean) {
    getEmojiTextViewHelper().d(paramBoolean);
  }
  
  public void setFilters(InputFilter[] paramArrayOfInputFilter) {
    super.setFilters(getEmojiTextViewHelper().a(paramArrayOfInputFilter));
  }
  
  public void setFirstBaselineToTopHeight(int paramInt) {
    if (Build.VERSION.SDK_INT >= 28) {
      getSuperCaller().h(paramInt);
      return;
    } 
    wf2.c0(this, paramInt);
  }
  
  public void setLastBaselineToBottomHeight(int paramInt) {
    if (Build.VERSION.SDK_INT >= 28) {
      getSuperCaller().b(paramInt);
      return;
    } 
    wf2.d0(this, paramInt);
  }
  
  public void setLineHeight(int paramInt) {
    wf2.e0(this, paramInt);
  }
  
  public final void setLineHeight(int paramInt, float paramFloat) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 34) {
      getSuperCaller().i(paramInt, paramFloat);
      return;
    } 
    if (i >= 34) {
      p0.l(this, paramInt, paramFloat);
      return;
    } 
    wf2.e0(this, Math.round(TypedValue.applyDimension(paramInt, paramFloat, getResources().getDisplayMetrics())));
  }
  
  public void setPrecomputedText(j91 paramj91) {
    if (Build.VERSION.SDK_INT >= 29)
      throw null; 
    wf2.C(this);
    throw null;
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
  
  public void setTextAppearance(Context paramContext, int paramInt) {
    super.setTextAppearance(paramContext, paramInt);
    b8 b81 = this.c;
    if (b81 != null)
      b81.g(paramContext, paramInt); 
  }
  
  public void setTextClassifier(TextClassifier paramTextClassifier) {
    if (Build.VERSION.SDK_INT < 28) {
      g7 g71 = this.e;
      if (g71 != null) {
        g71.e = paramTextClassifier;
        return;
      } 
    } 
    ((AppCompatTextView)((gh1)getSuperCaller()).c).setTextClassifier(paramTextClassifier);
  }
  
  public void setTextFuture(Future<j91> paramFuture) {
    this.i = paramFuture;
    if (paramFuture != null)
      requestLayout(); 
  }
  
  public void setTextMetricsParamsCompat(i91 parami91) {
    TextDirectionHeuristic textDirectionHeuristic2 = parami91.b;
    TextDirectionHeuristic textDirectionHeuristic1 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
    byte b = 1;
    if (textDirectionHeuristic2 != textDirectionHeuristic1) {
      TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
      if (textDirectionHeuristic2 != textDirectionHeuristic)
        if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
          b = 2;
        } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
          b = 3;
        } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
          b = 4;
        } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
          b = 5;
        } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
          b = 6;
        } else if (textDirectionHeuristic2 == textDirectionHeuristic1) {
          b = 7;
        }  
    } 
    setTextDirection(b);
    getPaint().set(parami91.a);
    setBreakStrategy(parami91.c);
    setHyphenationFrequency(parami91.d);
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
  
  public final void setTypeface(Typeface paramTypeface, int paramInt) {
    Typeface typeface;
    if (this.g)
      return; 
    if (paramTypeface != null && paramInt > 0) {
      Context context = getContext();
      typeface = (Typeface)sz1.a;
      if (context != null) {
        Typeface typeface1 = Typeface.create(paramTypeface, paramInt);
      } else {
        l0.l("Context cannot be null");
        return;
      } 
    } else {
      typeface = null;
    } 
    this.g = true;
    if (typeface != null)
      paramTypeface = typeface; 
    try {
      super.setTypeface(paramTypeface, paramInt);
      return;
    } finally {
      this.g = false;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\widget\AppCompatTextView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */