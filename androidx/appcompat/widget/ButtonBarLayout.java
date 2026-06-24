package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import nc1;
import v22;

public class ButtonBarLayout extends LinearLayout {
  public boolean b;
  
  public boolean c;
  
  public int e = -1;
  
  public ButtonBarLayout(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    int[] arrayOfInt = nc1.k;
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    v22.m((View)this, paramContext, arrayOfInt, paramAttributeSet, typedArray, 0);
    this.b = typedArray.getBoolean(0, true);
    typedArray.recycle();
    if (getOrientation() == 1)
      setStacked(this.b); 
  }
  
  private void setStacked(boolean paramBoolean) {
    if (this.c != paramBoolean && (!paramBoolean || this.b)) {
      byte b;
      this.c = paramBoolean;
      setOrientation(paramBoolean);
      if (paramBoolean) {
        b = 8388613;
      } else {
        b = 80;
      } 
      setGravity(b);
      View view = findViewById(2131297519);
      if (view != null) {
        byte b1;
        if (paramBoolean) {
          b1 = 8;
        } else {
          b1 = 4;
        } 
        view.setVisibility(b1);
      } 
      for (int i = getChildCount() - 2; i >= 0; i--)
        bringChildToFront(getChildAt(i)); 
    } 
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    byte b;
    int i = View.MeasureSpec.getSize(paramInt1);
    boolean bool = this.b;
    int k = 0;
    if (bool) {
      if (i > this.e && this.c)
        setStacked(false); 
      this.e = i;
    } 
    if (!this.c && View.MeasureSpec.getMode(paramInt1) == 1073741824) {
      j = View.MeasureSpec.makeMeasureSpec(i, -2147483648);
      i = 1;
    } else {
      j = paramInt1;
      i = 0;
    } 
    super.onMeasure(j, paramInt2);
    int j = i;
    if (this.b) {
      j = i;
      if (!this.c) {
        j = i;
        if ((getMeasuredWidthAndState() & 0xFF000000) == 16777216) {
          setStacked(true);
          j = 1;
        } 
      } 
    } 
    if (j != 0)
      super.onMeasure(paramInt1, paramInt2); 
    j = getChildCount();
    i = 0;
    while (true) {
      b = -1;
      if (i < j) {
        if (getChildAt(i).getVisibility() == 0) {
          j = i;
          break;
        } 
        i++;
        continue;
      } 
      j = -1;
      break;
    } 
    i = k;
    if (j >= 0) {
      View view = getChildAt(j);
      LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)view.getLayoutParams();
      i = getPaddingTop();
      k = view.getMeasuredHeight() + i + layoutParams.topMargin + layoutParams.bottomMargin;
      if (this.c) {
        i = j + 1;
        int m = getChildCount();
        while (true) {
          j = b;
          if (i < m) {
            if (getChildAt(i).getVisibility() == 0) {
              j = i;
              break;
            } 
            i++;
            continue;
          } 
          break;
        } 
        if (j >= 0) {
          i = getChildAt(j).getPaddingTop() + (int)((getResources().getDisplayMetrics()).density * 16.0F) + k;
        } else {
          i = k;
        } 
      } else {
        i = getPaddingBottom() + k;
      } 
    } 
    WeakHashMap weakHashMap = v22.a;
    if (getMinimumHeight() != i) {
      setMinimumHeight(i);
      if (paramInt2 == 0)
        super.onMeasure(paramInt1, paramInt2); 
    } 
  }
  
  public void setAllowStacking(boolean paramBoolean) {
    if (this.b != paramBoolean) {
      this.b = paramBoolean;
      if (!paramBoolean && this.c)
        setStacked(false); 
      requestLayout();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\widget\ButtonBarLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */