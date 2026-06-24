import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public class zq1 extends vy {
  public Dialog q0;
  
  public DialogInterface.OnCancelListener r0;
  
  public AlertDialog s0;
  
  public final Dialog F0(Bundle paramBundle) {
    Context context;
    Dialog dialog = this.q0;
    if (dialog == null) {
      this.h0 = false;
      if (this.s0 == null) {
        context = P();
        n21.m(context);
        this.s0 = (new AlertDialog.Builder(context)).create();
      } 
      return (Dialog)this.s0;
    } 
    return (Dialog)context;
  }
  
  public final void onCancel(DialogInterface paramDialogInterface) {
    DialogInterface.OnCancelListener onCancelListener = this.r0;
    if (onCancelListener != null)
      onCancelListener.onCancel(paramDialogInterface); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\zq1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */