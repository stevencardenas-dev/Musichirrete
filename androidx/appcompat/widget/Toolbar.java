package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import c7;
import cr1;
import cv1;
import d42;
import db0;
import dv1;
import ev1;
import fv1;
import gv1;
import hv1;
import hx0;
import i1;
import iv1;
import j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import jv1;
import mv1;
import nc1;
import p01;
import pw0;
import qv;
import rh1;
import rw0;
import sb;
import sv;
import u1;
import uw0;
import v22;
import ws2;
import x1;
import yi1;
import zv0;

public class Toolbar extends ViewGroup {
  public CharSequence A;
  
  public ColorStateList B;
  
  public ColorStateList C;
  
  public boolean D;
  
  public boolean E;
  
  public final ArrayList F = new ArrayList();
  
  public final ArrayList G = new ArrayList();
  
  public final int[] H = new int[2];
  
  public final p01 I = new p01((Runnable)new cv1(this, 1));
  
  public ArrayList J = new ArrayList();
  
  public hv1 K;
  
  public final dv1 L = new dv1(this);
  
  public mv1 M;
  
  public u1 N;
  
  public fv1 O;
  
  public sb P;
  
  public jv1 Q;
  
  public boolean R;
  
  public OnBackInvokedCallback S;
  
  public OnBackInvokedDispatcher T;
  
  public boolean U;
  
  public final yi1 V = new yi1(6, this);
  
  public ActionMenuView b;
  
  public AppCompatTextView c;
  
  public AppCompatTextView e;
  
  public c7 f;
  
  public AppCompatImageView g;
  
  public final Drawable h;
  
  public final CharSequence i;
  
  public c7 j;
  
  public View k;
  
  public Context l;
  
  public int m;
  
  public int n;
  
  public int o;
  
  public final int p;
  
  public final int q;
  
  public int r;
  
  public int s;
  
  public int t;
  
  public int u;
  
  public rh1 v;
  
  public int w;
  
  public int x;
  
  public final int y = 8388627;
  
  public CharSequence z;
  
  public Toolbar(Context paramContext) {
    this(paramContext, null);
  }
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 2130970216);
  }
  
  public Toolbar(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    Context context = getContext();
    int[] arrayOfInt = nc1.y;
    zv0 zv0 = zv0.y(paramInt, 0, context, paramAttributeSet, arrayOfInt);
    v22.m((View)this, paramContext, arrayOfInt, paramAttributeSet, (TypedArray)zv0.e, paramInt);
    TypedArray typedArray = (TypedArray)zv0.e;
    this.n = typedArray.getResourceId(28, 0);
    this.o = typedArray.getResourceId(19, 0);
    this.y = typedArray.getInteger(0, 8388627);
    this.p = typedArray.getInteger(2, 48);
    int i = typedArray.getDimensionPixelOffset(22, 0);
    paramInt = i;
    if (typedArray.hasValue(27))
      paramInt = typedArray.getDimensionPixelOffset(27, i); 
    this.u = paramInt;
    this.t = paramInt;
    this.s = paramInt;
    this.r = paramInt;
    paramInt = typedArray.getDimensionPixelOffset(25, -1);
    if (paramInt >= 0)
      this.r = paramInt; 
    paramInt = typedArray.getDimensionPixelOffset(24, -1);
    if (paramInt >= 0)
      this.s = paramInt; 
    paramInt = typedArray.getDimensionPixelOffset(26, -1);
    if (paramInt >= 0)
      this.t = paramInt; 
    paramInt = typedArray.getDimensionPixelOffset(23, -1);
    if (paramInt >= 0)
      this.u = paramInt; 
    this.q = typedArray.getDimensionPixelSize(13, -1);
    i = typedArray.getDimensionPixelOffset(9, -2147483648);
    int k = typedArray.getDimensionPixelOffset(5, -2147483648);
    paramInt = typedArray.getDimensionPixelSize(7, 0);
    int j = typedArray.getDimensionPixelSize(8, 0);
    d();
    rh1 rh11 = this.v;
    rh11.h = false;
    if (paramInt != Integer.MIN_VALUE) {
      rh11.e = paramInt;
      rh11.a = paramInt;
    } 
    if (j != Integer.MIN_VALUE) {
      rh11.f = j;
      rh11.b = j;
    } 
    if (i != Integer.MIN_VALUE || k != Integer.MIN_VALUE)
      rh11.a(i, k); 
    this.w = typedArray.getDimensionPixelOffset(10, -2147483648);
    this.x = typedArray.getDimensionPixelOffset(6, -2147483648);
    this.h = zv0.o(4);
    this.i = typedArray.getText(3);
    CharSequence charSequence3 = typedArray.getText(21);
    if (!TextUtils.isEmpty(charSequence3))
      setTitle(charSequence3); 
    charSequence3 = typedArray.getText(18);
    if (!TextUtils.isEmpty(charSequence3))
      setSubtitle(charSequence3); 
    this.l = getContext();
    setPopupTheme(typedArray.getResourceId(17, 0));
    Drawable drawable2 = zv0.o(16);
    if (drawable2 != null)
      setNavigationIcon(drawable2); 
    CharSequence charSequence2 = typedArray.getText(15);
    if (!TextUtils.isEmpty(charSequence2))
      setNavigationContentDescription(charSequence2); 
    Drawable drawable1 = zv0.o(11);
    if (drawable1 != null)
      setLogo(drawable1); 
    CharSequence charSequence1 = typedArray.getText(12);
    if (!TextUtils.isEmpty(charSequence1))
      setLogoDescription(charSequence1); 
    if (typedArray.hasValue(29))
      setTitleTextColor(zv0.n(29)); 
    if (typedArray.hasValue(20))
      setSubtitleTextColor(zv0.n(20)); 
    if (typedArray.hasValue(14)) {
      paramInt = typedArray.getResourceId(14, 0);
      getMenuInflater().inflate(paramInt, getMenu());
    } 
    zv0.z();
  }
  
  private ArrayList<MenuItem> getCurrentMenuItems() {
    ArrayList<MenuItem> arrayList = new ArrayList();
    Menu menu = getMenu();
    for (byte b = 0; b < menu.size(); b++)
      arrayList.add(menu.getItem(b)); 
    return arrayList;
  }
  
  private MenuInflater getMenuInflater() {
    return (MenuInflater)new cr1(getContext());
  }
  
  public static gv1 h() {
    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
    ((gv1)marginLayoutParams).b = 0;
    ((gv1)marginLayoutParams).a = 8388627;
    return (gv1)marginLayoutParams;
  }
  
  public static gv1 i(ViewGroup.LayoutParams paramLayoutParams) {
    boolean bool = paramLayoutParams instanceof gv1;
    if (bool) {
      gv1 gv11 = (gv1)paramLayoutParams;
      gv1 = new gv1(gv11);
      gv1.b = 0;
      gv1.b = gv11.b;
      return gv1;
    } 
    if (bool) {
      gv1 = new gv1(gv1);
      gv1.b = 0;
      return gv1;
    } 
    if (gv1 instanceof ViewGroup.MarginLayoutParams) {
      ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)gv1;
      gv1 = new gv1((ViewGroup.LayoutParams)marginLayoutParams);
      gv1.b = 0;
      ((ViewGroup.MarginLayoutParams)gv1).leftMargin = marginLayoutParams.leftMargin;
      ((ViewGroup.MarginLayoutParams)gv1).topMargin = marginLayoutParams.topMargin;
      ((ViewGroup.MarginLayoutParams)gv1).rightMargin = marginLayoutParams.rightMargin;
      ((ViewGroup.MarginLayoutParams)gv1).bottomMargin = marginLayoutParams.bottomMargin;
      return gv1;
    } 
    gv1 gv1 = new gv1((ViewGroup.LayoutParams)gv1);
    gv1.b = 0;
    return gv1;
  }
  
  public static int k(View paramView) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = marginLayoutParams.getMarginStart();
    return marginLayoutParams.getMarginEnd() + i;
  }
  
  public static int l(View paramView) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
  }
  
  public final void a(int paramInt, ArrayList<View> paramArrayList) {
    int j = getLayoutDirection();
    int i = 0;
    if (j == 1) {
      j = 1;
    } else {
      j = 0;
    } 
    int m = getChildCount();
    int k = Gravity.getAbsoluteGravity(paramInt, getLayoutDirection());
    paramArrayList.clear();
    if (j != 0) {
      for (i = m - 1; i >= 0; i--) {
        View view = getChildAt(i);
        gv1 gv1 = (gv1)view.getLayoutParams();
        if (gv1.b == 0 && t(view)) {
          paramInt = gv1.a;
          m = getLayoutDirection();
          j = Gravity.getAbsoluteGravity(paramInt, m) & 0x7;
          paramInt = j;
          if (j != 1) {
            paramInt = j;
            if (j != 3) {
              paramInt = j;
              if (j != 5)
                if (m == 1) {
                  paramInt = 5;
                } else {
                  paramInt = 3;
                }  
            } 
          } 
          if (paramInt == k)
            paramArrayList.add(view); 
        } 
      } 
    } else {
      while (i < m) {
        View view = getChildAt(i);
        gv1 gv1 = (gv1)view.getLayoutParams();
        if (gv1.b == 0 && t(view)) {
          paramInt = gv1.a;
          int n = getLayoutDirection();
          j = Gravity.getAbsoluteGravity(paramInt, n) & 0x7;
          paramInt = j;
          if (j != 1) {
            paramInt = j;
            if (j != 3) {
              paramInt = j;
              if (j != 5)
                if (n == 1) {
                  paramInt = 5;
                } else {
                  paramInt = 3;
                }  
            } 
          } 
          if (paramInt == k)
            paramArrayList.add(view); 
        } 
        i++;
      } 
    } 
  }
  
  public final void b(View paramView, boolean paramBoolean) {
    gv1 gv1;
    ViewGroup.LayoutParams layoutParams = paramView.getLayoutParams();
    if (layoutParams == null) {
      gv1 = h();
    } else if (!checkLayoutParams((ViewGroup.LayoutParams)gv1)) {
      gv1 = i((ViewGroup.LayoutParams)gv1);
    } else {
      gv1 = gv1;
    } 
    gv1.b = 1;
    if (paramBoolean && this.k != null) {
      paramView.setLayoutParams((ViewGroup.LayoutParams)gv1);
      this.G.add(paramView);
      return;
    } 
    addView(paramView, (ViewGroup.LayoutParams)gv1);
  }
  
  public final void c() {
    if (this.j == null) {
      c7 c71 = new c7(getContext(), null, 2130970215);
      this.j = c71;
      c71.setImageDrawable(this.h);
      this.j.setContentDescription(this.i);
      gv1 gv1 = h();
      gv1.a = this.p & 0x70 | 0x800003;
      gv1.b = 2;
      this.j.setLayoutParams((ViewGroup.LayoutParams)gv1);
      this.j.setOnClickListener((View.OnClickListener)new i1(7, this));
    } 
  }
  
  public final boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (super.checkLayoutParams(paramLayoutParams) && paramLayoutParams instanceof gv1);
  }
  
  public final void d() {
    if (this.v == null) {
      Object object = new Object();
      ((rh1)object).a = 0;
      ((rh1)object).b = 0;
      ((rh1)object).c = Integer.MIN_VALUE;
      ((rh1)object).d = Integer.MIN_VALUE;
      ((rh1)object).e = 0;
      ((rh1)object).f = 0;
      ((rh1)object).g = false;
      ((rh1)object).h = false;
      this.v = (rh1)object;
    } 
  }
  
  public final void e() {
    f();
    ActionMenuView actionMenuView = this.b;
    if (actionMenuView.b == null) {
      rw0 rw0 = (rw0)actionMenuView.getMenu();
      if (this.O == null)
        this.O = new fv1(this); 
      this.b.setExpandedActionViewsExclusive(true);
      rw0.b((hx0)this.O, this.l);
      v();
    } 
  }
  
  public final void f() {
    if (this.b == null) {
      ActionMenuView actionMenuView1 = new ActionMenuView(getContext());
      this.b = actionMenuView1;
      actionMenuView1.setPopupTheme(this.m);
      this.b.setOnMenuItemClickListener((x1)this.L);
      ActionMenuView actionMenuView2 = this.b;
      sb sb1 = this.P;
      dv1 dv11 = new dv1(this);
      actionMenuView2.h = sb1;
      actionMenuView2.i = (pw0)dv11;
      gv1 gv1 = h();
      gv1.a = this.p & 0x70 | 0x800005;
      this.b.setLayoutParams((ViewGroup.LayoutParams)gv1);
      b((View)this.b, false);
    } 
  }
  
  public final void g() {
    if (this.f == null) {
      this.f = new c7(getContext(), null, 2130970215);
      gv1 gv1 = h();
      gv1.a = this.p & 0x70 | 0x800003;
      this.f.setLayoutParams((ViewGroup.LayoutParams)gv1);
    } 
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    Context context = getContext();
    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(context, paramAttributeSet);
    ((gv1)marginLayoutParams).a = 0;
    TypedArray typedArray = context.obtainStyledAttributes(paramAttributeSet, nc1.b);
    ((gv1)marginLayoutParams).a = typedArray.getInt(0, 0);
    typedArray.recycle();
    ((gv1)marginLayoutParams).b = 0;
    return (ViewGroup.LayoutParams)marginLayoutParams;
  }
  
  public CharSequence getCollapseContentDescription() {
    c7 c71 = this.j;
    return (c71 != null) ? c71.getContentDescription() : null;
  }
  
  public Drawable getCollapseIcon() {
    c7 c71 = this.j;
    return (c71 != null) ? c71.getDrawable() : null;
  }
  
  public int getContentInsetEnd() {
    rh1 rh11 = this.v;
    return (rh11 != null) ? (rh11.g ? rh11.a : rh11.b) : 0;
  }
  
  public int getContentInsetEndWithActions() {
    int i = this.x;
    return (i != Integer.MIN_VALUE) ? i : getContentInsetEnd();
  }
  
  public int getContentInsetLeft() {
    rh1 rh11 = this.v;
    return (rh11 != null) ? rh11.a : 0;
  }
  
  public int getContentInsetRight() {
    rh1 rh11 = this.v;
    return (rh11 != null) ? rh11.b : 0;
  }
  
  public int getContentInsetStart() {
    rh1 rh11 = this.v;
    return (rh11 != null) ? (rh11.g ? rh11.b : rh11.a) : 0;
  }
  
  public int getContentInsetStartWithNavigation() {
    int i = this.w;
    return (i != Integer.MIN_VALUE) ? i : getContentInsetStart();
  }
  
  public int getCurrentContentInsetEnd() {
    ActionMenuView actionMenuView = this.b;
    if (actionMenuView != null) {
      rw0 rw0 = actionMenuView.b;
      if (rw0 != null && rw0.hasVisibleItems())
        return Math.max(getContentInsetEnd(), Math.max(this.x, 0)); 
    } 
    return getContentInsetEnd();
  }
  
  public int getCurrentContentInsetLeft() {
    return (getLayoutDirection() == 1) ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
  }
  
  public int getCurrentContentInsetRight() {
    return (getLayoutDirection() == 1) ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
  }
  
  public int getCurrentContentInsetStart() {
    return (getNavigationIcon() != null) ? Math.max(getContentInsetStart(), Math.max(this.w, 0)) : getContentInsetStart();
  }
  
  public Drawable getLogo() {
    AppCompatImageView appCompatImageView = this.g;
    return (appCompatImageView != null) ? appCompatImageView.getDrawable() : null;
  }
  
  public CharSequence getLogoDescription() {
    AppCompatImageView appCompatImageView = this.g;
    return (appCompatImageView != null) ? appCompatImageView.getContentDescription() : null;
  }
  
  public Menu getMenu() {
    e();
    return this.b.getMenu();
  }
  
  public View getNavButtonView() {
    return (View)this.f;
  }
  
  public CharSequence getNavigationContentDescription() {
    c7 c71 = this.f;
    return (c71 != null) ? c71.getContentDescription() : null;
  }
  
  public Drawable getNavigationIcon() {
    c7 c71 = this.f;
    return (c71 != null) ? c71.getDrawable() : null;
  }
  
  public u1 getOuterActionMenuPresenter() {
    return this.N;
  }
  
  public Drawable getOverflowIcon() {
    e();
    return this.b.getOverflowIcon();
  }
  
  public Context getPopupContext() {
    return this.l;
  }
  
  public int getPopupTheme() {
    return this.m;
  }
  
  public CharSequence getSubtitle() {
    return this.A;
  }
  
  public final TextView getSubtitleTextView() {
    return this.e;
  }
  
  public CharSequence getTitle() {
    return this.z;
  }
  
  public int getTitleMarginBottom() {
    return this.u;
  }
  
  public int getTitleMarginEnd() {
    return this.s;
  }
  
  public int getTitleMarginStart() {
    return this.r;
  }
  
  public int getTitleMarginTop() {
    return this.t;
  }
  
  public final TextView getTitleTextView() {
    return this.c;
  }
  
  public sv getWrapper() {
    if (this.M == null)
      this.M = new mv1(this, true); 
    return (sv)this.M;
  }
  
  public final int j(View paramView, int paramInt) {
    gv1 gv1 = (gv1)paramView.getLayoutParams();
    int k = paramView.getMeasuredHeight();
    if (paramInt > 0) {
      paramInt = (k - paramInt) / 2;
    } else {
      paramInt = 0;
    } 
    int j = gv1.a & 0x70;
    int i = j;
    if (j != 16) {
      i = j;
      if (j != 48) {
        i = j;
        if (j != 80)
          i = this.y & 0x70; 
      } 
    } 
    if (i != 48) {
      if (i != 80) {
        j = getPaddingTop();
        int n = getPaddingBottom();
        int m = getHeight();
        i = (m - j - n - k) / 2;
        paramInt = ((ViewGroup.MarginLayoutParams)gv1).topMargin;
        if (i >= paramInt) {
          m = m - n - k - i - j;
          k = ((ViewGroup.MarginLayoutParams)gv1).bottomMargin;
          paramInt = i;
          if (m < k)
            paramInt = Math.max(0, i - k - m); 
        } 
        return j + paramInt;
      } 
      return getHeight() - getPaddingBottom() - k - ((ViewGroup.MarginLayoutParams)gv1).bottomMargin - paramInt;
    } 
    return getPaddingTop() - paramInt;
  }
  
  public final void m() {
    ArrayList<Object> arrayList = this.J;
    int i = arrayList.size();
    byte b = 0;
    while (b < i) {
      MenuItem menuItem = (MenuItem)arrayList.get(b);
      b++;
      menuItem = menuItem;
      getMenu().removeItem(menuItem.getItemId());
    } 
    getMenu();
    arrayList = (ArrayList)getCurrentMenuItems();
    getMenuInflater();
    Iterator iterator = ((CopyOnWriteArrayList)this.I.e).iterator();
    while (iterator.hasNext())
      ((db0)iterator.next()).a.k(); 
    ArrayList<MenuItem> arrayList1 = getCurrentMenuItems();
    arrayList1.removeAll(arrayList);
    this.J = arrayList1;
  }
  
  public final boolean n(View paramView) {
    return (paramView.getParent() == this || this.G.contains(paramView));
  }
  
  public final boolean o() {
    ActionMenuView actionMenuView = this.b;
    if (actionMenuView != null) {
      u1 u11 = actionMenuView.g;
      if (u11 != null && u11.h())
        return true; 
    } 
    return false;
  }
  
  public void onAttachedToWindow() {
    super.onAttachedToWindow();
    v();
  }
  
  public final void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    removeCallbacks((Runnable)this.V);
    v();
  }
  
  public final boolean onHoverEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionMasked();
    if (i == 9)
      this.E = false; 
    if (!this.E) {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if (i == 9 && !bool)
        this.E = true; 
    } 
    if (i == 10 || i == 3) {
      this.E = false;
      return true;
    } 
    return true;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getLayoutDirection : ()I
    //   4: iconst_1
    //   5: if_icmpne -> 14
    //   8: iconst_1
    //   9: istore #8
    //   11: goto -> 17
    //   14: iconst_0
    //   15: istore #8
    //   17: aload_0
    //   18: invokevirtual getWidth : ()I
    //   21: istore #11
    //   23: aload_0
    //   24: invokevirtual getHeight : ()I
    //   27: istore #15
    //   29: aload_0
    //   30: invokevirtual getPaddingLeft : ()I
    //   33: istore #7
    //   35: aload_0
    //   36: invokevirtual getPaddingRight : ()I
    //   39: istore #12
    //   41: aload_0
    //   42: invokevirtual getPaddingTop : ()I
    //   45: istore #13
    //   47: aload_0
    //   48: invokevirtual getPaddingBottom : ()I
    //   51: istore #14
    //   53: iload #11
    //   55: iload #12
    //   57: isub
    //   58: istore #9
    //   60: aload_0
    //   61: getfield H : [I
    //   64: astore #19
    //   66: aload #19
    //   68: iconst_1
    //   69: iconst_0
    //   70: iastore
    //   71: aload #19
    //   73: iconst_0
    //   74: iconst_0
    //   75: iastore
    //   76: getstatic v22.a : Ljava/util/WeakHashMap;
    //   79: astore #17
    //   81: aload_0
    //   82: invokevirtual getMinimumHeight : ()I
    //   85: istore_2
    //   86: iload_2
    //   87: iflt -> 103
    //   90: iload_2
    //   91: iload #5
    //   93: iload_3
    //   94: isub
    //   95: invokestatic min : (II)I
    //   98: istore #6
    //   100: goto -> 106
    //   103: iconst_0
    //   104: istore #6
    //   106: aload_0
    //   107: aload_0
    //   108: getfield f : Lc7;
    //   111: invokevirtual t : (Landroid/view/View;)Z
    //   114: ifeq -> 170
    //   117: aload_0
    //   118: getfield f : Lc7;
    //   121: astore #17
    //   123: iload #8
    //   125: ifeq -> 149
    //   128: aload_0
    //   129: aload #17
    //   131: iload #9
    //   133: iload #6
    //   135: aload #19
    //   137: invokevirtual q : (Landroid/view/View;II[I)I
    //   140: istore #5
    //   142: iload #7
    //   144: istore #4
    //   146: goto -> 177
    //   149: aload_0
    //   150: aload #17
    //   152: iload #7
    //   154: iload #6
    //   156: aload #19
    //   158: invokevirtual p : (Landroid/view/View;II[I)I
    //   161: istore #4
    //   163: iload #9
    //   165: istore #5
    //   167: goto -> 177
    //   170: iload #7
    //   172: istore #4
    //   174: goto -> 163
    //   177: iload #4
    //   179: istore_3
    //   180: iload #5
    //   182: istore_2
    //   183: aload_0
    //   184: aload_0
    //   185: getfield j : Lc7;
    //   188: invokevirtual t : (Landroid/view/View;)Z
    //   191: ifeq -> 240
    //   194: aload_0
    //   195: getfield j : Lc7;
    //   198: astore #17
    //   200: iload #8
    //   202: ifeq -> 224
    //   205: aload_0
    //   206: aload #17
    //   208: iload #5
    //   210: iload #6
    //   212: aload #19
    //   214: invokevirtual q : (Landroid/view/View;II[I)I
    //   217: istore_2
    //   218: iload #4
    //   220: istore_3
    //   221: goto -> 240
    //   224: aload_0
    //   225: aload #17
    //   227: iload #4
    //   229: iload #6
    //   231: aload #19
    //   233: invokevirtual p : (Landroid/view/View;II[I)I
    //   236: istore_3
    //   237: iload #5
    //   239: istore_2
    //   240: iload_3
    //   241: istore #5
    //   243: iload_2
    //   244: istore #4
    //   246: aload_0
    //   247: aload_0
    //   248: getfield b : Landroidx/appcompat/widget/ActionMenuView;
    //   251: invokevirtual t : (Landroid/view/View;)Z
    //   254: ifeq -> 303
    //   257: aload_0
    //   258: getfield b : Landroidx/appcompat/widget/ActionMenuView;
    //   261: astore #17
    //   263: iload #8
    //   265: ifeq -> 287
    //   268: aload_0
    //   269: aload #17
    //   271: iload_3
    //   272: iload #6
    //   274: aload #19
    //   276: invokevirtual p : (Landroid/view/View;II[I)I
    //   279: istore #5
    //   281: iload_2
    //   282: istore #4
    //   284: goto -> 303
    //   287: aload_0
    //   288: aload #17
    //   290: iload_2
    //   291: iload #6
    //   293: aload #19
    //   295: invokevirtual q : (Landroid/view/View;II[I)I
    //   298: istore #4
    //   300: iload_3
    //   301: istore #5
    //   303: aload_0
    //   304: invokevirtual getCurrentContentInsetLeft : ()I
    //   307: istore_3
    //   308: aload_0
    //   309: invokevirtual getCurrentContentInsetRight : ()I
    //   312: istore_2
    //   313: aload #19
    //   315: iconst_0
    //   316: iconst_0
    //   317: iload_3
    //   318: iload #5
    //   320: isub
    //   321: invokestatic max : (II)I
    //   324: iastore
    //   325: aload #19
    //   327: iconst_1
    //   328: iconst_0
    //   329: iload_2
    //   330: iload #9
    //   332: iload #4
    //   334: isub
    //   335: isub
    //   336: invokestatic max : (II)I
    //   339: iastore
    //   340: iload #5
    //   342: iload_3
    //   343: invokestatic max : (II)I
    //   346: istore_3
    //   347: iload #4
    //   349: iload #9
    //   351: iload_2
    //   352: isub
    //   353: invokestatic min : (II)I
    //   356: istore #4
    //   358: iload_3
    //   359: istore #5
    //   361: iload #4
    //   363: istore_2
    //   364: aload_0
    //   365: aload_0
    //   366: getfield k : Landroid/view/View;
    //   369: invokevirtual t : (Landroid/view/View;)Z
    //   372: ifeq -> 421
    //   375: aload_0
    //   376: getfield k : Landroid/view/View;
    //   379: astore #17
    //   381: iload #8
    //   383: ifeq -> 405
    //   386: aload_0
    //   387: aload #17
    //   389: iload #4
    //   391: iload #6
    //   393: aload #19
    //   395: invokevirtual q : (Landroid/view/View;II[I)I
    //   398: istore_2
    //   399: iload_3
    //   400: istore #5
    //   402: goto -> 421
    //   405: aload_0
    //   406: aload #17
    //   408: iload_3
    //   409: iload #6
    //   411: aload #19
    //   413: invokevirtual p : (Landroid/view/View;II[I)I
    //   416: istore #5
    //   418: iload #4
    //   420: istore_2
    //   421: iload #5
    //   423: istore_3
    //   424: iload_2
    //   425: istore #4
    //   427: aload_0
    //   428: aload_0
    //   429: getfield g : Landroidx/appcompat/widget/AppCompatImageView;
    //   432: invokevirtual t : (Landroid/view/View;)Z
    //   435: ifeq -> 484
    //   438: aload_0
    //   439: getfield g : Landroidx/appcompat/widget/AppCompatImageView;
    //   442: astore #17
    //   444: iload #8
    //   446: ifeq -> 468
    //   449: aload_0
    //   450: aload #17
    //   452: iload_2
    //   453: iload #6
    //   455: aload #19
    //   457: invokevirtual q : (Landroid/view/View;II[I)I
    //   460: istore #4
    //   462: iload #5
    //   464: istore_3
    //   465: goto -> 484
    //   468: aload_0
    //   469: aload #17
    //   471: iload #5
    //   473: iload #6
    //   475: aload #19
    //   477: invokevirtual p : (Landroid/view/View;II[I)I
    //   480: istore_3
    //   481: iload_2
    //   482: istore #4
    //   484: aload_0
    //   485: aload_0
    //   486: getfield c : Landroidx/appcompat/widget/AppCompatTextView;
    //   489: invokevirtual t : (Landroid/view/View;)Z
    //   492: istore_1
    //   493: aload_0
    //   494: aload_0
    //   495: getfield e : Landroidx/appcompat/widget/AppCompatTextView;
    //   498: invokevirtual t : (Landroid/view/View;)Z
    //   501: istore #16
    //   503: iload_1
    //   504: ifeq -> 544
    //   507: aload_0
    //   508: getfield c : Landroidx/appcompat/widget/AppCompatTextView;
    //   511: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   514: checkcast gv1
    //   517: astore #17
    //   519: aload #17
    //   521: getfield topMargin : I
    //   524: istore_2
    //   525: aload_0
    //   526: getfield c : Landroidx/appcompat/widget/AppCompatTextView;
    //   529: invokevirtual getMeasuredHeight : ()I
    //   532: iload_2
    //   533: iadd
    //   534: aload #17
    //   536: getfield bottomMargin : I
    //   539: iadd
    //   540: istore_2
    //   541: goto -> 546
    //   544: iconst_0
    //   545: istore_2
    //   546: iload #16
    //   548: ifeq -> 593
    //   551: aload_0
    //   552: getfield e : Landroidx/appcompat/widget/AppCompatTextView;
    //   555: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   558: checkcast gv1
    //   561: astore #17
    //   563: aload #17
    //   565: getfield topMargin : I
    //   568: istore #5
    //   570: aload_0
    //   571: getfield e : Landroidx/appcompat/widget/AppCompatTextView;
    //   574: invokevirtual getMeasuredHeight : ()I
    //   577: iload #5
    //   579: iadd
    //   580: aload #17
    //   582: getfield bottomMargin : I
    //   585: iadd
    //   586: iload_2
    //   587: iadd
    //   588: istore #10
    //   590: goto -> 596
    //   593: iload_2
    //   594: istore #10
    //   596: iload_1
    //   597: ifne -> 611
    //   600: iload_3
    //   601: istore_2
    //   602: iload #4
    //   604: istore #5
    //   606: iload #16
    //   608: ifeq -> 1326
    //   611: iload_1
    //   612: ifeq -> 624
    //   615: aload_0
    //   616: getfield c : Landroidx/appcompat/widget/AppCompatTextView;
    //   619: astore #17
    //   621: goto -> 630
    //   624: aload_0
    //   625: getfield e : Landroidx/appcompat/widget/AppCompatTextView;
    //   628: astore #17
    //   630: iload #16
    //   632: ifeq -> 644
    //   635: aload_0
    //   636: getfield e : Landroidx/appcompat/widget/AppCompatTextView;
    //   639: astore #18
    //   641: goto -> 650
    //   644: aload_0
    //   645: getfield c : Landroidx/appcompat/widget/AppCompatTextView;
    //   648: astore #18
    //   650: aload #17
    //   652: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   655: checkcast gv1
    //   658: astore #17
    //   660: aload #18
    //   662: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   665: checkcast gv1
    //   668: astore #18
    //   670: iload_1
    //   671: ifeq -> 684
    //   674: aload_0
    //   675: getfield c : Landroidx/appcompat/widget/AppCompatTextView;
    //   678: invokevirtual getMeasuredWidth : ()I
    //   681: ifgt -> 699
    //   684: iload #16
    //   686: ifeq -> 705
    //   689: aload_0
    //   690: getfield e : Landroidx/appcompat/widget/AppCompatTextView;
    //   693: invokevirtual getMeasuredWidth : ()I
    //   696: ifle -> 705
    //   699: iconst_1
    //   700: istore #9
    //   702: goto -> 708
    //   705: iconst_0
    //   706: istore #9
    //   708: aload_0
    //   709: getfield y : I
    //   712: bipush #112
    //   714: iand
    //   715: istore_2
    //   716: iload_2
    //   717: bipush #48
    //   719: if_icmpeq -> 855
    //   722: iload_2
    //   723: bipush #80
    //   725: if_icmpeq -> 832
    //   728: iload #15
    //   730: iload #13
    //   732: isub
    //   733: iload #14
    //   735: isub
    //   736: iload #10
    //   738: isub
    //   739: iconst_2
    //   740: idiv
    //   741: istore #5
    //   743: aload #17
    //   745: getfield topMargin : I
    //   748: aload_0
    //   749: getfield t : I
    //   752: iadd
    //   753: istore_2
    //   754: iload #5
    //   756: iload_2
    //   757: if_icmpge -> 763
    //   760: goto -> 824
    //   763: iload #15
    //   765: iload #14
    //   767: isub
    //   768: iload #10
    //   770: isub
    //   771: iload #5
    //   773: isub
    //   774: iload #13
    //   776: isub
    //   777: istore #10
    //   779: aload #17
    //   781: getfield bottomMargin : I
    //   784: istore #14
    //   786: aload_0
    //   787: getfield u : I
    //   790: istore #15
    //   792: iload #5
    //   794: istore_2
    //   795: iload #10
    //   797: iload #14
    //   799: iload #15
    //   801: iadd
    //   802: if_icmpge -> 824
    //   805: iconst_0
    //   806: iload #5
    //   808: aload #18
    //   810: getfield bottomMargin : I
    //   813: iload #15
    //   815: iadd
    //   816: iload #10
    //   818: isub
    //   819: isub
    //   820: invokestatic max : (II)I
    //   823: istore_2
    //   824: iload #13
    //   826: iload_2
    //   827: iadd
    //   828: istore_2
    //   829: goto -> 871
    //   832: iload #15
    //   834: iload #14
    //   836: isub
    //   837: aload #18
    //   839: getfield bottomMargin : I
    //   842: isub
    //   843: aload_0
    //   844: getfield u : I
    //   847: isub
    //   848: iload #10
    //   850: isub
    //   851: istore_2
    //   852: goto -> 871
    //   855: aload_0
    //   856: invokevirtual getPaddingTop : ()I
    //   859: aload #17
    //   861: getfield topMargin : I
    //   864: iadd
    //   865: aload_0
    //   866: getfield t : I
    //   869: iadd
    //   870: istore_2
    //   871: iload #8
    //   873: ifeq -> 1108
    //   876: iload #9
    //   878: ifeq -> 890
    //   881: aload_0
    //   882: getfield r : I
    //   885: istore #5
    //   887: goto -> 893
    //   890: iconst_0
    //   891: istore #5
    //   893: iload #5
    //   895: aload #19
    //   897: iconst_1
    //   898: iaload
    //   899: isub
    //   900: istore #5
    //   902: iload #4
    //   904: iconst_0
    //   905: iload #5
    //   907: invokestatic max : (II)I
    //   910: isub
    //   911: istore #4
    //   913: aload #19
    //   915: iconst_1
    //   916: iconst_0
    //   917: iload #5
    //   919: ineg
    //   920: invokestatic max : (II)I
    //   923: iastore
    //   924: iload_1
    //   925: ifeq -> 998
    //   928: aload_0
    //   929: getfield c : Landroidx/appcompat/widget/AppCompatTextView;
    //   932: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   935: checkcast gv1
    //   938: astore #17
    //   940: iload #4
    //   942: aload_0
    //   943: getfield c : Landroidx/appcompat/widget/AppCompatTextView;
    //   946: invokevirtual getMeasuredWidth : ()I
    //   949: isub
    //   950: istore #8
    //   952: aload_0
    //   953: getfield c : Landroidx/appcompat/widget/AppCompatTextView;
    //   956: invokevirtual getMeasuredHeight : ()I
    //   959: iload_2
    //   960: iadd
    //   961: istore #5
    //   963: aload_0
    //   964: getfield c : Landroidx/appcompat/widget/AppCompatTextView;
    //   967: iload #8
    //   969: iload_2
    //   970: iload #4
    //   972: iload #5
    //   974: invokevirtual layout : (IIII)V
    //   977: iload #8
    //   979: aload_0
    //   980: getfield s : I
    //   983: isub
    //   984: istore_2
    //   985: iload #5
    //   987: aload #17
    //   989: getfield bottomMargin : I
    //   992: iadd
    //   993: istore #5
    //   995: goto -> 1008
    //   998: iload #4
    //   1000: istore #8
    //   1002: iload_2
    //   1003: istore #5
    //   1005: iload #8
    //   1007: istore_2
    //   1008: iload #16
    //   1010: ifeq -> 1082
    //   1013: iload #5
    //   1015: aload_0
    //   1016: getfield e : Landroidx/appcompat/widget/AppCompatTextView;
    //   1019: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1022: checkcast gv1
    //   1025: getfield topMargin : I
    //   1028: iadd
    //   1029: istore #8
    //   1031: aload_0
    //   1032: getfield e : Landroidx/appcompat/widget/AppCompatTextView;
    //   1035: invokevirtual getMeasuredWidth : ()I
    //   1038: istore #10
    //   1040: aload_0
    //   1041: getfield e : Landroidx/appcompat/widget/AppCompatTextView;
    //   1044: invokevirtual getMeasuredHeight : ()I
    //   1047: istore #5
    //   1049: aload_0
    //   1050: getfield e : Landroidx/appcompat/widget/AppCompatTextView;
    //   1053: iload #4
    //   1055: iload #10
    //   1057: isub
    //   1058: iload #8
    //   1060: iload #4
    //   1062: iload #5
    //   1064: iload #8
    //   1066: iadd
    //   1067: invokevirtual layout : (IIII)V
    //   1070: iload #4
    //   1072: aload_0
    //   1073: getfield s : I
    //   1076: isub
    //   1077: istore #5
    //   1079: goto -> 1086
    //   1082: iload #4
    //   1084: istore #5
    //   1086: iload #9
    //   1088: ifeq -> 1099
    //   1091: iload_2
    //   1092: iload #5
    //   1094: invokestatic min : (II)I
    //   1097: istore #4
    //   1099: iload_3
    //   1100: istore_2
    //   1101: iload #4
    //   1103: istore #5
    //   1105: goto -> 1326
    //   1108: iload #9
    //   1110: ifeq -> 1122
    //   1113: aload_0
    //   1114: getfield r : I
    //   1117: istore #5
    //   1119: goto -> 1128
    //   1122: iconst_0
    //   1123: istore #5
    //   1125: goto -> 1119
    //   1128: iload #5
    //   1130: aload #19
    //   1132: iconst_0
    //   1133: iaload
    //   1134: isub
    //   1135: istore #5
    //   1137: iconst_0
    //   1138: iload #5
    //   1140: invokestatic max : (II)I
    //   1143: iload_3
    //   1144: iadd
    //   1145: istore_3
    //   1146: aload #19
    //   1148: iconst_0
    //   1149: iconst_0
    //   1150: iload #5
    //   1152: ineg
    //   1153: invokestatic max : (II)I
    //   1156: iastore
    //   1157: iload_1
    //   1158: ifeq -> 1229
    //   1161: aload_0
    //   1162: getfield c : Landroidx/appcompat/widget/AppCompatTextView;
    //   1165: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1168: checkcast gv1
    //   1171: astore #17
    //   1173: aload_0
    //   1174: getfield c : Landroidx/appcompat/widget/AppCompatTextView;
    //   1177: invokevirtual getMeasuredWidth : ()I
    //   1180: iload_3
    //   1181: iadd
    //   1182: istore #8
    //   1184: aload_0
    //   1185: getfield c : Landroidx/appcompat/widget/AppCompatTextView;
    //   1188: invokevirtual getMeasuredHeight : ()I
    //   1191: iload_2
    //   1192: iadd
    //   1193: istore #5
    //   1195: aload_0
    //   1196: getfield c : Landroidx/appcompat/widget/AppCompatTextView;
    //   1199: iload_3
    //   1200: iload_2
    //   1201: iload #8
    //   1203: iload #5
    //   1205: invokevirtual layout : (IIII)V
    //   1208: iload #8
    //   1210: aload_0
    //   1211: getfield s : I
    //   1214: iadd
    //   1215: istore #8
    //   1217: iload #5
    //   1219: aload #17
    //   1221: getfield bottomMargin : I
    //   1224: iadd
    //   1225: istore_2
    //   1226: goto -> 1232
    //   1229: iload_3
    //   1230: istore #8
    //   1232: iload #16
    //   1234: ifeq -> 1300
    //   1237: iload_2
    //   1238: aload_0
    //   1239: getfield e : Landroidx/appcompat/widget/AppCompatTextView;
    //   1242: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1245: checkcast gv1
    //   1248: getfield topMargin : I
    //   1251: iadd
    //   1252: istore_2
    //   1253: aload_0
    //   1254: getfield e : Landroidx/appcompat/widget/AppCompatTextView;
    //   1257: invokevirtual getMeasuredWidth : ()I
    //   1260: iload_3
    //   1261: iadd
    //   1262: istore #5
    //   1264: aload_0
    //   1265: getfield e : Landroidx/appcompat/widget/AppCompatTextView;
    //   1268: invokevirtual getMeasuredHeight : ()I
    //   1271: istore #10
    //   1273: aload_0
    //   1274: getfield e : Landroidx/appcompat/widget/AppCompatTextView;
    //   1277: iload_3
    //   1278: iload_2
    //   1279: iload #5
    //   1281: iload #10
    //   1283: iload_2
    //   1284: iadd
    //   1285: invokevirtual layout : (IIII)V
    //   1288: iload #5
    //   1290: aload_0
    //   1291: getfield s : I
    //   1294: iadd
    //   1295: istore #10
    //   1297: goto -> 1303
    //   1300: iload_3
    //   1301: istore #10
    //   1303: iload_3
    //   1304: istore_2
    //   1305: iload #4
    //   1307: istore #5
    //   1309: iload #9
    //   1311: ifeq -> 1326
    //   1314: iload #8
    //   1316: iload #10
    //   1318: invokestatic max : (II)I
    //   1321: istore_2
    //   1322: iload #4
    //   1324: istore #5
    //   1326: aload_0
    //   1327: getfield F : Ljava/util/ArrayList;
    //   1330: astore #20
    //   1332: aload_0
    //   1333: iconst_3
    //   1334: aload #20
    //   1336: invokevirtual a : (ILjava/util/ArrayList;)V
    //   1339: aload #20
    //   1341: invokevirtual size : ()I
    //   1344: istore #4
    //   1346: iconst_0
    //   1347: istore_3
    //   1348: iload_3
    //   1349: iload #4
    //   1351: if_icmpge -> 1379
    //   1354: aload_0
    //   1355: aload #20
    //   1357: iload_3
    //   1358: invokevirtual get : (I)Ljava/lang/Object;
    //   1361: checkcast android/view/View
    //   1364: iload_2
    //   1365: iload #6
    //   1367: aload #19
    //   1369: invokevirtual p : (Landroid/view/View;II[I)I
    //   1372: istore_2
    //   1373: iinc #3, 1
    //   1376: goto -> 1348
    //   1379: aload_0
    //   1380: iconst_5
    //   1381: aload #20
    //   1383: invokevirtual a : (ILjava/util/ArrayList;)V
    //   1386: aload #20
    //   1388: invokevirtual size : ()I
    //   1391: istore #4
    //   1393: iconst_0
    //   1394: istore_3
    //   1395: iload_3
    //   1396: iload #4
    //   1398: if_icmpge -> 1428
    //   1401: aload_0
    //   1402: aload #20
    //   1404: iload_3
    //   1405: invokevirtual get : (I)Ljava/lang/Object;
    //   1408: checkcast android/view/View
    //   1411: iload #5
    //   1413: iload #6
    //   1415: aload #19
    //   1417: invokevirtual q : (Landroid/view/View;II[I)I
    //   1420: istore #5
    //   1422: iinc #3, 1
    //   1425: goto -> 1395
    //   1428: aload_0
    //   1429: iconst_1
    //   1430: aload #20
    //   1432: invokevirtual a : (ILjava/util/ArrayList;)V
    //   1435: aload #19
    //   1437: iconst_0
    //   1438: iaload
    //   1439: istore #8
    //   1441: aload #19
    //   1443: iconst_1
    //   1444: iaload
    //   1445: istore #9
    //   1447: aload #20
    //   1449: invokevirtual size : ()I
    //   1452: istore #10
    //   1454: iconst_0
    //   1455: istore #4
    //   1457: iconst_0
    //   1458: istore_3
    //   1459: iload #4
    //   1461: iload #10
    //   1463: if_icmpge -> 1562
    //   1466: aload #20
    //   1468: iload #4
    //   1470: invokevirtual get : (I)Ljava/lang/Object;
    //   1473: checkcast android/view/View
    //   1476: astore #17
    //   1478: aload #17
    //   1480: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   1483: checkcast gv1
    //   1486: astore #18
    //   1488: aload #18
    //   1490: getfield leftMargin : I
    //   1493: iload #8
    //   1495: isub
    //   1496: istore #8
    //   1498: aload #18
    //   1500: getfield rightMargin : I
    //   1503: iload #9
    //   1505: isub
    //   1506: istore #9
    //   1508: iconst_0
    //   1509: iload #8
    //   1511: invokestatic max : (II)I
    //   1514: istore #14
    //   1516: iconst_0
    //   1517: iload #9
    //   1519: invokestatic max : (II)I
    //   1522: istore #13
    //   1524: iconst_0
    //   1525: iload #8
    //   1527: ineg
    //   1528: invokestatic max : (II)I
    //   1531: istore #8
    //   1533: iconst_0
    //   1534: iload #9
    //   1536: ineg
    //   1537: invokestatic max : (II)I
    //   1540: istore #9
    //   1542: iload_3
    //   1543: aload #17
    //   1545: invokevirtual getMeasuredWidth : ()I
    //   1548: iload #14
    //   1550: iadd
    //   1551: iload #13
    //   1553: iadd
    //   1554: iadd
    //   1555: istore_3
    //   1556: iinc #4, 1
    //   1559: goto -> 1459
    //   1562: iconst_0
    //   1563: istore #4
    //   1565: iload #11
    //   1567: iload #7
    //   1569: isub
    //   1570: iload #12
    //   1572: isub
    //   1573: iconst_2
    //   1574: idiv
    //   1575: iload #7
    //   1577: iadd
    //   1578: iload_3
    //   1579: iconst_2
    //   1580: idiv
    //   1581: isub
    //   1582: istore #7
    //   1584: iload_3
    //   1585: iload #7
    //   1587: iadd
    //   1588: istore_3
    //   1589: iload #7
    //   1591: iload_2
    //   1592: if_icmpge -> 1598
    //   1595: goto -> 1618
    //   1598: iload_3
    //   1599: iload #5
    //   1601: if_icmple -> 1615
    //   1604: iload #7
    //   1606: iload_3
    //   1607: iload #5
    //   1609: isub
    //   1610: isub
    //   1611: istore_2
    //   1612: goto -> 1618
    //   1615: iload #7
    //   1617: istore_2
    //   1618: aload #20
    //   1620: invokevirtual size : ()I
    //   1623: istore #5
    //   1625: iload #4
    //   1627: istore_3
    //   1628: iload_3
    //   1629: iload #5
    //   1631: if_icmpge -> 1659
    //   1634: aload_0
    //   1635: aload #20
    //   1637: iload_3
    //   1638: invokevirtual get : (I)Ljava/lang/Object;
    //   1641: checkcast android/view/View
    //   1644: iload_2
    //   1645: iload #6
    //   1647: aload #19
    //   1649: invokevirtual p : (Landroid/view/View;II[I)I
    //   1652: istore_2
    //   1653: iinc #3, 1
    //   1656: goto -> 1628
    //   1659: aload #20
    //   1661: invokevirtual clear : ()V
    //   1664: return
  }
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    boolean bool1 = d42.a;
    int i = getLayoutDirection();
    boolean bool = false;
    if (i == 1) {
      i1 = 1;
      n = 0;
    } else {
      n = 1;
      i1 = 0;
    } 
    if (t((View)this.f)) {
      s((View)this.f, paramInt1, 0, paramInt2, this.q);
      i = this.f.getMeasuredWidth();
      i = k((View)this.f) + i;
      int i6 = this.f.getMeasuredHeight();
      m = Math.max(0, l((View)this.f) + i6);
      k = View.combineMeasuredStates(0, this.f.getMeasuredState());
    } else {
      i = 0;
      m = 0;
      k = m;
    } 
    int i2 = i;
    int j = m;
    i = k;
    if (t((View)this.j)) {
      s((View)this.j, paramInt1, 0, paramInt2, this.q);
      i = this.j.getMeasuredWidth();
      i2 = k((View)this.j) + i;
      i = this.j.getMeasuredHeight();
      j = Math.max(m, l((View)this.j) + i);
      i = View.combineMeasuredStates(k, this.j.getMeasuredState());
    } 
    int k = getCurrentContentInsetStart();
    int m = Math.max(k, i2);
    k = Math.max(0, k - i2);
    int[] arrayOfInt = this.H;
    arrayOfInt[i1] = k;
    if (t((View)this.b)) {
      s((View)this.b, paramInt1, m, paramInt2, this.q);
      k = this.b.getMeasuredWidth();
      k = k((View)this.b) + k;
      i1 = this.b.getMeasuredHeight();
      j = Math.max(j, l((View)this.b) + i1);
      i = View.combineMeasuredStates(i, this.b.getMeasuredState());
    } else {
      k = 0;
    } 
    int i1 = getCurrentContentInsetEnd();
    i2 = m + Math.max(i1, k);
    arrayOfInt[n] = Math.max(0, i1 - k);
    i1 = i2;
    m = j;
    k = i;
    if (t(this.k)) {
      i1 = i2 + r(this.k, paramInt1, i2, paramInt2, 0, arrayOfInt);
      k = this.k.getMeasuredHeight();
      m = Math.max(j, l(this.k) + k);
      k = View.combineMeasuredStates(i, this.k.getMeasuredState());
    } 
    i = i1;
    int n = m;
    j = k;
    if (t((View)this.g)) {
      i = i1 + r((View)this.g, paramInt1, i1, paramInt2, 0, arrayOfInt);
      j = this.g.getMeasuredHeight();
      n = Math.max(m, l((View)this.g) + j);
      j = View.combineMeasuredStates(k, this.g.getMeasuredState());
    } 
    m = getChildCount();
    for (k = 0; k < m; k++) {
      View view = getChildAt(k);
      if (((gv1)view.getLayoutParams()).b == 0 && t(view)) {
        i += r(view, paramInt1, i, paramInt2, 0, arrayOfInt);
        i1 = view.getMeasuredHeight();
        n = Math.max(n, l(view) + i1);
        j = View.combineMeasuredStates(j, view.getMeasuredState());
      } 
    } 
    int i4 = this.t + this.u;
    int i5 = this.r + this.s;
    if (t((View)this.c)) {
      r((View)this.c, paramInt1, i + i5, paramInt2, i4, arrayOfInt);
      m = this.c.getMeasuredWidth();
      i1 = k((View)this.c);
      i2 = this.c.getMeasuredHeight();
      k = l((View)this.c);
      j = View.combineMeasuredStates(j, this.c.getMeasuredState());
      k += i2;
      m = i1 + m;
    } else {
      k = 0;
      m = 0;
    } 
    i2 = m;
    int i3 = k;
    i1 = j;
    if (t((View)this.e)) {
      i2 = Math.max(m, r((View)this.e, paramInt1, i + i5, paramInt2, i4 + k, arrayOfInt));
      m = this.e.getMeasuredHeight();
      i3 = k + l((View)this.e) + m;
      i1 = View.combineMeasuredStates(j, this.e.getMeasuredState());
    } 
    n = Math.max(n, i3);
    j = getPaddingLeft();
    i3 = getPaddingRight();
    k = getPaddingTop();
    m = getPaddingBottom();
    j = View.resolveSizeAndState(Math.max(i3 + j + i + i2, getSuggestedMinimumWidth()), paramInt1, 0xFF000000 & i1);
    i = View.resolveSizeAndState(Math.max(m + k + n, getSuggestedMinimumHeight()), paramInt2, i1 << 16);
    if (this.R) {
      k = getChildCount();
      paramInt1 = 0;
      while (true) {
        paramInt2 = bool;
        if (paramInt1 < k) {
          View view = getChildAt(paramInt1);
          if (!t(view) || view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) {
            paramInt1++;
            continue;
          } 
        } else {
          break;
        } 
        paramInt2 = i;
        break;
      } 
      setMeasuredDimension(j, paramInt2);
      return;
    } 
    paramInt2 = i;
    break;
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof iv1)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    iv1 iv1 = (iv1)paramParcelable;
    super.onRestoreInstanceState(((j)iv1).b);
    ActionMenuView actionMenuView = this.b;
    if (actionMenuView != null) {
      rw0 rw0 = actionMenuView.b;
    } else {
      actionMenuView = null;
    } 
    int i = iv1.e;
    if (i != 0 && this.O != null && actionMenuView != null) {
      MenuItem menuItem = actionMenuView.findItem(i);
      if (menuItem != null)
        menuItem.expandActionView(); 
    } 
    if (iv1.f) {
      yi1 yi11 = this.V;
      removeCallbacks((Runnable)yi11);
      post((Runnable)yi11);
    } 
  }
  
  public final void onRtlPropertiesChanged(int paramInt) {
    super.onRtlPropertiesChanged(paramInt);
    d();
    rh1 rh11 = this.v;
    boolean bool = true;
    if (paramInt != 1)
      bool = false; 
    if (bool == rh11.g)
      return; 
    rh11.g = bool;
    if (rh11.h) {
      if (bool) {
        paramInt = rh11.d;
        if (paramInt == Integer.MIN_VALUE)
          paramInt = rh11.e; 
        rh11.a = paramInt;
        paramInt = rh11.c;
        if (paramInt == Integer.MIN_VALUE)
          paramInt = rh11.f; 
        rh11.b = paramInt;
        return;
      } 
      paramInt = rh11.c;
      if (paramInt == Integer.MIN_VALUE)
        paramInt = rh11.e; 
      rh11.a = paramInt;
      paramInt = rh11.d;
      if (paramInt == Integer.MIN_VALUE)
        paramInt = rh11.f; 
      rh11.b = paramInt;
      return;
    } 
    rh11.a = rh11.e;
    rh11.b = rh11.f;
  }
  
  public final Parcelable onSaveInstanceState() {
    j j = new j(super.onSaveInstanceState());
    fv1 fv11 = this.O;
    if (fv11 != null) {
      uw0 uw0 = fv11.c;
      if (uw0 != null)
        ((iv1)j).e = uw0.a; 
    } 
    ((iv1)j).f = o();
    return (Parcelable)j;
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionMasked();
    if (i == 0)
      this.D = false; 
    if (!this.D) {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if (i == 0 && !bool)
        this.D = true; 
    } 
    if (i == 1 || i == 3) {
      this.D = false;
      return true;
    } 
    return true;
  }
  
  public final int p(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    gv1 gv1 = (gv1)paramView.getLayoutParams();
    int i = ((ViewGroup.MarginLayoutParams)gv1).leftMargin - paramArrayOfint[0];
    paramInt1 = Math.max(0, i) + paramInt1;
    paramArrayOfint[0] = Math.max(0, -i);
    paramInt2 = j(paramView, paramInt2);
    i = paramView.getMeasuredWidth();
    paramView.layout(paramInt1, paramInt2, paramInt1 + i, paramView.getMeasuredHeight() + paramInt2);
    return i + ((ViewGroup.MarginLayoutParams)gv1).rightMargin + paramInt1;
  }
  
  public final int q(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    gv1 gv1 = (gv1)paramView.getLayoutParams();
    int i = ((ViewGroup.MarginLayoutParams)gv1).rightMargin - paramArrayOfint[1];
    paramInt1 -= Math.max(0, i);
    paramArrayOfint[1] = Math.max(0, -i);
    i = j(paramView, paramInt2);
    paramInt2 = paramView.getMeasuredWidth();
    paramView.layout(paramInt1 - paramInt2, i, paramInt1, paramView.getMeasuredHeight() + i);
    return paramInt1 - paramInt2 + ((ViewGroup.MarginLayoutParams)gv1).leftMargin;
  }
  
  public final int r(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int j = marginLayoutParams.leftMargin - paramArrayOfint[0];
    int k = marginLayoutParams.rightMargin - paramArrayOfint[1];
    int i = Math.max(0, j);
    i = Math.max(0, k) + i;
    paramArrayOfint[0] = Math.max(0, -j);
    paramArrayOfint[1] = Math.max(0, -k);
    j = getPaddingLeft();
    paramInt2 = ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + j + i + paramInt2, marginLayoutParams.width);
    paramInt1 = getPaddingTop();
    paramView.measure(paramInt2, ViewGroup.getChildMeasureSpec(paramInt3, getPaddingBottom() + paramInt1 + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + paramInt4, marginLayoutParams.height));
    return paramView.getMeasuredWidth() + i;
  }
  
  public final void s(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = getPaddingLeft();
    i = ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + i + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + paramInt2, marginLayoutParams.width);
    paramInt1 = getPaddingTop();
    paramInt2 = ViewGroup.getChildMeasureSpec(paramInt3, getPaddingBottom() + paramInt1 + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
    paramInt3 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = paramInt2;
    if (paramInt3 != 1073741824) {
      paramInt1 = paramInt2;
      if (paramInt4 >= 0) {
        paramInt1 = paramInt4;
        if (paramInt3 != 0)
          paramInt1 = Math.min(View.MeasureSpec.getSize(paramInt2), paramInt4); 
        paramInt1 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      } 
    } 
    paramView.measure(i, paramInt1);
  }
  
  public void setBackInvokedCallbackEnabled(boolean paramBoolean) {
    if (this.U != paramBoolean) {
      this.U = paramBoolean;
      v();
    } 
  }
  
  public void setCollapseContentDescription(int paramInt) {
    CharSequence charSequence;
    if (paramInt != 0) {
      charSequence = getContext().getText(paramInt);
    } else {
      charSequence = null;
    } 
    setCollapseContentDescription(charSequence);
  }
  
  public void setCollapseContentDescription(CharSequence paramCharSequence) {
    if (!TextUtils.isEmpty(paramCharSequence))
      c(); 
    c7 c71 = this.j;
    if (c71 != null)
      c71.setContentDescription(paramCharSequence); 
  }
  
  public void setCollapseIcon(int paramInt) {
    setCollapseIcon(ws2.I(getContext(), paramInt));
  }
  
  public void setCollapseIcon(Drawable paramDrawable) {
    if (paramDrawable != null) {
      c();
      this.j.setImageDrawable(paramDrawable);
      return;
    } 
    c7 c71 = this.j;
    if (c71 != null)
      c71.setImageDrawable(this.h); 
  }
  
  public void setCollapsible(boolean paramBoolean) {
    this.R = paramBoolean;
    requestLayout();
  }
  
  public void setContentInsetEndWithActions(int paramInt) {
    int i = paramInt;
    if (paramInt < 0)
      i = Integer.MIN_VALUE; 
    if (i != this.x) {
      this.x = i;
      if (getNavigationIcon() != null)
        requestLayout(); 
    } 
  }
  
  public void setContentInsetStartWithNavigation(int paramInt) {
    int i = paramInt;
    if (paramInt < 0)
      i = Integer.MIN_VALUE; 
    if (i != this.w) {
      this.w = i;
      if (getNavigationIcon() != null)
        requestLayout(); 
    } 
  }
  
  public void setLogo(int paramInt) {
    setLogo(ws2.I(getContext(), paramInt));
  }
  
  public void setLogo(Drawable paramDrawable) {
    AppCompatImageView appCompatImageView = this.g;
    if (paramDrawable != null) {
      if (appCompatImageView == null)
        this.g = new AppCompatImageView(getContext()); 
      if (!n((View)this.g))
        b((View)this.g, true); 
    } else if (appCompatImageView != null && n((View)appCompatImageView)) {
      removeView((View)this.g);
      this.G.remove(this.g);
    } 
    appCompatImageView = this.g;
    if (appCompatImageView != null)
      appCompatImageView.setImageDrawable(paramDrawable); 
  }
  
  public void setLogoDescription(int paramInt) {
    setLogoDescription(getContext().getText(paramInt));
  }
  
  public void setLogoDescription(CharSequence paramCharSequence) {
    if (!TextUtils.isEmpty(paramCharSequence) && this.g == null)
      this.g = new AppCompatImageView(getContext()); 
    AppCompatImageView appCompatImageView = this.g;
    if (appCompatImageView != null)
      appCompatImageView.setContentDescription(paramCharSequence); 
  }
  
  public void setNavigationContentDescription(int paramInt) {
    CharSequence charSequence;
    if (paramInt != 0) {
      charSequence = getContext().getText(paramInt);
    } else {
      charSequence = null;
    } 
    setNavigationContentDescription(charSequence);
  }
  
  public void setNavigationContentDescription(CharSequence paramCharSequence) {
    if (!TextUtils.isEmpty(paramCharSequence))
      g(); 
    c7 c71 = this.f;
    if (c71 != null) {
      c71.setContentDescription(paramCharSequence);
      qv.Y((View)this.f, paramCharSequence);
    } 
  }
  
  public void setNavigationIcon(int paramInt) {
    setNavigationIcon(ws2.I(getContext(), paramInt));
  }
  
  public void setNavigationIcon(Drawable paramDrawable) {
    if (paramDrawable != null) {
      g();
      if (!n((View)this.f))
        b((View)this.f, true); 
    } else {
      c7 c72 = this.f;
      if (c72 != null && n((View)c72)) {
        removeView((View)this.f);
        this.G.remove(this.f);
      } 
    } 
    c7 c71 = this.f;
    if (c71 != null)
      c71.setImageDrawable(paramDrawable); 
  }
  
  public void setNavigationOnClickListener(View.OnClickListener paramOnClickListener) {
    g();
    this.f.setOnClickListener(paramOnClickListener);
  }
  
  public void setOnMenuItemClickListener(hv1 paramhv1) {
    this.K = paramhv1;
  }
  
  public void setOverflowIcon(Drawable paramDrawable) {
    e();
    this.b.setOverflowIcon(paramDrawable);
  }
  
  public void setPopupTheme(int paramInt) {
    if (this.m != paramInt) {
      this.m = paramInt;
      if (paramInt == 0) {
        this.l = getContext();
        return;
      } 
      this.l = (Context)new ContextThemeWrapper(getContext(), paramInt);
    } 
  }
  
  public void setSubtitle(int paramInt) {
    setSubtitle(getContext().getText(paramInt));
  }
  
  public void setSubtitle(CharSequence paramCharSequence) {
    ColorStateList colorStateList;
    boolean bool = TextUtils.isEmpty(paramCharSequence);
    AppCompatTextView appCompatTextView2 = this.e;
    if (!bool) {
      if (appCompatTextView2 == null) {
        Context context = getContext();
        appCompatTextView2 = new AppCompatTextView(context);
        this.e = appCompatTextView2;
        appCompatTextView2.setSingleLine();
        this.e.setEllipsize(TextUtils.TruncateAt.END);
        int i = this.o;
        if (i != 0)
          this.e.setTextAppearance(context, i); 
        colorStateList = this.C;
        if (colorStateList != null)
          this.e.setTextColor(colorStateList); 
      } 
      if (!n((View)this.e))
        b((View)this.e, true); 
    } else if (colorStateList != null && n((View)colorStateList)) {
      removeView((View)this.e);
      this.G.remove(this.e);
    } 
    AppCompatTextView appCompatTextView1 = this.e;
    if (appCompatTextView1 != null)
      appCompatTextView1.setText(paramCharSequence); 
    this.A = paramCharSequence;
  }
  
  public void setSubtitleTextColor(int paramInt) {
    setSubtitleTextColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setSubtitleTextColor(ColorStateList paramColorStateList) {
    this.C = paramColorStateList;
    AppCompatTextView appCompatTextView = this.e;
    if (appCompatTextView != null)
      appCompatTextView.setTextColor(paramColorStateList); 
  }
  
  public void setTitle(int paramInt) {
    setTitle(getContext().getText(paramInt));
  }
  
  public void setTitle(CharSequence paramCharSequence) {
    ColorStateList colorStateList;
    boolean bool = TextUtils.isEmpty(paramCharSequence);
    AppCompatTextView appCompatTextView2 = this.c;
    if (!bool) {
      if (appCompatTextView2 == null) {
        Context context = getContext();
        appCompatTextView2 = new AppCompatTextView(context);
        this.c = appCompatTextView2;
        appCompatTextView2.setSingleLine();
        this.c.setEllipsize(TextUtils.TruncateAt.END);
        int i = this.n;
        if (i != 0)
          this.c.setTextAppearance(context, i); 
        colorStateList = this.B;
        if (colorStateList != null)
          this.c.setTextColor(colorStateList); 
      } 
      if (!n((View)this.c))
        b((View)this.c, true); 
    } else if (colorStateList != null && n((View)colorStateList)) {
      removeView((View)this.c);
      this.G.remove(this.c);
    } 
    AppCompatTextView appCompatTextView1 = this.c;
    if (appCompatTextView1 != null)
      appCompatTextView1.setText(paramCharSequence); 
    this.z = paramCharSequence;
  }
  
  public void setTitleMarginBottom(int paramInt) {
    this.u = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginEnd(int paramInt) {
    this.s = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginStart(int paramInt) {
    this.r = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginTop(int paramInt) {
    this.t = paramInt;
    requestLayout();
  }
  
  public void setTitleTextColor(int paramInt) {
    setTitleTextColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setTitleTextColor(ColorStateList paramColorStateList) {
    this.B = paramColorStateList;
    AppCompatTextView appCompatTextView = this.c;
    if (appCompatTextView != null)
      appCompatTextView.setTextColor(paramColorStateList); 
  }
  
  public final boolean t(View paramView) {
    return (paramView != null && paramView.getParent() == this && paramView.getVisibility() != 8);
  }
  
  public final boolean u() {
    ActionMenuView actionMenuView = this.b;
    if (actionMenuView != null) {
      u1 u11 = actionMenuView.g;
      if (u11 != null && u11.l())
        return true; 
    } 
    return false;
  }
  
  public final void v() {
    if (Build.VERSION.SDK_INT >= 33) {
      boolean bool;
      OnBackInvokedDispatcher onBackInvokedDispatcher = ev1.a((View)this);
      fv1 fv11 = this.O;
      if (fv11 != null && fv11.c != null && onBackInvokedDispatcher != null && isAttachedToWindow() && this.U) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool && this.T == null) {
        if (this.S == null)
          this.S = ev1.b((Runnable)new cv1(this, 0)); 
        ev1.c(onBackInvokedDispatcher, this.S);
        this.T = onBackInvokedDispatcher;
        return;
      } 
      if (!bool) {
        onBackInvokedDispatcher = this.T;
        if (onBackInvokedDispatcher != null) {
          ev1.d(onBackInvokedDispatcher, this.S);
          this.T = null;
        } 
      } 
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\widget\Toolbar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */