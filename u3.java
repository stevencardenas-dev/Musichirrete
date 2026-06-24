import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

public final class u3 implements AdapterView.OnItemClickListener {
  public final AlertController.RecycleListView b;
  
  public final y3 c;
  
  public final v3 e;
  
  public u3(v3 paramv3, AlertController.RecycleListView paramRecycleListView, y3 paramy3) {
    this.e = paramv3;
    this.b = paramRecycleListView;
    this.c = paramy3;
  }
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong) {
    v3 v31 = this.e;
    boolean[] arrayOfBoolean = v31.r;
    AlertController.RecycleListView recycleListView = this.b;
    if (arrayOfBoolean != null)
      arrayOfBoolean[paramInt] = recycleListView.isItemChecked(paramInt); 
    v31.v.onClick(this.c.b, paramInt, recycleListView.isItemChecked(paramInt));
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar\\u3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */