package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import fy0;
import g7;
import is;
import java.util.HashMap;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
  public HashMap i;
  
  public FabTransformationSheetBehavior() {}
  
  public FabTransformationSheetBehavior(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public final g7 D(Context paramContext, boolean paramBoolean) {
    int i;
    if (paramBoolean) {
      i = 2130837543;
    } else {
      i = 2130837542;
    } 
    g7 g7 = new g7(18, false);
    g7.c = fy0.a(paramContext, i);
    g7.e = new Object();
    return g7;
  }
  
  public final void w(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2) {
    ViewParent viewParent = paramView2.getParent();
    if (viewParent instanceof CoordinatorLayout) {
      CoordinatorLayout coordinatorLayout = (CoordinatorLayout)viewParent;
      int i = coordinatorLayout.getChildCount();
      if (paramBoolean1)
        this.i = new HashMap<Object, Object>(i); 
      for (byte b = 0; b < i; b++) {
        boolean bool;
        View view = coordinatorLayout.getChildAt(b);
        if (view.getLayoutParams() instanceof is && ((is)view.getLayoutParams()).a instanceof FabTransformationScrimBehavior) {
          bool = true;
        } else {
          bool = false;
        } 
        if (view != paramView2 && !bool) {
          HashMap<View, Integer> hashMap = this.i;
          if (!paramBoolean1) {
            if (hashMap != null && hashMap.containsKey(view))
              view.setImportantForAccessibility(((Integer)this.i.get(view)).intValue()); 
          } else {
            hashMap.put(view, Integer.valueOf(view.getImportantForAccessibility()));
            view.setImportantForAccessibility(4);
          } 
        } 
      } 
      if (!paramBoolean1)
        this.i = null; 
    } 
    super.w(paramView1, paramView2, paramBoolean1, paramBoolean2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\transformation\FabTransformationSheetBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */