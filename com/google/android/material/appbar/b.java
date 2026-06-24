package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import k0;
import m0;
import t0;
import t5;

public final class b extends k0 {
  public final AppBarLayout d;
  
  public final CoordinatorLayout e;
  
  public final AppBarLayout.BaseBehavior f;
  
  public b(CoordinatorLayout paramCoordinatorLayout, AppBarLayout.BaseBehavior paramBaseBehavior, AppBarLayout paramAppBarLayout) {}
  
  public final void d(View paramView, t0 paramt0) {
    this.a.onInitializeAccessibilityNodeInfo(paramView, paramt0.a);
    paramt0.i("android.widget.ScrollView");
    AppBarLayout appBarLayout = this.d;
    if (appBarLayout.getTotalScrollRange() != 0) {
      CoordinatorLayout coordinatorLayout = this.e;
      AppBarLayout.BaseBehavior baseBehavior = this.f;
      View view = AppBarLayout.BaseBehavior.B(baseBehavior, coordinatorLayout);
      if (view != null) {
        int i = appBarLayout.getChildCount();
        for (byte b1 = 0; b1 < i; b1++) {
          if (((t5)appBarLayout.getChildAt(b1).getLayoutParams()).a != 0) {
            if (baseBehavior.y() != -appBarLayout.getTotalScrollRange()) {
              paramt0.b(m0.f);
              paramt0.o(true);
            } 
            if (baseBehavior.y() != 0) {
              if (view.canScrollVertically(-1)) {
                if (-appBarLayout.getDownNestedPreScrollRange() != 0) {
                  paramt0.b(m0.g);
                  paramt0.o(true);
                  return;
                } 
                break;
              } 
              paramt0.b(m0.g);
              paramt0.o(true);
              return;
            } 
            break;
          } 
        } 
      } 
    } 
  }
  
  public final boolean g(View paramView, int paramInt, Bundle paramBundle) {
    AppBarLayout.BaseBehavior baseBehavior;
    View view;
    AppBarLayout appBarLayout = this.d;
    if (paramInt == 4096) {
      appBarLayout.setExpanded(false);
      return true;
    } 
    if (paramInt == 8192) {
      baseBehavior = this.f;
      if (baseBehavior.y() != 0) {
        CoordinatorLayout coordinatorLayout = this.e;
        view = AppBarLayout.BaseBehavior.B(baseBehavior, coordinatorLayout);
        if (view.canScrollVertically(-1)) {
          paramInt = -appBarLayout.getDownNestedPreScrollRange();
          if (paramInt != 0) {
            baseBehavior.E(coordinatorLayout, this.d, view, paramInt, new int[] { 0, 0 });
            return true;
          } 
        } else {
          appBarLayout.setExpanded(true);
          return true;
        } 
      } 
      return false;
    } 
    return super.g((View)baseBehavior, paramInt, (Bundle)view);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\appbar\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */