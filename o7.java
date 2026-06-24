import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

public final class o7 implements ListAdapter, SpinnerAdapter {
  public SpinnerAdapter b;
  
  public ListAdapter c;
  
  public final boolean areAllItemsEnabled() {
    ListAdapter listAdapter = this.c;
    return (listAdapter != null) ? listAdapter.areAllItemsEnabled() : true;
  }
  
  public final int getCount() {
    SpinnerAdapter spinnerAdapter = this.b;
    return (spinnerAdapter == null) ? 0 : spinnerAdapter.getCount();
  }
  
  public final View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    SpinnerAdapter spinnerAdapter = this.b;
    return (spinnerAdapter == null) ? null : spinnerAdapter.getDropDownView(paramInt, paramView, paramViewGroup);
  }
  
  public final Object getItem(int paramInt) {
    SpinnerAdapter spinnerAdapter = this.b;
    return (spinnerAdapter == null) ? null : spinnerAdapter.getItem(paramInt);
  }
  
  public final long getItemId(int paramInt) {
    SpinnerAdapter spinnerAdapter = this.b;
    return (spinnerAdapter == null) ? -1L : spinnerAdapter.getItemId(paramInt);
  }
  
  public final int getItemViewType(int paramInt) {
    return 0;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup) {
    return getDropDownView(paramInt, paramView, paramViewGroup);
  }
  
  public final int getViewTypeCount() {
    return 1;
  }
  
  public final boolean hasStableIds() {
    SpinnerAdapter spinnerAdapter = this.b;
    return (spinnerAdapter != null && spinnerAdapter.hasStableIds());
  }
  
  public final boolean isEmpty() {
    return (getCount() == 0);
  }
  
  public final boolean isEnabled(int paramInt) {
    ListAdapter listAdapter = this.c;
    return (listAdapter != null) ? listAdapter.isEnabled(paramInt) : true;
  }
  
  public final void registerDataSetObserver(DataSetObserver paramDataSetObserver) {
    SpinnerAdapter spinnerAdapter = this.b;
    if (spinnerAdapter != null)
      spinnerAdapter.registerDataSetObserver(paramDataSetObserver); 
  }
  
  public final void unregisterDataSetObserver(DataSetObserver paramDataSetObserver) {
    SpinnerAdapter spinnerAdapter = this.b;
    if (spinnerAdapter != null)
      spinnerAdapter.unregisterDataSetObserver(paramDataSetObserver); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\o7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */