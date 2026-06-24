package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import g5;
import zo2;

public class SnackbarContentLayout extends LinearLayout {
  public TextView b;
  
  public Button c;
  
  public final TimeInterpolator e;
  
  public int f;
  
  public SnackbarContentLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  public SnackbarContentLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    this.e = zo2.Q(paramContext, 2130969699, (TimeInterpolator)g5.b);
  }
  
  public final boolean a(int paramInt1, int paramInt2, int paramInt3) {
    boolean bool;
    if (paramInt1 != getOrientation()) {
      setOrientation(paramInt1);
      bool = true;
    } else {
      bool = false;
    } 
    if (this.b.getPaddingTop() != paramInt2 || this.b.getPaddingBottom() != paramInt3) {
      TextView textView = this.b;
      if (textView.isPaddingRelative()) {
        textView.setPaddingRelative(textView.getPaddingStart(), paramInt2, textView.getPaddingEnd(), paramInt3);
        return true;
      } 
      textView.setPadding(textView.getPaddingLeft(), paramInt2, textView.getPaddingRight(), paramInt3);
      return true;
    } 
    return bool;
  }
  
  public Button getActionView() {
    return this.c;
  }
  
  public TextView getMessageView() {
    return this.b;
  }
  
  public final void onFinishInflate() {
    super.onFinishInflate();
    this.b = (TextView)findViewById(2131297506);
    this.c = (Button)findViewById(2131297505);
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    if (getOrientation() != 1) {
      int i;
      int k = getResources().getDimensionPixelSize(2131165381);
      int j = getResources().getDimensionPixelSize(2131165380);
      Layout layout = this.b.getLayout();
      if (layout != null && layout.getLineCount() > 1) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i && this.f > 0 && this.c.getMeasuredWidth() > this.f) {
        if (a(1, k, k - j)) {
          super.onMeasure(paramInt1, paramInt2);
          return;
        } 
      } else {
        if (i) {
          i = k;
        } else {
          i = j;
        } 
        if (a(0, i, i)) {
          super.onMeasure(paramInt1, paramInt2);
          return;
        } 
      } 
    } 
  }
  
  public void setMaxInlineActionWidth(int paramInt) {
    this.f = paramInt;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\snackbar\SnackbarContentLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */