package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import bh0;
import d1;
import ee;
import fs;
import m0;
import qr1;
import qv;
import v22;
import y22;

public class SwipeDismissBehavior<V extends View> extends fs {
  public y22 a;
  
  public ee b;
  
  public boolean c;
  
  public boolean d;
  
  public int e = 2;
  
  public float f = 0.0F;
  
  public float g = 0.5F;
  
  public final qr1 h = new qr1(this);
  
  public boolean k(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent) {
    boolean bool = this.c;
    int i = paramMotionEvent.getActionMasked();
    if (i != 0) {
      if (i == 1 || i == 3)
        this.c = false; 
    } else {
      bool = paramCoordinatorLayout.p(paramView, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
      this.c = bool;
    } 
    if (bool) {
      if (this.a == null)
        this.a = new y22(paramCoordinatorLayout.getContext(), paramCoordinatorLayout, (qv)this.h); 
      if (!this.d && this.a.o(paramMotionEvent))
        return true; 
    } 
    return false;
  }
  
  public final boolean l(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt) {
    if (paramView.getImportantForAccessibility() == 0) {
      paramView.setImportantForAccessibility(1);
      v22.k(paramView, 1048576);
      v22.h(paramView, 0);
      if (w(paramView))
        v22.l(paramView, m0.j, (d1)new bh0(28, this)); 
    } 
    return false;
  }
  
  public final boolean v(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent) {
    if (this.a != null) {
      if (!this.d || paramMotionEvent.getActionMasked() != 3)
        this.a.i(paramMotionEvent); 
      return true;
    } 
    return false;
  }
  
  public boolean w(View paramView) {
    return true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\behavior\SwipeDismissBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */