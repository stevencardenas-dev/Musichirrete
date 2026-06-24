import android.os.Bundle;
import android.os.IInterface;

public final class ze2 extends y92 implements IInterface {
  public final nt1 f;
  
  public final dg2 g;
  
  public final int h;
  
  public ze2(dg2 paramdg2, nt1 paramnt1, int paramInt) {
    super(5);
    attachInterface(this, "com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    this.f = paramnt1;
  }
  
  public final void p0(int paramInt, Bundle paramBundle) {
    this.g.b.d(this.f);
    dg2.c.e("onCancelInstall(%d)", new Object[] { Integer.valueOf(paramInt) });
  }
  
  public final void q0(Bundle paramBundle) {
    this.g.b.d(this.f);
    dg2.c.e("onDeferredInstall", new Object[0]);
  }
  
  public final void r0(Bundle paramBundle) {
    this.g.b.d(this.f);
    dg2.c.e("onDeferredLanguageInstall", new Object[0]);
  }
  
  public final void s0(Bundle paramBundle) {
    this.g.b.d(this.f);
    dg2.c.e("onDeferredLanguageUninstall", new Object[0]);
  }
  
  public final void t0(int paramInt, Bundle paramBundle) {
    this.g.b.d(this.f);
    dg2.c.e("onStartInstall(%d)", new Object[] { Integer.valueOf(paramInt) });
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ze2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */