package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import w01;
import z01;

public class BottomNavigationMenuView extends z01 {
  private final int activeItemMaxWidth;
  
  private final int activeItemMinWidth;
  
  private final int inactiveItemMaxWidth;
  
  private final int inactiveItemMinWidth;
  
  private boolean itemHorizontalTranslationEnabled;
  
  private final List<Integer> tempChildWidths = new ArrayList<Integer>();
  
  public BottomNavigationMenuView(Context paramContext) {
    super(paramContext);
    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
    layoutParams.gravity = 17;
    setLayoutParams((ViewGroup.LayoutParams)layoutParams);
    Resources resources = getResources();
    this.inactiveItemMaxWidth = resources.getDimensionPixelSize(2131165347);
    this.inactiveItemMinWidth = resources.getDimensionPixelSize(2131165348);
    this.activeItemMaxWidth = resources.getDimensionPixelSize(2131165341);
    this.activeItemMinWidth = resources.getDimensionPixelSize(2131165342);
  }
  
  public w01 createNavigationBarItemView(Context paramContext) {
    return new BottomNavigationItemView(paramContext);
  }
  
  public boolean isItemHorizontalTranslationEnabled() {
    return this.itemHorizontalTranslationEnabled;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = getChildCount();
    int j = paramInt4 - paramInt2;
    paramInt2 = 0;
    paramInt4 = 0;
    while (paramInt2 < i) {
      View view = getChildAt(paramInt2);
      if (view.getVisibility() != 8) {
        if (getLayoutDirection() == 1) {
          int k = paramInt3 - paramInt1 - paramInt4;
          view.layout(k - view.getMeasuredWidth(), 0, k, j);
        } else {
          view.layout(paramInt4, 0, view.getMeasuredWidth() + paramInt4, j);
        } 
        paramInt4 += view.getMeasuredWidth();
      } 
      paramInt2++;
    } 
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    int k = View.MeasureSpec.getSize(paramInt1);
    paramInt1 = getCurrentVisibleContentItemCount();
    int i1 = getChildCount();
    this.tempChildWidths.clear();
    int i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt2), -2147483648);
    int n = getItemIconGravity();
    paramInt2 = 1;
    int j = 1;
    int i = 0;
    int m = 0;
    if (n == 0) {
      if (isShifting(getLabelVisibilityMode(), paramInt1) && isItemHorizontalTranslationEnabled()) {
        View view = getChildAt(getSelectedItemPosition());
        i = this.activeItemMinWidth;
        paramInt2 = i;
        if (view.getVisibility() != 8) {
          view.measure(View.MeasureSpec.makeMeasureSpec(this.activeItemMaxWidth, -2147483648), i2);
          paramInt2 = Math.max(i, view.getMeasuredWidth());
        } 
        if (view.getVisibility() != 8) {
          i = 1;
        } else {
          i = 0;
        } 
        i = paramInt1 - i;
        n = Math.min(k - this.inactiveItemMinWidth * i, Math.min(paramInt2, this.activeItemMaxWidth));
        paramInt2 = k - n;
        if (i == 0) {
          paramInt1 = j;
        } else {
          paramInt1 = i;
        } 
        int i3 = Math.min(paramInt2 / paramInt1, this.inactiveItemMaxWidth);
        i = paramInt2 - i * i3;
        j = 0;
        while (j < i1) {
          if (getChildAt(j).getVisibility() != 8) {
            if (j == getSelectedItemPosition()) {
              paramInt2 = n;
            } else {
              paramInt2 = i3;
            } 
            paramInt1 = paramInt2;
            k = i;
            if (i > 0) {
              paramInt1 = paramInt2 + 1;
              k = i - 1;
            } 
          } else {
            paramInt1 = 0;
            k = i;
          } 
          this.tempChildWidths.add(Integer.valueOf(paramInt1));
          j++;
          i = k;
        } 
      } else {
        if (paramInt1 != 0)
          paramInt2 = paramInt1; 
        j = Math.min(k / paramInt2, this.activeItemMaxWidth);
        i = k - paramInt1 * j;
        for (paramInt2 = 0; paramInt2 < i1; paramInt2++) {
          if (getChildAt(paramInt2).getVisibility() != 8) {
            if (i > 0) {
              paramInt1 = j + 1;
              i--;
            } else {
              paramInt1 = j;
            } 
          } else {
            paramInt1 = 0;
          } 
          this.tempChildWidths.add(Integer.valueOf(paramInt1));
        } 
      } 
      paramInt1 = 0;
      paramInt2 = 0;
      i = m;
      while (true) {
        k = paramInt2;
        j = paramInt1;
        if (i < i1) {
          View view = getChildAt(i);
          if (view.getVisibility() != 8) {
            view.measure(View.MeasureSpec.makeMeasureSpec(((Integer)this.tempChildWidths.get(i)).intValue(), 1073741824), i2);
            (view.getLayoutParams()).width = view.getMeasuredWidth();
            j = view.getMeasuredWidth();
            paramInt2 = Math.max(paramInt2, view.getMeasuredHeight());
            paramInt1 = j + paramInt1;
          } 
          i++;
          continue;
        } 
        break;
      } 
    } else {
      paramInt2 = paramInt1;
      if (paramInt1 == 0)
        paramInt2 = 1; 
      float f2 = Math.min((paramInt2 + 3) / 10.0F, 0.9F);
      float f1 = k;
      float f3 = paramInt2;
      n = Math.round(f2 * f1 / f3);
      m = Math.round(f1 / f3);
      paramInt2 = 0;
      for (paramInt1 = 0; i < i1; paramInt1 = j) {
        View view = getChildAt(i);
        k = paramInt2;
        j = paramInt1;
        if (view.getVisibility() != 8) {
          view.measure(View.MeasureSpec.makeMeasureSpec(m, -2147483648), i2);
          if (view.getMeasuredWidth() < n)
            view.measure(View.MeasureSpec.makeMeasureSpec(n, 1073741824), i2); 
          k = view.getMeasuredWidth();
          j = Math.max(paramInt1, view.getMeasuredHeight());
          k += paramInt2;
        } 
        i++;
        paramInt2 = k;
      } 
      j = paramInt2;
      k = paramInt1;
    } 
    setMeasuredDimension(j, Math.max(k, getSuggestedMinimumHeight()));
  }
  
  public void setItemHorizontalTranslationEnabled(boolean paramBoolean) {
    this.itemHorizontalTranslationEnabled = paramBoolean;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\bottomnavigation\BottomNavigationMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */