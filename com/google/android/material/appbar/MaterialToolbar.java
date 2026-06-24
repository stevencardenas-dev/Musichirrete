package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import g92;
import ij;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import p8;
import qv;
import ws0;
import zb1;
import zo2;

public class MaterialToolbar extends Toolbar {
  public static final ImageView.ScaleType[] e0 = new ImageView.ScaleType[] { ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE };
  
  public Integer W;
  
  public boolean a0;
  
  public boolean b0;
  
  public ImageView.ScaleType c0;
  
  public Boolean d0;
  
  public MaterialToolbar(Context paramContext) {
    this(paramContext, null);
  }
  
  public MaterialToolbar(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130970216);
  }
  
  public MaterialToolbar(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(qv.n0(paramContext, paramAttributeSet, paramInt, 2131952951), paramAttributeSet, paramInt);
    ColorStateList colorStateList;
    Context context = getContext();
    TypedArray typedArray = g92.S(context, paramAttributeSet, zb1.x, paramInt, 2131952951, new int[0]);
    if (typedArray.hasValue(2))
      setNavigationIconTint(typedArray.getColor(2, -1)); 
    this.a0 = typedArray.getBoolean(4, false);
    this.b0 = typedArray.getBoolean(3, false);
    paramInt = typedArray.getInt(1, -1);
    if (paramInt >= 0) {
      ImageView.ScaleType[] arrayOfScaleType = e0;
      if (paramInt < arrayOfScaleType.length)
        this.c0 = arrayOfScaleType[paramInt]; 
    } 
    if (typedArray.hasValue(0))
      this.d0 = Boolean.valueOf(typedArray.getBoolean(0, false)); 
    typedArray.recycle();
    Drawable drawable = getBackground();
    if (drawable == null) {
      colorStateList = ColorStateList.valueOf(0);
    } else {
      colorStateList = p8.a((Drawable)colorStateList);
    } 
    if (colorStateList != null) {
      ws0 ws0 = new ws0();
      ws0.o(colorStateList);
      ws0.k(context);
      ws0.n(getElevation());
      setBackground((Drawable)ws0);
    } 
  }
  
  public ImageView.ScaleType getLogoScaleType() {
    return this.c0;
  }
  
  public Integer getNavigationIconTint() {
    return this.W;
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    Drawable drawable = getBackground();
    if (drawable instanceof ws0)
      zo2.S((View)this, (ws0)drawable); 
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    ImageView imageView;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    ij ij = zo2.l;
    paramBoolean = this.a0;
    boolean bool = false;
    View view = null;
    if (paramBoolean || this.b0) {
      TextView textView1;
      TextView textView2;
      ArrayList<? extends TextView> arrayList1 = zo2.y(this, getTitle());
      if (arrayList1.isEmpty()) {
        arrayList1 = null;
      } else {
        textView1 = Collections.<TextView>min(arrayList1, (Comparator<? super TextView>)ij);
      } 
      ArrayList<? extends TextView> arrayList2 = zo2.y(this, getSubtitle());
      if (arrayList2.isEmpty()) {
        ij = null;
      } else {
        textView2 = Collections.<TextView>max(arrayList2, (Comparator<? super TextView>)ij);
      } 
      if (textView1 != null || textView2 != null) {
        paramInt2 = getMeasuredWidth();
        int i = paramInt2 / 2;
        paramInt1 = getPaddingLeft();
        paramInt3 = paramInt2 - getPaddingRight();
        paramInt4 = 0;
        while (paramInt4 < getChildCount()) {
          View view1 = getChildAt(paramInt4);
          int k = paramInt1;
          int j = paramInt3;
          if (view1.getVisibility() != 8) {
            k = paramInt1;
            j = paramInt3;
            if (view1 != textView1) {
              k = paramInt1;
              j = paramInt3;
              if (view1 != textView2) {
                paramInt2 = paramInt1;
                if (view1.getRight() < i) {
                  paramInt2 = paramInt1;
                  if (view1.getRight() > paramInt1)
                    paramInt2 = view1.getRight(); 
                } 
                k = paramInt2;
                j = paramInt3;
                if (view1.getLeft() > i) {
                  k = paramInt2;
                  j = paramInt3;
                  if (view1.getLeft() < paramInt3) {
                    j = view1.getLeft();
                    k = paramInt2;
                  } 
                } 
              } 
            } 
          } 
          paramInt4++;
          paramInt1 = k;
          paramInt3 = j;
        } 
        Pair pair = new Pair(Integer.valueOf(paramInt1), Integer.valueOf(paramInt3));
        if (this.a0 && textView1 != null)
          w(textView1, pair); 
        if (this.b0 && textView2 != null)
          w(textView2, pair); 
      } 
    } 
    Drawable drawable = getLogo();
    paramInt1 = bool;
    if (drawable == null) {
      View view1 = view;
    } else {
      while (true) {
        View view1 = view;
        if (paramInt1 < getChildCount()) {
          view1 = getChildAt(paramInt1);
          if (view1 instanceof ImageView) {
            imageView = (ImageView)view1;
            Drawable drawable1 = imageView.getDrawable();
            if (drawable1 != null && drawable1.getConstantState() != null && drawable1.getConstantState().equals(drawable.getConstantState()))
              break; 
          } 
          paramInt1++;
          continue;
        } 
        break;
      } 
    } 
    if (imageView != null) {
      Boolean bool1 = this.d0;
      if (bool1 != null)
        imageView.setAdjustViewBounds(bool1.booleanValue()); 
      ImageView.ScaleType scaleType = this.c0;
      if (scaleType != null)
        imageView.setScaleType(scaleType); 
    } 
  }
  
  public void setElevation(float paramFloat) {
    super.setElevation(paramFloat);
    Drawable drawable = getBackground();
    if (drawable instanceof ws0)
      ((ws0)drawable).n(paramFloat); 
  }
  
  public void setLogoAdjustViewBounds(boolean paramBoolean) {
    Boolean bool = this.d0;
    if (bool == null || bool.booleanValue() != paramBoolean) {
      this.d0 = Boolean.valueOf(paramBoolean);
      requestLayout();
      return;
    } 
  }
  
  public void setLogoScaleType(ImageView.ScaleType paramScaleType) {
    if (this.c0 != paramScaleType) {
      this.c0 = paramScaleType;
      requestLayout();
    } 
  }
  
  public void setNavigationIcon(Drawable paramDrawable) {
    Drawable drawable = paramDrawable;
    if (paramDrawable != null) {
      drawable = paramDrawable;
      if (this.W != null) {
        drawable = paramDrawable.mutate();
        drawable.setTint(this.W.intValue());
      } 
    } 
    super.setNavigationIcon(drawable);
  }
  
  public void setNavigationIconTint(int paramInt) {
    this.W = Integer.valueOf(paramInt);
    Drawable drawable = getNavigationIcon();
    if (drawable != null)
      setNavigationIcon(drawable); 
  }
  
  public void setSubtitleCentered(boolean paramBoolean) {
    if (this.b0 != paramBoolean) {
      this.b0 = paramBoolean;
      requestLayout();
    } 
  }
  
  public void setTitleCentered(boolean paramBoolean) {
    if (this.a0 != paramBoolean) {
      this.a0 = paramBoolean;
      requestLayout();
    } 
  }
  
  public final void w(TextView paramTextView, Pair paramPair) {
    int j = getMeasuredWidth();
    int i = paramTextView.getMeasuredWidth();
    int m = j / 2 - i / 2;
    int k = i + m;
    int n = Math.max(Math.max(((Integer)paramPair.first).intValue() - m, 0), Math.max(k - ((Integer)paramPair.second).intValue(), 0));
    j = k;
    i = m;
    if (n > 0) {
      i = m + n;
      j = k - n;
      paramTextView.measure(View.MeasureSpec.makeMeasureSpec(j - i, 1073741824), paramTextView.getMeasuredHeightAndState());
    } 
    paramTextView.layout(i, paramTextView.getTop(), j, paramTextView.getBottom());
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\appbar\MaterialToolbar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */