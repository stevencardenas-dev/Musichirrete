package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import fs;
import java.util.ArrayList;
import y60;
import z60;

@Deprecated
public abstract class ExpandableBehavior extends fs {
  public int a = 0;
  
  public ExpandableBehavior() {}
  
  public ExpandableBehavior(Context paramContext, AttributeSet paramAttributeSet) {}
  
  public abstract boolean f(View paramView1, View paramView2);
  
  public final boolean h(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2) {
    z60 z60 = (z60)paramView2;
    boolean bool = ((FloatingActionButton)z60).q.a;
    int i = this.a;
    byte b = 2;
    if (bool ? (i == 0 || i == 2) : (i == 1)) {
      bool = ((FloatingActionButton)z60).q.a;
      if (bool)
        b = 1; 
      this.a = b;
      w((View)z60, paramView1, bool, true);
      return true;
    } 
    return false;
  }
  
  public final boolean l(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt) {
    if (!paramView.isLaidOut()) {
      ArrayList<View> arrayList = paramCoordinatorLayout.k(paramView);
      int i = arrayList.size();
      paramInt = 0;
      while (true) {
        if (paramInt < i) {
          View view = arrayList.get(paramInt);
          if (f(paramView, view)) {
            z60 z60 = (z60)view;
            break;
          } 
          paramInt++;
          continue;
        } 
        paramCoordinatorLayout = null;
        break;
      } 
      if (paramCoordinatorLayout != null) {
        boolean bool = ((FloatingActionButton)paramCoordinatorLayout).q.a;
        i = this.a;
        paramInt = 2;
        if (bool ? (i == 0 || i == 2) : (i == 1)) {
          if (bool)
            paramInt = 1; 
          this.a = paramInt;
          paramView.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)new y60(this, paramView, paramInt, (z60)paramCoordinatorLayout));
        } 
      } 
    } 
    return false;
  }
  
  public abstract void w(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\transformation\ExpandableBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */