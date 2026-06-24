import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;

public class fu0 extends vy {
  public eu0 q0;
  
  public cv0 r0;
  
  public fu0() {
    this.g0 = true;
    Dialog dialog = this.l0;
    if (dialog != null)
      dialog.setCancelable(true); 
  }
  
  public Dialog F0(Bundle paramBundle) {
    eu0 eu01 = new eu0(P());
    this.q0 = eu01;
    I0();
    eu01.i(this.r0);
    return this.q0;
  }
  
  public final void I0() {
    if (this.r0 == null) {
      Bundle bundle = this.i;
      if (bundle != null)
        this.r0 = cv0.b(bundle.getBundle("selector")); 
      if (this.r0 == null)
        this.r0 = cv0.c; 
    } 
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {
    this.I = true;
    eu0 eu01 = this.q0;
    if (eu01 == null)
      return; 
    eu01.getWindow().setLayout(z51.m(eu01.getContext()), -2);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\fu0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */