package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import es;
import fs;
import g5;
import g7;
import g92;
import gh1;
import h;
import is;
import j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l0;
import m22;
import m32;
import mf0;
import n21;
import n32;
import nf0;
import p8;
import qv;
import r5;
import s31;
import s5;
import t5;
import u5;
import ui0;
import v22;
import wf2;
import ws0;
import ws2;
import x62;
import zb1;
import zo2;

public class AppBarLayout extends LinearLayout implements es {
  public static final int D = 0;
  
  public Integer A;
  
  public final float B;
  
  public Behavior C;
  
  public int b;
  
  public int c = -1;
  
  public int e = -1;
  
  public int f = -1;
  
  public boolean g;
  
  public int h = 0;
  
  public x62 i;
  
  public ArrayList j;
  
  public boolean k;
  
  public boolean l;
  
  public boolean m;
  
  public boolean n;
  
  public ColorStateList o;
  
  public int p;
  
  public WeakReference q;
  
  public ValueAnimator r;
  
  public ValueAnimator.AnimatorUpdateListener s;
  
  public final ArrayList t = new ArrayList();
  
  public final LinkedHashSet u = new LinkedHashSet();
  
  public final long v;
  
  public final TimeInterpolator w;
  
  public int[] x;
  
  public int y;
  
  public Drawable z;
  
  public AppBarLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  public AppBarLayout(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130968642);
  }
  
  public AppBarLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(qv.n0(paramContext, paramAttributeSet, paramInt, 2131952619), paramAttributeSet, paramInt);
    Context context1 = getContext();
    setOrientation(1);
    if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND)
      setOutlineProvider(ViewOutlineProvider.BOUNDS); 
    Context context2 = getContext();
    TypedArray typedArray = g92.S(context2, paramAttributeSet, n21.e, paramInt, 2131952619, new int[0]);
    try {
      if (typedArray.hasValue(0))
        setStateListAnimator(AnimatorInflater.loadStateListAnimator(context2, typedArray.getResourceId(0, 0))); 
    } finally {}
    typedArray.recycle();
    typedArray = g92.S(context1, paramAttributeSet, zb1.a, paramInt, 2131952619, new int[0]);
    this.o = wf2.u(context1, typedArray, 6);
    this.v = zo2.P(context1, 2130969687, getResources().getInteger(2131361794));
    this.w = zo2.Q(context1, 2130969705, (TimeInterpolator)g5.a);
    if (typedArray.hasValue(4))
      f(typedArray.getBoolean(4, false), false, false); 
    if (typedArray.hasValue(3))
      n21.Q(this, typedArray.getDimensionPixelSize(3, 0)); 
    setBackground(typedArray.getDrawable(0));
    if (Build.VERSION.SDK_INT >= 26) {
      if (typedArray.hasValue(2))
        setKeyboardNavigationCluster(typedArray.getBoolean(2, false)); 
      if (typedArray.hasValue(1))
        setTouchscreenBlocksFocus(typedArray.getBoolean(1, false)); 
    } 
    this.B = getResources().getDimension(2131165340);
    this.n = typedArray.getBoolean(5, false);
    this.p = typedArray.getResourceId(7, -1);
    setStatusBarForeground(typedArray.getDrawable(8));
    typedArray.recycle();
    gh1 gh1 = new gh1(8, this);
    WeakHashMap weakHashMap = v22.a;
    m22.c((View)this, (s31)gh1);
  }
  
  public static t5 c(ViewGroup.LayoutParams paramLayoutParams) {
    if (paramLayoutParams instanceof LinearLayout.LayoutParams) {
      layoutParams = new LinearLayout.LayoutParams((LinearLayout.LayoutParams)paramLayoutParams);
      ((t5)layoutParams).a = 1;
      return (t5)layoutParams;
    } 
    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
      layoutParams = new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams)layoutParams);
      ((t5)layoutParams).a = 1;
      return (t5)layoutParams;
    } 
    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((ViewGroup.LayoutParams)layoutParams);
    ((t5)layoutParams).a = 1;
    return (t5)layoutParams;
  }
  
  public final void a(u5 paramu5) {
    if (this.j == null)
      this.j = new ArrayList(); 
    if (paramu5 != null && !this.j.contains(paramu5))
      this.j.add(paramu5); 
  }
  
  public final t5 b(AttributeSet paramAttributeSet) {
    g7 g7;
    Context context = getContext();
    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(context, paramAttributeSet);
    ((t5)layoutParams).a = 1;
    TypedArray typedArray = context.obtainStyledAttributes(paramAttributeSet, zb1.b);
    ((t5)layoutParams).a = typedArray.getInt(1, 0);
    if (typedArray.getInt(0, 0) != 1) {
      paramAttributeSet = null;
    } else {
      g7 = new g7(4);
    } 
    ((t5)layoutParams).b = g7;
    if (typedArray.hasValue(2))
      ((t5)layoutParams).c = AnimationUtils.loadInterpolator(context, typedArray.getResourceId(2, 0)); 
    typedArray.recycle();
    return (t5)layoutParams;
  }
  
  public final boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return paramLayoutParams instanceof t5;
  }
  
  public final void d() {
    d d;
    Behavior behavior = this.C;
    if (behavior == null || this.c == -1 || this.h != 0) {
      behavior = null;
    } else {
      d = behavior.G((Parcelable)j.c, this);
    } 
    this.c = -1;
    this.e = -1;
    this.f = -1;
    if (d != null) {
      Behavior behavior1 = this.C;
      if (behavior1.m == null)
        behavior1.m = d; 
    } 
  }
  
  public final void draw(Canvas paramCanvas) {
    super.draw(paramCanvas);
    if (this.z != null && getTopInset() > 0) {
      int i = paramCanvas.save();
      paramCanvas.translate(0.0F, -this.b);
      this.z.draw(paramCanvas);
      paramCanvas.restoreToCount(i);
    } 
  }
  
  public final void drawableStateChanged() {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    Drawable drawable = this.z;
    if (drawable != null && drawable.isStateful() && drawable.setState(arrayOfInt))
      invalidateDrawable(drawable); 
  }
  
  public final void e(int paramInt) {
    this.b = paramInt;
    if (!willNotDraw())
      postInvalidateOnAnimation(); 
    ArrayList arrayList = this.j;
    if (arrayList != null) {
      int i = arrayList.size();
      for (byte b = 0; b < i; b++) {
        u5 u5 = this.j.get(b);
        if (u5 != null)
          u5.o(this, paramInt); 
      } 
    } 
  }
  
  public final void f(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    byte b1;
    byte b2;
    if (paramBoolean1) {
      b1 = 1;
    } else {
      b1 = 2;
    } 
    byte b3 = 0;
    if (paramBoolean2) {
      b2 = 4;
    } else {
      b2 = 0;
    } 
    if (paramBoolean3)
      b3 = 8; 
    this.h = b1 | b2 | b3;
    requestLayout();
  }
  
  public final boolean g(boolean paramBoolean) {
    if (!this.k && this.m != paramBoolean) {
      this.m = paramBoolean;
      refreshDrawableState();
      if (getBackground() instanceof ws0) {
        ColorStateList colorStateList = this.o;
        float f2 = 0.0F;
        float f1 = 0.0F;
        if (colorStateList != null) {
          float f;
          if (paramBoolean) {
            f = 0.0F;
          } else {
            f = 1.0F;
          } 
          if (paramBoolean)
            f1 = 1.0F; 
          i(f, f1);
        } else if (this.n) {
          float f = this.B;
          if (paramBoolean) {
            f1 = 0.0F;
          } else {
            f1 = f;
          } 
          if (paramBoolean)
            f2 = f; 
          i(f1, f2);
        } 
      } 
      return true;
    } 
    return false;
  }
  
  public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
    ((t5)layoutParams).a = 1;
    return (ViewGroup.LayoutParams)layoutParams;
  }
  
  public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
    ((t5)layoutParams).a = 1;
    return layoutParams;
  }
  
  public fs getBehavior() {
    Behavior behavior = new Behavior();
    this.C = behavior;
    return (fs)behavior;
  }
  
  public int getDownNestedPreScrollRange() {
    int i = this.e;
    if (i != -1)
      return i; 
    int k = getChildCount() - 1;
    int j;
    for (j = 0;; j = i) {
      if (k >= 0) {
        View view = getChildAt(k);
        if (view.getVisibility() == 8) {
          i = j;
        } else {
          t5 t5 = (t5)view.getLayoutParams();
          int n = view.getMeasuredHeight();
          i = t5.a;
          if ((i & 0x5) == 5) {
            int i1 = ((LinearLayout.LayoutParams)t5).topMargin + ((LinearLayout.LayoutParams)t5).bottomMargin;
            if ((i & 0x8) != 0) {
              i = view.getMinimumHeight();
            } else if ((i & 0x2) != 0) {
              i = n - view.getMinimumHeight();
            } else {
              i = i1 + n;
              i1 = i;
            } 
            i += i1;
          } else {
            i = j;
            if (j)
              break; 
            k--;
            j = i;
          } 
          int m = i;
        } 
      } else {
        break;
      } 
      k--;
    } 
    i = Math.max(0, j);
    this.e = i;
    return i;
  }
  
  public int getDownNestedScrollRange() {
    int j;
    int i = this.f;
    if (i != -1)
      return i; 
    int k = getChildCount();
    byte b = 0;
    i = 0;
    while (true) {
      j = i;
      if (b < k) {
        View view = getChildAt(b);
        if (view.getVisibility() != 8) {
          t5 t5 = (t5)view.getLayoutParams();
          int n = view.getMeasuredHeight();
          int i2 = ((LinearLayout.LayoutParams)t5).topMargin;
          int i1 = ((LinearLayout.LayoutParams)t5).bottomMargin;
          int m = t5.a;
          j = i;
          if ((m & 0x1) != 0) {
            j = i + i2 + i1 + n;
            i = j;
            if ((m & 0x2) != 0) {
              j -= view.getMinimumHeight();
              break;
            } 
          } else {
            break;
          } 
        } 
        b++;
        continue;
      } 
      break;
    } 
    i = Math.max(0, j);
    this.f = i;
    return i;
  }
  
  public int getLiftOnScrollTargetViewId() {
    return this.p;
  }
  
  public ws0 getMaterialShapeBackground() {
    Drawable drawable = getBackground();
    return (drawable instanceof ws0) ? (ws0)drawable : null;
  }
  
  public final int getMinimumHeightForVisibleOverlappingContent() {
    int j = getTopInset();
    int k = getMinimumHeight();
    if (k != 0) {
      int m = k * 2 + j;
      return (m < getHeight()) ? m : (k + j);
    } 
    int i = getChildCount();
    if (i >= 1) {
      i = getChildAt(i - 1).getMinimumHeight();
    } else {
      i = 0;
    } 
    if (i != 0) {
      k = i * 2 + j;
      return (k < getHeight()) ? k : (i + j);
    } 
    return getHeight() / 3;
  }
  
  public int getPendingAction() {
    return this.h;
  }
  
  public Drawable getStatusBarForeground() {
    return this.z;
  }
  
  @Deprecated
  public float getTargetElevation() {
    return 0.0F;
  }
  
  public final int getTopInset() {
    x62 x621 = this.i;
    return (x621 != null) ? x621.d() : 0;
  }
  
  public final int getTotalScrollRange() {
    int j;
    int i = this.c;
    if (i != -1)
      return i; 
    int k = getChildCount();
    byte b = 0;
    i = 0;
    while (true) {
      j = i;
      if (b < k) {
        View view = getChildAt(b);
        if (view.getVisibility() != 8) {
          t5 t5 = (t5)view.getLayoutParams();
          int n = view.getMeasuredHeight();
          int m = t5.a;
          j = i;
          if ((m & 0x1) != 0) {
            j = n + ((LinearLayout.LayoutParams)t5).topMargin + ((LinearLayout.LayoutParams)t5).bottomMargin + i;
            i = j;
            if (b == 0) {
              i = j;
              if (view.getFitsSystemWindows())
                i = j - getTopInset(); 
            } 
            j = i;
            i = j;
            if ((m & 0x2) != 0) {
              j -= view.getMinimumHeight();
              break;
            } 
          } else {
            break;
          } 
        } 
        b++;
        continue;
      } 
      break;
    } 
    i = Math.max(0, j);
    this.c = i;
    return i;
  }
  
  public int getUpNestedPreScrollRange() {
    return getTotalScrollRange();
  }
  
  public final boolean h(View paramView) {
    View view;
    WeakReference weakReference1 = this.q;
    WeakReference weakReference2 = null;
    if (weakReference1 == null) {
      int i = this.p;
      if (i != -1) {
        View view1;
        if (paramView != null) {
          view = paramView.findViewById(i);
        } else {
          weakReference1 = null;
        } 
        WeakReference weakReference3 = weakReference1;
        if (weakReference1 == null) {
          weakReference3 = weakReference1;
          if (getParent() instanceof ViewGroup)
            view1 = ((ViewGroup)getParent()).findViewById(this.p); 
        } 
        if (view1 != null)
          this.q = new WeakReference<View>(view1); 
      } 
    } 
    WeakReference<View> weakReference = this.q;
    weakReference1 = weakReference2;
    if (weakReference != null)
      view = weakReference.get(); 
    if (view != null)
      paramView = view; 
    return (paramView != null && (paramView.canScrollVertically(-1) || paramView.getScrollY() > 0));
  }
  
  public final void i(float paramFloat1, float paramFloat2) {
    ValueAnimator valueAnimator = this.r;
    if (valueAnimator != null)
      valueAnimator.cancel(); 
    valueAnimator = ValueAnimator.ofFloat(new float[] { paramFloat1, paramFloat2 });
    this.r = valueAnimator;
    valueAnimator.setDuration(this.v);
    this.r.setInterpolator(this.w);
    ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.s;
    if (animatorUpdateListener != null)
      this.r.addUpdateListener(animatorUpdateListener); 
    this.r.start();
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    Drawable drawable = getBackground();
    if (drawable instanceof ws0)
      zo2.S((View)this, (ws0)drawable); 
  }
  
  public final int[] onCreateDrawableState(int paramInt) {
    if (this.x == null)
      this.x = new int[4]; 
    int[] arrayOfInt2 = this.x;
    int[] arrayOfInt1 = super.onCreateDrawableState(paramInt + arrayOfInt2.length);
    boolean bool = this.l;
    paramInt = 2130970005;
    if (!bool)
      paramInt = -2130970005; 
    arrayOfInt2[0] = paramInt;
    paramInt = 2130970006;
    if (!bool || !this.m)
      paramInt = -2130970006; 
    arrayOfInt2[1] = paramInt;
    paramInt = 2130970001;
    if (!bool)
      paramInt = -2130970001; 
    arrayOfInt2[2] = paramInt;
    paramInt = 2130970000;
    if (!bool || !this.m)
      paramInt = -2130970000; 
    arrayOfInt2[3] = paramInt;
    return View.mergeDrawableStates(arrayOfInt1, arrayOfInt2);
  }
  
  public final void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    WeakReference weakReference = this.q;
    if (weakReference != null)
      weakReference.clear(); 
    this.q = null;
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    paramBoolean = getFitsSystemWindows();
    boolean bool = true;
    if (paramBoolean && getChildCount() > 0) {
      View view = getChildAt(0);
      if (view.getVisibility() != 8 && !view.getFitsSystemWindows()) {
        paramInt2 = getTopInset();
        for (paramInt1 = getChildCount() - 1; paramInt1 >= 0; paramInt1--) {
          view = getChildAt(paramInt1);
          WeakHashMap weakHashMap = v22.a;
          view.offsetTopAndBottom(paramInt2);
        } 
      } 
    } 
    d();
    this.g = false;
    paramInt2 = getChildCount();
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++) {
      if (((t5)getChildAt(paramInt1).getLayoutParams()).c != null) {
        this.g = true;
        break;
      } 
    } 
    Drawable drawable = this.z;
    if (drawable != null)
      drawable.setBounds(0, 0, getWidth(), getTopInset()); 
    if (!this.k) {
      paramBoolean = bool;
      if (!this.n) {
        paramInt2 = getChildCount();
        paramInt1 = 0;
        while (true) {
          if (paramInt1 < paramInt2) {
            paramInt3 = ((t5)getChildAt(paramInt1).getLayoutParams()).a;
            if ((paramInt3 & 0x1) == 1 && (paramInt3 & 0xA) != 0) {
              paramBoolean = bool;
              break;
            } 
            paramInt1++;
            continue;
          } 
          paramBoolean = false;
          break;
        } 
      } 
      if (this.l != paramBoolean) {
        this.l = paramBoolean;
        refreshDrawableState();
      } 
    } 
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    int i = View.MeasureSpec.getMode(paramInt2);
    if (i != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
      View view = getChildAt(0);
      if (view.getVisibility() != 8 && !view.getFitsSystemWindows()) {
        paramInt1 = getMeasuredHeight();
        if (i != Integer.MIN_VALUE) {
          if (i == 0)
            paramInt1 += getTopInset(); 
        } else {
          paramInt1 = getMeasuredHeight();
          paramInt1 = ui0.i(getTopInset() + paramInt1, 0, View.MeasureSpec.getSize(paramInt2));
        } 
        setMeasuredDimension(getMeasuredWidth(), paramInt1);
      } 
    } 
    d();
  }
  
  public void setBackground(Drawable paramDrawable) {
    ws0 ws01;
    ws0 ws02;
    Context context = getContext();
    boolean bool = paramDrawable instanceof ws0;
    Drawable drawable2 = null;
    if (bool) {
      ws01 = (ws0)paramDrawable;
    } else {
      ColorStateList colorStateList = p8.a(paramDrawable);
      if (colorStateList == null) {
        ws01 = null;
      } else {
        ws01 = new ws0();
        ws01.o(colorStateList);
      } 
    } 
    Drawable drawable1 = paramDrawable;
    if (ws01 != null) {
      Drawable drawable;
      ColorStateList colorStateList = ws01.c.d;
      if (colorStateList == null) {
        drawable = paramDrawable;
      } else {
        TypedValue typedValue;
        this.y = drawable.getDefaultColor();
        ColorStateList colorStateList1 = this.o;
        if (colorStateList1 != null) {
          Integer integer;
          Context context1 = getContext();
          typedValue = g92.Y(context1, 2130968945);
          paramDrawable = drawable2;
          if (typedValue != null) {
            int i = typedValue.resourceId;
            if (i != 0) {
              i = context1.getColor(i);
            } else {
              i = typedValue.data;
            } 
            integer = Integer.valueOf(i);
          } 
          this.s = (ValueAnimator.AnimatorUpdateListener)new r5(this, colorStateList1, ws01, integer);
        } else {
          ws01.k((Context)typedValue);
          this.s = (ValueAnimator.AnimatorUpdateListener)new s5(0, this, ws01);
        } 
        ws02 = ws01;
      } 
    } 
    super.setBackground((Drawable)ws02);
  }
  
  public void setElevation(float paramFloat) {
    super.setElevation(paramFloat);
    Drawable drawable = getBackground();
    if (drawable instanceof ws0)
      ((ws0)drawable).n(paramFloat); 
  }
  
  public void setExpanded(boolean paramBoolean) {
    f(paramBoolean, isLaidOut(), true);
  }
  
  public void setLiftOnScroll(boolean paramBoolean) {
    this.n = paramBoolean;
  }
  
  public void setLiftOnScrollColor(ColorStateList paramColorStateList) {
    if (this.o != paramColorStateList) {
      this.o = paramColorStateList;
      setBackground(getBackground());
    } 
  }
  
  public void setLiftOnScrollTargetView(View paramView) {
    WeakReference weakReference;
    this.p = -1;
    if (paramView == null) {
      weakReference = this.q;
      if (weakReference != null)
        weakReference.clear(); 
      this.q = null;
      return;
    } 
    this.q = new WeakReference<WeakReference>(weakReference);
  }
  
  public void setLiftOnScrollTargetViewId(int paramInt) {
    this.p = paramInt;
    WeakReference weakReference = this.q;
    if (weakReference != null)
      weakReference.clear(); 
    this.q = null;
  }
  
  public void setLiftableOverrideEnabled(boolean paramBoolean) {
    this.k = paramBoolean;
  }
  
  public void setOrientation(int paramInt) {
    if (paramInt == 1) {
      super.setOrientation(paramInt);
      return;
    } 
    l0.l("AppBarLayout is always vertical and does not support horizontal orientation");
  }
  
  public void setPendingAction(int paramInt) {
    this.h = paramInt;
  }
  
  public void setStatusBarForeground(Drawable paramDrawable) {
    Drawable drawable = this.z;
    if (drawable != paramDrawable) {
      Integer integer1;
      Integer integer2 = null;
      if (drawable != null)
        drawable.setCallback(null); 
      if (paramDrawable != null) {
        paramDrawable = paramDrawable.mutate();
      } else {
        paramDrawable = null;
      } 
      this.z = paramDrawable;
      if (paramDrawable instanceof ws0) {
        integer1 = Integer.valueOf(((ws0)paramDrawable).x);
      } else {
        ColorStateList colorStateList = p8.a((Drawable)integer1);
        integer1 = integer2;
        if (colorStateList != null)
          integer1 = Integer.valueOf(colorStateList.getDefaultColor()); 
      } 
      this.A = integer1;
      Drawable drawable1 = this.z;
      boolean bool2 = false;
      if (drawable1 != null) {
        boolean bool;
        if (drawable1.isStateful())
          this.z.setState(getDrawableState()); 
        this.z.setLayoutDirection(getLayoutDirection());
        drawable1 = this.z;
        if (getVisibility() == 0) {
          bool = true;
        } else {
          bool = false;
        } 
        drawable1.setVisible(bool, false);
        this.z.setCallback((Drawable.Callback)this);
      } 
      boolean bool1 = bool2;
      if (this.z != null) {
        bool1 = bool2;
        if (getTopInset() > 0)
          bool1 = true; 
      } 
      setWillNotDraw(bool1 ^ true);
      postInvalidateOnAnimation();
    } 
  }
  
  public void setStatusBarForegroundColor(int paramInt) {
    setStatusBarForeground((Drawable)new ColorDrawable(paramInt));
  }
  
  public void setStatusBarForegroundResource(int paramInt) {
    setStatusBarForeground(ws2.I(getContext(), paramInt));
  }
  
  @Deprecated
  public void setTargetElevation(float paramFloat) {
    n21.Q(this, paramFloat);
  }
  
  public void setVisibility(int paramInt) {
    boolean bool;
    super.setVisibility(paramInt);
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    Drawable drawable = this.z;
    if (drawable != null)
      drawable.setVisible(bool, false); 
  }
  
  public final boolean verifyDrawable(Drawable paramDrawable) {
    return (super.verifyDrawable(paramDrawable) || paramDrawable == this.z);
  }
  
  public static class BaseBehavior<T extends AppBarLayout> extends mf0 {
    public int j;
    
    public int k;
    
    public ValueAnimator l;
    
    public d m;
    
    public WeakReference n;
    
    public BaseBehavior() {
      this.f = -1;
      this.h = -1;
    }
    
    public BaseBehavior(Context param1Context, AttributeSet param1AttributeSet) {
      super(0);
      this.f = -1;
      this.h = -1;
    }
    
    public static View B(BaseBehavior param1BaseBehavior, CoordinatorLayout param1CoordinatorLayout) {
      int i = param1CoordinatorLayout.getChildCount();
      for (byte b = 0; b < i; b++) {
        View view = param1CoordinatorLayout.getChildAt(b);
        if (((is)view.getLayoutParams()).a instanceof AppBarLayout.ScrollingViewBehavior)
          return view; 
      } 
      return null;
    }
    
    public static View D(CoordinatorLayout param1CoordinatorLayout) {
      int i = param1CoordinatorLayout.getChildCount();
      for (byte b = 0; b < i; b++) {
        View view = param1CoordinatorLayout.getChildAt(b);
        if (view instanceof l11 || view instanceof android.widget.AbsListView || view instanceof android.widget.ScrollView)
          return view; 
      } 
      return null;
    }
    
    public static void I(CoordinatorLayout param1CoordinatorLayout, AppBarLayout param1AppBarLayout, int param1Int1, int param1Int2, boolean param1Boolean) {
      // Byte code:
      //   0: iload_2
      //   1: invokestatic abs : (I)I
      //   4: istore #7
      //   6: aload_1
      //   7: invokevirtual getChildCount : ()I
      //   10: istore #8
      //   12: iconst_0
      //   13: istore #6
      //   15: iconst_0
      //   16: istore #5
      //   18: iload #5
      //   20: iload #8
      //   22: if_icmpge -> 62
      //   25: aload_1
      //   26: iload #5
      //   28: invokevirtual getChildAt : (I)Landroid/view/View;
      //   31: astore #10
      //   33: iload #7
      //   35: aload #10
      //   37: invokevirtual getTop : ()I
      //   40: if_icmplt -> 56
      //   43: iload #7
      //   45: aload #10
      //   47: invokevirtual getBottom : ()I
      //   50: if_icmpgt -> 56
      //   53: goto -> 65
      //   56: iinc #5, 1
      //   59: goto -> 18
      //   62: aconst_null
      //   63: astore #10
      //   65: aload #10
      //   67: ifnull -> 161
      //   70: aload #10
      //   72: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
      //   75: checkcast t5
      //   78: getfield a : I
      //   81: istore #7
      //   83: iload #7
      //   85: iconst_1
      //   86: iand
      //   87: ifeq -> 161
      //   90: aload #10
      //   92: invokevirtual getMinimumHeight : ()I
      //   95: istore #5
      //   97: iconst_1
      //   98: istore #9
      //   100: iload_3
      //   101: ifle -> 133
      //   104: iload #7
      //   106: bipush #12
      //   108: iand
      //   109: ifeq -> 133
      //   112: iload_2
      //   113: ineg
      //   114: aload #10
      //   116: invokevirtual getBottom : ()I
      //   119: iload #5
      //   121: isub
      //   122: aload_1
      //   123: invokevirtual getTopInset : ()I
      //   126: isub
      //   127: if_icmplt -> 161
      //   130: goto -> 164
      //   133: iload #7
      //   135: iconst_2
      //   136: iand
      //   137: ifeq -> 161
      //   140: iload_2
      //   141: ineg
      //   142: aload #10
      //   144: invokevirtual getBottom : ()I
      //   147: iload #5
      //   149: isub
      //   150: aload_1
      //   151: invokevirtual getTopInset : ()I
      //   154: isub
      //   155: if_icmplt -> 161
      //   158: goto -> 164
      //   161: iconst_0
      //   162: istore #9
      //   164: aload_1
      //   165: getfield n : Z
      //   168: ifeq -> 181
      //   171: aload_1
      //   172: aload_0
      //   173: invokestatic D : (Landroidx/coordinatorlayout/widget/CoordinatorLayout;)Landroid/view/View;
      //   176: invokevirtual h : (Landroid/view/View;)Z
      //   179: istore #9
      //   181: aload_1
      //   182: iload #9
      //   184: invokevirtual g : (Z)Z
      //   187: istore #9
      //   189: iload #4
      //   191: ifne -> 299
      //   194: iload #9
      //   196: ifeq -> 341
      //   199: aload_0
      //   200: getfield c : Ln2;
      //   203: getfield e : Ljava/lang/Object;
      //   206: checkcast zm1
      //   209: aload_1
      //   210: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
      //   213: checkcast java/util/List
      //   216: astore #10
      //   218: aload_0
      //   219: getfield f : Ljava/util/ArrayList;
      //   222: astore_0
      //   223: aload_0
      //   224: invokevirtual clear : ()V
      //   227: aload #10
      //   229: ifnull -> 239
      //   232: aload_0
      //   233: aload #10
      //   235: invokevirtual addAll : (Ljava/util/Collection;)Z
      //   238: pop
      //   239: aload_0
      //   240: invokevirtual size : ()I
      //   243: istore_3
      //   244: iload #6
      //   246: istore_2
      //   247: iload_2
      //   248: iload_3
      //   249: if_icmpge -> 341
      //   252: aload_0
      //   253: iload_2
      //   254: invokevirtual get : (I)Ljava/lang/Object;
      //   257: checkcast android/view/View
      //   260: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
      //   263: checkcast is
      //   266: getfield a : Lfs;
      //   269: astore #10
      //   271: aload #10
      //   273: instanceof com/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior
      //   276: ifeq -> 293
      //   279: aload #10
      //   281: checkcast com/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior
      //   284: getfield f : I
      //   287: ifeq -> 341
      //   290: goto -> 299
      //   293: iinc #2, 1
      //   296: goto -> 247
      //   299: aload_1
      //   300: invokevirtual getBackground : ()Landroid/graphics/drawable/Drawable;
      //   303: ifnull -> 313
      //   306: aload_1
      //   307: invokevirtual getBackground : ()Landroid/graphics/drawable/Drawable;
      //   310: invokevirtual jumpToCurrentState : ()V
      //   313: aload_1
      //   314: invokevirtual getForeground : ()Landroid/graphics/drawable/Drawable;
      //   317: ifnull -> 327
      //   320: aload_1
      //   321: invokevirtual getForeground : ()Landroid/graphics/drawable/Drawable;
      //   324: invokevirtual jumpToCurrentState : ()V
      //   327: aload_1
      //   328: invokevirtual getStateListAnimator : ()Landroid/animation/StateListAnimator;
      //   331: ifnull -> 341
      //   334: aload_1
      //   335: invokevirtual getStateListAnimator : ()Landroid/animation/StateListAnimator;
      //   338: invokevirtual jumpToCurrentState : ()V
      //   341: return
    }
    
    public final void C(CoordinatorLayout param1CoordinatorLayout, AppBarLayout param1AppBarLayout, int param1Int) {
      int i = Math.abs(y() - param1Int);
      float f = Math.abs(0.0F);
      if (f > 0.0F) {
        i = Math.round(i / f * 1000.0F) * 3;
      } else {
        i = (int)((i / param1AppBarLayout.getHeight() + 1.0F) * 150.0F);
      } 
      int j = y();
      ValueAnimator valueAnimator = this.l;
      if (j == param1Int) {
        if (valueAnimator != null && valueAnimator.isRunning())
          this.l.cancel(); 
        return;
      } 
      if (valueAnimator == null) {
        valueAnimator = new ValueAnimator();
        this.l = valueAnimator;
        valueAnimator.setInterpolator((TimeInterpolator)g5.e);
        this.l.addUpdateListener(new a(param1CoordinatorLayout, this, param1AppBarLayout));
      } else {
        valueAnimator.cancel();
      } 
      this.l.setDuration(Math.min(i, 600));
      this.l.setIntValues(new int[] { j, param1Int });
      this.l.start();
    }
    
    public final void E(CoordinatorLayout param1CoordinatorLayout, AppBarLayout param1AppBarLayout, View param1View, int param1Int, int[] param1ArrayOfint) {
      if (param1Int != 0) {
        int i;
        byte b;
        if (param1Int < 0) {
          i = -param1AppBarLayout.getTotalScrollRange();
          b = param1AppBarLayout.getDownNestedPreScrollRange() + i;
        } else {
          i = -param1AppBarLayout.getUpNestedPreScrollRange();
          b = 0;
        } 
        if (i != b)
          param1ArrayOfint[1] = z(param1CoordinatorLayout, (View)param1AppBarLayout, y() - param1Int, i, b); 
      } 
      if (param1AppBarLayout.n)
        param1AppBarLayout.g(param1AppBarLayout.h(param1View)); 
    }
    
    public final void F(Parcelable param1Parcelable) {
      if (param1Parcelable instanceof d) {
        this.m = (d)param1Parcelable;
        return;
      } 
      this.m = null;
    }
    
    public final d G(Parcelable param1Parcelable, AppBarLayout param1AppBarLayout) {
      int j = w();
      int k = param1AppBarLayout.getChildCount();
      boolean bool = false;
      for (int i = 0; i < k; i++) {
        View view = param1AppBarLayout.getChildAt(i);
        int m = view.getBottom() + j;
        if (view.getTop() + j <= 0 && m >= 0) {
          h h;
          Parcelable parcelable = param1Parcelable;
          if (param1Parcelable == null)
            h = j.c; 
          j j1 = new j((Parcelable)h);
          if (j == 0) {
            bool1 = true;
          } else {
            bool1 = false;
          } 
          ((d)j1).f = bool1;
          if (!bool1 && -j >= param1AppBarLayout.getTotalScrollRange()) {
            bool1 = true;
          } else {
            bool1 = false;
          } 
          ((d)j1).e = bool1;
          ((d)j1).g = i;
          i = view.getMinimumHeight();
          boolean bool1 = bool;
          if (m == param1AppBarLayout.getTopInset() + i)
            bool1 = true; 
          ((d)j1).i = bool1;
          ((d)j1).h = m / view.getHeight();
          return (d)j1;
        } 
      } 
      return null;
    }
    
    public final void H(CoordinatorLayout param1CoordinatorLayout, AppBarLayout param1AppBarLayout) {
      // Byte code:
      //   0: aload_2
      //   1: invokevirtual getTopInset : ()I
      //   4: istore_3
      //   5: aload_2
      //   6: invokevirtual getPaddingTop : ()I
      //   9: iload_3
      //   10: iadd
      //   11: istore #8
      //   13: aload_0
      //   14: invokevirtual y : ()I
      //   17: iload #8
      //   19: isub
      //   20: istore #9
      //   22: aload_2
      //   23: invokevirtual getChildCount : ()I
      //   26: istore #10
      //   28: iconst_0
      //   29: istore_3
      //   30: iload_3
      //   31: iload #10
      //   33: if_icmpge -> 136
      //   36: aload_2
      //   37: iload_3
      //   38: invokevirtual getChildAt : (I)Landroid/view/View;
      //   41: astore #11
      //   43: aload #11
      //   45: invokevirtual getTop : ()I
      //   48: istore #7
      //   50: aload #11
      //   52: invokevirtual getBottom : ()I
      //   55: istore #6
      //   57: aload #11
      //   59: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
      //   62: checkcast t5
      //   65: astore #11
      //   67: iload #7
      //   69: istore #5
      //   71: iload #6
      //   73: istore #4
      //   75: aload #11
      //   77: getfield a : I
      //   80: bipush #32
      //   82: iand
      //   83: bipush #32
      //   85: if_icmpne -> 108
      //   88: iload #7
      //   90: aload #11
      //   92: getfield topMargin : I
      //   95: isub
      //   96: istore #5
      //   98: iload #6
      //   100: aload #11
      //   102: getfield bottomMargin : I
      //   105: iadd
      //   106: istore #4
      //   108: iload #9
      //   110: ineg
      //   111: istore #6
      //   113: iload #5
      //   115: iload #6
      //   117: if_icmpgt -> 130
      //   120: iload #4
      //   122: iload #6
      //   124: if_icmplt -> 130
      //   127: goto -> 138
      //   130: iinc #3, 1
      //   133: goto -> 30
      //   136: iconst_m1
      //   137: istore_3
      //   138: iload_3
      //   139: iflt -> 372
      //   142: aload_2
      //   143: iload_3
      //   144: invokevirtual getChildAt : (I)Landroid/view/View;
      //   147: astore #11
      //   149: aload #11
      //   151: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
      //   154: checkcast t5
      //   157: astore #12
      //   159: aload #12
      //   161: getfield a : I
      //   164: istore #7
      //   166: iload #7
      //   168: bipush #17
      //   170: iand
      //   171: bipush #17
      //   173: if_icmpne -> 372
      //   176: aload #11
      //   178: invokevirtual getTop : ()I
      //   181: ineg
      //   182: istore #5
      //   184: aload #11
      //   186: invokevirtual getBottom : ()I
      //   189: ineg
      //   190: istore #6
      //   192: iload #5
      //   194: istore #4
      //   196: iload_3
      //   197: ifne -> 232
      //   200: iload #5
      //   202: istore #4
      //   204: aload_2
      //   205: invokevirtual getFitsSystemWindows : ()Z
      //   208: ifeq -> 232
      //   211: iload #5
      //   213: istore #4
      //   215: aload #11
      //   217: invokevirtual getFitsSystemWindows : ()Z
      //   220: ifeq -> 232
      //   223: iload #5
      //   225: aload_2
      //   226: invokevirtual getTopInset : ()I
      //   229: isub
      //   230: istore #4
      //   232: iload #7
      //   234: iconst_2
      //   235: iand
      //   236: iconst_2
      //   237: if_icmpne -> 256
      //   240: iload #6
      //   242: aload #11
      //   244: invokevirtual getMinimumHeight : ()I
      //   247: iadd
      //   248: istore_3
      //   249: iload #4
      //   251: istore #5
      //   253: goto -> 299
      //   256: iload #4
      //   258: istore #5
      //   260: iload #6
      //   262: istore_3
      //   263: iload #7
      //   265: iconst_5
      //   266: iand
      //   267: iconst_5
      //   268: if_icmpne -> 299
      //   271: aload #11
      //   273: invokevirtual getMinimumHeight : ()I
      //   276: iload #6
      //   278: iadd
      //   279: istore_3
      //   280: iload #9
      //   282: iload_3
      //   283: if_icmpge -> 295
      //   286: iload_3
      //   287: istore #5
      //   289: iload #6
      //   291: istore_3
      //   292: goto -> 299
      //   295: iload #4
      //   297: istore #5
      //   299: iload #5
      //   301: istore #6
      //   303: iload_3
      //   304: istore #4
      //   306: iload #7
      //   308: bipush #32
      //   310: iand
      //   311: bipush #32
      //   313: if_icmpne -> 335
      //   316: iload #5
      //   318: aload #12
      //   320: getfield topMargin : I
      //   323: iadd
      //   324: istore #6
      //   326: iload_3
      //   327: aload #12
      //   329: getfield bottomMargin : I
      //   332: isub
      //   333: istore #4
      //   335: iload #6
      //   337: istore_3
      //   338: iload #9
      //   340: iload #4
      //   342: iload #6
      //   344: iadd
      //   345: iconst_2
      //   346: idiv
      //   347: if_icmpge -> 353
      //   350: iload #4
      //   352: istore_3
      //   353: aload_0
      //   354: aload_1
      //   355: aload_2
      //   356: iload_3
      //   357: iload #8
      //   359: iadd
      //   360: aload_2
      //   361: invokevirtual getTotalScrollRange : ()I
      //   364: ineg
      //   365: iconst_0
      //   366: invokestatic i : (III)I
      //   369: invokevirtual C : (Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;I)V
      //   372: return
    }
    
    public final boolean l(CoordinatorLayout param1CoordinatorLayout, View param1View, int param1Int) {
      AppBarLayout appBarLayout = (AppBarLayout)param1View;
      super.l(param1CoordinatorLayout, (View)appBarLayout, param1Int);
      int i = appBarLayout.getPendingAction();
      d d1 = this.m;
      if (d1 != null && (i & 0x8) == 0) {
        if (d1.e) {
          A(param1CoordinatorLayout, (View)appBarLayout, -appBarLayout.getTotalScrollRange());
        } else if (d1.f) {
          A(param1CoordinatorLayout, (View)appBarLayout, 0);
        } else {
          View view = appBarLayout.getChildAt(d1.g);
          i = -view.getBottom();
          if (this.m.i) {
            param1Int = view.getMinimumHeight();
            param1Int = appBarLayout.getTopInset() + param1Int + i;
          } else {
            param1Int = Math.round(view.getHeight() * this.m.h) + i;
          } 
          A(param1CoordinatorLayout, (View)appBarLayout, param1Int);
        } 
      } else if (i != 0) {
        if ((i & 0x4) != 0) {
          param1Int = 1;
        } else {
          param1Int = 0;
        } 
        if ((i & 0x2) != 0) {
          i = -appBarLayout.getUpNestedPreScrollRange();
          if (param1Int != 0) {
            C(param1CoordinatorLayout, appBarLayout, i);
          } else {
            A(param1CoordinatorLayout, (View)appBarLayout, i);
          } 
        } else if ((i & 0x1) != 0) {
          if (param1Int != 0) {
            C(param1CoordinatorLayout, appBarLayout, 0);
          } else {
            A(param1CoordinatorLayout, (View)appBarLayout, 0);
          } 
        } 
      } 
      appBarLayout.h = 0;
      this.m = null;
      param1Int = ui0.i(w(), -appBarLayout.getTotalScrollRange(), 0);
      n32 n32 = ((m32)this).a;
      if (n32 != null) {
        n32.b(param1Int);
      } else {
        ((m32)this).b = param1Int;
      } 
      I(param1CoordinatorLayout, appBarLayout, w(), 0, true);
      appBarLayout.e(w());
      if (v22.d((View)param1CoordinatorLayout) != null)
        return true; 
      v22.n((View)param1CoordinatorLayout, new b(param1CoordinatorLayout, this, appBarLayout));
      return true;
    }
    
    public final boolean m(CoordinatorLayout param1CoordinatorLayout, View param1View, int param1Int1, int param1Int2, int param1Int3) {
      AppBarLayout appBarLayout = (AppBarLayout)param1View;
      if (((ViewGroup.MarginLayoutParams)appBarLayout.getLayoutParams()).height == -2) {
        param1CoordinatorLayout.s(param1Int1, param1Int2, View.MeasureSpec.makeMeasureSpec(0, 0), (View)appBarLayout);
        return true;
      } 
      return false;
    }
    
    public final void p(CoordinatorLayout param1CoordinatorLayout, View param1View, int param1Int1, int param1Int2, int param1Int3, int[] param1ArrayOfint) {
      AppBarLayout appBarLayout = (AppBarLayout)param1View;
      if (param1Int3 < 0) {
        param1Int1 = -appBarLayout.getDownNestedScrollRange();
        param1ArrayOfint[1] = z(param1CoordinatorLayout, (View)appBarLayout, y() - param1Int3, param1Int1, 0);
      } 
      if (param1Int3 == 0 && v22.d((View)param1CoordinatorLayout) == null)
        v22.n((View)param1CoordinatorLayout, new b(param1CoordinatorLayout, this, appBarLayout)); 
    }
    
    public final Parcelable s(CoordinatorLayout param1CoordinatorLayout, View param1View) {
      AppBarLayout appBarLayout = (AppBarLayout)param1View;
      AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
      d d1 = G((Parcelable)absSavedState, appBarLayout);
      return (Parcelable)((d1 == null) ? absSavedState : d1);
    }
    
    public final boolean t(CoordinatorLayout param1CoordinatorLayout, View param1View1, View param1View2, int param1Int1, int param1Int2) {
      boolean bool;
      AppBarLayout appBarLayout = (AppBarLayout)param1View1;
      if ((param1Int1 & 0x2) != 0 && (appBarLayout.n || appBarLayout.m || (appBarLayout.getTotalScrollRange() != 0 && param1CoordinatorLayout.getHeight() - param1View2.getHeight() <= appBarLayout.getHeight()))) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        ValueAnimator valueAnimator = this.l;
        if (valueAnimator != null)
          valueAnimator.cancel(); 
      } 
      this.n = null;
      this.k = param1Int2;
      return bool;
    }
    
    public final void u(CoordinatorLayout param1CoordinatorLayout, View param1View1, View param1View2, int param1Int) {
      AppBarLayout appBarLayout = (AppBarLayout)param1View1;
      if (this.k == 0 || param1Int == 1) {
        H(param1CoordinatorLayout, appBarLayout);
        if (appBarLayout.n)
          appBarLayout.g(appBarLayout.h(param1View2)); 
      } 
      this.n = new WeakReference<View>(param1View2);
    }
    
    public final int y() {
      return w() + this.j;
    }
    
    public final int z(CoordinatorLayout param1CoordinatorLayout, View param1View, int param1Int1, int param1Int2, int param1Int3) {
      AppBarLayout appBarLayout = (AppBarLayout)param1View;
      int j = y();
      int i = 0;
      if (param1Int2 != 0 && j >= param1Int2 && j <= param1Int3) {
        param1Int3 = ui0.i(param1Int1, param1Int2, param1Int3);
        param1Int1 = i;
        if (j != param1Int3) {
          boolean bool;
          if (appBarLayout.g) {
            i = Math.abs(param1Int3);
            param1Int2 = appBarLayout.getChildCount();
            for (param1Int1 = 0; param1Int1 < param1Int2; param1Int1++) {
              View view = appBarLayout.getChildAt(param1Int1);
              t5 t5 = (t5)view.getLayoutParams();
              Interpolator interpolator = t5.c;
              if (i >= view.getTop() && i <= view.getBottom()) {
                if (interpolator != null) {
                  int k = t5.a;
                  if ((k & 0x1) != 0) {
                    param1Int2 = view.getHeight() + ((LinearLayout.LayoutParams)t5).topMargin + ((LinearLayout.LayoutParams)t5).bottomMargin;
                    param1Int1 = param1Int2;
                    if ((k & 0x2) != 0)
                      param1Int1 = param1Int2 - view.getMinimumHeight(); 
                  } else {
                    param1Int1 = 0;
                  } 
                  param1Int2 = param1Int1;
                  if (view.getFitsSystemWindows())
                    param1Int2 = param1Int1 - appBarLayout.getTopInset(); 
                  if (param1Int2 > 0) {
                    param1Int1 = view.getTop();
                    float f = param1Int2;
                    param1Int2 = Math.round(interpolator.getInterpolation((i - param1Int1) / f) * f);
                    param1Int1 = Integer.signum(param1Int3);
                    param1Int1 = (view.getTop() + param1Int2) * param1Int1;
                    // Byte code: goto -> 274
                  } 
                } 
                break;
              } 
            } 
          } 
          param1Int1 = param1Int3;
          n32 n32 = ((m32)this).a;
          if (n32 != null) {
            bool = n32.b(param1Int1);
          } else {
            ((m32)this).b = param1Int1;
            bool = false;
          } 
          this.j = param1Int3 - param1Int1;
          if (bool)
            for (param1Int1 = 0; param1Int1 < appBarLayout.getChildCount(); param1Int1++) {
              t5 t5 = (t5)appBarLayout.getChildAt(param1Int1).getLayoutParams();
              g7 g7 = t5.b;
              if (g7 != null && (t5.a & 0x1) != 0) {
                View view = appBarLayout.getChildAt(param1Int1);
                float f1 = w();
                Rect rect1 = (Rect)g7.e;
                Rect rect2 = (Rect)g7.c;
                view.getDrawingRect(rect2);
                appBarLayout.offsetDescendantRectToMyCoords(view, rect2);
                rect2.offset(0, -appBarLayout.getTopInset());
                float f2 = rect2.top - Math.abs(f1);
                if (f2 <= 0.0F) {
                  f1 = ui0.h(Math.abs(f2 / rect2.height()), 0.0F, 1.0F);
                  f2 = -f2;
                  f1 = 1.0F - f1;
                  f1 = f2 - rect2.height() * 0.3F * (1.0F - f1 * f1);
                  view.setTranslationY(f1);
                  view.getDrawingRect(rect1);
                  rect1.offset(0, (int)-f1);
                  if (f1 >= rect1.height()) {
                    view.setAlpha(0.0F);
                  } else {
                    view.setAlpha(1.0F);
                  } 
                  view.setClipBounds(rect1);
                } else {
                  view.setClipBounds(null);
                  view.setTranslationY(0.0F);
                  view.setAlpha(1.0F);
                } 
              } 
            }  
          if (!bool && appBarLayout.g)
            param1CoordinatorLayout.i((View)appBarLayout); 
          appBarLayout.e(w());
          if (param1Int3 < j) {
            param1Int1 = -1;
          } else {
            param1Int1 = 1;
          } 
          I(param1CoordinatorLayout, appBarLayout, param1Int3, param1Int1, false);
          param1Int1 = j - param1Int3;
        } 
      } else {
        this.j = 0;
        param1Int1 = i;
      } 
      if (v22.d((View)param1CoordinatorLayout) != null)
        return param1Int1; 
      v22.n((View)param1CoordinatorLayout, new b(param1CoordinatorLayout, this, appBarLayout));
      return param1Int1;
    }
  }
  
  public static class Behavior extends BaseBehavior<AppBarLayout> {
    public Behavior() {}
    
    public Behavior(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
  }
  
  public static class ScrollingViewBehavior extends nf0 {
    public ScrollingViewBehavior() {}
    
    public ScrollingViewBehavior(Context param1Context, AttributeSet param1AttributeSet) {
      super(0);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, zb1.z);
      this.f = typedArray.getDimensionPixelSize(0, 0);
      typedArray.recycle();
    }
    
    public static AppBarLayout z(ArrayList<View> param1ArrayList) {
      int i = param1ArrayList.size();
      for (byte b = 0; b < i; b++) {
        View view = param1ArrayList.get(b);
        if (view instanceof AppBarLayout)
          return (AppBarLayout)view; 
      } 
      return null;
    }
    
    public final boolean f(View param1View1, View param1View2) {
      return param1View2 instanceof AppBarLayout;
    }
    
    public boolean h(CoordinatorLayout param1CoordinatorLayout, View param1View1, View param1View2) {
      fs fs = ((is)param1View2.getLayoutParams()).a;
      if (fs instanceof AppBarLayout.BaseBehavior) {
        AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior)fs;
        int m = param1View2.getBottom();
        int i = param1View1.getTop();
        int n = baseBehavior.j;
        int k = this.e;
        int j = y(param1View2);
        WeakHashMap weakHashMap = v22.a;
        param1View1.offsetTopAndBottom(m - i + n + k - j);
      } 
      if (param1View2 instanceof AppBarLayout) {
        AppBarLayout appBarLayout = (AppBarLayout)param1View2;
        if (appBarLayout.n)
          appBarLayout.g(appBarLayout.h(param1View1)); 
      } 
      return false;
    }
    
    public final void i(CoordinatorLayout param1CoordinatorLayout, View param1View) {
      if (param1View instanceof AppBarLayout)
        v22.n((View)param1CoordinatorLayout, null); 
    }
    
    public final boolean q(CoordinatorLayout param1CoordinatorLayout, View param1View, Rect param1Rect, boolean param1Boolean) {
      AppBarLayout appBarLayout = z(param1CoordinatorLayout.k(param1View));
      if (appBarLayout != null) {
        param1Rect = new Rect(param1Rect);
        param1Rect.offset(param1View.getLeft(), param1View.getTop());
        int j = param1CoordinatorLayout.getWidth();
        int i = param1CoordinatorLayout.getHeight();
        Rect rect = this.c;
        rect.set(0, 0, j, i);
        if (!rect.contains(param1Rect)) {
          appBarLayout.f(false, param1Boolean ^ true, true);
          return true;
        } 
      } 
      return false;
    }
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\appbar\AppBarLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */