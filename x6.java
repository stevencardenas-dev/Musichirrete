import android.app.Dialog;
import android.os.Bundle;

public class x6 extends vy {
  public Dialog F0(Bundle paramBundle) {
    return new w6(P(), this.f0);
  }
  
  public final void G0(Dialog paramDialog, int paramInt) {
    if (paramDialog instanceof w6) {
      w6 w6 = (w6)paramDialog;
      if (paramInt != 1 && paramInt != 2) {
        if (paramInt != 3)
          return; 
        paramDialog.getWindow().addFlags(24);
      } 
      w6.d().i(1);
      return;
    } 
    super.G0(paramDialog, paramInt);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\x6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */