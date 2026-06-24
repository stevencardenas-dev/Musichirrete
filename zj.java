import android.view.ViewGroup;

public final class zj extends lw1 {
  public boolean a = false;
  
  public final ViewGroup b;
  
  public zj(ViewGroup paramViewGroup) {
    this.b = paramViewGroup;
  }
  
  public final void b() {
    ui0.m0(this.b, false);
  }
  
  public final void c() {
    ui0.m0(this.b, true);
  }
  
  public final void d(kw1 paramkw1) {
    if (!this.a)
      ui0.m0(this.b, false); 
    paramkw1.A(this);
  }
  
  public final void f(kw1 paramkw1) {
    ui0.m0(this.b, false);
    this.a = true;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */