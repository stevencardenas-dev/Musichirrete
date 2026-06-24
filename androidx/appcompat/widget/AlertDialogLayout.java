package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import dn0;
import en0;
import java.util.WeakHashMap;
import v22;

public class AlertDialogLayout extends en0 {
  public AlertDialogLayout(Context paramContext) {
    super(paramContext, null, 0);
  }
  
  public AlertDialogLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet, 0);
  }
  
  public static int b(View paramView) {
    WeakHashMap weakHashMap = v22.a;
    int i = paramView.getMinimumHeight();
    if (i > 0)
      return i; 
    if (paramView instanceof ViewGroup) {
      ViewGroup viewGroup = (ViewGroup)paramView;
      if (viewGroup.getChildCount() == 1)
        return b(viewGroup.getChildAt(0)); 
    } 
    return 0;
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = getPaddingLeft();
    int i1 = paramInt3 - paramInt1;
    int j = getPaddingRight();
    int m = getPaddingRight();
    paramInt1 = getMeasuredHeight();
    int n = getChildCount();
    int k = getGravity();
    paramInt3 = k & 0x70;
    if (paramInt3 != 16) {
      if (paramInt3 != 80) {
        paramInt1 = getPaddingTop();
      } else {
        paramInt1 = getPaddingTop() + paramInt4 - paramInt2 - paramInt1;
      } 
    } else {
      paramInt3 = getPaddingTop();
      paramInt1 = (paramInt4 - paramInt2 - paramInt1) / 2 + paramInt3;
    } 
    Drawable drawable = getDividerDrawable();
    paramInt3 = 0;
    if (drawable == null) {
      paramInt2 = 0;
    } else {
      paramInt2 = drawable.getIntrinsicHeight();
    } 
    while (paramInt3 < n) {
      View view = getChildAt(paramInt3);
      paramInt4 = paramInt1;
      if (view != null) {
        paramInt4 = paramInt1;
        if (view.getVisibility() != 8) {
          int i4 = view.getMeasuredWidth();
          int i3 = view.getMeasuredHeight();
          dn0 dn0 = (dn0)view.getLayoutParams();
          int i2 = ((LinearLayout.LayoutParams)dn0).gravity;
          paramInt4 = i2;
          if (i2 < 0)
            paramInt4 = k & 0x800007; 
          paramInt4 = Gravity.getAbsoluteGravity(paramInt4, getLayoutDirection()) & 0x7;
          if (paramInt4 != 1) {
            if (paramInt4 != 5) {
              paramInt4 = ((LinearLayout.LayoutParams)dn0).leftMargin + i;
            } else {
              i2 = i1 - j - i4;
              paramInt4 = ((LinearLayout.LayoutParams)dn0).rightMargin;
              paramInt4 = i2 - paramInt4;
            } 
          } else {
            i2 = (i1 - i - m - i4) / 2 + i + ((LinearLayout.LayoutParams)dn0).leftMargin;
            paramInt4 = ((LinearLayout.LayoutParams)dn0).rightMargin;
            paramInt4 = i2 - paramInt4;
          } 
          i2 = paramInt1;
          if (hasDividerBeforeChildAt(paramInt3))
            i2 = paramInt1 + paramInt2; 
          paramInt1 = i2 + ((LinearLayout.LayoutParams)dn0).topMargin;
          view.layout(paramInt4, paramInt1, i4 + paramInt4, paramInt1 + i3);
          paramInt4 = i3 + ((LinearLayout.LayoutParams)dn0).bottomMargin + paramInt1;
        } 
      } 
      paramInt3++;
      paramInt1 = paramInt4;
    } 
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    byte b;
    int i1;
    int i4 = getChildCount();
    View view3 = null;
    View view2 = null;
    View view1 = null;
    int i;
    for (i = 0; i < i4; i++) {
      View view = getChildAt(i);
      if (view.getVisibility() != 8) {
        j = view.getId();
        if (j == 2131297661) {
          view3 = view;
        } else if (j == 2131296483) {
          view2 = view;
        } else {
          if ((j != 2131296598 && j != 2131296622) || view1 != null) {
            super.onMeasure(paramInt1, paramInt2);
            return;
          } 
          view1 = view;
        } 
      } 
    } 
    int i6 = View.MeasureSpec.getMode(paramInt2);
    int n = View.MeasureSpec.getSize(paramInt2);
    int i5 = View.MeasureSpec.getMode(paramInt1);
    i = getPaddingTop();
    int k = getPaddingBottom() + i;
    if (view3 != null) {
      view3.measure(paramInt1, 0);
      k += view3.getMeasuredHeight();
      j = View.combineMeasuredStates(0, view3.getMeasuredState());
    } else {
      j = 0;
    } 
    if (view2 != null) {
      view2.measure(paramInt1, 0);
      i = b(view2);
      i1 = view2.getMeasuredHeight() - i;
      k += i;
      j = View.combineMeasuredStates(j, view2.getMeasuredState());
    } else {
      i = 0;
      i1 = 0;
    } 
    if (view1 != null) {
      int i7;
      if (i6 == 0) {
        i7 = 0;
      } else {
        i7 = View.MeasureSpec.makeMeasureSpec(Math.max(0, n - k), i6);
      } 
      view1.measure(paramInt1, i7);
      b = view1.getMeasuredHeight();
      k += b;
      j = View.combineMeasuredStates(j, view1.getMeasuredState());
    } else {
      b = 0;
    } 
    int i3 = n - k;
    n = j;
    int i2 = i3;
    int m = k;
    if (view2 != null) {
      i1 = Math.min(i3, i1);
      n = i3;
      m = i;
      if (i1 > 0) {
        n = i3 - i1;
        m = i + i1;
      } 
      view2.measure(paramInt1, View.MeasureSpec.makeMeasureSpec(m, 1073741824));
      m = k - i + view2.getMeasuredHeight();
      i = View.combineMeasuredStates(j, view2.getMeasuredState());
      i2 = n;
      n = i;
    } 
    int j = n;
    i = m;
    if (view1 != null) {
      j = n;
      i = m;
      if (i2 > 0) {
        view1.measure(paramInt1, View.MeasureSpec.makeMeasureSpec(b + i2, i6));
        i = m - b + view1.getMeasuredHeight();
        j = View.combineMeasuredStates(n, view1.getMeasuredState());
      } 
    } 
    n = 0;
    for (k = 0; n < i4; k = m) {
      View view = getChildAt(n);
      m = k;
      if (view.getVisibility() != 8)
        m = Math.max(k, view.getMeasuredWidth()); 
      n++;
    } 
    m = getPaddingLeft();
    setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + m + k, paramInt1, j), View.resolveSizeAndState(i, paramInt2, 0));
    if (i5 != 1073741824) {
      i = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
      for (paramInt1 = 0; paramInt1 < i4; paramInt1++) {
        view1 = getChildAt(paramInt1);
        if (view1.getVisibility() != 8) {
          dn0 dn0 = (dn0)view1.getLayoutParams();
          if (((LinearLayout.LayoutParams)dn0).width == -1) {
            j = ((LinearLayout.LayoutParams)dn0).height;
            ((LinearLayout.LayoutParams)dn0).height = view1.getMeasuredHeight();
            measureChildWithMargins(view1, i, 0, paramInt2, 0);
            ((LinearLayout.LayoutParams)dn0).height = j;
          } 
        } 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\widget\AlertDialogLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */