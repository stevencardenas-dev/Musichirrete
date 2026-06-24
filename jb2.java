import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.os.Build;
import android.util.Log;

public abstract class jb2 implements DialogInterface.OnClickListener {
  public abstract void a();
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt) {
    try {
      a();
    } catch (ActivityNotFoundException activityNotFoundException) {
      String str = "Failed to start resolution intent.";
      if (true == Build.FINGERPRINT.contains("generic"))
        str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store."; 
      Log.e("DialogRedirect", str, (Throwable)activityNotFoundException);
    } finally {
      Exception exception;
    } 
    paramDialogInterface.dismiss();
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\jb2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */