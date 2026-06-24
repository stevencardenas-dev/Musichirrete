package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.common.internal.Qg.nFLlOYeP;
import de1;
import e32;
import ge1;
import he1;
import id1;
import il;
import j01;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kc1;
import kn0;
import l0;
import od1;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;
import qd1;
import rd1;
import s0;
import sd1;
import sk;
import t0;
import tk;
import tp;
import v22;
import xy;
import yd1;
import zm1;

public abstract class a {
  public tk b;
  
  public RecyclerView c;
  
  public final j01 e;
  
  public final j01 f;
  
  public kn0 g;
  
  public boolean h;
  
  public boolean i;
  
  public final boolean j;
  
  public final boolean k;
  
  public int l;
  
  public boolean m;
  
  public int n;
  
  public int o;
  
  public int p;
  
  public int q;
  
  public a() {
    qd1 qd11 = new qd1(this, 0);
    qd1 qd12 = new qd1(this, 1);
    this.e = new j01(qd11);
    this.f = new j01(qd12);
    this.h = false;
    this.i = false;
    this.j = true;
    this.k = true;
  }
  
  public static int H(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt1 = Math.max(0, paramInt1 - paramInt3);
    if (paramBoolean) {
      if (paramInt4 >= 0) {
        paramInt2 = 1073741824;
        return View.MeasureSpec.makeMeasureSpec(paramInt4, paramInt2);
      } 
      if (paramInt4 != -1 || (paramInt2 != Integer.MIN_VALUE && (paramInt2 == 0 || paramInt2 != 1073741824))) {
        paramInt2 = 0;
        paramInt4 = 0;
      } 
    } else {
      if (paramInt4 >= 0) {
        paramInt2 = 1073741824;
        return View.MeasureSpec.makeMeasureSpec(paramInt4, paramInt2);
      } 
      if (paramInt4 == -1) {
        paramInt4 = paramInt1;
        return View.MeasureSpec.makeMeasureSpec(paramInt4, paramInt2);
      } 
      if (paramInt4 == -2) {
        if (paramInt2 == Integer.MIN_VALUE || paramInt2 == 1073741824) {
          paramInt2 = Integer.MIN_VALUE;
          paramInt4 = paramInt1;
          return View.MeasureSpec.makeMeasureSpec(paramInt4, paramInt2);
        } 
        paramInt2 = 0;
        paramInt4 = paramInt1;
        return View.MeasureSpec.makeMeasureSpec(paramInt4, paramInt2);
      } 
      paramInt2 = 0;
      paramInt4 = 0;
    } 
    paramInt4 = paramInt1;
    return View.MeasureSpec.makeMeasureSpec(paramInt4, paramInt2);
  }
  
  public static int J(View paramView) {
    return paramView.getBottom() + ((sd1)paramView.getLayoutParams()).c.bottom;
  }
  
  public static int L(View paramView) {
    return paramView.getLeft() - ((sd1)paramView.getLayoutParams()).c.left;
  }
  
  public static int M(View paramView) {
    Rect rect = ((sd1)paramView.getLayoutParams()).c;
    return paramView.getMeasuredHeight() + rect.top + rect.bottom;
  }
  
  public static int N(View paramView) {
    Rect rect = ((sd1)paramView.getLayoutParams()).c;
    return paramView.getMeasuredWidth() + rect.left + rect.right;
  }
  
  public static int O(View paramView) {
    return paramView.getRight() + ((sd1)paramView.getLayoutParams()).c.right;
  }
  
  public static int P(View paramView) {
    return paramView.getTop() - ((sd1)paramView.getLayoutParams()).c.top;
  }
  
  public static int R(View paramView) {
    return ((sd1)paramView.getLayoutParams()).b.d();
  }
  
  public static rd1 S(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    Object object = new Object();
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, kc1.a, paramInt1, paramInt2);
    ((rd1)object).a = typedArray.getInt(0, 1);
    ((rd1)object).b = typedArray.getInt(10, 1);
    ((rd1)object).c = typedArray.getBoolean(9, false);
    ((rd1)object).d = typedArray.getBoolean(11, false);
    typedArray.recycle();
    return (rd1)object;
  }
  
  public static boolean X(int paramInt1, int paramInt2, int paramInt3) {
    int i = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    return (paramInt3 > 0 && paramInt1 != paramInt3) ? false : ((i != Integer.MIN_VALUE) ? ((i != 0) ? ((i != 1073741824) ? false : ((paramInt2 == paramInt1))) : true) : ((paramInt2 >= paramInt1)));
  }
  
  public static void Y(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    sd1 sd1 = (sd1)paramView.getLayoutParams();
    Rect rect = sd1.c;
    paramView.layout(paramInt1 + rect.left + ((ViewGroup.MarginLayoutParams)sd1).leftMargin, paramInt2 + rect.top + ((ViewGroup.MarginLayoutParams)sd1).topMargin, paramInt3 - rect.right - ((ViewGroup.MarginLayoutParams)sd1).rightMargin, paramInt4 - rect.bottom - ((ViewGroup.MarginLayoutParams)sd1).bottomMargin);
  }
  
  public static int r(int paramInt1, int paramInt2, int paramInt3) {
    int i = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    if (i != Integer.MIN_VALUE) {
      if (i != 1073741824)
        paramInt1 = Math.max(paramInt2, paramInt3); 
      return paramInt1;
    } 
    return Math.min(paramInt1, Math.max(paramInt2, paramInt3));
  }
  
  public final void A(yd1 paramyd1) {
    for (int i = G() - 1; i >= 0; i--) {
      String str;
      StringBuilder stringBuilder;
      View view = F(i);
      he1 he1 = RecyclerView.O(view);
      if (he1.q()) {
        if (RecyclerView.F0) {
          stringBuilder = new StringBuilder("ignoring view ");
          stringBuilder.append(he1);
          str = stringBuilder.toString();
          Log.d(nFLlOYeP.xYEmkMUvWca, str);
        } 
      } else if (str.h() && !str.j() && !this.c.o.b) {
        if (F(i) != null)
          this.b.j(i); 
        paramyd1.j((he1)str);
      } else {
        F(i);
        this.b.c(i);
        paramyd1.k((View)stringBuilder);
        this.c.i.z((he1)str);
      } 
    } 
  }
  
  public final void A0(int paramInt, yd1 paramyd1) {
    View view = F(paramInt);
    if (F(paramInt) != null)
      this.b.j(paramInt); 
    paramyd1.i(view);
  }
  
  public View B(int paramInt) {
    int i = G();
    for (byte b = 0; b < i; b++) {
      View view = F(b);
      he1 he1 = RecyclerView.O(view);
      if (he1 != null && he1.d() == paramInt && !he1.q() && (this.c.j0.g || !he1.j()))
        return view; 
    } 
    return null;
  }
  
  public boolean B0(RecyclerView paramRecyclerView, View paramView, Rect paramRect, boolean paramBoolean1, boolean paramBoolean2) {
    int i = getPaddingLeft();
    int j = getPaddingTop();
    int i5 = this.p;
    int i7 = getPaddingRight();
    int i4 = this.q;
    int i3 = getPaddingBottom();
    int k = paramView.getLeft() + paramRect.left - paramView.getScrollX();
    int i2 = paramView.getTop() + paramRect.top - paramView.getScrollY();
    int i6 = paramRect.width();
    int n = paramRect.height();
    int i1 = k - i;
    i = Math.min(0, i1);
    int m = i2 - j;
    j = Math.min(0, m);
    i5 = i6 + k - i5 - i7;
    k = Math.max(0, i5);
    n = Math.max(0, n + i2 - i4 - i3);
    if (this.c.getLayoutDirection() == 1) {
      if (k != 0) {
        i = k;
      } else {
        i = Math.max(i, i5);
      } 
    } else if (i == 0) {
      i = Math.min(i1, k);
    } 
    if (j == 0)
      j = Math.min(m, n); 
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = i;
    arrayOfInt[1] = j;
    n = arrayOfInt[0];
    i3 = arrayOfInt[1];
    if (paramBoolean2) {
      View view = paramRecyclerView.getFocusedChild();
      if (view == null)
        return false; 
      i1 = getPaddingLeft();
      m = getPaddingTop();
      k = this.p;
      i = getPaddingRight();
      i2 = this.q;
      j = getPaddingBottom();
      paramRect = this.c.l;
      K(view, paramRect);
      if (paramRect.left - n >= k - i || paramRect.right - n <= i1 || paramRect.top - i3 >= i2 - j || paramRect.bottom - i3 <= m)
        return false; 
    } 
    if (n != 0 || i3 != 0) {
      if (paramBoolean1) {
        paramRecyclerView.scrollBy(n, i3);
        return true;
      } 
      paramRecyclerView.m0(n, i3, false);
      return true;
    } 
    return false;
  }
  
  public abstract sd1 C();
  
  public final void C0() {
    RecyclerView recyclerView = this.c;
    if (recyclerView != null)
      recyclerView.requestLayout(); 
  }
  
  public sd1 D(Context paramContext, AttributeSet paramAttributeSet) {
    return new sd1(paramContext, paramAttributeSet);
  }
  
  public abstract int D0(int paramInt, yd1 paramyd1, de1 paramde1);
  
  public sd1 E(ViewGroup.LayoutParams paramLayoutParams) {
    return (paramLayoutParams instanceof sd1) ? new sd1((sd1)paramLayoutParams) : ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams) ? new sd1((ViewGroup.MarginLayoutParams)paramLayoutParams) : new sd1(paramLayoutParams));
  }
  
  public abstract void E0(int paramInt);
  
  public final View F(int paramInt) {
    tk tk1 = this.b;
    return (tk1 != null) ? tk1.d(paramInt) : null;
  }
  
  public abstract int F0(int paramInt, yd1 paramyd1, de1 paramde1);
  
  public final int G() {
    tk tk1 = this.b;
    return (tk1 != null) ? tk1.e() : 0;
  }
  
  public final void G0(RecyclerView paramRecyclerView) {
    H0(View.MeasureSpec.makeMeasureSpec(paramRecyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(paramRecyclerView.getHeight(), 1073741824));
  }
  
  public final void H0(int paramInt1, int paramInt2) {
    this.p = View.MeasureSpec.getSize(paramInt1);
    paramInt1 = View.MeasureSpec.getMode(paramInt1);
    this.n = paramInt1;
    if (paramInt1 == 0 && !RecyclerView.I0)
      this.p = 0; 
    this.q = View.MeasureSpec.getSize(paramInt2);
    paramInt1 = View.MeasureSpec.getMode(paramInt2);
    this.o = paramInt1;
    if (paramInt1 == 0 && !RecyclerView.I0)
      this.q = 0; 
  }
  
  public int I(yd1 paramyd1, de1 paramde1) {
    RecyclerView recyclerView = this.c;
    return (recyclerView != null && recyclerView.o != null && o()) ? this.c.o.c() : 1;
  }
  
  public void I0(Rect paramRect, int paramInt1, int paramInt2) {
    int m = paramRect.width();
    int i1 = getPaddingLeft();
    int n = getPaddingRight();
    int i = paramRect.height();
    int j = getPaddingTop();
    int k = getPaddingBottom();
    RecyclerView recyclerView = this.c;
    WeakHashMap weakHashMap = v22.a;
    paramInt1 = r(paramInt1, n + i1 + m, recyclerView.getMinimumWidth());
    paramInt2 = r(paramInt2, k + j + i, this.c.getMinimumHeight());
    RecyclerView.f(this.c, paramInt1, paramInt2);
  }
  
  public final void J0(int paramInt1, int paramInt2) {
    int n = G();
    if (n == 0) {
      this.c.p(paramInt1, paramInt2);
      return;
    } 
    int m = Integer.MIN_VALUE;
    int j = Integer.MAX_VALUE;
    byte b = 0;
    int i = Integer.MIN_VALUE;
    int k = Integer.MAX_VALUE;
    while (b < n) {
      View view = F(b);
      Rect rect = this.c.l;
      K(view, rect);
      int i2 = rect.left;
      int i1 = k;
      if (i2 < k)
        i1 = i2; 
      i2 = rect.right;
      k = m;
      if (i2 > m)
        k = i2; 
      m = rect.top;
      i2 = j;
      if (m < j)
        i2 = m; 
      m = rect.bottom;
      j = i;
      if (m > i)
        j = m; 
      b++;
      m = k;
      i = j;
      k = i1;
      j = i2;
    } 
    this.c.l.set(k, j, m, i);
    I0(this.c.l, paramInt1, paramInt2);
  }
  
  public void K(View paramView, Rect paramRect) {
    boolean bool = RecyclerView.E0;
    sd1 sd1 = (sd1)paramView.getLayoutParams();
    Rect rect = sd1.c;
    paramRect.set(paramView.getLeft() - rect.left - ((ViewGroup.MarginLayoutParams)sd1).leftMargin, paramView.getTop() - rect.top - ((ViewGroup.MarginLayoutParams)sd1).topMargin, paramView.getRight() + rect.right + ((ViewGroup.MarginLayoutParams)sd1).rightMargin, paramView.getBottom() + rect.bottom + ((ViewGroup.MarginLayoutParams)sd1).bottomMargin);
  }
  
  public final void K0(RecyclerView paramRecyclerView) {
    if (paramRecyclerView == null) {
      this.c = null;
      this.b = null;
      this.p = 0;
      this.q = 0;
    } else {
      this.c = paramRecyclerView;
      this.b = paramRecyclerView.h;
      this.p = paramRecyclerView.getWidth();
      this.q = paramRecyclerView.getHeight();
    } 
    this.n = 1073741824;
    this.o = 1073741824;
  }
  
  final boolean L0(View paramView, int paramInt1, int paramInt2, sd1 paramsd1) {
    return (paramView.isLayoutRequested() || !this.j || !X(paramView.getWidth(), paramInt1, ((ViewGroup.MarginLayoutParams)paramsd1).width) || !X(paramView.getHeight(), paramInt2, ((ViewGroup.MarginLayoutParams)paramsd1).height));
  }
  
  public boolean M0() {
    return false;
  }
  
  public final boolean N0(View paramView, int paramInt1, int paramInt2, sd1 paramsd1) {
    return (!this.j || !X(paramView.getMeasuredWidth(), paramInt1, ((ViewGroup.MarginLayoutParams)paramsd1).width) || !X(paramView.getMeasuredHeight(), paramInt2, ((ViewGroup.MarginLayoutParams)paramsd1).height));
  }
  
  public abstract void O0(RecyclerView paramRecyclerView, int paramInt);
  
  public final void P0(kn0 paramkn0) {
    kn0 kn01 = this.g;
    if (kn01 != null && paramkn0 != kn01 && kn01.e)
      kn01.i(); 
    this.g = paramkn0;
    RecyclerView recyclerView = this.c;
    ge1 ge1 = recyclerView.g0;
    ge1.i.removeCallbacks((Runnable)ge1);
    ge1.e.abortAnimation();
    if (paramkn0.h) {
      StringBuilder stringBuilder = new StringBuilder("An instance of ");
      stringBuilder.append(paramkn0.getClass().getSimpleName());
      stringBuilder.append(" was started more than once. Each instance of");
      stringBuilder.append(paramkn0.getClass().getSimpleName());
      stringBuilder.append(" is intended to only be used once. You should create a new instance for each use.");
      String str = stringBuilder.toString();
      Log.w(zLtYiJUm.iChbxOWaAjZ, str);
    } 
    paramkn0.b = recyclerView;
    paramkn0.c = this;
    int i = paramkn0.a;
    if (i != -1) {
      recyclerView.j0.a = i;
      paramkn0.e = true;
      paramkn0.d = true;
      paramkn0.f = recyclerView.p.B(i);
      paramkn0.b.g0.b();
      paramkn0.h = true;
      return;
    } 
    l0.l("Invalid target position");
  }
  
  public final int Q() {
    RecyclerView recyclerView = this.c;
    if (recyclerView != null) {
      id1 id1 = recyclerView.getAdapter();
    } else {
      recyclerView = null;
    } 
    return (recyclerView != null) ? recyclerView.c() : 0;
  }
  
  public boolean Q0() {
    return false;
  }
  
  public int T(yd1 paramyd1, de1 paramde1) {
    RecyclerView recyclerView = this.c;
    return (recyclerView != null && recyclerView.o != null && p()) ? this.c.o.c() : 1;
  }
  
  public final void U(View paramView, Rect paramRect) {
    Rect rect = ((sd1)paramView.getLayoutParams()).c;
    paramRect.set(-rect.left, -rect.top, paramView.getWidth() + rect.right, paramView.getHeight() + rect.bottom);
    if (this.c != null) {
      Matrix matrix = paramView.getMatrix();
      if (matrix != null && !matrix.isIdentity()) {
        RectF rectF = this.c.n;
        rectF.set(paramRect);
        matrix.mapRect(rectF);
        paramRect.set((int)Math.floor(rectF.left), (int)Math.floor(rectF.top), (int)Math.ceil(rectF.right), (int)Math.ceil(rectF.bottom));
      } 
    } 
    paramRect.offset(paramView.getLeft(), paramView.getTop());
  }
  
  public abstract boolean V();
  
  public boolean W() {
    return false;
  }
  
  public void Z(View paramView) {
    sd1 sd1 = (sd1)paramView.getLayoutParams();
    Rect rect = this.c.P(paramView);
    int i2 = rect.left;
    int i6 = rect.right;
    int j = rect.top;
    int i = rect.bottom;
    int i3 = this.p;
    int i5 = this.n;
    int n = getPaddingLeft();
    int i1 = getPaddingRight();
    int k = ((ViewGroup.MarginLayoutParams)sd1).leftMargin;
    int m = ((ViewGroup.MarginLayoutParams)sd1).rightMargin;
    int i4 = ((ViewGroup.MarginLayoutParams)sd1).width;
    k = H(o(), i3, i5, i1 + n + k + m + i2 + i6, i4);
    i5 = this.q;
    i1 = this.o;
    i2 = getPaddingTop();
    i3 = getPaddingBottom();
    m = ((ViewGroup.MarginLayoutParams)sd1).topMargin;
    i4 = ((ViewGroup.MarginLayoutParams)sd1).bottomMargin;
    n = ((ViewGroup.MarginLayoutParams)sd1).height;
    i = H(p(), i5, i1, i3 + i2 + m + i4 + j + i, n);
    if (L0(paramView, k, i, sd1))
      paramView.measure(k, i); 
  }
  
  public void a0(int paramInt) {
    RecyclerView recyclerView = this.c;
    if (recyclerView != null) {
      int i = recyclerView.h.e();
      for (byte b = 0; b < i; b++)
        recyclerView.h.d(b).offsetLeftAndRight(paramInt); 
    } 
  }
  
  public void b0(int paramInt) {
    RecyclerView recyclerView = this.c;
    if (recyclerView != null) {
      int i = recyclerView.h.e();
      for (byte b = 0; b < i; b++)
        recyclerView.h.d(b).offsetTopAndBottom(paramInt); 
    } 
  }
  
  public void c0() {}
  
  public void d0(RecyclerView paramRecyclerView) {}
  
  public abstract void e0(RecyclerView paramRecyclerView);
  
  public View f0(View paramView, int paramInt, yd1 paramyd1, de1 paramde1) {
    return null;
  }
  
  public void g0(AccessibilityEvent paramAccessibilityEvent) {
    RecyclerView recyclerView = this.c;
    yd1 yd1 = recyclerView.e;
    if (paramAccessibilityEvent != null) {
      boolean bool2 = true;
      boolean bool1 = bool2;
      if (!recyclerView.canScrollVertically(1)) {
        bool1 = bool2;
        if (!this.c.canScrollVertically(-1)) {
          bool1 = bool2;
          if (!this.c.canScrollHorizontally(-1))
            if (this.c.canScrollHorizontally(1)) {
              bool1 = bool2;
            } else {
              bool1 = false;
            }  
        } 
      } 
      paramAccessibilityEvent.setScrollable(bool1);
      id1 id1 = this.c.o;
      if (id1 != null)
        paramAccessibilityEvent.setItemCount(id1.c()); 
    } 
  }
  
  public final int getPaddingBottom() {
    RecyclerView recyclerView = this.c;
    return (recyclerView != null) ? recyclerView.getPaddingBottom() : 0;
  }
  
  public final int getPaddingEnd() {
    RecyclerView recyclerView = this.c;
    if (recyclerView != null) {
      WeakHashMap weakHashMap = v22.a;
      return recyclerView.getPaddingEnd();
    } 
    return 0;
  }
  
  public final int getPaddingLeft() {
    RecyclerView recyclerView = this.c;
    return (recyclerView != null) ? recyclerView.getPaddingLeft() : 0;
  }
  
  public final int getPaddingRight() {
    RecyclerView recyclerView = this.c;
    return (recyclerView != null) ? recyclerView.getPaddingRight() : 0;
  }
  
  public final int getPaddingStart() {
    RecyclerView recyclerView = this.c;
    if (recyclerView != null) {
      WeakHashMap weakHashMap = v22.a;
      return recyclerView.getPaddingStart();
    } 
    return 0;
  }
  
  public final int getPaddingTop() {
    RecyclerView recyclerView = this.c;
    return (recyclerView != null) ? recyclerView.getPaddingTop() : 0;
  }
  
  public void h0(yd1 paramyd1, de1 paramde1, t0 paramt0) {
    if (this.c.canScrollVertically(-1) || this.c.canScrollHorizontally(-1)) {
      paramt0.a(8192);
      paramt0.o(true);
      paramt0.h(67108864, true);
    } 
    if (this.c.canScrollVertically(1) || this.c.canScrollHorizontally(1)) {
      paramt0.a(4096);
      paramt0.o(true);
      paramt0.h(67108864, true);
    } 
    AccessibilityNodeInfo.CollectionInfo collectionInfo = AccessibilityNodeInfo.CollectionInfo.obtain(T(paramyd1, paramde1), I(paramyd1, paramde1), false, 0);
    paramt0.a.setCollectionInfo(collectionInfo);
  }
  
  public void i0(yd1 paramyd1, de1 paramde1, View paramView, t0 paramt0) {
    boolean bool1;
    boolean bool2;
    if (p()) {
      bool1 = R(paramView);
    } else {
      bool1 = false;
    } 
    if (o()) {
      bool2 = R(paramView);
    } else {
      bool2 = false;
    } 
    paramt0.j(s0.a(false, bool1, 1, bool2, 1));
  }
  
  public final void j0(View paramView, t0 paramt0) {
    he1 he1 = RecyclerView.O(paramView);
    if (he1 != null && !he1.j()) {
      tk tk1 = this.b;
      View view = he1.b;
      if (!((ArrayList)tk1.e).contains(view)) {
        RecyclerView recyclerView = this.c;
        i0(recyclerView.e, recyclerView.j0, paramView, paramt0);
      } 
    } 
  }
  
  public void k0(int paramInt1, int paramInt2) {}
  
  public final void l(View paramView, int paramInt, boolean paramBoolean) {
    he1 he1 = RecyclerView.O(paramView);
    if (paramBoolean || he1.j()) {
      zm1 zm1 = (zm1)this.c.i.c;
      e32 e322 = (e32)zm1.get(he1);
      e32 e321 = e322;
      if (e322 == null) {
        e321 = e32.a();
        zm1.put(he1, e321);
      } 
      e321.a |= 0x1;
    } else {
      this.c.i.z(he1);
    } 
    sd1 sd1 = (sd1)paramView.getLayoutParams();
    if (he1.r() || he1.k()) {
      if (he1.k()) {
        he1.p.m(he1);
      } else {
        he1.l &= 0xFFFFFFDF;
      } 
      this.b.b(paramView, paramInt, paramView.getLayoutParams(), false);
    } else {
      StringBuilder stringBuilder;
      String str;
      ViewParent viewParent = paramView.getParent();
      RecyclerView recyclerView = this.c;
      tk tk1 = this.b;
      int i = -1;
      if (viewParent == recyclerView) {
        RecyclerView recyclerView1;
        sk sk = (sk)tk1.d;
        i = ((xy)tk1.c).b.indexOfChild(paramView);
        if (i == -1 || sk.d(i)) {
          i = -1;
        } else {
          i -= sk.b(i);
        } 
        int j = paramInt;
        if (paramInt == -1)
          j = this.b.e(); 
        if (i != -1) {
          if (i != j) {
            a a1 = this.c.p;
            View view = a1.F(i);
            if (view != null) {
              e32 e32;
              a1.F(i);
              a1.b.c(i);
              sd1 sd11 = (sd1)view.getLayoutParams();
              he1 he11 = RecyclerView.O(view);
              paramBoolean = he11.j();
              RecyclerView recyclerView2 = a1.c;
              if (paramBoolean) {
                zm1 zm1 = (zm1)recyclerView2.i.c;
                e32 e321 = (e32)zm1.get(he11);
                e32 = e321;
                if (e321 == null) {
                  e32 = e32.a();
                  zm1.put(he11, e32);
                } 
                e32.a = 0x1 | e32.a;
              } else {
                ((RecyclerView)e32).i.z(he11);
              } 
              a1.b.b(view, j, (ViewGroup.LayoutParams)sd11, he11.j());
            } else {
              recyclerView1 = a1.c;
              StringBuilder stringBuilder1 = new StringBuilder("Cannot move a child from non-existing index:");
              stringBuilder1.append(i);
              stringBuilder1.append(recyclerView1.toString());
              throw new IllegalArgumentException(stringBuilder1.toString());
            } 
          } 
        } else {
          paramInt = this.c.indexOfChild((View)recyclerView1);
          str = this.c.B();
          stringBuilder = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
          stringBuilder.append(paramInt);
          stringBuilder.append(str);
          throw new IllegalStateException(stringBuilder.toString());
        } 
      } else {
        str.a((View)stringBuilder, paramInt, false);
        sd1.e = true;
        kn0 kn01 = this.g;
        if (kn01 != null && kn01.e) {
          kn01.b.getClass();
          he1 he11 = RecyclerView.O((View)stringBuilder);
          paramInt = i;
          if (he11 != null)
            paramInt = he11.d(); 
          if (paramInt == kn01.a) {
            kn01.f = (View)stringBuilder;
            if (RecyclerView.F0)
              Log.d("RecyclerView", "smooth scroll target view has been attached"); 
          } 
        } 
      } 
    } 
    if (sd1.f) {
      if (RecyclerView.F0) {
        StringBuilder stringBuilder = new StringBuilder("consuming pending invalidate on child ");
        stringBuilder.append(sd1.b);
        Log.d("RecyclerView", stringBuilder.toString());
      } 
      he1.b.invalidate();
      sd1.f = false;
    } 
  }
  
  public void l0() {}
  
  public void m(String paramString) {
    RecyclerView recyclerView = this.c;
    if (recyclerView != null)
      recyclerView.j(paramString); 
  }
  
  public void m0(int paramInt1, int paramInt2) {}
  
  public final void n(View paramView, Rect paramRect) {
    RecyclerView recyclerView = this.c;
    if (recyclerView == null) {
      paramRect.set(0, 0, 0, 0);
      return;
    } 
    paramRect.set(recyclerView.P(paramView));
  }
  
  public void n0(int paramInt1, int paramInt2) {}
  
  public abstract boolean o();
  
  public void o0(int paramInt) {}
  
  public abstract boolean p();
  
  public void p0(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {
    o0(paramInt1);
  }
  
  public boolean q(sd1 paramsd1) {
    return (paramsd1 != null);
  }
  
  public abstract void q0(yd1 paramyd1, de1 paramde1);
  
  public abstract void r0(de1 paramde1);
  
  public void s(int paramInt1, int paramInt2, de1 paramde1, il paramil) {}
  
  public void s0(Parcelable paramParcelable) {}
  
  public void t(int paramInt, il paramil) {}
  
  public Parcelable t0() {
    return null;
  }
  
  public abstract int u(de1 paramde1);
  
  public void u0(int paramInt) {}
  
  public abstract int v(de1 paramde1);
  
  public boolean v0(int paramInt, Bundle paramBundle) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Landroidx/recyclerview/widget/RecyclerView;
    //   4: getfield e : Lyd1;
    //   7: astore #9
    //   9: aload_0
    //   10: getfield q : I
    //   13: istore #8
    //   15: aload_0
    //   16: getfield p : I
    //   19: istore #6
    //   21: new android/graphics/Rect
    //   24: dup
    //   25: invokespecial <init> : ()V
    //   28: astore #9
    //   30: iload #8
    //   32: istore #5
    //   34: iload #6
    //   36: istore #7
    //   38: aload_0
    //   39: getfield c : Landroidx/recyclerview/widget/RecyclerView;
    //   42: invokevirtual getMatrix : ()Landroid/graphics/Matrix;
    //   45: invokevirtual isIdentity : ()Z
    //   48: ifeq -> 85
    //   51: iload #8
    //   53: istore #5
    //   55: iload #6
    //   57: istore #7
    //   59: aload_0
    //   60: getfield c : Landroidx/recyclerview/widget/RecyclerView;
    //   63: aload #9
    //   65: invokevirtual getGlobalVisibleRect : (Landroid/graphics/Rect;)Z
    //   68: ifeq -> 85
    //   71: aload #9
    //   73: invokevirtual height : ()I
    //   76: istore #5
    //   78: aload #9
    //   80: invokevirtual width : ()I
    //   83: istore #7
    //   85: iload_1
    //   86: sipush #4096
    //   89: if_icmpeq -> 187
    //   92: iload_1
    //   93: sipush #8192
    //   96: if_icmpeq -> 108
    //   99: iconst_0
    //   100: istore #5
    //   102: iconst_0
    //   103: istore #6
    //   105: goto -> 247
    //   108: aload_0
    //   109: getfield c : Landroidx/recyclerview/widget/RecyclerView;
    //   112: iconst_m1
    //   113: invokevirtual canScrollVertically : (I)Z
    //   116: ifeq -> 137
    //   119: iload #5
    //   121: aload_0
    //   122: invokevirtual getPaddingTop : ()I
    //   125: isub
    //   126: aload_0
    //   127: invokevirtual getPaddingBottom : ()I
    //   130: isub
    //   131: ineg
    //   132: istore #5
    //   134: goto -> 140
    //   137: iconst_0
    //   138: istore #5
    //   140: iload #5
    //   142: istore #6
    //   144: aload_0
    //   145: getfield c : Landroidx/recyclerview/widget/RecyclerView;
    //   148: iconst_m1
    //   149: invokevirtual canScrollHorizontally : (I)Z
    //   152: ifeq -> 173
    //   155: iload #7
    //   157: aload_0
    //   158: invokevirtual getPaddingLeft : ()I
    //   161: isub
    //   162: aload_0
    //   163: invokevirtual getPaddingRight : ()I
    //   166: isub
    //   167: ineg
    //   168: istore #6
    //   170: goto -> 247
    //   173: iconst_0
    //   174: istore #7
    //   176: iload #6
    //   178: istore #5
    //   180: iload #7
    //   182: istore #6
    //   184: goto -> 247
    //   187: aload_0
    //   188: getfield c : Landroidx/recyclerview/widget/RecyclerView;
    //   191: iconst_1
    //   192: invokevirtual canScrollVertically : (I)Z
    //   195: ifeq -> 215
    //   198: iload #5
    //   200: aload_0
    //   201: invokevirtual getPaddingTop : ()I
    //   204: isub
    //   205: aload_0
    //   206: invokevirtual getPaddingBottom : ()I
    //   209: isub
    //   210: istore #5
    //   212: goto -> 218
    //   215: iconst_0
    //   216: istore #5
    //   218: iload #5
    //   220: istore #6
    //   222: aload_0
    //   223: getfield c : Landroidx/recyclerview/widget/RecyclerView;
    //   226: iconst_1
    //   227: invokevirtual canScrollHorizontally : (I)Z
    //   230: ifeq -> 173
    //   233: iload #7
    //   235: aload_0
    //   236: invokevirtual getPaddingLeft : ()I
    //   239: isub
    //   240: aload_0
    //   241: invokevirtual getPaddingRight : ()I
    //   244: isub
    //   245: istore #6
    //   247: iload #5
    //   249: ifne -> 260
    //   252: iload #6
    //   254: ifne -> 260
    //   257: goto -> 334
    //   260: aload_2
    //   261: ifnull -> 306
    //   264: aload_2
    //   265: ldc_w 'androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT'
    //   268: fconst_1
    //   269: invokevirtual getFloat : (Ljava/lang/String;F)F
    //   272: fstore #4
    //   274: fload #4
    //   276: fstore_3
    //   277: fload #4
    //   279: fconst_0
    //   280: fcmpg
    //   281: ifge -> 308
    //   284: getstatic androidx/recyclerview/widget/RecyclerView.E0 : Z
    //   287: ifne -> 293
    //   290: goto -> 334
    //   293: ldc_w 'attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value ('
    //   296: fload #4
    //   298: ldc_w ')'
    //   301: invokestatic i : (Ljava/lang/String;FLjava/lang/Object;)V
    //   304: iconst_0
    //   305: ireturn
    //   306: fconst_1
    //   307: fstore_3
    //   308: fload_3
    //   309: ldc_w Infinity
    //   312: invokestatic compare : (FF)I
    //   315: ifne -> 372
    //   318: aload_0
    //   319: getfield c : Landroidx/recyclerview/widget/RecyclerView;
    //   322: astore_2
    //   323: aload_2
    //   324: getfield o : Lid1;
    //   327: astore #9
    //   329: aload #9
    //   331: ifnonnull -> 336
    //   334: iconst_0
    //   335: ireturn
    //   336: iload_1
    //   337: sipush #4096
    //   340: if_icmpeq -> 359
    //   343: iload_1
    //   344: sipush #8192
    //   347: if_icmpeq -> 352
    //   350: iconst_1
    //   351: ireturn
    //   352: aload_2
    //   353: iconst_0
    //   354: invokevirtual n0 : (I)V
    //   357: iconst_1
    //   358: ireturn
    //   359: aload_2
    //   360: aload #9
    //   362: invokevirtual c : ()I
    //   365: iconst_1
    //   366: isub
    //   367: invokevirtual n0 : (I)V
    //   370: iconst_1
    //   371: ireturn
    //   372: iload #5
    //   374: istore #7
    //   376: iload #6
    //   378: istore_1
    //   379: fconst_1
    //   380: fload_3
    //   381: invokestatic compare : (FF)I
    //   384: ifeq -> 417
    //   387: iload #5
    //   389: istore #7
    //   391: iload #6
    //   393: istore_1
    //   394: fconst_0
    //   395: fload_3
    //   396: invokestatic compare : (FF)I
    //   399: ifeq -> 417
    //   402: iload #6
    //   404: i2f
    //   405: fload_3
    //   406: fmul
    //   407: f2i
    //   408: istore_1
    //   409: iload #5
    //   411: i2f
    //   412: fload_3
    //   413: fmul
    //   414: f2i
    //   415: istore #7
    //   417: aload_0
    //   418: getfield c : Landroidx/recyclerview/widget/RecyclerView;
    //   421: iload_1
    //   422: iload #7
    //   424: iconst_1
    //   425: invokevirtual m0 : (IIZ)V
    //   428: iconst_1
    //   429: ireturn
  }
  
  public abstract int w(de1 paramde1);
  
  public final void w0() {
    for (int i = G() - 1; i >= 0; i--)
      this.b.j(i); 
  }
  
  public abstract int x(de1 paramde1);
  
  public final void x0(yd1 paramyd1) {
    for (int i = G() - 1; i >= 0; i--) {
      if (!RecyclerView.O(F(i)).q())
        A0(i, paramyd1); 
    } 
  }
  
  public abstract int y(de1 paramde1);
  
  public final void y0(yd1 paramyd1) {
    int j = paramyd1.a.size();
    int i = j - 1;
    while (true) {
      he1 he1;
      ArrayList arrayList2 = paramyd1.a;
      if (i >= 0) {
        View view = ((he1)arrayList2.get(i)).b;
        he1 he11 = RecyclerView.O(view);
        if (!he11.q()) {
          he11.p(false);
          if (he11.l())
            this.c.removeDetachedView(view, false); 
          od1 od1 = this.c.O;
          if (od1 != null)
            od1.d(he11); 
          he11.p(true);
          he1 = RecyclerView.O(view);
          he1.p = null;
          he1.q = false;
          he1.l &= 0xFFFFFFDF;
          paramyd1.j(he1);
        } 
        i--;
        continue;
      } 
      he1.clear();
      ArrayList arrayList1 = paramyd1.b;
      if (arrayList1 != null)
        arrayList1.clear(); 
      if (j > 0)
        this.c.invalidate(); 
      return;
    } 
  }
  
  public abstract int z(de1 paramde1);
  
  public final void z0(View paramView, yd1 paramyd1) {
    tk tk1 = this.b;
    xy xy = (xy)tk1.c;
    int i = tk1.b;
    if (i != 1) {
      if (i != 2) {
        try {
          tk1.b = 1;
          tk1.f = paramView;
          i = xy.b.indexOfChild(paramView);
          if (i >= 0) {
            if (((sk)tk1.d).g(i))
              tk1.k(paramView); 
            xy.j(i);
          } 
          tk1.b = 0;
          tk1.f = null;
        } finally {}
        paramyd1.i(paramView);
        return;
      } 
      tp.f("Cannot call removeView(At) within removeViewIfHidden");
      return;
    } 
    tp.f("Cannot call removeView(At) within removeView(At)");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\recyclerview\widget\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */