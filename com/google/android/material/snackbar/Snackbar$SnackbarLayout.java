package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import ie;

public final class Snackbar$SnackbarLayout extends ie {
  public Snackbar$SnackbarLayout(Context paramContext) {
    super(paramContext, null);
  }
  
  public Snackbar$SnackbarLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    int j = getChildCount();
    paramInt2 = getMeasuredWidth();
    int i = getPaddingLeft();
    int k = getPaddingRight();
    for (paramInt1 = 0; paramInt1 < j; paramInt1++) {
      View view = getChildAt(paramInt1);
      if ((view.getLayoutParams()).width == -1)
        view.measure(View.MeasureSpec.makeMeasureSpec(paramInt2 - i - k, 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824)); 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\snackbar\Snackbar$SnackbarLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */