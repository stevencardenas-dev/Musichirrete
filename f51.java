import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.a;

public abstract class f51 {
  public int a;
  
  public final Object b;
  
  public final Object c;
  
  public f51(int paramInt, String paramString1, String paramString2) {
    this.a = paramInt;
    this.b = paramString1;
    this.c = paramString2;
  }
  
  public f51(a parama) {
    this.a = Integer.MIN_VALUE;
    this.c = new Rect();
    this.b = parama;
  }
  
  public static f51 b(a parama, int paramInt) {
    if (paramInt != 0) {
      if (paramInt == 1)
        return new e51(parama, 1); 
      l0.l("invalid orientation");
      return null;
    } 
    return new e51(parama, 0);
  }
  
  public abstract void a(th1 paramth1);
  
  public abstract void c(th1 paramth1);
  
  public abstract int d(View paramView);
  
  public abstract int e(View paramView);
  
  public abstract int f(View paramView);
  
  public abstract int g(View paramView);
  
  public abstract int h();
  
  public abstract int i();
  
  public abstract int j();
  
  public abstract int k();
  
  public abstract int l();
  
  public abstract int m();
  
  public abstract int n();
  
  public int o() {
    return (Integer.MIN_VALUE == this.a) ? 0 : (n() - this.a);
  }
  
  public abstract int p(View paramView);
  
  public abstract int q(View paramView);
  
  public abstract void r(int paramInt);
  
  public abstract void s(th1 paramth1);
  
  public abstract void t(th1 paramth1);
  
  public abstract void u(th1 paramth1);
  
  public abstract void v(th1 paramth1);
  
  public abstract fh1 w(th1 paramth1);
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\f51.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */