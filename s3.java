import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController;

public final class s3 extends ArrayAdapter {
  public final AlertController.RecycleListView b;
  
  public final v3 c;
  
  public s3(v3 paramv3, ContextThemeWrapper paramContextThemeWrapper, int paramInt, CharSequence[] paramArrayOfCharSequence, AlertController.RecycleListView paramRecycleListView) {
    super((Context)paramContextThemeWrapper, paramInt, 16908308, (Object[])paramArrayOfCharSequence);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    View view = super.getView(paramInt, paramView, paramViewGroup);
    boolean[] arrayOfBoolean = this.c.r;
    if (arrayOfBoolean != null && arrayOfBoolean[paramInt])
      this.b.setItemChecked(paramInt, true); 
    return view;
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\s3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */