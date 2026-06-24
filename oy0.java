import android.content.DialogInterface;
import java.util.HashSet;

public final class oy0 implements DialogInterface.OnMultiChoiceClickListener {
  public final py0 a;
  
  public oy0(py0 parampy0) {
    this.a = parampy0;
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt, boolean paramBoolean) {
    py0 py01 = this.a;
    HashSet<String> hashSet = py01.y0;
    boolean bool = py01.z0;
    if (paramBoolean) {
      py01.z0 = hashSet.add(py01.B0[paramInt].toString()) | bool;
      return;
    } 
    py01.z0 = hashSet.remove(py01.B0[paramInt].toString()) | bool;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\oy0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */