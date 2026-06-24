package com.google.android.material.textfield;

import a7;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import g92;
import java.util.Locale;
import qv;
import zb1;

public class TextInputEditText extends a7 {
  public final Rect i = new Rect();
  
  public boolean j;
  
  public TextInputEditText(Context paramContext) {
    this(paramContext, null);
  }
  
  public TextInputEditText(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130969115);
  }
  
  public TextInputEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(qv.n0(paramContext, paramAttributeSet, paramInt, 0), paramAttributeSet, paramInt);
    TypedArray typedArray = g92.S(paramContext, paramAttributeSet, zb1.I, paramInt, 2131952628, new int[0]);
    setTextInputLayoutFocusedRectEnabled(typedArray.getBoolean(0, false));
    typedArray.recycle();
  }
  
  private CharSequence getHintFromLayout() {
    TextInputLayout textInputLayout = getTextInputLayout();
    return (textInputLayout != null) ? textInputLayout.getHint() : null;
  }
  
  private TextInputLayout getTextInputLayout() {
    for (ViewParent viewParent = getParent(); viewParent instanceof android.view.View; viewParent = viewParent.getParent()) {
      if (viewParent instanceof TextInputLayout)
        return (TextInputLayout)viewParent; 
    } 
    return null;
  }
  
  public final void getFocusedRect(Rect paramRect) {
    super.getFocusedRect(paramRect);
    TextInputLayout textInputLayout = getTextInputLayout();
    if (textInputLayout != null && this.j && paramRect != null) {
      Rect rect = this.i;
      textInputLayout.getFocusedRect(rect);
      paramRect.bottom = rect.bottom;
    } 
  }
  
  public final boolean getGlobalVisibleRect(Rect paramRect, Point paramPoint) {
    TextInputLayout textInputLayout = getTextInputLayout();
    if (textInputLayout != null && this.j) {
      boolean bool = textInputLayout.getGlobalVisibleRect(paramRect, paramPoint);
      if (bool && paramPoint != null)
        paramPoint.offset(-getScrollX(), -getScrollY()); 
      return bool;
    } 
    return super.getGlobalVisibleRect(paramRect, paramPoint);
  }
  
  public CharSequence getHint() {
    TextInputLayout textInputLayout = getTextInputLayout();
    return (textInputLayout != null && textInputLayout.H) ? textInputLayout.getHint() : super.getHint();
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    TextInputLayout textInputLayout = getTextInputLayout();
    if (textInputLayout != null && textInputLayout.H && super.getHint() == null) {
      String str = Build.MANUFACTURER;
      if (str != null) {
        str = str.toLowerCase(Locale.ENGLISH);
      } else {
        str = "";
      } 
      if (str.equals("meizu"))
        setHint(""); 
    } 
  }
  
  public final InputConnection onCreateInputConnection(EditorInfo paramEditorInfo) {
    InputConnection inputConnection = super.onCreateInputConnection(paramEditorInfo);
    if (inputConnection != null && paramEditorInfo.hintText == null)
      paramEditorInfo.hintText = getHintFromLayout(); 
    return inputConnection;
  }
  
  public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    getTextInputLayout();
  }
  
  public final boolean requestRectangleOnScreen(Rect paramRect) {
    TextInputLayout textInputLayout = getTextInputLayout();
    if (textInputLayout != null && this.j && paramRect != null) {
      int k = textInputLayout.getHeight();
      int j = getHeight();
      int n = paramRect.left;
      int m = paramRect.top;
      int i = paramRect.right;
      int i1 = paramRect.bottom;
      paramRect = this.i;
      paramRect.set(n, m, i, i1 + k - j);
      return super.requestRectangleOnScreen(paramRect);
    } 
    return super.requestRectangleOnScreen(paramRect);
  }
  
  public void setTextInputLayoutFocusedRectEnabled(boolean paramBoolean) {
    this.j = paramBoolean;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\textfield\TextInputEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */