package in.krosbits.utils.layoutmanager;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import de1;
import yd1;

public class LinearLayoutManager2 extends LinearLayoutManager {
  public LinearLayoutManager2(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  public final void q0(yd1 paramyd1, de1 paramde1) {
    try {
      super.q0(paramyd1, paramde1);
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {}
  }
  
  public final void s0(Parcelable paramParcelable) {
    E0(-1);
    super.s0(paramParcelable);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbit\\utils\layoutmanager\LinearLayoutManager2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */