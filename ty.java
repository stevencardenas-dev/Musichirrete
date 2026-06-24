import android.content.DialogInterface;

public final class ty implements DialogInterface.OnDismissListener {
  public final int b;
  
  public final Object c;
  
  public final void onDismiss(DialogInterface paramDialogInterface) {
    int i = this.b;
    Object object = this.c;
    switch (i) {
      default:
        object = object;
        if (paramDialogInterface == (tz0)((of)object).b) {
          n21.F("pss:od");
          ((of)object).b = null;
        } 
        return;
      case 0:
        break;
    } 
    vy vy = (vy)object;
    object = vy.l0;
    if (object != null)
      vy.onDismiss((DialogInterface)object); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ty.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */