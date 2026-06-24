package com.google.android.material.tabs;

import a91;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import az0;
import g5;
import g92;
import java.util.ArrayList;
import java.util.Iterator;
import kt;
import l0;
import n21;
import n30;
import nc1;
import p51;
import p8;
import qv;
import r32;
import rs1;
import ss1;
import t32;
import ts1;
import vd;
import vs1;
import wf2;
import ws0;
import ws1;
import ws2;
import xs1;
import z81;
import zb0;
import zb1;
import zo2;
import zs1;

public class TabLayout extends HorizontalScrollView {
  public static final a91 c0 = new a91(16);
  
  public final int A;
  
  public final int B;
  
  public int C;
  
  public final int D;
  
  public int E;
  
  public int F;
  
  public boolean G;
  
  public boolean H;
  
  public int I;
  
  public int J;
  
  public boolean K;
  
  public zb0 L;
  
  public final TimeInterpolator M;
  
  public ss1 N;
  
  public final ArrayList O;
  
  public az0 P;
  
  public ValueAnimator Q;
  
  public t32 R;
  
  public p51 S;
  
  public kt T;
  
  public xs1 U;
  
  public rs1 V;
  
  public boolean W;
  
  public int a0;
  
  public int b;
  
  public final z81 b0;
  
  public final ArrayList c;
  
  public ws1 e;
  
  public final vs1 f;
  
  public final int g;
  
  public final int h;
  
  public final int i;
  
  public final int j;
  
  public final int k;
  
  public final int l;
  
  public final int m;
  
  public ColorStateList n;
  
  public ColorStateList o;
  
  public ColorStateList p;
  
  public Drawable q;
  
  public int r;
  
  public final PorterDuff.Mode s;
  
  public final float t;
  
  public final float u;
  
  public final float v;
  
  public final int w;
  
  public int x;
  
  public final int y;
  
  public final int z;
  
  public TabLayout(Context paramContext) {
    this(paramContext, null);
  }
  
  public TabLayout(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130970075);
  }
  
  public TabLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(qv.n0(paramContext, paramAttributeSet, paramInt, 2131952627), paramAttributeSet, paramInt);
    int[] arrayOfInt1;
    this.b = -1;
    this.c = new ArrayList();
    this.m = -1;
    this.r = 0;
    this.x = Integer.MAX_VALUE;
    this.I = -1;
    this.O = new ArrayList();
    this.b0 = new z81(12);
    paramContext = getContext();
    setHorizontalScrollBarEnabled(false);
    vs1 vs11 = new vs1(this, paramContext);
    this.f = vs11;
    super.addView((View)vs11, 0, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-2, -1));
    TypedArray typedArray1 = g92.S(paramContext, paramAttributeSet, zb1.H, paramInt, 2131952627, new int[] { 24 });
    ColorStateList colorStateList = p8.a(getBackground());
    if (colorStateList != null) {
      ws0 ws0 = new ws0();
      ws0.o(colorStateList);
      ws0.k(paramContext);
      ws0.n(getElevation());
      setBackground((Drawable)ws0);
    } 
    setSelectedTabIndicator(wf2.y(paramContext, typedArray1, 5));
    setSelectedTabIndicatorColor(typedArray1.getColor(8, 0));
    vs11.b(typedArray1.getDimensionPixelSize(11, -1));
    setSelectedTabIndicatorGravity(typedArray1.getInt(10, 0));
    setTabIndicatorAnimationMode(typedArray1.getInt(7, 0));
    setTabIndicatorFullWidth(typedArray1.getBoolean(9, true));
    paramInt = typedArray1.getDimensionPixelSize(16, 0);
    this.j = paramInt;
    this.i = paramInt;
    this.h = paramInt;
    this.g = paramInt;
    this.g = typedArray1.getDimensionPixelSize(19, paramInt);
    this.h = typedArray1.getDimensionPixelSize(20, paramInt);
    this.i = typedArray1.getDimensionPixelSize(18, paramInt);
    this.j = typedArray1.getDimensionPixelSize(17, paramInt);
    if (g92.a0(paramContext, 2130969357, false)) {
      this.k = 2130970134;
    } else {
      this.k = 2130970092;
    } 
    paramInt = typedArray1.getResourceId(24, 2131952211);
    this.l = paramInt;
    int[] arrayOfInt2 = nc1.x;
    TypedArray typedArray2 = paramContext.obtainStyledAttributes(paramInt, arrayOfInt2);
    try {
      float f = typedArray2.getDimensionPixelSize(0, 0);
      this.t = f;
      this.n = wf2.u(paramContext, typedArray2, 3);
      typedArray2.recycle();
      if (typedArray1.hasValue(22))
        this.m = typedArray1.getResourceId(22, paramInt); 
      paramInt = this.m;
      int[] arrayOfInt = HorizontalScrollView.EMPTY_STATE_SET;
      arrayOfInt1 = HorizontalScrollView.SELECTED_STATE_SET;
      if (paramInt != -1) {
        TypedArray typedArray = paramContext.obtainStyledAttributes(paramInt, arrayOfInt2);
        paramInt = (int)f;
        try {
          this.u = typedArray.getDimensionPixelSize(0, paramInt);
          ColorStateList colorStateList1 = wf2.u(paramContext, typedArray, 3);
          if (colorStateList1 != null) {
            paramInt = this.n.getDefaultColor();
            int i = colorStateList1.getDefaultColor();
            i = colorStateList1.getColorForState(new int[] { 16842913 }, i);
            colorStateList1 = new ColorStateList();
            this(new int[][] { arrayOfInt1, arrayOfInt }, new int[] { i, paramInt });
            this.n = colorStateList1;
          } 
        } finally {}
        typedArray.recycle();
      } 
      if (typedArray1.hasValue(25))
        this.n = wf2.u(paramContext, typedArray1, 25); 
      if (typedArray1.hasValue(23)) {
        int i = typedArray1.getColor(23, 0);
        paramInt = this.n.getDefaultColor();
        this.n = new ColorStateList(new int[][] { arrayOfInt1, arrayOfInt }, new int[] { i, paramInt });
      } 
      this.o = wf2.u(paramContext, typedArray1, 3);
      this.s = n21.N(typedArray1.getInt(4, -1), null);
      this.p = wf2.u(paramContext, typedArray1, 21);
      this.D = typedArray1.getInt(6, 300);
      this.M = zo2.Q(paramContext, 2130969699, (TimeInterpolator)g5.b);
      this.y = typedArray1.getDimensionPixelSize(14, -1);
      this.z = typedArray1.getDimensionPixelSize(13, -1);
      this.w = typedArray1.getResourceId(0, 0);
      this.B = typedArray1.getDimensionPixelSize(1, 0);
      this.F = typedArray1.getInt(15, 1);
      this.C = typedArray1.getInt(2, 0);
      this.G = typedArray1.getBoolean(12, false);
      this.K = typedArray1.getBoolean(26, false);
      typedArray1.recycle();
      Resources resources = getResources();
      this.v = resources.getDimensionPixelSize(2131165386);
      this.A = resources.getDimensionPixelSize(2131165384);
      return;
    } finally {
      arrayOfInt1.recycle();
    } 
  }
  
  private int getDefaultHeight() {
    ArrayList<ws1> arrayList = this.c;
    int i = arrayList.size();
    for (byte b = 0; b < i; b++) {
      ws1 ws11 = arrayList.get(b);
      if (ws11 != null && ws11.b != null && !TextUtils.isEmpty(ws11.c)) {
        if (!this.G)
          return 72; 
        break;
      } 
    } 
    return 48;
  }
  
  private int getTabMinWidth() {
    int i = this.y;
    if (i != -1)
      return i; 
    i = this.F;
    return (i == 0 || i == 2) ? this.A : 0;
  }
  
  private int getTabScrollRange() {
    return Math.max(0, this.f.getWidth() - getWidth() - getPaddingLeft() - getPaddingRight());
  }
  
  private void setSelectedTabView(int paramInt) {
    vs1 vs11 = this.f;
    int i = vs11.getChildCount();
    if (paramInt < i)
      for (byte b = 0; b < i; b++) {
        View view = vs11.getChildAt(b);
        boolean bool2 = true;
        boolean bool1 = true;
        if ((b == paramInt && !view.isSelected()) || (b != paramInt && view.isSelected())) {
          boolean bool;
          if (b == paramInt) {
            bool = true;
          } else {
            bool = false;
          } 
          view.setSelected(bool);
          if (b == paramInt) {
            bool = bool1;
          } else {
            bool = false;
          } 
          view.setActivated(bool);
          if (view instanceof zs1)
            ((zs1)view).f(); 
        } else {
          boolean bool;
          if (b == paramInt) {
            bool = true;
          } else {
            bool = false;
          } 
          view.setSelected(bool);
          if (b == paramInt) {
            bool = bool2;
          } else {
            bool = false;
          } 
          view.setActivated(bool);
        } 
      }  
  }
  
  public final void a(ss1 paramss1) {
    ArrayList<ss1> arrayList = this.O;
    if (!arrayList.contains(paramss1))
      arrayList.add(paramss1); 
  }
  
  public final void addView(View paramView) {
    c(paramView);
  }
  
  public final void addView(View paramView, int paramInt) {
    c(paramView);
  }
  
  public final void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    c(paramView);
  }
  
  public final void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams) {
    c(paramView);
  }
  
  public final void b(ws1 paramws1, boolean paramBoolean) {
    ArrayList<ws1> arrayList = this.c;
    int i = arrayList.size();
    if (paramws1.g == this) {
      paramws1.e = i;
      arrayList.add(i, paramws1);
      int k = arrayList.size();
      i++;
      int j = -1;
      while (i < k) {
        if (((ws1)arrayList.get(i)).e == this.b)
          j = i; 
        ((ws1)arrayList.get(i)).e = i;
        i++;
      } 
      this.b = j;
      zs1 zs1 = paramws1.h;
      zs1.setSelected(false);
      zs1.setActivated(false);
      i = paramws1.e;
      LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
      if (this.F == 1 && this.C == 0) {
        layoutParams.width = 0;
        layoutParams.weight = 1.0F;
      } else {
        layoutParams.width = -2;
        layoutParams.weight = 0.0F;
      } 
      this.f.addView((View)zs1, i, (ViewGroup.LayoutParams)layoutParams);
      if (paramBoolean) {
        TabLayout tabLayout = paramws1.g;
        if (tabLayout != null) {
          tabLayout.m(paramws1, true);
          return;
        } 
        l0.l("Tab not attached to a TabLayout");
      } 
      return;
    } 
    l0.l("Tab belongs to a different TabLayout.");
  }
  
  public final void c(View paramView) {
    if (paramView instanceof TabItem) {
      TabItem tabItem = (TabItem)paramView;
      ws1 ws11 = i();
      CharSequence charSequence = tabItem.b;
      if (charSequence != null) {
        if (TextUtils.isEmpty(ws11.d) && !TextUtils.isEmpty(charSequence))
          ws11.h.setContentDescription(charSequence); 
        ws11.c = charSequence;
        zs1 zs1 = ws11.h;
        if (zs1 != null)
          zs1.d(); 
      } 
      Drawable drawable = tabItem.c;
      if (drawable != null) {
        ws11.b = drawable;
        TabLayout tabLayout = ws11.g;
        if (tabLayout.C == 1 || tabLayout.F == 2)
          tabLayout.q(true); 
        zs1 zs1 = ws11.h;
        if (zs1 != null)
          zs1.d(); 
      } 
      int i = tabItem.e;
      if (i != 0) {
        ws11.f = LayoutInflater.from(ws11.h.getContext()).inflate(i, (ViewGroup)ws11.h, false);
        zs1 zs1 = ws11.h;
        if (zs1 != null)
          zs1.d(); 
      } 
      if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
        ws11.d = tabItem.getContentDescription();
        zs1 zs1 = ws11.h;
        if (zs1 != null)
          zs1.d(); 
      } 
      b(ws11, this.c.isEmpty());
      return;
    } 
    l0.l("Only TabItem instances can be added to TabLayout");
  }
  
  public final void d(int paramInt) {
    if (paramInt == -1)
      return; 
    if (getWindowToken() != null && isLaidOut()) {
      vs1 vs11 = this.f;
      int j = vs11.getChildCount();
      int i;
      for (i = 0; i < j; i++) {
        if (vs11.getChildAt(i).getWidth() <= 0)
          // Byte code: goto -> 158 
      } 
      i = getScrollX();
      j = f(paramInt, 0.0F);
      if (i != j) {
        g();
        this.Q.setIntValues(new int[] { i, j });
        this.Q.start();
      } 
      ValueAnimator valueAnimator = vs11.b;
      if (valueAnimator != null && valueAnimator.isRunning() && vs11.c.b != paramInt)
        vs11.b.cancel(); 
      vs11.d(paramInt, this.D, true);
      return;
    } 
    o(paramInt, 0.0F, true, true, true);
  }
  
  public final void e() {
    int i = this.F;
    if (i == 0 || i == 2) {
      i = Math.max(0, this.B - this.g);
    } else {
      i = 0;
    } 
    vs1 vs11 = this.f;
    vs11.setPaddingRelative(i, 0, 0, 0);
    i = this.F;
    if (i != 0) {
      if (i == 1 || i == 2) {
        if (this.C == 2)
          Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"); 
        vs11.setGravity(1);
      } 
    } else {
      i = this.C;
      if (i != 0) {
        if (i != 1) {
          if (i != 2)
            q(true); 
        } else {
          vs11.setGravity(1);
          q(true);
        } 
      } else {
        Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
      } 
      vs11.setGravity(8388611);
    } 
    q(true);
  }
  
  public final int f(int paramInt, float paramFloat) {
    int j = this.F;
    int i = 0;
    if (j == 0 || j == 2) {
      vs1 vs11 = this.f;
      View view = vs11.getChildAt(paramInt);
      if (view == null)
        return 0; 
      if (++paramInt < vs11.getChildCount()) {
        View view1 = vs11.getChildAt(paramInt);
      } else {
        vs11 = null;
      } 
      j = view.getWidth();
      paramInt = i;
      if (vs11 != null)
        paramInt = vs11.getWidth(); 
      i = view.getLeft();
      i = j / 2 + i - getWidth() / 2;
      paramInt = (int)((j + paramInt) * 0.5F * paramFloat);
      return (getLayoutDirection() == 0) ? (i + paramInt) : (i - paramInt);
    } 
    return 0;
  }
  
  public final void g() {
    if (this.Q == null) {
      ValueAnimator valueAnimator = new ValueAnimator();
      this.Q = valueAnimator;
      valueAnimator.setInterpolator(this.M);
      this.Q.setDuration(this.D);
      this.Q.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new vd(6, this));
    } 
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    return (ViewGroup.LayoutParams)generateDefaultLayoutParams();
  }
  
  public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    return generateDefaultLayoutParams();
  }
  
  public int getSelectedTabPosition() {
    ws1 ws11 = this.e;
    return (ws11 != null) ? ws11.e : -1;
  }
  
  public int getTabCount() {
    return this.c.size();
  }
  
  public int getTabGravity() {
    return this.C;
  }
  
  public ColorStateList getTabIconTint() {
    return this.o;
  }
  
  public int getTabIndicatorAnimationMode() {
    return this.J;
  }
  
  public int getTabIndicatorGravity() {
    return this.E;
  }
  
  public int getTabMaxWidth() {
    return this.x;
  }
  
  public int getTabMode() {
    return this.F;
  }
  
  public ColorStateList getTabRippleColor() {
    return this.p;
  }
  
  public Drawable getTabSelectedIndicator() {
    return this.q;
  }
  
  public ColorStateList getTabTextColors() {
    return this.n;
  }
  
  public final ws1 h(int paramInt) {
    return (paramInt < 0 || paramInt >= getTabCount()) ? null : this.c.get(paramInt);
  }
  
  public final ws1 i() {
    zs1 zs1;
    ws1 ws11 = (ws1)c0.b();
    Object object = ws11;
    if (ws11 == null) {
      object = new Object();
      ((ws1)object).e = -1;
    } 
    ((ws1)object).g = this;
    z81 z811 = this.b0;
    if (z811 != null) {
      zs1 zs11 = (zs1)z811.b();
    } else {
      z811 = null;
    } 
    z81 z812 = z811;
    if (z811 == null)
      zs1 = new zs1(this, getContext()); 
    zs1.setTab((ws1)object);
    zs1.setFocusable(true);
    zs1.setMinimumWidth(getTabMinWidth());
    if (TextUtils.isEmpty(((ws1)object).d)) {
      zs1.setContentDescription(((ws1)object).c);
    } else {
      zs1.setContentDescription(((ws1)object).d);
    } 
    ((ws1)object).h = zs1;
    return (ws1)object;
  }
  
  public final void j() {
    int i;
    for (i = this.f.getChildCount() - 1; i >= 0; i--)
      l(i); 
    Iterator<ws1> iterator = this.c.iterator();
    while (iterator.hasNext()) {
      ws1 ws11 = iterator.next();
      iterator.remove();
      ws11.g = null;
      ws11.h = null;
      ws11.a = null;
      ws11.b = null;
      ws11.c = null;
      ws11.d = null;
      ws11.e = -1;
      ws11.f = null;
      c0.a(ws11);
    } 
    this.e = null;
    p51 p511 = this.S;
    if (p511 != null) {
      int j = p511.c();
      for (i = 0; i < j; i++) {
        ws1 ws11 = i();
        this.S.getClass();
        if (TextUtils.isEmpty(ws11.d) && !TextUtils.isEmpty(null))
          ws11.h.setContentDescription(null); 
        ws11.c = null;
        zs1 zs1 = ws11.h;
        if (zs1 != null)
          zs1.d(); 
        b(ws11, false);
      } 
      t32 t321 = this.R;
      if (t321 != null && j > 0) {
        i = t321.getCurrentItem();
        if (i != getSelectedTabPosition() && i < getTabCount())
          m(h(i), true); 
      } 
    } 
  }
  
  public final void k(int paramInt) {
    int j;
    ws1 ws11 = this.e;
    if (ws11 != null) {
      j = ws11.e;
    } else {
      j = 0;
    } 
    l(paramInt);
    ArrayList<ws1> arrayList = this.c;
    ws1 ws12 = arrayList.remove(paramInt);
    int k = -1;
    ws11 = null;
    if (ws12 != null) {
      ws12.g = null;
      ws12.h = null;
      ws12.a = null;
      ws12.b = null;
      ws12.c = null;
      ws12.d = null;
      ws12.e = -1;
      ws12.f = null;
      c0.a(ws12);
    } 
    int m = arrayList.size();
    for (int i = paramInt; i < m; i++) {
      if (((ws1)arrayList.get(i)).e == this.b)
        k = i; 
      ((ws1)arrayList.get(i)).e = i;
    } 
    this.b = k;
    if (j == paramInt) {
      if (!arrayList.isEmpty())
        ws11 = arrayList.get(Math.max(0, paramInt - 1)); 
      m(ws11, true);
    } 
  }
  
  public final void l(int paramInt) {
    vs1 vs11 = this.f;
    zs1 zs1 = (zs1)vs11.getChildAt(paramInt);
    vs11.removeViewAt(paramInt);
    if (zs1 != null) {
      zs1.setTab(null);
      zs1.setSelected(false);
      this.b0.a(zs1);
    } 
    requestLayout();
  }
  
  public final void m(ws1 paramws1, boolean paramBoolean) {
    ws1 ws11 = this.e;
    ArrayList<ss1> arrayList = this.O;
    if (ws11 == paramws1) {
      if (ws11 != null) {
        for (int i = arrayList.size() - 1; i >= 0; i--)
          ((ss1)arrayList.get(i)).a(paramws1); 
        d(paramws1.e);
        return;
      } 
    } else {
      int i;
      if (paramws1 != null) {
        i = paramws1.e;
      } else {
        i = -1;
      } 
      if (paramBoolean) {
        if ((ws11 == null || ws11.e == -1) && i != -1) {
          o(i, 0.0F, true, true, true);
        } else {
          d(i);
        } 
        if (i != -1)
          setSelectedTabView(i); 
      } 
      this.e = paramws1;
      if (ws11 != null && ws11.g != null)
        for (i = arrayList.size() - 1; i >= 0; i--)
          ((ss1)arrayList.get(i)).getClass();  
      if (paramws1 != null)
        for (i = arrayList.size() - 1; i >= 0; i--)
          ((ss1)arrayList.get(i)).b(paramws1);  
    } 
  }
  
  public final void n(p51 paramp51, boolean paramBoolean) {
    p51 p511 = this.S;
    if (p511 != null) {
      kt kt1 = this.T;
      if (kt1 != null)
        p511.a.unregisterObserver(kt1); 
    } 
    this.S = paramp51;
    if (paramBoolean && paramp51 != null) {
      if (this.T == null)
        this.T = new kt(2, this); 
      kt kt1 = this.T;
      paramp51.a.registerObserver(kt1);
    } 
    j();
  }
  
  public final void o(int paramInt, float paramFloat, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
    float f = paramInt + paramFloat;
    int i = Math.round(f);
    if (i >= 0) {
      vs1 vs11 = this.f;
      if (i < vs11.getChildCount()) {
        int j;
        if (paramBoolean2) {
          vs11.c.b = Math.round(f);
          ValueAnimator valueAnimator1 = vs11.b;
          if (valueAnimator1 != null && valueAnimator1.isRunning())
            vs11.b.cancel(); 
          vs11.c(vs11.getChildAt(paramInt), vs11.getChildAt(paramInt + 1), paramFloat);
        } 
        ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null && valueAnimator.isRunning())
          this.Q.cancel(); 
        int k = f(paramInt, paramFloat);
        int m = getScrollX();
        if ((paramInt < getSelectedTabPosition() && k >= m) || (paramInt > getSelectedTabPosition() && k <= m) || paramInt == getSelectedTabPosition()) {
          j = 1;
        } else {
          j = 0;
        } 
        if (getLayoutDirection() == 1)
          if ((paramInt < getSelectedTabPosition() && k <= m) || (paramInt > getSelectedTabPosition() && k >= m) || paramInt == getSelectedTabPosition()) {
            j = 1;
          } else {
            j = 0;
          }  
        if (j || this.a0 == 1 || paramBoolean3) {
          j = k;
          if (paramInt < 0)
            j = 0; 
          scrollTo(j, 0);
        } 
        if (paramBoolean1)
          setSelectedTabView(i); 
      } 
    } 
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    Drawable drawable = getBackground();
    if (drawable instanceof ws0)
      zo2.S((View)this, (ws0)drawable); 
    if (this.R == null) {
      ViewParent viewParent = getParent();
      if (viewParent instanceof t32)
        p((t32)viewParent, true); 
    } 
  }
  
  public final void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    if (this.W) {
      setupWithViewPager(null);
      this.W = false;
    } 
  }
  
  public final void onDraw(Canvas paramCanvas) {
    byte b = 0;
    while (true) {
      vs1 vs11 = this.f;
      if (b < vs11.getChildCount()) {
        View view = vs11.getChildAt(b);
        if (view instanceof zs1) {
          zs1 zs1 = (zs1)view;
          Drawable drawable = zs1.k;
          if (drawable != null) {
            drawable.setBounds(zs1.getLeft(), zs1.getTop(), zs1.getRight(), zs1.getBottom());
            zs1.k.draw(paramCanvas);
          } 
        } 
        b++;
        continue;
      } 
      super.onDraw(paramCanvas);
      return;
    } 
  }
  
  public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo) {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getTabCount(), false, 1));
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    return ((getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(paramMotionEvent));
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    int j = Math.round(n21.u(getContext(), getDefaultHeight()));
    int i = View.MeasureSpec.getMode(paramInt2);
    if (i != Integer.MIN_VALUE) {
      if (i != 0) {
        i = paramInt2;
      } else {
        paramInt2 = getPaddingTop();
        i = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + paramInt2 + j, 1073741824);
      } 
    } else {
      i = paramInt2;
      if (getChildCount() == 1) {
        i = paramInt2;
        if (View.MeasureSpec.getSize(paramInt2) >= j) {
          getChildAt(0).setMinimumHeight(j);
          i = paramInt2;
        } 
      } 
    } 
    j = View.MeasureSpec.getSize(paramInt1);
    if (View.MeasureSpec.getMode(paramInt1) != 0) {
      paramInt2 = this.z;
      if (paramInt2 <= 0)
        paramInt2 = (int)(j - n21.u(getContext(), 56)); 
      this.x = paramInt2;
    } 
    super.onMeasure(paramInt1, i);
    if (getChildCount() == 1) {
      View view = getChildAt(0);
      paramInt1 = this.F;
      if (paramInt1 != 0)
        if (paramInt1 != 1) {
          if (paramInt1 != 2)
            return; 
        } else {
          if (view.getMeasuredWidth() == getMeasuredWidth())
            return; 
          paramInt1 = getPaddingTop();
          paramInt1 = ViewGroup.getChildMeasureSpec(i, getPaddingBottom() + paramInt1, (view.getLayoutParams()).height);
          view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), paramInt1);
        }  
      if (view.getMeasuredWidth() < getMeasuredWidth()) {
        paramInt1 = getPaddingTop();
        paramInt1 = ViewGroup.getChildMeasureSpec(i, getPaddingBottom() + paramInt1, (view.getLayoutParams()).height);
        view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), paramInt1);
      } 
    } 
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    return (paramMotionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) ? super.onTouchEvent(paramMotionEvent) : false;
  }
  
  public final void p(t32 paramt32, boolean paramBoolean) {
    t32 t321 = this.R;
    if (t321 != null) {
      xs1 xs11 = this.U;
      if (xs11 != null) {
        ArrayList arrayList = t321.T;
        if (arrayList != null)
          arrayList.remove(xs11); 
      } 
      rs1 rs11 = this.V;
      if (rs11 != null) {
        ArrayList arrayList = this.R.V;
        if (arrayList != null)
          arrayList.remove(rs11); 
      } 
    } 
    az0 az01 = this.P;
    if (az01 != null) {
      this.O.remove(az01);
      this.P = null;
    } 
    if (paramt32 != null) {
      this.R = paramt32;
      if (this.U == null)
        this.U = new xs1(this); 
      xs1 xs11 = this.U;
      xs11.e = 0;
      xs11.c = 0;
      paramt32.b((r32)xs11);
      az0 az02 = new az0((KeyEvent.Callback)paramt32, 1);
      this.P = az02;
      a((ss1)az02);
      p51 p511 = paramt32.getAdapter();
      if (p511 != null)
        n(p511, true); 
      if (this.V == null)
        this.V = new rs1(this); 
      rs1 rs11 = this.V;
      rs11.a = true;
      if (paramt32.V == null)
        paramt32.V = new ArrayList(); 
      paramt32.V.add(rs11);
      o(paramt32.getCurrentItem(), 0.0F, true, true, true);
    } else {
      this.R = null;
      n(null, false);
    } 
    this.W = paramBoolean;
  }
  
  public final void q(boolean paramBoolean) {
    byte b = 0;
    while (true) {
      vs1 vs11 = this.f;
      if (b < vs11.getChildCount()) {
        View view = vs11.getChildAt(b);
        view.setMinimumWidth(getTabMinWidth());
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)view.getLayoutParams();
        if (this.F == 1 && this.C == 0) {
          layoutParams.width = 0;
          layoutParams.weight = 1.0F;
        } else {
          layoutParams.width = -2;
          layoutParams.weight = 0.0F;
        } 
        if (paramBoolean)
          view.requestLayout(); 
        b++;
        continue;
      } 
      break;
    } 
  }
  
  public void setElevation(float paramFloat) {
    super.setElevation(paramFloat);
    Drawable drawable = getBackground();
    if (drawable instanceof ws0)
      ((ws0)drawable).n(paramFloat); 
  }
  
  public void setInlineLabel(boolean paramBoolean) {
    if (this.G != paramBoolean) {
      this.G = paramBoolean;
      byte b = 0;
      while (true) {
        vs1 vs11 = this.f;
        if (b < vs11.getChildCount()) {
          View view = vs11.getChildAt(b);
          if (view instanceof zs1) {
            zs1 zs1 = (zs1)view;
            zs1.setOrientation(zs1.m.G ^ true);
            TextView textView = zs1.i;
            if (textView != null || zs1.j != null) {
              zs1.g(textView, zs1.j, false);
            } else {
              zs1.g(zs1.c, zs1.e, true);
            } 
          } 
          b++;
          continue;
        } 
        e();
        break;
      } 
    } 
  }
  
  public void setInlineLabelResource(int paramInt) {
    setInlineLabel(getResources().getBoolean(paramInt));
  }
  
  @Deprecated
  public void setOnTabSelectedListener(ss1 paramss1) {
    ss1 ss11 = this.N;
    if (ss11 != null)
      this.O.remove(ss11); 
    this.N = paramss1;
    if (paramss1 != null)
      a(paramss1); 
  }
  
  @Deprecated
  public void setOnTabSelectedListener(ts1 paramts1) {
    setOnTabSelectedListener((ss1)paramts1);
  }
  
  public void setScrollAnimatorListener(Animator.AnimatorListener paramAnimatorListener) {
    g();
    this.Q.addListener(paramAnimatorListener);
  }
  
  public void setSelectedTabIndicator(int paramInt) {
    if (paramInt != 0) {
      setSelectedTabIndicator(ws2.I(getContext(), paramInt));
      return;
    } 
    setSelectedTabIndicator((Drawable)null);
  }
  
  public void setSelectedTabIndicator(Drawable paramDrawable) {
    GradientDrawable gradientDrawable;
    Drawable drawable = paramDrawable;
    if (paramDrawable == null)
      gradientDrawable = new GradientDrawable(); 
    paramDrawable = gradientDrawable.mutate();
    this.q = paramDrawable;
    int i = this.r;
    if (i != 0) {
      paramDrawable.setTint(i);
    } else {
      paramDrawable.setTintList(null);
    } 
    int j = this.I;
    i = j;
    if (j == -1)
      i = this.q.getIntrinsicHeight(); 
    this.f.b(i);
  }
  
  public void setSelectedTabIndicatorColor(int paramInt) {
    this.r = paramInt;
    Drawable drawable = this.q;
    if (paramInt != 0) {
      drawable.setTint(paramInt);
    } else {
      drawable.setTintList(null);
    } 
    q(false);
  }
  
  public void setSelectedTabIndicatorGravity(int paramInt) {
    if (this.E != paramInt) {
      this.E = paramInt;
      this.f.postInvalidateOnAnimation();
    } 
  }
  
  @Deprecated
  public void setSelectedTabIndicatorHeight(int paramInt) {
    this.I = paramInt;
    this.f.b(paramInt);
  }
  
  public void setTabGravity(int paramInt) {
    if (this.C != paramInt) {
      this.C = paramInt;
      e();
    } 
  }
  
  public void setTabIconTint(ColorStateList paramColorStateList) {
    if (this.o != paramColorStateList) {
      this.o = paramColorStateList;
      ArrayList arrayList = this.c;
      int i = arrayList.size();
      for (byte b = 0; b < i; b++) {
        zs1 zs1 = ((ws1)arrayList.get(b)).h;
        if (zs1 != null)
          zs1.d(); 
      } 
    } 
  }
  
  public void setTabIconTintResource(int paramInt) {
    setTabIconTint(n21.y(getContext(), paramInt));
  }
  
  public void setTabIndicatorAnimationMode(int paramInt) {
    this.J = paramInt;
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt == 2) {
          this.L = (zb0)new n30(1);
          return;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(paramInt);
        stringBuilder.append(" is not a valid TabIndicatorAnimationMode");
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      this.L = (zb0)new n30(0);
      return;
    } 
    this.L = new zb0(15);
  }
  
  public void setTabIndicatorFullWidth(boolean paramBoolean) {
    this.H = paramBoolean;
    int i = vs1.e;
    vs1 vs11 = this.f;
    vs11.a(vs11.c.getSelectedTabPosition());
    vs11.postInvalidateOnAnimation();
  }
  
  public void setTabMode(int paramInt) {
    if (paramInt != this.F) {
      this.F = paramInt;
      e();
    } 
  }
  
  public void setTabRippleColor(ColorStateList paramColorStateList) {
    if (this.p != paramColorStateList) {
      this.p = paramColorStateList;
      byte b = 0;
      while (true) {
        vs1 vs11 = this.f;
        if (b < vs11.getChildCount()) {
          View view = vs11.getChildAt(b);
          if (view instanceof zs1) {
            zs1 zs1 = (zs1)view;
            Context context = getContext();
            int i = zs1.n;
            zs1.e(context);
          } 
          b++;
          continue;
        } 
        break;
      } 
    } 
  }
  
  public void setTabRippleColorResource(int paramInt) {
    setTabRippleColor(n21.y(getContext(), paramInt));
  }
  
  public void setTabTextColors(ColorStateList paramColorStateList) {
    if (this.n != paramColorStateList) {
      this.n = paramColorStateList;
      ArrayList arrayList = this.c;
      int i = arrayList.size();
      for (byte b = 0; b < i; b++) {
        zs1 zs1 = ((ws1)arrayList.get(b)).h;
        if (zs1 != null)
          zs1.d(); 
      } 
    } 
  }
  
  @Deprecated
  public void setTabsFromPagerAdapter(p51 paramp51) {
    n(paramp51, false);
  }
  
  public void setUnboundedRipple(boolean paramBoolean) {
    if (this.K != paramBoolean) {
      this.K = paramBoolean;
      byte b = 0;
      while (true) {
        vs1 vs11 = this.f;
        if (b < vs11.getChildCount()) {
          View view = vs11.getChildAt(b);
          if (view instanceof zs1) {
            zs1 zs1 = (zs1)view;
            Context context = getContext();
            int i = zs1.n;
            zs1.e(context);
          } 
          b++;
          continue;
        } 
        break;
      } 
    } 
  }
  
  public void setUnboundedRippleResource(int paramInt) {
    setUnboundedRipple(getResources().getBoolean(paramInt));
  }
  
  public void setupWithViewPager(t32 paramt32) {
    p(paramt32, false);
  }
  
  public final boolean shouldDelayChildPressedState() {
    return (getTabScrollRange() > 0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\tabs\TabLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */