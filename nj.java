import android.app.Dialog;
import android.os.Bundle;

public class nj extends fu0 {
  public final Dialog F0(Bundle paramBundle) {
    int i = ag0.c();
    cv0 cv0 = cv0.c;
    if (cv0 != null) {
      I0();
      if (!this.r0.equals(cv0)) {
        this.r0 = cv0;
        Bundle bundle = this.i;
        paramBundle = bundle;
        if (bundle == null)
          paramBundle = new Bundle(); 
        paramBundle.putBundle("selector", cv0.a);
        x0(paramBundle);
        eu0 eu0 = this.q0;
        if (eu0 != null)
          eu0.i(cv0); 
      } 
      if (i > 0 && i < 7) {
        ms0 ms01 = new ms0(P());
        ms01.d(U(2131887536, new Object[] { T(2131886338) }));
        ms01.k(2131886278);
        ms01.n(2131887535);
        ms01.A = new l0(27);
        return new ss0(ms01);
      } 
      ms0 ms0 = new ms0(P());
      ms0.c(2131886695);
      ms0.k(2131886278);
      ms0.n(2131886694);
      ms0.A = new l0(28);
      return new ss0(ms0);
    } 
    l0.l("selector must not be null");
    return null;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\nj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */