package com.h6ah4i.android.widget.verticalseekbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import v22;

public class VerticalSeekBarWrapper extends FrameLayout {
  public VerticalSeekBarWrapper(Context paramContext) {
    this(paramContext, null, 0);
  }
  
  public VerticalSeekBarWrapper(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public VerticalSeekBarWrapper(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private VerticalSeekBar getChildSeekBar() {
    VerticalSeekBar verticalSeekBar;
    if (getChildCount() > 0) {
      verticalSeekBar = (VerticalSeekBar)getChildAt(0);
    } else {
      verticalSeekBar = null;
    } 
    return (verticalSeekBar instanceof VerticalSeekBar) ? verticalSeekBar : null;
  }
  
  public final void a(int paramInt1, int paramInt2) {
    VerticalSeekBar verticalSeekBar = getChildSeekBar();
    if (verticalSeekBar != null) {
      float f1;
      boolean bool;
      WeakHashMap weakHashMap = v22.a;
      if (getLayoutDirection() == 0) {
        bool = true;
      } else {
        bool = false;
      } 
      int j = verticalSeekBar.getRotationAngle();
      int k = verticalSeekBar.getMeasuredWidth();
      int i = verticalSeekBar.getMeasuredHeight();
      int i1 = getPaddingLeft();
      int m = getPaddingRight();
      int n = getPaddingTop();
      int i2 = getPaddingBottom();
      float f2 = (Math.max(0, paramInt1 - m + i1) - i) * 0.5F;
      ViewGroup.LayoutParams layoutParams = verticalSeekBar.getLayoutParams();
      paramInt1 = paramInt2 - i2 + n;
      layoutParams.width = Math.max(0, paramInt1);
      layoutParams.height = -2;
      verticalSeekBar.setLayoutParams(layoutParams);
      if (bool) {
        f1 = 0.0F;
      } else {
        f1 = Math.max(0, paramInt1);
      } 
      verticalSeekBar.setPivotX(f1);
      verticalSeekBar.setPivotY(0.0F);
      if (j != 90) {
        if (j == 270) {
          verticalSeekBar.setRotation(270.0F);
          if (bool) {
            verticalSeekBar.setTranslationX(f2);
            verticalSeekBar.setTranslationY(k);
            return;
          } 
          verticalSeekBar.setTranslationX(-(i + f2));
          verticalSeekBar.setTranslationY(0.0F);
          return;
        } 
      } else {
        verticalSeekBar.setRotation(90.0F);
        if (bool) {
          verticalSeekBar.setTranslationX(i + f2);
          verticalSeekBar.setTranslationY(0.0F);
          return;
        } 
        verticalSeekBar.setTranslationX(-f2);
        verticalSeekBar.setTranslationY(k);
      } 
    } 
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    VerticalSeekBar verticalSeekBar = getChildSeekBar();
    int m = View.MeasureSpec.getMode(paramInt1);
    int i = View.MeasureSpec.getMode(paramInt2);
    int k = View.MeasureSpec.getSize(paramInt1);
    int j = View.MeasureSpec.getSize(paramInt2);
    if (verticalSeekBar != null && m != 1073741824) {
      boolean bool;
      int n = getPaddingLeft();
      n = getPaddingRight() + n;
      int i1 = getPaddingTop();
      i1 = getPaddingBottom() + i1;
      k = View.MeasureSpec.makeMeasureSpec(Math.max(0, k - n), m);
      i = View.MeasureSpec.makeMeasureSpec(Math.max(0, j - i1), i);
      VerticalSeekBar verticalSeekBar1 = getChildSeekBar();
      if (verticalSeekBar1 != null) {
        bool = verticalSeekBar1.f();
      } else {
        bool = false;
      } 
      if (bool) {
        verticalSeekBar.measure(i, k);
        j = verticalSeekBar.getMeasuredHeight();
        i = verticalSeekBar.getMeasuredWidth();
      } else {
        verticalSeekBar.measure(k, i);
        j = verticalSeekBar.getMeasuredWidth();
        i = verticalSeekBar.getMeasuredHeight();
      } 
      WeakHashMap weakHashMap = v22.a;
      setMeasuredDimension(View.resolveSizeAndState(j + n, paramInt1, 0), View.resolveSizeAndState(i + i1, paramInt2, 0));
      return;
    } 
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    boolean bool;
    VerticalSeekBar verticalSeekBar1 = getChildSeekBar();
    if (verticalSeekBar1 != null) {
      bool = verticalSeekBar1.f();
    } else {
      bool = false;
    } 
    if (bool) {
      verticalSeekBar1 = getChildSeekBar();
      if (verticalSeekBar1 != null) {
        int i = getPaddingLeft();
        int j = getPaddingRight();
        int k = getPaddingTop();
        verticalSeekBar1.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, paramInt2 - getPaddingBottom() + k), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(0, paramInt1 - j + i), -2147483648));
      } 
      a(paramInt1, paramInt2);
      super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    } 
    VerticalSeekBar verticalSeekBar2 = getChildSeekBar();
    if (verticalSeekBar2 != null) {
      int i = getPaddingLeft();
      int j = getPaddingRight();
      int k = getPaddingTop();
      int m = getPaddingBottom();
      FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)verticalSeekBar2.getLayoutParams();
      layoutParams.width = -2;
      k = paramInt2 - m + k;
      layoutParams.height = Math.max(0, k);
      verticalSeekBar2.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
      verticalSeekBar2.measure(0, 0);
      m = verticalSeekBar2.getMeasuredWidth();
      i = paramInt1 - j + i;
      verticalSeekBar2.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, i), -2147483648), View.MeasureSpec.makeMeasureSpec(Math.max(0, k), 1073741824));
      layoutParams.gravity = 51;
      layoutParams.leftMargin = (Math.max(0, i) - m) / 2;
      verticalSeekBar2.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
    } 
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\h6ah4i\android\widget\verticalseekbar\VerticalSeekBarWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */