import android.view.View;
import java.util.WeakHashMap;

public final class n32 {
  public final View a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public n32(View paramView) {
    this.a = paramView;
  }
  
  public final void a() {
    int i = this.d;
    View view = this.a;
    int j = view.getTop();
    int k = this.b;
    WeakHashMap weakHashMap = v22.a;
    view.offsetTopAndBottom(i - j - k);
    view.offsetLeftAndRight(0 - view.getLeft() - this.c);
  }
  
  public final boolean b(int paramInt) {
    if (this.d != paramInt) {
      this.d = paramInt;
      a();
      return true;
    } 
    return false;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\n32.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */