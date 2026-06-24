package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class BaselineLayout extends ViewGroup {
  public int b = -1;
  
  public boolean c;
  
  public BaselineLayout(Context paramContext) {
    super(paramContext, null, 0);
  }
  
  public BaselineLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, 0);
  }
  
  public BaselineLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public int getBaseline() {
    return this.b;
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int j = getChildCount();
    int m = getPaddingLeft();
    int k = getPaddingRight();
    int i = getPaddingTop();
    for (paramInt2 = 0; paramInt2 < j; paramInt2++) {
      View view = getChildAt(paramInt2);
      if (view.getVisibility() != 8) {
        int i2 = view.getMeasuredWidth();
        int i1 = view.getMeasuredHeight();
        int n = (paramInt3 - paramInt1 - k - m - i2) / 2 + m;
        if (this.b != -1 && view.getBaseline() != -1) {
          paramInt4 = this.b + i - view.getBaseline();
        } else {
          paramInt4 = i;
        } 
        view.layout(n, paramInt4, i2 + n, i1 + paramInt4);
      } 
    } 
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    int i3 = getChildCount();
    byte b = 0;
    int n = 0;
    int m = 0;
    int i = m;
    int i1 = i;
    int k = -1;
    int j = -1;
    int i2 = i;
    i = m;
    while (b < i3) {
      View view = getChildAt(b);
      if (view.getVisibility() != 8) {
        measureChild(view, paramInt1, paramInt2);
        int i4 = Math.max(n, view.getMeasuredHeight());
        int i5 = view.getBaseline();
        n = k;
        m = j;
        if (i5 != -1) {
          n = Math.max(k, i5);
          m = Math.max(j, view.getMeasuredHeight() - i5);
        } 
        i2 = Math.max(i2, view.getMeasuredWidth());
        i = Math.max(i, view.getMeasuredHeight());
        i1 = View.combineMeasuredStates(i1, view.getMeasuredState());
        j = m;
        k = n;
        n = i4;
      } 
      b++;
    } 
    m = i;
    if (k != -1) {
      m = i;
      if (this.c)
        m = Math.max(i, Math.max(j, getPaddingBottom()) + k); 
      this.b = k;
    } 
    if (!this.c)
      m = getPaddingBottom() + n; 
    i = Math.max(m, getSuggestedMinimumHeight());
    setMeasuredDimension(View.resolveSizeAndState(Math.max(i2, getSuggestedMinimumWidth()), paramInt1, i1), View.resolveSizeAndState(i, paramInt2, i1 << 16));
  }
  
  public void setMeasurePaddingFromBaseline(boolean paramBoolean) {
    this.c = paramBoolean;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\internal\BaselineLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */