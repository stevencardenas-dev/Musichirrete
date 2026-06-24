import android.view.View;
import java.util.List;

public abstract class hd {
  public Object a = new tu1();
  
  public hd() {}
  
  public hd(go1 paramgo1) {}
  
  public abstract void a(p01 paramp01);
  
  public String b() {
    return null;
  }
  
  public abstract boolean c();
  
  public abstract int d();
  
  public abstract int e();
  
  public boolean f() {
    return (d() == 3 && c() && e() == 0);
  }
  
  public boolean g() {
    int i;
    go1 go1 = (go1)this.a;
    View view = go1.c.K;
    if (view != null) {
      float f = view.getAlpha();
      i = 4;
      if (f != 0.0F || view.getVisibility() != 0) {
        int k = view.getVisibility();
        if (k != 0) {
          if (k != 4)
            if (k == 8) {
              i = 3;
            } else {
              l0.l(ga1.i("Unknown visibility ", k));
              return false;
            }  
        } else {
          i = 2;
        } 
      } 
    } else {
      i = 0;
    } 
    int j = go1.a;
    return (i == j || (i != 2 && j != 2));
  }
  
  public abstract void h(d62 paramd62);
  
  public abstract void i(d62 paramd62);
  
  public abstract x62 j(x62 paramx62, List paramList);
  
  public abstract j01 k(d62 paramd62, j01 paramj01);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\hd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */