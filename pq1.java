import android.animation.ValueAnimator;
import android.widget.RelativeLayout;
import com.esafirm.stubutton.StuButton;

public final class pq1 implements ValueAnimator.AnimatorUpdateListener {
  public final RelativeLayout.LayoutParams a;
  
  public final StuButton b;
  
  public pq1(StuButton paramStuButton, RelativeLayout.LayoutParams paramLayoutParams) {
    this.b = paramStuButton;
    this.a = paramLayoutParams;
  }
  
  public final void onAnimationUpdate(ValueAnimator paramValueAnimator) {
    StuButton stuButton = this.b;
    if (stuButton.c != null) {
      int i = ((Integer)paramValueAnimator.getAnimatedValue()).intValue();
      this.a.leftMargin = i;
      stuButton.c.requestLayout();
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\pq1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */