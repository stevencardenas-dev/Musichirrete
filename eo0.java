import android.content.DialogInterface;

public final class eo0 implements DialogInterface.OnClickListener {
  public final fo0 b;
  
  public eo0(fo0 paramfo0) {
    this.b = paramfo0;
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt) {
    fo0 fo01 = this.b;
    fo01.y0 = paramInt;
    fo01.x0 = -1;
    paramDialogInterface.dismiss();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\eo0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */