import android.content.Context;
import android.os.Bundle;
import java.io.Serializable;

public final class xm implements Serializable {
  public final transient x5 b;
  
  public int c;
  
  public int e = 2131886813;
  
  public int[] f;
  
  public final transient ym g;
  
  public boolean h = true;
  
  public boolean i = true;
  
  public boolean j = false;
  
  public xm(Context paramContext, ym paramym) {
    this.b = (x5)paramContext;
    this.g = paramym;
  }
  
  public final void a() {
    an an = new an();
    Bundle bundle = new Bundle();
    bundle.putSerializable("builder", this);
    an.x0(bundle);
    int[] arrayOfInt = (an.J0()).f;
    x5 x51 = this.b;
    ua0 ua0 = x51.Z().E("[MD_COLOR_CHOOSER]");
    if (ua0 != null) {
      ((vy)ua0).D0();
      lb0 lb0 = x51.Z();
      lb0.getClass();
      lb lb = new lb(lb0);
      lb.j(ua0);
      lb.f();
    } 
    an.H0(x51.Z(), "[MD_COLOR_CHOOSER]");
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\xm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */