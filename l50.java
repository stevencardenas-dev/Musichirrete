import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public class l50 extends DialogFragment {
  public Dialog b;
  
  public DialogInterface.OnCancelListener c;
  
  public AlertDialog e;
  
  public final void onCancel(DialogInterface paramDialogInterface) {
    DialogInterface.OnCancelListener onCancelListener = this.c;
    if (onCancelListener != null)
      onCancelListener.onCancel(paramDialogInterface); 
  }
  
  public final Dialog onCreateDialog(Bundle paramBundle) {
    Activity activity;
    Dialog dialog = this.b;
    if (dialog == null) {
      setShowsDialog(false);
      if (this.e == null) {
        activity = getActivity();
        n21.m(activity);
        this.e = (new AlertDialog.Builder((Context)activity)).create();
      } 
      return (Dialog)this.e;
    } 
    return (Dialog)activity;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\l50.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */