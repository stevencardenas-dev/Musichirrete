package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import ge;
import gh1;
import n2;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
  public final gh1 i;
  
  public BaseTransientBottomBar$Behavior() {
    gh1 gh11 = new gh1(14, false);
    this.f = Math.min(Math.max(0.0F, 0.1F), 1.0F);
    this.g = Math.min(Math.max(0.0F, 0.6F), 1.0F);
    this.e = 0;
    this.i = gh11;
  }
  
  public final boolean k(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent) {
    gh1 gh11 = this.i;
    gh11.getClass();
    int i = paramMotionEvent.getActionMasked();
    if (i != 0) {
      if (i == 1 || i == 3)
        n2.x().G((ge)gh11.c); 
    } else if (paramCoordinatorLayout.p(paramView, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())) {
      n2.x().F((ge)gh11.c);
    } 
    return super.k(paramCoordinatorLayout, paramView, paramMotionEvent);
  }
  
  public final boolean w(View paramView) {
    this.i.getClass();
    return paramView instanceof ie;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\snackbar\BaseTransientBottomBar$Behavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */