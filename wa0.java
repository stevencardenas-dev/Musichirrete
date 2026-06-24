import android.os.Handler;
import android.view.View;
import android.view.Window;

public final class wa0 extends qz1 implements l32, um0, ui1, pb0 {
  public final x5 k;
  
  public final x5 l;
  
  public final Handler m;
  
  public final lb0 n;
  
  public final x5 o;
  
  public wa0(x5 paramx5) {
    this.o = paramx5;
    Handler handler = new Handler();
    this.k = paramx5;
    this.l = paramx5;
    this.m = handler;
    this.n = new lb0();
  }
  
  public final k32 H() {
    return this.o.H();
  }
  
  public final View K(int paramInt) {
    return this.o.findViewById(paramInt);
  }
  
  public final boolean L() {
    Window window = this.o.getWindow();
    return (window != null && window.peekDecorView() != null);
  }
  
  public final wm0 N() {
    return this.o.y;
  }
  
  public final void a() {}
  
  public final j01 h() {
    return (j01)this.o.g.e;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\wa0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */