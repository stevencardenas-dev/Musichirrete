package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import cg0;
import fs;
import g5;
import j1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import vi;
import x41;
import zo2;

@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends fs {
  public final LinkedHashSet a = new LinkedHashSet();
  
  public int b;
  
  public int c;
  
  public TimeInterpolator d;
  
  public TimeInterpolator e;
  
  public int f = 0;
  
  public AccessibilityManager g;
  
  public cg0 h;
  
  public final boolean i = true;
  
  public int j = 2;
  
  public ViewPropertyAnimator k;
  
  public HideBottomViewOnScrollBehavior() {}
  
  public HideBottomViewOnScrollBehavior(Context paramContext, AttributeSet paramAttributeSet) {}
  
  public boolean l(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt) {
    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    this.f = paramView.getMeasuredHeight() + marginLayoutParams.bottomMargin;
    this.b = zo2.P(paramView.getContext(), 2130969683, 225);
    this.c = zo2.P(paramView.getContext(), 2130969689, 175);
    this.d = zo2.Q(paramView.getContext(), 2130969699, (TimeInterpolator)g5.d);
    this.e = zo2.Q(paramView.getContext(), 2130969699, (TimeInterpolator)g5.c);
    if (this.g == null)
      this.g = (AccessibilityManager)paramView.getContext().getSystemService(AccessibilityManager.class); 
    AccessibilityManager accessibilityManager = this.g;
    if (accessibilityManager != null && this.h == null) {
      cg0 cg01 = new cg0(this, paramView, 0);
      this.h = cg01;
      accessibilityManager.addTouchExplorationStateChangeListener((AccessibilityManager.TouchExplorationStateChangeListener)cg01);
      paramView.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)new vi(3, this));
    } 
    return false;
  }
  
  public final void p(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint) {
    if (paramInt1 > 0) {
      if (this.j != 1) {
        TimeInterpolator timeInterpolator;
        if (this.i) {
          AccessibilityManager accessibilityManager = this.g;
          if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled())
            return; 
        } 
        ViewPropertyAnimator viewPropertyAnimator = this.k;
        if (viewPropertyAnimator != null) {
          viewPropertyAnimator.cancel();
          paramView.clearAnimation();
        } 
        this.j = 1;
        Iterator iterator = this.a.iterator();
        if (!iterator.hasNext()) {
          paramInt1 = this.f;
          long l = this.c;
          timeInterpolator = this.e;
          this.k = paramView.animate().translationY(paramInt1).setInterpolator(timeInterpolator).setDuration(l).setListener((Animator.AnimatorListener)new j1(7, this));
          return;
        } 
        throw x41.g(timeInterpolator);
      } 
    } else if (paramInt1 < 0) {
      w(paramView);
    } 
  }
  
  public boolean t(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2, int paramInt1, int paramInt2) {
    return (paramInt1 == 2);
  }
  
  public final void w(View paramView) {
    TimeInterpolator timeInterpolator;
    if (this.j == 2)
      return; 
    ViewPropertyAnimator viewPropertyAnimator = this.k;
    if (viewPropertyAnimator != null) {
      viewPropertyAnimator.cancel();
      paramView.clearAnimation();
    } 
    this.j = 2;
    Iterator iterator = this.a.iterator();
    if (!iterator.hasNext()) {
      long l = this.b;
      timeInterpolator = this.d;
      this.k = paramView.animate().translationY(0.0F).setInterpolator(timeInterpolator).setDuration(l).setListener((Animator.AnimatorListener)new j1(7, this));
      return;
    } 
    throw x41.g(timeInterpolator);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\behavior\HideBottomViewOnScrollBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */