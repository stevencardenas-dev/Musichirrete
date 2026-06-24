package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import g92;
import gy0;
import i70;
import java.util.ArrayList;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
  public final gy0 c = new gy0(75L);
  
  public final gy0 d = new gy0(0L);
  
  public FabTransformationScrimBehavior() {}
  
  public FabTransformationScrimBehavior(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public final boolean f(View paramView1, View paramView2) {
    return paramView2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton;
  }
  
  public final boolean v(CoordinatorLayout paramCoordinatorLayout, View paramView, MotionEvent paramMotionEvent) {
    return false;
  }
  
  public final AnimatorSet x(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2) {
    gy0 gy01;
    ObjectAnimator objectAnimator;
    ArrayList<ObjectAnimator> arrayList = new ArrayList();
    new ArrayList();
    if (paramBoolean1) {
      gy01 = this.c;
    } else {
      gy01 = this.d;
    } 
    if (paramBoolean1) {
      if (!paramBoolean2)
        paramView2.setAlpha(0.0F); 
      objectAnimator = ObjectAnimator.ofFloat(paramView2, View.ALPHA, new float[] { 1.0F });
    } else {
      objectAnimator = ObjectAnimator.ofFloat(paramView2, View.ALPHA, new float[] { 0.0F });
    } 
    gy01.a(objectAnimator);
    arrayList.add(objectAnimator);
    AnimatorSet animatorSet = new AnimatorSet();
    g92.U(animatorSet, arrayList);
    animatorSet.addListener((Animator.AnimatorListener)new i70(paramView2, paramBoolean1));
    return animatorSet;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\transformation\FabTransformationScrimBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */