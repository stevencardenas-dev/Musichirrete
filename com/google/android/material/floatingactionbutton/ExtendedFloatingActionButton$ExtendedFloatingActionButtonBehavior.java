package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import fs;
import is;
import zb1;

public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends fs {
  public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {}
  
  public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context paramContext, AttributeSet paramAttributeSet) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, zb1.i);
    typedArray.getBoolean(0, false);
    typedArray.getBoolean(1, true);
    typedArray.recycle();
  }
  
  public final void g(is paramis) {
    if (paramis.h == 0)
      paramis.h = 80; 
  }
  
  public final boolean h(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2) {
    throw new ClassCastException();
  }
  
  public final boolean l(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt) {
    throw new ClassCastException();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\floatingactionbutton\ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */