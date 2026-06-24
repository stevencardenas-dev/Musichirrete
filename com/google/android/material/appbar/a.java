package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class a implements ValueAnimator.AnimatorUpdateListener {
  public final CoordinatorLayout a;
  
  public final AppBarLayout b;
  
  public final AppBarLayout.BaseBehavior c;
  
  public a(CoordinatorLayout paramCoordinatorLayout, AppBarLayout.BaseBehavior paramBaseBehavior, AppBarLayout paramAppBarLayout) {
    this.c = paramBaseBehavior;
    this.a = paramCoordinatorLayout;
    this.b = paramAppBarLayout;
  }
  
  public final void onAnimationUpdate(ValueAnimator paramValueAnimator) {
    int i = ((Integer)paramValueAnimator.getAnimatedValue()).intValue();
    this.c.A(this.a, (View)this.b, i);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\appbar\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */