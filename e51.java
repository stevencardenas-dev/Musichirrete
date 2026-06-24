import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.a;

public final class e51 extends f51 {
  public final int d;
  
  public final int d(View paramView) {
    int i = this.d;
    Object object = this.b;
    switch (i) {
      default:
        sd1 = (sd1)paramView.getLayoutParams();
        ((a)object).getClass();
        j = a.J(paramView);
        i = sd1.bottomMargin;
        return j + i;
      case 0:
        break;
    } 
    sd1 sd1 = (sd1)paramView.getLayoutParams();
    ((a)object).getClass();
    int j = a.O(paramView);
    i = sd1.rightMargin;
    return j + i;
  }
  
  public final int e(View paramView) {
    int i = this.d;
    Object object = this.b;
    switch (i) {
      default:
        sd1 = (sd1)paramView.getLayoutParams();
        ((a)object).getClass();
        j = a.M(paramView) + sd1.topMargin;
        i = sd1.bottomMargin;
        return j + i;
      case 0:
        break;
    } 
    sd1 sd1 = (sd1)paramView.getLayoutParams();
    ((a)object).getClass();
    int j = a.N(paramView) + sd1.leftMargin;
    i = sd1.rightMargin;
    return j + i;
  }
  
  public final int f(View paramView) {
    int i = this.d;
    Object object = this.b;
    switch (i) {
      default:
        sd1 = (sd1)paramView.getLayoutParams();
        ((a)object).getClass();
        i = a.N(paramView) + sd1.leftMargin;
        j = sd1.rightMargin;
        return i + j;
      case 0:
        break;
    } 
    sd1 sd1 = (sd1)paramView.getLayoutParams();
    ((a)object).getClass();
    i = a.M(paramView) + sd1.topMargin;
    int j = sd1.bottomMargin;
    return i + j;
  }
  
  public final int g(View paramView) {
    int i = this.d;
    Object object = this.b;
    switch (i) {
      default:
        sd1 = (sd1)paramView.getLayoutParams();
        ((a)object).getClass();
        i = a.P(paramView);
        j = sd1.topMargin;
        return i - j;
      case 0:
        break;
    } 
    sd1 sd1 = (sd1)paramView.getLayoutParams();
    ((a)object).getClass();
    i = a.L(paramView);
    int j = sd1.leftMargin;
    return i - j;
  }
  
  public final int h() {
    switch (this.d) {
      default:
        return ((a)this.b).q;
      case 0:
        break;
    } 
    return ((a)this.b).p;
  }
  
  public final int i() {
    int i = this.d;
    Object object = this.b;
    switch (i) {
      default:
        object = object;
        j = ((a)object).q;
        i = object.getPaddingBottom();
        return j - i;
      case 0:
        break;
    } 
    object = object;
    int j = ((a)object).p;
    i = object.getPaddingRight();
    return j - i;
  }
  
  public final int j() {
    switch (this.d) {
      default:
        return ((a)this.b).getPaddingBottom();
      case 0:
        break;
    } 
    return ((a)this.b).getPaddingRight();
  }
  
  public final int k() {
    switch (this.d) {
      default:
        return ((a)this.b).o;
      case 0:
        break;
    } 
    return ((a)this.b).n;
  }
  
  public final int l() {
    switch (this.d) {
      default:
        return ((a)this.b).n;
      case 0:
        break;
    } 
    return ((a)this.b).o;
  }
  
  public final int m() {
    switch (this.d) {
      default:
        return ((a)this.b).getPaddingTop();
      case 0:
        break;
    } 
    return ((a)this.b).getPaddingLeft();
  }
  
  public final int n() {
    int i = this.d;
    Object object = this.b;
    switch (i) {
      default:
        object = object;
        j = ((a)object).q - object.getPaddingTop();
        i = object.getPaddingBottom();
        return j - i;
      case 0:
        break;
    } 
    object = object;
    int j = ((a)object).p - object.getPaddingLeft();
    i = object.getPaddingRight();
    return j - i;
  }
  
  public final int p(View paramView) {
    int i = this.d;
    Object object1 = this.c;
    Object object2 = this.b;
    switch (i) {
      default:
        object2 = object2;
        object1 = object1;
        object2.U(paramView, (Rect)object1);
        return ((Rect)object1).bottom;
      case 0:
        break;
    } 
    object2 = object2;
    object1 = object1;
    object2.U(paramView, (Rect)object1);
    return ((Rect)object1).right;
  }
  
  public final int q(View paramView) {
    int i = this.d;
    Object object1 = this.c;
    Object object2 = this.b;
    switch (i) {
      default:
        object2 = object2;
        object1 = object1;
        object2.U(paramView, (Rect)object1);
        return ((Rect)object1).top;
      case 0:
        break;
    } 
    object2 = object2;
    object1 = object1;
    object2.U(paramView, (Rect)object1);
    return ((Rect)object1).left;
  }
  
  public final void r(int paramInt) {
    switch (this.d) {
      default:
        ((a)this.b).b0(paramInt);
        return;
      case 0:
        break;
    } 
    ((a)this.b).a0(paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\e51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */