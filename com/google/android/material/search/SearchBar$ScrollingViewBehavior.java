package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
  public boolean g = false;
  
  public SearchBar$ScrollingViewBehavior() {}
  
  public SearchBar$ScrollingViewBehavior(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public final boolean h(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2) {
    super.h(paramCoordinatorLayout, paramView1, paramView2);
    if (!this.g && paramView2 instanceof AppBarLayout) {
      this.g = true;
      AppBarLayout appBarLayout = (AppBarLayout)paramView2;
      appBarLayout.setBackgroundColor(0);
      appBarLayout.setTargetElevation(0.0F);
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\search\SearchBar$ScrollingViewBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */