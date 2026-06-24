import android.app.Dialog;
import android.view.View;

public final class uy extends qz1 {
  public final ra0 k;
  
  public final vy l;
  
  public uy(vy paramvy, ra0 paramra0) {
    this.l = paramvy;
    this.k = paramra0;
  }
  
  public final View K(int paramInt) {
    ra0 ra01 = this.k;
    if (ra01.L())
      return ra01.K(paramInt); 
    Dialog dialog = this.l.l0;
    return (dialog != null) ? dialog.findViewById(paramInt) : null;
  }
  
  public final boolean L() {
    return (this.k.L() || this.l.p0);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\uy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */