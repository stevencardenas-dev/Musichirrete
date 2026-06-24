import android.os.Build;
import androidx.core.widget.NestedScrollView;

public final class kj1 {
  public final jj1 a;
  
  public kj1(NestedScrollView paramNestedScrollView) {
    if (Build.VERSION.SDK_INT >= 35) {
      this.a = new ij1(paramNestedScrollView);
      return;
    } 
    this.a = new zb0(13);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\kj1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */