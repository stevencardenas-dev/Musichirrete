import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

public final class bd {
  public int a;
  
  public int b;
  
  public int c;
  
  public int d;
  
  public boolean e;
  
  public int f;
  
  public Object g;
  
  public void a(RecyclerView paramRecyclerView) {
    int i = this.d;
    if (i >= 0) {
      this.d = -1;
      paramRecyclerView.S(i);
      this.e = false;
      return;
    } 
    if (this.e) {
      Interpolator interpolator = (Interpolator)this.g;
      if (interpolator == null || this.c >= 1) {
        i = this.c;
        if (i >= 1) {
          paramRecyclerView.g0.c(this.a, this.b, i, interpolator);
          i = this.f + 1;
          this.f = i;
          if (i > 10)
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary"); 
          this.e = false;
          return;
        } 
        tp.f("Scroll duration must be a positive number");
        return;
      } 
      tp.f("If you provide an interpolator, you must set a positive duration");
      return;
    } 
    this.f = 0;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */