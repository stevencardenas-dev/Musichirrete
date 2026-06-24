package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import j1;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
  public AnimatorSet b;
  
  public ExpandableTransformationBehavior() {}
  
  public ExpandableTransformationBehavior(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public void w(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2) {
    boolean bool;
    AnimatorSet animatorSet2 = this.b;
    if (animatorSet2 != null) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool)
      animatorSet2.cancel(); 
    AnimatorSet animatorSet1 = x(paramView1, paramView2, paramBoolean1, bool);
    this.b = animatorSet1;
    animatorSet1.addListener((Animator.AnimatorListener)new j1(6, this));
    this.b.start();
    if (!paramBoolean2)
      this.b.end(); 
  }
  
  public abstract AnimatorSet x(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\com\google\android\material\transformation\ExpandableTransformationBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */