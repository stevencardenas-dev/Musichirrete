import android.view.View;
import androidx.recyclerview.widget.a;

public final class qd1 {
  public final int a;
  
  public final a b;
  
  public final int a(View paramView) {
    switch (this.a) {
      default:
        sd1 = (sd1)paramView.getLayoutParams();
        i = a.J(paramView);
        j = sd1.bottomMargin;
        return i + j;
      case 0:
        break;
    } 
    sd1 sd1 = (sd1)paramView.getLayoutParams();
    int i = a.O(paramView);
    int j = sd1.rightMargin;
    return i + j;
  }
  
  public final int b(View paramView) {
    switch (this.a) {
      default:
        sd1 = (sd1)paramView.getLayoutParams();
        i = a.P(paramView);
        j = sd1.topMargin;
        return i - j;
      case 0:
        break;
    } 
    sd1 sd1 = (sd1)paramView.getLayoutParams();
    int i = a.L(paramView);
    int j = sd1.leftMargin;
    return i - j;
  }
  
  public final int c() {
    int i = this.a;
    a a1 = this.b;
    switch (i) {
      default:
        i = a1.q;
        j = a1.getPaddingBottom();
        return i - j;
      case 0:
        break;
    } 
    i = a1.p;
    int j = a1.getPaddingRight();
    return i - j;
  }
  
  public final int d() {
    int i = this.a;
    a a1 = this.b;
    switch (i) {
      default:
        return a1.getPaddingTop();
      case 0:
        break;
    } 
    return a1.getPaddingLeft();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\qd1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */