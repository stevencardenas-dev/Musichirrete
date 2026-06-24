import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;

public class ru0 extends vy {
  public qu0 q0;
  
  public ru0() {
    this.g0 = true;
    Dialog dialog = this.l0;
    if (dialog != null)
      dialog.setCancelable(true); 
  }
  
  public Dialog F0(Bundle paramBundle) {
    qu0 qu01 = new qu0(P());
    this.q0 = qu01;
    return qu01;
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration) {
    this.I = true;
    qu0 qu01 = this.q0;
    if (qu01 != null)
      qu01.s(); 
  }
  
  public final void p0() {
    super.p0();
    qu0 qu01 = this.q0;
    if (qu01 != null)
      qu01.j(false); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ru0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */