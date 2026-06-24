import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

public final class ai0 extends InputConnectionWrapper {
  public final f a;
  
  public ai0(InputConnection paramInputConnection, f paramf) {
    super(paramInputConnection, false);
  }
  
  public final boolean commitContent(InputContentInfo paramInputContentInfo, int paramInt, Bundle paramBundle) {
    bh0 bh0 = null;
    if (paramInputContentInfo != null && Build.VERSION.SDK_INT >= 25)
      bh0 = new bh0(2, new ci0(paramInputContentInfo)); 
    return this.a.h(bh0, paramInt, paramBundle) ? true : super.commitContent(paramInputContentInfo, paramInt, paramBundle);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\ai0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */