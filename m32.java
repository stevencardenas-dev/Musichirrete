import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public abstract class m32 extends fs {
  public n32 a;
  
  public int b = 0;
  
  public m32() {}
  
  public m32(int paramInt) {}
  
  public boolean l(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt) {
    x(paramCoordinatorLayout, paramView, paramInt);
    if (this.a == null)
      this.a = new n32(paramView); 
    n32 n321 = this.a;
    View view = n321.a;
    n321.b = view.getTop();
    n321.c = view.getLeft();
    this.a.a();
    paramInt = this.b;
    if (paramInt != 0) {
      this.a.b(paramInt);
      this.b = 0;
    } 
    return true;
  }
  
  public final int w() {
    n32 n321 = this.a;
    return (n321 != null) ? n321.d : 0;
  }
  
  public void x(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt) {
    paramCoordinatorLayout.r(paramView, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */