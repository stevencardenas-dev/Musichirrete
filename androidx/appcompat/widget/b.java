package androidx.appcompat.widget;

import android.view.View;

public final class b implements View.OnFocusChangeListener {
  public final SearchView a;
  
  public b(SearchView paramSearchView) {
    this.a = paramSearchView;
  }
  
  public final void onFocusChange(View paramView, boolean paramBoolean) {
    SearchView searchView = this.a;
    View.OnFocusChangeListener onFocusChangeListener = searchView.mOnQueryTextFocusChangeListener;
    if (onFocusChangeListener != null)
      onFocusChangeListener.onFocusChange((View)searchView, paramBoolean); 
  }
}


/* Location:              C:\Users\Kevin\Downloads\dex-tools-v2.4\dex-tools-v2.4\musicolet-dex2jar.jar!\androidx\appcompat\widget\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */