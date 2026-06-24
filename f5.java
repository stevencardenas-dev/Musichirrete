import android.animation.ValueAnimator;
import android.os.Build;
import android.view.Choreographer;
import java.util.ArrayList;

public final class f5 {
  public static final ThreadLocal i = new ThreadLocal();
  
  public final zm1 a = new zm1(0);
  
  public final ArrayList b = new ArrayList();
  
  public final gh1 c = new gh1(7, this);
  
  public final e d = new e(1, this);
  
  public final g7 e;
  
  public boolean f = false;
  
  public float g = 1.0F;
  
  public d5 h;
  
  public f5(g7 paramg7) {
    this.e = paramg7;
  }
  
  public final void a(lo1 paramlo1) {
    ArrayList<lo1> arrayList = this.b;
    if (arrayList.size() == 0) {
      ((Choreographer)this.e.c).postFrameCallback(new e5(this.d));
      if (Build.VERSION.SDK_INT >= 33) {
        this.g = ValueAnimator.getDurationScale();
        if (this.h == null)
          this.h = new d5(this); 
        d5 d51 = this.h;
        if (d51.a == null) {
          c5 c5 = new c5(d51);
          d51.a = c5;
          ValueAnimator.registerDurationScaleChangeListener(c5);
        } 
      } 
    } 
    if (!arrayList.contains(paramlo1))
      arrayList.add(paramlo1); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\f5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */