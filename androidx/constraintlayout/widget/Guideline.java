package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import gq;

public class Guideline extends View {
  public boolean b = true;
  
  public Guideline(Context paramContext) {
    super(paramContext);
    super.setVisibility(8);
  }
  
  public Guideline(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    super.setVisibility(8);
  }
  
  public Guideline(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    super.setVisibility(8);
  }
  
  public Guideline(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1);
    super.setVisibility(8);
  }
  
  public final void draw(Canvas paramCanvas) {}
  
  public final void onMeasure(int paramInt1, int paramInt2) {
    setMeasuredDimension(0, 0);
  }
  
  public void setFilterRedundantCalls(boolean paramBoolean) {
    this.b = paramBoolean;
  }
  
  public void setGuidelineBegin(int paramInt) {
    gq gq = (gq)getLayoutParams();
    if (this.b && gq.a == paramInt)
      return; 
    gq.a = paramInt;
    setLayoutParams((ViewGroup.LayoutParams)gq);
  }
  
  public void setGuidelineEnd(int paramInt) {
    gq gq = (gq)getLayoutParams();
    if (this.b && gq.b == paramInt)
      return; 
    gq.b = paramInt;
    setLayoutParams((ViewGroup.LayoutParams)gq);
  }
  
  public void setGuidelinePercent(float paramFloat) {
    gq gq = (gq)getLayoutParams();
    if (this.b && gq.c == paramFloat)
      return; 
    gq.c = paramFloat;
    setLayoutParams((ViewGroup.LayoutParams)gq);
  }
  
  public void setVisibility(int paramInt) {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\constraintlayout\widget\Guideline.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */