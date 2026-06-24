import android.view.WindowInsets;

public class p62 extends o62 {
  public fi0 s = null;
  
  public fi0 t = null;
  
  public fi0 u = null;
  
  public p62(x62 paramx62, WindowInsets paramWindowInsets) {
    super(paramx62, paramWindowInsets);
  }
  
  public fi0 j() {
    if (this.t == null)
      this.t = fi0.d(this.c.getMandatorySystemGestureInsets()); 
    return this.t;
  }
  
  public fi0 l() {
    if (this.s == null)
      this.s = fi0.d(this.c.getSystemGestureInsets()); 
    return this.s;
  }
  
  public fi0 n() {
    if (this.u == null)
      this.u = fi0.d(this.c.getTappableElementInsets()); 
    return this.u;
  }
  
  public x62 q(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return x62.h(null, this.c.inset(paramInt1, paramInt2, paramInt3, paramInt4));
  }
  
  public void x(fi0 paramfi0) {}
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\p62.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */