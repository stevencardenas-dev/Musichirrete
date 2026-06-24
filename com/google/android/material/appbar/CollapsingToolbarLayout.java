package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.Toolbar;
import androidx.appcompat.widget.Toolbar;
import g5;
import g92;
import gh1;
import hm;
import im;
import java.util.ArrayList;
import java.util.WeakHashMap;
import jm;
import jy;
import km;
import m22;
import n21;
import n32;
import o30;
import qv;
import s31;
import u5;
import v22;
import vd;
import wf2;
import x62;
import zb1;
import zo2;

public class CollapsingToolbarLayout extends FrameLayout {
  public final TimeInterpolator A;
  
  public int B = -1;
  
  public jm C;
  
  public int D;
  
  public int E;
  
  public int F;
  
  public x62 G;
  
  public int H = 0;
  
  public boolean I;
  
  public int J = 0;
  
  public int K = 0;
  
  public boolean L;
  
  public int M = 0;
  
  public boolean b = true;
  
  public final int c;
  
  public ViewGroup e;
  
  public View f;
  
  public View g;
  
  public int h;
  
  public int i;
  
  public int j;
  
  public int k;
  
  public int l;
  
  public final Rect m = new Rect();
  
  public final hm n;
  
  public final hm o;
  
  public final o30 p;
  
  public boolean q;
  
  public boolean r;
  
  public final int s;
  
  public Drawable t;
  
  public Drawable u;
  
  public int v;
  
  public boolean w;
  
  public ValueAnimator x;
  
  public long y;
  
  public final TimeInterpolator z;
  
  public CollapsingToolbarLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  public CollapsingToolbarLayout(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130968890);
  }
  
  public CollapsingToolbarLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(qv.n0(paramContext, paramAttributeSet, paramInt, 2131952622), paramAttributeSet, paramInt);
    Context context = getContext();
    this.E = (getResources().getConfiguration()).orientation;
    hm hm2 = new hm((ViewGroup)this);
    this.n = hm2;
    DecelerateInterpolator decelerateInterpolator = g5.e;
    hm2.X = (TimeInterpolator)decelerateInterpolator;
    hm2.l(false);
    hm2.K = false;
    this.p = new o30(context);
    g92.m(context, paramAttributeSet, paramInt, 2131952622);
    int[] arrayOfInt = zb1.g;
    g92.o(context, paramAttributeSet, arrayOfInt, paramInt, 2131952622, new int[0]);
    TypedArray typedArray = context.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt, 2131952622);
    int i = typedArray.getInt(9, 8388691);
    paramInt = typedArray.getInt(2, 8388627);
    this.s = typedArray.getInt(3, 1);
    hm2.x(i);
    hm2.s(paramInt);
    int j = typedArray.getDimensionPixelSize(10, 0);
    this.k = j;
    this.j = j;
    this.i = j;
    this.h = j;
    if (typedArray.hasValue(13))
      this.h = typedArray.getDimensionPixelSize(13, 0); 
    if (typedArray.hasValue(12))
      this.j = typedArray.getDimensionPixelSize(12, 0); 
    if (typedArray.hasValue(14))
      this.i = typedArray.getDimensionPixelSize(14, 0); 
    if (typedArray.hasValue(11))
      this.k = typedArray.getDimensionPixelSize(11, 0); 
    if (typedArray.hasValue(15))
      this.l = typedArray.getDimensionPixelSize(15, 0); 
    this.q = typedArray.getBoolean(28, true);
    setTitle(typedArray.getText(26));
    hm2.w(2131952201);
    hm2.q(2131952169);
    if (typedArray.hasValue(16))
      hm2.w(typedArray.getResourceId(16, 0)); 
    if (typedArray.hasValue(4))
      hm2.q(typedArray.getResourceId(4, 0)); 
    if (typedArray.hasValue(31)) {
      TextUtils.TruncateAt truncateAt;
      j = typedArray.getInt(31, -1);
      if (j != 0) {
        if (j != 1) {
          if (j != 3) {
            truncateAt = TextUtils.TruncateAt.END;
          } else {
            truncateAt = TextUtils.TruncateAt.MARQUEE;
          } 
        } else {
          truncateAt = TextUtils.TruncateAt.MIDDLE;
        } 
      } else {
        truncateAt = TextUtils.TruncateAt.START;
      } 
      setTitleEllipsize(truncateAt);
    } 
    if (typedArray.hasValue(17)) {
      ColorStateList colorStateList = wf2.u(context, typedArray, 17);
      if (hm2.o != colorStateList) {
        hm2.o = colorStateList;
        hm2.l(false);
      } 
    } 
    if (typedArray.hasValue(5))
      hm2.r(wf2.u(context, typedArray, 5)); 
    this.B = typedArray.getDimensionPixelSize(22, -1);
    if (typedArray.hasValue(29)) {
      hm2.v(typedArray.getInt(29, 1));
    } else if (typedArray.hasValue(20)) {
      hm2.v(typedArray.getInt(20, 1));
    } 
    if (typedArray.hasValue(30)) {
      hm2.W = (TimeInterpolator)AnimationUtils.loadInterpolator(context, typedArray.getResourceId(30, 0));
      hm2.l(false);
    } 
    hm hm1 = new hm((ViewGroup)this);
    this.o = hm1;
    hm1.X = (TimeInterpolator)decelerateInterpolator;
    hm1.l(false);
    hm1.K = false;
    if (typedArray.hasValue(24))
      setSubtitle(typedArray.getText(24)); 
    hm1.x(i);
    hm1.s(paramInt);
    hm1.w(2131952146);
    hm1.q(2131952167);
    if (typedArray.hasValue(7))
      hm1.w(typedArray.getResourceId(7, 0)); 
    if (typedArray.hasValue(0))
      hm1.q(typedArray.getResourceId(0, 0)); 
    if (typedArray.hasValue(8)) {
      ColorStateList colorStateList = wf2.u(context, typedArray, 8);
      if (hm1.o != colorStateList) {
        hm1.o = colorStateList;
        hm1.l(false);
      } 
    } 
    if (typedArray.hasValue(1))
      hm1.r(wf2.u(context, typedArray, 1)); 
    if (typedArray.hasValue(25))
      hm1.v(typedArray.getInt(25, 1)); 
    if (typedArray.hasValue(30)) {
      hm1.W = (TimeInterpolator)AnimationUtils.loadInterpolator(context, typedArray.getResourceId(30, 0));
      hm1.l(false);
    } 
    this.y = typedArray.getInt(21, 600);
    this.z = zo2.Q(context, 2130969705, (TimeInterpolator)g5.c);
    this.A = zo2.Q(context, 2130969705, (TimeInterpolator)g5.d);
    setContentScrim(typedArray.getDrawable(6));
    setStatusBarScrim(typedArray.getDrawable(23));
    setTitleCollapseMode(typedArray.getInt(27, 0));
    this.c = typedArray.getResourceId(32, -1);
    this.I = typedArray.getBoolean(19, false);
    this.L = typedArray.getBoolean(18, false);
    typedArray.recycle();
    setWillNotDraw(false);
    gh1 gh1 = new gh1(17, this);
    WeakHashMap weakHashMap = v22.a;
    m22.c((View)this, (s31)gh1);
  }
  
  public static n32 b(View paramView) {
    n32 n322 = (n32)paramView.getTag(2131297951);
    n32 n321 = n322;
    if (n322 == null) {
      n321 = new n32(paramView);
      paramView.setTag(2131297951, n321);
    } 
    return n321;
  }
  
  private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
    Context context = getContext();
    TypedValue typedValue = g92.Y(context, 2130968947);
    ColorStateList colorStateList = null;
    if (typedValue != null) {
      int i = typedValue.resourceId;
      if (i != 0) {
        colorStateList = n21.y(context, i);
      } else {
        i = typedValue.data;
        if (i != 0)
          colorStateList = ColorStateList.valueOf(i); 
      } 
    } 
    if (colorStateList != null)
      return colorStateList.getDefaultColor(); 
    float f = getResources().getDimension(2131165340);
    o30 o301 = this.p;
    return o301.a(o301.d, f);
  }
  
  public final void a() {
    if (!this.b)
      return; 
    View view = null;
    this.e = null;
    this.f = null;
    int i = this.c;
    if (i != -1) {
      ViewGroup viewGroup = (ViewGroup)findViewById(i);
      this.e = viewGroup;
      if (viewGroup != null) {
        View view1;
        for (ViewParent viewParent = viewGroup.getParent(); viewParent != this && viewParent != null; viewParent = viewParent.getParent()) {
          if (viewParent instanceof View)
            view1 = (View)viewParent; 
        } 
        this.f = view1;
      } 
    } 
    if (this.e == null) {
      ViewGroup viewGroup;
      int j = getChildCount();
      i = 0;
      while (true) {
        View view1 = view;
        if (i < j) {
          view1 = getChildAt(i);
          if (view1 instanceof Toolbar || view1 instanceof Toolbar) {
            viewGroup = (ViewGroup)view1;
            break;
          } 
          i++;
          continue;
        } 
        break;
      } 
      this.e = viewGroup;
    } 
    c();
    this.b = false;
  }
  
  public final void c() {
    if (!this.q) {
      View view = this.g;
      if (view != null) {
        ViewParent viewParent = view.getParent();
        if (viewParent instanceof ViewGroup)
          ((ViewGroup)viewParent).removeView(this.g); 
      } 
    } 
    if (this.q && this.e != null) {
      if (this.g == null)
        this.g = new View(getContext()); 
      if (this.g.getParent() == null)
        this.e.addView(this.g, -1, -1); 
    } 
  }
  
  public final boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return paramLayoutParams instanceof im;
  }
  
  public final void d() {
    if (this.t != null || this.u != null) {
      boolean bool;
      if (getHeight() + this.D < getScrimVisibleHeightTrigger()) {
        bool = true;
      } else {
        bool = false;
      } 
      setScrimsShown(bool);
      return;
    } 
  }
  
  public final void draw(Canvas paramCanvas) {
    super.draw(paramCanvas);
    a();
    if (this.e == null) {
      Drawable drawable = this.t;
      if (drawable != null && this.v > 0) {
        drawable.mutate().setAlpha(this.v);
        this.t.draw(paramCanvas);
      } 
    } 
    if (this.q && this.r) {
      ViewGroup viewGroup = this.e;
      hm hm1 = this.o;
      hm hm2 = this.n;
      if (viewGroup != null && this.t != null && this.v > 0 && this.F == 1 && hm2.b < hm2.e) {
        int i = paramCanvas.save();
        paramCanvas.clipRect(this.t.getBounds(), Region.Op.DIFFERENCE);
        hm2.f(paramCanvas);
        hm1.f(paramCanvas);
        paramCanvas.restoreToCount(i);
      } else {
        hm2.f(paramCanvas);
        hm1.f(paramCanvas);
      } 
    } 
    if (this.u != null && this.v > 0) {
      byte b;
      x62 x621 = this.G;
      if (x621 != null) {
        b = x621.d();
      } else {
        b = 0;
      } 
      if (b) {
        this.u.setBounds(0, -this.D, getWidth(), b - this.D);
        this.u.mutate().setAlpha(this.v);
        this.u.draw(paramCanvas);
      } 
    } 
  }
  
  public final boolean drawChild(Canvas paramCanvas, View paramView, long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: getfield t : Landroid/graphics/drawable/Drawable;
    //   4: astore #8
    //   6: aload #8
    //   8: ifnull -> 143
    //   11: aload_0
    //   12: getfield v : I
    //   15: ifle -> 143
    //   18: aload_0
    //   19: getfield f : Landroid/view/View;
    //   22: astore #9
    //   24: aload #9
    //   26: ifnull -> 47
    //   29: aload #9
    //   31: aload_0
    //   32: if_acmpne -> 38
    //   35: goto -> 47
    //   38: aload_2
    //   39: aload #9
    //   41: if_acmpne -> 143
    //   44: goto -> 55
    //   47: aload_2
    //   48: aload_0
    //   49: getfield e : Landroid/view/ViewGroup;
    //   52: if_acmpne -> 143
    //   55: aload_0
    //   56: invokevirtual getWidth : ()I
    //   59: istore #7
    //   61: aload_0
    //   62: invokevirtual getHeight : ()I
    //   65: istore #6
    //   67: iload #6
    //   69: istore #5
    //   71: aload_0
    //   72: getfield F : I
    //   75: iconst_1
    //   76: if_icmpne -> 104
    //   79: iload #6
    //   81: istore #5
    //   83: aload_2
    //   84: ifnull -> 104
    //   87: iload #6
    //   89: istore #5
    //   91: aload_0
    //   92: getfield q : Z
    //   95: ifeq -> 104
    //   98: aload_2
    //   99: invokevirtual getBottom : ()I
    //   102: istore #5
    //   104: aload #8
    //   106: iconst_0
    //   107: iconst_0
    //   108: iload #7
    //   110: iload #5
    //   112: invokevirtual setBounds : (IIII)V
    //   115: aload_0
    //   116: getfield t : Landroid/graphics/drawable/Drawable;
    //   119: invokevirtual mutate : ()Landroid/graphics/drawable/Drawable;
    //   122: aload_0
    //   123: getfield v : I
    //   126: invokevirtual setAlpha : (I)V
    //   129: aload_0
    //   130: getfield t : Landroid/graphics/drawable/Drawable;
    //   133: aload_1
    //   134: invokevirtual draw : (Landroid/graphics/Canvas;)V
    //   137: iconst_1
    //   138: istore #5
    //   140: goto -> 146
    //   143: iconst_0
    //   144: istore #5
    //   146: aload_0
    //   147: aload_1
    //   148: aload_2
    //   149: lload_3
    //   150: invokespecial drawChild : (Landroid/graphics/Canvas;Landroid/view/View;J)Z
    //   153: ifne -> 166
    //   156: iload #5
    //   158: ifeq -> 164
    //   161: goto -> 166
    //   164: iconst_0
    //   165: ireturn
    //   166: iconst_1
    //   167: ireturn
  }
  
  public final void drawableStateChanged() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial drawableStateChanged : ()V
    //   4: aload_0
    //   5: invokevirtual getDrawableState : ()[I
    //   8: astore #6
    //   10: aload_0
    //   11: getfield u : Landroid/graphics/drawable/Drawable;
    //   14: astore #5
    //   16: iconst_0
    //   17: istore_2
    //   18: aload #5
    //   20: ifnull -> 43
    //   23: aload #5
    //   25: invokevirtual isStateful : ()Z
    //   28: ifeq -> 43
    //   31: aload #5
    //   33: aload #6
    //   35: invokevirtual setState : ([I)Z
    //   38: istore #4
    //   40: goto -> 46
    //   43: iconst_0
    //   44: istore #4
    //   46: aload_0
    //   47: getfield t : Landroid/graphics/drawable/Drawable;
    //   50: astore #5
    //   52: iload #4
    //   54: istore_3
    //   55: aload #5
    //   57: ifnull -> 82
    //   60: iload #4
    //   62: istore_3
    //   63: aload #5
    //   65: invokevirtual isStateful : ()Z
    //   68: ifeq -> 82
    //   71: iload #4
    //   73: aload #5
    //   75: aload #6
    //   77: invokevirtual setState : ([I)Z
    //   80: ior
    //   81: istore_3
    //   82: aload_0
    //   83: getfield n : Lhm;
    //   86: astore #5
    //   88: iload_3
    //   89: istore #4
    //   91: aload #5
    //   93: ifnull -> 160
    //   96: aload #5
    //   98: aload #6
    //   100: putfield S : [I
    //   103: aload #5
    //   105: getfield p : Landroid/content/res/ColorStateList;
    //   108: astore #6
    //   110: aload #6
    //   112: ifnull -> 123
    //   115: aload #6
    //   117: invokevirtual isStateful : ()Z
    //   120: ifne -> 147
    //   123: aload #5
    //   125: getfield o : Landroid/content/res/ColorStateList;
    //   128: astore #6
    //   130: iload_2
    //   131: istore_1
    //   132: aload #6
    //   134: ifnull -> 155
    //   137: iload_2
    //   138: istore_1
    //   139: aload #6
    //   141: invokevirtual isStateful : ()Z
    //   144: ifeq -> 155
    //   147: aload #5
    //   149: iconst_0
    //   150: invokevirtual l : (Z)V
    //   153: iconst_1
    //   154: istore_1
    //   155: iload_3
    //   156: iload_1
    //   157: ior
    //   158: istore #4
    //   160: iload #4
    //   162: ifeq -> 169
    //   165: aload_0
    //   166: invokevirtual invalidate : ()V
    //   169: return
  }
  
  public final void e(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.q) {
      View view = this.g;
      if (view != null) {
        boolean bool1 = view.isAttachedToWindow();
        int i = 0;
        boolean bool = true;
        if (bool1 && this.g.getVisibility() == 0) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        this.r = bool1;
        if (bool1 || paramBoolean) {
          int j;
          ViewGroup viewGroup1;
          Toolbar toolbar;
          if (getLayoutDirection() != 1)
            bool = false; 
          view = this.f;
          if (view == null)
            viewGroup1 = this.e; 
          n32 n32 = b((View)viewGroup1);
          im im = (im)viewGroup1.getLayoutParams();
          int i1 = getHeight() - n32.b - viewGroup1.getHeight() - ((FrameLayout.LayoutParams)im).bottomMargin;
          View view1 = this.g;
          Rect rect = this.m;
          jy.a((ViewGroup)this, view1, rect);
          ViewGroup viewGroup2 = this.e;
          if (viewGroup2 instanceof Toolbar) {
            toolbar = (Toolbar)viewGroup2;
            i = toolbar.getTitleMarginStart();
            j = toolbar.getTitleMarginEnd();
            m = toolbar.getTitleMarginTop();
            k = toolbar.getTitleMarginBottom();
          } else if (toolbar instanceof Toolbar) {
            Toolbar toolbar1 = (Toolbar)toolbar;
            i = toolbar1.getTitleMarginStart();
            j = toolbar1.getTitleMarginEnd();
            m = toolbar1.getTitleMarginTop();
            k = toolbar1.getTitleMarginBottom();
          } else {
            k = 0;
            j = 0;
            m = j;
          } 
          int i2 = rect.left;
          if (bool) {
            n = j;
          } else {
            n = i;
          } 
          int i3 = i2 + n;
          i2 = rect.right;
          if (bool) {
            n = i;
          } else {
            n = j;
          } 
          int i4 = i2 - n;
          int m = rect.top + i1 + m;
          i2 = rect.bottom + i1 - k;
          float f1 = i2;
          hm hm2 = this.o;
          TextPaint textPaint1 = hm2.V;
          textPaint1.setTextSize(hm2.n);
          textPaint1.setTypeface(hm2.x);
          textPaint1.setLetterSpacing(hm2.g0);
          float f2 = -textPaint1.ascent();
          i1 = (int)(f1 - textPaint1.descent() + f2);
          f2 = m;
          hm hm3 = this.n;
          TextPaint textPaint2 = hm3.V;
          textPaint2.setTextSize(hm3.n);
          textPaint2.setTypeface(hm3.x);
          textPaint2.setLetterSpacing(hm3.g0);
          f1 = -textPaint2.ascent();
          int n = (int)(textPaint2.descent() + f1 + f2);
          if (TextUtils.isEmpty(hm2.H)) {
            hm3.o(i3, m, i4, i2);
          } else {
            hm3.o(i3, m, i4, i1);
            hm2.o(i3, n, i4, i2);
          } 
          if (this.s == 0) {
            jy.a((ViewGroup)this, (View)this, rect);
            i3 = rect.left;
            if (bool) {
              k = j;
            } else {
              k = i;
            } 
            k = i3 + k;
            i3 = rect.right;
            if (!bool)
              i = j; 
            i = i3 - i;
            if (TextUtils.isEmpty(hm2.H)) {
              hm3.p(k, m, i, i2);
            } else {
              hm3.p(k, m, i, i1);
              hm2.p(k, n, i, i2);
            } 
          } 
          if (bool) {
            i = this.j;
          } else {
            i = this.h;
          } 
          int k = rect.top + this.i;
          if (bool) {
            j = this.h;
          } else {
            j = this.j;
          } 
          paramInt1 = paramInt3 - paramInt1 - j;
          paramInt2 = paramInt4 - paramInt2 - this.k;
          bool1 = TextUtils.isEmpty(hm2.H);
          hm hm1 = this.n;
          if (bool1) {
            hm1.u(true, i, k, paramInt1, paramInt2);
            hm3.l(paramBoolean);
            return;
          } 
          hm1.u(false, i, k, paramInt1, (int)(paramInt2 - hm2.i() + this.K - this.l));
          f1 = k;
          paramInt3 = (int)(hm3.i() + this.J + f1 + this.l);
          this.o.u(false, i, paramInt3, paramInt1, paramInt2);
          hm3.l(paramBoolean);
          hm2.l(paramBoolean);
        } 
      } 
    } 
  }
  
  public final void f() {
    ViewGroup viewGroup = this.e;
    if (viewGroup != null && this.q) {
      CharSequence charSequence1;
      boolean bool = viewGroup instanceof Toolbar;
      CharSequence charSequence2 = null;
      if (bool) {
        charSequence1 = ((Toolbar)viewGroup).getTitle();
      } else if (charSequence1 instanceof Toolbar) {
        charSequence1 = ((Toolbar)charSequence1).getTitle();
      } else {
        charSequence1 = null;
      } 
      if (TextUtils.isEmpty(this.n.H) && !TextUtils.isEmpty(charSequence1))
        setTitle(charSequence1); 
      ViewGroup viewGroup1 = this.e;
      if (viewGroup1 instanceof Toolbar) {
        charSequence1 = ((Toolbar)viewGroup1).getSubtitle();
      } else {
        charSequence1 = charSequence2;
        if (viewGroup1 instanceof Toolbar)
          charSequence1 = ((Toolbar)viewGroup1).getSubtitle(); 
      } 
      if (TextUtils.isEmpty(this.o.H) && !TextUtils.isEmpty(charSequence1))
        setSubtitle(charSequence1); 
    } 
  }
  
  public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
    ((im)layoutParams).a = 0;
    ((im)layoutParams).b = 0.5F;
    return (ViewGroup.LayoutParams)layoutParams;
  }
  
  public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
    ((im)layoutParams).a = 0;
    ((im)layoutParams).b = 0.5F;
    return layoutParams;
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(paramLayoutParams);
    ((im)layoutParams).a = 0;
    ((im)layoutParams).b = 0.5F;
    return (ViewGroup.LayoutParams)layoutParams;
  }
  
  public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    Context context = getContext();
    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(context, paramAttributeSet);
    ((im)layoutParams).a = 0;
    ((im)layoutParams).b = 0.5F;
    TypedArray typedArray = context.obtainStyledAttributes(paramAttributeSet, zb1.h);
    ((im)layoutParams).a = typedArray.getInt(0, 0);
    ((im)layoutParams).b = typedArray.getFloat(1, 0.5F);
    typedArray.recycle();
    return layoutParams;
  }
  
  public float getCollapsedSubtitleTextSize() {
    return this.o.n;
  }
  
  public Typeface getCollapsedSubtitleTypeface() {
    Typeface typeface = this.o.x;
    return (typeface != null) ? typeface : Typeface.DEFAULT;
  }
  
  public int getCollapsedTitleGravity() {
    return this.n.l;
  }
  
  public float getCollapsedTitleTextSize() {
    return this.n.n;
  }
  
  public Typeface getCollapsedTitleTypeface() {
    Typeface typeface = this.n.x;
    return (typeface != null) ? typeface : Typeface.DEFAULT;
  }
  
  public Drawable getContentScrim() {
    return this.t;
  }
  
  public float getExpandedSubtitleTextSize() {
    return this.o.m;
  }
  
  public Typeface getExpandedSubtitleTypeface() {
    Typeface typeface = this.o.A;
    return (typeface != null) ? typeface : Typeface.DEFAULT;
  }
  
  public int getExpandedTitleGravity() {
    return this.n.k;
  }
  
  public int getExpandedTitleMarginBottom() {
    return this.k;
  }
  
  public int getExpandedTitleMarginEnd() {
    return this.j;
  }
  
  public int getExpandedTitleMarginStart() {
    return this.h;
  }
  
  public int getExpandedTitleMarginTop() {
    return this.i;
  }
  
  public int getExpandedTitleSpacing() {
    return this.l;
  }
  
  public float getExpandedTitleTextSize() {
    return this.n.m;
  }
  
  public Typeface getExpandedTitleTypeface() {
    Typeface typeface = this.n.A;
    return (typeface != null) ? typeface : Typeface.DEFAULT;
  }
  
  public int getHyphenationFrequency() {
    return this.n.s0;
  }
  
  public int getLineCount() {
    StaticLayout staticLayout = this.n.j0;
    return (staticLayout != null) ? staticLayout.getLineCount() : 0;
  }
  
  public float getLineSpacingAdd() {
    return this.n.j0.getSpacingAdd();
  }
  
  public float getLineSpacingMultiplier() {
    return this.n.j0.getSpacingMultiplier();
  }
  
  public int getMaxLines() {
    return this.n.o0;
  }
  
  public int getScrimAlpha() {
    return this.v;
  }
  
  public long getScrimAnimationDuration() {
    return this.y;
  }
  
  public int getScrimVisibleHeightTrigger() {
    int i = this.B;
    if (i >= 0)
      return i + this.H + this.J + this.K + this.M; 
    x62 x621 = this.G;
    if (x621 != null) {
      i = x621.d();
    } else {
      i = 0;
    } 
    int j = getMinimumHeight();
    return (j > 0) ? Math.min(j * 2 + i, getHeight()) : (getHeight() / 3);
  }
  
  public Drawable getStatusBarScrim() {
    return this.u;
  }
  
  public CharSequence getSubtitle() {
    return this.q ? this.o.H : null;
  }
  
  public CharSequence getTitle() {
    return this.q ? this.n.H : null;
  }
  
  public int getTitleCollapseMode() {
    return this.F;
  }
  
  public TimeInterpolator getTitlePositionInterpolator() {
    return this.n.W;
  }
  
  public TextUtils.TruncateAt getTitleTextEllipsize() {
    return this.n.G;
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    ViewParent viewParent = getParent();
    if (viewParent instanceof AppBarLayout) {
      AppBarLayout appBarLayout = (AppBarLayout)viewParent;
      if (this.F == 1)
        appBarLayout.setLiftOnScroll(false); 
      setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
      if (this.C == null)
        this.C = new jm(this); 
      appBarLayout.a((u5)this.C);
      requestApplyInsets();
    } 
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    hm hm1 = this.n;
    hm1.k(paramConfiguration);
    if (this.E != paramConfiguration.orientation && this.L && hm1.b == 1.0F) {
      ViewParent viewParent = getParent();
      if (viewParent instanceof AppBarLayout) {
        AppBarLayout appBarLayout = (AppBarLayout)viewParent;
        if (appBarLayout.getPendingAction() == 0)
          appBarLayout.setPendingAction(2); 
      } 
    } 
    this.E = paramConfiguration.orientation;
  }
  
  public final void onDetachedFromWindow() {
    ViewParent viewParent = getParent();
    jm jm1 = this.C;
    if (jm1 != null && viewParent instanceof AppBarLayout) {
      ArrayList arrayList = ((AppBarLayout)viewParent).j;
      if (arrayList != null)
        arrayList.remove(jm1); 
    } 
    super.onDetachedFromWindow();
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    x62 x621 = this.G;
    boolean bool = false;
    if (x621 != null) {
      int k = x621.d();
      int j = getChildCount();
      for (byte b1 = 0; b1 < j; b1++) {
        View view = getChildAt(b1);
        if (!view.getFitsSystemWindows() && view.getTop() < k) {
          WeakHashMap weakHashMap = v22.a;
          view.offsetTopAndBottom(k);
        } 
      } 
    } 
    int i = getChildCount();
    for (byte b = 0; b < i; b++) {
      n32 n32 = b(getChildAt(b));
      View view = n32.a;
      n32.b = view.getTop();
      n32.c = view.getLeft();
    } 
    e(false, paramInt1, paramInt2, paramInt3, paramInt4);
    f();
    d();
    paramInt2 = getChildCount();
    for (paramInt1 = bool; paramInt1 < paramInt2; paramInt1++)
      b(getChildAt(paramInt1)).a(); 
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    a();
    super.onMeasure(paramInt1, paramInt2);
    int i = View.MeasureSpec.getMode(paramInt2);
    x62 x621 = this.G;
    if (x621 != null) {
      paramInt2 = x621.d();
    } else {
      paramInt2 = 0;
    } 
    if ((i == 0 || this.I) && paramInt2 > 0) {
      this.H = paramInt2;
      super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + paramInt2, 1073741824));
    } 
    f();
    if (this.q) {
      hm hm1 = this.n;
      if (!TextUtils.isEmpty(hm1.H)) {
        float f1;
        paramInt2 = getMeasuredHeight();
        i = getMeasuredWidth();
        e(true, 0, 0, i, paramInt2);
        float f3 = (this.H + this.i);
        float f2 = hm1.i();
        hm hm2 = this.o;
        if (TextUtils.isEmpty(hm2.H)) {
          f1 = 0.0F;
        } else {
          f1 = this.l + hm2.i();
        } 
        i = (int)(f2 + f3 + f1 + this.k);
        if (i > paramInt2) {
          this.M = i - paramInt2;
        } else {
          this.M = 0;
        } 
        if (this.L) {
          if (hm1.o0 > 1) {
            i = hm1.q;
            if (i > 1) {
              this.J = (i - 1) * Math.round(hm1.i());
            } else {
              this.J = 0;
            } 
          } 
          if (hm2.o0 > 1) {
            i = hm2.q;
            if (i > 1) {
              this.K = (i - 1) * Math.round(hm2.i());
            } else {
              this.K = 0;
            } 
          } 
        } 
        int k = this.M;
        int j = this.J;
        i = this.K;
        if (k + j + i > 0)
          super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(paramInt2 + k + j + i, 1073741824)); 
      } 
    } 
    ViewGroup viewGroup = this.e;
    if (viewGroup != null) {
      ViewGroup.MarginLayoutParams marginLayoutParams;
      View view = this.f;
      if (view == null || view == this) {
        ViewGroup.LayoutParams layoutParams1 = viewGroup.getLayoutParams();
        if (layoutParams1 instanceof ViewGroup.MarginLayoutParams) {
          marginLayoutParams = (ViewGroup.MarginLayoutParams)layoutParams1;
          paramInt1 = viewGroup.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        } else {
          paramInt1 = viewGroup.getMeasuredHeight();
        } 
        setMinimumHeight(paramInt1);
        return;
      } 
      ViewGroup.LayoutParams layoutParams = marginLayoutParams.getLayoutParams();
      if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
        ViewGroup.MarginLayoutParams marginLayoutParams1 = (ViewGroup.MarginLayoutParams)layoutParams;
        paramInt1 = marginLayoutParams.getMeasuredHeight() + marginLayoutParams1.topMargin + marginLayoutParams1.bottomMargin;
      } else {
        paramInt1 = marginLayoutParams.getMeasuredHeight();
      } 
      setMinimumHeight(paramInt1);
      return;
    } 
  }
  
  public final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    Drawable drawable = this.t;
    if (drawable != null) {
      ViewGroup viewGroup = this.e;
      paramInt3 = paramInt2;
      if (this.F == 1) {
        paramInt3 = paramInt2;
        if (viewGroup != null) {
          paramInt3 = paramInt2;
          if (this.q)
            paramInt3 = viewGroup.getBottom(); 
        } 
      } 
      drawable.setBounds(0, 0, paramInt1, paramInt3);
    } 
  }
  
  public void setCollapsedSubtitleTextAppearance(int paramInt) {
    this.o.q(paramInt);
  }
  
  public void setCollapsedSubtitleTextColor(int paramInt) {
    setCollapsedSubtitleTextColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setCollapsedSubtitleTextColor(ColorStateList paramColorStateList) {
    this.o.r(paramColorStateList);
  }
  
  public void setCollapsedSubtitleTextSize(float paramFloat) {
    hm hm1 = this.o;
    if (hm1.n != paramFloat) {
      hm1.n = paramFloat;
      hm1.l(false);
    } 
  }
  
  public void setCollapsedSubtitleTypeface(Typeface paramTypeface) {
    hm hm1 = this.o;
    if (hm1.t(paramTypeface))
      hm1.l(false); 
  }
  
  public void setCollapsedTitleGravity(int paramInt) {
    this.n.s(paramInt);
    this.o.s(paramInt);
  }
  
  public void setCollapsedTitleTextAppearance(int paramInt) {
    this.n.q(paramInt);
  }
  
  public void setCollapsedTitleTextColor(int paramInt) {
    setCollapsedTitleTextColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setCollapsedTitleTextColor(ColorStateList paramColorStateList) {
    this.n.r(paramColorStateList);
  }
  
  public void setCollapsedTitleTextSize(float paramFloat) {
    hm hm1 = this.n;
    if (hm1.n != paramFloat) {
      hm1.n = paramFloat;
      hm1.l(false);
    } 
  }
  
  public void setCollapsedTitleTypeface(Typeface paramTypeface) {
    hm hm1 = this.n;
    if (hm1.t(paramTypeface))
      hm1.l(false); 
  }
  
  public void setContentScrim(Drawable paramDrawable) {
    Drawable drawable = this.t;
    if (drawable != paramDrawable) {
      Drawable drawable1 = null;
      if (drawable != null)
        drawable.setCallback(null); 
      if (paramDrawable != null)
        drawable1 = paramDrawable.mutate(); 
      this.t = drawable1;
      if (drawable1 != null) {
        int k = getWidth();
        int j = getHeight();
        ViewGroup viewGroup = this.e;
        int i = j;
        if (this.F == 1) {
          i = j;
          if (viewGroup != null) {
            i = j;
            if (this.q)
              i = viewGroup.getBottom(); 
          } 
        } 
        drawable1.setBounds(0, 0, k, i);
        this.t.setCallback((Drawable.Callback)this);
        this.t.setAlpha(this.v);
      } 
      postInvalidateOnAnimation();
    } 
  }
  
  public void setContentScrimColor(int paramInt) {
    setContentScrim((Drawable)new ColorDrawable(paramInt));
  }
  
  public void setContentScrimResource(int paramInt) {
    setContentScrim(getContext().getDrawable(paramInt));
  }
  
  public void setExpandedSubtitleColor(int paramInt) {
    setExpandedSubtitleTextColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setExpandedSubtitleTextAppearance(int paramInt) {
    this.o.w(paramInt);
  }
  
  public void setExpandedSubtitleTextColor(ColorStateList paramColorStateList) {
    hm hm1 = this.o;
    if (hm1.o != paramColorStateList) {
      hm1.o = paramColorStateList;
      hm1.l(false);
    } 
  }
  
  public void setExpandedSubtitleTextSize(float paramFloat) {
    this.o.y(paramFloat);
  }
  
  public void setExpandedSubtitleTypeface(Typeface paramTypeface) {
    hm hm1 = this.o;
    if (hm1.z(paramTypeface))
      hm1.l(false); 
  }
  
  public void setExpandedTitleColor(int paramInt) {
    setExpandedTitleTextColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setExpandedTitleGravity(int paramInt) {
    this.n.x(paramInt);
    this.o.x(paramInt);
  }
  
  public void setExpandedTitleMarginBottom(int paramInt) {
    this.k = paramInt;
    requestLayout();
  }
  
  public void setExpandedTitleMarginEnd(int paramInt) {
    this.j = paramInt;
    requestLayout();
  }
  
  public void setExpandedTitleMarginStart(int paramInt) {
    this.h = paramInt;
    requestLayout();
  }
  
  public void setExpandedTitleMarginTop(int paramInt) {
    this.i = paramInt;
    requestLayout();
  }
  
  public void setExpandedTitleSpacing(int paramInt) {
    this.l = paramInt;
    requestLayout();
  }
  
  public void setExpandedTitleTextAppearance(int paramInt) {
    this.n.w(paramInt);
  }
  
  public void setExpandedTitleTextColor(ColorStateList paramColorStateList) {
    hm hm1 = this.n;
    if (hm1.o != paramColorStateList) {
      hm1.o = paramColorStateList;
      hm1.l(false);
    } 
  }
  
  public void setExpandedTitleTextSize(float paramFloat) {
    this.n.y(paramFloat);
  }
  
  public void setExpandedTitleTypeface(Typeface paramTypeface) {
    hm hm1 = this.n;
    if (hm1.z(paramTypeface))
      hm1.l(false); 
  }
  
  public void setExtraMultilineHeightEnabled(boolean paramBoolean) {
    this.L = paramBoolean;
  }
  
  public void setForceApplySystemWindowInsetTop(boolean paramBoolean) {
    this.I = paramBoolean;
  }
  
  public void setHyphenationFrequency(int paramInt) {
    this.n.s0 = paramInt;
  }
  
  public void setLineSpacingAdd(float paramFloat) {
    this.n.q0 = paramFloat;
  }
  
  public void setLineSpacingMultiplier(float paramFloat) {
    this.n.r0 = paramFloat;
  }
  
  public void setMaxLines(int paramInt) {
    this.n.v(paramInt);
    this.o.v(paramInt);
  }
  
  public void setRtlTextDirectionHeuristicsEnabled(boolean paramBoolean) {
    this.n.K = paramBoolean;
  }
  
  public void setScrimAlpha(int paramInt) {
    if (paramInt != this.v) {
      if (this.t != null) {
        ViewGroup viewGroup = this.e;
        if (viewGroup != null)
          viewGroup.postInvalidateOnAnimation(); 
      } 
      this.v = paramInt;
      postInvalidateOnAnimation();
    } 
  }
  
  public void setScrimAnimationDuration(long paramLong) {
    this.y = paramLong;
  }
  
  public void setScrimVisibleHeightTrigger(int paramInt) {
    if (this.B != paramInt) {
      this.B = paramInt;
      d();
    } 
  }
  
  public void setScrimsShown(boolean paramBoolean) {
    char c1;
    boolean bool1 = isLaidOut();
    boolean bool = false;
    char c2 = Character.MIN_VALUE;
    if (bool1 && !isInEditMode()) {
      c1 = '\001';
    } else {
      c1 = Character.MIN_VALUE;
    } 
    if (this.w != paramBoolean) {
      if (c1) {
        TimeInterpolator timeInterpolator;
        c1 = c2;
        if (paramBoolean)
          c1 = 'ÿ'; 
        a();
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator == null) {
          ValueAnimator valueAnimator1 = new ValueAnimator();
          this.x = valueAnimator1;
          if (c1 > this.v) {
            timeInterpolator = this.z;
          } else {
            timeInterpolator = this.A;
          } 
          valueAnimator1.setInterpolator(timeInterpolator);
          this.x.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new vd(2, this));
        } else if (timeInterpolator.isRunning()) {
          this.x.cancel();
        } 
        this.x.setDuration(this.y);
        this.x.setIntValues(new int[] { this.v, c1 });
        this.x.start();
      } else {
        c1 = bool;
        if (paramBoolean)
          c1 = 'ÿ'; 
        setScrimAlpha(c1);
      } 
      this.w = paramBoolean;
    } 
  }
  
  public void setStaticLayoutBuilderConfigurer(km paramkm) {
    hm hm1 = this.n;
    hm1.getClass();
    if (paramkm != null)
      hm1.l(true); 
  }
  
  public void setStatusBarScrim(Drawable paramDrawable) {
    Drawable drawable = this.u;
    if (drawable != paramDrawable) {
      Drawable drawable1 = null;
      if (drawable != null)
        drawable.setCallback(null); 
      if (paramDrawable != null)
        drawable1 = paramDrawable.mutate(); 
      this.u = drawable1;
      if (drawable1 != null) {
        boolean bool;
        if (drawable1.isStateful())
          this.u.setState(getDrawableState()); 
        this.u.setLayoutDirection(getLayoutDirection());
        paramDrawable = this.u;
        if (getVisibility() == 0) {
          bool = true;
        } else {
          bool = false;
        } 
        paramDrawable.setVisible(bool, false);
        this.u.setCallback((Drawable.Callback)this);
        this.u.setAlpha(this.v);
      } 
      postInvalidateOnAnimation();
    } 
  }
  
  public void setStatusBarScrimColor(int paramInt) {
    setStatusBarScrim((Drawable)new ColorDrawable(paramInt));
  }
  
  public void setStatusBarScrimResource(int paramInt) {
    setStatusBarScrim(getContext().getDrawable(paramInt));
  }
  
  public void setSubtitle(CharSequence paramCharSequence) {
    this.o.B(paramCharSequence);
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    this.n.B(paramCharSequence);
    setContentDescription(getTitle());
  }
  
  public void setTitleCollapseMode(int paramInt) {
    boolean bool;
    this.F = paramInt;
    if (paramInt == 1) {
      bool = true;
    } else {
      bool = false;
    } 
    this.n.c = bool;
    this.o.c = bool;
    ViewParent viewParent = getParent();
    if (viewParent instanceof AppBarLayout) {
      AppBarLayout appBarLayout = (AppBarLayout)viewParent;
      if (this.F == 1)
        appBarLayout.setLiftOnScroll(false); 
    } 
    if (bool && this.t == null)
      setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode()); 
  }
  
  public void setTitleEllipsize(TextUtils.TruncateAt paramTruncateAt) {
    hm hm1 = this.n;
    hm1.G = paramTruncateAt;
    hm1.l(false);
  }
  
  public void setTitleEnabled(boolean paramBoolean) {
    if (paramBoolean != this.q) {
      this.q = paramBoolean;
      setContentDescription(getTitle());
      c();
      requestLayout();
    } 
  }
  
  public void setTitlePositionInterpolator(TimeInterpolator paramTimeInterpolator) {
    hm hm1 = this.n;
    hm1.W = paramTimeInterpolator;
    hm1.l(false);
  }
  
  public void setVisibility(int paramInt) {
    boolean bool;
    super.setVisibility(paramInt);
    if (paramInt == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    Drawable drawable = this.u;
    if (drawable != null && drawable.isVisible() != bool)
      this.u.setVisible(bool, false); 
    drawable = this.t;
    if (drawable != null && drawable.isVisible() != bool)
      this.t.setVisible(bool, false); 
  }
  
  public final boolean verifyDrawable(Drawable paramDrawable) {
    return (super.verifyDrawable(paramDrawable) || paramDrawable == this.t || paramDrawable == this.u);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\appbar\CollapsingToolbarLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */