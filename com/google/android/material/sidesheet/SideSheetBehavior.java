package com.google.android.material.sidesheet;

import ah;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d1;
import dm0;
import fs;
import g5;
import ga1;
import is;
import j1;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k;
import kb;
import l0;
import ls;
import m0;
import m60;
import mz;
import o70;
import org.jaudiotagger.audio.exceptions.yb.zLtYiJUm;
import qv;
import tm1;
import tp;
import ul1;
import um1;
import v22;
import vl1;
import wf2;
import wr0;
import ws0;
import x41;
import xg;
import xr0;
import xs0;
import y2;
import y22;
import ys0;
import zb1;

public class SideSheetBehavior<V extends View> extends fs implements xr0 {
  public qv a;
  
  public final ws0 b;
  
  public final ColorStateList c;
  
  public final vl1 d;
  
  public final ah e = new ah(this);
  
  public final float f;
  
  public final boolean g = true;
  
  public int h = 5;
  
  public y22 i;
  
  public boolean j;
  
  public final float k = 0.1F;
  
  public int l;
  
  public int m;
  
  public int n;
  
  public int o;
  
  public WeakReference p;
  
  public WeakReference q;
  
  public final int r = -1;
  
  public VelocityTracker s;
  
  public ys0 t;
  
  public int u;
  
  public final LinkedHashSet v = new LinkedHashSet();
  
  public final xg w = new xg(this, 1);
  
  public SideSheetBehavior() {}
  
  public SideSheetBehavior(Context paramContext, AttributeSet paramAttributeSet) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, zb1.C);
    if (typedArray.hasValue(3))
      this.c = wf2.u(paramContext, typedArray, 3); 
    if (typedArray.hasValue(6))
      this.d = vl1.b(paramContext, paramAttributeSet, 0, 2131952796).a(); 
    if (typedArray.hasValue(5)) {
      int i = typedArray.getResourceId(5, -1);
      this.r = i;
      WeakReference<View> weakReference = this.q;
      if (weakReference != null)
        weakReference.clear(); 
      this.q = null;
      weakReference = this.p;
      if (weakReference != null) {
        View view = weakReference.get();
        if (i != -1 && view.isLaidOut())
          view.requestLayout(); 
      } 
    } 
    vl1 vl11 = this.d;
    if (vl11 != null) {
      ws0 ws01 = new ws0(vl11);
      this.b = ws01;
      ws01.k(paramContext);
      ColorStateList colorStateList = this.c;
      if (colorStateList != null) {
        this.b.o(colorStateList);
      } else {
        TypedValue typedValue = new TypedValue();
        paramContext.getTheme().resolveAttribute(16842801, typedValue, true);
        this.b.setTint(typedValue.data);
      } 
    } 
    this.f = typedArray.getDimension(2, -1.0F);
    this.g = typedArray.getBoolean(4, true);
    typedArray.recycle();
    ViewConfiguration.get(paramContext).getScaledMaximumFlingVelocity();
  }
  
  public final void A() {
    WeakReference<View> weakReference = this.p;
    if (weakReference != null) {
      View view = weakReference.get();
      if (view != null) {
        v22.k(view, 262144);
        v22.h(view, 0);
        v22.k(view, 1048576);
        v22.h(view, 0);
        if (this.h != 5)
          v22.l(view, m0.j, (d1)new mz(5, 3, this)); 
        if (this.h != 3)
          v22.l(view, m0.h, (d1)new mz(3, 3, this)); 
      } 
    } 
  }
  
  public final void a() {
    boolean bool;
    tm1 tm1;
    ys0 ys01 = this.t;
    if (ys01 == null)
      return; 
    kb kb = ((wr0)ys01).f;
    WeakReference<View> weakReference2 = null;
    ((wr0)ys01).f = null;
    int i = 5;
    if (kb == null || Build.VERSION.SDK_INT < 34) {
      w(5);
      return;
    } 
    qv qv1 = this.a;
    int j = i;
    if (qv1 != null)
      if (qv1.z() == 0) {
        j = i;
      } else {
        j = 3;
      }  
    j1 j1 = new j1(11, this);
    WeakReference<View> weakReference1 = this.q;
    if (weakReference1 != null) {
      View view1 = weakReference1.get();
    } else {
      weakReference1 = null;
    } 
    if (weakReference1 == null) {
      weakReference1 = weakReference2;
    } else {
      ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)weakReference1.getLayoutParams();
      if (marginLayoutParams == null) {
        weakReference1 = weakReference2;
      } else {
        tm1 = new tm1(this, marginLayoutParams, this.a.q(marginLayoutParams), (View)weakReference1);
      } 
    } 
    View view = ((wr0)ys01).b;
    if (kb.d == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    if ((Gravity.getAbsoluteGravity(j, view.getLayoutDirection()) & 0x3) == 3) {
      k = 1;
    } else {
      k = 0;
    } 
    float f1 = view.getWidth();
    float f2 = view.getScaleX();
    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
      ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)layoutParams;
      if (k) {
        i = marginLayoutParams.leftMargin;
      } else {
        i = marginLayoutParams.rightMargin;
      } 
    } else {
      i = 0;
    } 
    f2 = f2 * f1 + i;
    Property property = View.TRANSLATION_X;
    f1 = f2;
    if (k)
      f1 = -f2; 
    ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(view, property, new float[] { f1 });
    if (tm1 != null)
      objectAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)tm1); 
    objectAnimator.setInterpolator((TimeInterpolator)new o70(1));
    i = ((wr0)ys01).c;
    int k = ((wr0)ys01).d;
    objectAnimator.setDuration(g5.c(kb.c, i, k));
    objectAnimator.addListener((Animator.AnimatorListener)new xs0(ys01, bool, j));
    objectAnimator.addListener((Animator.AnimatorListener)j1);
    objectAnimator.start();
  }
  
  public final void b(kb paramkb) {
    ys0 ys01 = this.t;
    if (ys01 != null) {
      int i;
      qv qv1 = this.a;
      if (qv1 == null || qv1.z() == 0) {
        i = 5;
      } else {
        i = 3;
      } 
      if (((wr0)ys01).f == null)
        Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()"); 
      kb kb1 = ((wr0)ys01).f;
      ((wr0)ys01).f = paramkb;
      if (kb1 != null) {
        boolean bool;
        if (paramkb.d == 0) {
          bool = true;
        } else {
          bool = false;
        } 
        ys01.a(paramkb.c, bool, i);
      } 
      WeakReference<View> weakReference = this.p;
      if (weakReference != null && weakReference.get() != null) {
        View view = this.p.get();
        weakReference = this.q;
        if (weakReference != null) {
          View view1 = weakReference.get();
        } else {
          weakReference = null;
        } 
        if (weakReference != null) {
          ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)weakReference.getLayoutParams();
          if (marginLayoutParams != null) {
            float f = this.l;
            i = (int)(view.getScaleX() * f + this.o);
            this.a.h0(marginLayoutParams, i);
            weakReference.requestLayout();
          } 
        } 
      } 
    } 
  }
  
  public final void c(kb paramkb) {
    ys0 ys01 = this.t;
    if (ys01 == null)
      return; 
    ((wr0)ys01).f = paramkb;
  }
  
  public final void d() {
    ys0 ys01 = this.t;
    if (ys01 != null) {
      View view = ((wr0)ys01).b;
      if (((wr0)ys01).f == null)
        Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()"); 
      kb kb = ((wr0)ys01).f;
      ((wr0)ys01).f = null;
      if (kb != null) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[] { (Animator)ObjectAnimator.ofFloat(view, View.SCALE_X, new float[] { 1.0F }), (Animator)ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[] { 1.0F }) });
        if (view instanceof ViewGroup) {
          ViewGroup viewGroup = (ViewGroup)view;
          for (byte b = 0; b < viewGroup.getChildCount(); b++) {
            animatorSet.playTogether(new Animator[] { (Animator)ObjectAnimator.ofFloat(viewGroup.getChildAt(b), View.SCALE_Y, new float[] { 1.0F }) });
          } 
        } 
        animatorSet.setDuration(((wr0)ys01).e);
        animatorSet.start();
        return;
      } 
    } 
  }
  
  public final void g(is paramis) {
    this.p = null;
    this.i = null;
    this.t = null;
  }
  
  public final void j() {
    this.p = null;
    this.i = null;
    this.t = null;
  }
  
  public final boolean k(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent) {
    if ((paramView.isShown() || v22.e(paramView) != null) && this.g) {
      int i = paramMotionEvent.getActionMasked();
      if (i == 0) {
        VelocityTracker velocityTracker = this.s;
        if (velocityTracker != null) {
          velocityTracker.recycle();
          this.s = null;
        } 
      } 
      if (this.s == null)
        this.s = VelocityTracker.obtain(); 
      this.s.addMovement(paramMotionEvent);
      if (i != 0) {
        if ((i == 1 || i == 3) && this.j) {
          this.j = false;
          return false;
        } 
      } else {
        this.u = (int)paramMotionEvent.getX();
      } 
      if (!this.j) {
        y22 y221 = this.i;
        if (y221 != null && y221.o(paramMotionEvent))
          return true; 
      } 
      return false;
    } 
    this.j = true;
    return false;
  }
  
  public final boolean l(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt) {
    if (paramCoordinatorLayout.getFitsSystemWindows() && !paramView.getFitsSystemWindows())
      paramView.setFitsSystemWindows(true); 
    WeakReference weakReference = this.p;
    ws0 ws01 = this.b;
    if (weakReference == null) {
      this.p = new WeakReference<View>(paramView);
      this.t = new ys0(paramView);
      if (ws01 != null) {
        paramView.setBackground((Drawable)ws01);
        float f2 = this.f;
        float f1 = f2;
        if (f2 == -1.0F)
          f1 = paramView.getElevation(); 
        ws01.n(f1);
      } else {
        ColorStateList colorStateList = this.c;
        if (colorStateList != null) {
          WeakHashMap weakHashMap1 = v22.a;
          paramView.setBackgroundTintList(colorStateList);
        } 
      } 
      if (this.h == 5) {
        i = 4;
      } else {
        i = 0;
      } 
      if (paramView.getVisibility() != i)
        paramView.setVisibility(i); 
      A();
      if (paramView.getImportantForAccessibility() == 0)
        paramView.setImportantForAccessibility(1); 
      if (v22.e(paramView) == null)
        v22.o(paramView, paramView.getResources().getString(2131887399)); 
    } 
    if (Gravity.getAbsoluteGravity(((is)paramView.getLayoutParams()).c, paramInt) == 3) {
      i = 1;
    } else {
      i = 0;
    } 
    qv qv1 = this.a;
    if (qv1 == null || qv1.z() != i) {
      View view;
      WeakReference<View> weakReference1 = null;
      qv qv2 = null;
      vl1 vl11 = this.d;
      if (!i) {
        this.a = (qv)new dm0(this, 1);
        if (vl11 != null) {
          is is;
          weakReference1 = this.p;
          qv1 = qv2;
          if (weakReference1 != null) {
            view = weakReference1.get();
            qv1 = qv2;
            if (view != null) {
              qv1 = qv2;
              if (view.getLayoutParams() instanceof is)
                is = (is)view.getLayoutParams(); 
            } 
          } 
          if (is == null || ((ViewGroup.MarginLayoutParams)is).rightMargin <= 0) {
            ul1 ul1 = vl11.f();
            ul1.f = (ls)new k(0.0F);
            ul1.g = (ls)new k(0.0F);
            vl1 vl12 = ul1.a();
            if (ws01 != null)
              ws01.setShapeAppearanceModel(vl12); 
          } 
        } 
      } else if (i == 1) {
        this.a = (qv)new dm0(this, 0);
        if (vl11 != null) {
          is is;
          WeakReference<View> weakReference2 = this.p;
          View view1 = view;
          if (weakReference2 != null) {
            View view2 = weakReference2.get();
            view1 = view;
            if (view2 != null) {
              view1 = view;
              if (view2.getLayoutParams() instanceof is)
                is = (is)view2.getLayoutParams(); 
            } 
          } 
          if (is == null || ((ViewGroup.MarginLayoutParams)is).leftMargin <= 0) {
            ul1 ul1 = vl11.f();
            ul1.e = (ls)new k(0.0F);
            ul1.h = (ls)new k(0.0F);
            vl1 vl12 = ul1.a();
            if (ws01 != null)
              ws01.setShapeAppearanceModel(vl12); 
          } 
        } 
      } else {
        l0.l(x41.i(i, "Invalid sheet edge position value: ", ". Must be 0 or 1."));
        return false;
      } 
    } 
    if (this.i == null)
      this.i = new y22(paramCoordinatorLayout.getContext(), paramCoordinatorLayout, (qv)this.w); 
    int i = this.a.x(paramView);
    paramCoordinatorLayout.r(paramView, paramInt);
    this.m = paramCoordinatorLayout.getWidth();
    this.n = this.a.y(paramCoordinatorLayout);
    this.l = paramView.getWidth();
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    if (marginLayoutParams != null) {
      paramInt = this.a.f(marginLayoutParams);
    } else {
      paramInt = 0;
    } 
    this.o = paramInt;
    paramInt = this.h;
    if (paramInt != 1 && paramInt != 2) {
      if (paramInt != 3) {
        if (paramInt == 5) {
          paramInt = this.a.t();
        } else {
          m60.j("Unexpected value: ", this.h);
          return false;
        } 
      } else {
        paramInt = 0;
      } 
    } else {
      paramInt = i - this.a.x(paramView);
    } 
    WeakHashMap weakHashMap = v22.a;
    paramView.offsetLeftAndRight(paramInt);
    if (this.q == null) {
      paramInt = this.r;
      if (paramInt != -1) {
        View view = paramCoordinatorLayout.findViewById(paramInt);
        if (view != null)
          this.q = new WeakReference<View>(view); 
      } 
    } 
    Iterator iterator = this.v.iterator();
    while (iterator.hasNext()) {
      if (iterator.next() == null)
        continue; 
      tp.b();
      return false;
    } 
    return true;
  }
  
  public final boolean m(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = paramCoordinatorLayout.getPaddingLeft();
    paramInt2 = ViewGroup.getChildMeasureSpec(paramInt1, paramCoordinatorLayout.getPaddingRight() + i + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + paramInt2, marginLayoutParams.width);
    paramInt1 = paramCoordinatorLayout.getPaddingTop();
    paramView.measure(paramInt2, ViewGroup.getChildMeasureSpec(paramInt3, paramCoordinatorLayout.getPaddingBottom() + paramInt1 + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
    return true;
  }
  
  public final void r(CoordinatorLayout paramCoordinatorLayout, View paramView, Parcelable paramParcelable) {
    // Byte code:
    //   0: aload_3
    //   1: checkcast um1
    //   4: getfield e : I
    //   7: istore #5
    //   9: iload #5
    //   11: iconst_1
    //   12: if_icmpeq -> 25
    //   15: iload #5
    //   17: istore #4
    //   19: iload #5
    //   21: iconst_2
    //   22: if_icmpne -> 28
    //   25: iconst_5
    //   26: istore #4
    //   28: aload_0
    //   29: iload #4
    //   31: putfield h : I
    //   34: return
  }
  
  public final Parcelable s(CoordinatorLayout paramCoordinatorLayout, View paramView) {
    AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
    return (Parcelable)new um1(this);
  }
  
  public final boolean v(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent) {
    if (!paramView.isShown())
      return false; 
    int i = paramMotionEvent.getActionMasked();
    if (this.h == 1 && i == 0)
      return true; 
    if (y())
      this.i.i(paramMotionEvent); 
    if (i == 0) {
      VelocityTracker velocityTracker = this.s;
      if (velocityTracker != null) {
        velocityTracker.recycle();
        this.s = null;
      } 
    } 
    if (this.s == null)
      this.s = VelocityTracker.obtain(); 
    this.s.addMovement(paramMotionEvent);
    if (y() && i == 2 && !this.j && y()) {
      float f = Math.abs(this.u - paramMotionEvent.getX());
      y22 y221 = this.i;
      if (f > y221.b)
        y221.b(paramView, paramMotionEvent.getPointerId(paramMotionEvent.getActionIndex())); 
    } 
    return this.j ^ true;
  }
  
  public final void w(int paramInt) {
    if (paramInt == 1 || paramInt == 2) {
      String str;
      StringBuilder stringBuilder = new StringBuilder("STATE_");
      if (paramInt == 1) {
        str = zLtYiJUm.WtlPprCHfoWjazr;
      } else {
        str = "SETTLING";
      } 
      throw new IllegalArgumentException(x41.n(stringBuilder, str, " should not be set externally."));
    } 
    WeakReference weakReference = this.p;
    if (weakReference == null || weakReference.get() == null) {
      x(paramInt);
      return;
    } 
    View view = this.p.get();
    y2 y2 = new y2(paramInt, 13, this);
    ViewParent viewParent = view.getParent();
    if (viewParent != null && viewParent.isLayoutRequested() && view.isAttachedToWindow()) {
      view.post((Runnable)y2);
      return;
    } 
    y2.run();
  }
  
  public final void x(int paramInt) {
    if (this.h != paramInt) {
      this.h = paramInt;
      WeakReference<View> weakReference = this.p;
      if (weakReference != null) {
        View view = weakReference.get();
        if (view != null) {
          if (this.h == 5) {
            paramInt = 4;
          } else {
            paramInt = 0;
          } 
          if (view.getVisibility() != paramInt)
            view.setVisibility(paramInt); 
          Iterator iterator = this.v.iterator();
          if (!iterator.hasNext()) {
            A();
            return;
          } 
          throw x41.g(iterator);
        } 
      } 
    } 
  }
  
  public final boolean y() {
    return (this.i != null && (this.g || this.h == 1));
  }
  
  public final void z(View paramView, int paramInt, boolean paramBoolean) {
    int i;
    if (paramInt != 3) {
      if (paramInt == 5) {
        i = this.a.t();
      } else {
        l0.l(ga1.i("Invalid state to get outer edge offset: ", paramInt));
        return;
      } 
    } else {
      i = this.a.r();
    } 
    y22 y221 = this.i;
    if (y221 != null)
      if (paramBoolean) {
        if (y221.n(i, paramView.getTop())) {
          x(2);
          this.e.c(paramInt);
          return;
        } 
      } else {
        int j = paramView.getTop();
        y221.r = paramView;
        y221.c = -1;
        paramBoolean = y221.h(i, j, 0, 0);
        if (!paramBoolean && y221.a == 0 && y221.r != null)
          y221.r = null; 
        if (paramBoolean) {
          x(2);
          this.e.c(paramInt);
          return;
        } 
      }  
    x(paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\sidesheet\SideSheetBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */