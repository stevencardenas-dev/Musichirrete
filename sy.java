import android.app.Dialog;
import android.content.DialogInterface;

public final class sy implements DialogInterface.OnCancelListener {
  public final vy b;
  
  public sy(vy paramvy) {
    this.b = paramvy;
  }
  
  public final void onCancel(DialogInterface paramDialogInterface) {
    vy vy1 = this.b;
    Dialog dialog = vy1.l0;
    if (dialog != null)
      vy1.onCancel((DialogInterface)dialog); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\sy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */