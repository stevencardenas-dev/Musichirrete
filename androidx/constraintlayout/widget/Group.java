package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewParent;
import eq;
import gq;

public class Group extends eq {
  public Group(Context paramContext) {
    super(paramContext);
  }
  
  public Group(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  public Group(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public final void e(ConstraintLayout paramConstraintLayout) {
    d(paramConstraintLayout);
  }
  
  public final void i() {
    gq gq = (gq)getLayoutParams();
    gq.q0.K(0);
    gq.q0.H(0);
  }
  
  public final void onAttachedToWindow() {
    super.onAttachedToWindow();
    ViewParent viewParent = getParent();
    if (viewParent != null && viewParent instanceof ConstraintLayout)
      d((ConstraintLayout)viewParent); 
  }
  
  public void setElevation(float paramFloat) {
    super.setElevation(paramFloat);
    ViewParent viewParent = getParent();
    if (viewParent != null && viewParent instanceof ConstraintLayout)
      d((ConstraintLayout)viewParent); 
  }
  
  public void setVisibility(int paramInt) {
    super.setVisibility(paramInt);
    ViewParent viewParent = getParent();
    if (viewParent != null && viewParent instanceof ConstraintLayout)
      d((ConstraintLayout)viewParent); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\constraintlayout\widget\Group.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */