package ss.com.bannerslider;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.a;
import dc1;
import k61;
import sd1;

public class PercentLinearLayoutManager extends LinearLayoutManager {
  public PercentLinearLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  public final sd1 C() {
    return new sd1(-2, -2);
  }
  
  public final sd1 D(Context paramContext, AttributeSet paramAttributeSet) {
    paramContext.getClass();
    paramAttributeSet.getClass();
    sd1 sd1 = new sd1(paramContext, paramAttributeSet);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, dc1.a);
    typedArray.getClass();
    ((k61)sd1).g = typedArray.getFloat(0, 0.0F);
    typedArray.recycle();
    return sd1;
  }
  
  public final sd1 E(ViewGroup.LayoutParams paramLayoutParams) {
    paramLayoutParams.getClass();
    return new sd1(paramLayoutParams);
  }
  
  public final void Z(View paramView) {
    ViewGroup.LayoutParams layoutParams = paramView.getLayoutParams();
    layoutParams.getClass();
    k61 k61 = (k61)layoutParams;
    float f1 = k61.g;
    if (f1 <= 0.0F) {
      super.Z(paramView);
      return;
    } 
    float f2 = ((a)this).p;
    int i = (int)(f2 - f2 / 1080.0F * f1 * 2.0F);
    int j = ((ViewGroup.MarginLayoutParams)k61).width;
    if (j != -2) {
      if (j != -1) {
        i = View.MeasureSpec.makeMeasureSpec(Math.min(j, i), -2147483648);
      } else {
        i = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
      } 
    } else {
      i = View.MeasureSpec.makeMeasureSpec(i, -2147483648);
    } 
    j = ((a)this).q;
    int k = ((ViewGroup.MarginLayoutParams)k61).height;
    if (k != -2) {
      if (k != -1) {
        j = View.MeasureSpec.makeMeasureSpec(Math.min(k, j), -2147483648);
      } else {
        j = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
      } 
    } else {
      j = View.MeasureSpec.makeMeasureSpec(j, -2147483648);
    } 
    paramView.measure(i, j);
  }
  
  public final boolean q(sd1 paramsd1) {
    paramsd1.getClass();
    return paramsd1 instanceof k61;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ss\com\bannerslider\PercentLinearLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */