package in.krosbits.utils.layoutmanager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import de1;
import yd1;

public class GridLayoutManager2 extends GridLayoutManager {
  public GridLayoutManager2(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  public final void q0(yd1 paramyd1, de1 paramde1) {
    try {
      super.q0(paramyd1, paramde1);
      return;
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      indexOutOfBoundsException.printStackTrace();
      return;
    } 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbit\\utils\layoutmanager\GridLayoutManager2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */