package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cg0;
import dg0;
import fs;
import g5;
import is;
import j1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l0;
import vi;
import x41;
import zo2;

public class HideViewOnScrollBehavior<V extends View> extends fs {
  public zo2 a;
  
  public AccessibilityManager b;
  
  public cg0 c;
  
  public final LinkedHashSet d = new LinkedHashSet();
  
  public int e;
  
  public int f;
  
  public TimeInterpolator g;
  
  public TimeInterpolator h;
  
  public int i = 0;
  
  public int j = 2;
  
  public ViewPropertyAnimator k;
  
  public HideViewOnScrollBehavior() {}
  
  public HideViewOnScrollBehavior(Context paramContext, AttributeSet paramAttributeSet) {}
  
  public final boolean l(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt) {
    if (this.b == null)
      this.b = (AccessibilityManager)paramView.getContext().getSystemService(AccessibilityManager.class); 
    AccessibilityManager accessibilityManager = this.b;
    if (accessibilityManager != null && this.c == null) {
      cg0 cg01 = new cg0(this, paramView, 1);
      this.c = cg01;
      accessibilityManager.addTouchExplorationStateChangeListener((AccessibilityManager.TouchExplorationStateChangeListener)cg01);
      paramView.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)new vi(4, this));
    } 
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = ((is)paramView.getLayoutParams()).c;
    if (i == 80 || i == 81) {
      w(1);
      this.i = this.a.x(paramView, marginLayoutParams);
      this.e = zo2.P(paramView.getContext(), 2130969683, 225);
      this.f = zo2.P(paramView.getContext(), 2130969689, 175);
      this.g = zo2.Q(paramView.getContext(), 2130969699, (TimeInterpolator)g5.d);
      this.h = zo2.Q(paramView.getContext(), 2130969699, (TimeInterpolator)g5.c);
      return false;
    } 
    paramInt = Gravity.getAbsoluteGravity(i, paramInt);
    if (paramInt == 3 || paramInt == 19) {
      paramInt = 2;
    } else {
      paramInt = 0;
    } 
    w(paramInt);
    this.i = this.a.x(paramView, marginLayoutParams);
    this.e = zo2.P(paramView.getContext(), 2130969683, 225);
    this.f = zo2.P(paramView.getContext(), 2130969689, 175);
    this.g = zo2.Q(paramView.getContext(), 2130969699, (TimeInterpolator)g5.d);
    this.h = zo2.Q(paramView.getContext(), 2130969699, (TimeInterpolator)g5.c);
    return false;
  }
  
  public final void p(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint) {
    if (paramInt1 > 0) {
      if (this.j != 1) {
        AccessibilityManager accessibilityManager = this.b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
          TimeInterpolator timeInterpolator;
          ViewPropertyAnimator viewPropertyAnimator = this.k;
          if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            paramView.clearAnimation();
          } 
          this.j = 1;
          Iterator iterator = this.d.iterator();
          if (!iterator.hasNext()) {
            paramInt1 = this.i;
            long l = this.f;
            timeInterpolator = this.h;
            this.k = this.a.A(paramView, paramInt1).setInterpolator(timeInterpolator).setDuration(l).setListener((Animator.AnimatorListener)new j1(8, this));
            return;
          } 
          throw x41.g(timeInterpolator);
        } 
      } 
    } else if (paramInt1 < 0) {
      x(paramView);
    } 
  }
  
  public final boolean t(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, int paramInt1, int paramInt2) {
    return (paramInt1 == 2);
  }
  
  public final void w(int paramInt) {
    zo2 zo21 = this.a;
    if (zo21 == null || zo21.z() != paramInt) {
      if (paramInt != 0) {
        if (paramInt != 1) {
          if (paramInt == 2) {
            this.a = (zo2)new dg0(1);
            return;
          } 
          l0.l(x41.i(paramInt, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
          return;
        } 
        this.a = (zo2)new dg0(0);
        return;
      } 
      this.a = (zo2)new dg0(2);
      return;
    } 
  }
  
  public final void x(View paramView) {
    TimeInterpolator timeInterpolator;
    if (this.j == 2)
      return; 
    ViewPropertyAnimator viewPropertyAnimator = this.k;
    if (viewPropertyAnimator != null) {
      viewPropertyAnimator.cancel();
      paramView.clearAnimation();
    } 
    this.j = 2;
    Iterator iterator = this.d.iterator();
    if (!iterator.hasNext()) {
      this.a.getClass();
      long l = this.e;
      timeInterpolator = this.g;
      this.k = this.a.A(paramView, 0).setInterpolator(timeInterpolator).setDuration(l).setListener((Animator.AnimatorListener)new j1(8, this));
      return;
    } 
    throw x41.g(timeInterpolator);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\behavior\HideViewOnScrollBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */