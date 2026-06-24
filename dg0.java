import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

public final class dg0 extends zo2 {
  public final int s;
  
  public final ViewPropertyAnimator A(View paramView, int paramInt) {
    switch (this.s) {
      default:
        return paramView.animate().translationX(paramInt);
      case 1:
        return paramView.animate().translationX(-paramInt);
      case 0:
        break;
    } 
    return paramView.animate().translationY(paramInt);
  }
  
  public final int x(View paramView, ViewGroup.MarginLayoutParams paramMarginLayoutParams) {
    switch (this.s) {
      default:
        i = paramView.getMeasuredWidth();
        j = paramMarginLayoutParams.rightMargin;
        return i + j;
      case 1:
        i = paramView.getMeasuredWidth();
        j = paramMarginLayoutParams.leftMargin;
        return i + j;
      case 0:
        break;
    } 
    int i = paramView.getMeasuredHeight();
    int j = paramMarginLayoutParams.bottomMargin;
    return i + j;
  }
  
  public final int z() {
    switch (this.s) {
      default:
        return 0;
      case 1:
        return 2;
      case 0:
        break;
    } 
    return 1;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\dg0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */