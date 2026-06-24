package in.krosbits.utils;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import in.krosbits.utils.layoutmanager.LinearLayoutManager2;
import kn0;
import si;

public class CenterLayoutManager extends LinearLayoutManager2 {
  public CenterLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    super(paramContext, paramAttributeSet, paramInt1, paramInt2);
  }
  
  public final void O0(RecyclerView paramRecyclerView, int paramInt) {
    si si = new si(paramRecyclerView.getContext());
    ((kn0)si).a = paramInt;
    P0((kn0)si);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\in\krosbit\\utils\CenterLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */