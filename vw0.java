import android.view.ActionProvider;

public final class vw0 implements ActionProvider.VisibilityListener {
  public bh0 a;
  
  public final ActionProvider b;
  
  public vw0(yw0 paramyw0, ActionProvider paramActionProvider) {
    this.b = paramActionProvider;
  }
  
  public final void onActionProviderVisibilityChanged(boolean paramBoolean) {
    bh0 bh01 = this.a;
    if (bh01 != null) {
      rw0 rw0 = ((uw0)bh01.c).n;
      rw0.h = true;
      rw0.p(true);
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\vw0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */