package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import cn;
import f80;
import g80;
import ga1;
import h80;
import i80;
import j80;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import k80;
import l0;
import m60;
import tp;
import v22;
import yb1;

public class FlexboxLayout extends ViewGroup implements f80 {
  public int b;
  
  public int c;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public int h = -1;
  
  public Drawable i;
  
  public Drawable j;
  
  public int k;
  
  public int l;
  
  public int m;
  
  public int n;
  
  public int[] o;
  
  public SparseIntArray p;
  
  public final cn q = new cn(this);
  
  public List r = new ArrayList();
  
  public final i80 s = (i80)new Object();
  
  public FlexboxLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  public FlexboxLayout(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public FlexboxLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, yb1.a, paramInt, 0);
    this.b = typedArray.getInt(5, 0);
    this.c = typedArray.getInt(6, 0);
    this.e = typedArray.getInt(7, 0);
    this.f = typedArray.getInt(1, 0);
    this.g = typedArray.getInt(0, 0);
    this.h = typedArray.getInt(8, -1);
    Drawable drawable = typedArray.getDrawable(2);
    if (drawable != null) {
      setDividerDrawableHorizontal(drawable);
      setDividerDrawableVertical(drawable);
    } 
    drawable = typedArray.getDrawable(3);
    if (drawable != null)
      setDividerDrawableHorizontal(drawable); 
    drawable = typedArray.getDrawable(4);
    if (drawable != null)
      setDividerDrawableVertical(drawable); 
    paramInt = typedArray.getInt(9, 0);
    if (paramInt != 0) {
      this.l = paramInt;
      this.k = paramInt;
    } 
    paramInt = typedArray.getInt(11, 0);
    if (paramInt != 0)
      this.l = paramInt; 
    paramInt = typedArray.getInt(10, 0);
    if (paramInt != 0)
      this.k = paramInt; 
    typedArray.recycle();
  }
  
  public final void a(View paramView, int paramInt1, int paramInt2, h80 paramh80) {
    if (p(paramInt1, paramInt2)) {
      boolean bool = j();
      paramInt1 = paramh80.e;
      if (bool) {
        paramInt2 = this.n;
        paramh80.e = paramInt1 + paramInt2;
        paramh80.f += paramInt2;
        return;
      } 
      paramInt2 = this.m;
      paramh80.e = paramInt1 + paramInt2;
      paramh80.f += paramInt2;
    } 
  }
  
  public final void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    if (this.p == null)
      this.p = new SparseIntArray(getChildCount()); 
    SparseIntArray sparseIntArray = this.p;
    cn cn1 = this.q;
    f80 f801 = (f80)cn1.e;
    int i = f801.getFlexItemCount();
    ArrayList<j80> arrayList = cn1.f(i);
    Object object = new Object();
    if (paramView != null && paramLayoutParams instanceof g80) {
      ((j80)object).c = ((g80)paramLayoutParams).getOrder();
    } else {
      ((j80)object).c = 1;
    } 
    if (paramInt == -1 || paramInt == i) {
      ((j80)object).b = i;
    } else if (paramInt < f801.getFlexItemCount()) {
      ((j80)object).b = paramInt;
      for (int j = paramInt; j < i; j++) {
        j80 j80 = arrayList.get(j);
        j80.b++;
      } 
    } else {
      ((j80)object).b = i;
    } 
    arrayList.add(object);
    this.o = cn.y(i + 1, arrayList, sparseIntArray);
    super.addView(paramView, paramInt, paramLayoutParams);
  }
  
  public final View b(int paramInt) {
    return getChildAt(paramInt);
  }
  
  public final int c(View paramView, int paramInt1, int paramInt2) {
    boolean bool1 = j();
    boolean bool = false;
    int i = 0;
    if (bool1) {
      if (p(paramInt1, paramInt2))
        i = this.n; 
      paramInt1 = i;
      if ((this.l & 0x4) > 0) {
        paramInt1 = this.n;
      } else {
        return paramInt1;
      } 
    } else {
      i = bool;
      if (p(paramInt1, paramInt2))
        i = this.m; 
      if ((this.k & 0x4) > 0) {
        paramInt1 = this.m;
      } else {
        return i;
      } 
    } 
    return i + paramInt1;
  }
  
  public final boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return paramLayoutParams instanceof k80;
  }
  
  public final int d(int paramInt1, int paramInt2, int paramInt3) {
    return ViewGroup.getChildMeasureSpec(paramInt1, paramInt2, paramInt3);
  }
  
  public final void e(Canvas paramCanvas, boolean paramBoolean1, boolean paramBoolean2) {
    int j = getPaddingLeft();
    int i = getPaddingRight();
    int k = Math.max(0, getWidth() - i - j);
    int m = this.r.size();
    for (i = 0; i < m; i++) {
      h80 h80 = this.r.get(i);
      int n;
      for (n = 0; n < h80.h; n++) {
        int i1 = h80.o + n;
        View view = o(i1);
        if (view != null && view.getVisibility() != 8) {
          k80 k80 = (k80)view.getLayoutParams();
          if (p(i1, n)) {
            if (paramBoolean1) {
              i1 = view.getRight() + ((ViewGroup.MarginLayoutParams)k80).rightMargin;
            } else {
              i1 = view.getLeft() - ((ViewGroup.MarginLayoutParams)k80).leftMargin - this.n;
            } 
            n(paramCanvas, i1, h80.b, h80.g);
          } 
          if (n == h80.h - 1 && (this.l & 0x4) > 0) {
            if (paramBoolean1) {
              i1 = view.getLeft() - ((ViewGroup.MarginLayoutParams)k80).leftMargin - this.n;
            } else {
              i1 = view.getRight() + ((ViewGroup.MarginLayoutParams)k80).rightMargin;
            } 
            n(paramCanvas, i1, h80.b, h80.g);
          } 
        } 
      } 
      if (q(i)) {
        if (paramBoolean2) {
          n = h80.d;
        } else {
          n = h80.b - this.m;
        } 
        m(paramCanvas, j, n, k);
      } 
      if (r(i) && (this.k & 0x4) > 0) {
        if (paramBoolean2) {
          n = h80.b - this.m;
        } else {
          n = h80.d;
        } 
        m(paramCanvas, j, n, k);
      } 
    } 
  }
  
  public final void f(h80 paramh80) {
    if (j()) {
      if ((this.l & 0x4) > 0) {
        int i = paramh80.e;
        int j = this.n;
        paramh80.e = i + j;
        paramh80.f += j;
        return;
      } 
    } else if ((this.k & 0x4) > 0) {
      int i = paramh80.e;
      int j = this.m;
      paramh80.e = i + j;
      paramh80.f += j;
    } 
  }
  
  public final View g(int paramInt) {
    return o(paramInt);
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    Context context = getContext();
    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(context, paramAttributeSet);
    ((k80)marginLayoutParams).b = 1;
    ((k80)marginLayoutParams).c = 0.0F;
    ((k80)marginLayoutParams).e = 1.0F;
    ((k80)marginLayoutParams).f = -1;
    ((k80)marginLayoutParams).g = -1.0F;
    ((k80)marginLayoutParams).h = -1;
    ((k80)marginLayoutParams).i = -1;
    ((k80)marginLayoutParams).j = 16777215;
    ((k80)marginLayoutParams).k = 16777215;
    TypedArray typedArray = context.obtainStyledAttributes(paramAttributeSet, yb1.b);
    ((k80)marginLayoutParams).b = typedArray.getInt(8, 1);
    ((k80)marginLayoutParams).c = typedArray.getFloat(2, 0.0F);
    ((k80)marginLayoutParams).e = typedArray.getFloat(3, 1.0F);
    ((k80)marginLayoutParams).f = typedArray.getInt(0, -1);
    ((k80)marginLayoutParams).g = typedArray.getFraction(1, 1, 1, -1.0F);
    ((k80)marginLayoutParams).h = typedArray.getDimensionPixelSize(7, -1);
    ((k80)marginLayoutParams).i = typedArray.getDimensionPixelSize(6, -1);
    ((k80)marginLayoutParams).j = typedArray.getDimensionPixelSize(5, 16777215);
    ((k80)marginLayoutParams).k = typedArray.getDimensionPixelSize(4, 16777215);
    ((k80)marginLayoutParams).l = typedArray.getBoolean(9, false);
    typedArray.recycle();
    return (ViewGroup.LayoutParams)marginLayoutParams;
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    if (paramLayoutParams instanceof k80) {
      k80 k80 = (k80)paramLayoutParams;
      marginLayoutParams = new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams)k80);
      ((k80)marginLayoutParams).b = 1;
      ((k80)marginLayoutParams).c = 0.0F;
      ((k80)marginLayoutParams).e = 1.0F;
      ((k80)marginLayoutParams).f = -1;
      ((k80)marginLayoutParams).g = -1.0F;
      ((k80)marginLayoutParams).h = -1;
      ((k80)marginLayoutParams).i = -1;
      ((k80)marginLayoutParams).j = 16777215;
      ((k80)marginLayoutParams).k = 16777215;
      ((k80)marginLayoutParams).b = k80.b;
      ((k80)marginLayoutParams).c = k80.c;
      ((k80)marginLayoutParams).e = k80.e;
      ((k80)marginLayoutParams).f = k80.f;
      ((k80)marginLayoutParams).g = k80.g;
      ((k80)marginLayoutParams).h = k80.h;
      ((k80)marginLayoutParams).i = k80.i;
      ((k80)marginLayoutParams).j = k80.j;
      ((k80)marginLayoutParams).k = k80.k;
      ((k80)marginLayoutParams).l = k80.l;
      return (ViewGroup.LayoutParams)marginLayoutParams;
    } 
    if (marginLayoutParams instanceof ViewGroup.MarginLayoutParams) {
      marginLayoutParams = new ViewGroup.MarginLayoutParams(marginLayoutParams);
      ((k80)marginLayoutParams).b = 1;
      ((k80)marginLayoutParams).c = 0.0F;
      ((k80)marginLayoutParams).e = 1.0F;
      ((k80)marginLayoutParams).f = -1;
      ((k80)marginLayoutParams).g = -1.0F;
      ((k80)marginLayoutParams).h = -1;
      ((k80)marginLayoutParams).i = -1;
      ((k80)marginLayoutParams).j = 16777215;
      ((k80)marginLayoutParams).k = 16777215;
      return (ViewGroup.LayoutParams)marginLayoutParams;
    } 
    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((ViewGroup.LayoutParams)marginLayoutParams);
    ((k80)marginLayoutParams).b = 1;
    ((k80)marginLayoutParams).c = 0.0F;
    ((k80)marginLayoutParams).e = 1.0F;
    ((k80)marginLayoutParams).f = -1;
    ((k80)marginLayoutParams).g = -1.0F;
    ((k80)marginLayoutParams).h = -1;
    ((k80)marginLayoutParams).i = -1;
    ((k80)marginLayoutParams).j = 16777215;
    ((k80)marginLayoutParams).k = 16777215;
    return (ViewGroup.LayoutParams)marginLayoutParams;
  }
  
  public int getAlignContent() {
    return this.g;
  }
  
  public int getAlignItems() {
    return this.f;
  }
  
  public Drawable getDividerDrawableHorizontal() {
    return this.i;
  }
  
  public Drawable getDividerDrawableVertical() {
    return this.j;
  }
  
  public int getFlexDirection() {
    return this.b;
  }
  
  public int getFlexItemCount() {
    return getChildCount();
  }
  
  public List<h80> getFlexLines() {
    ArrayList<h80> arrayList = new ArrayList(this.r.size());
    for (h80 h80 : this.r) {
      if (h80.a() == 0)
        continue; 
      arrayList.add(h80);
    } 
    return arrayList;
  }
  
  public List<h80> getFlexLinesInternal() {
    return this.r;
  }
  
  public int getFlexWrap() {
    return this.c;
  }
  
  public int getJustifyContent() {
    return this.e;
  }
  
  public int getLargestMainSize() {
    Iterator iterator = this.r.iterator();
    int i;
    for (i = Integer.MIN_VALUE; iterator.hasNext(); i = Math.max(i, ((h80)iterator.next()).e));
    return i;
  }
  
  public int getMaxLine() {
    return this.h;
  }
  
  public int getShowDividerHorizontal() {
    return this.k;
  }
  
  public int getShowDividerVertical() {
    return this.l;
  }
  
  public int getSumOfCrossSize() {
    int j = this.r.size();
    byte b = 0;
    int i = 0;
    while (b < j) {
      h80 h80 = this.r.get(b);
      int k = i;
      if (q(b)) {
        if (j()) {
          k = this.m;
        } else {
          k = this.n;
        } 
        k = i + k;
      } 
      i = k;
      if (r(b)) {
        if (j()) {
          i = this.m;
        } else {
          i = this.n;
        } 
        i = k + i;
      } 
      i += h80.g;
      b++;
    } 
    return i;
  }
  
  public final void h(View paramView, int paramInt) {}
  
  public final int i(int paramInt1, int paramInt2, int paramInt3) {
    return ViewGroup.getChildMeasureSpec(paramInt1, paramInt2, paramInt3);
  }
  
  public final boolean j() {
    int i = this.b;
    return (i == 0 || i == 1);
  }
  
  public final int k(View paramView) {
    return 0;
  }
  
  public final void l(Canvas paramCanvas, boolean paramBoolean1, boolean paramBoolean2) {
    int j = getPaddingTop();
    int i = getPaddingBottom();
    int m = Math.max(0, getHeight() - i - j);
    int k = this.r.size();
    for (i = 0; i < k; i++) {
      h80 h80 = this.r.get(i);
      int n;
      for (n = 0; n < h80.h; n++) {
        int i1 = h80.o + n;
        View view = o(i1);
        if (view != null && view.getVisibility() != 8) {
          k80 k80 = (k80)view.getLayoutParams();
          if (p(i1, n)) {
            if (paramBoolean2) {
              i1 = view.getBottom() + ((ViewGroup.MarginLayoutParams)k80).bottomMargin;
            } else {
              i1 = view.getTop() - ((ViewGroup.MarginLayoutParams)k80).topMargin - this.m;
            } 
            m(paramCanvas, h80.a, i1, h80.g);
          } 
          if (n == h80.h - 1 && (this.k & 0x4) > 0) {
            if (paramBoolean2) {
              i1 = view.getTop() - ((ViewGroup.MarginLayoutParams)k80).topMargin - this.m;
            } else {
              i1 = view.getBottom() + ((ViewGroup.MarginLayoutParams)k80).bottomMargin;
            } 
            m(paramCanvas, h80.a, i1, h80.g);
          } 
        } 
      } 
      if (q(i)) {
        if (paramBoolean1) {
          n = h80.c;
        } else {
          n = h80.a - this.n;
        } 
        n(paramCanvas, n, j, m);
      } 
      if (r(i) && (this.l & 0x4) > 0) {
        if (paramBoolean1) {
          n = h80.a - this.n;
        } else {
          n = h80.c;
        } 
        n(paramCanvas, n, j, m);
      } 
    } 
  }
  
  public final void m(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3) {
    Drawable drawable = this.i;
    if (drawable == null)
      return; 
    drawable.setBounds(paramInt1, paramInt2, paramInt3 + paramInt1, this.m + paramInt2);
    this.i.draw(paramCanvas);
  }
  
  public final void n(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3) {
    Drawable drawable = this.j;
    if (drawable == null)
      return; 
    drawable.setBounds(paramInt1, paramInt2, this.n + paramInt1, paramInt3 + paramInt2);
    this.j.draw(paramCanvas);
  }
  
  public final View o(int paramInt) {
    if (paramInt >= 0) {
      int[] arrayOfInt = this.o;
      if (paramInt < arrayOfInt.length)
        return getChildAt(arrayOfInt[paramInt]); 
    } 
    return null;
  }
  
  public final void onDraw(Canvas paramCanvas) {
    if ((this.j != null || this.i != null) && (this.k != 0 || this.l != 0)) {
      WeakHashMap weakHashMap = v22.a;
      int i = getLayoutDirection();
      int j = this.b;
      boolean bool1 = false;
      int k = 0;
      byte b = 0;
      boolean bool2 = true;
      if (j != 0) {
        if (j != 1) {
          if (j != 2) {
            if (j == 3) {
              if (i == 1)
                b = 1; 
              k = b;
              if (this.c == 2)
                k = b ^ 0x1; 
              l(paramCanvas, k, true);
              return;
            } 
            return;
          } 
          if (i == 1) {
            b = bool2;
          } else {
            b = 0;
          } 
          k = b;
          if (this.c == 2)
            k = b ^ 0x1; 
          l(paramCanvas, k, false);
          return;
        } 
        if (i != 1) {
          b = 1;
        } else {
          b = 0;
        } 
        k = bool1;
        if (this.c == 2)
          k = 1; 
        e(paramCanvas, b, k);
        return;
      } 
      if (i == 1) {
        b = 1;
      } else {
        b = 0;
      } 
      if (this.c == 2)
        k = 1; 
      e(paramCanvas, b, k);
      return;
    } 
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    WeakHashMap weakHashMap = v22.a;
    int j = getLayoutDirection();
    int i = this.b;
    boolean bool = false;
    paramBoolean = false;
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i == 3) {
            if (j == 1)
              paramBoolean = true; 
            bool = paramBoolean;
            if (this.c == 2)
              m = paramBoolean ^ true; 
            t(m, true, paramInt1, paramInt2, paramInt3, paramInt4);
            return;
          } 
          m60.j("Invalid flex direction is set: ", this.b);
          return;
        } 
        int k = m;
        if (j == 1)
          k = 1; 
        int m = k;
        if (this.c == 2)
          m = k ^ 0x1; 
        t(m, false, paramInt1, paramInt2, paramInt3, paramInt4);
        return;
      } 
      if (j != 1) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      } 
      s(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    } 
    if (j == 1) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    s(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    if (this.p == null)
      this.p = new SparseIntArray(getChildCount()); 
    SparseIntArray sparseIntArray2 = this.p;
    cn cn1 = this.q;
    f80 f801 = (f80)cn1.e;
    int j = f801.getFlexItemCount();
    if (sparseIntArray2.size() == j) {
      int k = 0;
      while (true) {
        if (k < j) {
          View view = f801.b(k);
          if (view == null || ((g80)view.getLayoutParams()).getOrder() == sparseIntArray2.get(k)) {
            k++;
            continue;
          } 
        } else {
          break;
        } 
        SparseIntArray sparseIntArray = this.p;
        k = ((f80)cn1.e).getFlexItemCount();
        this.o = cn.y(k, cn1.f(k), sparseIntArray);
        break;
      } 
      k = this.b;
      i80 i801 = this.s;
      if (k != 0 && k != 1) {
        if (k == 2 || k == 3) {
          this.r.clear();
          i801.b = null;
          i801.a = 0;
          this.q.b(this.s, paramInt2, paramInt1, 2147483647, 0, -1, null);
          this.r = i801.b;
          cn1.h(paramInt1, paramInt2, 0);
          k = getPaddingLeft();
          cn1.g(paramInt1, paramInt2, getPaddingRight() + k);
          cn1.B(0);
          u(this.b, paramInt1, paramInt2, i801.a);
          return;
        } 
        m60.j("Invalid value for the flex direction is set: ", this.b);
        return;
      } 
      this.r.clear();
      i801.b = null;
      i801.a = 0;
      this.q.b(this.s, paramInt1, paramInt2, 2147483647, 0, -1, null);
      this.r = i801.b;
      cn1.h(paramInt1, paramInt2, 0);
      if (this.f == 3)
        for (h80 h80 : this.r) {
          int m = Integer.MIN_VALUE;
          j = 0;
          while (j < h80.h) {
            View view = o(h80.o + j);
            k = m;
            if (view != null)
              if (view.getVisibility() == 8) {
                k = m;
              } else {
                k80 k80 = (k80)view.getLayoutParams();
                int n = this.c;
                k = h80.l;
                if (n != 2) {
                  k = Math.max(k - view.getBaseline(), ((ViewGroup.MarginLayoutParams)k80).topMargin);
                  k = Math.max(m, view.getMeasuredHeight() + k + ((ViewGroup.MarginLayoutParams)k80).bottomMargin);
                } else {
                  n = view.getMeasuredHeight();
                  k = Math.max(view.getBaseline() + k - n, ((ViewGroup.MarginLayoutParams)k80).bottomMargin);
                  k = Math.max(m, view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams)k80).topMargin + k);
                } 
              }  
            j++;
            m = k;
          } 
          h80.g = m;
        }  
      k = getPaddingTop();
      cn1.g(paramInt1, paramInt2, getPaddingBottom() + k);
      cn1.B(0);
      u(this.b, paramInt1, paramInt2, i801.a);
      return;
    } 
    SparseIntArray sparseIntArray1 = this.p;
    int i = ((f80)cn1.e).getFlexItemCount();
    this.o = cn.y(i, cn1.f(i), sparseIntArray1);
    break;
  }
  
  public final boolean p(int paramInt1, int paramInt2) {
    for (byte b = 1; b <= paramInt2; b++) {
      View view = o(paramInt1 - b);
      if (view != null && view.getVisibility() != 8)
        return j() ? (((this.l & 0x2) != 0)) : (((this.k & 0x2) != 0)); 
    } 
    return j() ? (((this.l & 0x1) != 0)) : (((this.k & 0x1) != 0));
  }
  
  public final boolean q(int paramInt) {
    if (paramInt >= 0 && paramInt < this.r.size()) {
      for (byte b = 0; b < paramInt; b++) {
        if (((h80)this.r.get(b)).a() > 0)
          return j() ? (((this.k & 0x2) != 0)) : (((this.l & 0x2) != 0)); 
      } 
      if (j())
        return ((this.k & 0x1) != 0); 
      if ((this.l & 0x1) != 0)
        return true; 
    } 
    return false;
  }
  
  public final boolean r(int paramInt) {
    if (paramInt >= 0 && paramInt < this.r.size()) {
      while (++paramInt < this.r.size()) {
        if (((h80)this.r.get(paramInt)).a() > 0)
          return false; 
        paramInt++;
      } 
      if (j())
        return ((this.k & 0x4) != 0); 
      if ((this.l & 0x4) != 0)
        return true; 
    } 
    return false;
  }
  
  public final void s(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = getPaddingLeft();
    int j = getPaddingRight();
    int k = paramInt3 - paramInt1;
    paramInt3 = paramInt4 - paramInt2 - getPaddingBottom();
    paramInt2 = getPaddingTop();
    int m = this.r.size();
    byte b = 0;
    while (b < m) {
      float f1;
      float f2;
      float f3;
      h80 h80 = this.r.get(b);
      paramInt4 = paramInt3;
      paramInt1 = paramInt2;
      if (q(b)) {
        paramInt1 = this.m;
        paramInt4 = paramInt3 - paramInt1;
        paramInt1 = paramInt2 + paramInt1;
      } 
      paramInt2 = paramInt4;
      int n = this.e;
      paramInt4 = 4;
      paramInt3 = 2;
      boolean bool = true;
      if (n != 0) {
        if (n != 1) {
          if (n != 2) {
            if (n != 3) {
              if (n != 4) {
                if (n == 5) {
                  n = h80.a();
                  if (n != 0) {
                    f3 = (k - h80.e) / (n + 1);
                  } else {
                    f3 = 0.0F;
                  } 
                  f1 = i + f3;
                  f2 = (k - j) - f3;
                } else {
                  m60.j("Invalid justifyContent is set: ", this.e);
                  return;
                } 
              } else {
                n = h80.a();
                if (n != 0) {
                  f1 = (k - h80.e) / n;
                } else {
                  f1 = 0.0F;
                } 
                f2 = i;
                float f5 = f1 / 2.0F;
                f2 += f5;
                float f6 = (k - j);
                f3 = f1;
                f5 = f6 - f5;
                f1 = f2;
                f2 = f5;
              } 
            } else {
              f2 = i;
              n = h80.a();
              if (n != 1) {
                f1 = (n - 1);
              } else {
                f1 = 1.0F;
              } 
              f3 = (k - h80.e) / f1;
              float f = (k - j);
              f1 = f2;
              f2 = f;
            } 
          } else {
            f1 = i;
            n = h80.e;
            f1 += (k - n) / 2.0F;
            f2 = (k - j) - (k - n) / 2.0F;
            f3 = 0.0F;
          } 
        } else {
          n = h80.e;
          f1 = (k - n + j);
          f2 = (n - i);
          f3 = 0.0F;
        } 
      } else {
        f1 = i;
        f2 = (k - j);
        f3 = 0.0F;
      } 
      float f4 = Math.max(f3, 0.0F);
      for (n = 0; n < h80.h; n++) {
        int i1 = h80.o + n;
        View view = o(i1);
        if (view != null && view.getVisibility() != 8) {
          boolean bool1;
          k80 k80 = (k80)view.getLayoutParams();
          f3 = f1 + ((ViewGroup.MarginLayoutParams)k80).leftMargin;
          f1 = f2 - ((ViewGroup.MarginLayoutParams)k80).rightMargin;
          if (p(i1, n)) {
            i1 = this.n;
            float f5 = i1;
            f2 = f3 + f5;
            f1 -= f5;
          } else {
            i1 = 0;
            f2 = f3;
          } 
          if (n == h80.h - 1 && (this.l & 0x4) > 0) {
            bool1 = this.n;
          } else {
            bool1 = false;
          } 
          if (this.c == paramInt3) {
            cn cn1 = this.q;
            if (paramBoolean) {
              cn1.p(view, h80, Math.round(f1) - view.getMeasuredWidth(), paramInt2 - view.getMeasuredHeight(), Math.round(f1), paramInt2);
            } else {
              int i4 = Math.round(f2);
              int i3 = view.getMeasuredHeight();
              int i2 = Math.round(f2);
              cn1.p(view, h80, i4, paramInt2 - i3, view.getMeasuredWidth() + i2, paramInt2);
            } 
          } else {
            cn cn1 = this.q;
            if (paramBoolean) {
              cn1.p(view, h80, Math.round(f1) - view.getMeasuredWidth(), paramInt1, Math.round(f1), view.getMeasuredHeight() + paramInt1);
            } else {
              int i2 = Math.round(f2);
              int i3 = Math.round(f2);
              cn1.p(view, h80, i2, paramInt1, view.getMeasuredWidth() + i3, view.getMeasuredHeight() + paramInt1);
            } 
          } 
          f2 += view.getMeasuredWidth() + f4 + ((ViewGroup.MarginLayoutParams)k80).rightMargin;
          float f = view.getMeasuredWidth();
          f3 = ((ViewGroup.MarginLayoutParams)k80).leftMargin;
          if (paramBoolean) {
            h80.b(view, bool1, 0, i1, 0);
          } else {
            h80.b(view, i1, 0, bool1, 0);
          } 
          f3 = f1 - f + f4 + f3;
          f1 = f2;
          f2 = f3;
        } 
      } 
      paramInt3 = h80.g;
      paramInt1 += paramInt3;
      paramInt3 = paramInt2 - paramInt3;
      b++;
      paramInt2 = paramInt1;
    } 
  }
  
  public void setAlignContent(int paramInt) {
    if (this.g != paramInt) {
      this.g = paramInt;
      requestLayout();
    } 
  }
  
  public void setAlignItems(int paramInt) {
    if (this.f != paramInt) {
      this.f = paramInt;
      requestLayout();
    } 
  }
  
  public void setDividerDrawable(Drawable paramDrawable) {
    setDividerDrawableHorizontal(paramDrawable);
    setDividerDrawableVertical(paramDrawable);
  }
  
  public void setDividerDrawableHorizontal(Drawable paramDrawable) {
    if (paramDrawable == this.i)
      return; 
    this.i = paramDrawable;
    if (paramDrawable != null) {
      this.m = paramDrawable.getIntrinsicHeight();
    } else {
      this.m = 0;
    } 
    if (this.i == null && this.j == null) {
      setWillNotDraw(true);
    } else {
      setWillNotDraw(false);
    } 
    requestLayout();
  }
  
  public void setDividerDrawableVertical(Drawable paramDrawable) {
    if (paramDrawable == this.j)
      return; 
    this.j = paramDrawable;
    if (paramDrawable != null) {
      this.n = paramDrawable.getIntrinsicWidth();
    } else {
      this.n = 0;
    } 
    if (this.i == null && this.j == null) {
      setWillNotDraw(true);
    } else {
      setWillNotDraw(false);
    } 
    requestLayout();
  }
  
  public void setFlexDirection(int paramInt) {
    if (this.b != paramInt) {
      this.b = paramInt;
      requestLayout();
    } 
  }
  
  public void setFlexLines(List<h80> paramList) {
    this.r = paramList;
  }
  
  public void setFlexWrap(int paramInt) {
    if (this.c != paramInt) {
      this.c = paramInt;
      requestLayout();
    } 
  }
  
  public void setJustifyContent(int paramInt) {
    if (this.e != paramInt) {
      this.e = paramInt;
      requestLayout();
    } 
  }
  
  public void setMaxLine(int paramInt) {
    if (this.h != paramInt) {
      this.h = paramInt;
      requestLayout();
    } 
  }
  
  public void setShowDivider(int paramInt) {
    setShowDividerVertical(paramInt);
    setShowDividerHorizontal(paramInt);
  }
  
  public void setShowDividerHorizontal(int paramInt) {
    if (paramInt != this.k) {
      this.k = paramInt;
      requestLayout();
    } 
  }
  
  public void setShowDividerVertical(int paramInt) {
    if (paramInt != this.l) {
      this.l = paramInt;
      requestLayout();
    } 
  }
  
  public final void t(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int m = getPaddingTop();
    int k = getPaddingBottom();
    int i = getPaddingRight();
    int j = getPaddingLeft();
    int n = paramInt4 - paramInt2;
    paramInt2 = paramInt3 - paramInt1 - i;
    int i1 = this.r.size();
    i = 0;
    paramInt3 = j;
    while (i < i1) {
      float f1;
      float f2;
      float f3;
      h80 h80 = this.r.get(i);
      paramInt1 = paramInt3;
      paramInt4 = paramInt2;
      if (q(i)) {
        paramInt4 = this.n;
        paramInt1 = paramInt3 + paramInt4;
        paramInt4 = paramInt2 - paramInt4;
      } 
      paramInt2 = paramInt4;
      j = this.e;
      paramInt4 = 4;
      paramInt3 = 1;
      if (j != 0) {
        if (j != 1) {
          if (j != 2) {
            if (j != 3) {
              if (j != 4) {
                if (j == 5) {
                  j = h80.a();
                  if (j != 0) {
                    f3 = (n - h80.e) / (j + 1);
                  } else {
                    f3 = 0.0F;
                  } 
                  f1 = m + f3;
                  f2 = (n - k) - f3;
                } else {
                  m60.j("Invalid justifyContent is set: ", this.e);
                  return;
                } 
              } else {
                j = h80.a();
                if (j != 0) {
                  f3 = (n - h80.e) / j;
                } else {
                  f3 = 0.0F;
                } 
                f1 = m;
                f2 = f3 / 2.0F;
                f1 += f2;
                f2 = (n - k) - f2;
              } 
            } else {
              f2 = m;
              j = h80.a();
              if (j != 1) {
                f1 = (j - 1);
              } else {
                f1 = 1.0F;
              } 
              f3 = (n - h80.e) / f1;
              float f = (n - k);
              f1 = f2;
              f2 = f;
            } 
          } else {
            f1 = m;
            f2 = (n - h80.e) / 2.0F;
            f1 += f2;
            f2 = (n - k) - f2;
            f3 = 0.0F;
          } 
        } else {
          j = h80.e;
          f1 = (n - j + k);
          f2 = (j - m);
          f3 = 0.0F;
        } 
      } else {
        f1 = m;
        f2 = (n - k);
        f3 = 0.0F;
      } 
      float f4 = Math.max(f3, 0.0F);
      for (j = 0; j < h80.h; j++) {
        int i2 = h80.o + j;
        View view = o(i2);
        if (view != null && view.getVisibility() != 8) {
          boolean bool;
          k80 k80 = (k80)view.getLayoutParams();
          f3 = f1 + ((ViewGroup.MarginLayoutParams)k80).topMargin;
          f1 = f2 - ((ViewGroup.MarginLayoutParams)k80).bottomMargin;
          if (p(i2, j)) {
            i2 = this.m;
            float f5 = i2;
            f2 = f3 + f5;
            f1 -= f5;
          } else {
            i2 = 0;
            f2 = f3;
          } 
          if (j == h80.h - paramInt3 && (this.k & 0x4) > 0) {
            bool = this.m;
          } else {
            bool = false;
          } 
          cn cn1 = this.q;
          if (paramBoolean1) {
            if (paramBoolean2) {
              cn1.q(view, h80, true, paramInt2 - view.getMeasuredWidth(), Math.round(f1) - view.getMeasuredHeight(), paramInt2, Math.round(f1));
            } else {
              int i3 = view.getMeasuredWidth();
              int i4 = Math.round(f2);
              int i5 = Math.round(f2);
              cn1.q(view, h80, true, paramInt2 - i3, i4, paramInt2, view.getMeasuredHeight() + i5);
            } 
          } else if (paramBoolean2) {
            cn1.q(view, h80, false, paramInt1, Math.round(f1) - view.getMeasuredHeight(), view.getMeasuredWidth() + paramInt1, Math.round(f1));
          } else {
            int i5 = Math.round(f2);
            int i3 = view.getMeasuredWidth();
            int i4 = Math.round(f2);
            cn1.q(view, h80, false, paramInt1, i5, i3 + paramInt1, view.getMeasuredHeight() + i4);
          } 
          f2 += view.getMeasuredHeight() + f4 + ((ViewGroup.MarginLayoutParams)k80).bottomMargin;
          float f = view.getMeasuredHeight();
          f3 = ((ViewGroup.MarginLayoutParams)k80).topMargin;
          if (paramBoolean2) {
            h80.b(view, 0, bool, 0, i2);
          } else {
            h80.b(view, 0, i2, 0, bool);
          } 
          f3 = f1 - f + f4 + f3;
          f1 = f2;
          f2 = f3;
        } 
      } 
      paramInt4 = h80.g;
      paramInt3 = paramInt1 + paramInt4;
      paramInt2 -= paramInt4;
      i++;
    } 
  }
  
  public final void u(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int j;
    int i = View.MeasureSpec.getMode(paramInt2);
    int m = View.MeasureSpec.getSize(paramInt2);
    int n = View.MeasureSpec.getMode(paramInt3);
    int k = View.MeasureSpec.getSize(paramInt3);
    if (paramInt1 != 0 && paramInt1 != 1) {
      if (paramInt1 == 2 || paramInt1 == 3) {
        paramInt1 = getLargestMainSize();
        j = getSumOfCrossSize();
        int i1 = getPaddingLeft();
        j = getPaddingRight() + i1 + j;
      } else {
        l0.l(ga1.i("Invalid flex direction: ", paramInt1));
        return;
      } 
    } else {
      paramInt1 = getSumOfCrossSize();
      j = getPaddingTop();
      paramInt1 = getPaddingBottom() + j + paramInt1;
      j = getLargestMainSize();
    } 
    if (i != Integer.MIN_VALUE) {
      if (i != 0) {
        if (i == 1073741824) {
          i = paramInt4;
          if (m < j)
            i = View.combineMeasuredStates(paramInt4, 16777216); 
          paramInt2 = View.resolveSizeAndState(m, paramInt2, i);
          paramInt4 = i;
        } else {
          tp.f(ga1.i("Unknown width mode is set: ", i));
          return;
        } 
      } else {
        paramInt2 = View.resolveSizeAndState(j, paramInt2, paramInt4);
      } 
    } else {
      if (m < j) {
        paramInt4 = View.combineMeasuredStates(paramInt4, 16777216);
        i = m;
      } else {
        i = j;
      } 
      paramInt2 = View.resolveSizeAndState(i, paramInt2, paramInt4);
    } 
    if (n != Integer.MIN_VALUE) {
      if (n != 0) {
        if (n == 1073741824) {
          i = paramInt4;
          if (k < paramInt1)
            i = View.combineMeasuredStates(paramInt4, 256); 
          paramInt1 = View.resolveSizeAndState(k, paramInt3, i);
        } else {
          tp.f(ga1.i("Unknown height mode is set: ", n));
          return;
        } 
      } else {
        paramInt1 = View.resolveSizeAndState(paramInt1, paramInt3, paramInt4);
      } 
    } else {
      if (k < paramInt1) {
        paramInt4 = View.combineMeasuredStates(paramInt4, 256);
        paramInt1 = k;
      } 
      paramInt1 = View.resolveSizeAndState(paramInt1, paramInt3, paramInt4);
    } 
    setMeasuredDimension(paramInt2, paramInt1);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\flexbox\FlexboxLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */