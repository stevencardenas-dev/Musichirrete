import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import in.krosbits.utils.DynamicWidthSpinner;

public final class m20 implements SpinnerAdapter {
  public final SpinnerAdapter b;
  
  public final DynamicWidthSpinner c;
  
  public m20(DynamicWidthSpinner paramDynamicWidthSpinner, SpinnerAdapter paramSpinnerAdapter) {
    this.c = paramDynamicWidthSpinner;
    this.b = paramSpinnerAdapter;
  }
  
  public final int getCount() {
    return this.b.getCount();
  }
  
  public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    return this.b.getDropDownView(paramInt, paramView, paramViewGroup);
  }
  
  public final Object getItem(int paramInt) {
    return this.b.getItem(paramInt);
  }
  
  public final long getItemId(int paramInt) {
    return this.b.getItemId(paramInt);
  }
  
  public final int getItemViewType(int paramInt) {
    return this.b.getItemViewType(paramInt);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    paramInt = this.c.getSelectedItemPosition();
    return this.b.getView(paramInt, paramView, paramViewGroup);
  }
  
  public final int getViewTypeCount() {
    return this.b.getViewTypeCount();
  }
  
  public final boolean hasStableIds() {
    return this.b.hasStableIds();
  }
  
  public final boolean isEmpty() {
    return this.b.isEmpty();
  }
  
  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver) {
    this.b.registerDataSetObserver(paramDataSetObserver);
  }
  
  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver) {
    this.b.unregisterDataSetObserver(paramDataSetObserver);
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\m20.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */